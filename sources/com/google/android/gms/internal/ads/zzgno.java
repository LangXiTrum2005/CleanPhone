package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzgno extends zzgop {
    private int zza;
    private String zzb;
    private int zzc;
    private byte zzd;

    @Override // com.google.android.gms.internal.ads.zzgop
    public final zzgop zza(int i2) {
        this.zza = i2;
        this.zzd = (byte) (this.zzd | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgop
    public final zzgop zzb(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgop
    public final zzgop zzc(int i2) {
        this.zzc = i2;
        this.zzd = (byte) (this.zzd | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzgop
    public final zzgoq zzd() {
        if (this.zzd == 3) {
            return new zzgnp(this.zza, this.zzb, this.zzc, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.zzd & 1) == 0) {
            sb.append(" statusCode");
        }
        if ((this.zzd & 2) == 0) {
            sb.append(" uiMode");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
