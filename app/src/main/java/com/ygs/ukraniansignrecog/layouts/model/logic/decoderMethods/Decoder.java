package com.ygs.ukraniansignrecog.layouts.model.logic.decoderMethods;

import com.ygs.ukraniansignrecog.layouts.model.logic.io.InputSignal;
import com.ygs.ukraniansignrecog.layouts.model.logic.io.OutputSignal;

public abstract class Decoder {
    DecoderMethod method;

    public void setMethod(DecoderMethod method) {
        this.method = method;
    }

    OutputSignal recognize(InputSignal signal){
        return  method.evaluate(signal);
    }
}
