package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.app.KeyguardManager;
import android.util.Log;
import android.view.Window;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class YW {
    public static byte[] A00;
    public static String[] A01 = {"cuUzkH3QdbH3cJp2RF", "kphHRdIOrc0r15jsPfyG2Jy", "YnKzEWoXtdzuP95TROGjIP", "O6qhnuon9ci7avdCdn", "JszjlqJauoZ2AkEe", "2iwMqZkAQKEhQz1BEXGjAw", "tv2fwm9vcfvUl0RC5d9GYW3eB7CSJdU", "VWHYkG5jfvcYH9oXKfgyVS7MLxk2p9iO"};
    public static final String A02;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A01;
            if (strArr[3].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A01;
            strArr2[3] = "jOZxNa7dXP1jVDPJoO";
            strArr2[0] = "z9aGKGtKVlVAFuhw7X";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 48);
            i5++;
        }
    }

    public static void A02() {
        A00 = new byte[]{79, 119, 122, 71, 92, 90, 79, 75, 86, 80, 81, 31, 86, 81, 31, 72, 86, 81, 91, 80, 72, 31, 86, 81, 89, 80, 31, 92, 87, 90, 92, 84, 98, 108, 112, 110, 124, 104, 123, 109, 91, 87, 66, 15, 20, 14, 22, 4, 96, 113, 115, 124, 112, 117, 100, 113, 117, 110, 96, 99};
    }

    static {
        A02();
        A02 = YW.class.getSimpleName();
    }

    public static Map<String, String> A01(@Nullable C2300gi c2300gi) {
        Window window;
        HashMap map = new HashMap();
        if (c2300gi == null) {
            return map;
        }
        try {
            map.put(A00(40, 3, 0), String.valueOf(A04(c2300gi)));
            Activity activityA0E = c2300gi.A0E();
            if (activityA0E != null && (window = activityA0E.getWindow()) != null) {
                int i2 = window.getAttributes().flags;
                int flags = window.getAttributes().type;
                map.put(A00(58, 2, 39), Integer.toString(flags));
                int type = 4194304 & i2;
                String strA00 = A00(1, 1, 118);
                String flagDismissKeyguardEnabled = A00(0, 1, 79);
                map.put(A00(48, 5, 39), type > 0 ? strA00 : flagDismissKeyguardEnabled);
                int type2 = 524288 & i2;
                if (A01[6].length() == 6) {
                    throw new RuntimeException();
                }
                A01[7] = "5jjmsuOSeLdxH4ITovSaNkR7tPO8fpvx";
                if (type2 <= 0) {
                    strA00 = flagDismissKeyguardEnabled;
                }
                map.put(A00(53, 5, 50), strA00);
            }
        } catch (Exception e2) {
            Log.e(A02, A00(2, 30, 15), e2);
            InterfaceC1711Tc interfaceC1711TcA08 = c2300gi.A08();
            int type3 = AbstractC1712Td.A2T;
            interfaceC1711TcA08.ABC(A00(43, 5, 77), type3, new C1713Te(e2));
        }
        return map;
    }

    public static boolean A03(C2300gi c2300gi) {
        return !YC.A04(A01(c2300gi));
    }

    public static boolean A04(C2300gi c2300gi) {
        KeyguardManager keyguardManager = (KeyguardManager) c2300gi.getSystemService(A00(32, 8, 57));
        return keyguardManager != null && keyguardManager.inKeyguardRestrictedInputMode();
    }
}
