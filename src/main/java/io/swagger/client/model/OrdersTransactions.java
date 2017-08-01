/*
 * LIO - Order Management API
 * API de gerenciamento de pedidos da LIO.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.OrdersCard;
import io.swagger.client.model.OrdersPaymentProduct;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * OrdersTransactions
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-07-28T14:20:55.281Z")
public class OrdersTransactions {
  @SerializedName("id")
  private String id = null;

  /**
   * Tipo da transação.
   */
  @JsonAdapter(TransactionTypeEnum.Adapter.class)
  public enum TransactionTypeEnum {
    PAYMENT("PAYMENT"),
    
    CANCELLATION("CANCELLATION");

    private String value;

    TransactionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TransactionTypeEnum fromValue(String text) {
      for (TransactionTypeEnum b : TransactionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TransactionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TransactionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TransactionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TransactionTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("transaction_type")
  private TransactionTypeEnum transactionType = null;

  /**
   * Status da transação.
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    CONFIRMED("CONFIRMED"),
    
    PENDING("PENDING"),
    
    CANCELLED("CANCELLED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("terminal_number")
  private Integer terminalNumber = null;

  @SerializedName("card")
  private OrdersCard card = null;

  @SerializedName("number")
  private Integer number = null;

  @SerializedName("authorization_code")
  private String authorizationCode = null;

  @SerializedName("payment_product")
  private OrdersPaymentProduct paymentProduct = null;

  @SerializedName("amount")
  private String amount = null;

  @SerializedName("created_at")
  private DateTime createdAt = null;

  @SerializedName("updated_at")
  private DateTime updatedAt = null;

  public OrdersTransactions id(String id) {
    this.id = id;
    return this;
  }

   /**
   * UUID que identifica unicamente a transação.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "UUID que identifica unicamente a transação.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public OrdersTransactions transactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
    return this;
  }

   /**
   * Tipo da transação.
   * @return transactionType
  **/
  @ApiModelProperty(required = true, value = "Tipo da transação.")
  public TransactionTypeEnum getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
  }

  public OrdersTransactions status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Status da transação.
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Status da transação.")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  public OrdersTransactions description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Descrição da transação.
   * @return description
  **/
  @ApiModelProperty(value = "Descrição da transação.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public OrdersTransactions terminalNumber(Integer terminalNumber) {
    this.terminalNumber = terminalNumber;
    return this;
  }

   /**
   * Número do terminal da Cielo Lio em que o pagamento foi realizado.
   * @return terminalNumber
  **/
  @ApiModelProperty(required = true, value = "Número do terminal da Cielo Lio em que o pagamento foi realizado.")
  public Integer getTerminalNumber() {
    return terminalNumber;
  }

  public void setTerminalNumber(Integer terminalNumber) {
    this.terminalNumber = terminalNumber;
  }

  public OrdersTransactions card(OrdersCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  @ApiModelProperty(value = "")
  public OrdersCard getCard() {
    return card;
  }

  public void setCard(OrdersCard card) {
    this.card = card;
  }

  public OrdersTransactions number(Integer number) {
    this.number = number;
    return this;
  }

   /**
   * Número Sequencial Único (NSU) da transação.
   * @return number
  **/
  @ApiModelProperty(required = true, value = "Número Sequencial Único (NSU) da transação.")
  public Integer getNumber() {
    return number;
  }

  public void setNumber(Integer number) {
    this.number = number;
  }

  public OrdersTransactions authorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
    return this;
  }

   /**
   * Código de autorização da transação.
   * @return authorizationCode
  **/
  @ApiModelProperty(required = true, value = "Código de autorização da transação.")
  public String getAuthorizationCode() {
    return authorizationCode;
  }

  public void setAuthorizationCode(String authorizationCode) {
    this.authorizationCode = authorizationCode;
  }

  public OrdersTransactions paymentProduct(OrdersPaymentProduct paymentProduct) {
    this.paymentProduct = paymentProduct;
    return this;
  }

   /**
   * Get paymentProduct
   * @return paymentProduct
  **/
  @ApiModelProperty(value = "")
  public OrdersPaymentProduct getPaymentProduct() {
    return paymentProduct;
  }

  public void setPaymentProduct(OrdersPaymentProduct paymentProduct) {
    this.paymentProduct = paymentProduct;
  }

  public OrdersTransactions amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Valor da transação. Exemplo: O valor de R$ 10,00 é representado como 1000.
   * @return amount
  **/
  @ApiModelProperty(required = true, value = "Valor da transação. Exemplo: O valor de R$ 10,00 é representado como 1000.")
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public OrdersTransactions createdAt(DateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Data da criação/inclusão do item no pedido. A data deve estar no formato: YYYY-MM-DDThh:mm:ssZ (Exemplo: 20151020T13:13:29.000Z)
   * @return createdAt
  **/
  @ApiModelProperty(required = true, value = "Data da criação/inclusão do item no pedido. A data deve estar no formato: YYYY-MM-DDThh:mm:ssZ (Exemplo: 20151020T13:13:29.000Z)")
  public DateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(DateTime createdAt) {
    this.createdAt = createdAt;
  }

  public OrdersTransactions updatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Data da última atualização do item no pedido. A data deve estar no formato: YYYY-MM-DDThh:mm:ssZ (Exemplo: 20151020T13:13:29.000Z)
   * @return updatedAt
  **/
  @ApiModelProperty(required = true, value = "Data da última atualização do item no pedido. A data deve estar no formato: YYYY-MM-DDThh:mm:ssZ (Exemplo: 20151020T13:13:29.000Z)")
  public DateTime getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(DateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrdersTransactions ordersTransactions = (OrdersTransactions) o;
    return Objects.equals(this.id, ordersTransactions.id) &&
        Objects.equals(this.transactionType, ordersTransactions.transactionType) &&
        Objects.equals(this.status, ordersTransactions.status) &&
        Objects.equals(this.description, ordersTransactions.description) &&
        Objects.equals(this.terminalNumber, ordersTransactions.terminalNumber) &&
        Objects.equals(this.card, ordersTransactions.card) &&
        Objects.equals(this.number, ordersTransactions.number) &&
        Objects.equals(this.authorizationCode, ordersTransactions.authorizationCode) &&
        Objects.equals(this.paymentProduct, ordersTransactions.paymentProduct) &&
        Objects.equals(this.amount, ordersTransactions.amount) &&
        Objects.equals(this.createdAt, ordersTransactions.createdAt) &&
        Objects.equals(this.updatedAt, ordersTransactions.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, transactionType, status, description, terminalNumber, card, number, authorizationCode, paymentProduct, amount, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrdersTransactions {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    terminalNumber: ").append(toIndentedString(terminalNumber)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    authorizationCode: ").append(toIndentedString(authorizationCode)).append("\n");
    sb.append("    paymentProduct: ").append(toIndentedString(paymentProduct)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}
