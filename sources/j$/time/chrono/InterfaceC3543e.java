package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.util.Objects;

/* JADX INFO: renamed from: j$.time.chrono.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3543e extends j$.time.temporal.m, j$.time.temporal.n, Comparable {
    InterfaceC3548j H(ZoneId zoneId);

    j$.time.k n();

    InterfaceC3540b o();

    default m f() {
        return o().f();
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    default InterfaceC3543e c(long j, j$.time.temporal.b bVar) {
        return C3545g.r(f(), super.c(j, bVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.g() || tVar == j$.time.temporal.s.f() || tVar == j$.time.temporal.s.d()) {
            return null;
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

    @Override // j$.time.temporal.n
    default j$.time.temporal.m b(j$.time.temporal.m mVar) {
        return mVar.h(o().v(), j$.time.temporal.a.EPOCH_DAY).h(n().m0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    default long a0(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((o().v() * 86400) + ((long) n().n0())) - ((long) zoneOffset.getTotalSeconds());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: Z */
    default int compareTo(InterfaceC3543e interfaceC3543e) {
        int iCompareTo = o().compareTo(interfaceC3543e.o());
        return (iCompareTo == 0 && (iCompareTo = n().compareTo(interfaceC3543e.n())) == 0) ? ((AbstractC3539a) f()).s().compareTo(interfaceC3543e.f().s()) : iCompareTo;
    }
}
