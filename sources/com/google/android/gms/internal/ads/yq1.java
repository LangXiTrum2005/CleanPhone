package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yq1 implements hf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w50 f22350a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f22351b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f22352c;

    static {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        sq1 sq1Var = sq1.f20032a;
        lp1 lp1Var = lp1.f17093b;
        map.put(sq1Var, lp1Var);
        map2.put(lp1Var, sq1Var);
        sq1 sq1Var2 = sq1.f20033b;
        lp1 lp1Var2 = lp1.f17094c;
        map.put(sq1Var2, lp1Var2);
        map2.put(lp1Var2, sq1Var2);
        sq1 sq1Var3 = sq1.f20034c;
        lp1 lp1Var3 = lp1.f17095d;
        map.put(sq1Var3, lp1Var3);
        map2.put(lp1Var3, sq1Var3);
        f22350a = new w50(Collections.unmodifiableMap(map), Collections.unmodifiableMap(map2));
        f22351b = new byte[0];
        f22352c = new byte[]{0};
    }
}
