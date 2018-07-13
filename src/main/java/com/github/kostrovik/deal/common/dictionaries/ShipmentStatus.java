package com.github.kostrovik.deal.common.dictionaries;

/**
 * project: glc-mtx-deal
 * author:  kostrovik
 * date:    12/07/2018
 * github:  https://github.com/kostrovik/glc-mtx-deal
 */
public enum ShipmentStatus {
    UNDEFINED() {
        public String getStatusName() {
            return "Не установлен";
        }
    },
    PREPARING {
        public String getStatusName() {
            return "Оформляется";
        }
    },
    COMPLETED {
        public String getStatusName() {
            return "Выполнена";
        }
    };

    public abstract String getStatusName();
}
