package com.startapp.sdk.internal;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.download.Command;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes6.dex */
public abstract class tf extends HttpURLConnection {
    public static HttpURLConnection a(String str, String str2) throws UnsupportedEncodingException {
        try {
            URLDecoder.decode(str, "UTF-8");
            try {
                str = a(str);
            } catch (Exception unused) {
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            if (!TextUtils.isEmpty(str2)) {
                httpURLConnection.setRequestProperty(Command.HTTP_HEADER_USER_AGENT, str2);
            }
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(10000);
            return httpURLConnection;
        } catch (UnsupportedEncodingException unused2) {
            throw new UnsupportedEncodingException(str);
        }
    }

    public static String a(String str) {
        URI uri;
        try {
            new URI(str);
            uri = new URI(str);
        } catch (URISyntaxException unused) {
            URL url = new URL(str);
            uri = new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef());
        }
        return uri.toURL().toString();
    }
}
