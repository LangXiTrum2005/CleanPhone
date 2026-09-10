package yj;

import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.AbstractCollection;
import java.util.Iterator;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements Externalizable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractCollection f54437a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f54438b;

    public i(AbstractCollection abstractCollection, int i10) {
        this.f54437a = abstractCollection;
        this.f54438b = i10;
    }

    private final Object readResolve() {
        return this.f54437a;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput input) throws IOException {
        AbstractCollection abstractCollectionD;
        n.f(input, "input");
        byte b10 = input.readByte();
        int i10 = b10 & 1;
        if ((b10 & (-2)) != 0) {
            throw new InvalidObjectException("Unsupported flags value: " + ((int) b10) + '.');
        }
        int i11 = input.readInt();
        if (i11 < 0) {
            throw new InvalidObjectException("Illegal size value: " + i11 + '.');
        }
        int i12 = 0;
        if (i10 == 0) {
            c cVar = new c(i11);
            while (i12 < i11) {
                cVar.add(input.readObject());
                i12++;
            }
            abstractCollectionD = j1.f.d(cVar);
        } else {
            if (i10 != 1) {
                throw new InvalidObjectException("Unsupported collection type tag: " + i10 + '.');
            }
            k kVar = new k(new f(i11));
            while (i12 < i11) {
                kVar.add(input.readObject());
                i12++;
            }
            f fVar = kVar.f54441a;
            fVar.g();
            abstractCollectionD = kVar;
            if (fVar.f54430i <= 0) {
                abstractCollectionD = k.f54440b;
            }
        }
        this.f54437a = abstractCollectionD;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput output) throws IOException {
        n.f(output, "output");
        output.writeByte(this.f54438b);
        output.writeInt(this.f54437a.size());
        Iterator it = this.f54437a.iterator();
        while (it.hasNext()) {
            output.writeObject(it.next());
        }
    }
}
