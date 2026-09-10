package com.facebook.ads.redexgen.core;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Kb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C0835Kb extends C1348c8 {
    public static String[] A0F = {"r3hDWnB1R9y4pEiKAURNp99h2b", "kj3t6dP2tWSOfb61zMSBvgjhGLqlygll", "", "sX8uIgx32JWe8q5WuLHBMtkPG7d", "ZlH8xHdCAMZsgB23qoj", "6lejLSjHGD", "XsRzuVWfX96s5Dei3zwO9zjz9s6FXTfu", "pCK0u"};
    public int A00;
    public ID A01;
    public boolean A02;
    public final C9K<C0834Ka> A03;
    public final C9K<KY> A04;
    public final C9K<C1336bw> A05;
    public final C9K<KX> A06;
    public final C9K<C1331br> A07;
    public final C9K<C1329bp> A08;
    public final C9K<C1328bo> A09;
    public final C9K<C1323bj> A0A;
    public final C9K<C1322bi> A0B;
    public final C1361cL A0C;
    public final AbstractC1333bt A0D;
    public final AbstractC1324bk A0E;

    public C0835Kb(C1828k1 c1828k1, A7 a7, C1361cL c1361cL, String str) {
        this(c1828k1, a7, c1361cL, str, 0, 0, false, null, null);
    }

    public C0835Kb(C1828k1 c1828k1, A7 a7, C1361cL c1361cL, String str, int i, int i2, boolean z, Bundle bundle, Map<String, String> map) {
        super(c1828k1, a7, c1361cL, str, !c1361cL.A0o(), i, i2, z, bundle, map, new C1347c7(c1828k1, c1361cL));
        this.A0E = new C0836Kc(this);
        this.A08 = new C1358cI(this);
        this.A04 = new C1357cH(this);
        this.A05 = new C1356cG(this);
        this.A06 = new C1355cF(this);
        this.A03 = new C1354cE(this);
        this.A07 = new C1353cD(this);
        this.A0A = new C1352cC(this);
        this.A0B = new C1351cB(this);
        this.A09 = new C1360cK(this);
        this.A0D = new C0837Kd(this);
        this.A02 = false;
        this.A0C = c1361cL;
        this.A0C.getEventBus().A03(this.A0E, this.A06, this.A08, this.A05, this.A04, this.A03, this.A07, this.A0A, this.A0B, this.A0D, this.A09);
        if (C05789m.A2k(c1828k1)) {
            this.A01 = new ID(c1361cL, str, null);
        }
    }

    public C0835Kb(C1828k1 c1828k1, A7 a7, C1361cL c1361cL, String str, Bundle bundle, Map<String, String> extraParams) {
        this(c1828k1, a7, c1361cL, str, 0, 0, false, bundle, extraParams);
    }

    @Override // com.facebook.ads.redexgen.core.C1348c8
    public final void A0n(IH ih, Map<String, String> map) {
        super.A0n(ih, map);
        if (this.A01 != null && ih == IH.A09) {
            Map<String, String> params = this.A01.A05();
            String[] strArr = A0F;
            if (strArr[0].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            A0F[2] = "tc9";
            map.putAll(params);
        }
    }

    public final void A0p() {
        C1359cJ c1359cJ = new C1359cJ(this);
        if (this.A0C.A0s()) {
            ExecutorC0649Cx.A00(c1359cJ);
            return;
        }
        C1361cL c1361cL = this.A0C;
        String[] strArr = A0F;
        if (strArr[4].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        A0F[1] = "nFCp2DExxe9bklz52WjNRol8ULAuMoj6";
        c1361cL.getStateHandler().post(c1359cJ);
    }
}
