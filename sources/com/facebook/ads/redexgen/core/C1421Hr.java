package com.facebook.ads.redexgen.core;

import com.smartdigimkt.a6.d;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Hr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1421Hr implements InterfaceC1938aq {
    public static byte[] A01;
    public static String[] A02 = {"lymitVL5Elx23yNuagrdcc1tj4byFzuO", "OtHhm4I6MY8qhok47NcALtT", "GJmhN4rXhrf709OMeDU9UKBK4KfDlX2Y", "UKN", "ioCWBc07RK8NAgZ7uqzQ2Ov99bHrMaFb", "vsb8Ufoa8H", "zp4FcHB1hqlJdpy7ZALmHMQwB62WRf78", "qbR"};
    public final /* synthetic */ AnonymousClass55 A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) + d.o);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        if (A02[1].length() != 23) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[0] = "68tvMXLM0DzUKrc9PEEpmru8eIlurAzh";
        strArr[2] = "oZlS45uLmtttWs7KR8Y8sKnmk93hftbi";
        A01 = new byte[]{51, 49, 35, 48, 29, 44, 31, 52, 39, 37, 31, 50, 39, 45, 44, 29, 39, 31, 32};
    }

    static {
        A01();
    }

    public C1421Hr(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1938aq
    public final void AF7(String str) {
        this.A00.A0H = false;
        if (this.A00.A05 != null) {
            this.A00.A05.setProgress(100);
        }
        YB.A0O(this.A00.A05, 8);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1938aq
    public final void AF9(String str) {
        this.A00.A0H = true;
        YB.A0O(this.A00.A05, 0);
        if (this.A00.A04 != null) {
            this.A00.A04.setUrl(str);
        }
        if (!this.A00.A0G && this.A00.A01 > 1) {
            this.A00.A0G = true;
            this.A00.A0r(A00(0, 19, 88));
        }
        AnonymousClass55 anonymousClass55 = this.A00;
        if (A02[1].length() != 23) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[7] = "Ijw";
        strArr[3] = "65M";
        AnonymousClass55.A03(anonymousClass55);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1938aq
    public final void AFY(int i2) {
        if (this.A00.A0H && this.A00.A05 != null) {
            this.A00.A05.setProgress(i2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1938aq
    public final void AFb(String str) {
        if (this.A00.A04 != null) {
            this.A00.A04.setTitle(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1938aq
    public final void AFe() {
        ((AbstractC1439Ij) this.A00).A0B.ADJ(14);
    }
}
