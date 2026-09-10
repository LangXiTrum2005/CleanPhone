package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zzea;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class yd0 extends qh implements ko {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final je0 f22213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s9.a f22214b;

    public yd0(je0 je0Var) {
        super("com.google.android.gms.ads.internal.formats.client.IMediaContent");
        this.f22213a = je0Var;
    }

    public static float x1(s9.a aVar) {
        Drawable drawable;
        return (aVar == null || (drawable = (Drawable) s9.b.y1(aVar)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.qh
    public final boolean u1(int i10, Parcel parcel, Parcel parcel2) {
        mp mpVar;
        switch (i10) {
            case 2:
                float fZze = zze();
                parcel2.writeNoException();
                parcel2.writeFloat(fZze);
                return true;
            case 3:
                s9.a aVarX1 = s9.b.x1(parcel.readStrongBinder());
                rh.f(parcel);
                this.f22214b = aVarX1;
                parcel2.writeNoException();
                return true;
            case 4:
                s9.a aVarZzg = zzg();
                parcel2.writeNoException();
                rh.e(parcel2, aVarZzg);
                return true;
            case 5:
                float fZzh = zzh();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzh);
                return true;
            case 6:
                float fZzi = zzi();
                parcel2.writeNoException();
                parcel2.writeFloat(fZzi);
                return true;
            case 7:
                zzea zzeaVarR = this.f22213a.r();
                parcel2.writeNoException();
                rh.e(parcel2, zzeaVarR);
                return true;
            case 8:
                boolean zZzk = zzk();
                parcel2.writeNoException();
                ClassLoader classLoader = rh.f19590a;
                parcel2.writeInt(zZzk ? 1 : 0);
                return true;
            case 9:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    mpVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                    mpVar = iInterfaceQueryLocalInterface instanceof mp ? (mp) iInterfaceQueryLocalInterface : new mp(strongBinder, "com.google.android.gms.ads.internal.formats.client.IOnMediaContentChangedListener");
                }
                rh.f(parcel);
                je0 je0Var = this.f22213a;
                if (je0Var.r() instanceof t30) {
                    t30 t30Var = (t30) je0Var.r();
                    synchronized (t30Var.f20140b) {
                        t30Var.f20151n = mpVar;
                        break;
                    }
                }
                parcel2.writeNoException();
                return true;
            case 10:
                boolean zZzl = zzl();
                parcel2.writeNoException();
                ClassLoader classLoader2 = rh.f19590a;
                parcel2.writeInt(zZzl ? 1 : 0);
                return true;
            default:
                return false;
        }
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final float zze() {
        float f10;
        t0 t0VarZzN;
        int i10;
        int i11;
        float f11;
        je0 je0Var = this.f22213a;
        synchronized (je0Var) {
            f10 = je0Var.f16072x;
        }
        if (f10 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            synchronized (je0Var) {
                f11 = je0Var.f16072x;
            }
            return f11;
        }
        if (je0Var.r() != null) {
            try {
                return je0Var.r().zzm();
            } catch (RemoteException e10) {
                int i12 = zze.zza;
                zzo.zzg("Remote exception getting video controller aspect ratio.", e10);
                return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            }
        }
        s9.a aVar = this.f22214b;
        if (aVar != null) {
            return x1(aVar);
        }
        if (((Boolean) zzba.zzc().a(am.f12072ae)).booleanValue() && je0Var.i() != null && (t0VarZzN = je0Var.i().zzN()) != null && (i10 = t0VarZzN.f20105c) >= 0 && (i11 = t0VarZzN.f20104b) > 0) {
            return i10 / i11;
        }
        mo moVarB = je0Var.b();
        if (moVarB == null) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
        float fZze = (moVarB.zze() == -1 || moVarB.zzf() == -1) ? 0.0f : moVarB.zze() / moVarB.zzf();
        return fZze == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? x1(moVarB.zzb()) : fZze;
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final void zzf(s9.a aVar) {
        this.f22214b = aVar;
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final s9.a zzg() {
        s9.a aVar = this.f22214b;
        if (aVar != null) {
            return aVar;
        }
        mo moVarB = this.f22213a.b();
        if (moVarB == null) {
            return null;
        }
        return moVarB.zzb();
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final float zzh() {
        je0 je0Var = this.f22213a;
        return je0Var.r() != null ? je0Var.r().zzj() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final float zzi() {
        je0 je0Var = this.f22213a;
        return je0Var.r() != null ? je0Var.r().zzk() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final zzea zzj() {
        return this.f22213a.r();
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final boolean zzk() {
        return this.f22213a.r() != null;
    }

    @Override // com.google.android.gms.internal.ads.ko
    public final boolean zzl() {
        b30 b30Var;
        je0 je0Var = this.f22213a;
        synchronized (je0Var) {
            b30Var = je0Var.f16059j;
        }
        return b30Var != null;
    }
}
