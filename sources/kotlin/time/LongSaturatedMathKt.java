package kotlin.time;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class LongSaturatedMathKt {
    public static final long a(long j) {
        if (j < 0) {
            Duration.Companion companion = Duration.f44719Y;
            return Duration.e0;
        }
        Duration.Companion companion2 = Duration.f44719Y;
        return Duration.Z;
    }

    public static final long b(long j, long j2, DurationUnit durationUnit) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return DurationKt.h(j3, durationUnit);
        }
        DurationUnit durationUnit2 = DurationUnit.MILLISECONDS;
        if (durationUnit.compareTo(durationUnit2) >= 0) {
            return Duration.m(a(j3));
        }
        long jB = DurationUnitKt__DurationUnitJvmKt.b(1L, durationUnit2, durationUnit);
        long j4 = (j / jB) - (j2 / jB);
        long j5 = (j % jB) - (j2 % jB);
        Duration.Companion companion = Duration.f44719Y;
        return Duration.i(DurationKt.h(j4, durationUnit2), DurationKt.h(j5, durationUnit));
    }
}
