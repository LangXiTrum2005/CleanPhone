package com.google.android.gms.internal.ads;

import com.p004ironsource.d9;

/* JADX INFO: loaded from: classes4.dex */
final class zzgte {
    private final Object zza;
    private final Object zzb;
    private final Object zzc;

    public zzgte(Object obj, Object obj2, Object obj3) {
        this.zza = obj;
        this.zzb = obj2;
        this.zzc = obj3;
    }

    public final IllegalArgumentException zza() {
        Object obj = this.zzc;
        Object obj2 = this.zzb;
        Object obj3 = this.zza;
        String strValueOf = String.valueOf(obj3);
        String strValueOf2 = String.valueOf(obj2);
        String strValueOf3 = String.valueOf(obj3);
        String strValueOf4 = String.valueOf(obj);
        int length = strValueOf.length();
        int length2 = strValueOf2.length();
        StringBuilder sb = new StringBuilder(length + 33 + length2 + 5 + strValueOf3.length() + 1 + strValueOf4.length());
        androidx.media3.extractor.text.ttml.a.C(sb, "Multiple entries with same key: ", strValueOf, d9.i.f24747b, strValueOf2);
        return new IllegalArgumentException(androidx.media3.extractor.text.ttml.a.q(sb, " and ", strValueOf3, d9.i.f24747b, strValueOf4));
    }
}
