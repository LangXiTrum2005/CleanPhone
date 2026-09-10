package j$.time.temporal;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class w implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f43197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f43198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f43199c;
    private final long d;

    public static w j(long j, long j2) {
        if (j > j2) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new w(j, j, j2, j2);
    }

    public static w k(long j, long j2, long j3) {
        if (j > 1) {
            throw new IllegalArgumentException("Smallest minimum value must be less than largest minimum value");
        }
        if (j2 > j3) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j3) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new w(j, 1L, j2, j3);
    }

    private w(long j, long j2, long j3, long j4) {
        this.f43197a = j;
        this.f43198b = j2;
        this.f43199c = j3;
        this.d = j4;
    }

    public final boolean g() {
        return this.f43197a == this.f43198b && this.f43199c == this.d;
    }

    public final long e() {
        return this.f43197a;
    }

    public final long f() {
        return this.f43199c;
    }

    public final long d() {
        return this.d;
    }

    public final boolean h() {
        return this.f43197a >= -2147483648L && this.d <= 2147483647L;
    }

    public final boolean i(long j) {
        return j >= this.f43197a && j <= this.d;
    }

    public final int a(long j, r rVar) {
        if (h() && i(j)) {
            return (int) j;
        }
        throw new j$.time.c(c(j, rVar));
    }

    public final void b(long j, r rVar) {
        if (!i(j)) {
            throw new j$.time.c(c(j, rVar));
        }
    }

    private String c(long j, r rVar) {
        if (rVar != null) {
            return "Invalid value for " + rVar + " (valid values " + this + "): " + j;
        }
        return "Invalid value (valid values " + this + "): " + j;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j = this.f43197a;
        long j2 = this.f43198b;
        if (j > j2) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j3 = this.f43199c;
        long j4 = this.d;
        if (j3 > j4) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j2 > j4) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w) {
            w wVar = (w) obj;
            if (this.f43197a == wVar.f43197a && this.f43198b == wVar.f43198b && this.f43199c == wVar.f43199c && this.d == wVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.f43198b;
        long j2 = this.f43197a + (j << 16) + (j >> 48);
        long j3 = this.f43199c;
        long j4 = j2 + (j3 << 32) + (j3 >> 32);
        long j5 = this.d;
        long j6 = j4 + (j5 << 48) + (j5 >> 16);
        return (int) ((j6 >>> 32) ^ j6);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j = this.f43197a;
        sb.append(j);
        long j2 = this.f43198b;
        if (j != j2) {
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append(j2);
        }
        sb.append(" - ");
        long j3 = this.f43199c;
        sb.append(j3);
        long j4 = this.d;
        if (j3 != j4) {
            sb.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb.append(j4);
        }
        return sb.toString();
    }
}
