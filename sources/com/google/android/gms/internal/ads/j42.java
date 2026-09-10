package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Looper;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class j42 extends a32 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final jk1 f15972i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z61 f15973j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final s6 f15974k;
    public final int l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f15975m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f15976n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f15977o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f15978p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f15979q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public ox1 f15980r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f5 f15981s;

    public /* synthetic */ j42(f5 f5Var, jk1 jk1Var, z61 z61Var, s6 s6Var, int i10) {
        s6 s6Var2 = s6.f19867k;
        this.f15981s = f5Var;
        this.f15972i = jk1Var;
        this.f15973j = z61Var;
        this.f15974k = s6Var2;
        this.l = i10;
        this.f15975m = true;
        this.f15976n = C.TIME_UNSET;
    }

    @Override // com.google.android.gms.internal.ads.a32
    public final synchronized void a(f5 f5Var) {
        this.f15981s = f5Var;
    }

    @Override // com.google.android.gms.internal.ads.a32
    public final void b(q32 q32Var) {
        h42 h42Var = (h42) q32Var;
        if (h42Var.f15144v) {
            for (n42 n42Var : h42Var.f15141s) {
                n42Var.o();
                if (n42Var.f17651g != null) {
                    n42Var.f17651g = null;
                    n42Var.f17650f = null;
                }
            }
        }
        vu0 vu0Var = h42Var.f15133j;
        c0 c0Var = (c0) vu0Var.f21275c;
        if (c0Var != null) {
            c0Var.a(true);
        }
        g0 g0Var = (g0) vu0Var.f21274b;
        g0Var.execute(new d(h42Var, 1));
        ((ExecutorService) ((Executor) g0Var.f14627b)).shutdown();
        h42Var.f15137o.removeCallbacksAndMessages(null);
        h42Var.f15138p = null;
        h42Var.N = true;
    }

    @Override // com.google.android.gms.internal.ads.a32
    public final q32 c(r32 r32Var, u uVar, long j10) {
        wk1 wk1VarMo166zza = this.f15972i.mo166zza();
        ox1 ox1Var = this.f15980r;
        if (ox1Var != null) {
            wk1VarMo166zza.n(ox1Var);
        }
        l2 l2Var = f().f14214b;
        l2Var.getClass();
        Uri uri = l2Var.f16671a;
        this.f11826g.getClass();
        return new h42(uri, wk1VarMo166zza, new ay0((p2) this.f15973j.f22523a), this.f15974k, new f81((CopyOnWriteArrayList) this.f11823d.f14318c, r32Var), new iw0((CopyOnWriteArrayList) this.f11822c.f15865c, false, r32Var, 17), this, uVar, this.l, uu0.t(C.TIME_UNSET));
    }

    @Override // com.google.android.gms.internal.ads.a32
    public final synchronized f5 f() {
        return this.f15981s;
    }

    @Override // com.google.android.gms.internal.ads.a32
    public final void h(ox1 ox1Var) {
        this.f15980r = ox1Var;
        Looper.myLooper().getClass();
        this.f11826g.getClass();
        t();
    }

    public final void s(long j10, a3 a3Var, boolean z10) {
        if (this.f15979q && a3Var.zzj()) {
            return;
        }
        this.f15979q = !a3Var.zzj();
        if (j10 == C.TIME_UNSET) {
            j10 = this.f15976n;
        }
        boolean zZzb = a3Var.zzb();
        if (!this.f15975m && this.f15976n == j10 && this.f15977o == zZzb && this.f15978p == z10) {
            return;
        }
        this.f15976n = j10;
        this.f15977o = zZzb;
        this.f15978p = z10;
        this.f15975m = false;
        t();
    }

    public final void t() {
        long j10 = this.f15976n;
        boolean z10 = this.f15977o;
        boolean z11 = this.f15978p;
        f5 f5VarF = f();
        ci r42Var = new r42(j10, j10, z10, f5VarF, z11 ? f5VarF.f14215c : null);
        if (this.f15975m) {
            r42Var = new i42(r42Var);
        }
        k(r42Var);
    }

    @Override // com.google.android.gms.internal.ads.a32
    public final void j() {
    }

    @Override // com.google.android.gms.internal.ads.a32
    public final void r() {
    }
}
