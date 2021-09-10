# language: pt 
# enconding:  UTF-8


Funcionalidade: noticia do santos 

@time1
Esquema do Cenario: aparecer as noticias do santos
Dado que estou no site "<url>"
Quando clico no botao do time "<time>"
Entao coleto titulo"<time>"


Exemplos:
|url                  |time  |
|https://ge.globo.com/|SANTOS|


@time2
Esquema do Cenario: aparecer as noticias do palmeiras
Dado que estou no site "<url>"
Quando clico no botao do time "<time>"
Entao coleto titulo"<time>"


Exemplos:
|url                  |time     |
|https://ge.globo.com/|PALMEIRAS|