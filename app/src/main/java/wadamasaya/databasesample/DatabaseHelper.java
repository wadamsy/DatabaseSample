package wadamasaya.databasesample;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "cocktailmemo.db";

    private static final int DATABASE_VERSION = 1;

    public  DatabaseHelper(Context context) {
        super(context, DATABASE_NAME,null,DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        StringBuilder sb = new StringBuilder();
        sb.append("CREATE TABLE cocktailmemo(");
        sb.append("id_ INTEGER PRIMARY KEY,");
        sb.append("name TEXT");
        sb.append("note TEXT");
        sb.append(");");
        String sql = sb.toString();

        db.execSQL(sql);
    }

    @Override
    public  void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
    }
}
