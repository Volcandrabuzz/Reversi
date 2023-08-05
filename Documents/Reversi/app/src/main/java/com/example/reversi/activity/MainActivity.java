package com.example.reversi.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.Window;

import com.airbnb.lottie.LottieAnimationView;
import com.example.reversi.R;
import com.example.reversi.game.Constant;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);

		LottieAnimationView playButton = findViewById(R.id.animationView);
		playButton.setOnClickListener(v -> {

			SharedPreferences preferences = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
			byte playColor = (byte)preferences.getInt("playerColor", Constant.BLACK);
			int difficulty = preferences.getInt("difficulty", 1);

			Intent intent = new Intent(MainActivity.this, GameActivity.class);
			Bundle bundle = new Bundle();
			bundle.putByte("playerColor", playColor);
			bundle.putInt("difficulty", difficulty);
			intent.putExtras(bundle);
			startActivity(intent);
			overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
		});

		LottieAnimationView gamerules = findViewById(R.id.gamerules);
		gamerules.setOnClickListener(v -> {
			Intent intent = new Intent(MainActivity.this, GameRuleActivity.class);
			startActivity(intent);
			overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
		});
	}

}
