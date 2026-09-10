package com.mbridge.msdk.thrid.okhttp.internal.platform;

import com.mbridge.msdk.thrid.okhttp.v;
import com.mbridge.msdk.thrid.okhttp.w;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final g f36595a = c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f36596b = Logger.getLogger(v.class.getName());

    private static g c() {
        return f() ? a() : b();
    }

    public static g d() {
        return f36595a;
    }

    public static boolean f() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static boolean g() {
        if ("conscrypt".equals(System.getProperty("okhttp.platform"))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    public void a(SSLSocket sSLSocket) {
    }

    public String b(SSLSocket sSLSocket) {
        return null;
    }

    public SSLContext e() {
        if ("1.7".equals(System.getProperty("java.specification.version"))) {
            try {
                return SSLContext.getInstance("TLSv1.2");
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException("No TLS provider", e10);
        }
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    public void a(SSLSocket sSLSocket, String str, List<w> list) throws IOException {
    }

    public boolean b(String str) {
        return true;
    }

    private static g b() {
        c cVarH;
        if (g() && (cVarH = c.h()) != null) {
            return cVarH;
        }
        d dVarH = d.h();
        if (dVarH != null) {
            return dVarH;
        }
        g gVarH = e.h();
        return gVarH != null ? gVarH : new g();
    }

    public void a(SSLSocketFactory sSLSocketFactory) {
    }

    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        socket.connect(inetSocketAddress, i10);
    }

    public void a(int i10, String str, Throwable th2) {
        f36596b.log(i10 == 5 ? Level.WARNING : Level.INFO, str, th2);
    }

    public Object a(String str) {
        if (f36596b.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    public static byte[] b(List<w> list) {
        com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            w wVar = list.get(i10);
            if (wVar != w.HTTP_1_0) {
                cVar.writeByte(wVar.toString().length());
                cVar.a(wVar.toString());
            }
        }
        return cVar.n();
    }

    public void a(String str, Object obj) {
        if (obj == null) {
            str = wi.d.h(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        a(5, str, (Throwable) obj);
    }

    public com.mbridge.msdk.thrid.okhttp.internal.tls.e b(X509TrustManager x509TrustManager) {
        return new com.mbridge.msdk.thrid.okhttp.internal.tls.b(x509TrustManager.getAcceptedIssuers());
    }

    public static List<String> a(List<w> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            w wVar = list.get(i10);
            if (wVar != w.HTTP_1_0) {
                arrayList.add(wVar.toString());
            }
        }
        return arrayList;
    }

    public com.mbridge.msdk.thrid.okhttp.internal.tls.c a(X509TrustManager x509TrustManager) {
        return new com.mbridge.msdk.thrid.okhttp.internal.tls.a(b(x509TrustManager));
    }

    private static g a() {
        g gVarH = a.h();
        if (gVarH != null) {
            return gVarH;
        }
        g gVarH2 = b.h();
        if (gVarH2 != null) {
            return gVarH2;
        }
        throw new NullPointerException("No platform found on Android");
    }
}
