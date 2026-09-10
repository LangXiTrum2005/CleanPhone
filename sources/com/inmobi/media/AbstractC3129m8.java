package com.inmobi.media;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.m8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC3129m8 {
    public static byte a(String referencedCreativeString) {
        Intrinsics.f(referencedCreativeString, "referencedCreativeString");
        Locale locale = Locale.US;
        String strP = com.applovin.impl.Z.p(locale, "US", referencedCreativeString, locale, "this as java.lang.String).toLowerCase(locale)");
        int length = strP.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            boolean z3 = Intrinsics.h(strP.charAt(!z2 ? i2 : length), 32) <= 0;
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
        String strA = I7.a(length, 1, strP, i2);
        int iHashCode = strA.hashCode();
        if (iHashCode != -1412832500) {
            return iHashCode != 0 ? (byte) 1 : (byte) 1;
        }
        if (strA.equals("companion")) {
            return (byte) 2;
        }
        return (byte) 0;
    }
}
