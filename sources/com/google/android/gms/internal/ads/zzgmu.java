package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class zzgmu extends BroadcastReceiver implements zzglz, zzgcb {
    private final Context zza;
    private final ExecutorService zzb;
    private boolean zzc = true;

    public zzgmu(Context context, ExecutorService executorService) {
        this.zza = context;
        this.zzb = executorService;
    }

    private final synchronized void zzg(boolean z2) {
        this.zzc = z2;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if ("android.intent.action.USER_PRESENT".equals(intent.getAction())) {
            zzg(true);
        } else if ("android.intent.action.SCREEN_OFF".equals(intent.getAction())) {
            zzg(false);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final ListenableFuture zza() {
        return zzgym.zzd(new Callable() { // from class: com.google.android.gms.internal.ads.zzgmt
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                this.zza.zzf();
                return null;
            }
        }, this.zzb);
    }

    @Override // com.google.android.gms.internal.ads.zzglz
    public final void zzb(Map map) {
        map.put("up", Boolean.valueOf(zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzglz
    public final void zzc(Map map, Context context, View view) {
        map.put("up", Boolean.valueOf(zze()));
    }

    @Override // com.google.android.gms.internal.ads.zzglz
    public final void zzd(Map map) {
        map.put("up", Boolean.valueOf(zze()));
    }

    public final synchronized boolean zze() {
        return this.zzc;
    }

    public final /* synthetic */ Void zzf() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        this.zza.registerReceiver(this, intentFilter);
        return null;
    }
}
