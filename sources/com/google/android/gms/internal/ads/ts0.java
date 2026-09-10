package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.ads.internal.overlay.zzr;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ts0 implements ha0, za0, it0, zzr, db0, la0, qc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zu0 f20479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f20480b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f20481c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f20482d = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f20483e = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f20484f = new AtomicReference();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f20485g = new AtomicReference();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f20486h = new AtomicReference();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ts0 f20487i = null;

    public ts0(zu0 zu0Var) {
        this.f20479a = zu0Var;
    }

    @Override // com.google.android.gms.internal.ads.qc0
    public final void C() {
        ts0 ts0Var = this.f20487i;
        if (ts0Var != null) {
            ts0Var.C();
            return;
        }
        Object obj = this.f20482d.get();
        if (obj == null) {
            return;
        }
        try {
            ((bj) obj).zzg();
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            int i11 = zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.it0
    public final void a(it0 it0Var) {
        this.f20487i = (ts0) it0Var;
    }

    @Override // com.google.android.gms.internal.ads.db0
    public final void b(zzt zztVar) {
        ts0 ts0Var = this.f20487i;
        if (ts0Var != null) {
            ts0Var.b(zztVar);
            return;
        }
        Object obj = this.f20485g.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzdq) obj).zze(zztVar);
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            int i11 = zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.la0
    public final void e(com.google.android.gms.ads.internal.client.zze zzeVar) {
        ts0 ts0Var = this.f20487i;
        if (ts0Var != null) {
            ts0Var.e(zzeVar);
            return;
        }
        Object obj = this.f20482d.get();
        if (obj == null) {
            return;
        }
        try {
            ((bj) obj).zze(zzeVar);
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            int i11 = zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    public final void f(m70 m70Var) {
        ts0 ts0Var = this.f20487i;
        if (ts0Var != null) {
            ts0Var.f(m70Var);
            return;
        }
        Object obj = this.f20480b.get();
        if (obj == null) {
            return;
        }
        try {
            ((zi) obj).r0(m70Var);
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            int i11 = zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.ha0
    public final void j0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        ts0 ts0Var = this.f20487i;
        if (ts0Var != null) {
            ts0Var.j0(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.f20480b;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((zi) obj).zzd(zzeVar);
            } catch (RemoteException e10) {
                int i10 = zze.zza;
                zzo.zzl("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                int i11 = zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((zi) obj2).zzc(zzeVar.zza);
        } catch (RemoteException e12) {
            int i12 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e12);
        } catch (NullPointerException e13) {
            int i13 = zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e13);
        }
    }

    public final void k() {
        ts0 ts0Var = this.f20487i;
        if (ts0Var != null) {
            ts0Var.k();
            return;
        }
        at0 at0Var = this.f20479a.f22722a;
        if (at0Var != null) {
            s sVar = (s) at0Var.f12510b;
            synchronized (sVar) {
                sVar.f19742a = 1;
                sVar.d();
            }
        }
        if (this.f20481c.get() != null) {
            try {
                throw new ClassCastException();
            } catch (RemoteException e10) {
                int i10 = zze.zza;
                zzo.zzl("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                int i11 = zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj = this.f20482d.get();
        if (obj != null) {
            try {
                ((bj) obj).zzd();
            } catch (RemoteException e12) {
                int i12 = zze.zza;
                zzo.zzl("#007 Could not call remote method.", e12);
            } catch (NullPointerException e13) {
                int i13 = zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e13);
            }
        }
        Object obj2 = this.f20486h.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((wx0) obj2).a();
        } catch (RemoteException e14) {
            int i14 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e14);
        } catch (NullPointerException e15) {
            int i15 = zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e15);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdT() {
        ts0 ts0Var = this.f20487i;
        if (ts0Var != null) {
            ts0Var.zzdT();
        } else {
            dv.i(this.f20484f, tc0.f20299r);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdU(int i10) {
        ts0 ts0Var = this.f20487i;
        if (ts0Var != null) {
            ts0Var.zzdU(i10);
            return;
        }
        Object obj = this.f20484f.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzr) obj).zzdU(i10);
        } catch (RemoteException e10) {
            int i11 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            int i12 = zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdv() {
        ts0 ts0Var = this.f20487i;
        if (ts0Var != null) {
            ts0Var.zzdv();
        } else {
            dv.i(this.f20484f, tc0.f20300s);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzh() {
        ts0 ts0Var = this.f20487i;
        if (ts0Var != null) {
            ts0Var.zzh();
            return;
        }
        dv.i(this.f20484f, tc0.f20301t);
        tc0 tc0Var = tc0.f20302u;
        AtomicReference atomicReference = this.f20482d;
        dv.i(atomicReference, tc0Var);
        Object obj = atomicReference.get();
        if (obj == null) {
            return;
        }
        try {
            ((bj) obj).zzf();
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            int i11 = zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.za0
    public final void zzl() {
        ts0 ts0Var = this.f20487i;
        if (ts0Var != null) {
            ts0Var.zzl();
        } else {
            dv.i(this.f20483e, tc0.f20298q);
        }
    }

    @Override // com.google.android.gms.internal.ads.qc0
    public final void O() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdq() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdw() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdx() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdy() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdz() {
    }
}
