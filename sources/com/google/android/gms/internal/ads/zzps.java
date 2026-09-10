package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzps extends BroadcastReceiver {
    final /* synthetic */ zzpu zza;

    public /* synthetic */ zzps(zzpu zzpuVar, byte[] bArr) {
        Objects.requireNonNull(zzpuVar);
        this.zza = zzpuVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (isInitialStickyBroadcast()) {
            return;
        }
        zzpu zzpuVar = this.zza;
        zzpuVar.zzf(zzpp.zzb(context, intent, zzpuVar.zzj(), zzpuVar.zzh()));
    }
}
