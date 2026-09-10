package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.jH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2281jH implements InterfaceC1408Nt {
    public static String[] A07 = {"LaTcnwnUfzgLTffZJQ1IPucRbglpEgMo", "12hOZJfgSqwHBnuTqXHxpHxEQ0NbZO7A", "Dr9pHE3G5odEHWCsCqxBSNpdFpwa86Mh", "MDWd5GjifHIGoqp8wS2KmhLcZ8", "Ozio236b3SA3ZtX", "C3UkekSSOdUqAnfYGByVev7l4a4YpLBv", "Q070rE4WAmrDPncHn0R1JG2tySYrh7TO", ""};
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC2296jd A01;
    public final /* synthetic */ C2290jT A02;
    public final /* synthetic */ InterfaceC1408Nt A03;
    public final /* synthetic */ C1409Nu A04;
    public final /* synthetic */ C2131gi A05;
    public final /* synthetic */ EnumSet A06;

    public C2281jH(C1409Nu c1409Nu, C2131gi c2131gi, AbstractC2296jd abstractC2296jd, C2290jT c2290jT, int i, InterfaceC1408Nt interfaceC1408Nt, EnumSet enumSet) {
        this.A04 = c1409Nu;
        this.A05 = c2131gi;
        this.A01 = abstractC2296jd;
        this.A02 = c2290jT;
        this.A00 = i;
        this.A03 = interfaceC1408Nt;
        this.A06 = enumSet;
    }

    private final void A00() {
        if (this.A00 + 1 < this.A02.A23()) {
            this.A04.A0A(this.A05, this.A06, this.A02, this.A02.A27(this.A00 + 1), this.A00 + 1, this.A03);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1408Nt
    public final void ACo(AdError adError) {
        if (this.A00 == 0) {
            this.A03.ACo(adError);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1408Nt
    public final void ACp() {
        this.A05.A01().AJE(this.A01.A2E(), this.A02.A28());
        if (this.A00 == this.A02.A25()) {
            InterfaceC1408Nt interfaceC1408Nt = this.A03;
            String[] strArr = A07;
            if (strArr[5].charAt(13) != strArr[6].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "Mfrds6r17BKRZSfVfcuH4MZ0YR";
            strArr2[4] = "cdrsota1fCopt7F";
            interfaceC1408Nt.ACp();
        }
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1408Nt
    public final void AHY() {
        if (this.A00 == 0) {
            this.A03.AHY();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1408Nt
    public final void AKX() {
        if (this.A00 == 0) {
            this.A03.AKX();
        }
    }
}
