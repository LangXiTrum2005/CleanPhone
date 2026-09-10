package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
final class zzgpt extends zzgpq implements Serializable {
    private final Pattern zza;

    public zzgpt(Pattern pattern) {
        pattern.getClass();
        this.zza = pattern;
    }

    public final String toString() {
        return this.zza.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgpq
    public final zzgpp zza(CharSequence charSequence) {
        return new zzgps(this.zza.matcher(charSequence));
    }
}
