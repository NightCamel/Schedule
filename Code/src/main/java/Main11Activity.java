package ru.maxfad.myraspisanie;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class Main11Activity extends AppCompatActivity {

    String classID;
    Bundle b;

    private SectionsPagerAdapter mSectionsPagerAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main11);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Bundle bundle = getIntent().getExtras();
        classID = bundle.getString("classID");
        toolbar.setTitle("Group: "+classID);



        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());


        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);

        mViewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(mViewPager));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast toast = Toast.makeText(Main11Activity.this, "Знания и стиль жизни !", Toast.LENGTH_LONG);
                toast.setGravity(Gravity.CENTER, 0, 0);
                LinearLayout toastImage = (LinearLayout) toast.getView();
                ImageView imageView = new ImageView(Main11Activity.this);
                imageView.setImageResource(R.drawable.happy);
                toastImage.addView(imageView, 0);
                toast.show();
            }
        });

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {


        getMenuInflater().inflate(R.menu.menu_main11, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_settings) {

            Intent intent = new Intent();
            intent.setClass(Main11Activity.this, MainActivity.class);
            startActivity(intent);

            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {

            switch (position){
                case 0:
                    fragment_main11 bf1= new fragment_main11();
                    b = new Bundle();
                    b.putString("tabID", "1");
                    return bf1;
                case 1:
                    fragment_main12 bf2= new fragment_main12();
                    b = new Bundle();
                    b.putString("tabID", "2");
                    return bf2;
                case 2:
                    fragment_main13 bf3= new fragment_main13();
                    b = new Bundle();
                    b.putString("tabID", "3");
                    return bf3;
                case 3:
                    fragment_main14 bf4= new fragment_main14();
                    b = new Bundle();
                    b.putString("tabID", "4");
                    return bf4;
                case 4:
                    fragment_main15 bf5= new fragment_main15();
                    b = new Bundle();
                    b.putString("tabID", "5");
                    return bf5;

                default:
                    return null;
            }

        }

        @Override
        public int getCount() {

            return 5;
        }
    }
}
