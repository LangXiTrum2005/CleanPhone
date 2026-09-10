package com.google.android.gms.internal.ads;

/* JADX INFO: loaded from: classes4.dex */
final class zzhhl {
    final zzhhk zza;
    final long[] zzb;

    public zzhhl(zzhhk zzhhkVar, long[] jArr) {
        this.zza = zzhhkVar;
        this.zzb = jArr;
    }

    public static /* synthetic */ zzhhl zza(zzhhl zzhhlVar, zzhhj zzhhjVar) {
        zzb(zzhhlVar, zzhhjVar);
        return zzhhlVar;
    }

    private static zzhhl zzb(zzhhl zzhhlVar, zzhhj zzhhjVar) {
        zzhhk zzhhkVar = zzhhjVar.zza;
        zzhhk zzhhkVar2 = zzhhlVar.zza;
        long[] jArr = zzhhkVar2.zza;
        long[] jArr2 = zzhhkVar.zza;
        long[] jArr3 = zzhhjVar.zzb;
        zzhht.zze(jArr, jArr2, jArr3);
        long[] jArr4 = zzhhkVar2.zzb;
        long[] jArr5 = zzhhkVar.zzb;
        long[] jArr6 = zzhhkVar.zzc;
        zzhht.zze(jArr4, jArr5, jArr6);
        zzhht.zze(zzhhkVar2.zzc, jArr6, jArr3);
        zzhht.zze(zzhhlVar.zzb, jArr2, jArr5);
        return zzhhlVar;
    }

    public zzhhl() {
        this(new zzhhk(), new long[10]);
    }

    public zzhhl(zzhhj zzhhjVar) {
        this();
        zzb(this, zzhhjVar);
    }
}
