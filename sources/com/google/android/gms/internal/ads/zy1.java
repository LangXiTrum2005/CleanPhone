package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface zy1 {
    void a(xy1 xy1Var, p[] pVarArr);

    boolean b(xy1 xy1Var);

    boolean c(xy1 xy1Var);

    void d(j02 j02Var);

    void e(j02 j02Var);

    u f(j02 j02Var);

    void g(j02 j02Var);

    long zzf();

    default boolean zzj() {
        v71.y("LoadControl", "shouldContinuePreloading needs to be implemented when playlist preloading is enabled");
        return false;
    }
}
