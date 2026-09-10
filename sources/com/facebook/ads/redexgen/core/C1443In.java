package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.In, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C1443In extends AbstractC2244fo {
    public static byte[] A01;
    public final /* synthetic */ AbstractC1439Ij A00;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 78);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A01 = new byte[]{-37, -32, -39, -31, -26, -35, -36, -41, -39, -36, -41, -31, -26, -36, -35, -16};
    }

    public C1443In(AbstractC1439Ij abstractC1439Ij) {
        this.A00 = abstractC1439Ij;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC2244fo
    public final void A03() {
        if (!this.A00.A0A.A07()) {
            this.A00.A0A.A05();
            if (!TextUtils.isEmpty(this.A00.A06.A2E())) {
                Map<String, String> mapA05 = new C1957b9().A03(this.A00.A0D).A02(this.A00.A0A).A04(this.A00.A06.A0z()).A05();
                mapA05.put(A00(0, 16, 42), A00(0, 0, 96) + this.A00.A02);
                this.A00.A08.ABJ(this.A00.A06.A2E(), mapA05);
                C1796Wl.A00(this.A00.A07).A0E(this.A00.A0C.A8l(), this.A00.A06.A2E());
                C1564Ng.A07(this.A00.A06.A2A(), this.A00.A07);
                this.A00.A07.A0F().A3L();
                if (!this.A00.A04) {
                    AbstractC1584Oa.A02(this.A00.A06.A0y(), AbstractC1820Xm.A00(this.A00.A06.A10()));
                }
                if (!this.A00.A05) {
                    this.A00.A0B.A4j(this.A00.A0C.A8G());
                }
            }
        }
    }
}
