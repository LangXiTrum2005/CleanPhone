package j$.time.chrono;

import com.p004ironsource.d9;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class l implements InterfaceC3548j, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final transient C3545g f43039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient ZoneOffset f43040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient ZoneId f43041c;

    static InterfaceC3548j C(ZoneId zoneId, ZoneOffset zoneOffset, C3545g c3545g) {
        Objects.requireNonNull(c3545g, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new l(zoneId, (ZoneOffset) zoneId, c3545g);
        }
        j$.time.zone.f fVarC = zoneId.C();
        LocalDateTime localDateTimeC = LocalDateTime.C(c3545g);
        List listG = fVarC.g(localDateTimeC);
        if (listG.size() == 1) {
            zoneOffset = (ZoneOffset) listG.get(0);
        } else if (listG.size() == 0) {
            j$.time.zone.b bVarF = fVarC.f(localDateTimeC);
            c3545g = c3545g.U(bVarF.C().J());
            zoneOffset = bVarF.J();
        } else if (zoneOffset == null || !listG.contains(zoneOffset)) {
            zoneOffset = (ZoneOffset) listG.get(0);
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new l(zoneId, zoneOffset, c3545g);
    }

    static l J(m mVar, Instant instant, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.C().d(instant);
        Objects.requireNonNull(zoneOffsetD, "offset");
        return new l(zoneId, zoneOffsetD, (C3545g) mVar.x(LocalDateTime.f0(instant.C(), instant.J(), zoneOffsetD)));
    }

    static l r(m mVar, j$.time.temporal.m mVar2) {
        l lVar = (l) mVar2;
        if (mVar.equals(lVar.f())) {
            return lVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + mVar.s() + ", actual: " + lVar.f().s());
    }

    private l(ZoneId zoneId, ZoneOffset zoneOffset, C3545g c3545g) {
        Objects.requireNonNull(c3545g, "dateTime");
        this.f43039a = c3545g;
        Objects.requireNonNull(zoneOffset, "offset");
        this.f43040b = zoneOffset;
        Objects.requireNonNull(zoneId, "zone");
        this.f43041c = zoneId;
    }

    @Override // j$.time.chrono.InterfaceC3548j
    public final ZoneOffset getOffset() {
        return this.f43040b;
    }

    @Override // j$.time.chrono.InterfaceC3548j
    public final InterfaceC3543e B() {
        return this.f43039a;
    }

    @Override // j$.time.chrono.InterfaceC3548j
    public final ZoneId S() {
        return this.f43041c;
    }

    @Override // j$.time.chrono.InterfaceC3548j
    public final InterfaceC3548j I(ZoneId zoneId) {
        return C(zoneId, this.f43040b, this.f43039a);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return true;
        }
        return rVar != null && rVar.Y(this);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m h(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
            int i2 = AbstractC3549k.f43038a[aVar.ordinal()];
            if (i2 == 1) {
                return l(j - Q(), j$.time.temporal.b.SECONDS);
            }
            ZoneId zoneId = this.f43041c;
            C3545g c3545g = this.f43039a;
            if (i2 != 2) {
                return C(zoneId, this.f43040b, c3545g.h(j, rVar));
            }
            return J(f(), Instant.V(c3545g.a0(ZoneOffset.f0(aVar.b0(j))), c3545g.n().Y()), zoneId);
        }
        return r(f(), rVar.p(this, j));
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public final InterfaceC3548j l(long j, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            return m(this.f43039a.l(j, uVar));
        }
        return r(f(), uVar.p(this, j));
    }

    private Object writeReplace() {
        return new F((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeObject(this.f43039a);
        objectOutput.writeObject(this.f43040b);
        objectOutput.writeObject(this.f43041c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC3548j) && compareTo((InterfaceC3548j) obj) == 0;
    }

    public final int hashCode() {
        return (this.f43039a.hashCode() ^ this.f43040b.hashCode()) ^ Integer.rotateLeft(this.f43041c.hashCode(), 3);
    }

    public final String toString() {
        String string = this.f43039a.toString();
        ZoneOffset zoneOffset = this.f43040b;
        String str = string + zoneOffset.toString();
        ZoneId zoneId = this.f43041c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + d9.i.d + zoneId.toString() + d9.i.f24752e;
    }
}
