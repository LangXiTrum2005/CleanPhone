package com.chartboost.sdk.impl;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public final class db {
    public final String a(String str, boolean z2) {
        if (str == null || str.length() == 0) {
            return null;
        }
        if (z2) {
            try {
                return URLEncoder.encode(str, StandardCharsets.UTF_8.name());
            } catch (UnsupportedEncodingException e2) {
                za.b("Failed to URL encode macro value: " + str + ". Error: " + e2.getMessage(), e2);
            }
        }
        return str;
    }

    public final String a(String str, ig eventData, boolean z2, boolean z3) {
        Intrinsics.f(eventData, "eventData");
        if (str == null) {
            return null;
        }
        String str2 = z3 ? AbstractJsonLexerKt.NULL : "";
        for (Map.Entry entry : eventData.b().entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            String strN = android.support.v4.media.a.n("%%", str3, "%%");
            if (StringsKt.M(str3, "CB_ERROR", false) && (str4 == null || str4.length() == 0)) {
                str = StringsKt.I(str, strN, "");
            } else if (str3.equals("CB_BASE64_ADM")) {
                if (str4 == null) {
                    str4 = str2;
                }
                str = StringsKt.I(str, strN, str4);
            } else {
                String strA = a(str4, z2);
                if (strA == null) {
                    strA = str2;
                }
                str = StringsKt.I(str, strN, strA);
            }
        }
        return new Regex("%%CB_[A-Z0-9_]+%%").c(str2, str);
    }
}
