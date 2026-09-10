package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzclg implements zzcpn {

    @Nullable
    private static zzclg zza;

    private static synchronized zzclg zzH(Context context, @Nullable zzbsz zzbszVar, int i2, boolean z2, int i3, zzcmr zzcmrVar) {
        try {
            zzclg zzclgVar = zza;
            if (zzclgVar != null) {
                return zzclgVar;
            }
            long jCurrentTimeMillis = com.google.android.gms.ads.internal.zzt.zzk().currentTimeMillis();
            zzbgk.zza(context);
            if (((Boolean) zzbic.zze.zze()).booleanValue()) {
                zzbfv.zza(context);
            }
            zzfjg zzfjgVarZza = zzfjg.zza(context);
            VersionInfoParcel versionInfoParcelZzb = zzfjgVarZza.zzb(ModuleDescriptor.MODULE_VERSION, false, i3);
            zzfjgVarZza.zzc(zzbszVar);
            zzcng zzcngVar = new zzcng(null);
            zzclh zzclhVar = new zzclh();
            zzclhVar.zza(versionInfoParcelZzb);
            zzclhVar.zzb(context);
            zzclhVar.zzc(jCurrentTimeMillis);
            zzcngVar.zza(new zzcli(zzclhVar, null));
            zzcngVar.zzb(new zzcod(zzcmrVar));
            zzclg zzclgVarZzc = zzcngVar.zzc();
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpf)).booleanValue()) {
                com.google.android.gms.ads.internal.zzt.zze().zza(zzflk.zzc(), zzclgVarZzc.zzD(), context);
                com.google.android.gms.ads.internal.zzt.zze().zzb();
            }
            ((zzebp) ((zzcmv) zzclgVarZzc).zzo.zzb()).zza();
            ((zzckz) ((zzcmv) zzclgVarZzc).zzn.zzb()).zza(context, versionInfoParcelZzb);
            com.google.android.gms.ads.internal.zzt.zzh().zze(context, versionInfoParcelZzb, zzclgVarZzc.zzD());
            com.google.android.gms.ads.internal.zzt.zzj().zza(context);
            com.google.android.gms.ads.internal.zzt.zzc().zzc(context);
            com.google.android.gms.ads.internal.zzt.zzc().zzd(context);
            com.google.android.gms.ads.internal.util.zzd.zza(context);
            com.google.android.gms.ads.internal.zzt.zzg().zza(context);
            com.google.android.gms.ads.internal.zzt.zzA().zza(context);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpB)).booleanValue()) {
                String str = (String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpC);
                if (!str.isEmpty()) {
                    if (Arrays.asList(str.split(",")).contains(context.getPackageName())) {
                        zzclgVarZzc.zzE().zza(com.google.android.gms.ads.internal.zzt.zzg());
                    }
                }
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpA)).booleanValue()) {
                    zzclgVarZzc.zzE().zza(com.google.android.gms.ads.internal.zzt.zzg());
                }
            }
            ((com.google.android.gms.ads.internal.util.zzbz) ((zzcmv) zzclgVarZzc).zzaq.zzb()).zza();
            zzcbx.zzb(context);
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzha)).booleanValue()) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzbc)).booleanValue()) {
                    new zzehi(context, versionInfoParcelZzb, new zzbfj(new zzbfo(context)), new zzegn(new zzegj(context), (zzgyw) ((zzcmv) zzclgVarZzc).zzd.zzb())).zza(com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpu)).booleanValue()) {
                zzclgVarZzc.zzg().zza();
            }
            zza = zzclgVarZzc;
            return zzclgVarZzc;
        } catch (Throwable th) {
            throw th;
        }
    }

    public static zzclg zza(Context context, @Nullable zzbsz zzbszVar, int i2) {
        return zzH(context, zzbszVar, ModuleDescriptor.MODULE_VERSION, false, i2, new zzcmr());
    }

    public abstract zzdyv zzA();

    public abstract zzfja zzB();

    public abstract zzebh zzC();

    public abstract zzdxe zzD();

    public abstract zzdum zzE();

    @Override // com.google.android.gms.internal.ads.zzcpn
    public final zzccq zzF() {
        return zzG();
    }

    public abstract zzccq zzG();

    public abstract Executor zzb();

    public abstract ScheduledExecutorService zzc();

    public abstract zzddl zzd();

    public abstract zzcoo zze();

    public abstract zzfqb zzf();

    public abstract zzeeu zzg();

    public abstract zzeew zzh();

    public abstract zzcug zzi();

    public abstract zzfeh zzj();

    public abstract zzcsp zzk();

    public abstract zzfcu zzl();

    public abstract zzdky zzm();

    public abstract zzffx zzn();

    public abstract zzdlu zzo();

    public abstract zzdti zzp();

    public abstract zzfhk zzq();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzab zzr();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzau zzs();

    public abstract com.google.android.gms.ads.nonagon.signalgeneration.zzv zzt();

    public abstract zzeif zzu();

    public abstract zzfjj zzv();

    public abstract zzeak zzw();

    public abstract zzfnr zzx();

    @Override // com.google.android.gms.internal.ads.zzcpn
    public final zzfaz zzy(zzbza zzbzaVar, int i2) {
        return zzz(new zzfcc(zzbzaVar, i2));
    }

    public abstract zzfaz zzz(zzfcc zzfccVar);
}
