package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfkl implements zzfkj {
    private final String zza;

    public zzfkl(String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.ads.zzfkj
    public final boolean equals(Object obj) {
        if (obj instanceof zzfkl) {
            return this.zza.equals(((zzfkl) obj).zza);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfkj
    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza;
    }
}
