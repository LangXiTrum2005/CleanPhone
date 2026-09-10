package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Et, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC1177Et {
    public static String[] A00 = {"94gd2lHaz6driogpt3Nl1tWsjXgriMxS", "VA5F17cuoV6wg6So0a0DluDefxsQAbFW", "BZfou2TK48MMfd1yJcRZTZ4JcnnWlmHT", "ilV1kn3efEuJyycOIV0UyN70TAMLymqY", "v19hT7CAJaCb1rntEZC2LQpyBVrX3IkZ", "rkpPVUKbY", "FKwb9S", "XsKsPoEAnPyrLBiotdeURrQ5Q46xoiIz"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2646pY A01(C1172Eo c1172Eo, List<? extends InterfaceC1174Eq>[] listArr) {
        C2K c2k = new C2K();
        int i = 0;
        while (true) {
            boolean z = false;
            if (i >= c1172Eo.A02()) {
                C2521nW c2521nWA06 = c1172Eo.A06();
                for (int i2 = 0; i2 < c2521nWA06.A01; i2++) {
                    C2654pg c2654pgA05 = c2521nWA06.A05(i2);
                    int[] iArr = new int[c2654pgA05.A01];
                    Arrays.fill(iArr, 0);
                    c2k.A04(new C2647pZ(c2654pgA05, false, iArr, new boolean[c2654pgA05.A01]));
                }
                return new C2646pY(c2k.A05());
            }
            C2521nW c2521nWA07 = c1172Eo.A07(i);
            List<? extends InterfaceC1174Eq> list = listArr[i];
            int i3 = 0;
            while (i3 < c2521nWA07.A01) {
                C2654pg c2654pgA06 = c2521nWA07.A05(i3);
                int iA05 = c1172Eo.A05(i, i3, z);
                String[] strArr = A00;
                if (strArr[7].charAt(11) == strArr[0].charAt(11)) {
                    String[] strArr2 = A00;
                    strArr2[7] = "wVGS7RX5kLdrLFKtRIe7uQsNtd1z6IxW";
                    strArr2[0] = "7aERijPLyLRrdgSw5lQfoyda5cW2h3c0";
                    boolean z2 = iA05 != 0;
                    int[] iArr2 = new int[c2654pgA06.A01];
                    boolean[] zArr = new boolean[c2654pgA06.A01];
                    for (int i4 = 0; i4 < c2654pgA06.A01; i4++) {
                        iArr2[i4] = c1172Eo.A04(i, i3, i4);
                        boolean z3 = false;
                        if (A00[5].length() == 9) {
                            String[] strArr3 = A00;
                            strArr3[2] = "3DHxmUKuGZITV4091m9MLUNqu1ZkNm0q";
                            strArr3[3] = "2BQZhu0LL1SbQMNt9wHOkoks63NLimX3";
                            for (int i5 = 0; i5 < list.size(); i5++) {
                                InterfaceC1174Eq interfaceC1174Eq = list.get(i5);
                                if (interfaceC1174Eq.A9L().equals(c2654pgA06) && interfaceC1174Eq.AA6(i4) != -1) {
                                    z3 = true;
                                    break;
                                }
                            }
                            zArr[i4] = z3;
                        }
                    }
                    c2k.A04(new C2647pZ(c2654pgA06, z2, iArr2, zArr));
                    i3++;
                    z = false;
                }
                throw new RuntimeException();
            }
            i++;
        }
    }

    public static C2646pY A00(C1172Eo c1172Eo, InterfaceC1174Eq[] interfaceC1174EqArr) {
        List listA01;
        List[] listArr = new List[interfaceC1174EqArr.length];
        for (int i = 0; i < interfaceC1174EqArr.length; i++) {
            InterfaceC1174Eq interfaceC1174Eq = interfaceC1174EqArr[i];
            if (interfaceC1174Eq != null) {
                listA01 = BP.A04(interfaceC1174Eq);
            } else {
                listA01 = MetaExoPlayerCustomizedCollections.A01();
            }
            listArr[i] = listA01;
        }
        return A01(c1172Eo, listArr);
    }
}
