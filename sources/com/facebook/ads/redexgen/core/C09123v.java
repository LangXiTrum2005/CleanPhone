package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C09123v extends AbstractC1151Dt {
    public static String[] A01 = {"A0hxmHyocA20uKbzLNrX1cuoBFAzY21E", "I9xoCKjiIf8OmMJxcwGdtcNw1YuiDvi3", "dl", "8cu3hn6v04Mabo0DRb3BoKxPmV6m17RH", "M3PfsQ0uQOYBe23ut3RBur7M821ZKE4o", "dBLXd4nh7JPFvxg4r1eMmoTDEY", "dzagYupPsp4H2uhompZ2DySoLx14PfZd", "Z1qzuvaE1jq9Ec95ZFgzh3McR3fZkyWy"};
    public final /* synthetic */ C1144Dm A00;

    public C09123v(C1144Dm c1144Dm) {
        this.A00 = c1144Dm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.UN
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C1152Du c1152Du) {
        if (this.A00.A01 != null && !this.A00.A05 && c1152Du.A00().getAction() == 0) {
            C1144Dm c1144Dm = this.A00;
            String[] strArr = A01;
            if (strArr[5].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A01[4] = "8qKCS4QoQxaUoDKBRazWJt0HJmuP0GoR";
            c1144Dm.A07.removeCallbacksAndMessages(null);
            if (this.A00.A0G(EnumC2044fJ.A04)) {
                this.A00.A03();
                C1144Dm c1144Dm2 = this.A00;
                if (A01[3].charAt(1) != 'x') {
                    A01[3] = "krfS0sgwBFPIM38aK2Y5K2a50FO4BQxK";
                    c1144Dm2.A06(true, false);
                } else {
                    c1144Dm2.A06(true, false);
                }
            }
            if (this.A00.A04) {
                this.A00.A07.postDelayed(new C1145Dn(this), this.A00.A00);
            }
        }
    }
}
