package j$.time.zone;

import com.p004ironsource.d9;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class f implements Serializable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long[] f43231i = new long[0];
    private static final e[] j = new e[0];
    private static final LocalDateTime[] k = new LocalDateTime[0];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final b[] f43232l = new b[0];
    private static final long serialVersionUID = 3044319355680032515L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long[] f43233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ZoneOffset[] f43234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long[] f43235c;
    private final LocalDateTime[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ZoneOffset[] f43236e;
    private final e[] f;
    private final TimeZone g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient ConcurrentHashMap f43237h = new ConcurrentHashMap();

    public static f i(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return new f(zoneOffset);
    }

    private f(long[] jArr, ZoneOffset[] zoneOffsetArr, long[] jArr2, ZoneOffset[] zoneOffsetArr2, e[] eVarArr) {
        this.f43233a = jArr;
        this.f43234b = zoneOffsetArr;
        this.f43235c = jArr2;
        this.f43236e = zoneOffsetArr2;
        this.f = eVarArr;
        if (jArr2.length == 0) {
            this.d = k;
        } else {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i2 < jArr2.length) {
                int i3 = i2 + 1;
                b bVar = new b(jArr2[i2], zoneOffsetArr2[i2], zoneOffsetArr2[i3]);
                if (bVar.Y()) {
                    arrayList.add(bVar.r());
                    arrayList.add(bVar.p());
                } else {
                    arrayList.add(bVar.p());
                    arrayList.add(bVar.r());
                }
                i2 = i3;
            }
            this.d = (LocalDateTime[]) arrayList.toArray(new LocalDateTime[arrayList.size()]);
        }
        this.g = null;
    }

    private f(ZoneOffset zoneOffset) {
        ZoneOffset[] zoneOffsetArr = {zoneOffset};
        this.f43234b = zoneOffsetArr;
        long[] jArr = f43231i;
        this.f43233a = jArr;
        this.f43235c = jArr;
        this.d = k;
        this.f43236e = zoneOffsetArr;
        this.f = j;
        this.g = null;
    }

    f(TimeZone timeZone) {
        ZoneOffset[] zoneOffsetArr = {j(timeZone.getRawOffset())};
        this.f43234b = zoneOffsetArr;
        long[] jArr = f43231i;
        this.f43233a = jArr;
        this.f43235c = jArr;
        this.d = k;
        this.f43236e = zoneOffsetArr;
        this.f = j;
        this.g = timeZone;
    }

    private static ZoneOffset j(int i2) {
        return ZoneOffset.f0(i2 / 1000);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a(this.g != null ? (byte) 100 : (byte) 1, this);
    }

    final void writeExternal(ObjectOutput objectOutput) throws IOException {
        long[] jArr = this.f43233a;
        objectOutput.writeInt(jArr.length);
        for (long j2 : jArr) {
            a.c(j2, objectOutput);
        }
        for (ZoneOffset zoneOffset : this.f43234b) {
            a.d(zoneOffset, objectOutput);
        }
        long[] jArr2 = this.f43235c;
        objectOutput.writeInt(jArr2.length);
        for (long j3 : jArr2) {
            a.c(j3, objectOutput);
        }
        for (ZoneOffset zoneOffset2 : this.f43236e) {
            a.d(zoneOffset2, objectOutput);
        }
        e[] eVarArr = this.f;
        objectOutput.writeByte(eVarArr.length);
        for (e eVar : eVarArr) {
            eVar.writeExternal(objectOutput);
        }
    }

    final void l(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeUTF(this.g.getID());
    }

    static f k(ObjectInput objectInput) throws IOException {
        int i2 = objectInput.readInt();
        long[] jArr = f43231i;
        long[] jArr2 = i2 == 0 ? jArr : new long[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            jArr2[i3] = a.a(objectInput);
        }
        int i4 = i2 + 1;
        ZoneOffset[] zoneOffsetArr = new ZoneOffset[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            zoneOffsetArr[i5] = a.b(objectInput);
        }
        int i6 = objectInput.readInt();
        if (i6 != 0) {
            jArr = new long[i6];
        }
        long[] jArr3 = jArr;
        for (int i7 = 0; i7 < i6; i7++) {
            jArr3[i7] = a.a(objectInput);
        }
        int i8 = i6 + 1;
        ZoneOffset[] zoneOffsetArr2 = new ZoneOffset[i8];
        for (int i9 = 0; i9 < i8; i9++) {
            zoneOffsetArr2[i9] = a.b(objectInput);
        }
        int i10 = objectInput.readByte();
        e[] eVarArr = i10 == 0 ? j : new e[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            eVarArr[i11] = e.b(objectInput);
        }
        return new f(jArr2, zoneOffsetArr, jArr3, zoneOffsetArr2, eVarArr);
    }

    public final ZoneOffset d(Instant instant) {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return j(timeZone.getOffset(instant.toEpochMilli()));
        }
        long[] jArr = this.f43235c;
        if (jArr.length == 0) {
            return this.f43234b[0];
        }
        long jC = instant.C();
        int length = this.f.length;
        ZoneOffset[] zoneOffsetArr = this.f43236e;
        if (length > 0 && jC > jArr[jArr.length - 1]) {
            b[] bVarArrB = b(c(jC, zoneOffsetArr[zoneOffsetArr.length - 1]));
            b bVar = null;
            for (int i2 = 0; i2 < bVarArrB.length; i2++) {
                bVar = bVarArrB[i2];
                if (jC < bVar.Q()) {
                    return bVar.U();
                }
            }
            return bVar.J();
        }
        int iBinarySearch = Arrays.binarySearch(jArr, jC);
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        }
        return zoneOffsetArr[iBinarySearch + 1];
    }

    public final List g(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (objE instanceof b) {
            return ((b) objE).V();
        }
        return Collections.singletonList((ZoneOffset) objE);
    }

    public final b f(LocalDateTime localDateTime) {
        Object objE = e(localDateTime);
        if (objE instanceof b) {
            return (b) objE;
        }
        return null;
    }

    private Object e(LocalDateTime localDateTime) {
        Object obj = null;
        ZoneOffset[] zoneOffsetArr = this.f43234b;
        int i2 = 0;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            b[] bVarArrB = b(localDateTime.V());
            if (bVarArrB.length == 0) {
                return j(timeZone.getOffset(localDateTime.a0(zoneOffsetArr[0]) * 1000));
            }
            int length = bVarArrB.length;
            while (i2 < length) {
                b bVar = bVarArrB[i2];
                Object objA = a(localDateTime, bVar);
                if ((objA instanceof b) || objA.equals(bVar.U())) {
                    return objA;
                }
                i2++;
                obj = objA;
            }
            return obj;
        }
        if (this.f43235c.length == 0) {
            return zoneOffsetArr[0];
        }
        int length2 = this.f.length;
        LocalDateTime[] localDateTimeArr = this.d;
        if (length2 > 0 && localDateTime.Y(localDateTimeArr[localDateTimeArr.length - 1])) {
            b[] bVarArrB2 = b(localDateTime.V());
            int length3 = bVarArrB2.length;
            while (i2 < length3) {
                b bVar2 = bVarArrB2[i2];
                Object objA2 = a(localDateTime, bVar2);
                if ((objA2 instanceof b) || objA2.equals(bVar2.U())) {
                    return objA2;
                }
                i2++;
                obj = objA2;
            }
            return obj;
        }
        int iBinarySearch = Arrays.binarySearch(localDateTimeArr, localDateTime);
        ZoneOffset[] zoneOffsetArr2 = this.f43236e;
        if (iBinarySearch == -1) {
            return zoneOffsetArr2[0];
        }
        if (iBinarySearch < 0) {
            iBinarySearch = (-iBinarySearch) - 2;
        } else if (iBinarySearch < localDateTimeArr.length - 1) {
            int i3 = iBinarySearch + 1;
            if (localDateTimeArr[iBinarySearch].equals(localDateTimeArr[i3])) {
                iBinarySearch = i3;
            }
        }
        if ((iBinarySearch & 1) == 0) {
            LocalDateTime localDateTime2 = localDateTimeArr[iBinarySearch];
            LocalDateTime localDateTime3 = localDateTimeArr[iBinarySearch + 1];
            int i4 = iBinarySearch / 2;
            ZoneOffset zoneOffset = zoneOffsetArr2[i4];
            ZoneOffset zoneOffset2 = zoneOffsetArr2[i4 + 1];
            if (zoneOffset2.getTotalSeconds() > zoneOffset.getTotalSeconds()) {
                return new b(localDateTime2, zoneOffset, zoneOffset2);
            }
            return new b(localDateTime3, zoneOffset, zoneOffset2);
        }
        return zoneOffsetArr2[(iBinarySearch / 2) + 1];
    }

    private static Object a(LocalDateTime localDateTime, b bVar) {
        LocalDateTime localDateTimeR = bVar.r();
        if (bVar.Y()) {
            if (localDateTime.b0(localDateTimeR)) {
                return bVar.U();
            }
            if (!localDateTime.b0(bVar.p())) {
                return bVar.J();
            }
        } else {
            if (!localDateTime.b0(localDateTimeR)) {
                return bVar.J();
            }
            if (localDateTime.b0(bVar.p())) {
                return bVar.U();
            }
        }
        return bVar;
    }

    private b[] b(int i2) {
        Integer numValueOf = Integer.valueOf(i2);
        ConcurrentHashMap concurrentHashMap = this.f43237h;
        b[] bVarArr = (b[]) concurrentHashMap.get(numValueOf);
        if (bVarArr != null) {
            return bVarArr;
        }
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            b[] bVarArr2 = f43232l;
            if (i2 < 1800) {
                return bVarArr2;
            }
            long jA0 = LocalDateTime.c0(i2 - 1).a0(this.f43234b[0]);
            long j2 = 1000;
            int offset = timeZone.getOffset(jA0 * 1000);
            long j3 = 31968000 + jA0;
            while (jA0 < j3) {
                long j4 = 7776000 + jA0;
                long j5 = j2;
                if (offset != timeZone.getOffset(j4 * j5)) {
                    while (j4 - jA0 > 1) {
                        int i3 = offset;
                        long jFloorDiv = Math.floorDiv(j4 + jA0, 2L);
                        if (timeZone.getOffset(jFloorDiv * j5) == i3) {
                            jA0 = jFloorDiv;
                        } else {
                            j4 = jFloorDiv;
                        }
                        offset = i3;
                    }
                    int i4 = offset;
                    if (timeZone.getOffset(jA0 * j5) == i4) {
                        jA0 = j4;
                    }
                    ZoneOffset zoneOffsetJ = j(i4);
                    offset = timeZone.getOffset(jA0 * j5);
                    ZoneOffset zoneOffsetJ2 = j(offset);
                    if (c(jA0, zoneOffsetJ2) == i2) {
                        bVarArr2 = (b[]) Arrays.copyOf(bVarArr2, bVarArr2.length + 1);
                        bVarArr2[bVarArr2.length - 1] = new b(jA0, zoneOffsetJ, zoneOffsetJ2);
                    }
                } else {
                    jA0 = j4;
                }
                j2 = j5;
            }
            if (1916 <= i2 && i2 < 2100) {
                concurrentHashMap.putIfAbsent(numValueOf, bVarArr2);
            }
            return bVarArr2;
        }
        e[] eVarArr = this.f;
        b[] bVarArr3 = new b[eVarArr.length];
        for (int i5 = 0; i5 < eVarArr.length; i5++) {
            bVarArr3[i5] = eVarArr[i5].a(i2);
        }
        if (i2 < 2100) {
            concurrentHashMap.putIfAbsent(numValueOf, bVarArr3);
        }
        return bVarArr3;
    }

    public final boolean h(Instant instant) {
        ZoneOffset zoneOffsetJ;
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            zoneOffsetJ = j(timeZone.getRawOffset());
        } else {
            int length = this.f43235c.length;
            ZoneOffset[] zoneOffsetArr = this.f43234b;
            if (length == 0) {
                zoneOffsetJ = zoneOffsetArr[0];
            } else {
                int iBinarySearch = Arrays.binarySearch(this.f43233a, instant.C());
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 2;
                }
                zoneOffsetJ = zoneOffsetArr[iBinarySearch + 1];
            }
        }
        return !zoneOffsetJ.equals(d(instant));
    }

    private static int c(long j2, ZoneOffset zoneOffset) {
        return j$.time.h.j0(Math.floorDiv(j2 + ((long) zoneOffset.getTotalSeconds()), 86400)).c0();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (Objects.equals(this.g, fVar.g) && Arrays.equals(this.f43233a, fVar.f43233a) && Arrays.equals(this.f43234b, fVar.f43234b) && Arrays.equals(this.f43235c, fVar.f43235c) && Arrays.equals(this.f43236e, fVar.f43236e) && Arrays.equals(this.f, fVar.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Objects.hashCode(this.g) ^ Arrays.hashCode(this.f43233a)) ^ Arrays.hashCode(this.f43234b)) ^ Arrays.hashCode(this.f43235c)) ^ Arrays.hashCode(this.f43236e)) ^ Arrays.hashCode(this.f);
    }

    public final String toString() {
        TimeZone timeZone = this.g;
        if (timeZone != null) {
            return "ZoneRules[timeZone=" + timeZone.getID() + d9.i.f24752e;
        }
        ZoneOffset[] zoneOffsetArr = this.f43234b;
        return "ZoneRules[currentStandardOffset=" + zoneOffsetArr[zoneOffsetArr.length - 1] + d9.i.f24752e;
    }
}
