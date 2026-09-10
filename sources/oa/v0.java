package oa;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class v0 extends s0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Comparator f47335d;

    public v0(Comparator comparator) {
        super(4);
        comparator.getClass();
        this.f47335d = comparator;
    }

    @Override // oa.s0, oa.b0
    public final b0 a(Object obj) {
        super.a(obj);
        return this;
    }

    @Override // oa.s0
    /* JADX INFO: renamed from: g */
    public final s0 a(Object obj) {
        super.a(obj);
        return this;
    }

    @Override // oa.s0
    public final /* bridge */ /* synthetic */ u0 h() {
        throw null;
    }

    public final v1 i() {
        v1 v1Var;
        Object[] objArrCopyOf = this.f47226a;
        int i10 = this.f47227b;
        Comparator comparator = this.f47335d;
        if (i10 == 0) {
            v1Var = x0.y(comparator);
        } else {
            int i11 = x0.f47342f;
            q.b(i10, objArrCopyOf);
            Arrays.sort(objArrCopyOf, 0, i10, comparator);
            int i12 = 1;
            for (int i13 = 1; i13 < i10; i13++) {
                Object obj = objArrCopyOf[i13];
                if (comparator.compare(obj, objArrCopyOf[i12 - 1]) != 0) {
                    objArrCopyOf[i12] = obj;
                    i12++;
                }
            }
            Arrays.fill(objArrCopyOf, i12, i10, (Object) null);
            if (i12 < objArrCopyOf.length / 2) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i12);
            }
            v1Var = new v1(j0.t(i12, objArrCopyOf), comparator);
        }
        this.f47227b = v1Var.f47337g.size();
        this.f47228c = true;
        return v1Var;
    }
}
