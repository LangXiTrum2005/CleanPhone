package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Pair;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbh;
import com.google.android.gms.ads.internal.client.zzbk;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzcs;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class hp0 implements AppEventListener, mb0, ta0, ha0, na0, zza, da0, db0, la0, qc0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final yh0 f15351j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicReference f15342a = new AtomicReference();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f15343b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f15344c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f15345d = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f15346e = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f15347f = new AtomicBoolean(true);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f15348g = new AtomicBoolean(false);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicBoolean f15349h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReference f15350i = new AtomicReference();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayBlockingQueue f15352k = new ArrayBlockingQueue(((Integer) zzba.zzc().a(am.f12347sa)).intValue());

    public hp0(yh0 yh0Var) {
        this.f15351j = yh0Var;
    }

    @Override // com.google.android.gms.internal.ads.qc0
    public final void C() {
        Object obj;
        if (((Boolean) zzba.zzc().a(am.f12349sc)).booleanValue() && (obj = this.f15342a.get()) != null) {
            try {
                ((zzbh) obj).zzh();
            } catch (RemoteException e10) {
                int i10 = zze.zza;
                zzo.zzl("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                int i11 = zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj2 = this.f15346e.get();
        if (obj2 == null) {
            return;
        }
        try {
            ((zzcs) obj2).zzf();
        } catch (RemoteException e12) {
            int i12 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e12);
        } catch (NullPointerException e13) {
            int i13 = zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e13);
        }
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void J() {
        dv.i(this.f15342a, tc0.f20296o);
        Object obj = this.f15346e.get();
        if (obj != null) {
            try {
                ((zzcs) obj).zzd();
            } catch (RemoteException e10) {
                int i10 = zze.zza;
                zzo.zzl("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                int i11 = zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        dv.i(this.f15350i, tc0.f20297p);
    }

    @Override // com.google.android.gms.internal.ads.qc0
    public final void O() {
        Object obj = this.f15342a.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzbh) obj).zzi();
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            int i11 = zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void Q() {
        dv.i(this.f15342a, tc0.f20295n);
        AtomicReference atomicReference = this.f15346e;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((zzcs) obj).zzc();
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
            ((zzcs) obj2).zze();
        } catch (RemoteException e12) {
            int i12 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e12);
        } catch (NullPointerException e13) {
            int i13 = zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e13);
        }
    }

    public final void Y() {
        if (this.f15348g.get() && this.f15349h.get()) {
            ArrayBlockingQueue<Pair> arrayBlockingQueue = this.f15352k;
            for (Pair pair : arrayBlockingQueue) {
                Object obj = this.f15343b.get();
                if (obj != null) {
                    try {
                        ((zzcl) obj).zzb((String) pair.first, (String) pair.second);
                    } catch (RemoteException e10) {
                        int i10 = zze.zza;
                        zzo.zzl("#007 Could not call remote method.", e10);
                    } catch (NullPointerException e11) {
                        int i11 = zze.zza;
                        zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
                    }
                }
            }
            arrayBlockingQueue.clear();
            this.f15347f.set(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void Z() {
        Object obj = this.f15342a.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzbh) obj).zze();
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            int i11 = zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    public final synchronized zzbh a() {
        return (zzbh) this.f15342a.get();
    }

    @Override // com.google.android.gms.internal.ads.db0
    public final void b(zzt zztVar) {
        Object obj = this.f15344c.get();
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
        Object obj = this.f15346e.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzcs) obj).zzb(zzeVar);
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
        AtomicReference atomicReference = this.f15342a;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((zzbh) obj).zzd(zzeVar);
            } catch (RemoteException e10) {
                int i10 = zze.zza;
                zzo.zzl("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                int i11 = zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((zzbh) obj2).zzc(zzeVar.zza);
            } catch (RemoteException e12) {
                int i12 = zze.zza;
                zzo.zzl("#007 Could not call remote method.", e12);
            } catch (NullPointerException e13) {
                int i13 = zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e13);
            }
        }
        Object obj3 = this.f15345d.get();
        if (obj3 != null) {
            try {
                ((zzbk) obj3).zzc(zzeVar);
            } catch (RemoteException e14) {
                int i14 = zze.zza;
                zzo.zzl("#007 Could not call remote method.", e14);
            } catch (NullPointerException e15) {
                int i15 = zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e15);
            }
        }
        this.f15347f.set(false);
        this.f15352k.clear();
    }

    @Override // com.google.android.gms.internal.ads.na0
    public final void k() {
        Object obj = this.f15342a.get();
        if (obj == null) {
            return;
        }
        try {
            ((zzbh) obj).zzj();
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            int i11 = zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        Object obj;
        if (((Boolean) zzba.zzc().a(am.f12349sc)).booleanValue() || (obj = this.f15342a.get()) == null) {
            return;
        }
        try {
            ((zzbh) obj).zzh();
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            int i11 = zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final synchronized void onAppEvent(String str, String str2) {
        if (!this.f15347f.get()) {
            Object obj = this.f15343b.get();
            if (obj != null) {
                try {
                    ((zzcl) obj).zzb(str, str2);
                } catch (RemoteException e10) {
                    int i10 = zze.zza;
                    zzo.zzl("#007 Could not call remote method.", e10);
                } catch (NullPointerException e11) {
                    int i11 = zze.zza;
                    zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
                }
            }
            return;
        }
        if (!this.f15352k.offer(new Pair(str, str2))) {
            int i12 = zze.zza;
            zzo.zzd("The queue for app events is full, dropping the new event.");
            yh0 yh0Var = this.f15351j;
            if (yh0Var != null) {
                lj1 lj1VarA = yh0Var.a();
                lj1VarA.l("action", "dae_action");
                lj1VarA.l("dae_name", str);
                lj1VarA.l("dae_data", str2);
                lj1VarA.m();
            }
        }
    }

    public final void v(zzcl zzclVar) {
        this.f15343b.set(zzclVar);
        this.f15348g.set(true);
        Y();
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final void z(ju0 ju0Var) {
        this.f15347f.set(true);
        this.f15349h.set(false);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x002c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.ta0
    public final synchronized void zzg() {
        Object obj;
        Object obj2 = this.f15342a.get();
        if (obj2 == null) {
            obj = this.f15345d.get();
            if (obj != null) {
                try {
                    try {
                        ((zzbk) obj).zzb();
                    } catch (RemoteException e10) {
                        int i10 = zze.zza;
                        zzo.zzl("#007 Could not call remote method.", e10);
                    }
                } catch (NullPointerException e11) {
                    int i11 = zze.zza;
                    zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
                }
            }
            this.f15349h.set(true);
            Y();
        } else {
            try {
                try {
                    ((zzbh) obj2).zzf();
                } catch (NullPointerException e12) {
                    int i12 = zze.zza;
                    zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e12);
                }
            } catch (RemoteException e13) {
                int i13 = zze.zza;
                zzo.zzl("#007 Could not call remote method.", e13);
            }
            obj = this.f15345d.get();
            if (obj != null) {
                ((zzbk) obj).zzb();
            }
            this.f15349h.set(true);
            Y();
        }
        throw th;
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.mb0
    public final void q0(mx mxVar) {
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void f(sx sxVar, String str, String str2) {
    }
}
