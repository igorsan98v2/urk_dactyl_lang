package com.ygs.ukraniansignrecog.annotation;

import androidx.annotation.IntDef;

@IntDef({SkeletonType.HANDS,
        SkeletonType.ARMS,
        SkeletonType.HEAD,
        SkeletonType.HEAD_AND_HANDS,
        SkeletonType.FULL_BODY})
public @interface SkeletonType {
    int HANDS = 0;
    int ARMS = 1;
    int HEAD = 2;
    int HEAD_AND_HANDS = 3;
    int FULL_BODY = 4;
}
