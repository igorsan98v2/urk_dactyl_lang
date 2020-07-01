package com.ygs.ukraniansignrecog.layouts.model.logic.decoderMethods;

import com.ygs.ukraniansignrecog.layouts.model.logic.io.InputSignal;
import com.ygs.ukraniansignrecog.layouts.model.logic.io.OutputSignal;

import java.util.Collection;

public interface DecoderMethod {
    boolean reset();
    int train(Collection<InputSignal> trainCollection, Collection<InputSignal> testCollection);
    OutputSignal evaluate(InputSignal inputSignal);

}
