package com.ygs.ukraniansignrecog;

import com.ygs.ukraniansignrecog.annotation.DecoderType;
import com.ygs.ukraniansignrecog.annotation.SkeletonType;
import com.ygs.ukraniansignrecog.layouts.model.facade.DecoderMethodFacade;
import com.ygs.ukraniansignrecog.layouts.model.logic.decoderMethods.DecoderMethod;
import com.ygs.ukraniansignrecog.layouts.model.logic.io.InputSignal;

import org.junit.Test;


import java.util.stream.Stream;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

public class AbstractFactoryTest {
    @Test
    public void createDecoders() {
        DecoderMethod[] decoders = {DecoderMethodFacade.createMethod(DecoderType.TGCN, SkeletonType.HANDS),
                DecoderMethodFacade.createMethod(DecoderType.RNN, SkeletonType.HANDS),
                DecoderMethodFacade.createMethod(DecoderType.GRU, SkeletonType.HANDS),
                DecoderMethodFacade.createMethod(DecoderType.TGCN, SkeletonType.FULL_BODY),
                DecoderMethodFacade.createMethod(DecoderType.RNN, SkeletonType.FULL_BODY),
                DecoderMethodFacade.createMethod(DecoderType.GRU, SkeletonType.FULL_BODY),
                DecoderMethodFacade.createMethod(DecoderType.TGCN, SkeletonType.HEAD_AND_HANDS),
                DecoderMethodFacade.createMethod(DecoderType.RNN, SkeletonType.HEAD_AND_HANDS),
                DecoderMethodFacade.createMethod(DecoderType.GRU, SkeletonType.HEAD_AND_HANDS),
                DecoderMethodFacade.createMethod(DecoderType.MARKOV, SkeletonType.ARMS)
        };
        Stream.of(decoders).forEach(decoder -> decoder.evaluate(new InputSignal() {
        }).log());
        assertTrue(true);
    }
}

