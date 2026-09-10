package androidx.media3.datasource;

import android.net.Uri;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.util.Assertions;
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

/* JADX INFO: loaded from: classes.dex */
public final class DataSpec {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f5736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f5737b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f5738c;
    public final Map d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f5739e;
    public final long f;
    public final String g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f5740h;

    public static final class Builder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Uri f5741a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public byte[] f5743c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f5744e;
        public String g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f5745h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f5742b = 1;
        public Map d = Collections.EMPTY_MAP;
        public long f = -1;

        public final DataSpec a() {
            if (this.f5741a != null) {
                return new DataSpec(this.f5741a, this.f5742b, this.f5743c, this.d, this.f5744e, this.f, this.g, this.f5745h);
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
        MediaLibraryInfo.a("media3.datasource");
    }

    public DataSpec(Uri uri, int i2, byte[] bArr, Map map, long j, long j2, String str, int i3) {
        Assertions.b(j >= 0);
        Assertions.b(j >= 0);
        Assertions.b(j2 > 0 || j2 == -1);
        uri.getClass();
        this.f5736a = uri;
        this.f5737b = i2;
        this.f5738c = (bArr == null || bArr.length == 0) ? null : bArr;
        this.d = Collections.unmodifiableMap(new HashMap(map));
        this.f5739e = j;
        this.f = j2;
        this.g = str;
        this.f5740h = i3;
    }

    public static String b(int i2) {
        if (i2 == 1) {
            return ko.f25534a;
        }
        if (i2 == 2) {
            return ko.f25535b;
        }
        if (i2 == 3) {
            return "HEAD";
        }
        throw new IllegalStateException();
    }

    public final Builder a() {
        Builder builder = new Builder();
        builder.f5741a = this.f5736a;
        builder.f5742b = this.f5737b;
        builder.f5743c = this.f5738c;
        builder.d = this.d;
        builder.f5744e = this.f5739e;
        builder.f = this.f;
        builder.g = this.g;
        builder.f5745h = this.f5740h;
        return builder;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DataSpec[");
        sb.append(b(this.f5737b));
        sb.append(" ");
        sb.append(this.f5736a);
        sb.append(", ");
        sb.append(this.f5739e);
        sb.append(", ");
        sb.append(this.f);
        sb.append(", ");
        sb.append(this.g);
        sb.append(", ");
        return android.support.v4.media.a.i(this.f5740h, d9.i.f24752e, sb);
    }
}
