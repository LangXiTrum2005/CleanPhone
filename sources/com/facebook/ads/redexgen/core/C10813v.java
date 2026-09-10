package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C10813v extends AbstractC1320Dt {
    public static String[] A01 = {"A0hxmHyocA20uKbzLNrX1cuoBFAzY21E", "I9xoCKjiIf8OmMJxcwGdtcNw1YuiDvi3", "dl", "8cu3hn6v04Mabo0DRb3BoKxPmV6m17RH", "M3PfsQ0uQOYBe23ut3RBur7M821ZKE4o", "dBLXd4nh7JPFvxg4r1eMmoTDEY", "dzagYupPsp4H2uhompZ2DySoLx14PfZd", "Z1qzuvaE1jq9Ec95ZFgzh3McR3fZkyWy"};
    public final /* synthetic */ C1313Dm A00;

    public C10813v(C1313Dm c1313Dm) {
        this.A00 = c1313Dm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.UN
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final void A03(C1321Du c1321Du) {
        if (this.A00.A01 != null && !this.A00.A05 && c1321Du.A00().getAction() == 0) {
            C1313Dm c1313Dm = this.A00;
            String[] strArr = A01;
            if (strArr[5].length() == strArr[2].length()) {
                throw new RuntimeException();
            }
            A01[4] = "8qKCS4QoQxaUoDKBRazWJt0HJmuP0GoR";
            c1313Dm.A07.removeCallbacksAndMessages(null);
            if (this.A00.A0G(EnumC2213fJ.A04)) {
                this.A00.A03();
                C1313Dm c1313Dm2 = this.A00;
                if (A01[3].charAt(1) != 'x') {
                    A01[3] = "krfS0sgwBFPIM38aK2Y5K2a50FO4BQxK";
                    c1313Dm2.A06(true, false);
                } else {
                    c1313Dm2.A06(true, false);
                }
            }
            if (this.A00.A04) {
                this.A00.A07.postDelayed(new C1314Dn(this), this.A00.A00);
            }
        }
    }
}
