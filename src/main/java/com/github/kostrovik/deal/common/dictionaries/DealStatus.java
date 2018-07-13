package com.github.kostrovik.deal.common.dictionaries;

/**
 * project: glc-mtx-deal
 * author:  kostrovik
 * date:    11/07/2018
 * github:  https://github.com/kostrovik/glc-mtx-deal
 */
public enum DealStatus {
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
    FIXED {
        public String getStatusName() {
            return "Зафиксирована";
        }
    },
    FINISHED {
        public String getStatusName() {
            return "Выполнена";
        }
    },
    INTERRUPTED {
        public String getStatusName() {
            return "Прервана";
        }
    },
    ARCHIVED {
        public String getStatusName() {
            return "Архив";
        }
    };

    public abstract String getStatusName();
}
