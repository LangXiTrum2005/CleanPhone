package j$.time.temporal;

import j$.time.format.F;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
enum k implements r {
    JULIAN_DAY("JulianDay", 2440588),
    MODIFIED_JULIAN_DAY("ModifiedJulianDay", 40587),
    RATA_DIE("RataDie", 719163);

    private static final long serialVersionUID = -7501623920830201812L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient String f43186a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient w f43187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient long f43188c;

    @Override // j$.time.temporal.r
    public final boolean V() {
        return true;
    }

    static {
        b bVar = b.NANOS;
    }

    k(String str, long j) {
        this.f43186a = str;
        this.f43187b = w.j((-365243219162L) + j, 365241780471L + j);
        this.f43188c = j;
    }

    @Override // j$.time.temporal.r
    public final w C() {
        return this.f43187b;
    }

    @Override // j$.time.temporal.r
    public final w J(TemporalAccessor temporalAccessor) {
        if (temporalAccessor.d(a.EPOCH_DAY)) {
            return this.f43187b;
        }
        throw new j$.time.c("Unsupported field: " + this);
    }

    @Override // j$.time.temporal.r
    public final boolean Y(TemporalAccessor temporalAccessor) {
        return temporalAccessor.d(a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.r
    public final long r(TemporalAccessor temporalAccessor) {
        return temporalAccessor.e(a.EPOCH_DAY) + this.f43188c;
    }

    @Override // j$.time.temporal.r
    public final m p(m mVar, long j) {
        if (!this.f43187b.i(j)) {
            throw new j$.time.c("Invalid value: " + this.f43186a + " " + j);
        }
        return mVar.h(Math.subtractExact(j, this.f43188c), a.EPOCH_DAY);
    }

    @Override // j$.time.temporal.r
    public final TemporalAccessor U(HashMap map, TemporalAccessor temporalAccessor, F f) {
        long jLongValue = ((Long) map.remove(this)).longValue();
        j$.time.chrono.m mVarF = j$.time.chrono.m.F(temporalAccessor);
        F f2 = F.LENIENT;
        long j = this.f43188c;
        if (f == f2) {
            return mVarF.q(Math.subtractExact(jLongValue, j));
        }
        this.f43187b.b(jLongValue, this);
        return mVarF.q(jLongValue - j);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f43186a;
    }
}
