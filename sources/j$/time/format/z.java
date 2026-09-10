package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC3540b;
import j$.time.temporal.TemporalAccessor;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private TemporalAccessor f43140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private DateTimeFormatter f43141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f43142c;

    z(TemporalAccessor temporalAccessor, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.m mVarB = dateTimeFormatter.b();
        if (mVarB != null) {
            j$.time.chrono.m mVar = (j$.time.chrono.m) temporalAccessor.a(j$.time.temporal.s.a());
            ZoneId zoneId = (ZoneId) temporalAccessor.a(j$.time.temporal.s.g());
            InterfaceC3540b interfaceC3540bT = null;
            mVarB = Objects.equals(mVarB, mVar) ? null : mVarB;
            if (mVarB != null) {
                j$.time.chrono.m mVar2 = mVarB != null ? mVarB : mVar;
                if (mVarB != null) {
                    if (temporalAccessor.d(j$.time.temporal.a.EPOCH_DAY)) {
                        interfaceC3540bT = mVar2.t(temporalAccessor);
                    } else if (mVarB != j$.time.chrono.t.d || mVar != null) {
                        for (j$.time.temporal.a aVar : j$.time.temporal.a.values()) {
                            if (aVar.V() && temporalAccessor.d(aVar)) {
                                throw new j$.time.c("Unable to apply override chronology '" + mVarB + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + temporalAccessor);
                            }
                        }
                    }
                }
                temporalAccessor = new y(interfaceC3540bT, temporalAccessor, mVar2, zoneId);
            }
        }
        this.f43140a = temporalAccessor;
        this.f43141b = dateTimeFormatter;
    }

    final TemporalAccessor d() {
        return this.f43140a;
    }

    final Locale c() {
        return this.f43141b.d();
    }

    final D b() {
        return this.f43141b.c();
    }

    final void g() {
        this.f43142c++;
    }

    final void a() {
        this.f43142c--;
    }

    final Object f(j$.time.temporal.t tVar) {
        TemporalAccessor temporalAccessor = this.f43140a;
        Object objA = temporalAccessor.a(tVar);
        if (objA != null || this.f43142c != 0) {
            return objA;
        }
        throw new j$.time.c("Unable to extract " + tVar + " from temporal " + temporalAccessor);
    }

    final Long e(j$.time.temporal.r rVar) {
        int i2 = this.f43142c;
        TemporalAccessor temporalAccessor = this.f43140a;
        if (i2 <= 0 || temporalAccessor.d(rVar)) {
            return Long.valueOf(temporalAccessor.e(rVar));
        }
        return null;
    }

    public final String toString() {
        return this.f43140a.toString();
    }
}
