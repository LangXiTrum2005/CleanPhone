package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeoi implements zzejg {
    private final zzeji zza;
    private final zzejm zzb;
    private final zzfmu zzc;
    private final zzgyw zzd;

    public zzeoi(zzfmu zzfmuVar, zzgyw zzgywVar, zzeji zzejiVar, zzejm zzejmVar) {
        this.zzc = zzfmuVar;
        this.zzd = zzgywVar;
        this.zzb = zzejmVar;
        this.zza = zzejiVar;
    }

    public static final String zze(String str, int i2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 20 + String.valueOf(i2).length());
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i2);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final boolean zza(zzfic zzficVar, zzfhr zzfhrVar) {
        return !zzfhrVar.zzt.isEmpty();
    }

    @Override // com.google.android.gms.internal.ads.zzejg
    public final ListenableFuture zzb(final zzfic zzficVar, final zzfhr zzfhrVar) {
        final zzejj zzejjVarZza;
        Iterator it = zzfhrVar.zzt.iterator();
        while (true) {
            if (!it.hasNext()) {
                zzejjVarZza = null;
                break;
            }
            try {
                zzejjVarZza = this.zza.zza((String) it.next(), zzfhrVar.zzv);
                break;
            } catch (zzfir unused) {
            }
        }
        if (zzejjVarZza == null) {
            return zzgym.zzc(new zzelz("Unable to instantiate mediation adapter class."));
        }
        zzcdt zzcdtVar = new zzcdt();
        zzejjVarZza.zzc.zza(new zzeof(this, zzejjVarZza, zzcdtVar));
        if (zzfhrVar.zzM) {
            Bundle bundle = zzficVar.zza.zza.zzd.zzm;
            Bundle bundle2 = bundle.getBundle(AdMobAdapter.class.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(AdMobAdapter.class.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        zzfmu zzfmuVar = this.zzc;
        zzfmo zzfmoVar = zzfmo.ADAPTER_LOAD_AD_SYN;
        Objects.requireNonNull(zzfmuVar);
        return zzfmf.zzd(new zzfma() { // from class: com.google.android.gms.internal.ads.zzeoh
            @Override // com.google.android.gms.internal.ads.zzfma
            public final /* synthetic */ void zza() throws zzfir {
                this.zza.zzc(zzficVar, zzfhrVar, zzejjVarZza);
            }
        }, this.zzd, zzfmoVar, zzfmuVar).zzj(zzfmo.ADAPTER_LOAD_AD_ACK).zze(zzcdtVar).zzj(zzfmo.ADAPTER_WRAP_ADAPTER).zzb(new zzflu() { // from class: com.google.android.gms.internal.ads.zzeog
            @Override // com.google.android.gms.internal.ads.zzflu
            public final /* synthetic */ Object zza(Object obj) {
                return this.zza.zzd(zzficVar, zzfhrVar, zzejjVarZza, (Void) obj);
            }
        }).zzi();
    }

    public final /* synthetic */ void zzc(zzfic zzficVar, zzfhr zzfhrVar, zzejj zzejjVar) throws zzfir {
        this.zzb.zza(zzficVar, zzfhrVar, zzejjVar);
    }

    public final /* synthetic */ Object zzd(zzfic zzficVar, zzfhr zzfhrVar, zzejj zzejjVar, Void r4) {
        return this.zzb.zzb(zzficVar, zzfhrVar, zzejjVar);
    }
}
