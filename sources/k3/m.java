package k3;

import oa.e0;
import oa.j0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public interface m {
    void e(byte[] bArr, int i10, int i11, l lVar, l1.g gVar);

    default d g(byte[] bArr, int i10, int i11) {
        e0 e0VarU = j0.u();
        e(bArr, 0, i11, l.f44295c, new j(e0VarU, 0));
        return new b(e0VarU.g());
    }

    int i();

    default void reset() {
    }
}
