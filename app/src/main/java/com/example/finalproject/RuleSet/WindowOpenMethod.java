package com.example.finalproject.RuleSet;

import com.example.finalproject.Method.RuleBase;

public class WindowOpenMethod extends RuleBase {

    private String html;
    private boolean hypothesis = false;

    public WindowOpenMethod(String url) {
        super(url);
        html = getHtml();
    }

    public void rule(){

        if(html.contains("window.open()")){
            setHypothesis(true);
        }
    }

    public boolean isHypothesis() {
        return hypothesis;
    }

    public void setHypothesis(boolean hypothesis) {
        this.hypothesis = hypothesis;
    }
}




