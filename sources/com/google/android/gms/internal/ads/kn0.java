package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class kn0 extends ay implements ra0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mo0 f16483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public t6.l f16484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public uw f16485c;

    @Override // com.google.android.gms.internal.ads.cy
    public final synchronized void E(s9.a aVar) {
        mo0 mo0Var = this.f16483a;
        if (mo0Var != null) {
            mo0Var.f17505b.onAdClicked();
        }
    }

    @Override // com.google.android.gms.internal.ads.cy
    public final synchronized void H(s9.a aVar, int i10) {
        t6.l lVar = this.f16484b;
        if (lVar != null) {
            lVar.j(i10);
        }
    }

    @Override // com.google.android.gms.internal.ads.cy
    public final synchronized void M(s9.a aVar) {
        mo0 mo0Var = this.f16483a;
        if (mo0Var != null) {
            mo0Var.f17507d.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.cy
    public final synchronized void i(s9.a aVar) {
        mo0 mo0Var = this.f16483a;
        if (mo0Var != null) {
            mo0Var.f17504a.zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.cy
    public final synchronized void i1(s9.a aVar) {
        mo0 mo0Var = this.f16483a;
        if (mo0Var != null) {
            mo0Var.f17507d.n0(null);
        }
    }

    @Override // com.google.android.gms.internal.ads.cy
    public final synchronized void l(s9.a aVar) {
        uw uwVar = this.f16485c;
        if (uwVar != null) {
            qm0 qm0Var = (qm0) uwVar.f20921e;
            ((ho0) uwVar.f20918b).f15340c.execute(new o1((ju0) uwVar.f20919c, (du0) uwVar.f20920d, qm0Var, 9));
        }
    }

    @Override // com.google.android.gms.internal.ads.ra0
    public final synchronized void m0(t6.l lVar) {
        this.f16484b = lVar;
    }

    @Override // com.google.android.gms.internal.ads.cy
    public final synchronized void o1(s9.a aVar) {
        mo0 mo0Var = this.f16483a;
        if (mo0Var != null) {
            mo0Var.f17506c.S0(jq.f16143n);
        }
    }

    @Override // com.google.android.gms.internal.ads.cy
    public final synchronized void q1(s9.a aVar, dy dyVar) {
        mo0 mo0Var = this.f16483a;
        if (mo0Var != null) {
            mo0Var.f17507d.n0(dyVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.cy
    public final synchronized void zzf(s9.a aVar, int i10) {
        uw uwVar = this.f16485c;
        if (uwVar != null) {
            String str = ((qm0) uwVar.f20921e).f19126a;
            int i11 = zze.zza;
            zzo.zzi("Fail to initialize adapter ".concat(String.valueOf(str)));
        }
    }

    @Override // com.google.android.gms.internal.ads.cy
    public final synchronized void zzg(s9.a aVar) {
        t6.l lVar = this.f16484b;
        if (lVar != null) {
            synchronized (lVar) {
                ((m00) lVar.f50551d).zzc(null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cy
    public final synchronized void zzj(s9.a aVar) {
        mo0 mo0Var = this.f16483a;
        if (mo0Var != null) {
            mo0Var.zzj(aVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.cy
    public final synchronized void zzn(s9.a aVar) {
        mo0 mo0Var = this.f16483a;
        if (mo0Var != null) {
            mo0Var.f17506c.X0();
        }
    }
}
