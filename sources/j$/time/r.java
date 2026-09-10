package j$.time;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes2.dex */
final class r implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f43167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f43168b;

    public r() {
    }

    r(byte b2, Object obj) {
        this.f43167a = b2;
        this.f43168b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b2 = this.f43167a;
        Object obj = this.f43168b;
        objectOutput.writeByte(b2);
        switch (b2) {
            case 1:
                ((Duration) obj).writeExternal(objectOutput);
                return;
            case 2:
                ((Instant) obj).c0(objectOutput);
                return;
            case 3:
                ((h) obj).v0(objectOutput);
                return;
            case 4:
                ((k) obj).q0(objectOutput);
                return;
            case 5:
                ((LocalDateTime) obj).o0(objectOutput);
                return;
            case 6:
                ((ZonedDateTime) obj).d0(objectOutput);
                return;
            case 7:
                ((w) obj).d0(objectOutput);
                return;
            case 8:
                ((ZoneOffset) obj).i0(objectOutput);
                return;
            case 9:
                ((OffsetTime) obj).writeExternal(objectOutput);
                return;
            case 10:
                ((OffsetDateTime) obj).writeExternal(objectOutput);
                return;
            case 11:
                ((t) obj).V(objectOutput);
                return;
            case 12:
                ((v) obj).c0(objectOutput);
                return;
            case 13:
                ((o) obj).C(objectOutput);
                return;
            case 14:
                ((q) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b2 = objectInput.readByte();
        this.f43167a = b2;
        this.f43168b = b(b2, objectInput);
    }

    static Serializable a(ObjectInput objectInput) {
        return b(objectInput.readByte(), objectInput);
    }

    private static Serializable b(byte b2, ObjectInput objectInput) throws StreamCorruptedException {
        switch (b2) {
            case 1:
                Duration duration = Duration.f42994c;
                return Duration.V(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.f42997c;
                return Instant.V(objectInput.readLong(), objectInput.readInt());
            case 3:
                h hVar = h.d;
                return h.h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return k.l0(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.f43000c;
                h hVar2 = h.d;
                return LocalDateTime.e0(h.h0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), k.l0(objectInput));
            case 6:
                return ZonedDateTime.Y(objectInput);
            case 7:
                int i2 = w.d;
                return ZoneId.U(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.h0(objectInput);
            case 9:
                return OffsetTime.J(objectInput);
            case 10:
                return OffsetDateTime.U(objectInput);
            case 11:
                int i3 = t.f43171b;
                return t.r(objectInput.readInt());
            case 12:
                return v.V(objectInput);
            case 13:
                return o.r(objectInput);
            case 14:
                return q.c(objectInput);
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.f43168b;
    }
}
