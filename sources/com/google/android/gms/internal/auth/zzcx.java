package com.google.android.gms.internal.auth;

import android.support.v4.media.a;
import android.util.Log;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class zzcx extends zzdc {
    public zzcx(zzcz zzczVar, String str, Double d, boolean z2) {
        super(zzczVar, str, d, true, null);
    }

    @Override // com.google.android.gms.internal.auth.zzdc
    @Nullable
    public final /* bridge */ /* synthetic */ Object zza(Object obj) {
        try {
            return Double.valueOf(Double.parseDouble((String) obj));
        } catch (NumberFormatException unused) {
            StringBuilder sbY = a.y("Invalid double value for ", zzc(), ": ");
            sbY.append((String) obj);
            Log.e("PhenotypeFlag", sbY.toString());
            return null;
        }
    }
}
