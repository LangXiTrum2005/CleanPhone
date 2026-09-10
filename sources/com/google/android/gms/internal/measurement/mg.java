package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class mg extends ng {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ng f23751e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final ng f23752f;

    static {
        ng ngVarB = new mg(null, new x.i(0)).b();
        f23751e = ngVarB;
        mg mgVar = new mg(ngVarB, new x.i(0));
        boolean z10 = !mgVar.f23790c;
        Boolean bool = Boolean.TRUE;
        go.k.s("Can't mutate after handing to trace", z10);
        go.k.s("Key already present", !mgVar.c());
        mgVar.f23789b.put(ng.f23787d, bool);
        f23752f = mgVar.b();
    }
}
