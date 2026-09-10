package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final l2 f23690c = new l2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f23692b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q6 f23691a = new q6(1);

    public final o2 a(Class cls) {
        o2 o2VarY;
        ConcurrentHashMap concurrentHashMap = this.f23692b;
        Object obj = concurrentHashMap.get(cls);
        if (obj != null) {
            return (o2) obj;
        }
        q6 q6Var = this.f23691a;
        q6Var.getClass();
        f1 f1Var = p2.f23833a;
        if (!i1.class.isAssignableFrom(cls)) {
            int i10 = n0.f23760a;
        }
        n2 n2VarB = ((q6) q6Var.f23891b).b(cls);
        if ((n2VarB.f23764d & 2) == 2) {
            int i11 = n0.f23760a;
            f1 f1Var2 = p2.f23833a;
            f1 f1Var3 = a1.f23289a;
            o2VarY = new h2(f1Var2, n2VarB.f23761a);
        } else {
            int i12 = n0.f23760a;
            int i13 = i2.f23570a;
            int i14 = x1.f24139a;
            f1 f1Var4 = p2.f23833a;
            f1 f1Var5 = n2VarB.a() + (-1) != 1 ? a1.f23289a : null;
            int i15 = b2.f23312a;
            o2VarY = g2.y(n2VarB, f1Var4, f1Var5);
        }
        o2 o2Var = (o2) concurrentHashMap.putIfAbsent(cls, o2VarY);
        return o2Var != null ? o2Var : o2VarY;
    }
}
