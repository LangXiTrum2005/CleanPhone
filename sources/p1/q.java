package p1;

import android.os.Build;
import android.view.View;
import m0.r1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements l1.k, m0.v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f48141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f48142b;

    public /* synthetic */ q(int i10, int i11) {
        this.f48141a = i11;
        this.f48142b = i10;
    }

    @Override // m0.v
    public r1 f(View view, r1 r1Var) {
        m0.a1 b1Var;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 36) {
            b1Var = new m0.e1(r1Var);
        } else if (i10 >= 35) {
            b1Var = new m0.d1(r1Var);
        } else if (i10 >= 34) {
            b1Var = new m0.c1(r1Var);
        } else {
            b1Var = i10 >= 31 ? new m0.b1(r1Var) : new m0.a1(r1Var);
        }
        b1Var.h(this.f48142b, f0.b.f40257e);
        return b1Var.b();
    }

    @Override // l1.k
    public void invoke(Object obj) {
        switch (this.f48141a) {
            case 0:
                ((i1.i0) obj).onRepeatModeChanged(this.f48142b);
                break;
            case 1:
                ((i1.i0) obj).g(this.f48142b);
                break;
            default:
                q1.b bVar = (q1.b) obj;
                bVar.getClass();
                q1.i iVar = (q1.i) bVar;
                int i10 = this.f48142b;
                if (i10 == 1) {
                    iVar.f48574v = true;
                }
                iVar.l = i10;
                break;
        }
    }

    public /* synthetic */ q(q1.a aVar, int i10, i1.j0 j0Var, i1.j0 j0Var2) {
        this.f48141a = 2;
        this.f48142b = i10;
    }
}
