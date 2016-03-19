package de.denphi.kuluzu.game;

/**
 * Created by Phil on 18.03.2016.
 */
public class Levelgenerator {

    int currentLevel;
    int currentPart;
    float currentProbality;

    public Levelgenerator(int currentLevel, int currentPart, float currentProbality){
        this.currentLevel = currentLevel;
        this.currentPart = currentPart;
        this.currentProbality = currentProbality;

    }
    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    public int getCurrentPart() {
        return currentPart;
    }

    public void setCurrentPart(int currentPart) {
        this.currentPart = currentPart;
    }

    public float getCurrentProbality() {
        return currentProbality;
    }

    public void setCurrentProbality(float currentProbality) {
        this.currentProbality = currentProbality;
    }

}
