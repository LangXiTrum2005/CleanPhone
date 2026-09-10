package com.bumptech.glide.load.model;

import android.net.Uri;
import android.text.TextUtils;
import com.bumptech.glide.load.Key;
import com.bumptech.glide.util.Preconditions;
import java.net.URL;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes.dex */
public class GlideUrl implements Key {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LazyHeaders f12560b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final URL f12561c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f12562e;
    public URL f;
    public volatile byte[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f12563h;

    public GlideUrl(URL url) {
        LazyHeaders lazyHeaders = Headers.f12564a;
        Preconditions.c(url, "Argument must not be null");
        this.f12561c = url;
        this.d = null;
        Preconditions.c(lazyHeaders, "Argument must not be null");
        this.f12560b = lazyHeaders;
    }

    @Override // com.bumptech.glide.load.Key
    public final void b(MessageDigest messageDigest) {
        if (this.g == null) {
            this.g = c().getBytes(Key.f12364a);
        }
        messageDigest.update(this.g);
    }

    public final String c() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        URL url = this.f12561c;
        Preconditions.c(url, "Argument must not be null");
        return url.toString();
    }

    public final URL d() {
        if (this.f == null) {
            if (TextUtils.isEmpty(this.f12562e)) {
                String string = this.d;
                if (TextUtils.isEmpty(string)) {
                    URL url = this.f12561c;
                    Preconditions.c(url, "Argument must not be null");
                    string = url.toString();
                }
                this.f12562e = Uri.encode(string, "@#&=*+-_.,:!?()/~'%;$");
            }
            this.f = new URL(this.f12562e);
        }
        return this.f;
    }

    @Override // com.bumptech.glide.load.Key
    public final boolean equals(Object obj) {
        if (!(obj instanceof GlideUrl)) {
            return false;
        }
        GlideUrl glideUrl = (GlideUrl) obj;
        return c().equals(glideUrl.c()) && this.f12560b.equals(glideUrl.f12560b);
    }

    @Override // com.bumptech.glide.load.Key
    public final int hashCode() {
        if (this.f12563h == 0) {
            int iHashCode = c().hashCode();
            this.f12563h = iHashCode;
            this.f12563h = this.f12560b.f12565b.hashCode() + (iHashCode * 31);
        }
        return this.f12563h;
    }

    public final String toString() {
        return c();
    }

    public GlideUrl(String str, LazyHeaders lazyHeaders) {
        this.f12561c = null;
        if (!TextUtils.isEmpty(str)) {
            this.d = str;
            Preconditions.c(lazyHeaders, "Argument must not be null");
            this.f12560b = lazyHeaders;
            return;
        }
        throw new IllegalArgumentException("Must not be null or empty");
    }
}
