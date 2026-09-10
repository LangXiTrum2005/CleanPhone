package j$.time.chrono;

import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes2.dex */
final class F implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f43020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f43021b;

    public F() {
    }

    F(byte b2, Object obj) {
        this.f43020a = b2;
        this.f43021b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b2 = this.f43020a;
        Object obj = this.f43021b;
        objectOutput.writeByte(b2);
        switch (b2) {
            case 1:
                objectOutput.writeUTF(((AbstractC3539a) obj).s());
                return;
            case 2:
                ((C3545g) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((l) obj).writeExternal(objectOutput);
                return;
            case 4:
                y yVar = (y) obj;
                yVar.getClass();
                objectOutput.writeInt(yVar.g(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(yVar.g(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(yVar.g(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                ((z) obj).C(objectOutput);
                return;
            case 6:
                ((r) obj).writeExternal(objectOutput);
                return;
            case 7:
                D d = (D) obj;
                d.getClass();
                objectOutput.writeInt(d.g(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(d.g(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(d.g(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                J j = (J) obj;
                j.getClass();
                objectOutput.writeInt(j.g(j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j.g(j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j.g(j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                ((C3546h) obj).writeExternal(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objR;
        byte b2 = objectInput.readByte();
        this.f43020a = b2;
        switch (b2) {
            case 1:
                int i2 = AbstractC3539a.f43028c;
                objR = AbstractC3539a.r(objectInput.readUTF());
                break;
            case 2:
                objR = ((InterfaceC3540b) objectInput.readObject()).L((j$.time.k) objectInput.readObject());
                break;
            case 3:
                objR = ((InterfaceC3543e) objectInput.readObject()).H((ZoneOffset) objectInput.readObject()).I((ZoneId) objectInput.readObject());
                break;
            case 4:
                j$.time.h hVar = y.d;
                int i3 = objectInput.readInt();
                byte b3 = objectInput.readByte();
                byte b4 = objectInput.readByte();
                w.d.getClass();
                objR = new y(j$.time.h.h0(i3, b3, b4));
                break;
            case 5:
                z zVar = z.d;
                objR = z.w(objectInput.readByte());
                break;
            case 6:
                p pVar = (p) objectInput.readObject();
                int i4 = objectInput.readInt();
                byte b5 = objectInput.readByte();
                byte b6 = objectInput.readByte();
                pVar.getClass();
                objR = r.Y(pVar, i4, b5, b6);
                break;
            case 7:
                int i5 = objectInput.readInt();
                byte b7 = objectInput.readByte();
                byte b8 = objectInput.readByte();
                B.d.getClass();
                objR = new D(j$.time.h.h0(i5 + 1911, b7, b8));
                break;
            case 8:
                int i6 = objectInput.readInt();
                byte b9 = objectInput.readByte();
                byte b10 = objectInput.readByte();
                H.d.getClass();
                objR = new J(j$.time.h.h0(i6 - 543, b9, b10));
                break;
            case 9:
                int i7 = C3546h.f43033e;
                objR = new C3546h(AbstractC3539a.r(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f43021b = objR;
    }

    private Object readResolve() {
        return this.f43021b;
    }
}
