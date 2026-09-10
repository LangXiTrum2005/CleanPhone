package com.google.android.gms.internal.ads;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzelq implements zzetq {
    public final Context zza;
    public final com.google.android.gms.ads.internal.client.zzs zzb;
    public final List zzc;

    public zzelq(Context context, com.google.android.gms.ads.internal.client.zzs zzsVar, List list) {
        this.zza = context;
        this.zzb = zzsVar;
        this.zzc = list;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        List<ActivityManager.RunningTaskInfo> runningTasks;
        ActivityManager.RunningTaskInfo runningTaskInfo;
        zzcuv zzcuvVar = (zzcuv) obj;
        if (((Boolean) zzbeo.zza.zze()).booleanValue()) {
            Bundle bundle = new Bundle();
            com.google.android.gms.ads.internal.zzv.zzq();
            String className = null;
            try {
                ActivityManager activityManager = (ActivityManager) this.zza.getSystemService("activity");
                if (activityManager != null && (runningTasks = activityManager.getRunningTasks(1)) != null && !runningTasks.isEmpty() && (runningTaskInfo = runningTasks.get(0)) != null && runningTaskInfo.topActivity != null) {
                    className = runningTaskInfo.topActivity.getClassName();
                }
            } catch (Exception unused) {
            }
            bundle.putString("activity", className);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("width", this.zzb.zze);
            bundle2.putInt("height", this.zzb.zzb);
            bundle.putBundle("size", bundle2);
            if (!this.zzc.isEmpty()) {
                List list = this.zzc;
                bundle.putParcelableArray("parents", (Parcelable[]) list.toArray(new Parcelable[list.size()]));
            }
            zzcuvVar.zza.putBundle("view_hierarchy", bundle);
        }
    }
}
