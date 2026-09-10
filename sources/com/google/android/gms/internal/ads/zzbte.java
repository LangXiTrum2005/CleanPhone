package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbte extends zzbcc implements zzbtf {
    public zzbte() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public static zzbtf zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
        return iInterfaceQueryLocalInterface instanceof zzbtf ? (zzbtf) iInterfaceQueryLocalInterface : new zzbtd(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        switch (i2) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                int i4 = parcel.readInt();
                zzbcd.zzh(parcel);
                zzg(i4);
                break;
            case 4:
                zzh();
                break;
            case 5:
                zzi();
                break;
            case 6:
                zzj();
                break;
            case 7:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    boolean z2 = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationResponseMetadata") instanceof zzbtj;
                }
                zzbcd.zzh(parcel);
                break;
            case 8:
                zzk();
                break;
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                zzbcd.zzh(parcel);
                zzl(string, string2);
                break;
            case 10:
                zzbkr.zzb(parcel.readStrongBinder());
                parcel.readString();
                zzbcd.zzh(parcel);
                break;
            case 11:
                zzn();
                break;
            case 12:
                parcel.readString();
                zzbcd.zzh(parcel);
                break;
            case 13:
                zzo();
                break;
            case 14:
                zzbzy zzbzyVar = (zzbzy) zzbcd.zzb(parcel, zzbzy.CREATOR);
                zzbcd.zzh(parcel);
                zzp(zzbzyVar);
                break;
            case 15:
                zzq();
                break;
            case 16:
                zzcac zzcacVarZzb = zzcab.zzb(parcel.readStrongBinder());
                zzbcd.zzh(parcel);
                zzr(zzcacVarZzb);
                break;
            case 17:
                int i5 = parcel.readInt();
                zzbcd.zzh(parcel);
                zzs(i5);
                break;
            case 18:
                zzt();
                break;
            case 19:
                zzbcd.zzh(parcel);
                break;
            case 20:
                zzu();
                break;
            case 21:
                String string3 = parcel.readString();
                zzbcd.zzh(parcel);
                zzv(string3);
                break;
            case 22:
                int i6 = parcel.readInt();
                String string4 = parcel.readString();
                zzbcd.zzh(parcel);
                zzw(i6, string4);
                break;
            case 23:
                com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzbcd.zzh(parcel);
                zzx(zzeVar);
                break;
            case 24:
                com.google.android.gms.ads.internal.client.zze zzeVar2 = (com.google.android.gms.ads.internal.client.zze) zzbcd.zzb(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
                zzbcd.zzh(parcel);
                zzy(zzeVar2);
                break;
            case 25:
                zzz();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
