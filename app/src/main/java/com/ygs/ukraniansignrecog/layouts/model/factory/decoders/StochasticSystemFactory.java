package com.ygs.ukraniansignrecog.layouts.model.factory.decoders;

import com.ygs.ukraniansignrecog.layouts.model.logic.decoderMethods.StochasticMethod;

public interface  StochasticSystemFactory {
    StochasticMethod createHiddenMarkovModel();
}
