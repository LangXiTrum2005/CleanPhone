package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class E9 {
    public static String a(String valueTypeString) {
        Intrinsics.f(valueTypeString, "valueTypeString");
        int length = valueTypeString.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean z3 = Intrinsics.h(valueTypeString.charAt(!z2 ? i2 : length), 32) <= 0;
            if (z2) {
                if (!z3) {
                    break;
                }
                length--;
            } else if (z3) {
                i2++;
            } else {
                z2 = true;
            }
        }
        String strA = I7.a(length, 1, valueTypeString, i2);
        int iHashCode = strA.hashCode();
        if (iHashCode == -1900324833) {
            return !strA.equals("reference_html") ? "UNKNOWN" : "REF_HTML";
        }
        if (iHashCode == -835221992) {
            return !strA.equals("reference_iframe") ? "UNKNOWN" : "REF_IFRAME";
        }
        if (iHashCode != 116079) {
            return (iHashCode == 3213227 && strA.equals("html")) ? "HTML" : "UNKNOWN";
        }
        return !strA.equals("url") ? "UNKNOWN" : "URL";
    }
}
