package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import androidx.annotation.Nullable;
import com.google.android.gms.common.wrappers.Wrappers;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcho implements zzher {
    private final zzhfj zza;
    private final zzhfj zzb;

    public zzcho(zzhfj zzhfjVar, zzhfj zzhfjVar2) {
        this.zza = zzhfjVar;
        this.zzb = zzhfjVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhfj, com.google.android.gms.internal.ads.zzhfi
    @Nullable
    public final /* bridge */ /* synthetic */ Object zzb() {
        try {
            return Wrappers.packageManager(((zzche) this.zza).zza()).getPackageInfo(((ApplicationInfo) this.zzb.zzb()).packageName, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
