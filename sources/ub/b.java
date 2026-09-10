package ub;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import l2.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b implements h, z8.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f51944a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f51945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f51946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f51947d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f51948e;

    public /* synthetic */ b(com.google.android.gms.internal.consent_sdk.d dVar, Iterable iterable, r8.i iVar, long j10) {
        this.f51944a = 2;
        this.f51945b = dVar;
        this.f51948e = iterable;
        this.f51947d = iVar;
        this.f51946c = j10;
    }

    @Override // ub.h
    public ScheduledFuture a(final rb.c cVar) {
        switch (this.f51944a) {
            case 0:
                g gVar = (g) this.f51945b;
                Runnable runnable = (Runnable) this.f51948e;
                return gVar.f51966b.schedule(new e(gVar, runnable, cVar, 1), this.f51946c, (TimeUnit) this.f51947d);
            default:
                final g gVar2 = (g) this.f51945b;
                final Callable callable = (Callable) this.f51948e;
                return gVar2.f51966b.schedule(new Callable() { // from class: ub.f
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return gVar2.f51965a.submit(new u(28, callable, cVar));
                    }
                }, this.f51946c, (TimeUnit) this.f51947d);
        }
    }

    @Override // z8.b
    public Object execute() {
        com.google.android.gms.internal.consent_sdk.d dVar = (com.google.android.gms.internal.consent_sdk.d) this.f51945b;
        Iterable iterable = (Iterable) this.f51948e;
        r8.i iVar = (r8.i) this.f51947d;
        y8.h hVar = (y8.h) ((y8.d) dVar.f22983c);
        hVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + y8.h.p(iterable);
            SQLiteDatabase sQLiteDatabaseD = hVar.d();
            sQLiteDatabaseD.beginTransaction();
            try {
                sQLiteDatabaseD.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseD.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                try {
                    Cursor cursor = cursorRawQuery;
                    while (cursor.moveToNext()) {
                        hVar.n(cursor.getInt(0), u8.c.MAX_RETRIES_REACHED, cursor.getString(1));
                    }
                    cursorRawQuery.close();
                    sQLiteDatabaseD.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                    sQLiteDatabaseD.setTransactionSuccessful();
                    sQLiteDatabaseD.endTransaction();
                } catch (Throwable th2) {
                    cursorRawQuery.close();
                    throw th2;
                }
            } catch (Throwable th3) {
                sQLiteDatabaseD.endTransaction();
                throw th3;
            }
        }
        hVar.j(new y8.e(((a9.a) dVar.f22987g).f() + this.f51946c, iVar));
        return null;
    }

    public /* synthetic */ b(g gVar, Object obj, long j10, TimeUnit timeUnit, int i10) {
        this.f51944a = i10;
        this.f51945b = gVar;
        this.f51948e = obj;
        this.f51946c = j10;
        this.f51947d = timeUnit;
    }
}
