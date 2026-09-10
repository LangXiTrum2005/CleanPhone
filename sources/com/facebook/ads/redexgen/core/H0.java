package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class H0 implements XN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractRunnableC1787Wc A01;
    public final /* synthetic */ AbstractC1387Gj A02;
    public final /* synthetic */ DZ A03;

    public H0(AbstractC1387Gj abstractC1387Gj, int i2, DZ dz, AbstractRunnableC1787Wc abstractRunnableC1787Wc) {
        this.A02 = abstractC1387Gj;
        this.A00 = i2;
        this.A03 = dz;
        this.A01 = abstractRunnableC1787Wc;
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void ADS() throws Throwable {
        this.A01.run();
    }

    @Override // com.facebook.ads.redexgen.core.XN
    public final void AFV(float f) {
        this.A02.A09.setProgress(100.0f * (1.0f - (f / this.A00)));
        if (this.A03 != null) {
            DZ dz = this.A03;
            float percentage = this.A00;
            dz.A07((int) ((percentage - f) * 1000.0f));
        }
    }
}
