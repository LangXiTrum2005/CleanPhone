package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class x12 extends k50 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f21704i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f21705j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f21706k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f21707m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public byte[] f21708n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f21709o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f21710p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public byte[] f21711q;

    @Override // com.google.android.gms.internal.ads.x40
    public final void a(ByteBuffer byteBuffer) {
        int iLimit;
        int i10;
        int iPosition;
        while (byteBuffer.hasRemaining() && !this.f16329g.hasRemaining()) {
            if (this.f21706k != 0) {
                ps1.c0(this.f21709o < this.f21708n.length);
                int iLimit2 = byteBuffer.limit();
                int iPosition2 = byteBuffer.position() + 1;
                while (true) {
                    if (iPosition2 >= byteBuffer.limit()) {
                        iLimit = byteBuffer.limit();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iPosition2) << 8) | (byteBuffer.get(iPosition2 - 1) & 255)) > 1024) {
                        int i11 = this.f21704i;
                        iLimit = (iPosition2 / i11) * i11;
                        break;
                    }
                    iPosition2 += 2;
                }
                int iPosition3 = iLimit - byteBuffer.position();
                int i12 = this.f21709o;
                int i13 = this.f21710p;
                int i14 = i12 + i13;
                int length = this.f21708n.length;
                if (i14 < length) {
                    i10 = length - i14;
                } else {
                    i14 = i13 - (length - i12);
                    i10 = i12 - i14;
                }
                int iMin = Math.min(iPosition3, i10);
                byteBuffer.limit(byteBuffer.position() + iMin);
                byteBuffer.get(this.f21708n, i14, iMin);
                int i15 = this.f21710p + iMin;
                this.f21710p = i15;
                ps1.c0(i15 <= this.f21708n.length);
                boolean z10 = iLimit < iLimit2 && iPosition3 < i10;
                j(z10);
                if (z10) {
                    this.f21706k = 0;
                    this.f21707m = 0;
                }
                byteBuffer.limit(iLimit2);
            } else {
                int iLimit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(iLimit3, byteBuffer.position() + this.f21708n.length));
                int iLimit4 = byteBuffer.limit() - 1;
                while (true) {
                    if (iLimit4 < byteBuffer.position()) {
                        iPosition = byteBuffer.position();
                        break;
                    }
                    if (Math.abs((byteBuffer.get(iLimit4) << 8) | (byteBuffer.get(iLimit4 - 1) & 255)) > 1024) {
                        int i16 = this.f21704i;
                        iPosition = defpackage.e.e(iLimit4, i16, i16, i16);
                        break;
                    }
                    iLimit4 -= 2;
                }
                if (iPosition == byteBuffer.position()) {
                    this.f21706k = 1;
                } else {
                    byteBuffer.limit(Math.min(iPosition, byteBuffer.capacity()));
                    e(byteBuffer.remaining()).put(byteBuffer).flip();
                }
                byteBuffer.limit(iLimit3);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.k50
    public final z20 f(z20 z20Var) throws p40 {
        if (z20Var.f22474c == 2) {
            return z20Var.f22472a == -1 ? z20.f22471e : z20Var;
        }
        throw new p40("Unhandled input format:", z20Var);
    }

    @Override // com.google.android.gms.internal.ads.k50
    public final void g() {
        if (this.f21710p > 0) {
            j(true);
            this.f21707m = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.k50
    public final void h() {
        if (zzc()) {
            z20 z20Var = this.f16324b;
            int i10 = z20Var.f22473b;
            int i11 = i10 + i10;
            this.f21704i = i11;
            int i12 = ((((int) ((100000 * ((long) z20Var.f22472a)) / 1000000)) / 2) / i11) * i11;
            int i13 = i12 + i12;
            if (this.f21708n.length != i13) {
                this.f21708n = new byte[i13];
                this.f21711q = new byte[i13];
            }
        }
        this.f21706k = 0;
        this.l = 0L;
        this.f21707m = 0;
        this.f21709o = 0;
        this.f21710p = 0;
    }

    @Override // com.google.android.gms.internal.ads.k50
    public final void i() {
        this.f21705j = false;
        byte[] bArr = uu0.f20902b;
        this.f21708n = bArr;
        this.f21711q = bArr;
    }

    public final void j(boolean z10) {
        int i10;
        int length;
        int i11 = this.f21710p;
        int length2 = this.f21708n.length;
        if (i11 != length2) {
            if (!z10) {
                return;
            } else {
                z10 = true;
            }
        }
        if (this.f21707m == 0) {
            if (z10) {
                l(i11, 3);
                length = i11;
            } else {
                ps1.c0(i11 >= (length2 >> 1));
                length = this.f21708n.length >> 1;
                l(length, 0);
            }
            i10 = length;
        } else {
            int i12 = length2 >> 1;
            int i13 = i11 - i12;
            if (z10) {
                int iK = k(i13) + (this.f21708n.length >> 1);
                l(iK, 2);
                int i14 = i12 + i13;
                i10 = iK;
                length = i14;
            } else {
                int iK2 = k(i13);
                l(iK2, 1);
                i10 = iK2;
                length = i13;
            }
        }
        if (length % this.f21704i != 0) {
            throw new IllegalStateException(dv.B("bytesConsumed is not aligned to frame size: %s", Integer.valueOf(length)));
        }
        ps1.c0(i11 >= i10);
        this.f21710p -= length;
        int i15 = this.f21709o + length;
        this.f21709o = i15;
        this.f21709o = i15 % this.f21708n.length;
        int i16 = this.f21707m;
        int i17 = this.f21704i;
        this.f21707m = (i10 / i17) + i16;
        this.l += (long) ((length - i10) / i17);
    }

    public final int k(int i10) {
        int length = ((((int) ((2000000 * ((long) this.f16324b.f22472a)) / 1000000)) - this.f21707m) * this.f21704i) - (this.f21708n.length >> 1);
        ps1.c0(length >= 0);
        int iMin = (int) Math.min((i10 * 0.2f) + 0.5f, length);
        int i11 = this.f21704i;
        return (iMin / i11) * i11;
    }

    public final void l(int i10, int i11) {
        int i12;
        if (i10 == 0) {
            return;
        }
        ps1.v(this.f21710p >= i10);
        if (i11 == 2) {
            int i13 = this.f21709o;
            int i14 = this.f21710p;
            int i15 = i13 + i14;
            byte[] bArr = this.f21708n;
            int length = bArr.length;
            if (i15 <= length) {
                System.arraycopy(bArr, i15 - i10, this.f21711q, 0, i10);
            } else {
                int i16 = i14 - (length - i13);
                if (i16 >= i10) {
                    System.arraycopy(bArr, i16 - i10, this.f21711q, 0, i10);
                } else {
                    int i17 = i10 - i16;
                    System.arraycopy(bArr, length - i17, this.f21711q, 0, i17);
                    System.arraycopy(this.f21708n, 0, this.f21711q, i17, i16);
                }
            }
        } else {
            int i18 = this.f21709o;
            int i19 = i18 + i10;
            byte[] bArr2 = this.f21708n;
            int length2 = bArr2.length;
            if (i19 <= length2) {
                System.arraycopy(bArr2, i18, this.f21711q, 0, i10);
            } else {
                int i20 = length2 - i18;
                System.arraycopy(bArr2, i18, this.f21711q, 0, i20);
                System.arraycopy(this.f21708n, 0, this.f21711q, i20, i10 - i20);
            }
        }
        ps1.N(i10, "sizeToOutput is not aligned to frame size: %s", i10 % this.f21704i == 0);
        ps1.c0(this.f21709o < this.f21708n.length);
        byte[] bArr3 = this.f21711q;
        ps1.N(i10, "byteOutput size is not aligned to frame size %s", i10 % this.f21704i == 0);
        if (i11 != 3) {
            for (int i21 = 0; i21 < i10; i21 += 2) {
                int i22 = i21 + 1;
                int i23 = (bArr3[i22] << 8) | (bArr3[i21] & 255);
                if (i11 == 0) {
                    i12 = ((((i21 * 1000) / (i10 - 1)) * (-90)) / 1000) + 100;
                } else {
                    i12 = 10;
                    if (i11 == 2) {
                        i12 = 10 + (((90000 * i21) / (i10 - 1)) / 1000);
                    }
                }
                int i24 = (i23 * i12) / 100;
                if (i24 >= 32767) {
                    bArr3[i21] = -1;
                    bArr3[i22] = 127;
                } else if (i24 <= -32768) {
                    bArr3[i21] = 0;
                    bArr3[i22] = -128;
                } else {
                    bArr3[i21] = (byte) (i24 & 255);
                    bArr3[i22] = (byte) (i24 >> 8);
                }
            }
        }
        e(i10).put(bArr3, 0, i10).flip();
    }

    @Override // com.google.android.gms.internal.ads.k50, com.google.android.gms.internal.ads.x40
    public final boolean zzc() {
        return super.zzc() && this.f21705j;
    }
}
