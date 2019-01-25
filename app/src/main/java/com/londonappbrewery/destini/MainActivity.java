package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    Button btop;
    Button bbutton;
    TextView text;
    control display_value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btop = (Button) findViewById(R.id.buttonTop);
        bbutton = (Button) findViewById(R.id.buttonBottom);
        text = (TextView) findViewById(R.id.storyTextView);
        display_value = new control();
        if (savedInstanceState != null){
            display_value.setId_bbutton(savedInstanceState.getInt("bbutton_id"));
            display_value.setId_btop(savedInstanceState.getInt("btop_id"));
            display_value.setId_story(savedInstanceState.getInt("text"));
            display_value.setState(savedInstanceState.getInt("state"));
        }
        if(display_value.getState()>3){
            btop.setVisibility(View.INVISIBLE);
            bbutton.setVisibility(View.INVISIBLE);
        }

        text.setText(display_value.getId_story());
        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables
        btop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display_value.update(true);
                text.setText(display_value.getId_story());
                if(display_value.getState()>3){
                    btop.setVisibility(View.INVISIBLE);
                    bbutton.setVisibility(View.INVISIBLE);
                }
            }
        });
        bbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                display_value.update(false);
                text.setText(display_value.getId_story());
                btop.setText(display_value.getId_btop());
                bbutton.setText(display_value.getId_bbutton());
                if(display_value.getState()>3){
                    btop.setVisibility(View.INVISIBLE);
                    bbutton.setVisibility(View.INVISIBLE);
                }
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:




        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button;
    }
    @Override
    public void onSaveInstanceState(Bundle saveInstantState){
        super.onSaveInstanceState(saveInstantState);
        saveInstantState.putInt("btop_id",display_value.getId_btop());
        saveInstantState.putInt("bbutton_id",display_value.getId_bbutton());
        saveInstantState.putInt("state",display_value.getState());
        saveInstantState.putInt("text",display_value.getId_story());
    }
}
