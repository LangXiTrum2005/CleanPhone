package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgni extends zzbcc implements zzgnj {
    public zzgni() {
        super("com.google.android.play.core.lmd.protocol.ILmdOverlayServiceListener");
    }

    @Override // com.google.android.gms.internal.ads.zzbcc
    public final boolean zzdd(int i2, Parcel parcel, Parcel parcel2, int i3) throws RemoteException {
        if (i2 != 1) {
            return false;
        }
        Bundle bundle = (Bundle) zzbcd.zzb(parcel, Bundle.CREATOR);
        zzbcd.zzh(parcel);
        zzb(bundle);
        return true;
    }
}
