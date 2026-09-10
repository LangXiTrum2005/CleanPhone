package com.google.common.base;

import com.startapp.simple.bloomfilter.codec.CharEncoding;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
@ElementTypesAreNonnullByDefault
public final class Charsets {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Charset f19703a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f19704b = Charset.forName(CharEncoding.ISO_8859_1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Charset f19705c = Charset.forName("UTF-8");
    public static final Charset d = Charset.forName(CharEncoding.UTF_16BE);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Charset f19706e = Charset.forName(CharEncoding.UTF_16LE);
    public static final Charset f = Charset.forName("UTF-16");
}
