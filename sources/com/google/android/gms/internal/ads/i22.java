package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i22 extends MediaCodec.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f15534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HandlerThread f15535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f15536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ArrayDeque f15537e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayDeque f15538f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public MediaFormat f15539g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public MediaFormat f15540h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public MediaCodec.CodecException f15541i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public MediaCodec.CryptoException f15542j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f15543k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public IllegalStateException f15544m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Object f15545n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Object f15546o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f15547p;

    public i22(HandlerThread handlerThread, int i10) {
        this.f15533a = i10;
        switch (i10) {
            case 1:
                this.f15534b = new Object();
                this.f15535c = handlerThread;
                this.f15545n = new jd0(1);
                this.f15546o = new jd0(1);
                this.f15537e = new ArrayDeque();
                this.f15538f = new ArrayDeque();
                break;
            default:
                this.f15534b = new Object();
                this.f15535c = handlerThread;
                this.f15545n = new jd0(0);
                this.f15546o = new jd0(0);
                this.f15537e = new ArrayDeque();
                this.f15538f = new ArrayDeque();
                break;
        }
    }

    public void a() {
        ArrayDeque arrayDeque = this.f15538f;
        if (!arrayDeque.isEmpty()) {
            this.f15540h = (MediaFormat) arrayDeque.getLast();
        }
        jd0 jd0Var = (jd0) this.f15545n;
        jd0Var.f16048c = jd0Var.f16047b;
        jd0 jd0Var2 = (jd0) this.f15546o;
        jd0Var2.f16048c = jd0Var2.f16047b;
        this.f15537e.clear();
        arrayDeque.clear();
    }

    public void b() {
        IllegalStateException illegalStateException = this.f15544m;
        if (illegalStateException != null) {
            this.f15544m = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.f15541i;
        if (codecException != null) {
            this.f15541i = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.f15542j;
        if (cryptoException == null) {
            return;
        }
        this.f15542j = null;
        throw cryptoException;
    }

    public void c() {
        ArrayDeque arrayDeque = this.f15538f;
        if (!arrayDeque.isEmpty()) {
            this.f15540h = (MediaFormat) arrayDeque.getLast();
        }
        jd0 jd0Var = (jd0) this.f15545n;
        jd0Var.f16048c = jd0Var.f16047b;
        jd0 jd0Var2 = (jd0) this.f15546o;
        jd0Var2.f16048c = jd0Var2.f16047b;
        this.f15537e.clear();
        arrayDeque.clear();
    }

    public void d() {
        IllegalStateException illegalStateException = this.f15544m;
        if (illegalStateException != null) {
            this.f15544m = null;
            throw illegalStateException;
        }
        MediaCodec.CodecException codecException = this.f15541i;
        if (codecException != null) {
            this.f15541i = null;
            throw codecException;
        }
        MediaCodec.CryptoException cryptoException = this.f15542j;
        if (cryptoException == null) {
            return;
        }
        this.f15542j = null;
        throw cryptoException;
    }

    @Override // android.media.MediaCodec.Callback
    public final void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        switch (this.f15533a) {
            case 0:
                synchronized (this.f15534b) {
                    this.f15542j = cryptoException;
                    break;
                }
                return;
            default:
                synchronized (this.f15534b) {
                    this.f15542j = cryptoException;
                    break;
                }
                return;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        switch (this.f15533a) {
            case 0:
                synchronized (this.f15534b) {
                    this.f15541i = codecException;
                    break;
                }
                return;
            default:
                synchronized (this.f15534b) {
                    this.f15541i = codecException;
                    break;
                }
                return;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        sy1 sy1Var;
        p1.d0 d0Var;
        switch (this.f15533a) {
            case 0:
                synchronized (this.f15534b) {
                    try {
                        ((jd0) this.f15545n).b(i10);
                        wv0 wv0Var = (wv0) this.f15547p;
                        if (wv0Var != null && (sy1Var = ((s22) wv0Var.f21612b).J) != null) {
                            sy1Var.a();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f15534b) {
                    ((jd0) this.f15545n).a(i10);
                    qj.x xVar = (qj.x) this.f15547p;
                    if (xVar != null && (d0Var = ((y1.p) xVar.f49096b).I) != null) {
                        d0Var.a();
                    }
                    break;
                }
                return;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        sy1 sy1Var;
        p1.d0 d0Var;
        switch (this.f15533a) {
            case 0:
                synchronized (this.f15534b) {
                    try {
                        MediaFormat mediaFormat = this.f15540h;
                        if (mediaFormat != null) {
                            ((jd0) this.f15546o).b(-2);
                            this.f15538f.add(mediaFormat);
                            this.f15540h = null;
                        }
                        ((jd0) this.f15546o).b(i10);
                        this.f15537e.add(bufferInfo);
                        wv0 wv0Var = (wv0) this.f15547p;
                        if (wv0Var != null && (sy1Var = ((s22) wv0Var.f21612b).J) != null) {
                            sy1Var.a();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                return;
            default:
                synchronized (this.f15534b) {
                    try {
                        MediaFormat mediaFormat2 = this.f15540h;
                        if (mediaFormat2 != null) {
                            ((jd0) this.f15546o).a(-2);
                            this.f15538f.add(mediaFormat2);
                            this.f15540h = null;
                        }
                        ((jd0) this.f15546o).a(i10);
                        this.f15537e.add(bufferInfo);
                        qj.x xVar = (qj.x) this.f15547p;
                        if (xVar != null && (d0Var = ((y1.p) xVar.f49096b).I) != null) {
                            d0Var.a();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                    break;
                }
                return;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public final void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        switch (this.f15533a) {
            case 0:
                synchronized (this.f15534b) {
                    ((jd0) this.f15546o).b(-2);
                    this.f15538f.add(mediaFormat);
                    this.f15540h = null;
                    break;
                }
                return;
            default:
                synchronized (this.f15534b) {
                    ((jd0) this.f15546o).a(-2);
                    this.f15538f.add(mediaFormat);
                    this.f15540h = null;
                    break;
                }
                return;
        }
    }
}
