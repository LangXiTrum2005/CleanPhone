package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;
import org.jacoco.core.data.ExecutionDataWriter;
import org.jacoco.core.runtime.RemoteControlWriter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.al, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1764al {
    public static byte[] A02;
    public boolean A00 = true;
    public final M3 A01;

    static {
        A02();
    }

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 85);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{13, 26, 26, 45, 66, ExecutionDataWriter.BLOCK_SESSIONINFO, 59, 57, 15, 59, 58, RemoteControlWriter.BLOCK_CMDDUMP, 49, 58, RemoteControlWriter.BLOCK_CMDDUMP, 24, 59, 45, 48, 49, 48, 6, 20, 33, 33, 52, 73, 31, 66, 52, 55, 24, 73, 56, 65, 71, 24, 65, 55, 13, -52, -39, -39, -20, 1, -35, -16, -2, -5, -6, -7, -2, -16, -48, -7, -17, -59, 34, 27, 21, ExecutionDataWriter.BLOCK_SESSIONINFO, -44, -44, 18, 33, 26, 15, RemoteControlWriter.BLOCK_CMDOK, 21, 27, 26, -44, -43, -52, 39, RemoteControlWriter.BLOCK_CMDOK, 30, 37, -52, 39, -52, -52, 21, 18, -52, -44, -51, 35, 21, 26, ExecutionDataWriter.BLOCK_SESSIONINFO, 27, 35, -38, 28, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 30, 18, 27, 30, 25, 13, 26, 15, ExecutionDataWriter.BLOCK_EXECUTIONDATA, -52, 40, 40, -52, -51, 35, 21, 26, ExecutionDataWriter.BLOCK_SESSIONINFO, 27, 35, -38, 28, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 30, 18, 27, 30, 25, 13, 26, 15, ExecutionDataWriter.BLOCK_EXECUTIONDATA, -38, RemoteControlWriter.BLOCK_CMDOK, 21, 25, 21, 26, 19, -52, 40, 40, -52, -51, ExecutionDataWriter.BLOCK_SESSIONINFO, 27, 15, 33, 25, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 26, RemoteControlWriter.BLOCK_CMDOK, -52, -52, -52, -52, -52, -52, -52, 40, 40, -52, -51, ExecutionDataWriter.BLOCK_SESSIONINFO, 27, 15, 33, 25, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 26, RemoteControlWriter.BLOCK_CMDOK, -38, 14, 27, ExecutionDataWriter.BLOCK_SESSIONINFO, 37, -52, 40, 40, -52, -51, ExecutionDataWriter.BLOCK_SESSIONINFO, 27, 15, 33, 25, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 26, RemoteControlWriter.BLOCK_CMDOK, -38, 14, 27, ExecutionDataWriter.BLOCK_SESSIONINFO, 37, -38, 15, 20, 21, 24, ExecutionDataWriter.BLOCK_SESSIONINFO, 30, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 26, -52, -52, -52, -52, -52, -52, -52, 40, 40, -52, ExecutionDataWriter.BLOCK_SESSIONINFO, 27, 15, 33, 25, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 26, RemoteControlWriter.BLOCK_CMDOK, -38, 14, 27, ExecutionDataWriter.BLOCK_SESSIONINFO, 37, -38, 15, 20, 21, 24, ExecutionDataWriter.BLOCK_SESSIONINFO, 30, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 26, -38, 24, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 26, 19, RemoteControlWriter.BLOCK_CMDOK, 20, -52, -24, -52, -35, -43, -52, 39, -52, -52, -52, -52, 30, ExecutionDataWriter.BLOCK_EXECUTIONDATA, RemoteControlWriter.BLOCK_CMDOK, 33, 30, 26, -25, -52, -52, 41, -52, -52, 34, 13, 30, -52, 26, 34, RemoteControlWriter.BLOCK_CMDOK, 21, 25, 21, 26, 19, 11, 11, 13, 26, 11, RemoteControlWriter.BLOCK_CMDOK, -52, -23, -52, 35, 21, 26, ExecutionDataWriter.BLOCK_SESSIONINFO, 27, 35, -38, 28, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 30, 18, 27, 30, 25, 13, 26, 15, ExecutionDataWriter.BLOCK_EXECUTIONDATA, -38, RemoteControlWriter.BLOCK_CMDOK, 21, 25, 21, 26, 19, -25, -52, -52, 21, 18, -52, -44, 26, 34, RemoteControlWriter.BLOCK_CMDOK, 21, 25, 21, 26, 19, 11, 11, 13, 26, 11, RemoteControlWriter.BLOCK_CMDOK, -38, 30, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 31, 28, 27, 26, 31, ExecutionDataWriter.BLOCK_EXECUTIONDATA, -15, 26, ExecutionDataWriter.BLOCK_SESSIONINFO, -52, -22, -52, -36, -43, -52, 39, -52, -52, -52, -52, 15, 27, 26, 31, 27, 24, ExecutionDataWriter.BLOCK_EXECUTIONDATA, -38, 24, 27, 19, -44, -45, -19, -6, -6, 13, 34, -2, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 31, 28, 27, 26, 31, ExecutionDataWriter.BLOCK_EXECUTIONDATA, -15, 26, ExecutionDataWriter.BLOCK_SESSIONINFO, -26, -45, -52, -41, -52, 26, 34, RemoteControlWriter.BLOCK_CMDOK, 21, 25, 21, 26, 19, 11, 11, 13, 26, 11, RemoteControlWriter.BLOCK_CMDOK, -38, 30, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 31, 28, 27, 26, 31, ExecutionDataWriter.BLOCK_EXECUTIONDATA, -15, 26, ExecutionDataWriter.BLOCK_SESSIONINFO, -43, -25, -52, -52, 41, -52, -52, 21, 18, -52, -44, 26, 34, RemoteControlWriter.BLOCK_CMDOK, 21, 25, 21, 26, 19, 11, 11, 13, 26, 11, RemoteControlWriter.BLOCK_CMDOK, -38, ExecutionDataWriter.BLOCK_SESSIONINFO, 27, 25, -17, 27, 26, RemoteControlWriter.BLOCK_CMDOK, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 26, RemoteControlWriter.BLOCK_CMDOK, -8, 27, 13, ExecutionDataWriter.BLOCK_SESSIONINFO, ExecutionDataWriter.BLOCK_EXECUTIONDATA, ExecutionDataWriter.BLOCK_SESSIONINFO, -15, 34, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 26, RemoteControlWriter.BLOCK_CMDOK, -1, RemoteControlWriter.BLOCK_CMDOK, 13, 30, RemoteControlWriter.BLOCK_CMDOK, -52, -22, -52, -36, -43, -52, 39, -52, -52, -52, -52, 15, 27, 26, 31, 27, 24, ExecutionDataWriter.BLOCK_EXECUTIONDATA, -38, 24, 27, 19, -44, -45, -19, -6, -6, 13, 34, -16, 27, 25, -17, 27, 26, RemoteControlWriter.BLOCK_CMDOK, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 26, RemoteControlWriter.BLOCK_CMDOK, -8, 27, 13, ExecutionDataWriter.BLOCK_SESSIONINFO, ExecutionDataWriter.BLOCK_EXECUTIONDATA, ExecutionDataWriter.BLOCK_SESSIONINFO, -26, -45, -52, -41, -52, 26, 34, RemoteControlWriter.BLOCK_CMDOK, 21, 25, 21, 26, 19, 11, 11, 13, 26, 11, RemoteControlWriter.BLOCK_CMDOK, -38, ExecutionDataWriter.BLOCK_SESSIONINFO, 27, 25, -17, 27, 26, RemoteControlWriter.BLOCK_CMDOK, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 26, RemoteControlWriter.BLOCK_CMDOK, -8, 27, 13, ExecutionDataWriter.BLOCK_SESSIONINFO, ExecutionDataWriter.BLOCK_EXECUTIONDATA, ExecutionDataWriter.BLOCK_SESSIONINFO, -15, 34, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 26, RemoteControlWriter.BLOCK_CMDOK, -1, RemoteControlWriter.BLOCK_CMDOK, 13, 30, RemoteControlWriter.BLOCK_CMDOK, -43, -25, -52, -52, 41, -52, -52, 21, 18, -52, -44, 26, 34, RemoteControlWriter.BLOCK_CMDOK, 21, 25, 21, 26, 19, 11, 11, 13, 26, 11, RemoteControlWriter.BLOCK_CMDOK, -38, 24, 27, 13, ExecutionDataWriter.BLOCK_SESSIONINFO, -15, 34, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 26, RemoteControlWriter.BLOCK_CMDOK, -15, 26, ExecutionDataWriter.BLOCK_SESSIONINFO, -52, -22, -52, -36, -43, -52, 39, -52, -52, -52, -52, 15, 27, 26, 31, 27, 24, ExecutionDataWriter.BLOCK_EXECUTIONDATA, -38, 24, 27, 19, -44, -45, -19, -6, -6, 13, 34, -8, 27, 13, ExecutionDataWriter.BLOCK_SESSIONINFO, -15, 34, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 26, RemoteControlWriter.BLOCK_CMDOK, -15, 26, ExecutionDataWriter.BLOCK_SESSIONINFO, -26, -45, -52, -41, -52, 26, 34, RemoteControlWriter.BLOCK_CMDOK, 21, 25, 21, 26, 19, 11, 11, 13, 26, 11, RemoteControlWriter.BLOCK_CMDOK, -38, 24, 27, 13, ExecutionDataWriter.BLOCK_SESSIONINFO, -15, 34, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 26, RemoteControlWriter.BLOCK_CMDOK, -15, 26, ExecutionDataWriter.BLOCK_SESSIONINFO, -43, -25, -52, -52, 41, 41, -52, 15, 13, RemoteControlWriter.BLOCK_CMDOK, 15, 20, -44, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 30, 30, -43, -52, 39, -52, -52, 15, 27, 26, 31, 27, 24, ExecutionDataWriter.BLOCK_EXECUTIONDATA, -38, 24, 27, 19, -44, -45, 13, 26, 11, 26, 13, 34, 21, 19, 13, RemoteControlWriter.BLOCK_CMDOK, 21, 27, 26, 11, RemoteControlWriter.BLOCK_CMDOK, 21, 25, 21, 26, 19, 11, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 30, 30, 27, 30, -26, -45, -52, -41, -52, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 30, 30, -38, 25, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 31, 31, 13, 19, ExecutionDataWriter.BLOCK_EXECUTIONDATA, -43, -25, 41, 41, -43, -44, -43, -43, -25};
    }

    public C1764al(M3 m3) {
        this.A01 = m3;
    }

    public static long A00(String str, String str2) {
        String strSubstring = str.substring(str2.length());
        if (TextUtils.isEmpty(strSubstring)) {
            return -1L;
        }
        try {
            long j = Long.parseLong(strSubstring);
            if (j < 0) {
                return -1L;
            }
            return j;
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void A03() {
        if (!this.A00) {
            return;
        }
        if (this.A01.canGoBack() || this.A01.canGoForward()) {
            this.A00 = false;
        } else {
            this.A01.A0I(A01(57, 693, 87));
        }
    }

    public final void A04(String str) {
        if (!this.A00) {
            return;
        }
        String strA01 = A01(40, 17, 54);
        if (str.startsWith(strA01)) {
            this.A01.A0M(A00(str, strA01));
            return;
        }
        String strA02 = A01(0, 22, 119);
        if (str.startsWith(strA02)) {
            this.A01.A0K(A00(str, strA02));
            return;
        }
        String strA03 = A01(22, 18, 126);
        if (!str.startsWith(strA03)) {
            return;
        }
        this.A01.A0L(A00(str, strA03));
    }

    public final void A05(boolean z) {
        this.A00 = z;
    }
}
