package com.google.android.gms.internal.measurement;

import com.applovin.impl.Z;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class zznf {
    private final zzne zza;

    private zznf(zzot zzotVar, Object obj, zzot zzotVar2, Object obj2) {
        this.zza = new zzne(zzotVar, "", zzotVar2, "");
    }

    public static zznf zza(zzot zzotVar, Object obj, zzot zzotVar2, Object obj2) {
        return new zznf(zzotVar, "", zzotVar2, "");
    }

    public static void zzb(zzlm zzlmVar, zzne zzneVar, Object obj, Object obj2) throws IOException {
        zzlw.zzf(zzlmVar, zzneVar.zza, 1, obj);
        zzlw.zzf(zzlmVar, zzneVar.zzc, 2, obj2);
    }

    public static int zzc(zzne zzneVar, Object obj, Object obj2) {
        return zzlw.zzh(zzneVar.zza, 1, obj) + zzlw.zzh(zzneVar.zzc, 2, obj2);
    }

    public final int zzd(int i2, Object obj, Object obj2) {
        zzne zzneVar = this.zza;
        int iZzz = zzlm.zzz(i2 << 3);
        int iZzc = zzc(zzneVar, obj, obj2);
        return Z.B(iZzc, iZzc, iZzz);
    }

    public final zzne zze() {
        return this.zza;
    }
}
