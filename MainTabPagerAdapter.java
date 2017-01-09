package com.exam2.adapter;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.exam2.ClassicsListFragment;
import com.exam2.ExamFragment;
import com.exam2.widget.IconPagerAdapter;

public class MainTabPagerAdapter extends FragmentPagerAdapter implements IconPagerAdapter {
	private List<String> titles;
	private List<Integer> icons; 
	private static final int PAGE_EXAM=0;
	private static final int PAGE_CLASSICS=1;
	private static final int PAGE_MORE=2;
	public MainTabPagerAdapter(List<String> titles, List<Integer> icons,
			FragmentManager fm) {
		super(fm);
		this.titles = titles;
		this.icons = icons;	
	}

	public List<String> getTitles() {
		return titles;
	}
	
	public List<Integer> getIcons() {
		return icons;
	}

	@Override
	public int getIconResId(int index) {
		// TODO Auto-generated method stub
		return icons.get(index % icons.size());
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return titles.size();
	}

	@Override
	public Fragment getItem(int position) {
		// TODO Auto-generated method stub
		Fragment fragment=null;
		switch(position){
		case PAGE_EXAM:
			fragment=new ExamFragment();
			break;
		case PAGE_CLASSICS:
			fragment=new ClassicsListFragment();
			break;
		case PAGE_MORE:
			break;
		default:
			break;
		}
		return fragment;
	}
}
