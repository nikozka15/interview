package com.clouddefense.interview.controller.response;


import com.fasterxml.jackson.annotation.JsonProperty;

public record UnifiedProduct(@JsonProperty("product_uid") int productUid,
                             @JsonProperty("product_type") String productType,
                             @JsonProperty("name") String name,
                             @JsonProperty("full_url") String fullUrl,
                             @JsonProperty("unit_price") double unitPrice,
                             @JsonProperty("unit_price_measure") String unitPriceMeasure,
                             @JsonProperty("unit_price_measure_amount") int unitPriceMeasureAmount) {
}
