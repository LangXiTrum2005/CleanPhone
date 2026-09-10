package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzbcf extends zzbcc implements zzbcg {
    public static zzbcg zzb(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return iInterfaceQueryLocalInterface instanceof zzbcg ? (zzbcg) iInterfaceQueryLocalInterface : new zzbce(iBinder);
    }
}
