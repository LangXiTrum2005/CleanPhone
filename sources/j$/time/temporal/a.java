package j$.time.temporal;

/* JADX INFO: loaded from: classes2.dex */
public enum a implements r {
    NANO_OF_SECOND("NanoOfSecond", w.j(0, 999999999)),
    NANO_OF_DAY("NanoOfDay", w.j(0, 86399999999999L)),
    MICRO_OF_SECOND("MicroOfSecond", w.j(0, 999999)),
    MICRO_OF_DAY("MicroOfDay", w.j(0, 86399999999L)),
    MILLI_OF_SECOND("MilliOfSecond", w.j(0, 999)),
    MILLI_OF_DAY("MilliOfDay", w.j(0, 86399999)),
    SECOND_OF_MINUTE("SecondOfMinute", w.j(0, 59), 0),
    SECOND_OF_DAY("SecondOfDay", w.j(0, 86399)),
    MINUTE_OF_HOUR("MinuteOfHour", w.j(0, 59), 0),
    MINUTE_OF_DAY("MinuteOfDay", w.j(0, 1439)),
    HOUR_OF_AMPM("HourOfAmPm", w.j(0, 11)),
    CLOCK_HOUR_OF_AMPM("ClockHourOfAmPm", w.j(1, 12)),
    HOUR_OF_DAY("HourOfDay", w.j(0, 23), 0),
    CLOCK_HOUR_OF_DAY("ClockHourOfDay", w.j(1, 24)),
    AMPM_OF_DAY("AmPmOfDay", w.j(0, 1), 0),
    DAY_OF_WEEK("DayOfWeek", w.j(1, 7), 0),
    ALIGNED_DAY_OF_WEEK_IN_MONTH("AlignedDayOfWeekInMonth", w.j(1, 7)),
    ALIGNED_DAY_OF_WEEK_IN_YEAR("AlignedDayOfWeekInYear", w.j(1, 7)),
    DAY_OF_MONTH("DayOfMonth", w.k(1, 28, 31), 0),
    DAY_OF_YEAR("DayOfYear", w.k(1, 365, 366)),
    EPOCH_DAY("EpochDay", w.j(-365243219162L, 365241780471L)),
    ALIGNED_WEEK_OF_MONTH("AlignedWeekOfMonth", w.k(1, 4, 5)),
    ALIGNED_WEEK_OF_YEAR("AlignedWeekOfYear", w.j(1, 53)),
    MONTH_OF_YEAR("MonthOfYear", w.j(1, 12), 0),
    PROLEPTIC_MONTH("ProlepticMonth", w.j(-11999999988L, 11999999999L)),
    YEAR_OF_ERA("YearOfEra", w.k(1, 999999999, 1000000000)),
    YEAR("Year", w.j(-999999999, 999999999), 0),
    ERA("Era", w.j(0, 1), 0),
    INSTANT_SECONDS("InstantSeconds", w.j(Long.MIN_VALUE, Long.MAX_VALUE)),
    OFFSET_SECONDS("OffsetSeconds", w.j(-64800, 64800));


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f43174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final w f43175b;

    static {
        b bVar = b.NANOS;
    }

    a(String str, w wVar) {
        this.f43174a = str;
        this.f43175b = wVar;
    }

    a(String str, w wVar, int i2) {
        this.f43174a = str;
        this.f43175b = wVar;
    }

    @Override // j$.time.temporal.r
    public final w C() {
        return this.f43175b;
    }

    @Override // j$.time.temporal.r
    public final boolean V() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public final boolean d0() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    public final void c0(long j) {
        this.f43175b.b(j, this);
    }

    public final int b0(long j) {
        return this.f43175b.a(j, this);
    }

    @Override // j$.time.temporal.r
    public final boolean Y(TemporalAccessor temporalAccessor) {
        return temporalAccessor.d(this);
    }

    @Override // j$.time.temporal.r
    public final w J(TemporalAccessor temporalAccessor) {
        return temporalAccessor.k(this);
    }

    @Override // j$.time.temporal.r
    public final long r(TemporalAccessor temporalAccessor) {
        return temporalAccessor.e(this);
    }

    @Override // j$.time.temporal.r
    public final m p(m mVar, long j) {
        return mVar.h(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f43174a;
    }
}
