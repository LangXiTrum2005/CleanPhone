package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzgtb extends zzgra {
    private final zzgtd zza;

    public zzgtb(zzgtd zzgtdVar, int i2) {
        super(zzgtdVar.size(), i2);
        this.zza = zzgtdVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgra
    public final Object zza(int i2) {
        return this.zza.get(i2);
    }
}
