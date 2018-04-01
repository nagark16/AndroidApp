package ooad.qs;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import edu.utd.ooadqs.R;


public class Main extends Activity {
	
	private Context context;
	private EditText userName;
	private EditText password;
	private Button signIn;
	private Button eXit;
	
	String usr;
	String pwd;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.main_screen);

		context = getApplicationContext();
		
		userName = (EditText)findViewById(R.id.editText1);
		password = (EditText)findViewById(R.id.editText2);
		signIn = (Button)findViewById(R.id.button1);
		eXit = (Button)findViewById(R.id.exitbutton);
		if (getIntent().getBooleanExtra("EXIT", false)) 
		{
		        //finish();
		}
		
		eXit.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				finish();
				System.exit(0);
			}
			
		});
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
	}

	@Override
	protected void onStart() {
		final Intent intent = new Intent(this, OptionTabs.class);
		signIn.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				usr = userName.getText().toString();
				pwd = password.getText().toString();
				if(usr.equalsIgnoreCase("group2") && pwd.equalsIgnoreCase("group2")) {
					startActivity(intent);
				} else {
					Toast.makeText(context,"Invalid credentials", Toast.LENGTH_SHORT).show();
				}
			}
		});
		
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}
	
}
