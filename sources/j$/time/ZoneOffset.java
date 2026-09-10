package j$.time;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import j$.time.temporal.TemporalAccessor;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class ZoneOffset extends ZoneId implements TemporalAccessor, j$.time.temporal.n, Comparable<ZoneOffset>, Serializable {
    private static final long serialVersionUID = 2357656521762053153L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f43009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient String f43010c;
    private static final ConcurrentHashMap d = new ConcurrentHashMap(16, 0.75f, 4);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ConcurrentHashMap f43008e = new ConcurrentHashMap(16, 0.75f, 4);
    public static final ZoneOffset UTC = f0(0);
    public static final ZoneOffset f = f0(-64800);
    public static final ZoneOffset g = f0(64800);

    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a8  */
    public static ZoneOffset d0(String str) {
        int iG0;
        int iG1;
        int iG2;
        char cCharAt;
        Objects.requireNonNull(str, "offsetId");
        ZoneOffset zoneOffset = (ZoneOffset) f43008e.get(str);
        if (zoneOffset != null) {
            return zoneOffset;
        }
        int length = str.length();
        if (length == 2) {
            str = str.charAt(0) + "0" + str.charAt(1);
        } else {
            if (length != 3) {
                if (length == 5) {
                    iG0 = g0(str, 1, false);
                    iG1 = g0(str, 3, false);
                } else if (length == 6) {
                    iG0 = g0(str, 1, false);
                    iG1 = g0(str, 4, true);
                } else if (length == 7) {
                    iG0 = g0(str, 1, false);
                    iG1 = g0(str, 3, false);
                    iG2 = g0(str, 5, false);
                } else if (length == 9) {
                    iG0 = g0(str, 1, false);
                    iG1 = g0(str, 4, true);
                    iG2 = g0(str, 7, true);
                } else {
                    throw new c("Invalid ID for ZoneOffset, invalid format: ".concat(str));
                }
                iG2 = 0;
            }
            cCharAt = str.charAt(0);
            if (cCharAt == '+' && cCharAt != '-') {
                throw new c("Invalid ID for ZoneOffset, plus/minus not found when expected: ".concat(str));
            }
            if (cCharAt == '-') {
                return e0(-iG0, -iG1, -iG2);
            }
            return e0(iG0, iG1, iG2);
        }
        iG0 = g0(str, 1, false);
        iG1 = 0;
        iG2 = 0;
        cCharAt = str.charAt(0);
        if (cCharAt == '+') {
        }
        if (cCharAt == '-') {
            return e0(-iG0, -iG1, -iG2);
        }
        return e0(iG0, iG1, iG2);
    }

    private static int g0(String str, int i2, boolean z2) {
        if (z2 && str.charAt(i2 - 1) != ':') {
            throw new c("Invalid ID for ZoneOffset, colon not found when expected: " + ((Object) str));
        }
        char cCharAt = str.charAt(i2);
        char cCharAt2 = str.charAt(i2 + 1);
        if (cCharAt >= '0' && cCharAt <= '9' && cCharAt2 >= '0' && cCharAt2 <= '9') {
            return (cCharAt2 - '0') + ((cCharAt - '0') * 10);
        }
        throw new c("Invalid ID for ZoneOffset, non numeric characters found: " + ((Object) str));
    }

    public static ZoneOffset e0(int i2, int i3, int i4) {
        if (i2 < -18 || i2 > 18) {
            throw new c("Zone offset hours not in valid range: value " + i2 + " is not in the range -18 to 18");
        }
        if (i2 > 0) {
            if (i3 < 0 || i4 < 0) {
                throw new c("Zone offset minutes and seconds must be positive because hours is positive");
            }
        } else if (i2 < 0) {
            if (i3 > 0 || i4 > 0) {
                throw new c("Zone offset minutes and seconds must be negative because hours is negative");
            }
        } else if ((i3 > 0 && i4 < 0) || (i3 < 0 && i4 > 0)) {
            throw new c("Zone offset minutes and seconds must have the same sign");
        }
        if (i3 < -59 || i3 > 59) {
            throw new c("Zone offset minutes not in valid range: value " + i3 + " is not in the range -59 to 59");
        }
        if (i4 < -59 || i4 > 59) {
            throw new c("Zone offset seconds not in valid range: value " + i4 + " is not in the range -59 to 59");
        }
        if (Math.abs(i2) == 18 && (i3 | i4) != 0) {
            throw new c("Zone offset not in valid range: -18:00 to +18:00");
        }
        return f0((i3 * 60) + (i2 * com.smartdigimkt.o1.b.l2) + i4);
    }

    public static ZoneOffset f0(int i2) {
        if (i2 < -64800 || i2 > 64800) {
            throw new c("Zone offset not in valid range: -18:00 to +18:00");
        }
        if (i2 % com.smartdigimkt.o1.b.z1 == 0) {
            Integer numValueOf = Integer.valueOf(i2);
            ConcurrentHashMap concurrentHashMap = d;
            ZoneOffset zoneOffset = (ZoneOffset) concurrentHashMap.get(numValueOf);
            if (zoneOffset != null) {
                return zoneOffset;
            }
            concurrentHashMap.putIfAbsent(numValueOf, new ZoneOffset(i2));
            ZoneOffset zoneOffset2 = (ZoneOffset) concurrentHashMap.get(numValueOf);
            f43008e.putIfAbsent(zoneOffset2.f43010c, zoneOffset2);
            return zoneOffset2;
        }
        return new ZoneOffset(i2);
    }

    private ZoneOffset(int i2) {
        String string;
        this.f43009b = i2;
        if (i2 == 0) {
            string = "Z";
        } else {
            int iAbs = Math.abs(i2);
            StringBuilder sb = new StringBuilder();
            int i3 = iAbs / com.smartdigimkt.o1.b.l2;
            int i4 = (iAbs / 60) % 60;
            sb.append(i2 < 0 ? TokenBuilder.TOKEN_DELIMITER : "+");
            sb.append(i3 < 10 ? "0" : "");
            sb.append(i3);
            sb.append(i4 < 10 ? ":0" : ":");
            sb.append(i4);
            int i5 = iAbs % 60;
            if (i5 != 0) {
                sb.append(i5 < 10 ? ":0" : ":");
                sb.append(i5);
            }
            string = sb.toString();
        }
        this.f43010c = string;
    }

    public int getTotalSeconds() {
        return this.f43009b;
    }

    @Override // j$.time.ZoneId
    public final String s() {
        return this.f43010c;
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f C() {
        return j$.time.zone.f.i(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean d(j$.time.temporal.r rVar) {
        if (rVar instanceof j$.time.temporal.a) {
            return rVar == j$.time.temporal.a.OFFSET_SECONDS;
        }
        return rVar != null && rVar.Y(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int g(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f43009b;
        }
        if (rVar == null) {
            return super.k(rVar).a(e(rVar), rVar);
        }
        throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long e(j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.OFFSET_SECONDS) {
            return this.f43009b;
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(d.a("Unsupported field: ", rVar));
        }
        return rVar.r(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object a(j$.time.temporal.t tVar) {
        return (tVar == j$.time.temporal.s.d() || tVar == j$.time.temporal.s.f()) ? this : super.a(tVar);
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.m b(j$.time.temporal.m mVar) {
        return mVar.h(this.f43009b, j$.time.temporal.a.OFFSET_SECONDS);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ZoneOffset zoneOffset) {
        return zoneOffset.f43009b - this.f43009b;
    }

    @Override // j$.time.ZoneId
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneOffset) {
            if (this.f43009b == ((ZoneOffset) obj).f43009b) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.ZoneId
    public final int hashCode() {
        return this.f43009b;
    }

    @Override // j$.time.ZoneId
    public final String toString() {
        return this.f43010c;
    }

    private Object writeReplace() {
        return new r((byte) 8, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.ZoneId
    final void b0(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(8);
        i0(objectOutput);
    }

    final void i0(DataOutput dataOutput) {
        int i2 = this.f43009b;
        int i3 = i2 % com.smartdigimkt.o1.b.z1 == 0 ? i2 / com.smartdigimkt.o1.b.z1 : 127;
        dataOutput.writeByte(i3);
        if (i3 == 127) {
            dataOutput.writeInt(i2);
        }
    }

    static ZoneOffset h0(ObjectInput objectInput) throws IOException {
        byte b2 = objectInput.readByte();
        return b2 == 127 ? f0(objectInput.readInt()) : f0(b2 * 900);
    }
}
