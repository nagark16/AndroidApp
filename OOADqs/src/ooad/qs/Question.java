package ooad.qs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;
import edu.utd.ooadqs.R;

public class Question extends Activity {
	
    private Context context;
	
	private Button submit;
	private Button nxt;
	private Button exit;
	private TextView question;
	
	
	private RadioButton rad1;
	private RadioButton rad2;
	private RadioButton rad3;
	private RadioButton rad4;
	/*
	private TextView opt1;
	private TextView opt2;
	private TextView opt3;
	private TextView opt4;
	*/
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.question);

		context = getApplicationContext();
		submit = (Button)findViewById(R.id.submit);
		nxt = (Button)findViewById(R.id.next);
		exit = (Button)findViewById(R.id.exit);
		question = (TextView)findViewById(R.id.question);
		
		rad1 = (RadioButton)findViewById(R.id.option1);
		rad2 = (RadioButton)findViewById(R.id.option2);
		rad3 = (RadioButton)findViewById(R.id.option3);
		rad4 = (RadioButton)findViewById(R.id.option4);
		/*
		opt1 = (TextView)findViewById(R.id.opt1);
		opt1.setText("Hello");
		opt2 = (TextView)findViewById(R.id.opt2);
		opt3 = (TextView)findViewById(R.id.opt3);
		opt4 = (TextView)findViewById(R.id.opt4);
		*/
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
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}

	@Override
	protected void onStart() {
		int i = 2;
		submit.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				if(rad1.isChecked()){
					Toast.makeText(context,"correct answer", Toast.LENGTH_SHORT).show();
				}else if(rad2.isChecked()){
					Toast.makeText(context,"wrong answer", Toast.LENGTH_SHORT).show();
				}else if(rad3.isChecked()){
					Toast.makeText(context,"wrong answer", Toast.LENGTH_SHORT).show();
				}else if(rad4.isChecked()){
					Toast.makeText(context,"wrong answer", Toast.LENGTH_SHORT).show();
				}
				
				//if wrong
				
				//else
				
			}
		});
		
		nxt.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//question.setText("Question");
				rad1.setText(question.getText() + "-option1");
				rad2.setText(question.getText() + "-option2");
				rad3.setText(question.getText() + "-option3");
				rad4.setText(question.getText() + "-option4");
				//question.setText("question");
			}
		});
		
		exit.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				Intent intent = new Intent(Question.this, Main.class);
				intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				intent.putExtra("EXIT", true);
				startActivity(intent);
			}
			
		});
		
		question.setText("Question"+i);
		i++;
		
		// TODO Auto-generated method stub
		super.onStart();
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
	}
	
	public void onRadioButtonClicked(View view) {
	    // Is the button now checked?
	    boolean checked = ((RadioButton) view).isChecked();
	    
	    // Check which radio button was clicked
	    switch(view.getId()) {
	        case R.id.option1:
	            if (checked)
	                // Pirates are the best
	            break;
	        case R.id.option2:
	            if (checked)
	                // Ninjas rule
	            break;
	        case R.id.option3:
	            if (checked)
	                // Ninjas rule
	            break;
	        case R.id.option4:
	            if (checked)
	                // Ninjas rule
	            break;
	    }
	}

}
