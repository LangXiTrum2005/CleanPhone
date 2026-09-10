package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbww extends zzbcb implements zzbwy {
    public zzbww(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzH(int i2, String[] strArr, int[] iArr) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i2);
        parcelZza.writeStringArray(strArr);
        parcelZza.writeIntArray(iArr);
        zzda(15, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zze() throws RemoteException {
        zzda(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzf() throws RemoteException {
        zzda(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final boolean zzg() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(11, zza());
        boolean zZza = zzbcd.zza(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzh(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, bundle);
        zzda(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzi() throws RemoteException {
        zzda(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzj() throws RemoteException {
        zzda(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzk() throws RemoteException {
        zzda(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzl() throws RemoteException {
        zzda(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzm(int i2, int i3, Intent intent) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i2);
        parcelZza.writeInt(i3);
        zzbcd.zzc(parcelZza, intent);
        zzda(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzn(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zze(parcelZza, iObjectWrapper);
        zzda(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzo(Bundle bundle) throws RemoteException {
        Parcel parcelZza = zza();
        zzbcd.zzc(parcelZza, bundle);
        Parcel parcelZzcZ = zzcZ(6, parcelZza);
        if (parcelZzcZ.readInt() != 0) {
            bundle.readFromParcel(parcelZzcZ);
        }
        parcelZzcZ.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzp() throws RemoteException {
        zzda(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzq() throws RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbwy
    public final void zzs() throws RemoteException {
        zzda(9, zza());
    }
}
