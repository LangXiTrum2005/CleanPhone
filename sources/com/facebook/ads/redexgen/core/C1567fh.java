package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.fh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C1567fh {
    public static byte[] A00;
    public static String[] A01 = {"qYQOUQTF62OOWEfiVpyIYXlTm", "4hkOmpB0mDkrPH1go6WKY9n5wP47xMQr", "J89CmVckoKczMx0zdYi8dxAfkZVU4W", "z0aBCffY0bbo6qeeX5OCFUYXyXP9z3NF", "9ccanILtu81oNBeRyBdTQnt9aNRxfl", "ZmG248mJ14nXTuPoeo87njOIuWSMwgyo", "MIM3S56BbxDmqrY1lvSPNFqlZAMWK", "i0sii9oQDUHWJOv0AocDZp5xmPXOF"};

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 57);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {-73, -81, -74, -75, -84};
        String[] strArr = A01;
        if (strArr[6].length() != strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A01;
        strArr2[6] = "OVe2JEn8uOGtcVk2PaRZjRcD6hLvy";
        strArr2[7] = "DWNjqoE1GQs50v3q6tdZpfaeyjdaX";
        A00 = bArr;
    }

    static {
        A01();
    }

    public static void A02(Context context, C1570fk c1570fk) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) AbstractC1517es.A01((TelephonyManager) context.getSystemService(A00(0, 5, 14)));
            C1566fg callback = new C1566fg(c1570fk);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), callback);
            telephonyManager.unregisterTelephonyCallback(callback);
        } catch (RuntimeException unused) {
            c1570fk.A07(5);
        }
    }
}
