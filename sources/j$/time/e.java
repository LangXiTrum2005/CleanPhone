package j$.time;

import j$.time.temporal.TemporalAccessor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements TemporalAccessor, j$.time.temporal.n {
    public static final e FRIDAY;
    public static final e MONDAY;
    public static final e SATURDAY;
    public static final e SUNDAY;
    public static final e THURSDAY;
    public static final e TUESDAY;
    public static final e WEDNESDAY;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final e[] f43062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ e[] f43063b;

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f43063b.clone();
    }

    static {
        e eVar = new e("MONDAY", 0);
        MONDAY = eVar;
        e eVar2 = new e("TUESDAY", 1);
        TUESDAY = eVar2;
        e eVar3 = new e("WEDNESDAY", 2);
        WEDNESDAY = eVar3;
        e eVar4 = new e("THURSDAY", 3);
        THURSDAY = eVar4;
        e eVar5 = new e("FRIDAY", 4);
        FRIDAY = eVar5;
        e eVar6 = new e("SATURDAY", 5);
        SATURDAY = eVar6;
        e eVar7 = new e("SUNDAY", 6);
        SUNDAY = eVar7;
        f43063b = new e[]{eVar, eVar2, eVar3, eVar4, eVar5, eVar6, eVar7};
        f43062a = values();
    }

    public static e r(int i2) {
        if (i2 < 1 || i2 > 7) {
            throw new c("Invalid value for DayOfWeek: " + i2);
        }
        return f43062a[i2 - 1];
    }

    public final int p() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return rVar == j$.time.temporal.a.DAY_OF_WEEK;
        }
        return rVar != null && rVar.Y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w k(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return rVar.C();
        }
        return super.k(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return p();
        }
        return super.g(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long e(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.DAY_OF_WEEK) {
            return p();
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        return rVar.r(this);
    }

    public final e C(long j) {
        return f43062a[((((int) (j % 7)) + 7) + ordinal()) % 7];
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.DAYS;
        }
        return super.a(tVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m b(j$.time.temporal.m mVar) {
        return mVar.h(p(), j$.time.temporal.a.DAY_OF_WEEK);
    }
}
