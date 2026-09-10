package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdmu extends zzbju {
    private final zzdnm zza;
    private IObjectWrapper zzb;

    public zzdmu(zzdnm zzdnmVar) {
        this.zza = zzdnmVar;
    }

    private static float zzb(IObjectWrapper iObjectWrapper) {
        Drawable drawable;
        if (iObjectWrapper == null || (drawable = (Drawable) ObjectWrapper.unwrap(iObjectWrapper)) == null || drawable.getIntrinsicWidth() == -1 || drawable.getIntrinsicHeight() == -1) {
            return 0.0f;
        }
        return drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
    }

    @Override // com.google.android.gms.internal.ads.zzbjv
    public final float zze() throws RemoteException {
        zzclb zzclbVarZzN;
        int i2;
        int i3;
        zzdnm zzdnmVar = this.zza;
        if (zzdnmVar.zzab() != 0.0f) {
            return zzdnmVar.zzab();
        }
        if (zzdnmVar.zzy() != null) {
            try {
                return zzdnmVar.zzy().zzm();
            } catch (RemoteException e2) {
                int i4 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("Remote exception getting video controller aspect ratio.", e2);
                return 0.0f;
            }
        }
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return zzb(iObjectWrapper);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznJ)).booleanValue() && zzdnmVar.zzU() != null && (zzclbVarZzN = zzdnmVar.zzU().zzN()) != null && (i2 = zzclbVarZzN.zzb) >= 0 && (i3 = zzclbVarZzN.zza) > 0) {
            return i2 / i3;
        }
        zzbjy zzbjyVarZzD = zzdnmVar.zzD();
        if (zzbjyVarZzD == null) {
            return 0.0f;
        }
        float fZze = (zzbjyVarZzD.zze() == -1 || zzbjyVarZzD.zzf() == -1) ? 0.0f : zzbjyVarZzD.zze() / zzbjyVarZzD.zzf();
        return fZze == 0.0f ? zzb(zzbjyVarZzD.zzb()) : fZze;
    }

    @Override // com.google.android.gms.internal.ads.zzbjv
    public final void zzf(IObjectWrapper iObjectWrapper) {
        this.zzb = iObjectWrapper;
    }

    @Override // com.google.android.gms.internal.ads.zzbjv
    public final IObjectWrapper zzg() throws RemoteException {
        IObjectWrapper iObjectWrapper = this.zzb;
        if (iObjectWrapper != null) {
            return iObjectWrapper;
        }
        zzbjy zzbjyVarZzD = this.zza.zzD();
        if (zzbjyVarZzD == null) {
            return null;
        }
        return zzbjyVarZzD.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzbjv
    public final float zzh() throws RemoteException {
        zzdnm zzdnmVar = this.zza;
        if (zzdnmVar.zzy() != null) {
            return zzdnmVar.zzy().zzj();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbjv
    public final float zzi() throws RemoteException {
        zzdnm zzdnmVar = this.zza;
        if (zzdnmVar.zzy() != null) {
            return zzdnmVar.zzy().zzk();
        }
        return 0.0f;
    }

    @Override // com.google.android.gms.internal.ads.zzbjv
    public final com.google.android.gms.ads.internal.client.zzed zzj() throws RemoteException {
        return this.zza.zzy();
    }

    @Override // com.google.android.gms.internal.ads.zzbjv
    public final boolean zzk() throws RemoteException {
        return this.zza.zzy() != null;
    }

    @Override // com.google.android.gms.internal.ads.zzbjv
    public final boolean zzl() throws RemoteException {
        return this.zza.zzV();
    }

    @Override // com.google.android.gms.internal.ads.zzbjv
    public final void zzm(zzblg zzblgVar) {
        zzdnm zzdnmVar = this.zza;
        if (zzdnmVar.zzy() instanceof zzcjx) {
            ((zzcjx) zzdnmVar.zzy()).zzv(zzblgVar);
        }
    }
}
