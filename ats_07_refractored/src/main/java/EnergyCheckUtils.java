import traz_aqui.*;

import java.lang.reflect.Field;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EnergyCheckUtils {
    public native static int ProfileInit();
    public native static String EnergyStatCheck();
    public native static void ProfileDealloc();

    static Random random = new Random();
    static int nUsers = 0;
    static int nVolun = 0;
    static int nTrans = 0;
    static int nStore = 0;
    static int nOrder = 0;
    static List<String> generatedMails = new ArrayList<>();
    static int nextMail = 0;

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

    public static void checkLogs(){
        main.parse("files/Logs.txt", 1);
    }

    public static void checkCreation(){
        main main = new main();
        for(int i=0; i<nUsers; i++)
            main.addBuy(new Buyer("name", "c" + i, "pass", 0, 0, generatedMails.get(nextMail++)));
        for(int i=0; i<nVolun; i++)
            main.addVol(new Voluntario("name", "c" + i, "pass", 0, 0, generatedMails.get(nextMail++), 1, true, 1, 100));
        for(int i=0; i<nTrans; i++)
            main.addTrans(new Transportadora("name", "t"+i, "pass", 0, 0, generatedMails.get(nextMail++), 1, 100, 123, 123, 123));
        for(int i=0; i<nStore; i++)
            main.addLoja(new Loja("name", "l"+i, "pass", 0, 0, generatedMails.get(nextMail++)));
        for(int i=0; i<nOrder; i++)
            main.addEnc(new Encomenda("e"+i, "u"+i%nUsers, "l"+i%nStore, "t"+i%nTrans, 10, LocalDate.now(), 1, new ArrayList<LinhaEncomenda>()));
        int n = (nUsers + nVolun + nTrans + nStore + nOrder)/5;
        for(int i=0; i<n; i++) {
            main.top10Empresas();
            main.top10Users();
        }
    }

    public static void main(String[] args) {
        try {
            nUsers = Integer.parseInt(args[0]);
            if(nUsers != -1) {
                nVolun = Integer.parseInt(args[1]);
                nTrans = Integer.parseInt(args[2]);
                nStore = Integer.parseInt(args[3]);
                nOrder = Integer.parseInt(args[4]);
                for (int i = 0; i < nUsers + nVolun + nTrans + nStore + nOrder; i++) {
                    byte[] tmp = new byte[10];
                    random.nextBytes(tmp);
                    generatedMails.add(new String(tmp));
                }
            }
        } catch (Exception e){
            System.out.println("args: [N_USERS] [N_VOLUNTEERS] [N_TRANSPORTS] [N_STORE] [N_ORDER]");
            System.out.println("args: -1 for logs");
            System.exit(1);
        }
        ProfileInit();
        double[] before = getEnergyStats();
        long timeStart = System.nanoTime();
        if(nUsers < 0 || nVolun < 0 || nTrans < 0 || nStore < 0 || nOrder < 0)
            checkLogs();
        else
            checkCreation();
        double[] after = getEnergyStats();
        long timeFinish = System.nanoTime();
        System.out.println("DRAM, CPU, PACKAGE, TIME(s)");
        System.out.print((after[0] - before[0]) + ", ");
        System.out.print((after[1] - before[1]) + ", ");
        System.out.print((after[2] - before[2]) + ", ");
        System.out.println(((double)timeFinish - (double)timeStart) * 1e-9);
        ProfileDealloc();
    }
}
