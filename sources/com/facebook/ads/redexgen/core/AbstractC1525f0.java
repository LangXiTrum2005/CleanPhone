package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.f0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1525f0 {
    public static byte[] A00;
    public static final byte[] A01;
    public static final String[] A02;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 27);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A00 = new byte[]{74, 65, 84, 86, 60, 40, 44, 64, 52, 35, 54, 100, 123, 112, 101, 103, cw.k, 112, 101, 103, cw.k, 112, 101, 103, cw.k, 37, 59, 46, 124, 99, 104, 62, 104, 41, 99, 104, 21, 99, 104, 46, 104, 41};
    }

    static {
        A05();
        A01 = new byte[]{0, 0, 0, 1};
        A02 = new String[]{A02(0, 0, 21), A02(5, 1, 114), A02(6, 1, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE), A02(7, 1, 24)};
    }

    public static Pair<Integer, Integer> A00(byte[] bArr) {
        C1576fq c1576fq = new C1576fq(bArr);
        c1576fq.A0f(9);
        int sampleRate = c1576fq.A0I();
        c1576fq.A0f(20);
        return Pair.create(Integer.valueOf(c1576fq.A0L()), Integer.valueOf(sampleRate));
    }

    public static String A01(int i, int i2, int i3) {
        return String.format(A02(8, 17, 78), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    public static String A03(int i, boolean z, int i2, int i3, int[] iArr, int i4) {
        StringBuilder sb = new StringBuilder(AbstractC1600gE.A0n(A02(25, 17, 86), A02[i], Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(z ? 'H' : 'L'), Integer.valueOf(i4)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i5 = 0; i5 < length; i5++) {
            sb.append(String.format(A02(0, 5, EnumC4719u30.ASSET_FAILED_MAX_SPACE_EXCEEDED_VALUE), Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static List<byte[]> A04(boolean z) {
        byte[] bArr = new byte[1];
        if (z) {
            bArr[0] = 1;
        } else {
            bArr[0] = 0;
        }
        return Collections.singletonList(bArr);
    }

    public static boolean A06(List<byte[]> initializationData) {
        return initializationData.size() == 1 && initializationData.get(0).length == 1 && initializationData.get(0)[0] == 1;
    }

    public static byte[] A07(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[A01.length + i2];
        byte[] bArr3 = A01;
        byte[] nalUnit = A01;
        System.arraycopy(bArr3, 0, bArr2, 0, nalUnit.length);
        byte[] nalUnit2 = A01;
        System.arraycopy(bArr, i, bArr2, nalUnit2.length, i2);
        return bArr2;
    }
}
