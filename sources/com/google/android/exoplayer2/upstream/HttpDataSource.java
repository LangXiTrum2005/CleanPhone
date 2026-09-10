package com.google.android.exoplayer2.upstream;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.net.SocketTimeoutException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public interface HttpDataSource extends DataSource {

    public static abstract class BaseFactory implements Factory {
        public abstract HttpDataSource a();

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory, com.google.android.exoplayer2.upstream.DataSource.Factory
        public final DataSource createDataSource() {
            return a();
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory, com.google.android.exoplayer2.upstream.DataSource.Factory
        public final HttpDataSource createDataSource() {
            return a();
        }
    }

    public static final class CleartextNotPermittedException extends HttpDataSourceException {
    }

    public interface Factory extends DataSource.Factory {
        @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
        HttpDataSource createDataSource();
    }

    public static final class InvalidContentTypeException extends HttpDataSourceException {
    }

    public static final class InvalidResponseCodeException extends HttpDataSourceException {
        public final int e0;
        public final Map f0;

        public InvalidResponseCodeException(int i2, DataSourceException dataSourceException, Map map) {
            super(2004, dataSourceException, android.support.v4.media.a.h(i2, "Response code: "));
            this.e0 = i2;
            this.f0 = map;
        }
    }

    public static final class RequestProperties {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HashMap f18789a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map f18790b;

        public final synchronized Map a() {
            try {
                if (this.f18790b == null) {
                    this.f18790b = Collections.unmodifiableMap(new HashMap(this.f18789a));
                }
            } catch (Throwable th) {
                throw th;
            }
            return this.f18790b;
        }
    }

    public static class HttpDataSourceException extends DataSourceException {
        public final int Z;

        @Target({ElementType.TYPE_USE})
        @Documented
        @Retention(RetentionPolicy.SOURCE)
        public @interface Type {
        }

        public HttpDataSourceException() {
            super(2008);
            this.Z = 1;
        }

        public static HttpDataSourceException a(IOException iOException, int i2) {
            int i3;
            String message = iOException.getMessage();
            if (iOException instanceof SocketTimeoutException) {
                i3 = 2002;
            } else if (iOException instanceof InterruptedIOException) {
                i3 = 1004;
            } else {
                i3 = (message == null || !Ascii.b(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            }
            return i3 == 2007 ? new CleartextNotPermittedException(2007, iOException, "Cleartext HTTP traffic not permitted. See https://developer.android.com/guide/topics/media/issues/cleartext-not-permitted") : new HttpDataSourceException(i3, i2, iOException);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public HttpDataSourceException(int i2, int i3, IOException iOException) {
            if (i2 == 2000 && i3 == 1) {
                i2 = 2001;
            }
            super(iOException, i2);
            this.Z = i3;
        }

        public HttpDataSourceException(int i2, IOException iOException, String str) {
            super(str, iOException, i2 == 2000 ? 2001 : i2);
            this.Z = 1;
        }
    }
}
