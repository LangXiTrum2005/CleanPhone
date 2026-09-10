package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.Command;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class k20 extends yg1 implements vv1 {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final Pattern f16277t = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final AtomicReference f16278u = new AtomicReference();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final j20 f16279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16280f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f16281g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f16282h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final iw0 f16283i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public HttpURLConnection f16284j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public InputStream f16285k;
    public boolean l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f16286m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f16287n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f16288o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f16289p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f16290q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f16291r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final HashSet f16292s;

    public k20(String str, r20 r20Var, int i10, int i11, int i12) {
        super(true);
        this.f16279e = new j20(this);
        this.f16292s = new HashSet();
        ps1.v(true ^ TextUtils.isEmpty(str));
        this.f16282h = str;
        this.f16283i = new iw0(10);
        this.f16280f = i10;
        this.f16281g = i11;
        this.f16291r = i12;
        if (r20Var != null) {
            n(r20Var);
        }
    }

    public final void f() {
        HttpURLConnection httpURLConnection = this.f16284j;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                int i10 = zze.zza;
                zzo.zzg("Unexpected error while disconnecting", e10);
            }
            this.f16284j = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:115:0x028f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:? A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:84:0x0230  */
    /* JADX WARN: Code duplicated, block: B:91:0x0261 A[Catch: IOException -> 0x003d, TryCatch #3 {IOException -> 0x003d, blocks: (B:3:0x000c, B:4:0x001e, B:6:0x0026, B:8:0x0034, B:11:0x0040, B:12:0x0058, B:14:0x005e, B:22:0x0088, B:24:0x00ab, B:26:0x00d1, B:27:0x00d6, B:40:0x010c, B:89:0x0254, B:91:0x0261, B:93:0x0272, B:96:0x027b, B:97:0x0288, B:99:0x028f, B:100:0x0296, B:101:0x0297, B:102:0x02b4), top: B:111:0x000c }] */
    @Override // com.google.android.gms.internal.ads.wk1
    public final long l(po1 po1Var) throws ot1 {
        long j10;
        int responseCode;
        String headerField;
        String protocol;
        int responseCode2;
        su1 su1Var;
        long jMax;
        long j11 = 0;
        this.f16290q = 0L;
        this.f16289p = 0L;
        try {
            Uri uri = po1Var.f18750a;
            long j12 = po1Var.f18752c;
            long j13 = po1Var.f18753d;
            URL url = new URL(uri.toString());
            int i10 = 0;
            while (true) {
                int i11 = i10 + 1;
                long j14 = j11;
                if (i10 > 20) {
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 20);
                    sb2.append("Too many redirects: ");
                    sb2.append(i11);
                    throw new NoRouteToHostException(sb2.toString());
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(this.f16279e);
                }
                httpURLConnection.setConnectTimeout(this.f16280f);
                httpURLConnection.setReadTimeout(this.f16281g);
                for (Map.Entry entry : this.f16283i.e().entrySet()) {
                    httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                if (j12 == j14) {
                    if (j13 != -1) {
                        j10 = j14;
                    }
                    httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, this.f16282h);
                    httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                    httpURLConnection.setInstanceFollowRedirects(false);
                    httpURLConnection.setDoOutput(false);
                    httpURLConnection.connect();
                    responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                        this.f16284j = httpURLConnection;
                        try {
                            responseCode2 = httpURLConnection.getResponseCode();
                            this.f16286m = responseCode2;
                            if (responseCode2 >= 200 || responseCode2 > 299) {
                                this.f16284j.getHeaderFields();
                                f();
                                int i12 = this.f16286m;
                                String str = uu0.f20901a;
                                su1Var = new su1(i12, null);
                                if (this.f16286m == 416) {
                                    throw su1Var;
                                }
                                su1Var.initCause(new xl1());
                                throw su1Var;
                            }
                            if (responseCode2 != 200 || j12 == j14) {
                                j12 = j14;
                            }
                            this.f16287n = j12;
                            if (j13 != -1) {
                                this.f16288o = j13;
                            } else {
                                HttpURLConnection httpURLConnection2 = this.f16284j;
                                String headerField2 = httpURLConnection2.getHeaderField("Content-Length");
                                if (TextUtils.isEmpty(headerField2)) {
                                    jMax = -1;
                                } else {
                                    try {
                                        jMax = Long.parseLong(headerField2);
                                    } catch (NumberFormatException unused) {
                                        String strJ = q4.a.j(new StringBuilder(String.valueOf(headerField2).length() + 28), "Unexpected Content-Length [", headerField2, X3.j.f27836e);
                                        int i13 = zze.zza;
                                        zzo.zzf(strJ);
                                        jMax = -1;
                                    }
                                }
                                String headerField3 = httpURLConnection2.getHeaderField("Content-Range");
                                if (!TextUtils.isEmpty(headerField3)) {
                                    Matcher matcher = f16277t.matcher(headerField3);
                                    if (matcher.find()) {
                                        try {
                                            long j15 = (Long.parseLong(matcher.group(2)) - Long.parseLong(matcher.group(1))) + 1;
                                            if (jMax < j14) {
                                                jMax = j15;
                                            } else if (jMax != j15) {
                                                StringBuilder sb3 = new StringBuilder(String.valueOf(headerField2).length() + 25 + String.valueOf(headerField3).length() + 1);
                                                sb3.append("Inconsistent headers [");
                                                sb3.append(headerField2);
                                                sb3.append("] [");
                                                sb3.append(headerField3);
                                                sb3.append(X3.j.f27836e);
                                                String string = sb3.toString();
                                                int i14 = zze.zza;
                                                zzo.zzi(string);
                                                jMax = Math.max(jMax, j15);
                                            }
                                        } catch (NumberFormatException unused2) {
                                            String strJ2 = q4.a.j(new StringBuilder(String.valueOf(headerField3).length() + 27), "Unexpected Content-Range [", headerField3, X3.j.f27836e);
                                            int i15 = zze.zza;
                                            zzo.zzf(strJ2);
                                        }
                                    }
                                }
                                this.f16288o = jMax != -1 ? jMax - this.f16287n : -1L;
                            }
                            try {
                                this.f16285k = this.f16284j.getInputStream();
                                this.l = true;
                                c(po1Var);
                                return this.f16288o;
                            } catch (IOException e10) {
                                f();
                                throw new ot1(2000, 1, e10);
                            }
                        } catch (IOException e11) {
                            f();
                            throw new ot1("Unable to connect to ".concat(String.valueOf(po1Var.f18750a.toString())), e11, 2000, 1);
                        }
                    }
                    headerField = httpURLConnection.getHeaderField("Location");
                    httpURLConnection.disconnect();
                    if (headerField != null) {
                        throw new ProtocolException("Null location redirect");
                    }
                    URL url2 = new URL(url, headerField);
                    protocol = url2.getProtocol();
                    if (!"https".equals(protocol) && !"http".equals(protocol)) {
                        throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                    }
                    url = url2;
                    i10 = i11;
                    j11 = j14;
                } else {
                    j10 = j12;
                }
                StringBuilder sb4 = new StringBuilder(String.valueOf(j10).length() + 7);
                sb4.append("bytes=");
                long j16 = j10;
                sb4.append(j16);
                sb4.append("-");
                String string2 = sb4.toString();
                if (j13 != -1) {
                    long j17 = (j16 + j13) - 1;
                    StringBuilder sb5 = new StringBuilder(string2.length() + String.valueOf(j17).length());
                    sb5.append(string2);
                    sb5.append(j17);
                    string2 = sb5.toString();
                }
                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, string2);
                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, this.f16282h);
                httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.connect();
                responseCode = httpURLConnection.getResponseCode();
                if (responseCode != 300) {
                    this.f16284j = httpURLConnection;
                    responseCode2 = httpURLConnection.getResponseCode();
                    this.f16286m = responseCode2;
                    if (responseCode2 >= 200) {
                    }
                    this.f16284j.getHeaderFields();
                    f();
                    int i16 = this.f16286m;
                    String str2 = uu0.f20901a;
                    su1Var = new su1(i16, null);
                    if (this.f16286m == 416) {
                        throw su1Var;
                    }
                    su1Var.initCause(new xl1());
                    throw su1Var;
                }
                headerField = httpURLConnection.getHeaderField("Location");
                httpURLConnection.disconnect();
                if (headerField != null) {
                    throw new ProtocolException("Null location redirect");
                }
                URL url3 = new URL(url, headerField);
                protocol = url3.getProtocol();
                if (!"https".equals(protocol)) {
                    throw new ProtocolException("Unsupported protocol redirect: ".concat(String.valueOf(protocol)));
                }
                url = url3;
                i10 = i11;
                j11 = j14;
            }
        } catch (IOException e12) {
            throw new ot1("Unable to connect to ".concat(String.valueOf(po1Var.f18750a.toString())), e12, 2000, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0074 A[Catch: IOException -> 0x008b, TryCatch #0 {IOException -> 0x008b, blocks: (B:2:0x0000, B:21:0x0054, B:23:0x005c, B:26:0x0066, B:27:0x006c, B:29:0x0074, B:32:0x007b, B:33:0x0080, B:34:0x0081, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:14:0x0042, B:15:0x0047, B:16:0x0048, B:17:0x004d, B:18:0x004e), top: B:39:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007b A[Catch: IOException -> 0x008b, TryCatch #0 {IOException -> 0x008b, blocks: (B:2:0x0000, B:21:0x0054, B:23:0x005c, B:26:0x0066, B:27:0x006c, B:29:0x0074, B:32:0x007b, B:33:0x0080, B:34:0x0081, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:14:0x0042, B:15:0x0047, B:16:0x0048, B:17:0x004d, B:18:0x004e), top: B:39:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0081 A[Catch: IOException -> 0x008b, TRY_LEAVE, TryCatch #0 {IOException -> 0x008b, blocks: (B:2:0x0000, B:21:0x0054, B:23:0x005c, B:26:0x0066, B:27:0x006c, B:29:0x0074, B:32:0x007b, B:33:0x0080, B:34:0x0081, B:5:0x000b, B:7:0x0016, B:8:0x001a, B:10:0x0022, B:13:0x0038, B:14:0x0042, B:15:0x0047, B:16:0x0048, B:17:0x004d, B:18:0x004e), top: B:39:0x0000 }] */
    @Override // com.google.android.gms.internal.ads.vx1
    public final int t(byte[] bArr, int i10, int i11) throws ot1 {
        int i12;
        try {
            if (this.f16289p != this.f16287n) {
                AtomicReference atomicReference = f16278u;
                byte[] bArr2 = (byte[]) atomicReference.getAndSet(null);
                if (bArr2 == null) {
                    bArr2 = new byte[4096];
                }
                while (true) {
                    long j10 = this.f16289p;
                    long j11 = this.f16287n;
                    if (j10 == j11) {
                        atomicReference.set(bArr2);
                        break;
                    }
                    int i13 = this.f16285k.read(bArr2, 0, (int) Math.min(j11 - j10, bArr2.length));
                    if (Thread.interrupted()) {
                        throw new InterruptedIOException();
                    }
                    if (i13 == -1) {
                        throw new EOFException();
                    }
                    this.f16289p += (long) i13;
                    d(i13);
                }
            }
            if (i11 == 0) {
                return 0;
            }
            long j12 = this.f16288o;
            if (j12 != -1) {
                long j13 = j12 - this.f16290q;
                if (j13 != 0) {
                    i11 = (int) Math.min(i11, j13);
                    i12 = this.f16285k.read(bArr, i10, i11);
                    if (i12 == -1) {
                        this.f16290q += (long) i12;
                        d(i12);
                        return i12;
                    }
                    if (this.f16288o != -1) {
                        throw new EOFException();
                    }
                }
            } else {
                i12 = this.f16285k.read(bArr, i10, i11);
                if (i12 == -1) {
                    this.f16290q += (long) i12;
                    d(i12);
                    return i12;
                }
                if (this.f16288o != -1) {
                    throw new EOFException();
                }
            }
            return -1;
        } catch (IOException e10) {
            throw new ot1(2000, 2, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f16284j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public final void zzd() {
        HashSet hashSet = this.f16292s;
        try {
            InputStream inputStream = this.f16285k;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new ot1(2000, 3, e10);
                }
            }
            this.f16285k = null;
            f();
            if (this.l) {
                this.l = false;
                e();
            }
            hashSet.clear();
        } catch (Throwable th2) {
            this.f16285k = null;
            f();
            if (this.l) {
                this.l = false;
                e();
            }
            hashSet.clear();
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.f16284j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
