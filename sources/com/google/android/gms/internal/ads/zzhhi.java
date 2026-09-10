package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzhhi extends zzhhh {
    private final long[] zzd;

    public zzhhi() {
        super(new long[10], new long[10], new long[10]);
        this.zzd = new long[10];
    }

    @Override // com.google.android.gms.internal.ads.zzhhh
    public final void zza(long[] jArr, long[] jArr2) {
        zzhht.zze(jArr, jArr2, this.zzd);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzhhi(zzhhl zzhhlVar) {
        super(new long[10], new long[10], new long[10]);
        long[] jArr = new long[10];
        this.zzd = jArr;
        long[] jArr2 = this.zza;
        zzhhk zzhhkVar = zzhhlVar.zza;
        zzhht.zza(jArr2, zzhhkVar.zzb, zzhhkVar.zza);
        long[] jArr3 = this.zzb;
        zzhhk zzhhkVar2 = zzhhlVar.zza;
        zzhht.zzb(jArr3, zzhhkVar2.zzb, zzhhkVar2.zza);
        System.arraycopy(zzhhlVar.zza.zzc, 0, jArr, 0, 10);
        zzhht.zze(this.zzc, zzhhlVar.zzb, zzhho.zzb);
    }
}
