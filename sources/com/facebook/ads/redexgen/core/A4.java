package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class A4 implements InterfaceC10713l {
    public final C12279y A00;
    public final C2738oJ A01;
    public final InterfaceC10703k[] A02;

    public A4(InterfaceC10703k... interfaceC10703kArr) {
        this(interfaceC10703kArr, new C12279y(), new C2738oJ());
    }

    public A4(InterfaceC10703k[] interfaceC10703kArr, C12279y c12279y, C2738oJ c2738oJ) {
        this.A02 = new InterfaceC10703k[interfaceC10703kArr.length + 2];
        System.arraycopy(interfaceC10703kArr, 0, this.A02, 0, interfaceC10703kArr.length);
        this.A00 = c12279y;
        this.A01 = c2738oJ;
        this.A02[interfaceC10703kArr.length] = c12279y;
        this.A02[interfaceC10703kArr.length + 1] = c2738oJ;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC10713l
    public final C2839px A4F(C2839px c2839px) {
        this.A01.A02(c2839px.A01);
        this.A01.A01(c2839px.A00);
        return c2839px;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC10713l
    public final boolean A4G(boolean z2) {
        this.A00.A0D(z2);
        return z2;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC10713l
    public final InterfaceC10703k[] A6z() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC10713l
    public final long A8U(long j) {
        return this.A01.A00(j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC10713l
    public final long A98() {
        return this.A00.A0C();
    }
}
