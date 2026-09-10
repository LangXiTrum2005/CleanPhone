package kotlin.time;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Deprecated
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "DoubleTimeMark", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AbstractDoubleTimeSource implements TimeSource.WithComparableMarks {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/time/AbstractDoubleTimeSource$DoubleTimeMark;", "Lkotlin/time/ComparableTimeMark;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class DoubleTimeMark implements ComparableTimeMark {
        public final double X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public final AbstractDoubleTimeSource f44718Y;

        public DoubleTimeMark(double d, AbstractDoubleTimeSource timeSource) {
            Intrinsics.f(timeSource, "timeSource");
            this.X = d;
            this.f44718Y = timeSource;
        }

        @Override // kotlin.time.TimeMark
        public final long a() {
            AbstractDoubleTimeSource abstractDoubleTimeSource = this.f44718Y;
            double dB = abstractDoubleTimeSource.b() - this.X;
            abstractDoubleTimeSource.getClass();
            DurationKt.f(dB, null);
            throw null;
        }

        public final long b(ComparableTimeMark other) {
            Intrinsics.f(other, "other");
            if (other instanceof DoubleTimeMark) {
                DoubleTimeMark doubleTimeMark = (DoubleTimeMark) other;
                AbstractDoubleTimeSource abstractDoubleTimeSource = this.f44718Y;
                if (Intrinsics.a(abstractDoubleTimeSource, doubleTimeMark.f44718Y)) {
                    if (Duration.h(0L)) {
                        return 0L;
                    }
                    Duration.i(0L, Duration.m(0L));
                    double d = this.X - doubleTimeMark.X;
                    abstractDoubleTimeSource.getClass();
                    DurationKt.f(d, null);
                    throw null;
                }
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        @Override // java.lang.Comparable
        public final int compareTo(ComparableTimeMark comparableTimeMark) {
            ComparableTimeMark other = comparableTimeMark;
            Intrinsics.f(other, "other");
            b(other);
            return Duration.d(0L, 0L);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof DoubleTimeMark)) {
                return false;
            }
            if (!Intrinsics.a(this.f44718Y, ((DoubleTimeMark) obj).f44718Y)) {
                return false;
            }
            b((ComparableTimeMark) obj);
            Duration.Companion companion = Duration.f44719Y;
            return true;
        }

        public final int hashCode() {
            this.f44718Y.getClass();
            DurationKt.f(this.X, null);
            throw null;
        }

        public final String toString() {
            this.f44718Y.getClass();
            Intrinsics.f(null, "<this>");
            throw null;
        }
    }

    @Override // kotlin.time.TimeSource.WithComparableMarks
    public final ComparableTimeMark a() {
        double dB = b();
        Duration.Companion companion = Duration.f44719Y;
        return new DoubleTimeMark(dB, this);
    }

    public abstract double b();
}
