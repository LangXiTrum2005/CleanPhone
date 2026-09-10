package com.smartdigimkt.o;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.mbridge.msdk.foundation.download.Command;
import com.p004ironsource.ko;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes.dex */
public class f {
    private static final String f = "f";
    private static final int g = 60000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.smartdigimkt.n1.a f37251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f37252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f37253c = true;
    private final int d = 3145728;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.smartdigimkt.p.a f37254e;

    public f() {
        com.smartdigimkt.n1.a aVarC = com.smartdigimkt.n1.b.b().c(com.smartdigimkt.u.a.f().a());
        this.f37251a = aVarC;
        if (aVarC == null) {
            this.f37251a = com.smartdigimkt.n1.b.b().a();
        }
    }

    public void a(boolean z2) {
        this.f37253c = z2;
    }

    public com.smartdigimkt.p.a a(String str, boolean z2, boolean z3, com.smartdigimkt.x.d dVar) {
        int i2;
        HttpURLConnection httpURLConnection = null;
        if (!URLUtil.isNetworkUrl(str)) {
            return null;
        }
        String strReplace = str.replace(" ", "%20");
        this.f37254e = new com.smartdigimkt.p.a();
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(strReplace).openConnection();
            try {
                httpURLConnection2.setRequestMethod(ko.f25534a);
                if ((!z2 && !z3) || dVar == null) {
                    httpURLConnection2.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, com.smartdigimkt.n8.c.w());
                }
                if (z2 && dVar != null && dVar.z2() == 1) {
                    httpURLConnection2.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, com.smartdigimkt.n8.c.w());
                }
                if (z3 && dVar != null && dVar.O0() == 1) {
                    httpURLConnection2.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, com.smartdigimkt.n8.c.w());
                }
                httpURLConnection2.setRequestProperty("Accept-Encoding", com.smartdigimkt.o0.b.d);
                if (this.f37251a.u1() && !TextUtils.isEmpty(this.f37252b)) {
                    httpURLConnection2.setRequestProperty("referer", this.f37252b);
                }
                httpURLConnection2.setConnectTimeout(60000);
                httpURLConnection2.setReadTimeout(60000);
                httpURLConnection2.setInstanceFollowRedirects(false);
                httpURLConnection2.connect();
                this.f37254e.f37474a = httpURLConnection2.getHeaderField("Location");
                this.f37254e.d = httpURLConnection2.getHeaderField("Referer");
                this.f37254e.f = httpURLConnection2.getResponseCode();
                this.f37254e.f37475b = httpURLConnection2.getContentType();
                this.f37254e.f37477e = httpURLConnection2.getContentLength();
                this.f37254e.f37476c = httpURLConnection2.getContentEncoding();
                boolean zEqualsIgnoreCase = com.smartdigimkt.o0.b.d.equalsIgnoreCase(this.f37254e.f37476c);
                com.smartdigimkt.p.a aVar = this.f37254e;
                if (aVar.f == 200 && this.f37253c && (i2 = aVar.f37477e) > 0 && i2 < 3145728 && !TextUtils.isEmpty(strReplace)) {
                    try {
                        String strA = a(httpURLConnection2.getInputStream(), zEqualsIgnoreCase);
                        if (!TextUtils.isEmpty(strA)) {
                            byte[] bytes = strA.getBytes();
                            if (bytes.length > 0 && bytes.length < 3145728) {
                                this.f37254e.g = strA.trim();
                            }
                        }
                    } catch (Throwable th) {
                        th.getMessage();
                    }
                }
                this.f37252b = strReplace;
                httpURLConnection2.disconnect();
                return this.f37254e;
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnection2;
                try {
                    this.f37254e.f37478h = th.getMessage();
                    return this.f37254e;
                } finally {
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0036 A[Catch: all -> 0x000f, TryCatch #5 {all -> 0x000f, blocks: (B:4:0x0008, B:9:0x0013, B:23:0x0032, B:25:0x0036, B:26:0x0043), top: B:45:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0048 A[Catch: Exception -> 0x002f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x002f, blocks: (B:18:0x002b, B:28:0x0048), top: B:41:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0057 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private String a(InputStream inputStream, boolean z2) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th;
        Exception e2;
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader2 = null;
        try {
            if (z2) {
                try {
                    try {
                        inputStream = new GZIPInputStream(inputStream);
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception e3) {
                                e3.getMessage();
                            }
                        }
                        throw th;
                    }
                } catch (Exception e4) {
                    e2 = e4;
                    if (this.f37254e == null) {
                        com.smartdigimkt.p.a aVar = new com.smartdigimkt.p.a();
                        this.f37254e = aVar;
                        aVar.f37478h = e2.getMessage();
                    }
                    e2.getMessage();
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    return sb.toString();
                }
            }
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb.append(line);
                } catch (Exception e5) {
                    e2 = e5;
                    bufferedReader2 = bufferedReader;
                    if (this.f37254e == null) {
                        com.smartdigimkt.p.a aVar2 = new com.smartdigimkt.p.a();
                        this.f37254e = aVar2;
                        aVar2.f37478h = e2.getMessage();
                    }
                    e2.getMessage();
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    return sb.toString();
                } catch (Throwable th3) {
                    th = th3;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th;
                }
            }
            bufferedReader.close();
        } catch (Exception e6) {
            e6.getMessage();
        }
        return sb.toString();
    }
}
