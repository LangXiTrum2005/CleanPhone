package n2;

import java.io.EOFException;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f46478a = new byte[4096];

    @Override // n2.a0
    public final void d(l1.q qVar, int i10, int i11) {
        qVar.N(i10);
    }

    @Override // n2.a0
    public final int f(i1.i iVar, int i10, boolean z10) throws EOFException {
        byte[] bArr = this.f46478a;
        int i11 = iVar.read(bArr, 0, Math.min(bArr.length, i10));
        if (i11 != -1) {
            return i11;
        }
        if (z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // n2.a0
    public final void b(i1.p pVar) {
    }

    @Override // n2.a0
    public final void a(long j10, int i10, int i11, int i12, z zVar) {
    }
}
