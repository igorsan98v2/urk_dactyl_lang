package com.ygs.ukraniansignrecog.annotation;

import androidx.annotation.IntDef;

@IntDef({DatasetType.SMALL, DatasetType.MIDDLE, DatasetType.LARGE})
public @interface DatasetType {
    int SMALL = 0;
    int MIDDLE = 1;
    int LARGE = 2;
}
