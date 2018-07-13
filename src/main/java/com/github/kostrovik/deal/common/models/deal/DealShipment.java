package com.github.kostrovik.deal.common.models.deal;

import com.github.kostrovik.deal.common.dictionaries.ShipmentStatus;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * project: glc-mtx-deal
 * author:  kostrovik
 * date:    12/07/2018
 * github:  https://github.com/kostrovik/glc-mtx-deal
 */
public class DealShipment {
    private Integer id;
    private LocalDateTime dateCreated;
    private Integer userId;
    private Integer dealId;
    private BigDecimal priceTotal;
    private ShipmentStatus status;

    public DealShipment() {
    }

    @Override
    public boolean equals(Object object) {
        if (!super.equals(object)) {
            return false;
        }

        DealShipment that = (DealShipment) object;
        return Objects.equals(id, that.id) &&
                Objects.equals(dateCreated, that.dateCreated) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(dealId, that.dealId) &&
                Objects.equals(priceTotal, that.priceTotal) &&
                status == that.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateCreated, userId, dealId, priceTotal, status);
    }
}
