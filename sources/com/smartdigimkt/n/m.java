package com.smartdigimkt.n;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes4.dex */
public class m extends com.smartdigimkt.u4.b {
    public static final String g = "WindVaneWebViewClient";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f36903h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f36904i = 1;
    public static final String j = "mmusdk_cache";
    public static final String k = "1";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f36905l = true;
    protected String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f36906e;
    private com.smartdigimkt.u4.c f;

    public m() {
        this.d = null;
        this.f36906e = 0;
    }

    public static String a(InputStream inputStream) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        StringBuilder sb = new StringBuilder();
        while (true) {
            try {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb.append(line + IOUtils.LINE_SEPARATOR_UNIX);
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
        return sb.toString();
    }

    public void b(com.smartdigimkt.u4.c cVar) {
        this.f = cVar;
    }

    @Override // android.webkit.WebViewClient
    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        this.d = str;
        com.smartdigimkt.u4.c cVar = this.f;
        if (cVar != null) {
            cVar.onPageStarted(webView, str, bitmap);
        }
    }

    @Override // android.webkit.WebViewClient
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        WebResourceResponse webResourceResponseA = a(str);
        return webResourceResponseA != null ? webResourceResponseA : super.shouldInterceptRequest(webView, str);
    }

    public m(int i2) {
        this.d = null;
        this.f36906e = i2;
    }

    private WebResourceResponse a(String str) {
        Bitmap bitmapC;
        try {
            if (TextUtils.isEmpty(str) || !com.smartdigimkt.v4.d.e(str) || (bitmapC = com.smartdigimkt.f0.b.a(com.smartdigimkt.u.a.f().d()).c(str)) == null || bitmapC.isRecycled()) {
                return null;
            }
            return new WebResourceResponse(com.smartdigimkt.v4.d.b(str), "utf-8", com.smartdigimkt.f0.a.a(bitmapC));
        } catch (Throwable unused) {
            return null;
        }
    }
}
