package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.text.TextUtils;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.AdError;
import com.facebook.ads.CacheFlag;
import com.facebook.ads.RewardData;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.Iterator;
import org.jacoco.core.data.ExecutionDataWriter;
import org.jacoco.core.runtime.RemoteControlWriter;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Nu, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1409Nu {
    public static byte[] A05;
    public static String[] A06 = {"SwW", "nKJOmWTx3LjNZvOp7YbBROgXIyGkfXUh", "cNvS8LZQYgXEdOP85dYAvAy4C3J", "ICxq6EmLG0dgZi7UJ5PBV2wBsvrmCfpb", "tKedy3gZYTLe", "bmz0vq", "hvIAQTYE0cdtFIL2", "tj9oqRvQS19ndgZTuA"};
    public C1537Sx A00;
    public EnumC1792bD A01 = EnumC1792bD.A05;
    public ArrayList<C1915dC> A02 = new ArrayList<>();
    public final NQ A03;
    public final InterfaceC1408Nt A04;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 97);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A05 = new byte[]{-35, 23, 35, 28, 27, -66, -29, -23, -38, -25, -29, -42, -31, -107, -70, -25, -25, -28, -25, -107, -89, -91, -91, -85, -107, -20, -34, -23, -35, -28, -22, -23, -107, -42, -107, -21, -42, -31, -34, -39, -107, -74, -39, -66, -29, -37, -28, -93, 21, 24, 19, 24, 21, 40, 21, 19, 22, 41, 34, 24, RemoteControlWriter.BLOCK_CMDOK, 25, -29, -14, -21, -36, -31, -38, -30, -25, -40, -23, -38, -21, -38, -26, -20, 18, 23, ExecutionDataWriter.BLOCK_SESSIONINFO, 24, 29, 20, 19, -16, 19, -13, ExecutionDataWriter.BLOCK_SESSIONINFO, 35, ExecutionDataWriter.BLOCK_SESSIONINFO, -15, 36, 29, 19, 27, 20, Utf8.REPLACEMENT_BYTE, 68, 74, 59, 72, 73, 74, Utf8.REPLACEMENT_BYTE, 74, Utf8.REPLACEMENT_BYTE, 55, 66};
    }

    static {
        A06();
    }

    public C1409Nu(C2131gi c2131gi, O8 o8, InterfaceC1408Nt interfaceC1408Nt, String str) {
        JSONObject dataObject = o8.A03();
        this.A03 = A01(c2131gi, o8, str, dataObject);
        this.A04 = interfaceC1408Nt;
    }

    private AdError A00(C2131gi c2131gi, AbstractC2296jd abstractC2296jd) {
        if (abstractC2296jd == null || abstractC2296jd.A2G().isEmpty()) {
            c2131gi.A08().ABC(A04(62, 3, 33), AbstractC1543Td.A0Z, new C1544Te(A04(5, 43, 20)));
            return AdError.internalError(2006);
        }
        return null;
    }

    public static NQ A01(C2131gi c2131gi, O8 o8, String str, JSONObject jSONObject) {
        NQ nqA00 = null;
        if (jSONObject.has(A04(65, 12, 24))) {
            try {
                nqA00 = C2290jT.A01(jSONObject, c2131gi, true);
                nqA00.A1Q(true);
                nqA00.A1N(A04(96, 12, 117));
            } catch (JSONException unused) {
            }
        }
        if (nqA00 == null) {
            nqA00 = C10087n.A00(jSONObject, c2131gi);
        }
        nqA00.A1M(str);
        C1563Tx c1563TxA01 = o8.A01();
        if (c1563TxA01 != null) {
            nqA00.A1I(c1563TxA01.A06());
        }
        return nqA00;
    }

    private C1537Sx A03(C2131gi c2131gi) {
        return this.A00 != null ? this.A00 : new C1537Sx(c2131gi);
    }

    private void A08(C2131gi c2131gi, C10087n c10087n) {
        C1403No playableData = c10087n.A29().A0H().A07();
        A0B(playableData != null ? playableData.A0H() : EnumC1792bD.A05);
        C2276jC c2276jC = new C2276jC(this);
        C1537Sx c1537Sx = new C1537Sx(c2131gi);
        boolean z = C1581Up.A2H(c2131gi) && SN.A0A(c10087n.A1H());
        if (z) {
            SN unifiedAssetsLoader = new SN(c1537Sx, c10087n.A1H(), c10087n.A10(), c10087n.A1D(), z, new C2275jB(this));
            c1537Sx.A0e(new VI(c10087n.A2E(), c2131gi.A0A()));
            unifiedAssetsLoader.A0B();
            return;
        }
        O5.A02(c2131gi, c10087n, true, c2276jC);
    }

    private void A09(C2131gi c2131gi, EnumSet<CacheFlag> enumSet, AbstractC2296jd abstractC2296jd, int i, InterfaceC1408Nt interfaceC1408Nt) {
        boolean isDSL = abstractC2296jd.A1g();
        C1537Sx c1537SxA03 = A03(c2131gi);
        c1537SxA03.A0e(new VI(abstractC2296jd.A2E(), c2131gi.A0A()));
        boolean z = C1581Up.A2H(c2131gi) && SN.A0A(abstractC2296jd.A1H());
        if (z) {
            new SN(c1537SxA03, abstractC2296jd.A1H(), abstractC2296jd.A10(), abstractC2296jd.A1D(), z, new C2279jF(this, c2131gi, isDSL, abstractC2296jd, interfaceC1408Nt)).A0B();
            return;
        }
        String strA04 = A04(96, 12, 117);
        if (isDSL) {
            C1533St c1533St = new C1533St(abstractC2296jd.A0x(), abstractC2296jd.A1D(), strA04);
            c1533St.A04 = true;
            c1533St.A03 = A04(0, 5, 78);
            c1537SxA03.A0Y(c1533St);
        }
        c1537SxA03.A0d(new C1535Sv(abstractC2296jd.A2C().A01(), C1968e4.A04, C1968e4.A04, abstractC2296jd.A1D(), A04(96, 12, 117)));
        boolean isUnifiedAssetsLoaderEnabled = enumSet.contains(CacheFlag.VIDEO);
        int i2 = 0;
        boolean zA30 = C1581Up.A30(c2131gi, C2058fX.A03());
        for (NR nr : abstractC2296jd.A2G()) {
            C1535Sv c1535Sv = new C1535Sv(nr.A0H().A08(), O1.A00(nr.A0H()), O1.A01(nr.A0H()), abstractC2296jd.A1D(), A04(96, 12, 117));
            if (i2 == 0) {
                c1537SxA03.A0c(c1535Sv);
            } else {
                c1537SxA03.A0d(c1535Sv);
            }
            Iterator<String> it = nr.A0K().A02().iterator();
            while (it.hasNext()) {
                c1537SxA03.A0d(new C1535Sv(it.next(), -1, -1, abstractC2296jd.A1D(), A04(96, 12, 117)));
            }
            if (isUnifiedAssetsLoaderEnabled && !TextUtils.isEmpty(nr.A0H().A09())) {
                C1533St c1533St2 = new C1533St(nr.A0H().A09(), abstractC2296jd.A1D(), A04(96, 12, 117), nr.A0H().A06());
                c1533St2.A04 = false;
                if (i2 == 0) {
                    if (isDSL && !zA30) {
                        c1537SxA03.A0Y(c1533St2);
                    } else {
                        c1537SxA03.A0b(c1533St2);
                    }
                } else if (isDSL && !zA30) {
                    c1537SxA03.A0Z(c1533St2);
                } else {
                    c1537SxA03.A0a(c1533St2);
                }
            }
            i2++;
        }
        if (abstractC2296jd.A1W() && !TextUtils.isEmpty(abstractC2296jd.A11())) {
            c1537SxA03.A0d(new C1535Sv(abstractC2296jd.A11(), C1445Pe.A0A, C1445Pe.A0A, abstractC2296jd.A1D(), A04(96, 12, 117)));
        }
        O0.A00(abstractC2296jd, c1537SxA03, strA04);
        c1537SxA03.A0X(new C2277jD(this, c2131gi, isDSL, abstractC2296jd, interfaceC1408Nt), new C1530Sq(abstractC2296jd.A1D(), strA04, i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0A(C2131gi c2131gi, EnumSet<CacheFlag> enumSet, C2290jT c2290jT, AbstractC2296jd abstractC2296jd, int i, InterfaceC1408Nt interfaceC1408Nt) {
        A09(c2131gi, enumSet, abstractC2296jd, i, new C2281jH(this, c2131gi, abstractC2296jd, c2290jT, i, interfaceC1408Nt, enumSet));
    }

    private void A0B(EnumC1792bD enumC1792bD) {
        this.A01 = enumC1792bD;
    }

    private boolean A0C(C2131gi c2131gi, AbstractC2296jd abstractC2296jd) {
        AdError adErrorA00 = A00(c2131gi, abstractC2296jd);
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
            com.facebook.ads.redexgen.X.jd r4 = (com.facebook.ads.redexgen.core.AbstractC2296jd) r4
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
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C1409Nu.A06
            r0 = 4
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 14
            if (r1 == r0) goto L9f
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1409Nu.A06
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
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C1409Nu.A06
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L74
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1409Nu.A06
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
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C1409Nu.A06
            r0 = 0
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 2
            if (r1 == r0) goto L99
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C1409Nu.A06
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
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1409Nu.A0E():com.facebook.ads.redexgen.X.WK");
    }

    public final EnumC1792bD A0F() {
        return this.A01;
    }

    public final String A0G() {
        if (this.A03.A1b()) {
            return ((C2290jT) this.A03).A2A();
        }
        return ((AbstractC2296jd) this.A03).A2E();
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

    public final void A0J(C2131gi c2131gi, EnumSet<CacheFlag> enumSet) {
        if (A0E() == WK.A04) {
            C2290jT c2290jT = (C2290jT) this.A03;
            AbstractC2296jd abstractC2296jdA26 = c2290jT.A26();
            if (A0C(c2131gi, abstractC2296jdA26) || abstractC2296jdA26 == null) {
                return;
            }
            this.A04.AHY();
            A0A(c2131gi, enumSet, c2290jT, abstractC2296jdA26, 0, this.A04);
            return;
        }
        AbstractC2296jd abstractC2296jd = (AbstractC2296jd) this.A03;
        if (A06[5].length() == 0) {
            throw new RuntimeException();
        }
        String[] strArr = A06;
        strArr[1] = "h3j4XQE4N9RDZ4AU6tvjsFYKX3e30HKG";
        strArr[3] = "lDhcJ7lgFtqhZjTb781X3zaoWDc2BWUc";
        if (A0C(c2131gi, abstractC2296jd)) {
            return;
        }
        this.A04.AHY();
        if (A0E() == WK.A0C) {
            C10087n c10087n = (C10087n) this.A03;
            String[] strArr2 = A06;
            if (strArr2[2].length() != strArr2[6].length()) {
                A06[7] = "0uVLF1bkkTEn2WeYm46QMmOd1A6";
                A08(c2131gi, c10087n);
                return;
            } else {
                A08(c2131gi, c10087n);
                return;
            }
        }
        A09(c2131gi, enumSet, (C10087n) this.A03, -1, this.A04);
    }

    public final boolean A0K() {
        return this.A03.A1U();
    }

    public final boolean A0L(AbstractC2296jd abstractC2296jd) {
        return !TextUtils.isEmpty(abstractC2296jd.A29().A0H().A09());
    }
}
