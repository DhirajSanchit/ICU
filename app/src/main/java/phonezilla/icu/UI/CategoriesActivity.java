package phonezilla.icu.UI;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import phonezilla.icu.R;


public class CategoriesActivity extends Activity {

    //implements View.OnClickListener is needed for the SWITCH thread, when bug is fixed,
    // it will be implemented

    //Initializing private variables for a future onClick method.
    private Button mEyeTestButton;
    private Button mTrafficButton;
    private Button mColorTestButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        //Intent from the mainactivity that brought us here
        Intent intent = getIntent();



        //Assigning the variables to the Views that that exist in the activity_categories.xml
        mEyeTestButton = (Button) findViewById(R.id.eyeTestButton) ;
        mTrafficButton = (Button) findViewById(R.id.trafficButton);
        mColorTestButton = (Button) findViewById(R.id.colorblindButton);


        //Putting clicklisteners on the buttons with intents so that the User is brought to the
        //chosen test.
        mEyeTestButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startEyeTest();
            }
        });

        mTrafficButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTrafficTest();

            }
        });

        mColorTestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startColorTest();
            }
        });

    }


    //Start methods for the other tests;
    private void startEyeTest() {
        Intent eyeTestIntent = new Intent(this, EyeTestActivity.class);
        startActivity(eyeTestIntent);
    }

    private void startTrafficTest() {
        Intent trafficTestIntent = new Intent(this, TrafficTestActivity.class);
        startActivity(trafficTestIntent);
    }

    private void startColorTest() {
        Intent colorTestIntent = new Intent(this, ColorblindTestActivity.class);
        startActivity(colorTestIntent);
    }


    /*
    @Override
    public void onClick(View v) {
        if (v == mEyeTestButton) {
            Intent intent = new Intent(this, EyeTestActivity.class);
            this.startActivity(intent);
        } else if (v == mTrafficButton) {

        } else if (v == mColorTestButton) {

        }
    }

    */

    /*

    //Switch case to avoid code redundancy, trying to fix this bug later
    //For interested, the bug is that the overriding, reading from id wont work,
    // so that the intents activate on the onClicks

    @Override
    public void onClick(View v){

        int id = v.getId();
        switch (id) {
            case R.id.eyeTestButton:
                Intent eyeTestIntent = new Intent(this, EyeTestActivity.class);
                startActivity(eyeTestIntent);
            break;

            case R.id.trafficButton:
                Intent trafficTestIntent = new Intent(this, TrafficTestActivity.class);
                startActivity(trafficTestIntent);
            break;

            case R.id.colorblindButton:
                Intent colorTestIntent = new Intent(this, ColorblindTestActivity.class);
                startActivity(colorTestIntent);
            break;

         }
    }
    */

    /*

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_categories, menu);
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
    */
}
