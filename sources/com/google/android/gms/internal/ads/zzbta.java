package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.Z;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbta extends zzbcb implements zzbtc {
    public zzbta(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapter");
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzA(boolean z2) throws RemoteException {
        Parcel parcelZza = zza();
        int i2 = zzbcd.zza;
        parcelZza.writeInt(z2 ? 1 : 0);
        zzda(25, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final com.google.android.gms.ads.internal.client.zzed zzB() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(26, zza());
        com.google.android.gms.ads.internal.client.zzed zzedVarZzb = com.google.android.gms.ads.internal.client.zzec.zzb(parcelZzcZ.readStrongBinder());
        parcelZzcZ.recycle();
        return zzedVarZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final zzbto zzC() throws RemoteException {
        zzbto zzbtmVar;
        Parcel parcelZzcZ = zzcZ(27, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbtmVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IUnifiedNativeAdMapper");
            zzbtmVar = iInterfaceQueryLocalInterface instanceof zzbto ? (zzbto) iInterfaceQueryLocalInterface : new zzbtm(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbtmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzD(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbtf zzbtfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zzc(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzbcd.zze(parcelZza, zzbtfVar);
        zzda(28, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzE(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzda(30, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzF(IObjectWrapper iObjectWrapper, zzbpq zzbpqVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zze(parcelZza, zzbpqVar);
        parcelZza.writeTypedList(list);
        zzda(31, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzG(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbtf zzbtfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zzc(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzbcd.zze(parcelZza, zzbtfVar);
        zzda(32, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final zzbvn zzH() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(33, zza());
        zzbvn zzbvnVar = (zzbvn) zzbcd.zzb(parcelZzcZ, zzbvn.CREATOR);
        parcelZzcZ.recycle();
        return zzbvnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final zzbvn zzI() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(34, zza());
        zzbvn zzbvnVar = (zzbvn) zzbcd.zzb(parcelZzcZ, zzbvn.CREATOR);
        parcelZzcZ.recycle();
        return zzbvnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzJ(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbtf zzbtfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zzc(parcelZza, zzrVar);
        zzbcd.zzc(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbcd.zze(parcelZza, zzbtfVar);
        zzda(35, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final zzbti zzK() throws RemoteException {
        zzbti zzbtgVar;
        Parcel parcelZzcZ = zzcZ(36, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbtgVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
            zzbtgVar = iInterfaceQueryLocalInterface instanceof zzbti ? (zzbti) iInterfaceQueryLocalInterface : new zzbtg(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbtgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzL(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzda(37, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzM(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbtf zzbtfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zzc(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzbcd.zze(parcelZza, zzbtfVar);
        zzda(38, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzN(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzda(39, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final zzbtk zzO() throws RemoteException {
        zzbtk zzbtkVar;
        Parcel parcelZzcZ = zzcZ(15, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbtkVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeAppInstallAdMapper");
            zzbtkVar = iInterfaceQueryLocalInterface instanceof zzbtk ? (zzbtk) iInterfaceQueryLocalInterface : new zzbtk(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbtkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final zzbtl zzP() throws RemoteException {
        zzbtl zzbtlVar;
        Parcel parcelZzcZ = zzcZ(16, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbtlVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.INativeContentAdMapper");
            zzbtlVar = iInterfaceQueryLocalInterface instanceof zzbtl ? (zzbtl) iInterfaceQueryLocalInterface : new zzbtl(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbtlVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zze(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbtf zzbtfVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final IObjectWrapper zzf() throws RemoteException {
        return Z.j(zzcZ(2, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzg(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbtf zzbtfVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzh() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzi() throws RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzj(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzr zzrVar, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbtf zzbtfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zzc(parcelZza, zzrVar);
        zzbcd.zzc(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbcd.zze(parcelZza, zzbtfVar);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzk(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbtf zzbtfVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zzc(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbcd.zze(parcelZza, zzbtfVar);
        zzda(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzl() throws RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzm() throws RemoteException {
        zzda(9, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzn(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, zzbzx zzbzxVar, String str2) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zzc(parcelZza, zzmVar);
        parcelZza.writeString(null);
        zzbcd.zze(parcelZza, zzbzxVar);
        parcelZza.writeString(str2);
        zzda(10, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzo(com.google.android.gms.ads.internal.client.zzm zzmVar, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, zzmVar);
        parcelZza.writeString(str);
        zzda(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzp() throws RemoteException {
        zzda(12, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final boolean zzq() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(13, zza());
        boolean zZza = zzbcd.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzr(IObjectWrapper iObjectWrapper, com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2, zzbtf zzbtfVar, zzbjn zzbjnVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zzc(parcelZza, zzmVar);
        parcelZza.writeString(str);
        parcelZza.writeString(str2);
        zzbcd.zze(parcelZza, zzbtfVar);
        zzbcd.zzc(parcelZza, zzbjnVar);
        parcelZza.writeStringList(list);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final Bundle zzs() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final Bundle zzt() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final Bundle zzu() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzv(com.google.android.gms.ads.internal.client.zzm zzmVar, String str, String str2) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzw(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzda(21, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final boolean zzx() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(22, zza());
        boolean zZza = zzbcd.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final void zzy(IObjectWrapper iObjectWrapper, zzbzx zzbzxVar, List list) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zze(parcelZza, zzbzxVar);
        parcelZza.writeStringList(list);
        zzda(23, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbtc
    public final zzbks zzz() throws RemoteException {
        throw null;
    }
}
