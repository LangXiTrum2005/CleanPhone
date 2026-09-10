package com.bumptech.glide.load;

import android.support.v4.media.a;
import android.text.TextUtils;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public final class Option<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final CacheKeyUpdater f12365e = new AnonymousClass1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f12366a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CacheKeyUpdater f12367b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f12368c;
    public volatile byte[] d;

    /* JADX INFO: renamed from: com.bumptech.glide.load.Option$1, reason: invalid class name */
    public class AnonymousClass1 implements CacheKeyUpdater<Object> {
        @Override // com.bumptech.glide.load.Option.CacheKeyUpdater
        public final void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }

    public interface CacheKeyUpdater<T> {
        void a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    public Option(String str, Object obj, CacheKeyUpdater cacheKeyUpdater) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Must not be null or empty");
        }
        this.f12368c = str;
        this.f12366a = obj;
        this.f12367b = cacheKeyUpdater;
    }

    public static Option a(Object obj, String str) {
        return new Option(str, obj, f12365e);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Option) {
            return this.f12368c.equals(((Option) obj).f12368c);
        }
        return false;
    }

    public final int hashCode() {
        return this.f12368c.hashCode();
    }

    public final String toString() {
        return a.r(new StringBuilder("Option{key='"), this.f12368c, "'}");
    }
}
