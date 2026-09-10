package com.facebook.internal;

import android.net.Uri;
import com.applovin.shadow.okio.Segment;
import com.facebook.LoggingBehavior;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/facebook/internal/ImageResponseCache;", "", "BufferedHttpInputStream", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class ImageResponseCache {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static FileLruCache f16346a;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/internal/ImageResponseCache$BufferedHttpInputStream;", "Ljava/io/BufferedInputStream;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public static final class BufferedHttpInputStream extends BufferedInputStream {
        public HttpURLConnection X;

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            super.close();
            Utility.l(this.X);
        }
    }

    public static final synchronized FileLruCache a() {
        FileLruCache fileLruCache;
        try {
            if (f16346a == null) {
                f16346a = new FileLruCache("ImageResponseCache", new FileLruCache.Limits());
            }
            fileLruCache = f16346a;
            if (fileLruCache == null) {
                throw new IllegalStateException("Required value was null.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return fileLruCache;
    }

    public static final BufferedInputStream b(Uri uri) {
        if (d(uri)) {
            try {
                FileLruCache fileLruCacheA = a();
                String string = uri.toString();
                Intrinsics.e(string, "uri.toString()");
                AtomicLong atomicLong = FileLruCache.g;
                return fileLruCacheA.c(string, null);
            } catch (IOException e2) {
                HashMap map = Logger.d;
                Logger.Companion.b(LoggingBehavior.e0, "ImageResponseCache", e2.toString());
            }
        }
        return null;
    }

    public static final InputStream c(HttpURLConnection httpURLConnection) throws IOException {
        if (httpURLConnection.getResponseCode() != 200) {
            return null;
        }
        Uri uri = Uri.parse(httpURLConnection.getURL().toString());
        InputStream inputStream = httpURLConnection.getInputStream();
        try {
            if (d(uri)) {
                FileLruCache fileLruCacheA = a();
                String string = uri.toString();
                Intrinsics.e(string, "uri.toString()");
                BufferedHttpInputStream bufferedHttpInputStream = new BufferedHttpInputStream(inputStream, Segment.SIZE);
                bufferedHttpInputStream.X = httpURLConnection;
                return new FileLruCache.CopyingInputStream(bufferedHttpInputStream, fileLruCacheA.d(string, null));
            }
        } catch (IOException unused) {
        }
        return inputStream;
    }

    public static boolean d(Uri uri) {
        if (uri != null) {
            String host = uri.getHost();
            if (host != null && StringsKt.p(host, "fbcdn.net", false)) {
                return true;
            }
            if (host != null && StringsKt.M(host, "fbcdn", false) && StringsKt.p(host, "akamaihd.net", false)) {
                return true;
            }
        }
        return false;
    }
}
