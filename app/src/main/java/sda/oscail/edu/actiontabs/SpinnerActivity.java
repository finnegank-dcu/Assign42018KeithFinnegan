package sda.oscail.edu.actiontabs;

/**
 * Created by keithfinnegan on 1/22/2018.
 */

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

/**
 * SpinnerActivity code adapted from Android developers website
 * SpinnerActivity extends OrderPrescriptionActivity
 * Citation:
 * Class contains code adapted from
 * Ref: https://developer.android.com/guide/topics/ui/controls/spinner.html
 * Retrieved on: 3 November 2017
 */

public class SpinnerActivity extends OrderPrescriptionActivity implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.orderfragment);

        /**
         * @return Spinner code for spinner at id spinner4.
         */

        Spinner spinner = (Spinner) findViewById(R.id.spinner4);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.collectionTime_array, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        spinner.setOnItemSelectedListener(this);

    }

    public void onItemSelected(AdapterView<?> parent, View view,
                               int pos, long id) {

        String sSelected=parent.getItemAtPosition(pos).toString();
        Toast.makeText(this,sSelected,Toast.LENGTH_SHORT).show();

        /** @return An item was selected. You can retrieve the selected item using
         *  parent.getItemAtPosition(pos)
         *  Another interface callback
         */

    }

    public void onNothingSelected(AdapterView<?> parent) {

    }
}