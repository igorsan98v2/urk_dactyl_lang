package com.ygs.ukraniansignrecog.layouts.model.logic.game.builders;

import com.ygs.ukraniansignrecog.layouts.model.logic.decoderMethods.DactylDecoder;
import com.ygs.ukraniansignrecog.layouts.model.logic.decoderMethods.Decoder;
import com.ygs.ukraniansignrecog.layouts.model.logic.decoderMethods.DecoderMethod;
import com.ygs.ukraniansignrecog.layouts.model.logic.game.RuleChecker;
import com.ygs.ukraniansignrecog.layouts.model.logic.game.impl.AlphabetGame;
import com.ygs.ukraniansignrecog.layouts.model.logic.statistic.Statistic;

public class AlphabetGameBuilder implements Builder {
    AlphabetGame game = new AlphabetGame();

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
            DactylDecoder dactylDecoder = (DactylDecoder) decoder;
            game.setDecoder(dactylDecoder);
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
        game = new AlphabetGame();
    }

    public AlphabetGame getResult(){
        return  game;
    }
}
