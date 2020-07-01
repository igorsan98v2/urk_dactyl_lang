package com.ygs.ukraniansignrecog.layouts.model.factory.decoders;

import com.ygs.ukraniansignrecog.layouts.model.logic.decoderMethods.NeuralNetworkMethod;

public interface NeuralNetworkFactory {
    NeuralNetworkMethod createRNN();
    NeuralNetworkMethod createTGCN();
    NeuralNetworkMethod createGRU();
}
