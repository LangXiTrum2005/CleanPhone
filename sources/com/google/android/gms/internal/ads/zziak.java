package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zziak implements zzica {
    private static final zziak zza = new zziak();

    private zziak() {
    }

    public static zziak zza() {
        return zza;
    }

    @Override // com.google.android.gms.internal.ads.zzica
    public final boolean zzb(Class cls) {
        return zziar.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.ads.zzica
    public final zzibz zzc(Class cls) {
        if (!zziar.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (zzibz) zziar.zzbt(cls.asSubclass(zziar.class)).zzbs();
        } catch (Exception e2) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e2);
        }
    }
}
