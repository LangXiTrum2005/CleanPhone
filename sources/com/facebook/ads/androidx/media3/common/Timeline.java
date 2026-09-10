package com.facebook.ads.androidx.media3.common;

import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import com.facebook.ads.androidx.media3.common.Timeline;
import com.facebook.ads.redexgen.core.AR;
import com.facebook.ads.redexgen.core.AS;
import com.facebook.ads.redexgen.core.AbstractC10843y;
import com.facebook.ads.redexgen.core.AnonymousClass22;
import com.facebook.ads.redexgen.core.AnonymousClass23;
import com.facebook.ads.redexgen.core.AnonymousClass24;
import com.facebook.ads.redexgen.core.AnonymousClass43;
import com.facebook.ads.redexgen.core.BP;
import com.facebook.ads.redexgen.core.C2825pj;
import com.facebook.ads.redexgen.core.C2827pl;
import com.facebook.ads.redexgen.core.C2K;
import com.facebook.ads.redexgen.core.C5C;

/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class Timeline implements AnonymousClass24 {
    public static String[] A00 = {"u1TV1j0aFj13GJQ9ixTagHG8KyMgbnog", "4GMeFBxldVuonExwkIPaDDi9I59L728Z", "hqD1wOYcZTmehOTQOtlNc0UQ2KV4ETaI", "yejsGunEYiKaKfUzobCfCtheJf3zEEcL", "wYd9LRHFlTpJXE3VqmNr3ySXFdmyeGzN", "VCegaKN739XbWKUaP5Uwy30Zmvr6QTeK", "Cr3igiuAIuu", "x89DN52UD2fFRZn9rQXfWzGYhaiJYHE1"};
    public static final Timeline A02 = new AS();
    public static final String A05 = C5C.A0h(0);
    public static final String A03 = C5C.A0h(1);
    public static final String A04 = C5C.A0h(2);
    public static final AnonymousClass23<Timeline> A01 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pq
        @Override // com.facebook.ads.redexgen.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return Timeline.A02(bundle);
        }
    };

    public abstract int A06();

    public abstract int A07();

    public abstract int A0A(Object obj);

    public abstract C2827pl A0I(int i2, C2827pl c2827pl, boolean z2);

    public abstract C2825pj A0L(int i2, C2825pj c2825pj, long j);

    public abstract Object A0M(int i2);

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Period> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BP != com.google.common.collect.ImmutableList<com.facebook.ads.androidx.media3.common.Timeline$Window> */
    public static AR A02(Bundle bundle) {
        BP bpA04 = A04(C2825pj.A0J, AnonymousClass43.A00(bundle, A05));
        BP bpA05 = A04(C2827pl.A08, AnonymousClass43.A00(bundle, A03));
        int[] intArray = bundle.getIntArray(A04);
        if (intArray == null) {
            intArray = A05(bpA04.size());
        }
        return new AR(bpA04, bpA05, intArray);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.23 != com.facebook.ads.androidx.media3.common.Bundleable$Creator<T extends com.facebook.ads.redexgen.X.24> */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2K != com.google.common.collect.ImmutableList$Builder<T extends com.facebook.ads.redexgen.X.24> */
    public static <T extends AnonymousClass24> BP<T> A04(AnonymousClass23<T> anonymousClass23, IBinder iBinder) {
        if (iBinder == null) {
            return BP.A03();
        }
        C2K c2k = new C2K();
        BP<Bundle> bpA00 = AnonymousClass22.A00(iBinder);
        for (int i2 = 0; i2 < bpA00.size(); i2++) {
            c2k.A04(anonymousClass23.A6f(bpA00.get(i2)));
        }
        return c2k.A05();
    }

    public static int[] A05(int i2) {
        int[] iArr = new int[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = i3;
            int i4 = A00[1].charAt(20);
            if (i4 == 50) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[2] = "bm1hpxiL8T70YPoy7qoC4X3DFFhRRvrI";
            strArr[4] = "ZU2doOYnXTdq2XyitRV5O0BVNSu1NLTL";
        }
        return iArr;
    }

    public int A08(int i2, int i3, boolean z2) {
        switch (i3) {
            case 0:
                if (i2 == A0C(z2)) {
                    return -1;
                }
                return i2 + 1;
            case 1:
                return i2;
            case 2:
                int iA0C = A0C(z2);
                String[] strArr = A00;
                if (strArr[3].charAt(14) != strArr[5].charAt(14)) {
                    throw new RuntimeException();
                }
                A00[1] = "R0HEAX03GiDQUcMP0CiDD2yYG3qNGv8H";
                if (i2 == iA0C) {
                    return A0B(z2);
                }
                return i2 + 1;
            default:
                throw new IllegalStateException();
        }
    }

    public final int A09(int i2, C2827pl c2827pl, C2825pj c2825pj, int i3, boolean z2) {
        int i4 = A0H(i2, c2827pl).A00;
        int windowIndex = A0K(i4, c2825pj).A01;
        if (windowIndex == i2) {
            int nextWindowIndex = A08(i4, i3, z2);
            if (nextWindowIndex == -1) {
                return -1;
            }
            int windowIndex2 = A0K(nextWindowIndex, c2825pj).A00;
            return windowIndex2;
        }
        int windowIndex3 = i2 + 1;
        return windowIndex3;
    }

    public int A0B(boolean z2) {
        return A0N() ? -1 : 0;
    }

    public int A0C(boolean z2) {
        if (A0N()) {
            return -1;
        }
        return A07() - 1;
    }

    @Deprecated
    public final Pair<Object, Long> A0D(C2825pj c2825pj, C2827pl c2827pl, int i2, long j) {
        return A0E(c2825pj, c2827pl, i2, j);
    }

    public final Pair<Object, Long> A0E(C2825pj c2825pj, C2827pl c2827pl, int i2, long j) {
        return (Pair) AbstractC10843y.A01(A0G(c2825pj, c2827pl, i2, j, 0L));
    }

    @Deprecated
    public final Pair<Object, Long> A0F(C2825pj c2825pj, C2827pl c2827pl, int i2, long j, long j2) {
        return A0G(c2825pj, c2827pl, i2, j, j2);
    }

    public final Pair<Object, Long> A0G(C2825pj c2825pj, C2827pl c2827pl, int i2, long j, long j2) {
        AbstractC10843y.A00(i2, 0, A07());
        A0L(i2, c2825pj, j2);
        if (j == -9223372036854775807L) {
            j = c2825pj.A05();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i3 = c2825pj.A00;
        A0H(i3, c2827pl);
        while (i3 < c2825pj.A01 && c2827pl.A02 != j && A0H(i3 + 1, c2827pl).A02 <= j) {
            i3++;
        }
        A0I(i3, c2827pl, true);
        long jMin = j - c2827pl.A02;
        if (c2827pl.A01 != -9223372036854775807L) {
            long j3 = c2827pl.A01;
            if (A00[1].charAt(20) == '2') {
                throw new RuntimeException();
            }
            A00[1] = "slEcDLMOMSnRw8lzrIQwxe9jf9tcgTic";
            jMin = Math.min(jMin, j3 - 1);
        }
        return Pair.create(AbstractC10843y.A01(c2827pl.A04), Long.valueOf(Math.max(0L, jMin)));
    }

    public final C2827pl A0H(int i2, C2827pl c2827pl) {
        return A0I(i2, c2827pl, false);
    }

    public C2827pl A0J(Object obj, C2827pl c2827pl) {
        return A0I(A0A(obj), c2827pl, true);
    }

    public final C2825pj A0K(int i2, C2825pj c2825pj) {
        return A0L(i2, c2825pj, 0L);
    }

    public final boolean A0N() {
        return A07() == 0;
    }

    public final boolean A0O(int i2, C2827pl c2827pl, C2825pj c2825pj, int i3, boolean z2) {
        return A09(i2, c2827pl, c2825pj, i3, z2) == -1;
    }

    public final boolean equals(Object obj) {
        int iA0C;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Timeline)) {
            return false;
        }
        Timeline timeline = (Timeline) obj;
        if (timeline.A07() != A07() || timeline.A06() != A06()) {
            return false;
        }
        C2825pj c2825pj = new C2825pj();
        C2827pl c2827pl = new C2827pl();
        C2825pj window = new C2825pj();
        C2827pl otherPeriod = new C2827pl();
        for (int i2 = 0; i2 < A07(); i2++) {
            if (!A0K(i2, c2825pj).equals(timeline.A0K(i2, window))) {
                return false;
            }
        }
        for (int i3 = 0; i3 < A06(); i3++) {
            boolean zEquals = A0I(i3, c2827pl, true).equals(timeline.A0I(i3, otherPeriod, true));
            if (A00[6].length() != 11) {
                throw new RuntimeException();
            }
            String[] strArr = A00;
            strArr[7] = "LCXdoHEXleHtD1UyLVprjOGqC7qnADXU";
            strArr[0] = "np8LEsRhRemsbbWWIjAQc1GjKbBRdfRS";
            if (!zEquals) {
                return false;
            }
        }
        int iA0B = A0B(true);
        if (iA0B != timeline.A0B(true) || (iA0C = A0C(true)) != timeline.A0C(true)) {
            return false;
        }
        while (iA0B != iA0C) {
            int iA08 = A08(iA0B, 0, true);
            if (iA08 != timeline.A08(iA0B, 0, true)) {
                return false;
            }
            iA0B = iA08;
        }
        return true;
    }

    public final int hashCode() {
        C2825pj c2825pj = new C2825pj();
        C2827pl c2827pl = new C2827pl();
        int result = 7 * 31;
        int i2 = result + A07();
        for (int i3 = 0; i3 < A07(); i3++) {
            C2825pj window = A0K(i3, c2825pj);
            i2 = (i2 * 31) + window.hashCode();
        }
        int result2 = i2 * 31;
        int i4 = result2 + A06();
        for (int i5 = 0; i5 < A06(); i5++) {
            i4 = (i4 * 31) + A0I(i5, c2827pl, true).hashCode();
        }
        int iA0B = A0B(true);
        while (iA0B != -1) {
            int windowIndex = i4 * 31;
            i4 = windowIndex + iA0B;
            iA0B = A08(iA0B, 0, true);
        }
        return i4;
    }
}
