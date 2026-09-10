package j$.time;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements j$.time.temporal.q, Serializable {
    public static final q d = new q(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f43164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f43166c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        b.b(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    public static q b(int i2) {
        if (i2 == 0) {
            return d;
        }
        return new q(0, 0, i2);
    }

    private q(int i2, int i3, int i4) {
        this.f43164a = i2;
        this.f43165b = i3;
        this.f43166c = i4;
    }

    public final int a() {
        return this.f43166c;
    }

    public final long d() {
        return (((long) this.f43164a) * 12) + ((long) this.f43165b);
    }

    @Override // j$.time.temporal.q
    public final j$.time.temporal.m p(j$.time.temporal.m mVar) {
        j$.time.chrono.m mVar2 = (j$.time.chrono.m) mVar.a(j$.time.temporal.s.a());
        if (mVar2 == null || j$.time.chrono.t.d.equals(mVar2)) {
            if (this.f43165b == 0) {
                int i2 = this.f43164a;
                if (i2 != 0) {
                    mVar = mVar.l(i2, j$.time.temporal.b.YEARS);
                }
            } else {
                long jD = d();
                if (jD != 0) {
                    mVar = mVar.l(jD, j$.time.temporal.b.MONTHS);
                }
            }
            int i3 = this.f43166c;
            return i3 != 0 ? mVar.l(i3, j$.time.temporal.b.DAYS) : mVar;
        }
        throw new c("Chronology mismatch, expected: ISO, actual: " + mVar2.s());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f43164a == qVar.f43164a && this.f43165b == qVar.f43165b && this.f43166c == qVar.f43166c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.f43166c, 16) + Integer.rotateLeft(this.f43165b, 8) + this.f43164a;
    }

    public final String toString() {
        if (this == d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i2 = this.f43164a;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('Y');
        }
        int i3 = this.f43165b;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('M');
        }
        int i4 = this.f43166c;
        if (i4 != 0) {
            sb.append(i4);
            sb.append('D');
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new r((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) {
        objectOutput.writeInt(this.f43164a);
        objectOutput.writeInt(this.f43165b);
        objectOutput.writeInt(this.f43166c);
    }

    static q c(ObjectInput objectInput) throws IOException {
        int i2 = objectInput.readInt();
        int i3 = objectInput.readInt();
        int i4 = objectInput.readInt();
        if ((i2 | i3 | i4) == 0) {
            return d;
        }
        return new q(i2, i3, i4);
    }
}
