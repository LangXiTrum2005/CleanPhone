package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdErrorType;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.mE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1960mE extends BY {
    public static byte[] A05;
    public static String[] A06 = {"oXE2C4io4CadFj", "SLi30xh9eEh4aNBWy87TaVqEnPCRDurp", "eis5RYtigxDn0kuTv6xEcFlmBnmepzOu", "7zfUioi34Z20h4XlF6Svx2fywMYufGtL", "3ch3CCIwylkue97fKtVgZja7Sq2vQTLD", "WcYwUSLGNymzaUHoHnyTUfb", "YL0d97V0Q3k08jxWq5XvLfGqClGTo7H3", "GhmWEJEURttFfnvoo6VO1smQO3ReaFoJ"};
    public final /* synthetic */ long A00;
    public final /* synthetic */ C2002mv A01;
    public final /* synthetic */ AnonymousClass38 A02;
    public final /* synthetic */ C0892Mj A03;
    public final /* synthetic */ C05588r A04;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 28);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A05 = new byte[]{-97, -93, -59, -24, -27, -12, -8, -23, -10, -92, -8, -19, -15, -23, -13, -7, -8, -78, -74, -61, -61, -64, -61, -73, -67, -79, -4, -15, -11, -19, -9, -3, -4};
        String[] strArr = A06;
        if (strArr[6].charAt(10) != strArr[4].charAt(10)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[6] = "j4Ns4hKT00kRsJcq4mYGiSVRR39xkXLE";
        strArr2[4] = "aj4N2GTd0jkYX56rliTu9cnftT6aRfqb";
    }

    static {
        A04();
    }

    public C1960mE(C0892Mj c0892Mj, AnonymousClass38 anonymousClass38, C2002mv c2002mv, long j, C05588r c05588r) {
        this.A03 = c0892Mj;
        this.A02 = anonymousClass38;
        this.A01 = c2002mv;
        this.A00 = j;
        this.A04 = c05588r;
    }

    @Override // com.facebook.ads.redexgen.core.BY
    public final void A05() {
        this.A03.A0T(this.A02);
        this.A03.A0Q(this.A01);
        Map mapA01 = this.A03.A01(this.A00);
        mapA01.put(A01(18, 5, 53), A01(0, 2, 86));
        mapA01.put(A01(23, 3, 46), A01(26, 7, 108));
        this.A03.A05(this.A04.A03(EnumC05628v.A04), mapA01);
        this.A03.AD4(new C0597Ag(AdErrorType.NETWORK_ERROR, A01(2, 16, 104)));
    }
}
