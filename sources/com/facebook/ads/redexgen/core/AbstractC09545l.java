package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import androidx.media3.common.PlaybackException;
import java.util.Arrays;
import org.jacoco.core.runtime.RemoteControlWriter;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract /* synthetic */ class AbstractC09545l {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) + PlaybackException.ERROR_CODE_CONCURRENT_STREAM_LIMIT);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{52, RemoteControlWriter.BLOCK_CMDDUMP, 57, 56, 69, 54, 73, 69, 43, 28, 47, 43, -26, 45, 43, 43, RemoteControlWriter.BLOCK_CMDOK, 21, 20};
    }

    public static /* synthetic */ boolean A02(String str) {
        if (str == null) {
            return false;
        }
        String strA01 = AbstractC2326k7.A01(str);
        if (TextUtils.isEmpty(strA01)) {
            return false;
        }
        return ((strA01.contains(A00(4, 4, 105)) && !strA01.contains(A00(8, 8, 79))) || strA01.contains(A00(0, 4, 100)) || strA01.contains(A00(16, 3, 64))) ? false : true;
    }
}
