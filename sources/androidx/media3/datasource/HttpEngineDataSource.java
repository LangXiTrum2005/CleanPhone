package androidx.media3.datasource;

import android.net.Uri;
import android.net.http.HttpException;
import android.net.http.UrlRequest;
import android.net.http.UrlRequest$Callback;
import android.net.http.UrlRequest$StatusListener;
import android.net.http.UrlResponseInfo;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.Util;
import java.io.IOException;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class HttpEngineDataSource extends BaseDataSource implements HttpDataSource {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f5766e;
    public long f;
    public DataSpec g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public UrlRequestWrapper f5767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ByteBuffer f5768i;
    public UrlResponseInfo j;
    public IOException k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f5769l;
    public volatile long m;

    public static final class Factory implements HttpDataSource.Factory {
    }

    public static final class OpenException extends HttpDataSource.HttpDataSourceException {
    }

    public final class UrlRequestCallback implements UrlRequest$Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public volatile boolean f5770a = false;

        public UrlRequestCallback() {
        }

        public final synchronized void onCanceled(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
        }

        public final synchronized void onFailed(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, HttpException httpException) {
            try {
                if (!this.f5770a) {
                    if (Y.a.x(httpException) && Y.a.d(httpException).getErrorCode() == 1) {
                        HttpEngineDataSource.this.k = new UnknownHostException();
                    } else {
                        HttpEngineDataSource.this.k = httpException;
                    }
                    HttpEngineDataSource.this.getClass();
                    throw null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }

        public final synchronized void onReadCompleted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, ByteBuffer byteBuffer) {
            if (!this.f5770a) {
                HttpEngineDataSource.this.getClass();
                throw null;
            }
        }

        public final synchronized void onRedirectReceived(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo, String str) {
            try {
                if (this.f5770a) {
                    return;
                }
                DataSpec dataSpec = HttpEngineDataSource.this.g;
                dataSpec.getClass();
                int httpStatusCode = urlResponseInfo.getHttpStatusCode();
                if (dataSpec.f5737b == 2 && (httpStatusCode == 307 || httpStatusCode == 308)) {
                    HttpEngineDataSource httpEngineDataSource = HttpEngineDataSource.this;
                    urlResponseInfo.getHttpStatusText();
                    Map asMap = urlResponseInfo.getHeaders().getAsMap();
                    int i2 = Util.f5683a;
                    httpEngineDataSource.k = new HttpDataSource.InvalidResponseCodeException(httpStatusCode, null, asMap);
                    HttpEngineDataSource.this.getClass();
                    throw null;
                }
                HttpEngineDataSource.this.getClass();
                HttpEngineDataSource.this.getClass();
                urlRequest.followRedirect();
            } catch (Throwable th) {
                throw th;
            }
        }

        public final synchronized void onResponseStarted(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            if (!this.f5770a) {
                HttpEngineDataSource.this.j = urlResponseInfo;
                throw null;
            }
        }

        public final synchronized void onSucceeded(UrlRequest urlRequest, UrlResponseInfo urlResponseInfo) {
            if (!this.f5770a) {
                HttpEngineDataSource.this.f5769l = true;
                throw null;
            }
        }
    }

    public static final class UrlRequestWrapper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UrlRequest f5772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UrlRequestCallback f5773b;

        /* JADX INFO: renamed from: androidx.media3.datasource.HttpEngineDataSource$UrlRequestWrapper$1, reason: invalid class name */
        class AnonymousClass1 implements UrlRequest$StatusListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ int[] f5774a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ ConditionVariable f5775b;

            public AnonymousClass1(int[] iArr, ConditionVariable conditionVariable) {
                this.f5774a = iArr;
                this.f5775b = conditionVariable;
            }

            public final void onStatus(int i2) {
                this.f5774a[0] = i2;
                this.f5775b.d();
            }
        }

        public UrlRequestWrapper(UrlRequest urlRequest, UrlRequestCallback urlRequestCallback) {
            this.f5772a = urlRequest;
            this.f5773b = urlRequestCallback;
        }
    }

    public static String h(String str, Map map) {
        List list = (List) map.get(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (String) list.get(0);
    }

    @Override // androidx.media3.datasource.DataSource
    public final long b(DataSpec dataSpec) {
        dataSpec.getClass();
        Assertions.e(!this.f5766e);
        throw null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final synchronized void close() {
        try {
            UrlRequestWrapper urlRequestWrapper = this.f5767h;
            if (urlRequestWrapper != null) {
                urlRequestWrapper.f5773b.f5770a = true;
                urlRequestWrapper.f5772a.cancel();
                this.f5767h = null;
            }
            ByteBuffer byteBuffer = this.f5768i;
            if (byteBuffer != null) {
                byteBuffer.limit(0);
            }
            this.g = null;
            this.j = null;
            this.k = null;
            this.f5769l = false;
            if (this.f5766e) {
                this.f5766e = false;
                d();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final UrlRequestWrapper g(DataSpec dataSpec) {
        null.newUrlRequestBuilder(dataSpec.f5736a.toString(), null, new UrlRequestCallback()).setPriority(0).setDirectExecutorAllowed(true);
        new HashMap();
        throw null;
    }

    @Override // androidx.media3.datasource.DataSource
    public final Map getResponseHeaders() {
        UrlResponseInfo urlResponseInfo = this.j;
        return urlResponseInfo == null ? Collections.EMPTY_MAP : urlResponseInfo.getHeaders().getAsMap();
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        UrlResponseInfo urlResponseInfo = this.j;
        if (urlResponseInfo == null) {
            return null;
        }
        return Uri.parse(urlResponseInfo.getUrl());
    }

    public final ByteBuffer i() {
        if (this.f5768i == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32768);
            this.f5768i = byteBufferAllocateDirect;
            byteBufferAllocateDirect.limit(0);
        }
        return this.f5768i;
    }

    public final void j(ByteBuffer byteBuffer) {
        UrlRequestWrapper urlRequestWrapper = this.f5767h;
        int i2 = Util.f5683a;
        urlRequestWrapper.f5772a.read(byteBuffer);
        throw null;
    }

    public final byte[] k() {
        byte[] bArr = Util.f;
        i();
        if (this.f5769l) {
            return bArr;
        }
        throw null;
    }

    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i2, int i3) {
        Assertions.e(this.f5766e);
        if (i3 == 0) {
            return 0;
        }
        if (this.f == 0) {
            return -1;
        }
        ByteBuffer byteBufferI = i();
        if (!byteBufferI.hasRemaining()) {
            throw null;
        }
        long j = this.f;
        if (j == -1) {
            j = Long.MAX_VALUE;
        }
        long[] jArr = {j, byteBufferI.remaining(), i3};
        long j2 = jArr[0];
        for (int i4 = 1; i4 < 3; i4++) {
            long j3 = jArr[i4];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        int i5 = (int) j2;
        byteBufferI.get(bArr, i2, i5);
        long j4 = this.f;
        if (j4 != -1) {
            this.f = j4 - ((long) i5);
        }
        c(i5);
        return i5;
    }
}
