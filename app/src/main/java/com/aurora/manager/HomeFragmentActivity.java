package com.aurora.manager;

import android.animation.*;
import android.app.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.os.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.view.*;
import android.view.View.*;
import android.view.animation.*;
import android.webkit.*;
import android.widget.*;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.*;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.io.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import org.json.*;

public class HomeFragmentActivity extends Fragment {
	
	private NestedScrollView scroll_view;
	private LinearLayout container;
	private LinearLayout card_status;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private TextView textview1;
	private TextView textview2;
	private LinearLayout linear6;
	private ImageView imageview1;
	private TextView textview3;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private TextView textview5;
	private TextView textview4;
	private TextView textview6;
	private TextView textview7;
	
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.home_fragment, _container, false);
		initialize(_savedInstanceState, _view);
		initializeLogic();
		return _view;
	}
	
	private void initialize(Bundle _savedInstanceState, View _view) {
		scroll_view = _view.findViewById(R.id.scroll_view);
		container = _view.findViewById(R.id.container);
		card_status = _view.findViewById(R.id.card_status);
		linear4 = _view.findViewById(R.id.linear4);
		linear5 = _view.findViewById(R.id.linear5);
		textview1 = _view.findViewById(R.id.textview1);
		textview2 = _view.findViewById(R.id.textview2);
		linear6 = _view.findViewById(R.id.linear6);
		imageview1 = _view.findViewById(R.id.imageview1);
		textview3 = _view.findViewById(R.id.textview3);
		linear7 = _view.findViewById(R.id.linear7);
		linear8 = _view.findViewById(R.id.linear8);
		textview5 = _view.findViewById(R.id.textview5);
		textview4 = _view.findViewById(R.id.textview4);
		textview6 = _view.findViewById(R.id.textview6);
		textview7 = _view.findViewById(R.id.textview7);
	}
	
	private void initializeLogic() {
	}
	
}