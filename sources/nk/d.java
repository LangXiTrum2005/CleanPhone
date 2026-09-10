package nk;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class d extends e implements Serializable {
    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return c.f46784a;
    }

    @Override // nk.e
    public final int a(int i10) {
        return e.f46786b.a(i10);
    }

    @Override // nk.e
    public final int d() {
        return e.f46786b.d();
    }

    @Override // nk.e
    public final int e(int i10, int i11) {
        return e.f46786b.e(i10, i11);
    }

    @Override // nk.e
    public final long g() {
        return e.f46786b.g();
    }

    @Override // nk.e
    public final long h(long j10, long j11) {
        throw null;
    }
}
