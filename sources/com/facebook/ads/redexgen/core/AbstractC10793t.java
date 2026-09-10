package com.facebook.ads.redexgen.core;

import android.text.Spannable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.3t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC10793t {
    public static void A00(Spannable spannable, Object obj, int i2, int i3, int i4) {
        for (Object obj2 : spannable.getSpans(i2, i3, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i2 && spannable.getSpanEnd(obj2) == i3 && spannable.getSpanFlags(obj2) == i4) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i2, i3, i4);
    }
}
