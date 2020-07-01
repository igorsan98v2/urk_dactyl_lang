package com.ygs.ukraniansignrecog;

import com.ygs.ukraniansignrecog.annotation.DecoderType;
import com.ygs.ukraniansignrecog.annotation.SkeletonType;
import com.ygs.ukraniansignrecog.layouts.model.facade.DecoderMethodFacade;
import com.ygs.ukraniansignrecog.layouts.model.logic.decoder.SignDecoder;
import com.ygs.ukraniansignrecog.layouts.model.logic.decoderMethods.DecoderMethod;
import com.ygs.ukraniansignrecog.layouts.model.logic.io.InputSignal;
import com.ygs.ukraniansignrecog.layouts.model.logic.io.OutputSignal;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AdapterTest {
    @Test
    public void checkAdapter() {

        DecoderMethod method = DecoderMethodFacade.createMethod(DecoderType.RNN, SkeletonType.HANDS);
        DecoderMethod unAdapted = DecoderMethodFacade.createMethod(DecoderType.RNN, SkeletonType.HANDS);
        SignDecoder signDecoder = new SignDecoder(method);
        List<InputSignal> signals = new ArrayList<>(0);
        List<OutputSignal> outputSignals = new ArrayList<>();
        List<OutputSignal> unAdaptedSignals = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            signals.add(new InputSignal() {
                @Override
                public int hashCode() {
                    return super.hashCode();
                }
            });
            outputSignals.add(signDecoder.evaluate(signals.get(i)));
            signDecoder.visualate();
            unAdaptedSignals.add(unAdapted.evaluate(signals.get(i)));
        }
        for (int i = 0; i < 15; i++) {
            System.out.print("Output " + i + " ");
            outputSignals.get(i).log();
            System.out.print("UnAdapted " + i + " ");
            unAdaptedSignals.get(i).log();
        }
        assertFalse(outputSignals.containsAll(unAdaptedSignals));
    }
}
