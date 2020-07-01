package com.ygs.ukraniansignrecog.layouts.model.logic.game.impl;

import com.ygs.ukraniansignrecog.layouts.model.logic.decoderMethods.CardDecoder;
import com.ygs.ukraniansignrecog.layouts.model.logic.game.Game;
import com.ygs.ukraniansignrecog.layouts.model.logic.game.RuleChecker;
import com.ygs.ukraniansignrecog.layouts.model.logic.statistic.Statistic;

public class PairGame implements Game {
    private Statistic statistic;
    private CardDecoder decoder;
    private RuleChecker checker;

    public Statistic getStatistic() {
        return statistic;
    }

    public void setStatistic(Statistic statistic) {
        this.statistic = statistic;
    }

    public CardDecoder getDecoder() {
        return decoder;
    }

    public void setDecoder(CardDecoder decoder) {
        this.decoder = decoder;
    }

    public RuleChecker getChecker() {
        return checker;
    }

    public void setChecker(RuleChecker checker) {
        this.checker = checker;
    }

    @Override
    public void play() {
        System.out.println("Played in " + this.getClass().getSimpleName());
    }

    @Override
    public Statistic collectStatistic() {
        return null;
    }
}
