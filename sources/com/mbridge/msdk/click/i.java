package com.mbridge.msdk.click;

import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.internal.measurement.f2;
import com.ironsource.C0375hc;
import com.mbridge.msdk.foundation.download.Command;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f31670f = "i";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.setting.g f31671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f31672b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31673c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f31674d = 3145728;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.mbridge.msdk.click.entity.a f31675e;

    public i() {
        com.mbridge.msdk.setting.g gVarI = f2.i(com.mbridge.msdk.setting.i.b());
        this.f31671a = gVarI;
        if (gVarI == null) {
            this.f31671a = com.mbridge.msdk.setting.i.b().a();
        }
    }

    public com.mbridge.msdk.click.entity.a a(String str, boolean z10, boolean z11, CampaignEx campaignEx) {
        int i10;
        HttpsURLConnection httpsURLConnection = null;
        if (!URLUtil.isNetworkUrl(str)) {
            return null;
        }
        String strReplace = str.replace(" ", "%20");
        this.f31675e = new com.mbridge.msdk.click.entity.a();
        try {
            HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) new URL(strReplace).openConnection();
            try {
                httpsURLConnection2.setHostnameVerifier(new MBridgeHostnameVerifier(strReplace));
                httpsURLConnection2.setRequestMethod(C0375hc.f28788a);
                if ((!z10 && !z11) || campaignEx == null) {
                    httpsURLConnection2.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, m0.i());
                }
                if (z10 && campaignEx != null && campaignEx.getcUA() == 1) {
                    httpsURLConnection2.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, m0.i());
                }
                if (z11 && campaignEx != null && campaignEx.getImpUA() == 1) {
                    httpsURLConnection2.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, m0.i());
                }
                httpsURLConnection2.setRequestProperty("Accept-Encoding", "gzip");
                if (this.f31671a.O0() && !TextUtils.isEmpty(this.f31672b)) {
                    httpsURLConnection2.setRequestProperty("referer", this.f31672b);
                }
                httpsURLConnection2.setConnectTimeout(60000);
                httpsURLConnection2.setReadTimeout(60000);
                httpsURLConnection2.setInstanceFollowRedirects(false);
                httpsURLConnection2.connect();
                this.f31675e.f31648a = httpsURLConnection2.getHeaderField("Location");
                this.f31675e.f31651d = httpsURLConnection2.getHeaderField("Referer");
                this.f31675e.f31653f = httpsURLConnection2.getResponseCode();
                this.f31675e.f31649b = httpsURLConnection2.getContentType();
                this.f31675e.f31652e = httpsURLConnection2.getContentLength();
                this.f31675e.f31650c = httpsURLConnection2.getContentEncoding();
                boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(this.f31675e.f31650c);
                com.mbridge.msdk.click.entity.a aVar = this.f31675e;
                if (aVar.f31653f == 200 && this.f31673c && (i10 = aVar.f31652e) > 0 && i10 < 3145728 && !TextUtils.isEmpty(strReplace)) {
                    try {
                        String strA = a(httpsURLConnection2.getInputStream(), zEqualsIgnoreCase);
                        if (!TextUtils.isEmpty(strA)) {
                            byte[] bytes = strA.getBytes();
                            if (bytes.length > 0 && bytes.length < 3145728) {
                                this.f31675e.f31654g = strA.trim();
                            }
                        }
                    } catch (Throwable th2) {
                        q0.b(f31670f, th2.getMessage());
                    }
                }
                this.f31672b = strReplace;
                httpsURLConnection2.disconnect();
                return this.f31675e;
            } catch (Throwable th3) {
                th = th3;
                httpsURLConnection = httpsURLConnection2;
                try {
                    this.f31675e.f31655h = th.getMessage();
                    return this.f31675e;
                } finally {
                    if (httpsURLConnection != null) {
                        httpsURLConnection.disconnect();
                    }
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0036 A[Catch: all -> 0x000f, TryCatch #5 {all -> 0x000f, blocks: (B:4:0x0008, B:9:0x0013, B:23:0x0032, B:25:0x0036, B:26:0x0043), top: B:45:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x004e A[Catch: Exception -> 0x002f, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Exception -> 0x002f, blocks: (B:18:0x002b, B:28:0x004e), top: B:41:0x0006 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0063 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private String a(InputStream inputStream, boolean z10) throws Throwable {
        BufferedReader bufferedReader;
        Throwable th2;
        Exception e10;
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader2 = null;
        try {
            if (z10) {
                try {
                    try {
                        inputStream = new GZIPInputStream(inputStream);
                    } catch (Throwable th3) {
                        th2 = th3;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception e11) {
                                q0.b(f31670f, e11.getMessage());
                            }
                        }
                        throw th2;
                    }
                } catch (Exception e12) {
                    e10 = e12;
                    if (this.f31675e == null) {
                        com.mbridge.msdk.click.entity.a aVar = new com.mbridge.msdk.click.entity.a();
                        this.f31675e = aVar;
                        aVar.f31655h = e10.getMessage();
                    }
                    q0.b(f31670f, e10.getMessage());
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    return sb2.toString();
                }
            }
            bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    sb2.append(line);
                } catch (Exception e13) {
                    e10 = e13;
                    bufferedReader2 = bufferedReader;
                    if (this.f31675e == null) {
                        com.mbridge.msdk.click.entity.a aVar2 = new com.mbridge.msdk.click.entity.a();
                        this.f31675e = aVar2;
                        aVar2.f31655h = e10.getMessage();
                    }
                    q0.b(f31670f, e10.getMessage());
                    if (bufferedReader2 != null) {
                        bufferedReader2.close();
                    }
                    return sb2.toString();
                } catch (Throwable th4) {
                    th2 = th4;
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    throw th2;
                }
            }
            bufferedReader.close();
        } catch (Exception e14) {
            q0.b(f31670f, e14.getMessage());
        }
        return sb2.toString();
    }
}
