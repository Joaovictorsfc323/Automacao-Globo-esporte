# language: pt 
# enconding:  UTF-8

@globoEsporte
Funcionalidade: noticia do santos 

Esquema do Cenario: aparecer as noticias do santos
Dado que estou no site "<url>"
Quando clico no botao do time "<time>"
E escolher menu "<Menu>"
Entao coleto a noticia "<time>"


Exemplos:
|url                  |time  |Menu                 |
|https://ge.globo.com/|santos|futebol Internacional|
