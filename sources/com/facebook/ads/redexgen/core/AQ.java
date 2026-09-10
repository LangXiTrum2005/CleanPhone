package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AQ implements InterfaceC2796pF {
    public static String[] A04 = {"fHQEiP1zlTMmcDhuRJvCUYhlqM3A1WdS", "0xjR5o24wRXCnK6P48nvJnLVp1A7yIdC", "SqWyKblZmsOi3mnFjBlOyIvINI4fuoz1", "GUT90kd8g0iIA", "yfLAFjbfQv", "f1jCtkpjn8LmH02gI7EE0X95Og8KENXi", "pIy67q2NMZ", "VUF0F4IbO37j7MJUWX75PYUeN7L9nYYd"};
    public int A00;
    public C11205i A01;
    public final ArrayList<InterfaceC11315t> A02 = new ArrayList<>(1);
    public final boolean A03;

    @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
    public /* synthetic */ Map A8t() {
        return C5X.A00(this);
    }

    public AQ(boolean z2) {
        this.A03 = z2;
    }

    @MetaExoPlayerCustomization
    private final void A0D(C11205i c11205i, boolean z2) {
        this.A01 = c11205i;
        for (int i2 = 0; i2 < i; i2++) {
            this.A02.get(i2).AGH(this, c11205i, this.A03, z2);
        }
    }

    public final void A0E() {
        C11205i c11205i = (C11205i) C5C.A0f(this.A01);
        for (int i2 = 0; i2 < this.A00; i2++) {
            this.A02.get(i2).AGG(this, c11205i, this.A03);
        }
        this.A01 = null;
    }

    public final void A0F(int i2) {
        C11205i c11205i = (C11205i) C5C.A0f(this.A01);
        for (int i3 = 0; i3 < this.A00; i3++) {
            this.A02.get(i3).ADK(this, c11205i, this.A03, i2);
        }
    }

    public final void A0G(C11205i c11205i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.A02.get(i2);
            if (A04[7].charAt(14) == 'P') {
                throw new RuntimeException();
            }
            A04[2] = "KcnUkvSyZAFqCmq9nk7LLPyjKQRUe1pa";
        }
    }

    public final void A0H(C11205i c11205i) {
        A0D(c11205i, false);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2796pF
    public final void A43(InterfaceC11315t interfaceC11315t) {
        AbstractC10843y.A01(interfaceC11315t);
        if (!this.A02.contains(interfaceC11315t)) {
            this.A02.add(interfaceC11315t);
            this.A00++;
        }
    }
}
