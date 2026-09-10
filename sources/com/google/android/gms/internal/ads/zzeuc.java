package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import com.applovin.sdk.AppLovinEventTypes;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeuc implements zzezx {
    private final zzgyw zza;
    private final Context zzb;

    public zzeuc(zzgyw zzgywVar, Context context) {
        this.zza = zzgywVar;
        this.zzb = context;
    }

    private final Intent zzd() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        return (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmr)).booleanValue() || Build.VERSION.SDK_INT < 33) ? this.zzb.registerReceiver(null, intentFilter) : this.zzb.registerReceiver(null, intentFilter, 4);
    }

    private static final boolean zze(Intent intent) {
        if (intent == null) {
            return false;
        }
        int intExtra = intent.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeub
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 14;
    }

    public final /* synthetic */ zzeud zzc() {
        double intExtra;
        boolean zIsCharging;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznr)).booleanValue()) {
            BatteryManager batteryManager = (BatteryManager) this.zzb.getSystemService("batterymanager");
            intExtra = batteryManager != null ? ((double) batteryManager.getIntProperty(4)) / 100.0d : -1.0d;
            zIsCharging = batteryManager != null ? batteryManager.isCharging() : zze(zzd());
        } else {
            Intent intentZzd = zzd();
            boolean zZze = zze(intentZzd);
            intExtra = intentZzd != null ? ((double) intentZzd.getIntExtra(AppLovinEventTypes.USER_COMPLETED_LEVEL, -1)) / ((double) intentZzd.getIntExtra("scale", -1)) : -1.0d;
            zIsCharging = zZze;
        }
        return new zzeud(intExtra, zIsCharging);
    }
}
