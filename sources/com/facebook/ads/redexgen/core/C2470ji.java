package com.facebook.ads.redexgen.core;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ji, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2470ji implements InterfaceC1555Mw {
    public static byte[] A0o;
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final long A0B;
    public final Uri A0C;
    public final EnumC1554Mv A0D;
    public final AbstractC2465jd A0E;
    public final C1762Vb A0F;
    public final C1762Vb A0G;
    public final C1762Vb A0H;
    public final C1763Vc A0I;
    public final EnumC1766Vf A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final String A0Z;
    public final String A0a;
    public final String A0b;
    public final String A0c;
    public final String A0d;
    public final String A0e;
    public final String A0f;
    public final Collection<String> A0g;
    public final List<C2470ji> A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final boolean A0l;
    public final boolean A0m;
    public final boolean A0n;

    static {
        A01();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public C2470ji(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, C1762Vb c1762Vb, AbstractC2465jd abstractC2465jd, C1762Vb c1762Vb2, C1762Vb c1762Vb3, C1763Vc c1763Vc, String str16, String str17, long j, EnumC1766Vf enumC1766Vf, boolean z2, int i2, int i3, List<C2470ji> list, String str18, String str19, int i4, String str20, Uri uri, String str21, boolean z3, boolean z4, int i5, int i6, int i7, int i8, EnumC1554Mv enumC1554Mv, Collection<String> collection, int i9, boolean z5, int i10, boolean z6, int i11, boolean z7, int i12) {
        this.A0M = str;
        this.A0K = str2;
        this.A0Y = str3;
        this.A0Z = str4;
        this.A0W = str5;
        this.A0V = str6;
        this.A0O = str7;
        this.A0T = str8;
        this.A0P = str9;
        this.A0U = str10;
        this.A0X = str11;
        this.A0S = str12;
        this.A0R = str13;
        this.A0Q = str14;
        this.A0L = str15;
        this.A0F = c1762Vb;
        this.A0E = abstractC2465jd;
        this.A0G = c1762Vb2;
        this.A0H = c1762Vb3;
        this.A0I = c1763Vc;
        this.A0f = str16;
        this.A0e = str17;
        this.A0B = j;
        this.A0J = enumC1766Vf;
        this.A0j = z2;
        this.A0h = list;
        this.A0a = str18;
        this.A0c = str19;
        this.A0N = A00(0, 9, 50);
        this.A02 = i2;
        this.A01 = i3;
        this.A00 = i4;
        this.A0b = str20;
        this.A0C = uri;
        this.A0d = str21;
        this.A0m = z3;
        this.A0n = z4;
        this.A06 = i5;
        this.A07 = i6;
        this.A09 = i7;
        this.A0A = i8;
        this.A0D = enumC1554Mv;
        this.A0g = collection;
        this.A03 = i9;
        this.A0i = z5;
        this.A08 = i10;
        this.A0k = z6;
        this.A04 = i11;
        this.A0l = z7;
        this.A05 = i12;
    }

    public static String A00(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0o, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] - i4) - 19);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A0o = new byte[]{-122, -87, -120, -83, -76, -82, -88, -86, -72};
    }

    public C2470ji() {
        this.A0M = null;
        this.A0K = null;
        this.A0Y = null;
        this.A0Z = null;
        this.A0W = null;
        this.A0V = null;
        this.A0O = null;
        this.A0T = null;
        this.A0P = null;
        this.A0U = null;
        this.A0X = null;
        this.A0S = null;
        this.A0R = null;
        this.A0Q = null;
        this.A0L = null;
        this.A0N = null;
        this.A0E = null;
        this.A0G = null;
        this.A0H = null;
        this.A0I = null;
        this.A0e = null;
        this.A0f = null;
        this.A0F = null;
        this.A0B = -1L;
        this.A0J = EnumC1766Vf.A03;
        this.A0j = false;
        this.A02 = -1;
        this.A01 = 0;
        this.A0i = false;
        String strA00 = A00(0, 0, 51);
        this.A0a = strA00;
        this.A0c = strA00;
        this.A00 = 0;
        this.A0b = null;
        this.A0C = null;
        this.A0d = null;
        this.A0m = false;
        this.A0n = false;
        this.A06 = 0;
        this.A07 = 0;
        this.A09 = 0;
        this.A0A = 0;
        this.A0D = null;
        this.A0g = null;
        this.A03 = 0;
        this.A0h = null;
        this.A08 = 0;
        this.A0k = false;
        this.A04 = 10;
        this.A0l = false;
        this.A05 = 1;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03() {
        return this.A01;
    }

    public final int A04() {
        return this.A02;
    }

    public final int A05() {
        return this.A03;
    }

    public final int A06() {
        return this.A04;
    }

    public final int A07() {
        return this.A05;
    }

    public final int A08() {
        return this.A06;
    }

    public final int A09() {
        return this.A07;
    }

    public final int A0A() {
        return this.A08;
    }

    public final int A0B() {
        return this.A09;
    }

    public final int A0C() {
        return this.A0A;
    }

    public final long A0D() {
        return this.A0B;
    }

    public final Uri A0E() {
        return this.A0C;
    }

    public final AbstractC2465jd A0F() {
        return this.A0E;
    }

    public final C1762Vb A0G() {
        return this.A0F;
    }

    public final C1762Vb A0H() {
        return this.A0H;
    }

    public final C1762Vb A0I() {
        return this.A0G;
    }

    public final C1763Vc A0J() {
        return this.A0I;
    }

    public final EnumC1766Vf A0K() {
        return this.A0J;
    }

    public final String A0L() {
        return this.A0K;
    }

    public final String A0M() {
        return this.A0M;
    }

    public final String A0N() {
        return this.A0N;
    }

    public final String A0O() {
        return this.A0O;
    }

    public final String A0P() {
        return this.A0P;
    }

    public final String A0Q() {
        return this.A0Q;
    }

    public final String A0R() {
        return this.A0R;
    }

    public final String A0S() {
        return this.A0S;
    }

    public final String A0T() {
        return this.A0T;
    }

    public final String A0U() {
        return this.A0U;
    }

    public final String A0V() {
        return this.A0W;
    }

    public final String A0W() {
        return this.A0X;
    }

    public final String A0X() {
        return this.A0Y;
    }

    public final String A0Y() {
        return this.A0Z;
    }

    public final String A0Z() {
        return this.A0L;
    }

    public final String A0a() {
        return this.A0b;
    }

    public final String A0b() {
        return this.A0c;
    }

    public final String A0c() {
        return this.A0d;
    }

    public final String A0d() {
        return this.A0e;
    }

    public final String A0e() {
        return this.A0f;
    }

    public final List<C2470ji> A0f() {
        return this.A0h;
    }

    public final boolean A0g() {
        return this.A0l;
    }

    public final boolean A0h() {
        return this.A0k;
    }

    public final boolean A0i() {
        return this.A0i;
    }

    public final boolean A0j() {
        return this.A0j;
    }

    public final boolean A0k() {
        return this.A0m;
    }

    public final boolean A0l() {
        return this.A0n;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1555Mw
    public final String A7O() {
        return this.A0a;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1555Mw
    public final Collection<String> A7p() {
        return this.A0g;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1555Mw
    public final EnumC1554Mv A8K() {
        return this.A0D;
    }
}
