package org.sickstache;

import org.sickstache.app.SickActivity;

import android.os.Bundle;

import com.actionbarsherlock.app.SherlockActivity;

public class EditShowActivity extends SickActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.edit_show_activity);
	}
	
}
