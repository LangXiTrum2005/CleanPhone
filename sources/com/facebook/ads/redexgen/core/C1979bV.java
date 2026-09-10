package com.facebook.ads.redexgen.core;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.bV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1979bV {
    public static long A0F;
    public static byte[] A0G;
    public static String[] A0H = {"R0SbMgWAoC497HVFrz", "HjDMjTQFKfQjEPdjddKMHVEmssyIO6xJ", "qLmiUd82g2mhrwqPXxjSPUm4NIZHyVr2", "b8w5", "5ahVLoWejnV8u5u0zxB2Y4aA1Z0H734m", "82nB4Ww4zktBcOGVc7", "fE0nEfPNcAkneFTlCeTsSM9yzZ1yQJUc", "9xmO"};
    public InterfaceC1550Mr A00;
    public AbstractC1552Mt A01;
    public AbstractC2465jd A02;
    public XS A03;
    public InterfaceC1815Xh A04;
    public InterfaceC1978bU A05;
    public boolean A06;
    public final C1564Ng A07;
    public final C2300gi A08;
    public final VA A09;
    public final Y2 A0A;
    public final InterfaceC1841Yh A0B;
    public final C2245fp A0C;
    public final String A0D;
    public final boolean A0E;

    public static String A01(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0G, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        byte[] bArr = {119, -120, 117, 118, -87, -88, -88, -93, -94, 119, -96, -99, -105, -97, -128, -99, -89, -88, -103, -94, -103, -90, 115, -96, -96, -99, -96, 78, -109, -90, -109, -111, -93, -94, -105, -100, -107, 78, -113, -111, -94, -105, -99, -100, -100, -55, -55, -58, -55, 119, -50, -65, -64, -61, -68, 119, -58, -57, -68, -59, -64, -59, -66, 119, -55, -46, -49, -55, -47, -59, -39, -43, -37, -40, -55, -53};
        String[] strArr = A0H;
        if (strArr[4].charAt(11) == strArr[6].charAt(11)) {
            throw new RuntimeException();
        }
        A0H[5] = "";
        A0G = bArr;
    }

    static {
        A03();
        A0F = 0L;
    }

    public C1979bV(C2300gi c2300gi, String str, C2245fp c2245fp, Y2 y2, VA va, C1564Ng c1564Ng) {
        this(c2300gi, str, c2245fp, y2, va, c1564Ng, new C1499Ks());
    }

    public C1979bV(C2300gi c2300gi, String str, C2245fp c2245fp, Y2 y2, VA va, C1564Ng c1564Ng, InterfaceC1841Yh interfaceC1841Yh) {
        this.A0E = true;
        this.A08 = c2300gi;
        this.A0D = str;
        this.A0C = c2245fp;
        this.A0A = y2;
        this.A09 = va;
        this.A07 = c1564Ng;
        this.A0B = interfaceC1841Yh;
    }

    public C1979bV(C2300gi c2300gi, String str, C2245fp c2245fp, Y2 y2, VA va, C1564Ng c1564Ng, InterfaceC1841Yh interfaceC1841Yh, InterfaceC1815Xh interfaceC1815Xh) {
        this.A0E = true;
        this.A08 = c2300gi;
        this.A0D = str;
        this.A0C = c2245fp;
        this.A0A = y2;
        this.A09 = va;
        this.A07 = c1564Ng;
        this.A0B = interfaceC1841Yh;
        this.A04 = interfaceC1815Xh;
    }

    private EnumC1549Mq A00(String str, String str2, Map<String, String> map) {
        String strA01 = A01(0, 22, 33);
        EnumC1549Mq actionOutcome = EnumC1549Mq.A09;
        try {
            YB.A0c(map, this.A02);
            Uri uriA00 = XB.A00(str2);
            if (this.A01 == null) {
                this.A01 = C1553Mu.A01(this.A08, this.A09, str, uriA00, new C1957b9(map).A03(this.A0C).A02(this.A0A).A05(), true, this.A06, this.A07);
                A02();
            }
            if (this.A01 instanceof AnonymousClass87) {
                ((AnonymousClass87) this.A01).A0N(this.A03);
            }
            if (this.A01 != null) {
                actionOutcome = this.A01.A0G(map.get(A01(64, 12, 83)));
                if (this.A06 && (this.A01 instanceof AnonymousClass85)) {
                    actionOutcome = EnumC1549Mq.A08;
                }
            }
            if (!(((this.A01 instanceof AnonymousClass84) || (this.A01 instanceof AnonymousClass87)) && YB.A0i(this.A08, actionOutcome, map)) && actionOutcome != EnumC1549Mq.A06) {
                if (this.A05 != null) {
                    this.A05.ADY();
                }
                this.A0B.A4j(this.A0D);
            }
        } catch (ActivityNotFoundException e2) {
            Log.e(strA01, A01(44, 20, 68) + str2, e2);
        } catch (Exception e3) {
            Log.e(strA01, A01(22, 22, 27), e3);
        }
        return actionOutcome;
    }

    private void A02() {
        if (this.A01 != null && this.A01.A0E() == null && this.A00 != null) {
            this.A01.A0F(this.A00);
        }
    }

    public static boolean A04(C2300gi c2300gi) {
        boolean zA2w = C1750Up.A2w(c2300gi);
        int iA07 = C1750Up.A07(c2300gi);
        long jCurrentTimeMillis = System.currentTimeMillis() - A0F;
        if (zA2w && A0F > 0 && jCurrentTimeMillis < iA07) {
            return true;
        }
        A0F = System.currentTimeMillis();
        return false;
    }

    public final EnumC1549Mq A05(String str, String str2, Map<String, String> extraData) {
        EnumC1549Mq enumC1549MqA00 = EnumC1549Mq.A09;
        new VI(str, this.A09).A04(VH.A0J, extraData);
        if (this.A0A.A09(this.A08)) {
            this.A09.AB6(str, extraData);
        } else {
            enumC1549MqA00 = A00(str, str2, extraData);
            if (this.A02 != null && this.A02.A29().A0L() != null && this.A04 != null) {
                XI.A07(this.A08.A02(), this.A02.A29().A0L(), this.A04);
            }
        }
        return enumC1549MqA00;
    }

    public final InterfaceC1550Mr A06() {
        if (this.A01 != null) {
            InterfaceC1550Mr interfaceC1550MrA0E = this.A01.A0E();
            String[] strArr = A0H;
            if (strArr[4].charAt(11) == strArr[6].charAt(11)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0H;
            strArr2[4] = "m9EeWSKmUQIcAT4bR8TqW1uNxXCrncrR";
            strArr2[6] = "ZpUrOoewPl5vbi76KZuNJwABiWDkIMaY";
            return interfaceC1550MrA0E;
        }
        return null;
    }

    public final void A07(InterfaceC1550Mr interfaceC1550Mr) {
        this.A00 = interfaceC1550Mr;
        A02();
    }

    public final void A08(AbstractC2465jd abstractC2465jd) {
        this.A02 = abstractC2465jd;
    }

    public final void A09(XS xs) {
        this.A03 = xs;
    }

    public final void A0A(InterfaceC1815Xh interfaceC1815Xh) {
        this.A04 = interfaceC1815Xh;
    }

    public final void A0B(InterfaceC1978bU interfaceC1978bU) {
        this.A05 = interfaceC1978bU;
    }

    public final void A0C(boolean z2) {
        this.A06 = z2;
    }
}
