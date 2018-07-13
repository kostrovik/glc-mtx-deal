package com.github.kostrovik.deal.common.models.deal;

import com.github.kostrovik.deal.common.models.AbstractModel;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * project: glc-mtx-deal
 * author:  kostrovik
 * date:    12/07/2018
 * github:  https://github.com/kostrovik/glc-mtx-deal
 */
public class DealDetail extends AbstractModel {
    private Integer id;
    private Integer dealId;
    private Integer modelId;
    private LocalDateTime dateCreated;
    private LocalDateTime dateUpdated;
    private BigDecimal priceItem;
    private Integer quantity;
    private BigDecimal priceTotal;

    public DealDetail() {
    }

    @Override
    public boolean equals(Object object) {
        if (!super.equals(object)) {
            return false;
        }

        DealDetail that = (DealDetail) object;
        return Objects.equals(id, that.id) &&
                Objects.equals(dealId, that.dealId) &&
                Objects.equals(modelId, that.modelId) &&
                Objects.equals(dateCreated, that.dateCreated) &&
                Objects.equals(dateUpdated, that.dateUpdated) &&
                Objects.equals(priceItem, that.priceItem) &&
                Objects.equals(quantity, that.quantity) &&
                Objects.equals(priceTotal, that.priceTotal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dealId, modelId, dateCreated, dateUpdated, priceItem, quantity, priceTotal);
    }
}
