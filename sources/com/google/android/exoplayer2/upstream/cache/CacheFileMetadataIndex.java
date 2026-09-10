package com.google.android.exoplayer2.upstream.cache;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.database.VersionTable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
final class CacheFileMetadataIndex {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f18849c = {"name", "length", "last_touch_timestamp"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DatabaseProvider f18850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18851b;

    public CacheFileMetadataIndex(DatabaseProvider databaseProvider) {
        this.f18850a = databaseProvider;
    }

    public final HashMap a() throws DatabaseIOException {
        try {
            this.f18851b.getClass();
            Cursor cursorQuery = this.f18850a.getReadableDatabase().query(this.f18851b, f18849c, null, null, null, null, null);
            try {
                HashMap map = new HashMap(cursorQuery.getCount());
                while (cursorQuery.moveToNext()) {
                    String string = cursorQuery.getString(0);
                    string.getClass();
                    map.put(string, new CacheFileMetadata(cursorQuery.getLong(1), cursorQuery.getLong(2)));
                }
                cursorQuery.close();
                return map;
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
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public final void b(long j) throws DatabaseIOException {
        DatabaseProvider databaseProvider = this.f18850a;
        try {
            String hexString = Long.toHexString(j);
            this.f18851b = "ExoPlayerCacheFileMetadata" + hexString;
            if (VersionTable.a(databaseProvider.getReadableDatabase(), hexString, 2) != 1) {
                SQLiteDatabase writableDatabase = databaseProvider.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    VersionTable.b(writableDatabase, 2, hexString, 1);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f18851b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f18851b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public final void c(Set set) throws DatabaseIOException {
        this.f18851b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f18850a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f18851b, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
            } finally {
                writableDatabase.endTransaction();
            }
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public final void d(long j, long j2, String str) throws DatabaseIOException {
        this.f18851b.getClass();
        try {
            SQLiteDatabase writableDatabase = this.f18850a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put("length", Long.valueOf(j));
            contentValues.put("last_touch_timestamp", Long.valueOf(j2));
            writableDatabase.replaceOrThrow(this.f18851b, null, contentValues);
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }
}
