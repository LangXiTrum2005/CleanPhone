package com.facebook.ads.redexgen.core;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class SZ {
    public static byte[] A00;
    public static String[] A01 = {"T8", "", "As3hIStO2xNa0GSSHrkEVjQu", "DXoFAMJTZKDaTyX0if7pZrkyLA7XvGsC", "niDMG5wZxQy0H8acRFWa8hH2XuraMrTN", "878XRXnWNCNw6FCwqGtfz4QO6Hd03tfb", "ID5FT62NpqbpmPra08cWCCHJVsi2pDHC", "txdj"};
    public static final AtomicReference<SX> A02;
    public static final AtomicReference<String> A03;

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A01[7].length() != 4) {
                throw new RuntimeException();
            }
            A01[6] = "PcSdqCtN9qYKSfDsPVWrfTZjyuiu0dLa";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 86);
            i5++;
        }
    }

    public static void A05() {
        A00 = new byte[]{19, 27, 22, 17, 33, 40, 23, 36, 36, 27, 22, 23, 17, 15, 24, 15, 28, 19, 13, 43, 38, 40, 35, 33, 49, 56, 39, 52, 52, 43, 38, 39};
    }

    static {
        A05();
        A02 = new AtomicReference<>();
        A03 = new AtomicReference<>(A04(0, 0, 12));
    }

    public static SX A00() {
        SX advertisingIdInfo = A02.get();
        if (advertisingIdInfo == null) {
            return SX.A00();
        }
        return advertisingIdInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.A03()) != false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.core.SX A01(com.facebook.ads.redexgen.core.T8 r5, com.facebook.ads.redexgen.core.SX r6) {
        /*
            if (r6 == 0) goto Lc
            java.lang.String r0 = r6.A03()     // Catch: java.lang.Throwable -> L11
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L29
        Lc:
            com.facebook.ads.redexgen.X.SX r0 = com.facebook.ads.redexgen.core.AbstractC1688Sf.A00(r5)     // Catch: java.lang.Throwable -> L11
            return r0
        L11:
            r0 = move-exception
            com.facebook.ads.redexgen.X.Tc r5 = r5.A08()
            int r4 = com.facebook.ads.redexgen.core.AbstractC1712Td.A1Q
            com.facebook.ads.redexgen.X.Te r3 = new com.facebook.ads.redexgen.X.Te
            r3.<init>(r0)
            r2 = 12
            r1 = 7
            r0 = 84
            java.lang.String r0 = A04(r2, r1, r0)
            r5.ABC(r0, r4, r3)
        L29:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.SZ.A01(com.facebook.ads.redexgen.X.T8, com.facebook.ads.redexgen.X.SX):com.facebook.ads.redexgen.X.SX");
    }

    public static SX A02(T8 t8, SX sx, SY sy) {
        C1684Sa c1684SaA00 = null;
        try {
            if (AbstractC1749Uo.A06(t8) && (sx == null || TextUtils.isEmpty(sx.A03()))) {
                c1684SaA00 = AbstractC1685Sb.A00(t8.getContentResolver());
            }
        } catch (Throwable th) {
            t8.A08().ABC(A04(12, 7, 84), AbstractC1712Td.A1S, new C1713Te(th));
        }
        if (c1684SaA00 != null && c1684SaA00.A01 != null) {
            A03.set(c1684SaA00.A01);
            sy.A05(c1684SaA00.A01);
        }
        if (sx == null && c1684SaA00 != null && !TextUtils.isEmpty(c1684SaA00.A00)) {
            return new SX(c1684SaA00.A00, c1684SaA00.A02, SW.A04);
        }
        return sx;
    }

    public static String A03() {
        String attributionId = A03.get();
        if (attributionId == null) {
            return A04(0, 0, 12);
        }
        return attributionId;
    }

    public static void A06(SY sy) {
        A02.set(sy.A02());
        A03.set(sy.A03());
    }

    public static void A07(T8 t8) {
        long jA01;
        SX advertisingIdInfo;
        try {
            SY sy = new SY(t8);
            A06(sy);
            if (A08()) {
                return;
            }
            SX advertisingIdInfo2 = A02.get();
            if (advertisingIdInfo2 != null && !TextUtils.isEmpty(advertisingIdInfo2.A03())) {
                jA01 = advertisingIdInfo2.A01();
            } else {
                jA01 = -1;
            }
            if (jA01 > 0 && System.currentTimeMillis() - jA01 < AbstractC1749Uo.A00(t8)) {
                return;
            }
            if (AbstractC1749Uo.A07(t8)) {
                advertisingIdInfo = A01(t8, A02(t8, null, sy));
            } else {
                advertisingIdInfo = A02(t8, A01(t8, null), sy);
            }
            if (advertisingIdInfo != null && !TextUtils.isEmpty(advertisingIdInfo.A03())) {
                A02.set(advertisingIdInfo);
                sy.A04(advertisingIdInfo);
            }
        } catch (Throwable t) {
            t8.A08().ABC(A04(12, 7, 84), AbstractC1712Td.A1R, new C1713Te(t));
        }
    }

    public static boolean A08() {
        boolean z2 = false;
        boolean updated = XD.A04();
        if (updated) {
            String strA04 = A04(0, 12, 92);
            boolean updated2 = XD.A05(strA04);
            if (updated2) {
                A03.set(XD.A01(strA04));
                z2 = true;
            }
        }
        boolean zA04 = XD.A04();
        if (A01[7].length() != 4) {
            throw new RuntimeException();
        }
        A01[6] = "Cpq5b7Aomj18wFHDN8BPNJlk9AiHAVMm";
        if (!zA04) {
            return z2;
        }
        String strA05 = A04(19, 13, 108);
        boolean updated3 = XD.A05(strA05);
        if (updated3) {
            String strA01 = XD.A01(strA05);
            AtomicReference<SX> atomicReference = A02;
            if (strA01 == null) {
                if (A01[7].length() != 4) {
                    A01[7] = "Ywke";
                    strA01 = A04(0, 0, 2);
                } else {
                    A01[5] = "aB8iQRCNNWTx0AWcZvgXlT81SikGsrWB";
                    strA01 = A04(0, 0, 12);
                }
            }
            atomicReference.set(new SX(strA01, false, SW.A03));
            return true;
        }
        return z2;
    }
}
