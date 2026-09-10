package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.common.util.concurrent.ListenableFuture;

/* JADX INFO: loaded from: classes4.dex */
public final class zzeyk implements zzezx {
    private final ApplicationInfo zza;
    private final PackageInfo zzb;
    private final Context zzc;

    public zzeyk(ApplicationInfo applicationInfo, PackageInfo packageInfo, Context context) {
        this.zza = applicationInfo;
        this.zzb = packageInfo;
        this.zzc = context;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0077  */
    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        String strValueOf;
        String installingPackageName;
        String initiatingPackageName;
        String str = this.zza.packageName;
        PackageInfo packageInfo = this.zzb;
        String str2 = null;
        Integer numValueOf = packageInfo == null ? null : Integer.valueOf(packageInfo.versionCode);
        String str3 = packageInfo == null ? null : packageInfo.versionName;
        try {
            Context context = this.zzc;
            zzfxl zzfxlVar = com.google.android.gms.ads.internal.util.zzs.zza;
            strValueOf = String.valueOf(Wrappers.packageManager(context).getApplicationLabel(str));
        } catch (PackageManager.NameNotFoundException unused) {
            strValueOf = null;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbgk.zzof)).booleanValue()) {
                try {
                    InstallSourceInfo installSourceInfo = this.zzc.getPackageManager().getInstallSourceInfo(str);
                    if (installSourceInfo != null) {
                        installingPackageName = installSourceInfo.getInstallingPackageName();
                        try {
                            if (TextUtils.isEmpty(installingPackageName)) {
                                com.google.android.gms.ads.internal.util.zze.zza("No installing package name found");
                                installingPackageName = null;
                            }
                            initiatingPackageName = installSourceInfo.getInitiatingPackageName();
                            try {
                                if (TextUtils.isEmpty(initiatingPackageName)) {
                                    com.google.android.gms.ads.internal.util.zze.zza("No initiating package name found");
                                    initiatingPackageName = str2;
                                }
                            } catch (PackageManager.NameNotFoundException e2) {
                                e = e2;
                                str2 = initiatingPackageName;
                                com.google.android.gms.ads.internal.zzt.zzh().zzg(e, "PackageInfoSignalSource.getInstallSourceInfo");
                            }
                        } catch (PackageManager.NameNotFoundException e3) {
                            e = e3;
                        }
                    } else {
                        installingPackageName = null;
                        initiatingPackageName = null;
                    }
                } catch (PackageManager.NameNotFoundException e4) {
                    e = e4;
                    installingPackageName = null;
                }
            } else {
                installingPackageName = null;
                initiatingPackageName = null;
            }
        } else {
            installingPackageName = null;
            initiatingPackageName = null;
        }
        return zzgym.zza(new zzeyl(str, numValueOf, str3, strValueOf, installingPackageName, initiatingPackageName));
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 29;
    }
}
