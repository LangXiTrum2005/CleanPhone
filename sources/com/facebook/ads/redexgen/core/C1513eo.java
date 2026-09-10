package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1513eo implements CG {
    public static String[] A01 = {"", "vSeS2rx23zUd4am5Wdo", "UtlZDzt7", "dNEruPHPdkyj182N7GwirLXq8Db2eecB", "b1VGcsOgsecYYY6uN1zNid8VodysKnsR", "yg", "RqC1uxvv784HDfNbZXUq5U9jCsQW0kUg", "5jFX4DLWV5nBObgEbVC73yk5ncCVY3Kv"};
    public final /* synthetic */ L1 A00;

    public C1513eo(L1 l1) {
        this.A00 = l1;
    }

    @Override // com.facebook.ads.redexgen.core.CG
    public final void ACi() {
        this.A00.A0F.ACr(this.A00.A0A);
        this.A00.A0F.ACS();
    }

    @Override // com.facebook.ads.redexgen.core.CG
    public final void AEg(float f) {
        int i;
        float duration = (this.A00.A0A - f) + (this.A00.A0V ? 0 : this.A00.A0I.getDuration());
        L1 l1 = this.A00;
        if (A01[4].charAt(2) != 'V') {
            throw new RuntimeException();
        }
        A01[7] = "iUY2DHYRiluzyO05ci2O9gzQrrq6c2GK";
        if (!l1.A0V) {
            i = this.A00.A09;
        } else {
            L1 l2 = this.A00;
            String[] strArr = A01;
            if (strArr[5].length() != strArr[1].length()) {
                A01[4] = "jZVNpY3PkhFJgbxs6TiKD4bRtw9FJmgD";
                i = l2.A0A;
            } else {
                throw new RuntimeException();
            }
        }
        float seenTime = i;
        this.A00.A0F.AJi(duration / seenTime);
    }
}
