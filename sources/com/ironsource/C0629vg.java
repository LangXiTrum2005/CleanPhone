package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.vg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class C0629vg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC0510p4 f30869a;

    public C0629vg(InterfaceC0510p4 currentTimeProvider) {
        kotlin.jvm.internal.n.f(currentTimeProvider, "currentTimeProvider");
        this.f30869a = currentTimeProvider;
    }

    public final boolean a(long j10, long j11) {
        long jA = this.f30869a.a();
        return j11 <= 0 || j10 <= 0 || jA < j10 || jA - j10 > j11;
    }
}
