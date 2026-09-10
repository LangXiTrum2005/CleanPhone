package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class y0 implements u1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ca1 f22053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public g22 f22054b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f22055c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f22056d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f22057e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ c1 f22058f;

    public y0(c1 c1Var, Context context) {
        this.f22058f = c1Var;
        uu0.l(context);
        aa1 aa1Var = ca1.f13122b;
        this.f22053a = ya1.f22208e;
        this.f22056d = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void b(long j10, long j11) throws t1 {
        this.f22058f.f12976e.b(j10 + this.f22055c, j11);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0043 A[Catch: ih0 -> 0x0036, TryCatch #0 {ih0 -> 0x0036, blocks: (B:12:0x001d, B:15:0x0026, B:18:0x002e, B:26:0x003d, B:29:0x0043, B:31:0x0047, B:42:0x0061, B:43:0x0064, B:36:0x0052), top: B:48:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:35:0x0050 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:36:0x0052 A[Catch: ih0 -> 0x0036, TryCatch #0 {ih0 -> 0x0036, blocks: (B:12:0x001d, B:15:0x0026, B:18:0x002e, B:26:0x003d, B:29:0x0043, B:31:0x0047, B:42:0x0061, B:43:0x0064, B:36:0x0052), top: B:48:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:38:0x005a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0061 A[Catch: ih0 -> 0x0036, TryCatch #0 {ih0 -> 0x0036, blocks: (B:12:0x001d, B:15:0x0026, B:18:0x002e, B:26:0x003d, B:29:0x0043, B:31:0x0047, B:42:0x0061, B:43:0x0064, B:36:0x0052), top: B:48:0x001d }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0064 A[Catch: ih0 -> 0x0036, TRY_LEAVE, TryCatch #0 {ih0 -> 0x0036, blocks: (B:12:0x001d, B:15:0x0026, B:18:0x002e, B:26:0x003d, B:29:0x0043, B:31:0x0047, B:42:0x0061, B:43:0x0064, B:36:0x0052), top: B:48:0x001d }] */
    /* JADX WARN: Instruction removed from duplicated block: B:43:0x0064, please report this as an issue */
    @Override // com.google.android.gms.internal.ads.u1
    public final boolean c(g22 g22Var) throws t1 {
        c1 c1Var = this.f22058f;
        boolean z10 = false;
        boolean zC = true;
        ps1.c0(c1Var.f12984n == 0);
        lq1 lq1Var = g22Var.E;
        if (lq1Var == null || !lq1Var.d()) {
            lq1Var = lq1.f17101h;
        }
        try {
            int i10 = lq1Var.f17104c;
            if (i10 != 7) {
                if (i10 == 6) {
                    if (Build.VERSION.SDK_INT >= 33 && x10.C("EGL_EXT_gl_colorspace_bt2020_pq")) {
                        z10 = true;
                    }
                    zC = z10;
                } else if (i10 == 7) {
                    zC = x10.C("EGL_EXT_gl_colorspace_bt2020_hlg");
                }
                if (zC) {
                    String str = uu0.f20901a;
                    Locale locale = Locale.US;
                    v71.y("PlaybackVidGraphWrapper", "Color transfer " + i10 + " is not supported. Falling back to OpenGl tone mapping.");
                    lq1 lq1Var2 = lq1.f17101h;
                } else if (i10 != 2 || i10 == 10) {
                    lq1 lq1Var3 = lq1.f17101h;
                }
            } else {
                int i11 = Build.VERSION.SDK_INT;
                if (i11 < 34) {
                    if (!(i11 >= 33 && x10.C("EGL_EXT_gl_colorspace_bt2020_pq"))) {
                    }
                }
                i10 = 7;
                if (i10 == 6) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        z10 = true;
                    }
                    zC = z10;
                } else if (i10 == 7) {
                    zC = x10.C("EGL_EXT_gl_colorspace_bt2020_hlg");
                }
                if (zC) {
                    String str2 = uu0.f20901a;
                    Locale locale2 = Locale.US;
                    v71.y("PlaybackVidGraphWrapper", "Color transfer " + i10 + " is not supported. Falling back to OpenGl tone mapping.");
                    lq1 lq1Var4 = lq1.f17101h;
                } else if (i10 != 2) {
                    lq1 lq1Var5 = lq1.f17101h;
                } else {
                    lq1 lq1Var6 = lq1.f17101h;
                }
            }
            s6 s6Var = c1Var.f12977f;
            Looper looperMyLooper = Looper.myLooper();
            looperMyLooper.getClass();
            c1Var.f12982k = s6Var.u(looperMyLooper, null);
            c1Var.f12973b.a();
            throw null;
        } catch (ih0 e10) {
            throw new t1(e10, g22Var);
        }
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void d(d1 d1Var) {
        this.f22058f.f12976e.f17604j = d1Var;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void e(float f10) {
        c1 c1Var = this.f22058f;
        c1Var.f12980i.e(f10);
        c1Var.f12976e.e(f10);
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void f(Surface surface, aq0 aq0Var) {
        c1 c1Var = this.f22058f;
        Pair pair = c1Var.l;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((aq0) c1Var.l.second).equals(aq0Var)) {
            return;
        }
        c1Var.l = Pair.create(surface, aq0Var);
        aq0Var.getClass();
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final boolean g(long j10, s0 s0Var) {
        int i10;
        ps1.c0(false);
        long j11 = j10 + this.f22055c;
        c1 c1Var = this.f22058f;
        g1 g1Var = c1Var.f12980i;
        long j12 = g1Var.f14649a;
        long j13 = j12 == C.TIME_UNSET ? -9223372036854775807L : (long) (((j11 - j12) * g1Var.f14651c) + g1Var.f14650b);
        if (j13 != C.TIME_UNSET && j13 < c1Var.f12979h && (i10 = this.f22057e) < 2) {
            this.f22057e = i10 + 1;
            s0Var.a();
            return true;
        }
        int i11 = c1Var.f12986p;
        if (i11 == -1 || i11 != 0) {
            return false;
        }
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void h(int i10) {
        this.f22058f.f12976e.h(i10);
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void i(List list) {
        if (this.f22053a.equals(list)) {
            return;
        }
        this.f22053a = ca1.y(list);
        g22 g22Var = this.f22054b;
        if (g22Var == null) {
            return;
        }
        i12 i12Var = new i12(g22Var);
        lq1 lq1Var = g22Var.E;
        if (lq1Var == null || !lq1Var.d()) {
            lq1Var = lq1.f17101h;
        }
        i12Var.D = lq1Var;
        i12Var.b();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void j(long j10) {
        this.f22055c = j10;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void k(g22 g22Var, long j10, int i10, List list) {
        ps1.c0(false);
        this.f22053a = ca1.y(list);
        this.f22054b = g22Var;
        this.f22058f.getClass();
        i12 i12Var = new i12(g22Var);
        lq1 lq1Var = g22Var.E;
        if (lq1Var == null || !lq1Var.d()) {
            lq1Var = lq1.f17101h;
        }
        i12Var.D = lq1Var;
        i12Var.b();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void zza() {
        c1 c1Var = this.f22058f;
        if (c1Var.f12975d) {
            c1Var.f12976e.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void zzb() {
        c1 c1Var = this.f22058f;
        if (c1Var.f12975d) {
            c1Var.f12976e.zzb();
        }
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void zzg(boolean z10) {
        this.f22056d = C.TIME_UNSET;
        c1 c1Var = this.f22058f;
        if (c1Var.f12984n == 1) {
            c1Var.f12983m++;
            c1Var.f12976e.zzg(z10);
            while (c1Var.f12981j.h() > 1) {
                c1Var.f12981j.i();
            }
            if (c1Var.f12981j.h() == 1) {
                ((b1) c1Var.f12981j.i()).getClass();
                throw null;
            }
            c1Var.f12985o = C.TIME_UNSET;
            ys0 ys0Var = c1Var.f12982k;
            ys0Var.getClass();
            ys0Var.e(new d(c1Var, 3));
        }
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final boolean zzh(boolean z10) {
        return this.f22058f.f12976e.f17595a.e(false);
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void zzi() {
        long j10 = this.f22056d;
        c1 c1Var = this.f22058f;
        c1Var.getClass();
        if (c1Var.f12985o >= j10) {
            c1Var.f12976e.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final boolean zzj() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final Surface zzk() {
        ps1.c0(false);
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void zzq() {
        c1 c1Var = this.f22058f;
        c1Var.getClass();
        aq0.f12492c.getClass();
        c1Var.l = null;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void zzt() {
        c1 c1Var = this.f22058f;
        if (c1Var.f12981j.h() == 0) {
            c1Var.f12976e.zzt();
            return;
        }
        ht0 ht0Var = new ht0(0);
        if (c1Var.f12981j.h() <= 0) {
            c1Var.f12981j = ht0Var;
        } else {
            ((b1) c1Var.f12981j.i()).getClass();
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void zzw(boolean z10) {
        c1 c1Var = this.f22058f;
        if (c1Var.f12975d) {
            c1Var.f12976e.zzw(z10);
        }
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void zzx() {
        c1 c1Var = this.f22058f;
        if (c1Var.f12984n == 2) {
            return;
        }
        ys0 ys0Var = c1Var.f12982k;
        if (ys0Var != null) {
            ys0Var.f22362a.removeCallbacksAndMessages(null);
        }
        c1Var.l = null;
        c1Var.f12984n = 2;
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.u1
    public final void a(r0 r0Var) {
    }
}
