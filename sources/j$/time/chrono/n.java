package j$.time.chrono;

import j$.time.temporal.TemporalAccessor;

/* JADX INFO: loaded from: classes2.dex */
public interface n extends TemporalAccessor, j$.time.temporal.n {
    int p();

    @Override // j$.time.temporal.TemporalAccessor
    default boolean d(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return rVar == j$.time.temporal.a.ERA;
        }
        return rVar != null && rVar.Y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default int g(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.ERA) {
            return p();
        }
        return super.g(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long e(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.ERA) {
            return p();
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
        return rVar.r(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.ERAS;
        }
        return super.a(tVar);
    }

    @Override // j$.time.temporal.n
    default j$.time.temporal.m b(j$.time.temporal.m mVar) {
        return mVar.h(p(), j$.time.temporal.a.ERA);
    }
}
