package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public abstract class f3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final id f23451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile String f23452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q6 f23453c;

    static {
        e3 e3Var = e3.f23407b;
        int i10 = oa.u0.f47325c;
        md mdVar = new md(e3Var, true, oa.u1.f47328j);
        i9.i iVar = new i9.i();
        iVar.f42937a = mdVar;
        f23453c = new q6(iVar, 11);
        f23451a = new id("__phenotype_server_token", iVar, "");
        f23452b = null;
    }

    public static String a() {
        return (String) f23451a.get();
    }
}
