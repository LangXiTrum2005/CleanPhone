package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: loaded from: classes4.dex */
public final class zzcap implements RewardItem {
    private final zzcac zza;

    public zzcap(zzcac zzcacVar) {
        this.zza = zzcacVar;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        zzcac zzcacVar = this.zza;
        if (zzcacVar != null) {
            try {
                return zzcacVar.zzf();
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not forward getAmount to RewardItem", e2);
            }
        }
        return 0;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        zzcac zzcacVar = this.zza;
        if (zzcacVar != null) {
            try {
                return zzcacVar.zze();
            } catch (RemoteException e2) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not forward getType to RewardItem", e2);
            }
        }
        return null;
    }
}
