package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfso extends BroadcastReceiver {
    final /* synthetic */ zzfsp zza;

    public zzfso(zzfsp zzfspVar) {
        Objects.requireNonNull(zzfspVar);
        this.zza = zzfspVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF")) {
            zzfsp zzfspVar = this.zza;
            zzfspVar.zzd(true, zzfspVar.zzf());
            zzfspVar.zze(true);
        } else if (intent.getAction().equals("android.intent.action.SCREEN_ON")) {
            zzfsp zzfspVar2 = this.zza;
            zzfspVar2.zzd(false, zzfspVar2.zzf());
            zzfspVar2.zze(false);
        }
    }
}
