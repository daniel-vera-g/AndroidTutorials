package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by DanielVG on 05.06.17.
 */

public class FragmentStatePageAdapter extends FragmentPagerAdapter {

    public FragmentStatePageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1){
            return new FamilyFragment();
        } else if(position == 2){
            return new ColorsFragment();
        }else {
            return new PhrasesFragment();
        }


}
        /*public CharSequence getPageTitle(int position){
            switch (position){
                case 0:
                    return
            }
        }*/

}
