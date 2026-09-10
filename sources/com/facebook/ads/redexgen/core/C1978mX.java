package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import java.util.EnumSet;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1978mX implements InterfaceC04092u {
    public static String[] A07 = {"LaTcnwnUfzgLTffZJQ1IPucRbglpEgMo", "12hOZJfgSqwHBnuTqXHxpHxEQ0NbZO7A", "Dr9pHE3G5odEHWCsCqxBSNpdFpwa86Mh", "MDWd5GjifHIGoqp8wS2KmhLcZ8", "Ozio236b3SA3ZtX", "C3UkekSSOdUqAnfYGByVev7l4a4YpLBv", "Q070rE4WAmrDPncHn0R1JG2tySYrh7TO", ""};
    public final /* synthetic */ int A00;
    public final /* synthetic */ AbstractC1984md A01;
    public final /* synthetic */ C1982mb A02;
    public final /* synthetic */ InterfaceC04092u A03;
    public final /* synthetic */ C04102v A04;
    public final /* synthetic */ C1828k1 A05;
    public final /* synthetic */ EnumSet A06;

    public C1978mX(C04102v c04102v, C1828k1 c1828k1, AbstractC1984md abstractC1984md, C1982mb c1982mb, int i, InterfaceC04092u interfaceC04092u, EnumSet enumSet) {
        this.A04 = c04102v;
        this.A05 = c1828k1;
        this.A01 = abstractC1984md;
        this.A02 = c1982mb;
        this.A00 = i;
        this.A03 = interfaceC04092u;
        this.A06 = enumSet;
    }

    private final void A00() {
        if (this.A00 + 1 < this.A02.A1W()) {
            this.A04.A0A(this.A05, this.A06, this.A02, this.A02.A1Z(this.A00 + 1), this.A00 + 1, this.A03);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04092u
    public final void AC8(AdError adError) {
        if (this.A00 == 0) {
            this.A03.AC8(adError);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04092u
    public final void AC9() {
        this.A05.A01().AIK(this.A01.A1g(), this.A02.A1a());
        if (this.A00 == 0) {
            InterfaceC04092u interfaceC04092u = this.A03;
            String[] strArr = A07;
            if (strArr[5].charAt(13) != strArr[6].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A07;
            strArr2[3] = "Mfrds6r17BKRZSfVfcuH4MZ0YR";
            strArr2[4] = "cdrsota1fCopt7F";
            interfaceC04092u.AC9();
        }
        A00();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04092u
    public final void AGg() {
        if (this.A00 == 0) {
            this.A03.AGg();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC04092u
    public final void AJc() {
        if (this.A00 == 0) {
            this.A03.AJc();
        }
    }
}
