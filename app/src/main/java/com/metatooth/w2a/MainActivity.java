package com.metatooth.w2a;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import static android.graphics.Color.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String starting;
        starting = new String("starting" );

        try {
            LinearLayout layout = (LinearLayout) findViewById( R.id.linearLayout );
            layout.removeAllViews();

            TableRow tr = new TableRow(this );

            for (int i = 0; i < starting.length(); i++) {
                char c = starting.charAt( i );
                Log.d("main", " [o] c is " + String.valueOf(c) );

                TextView b = new TextView(this );
                b.setText( String.valueOf(c) );
                b.setPadding(10, 0, 0, 0 );
                b.setTextSize(30);
                b.setTextColor(BLUE);
                tr.addView( b );
            }

            layout.addView(tr);

        } catch (Exception e) {
            Log.e("main", " [e] exception caught " + e.toString());
        }
    }
}
