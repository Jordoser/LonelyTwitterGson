package ca.ualberta.cs.lonelytwitter;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.TextView;

public class SummaryActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_summary);
		Intent intent = getIntent();
		long avelen = intent.getExtras().getLong("len");
		long numof = intent.getExtras().getLong("num");
		TextView chat = (TextView) findViewById(R.id.NumTweets);
		String nu = String.valueOf(numof);
		chat.setText(nu);
		
		TextView chad = (TextView) findViewById(R.id.LenTweets);
		String al = String.valueOf(avelen);
		chad.setText(al);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.summary, menu);
		return true;
	}

}
