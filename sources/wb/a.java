package wb;

import android.util.Log;
import cc.p1;
import defpackage.e;
import java.util.concurrent.atomic.AtomicReference;
import tb.o;
import tj.i0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c f53145c = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f53146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f53147b = new AtomicReference(null);

    public a(o oVar) {
        this.f53146a = oVar;
        oVar.a(new i0(this, 5));
    }

    public final c a(String str) {
        a aVar = (a) this.f53147b.get();
        return aVar == null ? f53145c : aVar.a(str);
    }

    public final boolean b() {
        a aVar = (a) this.f53147b.get();
        return aVar != null && aVar.b();
    }

    public final boolean c(String str) {
        a aVar = (a) this.f53147b.get();
        return aVar != null && aVar.c(str);
    }

    public final void d(String str, long j10, p1 p1Var) {
        String strN = e.n("Deferring native open session: ", str);
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", strN, null);
        }
        this.f53146a.a(new qd.d(str, j10, p1Var));
    }
}
