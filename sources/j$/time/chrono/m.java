package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public interface m extends Comparable {
    InterfaceC3540b A(int i2, int i3);

    List D();

    boolean E(long j);

    InterfaceC3540b G(int i2, int i3, int i4);

    InterfaceC3540b M();

    n P(int i2);

    InterfaceC3540b R(Map map, j$.time.format.F f);

    String T();

    j$.time.temporal.w W(j$.time.temporal.a aVar);

    boolean equals(Object obj);

    int hashCode();

    InterfaceC3540b q(long j);

    String s();

    InterfaceC3540b t(TemporalAccessor temporalAccessor);

    String toString();

    int w(n nVar, int i2);

    InterfaceC3548j y(Instant instant, ZoneId zoneId);

    static m F(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        m mVar = (m) temporalAccessor.a(j$.time.temporal.s.a());
        t tVar = t.d;
        if (mVar != null) {
            return mVar;
        }
        Objects.requireNonNull(tVar, "defaultObj");
        return tVar;
    }

    default InterfaceC3543e x(LocalDateTime localDateTime) {
        try {
            return t(localDateTime).L(j$.time.k.J(localDateTime));
        } catch (j$.time.c e2) {
            throw new j$.time.c("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e2);
        }
    }
}
