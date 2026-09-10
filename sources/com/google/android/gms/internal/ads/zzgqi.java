package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzgqi extends zzgqn {
    public zzgqi(zzgqp zzgqpVar, CharSequence charSequence, int i2) {
        super(zzgqpVar, charSequence);
    }

    @Override // com.google.android.gms.internal.ads.zzgqn
    public final int zzc(int i2) {
        int i3 = i2 + 4000;
        if (i3 < ((zzgqn) this).zzb.length()) {
            return i3;
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.zzgqn
    public final int zzd(int i2) {
        return i2;
    }
}
