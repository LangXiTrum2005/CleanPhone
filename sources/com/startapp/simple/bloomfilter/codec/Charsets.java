package com.startapp.simple.bloomfilter.codec;

import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes6.dex */
public class Charsets {
    public static final Charset ISO_8859_1 = Charset.forName(CharEncoding.ISO_8859_1);
    public static final Charset US_ASCII = Charset.forName("US-ASCII");
    public static final Charset UTF_16 = Charset.forName("UTF-16");
    public static final Charset UTF_16BE = Charset.forName(CharEncoding.UTF_16BE);
    public static final Charset UTF_16LE = Charset.forName(CharEncoding.UTF_16LE);
    public static final Charset UTF_8 = Charset.forName("UTF-8");

    public static Charset toCharset(Charset charset) {
        return charset == null ? Charset.defaultCharset() : charset;
    }
}
