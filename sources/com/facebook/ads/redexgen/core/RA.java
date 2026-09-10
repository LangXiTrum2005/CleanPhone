package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import com.applovin.shadow.okio.Segment;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import com.smartdigimkt.sdk.basead.ui.BaseATView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class RA {
    public static byte[] A09;
    public static String[] A0A = {"", "d6jyZ4YF4aAx6mY2oyMV8cMH3x1tTmGX", "6ShmsSFKDmdiSeaEbVJI0pMmhv", "Jy6CLSdjiTJVmxisrmhO9od6ZqYVQGpz", "aKDRqPZxmSwbRmY5O7VQCqOvGq0yRVmO", "vr6xx06LqTBYtEPA9ZzozSqPDwzkbNaY", "Y84hViIy7qYskGYmJ3QVEouknT", ""};
    public R9 A01;
    public RI A04;
    public final /* synthetic */ C7M A08;
    public final ArrayList<RK> A05 = new ArrayList<>();
    public ArrayList<RK> A02 = null;
    public final ArrayList<RK> A06 = new ArrayList<>();
    public final List<RK> A07 = Collections.unmodifiableList(this.A05);
    public int A03 = 2;
    public int A00 = 2;

    public static String A04(int i2, int i3, int i4) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i2, i2 + i3);
        for (int i5 = 0; i5 < bArrCopyOfRange.length; i5++) {
            bArrCopyOfRange[i5] = (byte) ((bArrCopyOfRange[i5] ^ i4) ^ 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A09 = new byte[]{113, 56, 34, 16, 37, 37, 48, 50, 57, 52, 53, 107, 56, 86, 17, 24, 24, 13, 27, 10, 68, 32, 39, 41, 64, 125, 108, 100, 41, 106, 102, 124, 103, 125, 51, 79, 72, 21, 18, 7, 18, 3, 92, 121, 91, 86, 86, 95, 94, 26, 73, 89, 72, 91, 74, 26, 76, 83, 95, 77, 26, 77, 83, 78, 82, 26, 91, 84, 26, 83, 84, 76, 91, 86, 83, 94, 26, 76, 83, 95, 77, 20, 26, 115, 84, 76, 91, 86, 83, 94, 26, 76, 83, 95, 77, 73, 26, 89, 91, 84, 84, 85, 78, 26, 88, 95, 26, 72, 95, 79, 73, 95, 94, 26, 92, 72, 85, 87, 26, 73, 89, 72, 91, 74, 22, 26, 78, 82, 95, 67, 26, 73, 82, 85, 79, 86, 94, 26, 72, 95, 88, 85, 79, 84, 94, 26, 92, 72, 85, 87, 26, 72, 95, 89, 67, 89, 86, 95, 72, 26, 74, 85, 85, 86, 20, 116, 83, 94, 82, 83, 78, 84, 78, 73, 88, 83, 94, 68, 29, 89, 88, 73, 88, 94, 73, 88, 89, 19, 29, 116, 83, 75, 92, 81, 84, 89, 29, 84, 73, 88, 80, 29, 77, 82, 78, 84, 73, 84, 82, 83, 29, 31, 56, 53, 57, 56, 37, 63, 37, 34, 51, 56, 53, 47, 118, 50, 51, 34, 51, 53, 34, 51, 50, 120, 118, 31, 56, 32, 55, 58, 63, 50, 118, 32, 63, 51, 33, 118, 62, 57, 58, 50, 51, 36, 118, 55, 50, 55, 38, 34, 51, 36, 118, 38, 57, 37, 63, 34, 63, 57, 56, 89, 126, 102, 113, 124, 121, 116, 48, 121, 100, 117, 125, 48, 96, AbstractJsonLexerKt.TC_INVALID, 99, 121, 100, 121, AbstractJsonLexerKt.TC_INVALID, 126, 48, 18, 34, 51, 32, 49, 49, 36, 37, 97, 46, 51, 97, 32, 53, 53, 32, 34, 41, 36, 37, 97, 55, 40, 36, 54, 50, 97, 44, 32, 56, 97, 47, 46, 53, 97, 35, 36, 97, 51, 36, 34, 56, 34, 45, 36, 37, 111, 97, 40, 50, 18, 34, 51, 32, 49, 123, 108, 85, 72, 24, 92, 93, 76, 89, 91, 80, 93, 92, 24, 78, 81, 93, 79, 24, 75, 80, 87, 77, 84, 92, 24, 90, 93, 24, 74, 93, 85, 87, 78, 93, 92, 24, 94, 74, 87, 85, 24, 106, 93, 91, 65, 91, 84, 93, 74, 110, 81, 93, 79, 24, 90, 93, 94, 87, 74, 93, 24, 81, 76, 24, 91, 89, 86, 24, 90, 93, 24, 74, 93, 91, 65, 91, 84, 93, 92, 2, 24, 87, 113, 122, 106, 109, 100, 35, 119, 108, 35, 113, 102, 96, 122, 96, 111, 102, 35, 98, 109, 35, 106, 100, 109, 108, 113, 102, 103, 35, 117, 106, 102, 116, 35, 107, 108, 111, 103, 102, 113, 45, 35, 90, 108, 118, 35, 112, 107, 108, 118, 111, 103, 35, 101, 106, 113, 112, 119, 35, 96, 98, 111, 111, 35, 112, 119, 108, 115, 74, 100, 109, 108, 113, 106, 109, 100, 85, 106, 102, 116, 43, 117, 106, 102, 116, 42, 35, 97, 102, 101, 108, 113, 102, 35, 96, 98, 111, 111, 106, 109, 100, 35, 113, 102, 96, 122, 96, 111, 102, 45, 48, 50, 35, 1, 62, 50, 32, 17, 56, 37, 7, 56, 36, 62, 35, 62, 56, 57, 22, 57, 51, 3, 46, 39, 50, 29, 16, 8, 30, 4, 5, 81, 24, 31, 21, 20, 9, 81, 2, 25, 30, 4, 29, 21, 81, 31, 30, 5, 81, 19, 20, 81, 92, 64, 81, 16, 23, 5, 20, 3, 81, 4, 31, 25, 24, 21, 24, 31, 22, 81, 16, 81, 7, 24, 20, 6, 75, 69, 68, 124, 67, 79, 93, 120, 79, 73, 83, 73, 70, 79, 78};
    }

    static {
        A05();
    }

    public RA(C7M c7m) {
        this.A08 = c7m;
    }

    private final View A00(int i2, boolean z2) {
        return A0I(i2, z2, Long.MAX_VALUE).A0H;
    }

    private final RK A01(int i2) {
        int size;
        int iA04;
        if (this.A02 == null || (size = this.A02.size()) == 0) {
            return null;
        }
        for (int i3 = 0; i3 < size; i3++) {
            RK rk = this.A02.get(i3);
            if (!rk.A0m()) {
                int i4 = rk.A0O();
                if (i4 == i2) {
                    rk.A0Z(32);
                    return rk;
                }
            }
        }
        if (this.A08.A04.A0M() && (iA04 = this.A08.A00.A04(i2)) > 0) {
            int offsetPosition = this.A08.A04.A0B();
            if (iA04 < offsetPosition) {
                long jA0D = this.A08.A04.A0D(iA04);
                for (int i5 = 0; i5 < size; i5++) {
                    RK rk2 = this.A02.get(i5);
                    if (!rk2.A0m() && rk2.A0Q() == jA0D) {
                        rk2.A0Z(32);
                        return rk2;
                    }
                }
            }
        }
        return null;
    }

    private final RK A02(int i2, boolean z2) {
        View viewA08;
        int size = this.A05.size();
        for (int i3 = 0; i3 < size; i3++) {
            RK rk = this.A05.get(i3);
            if (!rk.A0m()) {
                int scrapCount = rk.A0O();
                if (scrapCount == i2 && !rk.A0f() && (this.A08.A0s.A09 || !rk.A0g())) {
                    rk.A0Z(32);
                    return rk;
                }
            }
        }
        if (!z2 && (viewA08 = this.A08.A01.A08(i2)) != null) {
            RK rkA0F = C7M.A0F(viewA08);
            this.A08.A01.A0G(viewA08);
            int iA07 = this.A08.A01.A07(viewA08);
            if (iA07 != -1) {
                this.A08.A01.A0C(iA07);
                A0S(viewA08);
                rkA0F.A0Z(8224);
                return rkA0F;
            }
            throw new IllegalStateException(A04(565, 52, 123) + rkA0F + this.A08.A1J());
        }
        int size2 = this.A06.size();
        for (int i4 = 0; i4 < size2; i4++) {
            RK holder = this.A06.get(i4);
            String[] strArr = A0A;
            String str = strArr[7];
            String str2 = strArr[0];
            int cacheSize = str.length();
            int scrapCount2 = str2.length();
            if (cacheSize != scrapCount2) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "JIr6ryR6hWTh2WYmHdarh5TP4xAypylw";
            strArr2[1] = "npmC62BAQEqZygYceoAiNhkQGghR92x0";
            if (!holder.A0f()) {
                int scrapCount3 = holder.A0O();
                if (scrapCount3 == i2) {
                    if (!z2) {
                        this.A06.remove(i4);
                    }
                    return holder;
                }
            }
        }
        return null;
    }

    private final RK A03(long j, int i2, boolean z2) {
        int count = this.A05.size();
        for (int i3 = count - 1; i3 >= 0; i3--) {
            RK rk = this.A05.get(i3);
            if (rk.A0Q() == j && !rk.A0m()) {
                int count2 = rk.A0N();
                if (i2 == count2) {
                    rk.A0Z(32);
                    boolean zA0g = rk.A0g();
                    String[] strArr = A0A;
                    String str = strArr[2];
                    String str2 = strArr[6];
                    int i4 = str.length();
                    int count3 = str2.length();
                    if (i4 == count3) {
                        String[] strArr2 = A0A;
                        strArr2[4] = "3Wf6vMFZ4V6K3VYEAeXlgILB3Kqn8tmj";
                        strArr2[1] = "2gRFj7AUivxslEY3Do0gPT185jjA6g6i";
                        if (zA0g && !this.A08.A0s.A07()) {
                            rk.A0a(2, 14);
                        }
                        return rk;
                    }
                } else if (z2) {
                    continue;
                } else {
                    this.A05.remove(i3);
                    C7M c7m = this.A08;
                    View view = rk.A0H;
                    String[] strArr3 = A0A;
                    String str3 = strArr3[7];
                    String str4 = strArr3[0];
                    int i5 = str3.length();
                    int count4 = str4.length();
                    if (i5 == count4) {
                        String[] strArr4 = A0A;
                        strArr4[5] = "QSy8SYzj9TGZXONlvrRd2Hl7xNggaX2t";
                        strArr4[3] = "FStY7c67BTbAcWAeNWEJdNOuKPlMCdqH";
                        c7m.removeDetachedView(view, false);
                        A0R(rk.A0H);
                    }
                }
                throw new RuntimeException();
            }
        }
        int count5 = this.A06.size();
        for (int i6 = count5 - 1; i6 >= 0; i6--) {
            RK rk2 = this.A06.get(i6);
            if (rk2.A0Q() == j) {
                int count6 = rk2.A0N();
                if (i2 == count6) {
                    if (!z2) {
                        this.A06.remove(i6);
                    }
                    return rk2;
                }
                if (!z2) {
                    A07(i6);
                    String[] strArr5 = A0A;
                    String str5 = strArr5[7];
                    String str6 = strArr5[0];
                    int cacheSize = str5.length();
                    int count7 = str6.length();
                    if (cacheSize != count7) {
                        throw new RuntimeException();
                    }
                    String[] strArr6 = A0A;
                    strArr6[2] = "Px4MCeB3tpw5Kws4bgsL6OQ2tD";
                    strArr6[6] = "cZzmTfGm3PDqBsfSjCaAnG9aB7";
                    return null;
                }
            }
        }
        return null;
    }

    private final void A06() {
        int count = this.A06.size();
        for (int count2 = count - 1; count2 >= 0; count2--) {
            A07(count2);
        }
        this.A06.clear();
        if (C7M.A1E) {
            this.A08.A02.A02();
        }
    }

    private final void A07(int i2) {
        A0Z(this.A06.get(i2), true);
        this.A06.remove(i2);
    }

    private void A08(ViewGroup viewGroup, boolean z2) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                A08((ViewGroup) childAt, true);
            }
        }
        if (!z2) {
            return;
        }
        if (viewGroup.getVisibility() == 4) {
            viewGroup.setVisibility(0);
            viewGroup.setVisibility(4);
        } else {
            int visibility = viewGroup.getVisibility();
            viewGroup.setVisibility(4);
            viewGroup.setVisibility(visibility);
        }
    }

    private void A09(RK rk) {
        if (this.A08.A1q()) {
            View view = rk.A0H;
            if (Ph.A00(view) == 0) {
                Ph.A09(view, 1);
            }
            if (Ph.A0F(view)) {
                return;
            }
            String[] strArr = A0A;
            if (strArr[4].charAt(14) != strArr[1].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "r5izwM6EITTd8J0QgfTuliuK3Ylx6gnH";
            strArr2[3] = "CLm8SGIYJT8sX0J5oMrTiG0qZUHKeksn";
            rk.A0Z(16384);
            Ph.A0B(view, this.A08.A09.A0A());
        }
    }

    private void A0A(RK rk) {
        if (rk.A0H instanceof ViewGroup) {
            A08((ViewGroup) rk.A0H, false);
        }
    }

    private final void A0B(RK rk) {
        if (0 != 0) {
            throw new NullPointerException(A04(IronSourceError.ERROR_BN_BANNER_CONTAINER_IS_NULL, 14, 32));
        }
        if (this.A08.A0s != null) {
            this.A08.A0t.A0B(rk);
        }
    }

    private final boolean A0C(RK rk) {
        if (rk.A0g()) {
            return this.A08.A0s.A07();
        }
        if (rk.A03 >= 0 && rk.A03 < this.A08.A04.A0B()) {
            if (!this.A08.A0s.A07()) {
                int iA0C = this.A08.A04.A0C(rk.A03);
                int type = rk.A0N();
                if (iA0C != type) {
                    return false;
                }
            }
            return !this.A08.A04.A0M() || rk.A0Q() == this.A08.A04.A0D(rk.A03);
        }
        throw new IndexOutOfBoundsException(A04(BaseATView.g.f38289J, 60, 92) + rk + this.A08.A1J());
    }

    private boolean A0D(RK rk, int i2, int i3, long j) {
        rk.A08 = this.A08;
        int iA0N = rk.A0N();
        long nanoTime = this.A08.getNanoTime();
        if (j != Long.MAX_VALUE && !this.A01.A0A(iA0N, nanoTime, j)) {
            return false;
        }
        this.A08.A04.A0J(rk, i2);
        this.A01.A05(rk.A0N(), this.A08.getNanoTime() - nanoTime);
        A09(rk);
        if (this.A08.A0s.A07()) {
            rk.A04 = i3;
            return true;
        }
        return true;
    }

    public final int A0E() {
        return this.A05.size();
    }

    public final View A0F(int i2) {
        return this.A05.get(i2).A0H;
    }

    public final View A0G(int i2) {
        return A00(i2, false);
    }

    public final R9 A0H() {
        if (this.A01 == null) {
            this.A01 = new R9();
        }
        return this.A01;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0261  */
    /* JADX WARN: Code duplicated, block: B:103:0x0264  */
    /* JADX WARN: Code duplicated, block: B:105:0x026a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0276  */
    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:87:0x0204  */
    /* JADX WARN: Code duplicated, block: B:93:0x021a  */
    /* JADX WARN: Code duplicated, block: B:94:0x021c  */
    /* JADX WARN: Code duplicated, block: B:96:0x0236  */
    /* JADX WARN: Code duplicated, block: B:98:0x0244  */
    /* JADX WARN: Code duplicated, block: B:99:0x0252  */
    public final RK A0I(int i2, boolean z2, long j) {
        boolean zA0D;
        ViewGroup.LayoutParams layoutParams;
        boolean zCheckLayoutParams;
        String[] strArr;
        R3 r3;
        int iA04;
        C7M c7mA0H;
        if (i2 >= 0 && i2 < this.A08.A0s.A03()) {
            boolean z3 = false;
            RK rkA0E = null;
            boolean fromScrapOrHiddenOrCache = this.A08.A0s.A07();
            if (fromScrapOrHiddenOrCache) {
                rkA0E = A01(i2);
                z3 = rkA0E != null;
            }
            if (rkA0E == null && (rkA0E = A02(i2, z2)) != null) {
                boolean fromScrapOrHiddenOrCache2 = A0C(rkA0E);
                if (!fromScrapOrHiddenOrCache2) {
                    if (!z2) {
                        String[] strArr2 = A0A;
                        if (strArr2[2].length() == strArr2[6].length()) {
                            String[] strArr3 = A0A;
                            strArr3[7] = "";
                            strArr3[0] = "";
                            rkA0E.A0Z(4);
                            boolean fromScrapOrHiddenOrCache3 = rkA0E.A0h();
                            if (fromScrapOrHiddenOrCache3) {
                                this.A08.removeDetachedView(rkA0E.A0H, false);
                                rkA0E.A0Y();
                            } else {
                                boolean fromScrapOrHiddenOrCache4 = rkA0E.A0m();
                                if (fromScrapOrHiddenOrCache4) {
                                    rkA0E.A0U();
                                }
                            }
                            A0X(rkA0E);
                        }
                    }
                    rkA0E = null;
                } else {
                    z3 = true;
                }
                if (rkA0E == null) {
                    iA04 = this.A08.A00.A04(i2);
                    if (iA04 >= 0) {
                    }
                    throw new IndexOutOfBoundsException(A04(165, 46, 55) + i2 + A04(13, 8, 116) + iA04 + A04(35, 8, 108) + this.A08.A0s.A03() + this.A08.A1J());
                }
                if (z3) {
                    rkA0E.A0a(0, Segment.SIZE);
                    if (this.A08.A0s.A0C) {
                        int changeFlags = AbstractC1656Qy.A06(rkA0E);
                        C1655Qx info = this.A08.A05.A0F(this.A08.A0s, rkA0E, changeFlags | 4096, rkA0E.A0R());
                        this.A08.A1k(rkA0E, info);
                    }
                }
                zA0D = false;
                if (!this.A08.A0s.A07()) {
                    if (rkA0E.A0e()) {
                        zA0D = A0D(rkA0E, this.A08.A00.A04(i2), i2, j);
                    } else {
                        zA0D = A0D(rkA0E, this.A08.A00.A04(i2), i2, j);
                    }
                } else if (rkA0E.A0e()) {
                    zA0D = A0D(rkA0E, this.A08.A00.A04(i2), i2, j);
                } else {
                    zA0D = A0D(rkA0E, this.A08.A00.A04(i2), i2, j);
                }
                layoutParams = rkA0E.A0H.getLayoutParams();
                if (layoutParams == null) {
                    r3 = (R3) this.A08.generateDefaultLayoutParams();
                    rkA0E.A0H.setLayoutParams(r3);
                } else {
                    zCheckLayoutParams = this.A08.checkLayoutParams(layoutParams);
                    strArr = A0A;
                    if (strArr[5].charAt(9) != strArr[3].charAt(9)) {
                        String[] strArr4 = A0A;
                        strArr4[2] = "zCboBEvvN0uPYmtuolLcQSfyvv";
                        strArr4[6] = "oQlbeeNPYINxaBCA8kGLswkn0x";
                        if (!zCheckLayoutParams) {
                            r3 = (R3) this.A08.generateLayoutParams(layoutParams);
                            rkA0E.A0H.setLayoutParams(r3);
                        } else {
                            r3 = (R3) layoutParams;
                        }
                    } else {
                        String[] strArr5 = A0A;
                        strArr5[7] = "";
                        strArr5[0] = "";
                        if (!zCheckLayoutParams) {
                            r3 = (R3) this.A08.generateLayoutParams(layoutParams);
                            rkA0E.A0H.setLayoutParams(r3);
                        } else {
                            r3 = (R3) layoutParams;
                        }
                    }
                }
                r3.A00 = rkA0E;
                r3.A02 = !z3 && zA0D;
                return rkA0E;
            }
            if (rkA0E == null) {
                iA04 = this.A08.A00.A04(i2);
                if (iA04 >= 0 || iA04 >= this.A08.A04.A0B()) {
                    throw new IndexOutOfBoundsException(A04(165, 46, 55) + i2 + A04(13, 8, 116) + iA04 + A04(35, 8, 108) + this.A08.A0s.A03() + this.A08.A1J());
                }
                int offsetPosition = this.A08.A04.A0C(iA04);
                boolean fromScrapOrHiddenOrCache5 = this.A08.A04.A0M();
                if (fromScrapOrHiddenOrCache5 && (rkA0E = A03(this.A08.A04.A0D(iA04), offsetPosition, z2)) != null) {
                    rkA0E.A03 = iA04;
                    z3 = true;
                }
                if (rkA0E == null && 0 != 0) {
                    throw new NullPointerException(A04(540, 25, 93));
                }
                if (rkA0E == null && (rkA0E = A0H().A03(offsetPosition)) != null) {
                    rkA0E.A0W();
                    boolean fromScrapOrHiddenOrCache6 = C7M.A1C;
                    if (fromScrapOrHiddenOrCache6) {
                        A0A(rkA0E);
                    }
                }
                if (rkA0E == null) {
                    long nanoTime = this.A08.getNanoTime();
                    String[] strArr6 = A0A;
                    if (strArr6[4].charAt(14) == strArr6[1].charAt(14)) {
                        String[] strArr7 = A0A;
                        strArr7[5] = "boNM8OY2bTpFYgdjXbnYcgq0xZrcwPhs";
                        strArr7[3] = "UkhWCoe8HTTYlCSa40rnYF5pqDe823no";
                        if (j != Long.MAX_VALUE) {
                            boolean fromScrapOrHiddenOrCache7 = this.A01.A0B(offsetPosition, nanoTime, j);
                            if (!fromScrapOrHiddenOrCache7) {
                                return null;
                            }
                        }
                        rkA0E = this.A08.A04.A0E(this.A08, offsetPosition);
                        boolean fromScrapOrHiddenOrCache8 = C7M.A1E;
                        if (fromScrapOrHiddenOrCache8 && (c7mA0H = C7M.A0H(rkA0E.A0H)) != null) {
                            rkA0E.A09 = new WeakReference<>(c7mA0H);
                        }
                        this.A01.A06(offsetPosition, this.A08.getNanoTime() - nanoTime);
                    }
                }
            }
            if (z3 && !this.A08.A0s.A07() && rkA0E.A0o(Segment.SIZE)) {
                rkA0E.A0a(0, Segment.SIZE);
                if (this.A08.A0s.A0C) {
                    int changeFlags2 = AbstractC1656Qy.A06(rkA0E);
                    C1655Qx info2 = this.A08.A05.A0F(this.A08.A0s, rkA0E, changeFlags2 | 4096, rkA0E.A0R());
                    this.A08.A1k(rkA0E, info2);
                }
            }
            zA0D = false;
            if (!this.A08.A0s.A07() && rkA0E.A0e()) {
                rkA0E.A04 = i2;
            } else if (rkA0E.A0e() || rkA0E.A0k() || rkA0E.A0f()) {
                zA0D = A0D(rkA0E, this.A08.A00.A04(i2), i2, j);
            }
            layoutParams = rkA0E.A0H.getLayoutParams();
            if (layoutParams == null) {
                r3 = (R3) this.A08.generateDefaultLayoutParams();
                rkA0E.A0H.setLayoutParams(r3);
            } else {
                zCheckLayoutParams = this.A08.checkLayoutParams(layoutParams);
                strArr = A0A;
                if (strArr[5].charAt(9) != strArr[3].charAt(9)) {
                    String[] strArr8 = A0A;
                    strArr8[2] = "zCboBEvvN0uPYmtuolLcQSfyvv";
                    strArr8[6] = "oQlbeeNPYINxaBCA8kGLswkn0x";
                    if (!zCheckLayoutParams) {
                        r3 = (R3) this.A08.generateLayoutParams(layoutParams);
                        rkA0E.A0H.setLayoutParams(r3);
                    } else {
                        r3 = (R3) layoutParams;
                    }
                } else {
                    String[] strArr9 = A0A;
                    strArr9[7] = "";
                    strArr9[0] = "";
                    if (!zCheckLayoutParams) {
                        r3 = (R3) this.A08.generateLayoutParams(layoutParams);
                        rkA0E.A0H.setLayoutParams(r3);
                    } else {
                        r3 = (R3) layoutParams;
                    }
                }
            }
            r3.A00 = rkA0E;
            r3.A02 = !z3 && zA0D;
            return rkA0E;
            throw new RuntimeException();
        }
        throw new IndexOutOfBoundsException(A04(271, 22, 26) + i2 + A04(12, 1, 26) + i2 + A04(21, 14, 3) + this.A08.A0s.A03() + this.A08.A1J());
    }

    public final List<RK> A0J() {
        return this.A07;
    }

    public final void A0K() {
        int size = this.A06.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.A06.get(i2).A0S();
        }
        int i3 = this.A05.size();
        for (int scrapCount = 0; scrapCount < i3; scrapCount++) {
            this.A05.get(scrapCount).A0S();
        }
        if (this.A02 != null) {
            int changedScrapCount = this.A02.size();
            for (int scrapCount2 = 0; scrapCount2 < changedScrapCount; scrapCount2++) {
                this.A02.get(scrapCount2).A0S();
            }
        }
    }

    public final void A0L() {
        this.A05.clear();
        if (this.A02 != null) {
            this.A02.clear();
        }
    }

    public final void A0M() {
        int size = this.A06.size();
        for (int i2 = 0; i2 < size; i2++) {
            R3 r3 = (R3) this.A06.get(i2).A0H.getLayoutParams();
            if (r3 != null) {
                r3.A01 = true;
            }
        }
    }

    public final void A0N() {
        if (this.A08.A04 != null && this.A08.A04.A0M()) {
            int size = this.A06.size();
            for (int i2 = 0; i2 < size; i2++) {
                RK rk = this.A06.get(i2);
                if (rk != null) {
                    rk.A0Z(6);
                    rk.A0c(null);
                }
            }
            return;
        }
        A06();
    }

    public final void A0O() {
        int i2 = this.A08.A06 != null ? this.A08.A06.A00 : 0;
        int extraCache = this.A03;
        this.A00 = extraCache + i2;
        int extraCache2 = this.A06.size();
        for (int i3 = extraCache2 - 1; i3 >= 0; i3--) {
            int size = this.A06.size();
            int i4 = this.A00;
            String[] strArr = A0A;
            String str = strArr[5];
            String str2 = strArr[3];
            int i5 = str.charAt(9);
            int extraCache3 = str2.charAt(9);
            if (i5 != extraCache3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "FM5srU9o6TBj8QlSYYqmaX9MZyJMPTMr";
            strArr2[3] = "mnADOFh1HT7Eu0tfTP5EsiAEmob0QgOc";
            if (size > i4) {
                A07(i3);
            } else {
                return;
            }
        }
    }

    public final void A0P() {
        this.A05.clear();
        A06();
    }

    public final void A0Q(int i2) {
        this.A03 = i2;
        A0O();
    }

    public final void A0R(View view) {
        RK rkA0F = C7M.A0F(view);
        rkA0F.A0F = null;
        rkA0F.A0G = false;
        rkA0F.A0U();
        A0X(rkA0F);
    }

    public final void A0S(View view) {
        RK rkA0F = C7M.A0F(view);
        if (rkA0F.A0o(12) || !rkA0F.A0j() || this.A08.A1y(rkA0F)) {
            if (!rkA0F.A0f() || rkA0F.A0g() || this.A08.A04.A0M()) {
                rkA0F.A0b(this, false);
                this.A05.add(rkA0F);
                return;
            }
            throw new IllegalArgumentException(A04(43, 122, 48) + this.A08.A1J());
        }
        if (this.A02 == null) {
            this.A02 = new ArrayList<>();
        }
        rkA0F.A0b(this, true);
        this.A02.add(rkA0F);
    }

    public final void A0T(View view) {
        RK rkA0F = C7M.A0F(view);
        if (rkA0F.A0i()) {
            this.A08.removeDetachedView(view, false);
        }
        if (rkA0F.A0h()) {
            rkA0F.A0Y();
        } else if (rkA0F.A0m()) {
            rkA0F.A0U();
        }
        A0X(rkA0F);
    }

    public final void A0U(AbstractC1648Qq abstractC1648Qq, AbstractC1648Qq abstractC1648Qq2, boolean z2) {
        A0P();
        A0H().A08(abstractC1648Qq, abstractC1648Qq2, z2);
    }

    public final void A0V(R9 r9) {
        if (this.A01 != null) {
            this.A01.A04();
        }
        this.A01 = r9;
        if (r9 != null) {
            R9 r10 = this.A01;
            AbstractC1648Qq adapter = this.A08.getAdapter();
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "lsZK0accpgBQgJYjkQv5Abfcayw6pcR0";
            strArr2[1] = "Z7g3Rn3k4gV3vNYe90sCMa52PcoBzFf1";
            r10.A07(adapter);
        }
    }

    public final void A0W(RI ri) {
        this.A04 = ri;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:31:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00de  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:46:0x0100  */
    /* JADX WARN: Code duplicated, block: B:48:0x0104  */
    /* JADX WARN: Code duplicated, block: B:53:0x0122  */
    /* JADX WARN: Code duplicated, block: B:60:0x0137 A[LOOP:0: B:47:0x0102->B:60:0x0137, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:65:0x0118 A[EDGE_INSN: B:65:0x0118->B:50:0x0118 BREAK  A[LOOP:0: B:47:0x0102->B:60:0x0137], SYNTHETIC] */
    public final void A0X(RK rk) {
        boolean transientStatePreventsRecycling;
        boolean transientStatePreventsRecycling2;
        int size;
        String[] strArr;
        boolean transientStatePreventsRecycling3;
        boolean transientStatePreventsRecycling4;
        int i2;
        boolean transientStatePreventsRecycling5;
        if (rk.A0h() || rk.A0H.getParent() != null) {
            throw new IllegalArgumentException(A04(293, 56, 75) + rk.A0h() + A04(0, 12, 91) + (rk.A0H.getParent() != null) + this.A08.A1J());
        }
        boolean zA0i = rk.A0i();
        String[] strArr2 = A0A;
        if (strArr2[4].charAt(14) == strArr2[1].charAt(14)) {
            String[] strArr3 = A0A;
            strArr3[2] = "XmVzY8sdohxIZJ5Ojk7HGi6GVO";
            strArr3[6] = "m3xjIJQIi7Ro4dRZ8OgPCgQ0SJ";
            if (!zA0i) {
                if (rk.A0l()) {
                    throw new IllegalArgumentException(A04(430, 110, 9) + this.A08.A1J());
                }
                boolean zA0F = rk.A0F();
                if (this.A08.A04 != null && zA0F) {
                    boolean transientStatePreventsRecycling6 = this.A08.A04.A0N(rk);
                    if (transientStatePreventsRecycling6) {
                        transientStatePreventsRecycling = true;
                    } else {
                        transientStatePreventsRecycling = false;
                    }
                } else {
                    transientStatePreventsRecycling = false;
                }
                int targetCacheIndex = 0;
                boolean z2 = false;
                if (transientStatePreventsRecycling) {
                    if (this.A00 > 0) {
                        transientStatePreventsRecycling2 = rk.A0o(IronSourceError.ERROR_CAPPED_PER_SESSION);
                        if (!transientStatePreventsRecycling2) {
                            size = this.A06.size();
                            if (size >= this.A00) {
                                A07(0);
                                size--;
                            }
                            strArr = A0A;
                            if (strArr[5].charAt(9) == strArr[3].charAt(9)) {
                                String[] strArr4 = A0A;
                                strArr4[4] = "Q1OZT6LnkVYbRcYxNkw6Mn7gWXto99yC";
                                strArr4[1] = "RVxEgLz70808ymY8dF1xTnmhZlFYlEUe";
                                transientStatePreventsRecycling3 = C7M.A1E;
                                if (transientStatePreventsRecycling3) {
                                    transientStatePreventsRecycling4 = this.A08.A02.A05(rk.A03);
                                    if (!transientStatePreventsRecycling4) {
                                        i2 = size - 1;
                                        while (i2 >= 0) {
                                            transientStatePreventsRecycling5 = this.A08.A02.A05(this.A06.get(i2).A03);
                                            if (!transientStatePreventsRecycling5) {
                                                break;
                                                break;
                                            }
                                            i2--;
                                        }
                                        size = i2 + 1;
                                    }
                                }
                                this.A06.add(size, rk);
                                targetCacheIndex = 1;
                            }
                        }
                    }
                    if (targetCacheIndex == 0) {
                        A0Z(rk, true);
                        z2 = true;
                    }
                } else {
                    boolean transientStatePreventsRecycling7 = rk.A0n();
                    if (transientStatePreventsRecycling7) {
                        if (this.A00 > 0) {
                            transientStatePreventsRecycling2 = rk.A0o(IronSourceError.ERROR_CAPPED_PER_SESSION);
                            if (!transientStatePreventsRecycling2) {
                                size = this.A06.size();
                                if (size >= this.A00 && size > 0) {
                                    A07(0);
                                    size--;
                                }
                                strArr = A0A;
                                if (strArr[5].charAt(9) == strArr[3].charAt(9)) {
                                    String[] strArr5 = A0A;
                                    strArr5[4] = "Q1OZT6LnkVYbRcYxNkw6Mn7gWXto99yC";
                                    strArr5[1] = "RVxEgLz70808ymY8dF1xTnmhZlFYlEUe";
                                    transientStatePreventsRecycling3 = C7M.A1E;
                                    if (transientStatePreventsRecycling3 && size > 0) {
                                        transientStatePreventsRecycling4 = this.A08.A02.A05(rk.A03);
                                        if (!transientStatePreventsRecycling4) {
                                            i2 = size - 1;
                                            while (i2 >= 0) {
                                                transientStatePreventsRecycling5 = this.A08.A02.A05(this.A06.get(i2).A03);
                                                if (!transientStatePreventsRecycling5) {
                                                    break;
                                                } else {
                                                    i2--;
                                                }
                                            }
                                            size = i2 + 1;
                                        }
                                    }
                                    this.A06.add(size, rk);
                                    targetCacheIndex = 1;
                                }
                            }
                        }
                        if (targetCacheIndex == 0) {
                            A0Z(rk, true);
                            z2 = true;
                        }
                    }
                }
                this.A08.A0t.A0B(rk);
                if (targetCacheIndex == 0 && !z2 && zA0F) {
                    rk.A08 = null;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(A04(349, 81, 50) + rk + this.A08.A1J());
        }
        throw new RuntimeException();
    }

    public final void A0Y(RK rk) {
        if (rk.A0G) {
            ArrayList<RK> arrayList = this.A02;
            String[] strArr = A0A;
            if (strArr[7].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "g9dUUHlnr2dNWy2bvXbXpUnxFV";
            strArr2[6] = "1VljHDZyW4yQ7QRXruVc6WBcEp";
            arrayList.remove(rk);
        } else {
            this.A05.remove(rk);
        }
        rk.A0F = null;
        rk.A0G = false;
        rk.A0U();
    }

    public final void A0Z(RK rk, boolean z2) {
        C7M.A0s(rk);
        if (rk.A0o(16384)) {
            rk.A0a(0, 16384);
            Ph.A0B(rk.A0H, null);
        }
        if (z2) {
            A0B(rk);
        }
        rk.A08 = null;
        A0H().A09(rk);
    }
}
