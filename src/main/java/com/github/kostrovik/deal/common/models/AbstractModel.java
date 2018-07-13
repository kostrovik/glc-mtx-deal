package com.github.kostrovik.deal.common.models;

/**
 * project: glc-mtx-deal
 * author:  kostrovik
 * date:    12/07/2018
 * github:  https://github.com/kostrovik/glc-mtx-deal
 */
public abstract class AbstractModel {
    public boolean equals(Object object) {
        if (super.equals(object)) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) return false;

        return true;
    }
}
