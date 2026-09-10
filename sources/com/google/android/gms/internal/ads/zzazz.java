package com.google.android.gms.internal.ads;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzazz extends BroadcastReceiver {
    final /* synthetic */ zzbaa zza;

    public zzazz(zzbaa zzbaaVar) {
        Objects.requireNonNull(zzbaaVar);
        this.zza = zzbaaVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.zza.zzd();
    }
}
