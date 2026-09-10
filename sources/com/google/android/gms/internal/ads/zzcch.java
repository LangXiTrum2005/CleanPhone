package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.applovin.impl.Z;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcch extends zzbcb implements zzccj {
    public zzcch(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zze(IObjectWrapper iObjectWrapper, zzccn zzccnVar, zzccg zzccgVar) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zzc(parcelZza, zzccnVar);
        zzbcd.zze(parcelZza, zzccgVar);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzf(IObjectWrapper iObjectWrapper) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzg(List list, IObjectWrapper iObjectWrapper, zzbxn zzbxnVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzh(List list, IObjectWrapper iObjectWrapper, zzbxn zzbxnVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzi(zzbxq zzbxqVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzda(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzk(List list, IObjectWrapper iObjectWrapper, zzbxn zzbxnVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final void zzl(List list, IObjectWrapper iObjectWrapper, zzbxn zzbxnVar) throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzccj
    public final IObjectWrapper zzm(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, String str, IObjectWrapper iObjectWrapper3) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzbcd.zze(parcelZza, iObjectWrapper2);
        parcelZza.writeString(str);
        zzbcd.zze(parcelZza, iObjectWrapper3);
        return Z.j(zzcZ(11, parcelZza));
    }
}
