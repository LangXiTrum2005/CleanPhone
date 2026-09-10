package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzgqf extends zzgpy {
    private final Object zza;

    public zzgqf(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzgqf) {
            return this.zza.equals(((zzgqf) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        String string = this.zza.toString();
        return android.support.v4.media.a.s(new StringBuilder(string.length() + 13), "Optional.of(", string, ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgpy
    public final Object zza(Object obj) {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgpy
    public final zzgpy zzb(zzgpr zzgprVar) {
        Object objApply = zzgprVar.apply(this.zza);
        zzgqa.zzk(objApply, "the Function passed to Optional.transform() must not return null.");
        return new zzgqf(objApply);
    }
}
