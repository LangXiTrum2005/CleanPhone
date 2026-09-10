package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Uw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1094Uw {
    public static String[] A00 = {"1uRXHx", "KSG9tn3fbAnNGiFq3tIXiv2aqWq9gviK", "", "pDRAePRkugxTBhpwfzRbB7wpcY9eEGfj", "JOOrWhLHkxhBaOMtaxRugg96yD299L9P", "XvPRnHMXVZQRZT8yjPliK3bU3tQIIgPV", "CBe7ptLYmx", ""};

    public static int A00(int i, int i2) {
        switch (i) {
            case 1:
            case 65534:
                int iA03 = AbstractC1600gE.A03(i2);
                String[] strArr = A00;
                if (strArr[4].charAt(13) == strArr[5].charAt(13)) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A00;
                strArr2[4] = "LyihMrYoJZglzyyBQD5zKqMNZCWxunZ7";
                strArr2[5] = "Fna4OdYg0bpdUVv6IzRRCIHKRdR9DHW7";
                return iA03;
            case 3:
                return i2 == 32 ? 4 : 0;
            default:
                return 0;
        }
    }
}
