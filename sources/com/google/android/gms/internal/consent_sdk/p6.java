package com.google.android.gms.internal.consent_sdk;

import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class p6 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p6 f23162c = new p6();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConcurrentHashMap f23164b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g6 f23163a = new g6(0);

    public final s6 a(Class cls) {
        s6 s6VarJ;
        Charset charset = a6.f22937a;
        if (cls == null) {
            throw new NullPointerException("messageType");
        }
        ConcurrentHashMap concurrentHashMap = this.f23164b;
        s6 s6Var = (s6) concurrentHashMap.get(cls);
        if (s6Var != null) {
            return s6Var;
        }
        g6 g6Var = this.f23163a;
        g6Var.getClass();
        y6 y6Var = t6.f23209a;
        if (!w5.class.isAssignableFrom(cls)) {
            int i10 = k5.f23071a;
        }
        r6 r6VarA = ((g6) g6Var.f23023b).a(cls);
        if ((r6VarA.f23184d & 2) == 2) {
            int i11 = k5.f23071a;
            y6 y6Var2 = t6.f23209a;
            o4 o4Var = r5.f23180a;
            s6VarJ = new n6(y6Var2, r6VarA.f23181a);
        } else {
            int i12 = k5.f23071a;
            int i13 = o6.f23157a;
            int i14 = e6.f23011a;
            y6 y6Var3 = t6.f23209a;
            o4 o4Var2 = r6VarA.a() + (-1) != 1 ? r5.f23180a : null;
            int i15 = j6.f23060a;
            s6VarJ = m6.j(r6VarA, y6Var3, o4Var2);
        }
        s6 s6Var2 = (s6) concurrentHashMap.putIfAbsent(cls, s6VarJ);
        return s6Var2 != null ? s6Var2 : s6VarJ;
    }
}
