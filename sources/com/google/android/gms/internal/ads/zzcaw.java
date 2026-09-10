package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcaw extends zzcab {
    private final String zza;
    private final int zzb;

    public zzcaw(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final String zze() throws RemoteException {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzcac
    public final int zzf() throws RemoteException {
        return this.zzb;
    }

    public zzcaw(String str, int i2) {
        this.zza = str;
        this.zzb = i2;
    }
}
