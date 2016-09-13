
# OrderItem

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sku** | **String** | SKU do produto. |  [optional]
**name** | **String** | Nome do produto. |  [optional]
**description** | **String** | Descrição do produto. |  [optional]
**unitPrice** | **Integer** | Valor unitário do produto. Exemplo: O valor de R$ 10,00 é representado como 1000. | 
**quantity** | **Integer** | Quantidade de itens. Caso não seja informado será considerado o valor 1. |  [optional]
**unitOfMeasure** | [**UnitOfMeasureEnum**](#UnitOfMeasureEnum) | Unidade de medida. | 
**details** | **String** | Detalhes do produto. |  [optional]
**createdAt** | [**DateTime**](DateTime.md) | Data da criação/inclusão do item no pedido. A data deve estar no formato: YYYY-MM-DDThh:mm:ssZ (Exemplo: 20151020T13:13:29.000Z) | 
**updatedAt** | [**DateTime**](DateTime.md) | Data da última atualização do item no pedido. A data deve estar no formato: YYYY-MM-DDThh:mm:ssZ (Exemplo: 20151020T13:13:29.000Z) | 


<a name="UnitOfMeasureEnum"></a>
## Enum: UnitOfMeasureEnum
Name | Value
---- | -----
EACH | &quot;EACH&quot;
HOURS | &quot;HOURS&quot;
DAYS | &quot;DAYS&quot;
SECONDS | &quot;SECONDS&quot;
CRATE_OF_12 | &quot;CRATE_OF_12&quot;
SIX_PACK | &quot;SIX_PACK&quot;
GALLON | &quot;GALLON&quot;
LITRE | &quot;LITRE&quot;



