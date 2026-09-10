package com.google.android.gms.internal.auth;

import android.support.v4.media.a;
import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class zzcw extends zzdc {
    public zzcw(zzcz zzczVar, String str, Boolean bool, boolean z2) {
        super(zzczVar, str, bool, true, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.auth.zzdc
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        if (zzcb.zzc.matcher(obj).matches()) {
            return Boolean.TRUE;
        }
        if (zzcb.zzd.matcher(obj).matches()) {
            return Boolean.FALSE;
        }
        StringBuilder sbY = a.y("Invalid boolean value for ", zzc(), ": ");
        sbY.append((String) obj);
        Log.e("PhenotypeFlag", sbY.toString());
        return null;
    }
}
