package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bq1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final zi1 f12849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final xi1 f12850b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final hi1 f12851c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final fi1 f12852d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final hi1 f12853e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final fi1 f12854f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final w50 f12855g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final w50 f12856h;

    static {
        zq1 zq1VarA = rj1.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PrivateKey");
        zq1 zq1VarA2 = rj1.a("type.googleapis.com/google.crypto.tink.RsaSsaPkcs1PublicKey");
        f12849a = new zi1(gp1.class, wp1.l);
        f12850b = new xi1(zq1VarA, wp1.f21570g);
        f12851c = new hi1(ip1.class, wp1.f21571h);
        f12852d = new fi1(zq1VarA2, wp1.f21572i);
        f12853e = new hi1(hp1.class, wp1.f21573j);
        f12854f = new fi1(zq1VarA, wp1.f21574k);
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        on1 on1Var = on1.RAW;
        fp1 fp1Var = fp1.f14504e;
        map.put(on1Var, fp1Var);
        map2.put(fp1Var, on1Var);
        on1 on1Var2 = on1.TINK;
        fp1 fp1Var2 = fp1.f14501b;
        map.put(on1Var2, fp1Var2);
        map2.put(fp1Var2, on1Var2);
        on1 on1Var3 = on1.CRUNCHY;
        fp1 fp1Var3 = fp1.f14502c;
        map.put(on1Var3, fp1Var3);
        map2.put(fp1Var3, on1Var3);
        on1 on1Var4 = on1.LEGACY;
        fp1 fp1Var4 = fp1.f14503d;
        map.put(on1Var4, fp1Var4);
        map2.put(fp1Var4, on1Var4);
        f12855g = new w50(Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2));
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        mm1 mm1Var = mm1.SHA256;
        ep1 ep1Var = ep1.f14042b;
        map3.put(mm1Var, ep1Var);
        map4.put(ep1Var, mm1Var);
        mm1 mm1Var2 = mm1.SHA384;
        ep1 ep1Var2 = ep1.f14043c;
        map3.put(mm1Var2, ep1Var2);
        map4.put(ep1Var2, mm1Var2);
        mm1 mm1Var3 = mm1.SHA512;
        ep1 ep1Var3 = ep1.f14044d;
        map3.put(mm1Var3, ep1Var3);
        map4.put(ep1Var3, mm1Var3);
        f12856h = new w50(Collections.unmodifiableMap(map3), Collections.unmodifiableMap(map4));
    }

    public static xn1 a(ip1 ip1Var) {
        wn1 wn1VarE = xn1.E();
        gp1 gp1Var = ip1Var.f15813b;
        sn1 sn1VarA = tn1.A();
        mm1 mm1Var = (mm1) f12856h.a(gp1Var.f14929d);
        sn1VarA.b();
        ((tn1) sn1VarA.f19193b).C(mm1Var);
        tn1 tn1Var = (tn1) sn1VarA.e();
        wn1VarE.b();
        ((xn1) wn1VarE.f19193b).H(tn1Var);
        byte[] bArrE = jd1.e(ip1Var.f15814c);
        as1 as1Var = cs1.f13248b;
        as1 as1VarD = cs1.D(bArrE, 0, bArrE.length);
        wn1VarE.b();
        ((xn1) wn1VarE.f19193b).I(as1VarD);
        byte[] bArrE2 = jd1.e(ip1Var.f15813b.f14927b);
        as1 as1VarD2 = cs1.D(bArrE2, 0, bArrE2.length);
        wn1VarE.b();
        ((xn1) wn1VarE.f19193b).J(as1VarD2);
        return (xn1) wn1VarE.e();
    }

    public static wv0 b(cs1 cs1Var) {
        return new wv0(new BigInteger(1, cs1Var.h()), 7);
    }
}
