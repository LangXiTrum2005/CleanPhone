package com.google.android.datatransport.runtime.scheduling.persistence;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.google.android.datatransport.Encoding;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements SQLiteEventStore.Function {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f16976b;

    public /* synthetic */ f(Object obj, int i2) {
        this.f16975a = i2;
        this.f16976b = obj;
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public final Object apply(Object obj) {
        Object obj2 = this.f16976b;
        switch (this.f16975a) {
            case 0:
                SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
                Encoding encoding = SQLiteEventStore.g0;
                SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) obj2;
                sQLiteEventStore.getClass();
                sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
                sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + sQLiteEventStore.f16959Y.a()).execute();
                break;
            default:
                Cursor cursor = (Cursor) obj;
                Encoding encoding2 = SQLiteEventStore.g0;
                while (cursor.moveToNext()) {
                    long j = cursor.getLong(0);
                    HashMap map = (HashMap) obj2;
                    Set hashSet = (Set) map.get(Long.valueOf(j));
                    if (hashSet == null) {
                        hashSet = new HashSet();
                        map.put(Long.valueOf(j), hashSet);
                    }
                    hashSet.add(new SQLiteEventStore.Metadata(cursor.getString(1), cursor.getString(2)));
                }
                break;
        }
        return null;
    }
}
