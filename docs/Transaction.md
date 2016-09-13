
# Transaction

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | UUID que identifica unicamente a transação. | 
**transactionType** | [**TransactionTypeEnum**](#TransactionTypeEnum) | Tipo da transação. | 
**status** | [**StatusEnum**](#StatusEnum) | Status da transação. | 
**description** | **String** | Descrição da transação. |  [optional]
**terminalNumber** | **Integer** | Número do terminal da Cielo Lio em que o pagamento foi realizado. | 
**card** | [**Card**](Card.md) |  | 
**number** | **Integer** | Número Sequencial Único (NSU) da transação. | 
**authorizationCode** | **Integer** | Código de autorização da transação. | 
**paymentProduct** | [**PaymentProduct**](PaymentProduct.md) |  | 
**amount** | **String** | Valor da transação. Exemplo: O valor de R$ 10,00 é representado como 1000. | 
**createdAt** | [**DateTime**](DateTime.md) | Data da criação/inclusão do item no pedido. A data deve estar no formato: YYYY-MM-DDThh:mm:ssZ (Exemplo: 20151020T13:13:29.000Z) | 
**updatedAt** | [**DateTime**](DateTime.md) | Data da última atualização do item no pedido. A data deve estar no formato: YYYY-MM-DDThh:mm:ssZ (Exemplo: 20151020T13:13:29.000Z) | 


<a name="TransactionTypeEnum"></a>
## Enum: TransactionTypeEnum
Name | Value
---- | -----
PAYMENT | &quot;PAYMENT&quot;
CANCELLATION | &quot;CANCELLATION&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
CONFIRMED | &quot;CONFIRMED&quot;
PENDING | &quot;PENDING&quot;
CANCELLED | &quot;CANCELLED&quot;



