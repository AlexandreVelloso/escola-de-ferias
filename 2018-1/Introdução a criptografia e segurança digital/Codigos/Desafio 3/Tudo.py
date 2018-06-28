from aes import AES, encrypt, decrypt
import base64

def tudo():
    aes = AES( "abcdefghijklmnopqrstuvwx" )
    print( enc( "abcdefghijklmnopqrstuvwx", "teste" ) )

# Esse metodo encripta uma mensagem, usando a senha de 128 bits
# return: uma sequencia de bytes criptografados em AES256 e depois base64
def enc ( senha, mensagem ):
    # a mensagem vem como string, vou transforma-la em bytes ascii
    mensagem = mensagem.encode('ascii')

    # codifica a mensagem e transforma em base64 para eu salvar no arquivo
    return base64.b64encode( encrypt( senha, mensagem ) )
# end method enc

if __name__ == '__main__':
    tudo()