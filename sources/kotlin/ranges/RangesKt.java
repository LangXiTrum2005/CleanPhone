package kotlin.ranges;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"kotlin/ranges/RangesKt__RangesKt", "kotlin/ranges/RangesKt___RangesKt"}, k = 4, mv = {2, 1, 0}, xi = 49)
public final class RangesKt extends RangesKt___RangesKt {
    public static float a(float f) {
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    public static int b(int i2, int i3, int i4) {
        if (i3 <= i4) {
            if (i2 < i3) {
                return i3;
            }
            return i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + '.');
    }

    public static long c(long j) {
        if (j < -4611686018427387903L) {
            return -4611686018427387903L;
        }
        if (j > 4611686018427387903L) {
            return 4611686018427387903L;
        }
        return j;
    }

    public static IntProgression d(IntRange intRange, int i2) {
        Intrinsics.f(intRange, "<this>");
        boolean z2 = i2 > 0;
        Integer numValueOf = Integer.valueOf(i2);
        if (z2) {
            if (intRange.Z <= 0) {
                i2 = -i2;
            }
            return new IntProgression(intRange.X, intRange.f43343Y, i2);
        }
        throw new IllegalArgumentException("Step must be positive, was: " + numValueOf + '.');
    }

    public static IntRange e(int i2, int i3) {
        return i3 <= Integer.MIN_VALUE ? IntRange.e0 : new IntRange(i2, i3 - 1, 1);
    }
}
