package kn;

import ck.i;
import cn.o1;
import cn.p0;
import cn.p1;
import cn.q1;
import hn.s;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q1 f44728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f44729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f44730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f44731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a f44732e;

    public b(a aVar, q1 q1Var, i iVar) {
        o1 o1Var = o1.f6752b;
        p1 p1Var = p1.f6754b;
        this.f44732e = aVar;
        this.f44728a = q1Var;
        this.f44729b = iVar;
        this.f44731d = -1;
    }

    public final void a() {
        Object obj = this.f44730c;
        if (obj instanceof s) {
            ((s) obj).h(this.f44731d, this.f44732e.f44737a);
            return;
        }
        p0 p0Var = obj instanceof p0 ? (p0) obj : null;
        if (p0Var != null) {
            p0Var.dispose();
        }
    }
}
