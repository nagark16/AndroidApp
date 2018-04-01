package ooad.qs;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DBHandler extends SQLiteOpenHelper {

	private static final int DATABASE_VERSION = 2;
	private static final String DICTIONARY_TABLE_NAME = "qs";
	//private static final String DICTIONARY_TABLE_CREATE = "CREATE TABLE "+ DICTIONARY_TABLE_NAME + " (" + "" + " TEXT, "+ "" + " TEXT);";
	private static final String DICTIONARY_TABLE_CREATE = "CREATE TABLE "+ DICTIONARY_TABLE_NAME + " (" + "question" + " TEXT, "+ "option1" + " TEXT, "+ "option2" + " TEXT, "+ "option3" + " TEXT, "+ "option4" + " TEXT, "+ "answer" + " TEXT);";

	DBHandler(Context context) {
		super(context, "questions", null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		db.execSQL(DICTIONARY_TABLE_CREATE);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub

	}

}
