package ni;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import l2.v;
import qj.x;
import r1.a0;
import r1.c0;
import r1.l;
import r1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class h implements l1.k, y8.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ long f46766a;

    public /* synthetic */ h(long j10) {
        this.f46766a = j10;
    }

    @Override // y8.f
    public Object apply(Object obj) {
        long j10 = this.f46766a;
        Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]);
        try {
            Cursor cursor = cursorRawQuery;
            cursor.moveToNext();
            return new u8.g(cursor.getLong(0), j10);
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // l1.k
    public void invoke(Object obj) {
        x xVar;
        y yVar = (y) obj;
        a0 a0Var = yVar.f49397b;
        if (yVar.equals(a0Var.f49234j) && (xVar = a0Var.f49237n) != null) {
            c0 c0Var = (c0) xVar.f49096b;
            c0Var.Q0 = true;
            v vVar = c0Var.F0;
            Handler handler = vVar.f44941a;
            if (handler != null) {
                handler.post(new l(vVar, this.f46766a));
            }
        }
    }
}
