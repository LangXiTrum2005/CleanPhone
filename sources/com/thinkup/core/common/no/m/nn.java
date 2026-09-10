package com.thinkup.core.common.no.m;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* JADX INFO: loaded from: classes6.dex */
public final class nn {
    private nn() {
    }

    private static String o(String str, String str2) {
        return "Basic ".concat(String.valueOf(com.thinkup.core.common.no.n.om.o(str + ":" + str2, StandardCharsets.ISO_8859_1).m()));
    }

    private static String o(String str, String str2, Charset charset) {
        return "Basic ".concat(String.valueOf(com.thinkup.core.common.no.n.om.o(str + ":" + str2, charset).m()));
    }
}
