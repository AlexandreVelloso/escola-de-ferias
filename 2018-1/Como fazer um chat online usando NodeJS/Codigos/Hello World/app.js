const fs = require('fs');
const express = require('express');
var app = express();

app.get('/', function(req,res){
    res.end('<h1>Hello World!</h1>');
});

app.listen(3000, function(){
  console.log('servidor rodando na porta 3000');
});