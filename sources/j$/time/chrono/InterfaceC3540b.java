package j$.time.chrono;

/* JADX INFO: renamed from: j$.time.chrono.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3540b extends j$.time.temporal.m, j$.time.temporal.n, Comparable {
    InterfaceC3540b N(j$.time.temporal.q qVar);

    boolean equals(Object obj);

    m f();

    @Override // j$.time.temporal.m
    InterfaceC3540b h(long j, j$.time.temporal.r rVar);

    int hashCode();

    @Override // j$.time.temporal.m
    InterfaceC3540b l(long j, j$.time.temporal.u uVar);

    InterfaceC3540b m(j$.time.temporal.n nVar);

    String toString();

    default n u() {
        return f().P(g(j$.time.temporal.a.ERA));
    }

    default boolean O() {
        return f().E(e(j$.time.temporal.a.YEAR));
    }

    default int K() {
        return O() ? 366 : 365;
    }

    @Override // j$.time.temporal.TemporalAccessor
    default boolean d(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).V();
        }
        return rVar != null && rVar.Y(this);
    }

    @Override // j$.time.temporal.m
    default InterfaceC3540b c(long j, j$.time.temporal.u uVar) {
        return AbstractC3542d.r(f(), super.c(j, uVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.g() || tVar == j$.time.temporal.s.f() || tVar == j$.time.temporal.s.d() || tVar == j$.time.temporal.s.c()) {
            return null;
        }
        if (tVar == j$.time.temporal.s.a()) {
            return f();
        }
        if (tVar == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.DAYS;
        }
        return tVar.i(this);
    }

    @Override // j$.time.temporal.n
    default j$.time.temporal.m b(j$.time.temporal.m mVar) {
        return mVar.h(v(), j$.time.temporal.a.EPOCH_DAY);
    }

    default InterfaceC3543e L(j$.time.k kVar) {
        return C3545g.C(this, kVar);
    }

    default long v() {
        return e(j$.time.temporal.a.EPOCH_DAY);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: X */
    default int compareTo(InterfaceC3540b interfaceC3540b) {
        int iCompare = Long.compare(v(), interfaceC3540b.v());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC3539a) f()).s().compareTo(interfaceC3540b.f().s());
    }
}
