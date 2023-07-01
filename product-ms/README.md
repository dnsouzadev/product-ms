# Product-ms

## Endpoints

- BaseURL: /products
- POST: create()
- GET: getAll()
- GET /{id}: getById()
- PUT /{id}: update()
- DELETE /{id}: delete()

## Model

'''json
{
"id": 1,
"name": "Iphone 13 Pro Max",
"description":"celular de ultima geracao",
"price": 6000.90,
"isAvailable: true
}
'''

## Business Rules

- So e possivel a criacao de produtos com preco positivo
- nao e possivel pesquisar produtos que nao estao disponiveis
- nao e possivel inserir descricoes com menos de 50 caracteres

# Warehouse-ms

## Endpoints

- BaseURL: /warehouses
- POST: create()
- GET: getAll()
- GET /{id}: getById()*
- PUT /{id}: update()*

## Model

'''json
{
"id": 1,
"productId": 1,
"quantity": 10,
}
'''

## Business Rules

- o estoque e responsavel por avisar se o produto esta ou n disponivel. ou seja se o valor da quantidade for igual a 0 tem q avisar ao outro servico
- nao e permitido mais de uma linha do mesmo produto salvo na base de dados