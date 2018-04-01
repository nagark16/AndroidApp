package ooad.qs;

import java.util.HashMap;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import edu.utd.ooadqs.R;

public class OptionTabs extends Activity {

	private Context context;
	
	private Button questions;
	
	private DBHandler myDb;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.option_tabs);

		context = getApplicationContext();
		questions = (Button)findViewById(R.id.button2);
		
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

	public void insertRecord() {
		  SQLiteDatabase database = myDb.getWritableDatabase();
		  ContentValues values = new ContentValues();
		  values.put("question", "question1");
		  
		  values.put("option1", "val1");
		  values.put("option2", "val2");
		  values.put("option3", "val3");
		  values.put("option4", "val4");
		  values.put("answer", "val2");
		  database.insert("qs", null, values);
		  database.close();
		}
	
	@Override
	protected void onStart() {
		
		//myDb = new DictionaryOpenHelper(context);
		
		//insertRecord();
		
		//myDb.getWritableDatabase().execSQL("SELECT * FROM ");
		
		//myDb.getReadableDatabase().execSQL("SELECT * FROM qs");
		final Intent intent = new Intent(this, Question.class);
		questions.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startActivity(intent);
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
