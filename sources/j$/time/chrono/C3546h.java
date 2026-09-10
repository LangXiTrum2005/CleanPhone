package j$.time.chrono;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.chrono.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C3546h implements j$.time.temporal.q, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f43033e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f43034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f43035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f43036c;
    final int d;

    static {
        j$.time.b.b(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    C3546h(m mVar, int i2, int i3, int i4) {
        this.f43034a = mVar;
        this.f43035b = i2;
        this.f43036c = i3;
        this.d = i4;
    }

    public final String toString() {
        m mVar = this.f43034a;
        int i2 = this.d;
        int i3 = this.f43036c;
        int i4 = this.f43035b;
        if (i4 == 0 && i3 == 0 && i2 == 0) {
            return mVar.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(mVar.toString());
        sb.append(" P");
        if (i4 != 0) {
            sb.append(i4);
            sb.append('Y');
        }
        if (i3 != 0) {
            sb.append(i3);
            sb.append('M');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('D');
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.q
    public final j$.time.temporal.m p(j$.time.temporal.m mVar) {
        m mVar2 = (m) mVar.a(j$.time.temporal.s.a());
        m mVar3 = this.f43034a;
        if (mVar2 == null || mVar3.equals(mVar2)) {
            int i2 = this.f43035b;
            int i3 = this.f43036c;
            if (i3 != 0) {
                j$.time.temporal.w wVarW = mVar3.W(j$.time.temporal.a.MONTH_OF_YEAR);
                long jD = (wVarW.g() && wVarW.h()) ? (wVarW.d() - wVarW.e()) + 1 : -1L;
                if (jD > 0) {
                    mVar = mVar.l((((long) i2) * jD) + ((long) i3), j$.time.temporal.b.MONTHS);
                } else {
                    if (i2 != 0) {
                        mVar = mVar.l(i2, j$.time.temporal.b.YEARS);
                    }
                    mVar = mVar.l(i3, j$.time.temporal.b.MONTHS);
                }
            } else if (i2 != 0) {
                mVar = mVar.l(i2, j$.time.temporal.b.YEARS);
            }
            int i4 = this.d;
            return i4 != 0 ? mVar.l(i4, j$.time.temporal.b.DAYS) : mVar;
        }
        throw new j$.time.c("Chronology mismatch, expected: " + mVar3.s() + ", actual: " + mVar2.s());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3546h) {
            C3546h c3546h = (C3546h) obj;
            if (this.f43035b == c3546h.f43035b && this.f43036c == c3546h.f43036c && this.d == c3546h.d && this.f43034a.equals(c3546h.f43034a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f43034a.hashCode() ^ (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.f43036c, 8) + this.f43035b));
    }

    protected Object writeReplace() {
        return new F((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.f43034a.s());
        objectOutput.writeInt(this.f43035b);
        objectOutput.writeInt(this.f43036c);
        objectOutput.writeInt(this.d);
    }
}
