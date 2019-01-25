package com.londonappbrewery.destini;

public class control {
    int id_story = R.string.T1_Story;
    int state=1;
    int id_bbutton = R.string.T1_Ans2;
    int id_btop = R.string.T1_Ans1;

    public int getId_story() {
        return id_story;
    }

    public void setId_story(int id_story) {
        this.id_story = id_story;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public int getId_bbutton() {
        return id_bbutton;
    }

    public void setId_bbutton(int id_bbutton) {
        this.id_bbutton = id_bbutton;
    }

    public int getId_btop() {
        return id_btop;
    }

    public void setId_btop(int id_btop) {
        this.id_btop = id_btop;
    }

    public void update(boolean test){
        switch (state){
            case 1: if(test){
                state = 3;
                id_story = R.string.T3_Story;
                id_bbutton = R.string.T3_Ans2;
                id_btop = R.string.T3_Ans1;
            }
            else{
                state = 2;
                id_story = R.string.T2_Story;
                id_btop = R.string.T2_Ans1;
                id_bbutton = R.string.T2_Ans2;
            }
            break;
            case 2: if(test){
                state = 3;
                id_story = R.string.T3_Story;
                id_bbutton = R.string.T3_Ans2;
                id_btop = R.string.T3_Ans1;
            }
            else{
                state = 4;
                id_story = R.string.T4_End;
            }
            break;
            case 3: if(test){
                state = 6;
                id_story = R.string.T6_End;
            }
            else{
                state = 5;
                id_story = R.string.T5_End;
            }
            break;
        }

    }
}
