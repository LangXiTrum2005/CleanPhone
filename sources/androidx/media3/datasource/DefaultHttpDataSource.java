package androidx.media3.datasource;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.io.ByteStreams;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes.dex */
public class DefaultHttpDataSource extends BaseDataSource implements HttpDataSource {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f5754e;
    public final int f;
    public final HttpDataSource.RequestProperties g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HttpDataSource.RequestProperties f5755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HttpURLConnection f5756i;
    public InputStream j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5757l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f5758n;

    public static final class Factory implements HttpDataSource.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HttpDataSource.RequestProperties f5759a = new HttpDataSource.RequestProperties();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5760b = 8000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f5761c = 8000;

        public final DataSource a() {
            return new DefaultHttpDataSource(this.f5760b, this.f5761c, this.f5759a);
        }
    }

    public static class NullFilteringHeadersMap extends ForwardingMap<String, List<String>> {
        public final Map X;

        public NullFilteringHeadersMap(Map map) {
            this.X = map;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final boolean containsKey(Object obj) {
            return obj != null && super.containsKey(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final boolean containsValue(Object obj) {
            return y(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final Set entrySet() {
            return Sets.d(super.entrySet(), new b(0));
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final boolean equals(Object obj) {
            return obj != null && Maps.d(this, obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final Object get(Object obj) {
            if (obj == null) {
                return null;
            }
            return (List) super.get(obj);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final int hashCode() {
            return Sets.e(entrySet());
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final boolean isEmpty() {
            return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final Set keySet() {
            return Sets.d(super.keySet(), new b(1));
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public final int size() {
            return super.size() - (super.containsKey(null) ? 1 : 0);
        }

        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        public final Object w() {
            return this.X;
        }

        @Override // com.google.common.collect.ForwardingMap
        public final Map x() {
            return this.X;
        }
    }

    public DefaultHttpDataSource(int i2, int i3, HttpDataSource.RequestProperties requestProperties) {
        super(true);
        this.f5754e = i2;
        this.f = i3;
        this.g = requestProperties;
        this.f5755h = new HttpDataSource.RequestProperties();
    }

    public static void i(HttpURLConnection httpURLConnection, long j) {
        if (httpURLConnection == null || Util.f5683a > 20) {
            return;
        }
        try {
            InputStream inputStream = httpURLConnection.getInputStream();
            if (j == -1) {
                if (inputStream.read() == -1) {
                    return;
                }
            } else if (j <= PlaybackStateCompat.ACTION_PLAY_FROM_SEARCH) {
                return;
            }
            String name = inputStream.getClass().getName();
            if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                Class<? super Object> superclass = inputStream.getClass().getSuperclass();
                superclass.getClass();
                Method declaredMethod = superclass.getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(inputStream, new Object[0]);
            }
        } catch (Exception unused) {
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final long b(DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        long j = 0;
        this.f5758n = 0L;
        this.m = 0L;
        e(dataSpec);
        try {
            HttpURLConnection httpURLConnectionH = h(new URL(dataSpec.f5736a.toString()), dataSpec.f5737b, dataSpec.f5738c, dataSpec.f5739e, dataSpec.f, (dataSpec.f5740h & 1) == 1, true, dataSpec.d);
            this.f5756i = httpURLConnectionH;
            this.f5757l = httpURLConnectionH.getResponseCode();
            httpURLConnectionH.getResponseMessage();
            int i2 = this.f5757l;
            long j2 = dataSpec.f5739e;
            long j3 = dataSpec.f;
            if (i2 < 200 || i2 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionH.getHeaderFields();
                if (this.f5757l == 416 && j2 == HttpUtil.c(httpURLConnectionH.getHeaderField("Content-Range"))) {
                    this.k = true;
                    f(dataSpec);
                    if (j3 != -1) {
                        return j3;
                    }
                    return 0L;
                }
                InputStream errorStream = httpURLConnectionH.getErrorStream();
                try {
                    if (errorStream != null) {
                        ByteStreams.c(errorStream);
                    } else {
                        int i3 = Util.f5683a;
                    }
                } catch (IOException unused) {
                    int i4 = Util.f5683a;
                }
                g();
                throw new HttpDataSource.InvalidResponseCodeException(this.f5757l, this.f5757l == 416 ? new DataSourceException(2008) : null, headerFields);
            }
            httpURLConnectionH.getContentType();
            if (this.f5757l == 200 && j2 != 0) {
                j = j2;
            }
            boolean zEqualsIgnoreCase = com.smartdigimkt.o0.b.d.equalsIgnoreCase(httpURLConnectionH.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase || j3 != -1) {
                this.m = j3;
            } else {
                long jB = HttpUtil.b(httpURLConnectionH.getHeaderField("Content-Length"), httpURLConnectionH.getHeaderField("Content-Range"));
                this.m = jB != -1 ? jB - j : -1L;
            }
            try {
                this.j = httpURLConnectionH.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.j = new GZIPInputStream(this.j);
                }
                this.k = true;
                f(dataSpec);
                try {
                    j(j);
                    return this.m;
                } catch (IOException e2) {
                    g();
                    if (e2 instanceof HttpDataSource.HttpDataSourceException) {
                        throw ((HttpDataSource.HttpDataSourceException) e2);
                    }
                    throw new HttpDataSource.HttpDataSourceException(2000, 1, e2);
                }
            } catch (IOException e3) {
                g();
                throw new HttpDataSource.HttpDataSourceException(2000, 1, e3);
            }
        } catch (IOException e4) {
            g();
            throw HttpDataSource.HttpDataSourceException.a(e4, 1);
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final void close() {
        try {
            InputStream inputStream = this.j;
            if (inputStream != null) {
                long j = this.m;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.f5758n;
                }
                i(this.f5756i, j2);
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    int i2 = Util.f5683a;
                    throw new HttpDataSource.HttpDataSourceException(2000, 3, e2);
                }
            }
            this.j = null;
            g();
            if (this.k) {
                this.k = false;
                d();
            }
        } catch (Throwable th) {
            this.j = null;
            g();
            if (this.k) {
                this.k = false;
                d();
            }
            throw th;
        }
    }

    public final void g() {
        HttpURLConnection httpURLConnection = this.f5756i;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                Log.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.f5756i = null;
        }
    }

    @Override // androidx.media3.datasource.DataSource
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f5756i;
        return httpURLConnection == null ? ImmutableMap.o() : new NullFilteringHeadersMap(httpURLConnection.getHeaderFields());
    }

    @Override // androidx.media3.datasource.DataSource
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f5756i;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final HttpURLConnection h(URL url, int i2, byte[] bArr, long j, long j2, boolean z2, boolean z3, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f5754e);
        httpURLConnection.setReadTimeout(this.f);
        HashMap map2 = new HashMap();
        HttpDataSource.RequestProperties requestProperties = this.g;
        if (requestProperties != null) {
            map2.putAll(requestProperties.a());
        }
        map2.putAll(this.f5755h.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        String strA = HttpUtil.a(j, j2);
        if (strA != null) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, strA);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z2 ? com.smartdigimkt.o0.b.d : "identity");
        httpURLConnection.setInstanceFollowRedirects(z3);
        httpURLConnection.setDoOutput(bArr != null);
        httpURLConnection.setRequestMethod(DataSpec.b(i2));
        if (bArr == null) {
            httpURLConnection.connect();
            return httpURLConnection;
        }
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArr);
        outputStream.close();
        return httpURLConnection;
    }

    public final void j(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096);
            InputStream inputStream = this.j;
            int i2 = Util.f5683a;
            int i3 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new HttpDataSource.HttpDataSourceException(2000, 1, new InterruptedIOException());
            }
            if (i3 == -1) {
                throw new HttpDataSource.HttpDataSourceException();
            }
            j -= (long) i3;
            c(i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // androidx.media3.common.DataReader
    public final int read(byte[] bArr, int i2, int i3) throws HttpDataSource.HttpDataSourceException {
        int i4;
        if (i3 == 0) {
            return 0;
        }
        try {
            long j = this.m;
            if (j != -1) {
                long j2 = j - this.f5758n;
                if (j2 != 0) {
                    i3 = (int) Math.min(i3, j2);
                    InputStream inputStream = this.j;
                    int i5 = Util.f5683a;
                    i4 = inputStream.read(bArr, i2, i3);
                    if (i4 != -1) {
                        this.f5758n += (long) i4;
                        c(i4);
                        return i4;
                    }
                }
            } else {
                InputStream inputStream2 = this.j;
                int i6 = Util.f5683a;
                i4 = inputStream2.read(bArr, i2, i3);
                if (i4 != -1) {
                    this.f5758n += (long) i4;
                    c(i4);
                    return i4;
                }
            }
            return -1;
        } catch (IOException e2) {
            int i7 = Util.f5683a;
            throw HttpDataSource.HttpDataSourceException.a(e2, 2);
        }
    }
}
