package com.facebook.ads.redexgen.core;

import android.content.Intent;
import android.os.Build;
import android.widget.RelativeLayout;
import androidx.core.view.ViewCompat;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04996j {
    public static byte[] A04;
    public static String[] A05 = {"MJXAzUwyiLvMzZCrP1QJf8uMs9b", "sHuNTXgsBnW3HGqskl7KH5QkikNWpABj", "q8u9vKEVkpk3dMxroB1EFzM5kwDKfJOq", "eyGwnlQBA4bCraIcft5FxvFgN7f8TC5N", "FmmRYKiwjJl3dX1FB2pV6kIWJpsNLC6h", "flBitaWG3wpDSjkerYNuTkR3r5UhRox3", "xkUQOvOGGj42jMnQjSDdoLzQvdQiYUba", "XqZ9VL6XKZ5Y"};
    public final Intent A00;
    public final C04946e A01;
    public final C1828k1 A02;
    public final A7 A03;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private C1669hM A06() {
        C0900Mw c0900MwA02 = A02();
        if (c0900MwA02 == null) {
            return null;
        }
        C1665hI c1665hI = new C1665hI();
        return new C1669hM(this.A02, this.A03, new C1873kk(this.A01), c0900MwA02, null, c1665hI, A0K(c1665hI, c0900MwA02));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private C1669hM A07() {
        C0898Mu c0898MuA03 = A03();
        if (c0898MuA03 == null) {
            return null;
        }
        C1664hH c1664hH = new C1664hH();
        return new C1669hM(this.A02, this.A03, new M6(this.A01), c0898MuA03, c0898MuA03.A0s(), c1664hH, A0K(c1664hH, c0898MuA03));
    }

    public static String A0L(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 59);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0M() {
        A04 = new byte[]{99, 127, 4, 1, 58, 1, 4, 17, 4, 58, 7, cw.n, 11, 1, 9, 0, 43, 41, 36, 36, 45, 58, 28, 49, 56, 45, 119, 124, 117, 125, 122, 113, 112, 85, 112, 80, 117, 96, 117, 86, 97, 122, 112, 120, 113, 35, 44, 41, 49, 32, 55, 32, 33, 26, 38, 41, 44, 38, 46, 26, 33, 32, 41, 36, 60, 26, 40, 54, 124, 115, 102, 123, 100, 119, 83, 118, 86, 115, 102, 115, 80, 103, 124, 118, 126, 119, 106, 118, 123, 121, 127, 119, 127, 116, 110, 32, 55, 37, 51, 32, 54, 55, 54, 4, 59, 54, 55, 61, 19, 54, 22, 51, 38, 51, cw.n, 39, 60, 54, 62, 55, 22, 9, 4, 5, cw.m, 63, 20, 9, cw.k, 5, 63, cw.n, cw.m, 12, 12, 9, cw.l, 7, 63, 9, cw.l, 20, 5, 18, 22, 1, 12};
    }

    static {
        A0M();
    }

    public C04996j(C04946e c04946e, Intent intent, A7 a7, C1828k1 c1828k1) {
        this.A01 = c04946e;
        this.A00 = intent;
        this.A03 = a7;
        this.A02 = c1828k1;
    }

    private AbstractC1984md A00() {
        int i = Build.VERSION.SDK_INT;
        String strA0L = A0L(68, 18, 41);
        if (i >= 33) {
            return (AbstractC1984md) this.A00.getSerializableExtra(strA0L, AbstractC1984md.class);
        }
        Intent intent = this.A00;
        String[] strArr = A05;
        if (strArr[6].charAt(13) != strArr[2].charAt(13)) {
            throw new RuntimeException();
        }
        A05[1] = "LmjecX6z1NXmevkMdudhCsYVgseeBlBL";
        return (AbstractC1984md) intent.getSerializableExtra(strA0L);
    }

    private C1982mb A01() {
        int i = Build.VERSION.SDK_INT;
        String strA0L = A0L(26, 19, 47);
        if (i >= 33) {
            return (C1982mb) this.A00.getSerializableExtra(strA0L, C1982mb.class);
        }
        return (C1982mb) this.A00.getSerializableExtra(strA0L);
    }

    private C0900Mw A02() {
        int i = Build.VERSION.SDK_INT;
        String strA0L = A0L(2, 14, 94);
        if (i >= 33) {
            return (C0900Mw) this.A00.getSerializableExtra(strA0L, C0900Mw.class);
        }
        return (C0900Mw) this.A00.getSerializableExtra(strA0L);
    }

    private C0898Mu A03() {
        int i = Build.VERSION.SDK_INT;
        String strA0L = A0L(95, 25, 105);
        if (i >= 33) {
            return (C0898Mu) this.A00.getSerializableExtra(strA0L, C0898Mu.class);
        }
        return (C0898Mu) this.A00.getSerializableExtra(strA0L);
    }

    private DS A05() {
        if (C05789m.A2m(this.A02)) {
            String stringExtra = this.A00.getStringExtra(A0L(45, 23, EnumC4719u30.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE));
            C04946e c04946e = this.A01;
            C1828k1 c1828k1 = this.A02;
            A7 a7 = this.A03;
            C1873kk c1873kk = new C1873kk(this.A01);
            Intent intent = this.A00;
            String clickDelayMs = A0L(16, 10, 115);
            String stringExtra2 = intent.getStringExtra(clickDelayMs);
            if (stringExtra == null) {
                stringExtra = A0L(0, 2, EnumC4719u30.ASSET_FAILED_STATUS_CODE_VALUE);
            }
            int i = Integer.parseInt(stringExtra);
            if (A05[5].charAt(3) != 'i') {
                throw new RuntimeException();
            }
            A05[4] = "YY09SF1W0j6b6KfCSgRusx8TJPca7HgC";
            return new ViewOnClickListenerC0884Lz(c04946e, c1828k1, a7, c1873kk, stringExtra2, i);
        }
        return new C1701hu(this.A01, this.A02, this.A03, new C1873kk(this.A01));
    }

    private final C1668hL A08() {
        return new C1668hL(this.A02, this.A01);
    }

    private C1666hJ A09(RelativeLayout relativeLayout) {
        C1666hJ c1666hJ = new C1666hJ(this.A02, new C1872kj(this), this.A03, new C1873kk(this.A01));
        c1666hJ.A05(relativeLayout);
        c1666hJ.A04(this.A00.getIntExtra(A0L(120, 27, 91), 200));
        D3.A0K(relativeLayout, ViewCompat.MEASURED_STATE_MASK);
        return c1666hJ;
    }

    private LJ A0A() {
        C0900Mw c0900MwA02 = A02();
        if (c0900MwA02 == null) {
            return null;
        }
        return new LJ(this.A02, this.A03, new C1873kk(this.A01), c0900MwA02, new C1665hI(), 1);
    }

    private LJ A0B() {
        C0898Mu c0898MuA03 = A03();
        if (c0898MuA03 == null) {
            return null;
        }
        return new LJ(this.A02, this.A03, new C1873kk(this.A01), c0898MuA03, new C1664hH(), 0);
    }

    private C1545fL A0C() {
        C0747Gr c0747GrA02;
        AbstractC1984md abstractC1984mdA00 = A00();
        if (abstractC1984mdA00 == null || (c0747GrA02 = AbstractC0748Gs.A02(abstractC1984mdA00.A0r())) == null) {
            return null;
        }
        return new C1545fL(this.A02, new C1873kk(this.A01), c0747GrA02, abstractC1984mdA00.A1g());
    }

    private C1462dz A0D(BG bg) {
        EC c1664hH;
        DR m6;
        C1982mb c1982mbA01 = A01();
        if (c1982mbA01 == null) {
            return null;
        }
        if (bg == BG.A04) {
            c1664hH = new C1665hI();
            m6 = new C1873kk(this.A01);
        } else {
            c1664hH = new C1664hH();
            m6 = new M6(this.A01);
        }
        return new C1462dz(this.A02, c1664hH, this.A03, c1982mbA01, new C05357t(this.A02), m6);
    }

    private C0850Kq A0E() {
        C0900Mw c0900MwA02 = A02();
        if (c0900MwA02 != null) {
            return new C0850Kq(this.A02, new C1665hI(), this.A03, c0900MwA02, new C05357t(this.A02), new C1873kk(this.A01));
        }
        if (A05[1].charAt(5) != 'X') {
            throw new RuntimeException();
        }
        A05[3] = "TvLwsmu9uaa0faVP4fF8b7PGg31O8U7I";
        return null;
    }

    private C0843Kj A0F() {
        C0900Mw c0900MwA02 = A02();
        if (c0900MwA02 == null) {
            return null;
        }
        return new C0843Kj(this.A02, new C1665hI(), this.A03, c0900MwA02, new C05357t(this.A02), new C1873kk(this.A01));
    }

    private C0843Kj A0G() {
        C0898Mu c0898MuA03 = A03();
        if (c0898MuA03 == null) {
            return null;
        }
        return new C0843Kj(this.A02, new C1664hH(), this.A03, c0898MuA03, new C05357t(this.A02), new M6(this.A01));
    }

    private C1431dT A0H() {
        C0898Mu c0898MuA03;
        C0898Mu c0898MuA04 = A03();
        if (c0898MuA04 == null || (c0898MuA03 = A03()) == null) {
            return null;
        }
        return new C1431dT(this.A02, this.A03, c0898MuA04, c0898MuA03, new M6(this.A01), this.A01);
    }

    private C0842Ki A0I() {
        C0900Mw dataBundle = A02();
        if (dataBundle == null) {
            return null;
        }
        dataBundle.A0y(this.A01.A08());
        return new C0842Ki(this.A02, this.A03, new C05357t(this.A02), new C1873kk(this.A01), dataBundle);
    }

    private C0842Ki A0J() {
        C0898Mu dataBundle = A03();
        if (dataBundle == null) {
            return null;
        }
        dataBundle.A0y(this.A01.A08());
        return new C0842Ki(this.A02, this.A03, new C05357t(this.A02), new C1873kk(this.A01), dataBundle);
    }

    private C0770Ho A0K(EC ec, AbstractC1984md abstractC1984md) {
        C04042p c04042pA07 = abstractC1984md.A1b().A0F().A07();
        if (c04042pA07 == null || !c04042pA07.A0M()) {
            return null;
        }
        HashMap map = new HashMap();
        map.put(A0L(86, 9, 33), ec.A8b());
        return new C0770Ho(this.A02, abstractC1984md, c04042pA07, this.A03, null, map);
    }

    public final DS A0N(BG bg, RelativeLayout relativeLayout) {
        if (bg == null) {
            return null;
        }
        switch (C04986i.A00[bg.ordinal()]) {
            case 1:
                if (relativeLayout != null) {
                    return A09(relativeLayout);
                }
                return null;
            case 2:
                return A0J();
            case 3:
                return A0G();
            case 4:
                return A07();
            case 5:
                return A05();
            case 6:
                C0843Kj c0843KjA0F = A0F();
                if (A05[4].charAt(13) != '3') {
                    A05[1] = "IIJ0HXviRARge0yizoGTY0JUA2Nzjczv";
                    return c0843KjA0F;
                }
                String[] strArr = A05;
                strArr[6] = "UHMFNKnwuKHYyMbevaCPtufG1H9dhH1t";
                strArr[2] = "s6UgSHR7PtydXMVItCKPjBxPhDp7nABU";
                return c0843KjA0F;
            case 7:
                return A0E();
            case 8:
                return A0I();
            case 9:
                return A06();
            case 10:
                return A0C();
            case 11:
                LJ ljA0A = A0A();
                if (A05[5].charAt(3) != 'i') {
                    throw new RuntimeException();
                }
                A05[3] = "7AQwH6OZkLua7JLoKEhUfmskdEmJStMK";
                return ljA0A;
            case 12:
                return A0B();
            case 13:
            case 14:
                return A0D(bg);
            case 15:
                return A08();
            case 16:
                return A0H();
            default:
                return null;
        }
    }
}
