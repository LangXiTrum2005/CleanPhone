package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.util.Assertions;
import com.p004ironsource.d9;
import com.p004ironsource.ko;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class DataSpec {
    public static final /* synthetic */ int j = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f18742a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f18743b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f18744c;
    public final byte[] d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f18745e;
    public final long f;
    public final long g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f18746h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f18747i;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Uri f18748a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f18749b;
        public byte[] d;
        public long f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f18752h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f18753i;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f18750c = 1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Map f18751e = Collections.EMPTY_MAP;
        public long g = -1;

        public final DataSpec a() {
            if (this.f18748a != null) {
                return new DataSpec(this.f18748a, this.f18749b, this.f18750c, this.d, this.f18751e, this.f, this.g, this.f18752h, this.f18753i);
            }
            throw new IllegalStateException("The uri must be set.");
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface HttpMethod {
    }

    static {
        ExoPlayerLibraryInfo.a("goog.exo.datasource");
    }

    public DataSpec(Uri uri, long j2, int i2, byte[] bArr, Map map, long j3, long j4, String str, int i3) {
        Assertions.b(j2 + j3 >= 0);
        Assertions.b(j3 >= 0);
        Assertions.b(j4 > 0 || j4 == -1);
        this.f18742a = uri;
        this.f18743b = j2;
        this.f18744c = i2;
        this.d = (bArr == null || bArr.length == 0) ? null : bArr;
        this.f18745e = Collections.unmodifiableMap(new HashMap(map));
        this.f = j3;
        this.g = j4;
        this.f18746h = str;
        this.f18747i = i3;
    }

    public final Builder a() {
        Builder builder = new Builder();
        builder.f18748a = this.f18742a;
        builder.f18749b = this.f18743b;
        builder.f18750c = this.f18744c;
        builder.d = this.d;
        builder.f18751e = this.f18745e;
        builder.f = this.f;
        builder.g = this.g;
        builder.f18752h = this.f18746h;
        builder.f18753i = this.f18747i;
        return builder;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DataSpec[");
        int i2 = this.f18744c;
        if (i2 == 1) {
            str = ko.f25534a;
        } else if (i2 == 2) {
            str = ko.f25535b;
        } else {
            if (i2 != 3) {
                throw new IllegalStateException();
            }
            str = "HEAD";
        }
        sb.append(str);
        sb.append(" ");
        sb.append(this.f18742a);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        sb.append(this.f18746h);
        sb.append(", ");
        return android.support.v4.media.a.i(this.f18747i, d9.i.f24752e, sb);
    }
}
