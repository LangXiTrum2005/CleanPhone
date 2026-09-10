package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbqq extends zzayb implements zzbqr {
    public zzbqq() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            zzayc.zzc(parcel);
            zzg(iObjectWrapperAsInterface);
        } else if (i == 2) {
            String string = parcel.readString();
            zzayc.zzc(parcel);
            zze(string);
        } else if (i == 3) {
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzayc.zzc(parcel);
            zzf(zzeVar);
        } else {
            if (i != 4) {
                return false;
            }
            zzbpn zzbpnVarZzb = zzbpm.zzb(parcel.readStrongBinder());
            zzayc.zzc(parcel);
            zzh(zzbpnVarZzb);
        }
        parcel2.writeNoException();
        return true;
    }
}
