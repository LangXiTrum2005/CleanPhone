package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import androidx.browser.customtabs.CustomTabsClient;
import androidx.browser.customtabs.CustomTabsServiceConnection;
import androidx.browser.customtabs.CustomTabsSession;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
public final class zzbhl {
    private CustomTabsSession zza;
    private CustomTabsClient zzb;
    private CustomTabsServiceConnection zzc;
    private zzbhk zzd;

    public static boolean zza(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com"));
            ResolveInfo resolveInfoResolveActivity = packageManager.resolveActivity(intent, 0);
            List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(intent, 65536);
            if (listQueryIntentActivities != null && resolveInfoResolveActivity != null) {
                for (int i2 = 0; i2 < listQueryIntentActivities.size(); i2++) {
                    if (resolveInfoResolveActivity.activityInfo.name.equals(listQueryIntentActivities.get(i2).activityInfo.name)) {
                        return resolveInfoResolveActivity.activityInfo.packageName.equals(zzijw.zza(context));
                    }
                }
            }
        }
        return false;
    }

    public final void zzb(Activity activity) {
        CustomTabsServiceConnection customTabsServiceConnection = this.zzc;
        if (customTabsServiceConnection == null) {
            return;
        }
        activity.unbindService(customTabsServiceConnection);
        this.zzb = null;
        this.zza = null;
        this.zzc = null;
    }

    public final CustomTabsSession zzc() {
        CustomTabsClient customTabsClient = this.zzb;
        if (customTabsClient == null) {
            this.zza = null;
        } else if (this.zza == null) {
            this.zza = customTabsClient.d(null);
        }
        return this.zza;
    }

    public final void zzd(zzbhk zzbhkVar) {
        this.zzd = zzbhkVar;
    }

    public final void zze(Activity activity) {
        String strZza;
        if (this.zzb == null && (strZza = zzijw.zza(activity)) != null) {
            zzijx zzijxVar = new zzijx(this);
            this.zzc = zzijxVar;
            CustomTabsClient.a(activity, strZza, zzijxVar);
        }
    }

    public final void zzf(CustomTabsClient customTabsClient) {
        this.zzb = customTabsClient;
        customTabsClient.e();
        zzbhk zzbhkVar = this.zzd;
        if (zzbhkVar != null) {
            zzbhkVar.zza();
        }
    }

    public final void zzg() {
        this.zzb = null;
        this.zza = null;
    }
}
