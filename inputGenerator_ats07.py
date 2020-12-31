import random
import string

def random_char(y):
       return ''.join(random.choice(string.ascii_letters) for x in range(y))

def random_number(a,b):
    return random.randint(a,b)

email = random_char(7)+"@gmail.com"
name = random_char(7)
password = random_char(7)
CoordX = random_number(1,50)
CoordY= random_number(1,50)
custo = random_number(1,50)
raio = random_number(1,50)
nif = random_number(100000000,999999999)

users= []
lojas = []
voluntarios = []
transportadoras = []


def CreateUser():
    users.append([2,1,email,password,name,CoordX,CoordY])
    return 2,1,email,password,name,CoordX,CoordY

def CreateLoja():
    lojas.append([2,4,email,password,name,CoordX,CoordY])
    return 2,4,email,password,name,CoordX,CoordY

def CreateVoluntario():
    voluntarios.append([2,2,email,password,name,CoordX,CoordY, raio])
    return 2,2,email,password,name,CoordX,CoordY, raio

def CreateTransportadora():
    transportadoras.append([2,3,email,password,name,CoordX,CoordY, custo,raio, nif])
    return 2,3,email,password,name,CoordX,CoordY, custo,raio, nif

def Encomenda():
    codigo = random_number(1,50)
    quantidade = random_number(1,50)
    transporte = 0
    op = random_number(1,2)
    if(op == 2):
        transporte = random_number(1,2)
    if transporte == 0:
        return 1,users[0][2],users[0][3],1,0,codigo, quantidade, op
    else:
        return 1,users[0][2],users[0][3],1,0,codigo, quantidade, op, transporte

def checkTopAndClose():
    return 3,4,0

def UserToCommand(user):
    logs = str(random_number(1,2))
    tmp = logs + "\n"
    for i in range(len(user)):
        tmp = tmp + str(user[i]) + "\n"
    tmp = tmp + "0\n"
    return tmp
for i in range(0,10):
    print(UserToCommand(CreateUser()), end='')
    print(UserToCommand(CreateLoja()), end='')
    print(UserToCommand(CreateVoluntario()), end='')
    print(UserToCommand(CreateTransportadora()), end='')

print(Encomenda())
print(checkTopAndClose())