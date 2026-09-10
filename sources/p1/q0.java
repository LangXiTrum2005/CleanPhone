package p1;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f48144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f48145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c2.g f48146d;

    public /* synthetic */ q0(t0 t0Var, Pair pair, c2.g gVar, int i10) {
        this.f48143a = i10;
        this.f48144b = t0Var;
        this.f48145c = pair;
        this.f48146d = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f48143a) {
            case 0:
                q1.f fVar = (q1.f) this.f48144b.f48165b.f17088i;
                Pair pair = this.f48145c;
                int iIntValue = ((Integer) pair.first).intValue();
                f2.c0 c0Var = (f2.c0) pair.second;
                c0Var.getClass();
                fVar.B(iIntValue, c0Var, this.f48146d);
                break;
            default:
                q1.f fVar2 = (q1.f) this.f48144b.f48165b.f17088i;
                Pair pair2 = this.f48145c;
                fVar2.v(((Integer) pair2.first).intValue(), (f2.c0) pair2.second, this.f48146d);
                break;
        }
    }
}
