import sys

def criptografa( mensagem, deslocamento ):
    mensagemCriptografada = ''
    for c in mensagem:
        mensagemCriptografada += chr( ( ord(c) + deslocamento ) % 256 )
    return mensagemCriptografada

def descriptografa( mensagem, deslocamento ):
    mensagemCriptografada = ''
    for c in mensagem:
        mensagemCriptografada += chr( ( ord(c) - deslocamento ) % 256 )
    return mensagemCriptografada

if __name__ == "__main__":
    mensagemOriginal = input("Digite uma mensagem\n")
    deslocamento = int( input("Digite o deslocamento\n") )

    mensagemCriptografada = criptografa( mensagemOriginal, deslocamento )

    print( "\nMensagem original\n"+ mensagemOriginal )
    print( "\nMensagem criptografada\n"+ criptografa( mensagemOriginal, deslocamento ) )
    print( "\nMensagem descriptografada\n"+ descriptografa( mensagemCriptografada, deslocamento ) +"\n")