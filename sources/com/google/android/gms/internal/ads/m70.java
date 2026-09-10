package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzbu;
import com.google.android.gms.ads.internal.client.zzdp;
import com.google.android.gms.ads.internal.client.zzdq;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class m70 extends qh implements wi {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f17318f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l70 f17319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzbu f17320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ts0 f17321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f17322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final yh0 f17323e;

    public m70(l70 l70Var, zzbu zzbuVar, ts0 ts0Var, yh0 yh0Var) {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
        this.f17319a = l70Var;
        this.f17320b = zzbuVar;
        this.f17321c = ts0Var;
        this.f17323e = yh0Var;
        if (((Boolean) zzba.zzc().a(am.f12386v1)).booleanValue() && Build.VERSION.SDK_INT >= 35) {
            this.f17322d = true;
        } else {
            this.f17322d = ((Boolean) zzba.zzc().a(am.f12400w1)).booleanValue();
        }
    }

    @Override // com.google.android.gms.internal.ads.wi
    public final void n0(zzdq zzdqVar) {
        k9.c0.d("setOnPaidEventListener must be called on the main UI thread.");
        ts0 ts0Var = this.f17321c;
        if (ts0Var != null) {
            try {
                if (!zzdqVar.zzf()) {
                    this.f17323e.b();
                }
            } catch (RemoteException e10) {
                int i10 = zze.zza;
                zzo.zze("Error in making CSI ping for reporting paid event callback", e10);
            }
            ts0Var.f20485g.set(zzdqVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.wi
    public final void u0(s9.a aVar, bj bjVar) {
        try {
            this.f17321c.f20482d.set(bjVar);
            this.f17319a.c((Activity) s9.b.y1(aVar), this.f17322d);
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        bj ajVar;
        switch (i10) {
            case 2:
                parcel2.writeNoException();
                rh.e(parcel2, this.f17320b);
                return true;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdPresentationCallback");
                }
                rh.f(parcel);
                parcel2.writeNoException();
                return true;
            case 4:
                s9.a aVarX1 = s9.b.x1(parcel.readStrongBinder());
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 == null) {
                    ajVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                    ajVar = iInterfaceQueryLocalInterface instanceof bj ? (bj) iInterfaceQueryLocalInterface : new aj(strongBinder2, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
                }
                rh.f(parcel);
                u0(aVarX1, ajVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzdx zzdxVarZzg = zzg();
                parcel2.writeNoException();
                rh.e(parcel2, zzdxVarZzg);
                return true;
            case 6:
                boolean zA = rh.a(parcel);
                rh.f(parcel);
                this.f17322d = zA;
                parcel2.writeNoException();
                return true;
            case 7:
                zzdq zzdqVarZzb = zzdp.zzb(parcel.readStrongBinder());
                rh.f(parcel);
                n0(zzdqVarZzb);
                parcel2.writeNoException();
                return true;
            case 8:
                String strZzj = zzj();
                parcel2.writeNoException();
                parcel2.writeString(strZzj);
                return true;
            case 9:
                long jZzk = zzk();
                parcel2.writeNoException();
                parcel2.writeLong(jZzk);
                return true;
            case 10:
                long j10 = parcel.readLong();
                rh.f(parcel);
                zzl(j10);
                parcel2.writeNoException();
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.wi
    public final zzdx zzg() {
        if (((Boolean) zzba.zzc().a(am.O7)).booleanValue()) {
            return this.f17319a.f17339f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.wi
    public final void zzh(boolean z10) {
        this.f17322d = z10;
    }

    @Override // com.google.android.gms.internal.ads.wi
    public final String zzj() {
        try {
            return this.f17320b.zzu();
        } catch (RemoteException e10) {
            int i10 = zze.zza;
            zzo.zzl("#007 Could not call remote method.", e10);
            return null;
        }
    }

    @Override // com.google.android.gms.internal.ads.wi
    public final long zzk() {
        n90 n90Var;
        l70 l70Var = this.f17319a;
        if (l70Var == null || (n90Var = l70Var.f17343j) == null) {
            return 0L;
        }
        return n90Var.f17723a.get();
    }

    @Override // com.google.android.gms.internal.ads.wi
    public final void zzl(long j10) {
        n90 n90Var;
        l70 l70Var = this.f17319a;
        if (l70Var == null || (n90Var = l70Var.f17343j) == null) {
            return;
        }
        n90Var.a(j10);
    }
}
