package com.facebook.ads.redexgen.core;

import android.content.ActivityNotFoundException;
import android.net.Uri;
import android.util.Log;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class FQ {
    public static long A0E;
    public static byte[] A0F;
    public static String[] A0G = {"R0SbMgWAoC497HVFrz", "HjDMjTQFKfQjEPdjddKMHVEmssyIO6xJ", "qLmiUd82g2mhrwqPXxjSPUm4NIZHyVr2", "b8w5", "5ahVLoWejnV8u5u0zxB2Y4aA1Z0H734m", "82nB4Ww4zktBcOGVc7", "fE0nEfPNcAkneFTlCeTsSM9yzZ1yQJUc", "9xmO"};
    public AbstractC03841v A00;
    public AbstractC1984md A01;
    public CL A02;
    public CZ A03;
    public FP A04;
    public boolean A05;
    public boolean A06;
    public final C03962h A07;
    public final C1828k1 A08;
    public final A7 A09;
    public final C0647Cv A0A;
    public final DR A0B;
    public final JL A0C;
    public final String A0D;

    public static String A00(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        byte[] bArr = {119, -120, 117, 118, -87, -88, -88, -93, -94, 119, -96, -99, -105, -97, -128, -99, -89, -88, -103, -94, -103, -90, 115, -96, -96, -99, -96, 78, -109, -90, -109, -111, -93, -94, -105, -100, -107, 78, -113, -111, -94, -105, -99, -100, -100, -55, -55, -58, -55, 119, -50, -65, -64, -61, -68, 119, -58, -57, -68, -59, -64, -59, -66, 119, -55, -46, -49, -55, -47, -59, -39, -43, -37, -40, -55, -53};
        String[] strArr = A0G;
        if (strArr[4].charAt(11) == strArr[6].charAt(11)) {
            throw new RuntimeException();
        }
        A0G[5] = "";
        A0F = bArr;
    }

    static {
        A01();
        A0E = 0L;
    }

    public FQ(C1828k1 c1828k1, String str, JL jl, C0647Cv c0647Cv, A7 a7, C03962h c03962h) {
        this(c1828k1, str, jl, c0647Cv, a7, c03962h, new C1618gX());
    }

    public FQ(C1828k1 c1828k1, String str, JL jl, C0647Cv c0647Cv, A7 a7, C03962h c03962h, DR dr) {
        this.A05 = true;
        this.A08 = c1828k1;
        this.A0D = str;
        this.A0C = jl;
        this.A0A = c0647Cv;
        this.A09 = a7;
        this.A07 = c03962h;
        this.A0B = dr;
    }

    public FQ(C1828k1 c1828k1, String str, JL jl, C0647Cv c0647Cv, A7 a7, C03962h c03962h, DR dr, CZ cz) {
        this.A05 = true;
        this.A08 = c1828k1;
        this.A0D = str;
        this.A0C = jl;
        this.A0A = c0647Cv;
        this.A09 = a7;
        this.A07 = c03962h;
        this.A0B = dr;
        this.A03 = cz;
    }

    private void A02(String str, String str2, Map<String, String> map) {
        String strA00 = A00(0, 22, 33);
        try {
            D3.A0Y(map, this.A01);
            Uri uriA00 = C5.A00(str2);
            if (this.A00 == null) {
                this.A00 = C03851w.A01(this.A08, this.A09, str, uriA00, new FB(map).A03(this.A0C).A02(this.A0A).A05(), this.A05, this.A06, this.A07);
            }
            if (this.A00 instanceof NA) {
                ((NA) this.A00).A0H(this.A02);
            }
            EnumC03831u enumC03831uA0C = EnumC03831u.A09;
            if (this.A00 != null) {
                enumC03831uA0C = this.A00.A0C(map.get(A00(64, 12, 83)));
            }
            if (!(((this.A00 instanceof N8) || (this.A00 instanceof NA)) && D3.A0e(this.A08, enumC03831uA0C, map)) && enumC03831uA0C != EnumC03831u.A06) {
                if (this.A04 != null) {
                    this.A04.ACn();
                }
                this.A0B.A4Z(this.A0D);
            }
        } catch (ActivityNotFoundException e) {
            Log.e(strA00, A00(44, 20, 68) + str2, e);
        } catch (Exception e2) {
            Log.e(strA00, A00(22, 22, 27), e2);
        }
    }

    public static boolean A03(C1828k1 c1828k1) {
        boolean zA2m = C05789m.A2m(c1828k1);
        int iA07 = C05789m.A07(c1828k1);
        long jCurrentTimeMillis = System.currentTimeMillis() - A0E;
        if (zA2m && A0E > 0 && jCurrentTimeMillis < iA07) {
            return true;
        }
        A0E = System.currentTimeMillis();
        return false;
    }

    public final void A04(AbstractC1984md abstractC1984md) {
        this.A01 = abstractC1984md;
    }

    public final void A05(CL cl) {
        this.A02 = cl;
    }

    public final void A06(CZ cz) {
        this.A03 = cz;
    }

    public final void A07(FP fp) {
        this.A04 = fp;
    }

    public final void A08(String str, String str2, Map<String, String> extraData) {
        new AF(str, this.A09).A04(AE.A0J, extraData);
        if (this.A0A.A09(this.A08)) {
            this.A09.AAq(str, extraData);
            return;
        }
        A02(str, str2, extraData);
        if (this.A01 == null || this.A01.A1b().A0J() == null || this.A03 == null) {
            return;
        }
        CC.A07(this.A08.A02(), this.A01.A1b().A0J(), this.A03);
    }

    public final void A09(boolean z) {
        this.A06 = z;
    }
}
