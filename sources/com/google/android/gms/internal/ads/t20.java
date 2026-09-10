package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.ads.internal.util.zze;
import com.ironsource.C0375hc;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.download.Command;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
public final class t20 extends yg1 implements vv1 {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Pattern f20118v = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20119e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f20120f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f20121g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final iw0 f20122h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public po1 f20123i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public HttpURLConnection f20124j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ArrayDeque f20125k;
    public InputStream l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f20126m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f20127n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f20128o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f20129p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public long f20130q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f20131r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f20132s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final long f20133t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f20134u;

    public t20(String str, r20 r20Var, int i10, int i11, long j10, long j11) {
        super(true);
        ps1.v(true ^ TextUtils.isEmpty(str));
        this.f20121g = str;
        this.f20122h = new iw0(10);
        this.f20119e = i10;
        this.f20120f = i11;
        this.f20125k = new ArrayDeque();
        this.f20133t = j10;
        this.f20134u = j11;
        if (r20Var != null) {
            n(r20Var);
        }
    }

    public final HttpURLConnection f(int i10, long j10, long j11) throws ot1 {
        String string = this.f20123i.f18750a.toString();
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(string).openConnection();
            httpURLConnection.setConnectTimeout(this.f20119e);
            httpURLConnection.setReadTimeout(this.f20120f);
            for (Map.Entry entry : this.f20122h.e().entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            StringBuilder sb2 = new StringBuilder(String.valueOf(j10).length() + 7 + String.valueOf(j11).length());
            sb2.append("bytes=");
            sb2.append(j10);
            sb2.append("-");
            sb2.append(j11);
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_RANGE, sb2.toString());
            httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, this.f20121g);
            httpURLConnection.setRequestProperty("Accept-Encoding", "identity");
            httpURLConnection.setRequestMethod(C0375hc.f28788a);
            httpURLConnection.connect();
            this.f20125k.add(httpURLConnection);
            String string2 = this.f20123i.f18750a.toString();
            try {
                int responseCode = httpURLConnection.getResponseCode();
                this.f20127n = responseCode;
                if (responseCode < 200 || responseCode > 299) {
                    httpURLConnection.getHeaderFields();
                    g();
                    int i11 = this.f20127n;
                    throw new s20(l1.d.k(new StringBuilder(String.valueOf(i11).length() + 15), "Response code: ", i11), 2000, i10);
                }
                try {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    if (this.l != null) {
                        inputStream = new SequenceInputStream(this.l, inputStream);
                    }
                    this.l = inputStream;
                    return httpURLConnection;
                } catch (IOException e10) {
                    g();
                    throw new ot1(2000, i10, e10);
                }
            } catch (IOException e11) {
                g();
                throw new ot1("Unable to connect to ".concat(String.valueOf(string2)), e11, 2000, i10);
            }
        } catch (IOException e12) {
            throw new ot1("Unable to connect to ".concat(String.valueOf(string)), e12, 2000, i10);
        }
    }

    public final void g() {
        while (true) {
            ArrayDeque arrayDeque = this.f20125k;
            if (arrayDeque.isEmpty()) {
                this.f20124j = null;
                return;
            }
            try {
                ((HttpURLConnection) arrayDeque.remove()).disconnect();
            } catch (Exception e10) {
                int i10 = zze.zza;
                zzo.zzg("Unexpected error while disconnecting", e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public final long l(po1 po1Var) throws ot1 {
        this.f20123i = po1Var;
        this.f20129p = 0L;
        long j10 = po1Var.f18752c;
        long j11 = po1Var.f18753d;
        long jMin = this.f20133t;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11);
        }
        this.f20130q = j10;
        HttpURLConnection httpURLConnectionF = f(1, j10, (jMin + j10) - 1);
        this.f20124j = httpURLConnectionF;
        String headerField = httpURLConnectionF.getHeaderField("Content-Range");
        if (!TextUtils.isEmpty(headerField)) {
            Matcher matcher = f20118v.matcher(headerField);
            if (matcher.find()) {
                try {
                    Long.parseLong(matcher.group(1));
                    long j12 = Long.parseLong(matcher.group(2));
                    long j13 = Long.parseLong(matcher.group(3));
                    if (j11 != -1) {
                        this.f20128o = j11;
                        this.f20131r = Math.max(j12, (this.f20130q + j11) - 1);
                    } else {
                        this.f20128o = j13 - this.f20130q;
                        this.f20131r = j13 - 1;
                    }
                    this.f20132s = j12;
                    this.f20126m = true;
                    c(po1Var);
                    return this.f20128o;
                } catch (NumberFormatException unused) {
                    String strJ = q4.a.j(new StringBuilder(String.valueOf(headerField).length() + 27), "Unexpected Content-Range [", headerField, X3.j.f27836e);
                    int i10 = zze.zza;
                    zzo.zzf(strJ);
                }
            }
        }
        throw new s20("Invalid content range: ".concat(String.valueOf(headerField)), 2000, 1);
    }

    @Override // com.google.android.gms.internal.ads.vx1
    public final int t(byte[] bArr, int i10, int i11) throws ot1 {
        if (i11 == 0) {
            return 0;
        }
        try {
            long j10 = this.f20128o;
            long j11 = this.f20129p;
            if (j10 - j11 == 0) {
                return -1;
            }
            long j12 = this.f20130q + j11;
            long j13 = i11;
            long j14 = this.f20134u;
            long j15 = j12 + j13 + j14;
            long j16 = this.f20132s;
            long j17 = j16 + 1;
            if (j15 > j17) {
                long j18 = this.f20131r;
                if (j16 < j18) {
                    long jMin = Math.min(j18, Math.max(((this.f20133t + j17) - j14) - 1, (-1) + j17 + j13));
                    f(2, j17, jMin);
                    this.f20132s = jMin;
                    j16 = jMin;
                }
            }
            int i12 = this.l.read(bArr, i10, (int) Math.min(j13, ((j16 + 1) - this.f20130q) - this.f20129p));
            if (i12 == -1) {
                throw new EOFException();
            }
            this.f20129p += (long) i12;
            d(i12);
            return i12;
        } catch (IOException e10) {
            throw new ot1(2000, 2, e10);
        }
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public final Uri zzc() {
        HttpURLConnection httpURLConnection = this.f20124j;
        if (httpURLConnection == null) {
            return null;
        }
        return Uri.parse(httpURLConnection.getURL().toString());
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public final void zzd() {
        try {
            InputStream inputStream = this.l;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e10) {
                    throw new ot1(2000, 3, e10);
                }
            }
            this.l = null;
            g();
            if (this.f20126m) {
                this.f20126m = false;
                e();
            }
        } catch (Throwable th2) {
            this.l = null;
            g();
            if (this.f20126m) {
                this.f20126m = false;
                e();
            }
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.wk1
    public final Map zzj() {
        HttpURLConnection httpURLConnection = this.f20124j;
        if (httpURLConnection == null) {
            return null;
        }
        return httpURLConnection.getHeaderFields();
    }
}
