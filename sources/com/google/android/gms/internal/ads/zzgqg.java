package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzgqg extends zzgqn {
    final /* synthetic */ zzgpo zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzgqg(zzgqp zzgqpVar, CharSequence charSequence, zzgpo zzgpoVar) {
        super(zzgqpVar, charSequence);
        this.zza = zzgpoVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgqn
    public final int zzc(int i2) {
        CharSequence charSequence = ((zzgqn) this).zzb;
        int length = charSequence.length();
        zzgqa.zzn(i2, length, "index");
        while (i2 < length) {
            if (this.zza.zzb(charSequence.charAt(i2))) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgqn
    public final int zzd(int i2) {
        return i2 + 1;
    }
}
