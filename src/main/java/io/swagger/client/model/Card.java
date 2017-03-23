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
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Informações sobre o cartão utilizado na transação.
 */
@ApiModel(description = "Informações sobre o cartão utilizado na transação.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-03-09T14:44:13.421Z")
public class Card {
  /**
   * Bandeira do cartão.
   */
  public enum BrandEnum {
    @SerializedName("VISA")
    VISA("VISA"),
    
    @SerializedName("MASTER")
    MASTER("MASTER");

    private String value;

    BrandEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("brand")
  private BrandEnum brand = null;

  @SerializedName("bin")
  private Integer bin = null;

  @SerializedName("last")
  private Integer last = null;

  public Card brand(BrandEnum brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Bandeira do cartão.
   * @return brand
  **/
  @ApiModelProperty(example = "null", required = true, value = "Bandeira do cartão.")
  public BrandEnum getBrand() {
    return brand;
  }

  public void setBrand(BrandEnum brand) {
    this.brand = brand;
  }

  public Card bin(Integer bin) {
    this.bin = bin;
    return this;
  }

   /**
   * Bin (primeiros 6 dígitos) do cartão.
   * @return bin
  **/
  @ApiModelProperty(example = "null", required = true, value = "Bin (primeiros 6 dígitos) do cartão.")
  public Integer getBin() {
    return bin;
  }

  public void setBin(Integer bin) {
    this.bin = bin;
  }

  public Card last(Integer last) {
    this.last = last;
    return this;
  }

   /**
   * Last (últimos 4 dígitos) do cartão.
   * @return last
  **/
  @ApiModelProperty(example = "null", required = true, value = "Last (últimos 4 dígitos) do cartão.")
  public Integer getLast() {
    return last;
  }

  public void setLast(Integer last) {
    this.last = last;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return Objects.equals(this.brand, card.brand) &&
        Objects.equals(this.bin, card.bin) &&
        Objects.equals(this.last, card.last);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, bin, last);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    bin: ").append(toIndentedString(bin)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
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

