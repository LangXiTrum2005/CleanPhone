package j$.time;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public final class Duration implements j$.time.temporal.q, Comparable<Duration>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Duration f42994c = new Duration(0, 0);
    private static final long serialVersionUID = 3078945930695997490L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f42995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f42996b;

    @Override // java.lang.Comparable
    public final int compareTo(Duration duration) {
        Duration duration2 = duration;
        int iCompare = Long.compare(this.f42995a, duration2.f42995a);
        return iCompare != 0 ? iCompare : this.f42996b - duration2.f42996b;
    }

    static {
        BigInteger.valueOf(1000000000L);
    }

    public static Duration ofMinutes(long j) {
        return r(Math.multiplyExact(j, 60), 0);
    }

    public static Duration U(long j) {
        return r(j, 0);
    }

    public static Duration V(long j, long j2) {
        return r(Math.addExact(j, Math.floorDiv(j2, 1000000000L)), (int) Math.floorMod(j2, 1000000000L));
    }

    public static Duration ofMillis(long j) {
        long j2 = j / 1000;
        int i2 = (int) (j % 1000);
        if (i2 < 0) {
            i2 += 1000;
            j2--;
        }
        return r(j2, i2 * 1000000);
    }

    private static Duration r(long j, int i2) {
        if ((((long) i2) | j) == 0) {
            return f42994c;
        }
        return new Duration(j, i2);
    }

    private Duration(long j, int i2) {
        this.f42995a = j;
        this.f42996b = i2;
    }

    public final long J() {
        return this.f42995a;
    }

    public final int C() {
        return this.f42996b;
    }

    @Override // j$.time.temporal.q
    public final j$.time.temporal.m p(j$.time.temporal.m mVar) {
        long j = this.f42995a;
        if (j != 0) {
            mVar = mVar.l(j, j$.time.temporal.b.SECONDS);
        }
        int i2 = this.f42996b;
        return i2 != 0 ? mVar.l(i2, j$.time.temporal.b.NANOS) : mVar;
    }

    public long toMillis() {
        long j = this.f42996b;
        long j2 = this.f42995a;
        if (j2 < 0) {
            j2++;
            j -= 1000000000;
        }
        return Math.addExact(Math.multiplyExact(j2, 1000), j / 1000000);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Duration) {
            Duration duration = (Duration) obj;
            if (this.f42995a == duration.f42995a && this.f42996b == duration.f42996b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f42995a;
        return (this.f42996b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        if (this == f42994c) {
            return "PT0S";
        }
        long j = this.f42995a;
        int i2 = this.f42996b;
        long j2 = (j >= 0 || i2 <= 0) ? j : 1 + j;
        long j3 = j2 / com.smartdigimkt.o1.b.f37307P;
        int i3 = (int) ((j2 % com.smartdigimkt.o1.b.f37307P) / 60);
        int i4 = (int) (j2 % 60);
        StringBuilder sb = new StringBuilder(24);
        sb.append("PT");
        if (j3 != 0) {
            sb.append(j3);
            sb.append('H');
        }
        if (i3 != 0) {
            sb.append(i3);
            sb.append('M');
        }
        if (i4 == 0 && i2 == 0 && sb.length() > 2) {
            return sb.toString();
        }
        if (j < 0 && i2 > 0 && i4 == 0) {
            sb.append("-0");
        } else {
            sb.append(i4);
        }
        if (i2 > 0) {
            int length = sb.length();
            if (j < 0) {
                sb.append(2000000000 - ((long) i2));
            } else {
                sb.append(((long) i2) + 1000000000);
            }
            while (sb.charAt(sb.length() - 1) == '0') {
                sb.setLength(sb.length() - 1);
            }
            sb.setCharAt(length, '.');
        }
        sb.append('S');
        return sb.toString();
    }

    private Object writeReplace() {
        return new r((byte) 1, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeLong(this.f42995a);
        objectOutput.writeInt(this.f42996b);
    }
}
