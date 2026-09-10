package j$.time;

import j$.time.temporal.TemporalAccessor;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class k implements j$.time.temporal.m, j$.time.temporal.n, Comparable, Serializable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final k f43152e;
    public static final k f;
    public static final k g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final k[] f43153h = new k[24];
    private static final long serialVersionUID = 6414437269572265201L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte f43154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte f43155b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final byte f43156c;
    private final int d;

    static {
        int i2 = 0;
        while (true) {
            k[] kVarArr = f43153h;
            if (i2 < kVarArr.length) {
                kVarArr[i2] = new k(i2, 0, 0, 0);
                i2++;
            } else {
                k kVar = kVarArr[0];
                g = kVar;
                k kVar2 = kVarArr[12];
                f43152e = kVar;
                f = new k(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static k c0(int i2) {
        j$.time.temporal.a.HOUR_OF_DAY.c0(i2);
        return f43153h[i2];
    }

    public static k d0(int i2, int i3, int i4, int i5) {
        j$.time.temporal.a.HOUR_OF_DAY.c0(i2);
        j$.time.temporal.a.MINUTE_OF_HOUR.c0(i3);
        j$.time.temporal.a.SECOND_OF_MINUTE.c0(i4);
        j$.time.temporal.a.NANO_OF_SECOND.c0(i5);
        return C(i2, i3, i4, i5);
    }

    public static k f0(long j) {
        j$.time.temporal.a.SECOND_OF_DAY.c0(j);
        int i2 = (int) (j / com.smartdigimkt.o1.b.f37307P);
        long j2 = j - ((long) (i2 * com.smartdigimkt.o1.b.l2));
        int i3 = (int) (j2 / 60);
        return C(i2, i3, (int) (j2 - ((long) (i3 * 60))), 0);
    }

    public static k e0(long j) {
        j$.time.temporal.a.NANO_OF_DAY.c0(j);
        int i2 = (int) (j / 3600000000000L);
        long j2 = j - (((long) i2) * 3600000000000L);
        int i3 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i3) * 60000000000L);
        int i4 = (int) (j3 / 1000000000);
        return C(i2, i3, i4, (int) (j3 - (((long) i4) * 1000000000)));
    }

    public static k J(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        k kVar = (k) temporalAccessor.a(j$.time.temporal.s.c());
        if (kVar != null) {
            return kVar;
        }
        throw new c("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    private static k C(int i2, int i3, int i4, int i5) {
        if ((i3 | i4 | i5) == 0) {
            return f43153h[i2];
        }
        return new k(i2, i3, i4, i5);
    }

    private k(int i2, int i3, int i4, int i5) {
        this.f43154a = (byte) i2;
        this.f43155b = (byte) i3;
        this.f43156c = (byte) i4;
        this.d = i5;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return ((j$.time.temporal.a) rVar).d0();
        }
        return rVar != null && rVar.Y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return U(rVar);
        }
        return super.g(rVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long e(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            if (rVar == j$.time.temporal.a.NANO_OF_DAY) {
                return m0();
            }
            if (rVar == j$.time.temporal.a.MICRO_OF_DAY) {
                return m0() / 1000;
            }
            return U(rVar);
        }
        return rVar.r(this);
    }

    private int U(j$.time.temporal.r rVar) {
        int i2 = j.f43150a[((j$.time.temporal.a) rVar).ordinal()];
        byte b2 = this.f43155b;
        int i3 = this.d;
        byte b3 = this.f43154a;
        switch (i2) {
            case 1:
                return i3;
            case 2:
                throw new j$.time.temporal.v("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i3 / 1000;
            case 4:
                throw new j$.time.temporal.v("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i3 / 1000000;
            case 6:
                return (int) (m0() / 1000000);
            case 7:
                return this.f43156c;
            case 8:
                return n0();
            case 9:
                return b2;
            case 10:
                return (b3 * 60) + b2;
            case 11:
                return b3 % 12;
            case 12:
                int i4 = b3 % 12;
                if (i4 % 12 == 0) {
                    return 12;
                }
                return i4;
            case 14:
                if (b3 == 0) {
                    return 24;
                }
            case 13:
                return b3;
            case 15:
                return b3 / 12;
            default:
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
    }

    public final int V() {
        return this.f43154a;
    }

    public final int b0() {
        return this.f43156c;
    }

    public final int Y() {
        return this.d;
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: i */
    public final j$.time.temporal.m m(h hVar) {
        return (k) hVar.b(this);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public final k h(long j, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return (k) rVar.p(this, j);
        }
        j$.time.temporal.a aVar = (j$.time.temporal.a) rVar;
        aVar.c0(j);
        int i2 = j.f43150a[aVar.ordinal()];
        byte b2 = this.f43155b;
        byte b3 = this.f43156c;
        int i3 = this.d;
        byte b4 = this.f43154a;
        switch (i2) {
            case 1:
                return p0((int) j);
            case 2:
                return e0(j);
            case 3:
                return p0(((int) j) * 1000);
            case 4:
                return e0(j * 1000);
            case 5:
                return p0(((int) j) * 1000000);
            case 6:
                return e0(j * 1000000);
            case 7:
                int i4 = (int) j;
                if (b3 != i4) {
                    j$.time.temporal.a.SECOND_OF_MINUTE.c0(i4);
                    return C(b4, b2, i4, i3);
                }
                return this;
            case 8:
                return k0(j - ((long) n0()));
            case 9:
                int i5 = (int) j;
                if (b2 != i5) {
                    j$.time.temporal.a.MINUTE_OF_HOUR.c0(i5);
                    return C(b4, i5, b3, i3);
                }
                return this;
            case 10:
                return i0(j - ((long) ((b4 * 60) + b2)));
            case 11:
                return h0(j - ((long) (b4 % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return h0(j - ((long) (b4 % 12)));
            case 13:
                int i6 = (int) j;
                if (b4 != i6) {
                    j$.time.temporal.a.HOUR_OF_DAY.c0(i6);
                    return C(i6, b2, b3, i3);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i7 = (int) j;
                if (b4 != i7) {
                    j$.time.temporal.a.HOUR_OF_DAY.c0(i7);
                    return C(i7, b2, b3, i3);
                }
                return this;
            case 15:
                return h0((j - ((long) (b4 / 12))) * 12);
            default:
                throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
    }

    public final k p0(int i2) {
        if (this.d == i2) {
            return this;
        }
        j$.time.temporal.a.NANO_OF_SECOND.c0(i2);
        return C(this.f43154a, this.f43155b, this.f43156c, i2);
    }

    @Override // j$.time.temporal.m
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public final k l(long j, j$.time.temporal.u uVar) {
        if (uVar instanceof j$.time.temporal.b) {
            switch (j.f43151b[((j$.time.temporal.b) uVar).ordinal()]) {
                case 1:
                    return j0(j);
                case 2:
                    return j0((j % 86400000000L) * 1000);
                case 3:
                    return j0((j % 86400000) * 1000000);
                case 4:
                    return k0(j);
                case 5:
                    return i0(j);
                case 6:
                    return h0(j);
                case 7:
                    return h0((j % 2) * 12);
                default:
                    throw new j$.time.temporal.v("Unsupported unit: " + uVar);
            }
        }
        return (k) uVar.p(this, j);
    }

    public final k h0(long j) {
        if (j == 0) {
            return this;
        }
        return C(((((int) (j % 24)) + this.f43154a) + 24) % 24, this.f43155b, this.f43156c, this.d);
    }

    public final k i0(long j) {
        if (j != 0) {
            int i2 = (this.f43154a * 60) + this.f43155b;
            int i3 = ((((int) (j % 1440)) + i2) + 1440) % 1440;
            if (i2 != i3) {
                return C(i3 / 60, i3 % 60, this.f43156c, this.d);
            }
        }
        return this;
    }

    public final k k0(long j) {
        if (j != 0) {
            int i2 = (this.f43155b * 60) + (this.f43154a * 3600) + this.f43156c;
            int i3 = ((((int) (j % 86400)) + i2) + 86400) % 86400;
            if (i2 != i3) {
                return C(i3 / com.smartdigimkt.o1.b.l2, (i3 / 60) % 60, i3 % 60, this.d);
            }
        }
        return this;
    }

    public final k j0(long j) {
        if (j != 0) {
            long jM0 = m0();
            long j2 = (((j % 86400000000000L) + jM0) + 86400000000000L) % 86400000000000L;
            if (jM0 != j2) {
                return C((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.m c(long j, j$.time.temporal.u uVar) {
        return j == Long.MIN_VALUE ? l(Long.MAX_VALUE, uVar).l(1L, uVar) : l(-j, uVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object a(j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.s.a() || tVar == j$.time.temporal.s.g() || tVar == j$.time.temporal.s.f() || tVar == j$.time.temporal.s.d()) {
            return null;
        }
        if (tVar == j$.time.temporal.s.c()) {
            return this;
        }
        if (tVar == j$.time.temporal.s.b()) {
            return null;
        }
        if (tVar == j$.time.temporal.s.e()) {
            return j$.time.temporal.b.NANOS;
        }
        return tVar.i(this);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m b(j$.time.temporal.m mVar) {
        return mVar.h(m0(), j$.time.temporal.a.NANO_OF_DAY);
    }

    public final int n0() {
        return (this.f43155b * 60) + (this.f43154a * 3600) + this.f43156c;
    }

    public final long m0() {
        return (((long) this.f43156c) * 1000000000) + (((long) this.f43155b) * 60000000000L) + (((long) this.f43154a) * 3600000000000L) + ((long) this.d);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final int compareTo(k kVar) {
        int iCompare = Integer.compare(this.f43154a, kVar.f43154a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.f43155b, kVar.f43155b)) == 0 && (iCompare = Integer.compare(this.f43156c, kVar.f43156c)) == 0) ? Integer.compare(this.d, kVar.d) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f43154a == kVar.f43154a && this.f43155b == kVar.f43155b && this.f43156c == kVar.f43156c && this.d == kVar.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long jM0 = m0();
        return (int) (jM0 ^ (jM0 >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b2 = this.f43154a;
        sb.append(b2 < 10 ? "0" : "");
        sb.append((int) b2);
        byte b3 = this.f43155b;
        sb.append(b3 < 10 ? ":0" : ":");
        sb.append((int) b3);
        byte b4 = this.f43156c;
        int i2 = this.d;
        if (b4 > 0 || i2 > 0) {
            sb.append(b4 < 10 ? ":0" : ":");
            sb.append((int) b4);
            if (i2 > 0) {
                sb.append('.');
                if (i2 % 1000000 == 0) {
                    sb.append(Integer.toString((i2 / 1000000) + 1000).substring(1));
                } else if (i2 % 1000 == 0) {
                    sb.append(Integer.toString((i2 / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i2 + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new r((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    final void q0(DataOutput dataOutput) {
        byte b2 = this.f43156c;
        byte b3 = this.f43154a;
        byte b4 = this.f43155b;
        int i2 = this.d;
        if (i2 != 0) {
            dataOutput.writeByte(b3);
            dataOutput.writeByte(b4);
            dataOutput.writeByte(b2);
            dataOutput.writeInt(i2);
            return;
        }
        if (b2 != 0) {
            dataOutput.writeByte(b3);
            dataOutput.writeByte(b4);
            dataOutput.writeByte(~b2);
        } else if (b4 == 0) {
            dataOutput.writeByte(~b3);
        } else {
            dataOutput.writeByte(b3);
            dataOutput.writeByte(~b4);
        }
    }

    static k l0(ObjectInput objectInput) throws IOException {
        int i2;
        int i3;
        int i4 = objectInput.readByte();
        int i5 = 0;
        if (i4 < 0) {
            i4 = ~i4;
            i3 = 0;
            i2 = 0;
        } else {
            byte b2 = objectInput.readByte();
            if (b2 < 0) {
                int i6 = ~b2;
                i2 = 0;
                i5 = i6;
                i3 = 0;
            } else {
                byte b3 = objectInput.readByte();
                if (b3 < 0) {
                    i3 = ~b3;
                    i2 = 0;
                    i5 = b2;
                } else {
                    i2 = objectInput.readInt();
                    i5 = b2;
                    i3 = b3;
                }
            }
        }
        return d0(i4, i5, i3, i2);
    }
}
