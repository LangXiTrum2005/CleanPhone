package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes3.dex */
final class zzfut extends zzfva {
    final /* synthetic */ zzfty zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfut(zzfuu zzfuuVar, zzfvc zzfvcVar, CharSequence charSequence, zzfty zzftyVar) {
        super(zzfvcVar, charSequence);
        this.zza = zzftyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfva
    public final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfva
    public final int zzd(int i) {
        CharSequence charSequence = ((zzfva) this).zzb;
        int length = charSequence.length();
        zzfun.zzb(i, length, "index");
        while (i < length) {
            if (this.zza.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
