package com.ygs.ukraniansignrecog.layouts.model.logic.decoder;

import com.ygs.ukraniansignrecog.layouts.model.logic.decoderMethods.DecoderMethod;
import com.ygs.ukraniansignrecog.layouts.model.logic.io.InputSignal;
import com.ygs.ukraniansignrecog.layouts.model.logic.io.OutputSignal;
import com.ygs.ukraniansignrecog.layouts.ui.vizualization.Visualizer;

import java.util.stream.Stream;

import androidx.core.util.Pair;

public class SignDecoder extends Decoder {
    private DecoderMethod method;
    private Visualizer visualizer;

    public SignDecoder(DecoderMethod method) {
        this.method = method;
        visualizer = new Visualizer();
    }

    /**
     * correct output signal by historical context
     */
    private OutputSignal analyzeHistory(InputSignal signal, OutputSignal suspected) {
        if (history.size() % 3 == 0) {
            return new OutputSignal() {
                @Override
                public void log() {
                    System.out.println("output corrected by historical context `couse" + history.size());
                }
            };
        }
        return suspected;
    }

    public void visualate() {
        visualizer.render(history.get(history.size() - 1).second);
    }

    @Override
    public OutputSignal evaluate(InputSignal signal) {
        OutputSignal output = method.evaluate(signal);
        output = analyzeHistory(signal, output);
        history.add(new Pair<>(signal, output));

        return output;
    }
}
