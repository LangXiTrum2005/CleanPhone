package com.facebook.ads.redexgen.core;

import android.graphics.Rect;
import com.applovin.shadow.okio.Utf8;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jacoco.core.data.ExecutionDataWriter;
import org.objectweb.asm.Opcodes;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.1u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C08631u implements InterfaceC1069Al {
    public static byte[] A09;
    public static String[] A0A = {"5g", "bfnfjiUri9kvxuLEKnZU3kJc1ieY23zz", "NIX", "B1MUzprhDDigVQ4p3NlPN3VyWdkPEAJB", "UzK", "rOCmuOM4l5uJjn2akKGm2JxYL79BUlOr", "kAulvLpzcmVynuK8kNGYEaaJbNqcwElD", "7ScKsdjGN77oK2tO1d"};
    public static final String A0B;
    public long A00;
    public InterfaceC2737rK A01;
    public final InterfaceC2736rJ A02;
    public final C2729rB A03;
    public final C2729rB A04;
    public final List<Rect> A05;
    public final Map<String, C2728rA> A06;
    public final boolean A07;
    public final boolean A08;

    public static String A02(int i, int i2, int i3) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0A;
            if (strArr[3].charAt(2) == strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[5] = "GBjOApmdB9meVYu3h8dWYwSrfWPE5QmB";
            strArr2[6] = "rSzbUr5mB5cqWCHa6t40U5C3uIAdU8ry";
            if (i4 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i4] = (byte) ((bArrCopyOfRange[i4] ^ i3) ^ 73);
            i4++;
        }
    }

    public static void A03() {
        A09 = new byte[]{20, 40, 41, 51, 96, 54, 41, 37, 55, 48, 47, 41, 46, 52, 96, 40, 33, 51, 96, 46, 47, 52, 96, 34, 37, 37, 46, 96, 45, 37, 33, 51, 53, 50, 37, 36, 96, 47, 50, 96, 41, 51, 96, 33, 96, 39, 50, 47, 53, 48, 96, 55, 40, 41, 35, 40, 96, 55, 41, 44, 44, 96, 46, 37, 54, 37, 50, 96, 50, 37, 52, 53, 50, 46, 96, 33, 96, 45, 37, 33, 51, 53, 50, 37, 45, 37, 46, 52, 96, 51, 41, 46, 35, 37, 96, 41, 52, 103, 51, 96, 45, 33, 36, 37, 96, 53, 48, 96, 47, 38, 96, 51, 53, 34, 54, 41, 37, 55, 51, 96, 52, 40, 33, 52, 96, 35, 47, 53, 44, 36, 96, 34, 37, 96, 47, 38, 38, 51, 35, 50, 37, 37, 46, ExecutionDataWriter.BLOCK_SESSIONINFO, 27, 9, 45, 29, 31, ExecutionDataWriter.BLOCK_SESSIONINFO, 61, 38, Utf8.REPLACEMENT_BYTE, Utf8.REPLACEMENT_BYTE, 115, 37, 58, 54, 36, 115, 35, 33, 60, 35, 54, 33, 39, 42, 115, 53, 60, 33, 115, 33, 54, 62, 60, 37, 54, 55, 115, 58, 39, 54, 62, 115, 30, 2, 11, 25, Utf8.REPLACEMENT_BYTE, 8, 29, 2, 31, 25};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1069Al
    public final void A6P(List<C2740rN<?, ?>> list) {
        if (list != null && !list.isEmpty()) {
            A06(list);
        }
        A05(this.A04);
        A04(this.A04);
        A05(this.A03);
        A04(this.A03);
        if (0 != 0) {
            new C2727r9(toString(), this, this.A05, this.A04.A00(), this.A03.A00());
            throw new NullPointerException(A02(Opcodes.D2L, 7, 55));
        }
    }

    static {
        A03();
        A0B = C08631u.class.getSimpleName();
    }

    public C08631u(InterfaceC2736rJ interfaceC2736rJ) {
        this(interfaceC2736rJ, false, false);
    }

    public C08631u(InterfaceC2736rJ interfaceC2736rJ, boolean z, boolean z2) {
        this.A06 = new HashMap();
        this.A04 = new C2729rB();
        this.A03 = new C2729rB();
        this.A05 = new ArrayList(1);
        this.A02 = interfaceC2736rJ;
        this.A08 = z;
        this.A07 = z2;
    }

    public static Rect A00(C2728rA c2728rA) {
        if (c2728rA == null || c2728rA.A02.top == Integer.MIN_VALUE || c2728rA.A02.left == Integer.MIN_VALUE || c2728rA.A02.right == Integer.MIN_VALUE || c2728rA.A02.bottom == Integer.MIN_VALUE) {
            throw new IllegalStateException(A02(0, Opcodes.D2L, 9));
        }
        return c2728rA.A02;
    }

    private C2728rA A01(C2740rN c2740rN, Rect rect, Rect rect2) {
        C2728rA c2728rAA03 = this.A06.get(c2740rN.A02);
        if (this.A04.A06(c2740rN)) {
            if (c2728rAA03 != null) {
                c2728rAA03.A01 = EnumC2732rE.A04;
            } else {
                c2728rAA03 = C2728rA.A03(this.A00);
                this.A06.put(c2740rN.A02, c2728rAA03);
            }
        }
        if (c2728rAA03 != null) {
            c2728rAA03.A02.set(rect2);
            c2728rAA03.A03.add(new Rect(rect));
        }
        return c2728rAA03;
    }

    private void A04(C2729rB c2729rB) {
        for (C2740rN c2740rN : c2729rB.A01()) {
            C2728rA c2728rA = this.A06.get(c2740rN.A02);
            if (c2728rA == null) {
                if (0 != 0) {
                    String str = A02(Opcodes.FCMPG, 36, 26) + c2740rN.A02;
                    throw new NullPointerException(A02(Opcodes.INVOKEDYNAMIC, 10, 36));
                }
            } else {
                c2728rA.A01 = EnumC2732rE.A03;
                c2728rA.A03.clear();
                if (A07(c2740rN)) {
                    c2740rN.A03(this);
                }
                if (this.A08) {
                    this.A06.remove(c2728rA);
                }
            }
        }
    }

    private void A05(C2729rB c2729rB) {
        for (C2740rN visible : c2729rB.A00()) {
            if (A07(visible)) {
                visible.A03(this);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0004 A[SYNTHETIC] */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    private void A06(List<C2740rN<?, ?>> list) {
        for (C2740rN<?, ?> c2740rN : list) {
            if (this.A06.get(c2740rN.A02) != null) {
                boolean z = c2740rN.A04;
                if (A0A[0].length() != 2) {
                    throw new RuntimeException();
                }
                A0A[7] = "nPwsVC";
                if (z) {
                    EnumC2732rE enumC2732rE = c2740rN.A01;
                    String[] strArr = A0A;
                    if (strArr[5].length() != strArr[6].length()) {
                        A0A[0] = "zj";
                        if (enumC2732rE != null) {
                            if (c2740rN.A01 != EnumC2732rE.A03) {
                                c2740rN.A03(this);
                            }
                        }
                    } else {
                        String[] strArr2 = A0A;
                        strArr2[4] = "4Gl";
                        strArr2[2] = "t26";
                        if (enumC2732rE != null) {
                            if (c2740rN.A01 != EnumC2732rE.A03) {
                                c2740rN.A03(this);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.rN != com.instagram.common.viewpoint.core.ViewpointData<?, ?> */
    public static boolean A07(C2740rN<?, ?> c2740rN) {
        if (c2740rN.A04) {
            EnumC2741rO enumC2741rO = c2740rN.A00;
            EnumC2741rO enumC2741rO2 = EnumC2741rO.A04;
            String[] strArr = A0A;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A0A[7] = "iICfc1p4CYNR1vFaz";
            if (enumC2741rO == enumC2741rO2) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d3  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC1069Al
    public final void A46(C2740rN c2740rN, Rect rect, Rect rect2, boolean z) {
        EnumC2732rE enumC2732rE;
        A01(c2740rN, rect, rect2);
        C2740rN c2740rN2 = c2740rN.A05;
        C2740rN parentViewpointData = C2740rN.A0B;
        if (c2740rN2 == parentViewpointData || c2740rN2 == null) {
            return;
        }
        boolean zA06 = this.A03.A06(c2740rN2);
        C2728rA c2728rAA03 = this.A06.get(c2740rN2.A02);
        if (zA06) {
            if (c2728rAA03 == null) {
                c2728rAA03 = C2728rA.A03(this.A00);
                c2728rAA03.A02.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
                this.A06.put(c2740rN2.A02, c2728rAA03);
            } else {
                c2728rAA03.A03.clear();
                if (this.A07) {
                    boolean zA04 = c2740rN2.A04();
                    if (A0A[0].length() != 2) {
                        throw new RuntimeException();
                    }
                    String[] strArr = A0A;
                    strArr[5] = "H54AceamXdthsYm78mtSydojeY2Fx6Sn";
                    strArr[6] = "PVfiJKIqQ6L9JP1UYx1CLIU2NiQOo1Yq";
                    if (zA04) {
                        enumC2732rE = EnumC2732rE.A04;
                        if (A0A[7].length() != 26) {
                            throw new RuntimeException();
                        }
                        String[] strArr2 = A0A;
                        strArr2[5] = "tsuWg7tiHeCbTZ79GKvfVJLQxaexBCGH";
                        strArr2[6] = "f1Y9d3aTAam6AIKjxx39fqUFlMtOCeIE";
                        c2728rAA03.A01 = enumC2732rE;
                    }
                } else {
                    enumC2732rE = EnumC2732rE.A04;
                    if (A0A[7].length() != 26) {
                        throw new RuntimeException();
                    }
                    String[] strArr3 = A0A;
                    strArr3[5] = "tsuWg7tiHeCbTZ79GKvfVJLQxaexBCGH";
                    strArr3[6] = "f1Y9d3aTAam6AIKjxx39fqUFlMtOCeIE";
                    c2728rAA03.A01 = enumC2732rE;
                }
            }
            if (z) {
                c2728rAA03.A02.set(rect2.left, rect2.top, rect2.right, rect2.bottom);
            }
        } else if (z && c2728rAA03 != null) {
            c2728rAA03.A02.set(Math.min(rect2.left, c2728rAA03.A02.left), Math.min(rect2.top, c2728rAA03.A02.top), Math.max(rect2.right, c2728rAA03.A02.right), Math.max(rect2.bottom, c2728rAA03.A02.bottom));
        }
        if (c2728rAA03 == null) {
            return;
        }
        c2728rAA03.A03.add(new Rect(rect));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1069Al
    public final void A4h(long j, List<Rect> list) {
        this.A00 = j;
        this.A05.clear();
        Iterator<Rect> it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            String[] strArr = A0A;
            if (strArr[3].charAt(2) == strArr[1].charAt(2)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0A;
            strArr2[4] = "xWg";
            strArr2[2] = "l5f";
            if (zHasNext) {
                this.A05.add(new Rect(it.next()));
            } else {
                Iterator it2 = this.A04.A01().iterator();
                while (true) {
                    boolean zHasNext2 = it2.hasNext();
                    if (A0A[0].length() == 2) {
                        String[] strArr3 = A0A;
                        strArr3[3] = "KXc0LwnJCEJYYpq44EYPYXvj71LHxLBt";
                        strArr3[1] = "SZ9db6jeJg1WeryC8zmRUBHGUrGxU8hd";
                        if (!zHasNext2) {
                            break;
                        }
                        this.A06.remove(((C2740rN) it2.next()).A02);
                    } else {
                        if (!zHasNext2) {
                            break;
                        }
                        this.A06.remove(((C2740rN) it2.next()).A02);
                    }
                }
                Collection<C2740rN> collectionA01 = this.A03.A01();
                if (A0A[0].length() != 2) {
                    throw new RuntimeException();
                }
                A0A[0] = "Au";
                for (C2740rN viewpointData : collectionA01) {
                    this.A06.remove(viewpointData.A02);
                }
                Iterator<C2728rA> it3 = this.A06.values().iterator();
                while (it3.hasNext()) {
                    it3.next().A03.clear();
                }
                this.A04.A04();
                this.A03.A04();
                return;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2731rD
    public final void A8D(C2740rN c2740rN, Rect rect) {
        if (!this.A06.containsKey(c2740rN.A02)) {
            return;
        }
        rect.setEmpty();
        for (Rect rect2 : this.A06.get(c2740rN.A02).A03) {
            if (A0A[7].length() == 26) {
                throw new RuntimeException();
            }
            A0A[7] = "8y";
            rect.union(rect2);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2731rD
    public final EnumC2732rE A9U(C2740rN c2740rN) {
        if (!this.A06.containsKey(c2740rN.A02)) {
            return EnumC2732rE.A02;
        }
        EnumC2732rE enumC2732rE = this.A06.get(c2740rN.A02).A01;
        if (c2740rN.A04) {
            if (c2740rN.A00 == EnumC2741rO.A04) {
                EnumC2732rE viewState = EnumC2732rE.A03;
                return viewState;
            }
            EnumC2732rE viewState2 = EnumC2732rE.A04;
            if (enumC2732rE == viewState2 && !c2740rN.A04()) {
                EnumC2732rE viewState3 = EnumC2732rE.A02;
                return viewState3;
            }
        }
        return enumC2732rE;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2731rD
    public final void A9W(Rect rect) {
        rect.setEmpty();
        Iterator<Rect> it = this.A05.iterator();
        while (it.hasNext()) {
            rect.union(it.next());
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2731rD
    public final float A9X(C2740rN c2740rN) {
        C2728rA c2728rA = this.A06.get(c2740rN.A02);
        if (c2728rA != null) {
            Rect rectA00 = A00(c2728rA);
            int iHeight = rectA00.height() * rectA00.width();
            int totalVisibleArea = 0;
            for (Rect rect : c2728rA.A03) {
                totalVisibleArea += rect.height() * rect.width();
            }
            return totalVisibleArea / iHeight;
        }
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1069Al
    public final void AJu(InterfaceC2737rK interfaceC2737rK) {
        this.A01 = interfaceC2737rK;
    }
}
