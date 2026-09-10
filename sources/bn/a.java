package bn;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f5741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f5742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f5743d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5744a;

    static {
        int i10 = b.f5745a;
        f5741b = d0.c.f(4611686018427387903L);
        f5742c = d0.c.f(-4611686018427387903L);
    }

    public static final long a(long j10, long j11) {
        long j12 = 1000000;
        long j13 = j11 / j12;
        long j14 = j10 + j13;
        if (-4611686018426L > j14 || j14 >= 4611686018427L) {
            return d0.c.f(com.bumptech.glide.d.n(j14));
        }
        return d0.c.g((j14 * j12) + (j11 - (j13 * j12)));
    }

    public static final void b(StringBuilder sb2, int i10, int i11, int i12, String str, boolean z10) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String strC0 = an.h.C0(String.valueOf(i11), i12, '0');
            int i13 = -1;
            int length = strC0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strC0.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (z10 || i15 >= 3) {
                sb2.append((CharSequence) strC0, 0, ((i13 + 3) / 3) * 3);
            } else {
                sb2.append((CharSequence) strC0, 0, i15);
            }
        }
        sb2.append(str);
    }

    public static int c(long j10, long j11) {
        long j12 = j10 ^ j11;
        if (j12 >= 0 && (((int) j12) & 1) != 0) {
            int i10 = (((int) j10) & 1) - (((int) j11) & 1);
            return j10 < 0 ? -i10 : i10;
        }
        if (j10 < j11) {
            return -1;
        }
        return j10 == j11 ? 0 : 1;
    }

    public static final long d(long j10) {
        return ((((int) j10) & 1) != 1 || e(j10)) ? h(j10, c.MILLISECONDS) : j10 >> 1;
    }

    public static final boolean e(long j10) {
        return j10 == f5741b || j10 == f5742c;
    }

    public static final long f(long j10, long j11) {
        if (e(j10)) {
            if (!e(j11) || (j11 ^ j10) >= 0) {
                return j10;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (e(j11)) {
            return j11;
        }
        int i10 = ((int) j10) & 1;
        if (i10 != (((int) j11) & 1)) {
            return i10 == 1 ? a(j10 >> 1, j11 >> 1) : a(j11 >> 1, j10 >> 1);
        }
        long j12 = (j10 >> 1) + (j11 >> 1);
        if (i10 == 0) {
            return (-4611686018426999999L > j12 || j12 >= 4611686018427000000L) ? d0.c.f(j12 / ((long) 1000000)) : d0.c.g(j12);
        }
        return (-4611686018426L > j12 || j12 >= 4611686018427L) ? d0.c.f(com.bumptech.glide.d.n(j12)) : d0.c.g(j12 * ((long) 1000000));
    }

    public static final double g(long j10, c targetUnit) {
        n.f(targetUnit, "unit");
        if (j10 == f5741b) {
            return Double.POSITIVE_INFINITY;
        }
        if (j10 == f5742c) {
            return Double.NEGATIVE_INFINITY;
        }
        double d10 = j10 >> 1;
        c sourceUnit = (((int) j10) & 1) == 0 ? c.NANOSECONDS : c.MILLISECONDS;
        n.f(sourceUnit, "sourceUnit");
        n.f(targetUnit, "targetUnit");
        TimeUnit timeUnit = targetUnit.f5753a;
        TimeUnit timeUnit2 = sourceUnit.f5753a;
        long jConvert = timeUnit.convert(1L, timeUnit2);
        return jConvert > 0 ? d10 * jConvert : d10 / timeUnit2.convert(1L, timeUnit);
    }

    public static final long h(long j10, c unit) {
        n.f(unit, "unit");
        if (j10 == f5741b) {
            return Long.MAX_VALUE;
        }
        if (j10 == f5742c) {
            return Long.MIN_VALUE;
        }
        return go.c.c(j10 >> 1, (((int) j10) & 1) == 0 ? c.NANOSECONDS : c.MILLISECONDS, unit);
    }

    public static final long i(long j10) {
        long j11 = ((-(j10 >> 1)) << 1) + ((long) (((int) j10) & 1));
        int i10 = b.f5745a;
        return j11;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.f5744a, ((a) obj).f5744a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f5744a == ((a) obj).f5744a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f5744a);
    }

    public final String toString() {
        int i10;
        long jI = this.f5744a;
        if (jI == 0) {
            return "0s";
        }
        if (jI == f5741b) {
            return "Infinity";
        }
        if (jI == f5742c) {
            return "-Infinity";
        }
        int i11 = 0;
        boolean z10 = jI < 0;
        StringBuilder sb2 = new StringBuilder();
        if (z10) {
            sb2.append('-');
        }
        if (jI < 0) {
            jI = i(jI);
        }
        long jH = h(jI, c.DAYS);
        int iH = e(jI) ? 0 : (int) (h(jI, c.HOURS) % ((long) 24));
        int iH2 = e(jI) ? 0 : (int) (h(jI, c.MINUTES) % ((long) 60));
        int iH3 = e(jI) ? 0 : (int) (h(jI, c.SECONDS) % ((long) 60));
        if (e(jI)) {
            i10 = 0;
        } else {
            i10 = (int) ((((int) jI) & 1) == 1 ? ((jI >> 1) % ((long) 1000)) * ((long) 1000000) : (jI >> 1) % ((long) Http2Connection.DEGRADED_PONG_TIMEOUT_NS));
        }
        boolean z11 = jH != 0;
        boolean z12 = iH != 0;
        boolean z13 = iH2 != 0;
        boolean z14 = (iH3 == 0 && i10 == 0) ? false : true;
        if (z11) {
            sb2.append(jH);
            sb2.append('d');
            i11 = 1;
        }
        if (z12 || (z11 && (z13 || z14))) {
            int i12 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(iH);
            sb2.append('h');
            i11 = i12;
        }
        if (z13 || (z14 && (z12 || z11))) {
            int i13 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            sb2.append(iH2);
            sb2.append('m');
            i11 = i13;
        }
        if (z14) {
            int i14 = i11 + 1;
            if (i11 > 0) {
                sb2.append(' ');
            }
            if (iH3 != 0 || z11 || z12 || z13) {
                b(sb2, iH3, i10, 9, "s", false);
            } else if (i10 >= 1000000) {
                b(sb2, i10 / 1000000, i10 % 1000000, 6, "ms", false);
            } else if (i10 >= 1000) {
                b(sb2, i10 / 1000, i10 % 1000, 3, "us", false);
            } else {
                sb2.append(i10);
                sb2.append("ns");
            }
            i11 = i14;
        }
        if (z10 && i11 > 1) {
            sb2.insert(1, '(').append(')');
        }
        return sb2.toString();
    }
}
