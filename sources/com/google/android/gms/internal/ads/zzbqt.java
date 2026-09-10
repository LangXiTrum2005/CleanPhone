package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzbqt extends zzayb implements zzbqu {
    public zzbqt() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.google.android.gms.internal.ads.zzayb
    public final boolean zzdD(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 2) {
            zzg();
        } else if (i == 3) {
            String string = parcel.readString();
            zzayc.zzc(parcel);
            zze(string);
        } else {
            if (i != 4) {
                return false;
            }
            com.google.android.gms.ads.internal.client.zze zzeVar = (com.google.android.gms.ads.internal.client.zze) zzayc.zza(parcel, com.google.android.gms.ads.internal.client.zze.CREATOR);
            zzayc.zzc(parcel);
            zzf(zzeVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
