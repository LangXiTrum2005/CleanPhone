package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import com.google.common.util.concurrent.ListenableFuture;
import com.smartdigimkt.o1.b;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public final class zzghs implements zzfvz {
    private final Context zza;
    private final zzglx zzb;
    private final String zzc;
    private final long zzd;
    private final long zze;

    public zzghs(Context context, zzgad zzgadVar, zzglx zzglxVar) {
        this.zza = context;
        this.zzc = zzgadVar.zzb();
        this.zzd = zzgadVar.zzj();
        this.zze = zzgadVar.zzk();
        this.zzb = zzglxVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void zza(Map map) {
        String strZzb;
        zzawp zzawpVar;
        map.put("v", this.zzc);
        map.put("t", new Throwable());
        try {
            ListenableFuture listenableFuture = (ListenableFuture) map.get("gs");
            strZzb = (listenableFuture == null || (Build.VERSION.SDK_INT >= 31 && !listenableFuture.isDone()) || (zzawpVar = (zzawp) listenableFuture.get(this.zzd, TimeUnit.MILLISECONDS)) == null || zzawpVar.zzb().length() <= 1) ? "E" : zzawpVar.zzb();
        } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused) {
        }
        if (strZzb.equals("E")) {
            try {
                ListenableFuture listenableFuture2 = (ListenableFuture) map.get(b.a3);
                if (listenableFuture2 != null) {
                    String str = (String) listenableFuture2.get(this.zze, TimeUnit.MILLISECONDS);
                    if (!zzgqr.zzc(str)) {
                        strZzb = str;
                    }
                }
            } catch (ClassCastException | InterruptedException | ExecutionException | TimeoutException unused2) {
            }
        }
        map.put("int", strZzb);
    }

    @Override // com.google.android.gms.internal.ads.zzfvz
    public final Map zzb() {
        Map mapZzb = this.zzb.zzb();
        zza(mapZzb);
        return mapZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzfvz
    public final Map zzc() {
        Map mapZzc = this.zzb.zzc(this.zza, null);
        zza(mapZzc);
        return mapZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfvz
    public final Map zzd() {
        Map mapZzd = this.zzb.zzd();
        zza(mapZzd);
        return mapZzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfvz
    public final Map zze() {
        HashMap map = new HashMap();
        map.put("t", new Throwable());
        return map;
    }
}
