package com.facebook.ads.redexgen.core;

import android.media.MediaFormat;
import com.google.android.exoplayer2.ColorInfo;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1563fd {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 18);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{-83, -71, -74, -71, -68, 119, -68, -85, -72, -79, -81, -33, -21, -24, -21, -18, -87, -17, -16, -35, -22, -32, -35, -18, -32, -108, -96, -99, -96, -93, 94, -91, -93, -110, -97, -92, -105, -106, -93, -13, 3, -12, -67, -47, -51, -37, -106, -36, -35, -54, -35, -46, -52, -106, -46, -41, -49, -40};
    }

    public static void A02(MediaFormat mediaFormat, ColorInfo colorInfo) {
        if (colorInfo != null) {
            A04(mediaFormat, A00(25, 14, 31), colorInfo.A03);
            A04(mediaFormat, A00(11, 14, 106), colorInfo.A02);
            A04(mediaFormat, A00(0, 11, 56), colorInfo.A01);
            A05(mediaFormat, A00(43, 15, 87), colorInfo.A04);
        }
    }

    public static void A03(MediaFormat mediaFormat, String str, float f) {
        if (f != -1.0f) {
            mediaFormat.setFloat(str, f);
        }
    }

    public static void A04(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    public static void A05(MediaFormat mediaFormat, String str, byte[] bArr) {
        if (bArr != null) {
            mediaFormat.setByteBuffer(str, ByteBuffer.wrap(bArr));
        }
    }

    public static void A06(MediaFormat mediaFormat, List<byte[]> list) {
        for (int i = 0; i < i; i++) {
            mediaFormat.setByteBuffer(A00(39, 4, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE) + i, ByteBuffer.wrap(list.get(i)));
        }
    }
}
