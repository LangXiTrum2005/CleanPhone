package r1;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends j1.l {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f49271n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f49272o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f49273p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f49274q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public byte[] f49276s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public byte[] f49279v;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f49275r = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f49277t = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f49278u = 0;
    public final long l = 100000;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float f49267i = 0.2f;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final long f49270m = 2000000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f49269k = 10;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final short f49268j = 1024;

    public e0() {
        byte[] bArr = l1.y.f44831b;
        this.f49276s = bArr;
        this.f49279v = bArr;
    }

    @Override // j1.l
    public final j1.h c(j1.h hVar) throws j1.j {
        if (hVar.f43599c == 2) {
            return hVar.f43597a == -1 ? j1.h.f43596e : hVar;
        }
        throw new j1.j(hVar);
    }

    @Override // j1.l
    public final void d() {
        if (isActive()) {
            j1.h hVar = this.f43604b;
            int i10 = hVar.f43598b * 2;
            this.f49271n = i10;
            int i11 = ((((int) ((this.l * ((long) hVar.f43597a)) / 1000000)) / 2) / i10) * i10 * 2;
            if (this.f49276s.length != i11) {
                this.f49276s = new byte[i11];
                this.f49279v = new byte[i11];
            }
        }
        this.f49273p = 0;
        this.f49274q = 0L;
        this.f49275r = 0;
        this.f49277t = 0;
        this.f49278u = 0;
    }

    @Override // j1.l
    public final void e() {
        if (this.f49278u > 0) {
            i(true);
            this.f49275r = 0;
        }
    }

    @Override // j1.l
    public final void f() {
        this.f49272o = false;
        byte[] bArr = l1.y.f44831b;
        this.f49276s = bArr;
        this.f49279v = bArr;
    }

    public final int h(int i10) {
        int length = ((((int) ((this.f49270m * ((long) this.f43604b.f43597a)) / 1000000)) - this.f49275r) * this.f49271n) - (this.f49276s.length / 2);
        go.k.t(length >= 0);
        int iMin = (int) Math.min((i10 * this.f49267i) + 0.5f, length);
        int i11 = this.f49271n;
        return (iMin / i11) * i11;
    }

    public final void i(boolean z10) {
        int length;
        int iH;
        int i10 = this.f49278u;
        byte[] bArr = this.f49276s;
        if (i10 == bArr.length || z10) {
            if (this.f49275r == 0) {
                if (z10) {
                    j(i10, 3);
                    length = i10;
                } else {
                    go.k.t(i10 >= bArr.length / 2);
                    length = this.f49276s.length / 2;
                    j(length, 0);
                }
                iH = length;
            } else if (z10) {
                int length2 = i10 - (bArr.length / 2);
                int length3 = (bArr.length / 2) + length2;
                int iH2 = h(length2) + (this.f49276s.length / 2);
                j(iH2, 2);
                iH = iH2;
                length = length3;
            } else {
                length = i10 - (bArr.length / 2);
                iH = h(length);
                j(iH, 1);
            }
            if (!(length % this.f49271n == 0)) {
                throw new IllegalStateException(j1.f.B("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
            }
            go.k.t(i10 >= iH);
            this.f49278u -= length;
            int i11 = this.f49277t + length;
            this.f49277t = i11;
            this.f49277t = i11 % this.f49276s.length;
            int i12 = this.f49275r;
            int i13 = this.f49271n;
            this.f49275r = (iH / i13) + i12;
            this.f49274q += (long) ((length - iH) / i13);
        }
    }

    @Override // j1.l, j1.k
    public final boolean isActive() {
        return super.isActive() && this.f49272o;
    }

    public final void j(int i10, int i11) {
        if (i10 == 0) {
            return;
        }
        go.k.i(this.f49278u >= i10);
        if (i11 == 2) {
            int i12 = this.f49277t;
            int i13 = this.f49278u;
            int i14 = i12 + i13;
            byte[] bArr = this.f49276s;
            if (i14 <= bArr.length) {
                System.arraycopy(bArr, i14 - i10, this.f49279v, 0, i10);
            } else {
                int length = i13 - (bArr.length - i12);
                if (length >= i10) {
                    System.arraycopy(bArr, length - i10, this.f49279v, 0, i10);
                } else {
                    int i15 = i10 - length;
                    System.arraycopy(bArr, bArr.length - i15, this.f49279v, 0, i15);
                    System.arraycopy(this.f49276s, 0, this.f49279v, i15, length);
                }
            }
        } else {
            int i16 = this.f49277t;
            int i17 = i16 + i10;
            byte[] bArr2 = this.f49276s;
            if (i17 <= bArr2.length) {
                System.arraycopy(bArr2, i16, this.f49279v, 0, i10);
            } else {
                int length2 = bArr2.length - i16;
                System.arraycopy(bArr2, i16, this.f49279v, 0, length2);
                System.arraycopy(this.f49276s, 0, this.f49279v, length2, i10 - length2);
            }
        }
        go.k.e(i10, "sizeToOutput is not aligned to frame size: %s", i10 % this.f49271n == 0);
        go.k.t(this.f49277t < this.f49276s.length);
        byte[] bArr3 = this.f49279v;
        go.k.e(i10, "byteOutput size is not aligned to frame size %s", i10 % this.f49271n == 0);
        if (i11 != 3) {
            for (int i18 = 0; i18 < i10; i18 += 2) {
                int i19 = i18 + 1;
                int i20 = (bArr3[i19] << 8) | (bArr3[i18] & 255);
                int i21 = this.f49269k;
                if (i11 == 0) {
                    i21 = ((((i18 * 1000) / (i10 - 1)) * (i21 - 100)) / 1000) + 100;
                } else if (i11 == 2) {
                    i21 += (((i18 * 1000) * (100 - i21)) / (i10 - 1)) / 1000;
                }
                int i22 = (i20 * i21) / 100;
                if (i22 >= 32767) {
                    bArr3[i18] = -1;
                    bArr3[i19] = 127;
                } else if (i22 <= -32768) {
                    bArr3[i18] = 0;
                    bArr3[i19] = -128;
                } else {
                    bArr3[i18] = (byte) (i22 & 255);
                    bArr3[i19] = (byte) (i22 >> 8);
                }
            }
        }
        g(i10).put(bArr3, 0, i10).flip();
    }

    @Override // j1.k
    public final void queueInput(ByteBuffer byteBuffer) {
        int iLimit;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f43609g.hasRemaining()) {
            int i10 = this.f49273p;
            short s10 = this.f49268j;
            if (i10 == 0) {
                int iLimit2 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit2, byteBuffer.position() + this.f49276s.length));
                int iLimit3 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit3 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit3) << 8) | (byteBuffer.get(iLimit3 - 1) & 255)) > s10) {
                        int i11 = this.f49271n;
                        iPosition = defpackage.e.e(iLimit3, i11, i11, i11);
                        break;
                    }
                    iLimit3 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f49273p = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    g(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit2);
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException();
                }
                go.k.t(this.f49277t < this.f49276s.length);
                int iLimit4 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > s10) {
                        int i12 = this.f49271n;
                        iLimit = (iPosition2 / i12) * i12;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int length = this.f49277t;
                int i13 = this.f49278u;
                int length2 = length + i13;
                byte[] bArr = this.f49276s;
                if (length2 < bArr.length) {
                    length = bArr.length;
                } else {
                    length2 = i13 - (bArr.length - length);
                }
                int i14 = length - length2;
                boolean z10 = iLimit < iLimit4;
                int iMin = Math.min(iPosition3, i14);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f49276s, length2, iMin);
                int i15 = this.f49278u + iMin;
                this.f49278u = i15;
                go.k.t(i15 <= this.f49276s.length);
                boolean z11 = z10 && iPosition3 < i14;
                i(z11);
                if (z11) {
                    this.f49273p = 0;
                    this.f49275r = 0;
                }
                byteBuffer.limit(iLimit4);
            }
        }
    }
}
