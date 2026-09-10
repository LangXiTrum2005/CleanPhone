package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzfwh extends zzfwn {
    private String zza;
    private byte zzb;
    private int zzc;
    private int zzd;

    public final zzfwn zza(String str) {
        this.zza = "";
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final zzfwn zzb(boolean z2) {
        this.zzb = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final zzfwo zzc() {
        if (this.zzb == 1 && this.zza != null && this.zzc != 0 && this.zzd != 0) {
            return new zzfwi(this.zza, false, this.zzc, null, this.zzd, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.zza == null) {
            sb.append(" fileOwner");
        }
        if (this.zzb == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.zzc == 0) {
            sb.append(" fileChecks");
        }
        if (this.zzd == 0) {
            sb.append(" filePurpose");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final zzfwn zzd(int i2) {
        this.zzc = i2;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfwn
    public final zzfwn zze(int i2) {
        this.zzd = 1;
        return this;
    }
}
