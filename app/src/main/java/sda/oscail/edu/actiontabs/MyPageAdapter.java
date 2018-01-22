package sda.oscail.edu.actiontabs;
/**
 * Created by ckirwan on 18/06/2016.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class MyPageAdapter extends FragmentStatePagerAdapter
{
    int mNumOfTabs;
    public static final int INFO = 0;
    public static final int LIST = 1;
    public static final int ORDER = 2;
    public static final int ACCOUNT = 3;
    public static final String UI_TAB_INFO = "INFO";
    public static final String UI_TAB_LIST = "LIST";
    public static final String UI_TAB_ORDER = "ORDER";
    public static final String UI_TAB_ACCOUNT = "ACCOUNT";


    public MyPageAdapter(FragmentManager fm, int NumOfTabs)
    {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position)
    {

        switch (position)
        {
            case INFO:
                InfoFragment infoTab = new InfoFragment();
                return infoTab;
            case LIST:
                ListFragment listTab = new ListFragment();
                return listTab;
            case ORDER:
                OrderFragment orderTab = new OrderFragment();
                return orderTab;
            case ACCOUNT:
                AccountFragment accountTab = new AccountFragment();
                return accountTab;
            default:
                return null;
        }
    }

    @Override
    public int getCount()
    {
        return mNumOfTabs;
    }

    public CharSequence getPageTitle(int position) {
        switch (position) {
            case INFO:
                return UI_TAB_INFO;
            case LIST:
                return UI_TAB_LIST;
            case ORDER:
                return UI_TAB_ORDER;
            case ACCOUNT:
                return UI_TAB_ACCOUNT;
            default:
                break;
        }
        return null;
    }



}
