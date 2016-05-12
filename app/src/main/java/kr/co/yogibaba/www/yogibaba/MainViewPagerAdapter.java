package kr.co.yogibaba.www.yogibaba;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import kr.co.yogibaba.www.yogibaba.settingTab.SettinTestFragment;
import kr.co.yogibaba.www.yogibaba.shoppingtab.ShoppingTestFragment;
import kr.co.yogibaba.www.yogibaba.shoppingtab.ShppingTabFragment;
import kr.co.yogibaba.www.yogibaba.videoTab.VideoListFragment;

/**
 * Created by Tacademy on 2016-05-12.
 */
public class MainViewPagerAdapter extends FragmentStatePagerAdapter {
    int numOfTabs;
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new VideoListFragment().newInstance("video1","video2");
            case 1:
                return new ShppingTabFragment().newInstance("second","second");
            case 2:
                return new SettinTestFragment().newInstance("tree","tree");
            default:
                return null;
        }
    }

    @Override
    public int getItemPosition(Object object) {
        return super.getItemPosition(object);
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }

    public MainViewPagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs=numOfTabs;
    }
}
