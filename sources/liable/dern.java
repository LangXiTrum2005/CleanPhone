package liable;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.common.dovishness;
import androidx.media3.database.DatabaseIOException;
import decarock.grimness;

/* JADX INFO: compiled from: VersionTable.java */
/* JADX INFO: loaded from: classes.dex */
public final class dern {
    static {
        dovishness.attabal("media3.database");
    }

    public static String[] attabal(int i, String str) {
        return new String[]{Integer.toString(i), str};
    }

    public static void dern(SQLiteDatabase sQLiteDatabase, int i, String str) throws DatabaseIOException {
        try {
            if (grimness.cosy(sQLiteDatabase, "ExoPlayerVersions")) {
                sQLiteDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", attabal(i, str));
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public static int saneness(SQLiteDatabase sQLiteDatabase, int i, String str) throws DatabaseIOException {
        try {
            if (!grimness.cosy(sQLiteDatabase, "ExoPlayerVersions")) {
                return -1;
            }
            Cursor cursorQuery = sQLiteDatabase.query("ExoPlayerVersions", new String[]{"version"}, "feature = ? AND instance_uid = ?", attabal(i, str), null, null, null);
            try {
                if (cursorQuery.getCount() == 0) {
                    cursorQuery.close();
                    return -1;
                }
                cursorQuery.moveToNext();
                int i2 = cursorQuery.getInt(0);
                cursorQuery.close();
                return i2;
            } catch (Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                try {
                    cursorQuery.close();
                    throw th;
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                    throw th;
                }
            }
            throw new DatabaseIOException(e);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public static void wireman(SQLiteDatabase sQLiteDatabase, int i, String str, int i2) throws DatabaseIOException {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i));
            contentValues.put("instance_uid", str);
            contentValues.put("version", Integer.valueOf(i2));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }
}
