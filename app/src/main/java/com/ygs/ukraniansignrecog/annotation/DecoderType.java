package com.ygs.ukraniansignrecog.annotation;

import androidx.annotation.IntDef;
@IntDef({DecoderType.TGCN,
        DecoderType.RNN,
        DecoderType.GRU,
        DecoderType.MARKOV})
public @interface DecoderType {
    int TGCN = 0;
    int RNN = 1;
    int GRU = 2;
    int MARKOV = 3;
}
