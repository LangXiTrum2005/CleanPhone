package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.provider.Settings;
import com.google.android.gms.internal.ads.cn;
import com.google.android.gms.internal.ads.l00;
import com.google.android.gms.internal.ads.v71;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class zzd {
    public static void zza(Context context) {
        Object obj = com.google.android.gms.ads.internal.util.client.zzl.f10988b;
        if (((Boolean) cn.f13212a.o()).booleanValue()) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "development_settings_enabled", 0) == 0 || com.google.android.gms.ads.internal.util.client.zzl.zzi()) {
                    return;
                }
                ListenableFuture listenableFutureZzb = new zzc(context).zzb();
                int i10 = zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Updating ad debug logging enablement.");
                v71.j(listenableFutureZzb, "AdDebugLogUpdater.updateEnablement", l00.f16615h);
            } catch (Exception e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Fail to determine debug setting.", e10);
            }
        }
    }
}
