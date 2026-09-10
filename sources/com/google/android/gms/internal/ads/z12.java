package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class z12 extends k50 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f22463i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f22464j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f22465k;
    public int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public byte[] f22466m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f22467n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f22468o;

    @Override // com.google.android.gms.internal.ads.x40
    public final void a(ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i10 = iLimit - iPosition;
        if (i10 == 0) {
            return;
        }
        int iMin = Math.min(i10, this.l);
        this.f22468o += (long) (iMin / this.f16324b.f22475d);
        this.l -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.l <= 0) {
            int i11 = i10 - iMin;
            int length = (this.f22467n + i11) - this.f22466m.length;
            ByteBuffer byteBufferE = e(length);
            int i12 = this.f22467n;
            String str = uu0.f20901a;
            int iMax = Math.max(0, Math.min(length, i12));
            byteBufferE.put(this.f22466m, 0, iMax);
            int iMax2 = Math.max(0, Math.min(length - iMax, i11));
            byteBuffer.limit(byteBuffer.position() + iMax2);
            byteBufferE.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i13 = i11 - iMax2;
            int i14 = this.f22467n - iMax;
            this.f22467n = i14;
            byte[] bArr = this.f22466m;
            System.arraycopy(bArr, iMax, bArr, 0, i14);
            byteBuffer.get(this.f22466m, this.f22467n, i13);
            this.f22467n += i13;
            byteBufferE.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.x40
    public final long c(long j10) {
        return Math.max(0L, j10 - uu0.u(this.f16324b.f22472a, this.f22464j + this.f22463i));
    }

    @Override // com.google.android.gms.internal.ads.k50
    public final z20 f(z20 z20Var) throws p40 {
        if (!uu0.d(z20Var.f22474c)) {
            throw new p40("Unhandled input format:", z20Var);
        }
        this.f22465k = true;
        return (this.f22463i == 0 && this.f22464j == 0) ? z20.f22471e : z20Var;
    }

    @Override // com.google.android.gms.internal.ads.k50
    public final void g() {
        if (this.f22465k) {
            int i10 = this.f22467n;
            if (i10 > 0) {
                this.f22468o += (long) (i10 / this.f16324b.f22475d);
            }
            this.f22467n = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.k50
    public final void h() {
        if (this.f22465k) {
            this.f22465k = false;
            int i10 = this.f22464j;
            int i11 = this.f16324b.f22475d;
            this.f22466m = new byte[i10 * i11];
            this.l = this.f22463i * i11;
        }
        this.f22467n = 0;
    }

    @Override // com.google.android.gms.internal.ads.k50
    public final void i() {
        this.f22466m = uu0.f20902b;
    }

    @Override // com.google.android.gms.internal.ads.k50, com.google.android.gms.internal.ads.x40
    public final ByteBuffer zzf() {
        int i10;
        if (super.zzg() && (i10 = this.f22467n) > 0) {
            e(i10).put(this.f22466m, 0, this.f22467n).flip();
            this.f22467n = 0;
        }
        return super.zzf();
    }

    @Override // com.google.android.gms.internal.ads.k50, com.google.android.gms.internal.ads.x40
    public final boolean zzg() {
        return super.zzg() && this.f22467n == 0;
    }
}
