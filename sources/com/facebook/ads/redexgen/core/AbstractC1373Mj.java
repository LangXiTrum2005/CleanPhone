package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.util.Arrays;
import org.jacoco.core.data.ExecutionDataWriter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract /* synthetic */ class AbstractC1373Mj {
    public static byte[] A00;

    static {
        A03();
    }

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 53);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A00 = new byte[]{9, 28, 19, 3, ExecutionDataWriter.BLOCK_SESSIONINFO, 9, 18, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 36, 27, 11, 30, ExecutionDataWriter.BLOCK_EXECUTIONDATA, ExecutionDataWriter.BLOCK_SESSIONINFO, 21, 30};
    }

    public static long A00(InterfaceC1374Mk interfaceC1374Mk) {
        return interfaceC1374Mk.A6h(A02(0, 7, 111), -1L);
    }

    public static Uri A01(InterfaceC1374Mk interfaceC1374Mk) {
        String strA6j = interfaceC1374Mk.A6j(A02(7, 9, 119), null);
        if (strA6j == null) {
            return null;
        }
        return Uri.parse(strA6j);
    }
}
