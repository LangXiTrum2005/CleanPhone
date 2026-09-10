package com.google.android.exoplayer2.offline;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.database.DatabaseProvider;
import com.google.android.exoplayer2.database.VersionTable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultDownloadIndex implements WritableDownloadIndex {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f18248e = h(3, 4);
    public static final String[] f = {"id", "mime_type", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", DownloadService.KEY_STOP_REASON, "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DatabaseProvider f18250b;
    public boolean d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f18249a = "ExoPlayerDownloads";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f18251c = new Object();

    public static final class DownloadCursorImpl implements DownloadCursor {
        public final Cursor X;

        public DownloadCursorImpl(Cursor cursor) {
            this.X = cursor;
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public final Download W() {
            return DefaultDownloadIndex.e(this.X);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.X.close();
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public final int getPosition() {
            return this.X.getPosition();
        }

        @Override // com.google.android.exoplayer2.offline.DownloadCursor
        public final boolean moveToPosition(int i2) {
            return this.X.moveToPosition(i2);
        }
    }

    public DefaultDownloadIndex(DatabaseProvider databaseProvider) {
        this.f18250b = databaseProvider;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            int i2 = Util.f18979a;
            for (String str2 : str.split(",", -1)) {
                String[] strArrSplit = str2.split("\\.", -1);
                Assertions.d(strArrSplit.length == 3);
                arrayList.add(new StreamKey(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2])));
            }
        }
        return arrayList;
    }

    public static Download e(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        DownloadRequest.Builder builder = new DownloadRequest.Builder(string, Uri.parse(string2));
        builder.f18285c = cursor.getString(1);
        builder.d = a(cursor.getString(3));
        if (blob.length <= 0) {
            blob = null;
        }
        builder.f18286e = blob;
        builder.f = cursor.getString(4);
        builder.g = cursor.getBlob(5);
        DownloadRequest downloadRequestA = builder.a();
        DownloadProgress downloadProgress = new DownloadProgress();
        downloadProgress.f18280a = cursor.getLong(13);
        downloadProgress.f18281b = cursor.getFloat(12);
        int i2 = cursor.getInt(6);
        return new Download(downloadRequestA, i2, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i2 == 4 ? cursor.getInt(11) : 0, downloadProgress);
    }

    public static Download f(Cursor cursor) {
        String str;
        String string = cursor.getString(0);
        string.getClass();
        String string2 = cursor.getString(2);
        string2.getClass();
        DownloadRequest.Builder builder = new DownloadRequest.Builder(string, Uri.parse(string2));
        String string3 = cursor.getString(1);
        if ("dash".equals(string3)) {
            str = "application/dash+xml";
        } else if ("hls".equals(string3)) {
            str = "application/x-mpegURL";
        } else {
            str = com.smartdigimkt.b0.a.g0.equals(string3) ? "application/vnd.ms-sstr+xml" : "video/x-unknown";
        }
        builder.f18285c = str;
        builder.d = a(cursor.getString(3));
        builder.f = cursor.getString(4);
        builder.g = cursor.getBlob(5);
        DownloadRequest downloadRequestA = builder.a();
        DownloadProgress downloadProgress = new DownloadProgress();
        downloadProgress.f18280a = cursor.getLong(13);
        downloadProgress.f18281b = cursor.getFloat(12);
        int i2 = cursor.getInt(6);
        return new Download(downloadRequestA, i2, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i2 == 4 ? cursor.getInt(11) : 0, downloadProgress);
    }

    public static String h(int... iArr) {
        if (iArr.length == 0) {
            return "1";
        }
        StringBuilder sb = new StringBuilder("state IN (");
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (i2 > 0) {
                sb.append(AbstractJsonLexerKt.COMMA);
            }
            sb.append(iArr[i2]);
        }
        sb.append(')');
        return sb.toString();
    }

    public final void b() {
        synchronized (this.f18251c) {
            if (this.d) {
                return;
            }
            try {
                int iA = VersionTable.a(this.f18250b.getReadableDatabase(), "", 0);
                if (iA != 3) {
                    SQLiteDatabase writableDatabase = this.f18250b.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        VersionTable.b(writableDatabase, 0, "", 3);
                        ArrayList arrayListI = iA == 2 ? i(writableDatabase) : new ArrayList();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f18249a);
                        writableDatabase.execSQL("CREATE TABLE " + this.f18249a + " (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        Iterator it = arrayListI.iterator();
                        while (it.hasNext()) {
                            k((Download) it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                this.d = true;
            } catch (SQLException e2) {
                throw new DatabaseIOException(e2);
            }
        }
    }

    public final Cursor c(String str, String[] strArr) throws DatabaseIOException {
        try {
            return this.f18250b.getReadableDatabase().query(this.f18249a, f, str, strArr, null, null, "start_time_ms ASC");
        } catch (SQLiteException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public final Download d(String str) throws DatabaseIOException {
        b();
        try {
            Cursor cursorC = c("id = ?", new String[]{str});
            try {
                if (cursorC.getCount() == 0) {
                    cursorC.close();
                    return null;
                }
                cursorC.moveToNext();
                Download downloadE = e(cursorC);
                cursorC.close();
                return downloadE;
            } catch (Throwable th) {
                if (cursorC != null) {
                    try {
                        cursorC.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            throw new DatabaseIOException(e2);
        }
        throw new DatabaseIOException(e2);
    }

    public final DownloadCursor g(int... iArr) {
        b();
        return new DownloadCursorImpl(c(h(iArr), null));
    }

    public final ArrayList i(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!Util.I(sQLiteDatabase, this.f18249a)) {
            return arrayList;
        }
        Cursor cursorQuery = sQLiteDatabase.query(this.f18249a, new String[]{"id", "title", "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", DownloadService.KEY_STOP_REASON, "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(f(cursorQuery));
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
        }
        cursorQuery.close();
        return arrayList;
    }

    public final void j(Download download) {
        b();
        try {
            k(download, this.f18250b.getWritableDatabase());
        } catch (SQLiteException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public final void k(Download download, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = download.f18255a.f0;
        if (bArr == null) {
            bArr = Util.f;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", download.f18255a.X);
        contentValues.put("mime_type", download.f18255a.Z);
        contentValues.put("uri", download.f18255a.f18282Y.toString());
        List list = download.f18255a.e0;
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            StreamKey streamKey = (StreamKey) list.get(i2);
            sb.append(streamKey.X);
            sb.append('.');
            sb.append(streamKey.f18297Y);
            sb.append('.');
            sb.append(streamKey.Z);
            sb.append(AbstractJsonLexerKt.COMMA);
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        contentValues.put("stream_keys", sb.toString());
        contentValues.put("custom_cache_key", download.f18255a.g0);
        contentValues.put("data", download.f18255a.h0);
        contentValues.put("state", Integer.valueOf(download.f18256b));
        contentValues.put("start_time_ms", Long.valueOf(download.f18257c));
        contentValues.put("update_time_ms", Long.valueOf(download.d));
        contentValues.put("content_length", Long.valueOf(download.f18258e));
        contentValues.put(DownloadService.KEY_STOP_REASON, Integer.valueOf(download.f));
        contentValues.put("failure_reason", Integer.valueOf(download.g));
        contentValues.put("percent_downloaded", Float.valueOf(download.f18259h.f18281b));
        contentValues.put("bytes_downloaded", Long.valueOf(download.f18259h.f18280a));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow(this.f18249a, null, contentValues);
    }

    public final void l() {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.f18250b.getWritableDatabase().update(this.f18249a, contentValues, "state = 2", null);
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public final void m() {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.f18250b.getWritableDatabase().update(this.f18249a, contentValues, null, null);
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }

    public final void n(int i2, String str) {
        b();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(DownloadService.KEY_STOP_REASON, Integer.valueOf(i2));
            this.f18250b.getWritableDatabase().update(this.f18249a, contentValues, f18248e + " AND id = ?", new String[]{str});
        } catch (SQLException e2) {
            throw new DatabaseIOException(e2);
        }
    }
}
