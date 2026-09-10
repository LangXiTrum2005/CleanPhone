package com.google.android.gms.internal.ads;

import com.p004ironsource.mediationsdk.logger.IronSourceError;

/* JADX INFO: loaded from: classes4.dex */
public final class zzahq implements zzao {
    public final long zza;

    public zzahq(long j) {
        this.zza = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && zzahq.class == obj.getClass() && this.zza == ((zzahq) obj).zza;
    }

    public final int hashCode() {
        return Long.hashCode(this.zza) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
    }

    public final String toString() {
        long j = this.zza;
        return androidx.media3.extractor.text.ttml.a.k(j, "ThumbnailMetadata: presentationTimeUs=", new StringBuilder(String.valueOf(j).length() + 38));
    }
}
