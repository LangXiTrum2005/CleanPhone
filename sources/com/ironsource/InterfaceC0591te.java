package com.ironsource;

/* JADX INFO: renamed from: com.ironsource.te, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC0591te {
    static /* synthetic */ void a(InterfaceC0591te interfaceC0591te, C0520pe c0520pe, C0300d9 c0300d9, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onInitFailed");
        }
        if ((i10 & 2) != 0) {
            c0300d9 = null;
        }
        interfaceC0591te.a(c0520pe, c0300d9);
    }

    void a(C0484ne c0484ne);

    void a(C0520pe c0520pe, C0300d9 c0300d9);
}
