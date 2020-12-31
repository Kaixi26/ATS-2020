import random
import string

def random_char(y):
       return ''.join(random.choice(string.ascii_letters) for x in range(y))

def random_number(a,b):
    return random.randint(a,b)

yesOrNo = ['y','n']
email = random_char(7)+"@gmail.com"
name = random_char(7)
password = random_char(7)
CoordX = random_number(1,50)
CoordY= random_number(1,50)
custo = random_number(1,50)
raio = random_number(1,50)
nif = random_number(100000000,999999999)
filen_name= random_char(3)
velocidade = random_number(1,50)
tamanho = random_number(1,40)
competencia = yesOrNo[random_number(0,1)]
file_name = random_char(2)+".txt"

users = []
lojas = []
voluntarios = []
transportadoras = []


def CreateUser():
    users.append([email,password,name,CoordX,CoordY])
    return 1,2,email,password,name,CoordX,CoordY

def CreateLoja():
    if(yesOrNo[random_number(0,1)] == 'y'):
        lojas.append([email,password,name,CoordX,CoordY,yesOrNo[0],tamanho])
        return 4,2,email,password,name,CoordX,CoordY,yesOrNo[0],tamanho
    else:
        lojas.append([email,password,name,CoordX,CoordY,yesOrNo[1]])
        return 4,2,email,password,name,CoordX,CoordY,yesOrNo[1]

def CreateVoluntario():
    voluntarios.append([email,password,name,CoordX,CoordY, raio,velocidade,competencia])
    return 2,2,email,password,name,CoordX,CoordY, raio,velocidade,competencia

def CreateTransportadora():
    transportadoras.append([email,password,name,CoordX,CoordY,raio,custo,nif, velocidade,tamanho,competencia])
    return 3,2,email,password,name,CoordX,CoordY,raio,custo,nif, velocidade,tamanho,competencia

def checkTop():
    return 5,6

def saveAndEnd():
    return 7, file_name,1, 2

def UserToCommand(user):
    tmp = "\n"
    for i in range(len(user)):
        tmp = tmp + str(user[i]) + "\n"
    tmp = tmp + "0\n0\n0\n"
    return tmp

for i in range(0,10):
    print(UserToCommand(CreateUser()), end='')
    print(UserToCommand(CreateVoluntario()), end='')
    print(UserToCommand(CreateLoja()), end='')
    print(UserToCommand(CreateTransportadora()), end='')

print(checkTop())
print(saveAndEnd())


