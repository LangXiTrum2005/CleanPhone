package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgpo implements zzgqb {
    public static zzgpo zzc(char c2) {
        return new zzgpl(c2);
    }

    @Override // com.google.android.gms.internal.ads.zzgqb
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return zzb(((Character) obj).charValue());
    }

    public abstract boolean zzb(char c2);
}
