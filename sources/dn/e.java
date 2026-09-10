package dn;

import ak.k;
import android.os.Handler;
import android.os.Looper;
import cn.d0;
import cn.e2;
import cn.i0;
import cn.l;
import cn.n0;
import cn.p0;
import cn.v1;
import cn.w;
import hn.o;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends w implements i0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f38970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f38971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f38972d;

    public e(Handler handler, boolean z10) {
        this.f38970b = handler;
        this.f38971c = z10;
        this.f38972d = z10 ? this : new e(handler, true);
    }

    @Override // cn.i0
    public final p0 b(long j10, e2 e2Var, k kVar) {
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f38970b.postDelayed(e2Var, j10)) {
            return new c(0, this, e2Var);
        }
        t(kVar, e2Var);
        return v1.f6778a;
    }

    @Override // cn.i0
    public final void c(long j10, l lVar) {
        com.unity3d.services.ads.operation.show.b bVar = new com.unity3d.services.ads.operation.show.b(6, lVar, this);
        if (j10 > 4611686018427387903L) {
            j10 = 4611686018427387903L;
        }
        if (this.f38970b.postDelayed(bVar, j10)) {
            lVar.v(new d(0, this, bVar));
        } else {
            t(lVar.f6734e, bVar);
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.f38970b == this.f38970b && eVar.f38971c == this.f38971c;
    }

    public final int hashCode() {
        return (this.f38971c ? 1231 : 1237) ^ System.identityHashCode(this.f38970b);
    }

    @Override // cn.w
    public final void p(k kVar, Runnable runnable) {
        if (this.f38970b.post(runnable)) {
            return;
        }
        t(kVar, runnable);
    }

    @Override // cn.w
    public final boolean r(k kVar) {
        return (this.f38971c && n.a(Looper.myLooper(), this.f38970b.getLooper())) ? false : true;
    }

    public final void t(k kVar, Runnable runnable) {
        d0.i(kVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        jn.e eVar = n0.f6748a;
        jn.d.f44017b.p(kVar, runnable);
    }

    @Override // cn.w
    public final String toString() {
        e eVar;
        String str;
        jn.e eVar2 = n0.f6748a;
        e eVar3 = o.f42451a;
        if (this == eVar3) {
            str = "Dispatchers.Main";
        } else {
            try {
                eVar = eVar3.f38972d;
            } catch (UnsupportedOperationException unused) {
                eVar = null;
            }
            str = this == eVar ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String string = this.f38970b.toString();
        return this.f38971c ? wi.d.h(string, ".immediate") : string;
    }
}
