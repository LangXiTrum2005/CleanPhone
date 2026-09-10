package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzibs implements zzica {
    private final zzica[] zza;

    public zzibs(zzica... zzicaVarArr) {
        this.zza = zzicaVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zzica
    public final boolean zzb(Class cls) {
        for (int i2 = 0; i2 < 2; i2++) {
            if (this.zza[i2].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzica
    public final zzibz zzc(Class cls) {
        for (int i2 = 0; i2 < 2; i2++) {
            zzica zzicaVar = this.zza[i2];
            if (zzicaVar.zzb(cls)) {
                return zzicaVar.zzc(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
