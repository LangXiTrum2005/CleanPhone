package com.smartdigimkt.n4;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.mbridge.msdk.foundation.download.Command;
import com.p004ironsource.d9;
import com.p004ironsource.ko;
import com.smartdigimkt.p4.f0;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class p implements s {
    public static final int r = 8000;
    public static final int s = 8000;
    private static final String t = "DefaultHttpDataSource";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f37038u = 20;
    private static final long v = 2048;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Pattern f37039w = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> x = new AtomicReference<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f37040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f37041c;
    private final int d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f37042e;
    private final com.smartdigimkt.p4.u<String> f;
    private final s.g g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final s.g f37043h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a0<? super p> f37044i;
    private k j;
    private HttpURLConnection k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private InputStream f37045l;
    private boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f37046n;
    private long o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f37047p;
    private long q;

    public p(String str, com.smartdigimkt.p4.u<String> uVar) {
        this(str, uVar, null);
    }

    private void g() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e2) {
                Log.e(t, "Unexpected error while disconnecting", e2);
            }
            this.k = null;
        }
    }

    private void i() throws IOException {
        if (this.f37047p == this.f37046n) {
            return;
        }
        byte[] andSet = x.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (true) {
            long j = this.f37047p;
            long j2 = this.f37046n;
            if (j == j2) {
                x.set(andSet);
                return;
            }
            int i2 = this.f37045l.read(andSet, 0, (int) Math.min(j2 - j, andSet.length));
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (i2 == -1) {
                throw new EOFException();
            }
            this.f37047p += (long) i2;
            a0<? super p> a0Var = this.f37044i;
            if (a0Var != null) {
                a0Var.a(this, i2);
            }
        }
    }

    @Override // com.smartdigimkt.n4.s
    public Map<String, List<String>> a() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }

    @Override // com.smartdigimkt.n4.s
    public void b() {
        this.f37043h.a();
    }

    @Override // com.smartdigimkt.n4.h
    public Uri c() {
        HttpURLConnection httpURLConnection = this.k;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0015 */
    @Override // com.smartdigimkt.n4.s, com.smartdigimkt.n4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void close() throws com.smartdigimkt.n4.s.d {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            java.io.InputStream r2 = r6.f37045l     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L21
            java.net.HttpURLConnection r2 = r6.k     // Catch: java.lang.Throwable -> L15
            long r3 = r6.e()     // Catch: java.lang.Throwable -> L15
            a(r2, r3)     // Catch: java.lang.Throwable -> L15
            java.io.InputStream r2 = r6.f37045l     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L17
            r2.close()     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L17
            goto L21
        L15:
            r2 = move-exception
            goto L34
        L17:
            r2 = move-exception
            com.smartdigimkt.n4.s$d r3 = new com.smartdigimkt.n4.s$d     // Catch: java.lang.Throwable -> L15
            com.smartdigimkt.n4.k r4 = r6.j     // Catch: java.lang.Throwable -> L15
            r5 = 3
            r3.<init>(r2, r4, r5)     // Catch: java.lang.Throwable -> L15
            throw r3     // Catch: java.lang.Throwable -> L15
        L21:
            r6.f37045l = r1
            r6.g()
            boolean r1 = r6.m
            if (r1 == 0) goto L33
            r6.m = r0
            com.smartdigimkt.n4.a0<? super com.smartdigimkt.n4.p> r0 = r6.f37044i
            if (r0 == 0) goto L33
            r0.a(r6)
        L33:
            return
        L34:
            r6.f37045l = r1
            r6.g()
            boolean r1 = r6.m
            if (r1 == 0) goto L46
            r6.m = r0
            com.smartdigimkt.n4.a0<? super com.smartdigimkt.n4.p> r0 = r6.f37044i
            if (r0 == 0) goto L46
            r0.a(r6)
        L46:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.smartdigimkt.n4.p.close():void");
    }

    public final long d() {
        return this.q;
    }

    public final long e() {
        long j = this.o;
        return j == -1 ? j : j - this.q;
    }

    public final long f() {
        return this.f37047p;
    }

    public final HttpURLConnection h() {
        return this.k;
    }

    public p(String str, com.smartdigimkt.p4.u<String> uVar, a0<? super p> a0Var) {
        this(str, uVar, a0Var, 8000, 8000);
    }

    private HttpURLConnection b(k kVar) throws IOException {
        URL url = new URL(kVar.f37004a.toString());
        byte[] bArr = kVar.f37005b;
        long j = kVar.d;
        long j2 = kVar.f37007e;
        boolean zA = kVar.a(1);
        if (!this.f37040b) {
            return a(url, bArr, j, j2, zA, true);
        }
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            if (i2 > 20) {
                throw new NoRouteToHostException(android.support.v4.media.a.h(i3, "Too many redirects: "));
            }
            long j3 = j2;
            boolean z2 = zA;
            long j4 = j;
            HttpURLConnection httpURLConnectionA = a(url, bArr, j4, j3, z2, false);
            j = j4;
            j2 = j3;
            zA = z2;
            int responseCode = httpURLConnectionA.getResponseCode();
            if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && (bArr != null || (responseCode != 307 && responseCode != 308))) {
                return httpURLConnectionA;
            }
            String headerField = httpURLConnectionA.getHeaderField("Location");
            httpURLConnectionA.disconnect();
            url = a(url, headerField);
            bArr = null;
            i2 = i3;
        }
    }

    @Override // com.smartdigimkt.n4.s
    public void a(String str, String str2) {
        com.smartdigimkt.p4.a.a(str);
        com.smartdigimkt.p4.a.a(str2);
        this.f37043h.a(str, str2);
    }

    public p(String str, com.smartdigimkt.p4.u<String> uVar, a0<? super p> a0Var, int i2, int i3) {
        this(str, uVar, a0Var, i2, i3, false, null);
    }

    public p(String str, com.smartdigimkt.p4.u<String> uVar, a0<? super p> a0Var, int i2, int i3, boolean z2, s.g gVar) {
        this.f37042e = com.smartdigimkt.p4.a.a(str);
        this.f = uVar;
        this.f37044i = a0Var;
        this.f37043h = new s.g();
        this.f37041c = i2;
        this.d = i3;
        this.f37040b = z2;
        this.g = gVar;
    }

    @Override // com.smartdigimkt.n4.s
    public void a(String str) {
        com.smartdigimkt.p4.a.a(str);
        this.f37043h.a(str);
    }

    @Override // com.smartdigimkt.n4.s, com.smartdigimkt.n4.h
    public long a(k kVar) throws s.d {
        this.j = kVar;
        long j = 0;
        this.q = 0L;
        this.f37047p = 0L;
        try {
            HttpURLConnection httpURLConnectionB = b(kVar);
            this.k = httpURLConnectionB;
            try {
                int responseCode = httpURLConnectionB.getResponseCode();
                if (responseCode >= 200 && responseCode <= 299) {
                    String contentType = this.k.getContentType();
                    com.smartdigimkt.p4.u<String> uVar = this.f;
                    if (uVar != null && !uVar.a(contentType)) {
                        g();
                        throw new s.e(contentType, kVar);
                    }
                    if (responseCode == 200) {
                        long j2 = kVar.d;
                        if (j2 != 0) {
                            j = j2;
                        }
                    }
                    this.f37046n = j;
                    if (!kVar.a(1)) {
                        long j3 = kVar.f37007e;
                        if (j3 != -1) {
                            this.o = j3;
                        } else {
                            long jA = a(this.k);
                            this.o = jA != -1 ? jA - this.f37046n : -1L;
                        }
                    } else {
                        this.o = kVar.f37007e;
                    }
                    try {
                        this.f37045l = this.k.getInputStream();
                        this.m = true;
                        a0<? super p> a0Var = this.f37044i;
                        if (a0Var != null) {
                            a0Var.a(this, kVar);
                        }
                        return this.o;
                    } catch (IOException e2) {
                        g();
                        throw new s.d(e2, kVar, 1);
                    }
                }
                Map<String, List<String>> headerFields = this.k.getHeaderFields();
                g();
                s.f fVar = new s.f(responseCode, headerFields, kVar);
                if (responseCode == 416) {
                    fVar.initCause(new i(0));
                    throw fVar;
                }
                throw fVar;
            } catch (IOException e3) {
                g();
                throw new s.d("Unable to connect to " + kVar.f37004a.toString(), e3, kVar, 1);
            }
        } catch (IOException e4) {
            throw new s.d("Unable to connect to " + kVar.f37004a.toString(), e4, kVar, 1);
        }
    }

    private int b(byte[] bArr, int i2, int i3) throws IOException {
        if (i3 == 0) {
            return 0;
        }
        long j = this.o;
        if (j != -1) {
            long j2 = j - this.q;
            if (j2 == 0) {
                return -1;
            }
            i3 = (int) Math.min(i3, j2);
        }
        int i4 = this.f37045l.read(bArr, i2, i3);
        if (i4 == -1) {
            if (this.o == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.q += (long) i4;
        a0<? super p> a0Var = this.f37044i;
        if (a0Var != null) {
            a0Var.a(this, i4);
        }
        return i4;
    }

    @Override // com.smartdigimkt.n4.s, com.smartdigimkt.n4.h
    public int a(byte[] bArr, int i2, int i3) throws s.d {
        try {
            i();
            return b(bArr, i2, i3);
        } catch (IOException e2) {
            throw new s.d(e2, this.j, 2);
        }
    }

    private HttpURLConnection a(URL url, byte[] bArr, long j, long j2, boolean z2, boolean z3) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f37041c);
        httpURLConnection.setReadTimeout(this.d);
        s.g gVar = this.g;
        if (gVar != null) {
            for (Map.Entry<String, String> entry : gVar.b().entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, String> entry2 : this.f37043h.b().entrySet()) {
            httpURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
        }
        if (j != 0 || j2 != -1) {
            String strJ = androidx.media3.extractor.text.ttml.a.j(j, "bytes=", TokenBuilder.TOKEN_DELIMITER);
            if (j2 != -1) {
                StringBuilder sbW = android.support.v4.media.a.w(strJ);
                sbW.append((j + j2) - 1);
                strJ = sbW.toString();
            }
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, strJ);
        }
        httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, this.f37042e);
        if (!z2) {
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
        }
        httpURLConnection.setInstanceFollowRedirects(z3);
        httpURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpURLConnection.setRequestMethod(ko.f25535b);
            if (bArr.length == 0) {
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
        httpURLConnection.connect();
        return httpURLConnection;
    }

    private static URL a(URL url, String str) throws IOException {
        if (str != null) {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (HttpRequest.DEFAULT_SCHEME.equals(protocol) || "http".equals(protocol)) {
                return url2;
            }
            throw new ProtocolException(android.support.v4.media.a.C("Unsupported protocol redirect: ", protocol));
        }
        throw new ProtocolException("Null location redirect");
    }

    private static long a(HttpURLConnection httpURLConnection) {
        long j;
        String headerField = httpURLConnection.getHeaderField("Content-Length");
        if (TextUtils.isEmpty(headerField)) {
            j = -1;
        } else {
            try {
                j = Long.parseLong(headerField);
            } catch (NumberFormatException unused) {
                Log.e(t, "Unexpected Content-Length [" + headerField + d9.i.f24752e);
                j = -1;
            }
        }
        String headerField2 = httpURLConnection.getHeaderField("Content-Range");
        if (TextUtils.isEmpty(headerField2)) {
            return j;
        }
        Matcher matcher = f37039w.matcher(headerField2);
        if (!matcher.find()) {
            return j;
        }
        try {
            long j2 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
            if (j < 0) {
                return j2;
            }
            if (j == j2) {
                return j;
            }
            Log.w(t, "Inconsistent headers [" + headerField + "] [" + headerField2 + d9.i.f24752e);
            return Math.max(j, j2);
        } catch (NumberFormatException unused2) {
            Log.e(t, "Unexpected Content-Range [" + headerField2 + d9.i.f24752e);
            return j;
        }
    }

    private static void a(HttpURLConnection httpURLConnection, long j) {
        int i2 = f0.f37540a;
        if (i2 == 19 || i2 == 20) {
            try {
                InputStream inputStream = httpURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", null);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, null);
                }
            } catch (Exception unused) {
            }
        }
    }
}
