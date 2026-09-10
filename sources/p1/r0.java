package p1;

import android.util.Pair;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ t0 f48151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Pair f48152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f2.u f48153d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c2.g f48154e;

    public /* synthetic */ r0(t0 t0Var, Pair pair, f2.u uVar, c2.g gVar, int i10) {
        this.f48150a = i10;
        this.f48151b = t0Var;
        this.f48152c = pair;
        this.f48153d = uVar;
        this.f48154e = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f48150a) {
            case 0:
                q1.f fVar = (q1.f) this.f48151b.f48165b.f17088i;
                Pair pair = this.f48152c;
                fVar.y(((Integer) pair.first).intValue(), (f2.c0) pair.second, this.f48153d, this.f48154e);
                break;
            default:
                q1.f fVar2 = (q1.f) this.f48151b.f48165b.f17088i;
                Pair pair2 = this.f48152c;
                fVar2.l(((Integer) pair2.first).intValue(), (f2.c0) pair2.second, this.f48153d, this.f48154e);
                break;
        }
    }
}
