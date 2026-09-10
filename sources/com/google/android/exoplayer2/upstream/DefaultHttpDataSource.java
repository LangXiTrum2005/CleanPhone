package com.google.android.exoplayer2.upstream;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mbridge.msdk.foundation.download.Command;
import com.p004ironsource.d9;
import com.p004ironsource.ko;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.io.ByteArrayOutputStream;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultHttpDataSource extends BaseDataSource implements HttpDataSource {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f18779e;
    public final int f;
    public final HttpDataSource.RequestProperties g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HttpDataSource.RequestProperties f18780h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public HttpURLConnection f18781i;
    public InputStream j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18782l;
    public long m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f18783n;

    public static final class Factory implements HttpDataSource.Factory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final HttpDataSource.RequestProperties f18784a = new HttpDataSource.RequestProperties();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f18785b = 8000;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f18786c = 8000;

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory, com.google.android.exoplayer2.upstream.DataSource.Factory
        public final DataSource createDataSource() {
            return new DefaultHttpDataSource(this.f18785b, this.f18786c, this.f18784a);
        }

        @Override // com.google.android.exoplayer2.upstream.HttpDataSource.Factory, com.google.android.exoplayer2.upstream.DataSource.Factory
        public final HttpDataSource createDataSource() {
            return new DefaultHttpDataSource(this.f18785b, this.f18786c, this.f18784a);
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
            return Sets.d(super.entrySet(), new c(1));
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
            return Sets.d(super.keySet(), new c(0));
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
        this.f18779e = i2;
        this.f = i3;
        this.g = requestProperties;
        this.f18780h = new HttpDataSource.RequestProperties();
    }

    public static void i(HttpURLConnection httpURLConnection, long j) {
        int i2;
        if (httpURLConnection == null || (i2 = Util.f18979a) < 19 || i2 > 20) {
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

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final long a(DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        boolean z2;
        long j;
        long jMax;
        this.f18783n = 0L;
        this.m = 0L;
        e(dataSpec);
        try {
            HttpURLConnection httpURLConnectionH = h(new URL(dataSpec.f18742a.toString()), dataSpec.f18744c, dataSpec.d, dataSpec.f, dataSpec.g, (dataSpec.f18747i & 1) == 1, true, dataSpec.f18745e);
            this.f18781i = httpURLConnectionH;
            this.f18782l = httpURLConnectionH.getResponseCode();
            httpURLConnectionH.getResponseMessage();
            int i2 = this.f18782l;
            long j2 = dataSpec.f;
            long j3 = dataSpec.g;
            if (i2 < 200 || i2 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionH.getHeaderFields();
                if (this.f18782l == 416) {
                    String headerField = httpURLConnectionH.getHeaderField("Content-Range");
                    Pattern pattern = HttpUtil.f18791a;
                    if (TextUtils.isEmpty(headerField)) {
                        j = -1;
                        z2 = true;
                    } else {
                        Matcher matcher = HttpUtil.f18792b.matcher(headerField);
                        z2 = true;
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            j = Long.parseLong(strGroup);
                        } else {
                            j = -1;
                        }
                    }
                    if (j2 == j) {
                        this.k = z2;
                        f(dataSpec);
                        if (j3 != -1) {
                            return j3;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionH.getErrorStream();
                try {
                    if (errorStream != null) {
                        int i3 = Util.f18979a;
                        byte[] bArr = new byte[4096];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int i4 = errorStream.read(bArr);
                            if (i4 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i4);
                        }
                        byteArrayOutputStream.toByteArray();
                    } else {
                        int i5 = Util.f18979a;
                    }
                } catch (IOException unused) {
                    int i6 = Util.f18979a;
                }
                g();
                throw new HttpDataSource.InvalidResponseCodeException(this.f18782l, this.f18782l == 416 ? new DataSourceException(2008) : null, headerFields);
            }
            httpURLConnectionH.getContentType();
            if (this.f18782l != 200 || j2 == 0) {
                j2 = 0;
            }
            boolean zEqualsIgnoreCase = com.smartdigimkt.o0.b.d.equalsIgnoreCase(httpURLConnectionH.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase || j3 != -1) {
                this.m = j3;
            } else {
                String headerField2 = httpURLConnectionH.getHeaderField("Content-Length");
                String headerField3 = httpURLConnectionH.getHeaderField("Content-Range");
                Pattern pattern2 = HttpUtil.f18791a;
                if (TextUtils.isEmpty(headerField2)) {
                    jMax = -1;
                } else {
                    try {
                        jMax = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        Log.c("HttpUtil", "Unexpected Content-Length [" + headerField2 + d9.i.f24752e);
                        jMax = -1;
                    }
                }
                if (!TextUtils.isEmpty(headerField3)) {
                    Matcher matcher2 = HttpUtil.f18791a.matcher(headerField3);
                    if (matcher2.matches()) {
                        try {
                            String strGroup2 = matcher2.group(2);
                            strGroup2.getClass();
                            long j4 = Long.parseLong(strGroup2);
                            String strGroup3 = matcher2.group(1);
                            strGroup3.getClass();
                            long j5 = (j4 - Long.parseLong(strGroup3)) + 1;
                            if (jMax < 0) {
                                jMax = j5;
                            } else if (jMax != j5) {
                                Log.g("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + d9.i.f24752e);
                                jMax = Math.max(jMax, j5);
                            }
                        } catch (NumberFormatException unused3) {
                            Log.c("HttpUtil", "Unexpected Content-Range [" + headerField3 + d9.i.f24752e);
                        }
                    }
                }
                this.m = jMax != -1 ? jMax - j2 : -1L;
            }
            try {
                this.j = httpURLConnectionH.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.j = new GZIPInputStream(this.j);
                }
                this.k = true;
                f(dataSpec);
                try {
                    j(j2);
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

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final void close() {
        try {
            InputStream inputStream = this.j;
            if (inputStream != null) {
                long j = this.m;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.f18783n;
                }
                i(this.f18781i, j2);
                try {
                    inputStream.close();
                } catch (IOException e2) {
                    int i2 = Util.f18979a;
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
        HttpURLConnection httpURLConnection = this.f18781i;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                Log.d("DefaultHttpDataSource", "Unexpected error while disconnecting", e2);
            }
            this.f18781i = null;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.f18781i;
        return httpURLConnection == null ? ImmutableMap.o() : new NullFilteringHeadersMap(httpURLConnection.getHeaderFields());
    }

    @Override // com.google.android.exoplayer2.upstream.DataSource
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.f18781i;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final HttpURLConnection h(URL url, int i2, byte[] bArr, long j, long j2, boolean z2, boolean z3, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f18779e);
        httpURLConnection.setReadTimeout(this.f);
        HashMap map2 = new HashMap();
        HttpDataSource.RequestProperties requestProperties = this.g;
        if (requestProperties != null) {
            map2.putAll(requestProperties.a());
        }
        map2.putAll(this.f18780h.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = HttpUtil.f18791a;
        if (j == 0 && j2 == -1) {
            string = null;
        } else {
            StringBuilder sbV = android.support.v4.media.a.v(j, "bytes=", TokenBuilder.TOKEN_DELIMITER);
            if (j2 != -1) {
                sbV.append((j + j2) - 1);
            }
            string = sbV.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, string);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z2 ? com.smartdigimkt.o0.b.d : "identity");
        httpURLConnection.setInstanceFollowRedirects(z3);
        httpURLConnection.setDoOutput(bArr != null);
        int i3 = DataSpec.j;
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
        httpURLConnection.setRequestMethod(str);
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
            int i2 = Util.f18979a;
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
    @Override // com.google.android.exoplayer2.upstream.DataReader
    public final int read(byte[] bArr, int i2, int i3) throws HttpDataSource.HttpDataSourceException {
        int i4;
        if (i3 == 0) {
            return 0;
        }
        try {
            long j = this.m;
            if (j != -1) {
                long j2 = j - this.f18783n;
                if (j2 != 0) {
                    i3 = (int) Math.min(i3, j2);
                    InputStream inputStream = this.j;
                    int i5 = Util.f18979a;
                    i4 = inputStream.read(bArr, i2, i3);
                    if (i4 != -1) {
                        this.f18783n += (long) i4;
                        c(i4);
                        return i4;
                    }
                }
            } else {
                InputStream inputStream2 = this.j;
                int i6 = Util.f18979a;
                i4 = inputStream2.read(bArr, i2, i3);
                if (i4 != -1) {
                    this.f18783n += (long) i4;
                    c(i4);
                    return i4;
                }
            }
            return -1;
        } catch (IOException e2) {
            int i7 = Util.f18979a;
            throw HttpDataSource.HttpDataSourceException.a(e2, 2);
        }
    }
}
