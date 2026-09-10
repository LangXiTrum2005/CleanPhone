package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C2304gm implements InterfaceC1519Lm {
    public static byte[] A01;
    public static String[] A02 = {"DkadTd3hzRbbbOHMxE7l2HcIgF77c2Wg", "0ZuZJmAU8cZIcQf3szyGmXM5AilOTJtQ", "s7OtZpyonCiYFMYFU1WCjmQvHXym6FPj", "3vySfQzjuhiXchKud6RTPthf0ulaYdWV", "CDvhYqwZm7dYJUP65EPDHmFcAmisUun7", "F", "FueLju8lXT0mR7zmJE5", "4fFvsSsvSh6WJapTHyxRGbQ9SIVR6447"};
    public final /* synthetic */ C2296ge A00;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 23);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-89, -85, -97, -91, -93};
        String[] strArr = A02;
        if (strArr[4].charAt(11) == strArr[0].charAt(11)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A02;
        strArr2[4] = "8YVOAkqjlCZIfPO923uAjm7vB9HJVDjx";
        strArr2[0] = "zjuPMStvlm1D7VGZIKzQB2odE0473uv0";
        A01 = bArr;
    }

    static {
        A01();
    }

    public C2304gm(C2296ge c2296ge) {
        this.A00 = c2296ge;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1519Lm
    public final void AB4(Throwable th) {
        this.A00.A08().ABC(A00(0, 5, 39), AbstractC1712Td.A1e, new C1713Te(th));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1519Lm
    public final void ABI(Throwable th) {
        this.A00.A08().ABC(A00(0, 5, 39), AbstractC1712Td.A1g, new C1713Te(th));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1519Lm
    public final void AHU(String str, int i2, String str2, Long l2, Long l3, LX lx) {
        T0.A05(this.A00, lx.A06, lx.A08, lx.A09, lx.A07, lx.A03, i2, str2, l2, l3, null);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1519Lm
    public final void AHV(String str, boolean z2, LX lx) {
        T0.A04(this.A00, new C1708Sz(lx.A06, lx.A08, lx.A07, lx.A03, str), z2);
    }
}
