package com.ygs.ukraniansignrecog.layouts.model.logic.decoderMethods;

import com.ygs.ukraniansignrecog.annotation.DecoderType;

public interface DecoderProvider {
    DecoderMethod provide(@DecoderType int decoderCode);
}
