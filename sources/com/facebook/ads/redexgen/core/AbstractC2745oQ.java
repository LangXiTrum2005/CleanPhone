package com.facebook.ads.redexgen.core;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2745oQ implements InterfaceC10703k {
    public boolean A04;
    public ByteBuffer A02 = InterfaceC10703k.A00;
    public ByteBuffer A03 = InterfaceC10703k.A00;
    public C10683i A00 = C10683i.A05;
    public C10683i A01 = C10683i.A05;
    public C10683i A05 = C10683i.A05;
    public C10683i A06 = C10683i.A05;

    public abstract C10683i A09(C10683i c10683i) throws C10693j;

    public final ByteBuffer A00(int i2) {
        if (this.A02.capacity() < i2) {
            this.A02 = ByteBuffer.allocateDirect(i2).order(ByteOrder.nativeOrder());
        } else {
            this.A02.clear();
        }
        this.A03 = this.A02;
        return this.A02;
    }

    public final boolean A01() {
        return this.A03.hasRemaining();
    }

    public void A0A() {
    }

    public void A0B() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC10703k
    public final C10683i A57(C10683i c10683i) throws C10693j {
        this.A00 = c10683i;
        this.A01 = A09(c10683i);
        return AAL() ? this.A01 : C10683i.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC10703k
    public ByteBuffer A8d() {
        ByteBuffer byteBuffer = this.A03;
        ByteBuffer outputBuffer = InterfaceC10703k.A00;
        this.A03 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC10703k
    public boolean AAL() {
        return this.A01 != C10683i.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC10703k
    public boolean AAP() {
        return this.A04 && this.A03 == InterfaceC10703k.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC10703k
    public final void AHG() {
        this.A04 = true;
        A0B();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC10703k
    public final void flush() {
        this.A03 = InterfaceC10703k.A00;
        this.A04 = false;
        this.A05 = this.A00;
        this.A06 = this.A01;
        A0A();
    }
}
