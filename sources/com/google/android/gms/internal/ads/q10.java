package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import com.unity3d.services.UnityAdsConstants;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class q10 extends z00 implements TextureView.SurfaceTextureListener, e10 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b30 f18857c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k10 f18858d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j10 f18859e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final yh0 f18860f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d10 f18861g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Surface f18862h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public r20 f18863i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f18864j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String[] f18865k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f18866m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i10 f18867n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final boolean f18868o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f18869p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f18870q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f18871r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f18872s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public float f18873t;

    public q10(Context context, k10 k10Var, b30 b30Var, boolean z10, j10 j10Var, yh0 yh0Var) {
        super(context);
        this.f18866m = 1;
        this.f18857c = b30Var;
        this.f18858d = k10Var;
        this.f18868o = z10;
        this.f18859e = j10Var;
        k10Var.a(this);
        this.f18860f = yh0Var;
    }

    public static String H(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.h(str.length(), 1, String.valueOf(canonicalName).length(), 1, String.valueOf(message).length()));
        d5.u.r(sb2, str, "/", canonicalName, ":");
        sb2.append(message);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void A(int i10) {
        r20 r20Var = this.f18863i;
        if (r20Var != null) {
            l20 l20Var = r20Var.f19284b;
            synchronized (l20Var) {
                l20Var.f16676c = ((long) i10) * 1000;
            }
        }
    }

    public final boolean B() {
        r20 r20Var = this.f18863i;
        return (r20Var == null || r20Var.f19289g == null || this.l) ? false : true;
    }

    public final boolean C() {
        return B() && this.f18866m != 1;
    }

    public final void D(boolean z10, Integer num) {
        r20 r20Var = this.f18863i;
        if (r20Var != null && !z10) {
            r20Var.f19298q = num;
            return;
        }
        if (this.f18864j == null || this.f18862h == null) {
            return;
        }
        if (z10) {
            if (!B()) {
                int i10 = zze.zza;
                zzo.zzi("No valid ExoPlayerAdapter exists when switch source.");
                return;
            } else {
                xz1 xz1Var = r20Var.f19289g;
                xz1Var.f22051d.b();
                xz1Var.f22050c.zzo();
                E();
            }
        }
        if (this.f18864j.startsWith("cache:")) {
            e20 e20VarG = this.f18857c.g(this.f18864j);
            if (e20VarG instanceof i20) {
                i20 i20Var = (i20) e20VarG;
                synchronized (i20Var) {
                    i20Var.f15527g = true;
                    i20Var.notify();
                }
                r20 r20Var2 = i20Var.f15524d;
                r20Var2.f19292j = null;
                i20Var.f15524d = null;
                this.f18863i = r20Var2;
                r20Var2.f19298q = num;
                if (r20Var2.f19289g == null) {
                    int i11 = zze.zza;
                    zzo.zzi("Precached video player has been released.");
                    return;
                }
            } else {
                if (!(e20VarG instanceof h20)) {
                    String strValueOf = String.valueOf(this.f18864j);
                    int i12 = zze.zza;
                    zzo.zzi("Stream cache miss: ".concat(strValueOf));
                    return;
                }
                h20 h20Var = (h20) e20VarG;
                b30 b30Var = this.f18857c;
                zzt.zzc().zze(b30Var.getContext(), b30Var.zzs().afmaVersion);
                synchronized (h20Var.f15075k) {
                    try {
                        ByteBuffer byteBuffer = h20Var.f15073i;
                        if (byteBuffer != null && !h20Var.f15074j) {
                            byteBuffer.flip();
                            h20Var.f15074j = true;
                        }
                        h20Var.f15070f = true;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                ByteBuffer byteBuffer2 = h20Var.f15073i;
                boolean z11 = h20Var.f15077n;
                String str = h20Var.f15068d;
                if (str == null) {
                    int i13 = zze.zza;
                    zzo.zzi("Stream cache URL is null.");
                    return;
                }
                j10 j10Var = this.f18859e;
                b30 b30Var2 = this.f18857c;
                r20 r20Var3 = new r20(b30Var2.getContext(), j10Var, b30Var2, num);
                int i14 = zze.zza;
                zzo.zzh("ExoPlayerAdapter initialized.");
                this.f18863i = r20Var3;
                r20Var3.t(new Uri[]{Uri.parse(str)}, byteBuffer2, z11);
            }
        } else {
            j10 j10Var2 = this.f18859e;
            b30 b30Var3 = this.f18857c;
            r20 r20Var4 = new r20(b30Var3.getContext(), j10Var2, b30Var3, num);
            int i15 = zze.zza;
            zzo.zzh("ExoPlayerAdapter initialized.");
            this.f18863i = r20Var4;
            b30 b30Var4 = this.f18857c;
            zzt.zzc().zze(b30Var4.getContext(), b30Var4.zzs().afmaVersion);
            Uri[] uriArr = new Uri[this.f18865k.length];
            int i16 = 0;
            while (true) {
                String[] strArr = this.f18865k;
                if (i16 >= strArr.length) {
                    break;
                }
                uriArr[i16] = Uri.parse(strArr[i16]);
                i16++;
            }
            r20 r20Var5 = this.f18863i;
            r20Var5.getClass();
            r20Var5.t(uriArr, ByteBuffer.allocate(0), false);
        }
        this.f18863i.f19292j = this;
        F(this.f18862h);
        xz1 xz1Var2 = this.f18863i.f19289g;
        if (xz1Var2 != null) {
            int iJ0 = xz1Var2.J0();
            this.f18866m = iJ0;
            if (iJ0 == 3) {
                G();
            }
        }
    }

    public final void E() {
        if (this.f18863i != null) {
            F(null);
            r20 r20Var = this.f18863i;
            if (r20Var != null) {
                r20Var.f19292j = null;
                xz1 xz1Var = r20Var.f19289g;
                if (xz1Var != null) {
                    xz1Var.f22051d.b();
                    xz1Var.f22050c.Z0(r20Var);
                    xz1 xz1Var2 = r20Var.f19289g;
                    xz1Var2.f22051d.b();
                    xz1Var2.f22050c.a1();
                    r20Var.f19289g = null;
                    r20.f19282v.decrementAndGet();
                }
                this.f18863i = null;
            }
            this.f18866m = 1;
            this.l = false;
            this.f18869p = false;
            this.f18870q = false;
        }
    }

    public final void F(Surface surface) {
        r20 r20Var = this.f18863i;
        if (r20Var == null) {
            int i10 = zze.zza;
            zzo.zzi("Trying to set surface before player is initialized.");
            return;
        }
        try {
            xz1 xz1Var = r20Var.f19289g;
            if (xz1Var != null) {
                xz1Var.f22051d.b();
                ry1 ry1Var = xz1Var.f22050c;
                ry1Var.l0();
                ry1Var.k1(surface);
                int i11 = surface == null ? 0 : -1;
                ry1Var.l1(i11, i11);
            }
        } catch (IOException e10) {
            int i12 = zze.zza;
            zzo.zzj("", e10);
        }
    }

    public final void G() {
        if (this.f18869p) {
            return;
        }
        this.f18869p = true;
        zzs.zza.post(new n10(this, 0));
        zzq();
        k10 k10Var = this.f18858d;
        if (k10Var.f16255i && !k10Var.f16256j) {
            pi1.j(k10Var.f16251e, k10Var.f16250d, "vfr2");
            k10Var.f16256j = true;
        }
        if (this.f18870q) {
            l();
        }
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final void a(long j10, boolean z10) {
        if (this.f18857c != null) {
            l00.f16613f.execute(new p10(this, z10, j10, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final void b(int i10, int i11) {
        this.f18871r = i10;
        this.f18872s = i11;
        float f10 = i11 > 0 ? i10 / i11 : 1.0f;
        if (this.f18873t != f10) {
            this.f18873t = f10;
            requestLayout();
        }
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final void c(String str, Exception exc) {
        r20 r20Var;
        String strH = H(str, exc);
        String strConcat = "ExoPlayerAdapter error: ".concat(strH);
        int i10 = zze.zza;
        zzo.zzi(strConcat);
        int i11 = 1;
        this.l = true;
        if (this.f18859e.f15896a && (r20Var = this.f18863i) != null) {
            r20Var.r(false);
        }
        zzs.zza.post(new o10(this, strH, i11));
        zzt.zzh().e("AdExoPlayerView.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void d(int i10) {
        r20 r20Var = this.f18863i;
        if (r20Var != null) {
            l20 l20Var = r20Var.f19284b;
            synchronized (l20Var) {
                l20Var.f16677d = ((long) i10) * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final void e(IOException iOException) {
        String strH = H("onLoadException", iOException);
        String strConcat = "ExoPlayerAdapter exception: ".concat(strH);
        int i10 = zze.zza;
        zzo.zzi(strConcat);
        zzt.zzh().e("AdExoPlayerView.onException", iOException);
        zzs.zza.post(new o10(this, strH, 0));
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void f(int i10) {
        r20 r20Var = this.f18863i;
        if (r20Var != null) {
            l20 l20Var = r20Var.f19284b;
            synchronized (l20Var) {
                l20Var.f16678e = ((long) i10) * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void g(int i10) {
        r20 r20Var = this.f18863i;
        if (r20Var != null) {
            Iterator it = r20Var.f19301t.iterator();
            while (it.hasNext()) {
                k20 k20Var = (k20) ((WeakReference) it.next()).get();
                if (k20Var != null) {
                    k20Var.f16291r = i10;
                    for (Socket socket : k20Var.f16292s) {
                        if (!socket.isClosed()) {
                            try {
                                socket.setReceiveBufferSize(k20Var.f16291r);
                            } catch (SocketException e10) {
                                int i11 = zze.zza;
                                zzo.zzj("Failed to update receive buffer size.", e10);
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final String h() {
        return "ExoPlayer/2".concat(true != this.f18868o ? "" : " spherical");
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void i(d10 d10Var) {
        this.f18861g = d10Var;
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void j(String str) {
        if (str != null) {
            y(str, null, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void k() {
        if (B()) {
            xz1 xz1Var = this.f18863i.f19289g;
            xz1Var.f22051d.b();
            xz1Var.f22050c.zzo();
            E();
        }
        k10 k10Var = this.f18858d;
        k10Var.f16258m = false;
        m10 m10Var = this.f22442b;
        m10Var.f17206d = false;
        m10Var.a();
        k10Var.b();
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void l() {
        r20 r20Var;
        if (!C()) {
            this.f18870q = true;
            return;
        }
        if (this.f18859e.f15896a && (r20Var = this.f18863i) != null) {
            r20Var.r(true);
        }
        xz1 xz1Var = this.f18863i.f19289g;
        xz1Var.f22051d.b();
        xz1Var.f22050c.n1(true);
        this.f18858d.d();
        m10 m10Var = this.f22442b;
        m10Var.f17206d = true;
        m10Var.a();
        this.f22441a.f14655c = true;
        zzs.zza.post(new n10(this, 3));
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void m() {
        r20 r20Var;
        if (C()) {
            if (this.f18859e.f15896a && (r20Var = this.f18863i) != null) {
                r20Var.r(false);
            }
            xz1 xz1Var = this.f18863i.f19289g;
            xz1Var.f22051d.b();
            xz1Var.f22050c.n1(false);
            this.f18858d.f16258m = false;
            m10 m10Var = this.f22442b;
            m10Var.f17206d = false;
            m10Var.a();
            zzs.zza.post(new n10(this, 4));
        }
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final int n() {
        if (C()) {
            return (int) this.f18863i.f19289g.X0();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final int o() {
        if (C()) {
            return (int) this.f18863i.f19289g.T0();
        }
        return 0;
    }

    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        setSurfaceTextureListener(this);
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f10 = this.f18873t;
        if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && this.f18867n == null) {
            float f11 = measuredWidth;
            float f12 = f11 / measuredHeight;
            if (f10 > f12) {
                measuredHeight = (int) (f11 / f10);
            }
            if (f10 < f12) {
                measuredWidth = (int) (measuredHeight * f10);
            }
        }
        setMeasuredDimension(measuredWidth, measuredHeight);
        i10 i10Var = this.f18867n;
        if (i10Var != null) {
            i10Var.a(measuredWidth, measuredHeight);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        r20 r20Var;
        float f10;
        int i12;
        SurfaceTexture surfaceTexture2;
        yh0 yh0Var;
        if (this.f18868o) {
            if (((Boolean) zzba.zzc().a(am.We)).booleanValue() && (yh0Var = this.f18860f) != null) {
                lj1 lj1VarA = yh0Var.a();
                lj1VarA.l("action", "svp_aepv");
                lj1VarA.m();
            }
            i10 i10Var = new i10(getContext());
            this.f18867n = i10Var;
            i10Var.f15480m = i10;
            i10Var.l = i11;
            i10Var.f15482o = surfaceTexture;
            i10Var.start();
            if (i10Var.f15482o == null) {
                surfaceTexture2 = null;
            } else {
                try {
                    i10Var.f15487t.await();
                } catch (InterruptedException unused) {
                }
                surfaceTexture2 = i10Var.f15481n;
            }
            if (surfaceTexture2 != null) {
                surfaceTexture = surfaceTexture2;
            } else {
                this.f18867n.b();
                this.f18867n = null;
            }
        }
        Surface surface = new Surface(surfaceTexture);
        this.f18862h = surface;
        if (this.f18863i == null) {
            D(false, null);
        } else {
            F(surface);
            if (!this.f18859e.f15896a && (r20Var = this.f18863i) != null) {
                r20Var.r(true);
            }
        }
        int i13 = this.f18871r;
        if (i13 == 0 || (i12 = this.f18872s) == 0) {
            f10 = i11 > 0 ? i10 / i11 : 1.0f;
            if (this.f18873t != f10) {
                this.f18873t = f10;
                requestLayout();
            }
        } else {
            f10 = i12 > 0 ? i13 / i12 : 1.0f;
            if (this.f18873t != f10) {
                this.f18873t = f10;
                requestLayout();
            }
        }
        zzs.zza.post(new n10(this, 5));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        m();
        i10 i10Var = this.f18867n;
        if (i10Var != null) {
            i10Var.b();
            this.f18867n = null;
        }
        r20 r20Var = this.f18863i;
        if (r20Var != null) {
            if (r20Var != null) {
                r20Var.r(false);
            }
            Surface surface = this.f18862h;
            if (surface != null) {
                surface.release();
            }
            this.f18862h = null;
            F(null);
        }
        zzs.zza.post(new n10(this, 6));
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        i10 i10Var = this.f18867n;
        if (i10Var != null) {
            i10Var.a(i10, i11);
        }
        zzs.zza.post(new v00(this, i10, i11, 1));
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        this.f18858d.c(this);
        this.f22441a.a(surfaceTexture, this.f18861g);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i10) {
        StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 46);
        sb2.append("AdExoPlayerView3 window visibility changed to ");
        sb2.append(i10);
        zze.zza(sb2.toString());
        zzs.zza.post(new com.google.android.gms.common.api.internal.q(i10, 4, this));
        super.onWindowVisibilityChanged(i10);
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void p(int i10) {
        if (C()) {
            xz1 xz1Var = this.f18863i.f19289g;
            xz1Var.C0(xz1Var.R0(), i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void q(float f10, float f11) {
        i10 i10Var = this.f18867n;
        if (i10Var != null) {
            i10Var.c(f10, f11);
        }
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final int r() {
        return this.f18871r;
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final int s() {
        return this.f18872s;
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final long t() {
        r20 r20Var = this.f18863i;
        if (r20Var == null) {
            return -1L;
        }
        if (r20Var.f19300s == null || !r20Var.f19300s.f17224p) {
            return r20Var.f19293k;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final long u() {
        r20 r20Var = this.f18863i;
        if (r20Var != null) {
            return r20Var.p();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final long v() {
        r20 r20Var = this.f18863i;
        if (r20Var != null) {
            return r20Var.q();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final int w() {
        r20 r20Var = this.f18863i;
        if (r20Var != null) {
            return r20Var.l;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final Integer x() {
        r20 r20Var = this.f18863i;
        if (r20Var != null) {
            return r20Var.f19298q;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void y(String str, String[] strArr, Integer num) {
        if (str == null) {
            return;
        }
        if (strArr == null) {
            this.f18865k = new String[]{str};
        } else {
            this.f18865k = (String[]) Arrays.copyOf(strArr, strArr.length);
        }
        String str2 = this.f18864j;
        boolean z10 = false;
        if (this.f18859e.f15906k && str2 != null && !str.equals(str2) && this.f18866m == 4) {
            z10 = true;
        }
        this.f18864j = str;
        D(z10, num);
    }

    @Override // com.google.android.gms.internal.ads.z00
    public final void z(int i10) {
        r20 r20Var = this.f18863i;
        if (r20Var != null) {
            l20 l20Var = r20Var.f19284b;
            synchronized (l20Var) {
                l20Var.f16675b = ((long) i10) * 1000;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final void zzD() {
        zzs.zza.post(new n10(this, 1));
    }

    @Override // com.google.android.gms.internal.ads.l10
    public final void zzq() {
        zzs.zza.post(new n10(this, 7));
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final void zzs(int i10) {
        r20 r20Var;
        if (this.f18866m != i10) {
            this.f18866m = i10;
            if (i10 == 3) {
                G();
                return;
            }
            if (i10 != 4) {
                return;
            }
            if (this.f18859e.f15896a && (r20Var = this.f18863i) != null) {
                r20Var.r(false);
            }
            this.f18858d.f16258m = false;
            m10 m10Var = this.f22442b;
            m10Var.f17206d = false;
            m10Var.a();
            zzs.zza.post(new n10(this, 2));
        }
    }
}
