package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC3540b;
import j$.time.temporal.TemporalAccessor;

/* JADX INFO: loaded from: classes2.dex */
final class y implements TemporalAccessor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC3540b f43137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Object f43138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ j$.time.chrono.m f43139c;
    final /* synthetic */ ZoneId d;

    y(InterfaceC3540b interfaceC3540b, TemporalAccessor temporalAccessor, j$.time.chrono.m mVar, ZoneId zoneId) {
        this.f43137a = interfaceC3540b;
        this.f43138b = temporalAccessor;
        this.f43139c = mVar;
        this.d = zoneId;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.TemporalAccessor, java.lang.Object] */
    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        InterfaceC3540b interfaceC3540b = this.f43137a;
        if (interfaceC3540b != null && rVar.V()) {
            return interfaceC3540b.d(rVar);
        }
        return this.f43138b.d(rVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.TemporalAccessor, java.lang.Object] */
    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w k(j$.time.temporal.r rVar) {
        InterfaceC3540b interfaceC3540b = this.f43137a;
        if (interfaceC3540b != null && rVar.V()) {
            return interfaceC3540b.k(rVar);
        }
        return this.f43138b.k(rVar);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.TemporalAccessor, java.lang.Object] */
    @Override // j$.time.temporal.TemporalAccessor
    public final long e(j$.time.temporal.r rVar) {
        InterfaceC3540b interfaceC3540b = this.f43137a;
        if (interfaceC3540b != null && rVar.V()) {
            return interfaceC3540b.e(rVar);
        }
        return this.f43138b.e(rVar);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [j$.time.temporal.TemporalAccessor, java.lang.Object] */
    @Override // j$.time.temporal.TemporalAccessor
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.a()) {
            return this.f43139c;
        }
        if (tVar == j$.time.temporal.s.g()) {
            return this.d;
        }
        if (tVar == j$.time.temporal.s.e()) {
            return this.f43138b.a(tVar);
        }
        return tVar.i(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.m mVar = this.f43139c;
        if (mVar != null) {
            str = " with chronology " + mVar;
        } else {
            str = "";
        }
        ZoneId zoneId = this.d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.f43138b + str + str2;
    }
}
