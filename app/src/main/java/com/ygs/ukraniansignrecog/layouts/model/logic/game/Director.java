package com.ygs.ukraniansignrecog.layouts.model.logic.game;
import com.ygs.ukraniansignrecog.annotation.DecoderType;
import com.ygs.ukraniansignrecog.annotation.SkeletonType;
import com.ygs.ukraniansignrecog.layouts.model.facade.DecoderMethodFacade;
import com.ygs.ukraniansignrecog.layouts.model.logic.decoderMethods.CardDecoder;
import com.ygs.ukraniansignrecog.layouts.model.logic.decoderMethods.DactylDecoder;
import com.ygs.ukraniansignrecog.layouts.model.logic.decoderMethods.DecoderMethod;
import com.ygs.ukraniansignrecog.layouts.model.logic.game.builders.Builder;
import com.ygs.ukraniansignrecog.layouts.model.logic.statistic.Statistic;

public class Director {
    public int makePairGame(Builder builder){
        boolean isSuccessful =  true;

        DecoderMethod model = DecoderMethodFacade.createMethod(DecoderType.MARKOV, SkeletonType.HANDS);

        isSuccessful = builder.setDecoder(new CardDecoder());
        isSuccessful = isSuccessful &&  builder.setDecoderMethod(model);
        isSuccessful = isSuccessful && builder.setStatistic(new Statistic());
        isSuccessful = isSuccessful && builder.setRuleChecker(new RuleChecker());

        if(isSuccessful) {
            return 0;
        }
        else return -1;
    }

    public int makeAlphabetGame(Builder builder){
        boolean isSuccessful =  true;

        DecoderMethod model = DecoderMethodFacade.createMethod(DecoderType.RNN, SkeletonType.HANDS);
        isSuccessful = builder.setDecoder(new DactylDecoder());
        isSuccessful = isSuccessful &&builder.setDecoderMethod(model);
        isSuccessful = isSuccessful && builder.setStatistic(new Statistic());
        isSuccessful = isSuccessful && builder.setRuleChecker(new RuleChecker());

        if(isSuccessful) {
            return 0;
        }
        else return -1;
    }


}
