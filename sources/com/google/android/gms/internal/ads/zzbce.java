package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbce extends zzbcb implements zzbcg {
    public zzbce(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final void zze(IObjectWrapper iObjectWrapper, String str) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        parcelZza.writeString("GMA_SDK");
        zzda(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final void zzf() throws RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final void zzg(int[] iArr) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeIntArray(null);
        zzda(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final void zzh(byte[] bArr) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeByteArray(bArr);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final void zzi(int i2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(0);
        zzda(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbcg
    public final void zzj(int i2) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i2);
        zzda(7, parcelZza);
    }
}
