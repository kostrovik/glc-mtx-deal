package com.github.kostrovik.deal.common.models.deal;

import com.github.kostrovik.deal.common.dictionaries.DealStatus;
import com.github.kostrovik.deal.common.models.AbstractModel;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * project: glc-mtx-deal
 * author:  kostrovik
 * date:    11/07/2018
 * github:  https://github.com/kostrovik/glc-mtx-deal
 */
public class Deal extends AbstractModel {
    private Integer id;
    private Integer number;
    private Integer warehouseId;
    private Integer distributionId;
    private LocalDateTime dateCreated;
    private DealStatus dealStatus;
    private Boolean canShipped;
    private String comment;
    private BigDecimal priceTotal;
    private LocalDateTime deliveryDatel;

    public Deal(Integer number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object object) {
        if (!super.equals(object)) {
            return false;
        }

        Deal deal = (Deal) object;
        return Objects.equals(id, deal.id) &&
                Objects.equals(number, deal.number) &&
                Objects.equals(warehouseId, deal.warehouseId) &&
                Objects.equals(distributionId, deal.distributionId) &&
                Objects.equals(dateCreated, deal.dateCreated) &&
                dealStatus == deal.dealStatus &&
                Objects.equals(canShipped, deal.canShipped) &&
                Objects.equals(comment, deal.comment) &&
                Objects.equals(priceTotal, deal.priceTotal) &&
                Objects.equals(deliveryDatel, deal.deliveryDatel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, number, warehouseId, distributionId, dateCreated, dealStatus, canShipped, comment, priceTotal, deliveryDatel);
    }
}
