# SAV - Sistema de Agregação de Votos

REST API desenvolvida com Spring para registrar votos, e fazer a contagem dos votos de acordo com o município.

Schema do banco de dados: db/sav_schema
Query para popular banco de dados: db/populate_sav_db



## --------------------------Endpoints--------------------------


### /score

- GET /score: Retorna uma lista com todos os registros de pontuação.

- POST /score: Registra uma nova lista de pontuações. \
Body: [{"idCandidate" : number, "point" : number}]

- GET /score/prefeito?idCounty={id do município}: Retorna a contagem atual dos votos para prefeito, o total de votos e a porcentagem de urnas apuradas.

- GET /score/vereador?idCounty={id do município}: Retorna a contagem atual dos votos para vereador, o total de votos e a porcentagem de urnas apuradas.
