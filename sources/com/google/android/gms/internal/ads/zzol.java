package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
final class zzol extends BroadcastReceiver {
    final /* synthetic */ zzon zza;

    public /* synthetic */ zzol(zzon zzonVar, zzom zzomVar) {
        this.zza = zzonVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        zzon zzonVar = this.zza;
        zzonVar.zzj(zzoi.zzd(context, intent, zzonVar.zzh, zzonVar.zzg));
    }
}
