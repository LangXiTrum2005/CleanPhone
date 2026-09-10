package j$.time;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import j$.time.temporal.TemporalAccessor;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements TemporalAccessor, j$.time.temporal.n, Comparable, Serializable {
    private static final long serialVersionUID = -939150713474957432L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43161a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43162b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o oVar = (o) obj;
        int i2 = this.f43161a - oVar.f43161a;
        return i2 == 0 ? this.f43162b - oVar.f43162b : i2;
    }

    static {
        j$.time.format.v vVar = new j$.time.format.v();
        vVar.f("--");
        vVar.o(j$.time.temporal.a.MONTH_OF_YEAR, 2);
        vVar.e('-');
        vVar.o(j$.time.temporal.a.DAY_OF_MONTH, 2);
        vVar.x();
    }

    private o(int i2, int i3) {
        this.f43161a = i2;
        this.f43162b = i3;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return rVar == j$.time.temporal.a.MONTH_OF_YEAR || rVar == j$.time.temporal.a.DAY_OF_MONTH;
        }
        return rVar != null && rVar.Y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.w k(j$.time.temporal.r rVar) {
        int i2;
        if (rVar == j$.time.temporal.a.MONTH_OF_YEAR) {
            return rVar.C();
        }
        if (rVar != j$.time.temporal.a.DAY_OF_MONTH) {
            return super.k(rVar);
        }
        int i3 = this.f43161a;
        m mVarU = m.U(i3);
        mVarU.getClass();
        int i4 = l.f43157a[mVarU.ordinal()];
        if (i4 != 1) {
            i2 = (i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5) ? 30 : 31;
        } else {
            i2 = 28;
        }
        return j$.time.temporal.w.k(1L, i2, m.U(i3).J());
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(j$.time.temporal.r rVar) {
        return k(rVar).a(e(rVar), rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long e(j$.time.temporal.r rVar) {
        int i2;
        if (!(rVar instanceof j$.time.temporal.a)) {
            return rVar.r(this);
        }
        int i3 = n.f43160a[((j$.time.temporal.a) rVar).ordinal()];
        if (i3 == 1) {
            i2 = this.f43162b;
        } else {
            if (i3 != 2) {
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
            }
            i2 = this.f43161a;
        }
        return i2;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.a()) {
            return j$.time.chrono.t.d;
        }
        return super.a(tVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m b(j$.time.temporal.m mVar) {
        if (!j$.time.chrono.m.F(mVar).equals(j$.time.chrono.t.d)) {
            throw new c("Adjustment only supported on ISO date-time");
        }
        j$.time.temporal.m mVarH = mVar.h(this.f43161a, j$.time.temporal.a.MONTH_OF_YEAR);
        j$.time.temporal.a aVar = j$.time.temporal.a.DAY_OF_MONTH;
        return mVarH.h(Math.min(mVarH.k(aVar).d(), this.f43162b), aVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof o) {
            o oVar = (o) obj;
            if (this.f43161a == oVar.f43161a && this.f43162b == oVar.f43162b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f43161a << 6) + this.f43162b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(10);
        sb.append("--");
        int i2 = this.f43161a;
        sb.append(i2 < 10 ? "0" : "");
        sb.append(i2);
        int i3 = this.f43162b;
        sb.append(i3 < 10 ? "-0" : TokenBuilder.TOKEN_DELIMITER);
        sb.append(i3);
        return sb.toString();
    }

    private Object writeReplace() {
        return new r((byte) 13, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void C(DataOutput dataOutput) {
        dataOutput.writeByte(this.f43161a);
        dataOutput.writeByte(this.f43162b);
    }

    static o r(ObjectInput objectInput) throws IOException {
        byte b2 = objectInput.readByte();
        byte b3 = objectInput.readByte();
        m mVarU = m.U(b2);
        Objects.requireNonNull(mVarU, com.thinkup.core.common.oo.o.C0684o.mm);
        j$.time.temporal.a.DAY_OF_MONTH.c0(b3);
        if (b3 > mVarU.J()) {
            throw new c("Illegal value for DayOfMonth field, value " + ((int) b3) + " is not valid for month " + mVarU.name());
        }
        return new o(mVarU.p(), b3);
    }
}
