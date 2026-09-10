package j$.time;

import com.vungle.ads.internal.protos.Sdk;
import j$.time.temporal.TemporalAccessor;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class m implements TemporalAccessor, j$.time.temporal.n {
    public static final m APRIL;
    public static final m AUGUST;
    public static final m DECEMBER;
    public static final m FEBRUARY;
    public static final m JANUARY;
    public static final m JULY;
    public static final m JUNE;
    public static final m MARCH;
    public static final m MAY;
    public static final m NOVEMBER;
    public static final m OCTOBER;
    public static final m SEPTEMBER;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m[] f43158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ m[] f43159b;

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f43159b.clone();
    }

    static {
        m mVar = new m("JANUARY", 0);
        JANUARY = mVar;
        m mVar2 = new m("FEBRUARY", 1);
        FEBRUARY = mVar2;
        m mVar3 = new m("MARCH", 2);
        MARCH = mVar3;
        m mVar4 = new m("APRIL", 3);
        APRIL = mVar4;
        m mVar5 = new m("MAY", 4);
        MAY = mVar5;
        m mVar6 = new m("JUNE", 5);
        JUNE = mVar6;
        m mVar7 = new m("JULY", 6);
        JULY = mVar7;
        m mVar8 = new m("AUGUST", 7);
        AUGUST = mVar8;
        m mVar9 = new m("SEPTEMBER", 8);
        SEPTEMBER = mVar9;
        m mVar10 = new m("OCTOBER", 9);
        OCTOBER = mVar10;
        m mVar11 = new m("NOVEMBER", 10);
        NOVEMBER = mVar11;
        m mVar12 = new m("DECEMBER", 11);
        DECEMBER = mVar12;
        f43159b = new m[]{mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, mVar11, mVar12};
        f43158a = values();
    }

    public static m U(int i2) {
        if (i2 < 1 || i2 > 12) {
            throw new c("Invalid value for MonthOfYear: " + i2);
        }
        return f43158a[i2 - 1];
    }

    public final int p() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return rVar == j$.time.temporal.a.MONTH_OF_YEAR;
        }
        return rVar != null && rVar.Y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w k(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return rVar.C();
        }
        return super.k(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return p();
        }
        return super.g(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long e(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return p();
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        return rVar.r(this);
    }

    public final m V() {
        return f43158a[((((int) 1) + 12) + ordinal()) % 12];
    }

    public final int C(boolean z2) {
        int i2 = l.f43157a[ordinal()];
        if (i2 != 1) {
            return (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) ? 30 : 31;
        }
        return z2 ? 29 : 28;
    }

    public final int J() {
        int i2 = l.f43157a[ordinal()];
        if (i2 != 1) {
            return (i2 == 2 || i2 == 3 || i2 == 4 || i2 == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int r(boolean z2) {
        switch (l.f43157a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z2 ? 1 : 0) + 91;
            case 3:
                return (z2 ? 1 : 0) + 152;
            case 4:
                return (z2 ? 1 : 0) + 244;
            case 5:
                return (z2 ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z2 ? 1 : 0) + 60;
            case 8:
                return (z2 ? 1 : 0) + 121;
            case 9:
                return (z2 ? 1 : 0) + 182;
            case 10:
                return (z2 ? 1 : 0) + Sdk.SDKError.Reason.INVALID_ADUNIT_BID_PAYLOAD_VALUE;
            case 11:
                return (z2 ? 1 : 0) + 274;
            default:
                return (z2 ? 1 : 0) + 335;
        }
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.a()) {
            return j$.time.chrono.t.d;
        }
        if (tVar == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.MONTHS;
        }
        return super.a(tVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m b(j$.time.temporal.m mVar) {
        if (!j$.time.chrono.m.F(mVar).equals(j$.time.chrono.t.d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        return mVar.h(p(), j$.time.temporal.a.MONTH_OF_YEAR);
    }
}
