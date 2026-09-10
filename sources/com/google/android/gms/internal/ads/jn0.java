package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jn0 extends wt implements ra0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public xt f16122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t6.l f16123b;

    @Override // com.google.android.gms.internal.ads.xt
    public final synchronized void B(zze zzeVar) {
        xt xtVar = this.f16122a;
        if (xtVar != null) {
            xtVar.B(zzeVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final synchronized void D(ap apVar, String str) {
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final synchronized void L0(fy fyVar) {
        xt xtVar = this.f16122a;
        if (xtVar != null) {
            xtVar.L0(fyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final synchronized void g(int i10) {
        t6.l lVar = this.f16123b;
        if (lVar != null) {
            lVar.j(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final synchronized void k0(String str, String str2) {
        xt xtVar = this.f16122a;
        if (xtVar != null) {
            xtVar.k0(str, str2);
        }
    }

    @Override // com.google.android.gms.internal.ads.ra0
    public final synchronized void m0(t6.l lVar) {
        this.f16123b = lVar;
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final synchronized void p() {
        xt xtVar = this.f16122a;
        if (xtVar != null) {
            xtVar.p();
        }
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final synchronized void t1(int i10, String str) {
        t6.l lVar = this.f16123b;
        if (lVar != null) {
            synchronized (lVar) {
                try {
                    if (!lVar.f50549b) {
                        lVar.f50549b = true;
                        if (str == null) {
                            str = po0.c(i10, ((qm0) lVar.f50550c).f19126a);
                        }
                        lVar.l(new zze(i10, str, AdError.UNDEFINED_DOMAIN, null, null));
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final synchronized void v(zze zzeVar) {
        t6.l lVar = this.f16123b;
        if (lVar != null) {
            synchronized (lVar) {
                if (!lVar.f50549b) {
                    lVar.f50549b = true;
                    lVar.l(zzeVar);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final synchronized void w(dy dyVar) {
        xt xtVar = this.f16122a;
        if (xtVar != null) {
            xtVar.w(dyVar);
        }
    }

    public final synchronized void y1(qo0 qo0Var) {
        this.f16122a = qo0Var;
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final synchronized void zze() {
        xt xtVar = this.f16122a;
        if (xtVar != null) {
            xtVar.zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final synchronized void zzf() {
        xt xtVar = this.f16122a;
        if (xtVar != null) {
            xtVar.zzf();
        }
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final synchronized void zzh() {
        xt xtVar = this.f16122a;
        if (xtVar != null) {
            xtVar.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final synchronized void zzi() {
        xt xtVar = this.f16122a;
        if (xtVar != null) {
            xtVar.zzi();
        }
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final synchronized void zzj() {
        try {
            xt xtVar = this.f16122a;
            if (xtVar != null) {
                xtVar.zzj();
            }
            t6.l lVar = this.f16123b;
            if (lVar != null) {
                synchronized (lVar) {
                    ((m00) lVar.f50551d).zzc(null);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final synchronized void zzk() {
        xt xtVar = this.f16122a;
        if (xtVar != null) {
            xtVar.zzk();
        }
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final synchronized void zzo() {
        xt xtVar = this.f16122a;
        if (xtVar != null) {
            xtVar.zzo();
        }
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final synchronized void zzq() {
        xt xtVar = this.f16122a;
        if (xtVar != null) {
            xtVar.zzq();
        }
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final synchronized void zzs(int i10) {
        xt xtVar = this.f16122a;
        if (xtVar != null) {
            xtVar.zzs(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final synchronized void zzt() {
        xt xtVar = this.f16122a;
        if (xtVar != null) {
            xtVar.zzt();
        }
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final synchronized void zzu() {
        xt xtVar = this.f16122a;
        if (xtVar != null) {
            xtVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final synchronized void zzv(String str) {
        xt xtVar = this.f16122a;
        if (xtVar != null) {
            xtVar.zzv(str);
        }
    }

    @Override // com.google.android.gms.internal.ads.xt
    public final synchronized void zzz() {
        xt xtVar = this.f16122a;
        if (xtVar != null) {
            xtVar.zzz();
        }
    }
}
