package sda.oscail.edu.actiontabs;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private MyPageAdapter mMyPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_layout);
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());
        tabLayout.addTab(tabLayout.newTab());


        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        final ViewPager mypager = (ViewPager) findViewById(R.id.pager);
        final MyPageAdapter myadapter = new MyPageAdapter(getSupportFragmentManager(), tabLayout.getTabCount());

        mypager.setAdapter(myadapter);

        tabLayout.setupWithViewPager(mypager);


/*
       FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                new CountDownTimer(30000, 1000) {

                    public void onTick(long millisUntilFinished) {


                        mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
                    }

                    public void onFinish() {
                        mTextField.setText("done!");
                    }
                }.start();

            }
        });*/

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {

        switch (item.getItemId()) {

            case R.id.menuitem_send:
                Toast.makeText(this, getString(R.string.ui_menu_send),
                        Toast.LENGTH_SHORT).show();
                return true;


        }
        return false;


    }

    public static class FindFragment extends AppCompatActivity{

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

            list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        int position, long id) {
                    // TODO Auto-generated method stub
                    String Selecteditem = itemname[+position];
                    Toast.makeText(getApplicationContext(), Selecteditem, Toast.LENGTH_SHORT).show();


                }});}

        public void openSpinner(View view)
        {
            Intent myIntent = new Intent(this, SpinnerActivity.class);
            startActivity(myIntent);}

    }


        }
