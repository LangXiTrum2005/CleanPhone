package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import com.facebook.ads.internal.androidx.support.v7.widget.LinearLayoutManager$SavedState;
import com.facebook.ads.internal.util.parcelable.WrappedParcelable;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.lC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C1900lC extends AnonymousClass62 implements C6E {
    public static byte[] A0F;
    public static String[] A0G = {"ZTDwmEtle1avZIcEXO6Ngzge8j05pfT9", "s1YfUPq4amp3sGXTr0KOnMWCCCkrB2x5", "RLSriKm", "hA4l3MFFurEjuKvfb479JjwTp2cnC09n", "5GFF521rSn4TdhEStccPhauxYrt7NMVp", "XQN2s9DMc1xKucEpv2CitIAcNHBR8E7y", "8ubGCSX", "EFysGv6XChRnXfWxG2n7d2ksHTdYT6om"};
    public int A00;
    public int A01;
    public int A02;
    public LinearLayoutManager$SavedState A03;
    public AbstractC04765m A04;
    public boolean A05;
    public int A06;
    public C04725h A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final C04705f A0D;
    public final C04715g A0E;

    public static String A0T(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 91);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0V() {
        A0F = new byte[]{31, 24, 0, 23, 26, 31, 18, 86, 25, 4, 31, 19, 24, 2, 23, 2, 31, 25, 24, 76};
    }

    static {
        A0V();
    }

    public C1900lC(Context context) {
        this(context, 1, false);
    }

    public C1900lC(Context context, int i, boolean z) {
        this.A0A = false;
        this.A05 = false;
        this.A0C = false;
        this.A0B = true;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A03 = null;
        this.A0D = new C04705f(this);
        this.A0E = new C04715g();
        this.A06 = 2;
        A2A(i);
        A0h(z);
        A1R(true);
    }

    private final int A04(int i, C6A c6a, C6H c6h) {
        if (A0W() == 0 || i == 0) {
            return 0;
        }
        this.A07.A0B = true;
        A29();
        int absDy = i > 0 ? 1 : -1;
        int consumed = Math.abs(i);
        A0Y(absDy, consumed, true, c6h);
        int i2 = this.A07.A07;
        int layoutDirection = A08(c6a, this.A07, c6h, false);
        int i3 = i2 + layoutDirection;
        if (i3 < 0) {
            return 0;
        }
        int absDy2 = consumed > i3 ? absDy * i3 : i;
        int layoutDirection2 = -absDy2;
        this.A04.A0J(layoutDirection2);
        this.A07.A04 = absDy2;
        return absDy2;
    }

    private int A05(int i, C6A c6a, C6H c6h, boolean z) {
        int fixOffset;
        int gap = this.A04.A07() - i;
        if (gap > 0) {
            int i2 = -A04(-gap, c6a, c6h);
            int i3 = i + i2;
            if (z && (fixOffset = this.A04.A07() - i3) > 0) {
                this.A04.A0J(fixOffset);
                return fixOffset + i2;
            }
            return i2;
        }
        return 0;
    }

    private int A06(int i, C6A c6a, C6H c6h, boolean z) {
        int iA0A;
        int gap = i - this.A04.A0A();
        if (gap > 0) {
            int i2 = -A04(gap, c6a, c6h);
            int i3 = i + i2;
            if (z && (iA0A = i3 - this.A04.A0A()) > 0) {
                this.A04.A0J(-iA0A);
                return i2 - iA0A;
            }
            return i2;
        }
        return 0;
    }

    private final int A08(C6A c6a, C04725h c04725h, C6H c6h, boolean z) {
        int i = c04725h.A00;
        int start = c04725h.A07;
        if (start != Integer.MIN_VALUE) {
            int start2 = c04725h.A00;
            if (start2 < 0) {
                int i2 = c04725h.A07;
                int start3 = c04725h.A00;
                c04725h.A07 = i2 + start3;
            }
            A0e(c6a, c04725h);
        }
        int i3 = c04725h.A00;
        int start4 = c04725h.A02;
        int i4 = i3 + start4;
        C04715g c04715g = this.A0E;
        while (true) {
            if ((!c04725h.A09 && i4 <= 0) || !c04725h.A05(c6h)) {
                break;
            }
            c04715g.A00();
            A2D(c6a, c6h, c04725h, c04715g);
            if (!c04715g.A01) {
                int i5 = c04725h.A06;
                int remainingSpace = c04715g.A00;
                int start5 = c04725h.A05;
                c04725h.A06 = i5 + (remainingSpace * start5);
                if (!c04715g.A03 || this.A07.A08 != null || !c6h.A07()) {
                    int remainingSpace2 = c04725h.A00;
                    int start6 = c04715g.A00;
                    c04725h.A00 = remainingSpace2 - start6;
                    int start7 = c04715g.A00;
                    i4 -= start7;
                }
                int start8 = c04725h.A07;
                if (start8 != Integer.MIN_VALUE) {
                    int remainingSpace3 = c04725h.A07;
                    int start9 = c04715g.A00;
                    c04725h.A07 = remainingSpace3 + start9;
                    int start10 = c04725h.A00;
                    if (start10 < 0) {
                        int remainingSpace4 = c04725h.A07;
                        int start11 = c04725h.A00;
                        c04725h.A07 = remainingSpace4 + start11;
                    }
                    A0e(c6a, c04725h);
                }
                if (z && c04715g.A02) {
                    break;
                }
            } else {
                break;
            }
        }
        int start12 = c04725h.A00;
        return i - start12;
    }

    private int A09(C6H c6h) {
        if (A0W() == 0) {
            return 0;
        }
        A29();
        return C6L.A00(c6h, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
    }

    private int A0A(C6H c6h) {
        if (A0W() != 0) {
            A29();
            return C6L.A02(c6h, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B, this.A05);
        }
        if (A0G[3].charAt(25) != '2') {
            throw new RuntimeException();
        }
        A0G[1] = "J9JFedtgHh7lzsKv2wGVe5URJzbGPRgH";
        return 0;
    }

    private int A0B(C6H c6h) {
        if (A0W() == 0) {
            return 0;
        }
        A29();
        return C6L.A01(c6h, this.A04, A0R(!this.A0B, true), A0Q(!this.A0B, true), this, this.A0B);
    }

    private final int A0C(C6H c6h) {
        if (c6h.A06()) {
            return this.A04.A0B();
        }
        return 0;
    }

    private View A0D() {
        return A0H(0, A0W());
    }

    private View A0E() {
        return A0H(A0W() - 1, -1);
    }

    private View A0F() {
        return A0t(this.A05 ? 0 : A0W() - 1);
    }

    private View A0G() {
        return A0t(this.A05 ? A0W() - 1 : 0);
    }

    private final View A0H(int i, int i2) {
        int next;
        int acceptableBoundsFlag;
        int preferredBoundsFlag;
        A29();
        if (i2 > i) {
            next = 1;
        } else {
            next = i2 < i ? -1 : 0;
        }
        if (next == 0) {
            return A0t(i);
        }
        int preferredBoundsFlag2 = this.A04.A0F(A0t(i));
        int next2 = this.A04.A0A();
        if (preferredBoundsFlag2 < next2) {
            acceptableBoundsFlag = 16644;
            preferredBoundsFlag = 16388;
        } else {
            acceptableBoundsFlag = 4161;
            preferredBoundsFlag = 4097;
        }
        int next3 = this.A00;
        if (next3 == 0) {
            return super.A04.A00(i, i2, acceptableBoundsFlag, preferredBoundsFlag);
        }
        return super.A05.A00(i, i2, acceptableBoundsFlag, preferredBoundsFlag);
    }

    private final View A0J(int i, int i2, boolean z, boolean z2) {
        int i3;
        A29();
        int i4 = 0;
        if (z) {
            i3 = 24579;
        } else {
            i3 = EnumC4719u30.WEBVIEW_ERROR_VALUE;
        }
        if (z2) {
            i4 = EnumC4719u30.WEBVIEW_ERROR_VALUE;
        }
        int i5 = this.A00;
        int acceptableBoundsFlag = A0G[5].charAt(29);
        if (acceptableBoundsFlag != 69) {
            throw new RuntimeException();
        }
        A0G[5] = "CO2lCdhiUyNnJNyVLVKK7uQ85cne8EHP";
        if (i5 == 0) {
            return super.A04.A00(i, i2, i3, i4);
        }
        return super.A05.A00(i, i2, i3, i4);
    }

    private View A0K(C6A c6a, C6H c6h) {
        return A28(c6a, c6h, 0, A0W(), c6h.A03());
    }

    private View A0L(C6A c6a, C6H c6h) {
        return A28(c6a, c6h, A0W() - 1, -1, c6h.A03());
    }

    private View A0M(C6A c6a, C6H c6h) {
        return this.A05 ? A0D() : A0E();
    }

    private View A0N(C6A c6a, C6H c6h) {
        return this.A05 ? A0E() : A0D();
    }

    private View A0O(C6A c6a, C6H c6h) {
        return this.A05 ? A0K(c6a, c6h) : A0L(c6a, c6h);
    }

    private View A0P(C6A c6a, C6H c6h) {
        return this.A05 ? A0L(c6a, c6h) : A0K(c6a, c6h);
    }

    private View A0Q(boolean z, boolean z2) {
        if (this.A05) {
            return A0J(0, A0W(), z, z2);
        }
        return A0J(A0W() - 1, -1, z, z2);
    }

    private View A0R(boolean z, boolean z2) {
        if (this.A05) {
            return A0J(A0W() - 1, -1, z, z2);
        }
        return A0J(0, A0W(), z, z2);
    }

    private final C04725h A0S() {
        return new C04725h();
    }

    private void A0U() {
        if (this.A00 == 1 || !A2F()) {
            this.A05 = this.A0A;
        } else {
            this.A05 = !this.A0A;
        }
    }

    private void A0W(int i, int i2) {
        this.A07.A00 = this.A04.A07() - i2;
        this.A07.A03 = this.A05 ? -1 : 1;
        this.A07.A01 = i;
        this.A07.A05 = 1;
        this.A07.A06 = i2;
        this.A07.A07 = Integer.MIN_VALUE;
    }

    private void A0X(int i, int i2) {
        this.A07.A00 = i2 - this.A04.A0A();
        this.A07.A01 = i;
        this.A07.A03 = this.A05 ? 1 : -1;
        this.A07.A05 = -1;
        this.A07.A06 = i2;
        this.A07.A07 = Integer.MIN_VALUE;
    }

    private void A0Y(int i, int i2, boolean z, C6H c6h) {
        int iA0A;
        this.A07.A09 = A0i();
        this.A07.A02 = A0C(c6h);
        this.A07.A05 = i;
        int i3 = -1;
        if (i == 1) {
            this.A07.A02 += this.A04.A08();
            View viewA0F = A0F();
            C04725h c04725h = this.A07;
            if (!this.A05) {
                i3 = 1;
            }
            c04725h.A03 = i3;
            this.A07.A01 = A0p(viewA0F) + this.A07.A03;
            this.A07.A06 = this.A04.A0C(viewA0F);
            iA0A = this.A04.A0C(viewA0F) - this.A04.A07();
        } else {
            View viewA0G = A0G();
            this.A07.A02 += this.A04.A0A();
            this.A07.A03 = this.A05 ? 1 : -1;
            this.A07.A01 = A0p(viewA0G) + this.A07.A03;
            this.A07.A06 = this.A04.A0F(viewA0G);
            iA0A = (-this.A04.A0F(viewA0G)) + this.A04.A0A();
        }
        this.A07.A00 = i2;
        if (z) {
            C04725h c04725h2 = this.A07;
            int scrollingOffset = c04725h2.A00;
            c04725h2.A00 = scrollingOffset - iA0A;
        }
        this.A07.A07 = iA0A;
    }

    private void A0Z(C04705f c04705f) {
        A0W(c04705f.A01, c04705f.A00);
    }

    private void A0a(C04705f c04705f) {
        A0X(c04705f.A01, c04705f.A00);
    }

    private void A0b(C6A c6a, int i) {
        int iA0W = A0W();
        if (i < 0) {
            return;
        }
        int iA06 = this.A04.A06() - i;
        boolean z = this.A05;
        int limit = A0G[3].charAt(25);
        if (limit != 50) {
            throw new RuntimeException();
        }
        A0G[1] = "5eQap7viEGWOuRbzagNYDGjkAWEMIhVp";
        if (z) {
            for (int i2 = 0; i2 < iA0W; i2++) {
                View viewA0t = A0t(i2);
                int childCount = this.A04.A0F(viewA0t);
                if (childCount >= iA06) {
                    int childCount2 = this.A04.A0H(viewA0t);
                    if (childCount2 >= iA06) {
                    }
                }
                int limit2 = A0G[4].length();
                if (limit2 != 13) {
                    String[] strArr = A0G;
                    strArr[6] = "EiwXPaP";
                    strArr[2] = "4OvxlWI";
                    A0d(c6a, 0, i2);
                    return;
                }
                A0d(c6a, 0, i2);
                return;
            }
            return;
        }
        for (int i3 = iA0W - 1; i3 >= 0; i3--) {
            View viewA0t2 = A0t(i3);
            int childCount3 = this.A04.A0F(viewA0t2);
            if (childCount3 >= iA06) {
                int childCount4 = this.A04.A0H(viewA0t2);
                if (childCount4 >= iA06) {
                }
            }
            int childCount5 = iA0W - 1;
            A0d(c6a, childCount5, i3);
            return;
        }
    }

    private void A0c(C6A c6a, int i) {
        if (i < 0) {
            return;
        }
        int iA0W = A0W();
        if (this.A05) {
            for (int i2 = iA0W - 1; i2 >= 0; i2--) {
                View viewA0t = A0t(i2);
                AbstractC04765m abstractC04765m = this.A04;
                int childCount = A0G[5].charAt(29);
                if (childCount != 69) {
                    throw new RuntimeException();
                }
                A0G[3] = "CCkneFsBnjHsOQTiipl2DNgji2H70UcR";
                int limit = abstractC04765m.A0C(viewA0t);
                if (limit <= i) {
                    int limit2 = this.A04.A0G(viewA0t);
                    if (limit2 <= i) {
                    }
                }
                int limit3 = iA0W - 1;
                A0d(c6a, limit3, i2);
                return;
            }
            return;
        }
        for (int i3 = 0; i3 < iA0W; i3++) {
            View viewA0t2 = A0t(i3);
            int limit4 = this.A04.A0C(viewA0t2);
            if (limit4 <= i) {
                int limit5 = this.A04.A0G(viewA0t2);
                if (limit5 <= i) {
                }
            }
            A0d(c6a, 0, i3);
            return;
        }
    }

    private void A0d(C6A c6a, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 > i) {
            for (int i3 = i2 - 1; i3 >= i; i3--) {
                A14(i3, c6a);
            }
            return;
        }
        while (i > i2) {
            A14(i, c6a);
            i--;
        }
    }

    private void A0e(C6A c6a, C04725h c04725h) {
        if (!c04725h.A0B || c04725h.A09) {
            return;
        }
        if (c04725h.A05 == -1) {
            A0b(c6a, c04725h.A07);
        } else {
            A0c(c6a, c04725h.A07);
        }
    }

    private void A0f(C6A c6a, C6H c6h, int scrapExtraEnd, int scrapExtraEnd2) {
        if (!c6h.A08() || A0W() == 0 || c6h.A07() || !A22()) {
            return;
        }
        int iA0D = 0;
        int scrapExtraStart = 0;
        List<C6K> listA0J = c6a.A0J();
        int i = listA0J.size();
        int iA0p = A0p(A0t(0));
        for (int scrapSize = 0; scrapSize < i; scrapSize++) {
            C6K c6k = listA0J.get(scrapSize);
            if (!c6k.A0a()) {
                int direction = 1;
                if ((c6k.A0I() < iA0p) != this.A05) {
                    direction = -1;
                }
                if (direction == -1) {
                    iA0D += this.A04.A0D(c6k.A0H);
                } else {
                    scrapExtraStart += this.A04.A0D(c6k.A0H);
                }
            }
        }
        this.A07.A08 = listA0J;
        if (iA0D > 0) {
            A0X(A0p(A0G()), scrapExtraEnd);
            this.A07.A02 = iA0D;
            this.A07.A00 = 0;
            this.A07.A04();
            A08(c6a, this.A07, c6h, false);
        }
        if (scrapExtraStart > 0) {
            A0W(A0p(A0F()), scrapExtraEnd2);
            this.A07.A02 = scrapExtraStart;
            this.A07.A00 = 0;
            this.A07.A04();
            A08(c6a, this.A07, c6h, false);
        }
        this.A07.A08 = null;
    }

    private void A0g(C6A c6a, C6H c6h, C04705f c04705f) {
        if (A0k(c6h, c04705f) || A0j(c6a, c6h, c04705f)) {
            return;
        }
        c04705f.A02();
        c04705f.A01 = this.A0C ? c6h.A03() - 1 : 0;
    }

    private final void A0h(boolean z) {
        A1y(null);
        if (z == this.A0A) {
            return;
        }
        this.A0A = z;
        A0y();
    }

    private final boolean A0i() {
        return this.A04.A09() == 0 && this.A04.A06() == 0;
    }

    private boolean A0j(C6A c6a, C6H c6h, C04705f c04705f) {
        View viewA0P;
        int iA0A;
        if (A0W() == 0) {
            return false;
        }
        View viewA0s = A0s();
        if (viewA0s != null && c04705f.A06(viewA0s, c6h)) {
            c04705f.A05(viewA0s);
            return true;
        }
        if (this.A08 != this.A0C) {
            return false;
        }
        if (c04705f.A02) {
            viewA0P = A0O(c6a, c6h);
        } else {
            viewA0P = A0P(c6a, c6h);
        }
        if (viewA0P == null) {
            return false;
        }
        c04705f.A04(viewA0P);
        if (!c6h.A07() && A22()) {
            if (this.A04.A0F(viewA0P) >= this.A04.A07() || this.A04.A0C(viewA0P) < this.A04.A0A()) {
                if (c04705f.A02) {
                    iA0A = this.A04.A07();
                } else {
                    iA0A = this.A04.A0A();
                }
                c04705f.A00 = iA0A;
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b2, code lost:
    
        if ((r7 - r6) < 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b4, code lost:
    
        r10.A00 = r8.A04.A0A();
        r10.A02 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00be, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c7, code lost:
    
        if ((r7 - r6) < 0) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ca, code lost:
    
        r1 = r8.A04.A07() - r8.A04.A0C(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d7, code lost:
    
        if (r1 >= 0) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d9, code lost:
    
        r10.A00 = r8.A04.A07();
        r10.A02 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e3, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e6, code lost:
    
        if (r10.A02 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e8, code lost:
    
        r1 = r8.A04.A0C(r5);
        r1 = r1 + r8.A04.A05();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f5, code lost:
    
        r10.A00 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f8, code lost:
    
        r1 = r8.A04.A0F(r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0k(com.facebook.ads.redexgen.core.C6H r9, com.facebook.ads.redexgen.core.C04705f r10) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C1900lC.A0k(com.facebook.ads.redexgen.X.6H, com.facebook.ads.redexgen.X.5f):boolean");
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public int A1d(int i, C6A c6a, C6H c6h) {
        if (this.A00 == 1) {
            return 0;
        }
        return A04(i, c6a, c6h);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public int A1e(int i, C6A c6a, C6H c6h) {
        if (this.A00 == 0) {
            return 0;
        }
        return A04(i, c6a, c6h);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public final int A1f(C6H c6h) {
        return A09(c6h);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public final int A1g(C6H c6h) {
        return A0A(c6h);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public final int A1h(C6H c6h) {
        return A0B(c6h);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public final int A1i(C6H c6h) {
        return A09(c6h);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public final int A1j(C6H c6h) {
        return A0A(c6h);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public final int A1k(C6H c6h) {
        return A0B(c6h);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public final Parcelable A1l() {
        if (this.A03 != null) {
            return new WrappedParcelable(new LinearLayoutManager$SavedState(this.A03));
        }
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = new LinearLayoutManager$SavedState();
        if (A0W() > 0) {
            A29();
            boolean didLayoutFromEnd = this.A08 ^ this.A05;
            linearLayoutManager$SavedState.A02 = didLayoutFromEnd;
            if (didLayoutFromEnd) {
                View refChild = A0F();
                linearLayoutManager$SavedState.A00 = this.A04.A07() - this.A04.A0C(refChild);
                linearLayoutManager$SavedState.A01 = A0p(refChild);
            } else {
                View viewA0G = A0G();
                linearLayoutManager$SavedState.A01 = A0p(viewA0G);
                linearLayoutManager$SavedState.A00 = this.A04.A0F(viewA0G) - this.A04.A0A();
            }
        } else {
            linearLayoutManager$SavedState.A00();
        }
        return new WrappedParcelable(linearLayoutManager$SavedState);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public final View A1m(int i) {
        int firstChild = A0W();
        if (firstChild == 0) {
            return null;
        }
        int childCount = i - A0p(A0t(0));
        if (childCount >= 0 && childCount < firstChild) {
            View viewA0t = A0t(childCount);
            if (A0p(viewA0t) == i) {
                return viewA0t;
            }
        }
        return super.A1m(i);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public View A1n(View view, int i, C6A c6a, C6H c6h) {
        int maxScroll;
        View nextFocus;
        View viewA0F;
        A0U();
        if (A0W() == 0 || (maxScroll = A27(i)) == Integer.MIN_VALUE) {
            return null;
        }
        A29();
        A29();
        int layoutDir = this.A04.A0B();
        A0Y(maxScroll, (int) (layoutDir * 0.33333334f), false, c6h);
        this.A07.A07 = Integer.MIN_VALUE;
        this.A07.A0B = false;
        A08(c6a, this.A07, c6h, true);
        if (maxScroll == -1) {
            nextFocus = A0N(c6a, c6h);
        } else {
            nextFocus = A0M(c6a, c6h);
        }
        if (maxScroll == -1) {
            viewA0F = A0G();
        } else {
            viewA0F = A0F();
        }
        if (viewA0F.hasFocusable()) {
            if (nextFocus == null) {
                return null;
            }
            return viewA0F;
        }
        return nextFocus;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public AnonymousClass63 A1o() {
        return new AnonymousClass63(-2, -2);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public void A1p(int i) {
        this.A01 = i;
        this.A02 = Integer.MIN_VALUE;
        if (this.A03 != null) {
            this.A03.A00();
        }
        A0y();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public final void A1q(int i, int i2, C6H c6h, AnonymousClass60 anonymousClass60) {
        if (this.A00 != 0) {
            i = i2;
        }
        int delta = A0W();
        if (delta == 0 || i == 0) {
            return;
        }
        A29();
        int i3 = i > 0 ? 1 : -1;
        int delta2 = Math.abs(i);
        A0Y(i3, delta2, true, c6h);
        A2E(c6h, this.A07, anonymousClass60);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public final void A1r(int i, AnonymousClass60 anonymousClass60) {
        boolean z;
        int direction;
        if (this.A03 != null && this.A03.A01()) {
            z = this.A03.A02;
            direction = this.A03.A01;
        } else {
            A0U();
            z = this.A05;
            if (this.A01 == -1) {
                direction = z ? i - 1 : 0;
            } else {
                direction = this.A01;
            }
        }
        int anchorPos = z ? -1 : 1;
        for (int i2 = 0; i2 < this.A06 && direction >= 0 && direction < i; i2++) {
            anonymousClass60.A3s(direction, 0);
            direction += anchorPos;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public final void A1s(Parcelable parcelable) {
        ClassLoader classLoader;
        if (!(parcelable instanceof WrappedParcelable) || (classLoader = getClass().getClassLoader()) == null) {
            return;
        }
        Parcelable state = ((WrappedParcelable) parcelable).unwrap(classLoader);
        if (state instanceof LinearLayoutManager$SavedState) {
            this.A03 = (LinearLayoutManager$SavedState) state;
            A0y();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public final void A1t(AccessibilityEvent accessibilityEvent) {
        super.A1t(accessibilityEvent);
        if (A0W() > 0) {
            accessibilityEvent.setFromIndex(A24());
            if (A0G[1].charAt(13) == 'I') {
                throw new RuntimeException();
            }
            String[] strArr = A0G;
            strArr[6] = "JM0e54P";
            strArr[2] = "62qYDCA";
            accessibilityEvent.setToIndex(A25());
        }
    }

    /* JADX WARN: Code duplicated, block: B:86:0x0242  */
    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public void A1u(C6A c6a, C6H c6h) {
        int startOffset;
        int fixOffset;
        int extraForStart;
        View viewA1m;
        int fixOffset2;
        int extraForStart2 = -1;
        if ((this.A03 != null || this.A01 != -1) && c6h.A03() == 0) {
            A1I(c6a);
            return;
        }
        if (this.A03 != null && this.A03.A01()) {
            this.A01 = this.A03.A01;
        }
        A29();
        C04725h c04725h = this.A07;
        if (A0G[4].length() == 13) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[6] = "TEU8GGg";
        strArr[2] = "lg12FnG";
        c04725h.A0B = false;
        A0U();
        View viewA0s = A0s();
        if (!this.A0D.A03 || this.A01 != -1 || this.A03 != null) {
            this.A0D.A03();
            this.A0D.A02 = this.A05 ^ this.A0C;
            A0g(c6a, c6h, this.A0D);
            this.A0D.A03 = true;
        } else if (viewA0s != null) {
            int startOffset2 = this.A04.A0F(viewA0s);
            int lastElement = this.A04.A07();
            if (A0G[0].charAt(9) != '8') {
                A0G[1] = "cu8BBcv0k6hBgzqZsr0VN3sfifuVMQ62";
                if (startOffset2 < lastElement) {
                    if (this.A04.A0C(viewA0s) <= this.A04.A0A()) {
                    }
                }
            } else if (startOffset2 < lastElement) {
                if (this.A04.A0C(viewA0s) <= this.A04.A0A()) {
                }
            }
            this.A0D.A05(viewA0s);
        }
        int lastElement2 = A0C(c6h);
        if (this.A07.A04 >= 0) {
            startOffset = 0;
        } else {
            startOffset = lastElement2;
            lastElement2 = 0;
        }
        int current = startOffset + this.A04.A0A();
        int startOffset3 = lastElement2 + this.A04.A08();
        if (c6h.A07() && this.A01 != -1 && this.A02 != Integer.MIN_VALUE && (viewA1m = A1m(this.A01)) != null) {
            if (this.A05) {
                fixOffset2 = (this.A04.A07() - this.A04.A0C(viewA1m)) - this.A02;
            } else {
                fixOffset2 = this.A02 - (this.A04.A0F(viewA1m) - this.A04.A0A());
            }
            if (fixOffset2 > 0) {
                current += fixOffset2;
            } else {
                startOffset3 -= fixOffset2;
            }
        }
        if (this.A0D.A02) {
            if (this.A05) {
                extraForStart2 = 1;
            }
        } else if (!this.A05) {
            extraForStart2 = 1;
        }
        A2C(c6a, c6h, this.A0D, extraForStart2);
        A1H(c6a);
        this.A07.A09 = A0i();
        this.A07.A0A = c6h.A07();
        if (this.A0D.A02) {
            A0a(this.A0D);
            this.A07.A02 = current;
            A08(c6a, this.A07, c6h, false);
            extraForStart = this.A07.A06;
            int extraForEnd = this.A07.A01;
            if (this.A07.A00 > 0) {
                C04725h c04725h2 = this.A07;
                if (A0G[7].charAt(1) != 'F') {
                    String[] strArr2 = A0G;
                    strArr2[6] = "MJWLhmn";
                    strArr2[2] = "Xdeja1C";
                    startOffset3 += c04725h2.A00;
                } else {
                    A0G[3] = "HkWuM96xU0ciNRE25G4cwktgC29lbS6I";
                    startOffset3 += c04725h2.A00;
                }
            }
            A0Z(this.A0D);
            this.A07.A02 = startOffset3;
            this.A07.A01 += this.A07.A03;
            A08(c6a, this.A07, c6h, false);
            fixOffset = this.A07.A06;
            if (this.A07.A00 > 0) {
                int i = this.A07.A00;
                A0X(extraForEnd, extraForStart);
                this.A07.A02 = i;
                A08(c6a, this.A07, c6h, false);
                extraForStart = this.A07.A06;
            }
        } else {
            A0Z(this.A0D);
            this.A07.A02 = startOffset3;
            A08(c6a, this.A07, c6h, false);
            fixOffset = this.A07.A06;
            int extraForEnd2 = this.A07.A01;
            if (this.A07.A00 > 0) {
                current += this.A07.A00;
            }
            A0a(this.A0D);
            this.A07.A02 = current;
            this.A07.A01 += this.A07.A03;
            A08(c6a, this.A07, c6h, false);
            extraForStart = this.A07.A06;
            if (this.A07.A00 > 0) {
                int i2 = this.A07.A00;
                A0W(extraForEnd2, fixOffset);
                this.A07.A02 = i2;
                A08(c6a, this.A07, c6h, false);
                fixOffset = this.A07.A06;
            }
        }
        if (A0W() > 0) {
            if (this.A05 ^ this.A0C) {
                int iA05 = A05(fixOffset, c6a, c6h, true);
                int extraForStart3 = extraForStart + iA05;
                int fixOffset3 = fixOffset + iA05;
                int iA06 = A06(extraForStart3, c6a, c6h, false);
                extraForStart = extraForStart3 + iA06;
                fixOffset = fixOffset3 + iA06;
            } else {
                int iA07 = A06(extraForStart, c6a, c6h, true);
                int extraForStart4 = extraForStart + iA07;
                int fixOffset4 = fixOffset + iA07;
                int iA08 = A05(fixOffset4, c6a, c6h, false);
                extraForStart = extraForStart4 + iA08;
                fixOffset = fixOffset4 + iA08;
            }
        }
        A0f(c6a, c6h, extraForStart, fixOffset);
        if (!c6h.A07()) {
            this.A04.A0I();
        } else {
            this.A0D.A03();
        }
        this.A08 = this.A0C;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public void A1v(C6H c6h) {
        super.A1v(c6h);
        this.A03 = null;
        this.A01 = -1;
        this.A02 = Integer.MIN_VALUE;
        this.A0D.A03();
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public final void A1w(MG mg, C6A c6a) {
        super.A1w(mg, c6a);
        if (this.A09) {
            A1I(c6a);
            c6a.A0P();
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public void A1x(MG mg, C6H c6h, int i) {
        C1899lB linearSmoothScroller = new C1899lB(mg.getContext());
        linearSmoothScroller.A0A(i);
        A1L(linearSmoothScroller);
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public final void A1y(String str) {
        if (this.A03 == null) {
            super.A1y(str);
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public final boolean A1z() {
        return (A0Y() == 1073741824 || A0i() == 1073741824 || !A1S()) ? false : true;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public final boolean A20() {
        return this.A00 == 0;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public final boolean A21() {
        return this.A00 == 1;
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass62
    public boolean A22() {
        return this.A03 == null && this.A08 == this.A0C;
    }

    public final int A23() {
        View child = A0J(0, A0W(), true, false);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A24() {
        View child = A0J(0, A0W(), false, true);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A25() {
        View child = A0J(A0W() - 1, -1, false, true);
        if (child == null) {
            return -1;
        }
        return A0p(child);
    }

    public final int A26() {
        return this.A00;
    }

    public final int A27(int i) {
        switch (i) {
            case 1:
                if (this.A00 == 1) {
                    return -1;
                }
                boolean zA2F = A2F();
                if (A0G[4].length() != 13) {
                    A0G[7] = "JFBGAdvw0W46p1IiHd184rfjlhxsbjRk";
                    return zA2F ? 1 : -1;
                }
                break;
            case 2:
                return (this.A00 != 1 && A2F()) ? -1 : 1;
            case 17:
                if (this.A00 == 0) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            case 33:
                if (this.A00 == 1) {
                    return -1;
                }
                return Integer.MIN_VALUE;
            case 66:
                int i2 = this.A00;
                String[] strArr = A0G;
                if (strArr[6].length() == strArr[2].length()) {
                    A0G[0] = "A4gNOGqmCbgTlyYHXDAs3UqrHjABAhAn";
                    return i2 == 0 ? 1 : Integer.MIN_VALUE;
                }
                break;
            case 130:
                return this.A00 == 1 ? 1 : Integer.MIN_VALUE;
            default:
                return Integer.MIN_VALUE;
        }
        throw new RuntimeException();
    }

    public View A28(C6A c6a, C6H c6h, int i, int i2, int i3) {
        A29();
        View view = null;
        View view2 = null;
        int iA0A = this.A04.A0A();
        int boundsEnd = this.A04.A07();
        int boundsStart = i2 > i ? 1 : -1;
        while (i != i2) {
            View outOfBoundsMatch = A0t(i);
            int iA0p = A0p(outOfBoundsMatch);
            if (iA0p >= 0 && iA0p < i3) {
                if (((AnonymousClass63) outOfBoundsMatch.getLayoutParams()).A02()) {
                    if (view == null) {
                        view = outOfBoundsMatch;
                    }
                } else if (this.A04.A0F(outOfBoundsMatch) >= boundsEnd || this.A04.A0C(outOfBoundsMatch) < iA0A) {
                    if (view2 == null) {
                        view2 = outOfBoundsMatch;
                    }
                } else {
                    return outOfBoundsMatch;
                }
            }
            i += boundsStart;
        }
        return view2 != null ? view2 : view;
    }

    public final void A29() {
        if (this.A07 == null) {
            C04725h c04725hA0S = A0S();
            if (A0G[3].charAt(25) != '2') {
                throw new RuntimeException();
            }
            A0G[7] = "6FRvOBuqOIFmnj4QgnBJgNDOjl7oudHL";
            this.A07 = c04725hA0S;
        }
        if (this.A04 == null) {
            this.A04 = AbstractC04765m.A02(this, this.A00);
        }
    }

    public final void A2A(int i) {
        if (i == 0 || i == 1) {
            A1y(null);
            if (i == this.A00) {
                return;
            }
            this.A00 = i;
            this.A04 = null;
            A0y();
            return;
        }
        throw new IllegalArgumentException(A0T(0, 20, 45) + i);
    }

    public final void A2B(int i, int i2) {
        this.A01 = i;
        this.A02 = i2;
        if (this.A03 != null) {
            this.A03.A00();
        }
        A0y();
    }

    public void A2C(C6A c6a, C6H c6h, C04705f c04705f, int i) {
    }

    public void A2D(C6A c6a, C6H c6h, C04725h c04725h, C04715g c04715g) {
        int iA0g;
        int right;
        int iA0e;
        int iA0E;
        View viewA03 = c04725h.A03(c6a);
        if (viewA03 == null) {
            c04715g.A01 = true;
            return;
        }
        AnonymousClass63 anonymousClass63 = (AnonymousClass63) viewA03.getLayoutParams();
        if (c04725h.A08 == null) {
            if (this.A05 == (c04725h.A05 == -1)) {
                A17(viewA03);
            } else {
                A19(viewA03, 0);
            }
        } else {
            boolean z = this.A05;
            int bottom = c04725h.A05;
            if (z == (bottom == -1)) {
                A16(viewA03);
            } else {
                A18(viewA03, 0);
            }
        }
        A1A(viewA03, 0, 0);
        c04715g.A00 = this.A04.A0D(viewA03);
        if (this.A00 == 1) {
            if (A2F()) {
                iA0E = A0h() - A0f();
                iA0e = iA0E - this.A04.A0E(viewA03);
            } else {
                iA0e = A0e();
                iA0E = this.A04.A0E(viewA03) + iA0e;
            }
            if (c04725h.A05 == -1) {
                right = c04725h.A06;
                iA0g = c04725h.A06 - c04715g.A00;
            } else {
                iA0g = c04725h.A06;
                right = c04725h.A06 + c04715g.A00;
            }
        } else {
            iA0g = A0g();
            right = this.A04.A0E(viewA03) + iA0g;
            int bottom2 = c04725h.A05;
            if (bottom2 == -1) {
                iA0E = c04725h.A06;
                int i = c04725h.A06;
                int bottom3 = c04715g.A00;
                iA0e = i - bottom3;
            } else {
                iA0e = c04725h.A06;
                int i2 = c04725h.A06;
                int bottom4 = c04715g.A00;
                iA0E = i2 + bottom4;
            }
        }
        A1B(viewA03, iA0e, iA0g, iA0E, right);
        if (anonymousClass63.A02() || anonymousClass63.A01()) {
            c04715g.A03 = true;
        }
        c04715g.A02 = viewA03.hasFocusable();
    }

    public void A2E(C6H c6h, C04725h c04725h, AnonymousClass60 anonymousClass60) {
        int i = c04725h.A01;
        if (i >= 0) {
            int pos = c6h.A03();
            if (i < pos) {
                int pos2 = c04725h.A07;
                anonymousClass60.A3s(i, Math.max(0, pos2));
            }
        }
    }

    public final boolean A2F() {
        return A0a() == 1;
    }

    @Override // com.facebook.ads.redexgen.core.C6E
    public final PointF A4w(int i) {
        if (A0W() == 0) {
            return null;
        }
        boolean z = i < A0p(A0t(0));
        boolean z2 = this.A05;
        int firstChildPos = A0G[4].length();
        if (firstChildPos == 13) {
            throw new RuntimeException();
        }
        A0G[7] = "FFnbbIQmxzlcCB5QJgqtb02Njm6aLfkX";
        int i2 = z != z2 ? -1 : 1;
        int direction = this.A00;
        if (direction == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }
}
