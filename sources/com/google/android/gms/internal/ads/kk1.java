package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class kk1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w50 f16471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final w50 f16472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zi1 f16473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final xi1 f16474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final hi1 f16475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final fi1 f16476f;

    static {
        zq1 zq1VarA = rj1.a("type.googleapis.com/google.crypto.tink.HmacKey");
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        on1 on1Var = on1.RAW;
        ak1 ak1Var = ak1.f12056e;
        map.put(on1Var, ak1Var);
        map2.put(ak1Var, on1Var);
        on1 on1Var2 = on1.TINK;
        ak1 ak1Var2 = ak1.f12053b;
        map.put(on1Var2, ak1Var2);
        map2.put(ak1Var2, on1Var2);
        on1 on1Var3 = on1.LEGACY;
        ak1 ak1Var3 = ak1.f12055d;
        map.put(on1Var3, ak1Var3);
        map2.put(ak1Var3, on1Var3);
        on1 on1Var4 = on1.CRUNCHY;
        ak1 ak1Var4 = ak1.f12054c;
        map.put(on1Var4, ak1Var4);
        map2.put(ak1Var4, on1Var4);
        f16471a = new w50(Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2));
        HashMap map3 = new HashMap();
        HashMap map4 = new HashMap();
        mm1 mm1Var = mm1.SHA1;
        zj1 zj1Var = zj1.f22641b;
        map3.put(mm1Var, zj1Var);
        map4.put(zj1Var, mm1Var);
        mm1 mm1Var2 = mm1.SHA224;
        zj1 zj1Var2 = zj1.f22642c;
        map3.put(mm1Var2, zj1Var2);
        map4.put(zj1Var2, mm1Var2);
        mm1 mm1Var3 = mm1.SHA256;
        zj1 zj1Var3 = zj1.f22643d;
        map3.put(mm1Var3, zj1Var3);
        map4.put(zj1Var3, mm1Var3);
        mm1 mm1Var4 = mm1.SHA384;
        zj1 zj1Var4 = zj1.f22644e;
        map3.put(mm1Var4, zj1Var4);
        map4.put(zj1Var4, mm1Var4);
        mm1 mm1Var5 = mm1.SHA512;
        zj1 zj1Var5 = zj1.f22645f;
        map3.put(mm1Var5, zj1Var5);
        map4.put(zj1Var5, mm1Var5);
        f16472b = new w50(Collections.unmodifiableMap(map3), Collections.unmodifiableMap(map4));
        f16473c = new zi1(bk1.class, tj1.f20418m);
        f16474d = new xi1(zq1VarA, tj1.f20416j);
        f16475e = new hi1(xj1.class, tj1.f20417k);
        f16476f = new fi1(zq1VarA, tj1.l);
    }
}
