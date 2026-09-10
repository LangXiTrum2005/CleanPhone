package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.dD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1415dD {
    public static String[] A00 = {"R7kQInlCLC03eI55mV4UoORjPU15l1Rl", "ZzO4Fw17CmbIRnn7JxDv7t45eAY7DmMs", "hevIFy9SEKvPeGhnoQgR8DeAerD6ZdNb", "HjpxQ6yhMQfElXyid35YRscHlnSZG9I7", "rzaEWZkBrGf0g0umjtU3VxjwbtE55ppG", "GvaVOIcymqJKrItS6V1I7uGU5KGap44v", "MShDTByTLQibe2ZQNIrlUAOSqfC4geIC", "mUZ9sbq8ymwYO1NsTw9D4lQs8os5nO51"};

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Y4 A01(C1410d8 c1410d8, List<? extends InterfaceC1412dA>[] listArr) {
        C4T c4t = new C4T();
        int i = 0;
        while (true) {
            boolean z = false;
            if (i >= c1410d8.A02()) {
                break;
            }
            C0992Qs c0992QsA07 = c1410d8.A07(i);
            List<? extends InterfaceC1412dA> list = listArr[i];
            int i2 = 0;
            while (i2 < c0992QsA07.A01) {
                C1175Yc c1175YcA05 = c0992QsA07.A05(i2);
                boolean z2 = c1410d8.A05(i, i2, z) != 0;
                int[] iArr = new int[c1175YcA05.A01];
                boolean[] zArr = new boolean[c1175YcA05.A01];
                for (int i3 = 0; i3 < c1175YcA05.A01; i3++) {
                    iArr[i3] = c1410d8.A04(i, i2, i3);
                    boolean z3 = false;
                    for (int i4 = 0; i4 < list.size(); i4++) {
                        InterfaceC1412dA interfaceC1412dA = list.get(i4);
                        if (interfaceC1412dA.A9B().equals(c1175YcA05) && interfaceC1412dA.A9w(i3) != -1) {
                            z3 = true;
                            break;
                        }
                    }
                    zArr[i3] = z3;
                }
                c4t.A04(new Y5(c1175YcA05, z2, iArr, zArr));
                i2++;
                z = false;
            }
            i++;
        }
        C0992Qs c0992QsA06 = c1410d8.A06();
        for (int i5 = 0; i5 < c0992QsA06.A01; i5++) {
            C1175Yc c1175YcA06 = c0992QsA06.A05(i5);
            int[] iArr2 = new int[c1175YcA06.A01];
            Arrays.fill(iArr2, 0);
            c4t.A04(new Y5(c1175YcA06, false, iArr2, new boolean[c1175YcA06.A01]));
        }
        return new Y4(c4t.A05());
    }

    public static Y4 A00(C1410d8 c1410d8, InterfaceC1412dA[] interfaceC1412dAArr) {
        List[] listArr = new List[interfaceC1412dAArr.length];
        int i = 0;
        while (true) {
            int length = interfaceC1412dAArr.length;
            String[] strArr = A00;
            String str = strArr[4];
            String str2 = strArr[5];
            int i2 = str.charAt(2);
            if (i2 != str2.charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[4] = "LAaHcxAlJ7MPQdTlk2xlyXuEgB8WHW8x";
            strArr2[5] = "XLammvrN6cDBpSJb0F463ht2L3NlIFBq";
            if (i < length) {
                InterfaceC1412dA interfaceC1412dA = interfaceC1412dAArr[i];
                listArr[i] = interfaceC1412dA != null ? OI.A04(interfaceC1412dA) : MetaExoPlayerCustomizedCollections.A01();
                i++;
            } else {
                return A01(c1410d8, listArr);
            }
        }
    }
}
