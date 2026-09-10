package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.client.zzf;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class i20 extends e20 implements e10 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r20 f15524d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f15525e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15526f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15527g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w10 f15528h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f15529i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f15530j;

    public static String s(String str, Exception exc) {
        String canonicalName = exc.getClass().getCanonicalName();
        String message = exc.getMessage();
        StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.h(str.length(), 1, String.valueOf(canonicalName).length(), 1, String.valueOf(message).length()));
        d5.u.r(sb2, str, "/", canonicalName, ":");
        sb2.append(message);
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final void a(long j10, boolean z10) {
        b30 b30Var = (b30) this.f13808c.get();
        if (b30Var != null) {
            l00.f16613f.execute(new p10(b30Var, z10, j10, 1));
        }
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final void c(String str, Exception exc) {
        int i10 = zze.zza;
        zzo.zzj("Precache error", exc);
        zzt.zzh().e("VideoStreamExoPlayerCache.onError", exc);
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final void e(IOException iOException) {
        int i10 = zze.zza;
        zzo.zzj("Precache exception", iOException);
        zzt.zzh().e("VideoStreamExoPlayerCache.onException", iOException);
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final void g() {
        r20 r20Var = this.f15524d;
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
        }
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final boolean h(String str) {
        return j(str, new String[]{str});
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.e20
    public final boolean j(String str, String[] strArr) throws Throwable {
        boolean z10;
        long j10;
        long j11;
        long j12;
        i20 i20Var = this;
        String str2 = str;
        i20Var.f15525e = str2;
        String strConcat = "cache:".concat(String.valueOf(zzf.zzg(str2)));
        String str3 = " ms";
        String str4 = "Timeout reached. Limit: ";
        boolean z11 = false;
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            r20 r20Var = i20Var.f15524d;
            r20Var.getClass();
            r20Var.t(uriArr, ByteBuffer.allocate(0), false);
            b30 b30Var = (b30) i20Var.f13808c.get();
            if (b30Var != null) {
                b30Var.e0(strConcat, i20Var);
            }
            ((p9.b) zzt.zzk()).getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jLongValue = ((Long) zzba.zzc().a(am.r0)).longValue();
            long jLongValue2 = ((Long) zzba.zzc().a(am.f12309q0)).longValue() * 1000;
            long jIntValue = ((Integer) zzba.zzc().a(am.A)).intValue();
            boolean zBooleanValue = ((Boolean) zzba.zzc().a(am.G2)).booleanValue();
            long j13 = -1;
            i20Var = i20Var;
            while (true) {
                synchronized (this) {
                    try {
                        if (System.currentTimeMillis() - jCurrentTimeMillis > jLongValue2) {
                            String str5 = str4;
                            long j14 = jLongValue2;
                            StringBuilder sb2 = new StringBuilder(String.valueOf(j14).length() + 27);
                            sb2.append(str5);
                            sb2.append(j14);
                            sb2.append(str3);
                            throw new IOException(sb2.toString());
                        }
                        if (i20Var.f15526f) {
                            throw new IOException("Abort requested before buffering finished. ");
                        }
                        if (i20Var.f15527g) {
                            return true;
                        }
                        xz1 xz1Var = i20Var.f15524d.f19289g;
                        if (!(xz1Var != null ? true : z11)) {
                            throw new IOException("ExoPlayer was released during preloading.");
                        }
                        long jX0 = xz1Var.X0();
                        if (jX0 > 0) {
                            long jY0 = i20Var.f15524d.f19289g.Y0();
                            if (jY0 != j13) {
                                boolean z12 = jY0 > 0 ? true : z11;
                                if (zBooleanValue) {
                                    try {
                                        r20 r20Var2 = i20Var.f15524d;
                                        j12 = (r20Var2.f19300s == null || !r20Var2.f19300s.f17224p) ? r20Var2.f19293k : 0L;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z10 = false;
                                    }
                                } else {
                                    j12 = -1;
                                }
                                long jP = zBooleanValue ? i20Var.f15524d.p() : -1L;
                                long jQ = zBooleanValue ? i20Var.f15524d.q() : -1L;
                                try {
                                    int i11 = r20.f19281u.get();
                                    int i12 = r20.f19282v.get();
                                    Handler handler = zzf.zza;
                                    long j15 = j12;
                                    j10 = jX0;
                                    j11 = jY0;
                                    z10 = false;
                                    try {
                                        a20 a20Var = new a20(i20Var, str2, strConcat, j11, j10, j15, jP, jQ, z12, i11, i12);
                                        Handler handler2 = handler;
                                        handler2.post(a20Var);
                                        j13 = j11;
                                        i20Var = handler2;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        i20Var = this;
                                        str2 = str;
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    z10 = false;
                                    i20Var = this;
                                    str2 = str;
                                    throw th;
                                }
                            } else {
                                z10 = z11;
                                j10 = jX0;
                                j11 = jY0;
                                i20Var = i20Var;
                            }
                            if (j11 >= j10) {
                                zzf.zza.post(new com.adjust.sdk.i0(this, str, strConcat, j10, 3));
                                return true;
                            }
                            try {
                                i20 i20Var2 = this;
                                str2 = str;
                                if (i20Var2.f15524d.f19293k >= jIntValue && j11 > 0) {
                                    return true;
                                }
                                i20Var = i20Var2;
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } else {
                            str3 = str3;
                            str4 = str4;
                            z10 = z11;
                            jLongValue2 = jLongValue2;
                            jIntValue = jIntValue;
                            i20Var = i20Var;
                        }
                        try {
                            i20Var.wait(jLongValue);
                        } catch (InterruptedException unused) {
                            throw new IOException("Wait interrupted.");
                        }
                    } catch (Throwable th6) {
                        th = th6;
                        z10 = z11;
                    }
                }
                try {
                    throw th;
                } catch (Exception e10) {
                    e = e10;
                    String message = e.getMessage();
                    String strH = d5.u.h(new StringBuilder(String.valueOf(str2).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str2, " Exception: ", message);
                    int i13 = zze.zza;
                    zzo.zzi(strH);
                    zzt.zzh().e("VideoStreamExoPlayerCache.preload", e);
                    i20Var.g();
                    i20Var.q(str2, strConcat, "error", s("error", e));
                    return z10;
                }
                jLongValue = jLongValue;
                jIntValue = jIntValue;
                z11 = z10;
                jLongValue2 = jLongValue2;
                str3 = str3;
                str4 = str4;
                i20Var = i20Var;
            }
        } catch (Exception e11) {
            e = e11;
            z10 = z11;
        }
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final boolean k(String str, String[] strArr, w10 w10Var) {
        this.f15525e = str;
        this.f15528h = w10Var;
        String strConcat = "cache:".concat(String.valueOf(zzf.zzg(str)));
        try {
            Uri[] uriArr = new Uri[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                uriArr[i10] = Uri.parse(strArr[i10]);
            }
            r20 r20Var = this.f15524d;
            r20Var.getClass();
            r20Var.t(uriArr, ByteBuffer.allocate(0), false);
            b30 b30Var = (b30) this.f13808c.get();
            if (b30Var != null) {
                b30Var.e0(strConcat, this);
            }
            ((p9.b) zzt.zzk()).getClass();
            this.f15529i = System.currentTimeMillis();
            this.f15530j = -1L;
            zzs.zza.postDelayed(new d(this, 22), 0L);
            return true;
        } catch (Exception e10) {
            String message = e10.getMessage();
            String strH = d5.u.h(new StringBuilder(String.valueOf(str).length() + 34 + String.valueOf(message).length()), "Failed to preload url ", str, " Exception: ", message);
            int i11 = zze.zza;
            zzo.zzi(strH);
            zzt.zzh().e("VideoStreamExoPlayerCache.preload", e10);
            g();
            q(str, strConcat, "error", s("error", e10));
            return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final void l(int i10) {
        l20 l20Var = this.f15524d.f19284b;
        synchronized (l20Var) {
            l20Var.f16676c = ((long) i10) * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final void m(int i10) {
        l20 l20Var = this.f15524d.f19284b;
        synchronized (l20Var) {
            l20Var.f16675b = ((long) i10) * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final void n(int i10) {
        l20 l20Var = this.f15524d.f19284b;
        synchronized (l20Var) {
            l20Var.f16677d = ((long) i10) * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final void o(int i10) {
        l20 l20Var = this.f15524d.f19284b;
        synchronized (l20Var) {
            l20Var.f16678e = ((long) i10) * 1000;
        }
    }

    @Override // com.google.android.gms.internal.ads.e20
    public final void p() {
        synchronized (this) {
            this.f15526f = true;
            notify();
            g();
        }
        String str = this.f15525e;
        if (str != null) {
            q(this.f15525e, "cache:".concat(String.valueOf(zzf.zzg(str))), "externalAbort", "Programmatic precache abort.");
        }
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final void zzD() {
        int i10 = zze.zza;
        zzo.zzi("Precache onRenderedFirstFrame");
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final void zzs(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.e10
    public final void b(int i10, int i11) {
    }
}
