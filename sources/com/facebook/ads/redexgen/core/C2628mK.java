package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.extractor.mkv.MatroskaExtractor;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2628mK implements InterfaceC1440Ik {
    public final /* synthetic */ MatroskaExtractor A00;

    public C2628mK(MatroskaExtractor matroskaExtractor) {
        this.A00 = matroskaExtractor;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1440Ik
    public final void A4i(int i2, int i3, InterfaceC2651ms interfaceC2651ms) throws IOException {
        this.A00.A0U(i2, i3, interfaceC2651ms);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1440Ik
    public final void A6N(int i2) throws C3K {
        this.A00.A0S(i2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1440Ik
    public final void A6a(int i2, double d) throws C3K {
        this.A00.A0T(i2, d);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1440Ik
    public final int A7u(int i2) {
        return this.A00.A0R(i2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1440Ik
    public final void AAH(int i2, long j) throws C3K {
        this.A00.A0V(i2, j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1440Ik
    public final boolean AAW(int i2) {
        return this.A00.A0Y(i2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1440Ik
    public final void AK9(int i2, long j, long j2) throws C3K {
        this.A00.A0W(i2, j, j2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1440Ik
    public final void AKK(int i2, String str) throws C3K {
        this.A00.A0X(i2, str);
    }
}
