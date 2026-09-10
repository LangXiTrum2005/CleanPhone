package com.startapp.sdk.internal;

import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public final class bc {
    public static final String a(Locale locale, Collection collection, char c2) {
        boolean z2;
        StringBuilder sb;
        if (locale != null) {
            sb = new StringBuilder();
            sb.append(locale);
            z2 = true;
        } else {
            z2 = false;
            sb = null;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Locale locale2 = (Locale) it.next();
            if (locale2 != null) {
                if (sb == null) {
                    sb = new StringBuilder();
                }
                if (z2) {
                    sb.append(c2);
                }
                sb.append(locale2);
                z2 = true;
            }
        }
        if (sb != null) {
            return sb.toString();
        }
        return null;
    }
}
