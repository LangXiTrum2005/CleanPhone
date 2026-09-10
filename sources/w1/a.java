package w1;

import android.net.Uri;
import android.os.SystemClock;
import b2.w;
import com.google.android.gms.internal.ads.a0;
import com.google.android.gms.internal.ads.bq0;
import ea.b0;
import java.util.HashMap;
import java.util.List;
import l1.y;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f52741a;

    public a(d dVar) {
        this.f52741a = dVar;
    }

    @Override // w1.u
    public final void b() {
        this.f52741a.f52761e.remove(this);
    }

    @Override // w1.u
    public final boolean d(Uri uri, w wVar, boolean z10) {
        c cVar;
        d dVar = this.f52741a;
        HashMap map = dVar.f52760d;
        if (dVar.l == null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            p pVar = dVar.f52766j;
            String str = y.f44830a;
            List list = pVar.f52863e;
            int i10 = 0;
            for (int i11 = 0; i11 < list.size(); i11++) {
                c cVar2 = (c) map.get(((o) list.get(i11)).f52855a);
                if (cVar2 != null && jElapsedRealtime < cVar2.f52752h) {
                    i10++;
                }
            }
            bq0 bq0Var = new bq0(1, 0, dVar.f52766j.f52863e.size(), i10);
            dVar.f52759c.getClass();
            a0 a0VarC = b0.c(bq0Var, wVar);
            if (a0VarC != null && a0VarC.f11791a == 2 && (cVar = (c) map.get(uri)) != null) {
                return c.a(cVar, a0VarC.f11792b);
            }
        }
        return false;
    }
}
