package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.Pair;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.utils.compression.lzma.Base;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.umeng.analytics.pro.cw;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.EnumC4719u30;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.5u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class C04845u extends QB {
    public static byte[] A07;
    public static String[] A08 = {"LqCbrqKoogw4i3AokI7uysxMQ3EVQNeY", "cxpYrz", "yb1MlFRAgeb8dvVXgrQxSmTINcARtRK8", "CtUAao", "3kcgNrOCoR8dMQop68Il0eATRp", "2NIzo0pmq9", "lnTLj1nIBGHe6Pp48Pww51J4zPtRdqks", "Ql60CxMfJIyc4wcRspoWZ9exltfD1Wyk"};
    public static final AbstractC2041nY<Integer> A09;
    public static final AbstractC2041nY<Integer> A0A;
    public C1209Zm A00;
    public C04855v A01;
    public C1401cz A02;
    public final Context A03;
    public final InterfaceC1408d6 A04;
    public final Object A05;
    public final boolean A06;

    /* JADX WARN: Code duplicated, block: B:42:0x00e8 A[LOOP:0: B:3:0x000c->B:42:0x00e8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:57:0x00f1 A[SYNTHETIC] */
    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization("D25277746")
    private <T extends AbstractC1403d1<T>> Pair<C1407d5, Integer> A0A(int i, C1410d8 c1410d8, int[][][] iArr, InterfaceC1402d0<T> interfaceC1402d0, Comparator<List<T>> comparator) {
        String[] strArr;
        List arrayList;
        ArrayList arrayList2 = new ArrayList();
        int iA02 = c1410d8.A02();
        int i2 = 0;
        while (i2 < iA02) {
            if (i == c1410d8.A03(i2)) {
                C0992Qs c0992QsA07 = c1410d8.A07(i2);
                for (int i3 = 0; i3 < c0992QsA07.A01; i3++) {
                    C1175Yc c1175YcA05 = c0992QsA07.A05(i3);
                    List<T> listA55 = interfaceC1402d0.A55(i2, c1175YcA05, iArr[i2][i3]);
                    boolean[] zArr = new boolean[c1175YcA05.A01];
                    ArrayList arrayList3 = new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    for (int i4 = 0; i4 < c1175YcA05.A01; i4++) {
                        T t = listA55.get(i4);
                        int iA08 = t.A08();
                        if (!zArr[i4] && iA08 != 0) {
                            if (iA08 == 1) {
                                arrayList = OI.A04(t);
                                arrayList3.add(t);
                                String[] strArr2 = A08;
                                if (strArr2[7].charAt(4) != strArr2[6].charAt(4)) {
                                    String[] strArr3 = A08;
                                    strArr3[4] = "i67v2jm9nRiAqBavKyP9IpkRU6";
                                    strArr3[5] = "aFISvYAoif";
                                }
                            } else {
                                arrayList = new ArrayList();
                                arrayList.add(t);
                                for (int i5 = i4 + 1; i5 < c1175YcA05.A01; i5++) {
                                    T t2 = listA55.get(i5);
                                    if (t2.A08() == 2 && t.A09(t2)) {
                                        arrayList.add(t2);
                                        zArr[i5] = true;
                                    }
                                }
                            }
                            arrayList4.add(arrayList);
                        }
                    }
                    if (this.A01.A0A && !arrayList3.isEmpty() && arrayList3.size() == c1175YcA05.A01) {
                        arrayList4.clear();
                        arrayList4.add(arrayList3);
                    }
                    arrayList2.addAll(arrayList4);
                }
                i2++;
                strArr = A08;
                if (strArr[7].charAt(4) != strArr[6].charAt(4)) {
                    A08[0] = "FdGVIgFFkOgRgnAqOymurWih4o8qim2Z";
                }
            } else {
                i2++;
                strArr = A08;
                if (strArr[7].charAt(4) != strArr[6].charAt(4)) {
                    A08[0] = "FdGVIgFFkOgRgnAqOymurWih4o8qim2Z";
                }
            }
            throw new RuntimeException();
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList2, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i6 = 0; i6 < list.size(); i6++) {
            iArr2[i6] = ((AbstractC1403d1) list.get(i6)).A01;
        }
        AbstractC1403d1 abstractC1403d1 = (AbstractC1403d1) list.get(0);
        return Pair.create(new C1407d5(abstractC1403d1.A03, iArr2), Integer.valueOf(abstractC1403d1.A00));
    }

    public static String A0J(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i2);
        for (int i4 = 0; i4 < bArrCopyOfRange.length; i4++) {
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] - i3) - 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0M() {
        A07 = new byte[]{-103, -80, -28, -45, -40, -34, -113, -46, -41, -48, -35, -35, -44, -37, -113, -46, -34, -28, -35, -29, -113, -46, -34, -35, -30, -29, -31, -48, -40, -35, -29, -30, -113, -46, -48, -35, -35, -34, -29, -113, -47, -44, -113, -48, -33, -33, -37, -40, -44, -45, -113, -26, -40, -29, -41, -34, -28, -29, -113, -31, -44, -43, -44, -31, -44, -35, -46, -44, -113, -29, -34, -113, -78, -34, -35, -29, -44, -25, -29, -99, -113, -79, -28, -40, -37, -45, -113, -29, -41, -44, -113, -29, -31, -48, -46, -38, -113, -30, -44, -37, -44, -46, -29, -34, -31, -113, -40, -35, -30, -29, -48, -35, -46, -44, -113, -26, -40, -29, -41, -113, -34, -35, -44, -113, -34, -43, -113, -29, -41, -44, -113, -35, -34, -35, -100, -45, -44, -33, -31, -44, -46, -48, -29, -44, -45, -113, -46, -34, -35, -30, -29, -31, -28, -46, -29, -34, -31, -30, -113, -29, -41, -48, -29, -113, -29, -48, -38, -44, -113, -48, -113, -78, -34, -35, -29, -44, -25, -29, -113, -48, -31, -42, -28, -36, -44, -35, -29, -99, -4, 29, 30, 25, 45, 36, 44, 12, 42, 25, 27, 35, 11, 29, 36, 29, 27, 44, 39, 42, 8, 28, 11, cw.n, 22, -42, 8, 10, -38, cw.m, 35, 18, 23, 29, -35, cw.m, 17, -30, -23, -3, -20, -15, -9, -73, -19, -23, -21, -69, 36, 56, 39, 44, 50, -14, 40, 36, 38, -10, -16, 45, 50, 38, 41, 34, 24, 42, 29, 24, 25, 35, -29, 21, 42, -28, -27, 1, -12, -17, -16, -6, -70, -20, 1, -18, -13, -26, -31, -30, -20, -84, -31, -20, -23, -33, -10, -86, -13, -26, -16, -26, -20, -21, -29, -42, -47, -46, -36, -100, -43, -46, -29, -48, 30, 17, 12, cw.k, 23, -41, 32, -43, 30, 22, 12, -42, 23, 22, -38, -42, 30, 24, -31};
    }

    static {
        A0M();
        A09 = AbstractC2041nY.A04(new Comparator() { // from class: com.facebook.ads.redexgen.X.cq
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C04845u.A05((Integer) obj, (Integer) obj2);
            }
        });
        A0A = AbstractC2041nY.A04(new Comparator() { // from class: com.facebook.ads.redexgen.X.cr
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C04845u.A06((Integer) obj, (Integer) obj2);
            }
        });
    }

    @Deprecated
    public C04845u() {
        this(C04855v.A0J, new QX());
    }

    @Deprecated
    public C04845u(YN yn, InterfaceC1408d6 interfaceC1408d6) {
        this(yn, interfaceC1408d6, null);
    }

    public C04845u(YN yn, InterfaceC1408d6 interfaceC1408d6, Context context) {
        this.A05 = new Object();
        this.A03 = context != null ? context.getApplicationContext() : null;
        this.A04 = interfaceC1408d6;
        if (yn instanceof C04855v) {
            this.A01 = (C04855v) yn;
        } else {
            C04855v defaultParameters = context == null ? C04855v.A0J : C04855v.A02(context);
            this.A01 = defaultParameters.A0P().A0z(yn).A0u();
        }
        this.A00 = C1209Zm.A07;
        this.A06 = context != null && AbstractC1600gE.A18(context);
        if (!this.A06 && context != null && AbstractC1600gE.A02 >= 32) {
            this.A02 = C1401cz.A00(context);
        }
        if (this.A01.A08 && context == null) {
            AbstractC1561fb.A07(A0J(Input.Keys.F18, 20, 85), A0J(1, Input.Keys.F17, 12));
        }
    }

    @MetaExoPlayerCustomization(type = {"NEW_CONSTRUCTOR"}, value = "Backward Compatible Constructor")
    public C04845u(InterfaceC1408d6 interfaceC1408d6) {
        this(C04855v.A0J, interfaceC1408d6);
    }

    public static int A00(int i, int i2) {
        if (i != 0 && i == i2) {
            return Integer.MAX_VALUE;
        }
        return Integer.bitCount(i & i2);
    }

    public static int A02(ZM zm, String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            boolean zEquals = str.equals(zm.A0V);
            if (A08[0].charAt(4) == 'F') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[4] = "cACIJk9XtnNN8EmdsDI9RcJvFx";
            strArr[5] = "MXLaNkQDni";
            if (zEquals) {
                return 4;
            }
        }
        String strA0K = A0K(str);
        String strA0K2 = A0K(zm.A0V);
        if (strA0K2 == null || strA0K == null) {
            return (z && strA0K2 == null) ? 1 : 0;
        }
        if (strA0K2.startsWith(strA0K) || strA0K.startsWith(strA0K2)) {
            return 3;
        }
        String strA0J = A0J(0, 1, 9);
        String str2 = AbstractC1600gE.A1P(strA0K2, strA0J)[0];
        String formatLanguage = AbstractC1600gE.A1P(strA0K, strA0J)[0];
        if (!str2.equals(formatLanguage)) {
            return 0;
        }
        return 2;
    }

    public static int A03(C1175Yc c1175Yc, int i, int i2, boolean z) {
        if (i == Integer.MAX_VALUE || i2 == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        int videoPixels = Integer.MAX_VALUE;
        if (A08[0].charAt(4) == 'F') {
            throw new RuntimeException();
        }
        A08[2] = "a6yG4ogbJdpmjRTtpErm7dJcs9AkgJV4";
        for (int maxVideoPixelsToRetain = 0; maxVideoPixelsToRetain < i; maxVideoPixelsToRetain++) {
            ZM zmA08 = c1175Yc.A08(maxVideoPixelsToRetain);
            int i3 = zmA08.A0L;
            if (i3 > 0) {
                int i4 = zmA08.A0A;
                if (i4 > 0) {
                    int i5 = zmA08.A0L;
                    int i6 = zmA08.A0A;
                    Point pointA09 = A09(z, i, i2, i5, i6);
                    int i7 = zmA08.A0L;
                    int i8 = zmA08.A0A;
                    int i9 = i7 * i8;
                    int i10 = zmA08.A0L;
                    int i11 = pointA09.x;
                    if (i10 >= ((int) (i11 * 0.98f))) {
                        int i12 = zmA08.A0A;
                        int i13 = pointA09.y;
                        if (i12 >= ((int) (i13 * 0.98f)) && i9 < videoPixels) {
                            videoPixels = i9;
                        }
                    }
                }
            }
        }
        return videoPixels;
    }

    public static /* synthetic */ int A05(Integer num, Integer num2) {
        if (num.intValue() == -1) {
            int iIntValue = num2.intValue();
            if (A08[2].charAt(13) == 'V') {
                throw new RuntimeException();
            }
            String[] strArr = A08;
            strArr[7] = "9BoauBJAamPhbZfD5PQKIOVoPAVoFQLK";
            strArr[6] = "71lGvsq7LM2qoHaQgXlyvEPyZxsgeUCX";
            return iIntValue == -1 ? 0 : -1;
        }
        if (num2.intValue() == -1) {
            return 1;
        }
        return num.intValue() - num2.intValue();
    }

    public static /* synthetic */ int A06(Integer num, Integer num2) {
        return 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x000f  */
    public static int A07(String str) {
        byte b;
        if (str == null) {
            return 0;
        }
        switch (str.hashCode()) {
            case -1851077871:
                if (!str.equals(A0J(Base.kNumLenSymbols, 18, 26))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case -1662735862:
                if (!str.equals(A0J(253, 10, 81))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            case -1662541442:
                if (!str.equals(A0J(290, 10, 10))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 1331836730:
                if (!str.equals(A0J(263, 9, 40))) {
                    b = -1;
                } else {
                    b = 4;
                }
                break;
            case 1599127257:
                if (!str.equals(A0J(300, 19, 69))) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return 5;
            case 1:
                return 4;
            case 2:
                return 3;
            case 3:
                return 2;
            case 4:
                return 1;
            default:
                return 0;
        }
    }

    @MetaExoPlayerCustomization("Made public in D13395849")
    public static Point A09(boolean z, int tempViewportWidth, int i, int i2, int i3) {
        if (z) {
            String[] strArr = A08;
            if (strArr[7].charAt(4) == strArr[6].charAt(4)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A08;
            strArr2[7] = "DT8M2fi89IXVa33ZEQKhbLKGxyMm1aFc";
            strArr2[6] = "KEDCP8jM4ZStajC7x5EL5SpfXtIbJpQU";
            if ((i2 > i3) != (tempViewportWidth > i)) {
                tempViewportWidth = i;
                i = tempViewportWidth;
            }
        }
        if (i2 * i >= i3 * tempViewportWidth) {
            return new Point(tempViewportWidth, AbstractC1600gE.A05(tempViewportWidth * i3, i2));
        }
        return new Point(AbstractC1600gE.A05(i * i2, i3), i);
    }

    private final Pair<C1407d5, Integer> A0B(C1410d8 c1410d8, int[][][] iArr, final C04855v c04855v, final String str) throws EK {
        return A0A(3, c1410d8, iArr, new InterfaceC1402d0() { // from class: com.facebook.ads.redexgen.X.QO
            @Override // com.facebook.ads.redexgen.core.InterfaceC1402d0
            public final List A55(int i, C1175Yc c1175Yc, int[] iArr2) {
                return QG.A02(i, c1175Yc, c04855v, iArr2, str);
            }
        }, new Comparator() { // from class: com.facebook.ads.redexgen.X.cu
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return QG.A01((List) obj, (List) obj2);
            }
        });
    }

    private final Pair<C1407d5, Integer> A0C(C1410d8 c1410d8, int[][][] iArr, int[] iArr2, final C04855v c04855v) throws EK {
        final boolean z = false;
        for (int i = 0; i < c1410d8.A02(); i++) {
            if (2 == c1410d8.A03(i)) {
                C0992Qs c0992QsA07 = c1410d8.A07(i);
                int i2 = A08[0].charAt(4);
                if (i2 == 70) {
                    throw new RuntimeException();
                }
                A08[2] = "Ji9lSHI5BRdJBJwuY79E2hBRxefYQ1Xw";
                if (c0992QsA07.A01 > 0) {
                    z = true;
                    break;
                }
            }
        }
        return A0A(1, c1410d8, iArr, new InterfaceC1402d0() { // from class: com.facebook.ads.redexgen.X.QP
            @Override // com.facebook.ads.redexgen.core.InterfaceC1402d0
            public final List A55(int i3, C1175Yc c1175Yc, int[] iArr3) {
                return this.A01.A0e(c04855v, z, i3, c1175Yc, iArr3);
            }
        }, new Comparator() { // from class: com.facebook.ads.redexgen.X.ct
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return QN.A02((List) obj, (List) obj2);
            }
        });
    }

    private final Pair<C1407d5, Integer> A0D(C1410d8 c1410d8, int[][][] iArr, final int[] iArr2, final C04855v c04855v, final String str) throws EK {
        return A0A(2, c1410d8, iArr, new InterfaceC1402d0() { // from class: com.facebook.ads.redexgen.X.QU
            @Override // com.facebook.ads.redexgen.core.InterfaceC1402d0
            public final List A55(int i, C1175Yc c1175Yc, int[] iArr3) {
                return QF.A06(i, c1175Yc, c04855v, iArr3, str, iArr2[i]);
            }
        }, new Comparator() { // from class: com.facebook.ads.redexgen.X.cs
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return QF.A05((List) obj, (List) obj2);
            }
        });
    }

    private final C1407d5 A0E(int i, C0992Qs c0992Qs, int[][] iArr, C04855v c04855v) throws EK {
        C1175Yc c1175Yc = null;
        int i2 = 0;
        C1398cw c1398cw = null;
        for (int trackIndex = 0; trackIndex < c0992Qs.A01; trackIndex++) {
            C1175Yc trackGroup = c0992Qs.A05(trackIndex);
            int[] iArr2 = iArr[trackIndex];
            for (int groupIndex = 0; groupIndex < trackGroup.A01; groupIndex++) {
                int selectedTrackIndex = iArr2[groupIndex];
                if (A0S(selectedTrackIndex, c04855v.A0B)) {
                    C1398cw c1398cw2 = new C1398cw(trackGroup.A08(groupIndex), iArr2[groupIndex]);
                    if (c1398cw == null || c1398cw2.compareTo(c1398cw) > 0) {
                        c1175Yc = trackGroup;
                        i2 = groupIndex;
                        c1398cw = c1398cw2;
                    }
                }
            }
        }
        if (c1175Yc == null) {
            return null;
        }
        return new C1407d5(c1175Yc, i2);
    }

    public static String A0K(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, A0J(ItemTouchHelper.Callback.DEFAULT_SWIPE_ANIMATION_DURATION, 3, 81))) {
            return null;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0L() {
        boolean z;
        synchronized (this.A05) {
            z = this.A01.A08 && !this.A06 && AbstractC1600gE.A02 >= 32 && this.A02 != null && this.A02.A06();
        }
        if (z) {
            A01();
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0066  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a A[SYNTHETIC] */
    public static void A0N(C0992Qs c0992Qs, YN yn, Map<Integer, YW> map) {
        int iA01;
        int iCharAt;
        int trackGroupIndex;
        for (int i = 0; i < trackGroupIndex; i++) {
            C1175Yc trackGroup = c0992Qs.A05(i);
            YW existingOverride = yn.A0G.get(trackGroup);
            if (existingOverride != null) {
                int trackGroupIndex2 = existingOverride.A01();
                YW yw = map.get(Integer.valueOf(trackGroupIndex2));
                if (yw != null) {
                    if (yw.A01.isEmpty()) {
                        boolean zIsEmpty = existingOverride.A01.isEmpty();
                        String[] strArr = A08;
                        String str = strArr[4];
                        String str2 = strArr[5];
                        int length = str.length();
                        int trackGroupIndex3 = str2.length();
                        if (length == trackGroupIndex3) {
                            throw new RuntimeException();
                        }
                        A08[2] = "6DZxblripWrmJUjQw4n6mkRMGsh5iKOd";
                        if (zIsEmpty) {
                            continue;
                        } else {
                            iA01 = existingOverride.A01();
                            String[] strArr2 = A08;
                            String str3 = strArr2[7];
                            String str4 = strArr2[6];
                            iCharAt = str3.charAt(4);
                            trackGroupIndex = str4.charAt(4);
                            if (iCharAt != trackGroupIndex) {
                                throw new RuntimeException();
                            }
                            String[] strArr3 = A08;
                            strArr3[7] = "ySdGkUfuHk5jcZM4NruCqvalemA2UQEM";
                            strArr3[6] = "wVMYBaidRq4djSlWUtUc0Encd7j3K960";
                            map.put(Integer.valueOf(iA01), existingOverride);
                        }
                    } else {
                        continue;
                    }
                } else {
                    iA01 = existingOverride.A01();
                    String[] strArr4 = A08;
                    String str5 = strArr4[7];
                    String str6 = strArr4[6];
                    iCharAt = str5.charAt(4);
                    trackGroupIndex = str6.charAt(4);
                    if (iCharAt != trackGroupIndex) {
                        throw new RuntimeException();
                    }
                    String[] strArr5 = A08;
                    strArr5[7] = "ySdGkUfuHk5jcZM4NruCqvalemA2UQEM";
                    strArr5[6] = "wVMYBaidRq4djSlWUtUc0Encd7j3K960";
                    map.put(Integer.valueOf(iA01), existingOverride);
                }
            }
        }
    }

    public static void A0P(C1410d8 c1410d8, YN yn, C1407d5[] c1407d5Arr) {
        C1407d5 c1407d5;
        int iA02 = c1410d8.A02();
        HashMap map = new HashMap();
        for (int i = 0; i < iA02; i++) {
            A0N(c1410d8.A07(i), yn, map);
            String[] strArr = A08;
            String str = strArr[1];
            String str2 = strArr[3];
            int length = str.length();
            int rendererCount = str2.length();
            if (length != rendererCount) {
                throw new RuntimeException();
            }
            A08[2] = "Leiid58a93QHovECy288fljWPyzFzBDB";
        }
        A0N(c1410d8.A06(), yn, map);
        for (int i2 = 0; i2 < iA02; i2++) {
            int rendererCount2 = c1410d8.A03(i2);
            YW yw = (YW) map.get(Integer.valueOf(rendererCount2));
            if (yw != null) {
                if (!yw.A01.isEmpty() && c1410d8.A07(i2).A04(yw.A00) != -1) {
                    c1407d5 = new C1407d5(yw.A00, AbstractC0914Nn.A0C(yw.A01));
                } else {
                    c1407d5 = null;
                }
                c1407d5Arr[i2] = c1407d5;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    public static void A0Q(C1410d8 c1410d8, C04855v c04855v, C1407d5[] c1407d5Arr) {
        C1407d5 c1407d5;
        int iA02 = c1410d8.A02();
        for (int i = 0; i < iA02; i++) {
            C0992Qs trackGroups = c1410d8.A07(i);
            if (c04855v.A0S(i, trackGroups)) {
                QH qhA0Q = c04855v.A0Q(i, trackGroups);
                if (qhA0Q != null) {
                    int rendererCount = qhA0Q.A03.length;
                    if (rendererCount != 0) {
                        int rendererCount2 = qhA0Q.A00;
                        C1175Yc c1175YcA05 = trackGroups.A05(rendererCount2);
                        int[] iArr = qhA0Q.A03;
                        int rendererIndex = qhA0Q.A02;
                        c1407d5 = new C1407d5(c1175YcA05, iArr, rendererIndex);
                    } else {
                        c1407d5 = null;
                    }
                } else {
                    c1407d5 = null;
                }
                c1407d5Arr[i] = c1407d5;
            }
        }
    }

    public static void A0R(C1410d8 c1410d8, int[][][] iArr, C0986Ql[] c0986QlArr, QD[] qdArr) {
        int i = -1;
        int i2 = -1;
        int i3 = 1;
        for (int i4 = 0; i4 < tunnelingAudioRendererIndex; i4++) {
            int i5 = c1410d8.A03(i4);
            QD qd = qdArr[i4];
            if ((i5 == 1 || i5 == 2) && qd != null && A0W(iArr[i4], c1410d8.A07(i4), qd)) {
                if (i5 == 1) {
                    if (i != -1) {
                        i3 = 0;
                        break;
                    }
                    i = i4;
                } else {
                    if (i2 != -1) {
                        i3 = 0;
                        break;
                    }
                    i2 = i4;
                }
            }
        }
        int tunnelingAudioRendererIndex = (i == -1 || i2 == -1) ? 0 : 1;
        if ((i3 & tunnelingAudioRendererIndex) != 0) {
            C0986Ql c0986Ql = new C0986Ql(true);
            c0986QlArr[i] = c0986Ql;
            c0986QlArr[i2] = c0986Ql;
        }
    }

    @MetaExoPlayerCustomization("Made public for customization on DashManifestHelper")
    public static boolean A0S(int i, boolean z) {
        int iA03 = AbstractC0976Qb.A03(i);
        return iA03 == 4 || (z && iA03 == 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean A0T(ZM zm) {
        boolean z;
        synchronized (this.A05) {
            z = !this.A01.A08 || this.A06 || zm.A06 <= 2 || (A0U(zm) && (AbstractC1600gE.A02 < 32 || this.A02 == null || !this.A02.A06())) || (AbstractC1600gE.A02 >= 32 && this.A02 != null && this.A02.A06() && this.A02.A04() && this.A02.A05() && this.A02.A07(this.A00, zm));
        }
        return z;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:7:0x0010  */
    public static boolean A0U(ZM zm) {
        byte b;
        if (zm.A0W == null) {
            return false;
        }
        String str = zm.A0W;
        switch (str.hashCode()) {
            case -2123537834:
                if (!str.equals(A0J(236, 14, 96))) {
                    b = -1;
                } else {
                    b = 2;
                }
                break;
            case 187078296:
                if (!str.equals(A0J(EnumC4719u30.INVALID_BID_PAYLOAD_VALUE, 9, 68))) {
                    b = -1;
                } else {
                    b = 0;
                }
                break;
            case 187078297:
                if (!str.equals(A0J(EnumC4719u30.AD_RESPONSE_TIMED_OUT_VALUE, 9, 75))) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 1504578661:
                if (!str.equals(A0J(226, 10, 37))) {
                    b = -1;
                } else {
                    b = 1;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
                return true;
            default:
                return false;
        }
    }

    public static boolean A0W(int[][] iArr, C0992Qs c0992Qs, QD qd) {
        if (qd == null) {
            return false;
        }
        int iA04 = c0992Qs.A04(qd.A9B());
        int trackFormatSupport = 0;
        while (true) {
            int length = qd.length();
            String[] strArr = A08;
            String str = strArr[7];
            String str2 = strArr[6];
            int trackGroupIndex = str.charAt(4);
            if (trackGroupIndex == str2.charAt(4)) {
                throw new RuntimeException();
            }
            A08[0] = "PrRxgmXVIQxuXSwc3dkPcYbwBOSIGAwY";
            if (trackFormatSupport < length) {
                int trackGroupIndex2 = AbstractC0976Qb.A05(iArr[iA04][qd.A87(trackFormatSupport)]);
                if (trackGroupIndex2 != 32) {
                    return false;
                }
                trackFormatSupport++;
            } else {
                return true;
            }
        }
    }

    private final C1407d5[] A0X(C1410d8 c1410d8, int[][][] iArr, int[] iArr2, C04855v c04855v) throws EK {
        String str;
        int iA02 = c1410d8.A02();
        C1407d5[] c1407d5Arr = new C1407d5[iA02];
        Pair<C1407d5, Integer> pairA0C = A0C(c1410d8, iArr, iArr2, c04855v);
        if (pairA0C != null) {
            c1407d5Arr[((Integer) pairA0C.second).intValue()] = (C1407d5) pairA0C.first;
        }
        if (pairA0C == null) {
            str = null;
        } else {
            C1175Yc c1175Yc = ((C1407d5) pairA0C.first).A01;
            int rendererCount = ((C1407d5) pairA0C.first).A02[0];
            str = c1175Yc.A08(rendererCount).A0V;
        }
        Pair<C1407d5, Integer> pairA0D = A0D(c1410d8, iArr, iArr2, c04855v, str);
        if (pairA0D != null) {
            c1407d5Arr[((Integer) pairA0D.second).intValue()] = (C1407d5) pairA0D.first;
        }
        Pair<C1407d5, Integer> pairA0B = A0B(c1410d8, iArr, c04855v, str);
        if (pairA0B != null) {
            c1407d5Arr[((Integer) pairA0B.second).intValue()] = (C1407d5) pairA0B.first;
        }
        for (int i = 0; i < iA02; i++) {
            int iA03 = c1410d8.A03(i);
            if (iA03 != 2 && iA03 != 1 && iA03 != 3) {
                c1407d5Arr[i] = A0E(iA03, c1410d8.A07(i), iArr[i], c04855v);
            }
        }
        return c1407d5Arr;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC1418dG
    public final boolean A0Y() {
        return true;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x00a3 */
    @Override // com.facebook.ads.redexgen.core.QB
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization(type = {"MERGED"}, value = "final removed in D35162315")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.util.Pair<com.facebook.ads.redexgen.core.C0986Ql[], com.facebook.ads.redexgen.core.QD[]> A0d(com.facebook.ads.redexgen.core.C1410d8 r10, int[][][] r11, int[] r12, com.facebook.ads.redexgen.core.R5 r13, com.google.android.exoplayer2.Timeline r14) throws java.lang.Throwable {
        /*
            r9 = this;
            r8 = r9
            java.lang.Object r2 = r8.A05
            monitor-enter(r2)
            com.facebook.ads.redexgen.X.5v r6 = r8.A01     // Catch: java.lang.Throwable -> La0
            boolean r0 = r6.A08     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L23
            int r1 = com.facebook.ads.redexgen.core.AbstractC1600gE.A02     // Catch: java.lang.Throwable -> La0
            r0 = 32
            if (r1 < r0) goto L23
            com.facebook.ads.redexgen.X.cz r0 = r8.A02     // Catch: java.lang.Throwable -> La0
            if (r0 == 0) goto L23
            com.facebook.ads.redexgen.X.cz r1 = r8.A02     // Catch: java.lang.Throwable -> La0
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> La0
            java.lang.Object r0 = com.facebook.ads.redexgen.core.AbstractC1517es.A02(r0)     // Catch: java.lang.Throwable -> La0
            android.os.Looper r0 = (android.os.Looper) r0     // Catch: java.lang.Throwable -> La0
            r1.A03(r8, r0)     // Catch: java.lang.Throwable -> La0
        L23:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La0
            int r5 = r10.A02()
            com.facebook.ads.redexgen.X.d5[] r7 = r8.A0X(r10, r11, r12, r6)
            A0P(r10, r6, r7)
            A0Q(r10, r6, r7)
            r4 = 0
        L33:
            r3 = 0
            if (r4 >= r5) goto L51
            int r2 = r10.A03(r4)
            boolean r0 = r6.A0R(r4)
            if (r0 != 0) goto L4c
            com.facebook.ads.redexgen.X.OG<java.lang.Integer> r1 = r6.A0H
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L4e
        L4c:
            r7[r4] = r3
        L4e:
            int r4 = r4 + 1
            goto L33
        L51:
            com.facebook.ads.redexgen.X.d6 r1 = r8.A04
            com.facebook.ads.redexgen.X.dS r0 = r9.A00()
            com.facebook.ads.redexgen.X.QD[] r4 = r1.A5R(r7, r0, r13, r14)
            com.facebook.ads.redexgen.X.Ql[] r3 = new com.facebook.ads.redexgen.core.C0986Ql[r5]
            r2 = 0
        L5e:
            if (r2 >= r5) goto L94
            int r7 = r10.A03(r2)
            boolean r0 = r6.A0R(r2)
            if (r0 != 0) goto L76
            com.facebook.ads.redexgen.X.OG<java.lang.Integer> r1 = r6.A0H
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L92
        L76:
            r0 = 1
        L77:
            if (r0 != 0) goto L90
            int r1 = r10.A03(r2)
            r0 = -2
            if (r1 == r0) goto L84
            r0 = r4[r2]
            if (r0 == 0) goto L90
        L84:
            r0 = 1
        L85:
            if (r0 == 0) goto L8e
            com.facebook.ads.redexgen.X.Ql r0 = com.facebook.ads.redexgen.core.C0986Ql.A01
        L89:
            r3[r2] = r0
            int r2 = r2 + 1
            goto L5e
        L8e:
            r0 = 0
            goto L89
        L90:
            r0 = 0
            goto L85
        L92:
            r0 = 0
            goto L77
        L94:
            boolean r0 = r6.A0D
            if (r0 == 0) goto L9b
            A0R(r10, r11, r3, r4)
        L9b:
            android.util.Pair r0 = android.util.Pair.create(r3, r4)
            return r0
        La0:
            r0 = move-exception
        La1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> La3
            goto La5
        La3:
            r0 = move-exception
            goto La1
        La5:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C04845u.A0d(com.facebook.ads.redexgen.X.d8, int[][][], int[], com.facebook.ads.redexgen.X.R5, com.google.android.exoplayer2.Timeline):android.util.Pair");
    }

    public final /* synthetic */ OI A0e(C04855v c04855v, boolean z, int i, C1175Yc c1175Yc, int[] iArr) {
        return QN.A03(i, c1175Yc, c04855v, iArr, z, new InterfaceC1719iE() { // from class: com.facebook.ads.redexgen.X.QW
            @Override // com.facebook.ads.redexgen.core.InterfaceC1719iE
            public final boolean A42(Object obj) {
                return this.A00.A0T((ZM) obj);
            }
        });
    }
}
