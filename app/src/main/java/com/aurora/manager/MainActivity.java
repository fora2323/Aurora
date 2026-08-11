package com.aurora.manager;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.MainThread;
import androidx.annotation.AnyThread;

import android.view.ViewGroup;
import androidx.activity.EdgeToEdge;
import androidx.core.view.ViewCompat;
import androidx.core.graphics.Insets;
import androidx.viewpager.widget.ViewPager;
import androidx.core.view.WindowInsetsCompat;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.aurora.manager.view.AuroraNavigationBar;
import com.aurora.manager.fragment.FragmentAdapter;
import com.aurora.manager.utils.ResourceUtils;

public class MainActivity extends AppCompatActivity {
	
	private FragmentAdapter adapter;
	
	private LinearLayout toolbar;
	private TextView textview1;
	private TextView textview2;
	private AppCompatImageButton imageview1;
	private AppCompatImageButton imageview2;
	private ViewPager viewpager1;
	private AuroraNavigationBar nav_bar;
	
	@Override
	@MainThread
	protected void onCreate(@Nullable Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		EdgeToEdge.enable(this);
		setContentView(R.layout.main);
		initialize(_savedInstanceState);
		initializeLogic();
		//ambil margin asli nav
		final int baseMarginPx = ResourceUtils.getDp(this, 18);
		ViewCompat.setOnApplyWindowInsetsListener(nav_bar, (v, insets) -> {
			Insets navInsets = insets.getInsets(WindowInsetsCompat.Type.systemBars());
			ViewGroup.MarginLayoutParams params = (ViewGroup.MarginLayoutParams) v.getLayoutParams();
			params.bottomMargin = baseMarginPx + navInsets.bottom;
			v.setLayoutParams(params);
			return insets;
		});
		ViewCompat.setOnApplyWindowInsetsListener(toolbar, (v, insets) -> {
			Insets sysInsets = insets.getInsets(WindowInsetsCompat.Type.systemBars());
			v.setPadding(v.getPaddingLeft(), sysInsets.top, v.getPaddingRight(), v.getPaddingBottom());
			return insets;
		});
	}
	
	@AnyThread
	private void initialize(@Nullable Bundle _savedInstanceState) {
		textview2 = findViewById(R.id.textview2);
		imageview1 = findViewById(R.id.imageview1);
		imageview2 = findViewById(R.id.imageview2);
		viewpager1 = findViewById(R.id.viewpager1);
		nav_bar = findViewById(R.id.nav_bar);
		toolbar = findViewById(R.id.toolbar);
		
		adapter = new FragmentAdapter(getSupportFragmentManager());
	}
	
	@MainThread
	private void initializeLogic() {
		imageview1.setVisibility(View.GONE);
		imageview2.setVisibility(View.GONE);
		
		// Masukkan 4 Fragment milikmu di sini
		adapter.addFragment(new HomeFragmentActivity());
		adapter.addFragment(new AppsFragmentActivity());
		adapter.addFragment(new PluginFragmentActivity());
		adapter.addFragment(new SettingsFragmentActivity());
		//set ke adapter viewpager1
		viewpager1.setAdapter(adapter);
		
		// Sync pergantian halaman dari ViewPager ke AuroraNavigationBar
		viewpager1.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
			@Override
			public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
				
			}
			
			@Override
			public void onPageSelected(int position) {
				nav_bar.setChecked(position);
			}
			
			@Override
			public void onPageScrollStateChanged(int state) {
				
			}
		});
		
		// Sync klik dari AuroraNavigationBar ke ViewPager
		nav_bar.setOnItemSelectedListener((index, itemId) -> {
			viewpager1.setCurrentItem(index, true);
		});
		
	}
}