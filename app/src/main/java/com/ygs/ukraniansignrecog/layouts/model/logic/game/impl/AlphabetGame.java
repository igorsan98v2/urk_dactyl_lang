package com.ygs.ukraniansignrecog.layouts.model.logic.game.impl;

import com.ygs.ukraniansignrecog.layouts.model.logic.decoderMethods.DactylDecoder;

import com.ygs.ukraniansignrecog.layouts.model.logic.game.DactylGame;
import com.ygs.ukraniansignrecog.layouts.model.logic.game.RuleChecker;
import com.ygs.ukraniansignrecog.layouts.model.logic.statistic.Statistic;

public class AlphabetGame implements DactylGame {


    private Statistic statistic;
    private DactylDecoder decoder;
    private RuleChecker checker;

    public Statistic getStatistic() {
        return statistic;
    }

    public void setStatistic(Statistic statistic) {
        this.statistic = statistic;
    }

    public DactylDecoder getDecoder() {
        return decoder;
    }

    public void setDecoder(DactylDecoder decoder) {
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

    @Override
    public void onDactylRecognizedSuccess() {

    }

    @Override
    public void onDactylRecognizedFailure() {

    }
}
