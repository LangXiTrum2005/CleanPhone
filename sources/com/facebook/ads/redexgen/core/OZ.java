package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import com.facebook.ads.AdSDKNotificationListener;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class OZ implements Runnable {
    public static byte[] A02;
    public final /* synthetic */ String A00;
    public final /* synthetic */ List A01;

    static {
        A01();
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 42);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{112, 123, 118, 103, 108, 101, 97, 112, 113, 74, 118, 101, 120, 57, 61, 32, 34, 53, 35, 35, 57, 63, 62};
    }

    public OZ(List list, String str) {
        this.A01 = list;
        this.A00 = str;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        if (WU.A02(this)) {
            return;
        }
        try {
            for (AdSDKNotificationListener adSDKNotificationListener : this.A01) {
                Bundle data = new Bundle();
                data.putString(A00(0, 13, 63), this.A00);
                adSDKNotificationListener.onAdEvent(A00(13, 10, 122), data);
            }
        } catch (Throwable th) {
            WU.A00(th, this);
        }
    }
}
