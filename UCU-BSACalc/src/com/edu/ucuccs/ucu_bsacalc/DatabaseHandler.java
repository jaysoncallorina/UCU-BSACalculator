package com.edu.ucuccs.ucu_bsacalc;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHandler {

	static final int DATABASE_VERSION = 1;
	static final String DATABASE_NAME = "db_user";
	static final String TABLE_NAME = "tb_history";

	static final String ROW_ID = "id";
	static final String ROW_FORMULA = "formula";
	static final String ROW_ANSWER = "answer";

	static final String DATABASE_CREATE = "CREATE TABLE " + TABLE_NAME + "("
			+ ROW_ID + " integer primary key autoincrement, " + ROW_FORMULA
			+ " varchar(255) not null ," + ROW_ANSWER
			+ " varchar(255) not null )";

	final Context context;

	DatabaseHelper DBHelper;

	SQLiteDatabase db;

	public DatabaseHandler(Context ctx) {
		this.context = ctx;
		DBHelper = new DatabaseHelper(context);

	}

	private static class DatabaseHelper extends SQLiteOpenHelper {
		DatabaseHelper(Context context) {
			super(context, DATABASE_NAME, null, DATABASE_VERSION);
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			// TODO Auto-generated method stub
			try {
				db.execSQL(DATABASE_CREATE);
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			// TODO Auto-generated method stub
			db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
			onCreate(db);

		}

	}

	public DatabaseHandler open() throws SQLException {
		db = DBHelper.getWritableDatabase();
		return this;
	}

	public void close() {
		DBHelper.close();
	}
	
	public long method_save(String formula, String answer) {
		// TODO Auto-generated method stub

		ContentValues initialValues = new ContentValues();
		initialValues.put(ROW_FORMULA, formula);
		initialValues.put(ROW_ANSWER, answer);
		return db.insert(TABLE_NAME, null, initialValues);
	}
}
