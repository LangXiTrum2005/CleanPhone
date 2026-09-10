package org.jacoco.core.internal.analysis;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class StringPool {
    private static final String[] EMPTY_ARRAY = new String[0];
    private final Map<String, String> pool = new HashMap(1024);

    public String get(String str) {
        if (str == null) {
            return null;
        }
        String str2 = this.pool.get(str);
        if (str2 != null) {
            return str2;
        }
        this.pool.put(str, str);
        return str;
    }

    public String[] get(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        if (strArr.length == 0) {
            return EMPTY_ARRAY;
        }
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = get(strArr[i]);
        }
        return strArr;
    }
}
