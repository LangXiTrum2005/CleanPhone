package l2;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;
import i1.z0;
import p1.d0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f44856b;

    public e(h hVar) {
        this.f44856b = hVar;
    }

    @Override // l2.x
    public final void b() {
        h hVar = this.f44856b;
        Surface surface = hVar.V0;
        if (surface != null) {
            v vVar = hVar.G0;
            Handler handler = vVar.f44941a;
            if (handler != null) {
                handler.post(new cj.l(vVar, surface, SystemClock.elapsedRealtime(), 5));
            }
            hVar.Y0 = true;
        }
    }

    @Override // l2.x
    public final void c() {
        h hVar = this.f44856b;
        if (hVar.V0 != null) {
            hVar.O0(0, 1);
        }
    }

    @Override // l2.x
    public final void d() {
        d0 d0Var = this.f44856b.I;
        if (d0Var != null) {
            d0Var.a();
        }
    }

    @Override // l2.x
    public final void a(z0 z0Var) {
    }
}
