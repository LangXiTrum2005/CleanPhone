package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AI;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3888ke0;
import gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3950lJ;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class zzegx implements zzgbo {
    private final zzfgn zza;
    private final zzcvv zzb;
    private final zzfiv zzc;
    private final zzfja zzd;
    private final Executor zze;
    private final ScheduledExecutorService zzf;
    private final zzcrc zzg;
    private final zzegq zzh;
    private final zzedb zzi;
    private final Context zzj;
    private final zzfhh zzk;
    private final zzega zzl;
    private final zzdrq zzm;

    public zzegx(Context context, zzfgn zzfgnVar, zzegq zzegqVar, zzcvv zzcvvVar, zzfiv zzfivVar, zzfja zzfjaVar, zzcrc zzcrcVar, Executor executor, ScheduledExecutorService scheduledExecutorService, zzedb zzedbVar, zzfhh zzfhhVar, zzega zzegaVar, zzdrq zzdrqVar) {
        this.zzj = context;
        this.zza = zzfgnVar;
        this.zzh = zzegqVar;
        this.zzb = zzcvvVar;
        this.zzc = zzfivVar;
        this.zzd = zzfjaVar;
        this.zzg = zzcrcVar;
        this.zze = executor;
        this.zzf = scheduledExecutorService;
        this.zzi = zzedbVar;
        this.zzk = zzfhhVar;
        this.zzl = zzegaVar;
        this.zzm = zzdrqVar;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004c  */
    public static String zzc(zzfca zzfcaVar) {
        String strP = "No fill.";
        String str = true != ((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfw)).booleanValue() ? "No ad config." : "No fill.";
        int i = zzfcaVar.zzb.zzb.zzf;
        if (i == 0) {
            strP = str;
        } else if (i < 200 || i >= 300) {
            strP = (i < 300 || i >= 400) ? AbstractC3950lJ.p("Received error HTTP response code: ", i) : "No location header to follow redirect or too many redirects.";
        } else {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzfv)).booleanValue()) {
                strP = str;
            }
        }
        zzfbq zzfbqVar = zzfcaVar.zzb.zzb.zzj;
        return zzfbqVar != null ? zzfbqVar.zza() : strP;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:32:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e8 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgbo
    public final /* synthetic */ AI zza(Object obj) throws Exception {
        Iterator it;
        zzecw zzecwVarZza;
        int i;
        zzbvk zzbvkVar;
        Bundle bundle;
        final zzfca zzfcaVar = (zzfca) obj;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzck)).booleanValue() && (zzbvkVar = zzfcaVar.zzb.zzd) != null && (bundle = zzbvkVar.zzm) != null) {
            this.zzm.zza().putAll(bundle);
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzcl)).booleanValue()) {
            AbstractC3888ke0.o(this.zzm.zza(), zzdre.RENDERING_START.zza());
        }
        String strZzc = zzc(zzfcaVar);
        this.zzi.zzi(zzfcaVar.zzb.zzb);
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzih)).booleanValue() && (i = zzfcaVar.zzb.zzb.zzf) != 0 && (i < 200 || i >= 300)) {
            return zzgch.zzg(new zzegu(3, strZzc));
        }
        zzfbr zzfbrVar = zzfcaVar.zzb.zzb;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbe.zzc().zza(zzbcl.zzdH)).booleanValue()) {
            for (zzfbo zzfboVar : zzfcaVar.zzb.zza) {
                this.zzi.zzd(zzfboVar);
                it = zzfboVar.zza.iterator();
                while (true) {
                    if (it.hasNext()) {
                        this.zzi.zzf(zzfboVar, 0L, zzfdk.zzd(1, null, null));
                        break;
                        break;
                    }
                    zzecwVarZza = this.zzg.zza(zzfboVar.zzb, (String) it.next());
                    if (zzecwVarZza == null) {
                    }
                }
            }
        } else {
            String str = zzfbrVar.zzq;
            if (TextUtils.isEmpty(str)) {
                while (r0.hasNext()) {
                    this.zzi.zzd(zzfboVar);
                    it = zzfboVar.zza.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            this.zzi.zzf(zzfboVar, 0L, zzfdk.zzd(1, null, null));
                            break;
                        }
                        zzecwVarZza = this.zzg.zza(zzfboVar.zzb, (String) it.next());
                        if (zzecwVarZza == null && zzecwVarZza.zzb(zzfcaVar, zzfboVar)) {
                            break;
                        }
                    }
                }
            } else {
                this.zzi.zzh(str, zzfcaVar.zzb.zza);
            }
        }
        this.zzb.zzo(new zzcmo(zzfcaVar, this.zzd, this.zzc), this.zze);
        if (zzfcaVar.zzb.zzb.zzr > 1) {
            return this.zzl.zzb(zzfcaVar);
        }
        zzfft zzfftVarZza = zzffx.zzc(zzgch.zzg(new zzegu(3, zzc(zzfcaVar))), zzfgh.RENDER_CONFIG_INIT, this.zza).zza();
        this.zzh.zzl();
        int i2 = 0;
        for (final zzfbo zzfboVar2 : zzfcaVar.zzb.zza) {
            for (String str2 : zzfboVar2.zza) {
                final zzecw zzecwVarZza2 = this.zzg.zza(zzfboVar2.zzb, str2);
                if (zzecwVarZza2 != null && zzecwVarZza2.zzb(zzfcaVar, zzfboVar2)) {
                    zzfftVarZza = this.zza.zzb(zzfgh.RENDER_CONFIG_WATERFALL, zzfftVarZza).zzh("render-config-" + i2 + "-" + str2).zzc(Throwable.class, new zzgbo() { // from class: com.google.android.gms.internal.ads.zzegv
                        @Override // com.google.android.gms.internal.ads.zzgbo
                        public final AI zza(Object obj2) {
                            return this.zza.zzb(zzfboVar2, zzfcaVar, zzecwVarZza2, (Throwable) obj2);
                        }
                    }).zza();
                    break;
                }
            }
            i2++;
        }
        final zzegq zzegqVar = this.zzh;
        Objects.requireNonNull(zzegqVar);
        zzfftVarZza.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzegw
            @Override // java.lang.Runnable
            public final void run() {
                zzegqVar.zzj();
            }
        }, this.zze);
        return zzfftVarZza;
    }

    public final /* synthetic */ AI zzb(zzfbo zzfboVar, zzfca zzfcaVar, zzecw zzecwVar, Throwable th) throws Exception {
        zzfgw zzfgwVarZza = zzfgv.zza(this.zzj, 12);
        zzfgwVarZza.zzd(zzfboVar.zzE);
        zzfgwVarZza.zzi();
        AI aiZzo = zzgch.zzo(zzecwVar.zza(zzfcaVar, zzfboVar), zzfboVar.zzR, TimeUnit.MILLISECONDS, this.zzf);
        this.zzh.zzf(zzfcaVar, zzfboVar, aiZzo, this.zzc);
        zzfhg.zza(aiZzo, this.zzk, zzfgwVarZza);
        return aiZzo;
    }
}
