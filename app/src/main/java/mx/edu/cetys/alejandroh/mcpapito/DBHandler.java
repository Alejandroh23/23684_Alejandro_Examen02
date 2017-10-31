package mx.edu.cetys.alejandroh.mcpapito;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by PC on 30/10/2017.
 */

public class DBHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;

    private static final String DATABASE_NAME = "juegos";

    private static final String TABLE_JUEGOS_DETAIL = "Detalles del juego";

    private static final String KEY_ID ="id";
    private static final String KEY_NAME = "Name";
    private static final String KEY_AUTOR = "Autor";
    private static final String KEY_LADDERLIST = "LADDERLIST";
    private static final String KEY_SNAKELIST = "SNAKELIST";

    public DBHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        @Override
        public void onCreate (SQLiteDatabase db){
            String CREATE_DETAIL_TABLE = "CREATE TABLE" + TABLE_JUEGOS_DETAIL + "("
                    + KEY_ID + "INTEGER PRIMARY KEY,"
                    + KEY_AUTOR + "TEXT,"
                    + KEY_NAME + "TEXT,"
                    + KEY_LADDERLIST + "TEXT"
                    + KEY_SNAKELIST + "TEXT" + ")";

            db.execSQL(CREATE_DETAIL_TABLE);
        }

        @Override
        public void onUpgrade (SQLiteDatabase db, int oldmove, int newmove){
            db.execSQL("DROP TABLE" + TABLE_JUEGOS_DETAIL);

            onCreate(db);
        }

    }
        }
    }


}
