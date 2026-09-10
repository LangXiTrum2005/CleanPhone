package com.facebook.ads.redexgen.core;

import android.media.MediaCodec;
import android.os.SystemClock;
import android.util.Log;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class B6 {
    public static byte[] A03;
    public boolean A00 = false;
    public final ConcurrentLinkedQueue<B4> A01 = new ConcurrentLinkedQueue<>();
    public final /* synthetic */ B7 A02;

    static {
        A05();
    }

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A03, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 52);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A03 = new byte[]{-89, -38, -59, -57, -46, -42, -53, -47, -48, -126, -39, -54, -57, -48, -126, -42, -44, -37, -53, -48, -55, -126, -42, -47, -126, -53, -48, -43, -42, -61, -48, -42, -53, -61, -42, -57, -126, -121, -43, -100, -126, -121, -43, -72, -48, -49, -44, -52, -82, -38, -49, -48, -50, -69, -38, -38, -41, -70, -37, -33, -44, -40, -44, -27, -48, -49, -59, -46, -46, -49, -46, -115, -41, -56, -55, -52, -59, -115, -46, -59, -52, -59, -63, -45, -59, -115, -61, -49, -60, -59, -61, -115, -58, -46, -49, -51, -115, -45, -59, -44, -115, -58, -55, -50, -63, -52, -52, -39, -102, -128, -123, -45, -40, -27, -27, -30, -27, -96, -22, -37, -36, -33, -40, -96, -27, -40, -33, -40, -44, -26, -40, -96, -42, -30, -41, -40, -42, -96, -39, -27, -30, -32, -96, -26, -40, -25, -83, -109, -104, -26, -34, -15, -24, -23, -27, -38, -14, -34, -21, -85, -89, -38, -17, -86, -89, -20, -21, -36, -89, -67, -38, -17, -86, -35, -58, -34, -35, -30, -38, -68, -24, -35, -34, -36, -70, -35, -38, -23, -19, -34, -21};
    }

    public B6(B7 b7) {
        this.A02 = b7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public B0 A02(boolean z2, C2456jQ c2456jQ, EnumC2453jL enumC2453jL, String str) throws Exception {
        Set<B0> set;
        if (this.A02.A0I(z2, c2456jQ) && B7.A0G(str, c2456jQ)) {
            synchronized (this.A02.A04) {
                set = this.A02.A04.get(str);
            }
            if (set != null) {
                synchronized (set) {
                    if (!set.isEmpty()) {
                        this.A02.A00--;
                        Iterator<B0> it = set.iterator();
                        B0 ret = it.next();
                        it.remove();
                        this.A02.A03().A0A(z2, str, enumC2453jL, ret.hashCode());
                        return ret;
                    }
                }
            }
        }
        try {
            C2451jJ c2451jJA05 = this.A02.A03().A05(z2, str, enumC2453jL);
            B0 b0A03 = A03(z2, str);
            this.A02.A03().A06(c2451jJA05, b0A03.hashCode());
            return b0A03;
        } catch (Exception e2) {
            throw new MediaCodecInitializationException(str, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public B0 A03(boolean z2, String str) throws Exception {
        String strA04 = A04(150, 41, 69);
        if (z2 && B7.A0E(str)) {
            try {
                return (B0) Class.forName(strA04).getConstructor(new Class[0]).newInstance(new Object[0]);
            } catch (Exception e2) {
                Log.w(A04(43, 23, 55), String.format(A04(0, 43, 46), strA04, e2.getMessage()));
            }
        }
        return new C2725o6(MediaCodec.createByCodecName(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A07, reason: merged with bridge method [inline-methods] */
    public void A0B(EnumC2453jL enumC2453jL) {
        String strA04;
        String str;
        B7 b7;
        Set<B0> set;
        for (B4 b4 : this.A01) {
            try {
                try {
                    if (!b4.A05) {
                        A08(b4.A01, enumC2453jL, Boolean.valueOf(b4.A04), b4.A00);
                    } else {
                        try {
                            try {
                                this.A02.A05 = SystemClock.elapsedRealtime();
                                b4.A00.reset();
                                b7 = this.A02;
                            } catch (IllegalStateException unused) {
                                A09(b4.A02, b4.A00);
                                b7 = this.A02;
                            }
                            b7.A05 = -1L;
                            if (b4.A03) {
                                synchronized (this.A02.A04) {
                                    set = this.A02.A04.get(b4.A02);
                                }
                                if (set != null) {
                                    synchronized (set) {
                                        set.add(b4.A00);
                                        this.A02.A00++;
                                    }
                                }
                            }
                        } catch (Throwable th) {
                            this.A02.A05 = -1L;
                            throw th;
                        }
                    }
                    try {
                        synchronized (this.A01) {
                            try {
                                this.A01.remove(b4);
                            } catch (Throwable th2) {
                                throw th2;
                            }
                        }
                    } catch (Exception e2) {
                        strA04 = A04(43, 23, 55);
                        str = String.format(A04(66, 46, 44), e2.getMessage());
                        Log.w(strA04, str);
                    }
                } catch (Throwable th3) {
                    try {
                        synchronized (this.A01) {
                            this.A01.remove(b4);
                            throw th3;
                        }
                    } catch (Exception e3) {
                        Log.w(A04(43, 23, 55), String.format(A04(66, 46, 44), e3.getMessage()));
                    }
                }
            } catch (Exception e4) {
                Log.w(A04(43, 23, 55), String.format(A04(112, 38, 63), e4.getMessage()));
                try {
                    synchronized (this.A01) {
                        try {
                            this.A01.remove(b4);
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                } catch (Exception e5) {
                    strA04 = A04(43, 23, 55);
                    str = String.format(A04(66, 46, 44), e5.getMessage());
                    Log.w(strA04, str);
                }
            }
        }
    }

    private void A08(C2456jQ c2456jQ, EnumC2453jL enumC2453jL, Boolean bool, B0 b1) {
        try {
            if (!c2456jQ.A0R || (!bool.booleanValue() && !c2456jQ.A0Q)) {
                b1.stop();
            }
        } finally {
            this.A02.A03().A08(enumC2453jL, b1.hashCode());
            b1.AHb();
            this.A02.A03().A07(enumC2453jL, b1.hashCode());
        }
    }

    private void A09(String str, B0 b1) {
        Set<B0> set;
        synchronized (this.A02.A04) {
            set = this.A02.A04.get(str);
        }
        if (set != null) {
            synchronized (set) {
                if (set.remove(b1)) {
                    this.A02.A00--;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Bottom block not found for handler: all -> 0x00e0 */
    /* JADX WARN: Code duplicated, block: B:106:0x0120 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x0108  */
    /* JADX WARN: Code duplicated, block: B:91:0x0110  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0A(boolean r24, com.facebook.ads.redexgen.core.C2456jQ r25, final com.facebook.ads.redexgen.core.EnumC2453jL r26, java.lang.String r27, com.facebook.ads.redexgen.core.B0 r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.B6.A0A(boolean, com.facebook.ads.redexgen.X.jQ, com.facebook.ads.redexgen.X.jL, java.lang.String, com.facebook.ads.redexgen.X.B0):void");
    }
}
