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

usersOrLojas = []
voluntarios = []
transportadoras = []


def CreateUserAndLoja():
    usersOrLojas.append([email,password,name,CoordX,CoordY])
    return email,password,name,CoordX,CoordY

def CreateVoluntario():
    voluntarios.append([email,password,name,CoordX,CoordY, raio])
    return email,password,name,CoordX,CoordY, raio

def CreateTransportadora():
    transportadoras.append(email,password,name,CoordX,CoordY, custo,raio, nif)
    return email,password,name,CoordX,CoordY, custo,raio, nif

def Encomenda():
    codigo = random_number(1,50)
    quantidade = random_number(1,50)
    transporte = 0
    op = random_number(1,2)
    if(op == 2):
        transporte = random_number(1,2)
    if transporte == 0:
        return codigo, quantidade, op
    else:
        return codigo, quantidade, op, transporte


print(CreateUserAndLoja())
print(usersOrLojas)