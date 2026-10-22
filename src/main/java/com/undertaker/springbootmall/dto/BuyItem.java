package com.undertaker.springbootmall.dto;

import javax.validation.constraints.NotNull;

public class BuyItem {

    @NotNull
    public Integer productId;

    @NotNull
    public Integer quantity;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}