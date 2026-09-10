package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "LongTimeMark", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AbstractLongTimeSource implements TimeSource.WithComparableMarks {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/time/AbstractLongTimeSource$LongTimeMark;", "Lkotlin/time/ComparableTimeMark;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class LongTimeMark implements ComparableTimeMark {
        @Override // kotlin.time.TimeMark
        public final long a() {
            throw null;
        }

        @Override // java.lang.Comparable
        public final int compareTo(ComparableTimeMark comparableTimeMark) {
            ComparableTimeMark other = comparableTimeMark;
            Intrinsics.f(other, "other");
            Intrinsics.f(other, "other");
            if (other instanceof LongTimeMark) {
                throw null;
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof LongTimeMark)) {
                return false;
            }
            throw null;
        }

        public final int hashCode() {
            Duration.Companion companion = Duration.f44719Y;
            throw null;
        }

        public final String toString() {
            throw null;
        }
    }

    @Override // kotlin.time.TimeSource.WithComparableMarks
    public final ComparableTimeMark a() {
        throw null;
    }
}
