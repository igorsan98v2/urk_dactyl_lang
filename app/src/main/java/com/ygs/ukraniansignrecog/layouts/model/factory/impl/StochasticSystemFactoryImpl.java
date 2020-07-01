package com.ygs.ukraniansignrecog.layouts.model.factory.impl;

import com.ygs.ukraniansignrecog.layouts.model.factory.decoders.StochasticSystemFactory;
import com.ygs.ukraniansignrecog.layouts.model.logic.decoderMethods.StochasticMethod;
import com.ygs.ukraniansignrecog.layouts.model.logic.io.InputSignal;
import com.ygs.ukraniansignrecog.layouts.model.logic.io.OutputSignal;

import java.util.Collection;

public class StochasticSystemFactoryImpl implements StochasticSystemFactory {
    @Override
    public StochasticMethod createHiddenMarkovModel() {
        return new StochasticMethod() {
            @Override
            public boolean reset() {
                return true;
            }

            @Override
            public int train(Collection<InputSignal> trainCollection, Collection<InputSignal> testCollection) {
                return 0;
            }

            @Override
            public OutputSignal evaluate(InputSignal inputSignal) {
                return new OutputSignal() {
                    @Override
                    public void log() {
                        System.out.println("input signal evaluated by hidden markov system");
                    }
                };
            }
        };
    }
}
