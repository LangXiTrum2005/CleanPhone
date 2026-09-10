package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class zzfn implements zzfu {
    private final zzfu[] zza;

    public zzfn(zzfu... zzfuVarArr) {
        this.zza = zzfuVarArr;
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final zzft zzb(Class cls) {
        zzfu[] zzfuVarArr = this.zza;
        for (int i2 = 0; i2 < 2; i2++) {
            zzfu zzfuVar = zzfuVarArr[i2];
            if (zzfuVar.zzc(cls)) {
                return zzfuVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.auth.zzfu
    public final boolean zzc(Class cls) {
        zzfu[] zzfuVarArr = this.zza;
        for (int i2 = 0; i2 < 2; i2++) {
            if (zzfuVarArr[i2].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
