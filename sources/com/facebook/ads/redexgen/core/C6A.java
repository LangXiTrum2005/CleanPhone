package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import com.umeng.analytics.pro.cw;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.6A, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C6A {
    public static byte[] A09;
    public static String[] A0A = {"", "d6jyZ4YF4aAx6mY2oyMV8cMH3x1tTmGX", "6ShmsSFKDmdiSeaEbVJI0pMmhv", "Jy6CLSdjiTJVmxisrmhO9od6ZqYVQGpz", "aKDRqPZxmSwbRmY5O7VQCqOvGq0yRVmO", "vr6xx06LqTBYtEPA9ZzozSqPDwzkbNaY", "Y84hViIy7qYskGYmJ3QVEouknT", ""};
    public AnonymousClass69 A01;
    public C6I A04;
    public final /* synthetic */ MG A08;
    public final ArrayList<C6K> A05 = new ArrayList<>();
    public ArrayList<C6K> A02 = null;
    public final ArrayList<C6K> A06 = new ArrayList<>();
    public final List<C6K> A07 = Collections.unmodifiableList(this.A05);
    public int A03 = 2;
    public int A00 = 2;

    public static String A04(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 10);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A09 = new byte[]{113, 56, 34, cw.n, 37, 37, 48, 50, 57, 52, 53, 107, 56, 86, 17, 24, 24, cw.k, 27, 10, 68, 32, 39, 41, 64, 125, 108, 100, 41, 106, 102, 124, 103, 125, 51, 79, 72, 21, 18, 7, 18, 3, 92, 121, 91, 86, 86, 95, 94, 26, 73, 89, 72, 91, 74, 26, 76, 83, 95, 77, 26, 77, 83, 78, 82, 26, 91, 84, 26, 83, 84, 76, 91, 86, 83, 94, 26, 76, 83, 95, 77, 20, 26, 115, 84, 76, 91, 86, 83, 94, 26, 76, 83, 95, 77, 73, 26, 89, 91, 84, 84, 85, 78, 26, 88, 95, 26, 72, 95, 79, 73, 95, 94, 26, 92, 72, 85, 87, 26, 73, 89, 72, 91, 74, 22, 26, 78, 82, 95, 67, 26, 73, 82, 85, 79, 86, 94, 26, 72, 95, 88, 85, 79, 84, 94, 26, 92, 72, 85, 87, 26, 72, 95, 89, 67, 89, 86, 95, 72, 26, 74, 85, 85, 86, 20, 116, 83, 94, 82, 83, 78, 84, 78, 73, 88, 83, 94, 68, 29, 89, 88, 73, 88, 94, 73, 88, 89, 19, 29, 116, 83, 75, 92, 81, 84, 89, 29, 84, 73, 88, 80, 29, 77, 82, 78, 84, 73, 84, 82, 83, 29, 31, 56, 53, 57, 56, 37, 63, 37, 34, 51, 56, 53, 47, 118, 50, 51, 34, 51, 53, 34, 51, 50, 120, 118, 31, 56, 32, 55, 58, 63, 50, 118, 32, 63, 51, 33, 118, 62, 57, 58, 50, 51, 36, 118, 55, 50, 55, 38, 34, 51, 36, 118, 38, 57, 37, 63, 34, 63, 57, 56, 89, 126, 102, 113, 124, 121, 116, 48, 121, 100, 117, 125, 48, 96, 127, 99, 121, 100, 121, 127, 126, 48, 18, 34, 51, 32, 49, 49, 36, 37, 97, 46, 51, 97, 32, 53, 53, 32, 34, 41, 36, 37, 97, 55, 40, 36, 54, 50, 97, 44, 32, 56, 97, 47, 46, 53, 97, 35, 36, 97, 51, 36, 34, 56, 34, 45, 36, 37, 111, 97, 40, 50, 18, 34, 51, 32, 49, 123, 108, 85, 72, 24, 92, 93, 76, 89, 91, 80, 93, 92, 24, 78, 81, 93, 79, 24, 75, 80, 87, 77, 84, 92, 24, 90, 93, 24, 74, 93, 85, 87, 78, 93, 92, 24, 94, 74, 87, 85, 24, 106, 93, 91, 65, 91, 84, 93, 74, 110, 81, 93, 79, 24, 90, 93, 94, 87, 74, 93, 24, 81, 76, 24, 91, 89, 86, 24, 90, 93, 24, 74, 93, 91, 65, 91, 84, 93, 92, 2, 24, 87, 113, 122, 106, 109, 100, 35, 119, 108, 35, 113, 102, 96, 122, 96, 111, 102, 35, 98, 109, 35, 106, 100, 109, 108, 113, 102, 103, 35, 117, 106, 102, 116, 35, 107, 108, 111, 103, 102, 113, 45, 35, 90, 108, 118, 35, 112, 107, 108, 118, 111, 103, 35, 101, 106, 113, 112, 119, 35, 96, 98, 111, 111, 35, 112, 119, 108, 115, 74, 100, 109, 108, 113, 106, 109, 100, 85, 106, 102, 116, 43, 117, 106, 102, 116, 42, 35, 97, 102, 101, 108, 113, 102, 35, 96, 98, 111, 111, 106, 109, 100, 35, 113, 102, 96, 122, 96, 111, 102, 45, 48, 50, 35, 1, 62, 50, 32, 17, 56, 37, 7, 56, 36, 62, 35, 62, 56, 57, 22, 57, 51, 3, 46, 39, 50, 29, cw.n, 8, 30, 4, 5, 81, 24, 31, 21, 20, 9, 81, 2, 25, 30, 4, 29, 21, 81, 31, 30, 5, 81, 19, 20, 81, 92, 64, 81, cw.n, 23, 5, 20, 3, 81, 4, 31, 25, 24, 21, 24, 31, 22, 81, cw.n, 81, 7, 24, 20, 6, 75, 69, 68, 124, 67, 79, 93, 120, 79, 73, 83, 73, 70, 79, 78};
    }

    static {
        A05();
    }

    public C6A(MG mg) {
        this.A08 = mg;
    }

    private final View A00(int i, boolean z) {
        return A0I(i, z, Long.MAX_VALUE).A0H;
    }

    private final C6K A01(int i) {
        int size;
        int iA04;
        if (this.A02 == null || (size = this.A02.size()) == 0) {
            return null;
        }
        for (int i2 = 0; i2 < size; i2++) {
            C6K c6k = this.A02.get(i2);
            if (!c6k.A0g()) {
                int i3 = c6k.A0I();
                if (i3 == i) {
                    c6k.A0T(32);
                    return c6k;
                }
            }
        }
        if (this.A08.A04.A0A() && (iA04 = this.A08.A00.A04(i)) > 0) {
            int offsetPosition = this.A08.A04.A0C();
            if (iA04 < offsetPosition) {
                long jA04 = this.A08.A04.A04(iA04);
                for (int i4 = 0; i4 < size; i4++) {
                    C6K c6k2 = this.A02.get(i4);
                    if (!c6k2.A0g() && c6k2.A0K() == jA04) {
                        c6k2.A0T(32);
                        return c6k2;
                    }
                }
            }
        }
        return null;
    }

    private final C6K A02(int i, boolean z) {
        View viewA08;
        int size = this.A05.size();
        for (int i2 = 0; i2 < size; i2++) {
            C6K c6k = this.A05.get(i2);
            if (!c6k.A0g()) {
                int scrapCount = c6k.A0I();
                if (scrapCount == i && !c6k.A0Z() && (this.A08.A0s.A09 || !c6k.A0a())) {
                    c6k.A0T(32);
                    return c6k;
                }
            }
        }
        if (!z && (viewA08 = this.A08.A01.A08(i)) != null) {
            C6K c6kA0F = MG.A0F(viewA08);
            this.A08.A01.A0G(viewA08);
            int iA07 = this.A08.A01.A07(viewA08);
            if (iA07 != -1) {
                this.A08.A01.A0C(iA07);
                A0S(viewA08);
                c6kA0F.A0T(8224);
                return c6kA0F;
            }
            throw new IllegalStateException(A04(565, 52, 123) + c6kA0F + this.A08.A1J());
        }
        int size2 = this.A06.size();
        for (int i3 = 0; i3 < size2; i3++) {
            C6K holder = this.A06.get(i3);
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
            if (!holder.A0Z()) {
                int scrapCount3 = holder.A0I();
                if (scrapCount3 == i) {
                    if (!z) {
                        this.A06.remove(i3);
                    }
                    return holder;
                }
            }
        }
        return null;
    }

    private final C6K A03(long j, int i, boolean z) {
        int count = this.A05.size();
        for (int i2 = count - 1; i2 >= 0; i2--) {
            C6K c6k = this.A05.get(i2);
            if (c6k.A0K() == j && !c6k.A0g()) {
                int count2 = c6k.A0H();
                if (i == count2) {
                    c6k.A0T(32);
                    boolean zA0a = c6k.A0a();
                    String[] strArr = A0A;
                    String str = strArr[2];
                    String str2 = strArr[6];
                    int i3 = str.length();
                    int count3 = str2.length();
                    if (i3 == count3) {
                        String[] strArr2 = A0A;
                        strArr2[4] = "3Wf6vMFZ4V6K3VYEAeXlgILB3Kqn8tmj";
                        strArr2[1] = "2gRFj7AUivxslEY3Do0gPT185jjA6g6i";
                        if (zA0a && !this.A08.A0s.A07()) {
                            c6k.A0U(2, 14);
                        }
                        return c6k;
                    }
                } else if (z) {
                    continue;
                } else {
                    this.A05.remove(i2);
                    MG mg = this.A08;
                    View view = c6k.A0H;
                    String[] strArr3 = A0A;
                    String str3 = strArr3[7];
                    String str4 = strArr3[0];
                    int i4 = str3.length();
                    int count4 = str4.length();
                    if (i4 == count4) {
                        String[] strArr4 = A0A;
                        strArr4[5] = "QSy8SYzj9TGZXONlvrRd2Hl7xNggaX2t";
                        strArr4[3] = "FStY7c67BTbAcWAeNWEJdNOuKPlMCdqH";
                        mg.removeDetachedView(view, false);
                        A0R(c6k.A0H);
                    }
                }
                throw new RuntimeException();
            }
        }
        int count5 = this.A06.size();
        for (int i5 = count5 - 1; i5 >= 0; i5--) {
            C6K c6k2 = this.A06.get(i5);
            if (c6k2.A0K() == j) {
                int count6 = c6k2.A0H();
                if (i == count6) {
                    if (!z) {
                        this.A06.remove(i5);
                    }
                    return c6k2;
                }
                if (!z) {
                    A07(i5);
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
        if (MG.A1E) {
            this.A08.A02.A02();
        }
    }

    private final void A07(int i) {
        A0Z(this.A06.get(i), true);
        this.A06.remove(i);
    }

    private void A08(ViewGroup viewGroup, boolean z) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (childAt instanceof ViewGroup) {
                A08((ViewGroup) childAt, true);
            }
        }
        if (!z) {
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

    private void A09(C6K c6k) {
        if (this.A08.A1q()) {
            View view = c6k.A0H;
            if (C4h.A00(view) == 0) {
                C4h.A09(view, 1);
            }
            if (C4h.A0F(view)) {
                return;
            }
            String[] strArr = A0A;
            if (strArr[4].charAt(14) != strArr[1].charAt(14)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "r5izwM6EITTd8J0QgfTuliuK3Ylx6gnH";
            strArr2[3] = "CLm8SGIYJT8sX0J5oMrTiG0qZUHKeksn";
            c6k.A0T(16384);
            C4h.A0B(view, this.A08.A09.A0A());
        }
    }

    private void A0A(C6K c6k) {
        if (c6k.A0H instanceof ViewGroup) {
            A08((ViewGroup) c6k.A0H, false);
        }
    }

    private final void A0B(C6K c6k) {
        if (0 != 0) {
            throw new NullPointerException(A04(617, 14, 32));
        }
        if (this.A08.A0s != null) {
            this.A08.A0t.A0B(c6k);
        }
    }

    private final boolean A0C(C6K c6k) {
        if (c6k.A0a()) {
            return this.A08.A0s.A07();
        }
        if (c6k.A03 >= 0 && c6k.A03 < this.A08.A04.A0C()) {
            if (!this.A08.A0s.A07()) {
                int iA03 = this.A08.A04.A03(c6k.A03);
                int type = c6k.A0H();
                if (iA03 != type) {
                    return false;
                }
            }
            return !this.A08.A04.A0A() || c6k.A0K() == this.A08.A04.A04(c6k.A03);
        }
        throw new IndexOutOfBoundsException(A04(211, 60, 92) + c6k + this.A08.A1J());
    }

    private boolean A0D(C6K c6k, int i, int i2, long j) {
        c6k.A08 = this.A08;
        int iA0H = c6k.A0H();
        long nanoTime = this.A08.getNanoTime();
        if (j != Long.MAX_VALUE && !this.A01.A0A(iA0H, nanoTime, j)) {
            return false;
        }
        this.A08.A04.A09(c6k, i);
        this.A01.A05(c6k.A0H(), this.A08.getNanoTime() - nanoTime);
        A09(c6k);
        if (this.A08.A0s.A07()) {
            c6k.A04 = i2;
            return true;
        }
        return true;
    }

    public final int A0E() {
        return this.A05.size();
    }

    public final View A0F(int i) {
        return this.A05.get(i).A0H;
    }

    public final View A0G(int i) {
        return A00(i, false);
    }

    public final AnonymousClass69 A0H() {
        if (this.A01 == null) {
            this.A01 = new AnonymousClass69();
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
    public final C6K A0I(int i, boolean z, long j) {
        boolean zA0D;
        ViewGroup.LayoutParams layoutParams;
        boolean zCheckLayoutParams;
        String[] strArr;
        AnonymousClass63 anonymousClass63;
        int iA04;
        MG mgA0H;
        if (i >= 0 && i < this.A08.A0s.A03()) {
            boolean z2 = false;
            C6K c6kA05 = null;
            boolean fromScrapOrHiddenOrCache = this.A08.A0s.A07();
            if (fromScrapOrHiddenOrCache) {
                c6kA05 = A01(i);
                z2 = c6kA05 != null;
            }
            if (c6kA05 == null && (c6kA05 = A02(i, z)) != null) {
                boolean fromScrapOrHiddenOrCache2 = A0C(c6kA05);
                if (!fromScrapOrHiddenOrCache2) {
                    if (!z) {
                        String[] strArr2 = A0A;
                        if (strArr2[2].length() == strArr2[6].length()) {
                            String[] strArr3 = A0A;
                            strArr3[7] = "";
                            strArr3[0] = "";
                            c6kA05.A0T(4);
                            boolean fromScrapOrHiddenOrCache3 = c6kA05.A0b();
                            if (fromScrapOrHiddenOrCache3) {
                                this.A08.removeDetachedView(c6kA05.A0H, false);
                                c6kA05.A0S();
                            } else {
                                boolean fromScrapOrHiddenOrCache4 = c6kA05.A0g();
                                if (fromScrapOrHiddenOrCache4) {
                                    c6kA05.A0O();
                                }
                            }
                            A0X(c6kA05);
                        }
                    }
                    c6kA05 = null;
                } else {
                    z2 = true;
                }
                if (c6kA05 == null) {
                    iA04 = this.A08.A00.A04(i);
                    if (iA04 >= 0) {
                    }
                    throw new IndexOutOfBoundsException(A04(165, 46, 55) + i + A04(13, 8, 116) + iA04 + A04(35, 8, 108) + this.A08.A0s.A03() + this.A08.A1J());
                }
                if (z2) {
                    c6kA05.A0U(0, 8192);
                    if (this.A08.A0s.A0C) {
                        int changeFlags = AbstractC04885y.A00(c6kA05);
                        C04875x info = this.A08.A05.A09(this.A08.A0s, c6kA05, changeFlags | 4096, c6kA05.A0L());
                        this.A08.A1k(c6kA05, info);
                    }
                }
                zA0D = false;
                if (!this.A08.A0s.A07()) {
                    if (c6kA05.A0Y()) {
                        zA0D = A0D(c6kA05, this.A08.A00.A04(i), i, j);
                    } else {
                        zA0D = A0D(c6kA05, this.A08.A00.A04(i), i, j);
                    }
                } else if (c6kA05.A0Y()) {
                    zA0D = A0D(c6kA05, this.A08.A00.A04(i), i, j);
                } else {
                    zA0D = A0D(c6kA05, this.A08.A00.A04(i), i, j);
                }
                layoutParams = c6kA05.A0H.getLayoutParams();
                if (layoutParams == null) {
                    anonymousClass63 = (AnonymousClass63) this.A08.generateDefaultLayoutParams();
                    c6kA05.A0H.setLayoutParams(anonymousClass63);
                } else {
                    zCheckLayoutParams = this.A08.checkLayoutParams(layoutParams);
                    strArr = A0A;
                    if (strArr[5].charAt(9) != strArr[3].charAt(9)) {
                        String[] strArr4 = A0A;
                        strArr4[2] = "zCboBEvvN0uPYmtuolLcQSfyvv";
                        strArr4[6] = "oQlbeeNPYINxaBCA8kGLswkn0x";
                        if (!zCheckLayoutParams) {
                            anonymousClass63 = (AnonymousClass63) this.A08.generateLayoutParams(layoutParams);
                            c6kA05.A0H.setLayoutParams(anonymousClass63);
                        } else {
                            anonymousClass63 = (AnonymousClass63) layoutParams;
                        }
                    } else {
                        String[] strArr5 = A0A;
                        strArr5[7] = "";
                        strArr5[0] = "";
                        if (!zCheckLayoutParams) {
                            anonymousClass63 = (AnonymousClass63) this.A08.generateLayoutParams(layoutParams);
                            c6kA05.A0H.setLayoutParams(anonymousClass63);
                        } else {
                            anonymousClass63 = (AnonymousClass63) layoutParams;
                        }
                    }
                }
                anonymousClass63.A00 = c6kA05;
                anonymousClass63.A02 = !z2 && zA0D;
                return c6kA05;
            }
            if (c6kA05 == null) {
                iA04 = this.A08.A00.A04(i);
                if (iA04 >= 0 || iA04 >= this.A08.A04.A0C()) {
                    throw new IndexOutOfBoundsException(A04(165, 46, 55) + i + A04(13, 8, 116) + iA04 + A04(35, 8, 108) + this.A08.A0s.A03() + this.A08.A1J());
                }
                int offsetPosition = this.A08.A04.A03(iA04);
                boolean fromScrapOrHiddenOrCache5 = this.A08.A04.A0A();
                if (fromScrapOrHiddenOrCache5 && (c6kA05 = A03(this.A08.A04.A04(iA04), offsetPosition, z)) != null) {
                    c6kA05.A03 = iA04;
                    z2 = true;
                }
                if (c6kA05 == null && 0 != 0) {
                    throw new NullPointerException(A04(540, 25, 93));
                }
                if (c6kA05 == null && (c6kA05 = A0H().A03(offsetPosition)) != null) {
                    c6kA05.A0Q();
                    boolean fromScrapOrHiddenOrCache6 = MG.A1C;
                    if (fromScrapOrHiddenOrCache6) {
                        A0A(c6kA05);
                    }
                }
                if (c6kA05 == null) {
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
                        c6kA05 = this.A08.A04.A05(this.A08, offsetPosition);
                        boolean fromScrapOrHiddenOrCache8 = MG.A1E;
                        if (fromScrapOrHiddenOrCache8 && (mgA0H = MG.A0H(c6kA05.A0H)) != null) {
                            c6kA05.A09 = new WeakReference<>(mgA0H);
                        }
                        this.A01.A06(offsetPosition, this.A08.getNanoTime() - nanoTime);
                    }
                }
            }
            if (z2 && !this.A08.A0s.A07() && c6kA05.A0i(8192)) {
                c6kA05.A0U(0, 8192);
                if (this.A08.A0s.A0C) {
                    int changeFlags2 = AbstractC04885y.A00(c6kA05);
                    C04875x info2 = this.A08.A05.A09(this.A08.A0s, c6kA05, changeFlags2 | 4096, c6kA05.A0L());
                    this.A08.A1k(c6kA05, info2);
                }
            }
            zA0D = false;
            if (!this.A08.A0s.A07() && c6kA05.A0Y()) {
                c6kA05.A04 = i;
            } else if (c6kA05.A0Y() || c6kA05.A0e() || c6kA05.A0Z()) {
                zA0D = A0D(c6kA05, this.A08.A00.A04(i), i, j);
            }
            layoutParams = c6kA05.A0H.getLayoutParams();
            if (layoutParams == null) {
                anonymousClass63 = (AnonymousClass63) this.A08.generateDefaultLayoutParams();
                c6kA05.A0H.setLayoutParams(anonymousClass63);
            } else {
                zCheckLayoutParams = this.A08.checkLayoutParams(layoutParams);
                strArr = A0A;
                if (strArr[5].charAt(9) != strArr[3].charAt(9)) {
                    String[] strArr8 = A0A;
                    strArr8[2] = "zCboBEvvN0uPYmtuolLcQSfyvv";
                    strArr8[6] = "oQlbeeNPYINxaBCA8kGLswkn0x";
                    if (!zCheckLayoutParams) {
                        anonymousClass63 = (AnonymousClass63) this.A08.generateLayoutParams(layoutParams);
                        c6kA05.A0H.setLayoutParams(anonymousClass63);
                    } else {
                        anonymousClass63 = (AnonymousClass63) layoutParams;
                    }
                } else {
                    String[] strArr9 = A0A;
                    strArr9[7] = "";
                    strArr9[0] = "";
                    if (!zCheckLayoutParams) {
                        anonymousClass63 = (AnonymousClass63) this.A08.generateLayoutParams(layoutParams);
                        c6kA05.A0H.setLayoutParams(anonymousClass63);
                    } else {
                        anonymousClass63 = (AnonymousClass63) layoutParams;
                    }
                }
            }
            anonymousClass63.A00 = c6kA05;
            anonymousClass63.A02 = !z2 && zA0D;
            return c6kA05;
            throw new RuntimeException();
        }
        throw new IndexOutOfBoundsException(A04(271, 22, 26) + i + A04(12, 1, 26) + i + A04(21, 14, 3) + this.A08.A0s.A03() + this.A08.A1J());
    }

    public final List<C6K> A0J() {
        return this.A07;
    }

    public final void A0K() {
        int size = this.A06.size();
        for (int i = 0; i < size; i++) {
            this.A06.get(i).A0M();
        }
        int i2 = this.A05.size();
        for (int scrapCount = 0; scrapCount < i2; scrapCount++) {
            this.A05.get(scrapCount).A0M();
        }
        if (this.A02 != null) {
            int changedScrapCount = this.A02.size();
            for (int scrapCount2 = 0; scrapCount2 < changedScrapCount; scrapCount2++) {
                this.A02.get(scrapCount2).A0M();
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
        for (int i = 0; i < size; i++) {
            AnonymousClass63 anonymousClass63 = (AnonymousClass63) this.A06.get(i).A0H.getLayoutParams();
            if (anonymousClass63 != null) {
                anonymousClass63.A01 = true;
            }
        }
    }

    public final void A0N() {
        if (this.A08.A04 != null && this.A08.A04.A0A()) {
            int size = this.A06.size();
            for (int i = 0; i < size; i++) {
                C6K c6k = this.A06.get(i);
                if (c6k != null) {
                    c6k.A0T(6);
                    c6k.A0W(null);
                }
            }
            return;
        }
        A06();
    }

    public final void A0O() {
        int i = this.A08.A06 != null ? this.A08.A06.A00 : 0;
        int extraCache = this.A03;
        this.A00 = extraCache + i;
        int extraCache2 = this.A06.size();
        for (int i2 = extraCache2 - 1; i2 >= 0; i2--) {
            int size = this.A06.size();
            int i3 = this.A00;
            String[] strArr = A0A;
            String str = strArr[5];
            String str2 = strArr[3];
            int i4 = str.charAt(9);
            int extraCache3 = str2.charAt(9);
            if (i4 != extraCache3) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "FM5srU9o6TBj8QlSYYqmaX9MZyJMPTMr";
            strArr2[3] = "mnADOFh1HT7Eu0tfTP5EsiAEmob0QgOc";
            if (size > i3) {
                A07(i2);
            } else {
                return;
            }
        }
    }

    public final void A0P() {
        this.A05.clear();
        A06();
    }

    public final void A0Q(int i) {
        this.A03 = i;
        A0O();
    }

    public final void A0R(View view) {
        C6K c6kA0F = MG.A0F(view);
        c6kA0F.A0F = null;
        c6kA0F.A0G = false;
        c6kA0F.A0O();
        A0X(c6kA0F);
    }

    public final void A0S(View view) {
        C6K c6kA0F = MG.A0F(view);
        if (c6kA0F.A0i(12) || !c6kA0F.A0d() || this.A08.A1y(c6kA0F)) {
            if (!c6kA0F.A0Z() || c6kA0F.A0a() || this.A08.A04.A0A()) {
                c6kA0F.A0V(this, false);
                this.A05.add(c6kA0F);
                return;
            }
            throw new IllegalArgumentException(A04(43, 122, 48) + this.A08.A1J());
        }
        if (this.A02 == null) {
            this.A02 = new ArrayList<>();
        }
        c6kA0F.A0V(this, true);
        this.A02.add(c6kA0F);
    }

    public final void A0T(View view) {
        C6K c6kA0F = MG.A0F(view);
        if (c6kA0F.A0c()) {
            this.A08.removeDetachedView(view, false);
        }
        if (c6kA0F.A0b()) {
            c6kA0F.A0S();
        } else if (c6kA0F.A0g()) {
            c6kA0F.A0O();
        }
        A0X(c6kA0F);
    }

    public final void A0U(AbstractC04805q abstractC04805q, AbstractC04805q abstractC04805q2, boolean z) {
        A0P();
        A0H().A08(abstractC04805q, abstractC04805q2, z);
    }

    public final void A0V(AnonymousClass69 anonymousClass69) {
        if (this.A01 != null) {
            this.A01.A04();
        }
        this.A01 = anonymousClass69;
        if (anonymousClass69 != null) {
            AnonymousClass69 anonymousClass610 = this.A01;
            AbstractC04805q adapter = this.A08.getAdapter();
            String[] strArr = A0A;
            if (strArr[2].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "lsZK0accpgBQgJYjkQv5Abfcayw6pcR0";
            strArr2[1] = "Z7g3Rn3k4gV3vNYe90sCMa52PcoBzFf1";
            anonymousClass610.A07(adapter);
        }
    }

    public final void A0W(C6I c6i) {
        this.A04 = c6i;
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
    public final void A0X(C6K c6k) {
        boolean transientStatePreventsRecycling;
        boolean transientStatePreventsRecycling2;
        int size;
        String[] strArr;
        boolean transientStatePreventsRecycling3;
        boolean transientStatePreventsRecycling4;
        int i;
        boolean transientStatePreventsRecycling5;
        if (c6k.A0b() || c6k.A0H.getParent() != null) {
            throw new IllegalArgumentException(A04(293, 56, 75) + c6k.A0b() + A04(0, 12, 91) + (c6k.A0H.getParent() != null) + this.A08.A1J());
        }
        boolean zA0c = c6k.A0c();
        String[] strArr2 = A0A;
        if (strArr2[4].charAt(14) == strArr2[1].charAt(14)) {
            String[] strArr3 = A0A;
            strArr3[2] = "XmVzY8sdohxIZJ5Ojk7HGi6GVO";
            strArr3[6] = "m3xjIJQIi7Ro4dRZ8OgPCgQ0SJ";
            if (!zA0c) {
                if (c6k.A0f()) {
                    throw new IllegalArgumentException(A04(430, 110, 9) + this.A08.A1J());
                }
                boolean zA09 = c6k.A09();
                if (this.A08.A04 != null && zA09) {
                    boolean transientStatePreventsRecycling6 = this.A08.A04.A0B(c6k);
                    if (transientStatePreventsRecycling6) {
                        transientStatePreventsRecycling = true;
                    } else {
                        transientStatePreventsRecycling = false;
                    }
                } else {
                    transientStatePreventsRecycling = false;
                }
                int targetCacheIndex = 0;
                boolean z = false;
                if (transientStatePreventsRecycling) {
                    if (this.A00 > 0) {
                        transientStatePreventsRecycling2 = c6k.A0i(526);
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
                                transientStatePreventsRecycling3 = MG.A1E;
                                if (transientStatePreventsRecycling3) {
                                    transientStatePreventsRecycling4 = this.A08.A02.A05(c6k.A03);
                                    if (!transientStatePreventsRecycling4) {
                                        i = size - 1;
                                        while (i >= 0) {
                                            transientStatePreventsRecycling5 = this.A08.A02.A05(this.A06.get(i).A03);
                                            if (!transientStatePreventsRecycling5) {
                                                break;
                                                break;
                                            }
                                            i--;
                                        }
                                        size = i + 1;
                                    }
                                }
                                this.A06.add(size, c6k);
                                targetCacheIndex = 1;
                            }
                        }
                    }
                    if (targetCacheIndex == 0) {
                        A0Z(c6k, true);
                        z = true;
                    }
                } else {
                    boolean transientStatePreventsRecycling7 = c6k.A0h();
                    if (transientStatePreventsRecycling7) {
                        if (this.A00 > 0) {
                            transientStatePreventsRecycling2 = c6k.A0i(526);
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
                                    transientStatePreventsRecycling3 = MG.A1E;
                                    if (transientStatePreventsRecycling3 && size > 0) {
                                        transientStatePreventsRecycling4 = this.A08.A02.A05(c6k.A03);
                                        if (!transientStatePreventsRecycling4) {
                                            i = size - 1;
                                            while (i >= 0) {
                                                transientStatePreventsRecycling5 = this.A08.A02.A05(this.A06.get(i).A03);
                                                if (!transientStatePreventsRecycling5) {
                                                    break;
                                                } else {
                                                    i--;
                                                }
                                            }
                                            size = i + 1;
                                        }
                                    }
                                    this.A06.add(size, c6k);
                                    targetCacheIndex = 1;
                                }
                            }
                        }
                        if (targetCacheIndex == 0) {
                            A0Z(c6k, true);
                            z = true;
                        }
                    }
                }
                this.A08.A0t.A0B(c6k);
                if (targetCacheIndex == 0 && !z && zA09) {
                    c6k.A08 = null;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException(A04(349, 81, 50) + c6k + this.A08.A1J());
        }
        throw new RuntimeException();
    }

    public final void A0Y(C6K c6k) {
        if (c6k.A0G) {
            ArrayList<C6K> arrayList = this.A02;
            String[] strArr = A0A;
            if (strArr[7].length() != strArr[0].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[2] = "g9dUUHlnr2dNWy2bvXbXpUnxFV";
            strArr2[6] = "1VljHDZyW4yQ7QRXruVc6WBcEp";
            arrayList.remove(c6k);
        } else {
            this.A05.remove(c6k);
        }
        c6k.A0F = null;
        c6k.A0G = false;
        c6k.A0O();
    }

    public final void A0Z(C6K c6k, boolean z) {
        MG.A0s(c6k);
        if (c6k.A0i(16384)) {
            c6k.A0U(0, 16384);
            C4h.A0B(c6k.A0H, null);
        }
        if (z) {
            A0B(c6k);
        }
        c6k.A08 = null;
        A0H().A09(c6k);
    }
}
