package com.facebook.ads.redexgen.core;

import android.provider.Settings;
import android.text.TextUtils;
import com.applovin.shadow.okio.Utf8;
import com.unity3d.services.UnityAdsConstants;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jacoco.core.runtime.RemoteControlWriter;
import org.objectweb.asm.Opcodes;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.gD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2100gD {
    public static InterfaceC2080ft A00;
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
        A01 = new byte[]{51, 114, 121, 9, 84, 69, 113, 55, 55, 120, 5, 112, 1, 25, 51, 18, 114, 47, 24, 117, 44, 46, 36, 43, 114, 40, 55, 48, 114, 21, 47, 51, 43, 125, 74, Utf8.REPLACEMENT_BYTE, 96, 71, 122, 102, 66, 127, 106, 97, 126, 98, 39, 91, 97, 106, 72, 100, 122, 126, 62, 101, 90, 100, 35, 117, 94, 127, 49, 6, 81, 35, 43, 66, 103, 86, 39, 106, 95, 80, 119, 127, 122, 39, 97, 99, 103, 106, 98, 82, 86, 112, 105, 75, 92, 118, 82, 46, 25, 88, 115, 98, 97, 121, 100, 125, 127, 120, 113, 54, 116, 115, 112, 121, 100, 115, 54, 127, 120, 127, 98, 55, 83, 81, 83, 66, 61, 106, 101, 81, 105, 111, RemoteControlWriter.BLOCK_CMDDUMP, 109, RemoteControlWriter.BLOCK_CMDOK, 127, 106, 94, 89, 111, 101, 114, 94, 67, 62, 98, 123, 108, 70, 54, 1, 15, 7, 28, 30, 2, 15, 0, 11, 49, 3, 1, 10, 11, 49, 1, 0, 29, 22, 7, 4, 28, 1, 24, 33, 58, 15, 103, 18, 7, 59, 7, Utf8.REPLACEMENT_BYTE, 22, 108, 5, 96, 3, 3, 0, 49, 22, 37, 26, 39, 19, 29, 109, 57, 51, 4, 104, 95};
    }

    static {
        A07();
        A02 = new HashSet();
        A03 = new HashSet();
        A02.add(A05(6, 29, 93));
        A03.add(A05(Opcodes.JSR, 29, 72));
        A03.add(A05(35, 29, 17));
        A03.add(A05(64, 29, 14));
        A03.add(A05(116, 29, 22));
        A04 = new AtomicBoolean();
    }

    public static InterfaceC2082fv A00(T8 t8) {
        return A03(true, t8);
    }

    public static InterfaceC2082fv A01(T8 t8) {
        return A02(true, t8);
    }

    public static InterfaceC2082fv A02(boolean z, T8 t8) {
        C2086fz c2086fz = new C2086fz();
        C2089g2 networkModuleRequestConfigurationBuilder = A04(t8);
        if (!A0B(t8)) {
            c2086fz.A02(A03);
            c2086fz.A01(A02);
        }
        if (XD.A04()) {
            networkModuleRequestConfigurationBuilder.A08(XD.A02());
        }
        C1127Cv c1127CvA00 = AbstractC2084fx.A00();
        C2086fz networkModuleConfigurationBuilder = c2086fz.A00(networkModuleRequestConfigurationBuilder.A09());
        return c1127CvA00.A00(networkModuleConfigurationBuilder.A03(z).A04(t8.A05().AAO()).A05(), t8.A08(), YG.A01());
    }

    public static InterfaceC2082fv A03(boolean z, T8 t8) {
        return AbstractC2084fx.A00().A00(new C2086fz().A03(z).A00(A04(t8).A09()).A04(t8.A05().AAO()).A05(), t8.A08(), YG.A01());
    }

    public static C2089g2 A04(T8 t8) {
        A08(t8);
        C2089g2 c2089g2 = new C2089g2();
        if (A0B(t8) || XD.A04()) {
            c2089g2.A02(360000).A04(UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION);
        } else {
            c2089g2.A02(C1581Up.A09(t8)).A04(C1581Up.A0B(t8));
        }
        c2089g2.A03(C1581Up.A0A(t8)).A05(C1581Up.A0C(t8)).A06(C1581Up.A0D(t8));
        synchronized (C2100gD.class) {
            if (A00 != null && (A00 instanceof InterfaceC2080ft)) {
                c2089g2.A07(A00);
            }
        }
        return c2089g2;
    }

    public static void A06() {
        A04.set(true);
    }

    public static void A08(T8 t8) {
        if (!A04.get()) {
            t8.A08().ABC(A05(Opcodes.IF_ICMPLT, 7, 110), AbstractC1543Td.A21, new C1544Te(A05(93, 23, 11)));
        }
    }

    public static synchronized void A09(InterfaceC2080ft interfaceC2080ft) {
        A00 = interfaceC2080ft;
    }

    public static boolean A0A(T8 t8) {
        return Settings.Global.getInt(t8.getContentResolver(), A05(Opcodes.I2B, 16, 115), 0) != 0;
    }

    public static boolean A0B(T8 t8) {
        String strA9Q = t8.A05().A9Q();
        if (!TextUtils.isEmpty(strA9Q)) {
            String urlPrefix = A05(3, 3, 58);
            if (!strA9Q.endsWith(urlPrefix)) {
                String urlPrefix2 = A05(0, 3, 0);
                if (strA9Q.endsWith(urlPrefix2)) {
                }
            }
            return true;
        }
        return false;
    }
}
