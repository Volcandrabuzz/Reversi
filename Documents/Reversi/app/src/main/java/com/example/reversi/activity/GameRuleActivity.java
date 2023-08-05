package com.example.reversi.activity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.TextView;

import com.example.reversi.R;


public class GameRuleActivity extends Activity {

	@SuppressLint("SetTextI18n")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.game_rule);
		TextView textView = findViewById(R.id.rule);
		textView.setText("		 1.The game process of Reversi is to flip each other's pieces, and finally the winner is judged by who has more pieces on the board.\n" +"\n"+
				"		 2. The size of the game board is 8*8, and the initial state is that two white pieces and two black pieces cross in the center of the board.\n" +"\n"+
				"        3. When it is a party's turn, the position of the chess piece must be able to clamp the enemy's chess piece together with its own chess piece, which can be horizontal, vertical or oblique.\n" +"\n"+
				"        4. When it is a party's turn but there are no children to play, the other party will continue to move. When you have a child to play, you can't stop.\n" +"\n"+
				"        5. The game ends when both sides have nowhere to place pieces, and the player with the most pieces wins.");
	}
	
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			GameRuleActivity.this.finish();
			overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}
}
