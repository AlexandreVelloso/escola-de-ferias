import sys
import math
from random import randint

def crivo():

    primos = []

    # preenche o array com numeros de 2 ate 10000
    for i in range( 2, 200 ):
        primos.append( i )
    
    # elimina os numero nao primos do array usando
    # o crivo de eratostenes
    for i in range( 2, round(math.sqrt(201)) ):
        for p in primos:
            if( p!=i and p % i == 0 ):
                primos.remove(p)

    return primos

# calculo do mdc pelo algoritimo de euclides
def mdc( a,b ):
    while( b != 0 ):
        r = a % b
        a = b
        b = r
    return a

# gera 3 numeros: e, n, d
def gerarPrimos():

    # array com 1229 primos
    primos = crivo()
    
    # vou escolher 2 deles
    p = primos[ randint( 0, len(primos)-1 ) ]
    q = primos[ randint( 0, len(primos)-1 ) ]

    n = p*q
    z = (p-1)*(q-1)

    e = primos[ randint(0,len(primos)/2 ) ]
    # escolha um numero 'e' tal que 'e' e 'z' sejam primos entre si
    while( mdc(e,z) != 1 ):
        e += 2

    d = 2
    # ache 'd' de modo que (d*e) mod z = 1
    while( (d*e) % z != 1 ):
        d += 1

    return ( e, n, d )

def criptografa( mensagem, e, n ):
    mensagemCriptografada = []
    for c in mensagem:
        mensagemCriptografada.append( (ord(c)**e) % n )
    return mensagemCriptografada

def descriptografa( mensagem, d, n ):
    mensagemDescriptografada = ''
    for c in mensagem:
        mensagemDescriptografada += chr( (c**d) % n )
    return mensagemDescriptografada

if __name__ == "__main__":
    #e, n, d = gerarPrimos()
    e, n, d = 7, 2869, 1543
    
    mensagem = "Mensagem de teste"
    mensagemCriptografada = criptografa( mensagem, e, n )
    
    print( mensagemCriptografada )
    print( descriptografa(mensagemCriptografada, d, n) )