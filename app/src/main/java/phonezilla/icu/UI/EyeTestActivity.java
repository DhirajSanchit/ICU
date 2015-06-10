package phonezilla.icu.UI;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;

import java.util.Random;

import phonezilla.icu.R;




public class EyeTestActivity extends Activity {

    Intent mIntent = getIntent();
    public int wrongCount = 0;
    public String currentAnswer;
    public Random randomGenerator = new Random();
    Button nextButton = (Button) findViewById(R.id.nextButton);
    RadioButton radioButton = (RadioButton)findViewById(R.id.radioButton);
    RadioButton radioButton2 = (RadioButton)findViewById(R.id.radioButton2);
    RadioButton radioButton3 = (RadioButton)findViewById(R.id.radioButton3);
    ImageView imageQuestionView = (ImageView)findViewById(R.id.imageView);

    public String[] answers ={
            "↓",
            "↑",
            "←",
            "→"
  };

    public String goodAnswer = answers[0];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eye_test);


        nextButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                continuationCheck();
                checkAnswer(currentAnswer);
                int pageId;
                pageId = 0;
                while (pageId < 5) {
                    pageId++;
                }

                switch (pageId) {
                    case 1:
                        imageQuestionView.setImageResource(R.drawable.symbolboven);
                        int answerNumber = 1;
                        goodAnswer = answers[answerNumber];
                        break;

                    case 2:
                        imageQuestionView.setImageResource(R.drawable.symbollinks);
                        answerNumber = 2;
                        goodAnswer = answers[answerNumber];
                        break;

                    case 3:
                        imageQuestionView.setImageResource(R.drawable.symbolrechts);
                        answerNumber = 3;
                        goodAnswer = answers[answerNumber];
                        break;

                    case 4:
                        finish();
                        break;
                }


            }
        });
    }



            private void continuationCheck() {
        if(wrongCount > 1){
            finish();
        }
    }

    private void checkAnswer(String currentAnswer) {
        if (!currentAnswer.equals(goodAnswer)){
            wrongCount++;
        }

    }


    public String getAnswer(){
        return "";
    }

    public void setWrongAnswer(){


    }

    public void setCurrentAnswer(){

    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_eye_test, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
