package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class zzfdt extends zzfdb {
    public zzfdt(Context context, Executor executor, zzclg zzclgVar, zzffj zzffjVar, zzfdr zzfdrVar, zzfij zzfijVar, VersionInfoParcel versionInfoParcel) {
        super(context, executor, zzclgVar, zzffjVar, zzfdrVar, zzfijVar, versionInfoParcel);
    }

    @Override // com.google.android.gms.internal.ads.zzfdb
    public final /* bridge */ /* synthetic */ zzczq zzc(zzcsz zzcszVar, zzczt zzcztVar, zzdgk zzdgkVar) {
        zzcsp zzcspVarZzk = this.zza.zzk();
        zzcspVarZzk.zzd(zzcztVar);
        zzcspVarZzk.zze(zzdgkVar);
        return zzcspVarZzk;
    }
}
