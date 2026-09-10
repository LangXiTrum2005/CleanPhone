package com.google.android.gms.internal.ads;

import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzari implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzark zzc;

    public zzari(zzark zzarkVar, String str, long j) {
        this.zza = str;
        this.zzb = j;
        Objects.requireNonNull(zzarkVar);
        this.zzc = zzarkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzark zzarkVar = this.zzc;
        zzarkVar.zzx().zza(this.zza, this.zzb);
        zzarkVar.zzx().zzb(zzarkVar.toString());
    }
}
