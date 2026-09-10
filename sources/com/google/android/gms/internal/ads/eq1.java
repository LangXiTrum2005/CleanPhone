package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class eq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zi1 f14050a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xi1 f14051b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hi1 f14052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fi1 f14053d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final hi1 f14054e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final fi1 f14055f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final w50 f14056g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final w50 f14057h;

    static {
        zq1 zq1VarA = rj1.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPrivateKey");
        zq1 zq1VarA2 = rj1.a("type.googleapis.com/google.crypto.tink.RsaSsaPssPublicKey");
        f14050a = new zi1(np1.class, wp1.f21580r);
        f14051b = new xi1(zq1VarA, wp1.f21575m);
        f14052c = new hi1(pp1.class, wp1.f21576n);
        f14053d = new fi1(zq1VarA2, wp1.f21577o);
        f14054e = new hi1(op1.class, wp1.f21578p);
        f14055f = new fi1(zq1VarA, wp1.f21579q);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        on1 on1Var = on1.RAW;
        mp1 mp1Var = mp1.f17511e;
        map.put(on1Var, mp1Var);
        map2.put(mp1Var, on1Var);
        on1 on1Var2 = on1.TINK;
        mp1 mp1Var2 = mp1.f17508b;
        map.put(on1Var2, mp1Var2);
        map2.put(mp1Var2, on1Var2);
        on1 on1Var3 = on1.CRUNCHY;
        mp1 mp1Var3 = mp1.f17509c;
        map.put(on1Var3, mp1Var3);
        map2.put(mp1Var3, on1Var3);
        on1 on1Var4 = on1.LEGACY;
        mp1 mp1Var4 = mp1.f17510d;
        map.put(on1Var4, mp1Var4);
        map2.put(mp1Var4, on1Var4);
        f14056g = new w50(Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2));
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        mm1 mm1Var = mm1.SHA256;
        lp1 lp1Var = lp1.f17093b;
        map3.put(mm1Var, lp1Var);
        map4.put(lp1Var, mm1Var);
        mm1 mm1Var2 = mm1.SHA384;
        lp1 lp1Var2 = lp1.f17094c;
        map3.put(mm1Var2, lp1Var2);
        map4.put(lp1Var2, mm1Var2);
        mm1 mm1Var3 = mm1.SHA512;
        lp1 lp1Var3 = lp1.f17095d;
        map3.put(mm1Var3, lp1Var3);
        map4.put(lp1Var3, mm1Var3);
        f14057h = new w50(Collections.unmodifiableMap(map3), Collections.unmodifiableMap(map4));
    }

    public static bo1 a(np1 np1Var) {
        ao1 ao1VarC = bo1.C();
        lp1 lp1Var = np1Var.f17887d;
        w50 w50Var = f14057h;
        mm1 mm1Var = (mm1) w50Var.a(lp1Var);
        ao1VarC.b();
        ((bo1) ao1VarC.f19193b).E(mm1Var);
        mm1 mm1Var2 = (mm1) w50Var.a(np1Var.f17888e);
        ao1VarC.b();
        ((bo1) ao1VarC.f19193b).F(mm1Var2);
        int i10 = np1Var.f17889f;
        ao1VarC.b();
        ((bo1) ao1VarC.f19193b).G(i10);
        return (bo1) ao1VarC.e();
    }

    public static fo1 b(pp1 pp1Var) {
        eo1 eo1VarE = fo1.E();
        bo1 bo1VarA = a(pp1Var.f18757b);
        eo1VarE.b();
        ((fo1) eo1VarE.f19193b).I(bo1VarA);
        byte[] bArrE = jd1.e(pp1Var.f18758c);
        as1 as1Var = cs1.f13248b;
        as1 as1VarD = cs1.D(bArrE, 0, bArrE.length);
        eo1VarE.b();
        ((fo1) eo1VarE.f19193b).J(as1VarD);
        byte[] bArrE2 = jd1.e(pp1Var.f18757b.f17885b);
        as1 as1VarD2 = cs1.D(bArrE2, 0, bArrE2.length);
        eo1VarE.b();
        ((fo1) eo1VarE.f19193b).K(as1VarD2);
        eo1VarE.b();
        ((fo1) eo1VarE.f19193b).H(0);
        return (fo1) eo1VarE.e();
    }

    public static wv0 c(cs1 cs1Var) {
        return new wv0(new BigInteger(1, cs1Var.h()), 7);
    }
}
