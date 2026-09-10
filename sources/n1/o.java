package n1;

import android.net.TrafficStats;
import android.net.Uri;
import android.text.TextUtils;
import com.ironsource.C0375hc;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import oa.s1;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f46390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f46391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f46392g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f46393h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m5.k f46394i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m5.k f46395j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public k f46396k;
    public HttpURLConnection l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InputStream f46397m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f46398n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f46399o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f46400p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f46401q;

    public o(String str, int i10, int i11, boolean z10, m5.k kVar) {
        super(true);
        this.f46393h = str;
        this.f46391f = i10;
        this.f46392g = i11;
        this.f46390e = z10;
        this.f46394i = kVar;
        this.f46395j = new m5.k(2);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0112  */
    @Override // n1.h
    public final long C(k kVar) throws s {
        boolean z10;
        long j10;
        HttpURLConnection httpURLConnection;
        this.f46396k = kVar;
        this.f46401q = 0L;
        this.f46400p = 0L;
        e();
        try {
            TrafficStats.setThreadStatsTag((int) Thread.currentThread().getId());
            HttpURLConnection httpURLConnectionK = k(kVar);
            long j11 = kVar.f46373e;
            long j12 = kVar.f46374f;
            this.l = httpURLConnectionK;
            this.f46399o = httpURLConnectionK.getResponseCode();
            httpURLConnectionK.getResponseMessage();
            int i10 = this.f46399o;
            long jMax = -1;
            if (i10 < 200 || i10 > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionK.getHeaderFields();
                if (this.f46399o == 416) {
                    String headerField = httpURLConnectionK.getHeaderField("Content-Range");
                    Pattern pattern = v.f46408a;
                    if (TextUtils.isEmpty(headerField)) {
                        j10 = -1;
                        z10 = true;
                    } else {
                        Matcher matcher = v.f46409b.matcher(headerField);
                        z10 = true;
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            j10 = Long.parseLong(strGroup);
                        } else {
                            j10 = -1;
                        }
                    }
                    if (j11 == j10) {
                        this.f46398n = z10;
                        g(kVar);
                        if (j12 != -1) {
                            return j12;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionK.getErrorStream();
                try {
                    if (errorStream != null) {
                        qa.f.b(errorStream);
                    } else {
                        String str = l1.y.f44830a;
                    }
                } catch (IOException unused) {
                    String str2 = l1.y.f44830a;
                }
                h();
                throw new u(this.f46399o, this.f46399o == 416 ? new i(2008) : null, headerFields);
            }
            httpURLConnectionK.getContentType();
            if (this.f46399o != 200 || j11 == 0) {
                j11 = 0;
            }
            boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionK.getHeaderField("Content-Encoding"));
            if (zEqualsIgnoreCase) {
                httpURLConnection = httpURLConnectionK;
                this.f46400p = j12;
            } else if (j12 != -1) {
                this.f46400p = j12;
                httpURLConnection = httpURLConnectionK;
            } else {
                String headerField2 = httpURLConnectionK.getHeaderField("Content-Length");
                String headerField3 = httpURLConnectionK.getHeaderField("Content-Range");
                Pattern pattern2 = v.f46408a;
                if (!TextUtils.isEmpty(headerField2)) {
                    try {
                        jMax = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        l1.a.e("HttpUtil", "Unexpected Content-Length [" + headerField2 + X3.j.f27836e);
                    }
                }
                if (TextUtils.isEmpty(headerField3)) {
                    httpURLConnection = httpURLConnectionK;
                } else {
                    Matcher matcher2 = v.f46408a.matcher(headerField3);
                    if (matcher2.matches()) {
                        try {
                            String strGroup2 = matcher2.group(2);
                            strGroup2.getClass();
                            long j13 = Long.parseLong(strGroup2);
                            String strGroup3 = matcher2.group(1);
                            strGroup3.getClass();
                            httpURLConnection = httpURLConnectionK;
                            long j14 = (j13 - Long.parseLong(strGroup3)) + 1;
                            if (jMax < 0) {
                                jMax = j14;
                            } else if (jMax != j14) {
                                try {
                                    l1.a.s("HttpUtil", "Inconsistent headers [" + headerField2 + "] [" + headerField3 + X3.j.f27836e);
                                    jMax = Math.max(jMax, j14);
                                } catch (NumberFormatException unused3) {
                                    l1.a.e("HttpUtil", "Unexpected Content-Range [" + headerField3 + X3.j.f27836e);
                                }
                            }
                        } catch (NumberFormatException unused4) {
                            httpURLConnection = httpURLConnectionK;
                        }
                    } else {
                        httpURLConnection = httpURLConnectionK;
                    }
                }
                this.f46400p = jMax != jMax ? jMax - j11 : -1L;
            }
            try {
                this.f46397m = httpURLConnection.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.f46397m = new GZIPInputStream(this.f46397m);
                }
                this.f46398n = true;
                g(kVar);
                try {
                    l(j11);
                    return this.f46400p;
                } catch (IOException e10) {
                    h();
                    if (e10 instanceof s) {
                        throw ((s) e10);
                    }
                    throw new s(2000, 1, e10);
                }
            } catch (IOException e11) {
                h();
                throw new s(2000, 1, e11);
            }
        } catch (IOException e12) {
            h();
            throw s.a(1, e12);
        }
    }

    @Override // n1.h
    public final void close() {
        try {
            InputStream inputStream = this.f46397m;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    String str = l1.y.f44830a;
                    throw new s(2000, 3, e10);
                }
            }
            this.f46397m = null;
            h();
            if (this.f46398n) {
                this.f46398n = false;
                d();
            }
            this.l = null;
            this.f46396k = null;
            TrafficStats.clearThreadStatsTag();
        } catch (Throwable th2) {
            this.f46397m = null;
            h();
            if (this.f46398n) {
                this.f46398n = false;
                d();
            }
            this.l = null;
            this.f46396k = null;
            TrafficStats.clearThreadStatsTag();
            throw th2;
        }
    }

    @Override // n1.h
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.l;
        return httpURLConnection == null ? s1.f47307g : new n(httpURLConnection.getHeaderFields());
    }

    @Override // n1.h
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection != null) {
            return Uri.parse(httpURLConnection.getURL().toString());
        }
        k kVar = this.f46396k;
        if (kVar != null) {
            return kVar.f46369a;
        }
        return null;
    }

    public final void h() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                l1.a.f("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
        }
    }

    public final URL i(URL url, String str) throws s {
        if (str == null) {
            throw new s("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new s(defpackage.e.n("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.f46390e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new s("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e10) {
            throw new s(2001, 1, e10);
        }
    }

    public final HttpURLConnection j(URL url, int i10, byte[] bArr, long j10, long j11, boolean z10, boolean z11, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f46391f);
        httpURLConnection.setReadTimeout(this.f46392g);
        HashMap map2 = new HashMap();
        m5.k kVar = this.f46394i;
        if (kVar != null) {
            map2.putAll(kVar.z());
        }
        map2.putAll(this.f46395j.z());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = v.f46408a;
        if (j10 == 0 && j11 == -1) {
            string = null;
        } else {
            StringBuilder sbL = wi.d.l(j10, "bytes=", "-");
            if (j11 != -1) {
                sbL.append((j10 + j11) - 1);
            }
            string = sbL.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, string);
        }
        String str2 = this.f46393h;
        if (str2 != null) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, str2);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", z10 ? "gzip" : "identity");
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(bArr != null);
        int i11 = k.f46368i;
        if (i10 == 1) {
            str = C0375hc.f28788a;
        } else if (i10 == 2) {
            str = C0375hc.f28789b;
        } else {
            if (i10 != 3) {
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

    public final HttpURLConnection k(k kVar) throws IOException {
        URL url = new URL(kVar.f46369a.toString());
        int i10 = kVar.f46370b;
        byte[] bArr = kVar.f46371c;
        long j10 = kVar.f46373e;
        long j11 = kVar.f46374f;
        int i11 = 1;
        int i12 = 0;
        boolean z10 = (kVar.f46376h & 1) == 1;
        if (!this.f46390e) {
            return j(url, i10, bArr, j10, j11, z10, true, kVar.f46372d);
        }
        while (true) {
            int i13 = i12 + 1;
            if (i12 > 20) {
                throw new s(2001, 1, new NoRouteToHostException(l1.d.e(i13, "Too many redirects: ")));
            }
            HttpURLConnection httpURLConnectionJ = j(url, i10, bArr, j10, j11, z10, false, kVar.f46372d);
            int responseCode = httpURLConnectionJ.getResponseCode();
            String headerField = httpURLConnectionJ.getHeaderField("Location");
            if ((i10 == i11 || i10 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionJ.disconnect();
                url = i(url, headerField);
            } else {
                if (i10 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionJ;
                }
                httpURLConnectionJ.disconnect();
                url = i(url, headerField);
                bArr = null;
                i10 = 1;
            }
            i12 = i13;
            i11 = 1;
        }
    }

    public final void l(long j10) throws IOException {
        if (j10 == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j10 > 0) {
            int iMin = (int) Math.min(j10, 4096);
            InputStream inputStream = this.f46397m;
            String str = l1.y.f44830a;
            int i10 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new s(2000, 1, new InterruptedIOException());
            }
            if (i10 == -1) {
                throw new s();
            }
            j10 -= (long) i10;
            b(i10);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
    @Override // i1.i
    public final int read(byte[] bArr, int i10, int i11) throws s {
        int i12;
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.f46400p;
            if (j10 != -1) {
                long j11 = j10 - this.f46401q;
                if (j11 != 0) {
                    i11 = (int) Math.min(i11, j11);
                    InputStream inputStream = this.f46397m;
                    String str = l1.y.f44830a;
                    i12 = inputStream.read(bArr, i10, i11);
                    if (i12 != -1) {
                        this.f46401q += (long) i12;
                        b(i12);
                        return i12;
                    }
                }
            } else {
                InputStream inputStream2 = this.f46397m;
                String str2 = l1.y.f44830a;
                i12 = inputStream2.read(bArr, i10, i11);
                if (i12 != -1) {
                    this.f46401q += (long) i12;
                    b(i12);
                    return i12;
                }
            }
            return -1;
        } catch (IOException e10) {
            String str3 = l1.y.f44830a;
            throw s.a(2, e10);
        }
    }
}
