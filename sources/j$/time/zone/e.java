package j$.time.zone;

import com.thinkup.core.common.oo.o;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.chrono.t;
import j$.time.k;
import j$.time.m;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.util.Objects;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final m f43225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte f43226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j$.time.e f43227c;
    private final k d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final boolean f43228e;
    private final d f;
    private final ZoneOffset g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ZoneOffset f43229h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ZoneOffset f43230i;

    e(m mVar, int i2, j$.time.e eVar, k kVar, boolean z2, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.f43225a = mVar;
        this.f43226b = (byte) i2;
        this.f43227c = eVar;
        this.d = kVar;
        this.f43228e = z2;
        this.f = dVar;
        this.g = zoneOffset;
        this.f43229h = zoneOffset2;
        this.f43230i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    final void writeExternal(ObjectOutput objectOutput) {
        int iV;
        k kVar = this.d;
        boolean z2 = this.f43228e;
        int iN0 = z2 ? 86400 : kVar.n0();
        int totalSeconds = this.g.getTotalSeconds();
        ZoneOffset zoneOffset = this.f43229h;
        int totalSeconds2 = zoneOffset.getTotalSeconds() - totalSeconds;
        ZoneOffset zoneOffset2 = this.f43230i;
        int totalSeconds3 = zoneOffset2.getTotalSeconds() - totalSeconds;
        if (iN0 % com.smartdigimkt.o1.b.l2 == 0) {
            iV = z2 ? 24 : kVar.V();
        } else {
            iV = 31;
        }
        int i2 = totalSeconds % com.smartdigimkt.o1.b.z1 == 0 ? (totalSeconds / com.smartdigimkt.o1.b.z1) + 128 : 255;
        int i3 = (totalSeconds2 == 0 || totalSeconds2 == 1800 || totalSeconds2 == 3600) ? totalSeconds2 / 1800 : 3;
        int i4 = (totalSeconds3 == 0 || totalSeconds3 == 1800 || totalSeconds3 == 3600) ? totalSeconds3 / 1800 : 3;
        j$.time.e eVar = this.f43227c;
        objectOutput.writeInt((this.f43225a.p() << 28) + ((this.f43226b + 32) << 22) + ((eVar == null ? 0 : eVar.p()) << 19) + (iV << 14) + (this.f.ordinal() << 12) + (i2 << 4) + (i3 << 2) + i4);
        if (iV == 31) {
            objectOutput.writeInt(iN0);
        }
        if (i2 == 255) {
            objectOutput.writeInt(totalSeconds);
        }
        if (i3 == 3) {
            objectOutput.writeInt(zoneOffset.getTotalSeconds());
        }
        if (i4 == 3) {
            objectOutput.writeInt(zoneOffset2.getTotalSeconds());
        }
    }

    static e b(ObjectInput objectInput) {
        int totalSeconds;
        ZoneOffset zoneOffsetF0;
        int i2 = objectInput.readInt();
        m mVarU = m.U(i2 >>> 28);
        int i3 = ((264241152 & i2) >>> 22) - 32;
        int i4 = (3670016 & i2) >>> 19;
        j$.time.e eVarR = i4 == 0 ? null : j$.time.e.r(i4);
        int i5 = (507904 & i2) >>> 14;
        d dVar = d.values()[(i2 & 12288) >>> 12];
        int i6 = (i2 & 4080) >>> 4;
        int i7 = (i2 & 12) >>> 2;
        int i8 = i2 & 3;
        k kVarF0 = i5 == 31 ? k.f0(objectInput.readInt()) : k.c0(i5 % 24);
        ZoneOffset zoneOffsetF1 = ZoneOffset.f0(i6 == 255 ? objectInput.readInt() : (i6 - 128) * com.smartdigimkt.o1.b.z1);
        if (i7 == 3) {
            totalSeconds = objectInput.readInt();
        } else {
            totalSeconds = (i7 * 1800) + zoneOffsetF1.getTotalSeconds();
        }
        ZoneOffset zoneOffsetF2 = ZoneOffset.f0(totalSeconds);
        if (i8 == 3) {
            zoneOffsetF0 = ZoneOffset.f0(objectInput.readInt());
        } else {
            zoneOffsetF0 = ZoneOffset.f0((i8 * 1800) + zoneOffsetF1.getTotalSeconds());
        }
        ZoneOffset zoneOffset = zoneOffsetF0;
        boolean z2 = i5 == 24;
        Objects.requireNonNull(mVarU, o.C0684o.mm);
        Objects.requireNonNull(kVarF0, "time");
        Objects.requireNonNull(dVar, "timeDefnition");
        if (i3 < -28 || i3 > 31 || i3 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z2 && !kVarF0.equals(k.g)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (kVarF0.Y() != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(mVarU, i3, eVarR, kVarF0, z2, dVar, zoneOffsetF1, zoneOffsetF2, zoneOffset);
    }

    public final b a(int i2) {
        j$.time.h hVarI0;
        m mVar = this.f43225a;
        j$.time.e eVar = this.f43227c;
        byte b2 = this.f43226b;
        if (b2 < 0) {
            hVarI0 = j$.time.h.i0(i2, mVar, mVar.C(t.d.E(i2)) + 1 + b2);
            if (eVar != null) {
                hVarI0 = hVarI0.i(new j$.time.temporal.o(eVar.p(), 1));
            }
        } else {
            hVarI0 = j$.time.h.i0(i2, mVar, b2);
            if (eVar != null) {
                hVarI0 = hVarI0.i(new j$.time.temporal.o(eVar.p(), 0));
            }
        }
        if (this.f43228e) {
            hVarI0 = hVarI0.m0(1L);
        }
        LocalDateTime localDateTimeE0 = LocalDateTime.e0(hVarI0, this.d);
        int i3 = c.f43223a[this.f.ordinal()];
        ZoneOffset zoneOffset = this.f43229h;
        if (i3 == 1) {
            localDateTimeE0 = localDateTimeE0.i0(zoneOffset.getTotalSeconds() - ZoneOffset.UTC.getTotalSeconds());
        } else if (i3 == 2) {
            localDateTimeE0 = localDateTimeE0.i0(zoneOffset.getTotalSeconds() - this.g.getTotalSeconds());
        }
        return new b(localDateTimeE0, zoneOffset, this.f43230i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.f43225a == eVar.f43225a && this.f43226b == eVar.f43226b && this.f43227c == eVar.f43227c && this.f == eVar.f && this.d.equals(eVar.d) && this.f43228e == eVar.f43228e && this.g.equals(eVar.g) && this.f43229h.equals(eVar.f43229h) && this.f43230i.equals(eVar.f43230i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iN0 = ((this.d.n0() + (this.f43228e ? 1 : 0)) << 15) + (this.f43225a.ordinal() << 11) + ((this.f43226b + 32) << 5);
        j$.time.e eVar = this.f43227c;
        return ((this.g.hashCode() ^ (this.f.ordinal() + (iN0 + ((eVar == null ? 7 : eVar.ordinal()) << 2)))) ^ this.f43229h.hashCode()) ^ this.f43230i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.f43229h;
        ZoneOffset zoneOffset2 = this.f43230i;
        sb.append(zoneOffset.compareTo(zoneOffset2) > 0 ? "Gap " : "Overlap ");
        sb.append(zoneOffset);
        sb.append(" to ");
        sb.append(zoneOffset2);
        sb.append(", ");
        m mVar = this.f43225a;
        byte b2 = this.f43226b;
        j$.time.e eVar = this.f43227c;
        if (eVar == null) {
            sb.append(mVar.name());
            sb.append(' ');
            sb.append((int) b2);
        } else if (b2 == -1) {
            sb.append(eVar.name());
            sb.append(" on or before last day of ");
            sb.append(mVar.name());
        } else if (b2 < 0) {
            sb.append(eVar.name());
            sb.append(" on or before last day minus ");
            sb.append((-b2) - 1);
            sb.append(" of ");
            sb.append(mVar.name());
        } else {
            sb.append(eVar.name());
            sb.append(" on or after ");
            sb.append(mVar.name());
            sb.append(' ');
            sb.append((int) b2);
        }
        sb.append(" at ");
        sb.append(this.f43228e ? "24:00" : this.d.toString());
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(AbstractJsonLexerKt.END_LIST);
        return sb.toString();
    }
}
