package com.ygs.ukraniansignrecog.layouts.model.logic.game;

import com.ygs.ukraniansignrecog.layouts.model.logic.statistic.Statistic;

public  interface Game {
    void play();
    Statistic collectStatistic();
}
