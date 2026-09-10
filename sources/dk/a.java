package dk;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import xj.c;
import xj.f;
import xj.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends f implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum[] f38944a;

    public a(Enum[] enumArr) {
        this.f38944a = enumArr;
    }

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new b(this.f38944a);
    }

    @Override // xj.a, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum r3 = (Enum) obj;
        return ((Enum) k.s0(r3.ordinal(), this.f38944a)) == r3;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        c cVar = f.Companion;
        Enum[] enumArr = this.f38944a;
        int length = enumArr.length;
        cVar.getClass();
        c.a(i10, length);
        return enumArr[i10];
    }

    @Override // xj.a
    public final int getSize() {
        return this.f38944a.length;
    }

    @Override // xj.f, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) k.s0(iOrdinal, this.f38944a)) == r3) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // xj.f, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum r3 = (Enum) obj;
        int iOrdinal = r3.ordinal();
        if (((Enum) k.s0(iOrdinal, this.f38944a)) == r3) {
            return iOrdinal;
        }
        return -1;
    }
}
