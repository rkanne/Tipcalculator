package com.example.apps.tipcalculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText amt = (EditText) findViewById(R.id.amt);

        final TextView result1 = (TextView) findViewById(R.id.tip1);
        final TextView result2 = (TextView) findViewById(R.id.tip2);

        final TextView total1 = (TextView) findViewById(R.id.total1);
        final TextView total2 = (TextView) findViewById(R.id.total2);

        Button calculate = (Button) findViewById(R.id.button);
        calculate.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                double amount = 0;
                double tip_cal15 = 0;
                double tip_cal18 = 0;
                double total_cal15 = 0;
                double total_cal18 = 0;

                amount = Double.parseDouble(amt.getText().toString());
                tip_cal15 = (amount * 15) / 100;
                tip_cal18 = (amount * 18) / 100;
                total_cal15 = (amount+tip_cal15);
                total_cal18 = (amount+tip_cal18);


                result1.setText("$"+ Double.toString(tip_cal15));
                result2.setText("$"+ Double.toString(tip_cal18));
                total1.setText("$"+ Double.toString(total_cal15));
                total2.setText("$"+ Double.toString(total_cal18));


            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
