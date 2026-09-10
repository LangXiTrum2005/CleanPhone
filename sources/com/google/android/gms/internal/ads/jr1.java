package com.google.android.gms.internal.ads;

import android.net.TrafficStats;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import com.ironsource.C0375hc;
import com.mbridge.msdk.foundation.download.Command;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.NoRouteToHostException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class jr1 extends yg1 implements vv1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f16162e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f16163f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f16164g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f16165h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final iw0 f16166i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final iw0 f16167j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public po1 f16168k;
    public HttpURLConnection l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InputStream f16169m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f16170n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f16171o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f16172p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f16173q;

    public /* synthetic */ jr1(String str, int i10, int i11, boolean z10, iw0 iw0Var) {
        super(true);
        this.f16165h = str;
        this.f16163f = i10;
        this.f16164g = i11;
        this.f16162e = z10;
        this.f16166i = iw0Var;
        this.f16167j = new iw0(10);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0069  */
    public final HttpURLConnection f(URL url, long j10, long j11, boolean z10, boolean z11, Map map) throws IOException {
        StringBuilder sbL;
        String string;
        HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
        httpURLConnection.setConnectTimeout(this.f16163f);
        httpURLConnection.setReadTimeout(this.f16164g);
        HashMap map2 = new HashMap();
        map2.putAll(this.f16166i.e());
        map2.putAll(this.f16167j.e());
        map2.putAll(map);
        for (Map.Entry entry : map2.entrySet()) {
            httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
        }
        if (j10 != 0) {
            sbL = wi.d.l(j10, "bytes=", "-");
            if (j11 != -1) {
                sbL.append((j10 + j11) - 1);
            }
            string = sbL.toString();
        } else if (j11 == -1) {
            string = null;
        } else {
            j10 = 0;
            sbL = wi.d.l(j10, "bytes=", "-");
            if (j11 != -1) {
                sbL.append((j10 + j11) - 1);
            }
            string = sbL.toString();
        }
        if (string != null) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, string);
        }
        String str = this.f16165h;
        if (str != null) {
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, str);
        }
        httpURLConnection.setRequestProperty("Accept-Encoding", true != z10 ? "identity" : "gzip");
        httpURLConnection.setInstanceFollowRedirects(z11);
        httpURLConnection.setDoOutput(false);
        int i10 = po1.f18749f;
        httpURLConnection.setRequestMethod(C0375hc.f28788a);
        httpURLConnection.connect();
        return httpURLConnection;
    }

    public final URL g(URL url, String str) throws ot1 {
        if (str == null) {
            throw new ot1("Null location redirect", 2001, 1);
        }
        try {
            URL url2 = new URL(url, str);
            String protocol = url2.getProtocol();
            if (!"https".equals(protocol) && !"http".equals(protocol)) {
                throw new ot1("Unsupported protocol redirect: ".concat(String.valueOf(protocol)), 2001, 1);
            }
            if (this.f16162e || protocol.equals(url.getProtocol())) {
                return url2;
            }
            String protocol2 = url.getProtocol();
            StringBuilder sb2 = new StringBuilder(com.applovin.impl.ca.i(String.valueOf(protocol2).length() + 40, 1, protocol));
            sb2.append("Disallowed cross-protocol redirect (");
            sb2.append(protocol2);
            sb2.append(" to ");
            sb2.append(protocol);
            sb2.append(")");
            throw new ot1(sb2.toString(), 2001, 1);
        } catch (MalformedURLException e10) {
            throw new ot1(2001, 1, e10);
        }
    }

    public final void h() {
        HttpURLConnection httpURLConnection = this.l;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (Exception e10) {
                v71.J("DefaultHttpDataSource", "Unexpected error while disconnecting", e10);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0269  */
    /* JADX WARN: Code duplicated, block: B:59:0x012d  */
    /* JADX WARN: Code duplicated, block: B:61:0x0139  */
    /* JADX WARN: Code duplicated, block: B:64:0x0140 A[Catch: NumberFormatException -> 0x019a, TryCatch #5 {NumberFormatException -> 0x019a, blocks: (B:62:0x013a, B:64:0x0140, B:66:0x014b), top: B:163:0x013a }] */
    /* JADX WARN: Code duplicated, block: B:66:0x014b A[Catch: NumberFormatException -> 0x019a, TRY_LEAVE, TryCatch #5 {NumberFormatException -> 0x019a, blocks: (B:62:0x013a, B:64:0x0140, B:66:0x014b), top: B:163:0x013a }] */
    /* JADX WARN: Code duplicated, block: B:69:0x015c  */
    /* JADX WARN: Code duplicated, block: B:70:0x015e  */
    /* JADX WARN: Code duplicated, block: B:72:0x0162 A[Catch: NumberFormatException -> 0x01a3, TRY_ENTER, TryCatch #1 {NumberFormatException -> 0x01a3, blocks: (B:72:0x0162, B:75:0x019f, B:77:0x01a2), top: B:156:0x013e }] */
    /* JADX WARN: Code duplicated, block: B:74:0x019d  */
    /* JADX WARN: Code duplicated, block: B:76:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:79:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:82:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:83:0x01cd  */
    @Override // com.google.android.gms.internal.ads.wk1
    public final long l(po1 po1Var) throws Throwable {
        jr1 jr1Var;
        HttpURLConnection httpURLConnectionF;
        boolean z10;
        long j10;
        boolean z11;
        Throwable th2;
        long j11;
        Matcher matcher;
        String strGroup;
        long j12;
        String strGroup2;
        long j13;
        jr1 jr1Var2 = this;
        po1 po1Var2 = po1Var;
        jr1Var2.f16168k = po1Var2;
        jr1Var2.f16173q = 0L;
        jr1Var2.f16172p = 0L;
        a(po1Var);
        try {
            Thread threadCurrentThread = Thread.currentThread();
            TrafficStats.setThreadStatsTag((int) (Build.VERSION.SDK_INT < 36 ? threadCurrentThread.getId() : threadCurrentThread.threadId()));
            Uri uri = po1Var2.f18750a;
            long j14 = po1Var2.f18752c;
            long j15 = po1Var2.f18753d;
            URL url = new URL(uri.toString());
            long j16 = po1Var2.f18752c;
            long j17 = po1Var2.f18753d;
            boolean z12 = false;
            try {
                if (jr1Var2.f16162e) {
                    int i10 = 0;
                    while (true) {
                        int i11 = i10 + 1;
                        if (i10 > 20) {
                            StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 20);
                            sb2.append("Too many redirects: ");
                            sb2.append(i11);
                            throw new ot1(2001, 1, new NoRouteToHostException(sb2.toString()));
                        }
                        jr1Var = this;
                        HttpURLConnection httpURLConnectionF2 = jr1Var.f(url, j16, j17, z12, false, po1Var2.f18751b);
                        int responseCode = httpURLConnectionF2.getResponseCode();
                        String headerField = httpURLConnectionF2.getHeaderField("Location");
                        if (responseCode != 300 && responseCode != 301 && responseCode != 302 && responseCode != 303 && responseCode != 307 && responseCode != 308) {
                            httpURLConnectionF = httpURLConnectionF2;
                            break;
                        }
                        httpURLConnectionF2.disconnect();
                        url = jr1Var.g(url, headerField);
                        po1Var2 = po1Var;
                        i10 = i11;
                        z12 = false;
                    }
                } else {
                    httpURLConnectionF = jr1Var2.f(url, j16, j17, false, true, po1Var2.f18751b);
                    jr1Var = this;
                }
                jr1Var.l = httpURLConnectionF;
                jr1Var.f16171o = httpURLConnectionF.getResponseCode();
                httpURLConnectionF.getResponseMessage();
                int i12 = jr1Var.f16171o;
                long jMax = -1;
                if (i12 < 200 || i12 > 299) {
                    httpURLConnectionF.getHeaderFields();
                    if (jr1Var.f16171o == 416) {
                        String headerField2 = httpURLConnectionF.getHeaderField("Content-Range");
                        Pattern pattern = hw1.f15415a;
                        if (TextUtils.isEmpty(headerField2)) {
                            z10 = true;
                            j10 = -1;
                        } else {
                            Matcher matcher2 = hw1.f15416b.matcher(headerField2);
                            if (matcher2.matches()) {
                                z10 = true;
                                String strGroup3 = matcher2.group(1);
                                strGroup3.getClass();
                                j10 = Long.parseLong(strGroup3);
                            } else {
                                z10 = true;
                                j10 = -1;
                            }
                        }
                        if (j14 == j10) {
                            jr1Var.f16170n = z10;
                            c(po1Var);
                            if (
                            /*  JADX ERROR: Method code generation error
                                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v0 ??
                                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                                */
                            /*
                                Method dump skipped, instruction units count: 766
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jr1.l(com.google.android.gms.internal.ads.po1):long");
                        }

                        /* JADX WARN: Code duplicated, block: B:14:0x0028 A[Catch: IOException -> 0x0032, TRY_LEAVE, TryCatch #0 {IOException -> 0x0032, blocks: (B:5:0x0004, B:7:0x000d, B:10:0x0017, B:11:0x001d, B:14:0x0028), top: B:19:0x0004 }] */
                        @Override // com.google.android.gms.internal.ads.vx1
                        public final int t(byte[] bArr, int i10, int i11) throws ot1 {
                            int i12;
                            if (i11 == 0) {
                                return 0;
                            }
                            try {
                                long j10 = this.f16172p;
                                if (j10 != -1) {
                                    long j11 = j10 - this.f16173q;
                                    if (j11 != 0) {
                                        i11 = (int) Math.min(i11, j11);
                                        InputStream inputStream = this.f16169m;
                                        String str = uu0.f20901a;
                                        i12 = inputStream.read(bArr, i10, i11);
                                        if (i12 != -1) {
                                            this.f16173q += (long) i12;
                                            d(i12);
                                            return i12;
                                        }
                                    }
                                } else {
                                    InputStream inputStream2 = this.f16169m;
                                    String str2 = uu0.f20901a;
                                    i12 = inputStream2.read(bArr, i10, i11);
                                    if (i12 != -1) {
                                        this.f16173q += (long) i12;
                                        d(i12);
                                        return i12;
                                    }
                                }
                                return -1;
                            } catch (IOException e10) {
                                String str3 = uu0.f20901a;
                                throw ot1.a(2, e10);
                            }
                        }

                        @Override // com.google.android.gms.internal.ads.wk1
                        public final Uri zzc() {
                            HttpURLConnection httpURLConnection = this.l;
                            if (httpURLConnection != null) {
                                return Uri.parse(httpURLConnection.getURL().toString());
                            }
                            po1 po1Var = this.f16168k;
                            if (po1Var != null) {
                                return po1Var.f18750a;
                            }
                            return null;
                        }

                        @Override // com.google.android.gms.internal.ads.wk1
                        public final void zzd() {
                            try {
                                InputStream inputStream = this.f16169m;
                                if (inputStream != null) {
                                    try {
                                        inputStream.close();
                                    } catch (IOException e10) {
                                        String str = uu0.f20901a;
                                        throw new ot1(2000, 3, e10);
                                    }
                                }
                                this.f16169m = null;
                                h();
                                if (this.f16170n) {
                                    this.f16170n = false;
                                    e();
                                }
                                this.l = null;
                                this.f16168k = null;
                                TrafficStats.clearThreadStatsTag();
                            } catch (Throwable th2) {
                                this.f16169m = null;
                                h();
                                if (this.f16170n) {
                                    this.f16170n = false;
                                    e();
                                }
                                this.l = null;
                                this.f16168k = null;
                                TrafficStats.clearThreadStatsTag();
                                throw th2;
                            }
                        }

                        @Override // com.google.android.gms.internal.ads.wk1
                        public final Map zzj() {
                            HttpURLConnection httpURLConnection = this.l;
                            return httpURLConnection == null ? db1.f13484g : new uq1(httpURLConnection.getHeaderFields());
                        }
                    }
