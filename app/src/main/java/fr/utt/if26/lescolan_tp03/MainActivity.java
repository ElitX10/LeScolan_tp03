package fr.utt.if26.lescolan_tp03;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//    private String message = "Bonjour IF16";


    /**
     * blabla
     * @author moi
     * @version 1.0
     * @return nop
     * @param savedInstanceState
     *
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView tx = (TextView) findViewById(R.id.textview);
        tx.setText(getResources().getString(R.string.message));

        Button bt = (Button) findViewById(R.id.buttonChangeCoul);
        bt.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                tx.setBackgroundColor(Color.RED);
            }
        });
    }
}
