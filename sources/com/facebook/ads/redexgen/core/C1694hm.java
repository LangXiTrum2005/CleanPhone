package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.hm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1694hm implements DP {
    public static String[] A02 = {"YUGwJzzikBNzfLIllCMdkir2Jyj8DuFq", "ntVfVONdyCctXWp", "AonpNDk7AlTTh7WnvPqW51ITIbVwFUJp", "NJZ9S98WzFijxyBcJxql7T6JOIFmEfw7", "8QFO", "nOxceDp", "zcnAPzBVA2CXXQsDQKs94da1Vf1b77Qu", "s6TvhQwfXdUE9Ss2QaqLkXkKVbAwWXrL"};
    public final /* synthetic */ C04946e A00;
    public final /* synthetic */ AbstractC1690hh A01;

    public C1694hm(AbstractC1690hh abstractC1690hh, C04946e c04946e) {
        this.A01 = abstractC1690hh;
        this.A00 = c04946e;
    }

    @Override // com.facebook.ads.redexgen.core.DP
    public final void AC5(DQ dq) {
        if (dq.getToolbarActionMode() == 8) {
            this.A01.A0W();
            return;
        }
        this.A01.A0D.A04(AE.A07, null);
        if (this.A01.A0e()) {
            return;
        }
        AbstractC1690hh abstractC1690hh = this.A01;
        if (A02[3].charAt(29) != 'f') {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[0] = "pLKL5MIsKfCUMWoMxvxDNCAoAO8BGlnS";
        strArr[7] = "7PsgTAKpTeXTqL7VuWAjeXRdKL6HZN4L";
        if (abstractC1690hh.A0b()) {
            this.A01.A0a(this.A00);
        } else {
            this.A00.finish(1);
        }
    }
}
