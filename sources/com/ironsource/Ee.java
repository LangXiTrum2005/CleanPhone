package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class Ee {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Boolean f26018b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Ee f26017a = new Ee();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static De f26019c = De.NOT_INIT;

    private Ee() {
    }

    public final synchronized De a() {
        return f26019c;
    }

    public final De b() {
        Boolean bool = f26018b;
        if (bool == null ? true : bool.equals(Boolean.FALSE)) {
            return De.NOT_INIT;
        }
        if (kotlin.jvm.internal.n.a(bool, Boolean.TRUE)) {
            return f26019c;
        }
        throw new aa.b((byte) 0, 20);
    }

    public final synchronized void a(De de2) {
        kotlin.jvm.internal.n.f(de2, "<set-?>");
        f26019c = de2;
    }

    public final void a(boolean z10) {
        f26018b = Boolean.valueOf(z10);
    }
}
