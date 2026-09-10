package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/time/Duration;", "", "Companion", "rawValue", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
@JvmInline
public final class Duration implements Comparable<Duration> {

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public static final Companion f44719Y = new Companion();
    public static final long Z;
    public static final long e0;
    public final long X;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lkotlin/time/Duration$Companion;", "", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        int i2 = DurationJvmKt.f44720a;
        Z = DurationKt.b(4611686018427387903L);
        e0 = DurationKt.b(-4611686018427387903L);
    }

    public static final long a(long j, long j2) {
        long j3 = 1000000;
        long j4 = j2 / j3;
        long j5 = j + j4;
        if (-4611686018426L > j5 || j5 >= 4611686018427L) {
            return DurationKt.b(RangesKt.c(j5));
        }
        return DurationKt.d((j5 * j3) + (j2 - (j4 * j3)));
    }

    public static final void b(StringBuilder sb, int i2, int i3, int i4, String str, boolean z2) {
        sb.append(i2);
        if (i3 != 0) {
            sb.append('.');
            String strA = StringsKt.A(i4, String.valueOf(i3));
            int i5 = -1;
            int length = strA.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i6 = length - 1;
                    if (strA.charAt(length) != '0') {
                        i5 = length;
                        break;
                    } else if (i6 < 0) {
                        break;
                    } else {
                        length = i6;
                    }
                }
            }
            int i7 = i5 + 1;
            if (z2 || i7 >= 3) {
                sb.append((CharSequence) strA, 0, ((i5 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strA, 0, i7);
            }
        }
        sb.append(str);
    }

    public static int d(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i2 = (((int) j) & 1) - (((int) j2) & 1);
            return j < 0 ? -i2 : i2;
        }
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static final long f(long j) {
        return ((((int) j) & 1) != 1 || h(j)) ? k(j, DurationUnit.MILLISECONDS) : j >> 1;
    }

    public static final int g(long j) {
        if (h(j)) {
            return 0;
        }
        return (((int) j) & 1) == 1 ? (int) (((j >> 1) % ((long) 1000)) * ((long) 1000000)) : (int) ((j >> 1) % ((long) 1000000000));
    }

    public static final boolean h(long j) {
        return j == Z || j == e0;
    }

    public static final long i(long j, long j2) {
        if (h(j)) {
            if (!h(j2) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (h(j2)) {
            return j2;
        }
        int i2 = ((int) j) & 1;
        if (i2 != (((int) j2) & 1)) {
            return i2 == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        long j3 = (j >> 1) + (j2 >> 1);
        if (i2 == 0) {
            return (-4611686018426999999L > j3 || j3 >= 4611686018427000000L) ? DurationKt.b(j3 / ((long) 1000000)) : DurationKt.d(j3);
        }
        return DurationKt.c(j3);
    }

    public static final double j(long j, DurationUnit unit) {
        Intrinsics.f(unit, "unit");
        if (j == Z) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == e0) {
            return Double.NEGATIVE_INFINITY;
        }
        return DurationUnitKt__DurationUnitJvmKt.a(j >> 1, (((int) j) & 1) == 0 ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS, unit);
    }

    public static final long k(long j, DurationUnit unit) {
        Intrinsics.f(unit, "unit");
        if (j == Z) {
            return Long.MAX_VALUE;
        }
        if (j == e0) {
            return Long.MIN_VALUE;
        }
        return DurationUnitKt__DurationUnitJvmKt.b(j >> 1, (((int) j) & 1) == 0 ? DurationUnit.NANOSECONDS : DurationUnit.MILLISECONDS, unit);
    }

    public static String l(long j) {
        if (j == 0) {
            return "0s";
        }
        if (j == Z) {
            return "Infinity";
        }
        if (j == e0) {
            return "-Infinity";
        }
        int i2 = 0;
        boolean z2 = j < 0;
        StringBuilder sb = new StringBuilder();
        if (z2) {
            sb.append('-');
        }
        long jM = j < 0 ? m(j) : j;
        long jK = k(jM, DurationUnit.DAYS);
        int iK = h(jM) ? 0 : (int) (k(jM, DurationUnit.HOURS) % ((long) 24));
        int iK2 = h(jM) ? 0 : (int) (k(jM, DurationUnit.MINUTES) % ((long) 60));
        int iK3 = h(jM) ? 0 : (int) (k(jM, DurationUnit.SECONDS) % ((long) 60));
        int iG = g(jM);
        boolean z3 = jK != 0;
        boolean z4 = iK != 0;
        boolean z5 = iK2 != 0;
        boolean z6 = (iK3 == 0 && iG == 0) ? false : true;
        if (z3) {
            sb.append(jK);
            sb.append('d');
            i2 = 1;
        }
        if (z4 || (z3 && (z5 || z6))) {
            int i3 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iK);
            sb.append('h');
            i2 = i3;
        }
        if (z5 || (z6 && (z4 || z3))) {
            int i4 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            sb.append(iK2);
            sb.append('m');
            i2 = i4;
        }
        if (z6) {
            int i5 = i2 + 1;
            if (i2 > 0) {
                sb.append(' ');
            }
            if (iK3 != 0 || z3 || z4 || z5) {
                b(sb, iK3, iG, 9, "s", false);
            } else if (iG >= 1000000) {
                b(sb, iG / 1000000, iG % 1000000, 6, "ms", false);
            } else if (iG >= 1000) {
                b(sb, iG / 1000, iG % 1000, 3, "us", false);
            } else {
                sb.append(iG);
                sb.append("ns");
            }
            i2 = i5;
        }
        if (z2 && i2 > 1) {
            sb.insert(1, '(').append(')');
        }
        return sb.toString();
    }

    public static final long m(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i2 = DurationJvmKt.f44720a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        return d(this.X, duration.X);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Duration) {
            return this.X == ((Duration) obj).X;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.X);
    }

    public final String toString() {
        return l(this.X);
    }
}
