package org.fasttrackit;

public class RecreationActivity {
    private String RecreationActivityName;
    private boolean fun;

    public RecreationActivity(String recreationActivityName) {
        RecreationActivityName = recreationActivityName;
    }

//getter

    public String getRecreationActivityName() {
        return RecreationActivityName;
    }

    public boolean isFun() {
        return fun;
    }

    //setter


    public void setRecreationActivityName(String recreationalActivityName) {
        RecreationActivityName = recreationalActivityName;
    }

    public void setFun(boolean fun) {
        this.fun = fun;
    }
}