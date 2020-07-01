package com.ygs.ukraniansignrecog.layouts.model.logic.decoder;

import com.ygs.ukraniansignrecog.layouts.model.logic.io.InputSignal;
import com.ygs.ukraniansignrecog.layouts.model.logic.io.OutputSignal;

import java.util.ArrayList;
import java.util.List;

import androidx.core.util.Pair;

abstract public class Decoder {
    protected List<Pair<InputSignal, OutputSignal>> history = new ArrayList<>();

    /**decodes input signal to output signal */
    public abstract OutputSignal evaluate(InputSignal signal);
}
