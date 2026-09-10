package com.apm.insight.e.a;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import com.p004ironsource.mediationsdk.utils.IronSourceConstants;
import com.startapp.sdk.adsbase.model.AdPreferences;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class b extends a<com.apm.insight.d.a> {
    public b() {
        super("duplicatelog");
    }

    @Override // com.apm.insight.e.a.a
    public final /* synthetic */ ContentValues a(com.apm.insight.d.a aVar) {
        com.apm.insight.d.a aVar2 = aVar;
        ContentValues contentValues = new ContentValues();
        contentValues.put("path", aVar2.f10064a);
        contentValues.put("insert_time", Long.valueOf(aVar2.f10065b));
        return contentValues;
    }

    public final boolean a(SQLiteDatabase sQLiteDatabase, String str) {
        Throwable th;
        int count;
        if (sQLiteDatabase != null && !TextUtils.isEmpty(str)) {
            try {
                Cursor cursorQuery = sQLiteDatabase.query(this.f10083a, null, "path=?", new String[]{str}, null, null, null);
                count = cursorQuery.getCount();
                try {
                    cursorQuery.close();
                } catch (Throwable th2) {
                    th = th2;
                    com.apm.insight.a.b(th);
                }
            } catch (Throwable th3) {
                th = th3;
                count = 0;
            }
            if (count > 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.apm.insight.e.a.a
    public final void a(SQLiteDatabase sQLiteDatabase, com.apm.insight.d.a aVar) {
        if (aVar == null || a(sQLiteDatabase, aVar.f10064a)) {
            return;
        }
        super.a(sQLiteDatabase, aVar);
        try {
            sQLiteDatabase.execSQL("delete from " + this.f10083a + " where _id in (select _id from " + this.f10083a + " order by insert_time desc limit 1000 offset 500)");
        } catch (Exception e2) {
            com.apm.insight.a.b((Throwable) e2);
        }
    }

    @Override // com.apm.insight.e.a.a
    public final HashMap<String, String> a() {
        HashMap<String, String> mapT = androidx.media3.extractor.text.ttml.a.t("path", AdPreferences.TYPE_TEXT, "insert_time", "INTEGER");
        mapT.put(IronSourceConstants.EVENTS_EXT1, AdPreferences.TYPE_TEXT);
        mapT.put("ext2", AdPreferences.TYPE_TEXT);
        return mapT;
    }
}
