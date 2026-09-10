package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Et, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1346Et {
    public static String[] A00 = {"94gd2lHaz6driogpt3Nl1tWsjXgriMxS", "VA5F17cuoV6wg6So0a0DluDefxsQAbFW", "BZfou2TK48MMfd1yJcRZTZ4JcnnWlmHT", "ilV1kn3efEuJyycOIV0UyN70TAMLymqY", "v19hT7CAJaCb1rntEZC2LQpyBVrX3IkZ", "rkpPVUKbY", "FKwb9S", "XsKsPoEAnPyrLBiotdeURrQ5Q46xoiIz"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2815pY A01(C1341Eo c1341Eo, List<? extends InterfaceC1343Eq>[] listArr) {
        C2K c2k = new C2K();
        int i2 = 0;
        while (true) {
            boolean z2 = false;
            if (i2 >= c1341Eo.A02()) {
                C2690nW c2690nWA06 = c1341Eo.A06();
                for (int i3 = 0; i3 < c2690nWA06.A01; i3++) {
                    C2823pg c2823pgA05 = c2690nWA06.A05(i3);
                    int[] iArr = new int[c2823pgA05.A01];
                    Arrays.fill(iArr, 0);
                    c2k.A04(new C2816pZ(c2823pgA05, false, iArr, new boolean[c2823pgA05.A01]));
                }
                return new C2815pY(c2k.A05());
            }
            C2690nW c2690nWA07 = c1341Eo.A07(i2);
            List<? extends InterfaceC1343Eq> list = listArr[i2];
            int i4 = 0;
            while (i4 < c2690nWA07.A01) {
                C2823pg c2823pgA06 = c2690nWA07.A05(i4);
                int iA05 = c1341Eo.A05(i2, i4, z2);
                String[] strArr = A00;
                if (strArr[7].charAt(11) == strArr[0].charAt(11)) {
                    String[] strArr2 = A00;
                    strArr2[7] = "wVGS7RX5kLdrLFKtRIe7uQsNtd1z6IxW";
                    strArr2[0] = "7aERijPLyLRrdgSw5lQfoyda5cW2h3c0";
                    boolean z3 = iA05 != 0;
                    int[] iArr2 = new int[c2823pgA06.A01];
                    boolean[] zArr = new boolean[c2823pgA06.A01];
                    for (int i5 = 0; i5 < c2823pgA06.A01; i5++) {
                        iArr2[i5] = c1341Eo.A04(i2, i4, i5);
                        boolean z4 = false;
                        if (A00[5].length() == 9) {
                            String[] strArr3 = A00;
                            strArr3[2] = "3DHxmUKuGZITV4091m9MLUNqu1ZkNm0q";
                            strArr3[3] = "2BQZhu0LL1SbQMNt9wHOkoks63NLimX3";
                            for (int i6 = 0; i6 < list.size(); i6++) {
                                InterfaceC1343Eq interfaceC1343Eq = list.get(i6);
                                if (interfaceC1343Eq.A9L().equals(c2823pgA06) && interfaceC1343Eq.AA6(i5) != -1) {
                                    z4 = true;
                                    break;
                                }
                            }
                            zArr[i5] = z4;
                        }
                    }
                    c2k.A04(new C2816pZ(c2823pgA06, z3, iArr2, zArr));
                    i4++;
                    z2 = false;
                }
                throw new RuntimeException();
            }
            i2++;
        }
    }

    public static C2815pY A00(C1341Eo c1341Eo, InterfaceC1343Eq[] interfaceC1343EqArr) {
        List listA01;
        List[] listArr = new List[interfaceC1343EqArr.length];
        for (int i2 = 0; i2 < interfaceC1343EqArr.length; i2++) {
            InterfaceC1343Eq interfaceC1343Eq = interfaceC1343EqArr[i2];
            if (interfaceC1343Eq != null) {
                listA01 = BP.A04(interfaceC1343Eq);
            } else {
                listA01 = MetaExoPlayerCustomizedCollections.A01();
            }
            listArr[i2] = listA01;
        }
        return A01(c1341Eo, listArr);
    }
}
