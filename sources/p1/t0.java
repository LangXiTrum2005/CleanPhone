package p1;

import android.util.Pair;
import com.applovin.impl.h9;
import com.google.android.gms.internal.ads.lo0;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements f2.j0, u1.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v0 f48164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lo0 f48165b;

    public t0(lo0 lo0Var, v0 v0Var) {
        this.f48165b = lo0Var;
        this.f48164a = v0Var;
    }

    @Override // f2.j0
    public final void A(int i10, f2.c0 c0Var, final f2.u uVar, final c2.g gVar, final IOException iOException, final boolean z10) {
        final Pair pairA = a(i10, c0Var);
        if (pairA != null) {
            ((l1.w) this.f48165b.f17089j).c(new Runnable() { // from class: p1.s0
                @Override // java.lang.Runnable
                public final void run() {
                    q1.f fVar = (q1.f) this.f48157a.f48165b.f17088i;
                    Pair pair = pairA;
                    fVar.A(((Integer) pair.first).intValue(), (f2.c0) pair.second, uVar, gVar, iOException, z10);
                }
            });
        }
    }

    @Override // f2.j0
    public final void B(int i10, f2.c0 c0Var, c2.g gVar) {
        Pair pairA = a(i10, c0Var);
        if (pairA != null) {
            ((l1.w) this.f48165b.f17089j).c(new q0(this, pairA, gVar, 0));
        }
    }

    public final Pair a(int i10, f2.c0 c0Var) {
        f2.c0 c0VarA;
        v0 v0Var = this.f48164a;
        f2.c0 c0Var2 = null;
        if (c0Var != null) {
            int i11 = 0;
            while (true) {
                if (i11 >= v0Var.f48173c.size()) {
                    c0VarA = null;
                    break;
                }
                if (((f2.c0) v0Var.f48173c.get(i11)).f40310d == c0Var.f40310d) {
                    Object obj = c0Var.f40307a;
                    Object obj2 = v0Var.f48172b;
                    int i12 = b1.f47961k;
                    c0VarA = c0Var.a(Pair.create(obj2, obj));
                    break;
                }
                i11++;
            }
            if (c0VarA == null) {
                return null;
            }
            c0Var2 = c0VarA;
        }
        return Pair.create(Integer.valueOf(i10 + v0Var.f48174d), c0Var2);
    }

    @Override // f2.j0
    public final void l(int i10, f2.c0 c0Var, f2.u uVar, c2.g gVar) {
        Pair pairA = a(i10, c0Var);
        if (pairA != null) {
            ((l1.w) this.f48165b.f17089j).c(new r0(this, pairA, uVar, gVar, 1));
        }
    }

    @Override // f2.j0
    public final void v(int i10, f2.c0 c0Var, c2.g gVar) {
        Pair pairA = a(i10, c0Var);
        if (pairA != null) {
            ((l1.w) this.f48165b.f17089j).c(new q0(this, pairA, gVar, 1));
        }
    }

    @Override // f2.j0
    public final void y(int i10, f2.c0 c0Var, f2.u uVar, c2.g gVar) {
        Pair pairA = a(i10, c0Var);
        if (pairA != null) {
            ((l1.w) this.f48165b.f17089j).c(new r0(this, pairA, uVar, gVar, 0));
        }
    }

    @Override // f2.j0
    public final void z(int i10, f2.c0 c0Var, f2.u uVar, c2.g gVar, int i11) {
        Pair pairA = a(i10, c0Var);
        if (pairA != null) {
            ((l1.w) this.f48165b.f17089j).c(new h9(this, pairA, uVar, gVar, i11));
        }
    }
}
