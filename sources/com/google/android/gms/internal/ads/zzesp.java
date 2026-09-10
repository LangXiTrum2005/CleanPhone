package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class zzesp implements zzezx {
    private final zzgyw zza;
    private final zzduu zzb;
    private final zzdzp zzc;
    private final zzesr zzd;

    public zzesp(zzgyw zzgywVar, zzduu zzduuVar, zzdzp zzdzpVar, zzesr zzesrVar) {
        this.zza = zzgywVar;
        this.zzb = zzduuVar;
        this.zzc = zzdzpVar;
        this.zzd = zzesrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        zzbgb zzbgbVar = zzbgk.zzmX;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue()) {
            zzesr zzesrVar = this.zzd;
            if (zzesrVar.zzd() != null) {
                zzesq zzesqVarZzd = zzesrVar.zzd();
                zzesqVarZzd.getClass();
                return zzgym.zza(zzesqVarZzd);
            }
        }
        if (zzgqr.zzc((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbV)) || (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgbVar)).booleanValue() && (this.zzd.zzb() || !this.zzc.zze()))) {
            return zzgym.zza(new zzesq(new Bundle()));
        }
        this.zzd.zza(true);
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeso
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 1;
    }

    public final /* synthetic */ zzesq zzc() {
        List<String> listAsList = Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbV)).split(";"));
        Bundle bundle = new Bundle();
        for (String str : listAsList) {
            try {
                zzfji zzfjiVarZza = this.zzb.zza(str, new JSONObject());
                zzfjiVarZza.zzn();
                boolean zZze = this.zzc.zze();
                Bundle bundle2 = new Bundle();
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmX)).booleanValue() || zZze) {
                    try {
                        zzbvn zzbvnVarZzC = zzfjiVarZza.zzC();
                        if (zzbvnVarZzC != null) {
                            bundle2.putString(com.smartdigimkt.b0.a.s1, zzbvnVarZzC.toString());
                        }
                    } catch (zzfir unused) {
                    }
                }
                try {
                    zzbvn zzbvnVarZzB = zzfjiVarZza.zzB();
                    if (zzbvnVarZzB != null) {
                        bundle2.putString("adapter_version", zzbvnVarZzB.toString());
                    }
                } catch (zzfir unused2) {
                }
                bundle.putBundle(str, bundle2);
            } catch (zzfir unused3) {
            }
        }
        zzesq zzesqVar = new zzesq(bundle);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzmX)).booleanValue()) {
            this.zzd.zzc(zzesqVar);
        }
        return zzesqVar;
    }
}
