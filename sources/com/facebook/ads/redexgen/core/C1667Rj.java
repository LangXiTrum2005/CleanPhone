package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.os.Build;
import android.widget.RelativeLayout;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C1667Rj {
    public static byte[] A04;
    public static String[] A05 = {"MJXAzUwyiLvMzZCrP1QJf8uMs9b", "sHuNTXgsBnW3HGqskl7KH5QkikNWpABj", "q8u9vKEVkpk3dMxroB1EFzM5kwDKfJOq", "eyGwnlQBA4bCraIcft5FxvFgN7f8TC5N", "FmmRYKiwjJl3dX1FB2pV6kIWJpsNLC6h", "flBitaWG3wpDSjkerYNuTkR3r5UhRox3", "xkUQOvOGGj42jMnQjSDdoLzQvdQiYUba", "XqZ9VL6XKZ5Y"};
    public final Intent A00;
    public final C1662Re A01;
    public final C2300gi A02;
    public final VA A03;

    public static String A0K(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0L() {
        A04 = new byte[]{99, AbstractJsonLexerKt.TC_INVALID, 4, 1, 58, 1, 4, 17, 4, 58, 7, 16, 11, 1, 9, 0, 43, 41, 36, 36, 45, 58, 28, 49, 56, 45, 119, 124, 117, 125, 122, 113, 112, 85, 112, 80, 117, 96, 117, 86, 97, 122, 112, 120, 113, 35, 44, 41, 49, 32, 55, 32, 33, 26, 38, 41, 44, 38, 46, 26, 33, 32, 41, 36, 60, 26, 40, 54, 123, 97, 77, 100, 32, 77, 118, 119, 97, 123, 117, 124, 116, 123, 110, 115, 108, AbstractJsonLexerKt.TC_INVALID, 91, 126, 94, 123, 110, 123, 88, 111, 116, 126, 118, AbstractJsonLexerKt.TC_INVALID, 32, 55, 37, 51, 32, 54, 55, 54, 4, 59, 54, 55, 61, 19, 54, 22, 51, 38, 51, 16, 39, 60, 54, 62, 55, 22, 9, 4, 5, 15, 63, 20, 9, 13, 5, 63, 16, 15, 12, 12, 9, 14, 7, 63, 9, 14, 20, 5, 18, 22, 1, 12};
    }

    static {
        A0L();
    }

    public C1667Rj(C1662Re c1662Re, Intent intent, VA va, C2300gi c2300gi) {
        this.A01 = c1662Re;
        this.A00 = intent;
        this.A03 = va;
        this.A02 = c2300gi;
    }

    private AbstractC2465jd A00() {
        int i2 = Build.VERSION.SDK_INT;
        String strA0K = A0K(80, 18, 33);
        if (i2 >= 33) {
            return (AbstractC2465jd) this.A00.getSerializableExtra(strA0K, AbstractC2465jd.class);
        }
        Intent intent = this.A00;
        String[] strArr = A05;
        if (strArr[6].charAt(13) != strArr[2].charAt(13)) {
            throw new RuntimeException();
        }
        A05[1] = "LmjecX6z1NXmevkMdudhCsYVgseeBlBL";
        return (AbstractC2465jd) intent.getSerializableExtra(strA0K);
    }

    private C2459jT A01() {
        int i2 = Build.VERSION.SDK_INT;
        String strA0K = A0K(26, 19, 47);
        if (i2 >= 33) {
            return (C2459jT) this.A00.getSerializableExtra(strA0K, C2459jT.class);
        }
        return (C2459jT) this.A00.getSerializableExtra(strA0K);
    }

    private C11777n A02() {
        int i2 = Build.VERSION.SDK_INT;
        String strA0K = A0K(2, 14, 94);
        if (i2 >= 33) {
            return (C11777n) this.A00.getSerializableExtra(strA0K, C11777n.class);
        }
        return (C11777n) this.A00.getSerializableExtra(strA0K);
    }

    private C11757l A03() {
        int i2 = Build.VERSION.SDK_INT;
        String strA0K = A0K(98, 25, 105);
        if (i2 >= 33) {
            return (C11757l) this.A00.getSerializableExtra(strA0K, C11757l.class);
        }
        return (C11757l) this.A00.getSerializableExtra(strA0K);
    }

    private InterfaceC1842Yi A05() {
        boolean booleanExtra = this.A00.getBooleanExtra(A0K(68, 12, 41), false);
        boolean isV2Design = C1750Up.A2w(this.A02);
        if (isV2Design) {
            String stringExtra = this.A00.getStringExtra(A0K(45, 23, 126));
            C1662Re c1662Re = this.A01;
            C2300gi c2300gi = this.A02;
            VA va = this.A03;
            C2346hS c2346hS = new C2346hS(this.A01);
            String stringExtra2 = this.A00.getStringExtra(A0K(16, 10, 115));
            if (stringExtra == null) {
                stringExtra = A0K(0, 2, 117);
            }
            int i2 = Integer.parseInt(stringExtra);
            String clickDelayMs = A05[5];
            if (clickDelayMs.charAt(3) != 'i') {
                throw new RuntimeException();
            }
            A05[4] = "YY09SF1W0j6b6KfCSgRusx8TJPca7HgC";
            return new ViewOnClickListenerC11616x(c1662Re, c2300gi, va, c2346hS, stringExtra2, i2);
        }
        return new PZ(this.A01, this.A02, this.A03, new C2346hS(this.A01), booleanExtra);
    }

    private InterfaceC1842Yi A06() {
        C11777n c11777nA02 = A02();
        if (c11777nA02 == null) {
            return null;
        }
        return A08(new AnonymousClass77(this.A01), c11777nA02, c11777nA02.A1G(), new MH());
    }

    private InterfaceC1842Yi A07() {
        C11757l c11757lA03 = A03();
        if (c11757lA03 == null) {
            return null;
        }
        return A08(new AnonymousClass77(this.A01), c11757lA03, c11757lA03.A1G(), new MG());
    }

    private InterfaceC1842Yi A08(InterfaceC1841Yh interfaceC1841Yh, AbstractC2465jd abstractC2465jd, String str, ZU zu) {
        if (abstractC2465jd.A29().A0H().A07() != null) {
            C1572No c1572NoA07 = abstractC2465jd.A29().A0H().A07();
            if (abstractC2465jd.A1n()) {
                return new MW(this.A02, this.A03, interfaceC1841Yh, abstractC2465jd, c1572NoA07, str, zu);
            }
            return new NO(this.A02, this.A03, interfaceC1841Yh, abstractC2465jd, str, zu);
        }
        interfaceC1841Yh.A4j(zu.A81());
        interfaceC1841Yh.A4j(zu.A7w());
        return null;
    }

    private PJ A09(WK wk) {
        AbstractC2465jd abstractC2465jdA02;
        if (wk == WK.A0G) {
            abstractC2465jdA02 = A03();
            String[] strArr = A05;
            if (strArr[6].charAt(13) != strArr[2].charAt(13)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A05;
            strArr2[6] = "BHjTvXd0Vicw2MzqRZQvpavg35ntNS6w";
            strArr2[2] = "NWBwsXtlP0iXXM4o1NBUiSzzY7vvtUxs";
            if (abstractC2465jdA02 == null) {
                return null;
            }
        } else if (wk != WK.A0A || (abstractC2465jdA02 = A02()) == null) {
            return null;
        }
        abstractC2465jdA02.A1L(this.A01.A08());
        if (abstractC2465jdA02.A1a()) {
            return new C4U(this.A02, this.A03, new C1706Sx(this.A02), new C2346hS(this.A01), abstractC2465jdA02);
        }
        return new C4T(this.A02, this.A03, new C1706Sx(this.A02), new C2346hS(this.A01), abstractC2465jdA02);
    }

    private final MT A0A() {
        return new MT(this.A02, this.A01);
    }

    private MI A0B(RelativeLayout relativeLayout) {
        MI mi = new MI(this.A02, new C2345hR(this), this.A03, new C2346hS(this.A01));
        mi.A05(relativeLayout);
        mi.A04(this.A00.getIntExtra(A0K(123, 27, 91), 200));
        YB.A0N(relativeLayout, -16777216);
        return mi;
    }

    private AnonymousClass66 A0C() {
        C11777n c11777nA02 = A02();
        if (c11777nA02 == null) {
            return null;
        }
        return new AnonymousClass66(this.A02, this.A03, new C2346hS(this.A01), c11777nA02, new MH(), 1);
    }

    private AnonymousClass66 A0D() {
        C11757l c11757lA03 = A03();
        if (c11757lA03 == null) {
            return null;
        }
        return new AnonymousClass66(this.A02, this.A03, new C2346hS(this.A01), c11757lA03, new MG(), 0);
    }

    private JD A0E() {
        C2084dC c2084dCA02;
        AbstractC2465jd abstractC2465jdA00 = A00();
        if (abstractC2465jdA00 == null || (c2084dCA02 = AbstractC2085dD.A02(abstractC2465jdA00.A1D())) == null) {
            return null;
        }
        return new JD(this.A02, new C2346hS(this.A01), c2084dCA02, abstractC2465jdA00.A2E());
    }

    private C1382Ge A0F(WK wk) {
        ZU mg;
        InterfaceC1841Yh anonymousClass77;
        C2459jT c2459jTA01 = A01();
        if (c2459jTA01 == null) {
            return null;
        }
        if (wk == WK.A04) {
            mg = new MH();
            anonymousClass77 = new C2346hS(this.A01);
        } else {
            mg = new MG();
            anonymousClass77 = new AnonymousClass77(this.A01);
        }
        return new C1382Ge(this.A02, mg, this.A03, c2459jTA01, new C1706Sx(this.A02), anonymousClass77);
    }

    private C11094x A0G() {
        C11777n c11777nA02 = A02();
        if (c11777nA02 != null) {
            return new C11094x(this.A02, new MH(), this.A03, c11777nA02, new C1706Sx(this.A02), new C2346hS(this.A01));
        }
        if (A05[1].charAt(5) != 'X') {
            throw new RuntimeException();
        }
        A05[3] = "TvLwsmu9uaa0faVP4fF8b7PGg31O8U7I";
        return null;
    }

    private C4V A0H() {
        C11777n c11777nA02 = A02();
        if (c11777nA02 == null) {
            return null;
        }
        return new C4V(this.A02, new MH(), this.A03, c11777nA02, new C1706Sx(this.A02), new C2346hS(this.A01));
    }

    private C4V A0I() {
        C11757l c11757lA03 = A03();
        if (c11757lA03 == null) {
            return null;
        }
        return new C4V(this.A02, new MG(), this.A03, c11757lA03, new C1706Sx(this.A02), new AnonymousClass77(this.A01));
    }

    private GB A0J(WK wk) {
        AbstractC2465jd abstractC2465jdA02;
        AbstractC2465jd abstractC2465jdA03;
        if (wk == WK.A0J) {
            abstractC2465jdA02 = A03();
            if (abstractC2465jdA02 == null || (abstractC2465jdA03 = A03()) == null) {
                return null;
            }
        } else if (wk != WK.A0E || (abstractC2465jdA02 = A02()) == null || (abstractC2465jdA03 = A02()) == null) {
            return null;
        }
        return new GB(this.A02, this.A03, abstractC2465jdA02, abstractC2465jdA03, new AnonymousClass77(this.A01), this.A01, wk);
    }

    public final InterfaceC1842Yi A0M(WK wk, RelativeLayout relativeLayout) {
        if (wk == null) {
            return null;
        }
        switch (C1666Ri.A00[wk.ordinal()]) {
            case 1:
                if (relativeLayout != null) {
                    return A0B(relativeLayout);
                }
                return null;
            case 2:
            case 3:
                return A09(wk);
            case 4:
                return A0I();
            case 5:
                return A07();
            case 6:
                InterfaceC1842Yi interfaceC1842YiA05 = A05();
                if (A05[4].charAt(13) != '3') {
                    A05[1] = "IIJ0HXviRARge0yizoGTY0JUA2Nzjczv";
                    return interfaceC1842YiA05;
                }
                String[] strArr = A05;
                strArr[6] = "UHMFNKnwuKHYyMbevaCPtufG1H9dhH1t";
                strArr[2] = "s6UgSHR7PtydXMVItCKPjBxPhDp7nABU";
                return interfaceC1842YiA05;
            case 7:
                return A0H();
            case 8:
                return A0G();
            case 9:
                return A06();
            case 10:
                return A0E();
            case 11:
                AnonymousClass66 anonymousClass66A0C = A0C();
                if (A05[5].charAt(3) != 'i') {
                    throw new RuntimeException();
                }
                A05[3] = "7AQwH6OZkLua7JLoKEhUfmskdEmJStMK";
                return anonymousClass66A0C;
            case 12:
                return A0D();
            case 13:
            case 14:
                return A0F(wk);
            case 15:
                return A0A();
            case 16:
            case 17:
                return A0J(wk);
            default:
                return null;
        }
    }
}
