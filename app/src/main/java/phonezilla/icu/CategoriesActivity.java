package phonezilla.icu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class CategoriesActivity extends Activity implements View.OnClickListener{


    //Initializing private variables for a future onClick method.
   protected Button mEyeTestButton;
   protected Button mTrafficButton;
   protected Button mColorTestButton;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        //Assigning the variables to the Views that that exist in the activity_categories.xml
        mEyeTestButton = (Button) findViewById(R.id.eyeTestButton) ;
        mTrafficButton = (Button) findViewById(R.id.trafficButton);
        mColorTestButton = (Button) findViewById(R.id.colorblindButton);


        //Putting clicklisteners on the buttons with intents so that the User is brought to the
        //chosen test.
        mEyeTestButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {

            }
        });

        mTrafficButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mColorTestButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

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

    @Override
    public void onClick(View v){

        int id = v.getId();
        switch (id) {
            case R.id.eyeTestButton:
                Intent eyeTestIntent = new Intent(this, EyeTestActivity.class);
                this.startActivity(eyeTestIntent);
            break;

            case R.id.trafficButton:
                Intent trafficTestIntent = new Intent(this, TrafficTestActivity.class);
                this.startActivity(trafficTestIntent);
            break;

            case R.id.colorblindButton:
                Intent colorTestIntent = new Intent(this, ColorblindTestActivity.class);
                this.startActivity(colorTestIntent);
            break;

         }
    }


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
