package j$.time.temporal;

import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public interface TemporalAccessor {
    boolean d(r rVar);

    long e(r rVar);

    default w k(r rVar) {
        if (!(rVar instanceof a)) {
            Objects.requireNonNull(rVar, "field");
            return rVar.J(this);
        }
        if (d(rVar)) {
            return ((a) rVar).C();
        }
        throw new v(j$.time.d.a("Unsupported field: ", rVar));
    }

    default int g(r rVar) {
        w wVarK = k(rVar);
        if (!wVarK.h()) {
            throw new v("Invalid field " + rVar + " for get() method, use getLong() instead");
        }
        long jE = e(rVar);
        if (wVarK.i(jE)) {
            return (int) jE;
        }
        throw new j$.time.c("Invalid value for " + rVar + " (valid values " + wVarK + "): " + jE);
    }

    default Object a(t tVar) {
        if (tVar == s.f43193a || tVar == s.f43194b || tVar == s.f43195c) {
            return null;
        }
        return tVar.i(this);
    }
}
