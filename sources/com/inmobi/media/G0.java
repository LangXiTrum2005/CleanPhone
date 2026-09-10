package com.inmobi.media;

import java.util.Map;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
public final class G0 {
    public static final String a(String str, Map map) {
        if (map != null && str != null) {
            for (Object obj : map.keySet()) {
                str = str != null ? StringsKt.I(str, String.valueOf(obj), String.valueOf(map.get(obj))) : null;
            }
        }
        return str;
    }
}
