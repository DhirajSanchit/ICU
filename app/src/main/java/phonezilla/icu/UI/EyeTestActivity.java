package phonezilla.icu.UI;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.Toast;

import phonezilla.icu.R;




 public class EyeTestActivity extends Activity {

    public int wrongCount = 0;
    public String[] answers ={
            "↓",
            "↑",
            "←",
            "→"
    };
    public String goodAnswer = answers[0];
    public String currentAnswer = answers[0];




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_test);

        Button nextButton = (Button) findViewById(R.id.nextButton);
        final RadioButton radioButton = (RadioButton)findViewById(R.id.radioButton);
        final RadioButton radioButton2 = (RadioButton)findViewById(R.id.radioButton2);
        final RadioButton radioButton3 = (RadioButton)findViewById(R.id.radioButton3);
        final ImageView imageQuestionView = (ImageView)findViewById(R.id.imageView);



        nextButton.setOnClickListener(new View.OnClickListener() {
            int pageId = 0;
            @Override
            public void onClick(View v) {

                continuationCheck();
                //checkAnswer(currentAnswer);
                    while (pageId < 5) {




                     switch (pageId) {
                        case 1:
                            imageQuestionView.setImageResource(R.drawable.symbolboven);
                            int answerNumber = 1;
                            goodAnswer = answers[answerNumber];
                            radioButton.setText(goodAnswer);
                            //setWrongAnswers(answerNumber);

                            break;

                        case 2:
                            imageQuestionView.setImageResource(R.drawable.symbollinks);
                            answerNumber = 2;
                            goodAnswer = answers[answerNumber];
                            radioButton3.setText(goodAnswer);
                            //setWrongAnswers(answerNumber);
                            break;

                        case 3:
                            imageQuestionView.setImageResource(R.drawable.symbolrechts);
                            answerNumber = 3;
                            goodAnswer = answers[answerNumber];
                            radioButton2.setText(goodAnswer);
                            //setWrongAnswers(answerNumber);
                            break;

                        case 4:
                            finish();
                            break;

                        default:
                            Toast toast = null;
                            toast.makeText(EyeTestActivity.this, "it went default", Toast.LENGTH_SHORT).show();
                            break;
                     }

                        pageId++;
                }

            }
        });
    }

    private void continuationCheck() {
        if(wrongCount > 4){
            finish();
        }
    }

/*
    private void checkAnswer(String currentAnswer) {
        if (!currentAnswer.equals(goodAnswer) || null){
            wrongCount++;
        }

    }*/




    public void setWrongAnswers(int number){

        int wrongId1;
        int wrongId2;
        String wrongAnswer1;
        String wrongAnswer2;

        switch (number){
            case 3:
                wrongId1 = number -1;
                wrongId2 = number -2;
                wrongAnswer1 = answers[wrongId1];
                wrongAnswer2 = answers[wrongId2];





            case 0:
                wrongId1 = number + 1;
                wrongId2 = number + 2;
                wrongAnswer1 = answers[wrongId1];
                wrongAnswer2 = answers[wrongId2];

            default:
                wrongId1 = number-1;
                wrongId2 = number+1;
                wrongAnswer1 = answers[wrongId1];
                wrongAnswer2 = answers[wrongId2];


        }





    }

    public void setCurrentAnswer(){

    }
}


