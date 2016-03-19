package de.denphi.kuluzu.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.utils.Array;

import java.util.Random;

import de.denphi.kuluzu.Kuluzu;
import de.denphi.kuluzu.gameobjects.Animal;

/**
 * Created by Phil and Dennis on 18.03.2016.
 */
public class Round {

    private int shownAnimals;
    private int answerAnimals;


    /*
    currentAnimals - all animals currently choosen
    currentAnswers - all animals choosen as answer (opposite form currentAnimals + one completly equal or completly disjunct)

    currentNames - all names of the currently choosen Animals
    currentCollors - all colors of the currently choosen Animals

    dcurrentNames- opposite names of the currently choosen names -> Answer names
    dcurrentColors - opposite colors of the currently choosen names -> answer colors to mix them
     */

    Array<String> currentNames = new Array<String>();
    Array<String> currentColors = new Array<String>();
    Array<String> dcurrentNames = new Array<String>();
    Array<String> dcurrentColors = new Array<String>();
    Array<String> disjunctArrayAnimals = new Array<String>();
    Array<String> disjunctArrayColors = new Array<String>();

    private Rectangle viewport = new Rectangle(0, Gdx.graphics.getHeight()*(float) 0.45, Gdx.graphics.getWidth(), Gdx.graphics.getHeight()*(float) 0.45);

    private Array<Animal> currentAnimals = new Array<Animal>();
    private Array<Animal> currentAnswers = new Array<Animal>();

    public Round(int shownAnimals, int answerAnimals, Texture background){
        this.shownAnimals=shownAnimals;
        this.answerAnimals=answerAnimals;
    }

    public void drawEnclosure(){

    }


    public int getShownAnimals() {
        return shownAnimals;
    }

    public void setShownAnimals(int shownAnimals) {
        this.shownAnimals = shownAnimals;
    }

    public int getAnswerAnimals() {
        return answerAnimals;
    }

    public void setAnswerAnimals(int answerAnimals) {
        this.answerAnimals = answerAnimals;
    }

    public boolean isInViewport(Rectangle viewport, Animal animal){
        return animal.getX()<=viewport.getWidth()-animal.getWidth()&&animal.getY()<=viewport.getHeight()-animal.getHeight()&&animal.getY()>=viewport.getY();
    }

    public void createAnimals(){
        Random r =  new Random();

        int randomA;
        int randomC;
        for(int i=0; i< shownAnimals; i++) {
            randomA = r.nextInt(Kuluzu.animalArray.size);
            randomC = r.nextInt(Kuluzu.colorArray.size);

                while (currentNames.contains(Kuluzu.animalArray.get(randomA), false)){
                    randomA = r.nextInt(Kuluzu.animalArray.size);
                }
                while (currentColors.contains(Kuluzu.colorArray.get(randomC), false)){
                    randomC = r.nextInt(Kuluzu.colorArray.size);
                }

                currentNames.add(Kuluzu.animalArray.get(randomA));
                currentColors.add(Kuluzu.colorArray.get(randomC));

                currentAnimals.add(new Animal(new Texture("badlogic.jpg"),50, 50, Kuluzu.animalArray.get(randomA), "Wald", Kuluzu.colorArray.get(randomC)));

            System.out.println(currentAnimals.get(i).getName() + "  " + currentAnimals.get(i).getTcolor());
        }
        disjunctArrayAnimals.addAll(Kuluzu.animalArray);
        disjunctArrayAnimals.removeAll(currentNames, false);
        disjunctArrayColors.addAll(Kuluzu.colorArray);
        disjunctArrayColors.removeAll(currentColors, false);

        System.out.println(disjunctArrayAnimals.toString(","));
        System.out.println(disjunctArrayColors.toString(","));
    }
    public void createDisjunctAnwers(int da){
        Random r =  new Random();
        int randomCurrent, randomDisjunct;
        System.out.println("------------");
        for(int i=0; i< da; i++) {
            //vorhandenen Farben mit nicht vorhandenen Tieren
            randomCurrent = r.nextInt(currentNames.size);
            randomDisjunct = r.nextInt(disjunctArrayAnimals.size);
            if (i%2==0){
                while(dcurrentColors.contains(disjunctArrayColors.get(randomDisjunct),false)){
                    randomDisjunct = r.nextInt(disjunctArrayAnimals.size);
                }

                while(dcurrentNames.contains(currentNames.get(randomCurrent),false)){
                    randomCurrent = r.nextInt(currentNames.size);
                }
                dcurrentColors.add(disjunctArrayColors.get(randomDisjunct));
                dcurrentNames.add(currentNames.get(randomCurrent));
                currentAnswers.add(new Animal(new Texture("badlogic.jpg"),50, 50, currentNames.get(randomCurrent), "Wald", disjunctArrayColors.get(randomDisjunct)));
            }
            else{
                while(dcurrentNames.contains(disjunctArrayAnimals.get(randomDisjunct),false)){
                    randomDisjunct = r.nextInt(disjunctArrayAnimals.size);
                }

                while(dcurrentColors.contains(currentColors.get(randomCurrent),false)){
                    randomCurrent = r.nextInt(currentNames.size);
                }
                dcurrentColors.add(currentColors.get(randomCurrent));
                dcurrentNames.add(disjunctArrayAnimals.get(randomDisjunct));
                currentAnswers.add(new Animal(new Texture("badlogic.jpg"),50, 50, disjunctArrayAnimals.get(randomDisjunct), "Wald", currentColors.get(randomCurrent)));
            }


            System.out.println(currentAnswers.get(i).getName() + "  " + currentAnswers.get(i).getTcolor());
        }

    }
}
