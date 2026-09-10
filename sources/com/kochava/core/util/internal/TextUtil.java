package com.kochava.core.util.internal;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
public final class TextUtil {
    public static Charset a() {
        return Charset.isSupported("UTF-8") ? Charset.forName("UTF-8") : Charset.defaultCharset();
    }

    public static boolean b(String str) {
        return str == null || str.trim().isEmpty();
    }
}
