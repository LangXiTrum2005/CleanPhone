package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeyr implements zzezx {
    private final Context zza;
    private final zzgyw zzb;
    private final zzfik zzc;
    private final VersionInfoParcel zzd;

    public zzeyr(Context context, zzgyw zzgywVar, zzfik zzfikVar, VersionInfoParcel versionInfoParcel) {
        this.zza = context;
        this.zzb = zzgywVar;
        this.zzc = zzfikVar;
        this.zzd = versionInfoParcel;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return this.zzb.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzeyq
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 53;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0044 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x0046 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00f1, B:31:0x0115, B:33:0x0120, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:16:0x0058 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00f1, B:31:0x0115, B:33:0x0120, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x00bf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x00c1 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00f1, B:31:0x0115, B:33:0x0120, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00d3 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00f1, B:31:0x0115, B:33:0x0120, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x00f1 A[Catch: IOException -> 0x002d, TryCatch #0 {IOException -> 0x002d, blocks: (B:2:0x0000, B:4:0x0015, B:6:0x0027, B:11:0x0032, B:16:0x0058, B:17:0x007c, B:19:0x008e, B:21:0x00a4, B:23:0x00ad, B:28:0x00d3, B:30:0x00f1, B:31:0x0115, B:33:0x0120, B:26:0x00c1, B:14:0x0046), top: B:37:0x0000 }] */
    public final /* synthetic */ zzeys zzc() {
        zzfzf zzfzfVar;
        boolean z2;
        boolean zZze;
        zzfzk zzfzkVarZzh;
        zzfzg zzfzgVarZza;
        try {
            Context context = this.zza;
            boolean zZza = this.zzc.zza();
            zzfzf zzfzfVar2 = new zzfzf();
            zzfzf zzfzfVar3 = new zzfzf();
            boolean zZzc = true;
            if (zZza) {
                if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdT)).booleanValue()) {
                    return new zzeys(true);
                }
            }
            if (!zZza) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdP)).booleanValue()) {
                    zzfzfVar2 = zzfzj.zzh(context).zzi(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzea)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                } else if (zZza) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdR)).booleanValue()) {
                        zzfzfVar2 = zzfzj.zzh(context).zzi(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzea)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                    }
                }
            } else if (zZza) {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdR)).booleanValue()) {
                    zzfzfVar2 = zzfzj.zzh(context).zzi(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzea)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                }
            }
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdX)).booleanValue()) {
                if (this.zzd.clientJarVersion < ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdW)).intValue()) {
                    zzfzk.zzh(context).zzj();
                }
            }
            if (zZza) {
                if (zZza) {
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdS)).booleanValue()) {
                        zzfzkVarZzh = zzfzk.zzh(context);
                        zzfzgVarZza = zzfzg.zza(context);
                        if (this.zzd.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdW)).intValue()) {
                            zzfzfVar3 = zzfzkVarZzh.zzi(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeb)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                            zZzc = zzfzgVarZza.zzc();
                        }
                        zZze = zzfzgVarZza.zze();
                        zzfzfVar = zzfzfVar3;
                        z2 = zZzc;
                    }
                }
                zzfzfVar = zzfzfVar3;
                z2 = true;
                zZze = true;
            } else {
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdQ)).booleanValue()) {
                    zzfzkVarZzh = zzfzk.zzh(context);
                    zzfzgVarZza = zzfzg.zza(context);
                    if (this.zzd.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdW)).intValue()) {
                        zzfzfVar3 = zzfzkVarZzh.zzi(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeb)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                        zZzc = zzfzgVarZza.zzc();
                    }
                    zZze = zzfzgVarZza.zze();
                    zzfzfVar = zzfzfVar3;
                    z2 = zZzc;
                } else {
                    if (zZza) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdS)).booleanValue()) {
                            zzfzkVarZzh = zzfzk.zzh(context);
                            zzfzgVarZza = zzfzg.zza(context);
                            if (this.zzd.clientJarVersion >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdW)).intValue()) {
                                zzfzfVar3 = zzfzkVarZzh.zzi(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzeb)).longValue(), com.google.android.gms.ads.internal.zzt.zzh().zzo().zzx());
                                zZzc = zzfzgVarZza.zzc();
                            }
                            zZze = zzfzgVarZza.zze();
                            zzfzfVar = zzfzfVar3;
                            z2 = zZzc;
                        }
                    }
                    zzfzfVar = zzfzfVar3;
                    z2 = true;
                    zZze = true;
                }
            }
            return new zzeys(zzfzfVar2, zzfzfVar, z2, zZze, zZza);
        } catch (IOException e2) {
            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "PerAppIdSignal");
            return new zzeys(this.zzc.zza());
        }
    }
}
