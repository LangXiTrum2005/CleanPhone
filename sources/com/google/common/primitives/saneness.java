package com.google.common.primitives;

import com.google.common.base.formularize;
import com.inmobi.media.core.config.models.AdConfig;

/* JADX INFO: compiled from: Chars.java */
/* JADX INFO: loaded from: classes3.dex */
public final class saneness {
    public static char attabal(long j) {
        char c = (char) j;
        formularize.taiyuan(((long) c) == j, "Out of range: %s", j);
        return c;
    }

    public static char dern(byte b, byte b2) {
        return (char) ((b << 8) | (b2 & AdConfig.NETWORK_LOAD_LIMIT_DISABLED));
    }

    public static boolean saneness(char[] cArr, char c) {
        for (char c2 : cArr) {
            if (c2 == c) {
                return true;
            }
        }
        return false;
    }
}
