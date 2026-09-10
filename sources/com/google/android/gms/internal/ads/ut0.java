package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class ut0 implements OnAdMetadataChangedListener, ta0, ha0, da0, la0, db0, it0, qc0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final zu0 f20891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicReference f20892b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicReference f20893c = new AtomicReference();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicReference f20894d = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicReference f20895e = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicReference f20896f = new AtomicReference();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f20897g = new AtomicReference();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f20898h = new AtomicReference();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicReference f20899i = new AtomicReference();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ut0 f20900j = null;

    public ut0(zu0 zu0Var) {
        this.f20891a = zu0Var;
    }

    @Override // com.google.android.gms.internal.ads.qc0
    public final void C() {
        ut0 ut0Var = this.f20900j;
        if (ut0Var != null) {
            ut0Var.C();
        } else {
            dv.i(this.f20894d, tc0.f20304w);
        }
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void J() {
        ut0 ut0Var = this.f20900j;
        if (ut0Var != null) {
            ut0Var.J();
            return;
        }
        at0 at0Var = this.f20891a.f22722a;
        if (at0Var != null) {
            s sVar = (s) at0Var.f12510b;
            synchronized (sVar) {
                sVar.f19742a = 1;
                sVar.d();
            }
        }
        Object obj = this.f20894d.get();
        if (obj != null) {
            try {
                ((ly) obj).zzf();
            } catch (RemoteException e10) {
                int i10 = zze.zza;
                zzo.zzl("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                int i11 = zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj2 = this.f20895e.get();
        if (obj2 != null) {
            try {
                wx wxVar = (wx) ((xx) obj2);
                wxVar.m0(wxVar.q(), 4);
            } catch (RemoteException e12) {
                int i12 = zze.zza;
                zzo.zzl("#007 Could not call remote method.", e12);
            } catch (NullPointerException e13) {
                int i13 = zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e13);
            }
        }
        Object obj3 = this.f20899i.get();
        if (obj3 == null) {
            return;
        }
        try {
            ((wx0) obj3).a();
        } catch (RemoteException e14) {
            int i14 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e14);
        } catch (NullPointerException e15) {
            int i15 = zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e15);
        }
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void Q() {
        ut0 ut0Var = this.f20900j;
        if (ut0Var != null) {
            ut0Var.Q();
            return;
        }
        tc0 tc0Var = tc0.f20305x;
        AtomicReference atomicReference = this.f20894d;
        dv.i(atomicReference, tc0Var);
        Object obj = this.f20895e.get();
        if (obj != null) {
            try {
                wx wxVar = (wx) ((xx) obj);
                wxVar.m0(wxVar.q(), 2);
            } catch (RemoteException e10) {
                int i10 = zze.zza;
                zzo.zzl("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                int i11 = zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        dv.i(atomicReference, tc0.f20303v);
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void Z() {
        ut0 ut0Var = this.f20900j;
        if (ut0Var != null) {
            ut0Var.Z();
            return;
        }
        Object obj = this.f20895e.get();
        if (obj == null) {
            return;
        }
        try {
            wx wxVar = (wx) ((xx) obj);
            wxVar.m0(wxVar.q(), 6);
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
        this.f20900j = (ut0) it0Var;
    }

    @Override // com.google.android.gms.internal.ads.db0
    public final void b(zzt zztVar) {
        ut0 ut0Var = this.f20900j;
        if (ut0Var != null) {
            ut0Var.b(zztVar);
            return;
        }
        Object obj = this.f20898h.get();
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
        ut0 ut0Var = this.f20900j;
        if (ut0Var != null) {
            ut0Var.e(zzeVar);
            return;
        }
        AtomicReference atomicReference = this.f20894d;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((ly) obj).i0(zzeVar);
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
            ((ly) obj2).e(zzeVar.zza);
        } catch (RemoteException e12) {
            int i12 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e12);
        } catch (NullPointerException e13) {
            int i13 = zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e13);
        }
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void f(sx sxVar, String str, String str2) {
        int i10 = sxVar.f20060b;
        String str3 = sxVar.f20059a;
        ut0 ut0Var = this.f20900j;
        if (ut0Var != null) {
            ut0Var.f(sxVar, str, str2);
            return;
        }
        Object obj = this.f20894d.get();
        if (obj != null) {
            try {
                ((ly) obj).d0(new wy(str3, i10));
            } catch (RemoteException e10) {
                int i11 = zze.zza;
                zzo.zzl("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                int i12 = zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj2 = this.f20896f.get();
        if (obj2 != null) {
            try {
                qy qyVar = (qy) obj2;
                wy wyVar = new wy(str3, i10);
                Parcel parcelQ = qyVar.q();
                rh.e(parcelQ, wyVar);
                parcelQ.writeString(str);
                parcelQ.writeString(str2);
                qyVar.m0(parcelQ, 2);
            } catch (RemoteException e12) {
                int i13 = zze.zza;
                zzo.zzl("#007 Could not call remote method.", e12);
            } catch (NullPointerException e13) {
                int i14 = zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e13);
            }
        }
        Object obj3 = this.f20895e.get();
        if (obj3 != null) {
            try {
                wx wxVar = (wx) ((xx) obj3);
                Parcel parcelQ2 = wxVar.q();
                rh.e(parcelQ2, sxVar);
                wxVar.m0(parcelQ2, 5);
            } catch (RemoteException e14) {
                int i15 = zze.zza;
                zzo.zzl("#007 Could not call remote method.", e14);
            } catch (NullPointerException e15) {
                int i16 = zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e15);
            }
        }
        Object obj4 = this.f20897g.get();
        if (obj4 == null) {
            return;
        }
        try {
            ux uxVar = (ux) obj4;
            Parcel parcelQ3 = uxVar.q();
            rh.e(parcelQ3, sxVar);
            parcelQ3.writeString(str);
            parcelQ3.writeString(str2);
            uxVar.m0(parcelQ3, 2);
        } catch (RemoteException e16) {
            int i17 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e16);
        } catch (NullPointerException e17) {
            int i18 = zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e17);
        }
    }

    @Override // com.google.android.gms.internal.ads.ha0
    public final void j0(com.google.android.gms.ads.internal.client.zze zzeVar) {
        ut0 ut0Var = this.f20900j;
        if (ut0Var != null) {
            ut0Var.j0(zzeVar);
            return;
        }
        int i10 = zzeVar.zza;
        AtomicReference atomicReference = this.f20893c;
        Object obj = atomicReference.get();
        if (obj != null) {
            try {
                ((py) obj).a(zzeVar);
            } catch (RemoteException e10) {
                int i11 = zze.zza;
                zzo.zzl("#007 Could not call remote method.", e10);
            } catch (NullPointerException e11) {
                int i12 = zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
            }
        }
        Object obj2 = atomicReference.get();
        if (obj2 != null) {
            try {
                ((py) obj2).zzf(i10);
            } catch (RemoteException e12) {
                int i13 = zze.zza;
                zzo.zzl("#007 Could not call remote method.", e12);
            } catch (NullPointerException e13) {
                int i14 = zze.zza;
                zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e13);
            }
        }
        Object obj3 = this.f20895e.get();
        if (obj3 == null) {
            return;
        }
        try {
            wx wxVar = (wx) ((xx) obj3);
            Parcel parcelQ = wxVar.q();
            parcelQ.writeInt(i10);
            wxVar.m0(parcelQ, 7);
        } catch (RemoteException e14) {
            int i15 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e14);
        } catch (NullPointerException e15) {
            int i16 = zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e15);
        }
    }

    @Override // com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener
    public final void onAdMetadataChanged() {
        ut0 ut0Var = this.f20900j;
        if (ut0Var != null) {
            ut0Var.onAdMetadataChanged();
        } else {
            dv.i(this.f20892b, tt0.f20492b);
        }
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void zze() {
        ut0 ut0Var = this.f20900j;
        if (ut0Var != null) {
            ut0Var.zze();
            return;
        }
        Object obj = this.f20895e.get();
        if (obj == null) {
            return;
        }
        try {
            wx wxVar = (wx) ((xx) obj);
            wxVar.m0(wxVar.q(), 3);
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            int i11 = zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.da0
    public final void zzf() {
        ut0 ut0Var = this.f20900j;
        if (ut0Var != null) {
            ut0Var.zzf();
            return;
        }
        Object obj = this.f20895e.get();
        if (obj == null) {
            return;
        }
        try {
            wx wxVar = (wx) ((xx) obj);
            wxVar.m0(wxVar.q(), 8);
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            int i11 = zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final void zzg() {
        ut0 ut0Var = this.f20900j;
        if (ut0Var != null) {
            ut0Var.zzg();
            return;
        }
        dv.i(this.f20893c, tc0.f20306y);
        Object obj = this.f20895e.get();
        if (obj == null) {
            return;
        }
        try {
            wx wxVar = (wx) ((xx) obj);
            wxVar.m0(wxVar.q(), 1);
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e10);
        } catch (NullPointerException e11) {
            int i11 = zze.zza;
            zzo.zzj("NullPointerException occurs when invoking a method from a delegating listener.", e11);
        }
    }

    @Override // com.google.android.gms.internal.ads.qc0
    public final void O() {
    }
}
