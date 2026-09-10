package com.google.android.gms.internal.ads;

import com.applovin.shadow.okhttp3.internal.ws.RealWebSocket;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i70 implements x40 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f15631b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f15632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f15633d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public z20 f15634e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public z20 f15635f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public z20 f15636g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public z20 f15637h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15638i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public t60 f15639j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ByteBuffer f15640k;
    public ByteBuffer l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f15641m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f15642n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15643o;

    @Override // com.google.android.gms.internal.ads.x40
    public final void a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            t60 t60Var = this.f15639j;
            t60Var.getClass();
            this.f15641m += (long) byteBuffer.remaining();
            x50 x50Var = (x50) t60Var.f20214q;
            int iRemaining = byteBuffer.remaining();
            int iZza = iRemaining / (x50Var.zza() * t60Var.f20200b);
            x50Var.a(iZza);
            x50Var.z(iRemaining, byteBuffer);
            t60Var.f20207i += iZza;
            t60Var.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.x40
    public final void b(a40 a40Var) {
        if (zzc()) {
            z20 z20Var = this.f15634e;
            this.f15636g = z20Var;
            z20 z20Var2 = this.f15635f;
            this.f15637h = z20Var2;
            if (this.f15638i) {
                this.f15639j = new t60(z20Var.f22472a, z20Var.f22473b, this.f15632c, this.f15633d, z20Var2.f22472a, z20Var.f22474c == 4, 0);
            } else {
                t60 t60Var = this.f15639j;
                if (t60Var != null) {
                    t60Var.f20207i = 0;
                    t60Var.f20208j = 0;
                    t60Var.f20209k = 0;
                    t60Var.l = 0;
                    t60Var.f20210m = 0;
                    t60Var.f20211n = 0;
                    t60Var.f20212o = 0;
                    t60Var.f20213p = 0.0d;
                    ((x50) t60Var.f20214q).zzg();
                }
            }
        }
        this.l = x40.f21739a;
        this.f15641m = 0L;
        this.f15642n = 0L;
        this.f15643o = false;
    }

    @Override // com.google.android.gms.internal.ads.x40
    public final long c(long j10) {
        if (this.f15642n < RealWebSocket.DEFAULT_MINIMUM_DEFLATE_SIZE) {
            return (long) (j10 / ((double) this.f15632c));
        }
        long j11 = this.f15641m;
        t60 t60Var = this.f15639j;
        t60Var.getClass();
        long jZza = j11 - ((long) (((x50) t60Var.f20214q).zza() * (t60Var.f20207i * t60Var.f20200b)));
        int i10 = this.f15637h.f22472a;
        int i11 = this.f15636g.f22472a;
        return i10 == i11 ? uu0.v(j10, this.f15642n, jZza, RoundingMode.DOWN) : uu0.v(j10, this.f15642n * ((long) i11), jZza * ((long) i10), RoundingMode.DOWN);
    }

    @Override // com.google.android.gms.internal.ads.x40
    public final z20 d(z20 z20Var) throws p40 {
        int i10 = z20Var.f22474c;
        if (i10 != 2 && i10 != 4) {
            throw new p40("Unhandled input format:", z20Var);
        }
        int i11 = this.f15631b;
        if (i11 == -1) {
            i11 = z20Var.f22472a;
        }
        this.f15634e = z20Var;
        z20 z20Var2 = new z20(i11, z20Var.f22473b, i10);
        this.f15635f = z20Var2;
        this.f15638i = true;
        return z20Var2;
    }

    @Override // com.google.android.gms.internal.ads.x40
    public final boolean zzc() {
        if (this.f15635f.f22472a != -1) {
            return Math.abs(this.f15632c + (-1.0f)) >= 1.0E-4f || Math.abs(this.f15633d + (-1.0f)) >= 1.0E-4f || this.f15635f.f22472a != this.f15634e.f22472a;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.x40
    public final void zze() {
        t60 t60Var = this.f15639j;
        if (t60Var != null) {
            int i10 = t60Var.f20207i;
            int i11 = t60Var.f20211n;
            int i12 = t60Var.f20208j;
            float f10 = t60Var.f20201c;
            float f11 = t60Var.f20202d;
            int i13 = i12 + ((int) ((((((((double) (i10 - i11)) / ((double) (f10 / f11))) + ((double) i11)) + t60Var.f20213p) + ((double) t60Var.f20209k)) / ((double) (t60Var.f20203e * f11))) + 0.5d));
            t60Var.f20213p = 0.0d;
            int i14 = t60Var.f20206h;
            int i15 = i14 + i14;
            x50 x50Var = (x50) t60Var.f20214q;
            x50Var.a(i10 + i15);
            x50Var.A(i10 * t60Var.f20200b, i15);
            t60Var.f20207i += i15;
            t60Var.d();
            if (t60Var.f20208j > i13) {
                t60Var.f20208j = Math.max(i13, 0);
            }
            t60Var.f20207i = 0;
            t60Var.f20211n = 0;
            t60Var.f20209k = 0;
        }
        this.f15643o = true;
    }

    @Override // com.google.android.gms.internal.ads.x40
    public final ByteBuffer zzf() {
        t60 t60Var = this.f15639j;
        if (t60Var != null) {
            x50 x50Var = (x50) t60Var.f20214q;
            int i10 = t60Var.f20200b;
            ps1.c0(t60Var.f20208j >= 0);
            int iZza = x50Var.zza() * t60Var.f20208j * i10;
            if (iZza > 0) {
                if (this.f15640k.capacity() < iZza) {
                    this.f15640k = ByteBuffer.allocateDirect(iZza).order(ByteOrder.nativeOrder());
                } else {
                    this.f15640k.clear();
                }
                ByteBuffer byteBuffer = this.f15640k;
                ps1.c0(t60Var.f20208j >= 0);
                int iMin = Math.min(byteBuffer.remaining() / (x50Var.zza() * i10), t60Var.f20208j);
                x50Var.B(iMin, byteBuffer);
                t60Var.f20208j -= iMin;
                System.arraycopy(x50Var.zzq(), iMin * i10, x50Var.zzq(), 0, t60Var.f20208j * i10);
                this.f15640k.flip();
                this.f15642n += (long) iZza;
                this.l = this.f15640k;
            }
        }
        ByteBuffer byteBuffer2 = this.l;
        this.l = x40.f21739a;
        return byteBuffer2;
    }

    @Override // com.google.android.gms.internal.ads.x40
    public final boolean zzg() {
        if (this.f15643o) {
            t60 t60Var = this.f15639j;
            if (t60Var != null) {
                ps1.c0(t60Var.f20208j >= 0);
                if (((x50) t60Var.f20214q).zza() * t60Var.f20208j * t60Var.f20200b != 0) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.x40
    public final void zzj() {
        this.f15632c = 1.0f;
        this.f15633d = 1.0f;
        z20 z20Var = z20.f22471e;
        this.f15634e = z20Var;
        this.f15635f = z20Var;
        this.f15636g = z20Var;
        this.f15637h = z20Var;
        ByteBuffer byteBuffer = x40.f21739a;
        this.f15640k = byteBuffer;
        this.l = byteBuffer;
        this.f15631b = -1;
        this.f15638i = false;
        this.f15639j = null;
        this.f15641m = 0L;
        this.f15642n = 0L;
        this.f15643o = false;
    }
}
