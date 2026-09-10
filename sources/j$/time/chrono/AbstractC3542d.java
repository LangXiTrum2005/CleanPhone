package j$.time.chrono;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.chrono.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC3542d implements InterfaceC3540b, j$.time.temporal.m, j$.time.temporal.n, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    abstract InterfaceC3540b C(long j);

    abstract InterfaceC3540b J(long j);

    abstract InterfaceC3540b U(long j);

    @Override // j$.time.chrono.InterfaceC3540b, j$.time.temporal.m
    public /* bridge */ /* synthetic */ j$.time.temporal.m c(long j, j$.time.temporal.u uVar) {
        return c(j, uVar);
    }

    static InterfaceC3540b r(m mVar, j$.time.temporal.m mVar2) {
        InterfaceC3540b interfaceC3540b = (InterfaceC3540b) mVar2;
        if (mVar.equals(interfaceC3540b.f())) {
            return interfaceC3540b;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + mVar.s() + ", actual: " + interfaceC3540b.f().s());
    }

    AbstractC3542d() {
    }

    @Override // j$.time.temporal.m
    public InterfaceC3540b l(long j, j$.time.temporal.u uVar) {
        boolean z2 = uVar instanceof j$.time.temporal.b;
        if (!z2) {
            if (!z2) {
                return r(f(), uVar.p(this, j));
            }
            throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
        switch (AbstractC3541c.f43029a[((j$.time.temporal.b) uVar).ordinal()]) {
            case 1:
                return C(j);
            case 2:
                return C(Math.multiplyExact(j, 7));
            case 3:
                return J(j);
            case 4:
                return U(j);
            case 5:
                return U(Math.multiplyExact(j, 10));
            case 6:
                return U(Math.multiplyExact(j, 100));
            case 7:
                return U(Math.multiplyExact(j, 1000));
            case 8:
                j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
                return h(Math.addExact(e(aVar), j), (j$.time.temporal.r) aVar);
            default:
                throw new j$.time.temporal.v("Unsupported unit: " + uVar);
        }
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC3540b) && compareTo((InterfaceC3540b) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public int hashCode() {
        long jV = v();
        return ((int) (jV ^ (jV >>> 32))) ^ f().hashCode();
    }

    @Override // j$.time.temporal.m
    public InterfaceC3540b m(j$.time.temporal.n nVar) {
        return r(f(), nVar.b(this));
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public String toString() {
        long jE = e(j$.time.temporal.a.YEAR_OF_ERA);
        long jE2 = e(j$.time.temporal.a.MONTH_OF_YEAR);
        long jE3 = e(j$.time.temporal.a.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(f().toString());
        sb.append(" ");
        sb.append(u());
        sb.append(" ");
        sb.append(jE);
        String str = TokenBuilder.TOKEN_DELIMITER;
        sb.append(jE2 < 10 ? "-0" : TokenBuilder.TOKEN_DELIMITER);
        sb.append(jE2);
        if (jE3 < 10) {
            str = "-0";
        }
        sb.append(str);
        sb.append(jE3);
        return sb.toString();
    }

    @Override // j$.time.temporal.m
    public InterfaceC3540b h(long j, j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
        return r(f(), rVar.p(this, j));
    }

    @Override // j$.time.chrono.InterfaceC3540b
    public InterfaceC3540b N(j$.time.temporal.q qVar) {
        return r(f(), qVar.p(this));
    }
}
