# Warehouse-ms

## Endpoints
BaseURL: /warehouses

POST: create()

GET: getAll()

GET /{id}: getById()*

PUT /{id}: update()*

## Model

'''json { "id": 1, "productId": 1, "quantity": 10, } '''

## Business Rule
- o estoque e responsavel por avisar se o produto esta ou n disponivel. ou seja se o valor da quantidade for igual a 0 tem q avisar ao outro servico
- nao e permitido mais de uma linha do mesmo produto salvo na base de dados