package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1578Nu {
    public static byte[] A05;
    public static String[] A06 = {"SwW", "nKJOmWTx3LjNZvOp7YbBROgXIyGkfXUh", "cNvS8LZQYgXEdOP85dYAvAy4C3J", "ICxq6EmLG0dgZi7UJ5PBV2wBsvrmCfpb", "tKedy3gZYTLe", "bmz0vq", "hvIAQTYE0cdtFIL2", "tj9oqRvQS19ndgZTuA"};
    public C1706Sx A00;
    public EnumC1961bD A01 = EnumC1961bD.A05;
    public ArrayList<C2084dC> A02 = new ArrayList<>();
    public final NQ A03;
    public final InterfaceC1577Nt A04;

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-35, 23, 35, 28, 27, -66, -29, -23, -38, -25, -29, -42, -31, -107, -70, -25, -25, -28, -25, -107, -89, -91, -91, -85, -107, -20, -34, -23, -35, -28, -22, -23, -107, -42, -107, -21, -42, -31, -34, -39, -107, -74, -39, -66, -29, -37, -28, -93, 21, 24, 19, 24, 21, 40, 21, 19, 22, 41, 34, 24, 32, 25, -29, -14, -21, -36, -31, -38, -30, -25, -40, -23, -38, -21, -38, -26, -20, 18, 23, 16, 24, 29, 20, 19, -16, 19, -13, 16, 35, 16, -15, 36, 29, 19, 27, 20, 63, 68, 74, 59, 72, 73, 74, 63, 74, 63, 55, 66};
    }

    static {
        A06();
    }

    public C1578Nu(C2300gi c2300gi, O8 o8, InterfaceC1577Nt interfaceC1577Nt, String str) {
        JSONObject dataObject = o8.A03();
        this.A03 = A01(c2300gi, o8, str, dataObject);
        this.A04 = interfaceC1577Nt;
    }

    private AdError A00(C2300gi c2300gi, AbstractC2465jd abstractC2465jd) {
        if (abstractC2465jd == null || abstractC2465jd.A2G().isEmpty()) {
            c2300gi.A08().ABC(A04(62, 3, 33), AbstractC1712Td.A0Z, new C1713Te(A04(5, 43, 20)));
            return AdError.internalError(2006);
        }
        return null;
    }

    public static NQ A01(C2300gi c2300gi, O8 o8, String str, JSONObject jSONObject) {
        NQ nqA00 = null;
        if (jSONObject.has(A04(65, 12, 24))) {
            try {
                nqA00 = C2459jT.A01(jSONObject, c2300gi, true);
                nqA00.A1Q(true);
                nqA00.A1N(A04(96, 12, 117));
            } catch (JSONException unused) {
            }
        }
        if (nqA00 == null) {
            nqA00 = C11777n.A00(jSONObject, c2300gi);
        }
        nqA00.A1M(str);
        C1732Tx c1732TxA01 = o8.A01();
        if (c1732TxA01 != null) {
            nqA00.A1I(c1732TxA01.A06());
        }
        return nqA00;
    }

    private C1706Sx A03(C2300gi c2300gi) {
        return this.A00 != null ? this.A00 : new C1706Sx(c2300gi);
    }

    private void A08(C2300gi c2300gi, C11777n c11777n) {
        C1572No playableData = c11777n.A29().A0H().A07();
        A0B(playableData != null ? playableData.A0H() : EnumC1961bD.A05);
        C2445jC c2445jC = new C2445jC(this);
        C1706Sx c1706Sx = new C1706Sx(c2300gi);
        boolean z2 = C1750Up.A2H(c2300gi) && SN.A0A(c11777n.A1H());
        if (z2) {
            SN unifiedAssetsLoader = new SN(c1706Sx, c11777n.A1H(), c11777n.A10(), c11777n.A1D(), z2, new C2444jB(this));
            c1706Sx.A0e(new VI(c11777n.A2E(), c2300gi.A0A()));
            unifiedAssetsLoader.A0B();
            return;
        }
        O5.A02(c2300gi, c11777n, true, c2445jC);
    }

    private void A09(C2300gi c2300gi, EnumSet<CacheFlag> enumSet, AbstractC2465jd abstractC2465jd, int i2, InterfaceC1577Nt interfaceC1577Nt) {
        boolean isDSL = abstractC2465jd.A1g();
        C1706Sx c1706SxA03 = A03(c2300gi);
        c1706SxA03.A0e(new VI(abstractC2465jd.A2E(), c2300gi.A0A()));
        boolean z2 = C1750Up.A2H(c2300gi) && SN.A0A(abstractC2465jd.A1H());
        if (z2) {
            new SN(c1706SxA03, abstractC2465jd.A1H(), abstractC2465jd.A10(), abstractC2465jd.A1D(), z2, new C2448jF(this, c2300gi, isDSL, abstractC2465jd, interfaceC1577Nt)).A0B();
            return;
        }
        String strA04 = A04(96, 12, 117);
        if (isDSL) {
            C1702St c1702St = new C1702St(abstractC2465jd.A0x(), abstractC2465jd.A1D(), strA04);
            c1702St.A04 = true;
            c1702St.A03 = A04(0, 5, 78);
            c1706SxA03.A0Y(c1702St);
        }
        c1706SxA03.A0d(new C1704Sv(abstractC2465jd.A2C().A01(), C2137e4.A04, C2137e4.A04, abstractC2465jd.A1D(), A04(96, 12, 117)));
        boolean isUnifiedAssetsLoaderEnabled = enumSet.contains(CacheFlag.VIDEO);
        int i3 = 0;
        boolean zA30 = C1750Up.A30(c2300gi, C2227fX.A03());
        for (NR nr : abstractC2465jd.A2G()) {
            C1704Sv c1704Sv = new C1704Sv(nr.A0H().A08(), O1.A00(nr.A0H()), O1.A01(nr.A0H()), abstractC2465jd.A1D(), A04(96, 12, 117));
            if (i3 == 0) {
                c1706SxA03.A0c(c1704Sv);
            } else {
                c1706SxA03.A0d(c1704Sv);
            }
            Iterator<String> it = nr.A0K().A02().iterator();
            while (it.hasNext()) {
                c1706SxA03.A0d(new C1704Sv(it.next(), -1, -1, abstractC2465jd.A1D(), A04(96, 12, 117)));
            }
            if (isUnifiedAssetsLoaderEnabled && !TextUtils.isEmpty(nr.A0H().A09())) {
                C1702St c1702St2 = new C1702St(nr.A0H().A09(), abstractC2465jd.A1D(), A04(96, 12, 117), nr.A0H().A06());
                c1702St2.A04 = false;
                if (i3 == 0) {
                    if (isDSL && !zA30) {
                        c1706SxA03.A0Y(c1702St2);
                    } else {
                        c1706SxA03.A0b(c1702St2);
                    }
                } else if (isDSL && !zA30) {
                    c1706SxA03.A0Z(c1702St2);
                } else {
                    c1706SxA03.A0a(c1702St2);
                }
            }
            i3++;
        }
        if (abstractC2465jd.A1W() && !TextUtils.isEmpty(abstractC2465jd.A11())) {
            c1706SxA03.A0d(new C1704Sv(abstractC2465jd.A11(), C1614Pe.A0A, C1614Pe.A0A, abstractC2465jd.A1D(), A04(96, 12, 117)));
        }
        O0.A00(abstractC2465jd, c1706SxA03, strA04);
        c1706SxA03.A0X(new C2446jD(this, c2300gi, isDSL, abstractC2465jd, interfaceC1577Nt), new C1699Sq(abstractC2465jd.A1D(), strA04, i2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(C2300gi c2300gi, EnumSet<CacheFlag> enumSet, C2459jT c2459jT, AbstractC2465jd abstractC2465jd, int i2, InterfaceC1577Nt interfaceC1577Nt) {
        A09(c2300gi, enumSet, abstractC2465jd, i2, new C2450jH(this, c2300gi, abstractC2465jd, c2459jT, i2, interfaceC1577Nt, enumSet));
    }

    private void A0B(EnumC1961bD enumC1961bD) {
        this.A01 = enumC1961bD;
    }

    private boolean A0C(C2300gi c2300gi, AbstractC2465jd abstractC2465jd) {
        AdError adErrorA00 = A00(c2300gi, abstractC2465jd);
        if (adErrorA00 != null) {
            this.A04.ACo(adErrorA00);
            return true;
        }
        return false;
    }

    public final NQ A0D() {
        return this.A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
    
        if (r3 != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
    
        return com.facebook.ads.redexgen.core.WK.A0C;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.facebook.ads.redexgen.core.WK A0E() {
        /*
            r5 = this;
            com.facebook.ads.redexgen.X.NQ r0 = r5.A03
            boolean r0 = r0.A1b()
            if (r0 == 0) goto Lb
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.WK.A04
            return r0
        Lb:
            com.facebook.ads.redexgen.X.NQ r4 = r5.A03
            com.facebook.ads.redexgen.X.jd r4 = (com.facebook.ads.redexgen.core.AbstractC2465jd) r4
            boolean r0 = r4.A1g()
            if (r0 == 0) goto L18
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.WK.A06
            return r0
        L18:
            java.util.List r0 = r4.A2G()
            int r1 = r0.size()
            r0 = 1
            if (r1 <= r0) goto L26
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.WK.A0A
            return r0
        L26:
            com.facebook.ads.redexgen.X.NR r0 = r4.A29()
            com.facebook.ads.redexgen.X.NU r0 = r0.A0H()
            com.facebook.ads.redexgen.X.No r3 = r0.A07()
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C1578Nu.A06
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 14
            if (r1 == r0) goto L9f
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1578Nu.A06
            java.lang.String r1 = "HO5lN2vl3hawZ3xdOTbB4PXxItmZOFKM"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "QabHGQsenJFHZf5mHftqzVXi6FXcwsQx"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L7a
            boolean r0 = r4.A1n()
            if (r0 != 0) goto L71
            boolean r3 = r4.A1u()
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C1578Nu.A06
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L74
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1578Nu.A06
            java.lang.String r1 = "iV2CDA2M2IfUZLXvhnmiNr1pV0Sur2CQ"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "GDT4frbvCKvkZrCQcOaJTMqN9T6RIdn0"
            r0 = 3
            r2[r0] = r1
            if (r3 == 0) goto L77
        L71:
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.WK.A0E
            return r0
        L74:
            if (r3 == 0) goto L77
            goto L71
        L77:
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.WK.A0C
            return r0
        L7a:
            boolean r3 = r5.A0L(r4)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C1578Nu.A06
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L99
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1578Nu.A06
            java.lang.String r1 = "iDu"
            r0 = 0
            r2[r0] = r1
            if (r3 == 0) goto L96
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.WK.A0D
            return r0
        L96:
            com.facebook.ads.redexgen.X.WK r0 = com.facebook.ads.redexgen.core.WK.A0B
            return r0
        L99:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L9f:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1578Nu.A0E():com.facebook.ads.redexgen.X.WK");
    }

    public final EnumC1961bD A0F() {
        return this.A01;
    }

    public final String A0G() {
        if (this.A03.A1b()) {
            return ((C2459jT) this.A03).A2A();
        }
        return ((AbstractC2465jd) this.A03).A2E();
    }

    public final void A0H() {
        this.A04.AKX();
    }

    public final void A0I(Intent intent, RewardData rewardData, String str) {
        this.A03.A1K(rewardData);
        this.A03.A1O(str);
        if (A0D().A1b()) {
            intent.putExtra(A04(77, 19, 78), this.A03);
        }
        intent.putExtra(A04(48, 14, 83), this.A03);
    }

    public final void A0J(C2300gi c2300gi, EnumSet<CacheFlag> enumSet) {
        if (A0E() == WK.A04) {
            C2459jT c2459jT = (C2459jT) this.A03;
            AbstractC2465jd abstractC2465jdA26 = c2459jT.A26();
            if (A0C(c2300gi, abstractC2465jdA26) || abstractC2465jdA26 == null) {
                return;
            }
            this.A04.AHY();
            A0A(c2300gi, enumSet, c2459jT, abstractC2465jdA26, 0, this.A04);
            return;
        }
        AbstractC2465jd abstractC2465jd = (AbstractC2465jd) this.A03;
        if (A06[5].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "h3j4XQE4N9RDZ4AU6tvjsFYKX3e30HKG";
        strArr[3] = "lDhcJ7lgFtqhZjTb781X3zaoWDc2BWUc";
        if (A0C(c2300gi, abstractC2465jd)) {
            return;
        }
        this.A04.AHY();
        if (A0E() == WK.A0C) {
            C11777n c11777n = (C11777n) this.A03;
            String[] strArr2 = A06;
            if (strArr2[2].length() != strArr2[6].length()) {
                A06[7] = "0uVLF1bkkTEn2WeYm46QMmOd1A6";
                A08(c2300gi, c11777n);
                return;
            } else {
                A08(c2300gi, c11777n);
                return;
            }
        }
        A09(c2300gi, enumSet, (C11777n) this.A03, -1, this.A04);
    }

    public final boolean A0K() {
        return this.A03.A1U();
    }

    public final boolean A0L(AbstractC2465jd abstractC2465jd) {
        return !TextUtils.isEmpty(abstractC2465jd.A29().A0H().A09());
    }
}
