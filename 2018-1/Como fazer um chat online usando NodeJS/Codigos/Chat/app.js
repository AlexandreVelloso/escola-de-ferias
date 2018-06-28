const fs = require('fs');
const express = require('express');
var app = express();

app.get('/', function(req,res){
    fs.readFile('./chat.html', function(err, data){
        if( err ) throw err;
        res.end( data );
    });
});

app.listen(3000, function(){
  console.log('servidor rodando na porta 3000');
});