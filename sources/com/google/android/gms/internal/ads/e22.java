package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Trace;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class e22 implements m22, y1.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f13810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13812c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MediaCodec.Callback f13813d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f13814e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f13815f;

    public /* synthetic */ e22(MediaCodec mediaCodec, HandlerThread handlerThread, n22 n22Var, l22 l22Var) {
        this.f13810a = mediaCodec;
        this.f13813d = new i22(handlerThread, 0);
        this.f13814e = n22Var;
        this.f13815f = l22Var;
    }

    public static void D(e22 e22Var, MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        y1.h hVar;
        i22 i22Var = (i22) e22Var.f13813d;
        MediaCodec mediaCodec = e22Var.f13810a;
        HandlerThread handlerThread = i22Var.f15535c;
        go.k.t(i22Var.f15536d == null);
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        mediaCodec.setCallback(i22Var, handler);
        i22Var.f15536d = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, mediaCrypto, i10);
        Trace.endSection();
        ((y1.k) e22Var.f13814e).start();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (hVar = (y1.h) e22Var.f13815f) != null) {
            hVar.a(mediaCodec);
        }
        e22Var.f13812c = 1;
    }

    public static String E(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    public static String G(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    @Override // y1.j
    public ByteBuffer A(int i10) {
        return this.f13810a.getOutputBuffer(i10);
    }

    @Override // y1.j
    public void B(ArrayList arrayList) {
        this.f13810a.subscribeToVendorParameters(arrayList);
    }

    @Override // y1.j
    public void C(ArrayList arrayList) {
        this.f13810a.unsubscribeFromVendorParameters(arrayList);
    }

    public void F(MediaFormat mediaFormat, Surface surface, int i10) {
        l22 l22Var;
        i22 i22Var = (i22) this.f13813d;
        ps1.c0(i22Var.f15536d == null);
        HandlerThread handlerThread = i22Var.f15535c;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        MediaCodec mediaCodec = this.f13810a;
        mediaCodec.setCallback(i22Var, handler);
        i22Var.f15536d = handler;
        Trace.beginSection("configureCodec");
        mediaCodec.configure(mediaFormat, surface, (MediaCrypto) null, i10);
        Trace.endSection();
        ((n22) this.f13814e).zza();
        Trace.beginSection("startCodec");
        mediaCodec.start();
        Trace.endSection();
        if (Build.VERSION.SDK_INT >= 35 && (l22Var = (l22) this.f13815f) != null) {
            l22Var.c(mediaCodec);
        }
        this.f13812c = 1;
    }

    @Override // com.google.android.gms.internal.ads.m22
    public ByteBuffer a(int i10) {
        return this.f13810a.getOutputBuffer(i10);
    }

    @Override // y1.j
    public void b(Bundle bundle) {
        ((y1.k) this.f13814e).b(bundle);
    }

    @Override // y1.j
    public void c(int i10, qx1 qx1Var, long j10, int i11) {
        ((y1.k) this.f13814e).c(i10, qx1Var, j10, i11);
    }

    @Override // y1.j
    public void d(int i10, int i11, int i12, long j10) {
        ((y1.k) this.f13814e).d(i10, i11, i12, j10);
    }

    @Override // com.google.android.gms.internal.ads.m22
    public ByteBuffer e(int i10) {
        return this.f13810a.getInputBuffer(i10);
    }

    @Override // com.google.android.gms.internal.ads.m22
    public void f(f12 f12Var) {
        f12 f12Var2 = new f12(1, this, f12Var);
        i22 i22Var = (i22) this.f13813d;
        synchronized (i22Var.f15534b) {
            i22Var.d();
            f12Var2.run();
        }
    }

    @Override // y1.j
    public void flush() {
        ((y1.k) this.f13814e).flush();
        this.f13810a.flush();
        i22 i22Var = (i22) this.f13813d;
        synchronized (i22Var.f15534b) {
            i22Var.f15543k++;
            Handler handler = i22Var.f15536d;
            String str = l1.y.f44830a;
            handler.post(new q1.c(i22Var, 12));
        }
        this.f13810a.start();
    }

    @Override // com.google.android.gms.internal.ads.m22
    public void g(ArrayList arrayList) {
        this.f13810a.subscribeToVendorParameters(arrayList);
    }

    @Override // com.google.android.gms.internal.ads.m22
    public void h(Bundle bundle) {
        ((n22) this.f13814e).a(bundle);
    }

    @Override // com.google.android.gms.internal.ads.m22
    public void i(Surface surface) {
        this.f13810a.setOutputSurface(surface);
    }

    @Override // y1.j
    public MediaFormat j() {
        MediaFormat mediaFormat;
        i22 i22Var = (i22) this.f13813d;
        synchronized (i22Var.f15534b) {
            try {
                mediaFormat = i22Var.f15539g;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    @Override // y1.j
    public void k(w1.b bVar) {
        i22 i22Var = (i22) this.f13813d;
        w1.b bVar2 = new w1.b(3, this, bVar);
        synchronized (i22Var.f15534b) {
            i22Var.b();
            bVar2.run();
        }
    }

    @Override // y1.j
    public void l() {
        this.f13810a.detachOutputSurface();
    }

    @Override // com.google.android.gms.internal.ads.m22
    public boolean m(wv0 wv0Var) {
        i22 i22Var = (i22) this.f13813d;
        synchronized (i22Var.f15534b) {
            i22Var.f15547p = wv0Var;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.ads.m22
    public int n(MediaCodec.BufferInfo bufferInfo) {
        ((n22) this.f13814e).zzg();
        i22 i22Var = (i22) this.f13813d;
        synchronized (i22Var.f15534b) {
            try {
                i22Var.d();
                if (i22Var.f15543k > 0 || i22Var.l) {
                    return -1;
                }
                jd0 jd0Var = (jd0) i22Var.f15546o;
                int i10 = jd0Var.f16047b;
                int i11 = jd0Var.f16048c;
                if (i10 == i11) {
                    return -1;
                }
                if (i10 == i11) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i12 = jd0Var.f16046a[i10];
                jd0Var.f16047b = jd0Var.f16049d & (i10 + 1);
                if (i12 >= 0) {
                    if (i22Var.f15539g == null) {
                        throw null;
                    }
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) i22Var.f15537e.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i12 == -2) {
                    i22Var.f15539g = (MediaFormat) i22Var.f15538f.remove();
                    i12 = -2;
                }
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // y1.j
    public void o(h9.h hVar, Handler handler) {
        this.f13810a.setOnFrameRenderedListener(new y1.a(this, hVar, 0), handler);
    }

    @Override // y1.j
    public boolean p(qj.x xVar) {
        i22 i22Var = (i22) this.f13813d;
        synchronized (i22Var.f15534b) {
            i22Var.f15547p = xVar;
        }
        return true;
    }

    @Override // y1.j
    public ByteBuffer q(int i10) {
        return this.f13810a.getInputBuffer(i10);
    }

    @Override // y1.j
    public void r(Surface surface) {
        this.f13810a.setOutputSurface(surface);
    }

    @Override // y1.j
    public void release() {
        y1.h hVar;
        y1.h hVar2;
        try {
            if (this.f13812c == 1) {
                ((y1.k) this.f13814e).shutdown();
                i22 i22Var = (i22) this.f13813d;
                synchronized (i22Var.f15534b) {
                    i22Var.l = true;
                    i22Var.f15535c.quit();
                    i22Var.a();
                }
            }
            this.f13812c = 2;
            if (this.f13811b) {
                return;
            }
            try {
                if (Build.VERSION.SDK_INT < 33) {
                    this.f13810a.stop();
                }
            } finally {
                if (Build.VERSION.SDK_INT >= 35 && (hVar2 = (y1.h) this.f13815f) != null) {
                    hVar2.c(this.f13810a);
                }
                this.f13810a.release();
                this.f13811b = true;
            }
        } catch (Throwable th2) {
            if (!this.f13811b) {
                try {
                    if (Build.VERSION.SDK_INT < 33) {
                        this.f13810a.stop();
                    }
                } finally {
                    if (Build.VERSION.SDK_INT >= 35 && (hVar = (y1.h) this.f13815f) != null) {
                        hVar.c(this.f13810a);
                    }
                    this.f13810a.release();
                    this.f13811b = true;
                }
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.m22
    public void s(int i10, long j10) {
        this.f13810a.releaseOutputBuffer(i10, j10);
    }

    @Override // y1.j
    public void setVideoScalingMode(int i10) {
        this.f13810a.setVideoScalingMode(i10);
    }

    @Override // y1.j
    public void t(int i10) {
        this.f13810a.releaseOutputBuffer(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.m22
    public void u(int i10, qx1 qx1Var, long j10, int i11) {
        ((n22) this.f13814e).d(i10, qx1Var, j10, i11);
    }

    @Override // y1.j
    public void v(int i10, long j10) {
        this.f13810a.releaseOutputBuffer(i10, j10);
    }

    @Override // y1.j
    public int w() {
        ((y1.k) this.f13814e).a();
        i22 i22Var = (i22) this.f13813d;
        synchronized (i22Var.f15534b) {
            try {
                i22Var.b();
                int i10 = -1;
                if (i22Var.f15543k > 0 || i22Var.l) {
                    return -1;
                }
                jd0 jd0Var = (jd0) i22Var.f15545n;
                int i11 = jd0Var.f16047b;
                int i12 = jd0Var.f16048c;
                if (!(i11 == i12)) {
                    if (i11 == i12) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i10 = jd0Var.f16046a[i11];
                    jd0Var.f16047b = (i11 + 1) & jd0Var.f16049d;
                }
                return i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // y1.j
    public int x(MediaCodec.BufferInfo bufferInfo) {
        ((y1.k) this.f13814e).a();
        i22 i22Var = (i22) this.f13813d;
        synchronized (i22Var.f15534b) {
            try {
                i22Var.b();
                if (i22Var.f15543k > 0 || i22Var.l) {
                    return -1;
                }
                jd0 jd0Var = (jd0) i22Var.f15546o;
                int i10 = jd0Var.f16047b;
                int i11 = jd0Var.f16048c;
                if (i10 == i11) {
                    return -1;
                }
                if (i10 == i11) {
                    throw new ArrayIndexOutOfBoundsException();
                }
                int i12 = jd0Var.f16046a[i10];
                jd0Var.f16047b = jd0Var.f16049d & (i10 + 1);
                if (i12 >= 0) {
                    i22Var.f15539g.getClass();
                    MediaCodec.BufferInfo bufferInfo2 = (MediaCodec.BufferInfo) i22Var.f15537e.remove();
                    bufferInfo.set(bufferInfo2.offset, bufferInfo2.size, bufferInfo2.presentationTimeUs, bufferInfo2.flags);
                } else if (i12 == -2) {
                    i22Var.f15539g = (MediaFormat) i22Var.f15538f.remove();
                }
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.m22
    public void y(int i10) {
        this.f13810a.setVideoScalingMode(i10);
    }

    @Override // com.google.android.gms.internal.ads.m22
    public void z(int i10, int i11, int i12, long j10) {
        ((n22) this.f13814e).e(i10, i11, i12, j10);
    }

    @Override // com.google.android.gms.internal.ads.m22
    public void zzc(int i10) {
        this.f13810a.releaseOutputBuffer(i10, false);
    }

    @Override // com.google.android.gms.internal.ads.m22
    public int zze() {
        ((n22) this.f13814e).zzg();
        i22 i22Var = (i22) this.f13813d;
        synchronized (i22Var.f15534b) {
            try {
                i22Var.d();
                int i10 = -1;
                if (i22Var.f15543k > 0 || i22Var.l) {
                    return -1;
                }
                jd0 jd0Var = (jd0) i22Var.f15545n;
                int i11 = jd0Var.f16047b;
                int i12 = jd0Var.f16048c;
                if (!(i11 == i12)) {
                    if (i11 == i12) {
                        throw new ArrayIndexOutOfBoundsException();
                    }
                    i10 = jd0Var.f16046a[i11];
                    jd0Var.f16047b = (i11 + 1) & jd0Var.f16049d;
                }
                return i10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.m22
    public MediaFormat zzg() {
        MediaFormat mediaFormat;
        i22 i22Var = (i22) this.f13813d;
        synchronized (i22Var.f15534b) {
            try {
                mediaFormat = i22Var.f15539g;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    @Override // com.google.android.gms.internal.ads.m22
    public void zzk() {
        ((n22) this.f13814e).zze();
        MediaCodec mediaCodec = this.f13810a;
        mediaCodec.flush();
        i22 i22Var = (i22) this.f13813d;
        synchronized (i22Var.f15534b) {
            i22Var.f15543k++;
            Handler handler = i22Var.f15536d;
            String str = uu0.f20901a;
            handler.post(new ry0(i22Var, 19));
        }
        mediaCodec.start();
    }

    @Override // com.google.android.gms.internal.ads.m22
    public void zzl() {
        l22 l22Var;
        l22 l22Var2;
        l22 l22Var3;
        try {
            try {
                if (this.f13812c == 1) {
                    ((n22) this.f13814e).zzf();
                    i22 i22Var = (i22) this.f13813d;
                    synchronized (i22Var.f15534b) {
                        i22Var.l = true;
                        i22Var.f15535c.quit();
                        i22Var.c();
                    }
                }
                this.f13812c = 2;
                if (this.f13811b) {
                    return;
                }
                int i10 = Build.VERSION.SDK_INT;
                if (i10 < 33) {
                    this.f13810a.stop();
                }
                if (i10 >= 35 && (l22Var3 = (l22) this.f13815f) != null) {
                    l22Var3.d(this.f13810a);
                }
                this.f13810a.release();
                this.f13811b = true;
            } catch (Throwable th2) {
                if (!this.f13811b) {
                    int i11 = Build.VERSION.SDK_INT;
                    if (i11 < 33) {
                        this.f13810a.stop();
                    }
                    if (i11 >= 35 && (l22Var2 = (l22) this.f13815f) != null) {
                        l22Var2.d(this.f13810a);
                    }
                    this.f13810a.release();
                    this.f13811b = true;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            if (Build.VERSION.SDK_INT >= 35 && (l22Var = (l22) this.f13815f) != null) {
                l22Var.d(this.f13810a);
            }
            this.f13810a.release();
            this.f13811b = true;
            throw th3;
        }
    }

    @Override // com.google.android.gms.internal.ads.m22
    public void zzo() {
        this.f13810a.detachOutputSurface();
    }

    public e22(MediaCodec mediaCodec, HandlerThread handlerThread, y1.k kVar, y1.h hVar) {
        this.f13810a = mediaCodec;
        this.f13813d = new i22(handlerThread, 1);
        this.f13814e = kVar;
        this.f13815f = hVar;
    }
}
