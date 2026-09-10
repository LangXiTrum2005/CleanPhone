package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public class qo0 extends wt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ba0 f19138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final pc0 f19139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ma0 f19140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qa0 f19141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sa0 f19142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final tb0 f19143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final bb0 f19144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xc0 f19145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final qb0 f19146i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ka0 f19147j;

    public qo0(ba0 ba0Var, pc0 pc0Var, ma0 ma0Var, qa0 qa0Var, sa0 sa0Var, tb0 tb0Var, bb0 bb0Var, xc0 xc0Var, qb0 qb0Var, ka0 ka0Var) {
        this.f19138a = ba0Var;
        this.f19139b = pc0Var;
        this.f19140c = ma0Var;
        this.f19141d = qa0Var;
        this.f19142e = sa0Var;
        this.f19143f = tb0Var;
        this.f19144g = bb0Var;
        this.f19145h = xc0Var;
        this.f19146i = qb0Var;
        this.f19147j = ka0Var;
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void B(zze zzeVar) {
        this.f19147j.zzc(pi1.z(8, zzeVar));
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void k0(String str, String str2) {
        this.f19143f.zzb(str, str2);
    }

    public void p() {
        this.f19145h.S0(tc0.f20286d);
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void zze() {
        this.f19138a.onAdClicked();
        this.f19139b.C();
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void zzf() {
        this.f19144g.zzdU(4);
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void zzh() {
        this.f19141d.X0();
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void zzi() {
        this.f19144g.zzh();
        this.f19146i.S0(xa0.f21822q);
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void zzj() {
        this.f19142e.zzg();
    }

    public void zzk() {
        this.f19140c.zza();
        this.f19146i.S0(xa0.f21823r);
    }

    public void zzo() {
        xc0 xc0Var = this.f19145h;
        synchronized (xc0Var) {
            xc0Var.S0(tc0.f20287e);
            xc0Var.f21836c = true;
        }
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void zzq() {
        this.f19145h.S0(tc0.f20290h);
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void zzs(int i10) {
        B(new zze(i10, "", AdError.UNDEFINED_DOMAIN, null, null));
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void zzu() {
        xc0 xc0Var = this.f19145h;
        synchronized (xc0Var) {
            try {
                if (!xc0Var.f21836c) {
                    xc0Var.S0(tc0.f20289g);
                    xc0Var.f21836c = true;
                }
                xc0Var.S0(tc0.f20288f);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void zzv(String str) {
        B(new zze(0, str, AdError.UNDEFINED_DOMAIN, null, null));
    }

    public void zzt() {
    }

    public void zzz() {
    }

    public void L0(fy fyVar) {
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void g(int i10) {
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void v(zze zzeVar) {
    }

    public void w(dy dyVar) {
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void D(ap apVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final void t1(int i10, String str) {
    }
}
