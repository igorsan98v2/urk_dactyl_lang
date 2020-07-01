package com.ygs.ukraniansignrecog.layouts.ui.vizualization;

import com.ygs.ukraniansignrecog.layouts.model.logic.io.OutputSignal;

public class Visualizer {
    public void  render(OutputSignal signal){
        System.out.print("visualiated singal:");
        signal.log();
    }
}
