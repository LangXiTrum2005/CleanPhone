package com.google.android.gms.internal.ads;

import android.text.Spannable;
import android.text.style.RelativeSizeSpan;

/* JADX INFO: loaded from: classes4.dex */
public final class zzdd {
    public static void zza(Spannable spannable, Object obj, int i2, int i3, int i4) {
        for (Object obj2 : spannable.getSpans(i2, i3, obj.getClass())) {
            zzc(spannable, obj2, i2, i3, 33);
        }
        spannable.setSpan(obj, i2, i3, 33);
    }

    public static void zzb(Spannable spannable, float f, int i2, int i3, int i4) {
        for (RelativeSizeSpan relativeSizeSpan : (RelativeSizeSpan[]) spannable.getSpans(i2, i3, RelativeSizeSpan.class)) {
            if (spannable.getSpanStart(relativeSizeSpan) <= i2 && spannable.getSpanEnd(relativeSizeSpan) >= i3) {
                f = relativeSizeSpan.getSizeChange() * f;
            }
            zzc(spannable, relativeSizeSpan, i2, i3, 33);
        }
        spannable.setSpan(new RelativeSizeSpan(f), i2, i3, 33);
    }

    private static void zzc(Spannable spannable, Object obj, int i2, int i3, int i4) {
        if (spannable.getSpanStart(obj) == i2 && spannable.getSpanEnd(obj) == i3 && spannable.getSpanFlags(obj) == 33) {
            spannable.removeSpan(obj);
        }
    }
}
