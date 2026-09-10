package com.google.android.gms.internal.fido;

/* JADX INFO: loaded from: classes4.dex */
final class zzar extends zzao {
    private final zzat zza;

    public zzar(zzat zzatVar, int i2) {
        super(zzatVar.size(), i2);
        this.zza = zzatVar;
    }

    @Override // com.google.android.gms.internal.fido.zzao
    public final Object zza(int i2) {
        return this.zza.get(i2);
    }
}
