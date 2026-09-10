package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class zzbhj extends CustomTabsServiceConnection {
    public static final /* synthetic */ int zza = 0;
    private final AtomicBoolean zzb = new AtomicBoolean(false);
    private Context zzc;
    private zzdxe zzd;
    private CustomTabsSession zze;
    private CustomTabsClient zzf;

    private final void zzf(Context context) {
        String strC;
        if (this.zzf != null || context == null || (strC = CustomTabsClient.c(context, null, false)) == null || strC.equals(context.getPackageName())) {
            return;
        }
        CustomTabsClient.a(context, strC, this);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(ComponentName componentName, CustomTabsClient customTabsClient) {
        this.zzf = customTabsClient;
        customTabsClient.e();
        this.zze = customTabsClient.d(new zzbhg(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.zzf = null;
        this.zze = null;
    }

    public final void zza(Context context, zzdxe zzdxeVar) {
        if (this.zzb.getAndSet(true)) {
            return;
        }
        this.zzc = context;
        this.zzd = zzdxeVar;
        zzf(context);
    }

    public final CustomTabsSession zzb() {
        if (this.zze == null) {
            zzcdo.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbhi
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzd();
                }
            });
        }
        return this.zze;
    }

    public final void zzc(final int i2) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzfw)).booleanValue() || this.zzd == null) {
            return;
        }
        zzcdo.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzbhh
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zze(i2);
            }
        });
    }

    public final /* synthetic */ void zzd() {
        zzf(this.zzc);
    }

    public final /* synthetic */ void zze(int i2) {
        zzdxe zzdxeVar = this.zzd;
        if (zzdxeVar != null) {
            zzdxd zzdxdVarZza = zzdxeVar.zza();
            zzdxdVarZza.zzc("action", "cct_nav");
            zzdxdVarZza.zzc("cct_navs", String.valueOf(i2));
            zzdxdVarZza.zzd();
        }
    }
}
