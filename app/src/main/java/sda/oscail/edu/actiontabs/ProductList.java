package sda.oscail.edu.actiontabs;

/**
 * Created by keithfinnegan on 1/19/2018.
 */

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.Toast;


public class ProductList extends AppCompatActivity{

    ListView list;
    String[] itemname ={
            "Pampers",
            "Panadol",
            "Panadol Extra",
            "Parfum",
            "Razors",
            "Scented Candles",
            "Shampoo",
            "Teeth Whitening"
    };

    Integer[] imgid={
            R.drawable.pampers,
            R.drawable.panadol,
            R.drawable.panadolextra,
            R.drawable.parfum,
            R.drawable.razors,
            R.drawable.scentedcandles,
            R.drawable.shampoo,
            R.drawable.teethwhitening,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.listfragment);

        ListAdapter adapter=new ListAdapter(this, itemname, imgid);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
                // TODO Auto-generated method stub
                String Selecteditem= itemname[+position];
                Toast.makeText(getApplicationContext(), Selecteditem, Toast.LENGTH_SHORT).show();

            }
        });




    }
}