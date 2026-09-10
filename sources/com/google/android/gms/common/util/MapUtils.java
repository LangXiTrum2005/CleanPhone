package com.google.android.gms.common.util;

import android.support.v4.media.a;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class MapUtils {
    public static void writeStringMapToJson(StringBuilder sb, HashMap<String, String> map) {
        sb.append("{");
        boolean z2 = true;
        for (String str : map.keySet()) {
            if (!z2) {
                sb.append(",");
            }
            String str2 = map.get(str);
            a.A(sb, "\"", str, "\":");
            if (str2 == null) {
                sb.append(AbstractJsonLexerKt.NULL);
            } else {
                a.A(sb, "\"", str2, "\"");
            }
            z2 = false;
        }
        sb.append("}");
    }
}
