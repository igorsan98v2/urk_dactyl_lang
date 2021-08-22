package com.ygs.ukraniansignrecog.annotation;

import androidx.annotation.IntDef;
@IntDef({DecoderType.TGCN,
        DecoderType.RNN,
        DecoderType.GRU,
        DecoderType.MARKOV,
        DecoderType.TABLE_METHOD,
        DecoderType.MOVE_AND_POSE_METHOD,
        DecoderType.REN})
public @interface DecoderType {
    int TGCN = 0;
    int RNN = 1;
    int GRU = 2;
    int MARKOV = 3;
    int TABLE_METHOD = 4;
    int MOVE_AND_POSE_METHOD = 5;
    int REN = 6;
}
