package com.google.android.gms.internal.auth;

import android.support.v4.media.a;
import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class zzcv extends zzdc {
    public zzcv(zzcz zzczVar, String str, Long l2, boolean z2) {
        super(zzczVar, str, l2, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Long.valueOf(Long.parseLong((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbY = a.y("Invalid long value for ", zzc(), ": ");
            sbY.append((String) obj);
            Log.e("PhenotypeFlag", sbY.toString());
            return null;
        }
    }
}
