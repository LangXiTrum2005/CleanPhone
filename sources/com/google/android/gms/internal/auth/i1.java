package com.google.android.gms.internal.auth;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i1 f22844c = new i1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f22846b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x0 f22845a = new x0();

    public final l1 a(Class cls) {
        l1 l1VarN;
        Class cls2;
        Charset charset = p0.f22890a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f22846b;
        l1 l1Var = (l1) concurrentHashMap.get(cls);
        if (l1Var != null) {
            return l1Var;
        }
        x0 x0Var = this.f22845a;
        x0Var.getClass();
        Class cls3 = m1.f22873a;
        if (!m0.class.isAssignableFrom(cls) && (cls2 = m1.f22873a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
        k1 k1VarA = ((w0) x0Var.f22916b).a(cls);
        int i10 = k1VarA.f22859c;
        c0 c0Var = k1VarA.f22857a;
        if ((i10 & 2) == 2) {
            if (m0.class.isAssignableFrom(cls)) {
                l1VarN = new e1(m1.f22875c, k0.f22855a, c0Var);
            } else {
                p1 p1Var = m1.f22874b;
                j0 j0Var = k0.f22856b;
                if (j0Var == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                l1VarN = new e1(p1Var, j0Var, c0Var);
            }
        } else if (m0.class.isAssignableFrom(cls)) {
            if (((k1VarA.f22859c & 1) != 0 ? 1 : 2) - 1 != 1) {
                int i11 = g1.f22824a;
                u0 u0Var = v0.f22910b;
                p1 p1Var2 = m1.f22875c;
                j0 j0Var2 = k0.f22855a;
                int i12 = a1.f22793a;
                l1VarN = d1.n(k1VarA, u0Var, p1Var2);
            } else {
                int i13 = g1.f22824a;
                u0 u0Var2 = v0.f22910b;
                p1 p1Var3 = m1.f22875c;
                int i14 = a1.f22793a;
                l1VarN = d1.n(k1VarA, u0Var2, p1Var3);
            }
        } else {
            if (((k1VarA.f22859c & 1) != 0 ? 1 : 2) - 1 != 1) {
                int i15 = g1.f22824a;
                t0 t0Var = v0.f22909a;
                p1 p1Var4 = m1.f22874b;
                if (k0.f22856b == null) {
                    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
                }
                int i16 = a1.f22793a;
                l1VarN = d1.n(k1VarA, t0Var, p1Var4);
            } else {
                int i17 = g1.f22824a;
                t0 t0Var2 = v0.f22909a;
                p1 p1Var5 = m1.f22874b;
                int i18 = a1.f22793a;
                l1VarN = d1.n(k1VarA, t0Var2, p1Var5);
            }
        }
        l1 l1Var2 = (l1) concurrentHashMap.putIfAbsent(cls, l1VarN);
        return l1Var2 == null ? l1VarN : l1Var2;
    }
}
