package com.google.zxing.common;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
public final class StringUtils {
    static {
        String strName = Charset.defaultCharset().name();
        if ("SJIS".equalsIgnoreCase(strName)) {
            return;
        }
        "EUC_JP".equalsIgnoreCase(strName);
    }
}
