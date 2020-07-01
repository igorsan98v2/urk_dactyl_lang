package com.ygs.ukraniansignrecog.layouts.model.factory.impl;

import com.ygs.ukraniansignrecog.layouts.model.factory.decoders.NeuralNetworkFactory;
import com.ygs.ukraniansignrecog.layouts.model.logic.decoderMethods.NeuralNetworkMethod;
import com.ygs.ukraniansignrecog.layouts.model.logic.io.InputSignal;
import com.ygs.ukraniansignrecog.layouts.model.logic.io.OutputSignal;

import java.util.Collection;

public class NeuralNetworkFactoryHandsAndHeadImpl implements NeuralNetworkFactory {
    @Override
    public NeuralNetworkMethod createRNN() {
        return new NeuralNetworkMethod() {
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
                        System.out.println("input signal evaluated by RNN for heads and head");
                    }
                };
            }
        };
    }

    @Override
    public NeuralNetworkMethod createTGCN() {
        return new NeuralNetworkMethod() {
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
                        System.out.println("input signal evaluated by TGCN for hands and head");
                    }
                };
            }
        };
    }

    @Override
    public NeuralNetworkMethod createGRU() {
        return new NeuralNetworkMethod() {
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
                        System.out.println("input signal evaluated by GRU for hands and head");
                    }
                };
            }
        };
    }
}
