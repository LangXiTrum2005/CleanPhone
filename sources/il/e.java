package il;

import cl.q0;
import cl.x0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e extends kotlin.jvm.internal.o implements jk.b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f43060f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final e f43061g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final e f43062h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final e f43063i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final e f43064j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final e f43065k;
    public static final e l;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f43066e;

    static {
        int i10 = 1;
        f43060f = new e(i10, 0);
        f43061g = new e(i10, 1);
        f43062h = new e(i10, 2);
        f43063i = new e(i10, 3);
        f43064j = new e(i10, 4);
        f43065k = new e(i10, 5);
        l = new e(i10, 6);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i10, int i11) {
        super(i10);
        this.f43066e = i11;
    }

    @Override // jk.b
    public final Object invoke(Object obj) {
        zk.c cVarB;
        String strV;
        boolean z10 = false;
        switch (this.f43066e) {
            case 0:
                zk.c it = (zk.c) obj;
                kotlin.jvm.internal.n.f(it, "it");
                int i10 = f.l;
                return Boolean.valueOf(xj.n.i0(g0.f43082f, go.k.v(it)));
            case 1:
                zk.c it2 = (zk.c) obj;
                kotlin.jvm.internal.n.f(it2, "it");
                if (it2 instanceof zk.s) {
                    int i11 = f.l;
                    if (xj.n.i0(g0.f43082f, go.k.v(it2))) {
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
            case 2:
                zk.c it3 = (zk.c) obj;
                kotlin.jvm.internal.n.f(it3, "it");
                return Boolean.valueOf(go.c.u(it3));
            case 3:
                return ((x0) obj).getType();
            case 4:
                zk.c it4 = (zk.c) obj;
                kotlin.jvm.internal.n.f(it4, "it");
                return Boolean.valueOf(go.c.u(fm.e.k(it4)));
            case 5:
                zk.c it5 = (zk.c) obj;
                kotlin.jvm.internal.n.f(it5, "it");
                int i12 = d.l;
                q0 q0Var = (q0) it5;
                if (wk.h.z(q0Var) && fm.e.b(q0Var, new al.f(q0Var, 10)) != null) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            default:
                zk.c it6 = (zk.c) obj;
                kotlin.jvm.internal.n.f(it6, "it");
                if (wk.h.z(it6)) {
                    int i13 = f.l;
                    if (g0.f43081e.contains(it6.getName()) && (cVarB = fm.e.b(it6, f43061g)) != null && (strV = go.k.v(cVarB)) != null) {
                        if (!g0.f43078b.contains(strV)) {
                        }
                        z10 = true;
                    }
                }
                return Boolean.valueOf(z10);
        }
    }
}
