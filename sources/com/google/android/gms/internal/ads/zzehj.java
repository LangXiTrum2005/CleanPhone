package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes4.dex */
final class zzehj extends zzehm {
    private final String zza;
    private final String zzb;
    private final Drawable zzc;

    public zzehj(String str, String str2, Drawable drawable) {
        this.zza = str;
        if (str2 == null) {
            throw new NullPointerException("Null imageUrl");
        }
        this.zzb = str2;
        this.zzc = drawable;
    }

    public final boolean equals(Object obj) {
        Drawable drawable;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzehm) {
            zzehm zzehmVar = (zzehm) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzehmVar.zza()) : zzehmVar.zza() == null) {
                if (this.zzb.equals(zzehmVar.zzb()) && ((drawable = this.zzc) != null ? drawable.equals(zzehmVar.zzc()) : zzehmVar.zzc() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int iHashCode = (((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.zzb.hashCode();
        Drawable drawable = this.zzc;
        return (iHashCode * 1000003) ^ (drawable != null ? drawable.hashCode() : 0);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.zzc);
        String str = this.zza;
        int length = String.valueOf(str).length();
        int length2 = strValueOf.length();
        String str2 = this.zzb;
        StringBuilder sb = new StringBuilder(str2.length() + length + 42 + 7 + length2 + 1);
        androidx.media3.extractor.text.ttml.a.C(sb, "OfflineAdAssets{advertiserName=", str, ", imageUrl=", str2);
        return android.support.v4.media.a.s(sb, ", icon=", strValueOf, "}");
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final String zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final String zzb() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzehm
    public final Drawable zzc() {
        return this.zzc;
    }
}
