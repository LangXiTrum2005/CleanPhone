package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.net.Uri;
import android.support.v4.media.session.PlaybackStateCompat;
import android.text.TextUtils;
import androidx.webkit.ProxyConfig;
import com.badlogic.gdx.Net;
import com.badlogic.gdx.net.HttpRequestHeader;
import com.badlogic.gdx.net.HttpResponseHeader;
import com.efs.sdk.base.Constants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
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

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ln, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C3993ln extends AbstractC3763j9 {
    public final boolean e;
    public final int f;
    public final int g;
    public final String h;
    public final RE i;
    public final RE j;
    public final boolean k;
    public final InterfaceC4753uV l;
    public HttpURLConnection m;
    public InputStream n;
    public boolean o;
    public int p;
    public long q;
    public long r;

    public C3993ln(String str, int i, int i2, RE re) {
        super(true);
        this.h = str;
        this.f = i;
        this.g = i2;
        this.e = false;
        this.i = re;
        this.l = null;
        this.j = new RE(1);
        this.k = false;
    }

    public static void o(HttpURLConnection httpURLConnection, long j) {
        int i;
        if (httpURLConnection == null || (i = Ug0.f3833a) < 19 || i > 20) {
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

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final void close() {
        try {
            InputStream inputStream = this.n;
            if (inputStream != null) {
                long j = this.q;
                long j2 = -1;
                if (j != -1) {
                    j2 = j - this.r;
                }
                o(this.m, j2);
                try {
                    inputStream.close();
                } catch (IOException e) {
                    int i = Ug0.f3833a;
                    throw new QA(e, 2000, 3);
                }
            }
            this.n = null;
            k();
            if (this.o) {
                this.o = false;
                h();
            }
        } catch (Throwable th) {
            this.n = null;
            k();
            if (this.o) {
                this.o = false;
                h();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:75:0x012b  */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final long d(C4868vl c4868vl) throws QA {
        long j;
        long jMax;
        this.r = 0L;
        this.q = 0L;
        i();
        try {
            HttpURLConnection httpURLConnectionM = m(c4868vl);
            this.m = httpURLConnectionM;
            this.p = httpURLConnectionM.getResponseCode();
            httpURLConnectionM.getResponseMessage();
            int i = this.p;
            long j2 = c4868vl.f;
            long j3 = c4868vl.g;
            if (i < 200 || i > 299) {
                Map<String, List<String>> headerFields = httpURLConnectionM.getHeaderFields();
                if (this.p == 416) {
                    String headerField = httpURLConnectionM.getHeaderField(HttpResponseHeader.ContentRange);
                    Pattern pattern = AbstractC3063bB.f4162a;
                    if (TextUtils.isEmpty(headerField)) {
                        j = -1;
                    } else {
                        Matcher matcher = AbstractC3063bB.b.matcher(headerField);
                        if (matcher.matches()) {
                            String strGroup = matcher.group(1);
                            strGroup.getClass();
                            j = Long.parseLong(strGroup);
                        } else {
                            j = -1;
                        }
                    }
                    if (j2 == j) {
                        this.o = true;
                        j(c4868vl);
                        if (j3 != -1) {
                            return j3;
                        }
                        return 0L;
                    }
                }
                InputStream errorStream = httpURLConnectionM.getErrorStream();
                try {
                    if (errorStream != null) {
                        int i2 = Ug0.f3833a;
                        byte[] bArr = new byte[4096];
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            int i3 = errorStream.read(bArr);
                            if (i3 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i3);
                        }
                        byteArrayOutputStream.toByteArray();
                    } else {
                        int i4 = Ug0.f3833a;
                    }
                } catch (IOException unused) {
                    int i5 = Ug0.f3833a;
                }
                k();
                throw new SA(this.p, this.p == 416 ? new C4604sl(2008) : null, headerFields);
            }
            String contentType = httpURLConnectionM.getContentType();
            InterfaceC4753uV interfaceC4753uV = this.l;
            if (interfaceC4753uV != null && !interfaceC4753uV.apply(contentType)) {
                k();
                throw new RA(AbstractC3888ke0.i("Invalid content type: ", contentType), 2003);
            }
            if (this.p != 200 || j2 == 0) {
                j2 = 0;
            }
            boolean zEqualsIgnoreCase = Constants.CP_GZIP.equalsIgnoreCase(httpURLConnectionM.getHeaderField(HttpResponseHeader.ContentEncoding));
            if (zEqualsIgnoreCase || j3 != -1) {
                this.q = j3;
            } else {
                String headerField2 = httpURLConnectionM.getHeaderField("Content-Length");
                String headerField3 = httpURLConnectionM.getHeaderField(HttpResponseHeader.ContentRange);
                Pattern pattern2 = AbstractC3063bB.f4162a;
                if (TextUtils.isEmpty(headerField2)) {
                    jMax = -1;
                } else {
                    try {
                        jMax = Long.parseLong(headerField2);
                    } catch (NumberFormatException unused2) {
                        AbstractC4038mJ.c();
                        jMax = -1;
                    }
                }
                if (!TextUtils.isEmpty(headerField3)) {
                    Matcher matcher2 = AbstractC3063bB.f4162a.matcher(headerField3);
                    if (matcher2.matches()) {
                        try {
                            String strGroup2 = matcher2.group(2);
                            strGroup2.getClass();
                            long j4 = Long.parseLong(strGroup2);
                            String strGroup3 = matcher2.group(1);
                            strGroup3.getClass();
                            long j5 = 1 + (j4 - Long.parseLong(strGroup3));
                            if (jMax < 0) {
                                jMax = j5;
                            } else if (jMax != j5) {
                                AbstractC4038mJ.f();
                                jMax = Math.max(jMax, j5);
                            }
                        } catch (NumberFormatException unused3) {
                            AbstractC4038mJ.c();
                        }
                    }
                }
                this.q = jMax != -1 ? jMax - j2 : -1L;
            }
            try {
                this.n = httpURLConnectionM.getInputStream();
                if (zEqualsIgnoreCase) {
                    this.n = new GZIPInputStream(this.n);
                }
                this.o = true;
                j(c4868vl);
                try {
                    p(j2);
                    return this.q;
                } catch (IOException e) {
                    k();
                    if (e instanceof QA) {
                        throw ((QA) e);
                    }
                    throw new QA(e, 2000, 1);
                }
            } catch (IOException e2) {
                k();
                throw new QA(e2, 2000, 1);
            }
        } catch (IOException e3) {
            k();
            throw QA.b(e3, 1);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3763j9, gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final Map getResponseHeaders() {
        HttpURLConnection httpURLConnection = this.m;
        return httpURLConnection == null ? C4405qY.g : new C3905kn(httpURLConnection.getHeaderFields());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4429ql
    public final Uri getUri() {
        HttpURLConnection httpURLConnection = this.m;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    public final void k() {
        HttpURLConnection httpURLConnection = this.m;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e) {
                AbstractC4038mJ.d("Unexpected error while disconnecting", e);
            }
            this.m = null;
        }
    }

    public final URL l(URL url, String str) throws QA {
        if (str == null) {
            throw new QA("Null location redirect", 2001);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !ProxyConfig.MATCH_HTTP.equals(protocol)) {
                throw new QA(AbstractC3888ke0.i("Unsupported protocol redirect: ", protocol), 2001);
            }
            if (this.e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            throw new QA("Disallowed cross-protocol redirect (" + url.getProtocol() + " to " + protocol + ")", 2001);
        } catch (MalformedURLException e) {
            throw new QA(e, 2001, 1);
        }
    }

    public final HttpURLConnection m(C4868vl c4868vl) throws IOException {
        C4868vl c4868vl2 = c4868vl;
        URL url = new URL(c4868vl2.f5150a.toString());
        int i = 0;
        boolean z = (c4868vl2.i & 1) == 1;
        boolean z2 = this.e;
        boolean z3 = this.k;
        int i2 = c4868vl2.c;
        byte[] bArr = c4868vl2.d;
        long j = c4868vl2.f;
        long j2 = c4868vl2.g;
        if (!z2 && !z3) {
            return n(url, i2, bArr, j, j2, z, true, c4868vl2.e);
        }
        URL urlL = url;
        byte[] bArr2 = bArr;
        int i3 = i2;
        while (true) {
            int i4 = i + 1;
            if (i > 20) {
                throw new QA(new NoRouteToHostException(AbstractC3950lJ.p("Too many redirects: ", i4)), 2001, 1);
            }
            Map map = c4868vl2.e;
            int i5 = i3;
            long j3 = j2;
            URL url2 = urlL;
            long j4 = j;
            HttpURLConnection httpURLConnectionN = n(urlL, i3, bArr2, j, j2, z, false, map);
            int responseCode = httpURLConnectionN.getResponseCode();
            String headerField = httpURLConnectionN.getHeaderField(HttpResponseHeader.Location);
            if ((i5 == 1 || i5 == 3) && (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308)) {
                httpURLConnectionN.disconnect();
                urlL = l(url2, headerField);
                i3 = i5;
            } else {
                if (i5 != 2 || (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303)) {
                    return httpURLConnectionN;
                }
                httpURLConnectionN.disconnect();
                if (z3 && responseCode == 302) {
                    i3 = i5;
                } else {
                    bArr2 = null;
                    i3 = 1;
                }
                urlL = l(url2, headerField);
            }
            c4868vl2 = c4868vl;
            i = i4;
            j2 = j3;
            j = j4;
        }
    }

    public final HttpURLConnection n(URL url, int i, byte[] bArr, long j, long j2, boolean z, boolean z2, Map map) throws IOException {
        String string;
        String str;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f);
        httpURLConnection.setReadTimeout(this.g);
        HashMap map2 = new HashMap();
        RE re = this.i;
        if (re != null) {
            map2.putAll(re.a());
        }
        map2.putAll(this.j.a());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        Pattern pattern = AbstractC3063bB.f4162a;
        if (j == 0 && j2 == -1) {
            string = null;
        } else {
            StringBuilder sbP = DM.p("bytes=", j, "-");
            if (j2 != -1) {
                sbP.append((j + j2) - 1);
            }
            string = sbP.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty("Range", string);
        }
        String str2 = this.h;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str2);
        }
        httpURLConnection.setRequestProperty(HttpRequestHeader.AcceptEncoding, z ? Constants.CP_GZIP : "identity");
        httpURLConnection.setInstanceFollowRedirects(z2);
        httpURLConnection.setDoOutput(bArr != null);
        int i2 = C4868vl.k;
        if (i == 1) {
            str = "GET";
        } else if (i == 2) {
            str = "POST";
        } else {
            if (i != 3) {
                throw new IllegalStateException();
            }
            str = Net.HttpMethods.HEAD;
        }
        httpURLConnection.setRequestMethod(str);
        if (bArr != null) {
            httpURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpURLConnection.connect();
            OutputStream outputStream = httpURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
        } else {
            httpURLConnection.connect();
        }
        return httpURLConnection;
    }

    public final void p(long j) throws IOException {
        if (j == 0) {
            return;
        }
        byte[] bArr = new byte[4096];
        while (j > 0) {
            int iMin = (int) Math.min(j, 4096);
            InputStream inputStream = this.n;
            int i = Ug0.f3833a;
            int i2 = inputStream.read(bArr, 0, iMin);
            if (Thread.currentThread().isInterrupted()) {
                throw new QA(new InterruptedIOException(), 2000, 1);
            }
            if (i2 == -1) {
                throw new QA();
            }
            j -= (long) i2;
            g(i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x0029 A[Catch: IOException -> 0x0033, TRY_LEAVE, TryCatch #0 {IOException -> 0x0033, blocks: (B:4:0x0004, B:6:0x000d, B:9:0x0018, B:10:0x001e, B:13:0x0029), top: B:18:0x0004 }] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3813jl
    public final int read(byte[] bArr, int i, int i2) throws QA {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        try {
            long j = this.q;
            if (j != -1) {
                long j2 = j - this.r;
                if (j2 != 0) {
                    i2 = (int) Math.min(i2, j2);
                    InputStream inputStream = this.n;
                    int i4 = Ug0.f3833a;
                    i3 = inputStream.read(bArr, i, i2);
                    if (i3 == -1) {
                        this.r += (long) i3;
                        g(i3);
                        return i3;
                    }
                }
            } else {
                InputStream inputStream2 = this.n;
                int i5 = Ug0.f3833a;
                i3 = inputStream2.read(bArr, i, i2);
                if (i3 == -1) {
                    this.r += (long) i3;
                    g(i3);
                    return i3;
                }
            }
            return -1;
        } catch (IOException e) {
            int i6 = Ug0.f3833a;
            throw QA.b(e, 2);
        }
    }
}
