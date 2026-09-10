package com.google.android.gms.internal.ads;

import java.util.regex.Matcher;

/* JADX INFO: loaded from: classes4.dex */
final class zzgqh extends zzgqn {
    final /* synthetic */ zzgpp zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgqh(zzgqp zzgqpVar, CharSequence charSequence, zzgpp zzgppVar) {
        super(zzgqpVar, charSequence);
        this.zza = zzgppVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqn
    public final int zzc(int i2) {
        Matcher matcher = ((zzgps) this.zza).zza;
        if (matcher.find(i2)) {
            return matcher.start();
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgqn
    public final int zzd(int i2) {
        return ((zzgps) this.zza).zza.end();
    }
}
