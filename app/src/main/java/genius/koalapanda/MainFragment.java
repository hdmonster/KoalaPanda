package genius.koalapanda;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v13.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import genius.koalapanda.fragment.page1;
import genius.koalapanda.fragment.page10;
import genius.koalapanda.fragment.page11;
import genius.koalapanda.fragment.page12;
import genius.koalapanda.fragment.page13;
import genius.koalapanda.fragment.page14;
import genius.koalapanda.fragment.page15;
import genius.koalapanda.fragment.page16;
import genius.koalapanda.fragment.page17;
import genius.koalapanda.fragment.page18;
import genius.koalapanda.fragment.page19;
import genius.koalapanda.fragment.page2;
import genius.koalapanda.fragment.page20;
import genius.koalapanda.fragment.page3;
import genius.koalapanda.fragment.page4;
import genius.koalapanda.fragment.page5;
import genius.koalapanda.fragment.page6;
import genius.koalapanda.fragment.page7;
import genius.koalapanda.fragment.page8;
import genius.koalapanda.fragment.page9;

public class MainFragment extends Activity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v13.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_fragment);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mViewPager.setCurrentItem(20);

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

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    page20 koala1 = new page20();
                    return koala1;
                case 1:
                    page19 koala2 = new page19();
                    return koala2;
                case 2:
                    page18 koala3 = new page18();
                    return koala3;
                case 3:
                    page17 koala4 = new page17();
                    return koala4;
                case 4:
                    page16 koala5 = new page16();
                    return koala5;
                case 5:
                    page15 koala6 = new page15();
                    return koala6;
                case 6:
                    page14 koala7 = new page14();
                    return koala7;
                case 7:
                    page13 koala8 = new page13();
                    return koala8;
                case 8:
                    page12 koala9 = new page12();
                    return koala9;
                case 9:
                    page11 koala10 = new page11();
                    return koala10;
                case 10:
                    page10 koala11 = new page10();
                    return koala11;
                case 11:
                    page9 koala12 = new page9();
                    return koala12;
                case 12:
                    page8 koala13 = new page8();
                    return koala13;
                case 13:
                    page7 koala14 = new page7();
                    return koala14;
                case 14:
                    page6 koala15 = new page6();
                    return koala15;
                case 15:
                    page5 koala16 = new page5();
                    return koala16;
                case 16:
                    page4 koala17 = new page4();
                    return koala17;
                case 17:
                    page3 koala18 = new page3();
                    return koala18;
                case 18:
                    page2 koala19 = new page2();
                    return koala19;
                case 19:
                    page1 koala20 = new page1();
                    return koala20;




            }
            return null;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 20;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "SECTION 1";
                case 1:
                    return "SECTION 2";
                case 2:
                    return "SECTION 3";
                case 3:
                    return "SECTION 4";
                case 4:
                    return "SECTION 5";
                case 5:
                    return "SECTION 6";
                case 6:
                    return "SECTION 7";
                case 7:
                    return "SECTION 8";
                case 8:
                    return "SECTION 9";
                case 9:
                    return "SECTION 10";
                case 10:
                    return "SECTION 11";
                case 11:
                    return "SECTION 12";
                case 12:
                    return "SECTION 13";
                case 13:
                    return "SECTION 14";
                case 14:
                    return "SECTION 15";
                case 15:
                    return "SECTION 16";
                case 16:
                    return "SECTION 17";
                case 17:
                    return "SECTION 18";
                case 18:
                    return "SECTION 19";
                case 19:
                    return "SECTION 20";
            }
            return null;
        }
    }
}
