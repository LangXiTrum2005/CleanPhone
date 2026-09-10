package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Build;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfnr implements Runnable {
    public static Boolean zzb;
    private final Context zze;
    private final VersionInfoParcel zzf;
    private int zzi;
    private final zzdur zzj;
    private final List zzk;
    private final zzcld zzl;
    private final zzbzi zzn;
    public static final Object zza = new Object();
    private static final Object zzc = new Object();
    private static final Object zzd = new Object();
    private final zzfnv zzg = zzfny.zzb();
    private String zzh = "";
    private boolean zzm = false;

    public zzfnr(Context context, VersionInfoParcel versionInfoParcel, zzdur zzdurVar, zzegb zzegbVar, zzbzi zzbziVar, zzcld zzcldVar) {
        this.zze = context;
        this.zzf = versionInfoParcel;
        this.zzj = zzdurVar;
        this.zzn = zzbziVar;
        this.zzl = zzcldVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkb)).booleanValue()) {
            this.zzk = com.google.android.gms.ads.internal.util.zzs.zzk();
        } else {
            this.zzk = zzgtd.zzi();
        }
    }

    public static boolean zza() {
        boolean zBooleanValue;
        synchronized (zza) {
            try {
                if (zzb == null) {
                    if (((Boolean) zzbid.zzb.zze()).booleanValue()) {
                        zzb = Boolean.valueOf(Math.random() < ((Double) zzbid.zza.zze()).doubleValue());
                    } else {
                        zzb = Boolean.FALSE;
                    }
                }
                zBooleanValue = zzb.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArrZzaN;
        if (zza()) {
            Object obj = zzc;
            synchronized (obj) {
                try {
                    if (this.zzg.zza() == 0) {
                        return;
                    }
                    try {
                        synchronized (obj) {
                            zzfnv zzfnvVar = this.zzg;
                            bArrZzaN = ((zzfny) zzfnvVar.zzbu()).zzaN();
                            zzfnvVar.zzc();
                        }
                        new zzega(this.zze, this.zzf.afmaVersion, this.zzn, Binder.getCallingUid(), null).zza(new zzefy((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjV), 60000, new HashMap(), bArrZzaN, CommonGatewayClient.HEADER_PROTOBUF, false));
                    } catch (Exception e2) {
                        if ((e2 instanceof zzebr) && ((zzebr) e2).zza() == 3) {
                            return;
                        }
                        com.google.android.gms.ads.internal.zzt.zzh().zzh(e2, "CuiMonitor.sendCuiPing");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void zzb(final zzfnh zzfnhVar) {
        zzcdo.zza.submit(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfnq
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.zza.zzc(zzfnhVar);
            }
        });
    }

    public final /* synthetic */ void zzc(zzfnh zzfnhVar) {
        synchronized (zzd) {
            try {
                if (!this.zzm) {
                    this.zzm = true;
                    if (zza()) {
                        try {
                            com.google.android.gms.ads.internal.zzt.zzc();
                            this.zzh = com.google.android.gms.ads.internal.util.zzs.zzt(this.zze);
                        } catch (RemoteException | RuntimeException e2) {
                            com.google.android.gms.ads.internal.zzt.zzh().zzg(e2, "CuiMonitor.gettingAppIdFromManifest");
                        }
                        this.zzi = GoogleApiAvailabilityLight.getInstance().getApkVersion(this.zze);
                        int iIntValue = ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjW)).intValue();
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zznk)).booleanValue()) {
                            long j = iIntValue;
                            zzcdo.zzd.scheduleWithFixedDelay(this, j, j, TimeUnit.MILLISECONDS);
                        } else {
                            long j2 = iIntValue;
                            zzcdo.zzd.scheduleAtFixedRate(this, j2, j2, TimeUnit.MILLISECONDS);
                        }
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkc)).booleanValue()) {
                            this.zzl.zza();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zza() && zzfnhVar != null) {
            synchronized (zzc) {
                try {
                    zzfnv zzfnvVar = this.zzg;
                    if (zzfnvVar.zza() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjX)).intValue()) {
                        return;
                    }
                    zzfns zzfnsVarZza = zzfnu.zza();
                    zzfnsVarZza.zzv(zzfnhVar.zzm());
                    zzfnsVarZza.zza(zzfnhVar.zzb());
                    zzfnsVarZza.zzb(zzfnhVar.zza());
                    zzfnsVarZza.zzw(3);
                    zzfnsVarZza.zzd(this.zzf.afmaVersion);
                    zzfnsVarZza.zze(this.zzh);
                    zzfnsVarZza.zzf(Build.VERSION.RELEASE);
                    zzfnsVarZza.zzg(Build.VERSION.SDK_INT);
                    zzfnsVarZza.zzx(zzfnhVar.zzo());
                    zzfnsVarZza.zzi(zzfnhVar.zzc());
                    zzfnsVarZza.zzj(this.zzi);
                    zzfnsVarZza.zzy(zzfnhVar.zzn());
                    zzfnsVarZza.zzk(zzfnhVar.zzd());
                    zzfnsVarZza.zzl(zzfnhVar.zze());
                    zzfnsVarZza.zzm(zzfnhVar.zzf());
                    zzfnsVarZza.zzn(this.zzj.zzd(zzfnhVar.zzf()));
                    zzfnsVarZza.zzo(zzfnhVar.zzg());
                    zzfnsVarZza.zzs(zzfnhVar.zzh());
                    zzfnsVarZza.zzr(zzfnhVar.zzk());
                    zzfnsVarZza.zzp(zzfnhVar.zzi());
                    zzfnsVarZza.zzq(zzfnhVar.zzj());
                    zzfnsVarZza.zzc(zzfnhVar.zzl());
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkb)).booleanValue()) {
                        zzfnsVarZza.zzh(this.zzk);
                    }
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzkc)).booleanValue()) {
                        zzcld zzcldVar = this.zzl;
                        zzief zziefVarZzd = zzcldVar.zzd();
                        String strZzc = zzcldVar.zzc();
                        if (zziefVarZzd != null) {
                            zzfnsVarZza.zzt(zziefVarZzd);
                        }
                        if (strZzc != null) {
                            zzfnsVarZza.zzu(strZzc);
                        }
                    }
                    zzfnw zzfnwVarZza = zzfnx.zza();
                    zzfnwVarZza.zza(zzfnsVarZza);
                    zzfnvVar.zzb(zzfnwVarZza);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
