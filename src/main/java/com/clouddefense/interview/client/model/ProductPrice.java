package com.clouddefense.interview.client.model;

public record ProductPrice(int productUid,
                          double unitPrice,
                          String unitPriceMeasure,
                          int unitPriceMeasureAmount) {
}