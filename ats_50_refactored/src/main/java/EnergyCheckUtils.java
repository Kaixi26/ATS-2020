import traz_aqui.Main;

import java.lang.reflect.Field;

public class EnergyCheckUtils {
    public native static int ProfileInit();
    public native static String EnergyStatCheck();
    public native static void ProfileDealloc();

    static {
        System.setProperty("java.library.path", System.getProperty("user.dir"));
        try {
            Field fieldSysPath = ClassLoader.class.getDeclaredField("sys_paths");
            fieldSysPath.setAccessible(true);
            fieldSysPath.set(null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.loadLibrary("CPUScaler");
    }

    public static double[] getEnergyStats() {
        String[] energy = EnergyStatCheck().replace(",", ".").split("#");
        double[] stats = new double[3];
        for(int i=0; i<3; i++)
            stats[i] = Double.parseDouble(energy[i]);
        return stats;
    }

    public static void main(String[] args) {
        ProfileInit();
        double[] before = getEnergyStats();
        Main.main(args);
        double[] after = getEnergyStats();
        System.out.println("DRAM, CPU, PACKAGE");
        System.out.print(((after[0] - before[0]) / 10) + ", ");
        System.out.print(((after[1] - before[1]) / 10) + ", ");
        System.out.println(((after[2] - before[2]) / 10));
        ProfileDealloc();
    }
}
