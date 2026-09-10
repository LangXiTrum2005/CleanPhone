package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbgo extends zzaya implements zzbgq {
    public zzbgo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final com.google.android.gms.ads.internal.client.zzeb zze() throws RemoteException {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final zzbft zzf() throws RemoteException {
        zzbft zzbfrVar;
        Parcel parcelZzcZ = zzcZ(16, zza());
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbfrVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IMediaContent");
            zzbfrVar = iInterfaceQueryLocalInterface instanceof zzbft ? (zzbft) iInterfaceQueryLocalInterface : new zzbfr(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbfrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final zzbfw zzg(String str) throws RemoteException {
        zzbfw zzbfuVar;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(2, parcelZza);
        IBinder strongBinder = parcelZzcZ.readStrongBinder();
        if (strongBinder == null) {
            zzbfuVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
            zzbfuVar = iInterfaceQueryLocalInterface instanceof zzbfw ? (zzbfw) iInterfaceQueryLocalInterface : new zzbfu(strongBinder);
        }
        parcelZzcZ.recycle();
        return zzbfuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final IObjectWrapper zzh() throws RemoteException {
        return AbstractC3888ke0.e(zzcZ(9, zza()));
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final String zzi() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(4, zza());
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final String zzj(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        Parcel parcelZzcZ = zzcZ(1, parcelZza);
        String string = parcelZzcZ.readString();
        parcelZzcZ.recycle();
        return string;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final List zzk() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(3, zza());
        ArrayList<String> arrayListCreateStringArrayList = parcelZzcZ.createStringArrayList();
        parcelZzcZ.recycle();
        return arrayListCreateStringArrayList;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzl() throws RemoteException {
        zzda(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzm() throws RemoteException {
        zzda(15, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzn(String str) throws RemoteException {
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzda(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzo() throws RemoteException {
        zzda(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final void zzp(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        zzda(14, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzq() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(12, zza());
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzr(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzcZ = zzcZ(17, parcelZza);
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzs(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza = zza();
        zzayc.zzf(parcelZza, iObjectWrapper);
        Parcel parcelZzcZ = zzcZ(10, parcelZza);
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }

    @Override // com.google.android.gms.internal.ads.zzbgq
    public final boolean zzt() throws RemoteException {
        Parcel parcelZzcZ = zzcZ(13, zza());
        boolean zZzg = zzayc.zzg(parcelZzcZ);
        parcelZzcZ.recycle();
        return zZzg;
    }
}
