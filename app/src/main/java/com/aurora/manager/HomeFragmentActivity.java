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
	private LinearLayout card_info;
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private TextView textview1;
	private TextView textview2;
	
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
		card_info = _view.findViewById(R.id.card_info);
		linear1 = _view.findViewById(R.id.linear1);
		linear2 = _view.findViewById(R.id.linear2);
		linear3 = _view.findViewById(R.id.linear3);
		linear4 = _view.findViewById(R.id.linear4);
		textview1 = _view.findViewById(R.id.textview1);
		textview2 = _view.findViewById(R.id.textview2);
	}
	
	private void initializeLogic() {
	}
	
}