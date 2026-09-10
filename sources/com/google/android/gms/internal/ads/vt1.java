package com.google.android.gms.internal.ads;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class vt1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final vt1 f21267c = new vt1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f21269b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x11 f21268a = new x11(1);

    public final bu1 a(Class cls) {
        bu1 bu1VarY;
        ConcurrentHashMap concurrentHashMap = this.f21269b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (bu1) obj;
        }
        x11 x11Var = this.f21268a;
        x11Var.getClass();
        s6 s6Var = cu1.f13256a;
        if (!ss1.class.isAssignableFrom(cls)) {
            int i10 = tr1.f20473a;
        }
        xt1 xt1VarB = ((at0) x11Var.f21703b).b(cls);
        if ((xt1VarB.f22004d & 2) == 2) {
            int i11 = tr1.f20473a;
            s6 s6Var2 = cu1.f13256a;
            wp1 wp1Var = ls1.f17120a;
            bu1VarY = new rt1(s6Var2, xt1VarB.f22001a);
        } else {
            int i12 = tr1.f20473a;
            int i13 = st1.f20052a;
            int i14 = it1.f15842a;
            s6 s6Var3 = cu1.f13256a;
            wp1 wp1Var2 = xt1VarB.a() + (-1) != 1 ? ls1.f17120a : null;
            int i15 = mt1.f17546a;
            bu1VarY = qt1.y(xt1VarB, s6Var3, wp1Var2);
        }
        bu1 bu1Var = (bu1) concurrentHashMap.putIfAbsent(cls, bu1VarY);
        return bu1Var != null ? bu1Var : bu1VarY;
    }
}
