package com.example.android.miwok;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by DanielVG on 05.06.17.
 */

public class FragmentStatePageAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public FragmentStatePageAdapter(Context context, FragmentManager fm) {
        super(fm);
        mContext = context;
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
    @Override
    public CharSequence getPageTitle(int position) {
     /*   // Generate title based on item position
        return tabTitles[position];*/
        String numbers = "Numbers";
        String family = "Family";
        String colors = "Colors";
        String phrases = "Phrases";
        if (position == 0) {
            return mContext.getString(R.string.category_numbers);
        } else if (position == 1){
            return mContext.getString(R.string.category_family);
        } else if(position == 2){
            return mContext.getString(R.string.category_colors);
        }else {
            return mContext.getString(R.string.category_phrases);
        }
    }
}


