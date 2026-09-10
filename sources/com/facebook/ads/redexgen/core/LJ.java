package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class LJ {
    public static byte[] A02;
    public static String[] A03 = {"5V45xVrzlJXesqnrbjrZeT76qkPwv", "706Txtts1K7q5FoHp33PEv9HaNMSsjAK", "qupHUySH2p9zJgxISfihn0myWA92wmd9", "5DvGIEuDVuIxxSW2dLmZtZYg2a6kN8VU", "n2fidlshYBQzN55WQs4Vi6", "kTscsm2f8c9DflsdA4bvXVbGUagx", "", "mbeoGjxKtAefmgmFA563kx"};
    public final List<C2860qI> A00;
    public final InterfaceC1407Hd[] A01;

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i2, i2 + i3);
        int i5 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[5].length() == 31) {
                throw new RuntimeException();
            }
            A03[0] = "BUpOOmvQBkZMcHt4Z";
            if (i5 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 6);
            i5++;
        }
    }

    public static void A01() {
        A02 = new byte[]{-114, -77, -69, -90, -79, -82, -87, 101, -88, -79, -76, -72, -86, -87, 101, -88, -90, -75, -71, -82, -76, -77, 101, -78, -82, -78, -86, 101, -71, -66, -75, -86, 101, -75, -73, -76, -69, -82, -87, -86, -87, AbstractJsonLexerKt.TC_INVALID, 101, -38, -23, -23, -27, -30, -36, -38, -19, -30, -24, -25, -88, -36, -34, -38, -90, -81, -87, -79, -116, -101, -101, -105, -108, -114, -116, -97, -108, -102, -103, 90, -114, -112, -116, 88, 98, 91, 99};
    }

    static {
        A01();
    }

    public LJ(List<C2860qI> list) {
        this.A00 = list;
        this.A01 = new InterfaceC1407Hd[list.size()];
    }

    public final void A02(long j, C11074v c11074v) {
        if (c11074v.A07() < 9) {
            return;
        }
        int userDataIdentifier = c11074v.A0C();
        int iA0C = c11074v.A0C();
        int iA0I = c11074v.A0I();
        if (userDataIdentifier == 434) {
            int userDataIdentifier2 = A03[3].charAt(2);
            if (userDataIdentifier2 != 118) {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[7] = "5ag0VzOfRdhx9UNauvnxAz";
            strArr[4] = "f0o3UWjxlhBFesYxHlhgg4";
            if (iA0C == 1195456820 && iA0I == 3) {
                H3.A04(j, c11074v, this.A01);
            }
        }
    }

    public final void A03(HA ha, LG lg) {
        for (int i2 = 0; i2 < i; i2++) {
            lg.A05();
            InterfaceC1407Hd interfaceC1407HdAKS = ha.AKS(lg.A03(), 3);
            C2860qI c2860qI = this.A00.get(i2);
            String str = c2860qI.A0W;
            AbstractC10843y.A09(A00(43, 19, 115).equals(str) || A00(62, 19, 37).equals(str), A00(0, 43, 63) + str);
            C10512p c10512pA11 = new C10512p().A0y(lg.A04()).A11(str);
            int i3 = c2860qI.A0H;
            C10512p c10512pA10 = c10512pA11.A0n(i3).A10(c2860qI.A0V);
            int i4 = c2860qI.A03;
            interfaceC1407HdAKS.A6e(c10512pA10.A0Z(i4).A12(c2860qI.A0X).A14());
            this.A01[i2] = interfaceC1407HdAKS;
        }
    }
}
