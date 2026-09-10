package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import javax.annotation.ParametersAreNonnullByDefault;

/* JADX INFO: loaded from: classes4.dex */
@ParametersAreNonnullByDefault
@Deprecated
public final class zzbgq {
    public static final void zza(zzbgp zzbgpVar, zzbgn zzbgnVar) {
        if (zzbgnVar.zzb() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        }
        if (TextUtils.isEmpty(zzbgnVar.zzc())) {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
        zzbgpVar.zza(zzbgnVar.zzb(), zzbgnVar.zzc(), zzbgnVar.zza(), zzbgnVar.zzd());
    }
}
