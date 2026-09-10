package j$.time.temporal;

import j$.time.format.F;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public interface r {
    w C();

    w J(TemporalAccessor temporalAccessor);

    boolean V();

    boolean Y(TemporalAccessor temporalAccessor);

    m p(m mVar, long j);

    long r(TemporalAccessor temporalAccessor);

    default TemporalAccessor U(HashMap map, TemporalAccessor temporalAccessor, F f) {
        return null;
    }
}
