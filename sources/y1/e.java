package y1;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends o1.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f54118j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f54119k;
    public int l;

    @Override // o1.d
    public final void g() {
        super.g();
        this.f54119k = 0;
    }

    public final boolean k(o1.d dVar) {
        ByteBuffer byteBuffer;
        go.k.i(!dVar.c(1073741824));
        go.k.i(!dVar.c(268435456));
        go.k.i(!dVar.c(4));
        if (l()) {
            if (this.f54119k >= this.l) {
                return false;
            }
            ByteBuffer byteBuffer2 = dVar.f47035e;
            if (byteBuffer2 != null && (byteBuffer = this.f47035e) != null) {
                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                    return false;
                }
            }
        }
        int i10 = this.f54119k;
        this.f54119k = i10 + 1;
        if (i10 == 0) {
            this.f47037g = dVar.f47037g;
            if (dVar.c(1)) {
                this.f22444b = 1;
            }
        }
        ByteBuffer byteBuffer3 = dVar.f47035e;
        if (byteBuffer3 != null) {
            i(byteBuffer3.remaining());
            this.f47035e.put(byteBuffer3);
        }
        this.f54118j = dVar.f47037g;
        return true;
    }

    public final boolean l() {
        return this.f54119k > 0;
    }
}
