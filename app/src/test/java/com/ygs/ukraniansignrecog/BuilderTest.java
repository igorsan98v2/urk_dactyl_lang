package com.ygs.ukraniansignrecog;

import com.google.gson.Gson;
import com.ygs.ukraniansignrecog.annotation.DatasetType;
import com.ygs.ukraniansignrecog.annotation.DecoderType;
import com.ygs.ukraniansignrecog.annotation.LocalType;
import com.ygs.ukraniansignrecog.annotation.SkeletonType;
import com.ygs.ukraniansignrecog.layouts.model.logic.game.Director;
import com.ygs.ukraniansignrecog.layouts.model.logic.game.builders.AlphabetGameBuilder;
import com.ygs.ukraniansignrecog.layouts.model.logic.game.builders.PairGameBuilder;
import com.ygs.ukraniansignrecog.layouts.model.logic.game.impl.AlphabetGame;
import com.ygs.ukraniansignrecog.layouts.model.logic.game.impl.PairGame;
import com.ygs.ukraniansignrecog.layouts.model.network.UpdateSignDataSetRequest;

import org.junit.Test;


import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class BuilderTest {
    @Test
    public void gameBuilders(){
        AlphabetGameBuilder alphabetGameBuilder = new AlphabetGameBuilder();
        PairGameBuilder pairGameBuilder = new PairGameBuilder();
        AlphabetGame game = null;
        PairGame pairGame = null;
        Director director = new Director();

        int err = director.makeAlphabetGame(alphabetGameBuilder);
        if(err == 0){
            game = alphabetGameBuilder.getResult();
            game.play();
        }
        err = director.makePairGame(pairGameBuilder);
        if(err == 0){
            pairGame = pairGameBuilder.getResult();
            pairGame.play();
        }
        assertTrue(pairGame !=null && game !=null);

    }
}
