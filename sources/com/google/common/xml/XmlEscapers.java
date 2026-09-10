package com.google.common.xml;

import com.applovin.shadow.okio.Utf8;
import com.google.common.escape.Escapers;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public class XmlEscapers {
    static {
        Escapers.Builder builder = new Escapers.Builder();
        builder.f19988b = Utf8.REPLACEMENT_CHARACTER;
        builder.f19989c = "�";
        char c2 = 0;
        while (true) {
            HashMap map = builder.f19987a;
            if (c2 > 31) {
                map.put('&', "&amp;");
                map.put('<', "&lt;");
                map.put('>', "&gt;");
                builder.a();
                map.put('\'', "&apos;");
                map.put(Character.valueOf(AbstractJsonLexerKt.STRING), "&quot;");
                builder.a();
                map.put('\t', "&#x9;");
                map.put('\n', "&#xA;");
                map.put('\r', "&#xD;");
                builder.a();
                return;
            }
            if (c2 != '\t' && c2 != '\n' && c2 != '\r') {
                map.put(Character.valueOf(c2), "�");
            }
            c2 = (char) (c2 + 1);
        }
    }
}
