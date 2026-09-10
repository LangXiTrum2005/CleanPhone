package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.pq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4350pq implements Comparable {
    public static final long b;
    public static final long c;
    public static final /* synthetic */ int d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f4853a;

    static {
        int i = AbstractC4438qq.f4905a;
        b = AbstractC2340Cl.s(4611686018427387903L);
        c = AbstractC2340Cl.s(-4611686018427387903L);
    }

    public static final long a(long j, long j2) {
        long j3 = 1000000;
        long j4 = j2 / j3;
        long j5 = j + j4;
        if (!new EJ(-4611686018426L, 4611686018426L).a(j5)) {
            return AbstractC2340Cl.s(AbstractC3375el.q(j5));
        }
        long j6 = ((j5 * j3) + (j2 - (j4 * j3))) << 1;
        int i = AbstractC4438qq.f4905a;
        return j6;
    }

    public static final void b(StringBuilder sb, int i, int i2, int i3, String str, boolean z) {
        sb.append(i);
        if (i2 != 0) {
            sb.append('.');
            String strZ0 = AbstractC3089ba0.z0(String.valueOf(i2), i3);
            int i4 = -1;
            int length = strZ0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i5 = length - 1;
                    if (strZ0.charAt(length) != '0') {
                        i4 = length;
                        break;
                    } else if (i5 < 0) {
                        break;
                    } else {
                        length = i5;
                    }
                }
            }
            int i6 = i4 + 1;
            if (z || i6 >= 3) {
                sb.append((CharSequence) strZ0, 0, ((i4 + 3) / 3) * 3);
            } else {
                sb.append((CharSequence) strZ0, 0, i6);
            }
        }
        sb.append(str);
    }

    public static int c(long j, long j2) {
        long j3 = j ^ j2;
        if (j3 >= 0 && (((int) j3) & 1) != 0) {
            int i = (((int) j) & 1) - (((int) j2) & 1);
            return j < 0 ? -i : i;
        }
        if (j < j2) {
            return -1;
        }
        return j == j2 ? 0 : 1;
    }

    public static final int d(long j) {
        if (e(j)) {
            return 0;
        }
        return (int) ((((int) j) & 1) == 1 ? ((j >> 1) % ((long) 1000)) * ((long) 1000000) : (j >> 1) % ((long) 1000000000));
    }

    public static final boolean e(long j) {
        return j == b || j == c;
    }

    public static final long f(long j, long j2) {
        if (e(j)) {
            if ((!e(j2)) || (j2 ^ j) >= 0) {
                return j;
            }
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (e(j2)) {
            return j2;
        }
        int i = ((int) j) & 1;
        if (i != (((int) j2) & 1)) {
            return i == 1 ? a(j >> 1, j2 >> 1) : a(j2 >> 1, j >> 1);
        }
        long j3 = (j >> 1) + (j2 >> 1);
        if (i != 0) {
            return AbstractC2340Cl.t(j3);
        }
        if (!new EJ(-4611686018426999999L, 4611686018426999999L).a(j3)) {
            return AbstractC2340Cl.s(j3 / ((long) 1000000));
        }
        long j4 = j3 << 1;
        int i2 = AbstractC4438qq.f4905a;
        return j4;
    }

    public static final double g(long j, EnumC4613sq enumC4613sq) {
        AbstractC2995aW.q(enumC4613sq, "unit");
        if (j == b) {
            return Double.POSITIVE_INFINITY;
        }
        if (j == c) {
            return Double.NEGATIVE_INFINITY;
        }
        return AbstractC2340Cl.p(j >> 1, (((int) j) & 1) == 0 ? EnumC4613sq.NANOSECONDS : EnumC4613sq.MILLISECONDS, enumC4613sq);
    }

    public static final long h(long j, EnumC4613sq enumC4613sq) {
        AbstractC2995aW.q(enumC4613sq, "unit");
        if (j == b) {
            return Long.MAX_VALUE;
        }
        if (j == c) {
            return Long.MIN_VALUE;
        }
        return AbstractC2340Cl.q(j >> 1, (((int) j) & 1) == 0 ? EnumC4613sq.NANOSECONDS : EnumC4613sq.MILLISECONDS, enumC4613sq);
    }

    public static final long i(long j) {
        long j2 = ((-(j >> 1)) << 1) + ((long) (((int) j) & 1));
        int i = AbstractC4438qq.f4905a;
        return j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return c(this.f4853a, ((C4350pq) obj).f4853a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C4350pq) {
            return this.f4853a == ((C4350pq) obj).f4853a;
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f4853a;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        int i;
        long jI = this.f4853a;
        if (jI == 0) {
            return "0s";
        }
        if (jI == b) {
            return "Infinity";
        }
        if (jI == c) {
            return "-Infinity";
        }
        boolean z = jI < 0;
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append('-');
        }
        if (jI < 0) {
            jI = i(jI);
        }
        long jH = h(jI, EnumC4613sq.DAYS);
        int iH = e(jI) ? 0 : (int) (h(jI, EnumC4613sq.HOURS) % ((long) 24));
        int iH2 = e(jI) ? 0 : (int) (h(jI, EnumC4613sq.MINUTES) % ((long) 60));
        int iH3 = e(jI) ? 0 : (int) (h(jI, EnumC4613sq.SECONDS) % ((long) 60));
        int iD = d(jI);
        boolean z2 = jH != 0;
        boolean z3 = iH != 0;
        boolean z4 = iH2 != 0;
        boolean z5 = (iH3 == 0 && iD == 0) ? false : true;
        if (z2) {
            sb.append(jH);
            sb.append('d');
            i = 1;
        } else {
            i = 0;
        }
        if (z3 || (z2 && (z4 || z5))) {
            int i2 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iH);
            sb.append('h');
            i = i2;
        }
        if (z4 || (z5 && (z3 || z2))) {
            int i3 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            sb.append(iH2);
            sb.append('m');
            i = i3;
        }
        if (z5) {
            int i4 = i + 1;
            if (i > 0) {
                sb.append(' ');
            }
            if (iH3 != 0 || z2 || z3 || z4) {
                b(sb, iH3, iD, 9, com.umeng.analytics.pro.bc.aH, false);
            } else if (iD >= 1000000) {
                b(sb, iD / 1000000, iD % 1000000, 6, "ms", false);
            } else if (iD >= 1000) {
                b(sb, iD / 1000, iD % 1000, 3, "us", false);
            } else {
                sb.append(iD);
                sb.append("ns");
            }
            i = i4;
        }
        if (z && i > 1) {
            sb.insert(1, '(').append(')');
        }
        String string = sb.toString();
        AbstractC2995aW.p(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
