package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzdyg extends zzdyk {
    private final long zza;
    private final int zzb;

    public /* synthetic */ zzdyg(long j, int i2, byte[] bArr) {
        this.zza = j;
        this.zzb = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdyk) {
            zzdyk zzdykVar = (zzdyk) obj;
            if (this.zza == zzdykVar.zza() && this.zzb == zzdykVar.zzb()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.zza;
        return ((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.zzb;
    }

    public final String toString() {
        long j = this.zza;
        int length = String.valueOf(j).length();
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder(length + 34 + String.valueOf(i2).length() + 1);
        androidx.datastore.preferences.protobuf.a.A(sb, "OnDeviceStorageKey{id=", j, ", eventType=");
        return android.support.v4.media.a.i(i2, "}", sb);
    }

    @Override // com.google.android.gms.internal.ads.zzdyk
    public final long zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzdyk
    public final int zzb() {
        return this.zzb;
    }
}
