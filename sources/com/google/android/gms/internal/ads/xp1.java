package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xp1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zi1 f21957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xi1 f21958b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hi1 f21959c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fi1 f21960d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final hi1 f21961e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final fi1 f21962f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final w50 f21963g;

    static {
        zq1 zq1VarA = rj1.a("type.googleapis.com/google.crypto.tink.Ed25519PrivateKey");
        zq1 zq1VarA2 = rj1.a("type.googleapis.com/google.crypto.tink.Ed25519PublicKey");
        f21957a = new zi1(wo1.class, wp1.f21569f);
        f21958b = new xi1(zq1VarA, tj1.D);
        f21959c = new hi1(zo1.class, wp1.f21565b);
        f21960d = new fi1(zq1VarA2, wp1.f21566c);
        f21961e = new hi1(xo1.class, wp1.f21567d);
        f21962f = new fi1(zq1VarA, wp1.f21568e);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        on1 on1Var = on1.RAW;
        vo1 vo1Var = vo1.f21225e;
        map.put(on1Var, vo1Var);
        map2.put(vo1Var, on1Var);
        on1 on1Var2 = on1.TINK;
        vo1 vo1Var2 = vo1.f21222b;
        map.put(on1Var2, vo1Var2);
        map2.put(vo1Var2, on1Var2);
        on1 on1Var3 = on1.CRUNCHY;
        vo1 vo1Var3 = vo1.f21223c;
        map.put(on1Var3, vo1Var3);
        map2.put(vo1Var3, on1Var3);
        on1 on1Var4 = on1.LEGACY;
        vo1 vo1Var4 = vo1.f21224d;
        map.put(on1Var4, vo1Var4);
        map2.put(vo1Var4, on1Var4);
        f21963g = new w50(Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2));
    }

    public static lm1 a(zo1 zo1Var) {
        km1 km1VarC = lm1.C();
        byte[] bArrB = zo1Var.f22683c.b();
        as1 as1VarD = cs1.D(bArrB, 0, bArrB.length);
        km1VarC.b();
        ((lm1) km1VarC.f19193b).F(as1VarD);
        return (lm1) km1VarC.e();
    }
}
