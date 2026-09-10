package com.google.common.html;

import com.google.common.escape.Escapers;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class HtmlEscapers {
    static {
        Escapers.Builder builder = new Escapers.Builder();
        HashMap map = builder.f19987a;
        map.put(Character.valueOf(AbstractJsonLexerKt.STRING), "&quot;");
        map.put('\'', "&#39;");
        map.put('&', "&amp;");
        map.put('<', "&lt;");
        map.put('>', "&gt;");
        builder.a();
    }
}
