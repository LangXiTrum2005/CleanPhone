package com.facebook.ads.redexgen.core;

import android.provider.Settings;
import android.text.TextUtils;
import com.badlogic.gdx.Input;
import com.umeng.analytics.pro.cw;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Jj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0817Jj {
    public static JP A00;
    public static byte[] A01;
    public static final Set<String> A02;
    public static final Set<String> A03;
    public static final AtomicBoolean A04;

    public static String A05(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 29);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A07() {
        A01 = new byte[]{51, 114, 121, 9, 84, 69, 113, 55, 55, 120, 5, 112, 1, 25, 51, 18, 114, 47, 24, 117, 44, 46, 36, 43, 114, 40, 55, 48, 114, 21, 47, 51, 43, 125, 74, 63, 96, 71, 122, 102, 66, 127, 106, 97, 126, 98, 39, 91, 97, 106, 72, 100, 122, 126, 62, 101, 90, 100, 35, 117, 94, 127, 49, 6, 81, 35, 43, 66, 103, 86, 39, 106, 95, 80, 119, 127, 122, 39, 97, 99, 103, 106, 98, 82, 86, 112, 105, 75, 92, 118, 82, 46, 25, 88, 115, 98, 97, 121, 100, 125, 127, 120, 113, 54, 116, 115, 112, 121, 100, 115, 54, 127, 120, 127, 98, 55, 83, 81, 83, 66, 61, 106, 101, 81, 105, 111, 64, 109, 32, 127, 106, 94, 89, 111, 101, 114, 94, 67, 62, 98, 123, 108, 70, 54, 1, cw.m, 7, 28, 30, 2, cw.m, 0, 11, 49, 3, 1, 10, 11, 49, 1, 0, 29, 22, 7, 4, 28, 1, 24, 33, 58, cw.m, 103, 18, 7, 59, 7, 63, 22, 108, 5, 96, 3, 3, 0, 49, 22, 37, 26, 39, 19, 29, 109, 57, 51, 4, 104, 95};
    }

    static {
        A07();
        A02 = new HashSet();
        A03 = new HashSet();
        A02.add(A05(6, 29, 93));
        A03.add(A05(168, 29, 72));
        A03.add(A05(35, 29, 17));
        A03.add(A05(64, 29, 14));
        A03.add(A05(116, 29, 22));
        A04 = new AtomicBoolean();
    }

    public static JR A00(AnonymousClass85 anonymousClass85) {
        return A03(true, anonymousClass85);
    }

    public static JR A01(AnonymousClass85 anonymousClass85) {
        return A02(true, anonymousClass85);
    }

    public static JR A02(boolean z, AnonymousClass85 anonymousClass85) {
        JV jv = new JV();
        JY networkModuleRequestConfigurationBuilder = A04(anonymousClass85);
        if (!A0B(anonymousClass85)) {
            jv.A02(A03);
            jv.A01(A02);
        }
        if (C7.A04()) {
            networkModuleRequestConfigurationBuilder.A08(C7.A02());
        }
        C1266al c1266alA00 = JT.A00();
        JV networkModuleConfigurationBuilder = jv.A00(networkModuleRequestConfigurationBuilder.A09());
        return c1266alA00.A00(networkModuleConfigurationBuilder.A03(z).A04(anonymousClass85.A05().AAD()).A05(), anonymousClass85.A08(), D8.A01());
    }

    public static JR A03(boolean z, AnonymousClass85 anonymousClass85) {
        return JT.A00().A00(new JV().A03(z).A00(A04(anonymousClass85).A09()).A04(anonymousClass85.A05().AAD()).A05(), anonymousClass85.A08(), D8.A01());
    }

    public static JY A04(AnonymousClass85 anonymousClass85) {
        A08(anonymousClass85);
        JY jy = new JY();
        if (A0B(anonymousClass85) || C7.A04()) {
            jy.A02(360000).A04(UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION);
        } else {
            jy.A02(C05789m.A09(anonymousClass85)).A04(C05789m.A0B(anonymousClass85));
        }
        jy.A03(C05789m.A0A(anonymousClass85)).A05(C05789m.A0C(anonymousClass85)).A06(C05789m.A0D(anonymousClass85));
        synchronized (C0817Jj.class) {
            if (A00 != null && (A00 instanceof JP)) {
                jy.A07(A00);
            }
        }
        return jy;
    }

    public static void A06() {
        A04.set(true);
    }

    public static void A08(AnonymousClass85 anonymousClass85) {
        if (!A04.get()) {
            anonymousClass85.A08().AAu(A05(Input.Keys.NUMPAD_EQUALS, 7, 110), AbstractC05418a.A21, new C05428b(A05(93, 23, 11)));
        }
    }

    public static synchronized void A09(JP jp) {
        A00 = jp;
    }

    public static boolean A0A(AnonymousClass85 anonymousClass85) {
        return Settings.Global.getInt(anonymousClass85.getContentResolver(), A05(Input.Keys.NUMPAD_1, 16, 115), 0) != 0;
    }

    public static boolean A0B(AnonymousClass85 anonymousClass85) {
        String strA9G = anonymousClass85.A05().A9G();
        if (!TextUtils.isEmpty(strA9G)) {
            String urlPrefix = A05(3, 3, 58);
            if (!strA9G.endsWith(urlPrefix)) {
                String urlPrefix2 = A05(0, 3, 0);
                if (strA9G.endsWith(urlPrefix2)) {
                }
            }
            return true;
        }
        return false;
    }
}
