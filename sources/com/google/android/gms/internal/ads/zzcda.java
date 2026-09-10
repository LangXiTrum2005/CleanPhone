package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzcda {
    private final Object zza = new Object();
    private final com.google.android.gms.ads.internal.util.zzj zzb;
    private final zzcdf zzc;
    private boolean zzd;
    private Context zze;
    private VersionInfoParcel zzf;
    private String zzg;
    private zzbgp zzh;
    private zzdxe zzi;
    private Boolean zzj;
    private final AtomicInteger zzk;
    private final AtomicInteger zzl;
    private final zzccz zzm;
    private final Object zzn;
    private ListenableFuture zzo;
    private final AtomicBoolean zzp;

    public zzcda() {
        com.google.android.gms.ads.internal.util.zzj zzjVar = new com.google.android.gms.ads.internal.util.zzj();
        this.zzb = zzjVar;
        this.zzc = new zzcdf(com.google.android.gms.ads.internal.client.zzbb.zzf(), zzjVar);
        this.zzd = false;
        this.zzh = null;
        this.zzi = null;
        this.zzj = null;
        this.zzk = new AtomicInteger(0);
        this.zzl = new AtomicInteger(0);
        this.zzm = new zzccz(null);
        this.zzn = new Object();
        this.zzp = new AtomicBoolean();
    }

    public final /* synthetic */ VersionInfoParcel zzA() {
        return this.zzf;
    }

    public final /* synthetic */ zzbgp zzB() {
        return this.zzh;
    }

    public final /* synthetic */ AtomicBoolean zzC() {
        return this.zzp;
    }

    public final zzbgp zza() {
        zzbgp zzbgpVar;
        synchronized (this.zza) {
            zzbgpVar = this.zzh;
        }
        return zzbgpVar;
    }

    public final void zzb(Boolean bool) {
        synchronized (this.zza) {
            this.zzj = bool;
        }
    }

    public final Boolean zzc() {
        Boolean bool;
        synchronized (this.zza) {
            bool = this.zzj;
        }
        return bool;
    }

    public final void zzd() {
        this.zzm.zza();
    }

    public final void zze(Context context, VersionInfoParcel versionInfoParcel, zzdxe zzdxeVar) {
        zzbgp zzbgpVar;
        synchronized (this.zza) {
            try {
                if (!this.zzd) {
                    this.zze = context.getApplicationContext();
                    this.zzf = versionInfoParcel;
                    com.google.android.gms.ads.internal.zzt.zzg().zzb(this.zzc);
                    this.zzb.zza(this.zze);
                    zzbxv.zzb(this.zze, this.zzf);
                    this.zzi = zzdxeVar;
                    com.google.android.gms.ads.internal.zzt.zzm();
                    if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzcB)).booleanValue()) {
                        zzbgpVar = new zzbgp();
                    } else {
                        com.google.android.gms.ads.internal.util.zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        zzbgpVar = null;
                    }
                    this.zzh = zzbgpVar;
                    if (zzbgpVar != null) {
                        zzcdr.zza(new zzccw(this).zzb(), "AppState.registerCsiReporter");
                    }
                    Context context2 = this.zze;
                    if (PlatformVersion.isAtLeastO()) {
                        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjE)).booleanValue()) {
                            try {
                                ((ConnectivityManager) context2.getSystemService("connectivity")).registerDefaultNetworkCallback(new zzccx(this));
                            } catch (RuntimeException e2) {
                                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                                com.google.android.gms.ads.internal.util.client.zzo.zzj("Failed to register network callback", e2);
                                this.zzp.set(true);
                            }
                        }
                    }
                    this.zzd = true;
                    zzq();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzpm)).booleanValue()) {
            return;
        }
        com.google.android.gms.ads.internal.zzt.zzc().zze(context, versionInfoParcel.afmaVersion);
    }

    public final Resources zzf() {
        if (this.zzf.isClientJar) {
            return this.zze.getResources();
        }
        try {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzml)).booleanValue()) {
                return com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zze).getResources();
            }
            com.google.android.gms.ads.internal.util.client.zzs.zzb(this.zze).getResources();
            return null;
        } catch (com.google.android.gms.ads.internal.util.client.zzr e2) {
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Cannot load resource from dynamite apk or local jar", e2);
            return null;
        }
    }

    public final void zzg(Throwable th, String str) {
        zzbxv.zzb(this.zze, this.zzf).zzh(th, str);
    }

    public final void zzh(Throwable th, String str) {
        zzbxv.zzb(this.zze, this.zzf).zzi(th, str, ((Double) zzbit.zzf.zze()).floatValue());
    }

    public final void zzi(Throwable th, String str) {
        zzbxv.zzd(this.zze, this.zzf).zzh(th, str);
    }

    public final void zzj() {
        this.zzk.incrementAndGet();
    }

    public final void zzk() {
        this.zzk.decrementAndGet();
    }

    public final int zzl() {
        return this.zzk.get();
    }

    public final void zzm() {
        this.zzl.incrementAndGet();
    }

    public final int zzn() {
        return this.zzl.get();
    }

    public final com.google.android.gms.ads.internal.util.zzg zzo() {
        com.google.android.gms.ads.internal.util.zzj zzjVar;
        synchronized (this.zza) {
            zzjVar = this.zzb;
        }
        return zzjVar;
    }

    public final Context zzp() {
        return this.zze;
    }

    public final ListenableFuture zzq() {
        if (this.zze != null) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzdH)).booleanValue()) {
                synchronized (this.zzn) {
                    try {
                        ListenableFuture listenableFuture = this.zzo;
                        if (listenableFuture != null) {
                            return listenableFuture;
                        }
                        ListenableFuture listenableFutureSubmit = zzcdo.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzccy
                            @Override // java.util.concurrent.Callable
                            public final /* synthetic */ Object call() {
                                return this.zza.zzx();
                            }
                        });
                        this.zzo = listenableFutureSubmit;
                        return listenableFutureSubmit;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return zzgym.zza(new ArrayList());
    }

    public final zzcdf zzr() {
        return this.zzc;
    }

    public final boolean zzs(Context context) {
        if (PlatformVersion.isAtLeastO()) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzjE)).booleanValue()) {
                return this.zzp.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void zzt(String str) {
        this.zzg = str;
    }

    public final String zzu() {
        return this.zzg;
    }

    public final zzdxe zzv() {
        return this.zzi;
    }

    public final ActivityManager.MemoryInfo zzw() {
        return com.google.android.gms.ads.internal.util.client.zzf.zze(this.zze);
    }

    public final /* synthetic */ ArrayList zzx() {
        Context contextZza = zzbzk.zza(this.zze);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfo = Wrappers.packageManager(contextZza).getPackageInfo(contextZza.getApplicationInfo().packageName, 4096);
            if (packageInfo.requestedPermissions != null && packageInfo.requestedPermissionsFlags != null) {
                int i2 = 0;
                while (true) {
                    String[] strArr = packageInfo.requestedPermissions;
                    if (i2 >= strArr.length) {
                        break;
                    }
                    if ((packageInfo.requestedPermissionsFlags[i2] & 2) != 0) {
                        arrayList.add(strArr[i2]);
                    }
                    i2++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final /* synthetic */ Object zzy() {
        return this.zza;
    }

    public final /* synthetic */ Context zzz() {
        return this.zze;
    }
}
