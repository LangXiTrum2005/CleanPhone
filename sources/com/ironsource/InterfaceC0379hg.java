package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.hg, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0379hg {
    static /* synthetic */ void a(InterfaceC0379hg interfaceC0379hg, Runnable runnable, long j10, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: postReleaseTask");
        }
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        interfaceC0379hg.a(runnable, j10);
    }

    void a(Runnable runnable);

    void a(Runnable runnable, long j10);
}
