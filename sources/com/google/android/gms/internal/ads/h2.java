package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class h2 implements n2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vx1 f15061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f15062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f15063d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15065f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15066g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f15064e = new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f15060a = new byte[4096];

    static {
        z5.a("media3.extractor");
    }

    public h2(vx1 vx1Var, long j10, long j11) {
        this.f15061b = vx1Var;
        this.f15063d = j10;
        this.f15062c = j11;
    }

    public final boolean a(int i10, boolean z10) throws EOFException, InterruptedIOException {
        c(i10);
        int iE = this.f15066g - this.f15065f;
        while (iE < i10) {
            h2 h2Var = this;
            int i11 = i10;
            boolean z11 = z10;
            iE = h2Var.e(this.f15064e, this.f15065f, i11, iE, z11);
            if (iE == -1) {
                return false;
            }
            h2Var.f15066g = h2Var.f15065f + iE;
            this = h2Var;
            i10 = i11;
            z10 = z11;
        }
        this.f15065f += i10;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void b(int i10) throws EOFException, InterruptedIOException {
        a(i10, false);
    }

    public final void c(int i10) {
        int i11 = this.f15065f + i10;
        int length = this.f15064e.length;
        if (i11 > length) {
            String str = uu0.f20901a;
            this.f15064e = Arrays.copyOf(this.f15064e, Math.max(C.DEFAULT_BUFFER_SEGMENT_SIZE + i11, Math.min(length + length, i11 + 524288)));
        }
    }

    public final void d(int i10) {
        int i11 = this.f15066g - i10;
        this.f15066g = i11;
        this.f15065f = 0;
        byte[] bArr = this.f15064e;
        byte[] bArr2 = i11 < bArr.length + (-524288) ? new byte[C.DEFAULT_BUFFER_SEGMENT_SIZE + i11] : bArr;
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        this.f15064e = bArr2;
    }

    public final int e(byte[] bArr, int i10, int i11, int i12, boolean z10) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iT = this.f15061b.t(bArr, i10 + i12, i11 - i12);
        if (iT != -1) {
            return i12 + iT;
        }
        if (i12 == 0 && z10) {
            return -1;
        }
        throw new EOFException();
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final boolean j(int i10, boolean z10) throws EOFException, InterruptedIOException {
        int iMin = Math.min(this.f15066g, i10);
        d(iMin);
        int iE = iMin;
        while (iE < i10 && iE != -1) {
            iE = e(this.f15060a, -iE, Math.min(i10, iE + 4096), iE, z10);
        }
        if (iE != -1) {
            this.f15063d += (long) iE;
        }
        return iE != -1;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final boolean m(byte[] bArr, int i10, int i11, boolean z10) {
        if (!a(i11, z10)) {
            return false;
        }
        System.arraycopy(this.f15064e, this.f15065f - i11, bArr, i10, i11);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void p(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        x(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.vx1
    public final int t(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        h2 h2Var;
        int i12 = this.f15066g;
        int iE = 0;
        if (i12 != 0) {
            int iMin = Math.min(i12, i11);
            System.arraycopy(this.f15064e, 0, bArr, i10, iMin);
            d(iMin);
            iE = iMin;
        }
        if (iE == 0) {
            h2Var = this;
            iE = h2Var.e(bArr, i10, i11, 0, true);
        } else {
            h2Var = this;
        }
        if (iE != -1) {
            h2Var.f15063d += (long) iE;
        }
        return iE;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void v(byte[] bArr, int i10, int i11) {
        m(bArr, i10, i11, false);
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final boolean x(byte[] bArr, int i10, int i11, boolean z10) throws EOFException, InterruptedIOException {
        int iMin;
        int i12 = this.f15066g;
        if (i12 == 0) {
            iMin = 0;
        } else {
            iMin = Math.min(i12, i11);
            System.arraycopy(this.f15064e, 0, bArr, i10, iMin);
            d(iMin);
        }
        int iE = iMin;
        while (iE < i11 && iE != -1) {
            iE = e(bArr, i10, i11, iE, z10);
        }
        if (iE != -1) {
            this.f15063d += (long) iE;
        }
        return iE != -1;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final int y(byte[] bArr, int i10, int i11) throws EOFException, InterruptedIOException {
        h2 h2Var;
        int iMin;
        c(i11);
        int i12 = this.f15066g;
        int i13 = this.f15065f;
        int i14 = i12 - i13;
        if (i14 == 0) {
            h2Var = this;
            iMin = h2Var.e(this.f15064e, i13, i11, 0, true);
            if (iMin == -1) {
                return -1;
            }
            h2Var.f15066g += iMin;
        } else {
            h2Var = this;
            iMin = Math.min(i11, i14);
        }
        System.arraycopy(h2Var.f15064e, h2Var.f15065f, bArr, i10, iMin);
        h2Var.f15065f += iMin;
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final int zzd() throws EOFException, InterruptedIOException {
        h2 h2Var;
        int iMin = Math.min(this.f15066g, 1);
        d(iMin);
        if (iMin == 0) {
            h2Var = this;
            iMin = h2Var.e(this.f15060a, 0, Math.min(1, 4096), 0, true);
        } else {
            h2Var = this;
        }
        if (iMin != -1) {
            h2Var.f15063d += (long) iMin;
        }
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void zzf(int i10) throws EOFException, InterruptedIOException {
        j(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final void zzl() {
        this.f15065f = 0;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final long zzm() {
        return this.f15063d + ((long) this.f15065f);
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final long zzn() {
        return this.f15063d;
    }

    @Override // com.google.android.gms.internal.ads.n2
    public final long zzo() {
        return this.f15062c;
    }
}
