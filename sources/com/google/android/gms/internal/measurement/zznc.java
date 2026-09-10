package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes4.dex */
final class zznc implements zznk {
    private final zznk[] zza;

    public zznc(zznk... zznkVarArr) {
        this.zza = zznkVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final boolean zzb(Class cls) {
        for (int i2 = 0; i2 < 2; i2++) {
            if (this.zza[i2].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.zznk
    public final zznj zzc(Class cls) {
        for (int i2 = 0; i2 < 2; i2++) {
            zznk zznkVar = this.zza[i2];
            if (zznkVar.zzb(cls)) {
                return zznkVar.zzc(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
