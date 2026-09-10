package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends Handler implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d42 f12949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h42 f12950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public IOException f12951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Thread f12953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f12954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile boolean f12955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ vu0 f12956h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(vu0 vu0Var, Looper looper, d42 d42Var, h42 h42Var, long j10) {
        super(looper);
        Objects.requireNonNull(vu0Var);
        this.f12956h = vu0Var;
        this.f12949a = d42Var;
        this.f12950b = h42Var;
    }

    public final void a(boolean z10) {
        this.f12955g = z10;
        this.f12951c = null;
        if (hasMessages(1)) {
            this.f12954f = true;
            removeMessages(1);
            if (!z10) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.f12954f = true;
                    this.f12949a.f13393g = true;
                    Thread thread = this.f12953e;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z10) {
            this.f12956h.f21275c = null;
            SystemClock.elapsedRealtime();
            h42 h42Var = this.f12950b;
            h42Var.getClass();
            h42Var.d(this.f12949a, true);
            this.f12950b = null;
        }
    }

    public final void b() {
        j32 j32Var;
        SystemClock.elapsedRealtime();
        h42 h42Var = this.f12950b;
        h42Var.getClass();
        int i10 = this.f12952d;
        d42 d42Var = this.f12949a;
        iw0 iw0Var = d42Var.f13388b;
        if (i10 == 0) {
            Uri uri = d42Var.f13396j.f18750a;
            Map map = Collections.EMPTY_MAP;
            j32Var = new j32();
        } else {
            Object obj = iw0Var.f15865c;
            j32Var = new j32();
        }
        iw0 iw0Var2 = h42Var.f15127d;
        iw0Var2.B(new vc(iw0Var2, j32Var, new o32(-1, null, uu0.s(d42Var.f13395i), uu0.s(h42Var.A)), i10));
        this.f12951c = null;
        vu0 vu0Var = this.f12956h;
        c0 c0Var = (c0) vu0Var.f21275c;
        c0Var.getClass();
        ((g0) vu0Var.f21274b).execute(c0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        long jMin;
        a0 a0Var;
        a3 a3Var;
        if (this.f12955g) {
            return;
        }
        int i10 = message.what;
        int i11 = 1;
        if (i10 == 1) {
            b();
            return;
        }
        if (i10 == 4) {
            throw ((Error) message.obj);
        }
        vu0 vu0Var = this.f12956h;
        vu0Var.f21275c = null;
        SystemClock.elapsedRealtime();
        h42 h42Var = this.f12950b;
        h42Var.getClass();
        if (this.f12954f) {
            h42Var.d(this.f12949a, false);
            return;
        }
        int i12 = message.what;
        if (i12 == 2) {
            try {
                h42Var.j(this.f12949a);
                return;
            } catch (RuntimeException e10) {
                v71.J("LoadTask", "Unexpected exception handling load completed", e10);
                this.f12956h.f21276d = new e0(e10);
                return;
            }
        }
        if (i12 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f12951c = iOException;
        int i13 = this.f12952d;
        this.f12952d = i13 + 1;
        d42 d42Var = this.f12949a;
        Object obj = d42Var.f13388b.f15865c;
        j32 j32Var = new j32();
        String str = uu0.f20901a;
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min(i13 * 1000, 5000);
                break;
            }
            if ((cause instanceof ab) || (cause instanceof FileNotFoundException) || (cause instanceof ys1) || (cause instanceof e0) || ((cause instanceof xl1) && ((xl1) cause).f21920a == 2008)) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == C.TIME_UNSET) {
            a0Var = vu0.f21272g;
        } else {
            int iR = h42Var.r();
            int i14 = iR > h42Var.L ? 1 : 0;
            if (h42Var.H || !((a3Var = h42Var.f15148z) == null || a3Var.zza() == C.TIME_UNSET)) {
                h42Var.L = iR;
            } else {
                boolean z10 = h42Var.f15144v;
                if (!z10 || h42Var.m()) {
                    h42Var.E = z10;
                    h42Var.I = 0L;
                    h42Var.L = 0;
                    for (n42 n42Var : h42Var.f15141s) {
                        n42Var.k(false);
                    }
                    d42Var.f13392f.f18888a = 0L;
                    d42Var.f13395i = 0L;
                    i11 = 1;
                    d42Var.f13394h = true;
                    d42Var.l = false;
                } else {
                    h42Var.K = true;
                    a0Var = vu0.f21271f;
                }
            }
            a0Var = new a0(jMin, i14, false);
        }
        int i15 = a0Var.f11791a;
        int i16 = (i15 == 0 || i15 == i11) ? i11 : 0;
        iw0 iw0Var = h42Var.f15127d;
        iw0Var.B(new m01(iw0Var, j32Var, new o32(-1, null, uu0.s(d42Var.f13395i), uu0.s(h42Var.A)), iOException, i16 ^ 1));
        int i17 = a0Var.f11791a;
        if (i17 == 3) {
            vu0Var.f21276d = this.f12951c;
            return;
        }
        if (i17 != 2) {
            if (i17 == 1) {
                this.f12952d = 1;
            }
            long jMin2 = a0Var.f11792b;
            if (jMin2 == C.TIME_UNSET) {
                jMin2 = Math.min((this.f12952d - 1) * 1000, 5000);
            }
            vu0 vu0Var2 = this.f12956h;
            ps1.c0(((c0) vu0Var2.f21275c) == null);
            vu0Var2.f21275c = this;
            if (jMin2 > 0) {
                sendEmptyMessageDelayed(1, jMin2);
            } else {
                b();
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = this.f12954f;
                this.f12953e = Thread.currentThread();
            }
            if (!z10) {
                d42 d42Var = this.f12949a;
                String simpleName = d42Var.getClass().getSimpleName();
                StringBuilder sb2 = new StringBuilder(simpleName.length() + 5);
                sb2.append("load:");
                sb2.append(simpleName);
                Trace.beginSection(sb2.toString());
                try {
                    d42Var.a();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            synchronized (this) {
                this.f12953e = null;
                Thread.interrupted();
            }
            if (this.f12955g) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e10) {
            if (this.f12955g) {
                return;
            }
            obtainMessage(3, e10).sendToTarget();
        } catch (Exception e11) {
            if (this.f12955g) {
                return;
            }
            v71.J("LoadTask", "Unexpected exception loading stream", e11);
            obtainMessage(3, new e0(e11)).sendToTarget();
        } catch (OutOfMemoryError e12) {
            if (this.f12955g) {
                return;
            }
            v71.J("LoadTask", "OutOfMemory error loading stream", e12);
            obtainMessage(3, new e0(e12)).sendToTarget();
        } catch (Error e13) {
            if (!this.f12955g) {
                v71.J("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(4, e13).sendToTarget();
            }
            throw e13;
        }
    }
}
