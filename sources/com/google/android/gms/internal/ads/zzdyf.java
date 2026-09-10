package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzdyf extends zzdyj {
    private long zza;
    private int zzb;
    private byte zzc;

    @Override // com.google.android.gms.internal.ads.zzdyj
    public final zzdyj zza(long j) {
        this.zza = j;
        this.zzc = (byte) (this.zzc | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdyj
    public final zzdyj zzb(int i2) {
        this.zzb = i2;
        this.zzc = (byte) (this.zzc | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdyj
    public final zzdyk zzc() {
        if (this.zzc == 3) {
            return new zzdyg(this.zza, this.zzb, null);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.zzc & 1) == 0) {
            sb.append(" id");
        }
        if ((this.zzc & 2) == 0) {
            sb.append(" eventType");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
