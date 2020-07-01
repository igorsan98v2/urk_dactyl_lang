package com.ygs.ukraniansignrecog.layouts.model.logic.game.builders;

import com.ygs.ukraniansignrecog.layouts.model.logic.decoderMethods.CardDecoder;
import com.ygs.ukraniansignrecog.layouts.model.logic.decoderMethods.Decoder;
import com.ygs.ukraniansignrecog.layouts.model.logic.decoderMethods.DecoderMethod;
import com.ygs.ukraniansignrecog.layouts.model.logic.game.RuleChecker;
import com.ygs.ukraniansignrecog.layouts.model.logic.game.impl.PairGame;
import com.ygs.ukraniansignrecog.layouts.model.logic.statistic.Statistic;

public class PairGameBuilder implements Builder {
    PairGame game = new PairGame();

    @Override
    public boolean setStatistic(Statistic statistic) {
        game.setStatistic(statistic);
        return  true;
    }

    @Override
    public boolean setDecoderMethod(DecoderMethod method) {
        if(game.getDecoder() == null) {
            return false;
        }
        game.getDecoder().setMethod(method);
        return true;
    }

    @Override
    public boolean setDecoder(Decoder decoder) {
        try {
            CardDecoder cardDecoder = (CardDecoder) decoder;
            game.setDecoder(cardDecoder);
        }
        catch (ClassCastException e){
            return false;
        }
        return true;
    }

    @Override
    public boolean setRuleChecker(RuleChecker ruleChecker) {
        game.setChecker(ruleChecker);
        return true;
    }

    @Override
    public void reset() {
        game = new PairGame();
    }

    public PairGame getResult(){
        return  game;
    }

}
