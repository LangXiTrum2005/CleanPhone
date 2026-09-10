package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bg\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/time/TimeSource;", "", "WithComparableMarks", "Monotonic", "Companion", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface TimeSource {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/time/TimeSource$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/TimeSource$Monotonic;", "Lkotlin/time/TimeSource$WithComparableMarks;", "ValueTimeMark", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Monotonic implements WithComparableMarks {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Monotonic f44728a = new Monotonic();

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00060\u0003j\u0002`\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "Lkotlin/time/ComparableTimeMark;", "reading", "", "Lkotlin/time/ValueTimeMarkReading;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
        @JvmInline
        public static final class ValueTimeMark implements ComparableTimeMark {
            public final long X;

            public /* synthetic */ ValueTimeMark(long j) {
                this.X = j;
            }

            public static long b(long j) {
                long jB = MonotonicTimeSource.b();
                DurationUnit unit = DurationUnit.NANOSECONDS;
                Intrinsics.f(unit, "unit");
                return (1 | (j - 1)) == Long.MAX_VALUE ? Duration.m(LongSaturatedMathKt.a(j)) : LongSaturatedMathKt.b(jB, j, unit);
            }

            @Override // kotlin.time.TimeMark
            public final long a() {
                return b(this.X);
            }

            @Override // java.lang.Comparable
            public final int compareTo(ComparableTimeMark comparableTimeMark) {
                long jA;
                ComparableTimeMark other = comparableTimeMark;
                Intrinsics.f(other, "other");
                Intrinsics.f(other, "other");
                boolean z2 = other instanceof ValueTimeMark;
                long j = this.X;
                if (!z2) {
                    throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + ((Object) ("ValueTimeMark(reading=" + j + ')')) + " and " + other);
                }
                int i2 = MonotonicTimeSource.f44727b;
                DurationUnit unit = DurationUnit.NANOSECONDS;
                Intrinsics.f(unit, "unit");
                long j2 = ((ValueTimeMark) other).X;
                if (((j2 - 1) | 1) != Long.MAX_VALUE) {
                    jA = (1 | (j - 1)) == Long.MAX_VALUE ? LongSaturatedMathKt.a(j) : LongSaturatedMathKt.b(j, j2, unit);
                } else if (j == j2) {
                    Duration.Companion companion = Duration.f44719Y;
                    jA = 0;
                } else {
                    jA = Duration.m(LongSaturatedMathKt.a(j2));
                }
                return Duration.d(jA, 0L);
            }

            public final boolean equals(Object obj) {
                if (obj instanceof ValueTimeMark) {
                    return this.X == ((ValueTimeMark) obj).X;
                }
                return false;
            }

            public final int hashCode() {
                return Long.hashCode(this.X);
            }

            public final String toString() {
                return "ValueTimeMark(reading=" + this.X + ')';
            }
        }

        @Override // kotlin.time.TimeSource.WithComparableMarks
        public final ComparableTimeMark a() {
            return new ValueTimeMark(MonotonicTimeSource.b());
        }

        public final String toString() {
            int i2 = MonotonicTimeSource.f44727b;
            return "TimeSource(System.nanoTime())";
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/TimeSource;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface WithComparableMarks extends TimeSource {
        ComparableTimeMark a();
    }
}
