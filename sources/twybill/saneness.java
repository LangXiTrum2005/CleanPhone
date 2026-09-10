package twybill;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import androidx.media3.database.DatabaseIOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: CacheFileMetadataIndex.java */
/* JADX INFO: loaded from: classes.dex */
public final class saneness {

    /* JADX INFO: renamed from: dern, reason: collision with root package name */
    public static final String[] f39035dern = {"name", "length", "last_touch_timestamp"};

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final liable.attabal f39036attabal;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public String f39037saneness;

    public saneness(liable.attabal attabalVar) {
        this.f39036attabal = attabalVar;
    }

    public static void attabal(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    public static String wireman(String str) {
        return "ExoPlayerCacheFileMetadata" + str;
    }

    public void beachfront(String str) throws DatabaseIOException {
        decarock.attabal.marial(this.f39037saneness);
        try {
            this.f39036attabal.getWritableDatabase().delete(this.f39037saneness, "name = ?", new String[]{str});
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void competently(Set<String> set) throws DatabaseIOException {
        decarock.attabal.marial(this.f39037saneness);
        try {
            SQLiteDatabase writableDatabase = this.f39036attabal.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator<String> it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f39037saneness, "name = ?", new String[]{it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public final Cursor dern() {
        decarock.attabal.marial(this.f39037saneness);
        return this.f39036attabal.getReadableDatabase().query(this.f39037saneness, f39035dern, null, null, null, null, null);
    }

    public void impromptu(String str, long j, long j2) throws DatabaseIOException {
        decarock.attabal.marial(this.f39037saneness);
        try {
            SQLiteDatabase writableDatabase = this.f39036attabal.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.f39037saneness, null, contentValues);
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public void marial(long j) throws DatabaseIOException {
        try {
            String hexString = Long.toHexString(j);
            this.f39037saneness = wireman(hexString);
            if (liable.dern.saneness(this.f39036attabal.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f39036attabal.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    liable.dern.wireman(writableDatabase, 2, hexString, 1);
                    attabal(writableDatabase, this.f39037saneness);
                    writableDatabase.execSQL("CREATE TABLE " + this.f39037saneness + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }

    public Map<String, attabal> saneness() throws DatabaseIOException {
        try {
            Cursor cursorDern = dern();
            try {
                HashMap map = new HashMap(cursorDern.getCount());
                while (cursorDern.moveToNext()) {
                    map.put((String) decarock.attabal.marial(cursorDern.getString(0)), new attabal(cursorDern.getLong(1), cursorDern.getLong(2)));
                }
                cursorDern.close();
                return map;
            } catch (Throwable th) {
                if (cursorDern != null) {
                    try {
                        cursorDern.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLException e) {
            throw new DatabaseIOException(e);
        }
    }
}
