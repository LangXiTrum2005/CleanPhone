package com.smartdigimkt.m0;

import android.text.TextUtils;
import com.p004ironsource.ko;
import com.smartdigimkt.h0.j;
import com.smartdigimkt.k0.c;
import com.smartdigimkt.l0.f;
import com.unity3d.services.core.network.model.HttpRequest;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
public class b implements com.smartdigimkt.m0.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f36549c = 100;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.smartdigimkt.k0.a f36550a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SSLSocketFactory f36551b;

    public static class a extends FilterInputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final HttpURLConnection f36552a;

        public a(HttpURLConnection httpURLConnection) {
            super(b.b(httpURLConnection));
            this.f36552a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.f36552a.disconnect();
        }
    }

    public b(SSLSocketFactory sSLSocketFactory, com.smartdigimkt.k0.a aVar) {
        this.f36551b = sSLSocketFactory;
        this.f36550a = aVar;
    }

    private static boolean a(int i2, int i3) {
        if (i2 != 4) {
            return ((100 <= i3 && i3 < 200) || i3 == 204 || i3 == 304) ? false : true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputStream b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    private static void b(HttpURLConnection httpURLConnection, j<?> jVar) throws IOException {
        switch (jVar.i()) {
            case 0:
                httpURLConnection.setRequestMethod(ko.f25534a);
                return;
            case 1:
                httpURLConnection.setRequestMethod(ko.f25535b);
                a(httpURLConnection, jVar);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                a(httpURLConnection, jVar);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                a(httpURLConnection, jVar);
                httpURLConnection.setRequestMethod("PATCH");
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    @Override // com.smartdigimkt.m0.a
    public com.smartdigimkt.n0.b a(j<?> jVar) throws IOException {
        HttpURLConnection httpURLConnectionA = a(new URL(jVar.o()), jVar);
        try {
            for (Map.Entry<String, String> entry : jVar.h().entrySet()) {
                httpURLConnectionA.setRequestProperty(entry.getKey(), entry.getValue());
            }
            b(httpURLConnectionA, jVar);
            int responseCode = httpURLConnectionA.getResponseCode();
            if (responseCode != -1) {
                if (!a(jVar.i(), responseCode)) {
                    com.smartdigimkt.n0.b bVar = new com.smartdigimkt.n0.b(responseCode, a(httpURLConnectionA.getHeaderFields()));
                    httpURLConnectionA.disconnect();
                    return bVar;
                }
                return new com.smartdigimkt.n0.b(responseCode, a(httpURLConnectionA.getHeaderFields()), new a(httpURLConnectionA));
            }
            throw new IOException("Could not retrieve response code from HttpUrlConnection.");
        } catch (Throwable th) {
            if (0 == 0) {
                httpURLConnectionA.disconnect();
            }
            throw th;
        }
    }

    public static List<c> a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new c(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    public HttpURLConnection a(URL url) throws IOException {
        HttpURLConnection httpURLConnection;
        com.smartdigimkt.k0.a aVar = this.f36550a;
        if (aVar != null && !TextUtils.isEmpty(aVar.f36130b) && !TextUtils.isEmpty(this.f36550a.f36131c)) {
            Proxy.Type type = Proxy.Type.HTTP;
            com.smartdigimkt.k0.a aVar2 = this.f36550a;
            httpURLConnection = (HttpURLConnection) url.openConnection(new Proxy(type, new InetSocketAddress(aVar2.f36130b, Integer.valueOf(aVar2.f36131c).intValue())));
        } else {
            httpURLConnection = (HttpURLConnection) url.openConnection();
        }
        httpURLConnection.setInstanceFollowRedirects(false);
        return httpURLConnection;
    }

    private HttpURLConnection a(URL url, j<?> jVar) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        HttpURLConnection httpURLConnectionA = a(url);
        int iN = jVar.n();
        httpURLConnectionA.setConnectTimeout(iN);
        httpURLConnectionA.setReadTimeout(iN);
        httpURLConnectionA.setUseCaches(false);
        httpURLConnectionA.setDoInput(true);
        if (HttpRequest.DEFAULT_SCHEME.equals(url.getProtocol()) && (sSLSocketFactory = this.f36551b) != null) {
            ((HttpsURLConnection) httpURLConnectionA).setSSLSocketFactory(sSLSocketFactory);
        }
        return httpURLConnectionA;
    }

    private static void a(HttpURLConnection httpURLConnection, j<?> jVar) throws IOException {
        byte[] bArrG = jVar.g();
        if (bArrG != null) {
            boolean z2 = jVar instanceof f;
            if (z2) {
                httpURLConnection.setChunkedStreamingMode(com.p004ironsource.mediationsdk.metadata.a.f25965n);
            }
            httpURLConnection.setDoOutput(true);
            DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
            dataOutputStream.write(bArrG);
            if (z2) {
                jVar.a((OutputStream) dataOutputStream);
            }
            dataOutputStream.close();
        }
    }
}
