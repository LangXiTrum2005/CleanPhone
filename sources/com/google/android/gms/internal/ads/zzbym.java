package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbym extends zzbcc implements zzbyn {
    public zzbym() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        zzbyr zzbypVar = null;
        zzbys zzbysVar = null;
        zzbyr zzbypVar2 = null;
        zzbyr zzbypVar3 = null;
        zzbyr zzbypVar4 = null;
        switch (i2) {
            case 1:
                zzbcd.zzh(parcel);
                parcel2.writeNoException();
                zzbcd.zzd(parcel2, null);
                return true;
            case 2:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    boolean z2 = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener") instanceof zzbyo;
                }
                zzbcd.zzh(parcel);
                parcel2.writeNoException();
                return true;
            case 3:
            default:
                return false;
            case 4:
                zzbza zzbzaVar = (zzbza) zzbcd.zzb(parcel, zzbza.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbypVar = iInterfaceQueryLocalInterface instanceof zzbyr ? (zzbyr) iInterfaceQueryLocalInterface : new zzbyp(strongBinder2);
                }
                zzbcd.zzh(parcel);
                zze(zzbzaVar, zzbypVar);
                parcel2.writeNoException();
                return true;
            case 5:
                zzbza zzbzaVar2 = (zzbza) zzbcd.zzb(parcel, zzbza.CREATOR);
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbypVar4 = iInterfaceQueryLocalInterface2 instanceof zzbyr ? (zzbyr) iInterfaceQueryLocalInterface2 : new zzbyp(strongBinder3);
                }
                zzbcd.zzh(parcel);
                zzf(zzbzaVar2, zzbypVar4);
                parcel2.writeNoException();
                return true;
            case 6:
                zzbza zzbzaVar3 = (zzbza) zzbcd.zzb(parcel, zzbza.CREATOR);
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbypVar3 = iInterfaceQueryLocalInterface3 instanceof zzbyr ? (zzbyr) iInterfaceQueryLocalInterface3 : new zzbyp(strongBinder4);
                }
                zzbcd.zzh(parcel);
                zzg(zzbzaVar3, zzbypVar3);
                parcel2.writeNoException();
                return true;
            case 7:
                String string = parcel.readString();
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                    zzbypVar2 = iInterfaceQueryLocalInterface4 instanceof zzbyr ? (zzbyr) iInterfaceQueryLocalInterface4 : new zzbyp(strongBinder5);
                }
                zzbcd.zzh(parcel);
                zzh(string, zzbypVar2);
                parcel2.writeNoException();
                return true;
            case 8:
                zzbyj zzbyjVar = (zzbyj) zzbcd.zzb(parcel, zzbyj.CREATOR);
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.request.ITrustlessTokenListener");
                    zzbysVar = iInterfaceQueryLocalInterface5 instanceof zzbys ? (zzbys) iInterfaceQueryLocalInterface5 : new zzbys(strongBinder6);
                }
                zzbcd.zzh(parcel);
                zzj(zzbyjVar, zzbysVar);
                parcel2.writeNoException();
                return true;
            case 9:
                String string2 = parcel.readString();
                zzbcd.zzh(parcel);
                zzi(string2);
                parcel2.writeNoException();
                return true;
        }
    }
}
