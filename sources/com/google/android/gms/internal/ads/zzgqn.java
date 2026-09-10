package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzgqn extends zzgpi {
    final CharSequence zzb;
    int zzc = 0;
    int zzd = Integer.MAX_VALUE;

    public zzgqn(zzgqp zzgqpVar, CharSequence charSequence) {
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzgpi
    public final /* bridge */ /* synthetic */ Object zza() {
        int iZzd;
        int i2 = this.zzc;
        while (true) {
            int i3 = this.zzc;
            if (i3 == -1) {
                zzb();
                return null;
            }
            int iZzc = zzc(i3);
            if (iZzc == -1) {
                iZzc = this.zzb.length();
                this.zzc = -1;
                iZzd = -1;
            } else {
                iZzd = zzd(iZzc);
                this.zzc = iZzd;
            }
            if (iZzd != i2) {
                if (i2 < iZzc) {
                    this.zzb.charAt(i2);
                }
                if (i2 < iZzc) {
                    this.zzb.charAt(iZzc - 1);
                }
                int i4 = this.zzd;
                if (i4 == 1) {
                    CharSequence charSequence = this.zzb;
                    int length = charSequence.length();
                    this.zzc = -1;
                    if (length > i2) {
                        charSequence.charAt(length - 1);
                    }
                    iZzc = length;
                } else {
                    this.zzd = i4 - 1;
                }
                return this.zzb.subSequence(i2, iZzc).toString();
            }
            int i5 = iZzd + 1;
            this.zzc = i5;
            if (i5 > this.zzb.length()) {
                this.zzc = -1;
            }
        }
    }

    public abstract int zzc(int i2);

    public abstract int zzd(int i2);
}
