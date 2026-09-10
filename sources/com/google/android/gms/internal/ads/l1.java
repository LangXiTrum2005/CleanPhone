package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f16627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f16628b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Surface f16629c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f16630d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f16631e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f16632f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f16633g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16634h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f16635i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f16636j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f16637k;
    public long l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public long f16638m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f16639n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f16640o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f16641p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f16642q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f16643r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public DisplayManager.DisplayListener f16644s;

    public l1(Context context, int i10) {
        switch (i10) {
            case 1:
                this.f16627a = context;
                p0 p0Var = new p0();
                p0Var.f18418d = new o0(1);
                p0Var.f18419e = new o0(1);
                p0Var.f18416b = C.TIME_UNSET;
                this.f16643r = p0Var;
                this.f16630d = -1.0f;
                this.f16633g = 1.0f;
                this.f16634h = 0;
                break;
            default:
                this.f16627a = context;
                p0 p0Var2 = new p0();
                p0Var2.f18418d = new o0(0);
                p0Var2.f18419e = new o0(0);
                p0Var2.f18416b = C.TIME_UNSET;
                this.f16643r = p0Var2;
                this.f16630d = -1.0f;
                this.f16633g = 1.0f;
                this.f16634h = 0;
                break;
        }
    }

    public void a() {
        Surface surface = this.f16629c;
        if (surface == null || this.f16634h == Integer.MIN_VALUE || this.f16632f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || !surface.isValid()) {
            return;
        }
        this.f16632f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        try {
            this.f16629c.setFrameRate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        } catch (IllegalStateException e10) {
            l1.a.f("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }

    public void b() {
        this.f16637k = 0L;
        this.f16640o = -1L;
        this.l = -1L;
        this.f16635i = 0L;
        this.f16636j = 0L;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0079  */
    public void c() {
        float f10;
        float f11;
        p0 p0Var = (p0) this.f16643r;
        if (this.f16629c == null) {
            return;
        }
        if (!((o0) p0Var.f18418d).a()) {
            f10 = this.f16630d;
        } else if (((o0) p0Var.f18418d).a()) {
            o0 o0Var = (o0) p0Var.f18418d;
            long j10 = o0Var.f18062e;
            f10 = (float) (1.0E9d / (j10 != 0 ? o0Var.f18063f / j10 : 0L));
        } else {
            f10 = -1.0f;
        }
        float f12 = this.f16631e;
        if (f10 == f12) {
            return;
        }
        if (f10 != -1.0f && f12 != -1.0f) {
            if (((o0) p0Var.f18418d).a()) {
                if ((((o0) p0Var.f18418d).a() ? ((o0) p0Var.f18418d).f18063f : C.TIME_UNSET) >= 5000000000L) {
                    f11 = 0.1f;
                } else {
                    f11 = 1.0f;
                }
            } else {
                f11 = 1.0f;
            }
            if (Math.abs(f10 - this.f16631e) < f11) {
                return;
            }
        } else if (f10 == -1.0f && p0Var.f18417c < 30) {
            return;
        }
        this.f16631e = f10;
        d(false);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    public void d(boolean z10) {
        float f10;
        Surface surface = this.f16629c;
        if (surface == null || this.f16634h == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        if (this.f16628b) {
            float f11 = this.f16631e;
            if (f11 != -1.0f) {
                f10 = f11 * this.f16633g;
            } else {
                f10 = 0.0f;
            }
        } else {
            f10 = 0.0f;
        }
        if (z10 || this.f16632f != f10) {
            this.f16632f = f10;
            try {
                this.f16629c.setFrameRate(f10, f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : 1);
            } catch (IllegalStateException e10) {
                l1.a.f("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    public void e() {
        this.f16637k = 0L;
        this.f16640o = -1L;
        this.l = -1L;
        this.f16635i = 0L;
        this.f16636j = 0L;
    }

    public void f() {
        float f10;
        if (this.f16629c == null) {
            return;
        }
        p0 p0Var = (p0) this.f16643r;
        if (!((o0) p0Var.f18418d).e()) {
            f10 = this.f16630d;
        } else if (((o0) p0Var.f18418d).e()) {
            o0 o0Var = (o0) p0Var.f18418d;
            long j10 = o0Var.f18062e;
            f10 = (float) (1.0E9d / (j10 != 0 ? o0Var.f18063f / j10 : 0L));
        } else {
            f10 = -1.0f;
        }
        float f11 = this.f16631e;
        if (f10 != f11) {
            if (f10 != -1.0f && f11 != -1.0f) {
                float f12 = 1.0f;
                if (((o0) p0Var.f18418d).e()) {
                    if ((((o0) p0Var.f18418d).e() ? ((o0) p0Var.f18418d).f18063f : C.TIME_UNSET) >= 5000000000L) {
                        f12 = 0.1f;
                    }
                }
                if (Math.abs(f10 - this.f16631e) < f12) {
                    return;
                }
            } else if (f10 == -1.0f && p0Var.f18417c < 30) {
                return;
            }
            this.f16631e = f10;
            g(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0022  */
    public void g(boolean z10) {
        float f10;
        Surface surface = this.f16629c;
        if (surface == null || this.f16634h == Integer.MIN_VALUE || !surface.isValid()) {
            return;
        }
        if (this.f16628b) {
            float f11 = this.f16631e;
            if (f11 != -1.0f) {
                f10 = f11 * this.f16633g;
            } else {
                f10 = 0.0f;
            }
        } else {
            f10 = 0.0f;
        }
        if (z10 || this.f16632f != f10) {
            this.f16632f = f10;
            try {
                this.f16629c.setFrameRate(f10, f10 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : 1);
            } catch (IllegalStateException e10) {
                v71.J("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
            }
        }
    }

    public void h() {
        Surface surface = this.f16629c;
        if (surface == null || this.f16634h == Integer.MIN_VALUE || this.f16632f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || !surface.isValid()) {
            return;
        }
        this.f16632f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        try {
            this.f16629c.setFrameRate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0);
        } catch (IllegalStateException e10) {
            v71.J("VideoFrameReleaseHelper", "Failed to call Surface.setFrameRate", e10);
        }
    }
}
