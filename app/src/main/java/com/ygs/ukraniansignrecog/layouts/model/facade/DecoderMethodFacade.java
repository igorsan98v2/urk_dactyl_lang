package com.ygs.ukraniansignrecog.layouts.model.facade;

import com.ygs.ukraniansignrecog.annotation.DecoderType;
import com.ygs.ukraniansignrecog.annotation.SkeletonType;
import com.ygs.ukraniansignrecog.layouts.model.factory.decoders.NeuralNetworkFactory;
import com.ygs.ukraniansignrecog.layouts.model.factory.decoders.StochasticSystemFactory;
import com.ygs.ukraniansignrecog.layouts.model.factory.impl.NeuralNetworkFactoryFullBodyIml;
import com.ygs.ukraniansignrecog.layouts.model.factory.impl.NeuralNetworkFactoryHandsAndHeadImpl;
import com.ygs.ukraniansignrecog.layouts.model.factory.impl.NeuralNetworkFactoryHandsOnlyImpl;
import com.ygs.ukraniansignrecog.layouts.model.factory.impl.StochasticSystemFactoryImpl;
import com.ygs.ukraniansignrecog.layouts.model.logic.decoderMethods.DecoderMethod;

public final class DecoderMethodFacade {
    private final static NeuralNetworkFactory neuralNetworkHandsFactory;
    private final static NeuralNetworkFactory neuralNetworkHandsAndHeadFactory;
    private final static NeuralNetworkFactory neuralNetworkFullBodyFactory;
    private final static StochasticSystemFactory stochasticSystemFactory;

    private DecoderMethodFacade() {

    }

    static {
        neuralNetworkHandsFactory = new NeuralNetworkFactoryHandsOnlyImpl();
        neuralNetworkHandsAndHeadFactory = new NeuralNetworkFactoryHandsAndHeadImpl();
        neuralNetworkFullBodyFactory = new NeuralNetworkFactoryFullBodyIml();
        stochasticSystemFactory = new StochasticSystemFactoryImpl();
    }

    private static DecoderMethod selectGRUBySkeletonType(@SkeletonType int skeletonType){
        switch (skeletonType){
            case SkeletonType.HANDS:
                return neuralNetworkHandsFactory.createGRU();
            case SkeletonType.FULL_BODY:
                return neuralNetworkFullBodyFactory.createGRU();
            default:
                return neuralNetworkHandsAndHeadFactory.createGRU();
        }
    }
    private static DecoderMethod selectRNNBySkeletonType(@SkeletonType int skeletonType){
        switch (skeletonType){
            case SkeletonType.HANDS:
                return neuralNetworkHandsFactory.createRNN();
            case SkeletonType.FULL_BODY:
                return neuralNetworkFullBodyFactory.createRNN();
            default:
                return neuralNetworkHandsAndHeadFactory.createRNN();
        }
    }

    private static DecoderMethod selectTGCNBySkeletonType(@SkeletonType int skeletonType){
        switch (skeletonType){
            case SkeletonType.HANDS:
                return neuralNetworkHandsFactory.createTGCN();
            case SkeletonType.FULL_BODY:
                return neuralNetworkFullBodyFactory.createTGCN();
            default:
                return neuralNetworkHandsAndHeadFactory.createTGCN();
        }
    }

    public static DecoderMethod createMethod(@DecoderType int decoderType, @SkeletonType int skeletonType) {
        switch (decoderType) {
            case DecoderType.TGCN:
                return selectTGCNBySkeletonType(skeletonType);
            case DecoderType.RNN:
                return selectRNNBySkeletonType(skeletonType);
            case DecoderType.GRU:
                return selectGRUBySkeletonType(skeletonType);
            case DecoderType.MARKOV:
                return stochasticSystemFactory.createHiddenMarkovModel();
        }

        throw new RuntimeException("WRONG DECODER TYPE");
    }
}
