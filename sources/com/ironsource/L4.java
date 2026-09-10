package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class L4 implements InterfaceC0513p7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f26487a;

    public L4(Boolean bool) {
        this.f26487a = bool;
    }

    @Override // com.ironsource.InterfaceC0513p7
    public Object a() {
        Boolean bool = this.f26487a;
        return bool == null ? t9.e.c(new Exception("enabled flag is not provided or invalid")) : bool;
    }
}
