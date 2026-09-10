package com.facebook.ads.redexgen.core;

import com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor;
import java.io.IOException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ts, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1068Ts implements InterfaceC1117Vv {
    public final /* synthetic */ MatroskaExtractor A00;

    public C1068Ts(MatroskaExtractor matroskaExtractor) {
        this.A00 = matroskaExtractor;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1117Vv
    public final void A4Y(int i, int i2, WJ wj) throws IOException {
        this.A00.A0U(i, i2, wj);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1117Vv
    public final void A6D(int i) throws Q6 {
        this.A00.A0S(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1117Vv
    public final void A6Q(int i, double d) throws Q6 {
        this.A00.A0T(i, d);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1117Vv
    public final int A7k(int i) {
        return this.A00.A0R(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1117Vv
    public final void AA7(int i, long j) throws Q6 {
        this.A00.A0V(i, j);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1117Vv
    public final boolean AAL(int i) {
        return this.A00.A0Y(i);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1117Vv
    public final void AJE(int i, long j, long j2) throws Q6 {
        this.A00.A0W(i, j, j2);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1117Vv
    public final void AJP(int i, String str) throws Q6 {
        this.A00.A0X(i, str);
    }
}
