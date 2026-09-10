package com.google.android.gms.internal.measurement;

import android.util.Log;
import androidx.media3.extractor.text.ttml.a;
import javax.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
final class zzkc extends zzkm {
    public zzkc(zzkg zzkgVar, String str, Long l2, boolean z2) {
        super(zzkgVar, str, l2, true, null);
    }

    @Override // com.google.android.gms.internal.measurement.zzkm
    @Nullable
    public final /* synthetic */ Object zza(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        String str = this.zzb;
        String string = obj.toString();
        Log.e("PhenotypeFlag", a.q(new StringBuilder(str.length() + 25 + string.length()), "Invalid long value for ", str, ": ", string));
        return null;
    }
}
