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
public class DealCorrection extends AbstractModel {
    private Integer id;
    private LocalDateTime dateCreated;
    private Integer userId;
    private Integer dealId;
    private String reason;
    private BigDecimal priceChanged;
    private BigDecimal priceDelta;

    public DealCorrection() {
    }

    @Override
    public boolean equals(Object object) {
        if (!super.equals(object)) {
            return false;
        }

        DealCorrection that = (DealCorrection) object;
        return Objects.equals(id, that.id) &&
                Objects.equals(dateCreated, that.dateCreated) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(dealId, that.dealId) &&
                Objects.equals(reason, that.reason) &&
                Objects.equals(priceChanged, that.priceChanged) &&
                Objects.equals(priceDelta, that.priceDelta);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateCreated, userId, dealId, reason, priceChanged, priceDelta);
    }
}
