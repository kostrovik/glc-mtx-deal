package com.github.kostrovik.deal.common.models.deal;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 * project: glc-mtx-deal
 * author:  kostrovik
 * date:    12/07/2018
 * github:  https://github.com/kostrovik/glc-mtx-deal
 */
public class DealPayment {
    private Integer id;
    private LocalDateTime dateReceipt;
    private Integer dealId;
    private BigDecimal sum;
    private Integer payerId;
    private String comment;

    public DealPayment() {
    }

    @Override
    public boolean equals(Object object) {
        if (!super.equals(object)) {
            return false;
        }

        DealPayment that = (DealPayment) object;
        return Objects.equals(id, that.id) &&
                Objects.equals(dateReceipt, that.dateReceipt) &&
                Objects.equals(dealId, that.dealId) &&
                Objects.equals(sum, that.sum) &&
                Objects.equals(payerId, that.payerId) &&
                Objects.equals(comment, that.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateReceipt, dealId, sum, payerId, comment);
    }
}
