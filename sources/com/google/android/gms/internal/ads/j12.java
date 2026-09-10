package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import java.nio.ByteBuffer;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j12 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Object f15914o = new Object();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static ScheduledExecutorService f15915p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static int f15916q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AudioTrack f15917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w02 f15918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wv0 f15919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public uw f15920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l12 f15921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f15922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ay0 f15924h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mk0 f15925i = new mk0(Thread.currentThread(), 0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f15926j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f15927k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f15928m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15929n;

    public j12(AudioTrack audioTrack, w02 w02Var, wv0 wv0Var, s6 s6Var) {
        this.f15917a = audioTrack;
        this.f15918b = w02Var;
        this.f15919c = wv0Var;
        int i10 = w02Var.f21354a;
        boolean zD = uu0.d(i10);
        this.f15922f = zD;
        if (zD) {
            this.f15923g = uu0.f(i10) * Integer.bitCount(w02Var.f21356c);
        } else {
            this.f15923g = -1;
        }
        this.f15921e = new l12(new z61(this), s6Var, audioTrack, w02Var.f21354a, this.f15923g, w02Var.f21357d);
        if (wv0Var != null) {
            this.f15920d = new uw(audioTrack, wv0Var);
        }
        this.f15924h = b() ? new ay0(this) : null;
    }

    public final boolean a(int i10, ByteBuffer byteBuffer) {
        wv0 wv0Var;
        k12 k12Var;
        zw zwVar;
        boolean z10 = this.f15922f;
        if (!z10 && this.f15928m == 0) {
            this.f15928m = u12.c(this.f15918b.f21354a, byteBuffer);
        }
        mk0 mk0Var = this.f15925i;
        mk0Var.getClass();
        Thread threadCurrentThread = Thread.currentThread();
        Thread thread = (Thread) mk0Var.f17461c;
        AudioTrack audioTrack = this.f15917a;
        if (threadCurrentThread == thread) {
            d();
            int underrunCount = audioTrack.getUnderrunCount();
            int i11 = this.f15929n;
            this.f15929n = underrunCount;
            if (underrunCount > i11) {
                mk0Var.i(-1, b02.f12586c);
                mk0Var.j();
            }
        }
        int iRemaining = byteBuffer.remaining();
        boolean z11 = true;
        int iWrite = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        if (iWrite >= 0) {
            z11 = iWrite == iRemaining;
            if (z10) {
                this.f15927k += (long) iWrite;
                return z11;
            }
            if (z11) {
                this.l = (((long) this.f15928m) * ((long) i10)) + this.l;
            }
            return z11;
        }
        if (iWrite != -6 && iWrite != -32) {
            z11 = false;
        }
        if (z11 && (wv0Var = this.f15919c) != null && (zwVar = (k12Var = (k12) wv0Var.f21612b).f16272f) != null) {
            l02 l02Var = l02.f16620f;
            k12Var.f16271e = l02Var;
            zwVar.k(l02Var);
        }
        throw new q02(iWrite, z11);
    }

    public final boolean b() {
        return this.f15917a.isOffloadedPlayback();
    }

    public final void c(j02 j02Var) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        synchronized (j02Var) {
            i02 i02Var = j02Var.f15894b;
            if (i02Var == null) {
                throw null;
            }
            logSessionId = i02Var.f15468a;
        }
        if (logSessionId.equals(LogSessionId.LOG_SESSION_ID_NONE)) {
            return;
        }
        this.f15917a.setLogSessionId(logSessionId);
    }

    public final long d() {
        if (!this.f15922f) {
            return this.l;
        }
        long j10 = this.f15927k;
        String str = uu0.f20901a;
        long j11 = this.f15923g;
        return ((j10 + j11) - 1) / j11;
    }
}
