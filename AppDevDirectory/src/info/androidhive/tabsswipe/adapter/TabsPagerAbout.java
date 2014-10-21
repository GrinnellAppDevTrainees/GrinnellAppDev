package info.androidhive.tabsswipe.adapter;

import com.appdev.appdevdirectory.MissionStatementFragment;
import com.appdev.appdevdirectory.FundingFragment;
import com.appdev.appdevdirectory.HistoryFragment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.ListFragment;

public class TabsPagerAbout extends FragmentPagerAdapter {
	public TabsPagerAbout(FragmentManager fm) {
		super(fm);
	}

	@Override
	public ListFragment getItem(int index) {

		switch (index) {
		case 0:
			// Mission Statement ListFragment activity
			return new MissionStatementFragment();
		case 1:
			// Funding ListFragment activity
			return new FundingFragment();
		case 2:
			// History ListFragment activity
			return new HistoryFragment();
		}

		return null;
	}

	@Override
	public int getCount() {
		// get item count - equal to number of tabs
		return 3;
	}
}
