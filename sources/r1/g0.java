package r1;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends j1.l {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f49293i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f49294j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f49295k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f49296m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f49297n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f49298o;

    @Override // j1.k
    public final long b(long j10) {
        return Math.max(0L, j10 - l1.y.S(this.f43604b.f43597a, this.f49294j + this.f49293i));
    }

    @Override // j1.l
    public final j1.h c(j1.h hVar) throws j1.j {
        if (!l1.y.H(hVar.f43599c)) {
            throw new j1.j(hVar);
        }
        this.f49295k = true;
        return (this.f49293i == 0 && this.f49294j == 0) ? j1.h.f43596e : hVar;
    }

    @Override // j1.l
    public final void d() {
        if (this.f49295k) {
            this.f49295k = false;
            int i10 = this.f49294j;
            int i11 = this.f43604b.f43600d;
            this.f49296m = new byte[i10 * i11];
            this.l = this.f49293i * i11;
        }
        this.f49297n = 0;
    }

    @Override // j1.l
    public final void e() {
        if (this.f49295k) {
            int i10 = this.f49297n;
            if (i10 > 0) {
                this.f49298o += (long) (i10 / this.f43604b.f43600d);
            }
            this.f49297n = 0;
        }
    }

    @Override // j1.l
    public final void f() {
        this.f49296m = l1.y.f44831b;
    }

    @Override // j1.l, j1.k
    public final ByteBuffer getOutput() {
        int i10;
        if (super.isEnded() && (i10 = this.f49297n) > 0) {
            g(i10).put(this.f49296m, 0, this.f49297n).flip();
            this.f49297n = 0;
        }
        return super.getOutput();
    }

    @Override // j1.l, j1.k
    public final boolean isEnded() {
        return super.isEnded() && this.f49297n == 0;
    }

    @Override // j1.k
    public final void queueInput(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.l);
        this.f49298o += (long) (iMin / this.f43604b.f43600d);
        this.l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.l > 0) {
            return;
        }
        int i11 = i10 - iMin;
        int length = (this.f49297n + i11) - this.f49296m.length;
        ByteBuffer byteBufferG = g(length);
        int iJ = l1.y.j(length, 0, this.f49297n);
        byteBufferG.put(this.f49296m, 0, iJ);
        int iJ2 = l1.y.j(length - iJ, 0, i11);
        byteBuffer.limit(byteBuffer.position() + iJ2);
        byteBufferG.put(byteBuffer);
        byteBuffer.limit(iLimit);
        int i12 = i11 - iJ2;
        int i13 = this.f49297n - iJ;
        this.f49297n = i13;
        byte[] bArr = this.f49296m;
        System.arraycopy(bArr, iJ, bArr, 0, i13);
        byteBuffer.get(this.f49296m, this.f49297n, i12);
        this.f49297n += i12;
        byteBufferG.flip();
    }
}
