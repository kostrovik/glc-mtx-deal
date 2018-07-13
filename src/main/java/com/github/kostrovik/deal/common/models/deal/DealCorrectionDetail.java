package com.github.kostrovik.deal.common.models.deal;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * project: glc-mtx-deal
 * author:  kostrovik
 * date:    12/07/2018
 * github:  https://github.com/kostrovik/glc-mtx-deal
 */
public class DealCorrectionDetail {
    private Integer id;
    private Integer dealCorrectionId;
    private Integer modelId;
    private Integer heightId;
    private Integer sizeId;
    private BigDecimal quantityOld;
    private BigDecimal quantityNew;

    public DealCorrectionDetail() {
    }

    @Override
    public boolean equals(Object object) {
        if (!super.equals(object)) {
            return false;
        }

        DealCorrectionDetail that = (DealCorrectionDetail) object;
        return Objects.equals(id, that.id) &&
                Objects.equals(dealCorrectionId, that.dealCorrectionId) &&
                Objects.equals(modelId, that.modelId) &&
                Objects.equals(heightId, that.heightId) &&
                Objects.equals(sizeId, that.sizeId) &&
                Objects.equals(quantityOld, that.quantityOld) &&
                Objects.equals(quantityNew, that.quantityNew);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dealCorrectionId, modelId, heightId, sizeId, quantityOld, quantityNew);
    }
}
