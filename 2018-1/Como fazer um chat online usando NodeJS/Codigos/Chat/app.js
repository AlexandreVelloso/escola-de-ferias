var app = require('express')();
var http = require('http').Server(app);
var io = require('socket.io')(http);
var port = process.env.PORT || 3000;

/*
Rota, ou seja, quando o servidor receber a url localhost:porta/
ele vai fazer essa acao. Se ele receber uma outra url ele vai dar erro
pois eu nao trato ela
*/
app.get('/', function(req,res){
    res.sendFile(__dirname + '/chat.html');
});


io.on('connection', function(socket){
   socket.on('chat message', function(msg){
      
      const splited = msg.split('|');
      
      const nome = splited[0];
      const mensagem = splited.slice( 1, splited.length );
      
      io.emit('chat message', nome+": "+mensagem);
   });
});

http.listen(port, function(){
   console.log('servidor rodando na porta '+port);
});
