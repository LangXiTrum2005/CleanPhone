package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdFormat;
import java.util.Locale;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class zzfqk {
    private final String zza;
    private final AdFormat zzb;
    private final String zzc;

    public /* synthetic */ zzfqk(zzfqj zzfqjVar, byte[] bArr) {
        this.zza = zzfqjVar.zzb();
        this.zzb = zzfqjVar.zzc();
        this.zzc = zzfqjVar.zzd();
    }

    public final boolean equals(Object obj) {
        AdFormat adFormat;
        AdFormat adFormat2;
        if (obj instanceof zzfqk) {
            zzfqk zzfqkVar = (zzfqk) obj;
            if (this.zza.equals(zzfqkVar.zza) && (adFormat = this.zzb) != null && (adFormat2 = zzfqkVar.zzb) != null && adFormat.equals(adFormat2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.zza, this.zzb);
    }

    public final String zza() {
        return this.zza;
    }

    public final String zzb() {
        AdFormat adFormat = this.zzb;
        return adFormat == null ? "unknown" : adFormat.name().toLowerCase(Locale.ENGLISH);
    }

    public final String zzc() {
        return this.zzc;
    }
}
