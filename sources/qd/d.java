package qd;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import cc.p1;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Continuation, tc.a, z8.b, y8.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f48952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f48953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f48954c;

    public /* synthetic */ d(Object obj, long j10, Object obj2) {
        this.f48953b = obj;
        this.f48952a = j10;
        this.f48954c = obj2;
    }

    @Override // y8.f
    public Object apply(Object obj) {
        String str = (String) this.f48953b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        int i10 = ((u8.c) this.f48954c).f51926a;
        Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(i10)});
        try {
            boolean z10 = cursorRawQuery.getCount() > 0;
            cursorRawQuery.close();
            long j10 = this.f48952a;
            if (z10) {
                sQLiteDatabase.execSQL(defpackage.e.j(j10, "UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + ", " WHERE log_source = ? AND reason = ?"), new String[]{str, Integer.toString(i10)});
                return null;
            }
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(i10));
            contentValues.put("events_dropped_count", Long.valueOf(j10));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
            return null;
        } catch (Throwable th2) {
            cursorRawQuery.close();
            throw th2;
        }
    }

    @Override // tc.a
    public void b(tc.b bVar) {
        ((wb.a) bVar.get()).d((String) this.f48953b, this.f48952a, (p1) this.f48954c);
    }

    @Override // z8.b
    public Object execute() {
        com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f48953b;
        r8.i iVar = (r8.i) this.f48954c;
        y8.d dVar2 = (y8.d) dVar.f22983c;
        long jF = ((a9.a) dVar.f22987g).f() + this.f48952a;
        y8.h hVar = (y8.h) dVar2;
        hVar.getClass();
        hVar.j(new y8.e(jF, iVar));
        return null;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        return ((g) this.f48953b).b(task, this.f48952a, (HashMap) this.f48954c);
    }

    public /* synthetic */ d(Object obj, Object obj2, long j10) {
        this.f48953b = obj;
        this.f48954c = obj2;
        this.f48952a = j10;
    }
}
