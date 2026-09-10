package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
enum i implements u {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43182a;

    static {
        Duration duration = Duration.f42994c;
    }

    i(String str) {
        this.f43182a = str;
    }

    @Override // j$.time.temporal.u
    public final m p(m mVar, long j) {
        int i2 = c.f43178a[ordinal()];
        if (i2 == 1) {
            r rVar = j.f43185c;
            return mVar.h(Math.addExact(mVar.g(rVar), j), rVar);
        }
        if (i2 == 2) {
            return mVar.l(j / 4, b.YEARS).l((j % 4) * 3, b.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f43182a;
    }
}
