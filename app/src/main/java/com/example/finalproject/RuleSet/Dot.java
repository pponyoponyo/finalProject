package com.example.finalproject.RuleSet;


import com.example.finalproject.Method.RuleBase;

public class Dot extends RuleBase {

    private String url;
    private boolean hypothesis = false;

    public Dot(String url) {
        super(url);
        this.url = url;
    }

    public boolean isHypothesis() {
        return hypothesis;
    }

    public void setHypothesis(boolean hypothesis) {
        this.hypothesis = hypothesis;
    }

    public void rule(){
        char [] c ;
        c = url.toCharArray();

        for(int i=0; i<c.length-1; i++){
            if(c[i]=='.'&&c[i+1]=='.'){
                setHypothesis(true);
            }
        }
    }

}
