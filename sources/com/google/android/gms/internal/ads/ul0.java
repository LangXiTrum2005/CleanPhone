package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzu;
import com.google.android.gms.ads.internal.zzt;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.X3;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ul0 extends u01 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20817a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fe1 f20818b;

    public ul0(Context context, fe1 fe1Var) {
        super(context, "AdMobOfflineBufferedPings.db", ((Integer) zzba.zzc().a(am.L9)).intValue());
        this.f20817a = context;
        this.f20818b = fe1Var;
    }

    public static void c(SQLiteDatabase sQLiteDatabase, zzu zzuVar) {
        SQLiteDatabase sQLiteDatabase2;
        String string;
        sQLiteDatabase.beginTransaction();
        try {
            String[] strArr = {"timestamp", "url"};
            StringBuilder sb2 = new StringBuilder(15);
            sb2.append("event_state = 1");
            String string2 = sb2.toString();
            sQLiteDatabase2 = sQLiteDatabase;
            try {
                Cursor cursorQuery = sQLiteDatabase2.query("offline_buffered_pings", strArr, string2, null, null, null, "timestamp ASC", null);
                int count = cursorQuery.getCount();
                String[] strArr2 = new String[count];
                int i10 = 0;
                while (cursorQuery.moveToNext()) {
                    int columnIndex = cursorQuery.getColumnIndex("timestamp");
                    int columnIndex2 = cursorQuery.getColumnIndex("url");
                    if (columnIndex2 != -1) {
                        long j10 = cursorQuery.getLong(columnIndex);
                        String string3 = cursorQuery.getString(columnIndex2);
                        if (string3 == null) {
                            string = "";
                        } else {
                            Uri uri = Uri.parse(string3);
                            ((p9.b) zzt.zzk()).getClass();
                            long jCurrentTimeMillis = System.currentTimeMillis() - j10;
                            String encodedQuery = uri.getEncodedQuery();
                            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                            builderClearQuery.appendQueryParameter("bd", Long.toString(jCurrentTimeMillis));
                            String strValueOf = String.valueOf(builderClearQuery.build());
                            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 1 + String.valueOf(encodedQuery).length());
                            sb3.append(strValueOf);
                            sb3.append(X3.j.f27832c);
                            sb3.append(encodedQuery);
                            string = sb3.toString();
                        }
                        strArr2[i10] = string;
                    }
                    i10++;
                }
                cursorQuery.close();
                sQLiteDatabase2.delete("offline_buffered_pings", "event_state = ?", new String[]{Integer.toString(1)});
                sQLiteDatabase2.setTransactionSuccessful();
                sQLiteDatabase2.endTransaction();
                for (int i11 = 0; i11 < count; i11++) {
                    zzuVar.zzc(strArr2[i11], null);
                }
            } catch (Throwable th2) {
                th = th2;
                Throwable th3 = th;
                sQLiteDatabase2.endTransaction();
                throw th3;
            }
        } catch (Throwable th4) {
            th = th4;
            sQLiteDatabase2 = sQLiteDatabase;
        }
    }

    public final void a(qv0 qv0Var) {
        sf sfVar = new sf(this, 6);
        k00 k00Var = (k00) this.f20818b;
        ListenableFuture listenableFutureB = k00Var.b(sfVar);
        listenableFutureB.addListener(new zd1(0, listenableFutureB, new so0(this, qv0Var)), k00Var);
    }

    public final void b(String str) {
        a(new af1(str, 7));
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE offline_buffered_pings (timestamp INTEGER PRIMARY_KEY, gws_query_id TEXT, url TEXT, event_state INTEGER)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS offline_buffered_pings");
    }
}
