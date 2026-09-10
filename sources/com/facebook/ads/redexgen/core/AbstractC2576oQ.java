package com.facebook.ads.redexgen.core;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.oQ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC2576oQ implements InterfaceC09013k {
    public boolean A04;
    public ByteBuffer A02 = InterfaceC09013k.A00;
    public ByteBuffer A03 = InterfaceC09013k.A00;
    public C08993i A00 = C08993i.A05;
    public C08993i A01 = C08993i.A05;
    public C08993i A05 = C08993i.A05;
    public C08993i A06 = C08993i.A05;

    public abstract C08993i A09(C08993i c08993i) throws C09003j;

    public final ByteBuffer A00(int i) {
        if (this.A02.capacity() < i) {
            this.A02 = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
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

    @Override // com.facebook.ads.redexgen.core.InterfaceC09013k
    public final C08993i A57(C08993i c08993i) throws C09003j {
        this.A00 = c08993i;
        this.A01 = A09(c08993i);
        return AAL() ? this.A01 : C08993i.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09013k
    public ByteBuffer A8d() {
        ByteBuffer byteBuffer = this.A03;
        ByteBuffer outputBuffer = InterfaceC09013k.A00;
        this.A03 = outputBuffer;
        return byteBuffer;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09013k
    public boolean AAL() {
        return this.A01 != C08993i.A05;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09013k
    public boolean AAP() {
        return this.A04 && this.A03 == InterfaceC09013k.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09013k
    public final void AHG() {
        this.A04 = true;
        A0B();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC09013k
    public final void flush() {
        this.A03 = InterfaceC09013k.A00;
        this.A04 = false;
        this.A05 = this.A00;
        this.A06 = this.A01;
        A0A();
    }
}
