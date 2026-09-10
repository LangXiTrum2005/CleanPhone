package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/* JADX INFO: loaded from: classes4.dex */
final class zzgiz {
    private final zzatd zza;
    private final long zzb;
    private final long zzc;
    private final String zzd;

    private zzgiz(zzatd zzatdVar, long j, long j2, String str) {
        this.zza = zzatdVar;
        this.zzb = j;
        this.zzc = j2;
        this.zzd = str;
    }

    public static /* synthetic */ zzgiz zza(zzatd zzatdVar, byte[] bArr) throws zzatb, zzatf {
        zzatdVar.zza();
        zzatdVar.zzb(bArr);
        List list = (List) zzatdVar.zzc(Optional.empty());
        long jLongValue = ((Long) list.get(0)).longValue();
        long jLongValue2 = ((Long) list.get(1)).longValue();
        long jLongValue3 = ((Long) list.get(2)).longValue();
        zzatdVar.zzd(jLongValue, Optional.empty());
        return new zzgiz(zzatdVar, jLongValue2, jLongValue3, "3.815976881.".concat(zzgay.zza(zzatg.zza(), false)));
    }

    public final /* synthetic */ String zzb(Map map) {
        return zzgay.zza((byte[]) this.zza.zzd(this.zzb, Optional.of(map)), true);
    }

    public final /* synthetic */ void zzc(Map map) throws zzatb, zzatf {
        this.zza.zzd(this.zzc, Optional.of(map));
    }

    public final /* synthetic */ String zzd() {
        return this.zzd;
    }
}
