package com.facebook.ads.redexgen.core;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseIntArray;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class TX {
    public static SparseIntArray A00;
    public static Executor A01;
    public static boolean A02;
    public static boolean A03;
    public static byte[] A04;
    public static String[] A05 = {"7RJhgfAHrbCmdmvJO272XvW7u1fNB6AD", "SRAGcoTEjCaoOjv1TM3aABjegfXmDbQ2", "TJJTsgNcbEXqB1u8vE3MpXQkjlg70u98", "t1ySRzXu9XpLihhV0EPpMNwY8xH1TItL", "3rsqEGuQmw5YOXxTuvx2sfjKNK9b", "ZMUzhorUr0JjW6bP", "tg0Wl7kwCnCjIdXfhu7KKTsHjGWToUDr", "3JMITBtDsKuz"};
    public static final List<Integer> A06;
    public static final List<TY> A07;
    public static final AtomicBoolean A08;
    public static final AtomicInteger A09;
    public static final AtomicReference<TV> A0A;
    public static final AtomicReference<TW> A0B;
    public static final AtomicReference<Boolean> A0C;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 61);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A04 = new byte[]{117, 105, -86, -83, -83, -78, -67, -78, -72, -73, -86, -75, -110, -73, -81, -72, 105, -122, 105, -53, -65, 12, 4, 18, 18, 0, 6, 4, -65, -36, -65, -43, -55, 28, 30, 11, 29, 34, 25, 14, -20, 24, 13, 14, -55, -26, -55, -46, -91, -61, -48, -119, -42, -126, -50, -47, -55, -126, -90, -57, -60, -41, -55, -126, -89, -40, -57, -48, -42, -112, -126, -91, -47, -48, -42, -57, -38, -42, -126, -53, -43, -126, -48, -41, -50, -50, -112, -74, -30, -24, -31, -25, -40, -27, -83, -109, -46, -13, -16, 3, -11, -82, -15, 0, -17, 1, -10, -82, -16, -13, -15, -17, 3, 1, -13, -82, -3, -12, -82, -13, 4, -13, -4, 2, -82, 5, -9, 2, -10, -82, 1, 3, -16, 2, 7, -2, -13, -82, -53, -82, -56, -5, -26, -24, -24, -25, -24, -25, -93, -20, -15, -80, -16, -24, -16, -14, -11, -4, -93, -17, -14, -22, -93, -17, -20, -16, -20, -9, -92, -93, -49, -28, -10, -9, -93, -24, -7, -24, -15, -9, -67, -93, -12, 39, 18, 20, 31, 35, 24, 30, 29, -49, -13, 20, 17, 36, 22, -49, -12, 37, 20, 29, 35, -49, 38, 24, 35, 23, -49, 34, 36, 17, 35, 40, 31, 20, -49, -20, -49, -123, -72, -93, -91, -80, -76, -87, -81, -82, 96, -92, -75, -78, -87, -82, -89, 96, -84, -81, -89, -89, -87, -82, -89, 96, -92, -91, -94, -75, -89, 96, -91, -74, -91, -82, -76, 110, -55, -4, -25, -23, -12, -8, -19, -13, -14, -92, -9, -20, -13, -7, -16, -24, -92, -14, -13, -8, -92, -20, -27, -12, -12, -23, -14, -92, -20, -23, -10, -23, -78, -122, -126, -127, -75, -92, -87, -91, -82, -93, -91, -114, -91, -76, -73, -81, -78, -85, -20, 17, 9, 18, -61, -25, 8, 5, 24, 10, -61, -24, 25, 8, 17, 23, -61, 26, 12, 23, 11, -61, 22, 24, 5, 23, 28, 19, 8, -61, -32, -61, -99, -72, -72, 105, -74, -86, -73, -62, 105, -82, -65, -82, -73, -67, -68, 105, -72, -81, 105, -68, -66, -85, -67, -62, -71, -82, 105, -84, -72, -83, -82, -125, 105, -8, -6, -11, -6, -9, 10, -9, -11, 2, 5, -3, -3, -1, 4, -3, -90, -77, -72, -93, -88, -87, -72, -87, -89, -72, -83, -77, -78, -93, -69, -77, -93, -73, -83, -85, -78, -91, -80, -93, -88, -91, -72, -91, -93, -80, -77, -85, -85, -83, -78, -85, -6, -8, -6, -1, -4, -60, -59, -65, -52, -49, -57, -57, -55, -50, -57, -49, -43, -54, -36, -47, -31, -16, -23, -23, -32, -25, 11, 18, 5, 1, 24, 3, 14, 11, 6, 3, 22, 11, 17, 16, -80, -89, -74, -71, -79, -76, -83};
    }

    static {
        A04();
        A00 = new SparseIntArray();
        A03 = false;
        A0B = new AtomicReference<>();
        A0A = new AtomicReference<>();
        A01 = Executors.newSingleThreadExecutor();
        A06 = Arrays.asList(10, 50, 100, 1000);
        A07 = Collections.synchronizedList(new ArrayList());
        A09 = new AtomicInteger();
        A08 = new AtomicBoolean();
        A0C = new AtomicReference<>(false);
        A02 = false;
    }

    public static int A00(String str, int i2, T8 t8) {
        if ((A01(462, 7, 5).equals(str) && AbstractC1712Td.A20 == i2) || A01(422, 5, 90).equals(str) || A01(442, 6, 62).equals(str)) {
            return 200;
        }
        if (A01(386, 36, 7).equals(str)) {
            return 50;
        }
        if (A01(371, 15, 89).equals(str)) {
            return AbstractC1752Ur.A05(t8);
        }
        return -1;
    }

    public static /* synthetic */ List A02() {
        List<TY> list = A07;
        if (A05[0].charAt(12) == 'b') {
            throw new RuntimeException();
        }
        String[] strArr = A05;
        strArr[6] = "zk7JrRKdkqRVNKieaZlWPGFPyzHfiD6w";
        strArr[3] = "fyoGHU5IjzPGh6SPmUkkru2DTQYQg6uC";
        return list;
    }

    public static void A05(T8 t8, int i2, int i3) {
        t8.A08().ABC(A01(427, 10, 35), AbstractC1712Td.A2Z, new C1713Te(A01(338, 33, 12) + i2, A01(87, 9, 54) + i3));
    }

    @Deprecated
    public static void A06(T8 t8, String str, int i2, C1713Te c1713Te) {
        if (t8 == null) {
            A0F(new RuntimeException(A01(48, 39, 37)));
            return;
        }
        T7.A01(t8.A02());
        if (A02 && c1713Te.A01() == 0) {
            A0D(new RuntimeException(A01(96, 44, 81) + str + A01(31, 16, 108) + i2, c1713Te));
        }
        try {
            if (A0J(t8, str, i2, Math.random(), c1713Te)) {
                A09(t8, str, i2, c1713Te);
            }
        } catch (Throwable th) {
            if (A05[7].length() == 7) {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[6] = "Wr4fCxMFDWkIVvnx3dc83TKhQDpVGTp5";
            strArr[3] = "OVQSbEPH5m9BJKnAfFJqQw5cDphpT4wi";
            A0F(th);
        }
    }

    @Deprecated
    public static void A07(T8 t8, String str, int i2, C1713Te c1713Te) {
        try {
            c1713Te.A05(2);
            c1713Te.A0A(false);
            c1713Te.A06(1);
            if (AbstractC1752Ur.A0Q(t8)) {
                c1713Te.A08(true);
            } else {
                c1713Te.A08(false);
            }
            A06(t8, str, i2, c1713Te);
        } catch (Throwable t) {
            A0F(t);
        }
    }

    @Deprecated
    public static void A08(T8 t8, String str, int i2, C1713Te c1713Te) {
        try {
            c1713Te.A05(2);
            c1713Te.A08(false);
            A06(t8, str, i2, c1713Te);
        } catch (Throwable th) {
            String[] strArr = A05;
            if (strArr[2].charAt(18) != strArr[1].charAt(18)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[2] = "lrlTLjNTeannl0YPXC3Gfh7JwXVpOQq4";
            strArr2[1] = "kBSf974kPIRKP3U3j132aDHcl1k5alA0";
            A0F(th);
        }
    }

    public static void A09(T8 t8, String str, int i2, C1713Te c1713Te) {
        synchronized (TX.class) {
            if (!A03) {
                int iA01 = AbstractC1752Ur.A01(t8);
                int threshold = A09.getAndIncrement();
                if (threshold < iA01 - 1) {
                    A07.add(new TY(str, i2, c1713Te));
                } else if (A09.get() == iA01) {
                    A07.add(new TY(A01(427, 10, 35), AbstractC1712Td.A2W, new C1713Te(A01(140, 42, 70) + str + A01(47, 1, 91) + i2)));
                }
            } else {
                A0A(t8, str, i2, c1713Te, true);
            }
        }
    }

    public static void A0A(T8 t8, String str, int i2, C1713Te c1713Te, boolean z2) {
        TW tw = A0B.get();
        boolean z3 = tw != null && tw.AAi();
        boolean z4 = A08.get();
        String[] strArr = A05;
        if (strArr[6].charAt(6) == strArr[3].charAt(6)) {
            throw new RuntimeException();
        }
        A05[0] = "wcUF0zMFhzDc2LBIPX26ddygqjW04ktX";
        if (z4 || z3) {
            int iA01 = c1713Te.A01();
            String strA01 = A01(289, 17, 3);
            String strA02 = A01(31, 16, 108);
            if (iA01 == 0) {
                Log.e(strA01, A01(182, 37, 114) + str + strA02 + i2, c1713Te);
            } else {
                Log.i(strA01, A01(306, 32, 102) + str + strA02 + i2 + A01(19, 12, 98) + c1713Te.getMessage() + A01(0, 19, 12) + c1713Te.A03());
            }
        }
        C2197f3 c2197f3 = new C2197f3(t8, str, i2, c1713Te, tw);
        if (z2) {
            A01.execute(c2197f3);
        } else {
            c2197f3.run();
        }
    }

    public static void A0C(C2296ge c2296ge, TW tw, TV tv, boolean z2) {
        A0A.set(tv);
        A0B.set(tw);
        A08.set(z2);
        synchronized (TX.class) {
            if (!A03) {
                A03 = true;
                A01.execute(new C2198f4(c2296ge));
            }
        }
    }

    public static void A0D(RuntimeException runtimeException) {
        if (A02) {
            new Handler(Looper.getMainLooper()).post(new TU(runtimeException));
        }
    }

    @Deprecated
    public static void A0E(Throwable th) {
        if (A02) {
            A0D(new RuntimeException(A01(256, 33, 71), th));
        }
    }

    public static void A0F(Throwable th) {
        Log.e(A01(289, 17, 3), A01(Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, 37, 3), th);
        if (A02) {
            A0D(new RuntimeException(th));
        }
    }

    public static boolean A0H(T8 t8) {
        Boolean shouldSkipFunnelEventsForSession = A0C.get();
        return (shouldSkipFunnelEventsForSession == null || !shouldSkipFunnelEventsForSession.booleanValue()) && AbstractC1752Ur.A0A(t8) != 0;
    }

    public static boolean A0I(T8 t8) {
        Boolean shouldSkipFunnelEventsForSession = A0C.get();
        if (shouldSkipFunnelEventsForSession != null && shouldSkipFunnelEventsForSession.booleanValue()) {
            return false;
        }
        double funnelEventLogProbability = 1.0d / ((double) AbstractC1752Ur.A0A(t8));
        return t8.A09().A00() <= funnelEventLogProbability;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x017b, code lost:
    
        com.facebook.ads.redexgen.core.TX.A0C.set(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0185, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0186, code lost:
    
        if (r0 <= 0) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0188, code lost:
    
        r7 = 1.0d / ((double) r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x018a, code lost:
    
        if (r11 == false) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x018c, code lost:
    
        r7 = r7 * r2;
        r2 = com.facebook.ads.redexgen.core.TX.A05;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x019e, code lost:
    
        if (r2[6].charAt(6) == r2[3].charAt(6)) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01a0, code lost:
    
        r2 = com.facebook.ads.redexgen.core.TX.A05;
        r2[5] = "ov2u4VJ7e4Jf0Cpe";
        r2[4] = "3S8vDNMGZoIrI2ECoHj3stfewtnb";
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x01ae, code lost:
    
        if (r9 > r7) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01b0, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01b2, code lost:
    
        r2 = com.facebook.ads.redexgen.core.TX.A05;
        r2[2] = "J7AbISTAh4tNpjUdhq3A9LORixiN2LjD";
        r2[1] = "NK4gpNISnoGezA2FzC3Uh9mHyAzfRHIK";
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x01c0, code lost:
    
        if (r9 > r7) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01c3, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01c7, code lost:
    
        if (r9 > r7) goto L119;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01c9, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01cb, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0152, code lost:
    
        if (r6 == 2) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0161, code lost:
    
        if (r6 == 2) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0163, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0164, code lost:
    
        r0 = com.facebook.ads.redexgen.core.TX.A0C.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x016c, code lost:
    
        if (r0 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0172, code lost:
    
        if (r0.booleanValue() == false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0174, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0175, code lost:
    
        r0 = com.facebook.ads.redexgen.core.AbstractC1752Ur.A0A(r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0179, code lost:
    
        if (r0 != 0) goto L102;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0J(com.facebook.ads.redexgen.core.T8 r13, java.lang.String r14, int r15, double r16, com.facebook.ads.redexgen.core.C1713Te r18) {
        /*
            Method dump skipped, instruction units count: 633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.TX.A0J(com.facebook.ads.redexgen.X.T8, java.lang.String, int, double, com.facebook.ads.redexgen.X.Te):boolean");
    }

    public static boolean A0K(T8 t8, String str, int i2, C1713Te c1713Te) {
        if (!AbstractC1752Ur.A0P(t8)) {
            return true;
        }
        int customLimit = A00.get(i2);
        int eventsLimit = AbstractC1752Ur.A00(t8);
        if (c1713Te.A02() != -1) {
            eventsLimit = c1713Te.A02();
        } else {
            int currentCounter = A00(str, i2, t8);
            if (eventsLimit < currentCounter) {
                eventsLimit = currentCounter;
            }
        }
        if (customLimit >= eventsLimit) {
            if (A06.contains(Integer.valueOf(customLimit)) && c1713Te.A0D()) {
                A05(t8, i2, customLimit);
            }
            A00.put(i2, customLimit + 1);
            return true;
        }
        A00.put(i2, customLimit + 1);
        return false;
    }
}
