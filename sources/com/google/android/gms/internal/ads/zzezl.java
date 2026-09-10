package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.wrappers.Wrappers;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public final class zzezl implements zzezx {
    private final zzgyw zza;
    private final Context zzb;
    private final VersionInfoParcel zzc;
    private final String zzd;

    public zzezl(zzgyw zzgywVar, Context context, VersionInfoParcel versionInfoParcel, String str) {
        this.zza = zzgywVar;
        this.zzb = context;
        this.zzc = versionInfoParcel;
        this.zzd = str;
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final ListenableFuture zza() {
        return this.zza.submit(new Callable() { // from class: com.google.android.gms.internal.ads.zzezk
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return this.zza.zzc();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzezx
    public final int zzb() {
        return 35;
    }

    public final /* synthetic */ zzezm zzc() {
        Context context = this.zzb;
        boolean zIsCallerInstantApp = Wrappers.packageManager(context).isCallerInstantApp();
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zZzJ = com.google.android.gms.ads.internal.util.zzs.zzJ(context);
        String str = this.zzc.afmaVersion;
        com.google.android.gms.ads.internal.zzt.zzc();
        boolean zZzK = com.google.android.gms.ads.internal.util.zzs.zzK();
        com.google.android.gms.ads.internal.zzt.zzc();
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        return new zzezm(zIsCallerInstantApp, zZzJ, str, zZzK, applicationInfo == null ? 0 : applicationInfo.targetSdkVersion, DynamiteModule.getRemoteVersion(context, ModuleDescriptor.MODULE_ID), DynamiteModule.getLocalVersion(context, ModuleDescriptor.MODULE_ID), this.zzd);
    }
}
