package com.google.android.gms.internal.common;

/* JADX INFO: loaded from: classes4.dex */
abstract class zzv extends zzk {
    final CharSequence zzb;
    final zzp zzc;
    final boolean zzd;
    int zze = 0;
    int zzf = Integer.MAX_VALUE;

    public zzv(zzw zzwVar, CharSequence charSequence) {
        this.zzc = zzwVar.zzf();
        this.zzd = zzwVar.zzg();
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.common.zzk
    public final /* bridge */ /* synthetic */ Object zza() {
        int iZzd;
        int i2 = this.zze;
        while (true) {
            int i3 = this.zze;
            if (i3 == -1) {
                zzb();
                return null;
            }
            int iZzc = zzc(i3);
            if (iZzc == -1) {
                iZzc = this.zzb.length();
                this.zze = -1;
                iZzd = -1;
            } else {
                iZzd = zzd(iZzc);
                this.zze = iZzd;
            }
            if (iZzd == i2) {
                int i4 = iZzd + 1;
                this.zze = i4;
                if (i4 > this.zzb.length()) {
                    this.zze = -1;
                }
            } else {
                if (i2 < iZzc) {
                    this.zzb.charAt(i2);
                }
                if (i2 < iZzc) {
                    this.zzb.charAt(iZzc - 1);
                }
                if (!this.zzd || i2 != iZzc) {
                    int i5 = this.zzf;
                    if (i5 == 1) {
                        CharSequence charSequence = this.zzb;
                        int length = charSequence.length();
                        this.zze = -1;
                        if (length > i2) {
                            charSequence.charAt(length - 1);
                        }
                        iZzc = length;
                    } else {
                        this.zzf = i5 - 1;
                    }
                    return this.zzb.subSequence(i2, iZzc).toString();
                }
                i2 = this.zze;
            }
        }
    }

    public abstract int zzc(int i2);

    public abstract int zzd(int i2);
}
