package com.aurora.manager.fragment;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class FragmentAdapter extends FragmentPagerAdapter {
	
	private final List<Fragment> fragmentList = new ArrayList<>();
	
	public FragmentAdapter(@NonNull FragmentManager fm) {
		super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
	}
	
	public void addFragment(@NonNull Fragment fragment) {
		fragmentList.add(fragment);
	}
	
	@NonNull
	@Override
	public Fragment getItem(int position) {
		return fragmentList.get(position);
	}
	
	@Override
	public int getCount() {
		return fragmentList.size();
	}
}