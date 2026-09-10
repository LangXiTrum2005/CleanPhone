package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
public final class zzijh implements zzijg, zzija {
    private static final zzijh zza = new zzijh(null);
    private final Object zzb;

    private zzijh(Object obj) {
        this.zzb = obj;
    }

    public static zzijg zza(Object obj) {
        zzijo.zza(obj, "instance cannot be null");
        return new zzijh(obj);
    }

    public static zzijg zzc(Object obj) {
        return obj == null ? zza : new zzijh(obj);
    }

    @Override // com.google.android.gms.internal.ads.zzijv, com.google.android.gms.internal.ads.zziju
    public final Object zzb() {
        return this.zzb;
    }
}
