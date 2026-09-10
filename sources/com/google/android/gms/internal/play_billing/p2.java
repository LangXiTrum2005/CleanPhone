package com.google.android.gms.internal.play_billing;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p2 f24443c = new p2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f24445b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h2 f24444a = new h2();

    public final s2 a(Class cls) {
        s2 s2VarT;
        Charset charset = z1.f24507a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f24445b;
        s2 s2Var = (s2) concurrentHashMap.get(cls);
        if (s2Var != null) {
            return s2Var;
        }
        h2 h2Var = this.f24444a;
        h2Var.getClass();
        r1 r1Var = t2.f24472a;
        t1.class.isAssignableFrom(cls);
        r2 r2VarA = ((h2) h2Var.f24280a).a(cls);
        if ((r2VarA.f24464d & 2) == 2) {
            r1 r1Var2 = t2.f24472a;
            r1 r1Var3 = m1.f24408a;
            s2VarT = new n2(r1Var2, r2VarA.f24461a);
        } else {
            int i10 = o2.f24437a;
            int i11 = e2.f24263a;
            r1 r1Var4 = t2.f24472a;
            r1 r1Var5 = r2VarA.a() + (-1) != 1 ? m1.f24408a : null;
            int i12 = j2.f24310a;
            s2VarT = m2.t(r2VarA, r1Var4, r1Var5);
        }
        s2 s2Var2 = (s2) concurrentHashMap.putIfAbsent(cls, s2VarT);
        return s2Var2 != null ? s2Var2 : s2VarT;
    }
}
