package j$.time.temporal;

import j$.time.ZoneId;
import j$.time.ZoneOffset;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class p implements t, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f43192a;

    public /* synthetic */ p(int i2) {
        this.f43192a = i2;
    }

    @Override // j$.time.temporal.n
    public m b(m mVar) {
        a aVar = a.DAY_OF_MONTH;
        return mVar.h(mVar.k(aVar).d(), aVar);
    }

    @Override // j$.time.temporal.t
    public Object i(TemporalAccessor temporalAccessor) {
        switch (this.f43192a) {
            case 1:
                return (ZoneId) temporalAccessor.a(s.f43193a);
            case 2:
                return (j$.time.chrono.m) temporalAccessor.a(s.f43194b);
            case 3:
                return (u) temporalAccessor.a(s.f43195c);
            case 4:
                a aVar = a.OFFSET_SECONDS;
                if (temporalAccessor.d(aVar)) {
                    return ZoneOffset.f0(temporalAccessor.g(aVar));
                }
                return null;
            case 5:
                ZoneId zoneId = (ZoneId) temporalAccessor.a(s.f43193a);
                return zoneId != null ? zoneId : (ZoneId) temporalAccessor.a(s.d);
            case 6:
                a aVar2 = a.EPOCH_DAY;
                if (temporalAccessor.d(aVar2)) {
                    return j$.time.h.j0(temporalAccessor.e(aVar2));
                }
                return null;
            default:
                a aVar3 = a.NANO_OF_DAY;
                if (temporalAccessor.d(aVar3)) {
                    return j$.time.k.e0(temporalAccessor.e(aVar3));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.f43192a) {
            case 1:
                return "ZoneId";
            case 2:
                return "Chronology";
            case 3:
                return "Precision";
            case 4:
                return "ZoneOffset";
            case 5:
                return "Zone";
            case 6:
                return "LocalDate";
            case 7:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
