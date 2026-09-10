package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;

/* JADX INFO: renamed from: j$.time.chrono.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3548j extends j$.time.temporal.m, Comparable {
    InterfaceC3543e B();

    InterfaceC3548j I(ZoneId zoneId);

    ZoneId S();

    ZoneOffset getOffset();

    @Override // j$.time.temporal.TemporalAccessor
    default j$.time.temporal.w k(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.INSTANT_SECONDS || rVar == j$.time.temporal.a.OFFSET_SECONDS) {
                return ((j$.time.temporal.a) rVar).C();
            }
            return B().k(rVar);
        }
        return rVar.J(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default int g(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i2 = AbstractC3547i.f43037a[((j$.time.temporal.a) rVar).ordinal()];
            if (i2 == 1) {
                throw new j$.time.temporal.v("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i2 == 2) {
                return getOffset().getTotalSeconds();
            }
            return B().g(rVar);
        }
        return super.g(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long e(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            int i2 = AbstractC3547i.f43037a[((j$.time.temporal.a) rVar).ordinal()];
            if (i2 == 1) {
                return Q();
            }
            if (i2 == 2) {
                return getOffset().getTotalSeconds();
            }
            return B().e(rVar);
        }
        return rVar.r(this);
    }

    default InterfaceC3540b o() {
        return B().o();
    }

    default j$.time.k n() {
        return B().n();
    }

    default m f() {
        return o().f();
    }

    @Override // j$.time.temporal.m
    default InterfaceC3548j m(j$.time.temporal.n nVar) {
        return l.r(f(), nVar.b(this));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    default InterfaceC3548j c(long j, j$.time.temporal.b bVar) {
        return l.r(f(), super.c(j, bVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.f() || tVar == j$.time.temporal.s.g()) {
            return S();
        }
        if (tVar == j$.time.temporal.s.d()) {
            return getOffset();
        }
        if (tVar == j$.time.temporal.s.c()) {
            return n();
        }
        if (tVar == j$.time.temporal.s.a()) {
            return f();
        }
        if (tVar == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.NANOS;
        }
        return tVar.i(this);
    }

    default long Q() {
        return ((o().v() * 86400) + ((long) n().n0())) - ((long) getOffset().getTotalSeconds());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    default int compareTo(InterfaceC3548j interfaceC3548j) {
        int iCompare = Long.compare(Q(), interfaceC3548j.Q());
        return (iCompare == 0 && (iCompare = n().Y() - interfaceC3548j.n().Y()) == 0 && (iCompare = B().compareTo(interfaceC3548j.B())) == 0 && (iCompare = S().s().compareTo(interfaceC3548j.S().s())) == 0) ? ((AbstractC3539a) f()).s().compareTo(interfaceC3548j.f().s()) : iCompare;
    }
}
