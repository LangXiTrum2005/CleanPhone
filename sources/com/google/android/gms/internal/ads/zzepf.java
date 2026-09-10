package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.concurrent.ConcurrentHashMap;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes4.dex */
public final class zzepf {
    private final ConcurrentHashMap zza = new ConcurrentHashMap();
    private final zzduu zzb;

    public zzepf(zzduu zzduuVar) {
        this.zzb = zzduuVar;
    }

    public final void zza(String str) {
        try {
            this.zza.put(str, this.zzb.zzb(str));
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.zze.zzb("Couldn't create RTB adapter : ", e2);
        }
    }

    @CheckForNull
    public final zzbuy zzb(String str) {
        ConcurrentHashMap concurrentHashMap = this.zza;
        if (concurrentHashMap.containsKey(str)) {
            return (zzbuy) concurrentHashMap.get(str);
        }
        return null;
    }
}
