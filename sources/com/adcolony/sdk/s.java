package com.adcolony.sdk;

import android.content.Context;
import com.mbridge.msdk.foundation.download.Command;
import com.p004ironsource.qt;
import com.vungle.ads.internal.model.AdPayload;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.zip.DataFormatException;

/* JADX INFO: loaded from: classes.dex */
class s implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HttpURLConnection f9352a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InputStream f9353b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private h0 f9354c;
    private a d;
    private String f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Map<String, List<String>> f9357i;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    boolean f9359n;
    int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f9360p;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g f9355e = null;
    private int g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f9356h = false;
    private String j = "";
    private String k = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    String f9358l = "";
    String m = "";

    public interface a {
        void a(s sVar, h0 h0Var, Map<String, List<String>> map);
    }

    public s(h0 h0Var, a aVar) {
        this.f9354c = h0Var;
        this.d = aVar;
    }

    private void a(InputStream inputStream, OutputStream outputStream) throws Exception {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            try {
                byte[] bArr = new byte[4096];
                while (true) {
                    int i2 = bufferedInputStream.read(bArr, 0, 4096);
                    if (i2 == -1) {
                        String str = "UTF-8";
                        String str2 = this.f;
                        if (str2 != null && !str2.isEmpty()) {
                            str = this.f;
                        }
                        if (outputStream instanceof ByteArrayOutputStream) {
                            String headerField = this.f9352a.getHeaderField("Content-Type");
                            if (this.f9355e == null || headerField == null || !headerField.contains("application/octet-stream") || ((ByteArrayOutputStream) outputStream).size() == 0) {
                                this.m = ((ByteArrayOutputStream) outputStream).toString(str);
                            } else {
                                this.m = this.f9355e.b(((ByteArrayOutputStream) outputStream).toByteArray());
                            }
                        }
                        bufferedInputStream.close();
                        if (outputStream != null) {
                            outputStream.close();
                        }
                        if (inputStream != null) {
                            inputStream.close();
                            return;
                        }
                        return;
                    }
                    int i3 = this.o + i2;
                    this.o = i3;
                    if (this.f9356h && i3 > this.g) {
                        throw new Exception("Data exceeds expected maximum (" + this.o + "/" + this.g + "): " + this.f9352a.getURL().toString());
                    }
                    outputStream.write(bArr, 0, i2);
                }
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            if (outputStream != null) {
                outputStream.close();
            }
            if (inputStream != null) {
                inputStream.close();
            }
            throw th3;
        }
    }

    private boolean c() throws IOException {
        f1 f1VarA = this.f9354c.a();
        String strH = c0.h(f1VarA, "content_type");
        String strH2 = c0.h(f1VarA, "content");
        f1 f1VarN = f1VarA.n("dictionaries");
        f1 f1VarN2 = f1VarA.n("dictionaries_mapping");
        this.f9358l = c0.h(f1VarA, "url");
        if (f1VarN != null) {
            g.a(f1VarN.f());
        }
        if (com.adcolony.sdk.a.b().H() && f1VarN2 != null) {
            this.f9355e = g.a(c0.i(f1VarN2, "request"), c0.i(f1VarN2, qt.f26623n));
        }
        String strH3 = c0.h(f1VarA, "user_agent");
        int iA = c0.a(f1VarA, "read_timeout", 60000);
        int iA2 = c0.a(f1VarA, "connect_timeout", 60000);
        boolean zB = c0.b(f1VarA, "no_redirect");
        this.f9358l = c0.h(f1VarA, "url");
        this.j = c0.h(f1VarA, "filepath");
        StringBuilder sb = new StringBuilder();
        sb.append(com.adcolony.sdk.a.b().z().d());
        String str = this.j;
        sb.append(str.substring(str.lastIndexOf("/") + 1));
        this.k = sb.toString();
        this.f = c0.h(f1VarA, "encoding");
        int iA3 = c0.a(f1VarA, "max_size", 0);
        this.g = iA3;
        this.f9356h = iA3 != 0;
        this.o = 0;
        this.f9353b = null;
        this.f9352a = null;
        this.f9357i = null;
        if (!this.f9358l.startsWith(AdPayload.FILE_SCHEME)) {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(this.f9358l).openConnection();
            this.f9352a = httpURLConnection;
            httpURLConnection.setReadTimeout(iA);
            this.f9352a.setConnectTimeout(iA2);
            this.f9352a.setInstanceFollowRedirects(!zB);
            if (strH3 != null && !strH3.equals("")) {
                this.f9352a.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, strH3);
            }
            if (this.f9355e != null) {
                this.f9352a.setRequestProperty("Content-Type", "application/octet-stream");
                this.f9352a.setRequestProperty("Req-Dict-Id", this.f9355e.b());
                this.f9352a.setRequestProperty("Resp-Dict-Id", this.f9355e.c());
            } else {
                this.f9352a.setRequestProperty("Accept-Charset", h.f9168a.name());
                if (!strH.equals("")) {
                    this.f9352a.setRequestProperty("Content-Type", strH);
                }
            }
            if (this.f9354c.b().equals("WebServices.post")) {
                this.f9352a.setDoOutput(true);
                g gVar = this.f9355e;
                if (gVar != null) {
                    byte[] bArrA = gVar.a(strH2);
                    this.f9352a.setFixedLengthStreamingMode(bArrA.length);
                    this.f9352a.getOutputStream().write(bArrA);
                    this.f9352a.getOutputStream().flush();
                } else {
                    this.f9352a.setFixedLengthStreamingMode(strH2.getBytes(h.f9168a).length);
                    new PrintStream(this.f9352a.getOutputStream()).print(strH2);
                }
            }
        } else if (this.f9358l.startsWith("file:///android_asset/")) {
            Context contextA = com.adcolony.sdk.a.a();
            if (contextA != null) {
                this.f9353b = contextA.getAssets().open(this.f9358l.substring(22));
            }
        } else {
            this.f9353b = new FileInputStream(this.f9358l.substring(7));
        }
        return (this.f9352a == null && this.f9353b == null) ? false : true;
    }

    private void d() throws Exception {
        OutputStream byteArrayOutputStream;
        String strB = this.f9354c.b();
        if (this.f9353b != null) {
            byteArrayOutputStream = this.j.length() == 0 ? new ByteArrayOutputStream(4096) : new FileOutputStream(new File(this.j).getAbsolutePath());
        } else if (strB.equals("WebServices.download")) {
            this.f9353b = this.f9352a.getInputStream();
            byteArrayOutputStream = new FileOutputStream(this.k);
        } else if (strB.equals("WebServices.get")) {
            this.f9353b = this.f9352a.getInputStream();
            byteArrayOutputStream = new ByteArrayOutputStream(4096);
        } else if (strB.equals("WebServices.post")) {
            this.f9352a.connect();
            this.f9353b = (this.f9352a.getResponseCode() < 200 || this.f9352a.getResponseCode() > 299) ? this.f9352a.getErrorStream() : this.f9352a.getInputStream();
            byteArrayOutputStream = new ByteArrayOutputStream(4096);
        } else {
            byteArrayOutputStream = null;
        }
        HttpURLConnection httpURLConnection = this.f9352a;
        if (httpURLConnection != null) {
            this.f9360p = httpURLConnection.getResponseCode();
            this.f9357i = this.f9352a.getHeaderFields();
        }
        a(this.f9353b, byteArrayOutputStream);
    }

    public h0 b() {
        return this.f9354c;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f9359n = false;
        try {
            if (c()) {
                d();
                this.f9359n = !this.f9354c.b().equals("WebServices.post") || this.f9360p == 200;
            }
        } catch (AssertionError e2) {
            new e0.a().a("okhttp error: ").a(e2.toString()).a(e0.f9131h);
            e2.printStackTrace();
        } catch (IllegalArgumentException e3) {
            new e0.a().a("Exception, possibly response encoded with different dictionary: ").a(e3.toString()).a(e0.f9132i);
            e3.printStackTrace();
        } catch (IllegalStateException e4) {
            new e0.a().a("okhttp error: ").a(e4.toString()).a(e0.f9131h);
            e4.printStackTrace();
            return;
        } catch (Exception e5) {
            new e0.a().a("Exception: ").a(e5.toString()).a(e0.f9131h);
            e5.printStackTrace();
        } catch (OutOfMemoryError unused) {
            new e0.a().a("Out of memory error - disabling AdColony. (").a(this.o).a("/").a(this.g).a("): " + this.f9358l).a(e0.f9131h);
            com.adcolony.sdk.a.b().b(true);
        } catch (MalformedURLException e6) {
            new e0.a().a("MalformedURLException: ").a(e6.toString()).a(e0.f9132i);
            this.f9359n = true;
        } catch (IOException e7) {
            new e0.a().a("Download of ").a(this.f9358l).a(" failed: ").a(e7.toString()).a(e0.g);
            int i2 = this.f9360p;
            if (i2 == 0) {
                i2 = 504;
            }
            this.f9360p = i2;
        } catch (DataFormatException e8) {
            new e0.a().a("Exception, possibly trying to decompress plain response: ").a(e8.toString()).a(e0.f9132i);
            e8.printStackTrace();
            return;
        }
        if (this.f9354c.b().equals("WebServices.download")) {
            a(this.k, this.j);
        }
        this.d.a(this, this.f9354c, this.f9357i);
    }

    private void a(String str, String str2) {
        try {
            String strSubstring = str2.substring(0, str2.lastIndexOf("/") + 1);
            if (str2.equals("") || strSubstring.equals(com.adcolony.sdk.a.b().z().d()) || new File(str).renameTo(new File(str2))) {
                return;
            }
            new e0.a().a("Moving of ").a(str).a(" failed.").a(e0.g);
        } catch (Exception e2) {
            new e0.a().a("Exception: ").a(e2.toString()).a(e0.f9131h);
            e2.printStackTrace();
        }
    }
}
