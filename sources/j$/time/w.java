package j$.time;

import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
final class w extends ZoneId {
    public static final /* synthetic */ int d = 0;
    private static final long serialVersionUID = 8386373296231747096L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f43215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final transient j$.time.zone.f f43216c;

    static w c0(String str, boolean z2) {
        j$.time.zone.f fVarB;
        Objects.requireNonNull(str, "zoneId");
        int length = str.length();
        if (length >= 2) {
            for (int i2 = 0; i2 < length; i2++) {
                char cCharAt = str.charAt(i2);
                if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i2 == 0) && ((cCharAt < '0' || cCharAt > '9' || i2 == 0) && ((cCharAt != '~' || i2 == 0) && ((cCharAt != '.' || i2 == 0) && ((cCharAt != '_' || i2 == 0) && ((cCharAt != '+' || i2 == 0) && (cCharAt != '-' || i2 == 0))))))))) {
                    throw new c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
                }
            }
            try {
                fVarB = j$.time.zone.j.b(str, true);
            } catch (j$.time.zone.g e2) {
                if (z2) {
                    throw e2;
                }
                fVarB = null;
            }
            return new w(str, fVarB);
        }
        throw new c("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
    }

    w(String str, j$.time.zone.f fVar) {
        this.f43215b = str;
        this.f43216c = fVar;
    }

    @Override // j$.time.ZoneId
    public final String s() {
        return this.f43215b;
    }

    @Override // j$.time.ZoneId
    public final j$.time.zone.f C() {
        j$.time.zone.f fVar = this.f43216c;
        return fVar != null ? fVar : j$.time.zone.j.b(this.f43215b, false);
    }

    private Object writeReplace() {
        return new r((byte) 7, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.ZoneId
    final void b0(ObjectOutput objectOutput) throws IOException {
        objectOutput.writeByte(7);
        objectOutput.writeUTF(this.f43215b);
    }

    final void d0(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f43215b);
    }
}
