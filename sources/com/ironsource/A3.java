package com.ironsource;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class A3 implements InterfaceC0513p7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f25608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Integer f25609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final H3 f25610c;

    public A3(Boolean bool, Integer num, H3 h7) {
        this.f25608a = bool;
        this.f25609b = num;
        this.f25610c = h7;
    }

    @Override // com.ironsource.InterfaceC0513p7
    public Object a() {
        Boolean bool = this.f25608a;
        if (bool == null) {
            return t9.e.c(new Exception("enabled flag is not provided or invalid"));
        }
        if (!bool.booleanValue()) {
            return Boolean.FALSE;
        }
        Integer num = this.f25609b;
        if (num == null || num.intValue() <= 0) {
            return t9.e.c(new Exception("limit flag is not provided or invalid"));
        }
        return this.f25610c == null ? t9.e.c(new Exception("unit flag is not provided or invalid")) : Boolean.TRUE;
    }
}
