package com.facebook.ads.redexgen.core;

import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ym, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
@MetaExoPlayerCustomization("Should be final")
public class C1184Ym implements PD {
    public static String[] A05 = {"qQB0oA45HvA5z7", "c6V68HSmHbSKNauVNu2l8j37Km", "ONb5LNCiCHSV8OYAgFZkPlbp4R", "SUQd8emL0wyRps", "0YsYBLVjFtQQ1RismQ", "Hv5MtYdu32hCBlRwlC", "UKrHOUrYAyaJUXSRnRDuYTEWhYQRKQSb", "JQJJATYiY0WXxvs9calNvP14WLZy3SFx"};
    public long A00;
    public long A01;
    public C1193Yv A02 = C1193Yv.A06;
    public boolean A03;
    public final InterfaceC1524ez A04;

    public C1184Ym(InterfaceC1524ez interfaceC1524ez) {
        this.A04 = interfaceC1524ez;
    }

    public void A00() {
        if (!this.A03) {
            this.A00 = this.A04.A69();
            String[] strArr = A05;
            if (strArr[2].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[2] = "knVLFXtpOytCwUG4s1QKNFlwhv";
            strArr2[1] = "cqMcCzQACJbUL3WDmO3HGQoUGy";
            this.A03 = true;
        }
    }

    public void A01() {
        if (this.A03) {
            A02(A8f());
            this.A03 = false;
        }
    }

    public void A02(long j) {
        this.A01 = j;
        if (this.A03) {
            long jA69 = this.A04.A69();
            String[] strArr = A05;
            if (strArr[2].length() != strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[4] = "NoinPkSBMCTDNUdVmv";
            strArr2[5] = "TXklLEQn3V1cVxlAUb";
            this.A00 = jA69;
        }
    }

    @Override // com.facebook.ads.redexgen.core.PD
    public C1193Yv A8c() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.PD
    public long A8f() {
        long elapsedSinceBaseMs = this.A01;
        if (this.A03) {
            long jA69 = this.A04.A69();
            long positionUs = this.A00;
            long j = jA69 - positionUs;
            if (this.A02.A01 == 1.0f) {
                long positionUs2 = AbstractC1600gE.A0O(j);
                return elapsedSinceBaseMs + positionUs2;
            }
            long positionUs3 = this.A02.A03(j);
            return elapsedSinceBaseMs + positionUs3;
        }
        return elapsedSinceBaseMs;
    }

    @Override // com.facebook.ads.redexgen.core.PD
    public void AIj(C1193Yv c1193Yv) {
        if (this.A03) {
            A02(A8f());
        }
        this.A02 = c1193Yv;
    }
}
