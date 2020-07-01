package com.ygs.ukraniansignrecog.annotation;

import androidx.annotation.IntDef;

@IntDef({
        LocalType.UKRSL,
        LocalType.ASL})
public @interface LocalType {
    int UKRSL= 0; // Дактилі укр. жестової мови
    int ASL = 1;// Дактилі амер. жестової мови
}
