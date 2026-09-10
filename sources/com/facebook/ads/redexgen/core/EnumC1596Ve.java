package com.facebook.ads.redexgen.core;

import com.google.android.gms.ads.AdSize;
import java.util.Arrays;
import javax.annotation.Nullable;
import org.jacoco.core.data.ExecutionDataWriter;
import org.jacoco.core.runtime.RemoteControlWriter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ve, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public enum EnumC1596Ve {
    A06(-1, 100, 1, 0),
    A07(-1, 120, 2, 1),
    A08(-1, AdSize.MEDIUM_RECTANGLE_WIDTH, 3, 2),
    A09(-1, 400, 4, 3),
    A0A(-1, 50, 5, 4),
    A0B(-1, -1, 6, 5);

    public static byte[] A04;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;

    public static String A01(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 77);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{ExecutionDataWriter.BLOCK_SESSIONINFO, 29, ExecutionDataWriter.BLOCK_EXECUTIONDATA, 31, ExecutionDataWriter.BLOCK_SESSIONINFO, 12, 7, 105, 104, 104, 95, 82, 94, 80, 95, 67, 72, 38, 37, 39, 91, 86, 90, 84, 91, 71, 76, RemoteControlWriter.BLOCK_CMDOK, 35, 35, 115, 126, 114, 124, 115, 111, 100, 15, 11, 11, 91, 86, 90, 84, 91, 71, 76, 38, 35, 82, 69, 67, 84, 95, 68, 89, 78, 65, 77, 73, 67};
    }

    static {
        A02();
    }

    EnumC1596Ve(int i, int i2, int i3, int i4) {
        this.A03 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A00 = i4;
    }

    @Nullable
    public static EnumC1596Ve A00(int i) {
        for (EnumC1596Ve enumC1596Ve : values()) {
            if (enumC1596Ve.A00 == i) {
                return enumC1596Ve;
            }
        }
        return null;
    }

    public final int A04() {
        return this.A01;
    }

    public final int A05() {
        return this.A02;
    }

    public final int A06() {
        return this.A03;
    }
}
