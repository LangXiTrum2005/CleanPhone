package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1506eh {
    public static String[] A02 = {"Bn", "9DA", "9mAqQdDlXtiaQJsyDKizhzwS8miA0rsR", "8fIMAkA79t8k", "YVZ9WAhxf3KC5bp7jPpNZyngG4QC8uk7", "Vc9epR1HSseJWmGE9rg", "gVweXsC1OR4JfQ7LaxgqEl28x0x6GhkR", "saOb5aNxIMPALRV3Lvi"};
    public final long A00;
    public final long A01;

    public C1506eh(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public final boolean A00(long j, long j2) {
        if (this.A00 != -1) {
            return j2 != -1 && this.A01 <= j && j + j2 <= this.A01 + this.A00;
        }
        long j3 = this.A01;
        String[] strArr = A02;
        if (strArr[5].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[3] = "hFw0670rI05U";
        strArr2[0] = "7z";
        return j >= j3;
    }

    public final boolean A01(long j, long j2) {
        if (this.A01 > j) {
            return j2 == -1 || j + j2 > this.A01;
        }
        long j3 = this.A00;
        String[] strArr = A02;
        if (strArr[3].length() == strArr[0].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[1] = "f7q";
        strArr2[4] = "y1fWxdtZevrTDhEmOw2Z7DfHzy1jnh7l";
        return j3 == -1 || this.A01 + this.A00 > j;
    }
}
