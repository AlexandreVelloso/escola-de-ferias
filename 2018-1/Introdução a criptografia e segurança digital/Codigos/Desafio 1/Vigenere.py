import sys

def criptografa( mensagem, senha ):
    mensagemCriptografada = ''
    pos = 0
    for c in mensagem:
        mensagemCriptografada += chr( ( ord(c) + ord(senha[pos]) ) % 256 )
        pos = ( pos + 1 ) % len( senha )

    return mensagemCriptografada

def descriptografa( mensagem, senha ):
    mensagemCriptografada = ''
    pos = 0
    for c in mensagem:
        mensagemCriptografada += chr( ( ord(c) - ord(senha[pos]) ) % 256 )
        pos = ( pos + 1 ) % len( senha )
        
    return mensagemCriptografada

if __name__ == "__main__":
    mensagemOriginal = input("Digite uma mensagem\n")
    senha = input("Digite a senha\n")

    mensagemCriptografada = criptografa( mensagemOriginal, senha )

    print( "\nMensagem original\n"+ mensagemOriginal )
    print( "\nMensagem criptografada\n"+ criptografa( mensagemOriginal, senha ) )
    print( "\nMensagem descriptografada\n"+ descriptografa( mensagemCriptografada, senha ) +"\n")