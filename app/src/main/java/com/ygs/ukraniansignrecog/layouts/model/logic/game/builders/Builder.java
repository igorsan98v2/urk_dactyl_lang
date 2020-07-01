package com.ygs.ukraniansignrecog.layouts.model.logic.game.builders;

import com.ygs.ukraniansignrecog.layouts.model.logic.decoderMethods.Decoder;
import com.ygs.ukraniansignrecog.layouts.model.logic.decoderMethods.DecoderMethod;
import com.ygs.ukraniansignrecog.layouts.model.logic.game.RuleChecker;
import com.ygs.ukraniansignrecog.layouts.model.logic.statistic.Statistic;

public interface Builder {
    boolean setStatistic(Statistic statistic);
    boolean setDecoderMethod(DecoderMethod decoder);
    boolean setDecoder(Decoder decoder);
    boolean setRuleChecker(RuleChecker ruleChecker);
    void  reset();
}