package ads_mobile_sdk;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.net.Uri;
import com.ironsource.X3;
import formularization.beachfront;
import kotlinx.coroutines.saran;
import p002kotlin.Pair;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import saneness.amphitheatre;

/* JADX INFO: loaded from: classes.dex */
public final class au1 extends SQLiteOpenHelper {
    public static final String f = StringsKt.stupefactive("\n      CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)\n      ").toString();
    public final saran a;
    public final amphitheatre b;
    public final mu1 c;
    public final b63 d;
    public final formularization.attabal e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au1(Context context, saran backgroundScope, int i, amphitheatre clock, mu1 offlineWorkManager, b63 pinger) {
        super(context, "AdMobOfflineBufferedPings.db", (SQLiteDatabase.CursorFactory) null, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(backgroundScope, "backgroundScope");
        Intrinsics.checkNotNullParameter(clock, "clock");
        Intrinsics.checkNotNullParameter(offlineWorkManager, "offlineWorkManager");
        Intrinsics.checkNotNullParameter(pinger, "pinger");
        this.a = backgroundScope;
        this.b = clock;
        this.c = offlineWorkManager;
        this.d = pinger;
        this.e = beachfront.saneness(false, 1, null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sqLiteDatabase) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        sqLiteDatabase.execSQL(f);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {
        Intrinsics.beachfront(sqLiteDatabase);
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i2) {
        Intrinsics.checkNotNullParameter(sqLiteDatabase, "sqLiteDatabase");
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    public static final void a(au1 au1Var, SQLiteDatabase sQLiteDatabase) {
        au1Var.getClass();
        sQLiteDatabase.beginTransaction();
        try {
            String[] strArrA = au1Var.a(sQLiteDatabase);
            st1 st1Var = st1.READY_TO_PING;
            sQLiteDatabase.delete("offline_buffered_pings", "event_state = ?", new String[]{String.valueOf(1)});
            sQLiteDatabase.setTransactionSuccessful();
            sQLiteDatabase.endTransaction();
            for (String str : strArrA) {
                if (str != null) {
                    b63 b63Var = au1Var.d;
                    Uri uri = Uri.parse(str);
                    Intrinsics.checkNotNullExpressionValue(uri, "parse(...)");
                    b63Var.getClass();
                    Intrinsics.checkNotNullParameter(uri, "uri");
                    b63Var.e.triweekly(new Pair(uri, null));
                }
            }
        } catch (Throwable th) {
            sQLiteDatabase.endTransaction();
            throw th;
        }
    }

    public final String[] a(SQLiteDatabase sQLiteDatabase) {
        st1 st1Var = st1.READY_TO_PING;
        Cursor cursorQuery = sQLiteDatabase.query("offline_buffered_pings", new String[]{"timestamp", "url"}, "event_state = 1", null, null, null, "timestamp ASC", null);
        Intrinsics.checkNotNullExpressionValue(cursorQuery, "query(...)");
        String[] strArr = new String[cursorQuery.getCount()];
        int i = 0;
        while (cursorQuery.moveToNext()) {
            int columnIndex = cursorQuery.getColumnIndex("timestamp");
            int columnIndex2 = cursorQuery.getColumnIndex("url");
            if (columnIndex2 != -1) {
                long j = cursorQuery.getLong(columnIndex);
                String string = cursorQuery.getString(columnIndex2);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                strArr[i] = a(j, string);
            }
            i++;
        }
        cursorQuery.close();
        return strArr;
    }

    public final String a(long j, String str) {
        if (str == null) {
            return "";
        }
        Uri uri = Uri.parse(str);
        this.b.getClass();
        long jB = amphitheatre.b() - j;
        String encodedQuery = uri.getEncodedQuery();
        Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
        builderClearQuery.appendQueryParameter("bd", String.valueOf(jB));
        return builderClearQuery.build().toString() + X3.j.c + encodedQuery;
    }
}
