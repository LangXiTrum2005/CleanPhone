package com.facebook.internal;

import android.net.Uri;
import com.facebook.LoggingBehavior;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/UrlRedirectCache;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class UrlRedirectCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f16374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f16375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static FileLruCache f16376c;

    static {
        String strL = Reflection.f43333a.b(UrlRedirectCache.class).l();
        if (strL == null) {
            strL = "UrlRedirectCache";
        }
        f16374a = strL;
        f16375b = strL.concat("_Redirect");
    }

    public static final void a(Uri uri, Uri uri2) {
        if (uri2 == null) {
            return;
        }
        BufferedOutputStream bufferedOutputStreamD = null;
        try {
            FileLruCache fileLruCacheB = b();
            String string = uri.toString();
            Intrinsics.e(string, "fromUri.toString()");
            bufferedOutputStreamD = fileLruCacheB.d(string, f16375b);
            String string2 = uri2.toString();
            Intrinsics.e(string2, "toUri.toString()");
            byte[] bytes = string2.getBytes(Charsets.f44691a);
            Intrinsics.e(bytes, "(this as java.lang.String).getBytes(charset)");
            bufferedOutputStreamD.write(bytes);
        } catch (IOException e2) {
            HashMap map = Logger.d;
            Logger.Companion.b(LoggingBehavior.e0, f16374a, "IOException when accessing cache: " + e2.getMessage());
        } finally {
            Utility.e(bufferedOutputStreamD);
        }
    }

    public static final synchronized FileLruCache b() {
        FileLruCache fileLruCache;
        fileLruCache = f16376c;
        if (fileLruCache == null) {
            fileLruCache = new FileLruCache(f16374a, new FileLruCache.Limits());
        }
        f16376c = fileLruCache;
        return fileLruCache;
    }
}
