package com.facebook.ads.redexgen.core;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class XH implements Runnable {
    public static String[] A04 = {"nCRFoG2V5rxtp9CJ0zj2vqX2pOjohwfk", "4wjnoNx3VOTWdL7VvzY4PdOFwDa8aAyk", "NZwRvgeKfVOQj3OAbWBZydUCa0", "QhytIBUnuaSIq9HsTJzjLcd0Gyd", "BSNgfeEt9bBv41mFKDcPuiwW51mPbBL", "ThuVKQMdtpTlOVe04IgNONUKoYEgRLHM", "EXwZjrYuwLfsbcbpnacjwuDYCB43acny", "AVskEroBo8UlfYPInQ7Yx5KSddGfFQyi"};
    public final /* synthetic */ C2296ge A00;
    public final /* synthetic */ InterfaceC1815Xh A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ int[] A03;

    public XH(int[] iArr, String str, C2296ge c2296ge, InterfaceC1815Xh interfaceC1815Xh) {
        this.A03 = iArr;
        this.A02 = str;
        this.A00 = c2296ge;
        this.A01 = interfaceC1815Xh;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            int[] iArr = this.A03;
            iArr[0] = iArr[0] + 1000;
            int i2 = this.A03[0];
            if (A04[5].charAt(0) == 'R') {
                throw new RuntimeException();
            }
            String[] strArr = A04;
            strArr[6] = "K9ogtrTQz9r2EYsYEG2F5l0cYywtmYZ4";
            strArr[7] = "6mL3lrEUp2ULAISFIzSh85ZjlbRVvlWv";
            if (i2 > 600000) {
                XI.A02.removeCallbacks(this);
                XI.A03.remove(this.A02);
            } else {
                if (XI.A08(this.A00.getPackageManager(), this.A02)) {
                    XI.A02.removeCallbacks(this);
                    XI.A03.remove(this.A02);
                    this.A01.AF6(this.A02);
                    return;
                }
                XI.A02.postDelayed(this, 1000L);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
            if (A04[2].length() != 26) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "FQThdvyXjGVQZyAeyGp3f4l1pRfTgr0";
            strArr2[3] = "sqm3iAA5OiJF7R8ZxJPsoNc3WTf";
        }
    }
}
