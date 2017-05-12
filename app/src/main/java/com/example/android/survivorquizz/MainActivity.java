package com.example.android.survivorquizz;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    MediaPlayer successPlay;
    MediaPlayer failPlay;

    int rightAnswers;
    boolean isSnack, isPool, isTable, isPokemon, isKit, isBoy, isMom, isCut, isSkinnyDipping, isSpace, isAttack, isWay, isLanguage,
            isSelfie,isRainbow;

    CheckBox Kit, Boy, Mom, Cut,
            Attack, Way, Language, Selfie;

    RadioButton Talk, Run, Snack, Sing,
            Bunker, Pool, Candy, Wait,
            Comic, Chair, Table, Sunscreen,
            Pokemon, Pizza, Strawberry, Shop,
            Igloo, Search, Polar, SkinnyDipping,
            Space, Suit, Towel, Nothing,
            Scream, Lolcats, Back, Rainbow;
    EditText veggie;
    String vegetable;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Question 1
        Talk = (RadioButton) findViewById(R.id.questionOne_radio_button1);
        Run = (RadioButton) findViewById(R.id.questionOne_radio_button2);
        Snack = (RadioButton) findViewById(R.id.questionOne_radio_button3);
        Sing = (RadioButton) findViewById(R.id.questionOne_radio_button4);

        //Question 2
        Bunker = (RadioButton)findViewById(R.id.questionTwo_radio_button1);
        Pool = (RadioButton)findViewById(R.id.questionTwo_radio_button2);
        Candy = (RadioButton)findViewById(R.id.questionTwo_radio_button3);
        Wait = (RadioButton)findViewById(R.id.questionTwo_radio_button4);

        //Question 3
        Comic = (RadioButton)findViewById(R.id.questionThree_radio_button1);
        Chair = (RadioButton)findViewById(R.id.questionThree_radio_button2);
        Table = (RadioButton)findViewById(R.id.questionThree_radio_button3);
        Sunscreen = (RadioButton)findViewById(R.id.questionThree_radio_button4);

        //Question 4
        Pokemon = (RadioButton) findViewById(R.id.questionFour_radio_button1);
        Pizza = (RadioButton) findViewById(R.id.questionFour_radio_button2);
        Strawberry = (RadioButton) findViewById(R.id.questionFour_radio_button3);
        Shop = (RadioButton) findViewById(R.id.questionFour_radio_button4);

        //Question 5
        Kit = (CheckBox)findViewById(R.id.questionFive_Checkbox1);
        Boy = (CheckBox)findViewById(R.id.questionFive_Checkbox2);
        Mom = (CheckBox)findViewById(R.id.questionFive_Checkbox3);
        Cut = (CheckBox)findViewById(R.id.questionFive_Checkbox4);

        //Question 6
        Igloo = (RadioButton)findViewById(R.id.questionSix_radio_button1);
        Search = (RadioButton)findViewById(R.id.questionSix_radio_button2);
        Polar = (RadioButton)findViewById(R.id.questionSix_radio_button3);
        SkinnyDipping = (RadioButton)findViewById(R.id.questionSix_radio_button4);

        //Question 7
        Space = (RadioButton)findViewById(R.id.questionSeven_radio_button1);
        Suit = (RadioButton)findViewById(R.id.questionSeven_radio_button2);
        Towel = (RadioButton)findViewById(R.id.questionSeven_radio_button3);
        Nothing = (RadioButton)findViewById(R.id.questionSeven_radio_button4);

        //Question 8
        Attack = (CheckBox)findViewById(R.id.questionEight_Checkbox1);
        Way = (CheckBox)findViewById(R.id.questionEight_Checkbox2);
        Language = (CheckBox)findViewById(R.id.questionEight_Checkbox3);
        Selfie = (CheckBox)findViewById(R.id.questionEight_Checkbox4);

        //Question 9
        veggie = (EditText)findViewById(R.id.questionNine_Edit_Text);

        //Question 10
        Scream = (RadioButton) findViewById(R.id.questionTen_radio_button1);
        Lolcats = (RadioButton) findViewById(R.id.questionTen_radio_button2);
        Back = (RadioButton) findViewById(R.id.questionTen_radio_button3);
        Rainbow = (RadioButton) findViewById(R.id.questionTen_radio_button4);


    }

    /**
     * This method is called when Submit the Answers button is clicked. Checks for right answers and shows result.
     */


    public void checkAnswers(View view) {
        rightAnswers = 0;
        checkQuestionOne();
        checkQuestionTwo();
        checkQuestionThree();
        checkQuestionFour();
        checkQuestionFive();
        checkQuestionSix();
        checkQuestionSeven();
        checkQuestionEight();
        checkQuestionNine();
        checkQuestionTen();
       if (rightAnswers <=10){
           Toast.makeText(this, rightAnswers + " of 11 are correct, you failed, take the quiz again!", Toast.LENGTH_LONG).show();
           failPlay = MediaPlayer.create(MainActivity.this,R.raw.looser);
           Intent GoToResults = new Intent(this, FailActivity.class);
           failPlay.start();
           startActivity(GoToResults);
       }else{
           Toast.makeText(this, "You succeed, Bear Grylls is very proud of you!", Toast.LENGTH_LONG).show();
           successPlay =  MediaPlayer.create(MainActivity.this,R.raw.clap);
           Intent GoToResults = new Intent(this, SuccessActivity.class);
           successPlay.start();
           startActivity (GoToResults);
       }

    }



    /**
     * This method checks whenever the answer to question one is correct.
     */

    private void checkQuestionOne() {
        isSnack = Snack.isChecked();
        if (isSnack) {
            rightAnswers = rightAnswers + 1;
        }
    }

    /**
     * This method checks whenever the answer to question two is correct.
     */

    private void checkQuestionTwo() {
        isPool = Pool.isChecked();
        if (isPool) {
            rightAnswers++;
        }
    }

    /**
     * This method checks whenever the answer to question three is correct.
     */

    private void checkQuestionThree() {
        isTable = Table.isChecked();
        if (isTable) {
          rightAnswers++;
        }
    }

    /**
     * This method checks whenever the answer to question four is correct.
     */

    private void checkQuestionFour() {
        isPokemon = Pokemon.isChecked();
        if (isPokemon) {
            rightAnswers++;
        }
    }

    /**
     * This method checks whenever the answer to question five is correct.
     */

    private void checkQuestionFive() {
        isKit = Kit.isChecked();
        isBoy = Boy.isChecked();
        isMom = Mom.isChecked();
        isCut = Cut.isChecked();
        if (!isKit && isBoy && isMom && !isCut) {
            rightAnswers++;
            rightAnswers++;
        }
    }

    /**
     * This method checks whenever the answer to question six is correct.
     */

    private void checkQuestionSix() {
        isSkinnyDipping = SkinnyDipping.isChecked();
        if (isSkinnyDipping) {
            rightAnswers++;
        }
    }

    /**
     * This method checks whenever the answer to question seven is correct.
     */

    private void checkQuestionSeven() {
        isSpace = Space.isChecked();
        if (isSpace) {
            rightAnswers++;
        }
    }

    /**
     * This method checks whenever the answer to question eight is correct.
     */

    private void checkQuestionEight() {
        isAttack = Attack.isChecked();
        isWay = Way.isChecked();
        isLanguage = Language.isChecked();
        isSelfie = Selfie.isChecked();
        if (!isAttack && !isWay && isLanguage && isSelfie) {
            rightAnswers++;
            rightAnswers++;
        }
    }

    /**
     * This method checks whenever the answer to question nine is correct.
     */

    private void checkQuestionNine() {
        vegetable = veggie.getText().toString();
        if (veggie.getText().toString().equalsIgnoreCase("Cucumber")) {
            rightAnswers++;
        }
    }

    /**
     * This method checks whenever the answer to question ten is correct.
     */

    private void checkQuestionTen() {
        isRainbow = Rainbow.isChecked();
        if (isRainbow) {
            rightAnswers++;
        }
    }

}



