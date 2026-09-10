package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfxw extends zziar implements zzicd {
    private static final zzfxw zzb;
    private static volatile zzick zzc;
    private zzibw zza = zzibw.zza();

    static {
        zzfxw zzfxwVar = new zzfxw();
        zzb = zzfxwVar;
        zziar.zzbu(zzfxw.class, zzfxwVar);
    }

    private zzfxw() {
    }

    public static zzfxw zzc(InputStream inputStream) throws IOException {
        return (zzfxw) zziar.zzbW(zzb, inputStream);
    }

    public static zzfxw zzd() {
        return zzb;
    }

    public final int zza() {
        return this.zza.size();
    }

    public final Map zzb() {
        return Collections.unmodifiableMap(this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zziar
    public final Object zzdc(zziaq zziaqVar, Object obj, Object obj2) {
        zzick zziamVar;
        int iOrdinal = zziaqVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return zziar.zzbv(zzb, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"zza", zzfxv.zza});
        }
        if (iOrdinal == 3) {
            return new zzfxw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new zzfxu(bArr);
        }
        if (iOrdinal == 5) {
            return zzb;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        zzick zzickVar = zzc;
        if (zzickVar != null) {
            return zzickVar;
        }
        synchronized (zzfxw.class) {
            try {
                zziamVar = zzc;
                if (zziamVar == null) {
                    zziamVar = new zziam(zzb);
                    zzc = zziamVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zziamVar;
    }

    public final /* synthetic */ Map zze() {
        if (!this.zza.zze()) {
            this.zza = this.zza.zzc();
        }
        return this.zza;
    }
}
