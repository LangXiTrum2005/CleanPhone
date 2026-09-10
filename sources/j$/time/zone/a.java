package j$.time.zone;

import com.inmobi.commons.core.configs.AdConfig;
import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes2.dex */
final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f43218a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Serializable f43219b;

    public a() {
    }

    a(byte b2, Serializable serializable) {
        this.f43218a = b2;
        this.f43219b = serializable;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b2 = this.f43218a;
        Serializable serializable = this.f43219b;
        objectOutput.writeByte(b2);
        if (b2 == 1) {
            ((f) serializable).writeExternal(objectOutput);
            return;
        }
        if (b2 == 2) {
            ((b) serializable).writeExternal(objectOutput);
        } else if (b2 == 3) {
            ((e) serializable).writeExternal(objectOutput);
        } else {
            if (b2 == 100) {
                ((f) serializable).l(objectOutput);
                return;
            }
            throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Serializable serializableK;
        byte b2 = objectInput.readByte();
        this.f43218a = b2;
        if (b2 == 1) {
            serializableK = f.k(objectInput);
        } else if (b2 == 2) {
            long jA = a(objectInput);
            ZoneOffset zoneOffsetB = b(objectInput);
            ZoneOffset zoneOffsetB2 = b(objectInput);
            if (zoneOffsetB.equals(zoneOffsetB2)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            serializableK = new b(jA, zoneOffsetB, zoneOffsetB2);
        } else if (b2 == 3) {
            serializableK = e.b(objectInput);
        } else {
            if (b2 != 100) {
                throw new StreamCorruptedException("Unknown serialized type");
            }
            serializableK = new f(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f43219b = serializableK;
    }

    private Object readResolve() {
        return this.f43219b;
    }

    static void d(ZoneOffset zoneOffset, ObjectOutput objectOutput) {
        int totalSeconds = zoneOffset.getTotalSeconds();
        int i2 = totalSeconds % com.smartdigimkt.o1.b.z1 == 0 ? totalSeconds / com.smartdigimkt.o1.b.z1 : 127;
        objectOutput.writeByte(i2);
        if (i2 == 127) {
            objectOutput.writeInt(totalSeconds);
        }
    }

    static ZoneOffset b(ObjectInput objectInput) throws IOException {
        byte b2 = objectInput.readByte();
        return b2 == 127 ? ZoneOffset.f0(objectInput.readInt()) : ZoneOffset.f0(b2 * 900);
    }

    static void c(long j, ObjectOutput objectOutput) {
        if (j >= -4575744000L && j < 10413792000L && j % 900 == 0) {
            int i2 = (int) ((j + 4575744000L) / 900);
            objectOutput.writeByte((i2 >>> 16) & 255);
            objectOutput.writeByte((i2 >>> 8) & 255);
            objectOutput.writeByte(i2 & 255);
            return;
        }
        objectOutput.writeByte(255);
        objectOutput.writeLong(j);
    }

    static long a(ObjectInput objectInput) {
        int i2 = objectInput.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED;
        if (i2 == 255) {
            return objectInput.readLong();
        }
        return (((long) (((i2 << 16) + ((objectInput.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) << 8)) + (objectInput.readByte() & AdConfig.NETWORK_LOAD_LIMIT_DISABLED))) * 900) - 4575744000L;
    }
}
