package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbje {
    private final Context zza;

    public zzbje(Context context) {
        this.zza = context;
    }

    public final void zza(zzbyb zzbybVar) {
        try {
            ((zzbjf) com.google.android.gms.ads.internal.util.client.zzs.zza(this.zza, "com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy", zzbjd.zza)).zze(zzbybVar);
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Error calling setFlagsAccessedBeforeInitializedListener: ".concat(String.valueOf(e2.getMessage())));
        } catch (com.google.android.gms.ads.internal.util.client.zzr e3) {
            com.google.android.gms.ads.internal.util.client.zzo.zzi("Could not load com.google.android.gms.ads.flags.FlagRetrieverSupplierProxy:".concat(String.valueOf(e3.getMessage())));
        }
    }
}
