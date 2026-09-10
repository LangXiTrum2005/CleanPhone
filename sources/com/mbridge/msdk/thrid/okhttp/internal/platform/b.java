package com.mbridge.msdk.thrid.okhttp.internal.platform;

import android.os.Build;
import android.util.Log;
import com.mbridge.msdk.thrid.okhttp.w;
import com.unity3d.services.core.fid.Constants;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
class b extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Class<?> f36569c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f<Socket> f36570d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final f<Socket> f36571e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f<Socket> f36572f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f<Socket> f36573g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c f36574h = c.a();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class a extends com.mbridge.msdk.thrid.okhttp.internal.tls.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f36575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f36576b;

        public a(Object obj, Method method) {
            this.f36575a = obj;
            this.f36576b = method;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.tls.c
        public List<Certificate> a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.f36576b.invoke(this.f36575a, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e11.getMessage());
                sSLPeerUnverifiedException.initCause(e11);
                throw sSLPeerUnverifiedException;
            }
        }

        public boolean equals(Object obj) {
            return obj instanceof a;
        }

        public int hashCode() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.platform.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class C0188b implements com.mbridge.msdk.thrid.okhttp.internal.tls.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final X509TrustManager f36577a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f36578b;

        public C0188b(X509TrustManager x509TrustManager, Method method) {
            this.f36578b = method;
            this.f36577a = x509TrustManager;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.tls.e
        public X509Certificate a(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.f36578b.invoke(this.f36577a, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
            } catch (IllegalAccessException e10) {
                throw com.mbridge.msdk.thrid.okhttp.internal.c.a("unable to get issues and signature", (Exception) e10);
            } catch (InvocationTargetException unused) {
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C0188b)) {
                return false;
            }
            C0188b c0188b = (C0188b) obj;
            return this.f36577a.equals(c0188b.f36577a) && this.f36578b.equals(c0188b.f36578b);
        }

        public int hashCode() {
            return (this.f36578b.hashCode() * 31) + this.f36577a.hashCode();
        }
    }

    public b(Class<?> cls, f<Socket> fVar, f<Socket> fVar2, f<Socket> fVar3, f<Socket> fVar4) {
        this.f36569c = cls;
        this.f36570d = fVar;
        this.f36571e = fVar2;
        this.f36572f = fVar3;
        this.f36573g = fVar4;
    }

    public static g h() {
        Class<?> cls;
        f fVar;
        f fVar2;
        try {
            if (!g.f()) {
                return null;
            }
            try {
                cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            } catch (ClassNotFoundException unused) {
                cls = Class.forName("org.apache.harmony.xnet.provider.jsse.SSLParametersImpl");
            }
            Class<?> cls2 = cls;
            f fVar3 = new f(null, "setUseSessionTickets", Boolean.TYPE);
            f fVar4 = new f(null, "setHostname", String.class);
            if (j()) {
                fVar = new f(byte[].class, "getAlpnSelectedProtocol", new Class[0]);
                fVar2 = new f(null, "setAlpnProtocols", byte[].class);
            } else {
                fVar = null;
                fVar2 = null;
            }
            return new b(cls2, fVar3, fVar4, fVar, fVar2);
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    public static int i() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    private static boolean j() {
        if (Security.getProvider("GMSCore_OpenSSL") != null) {
            return true;
        }
        try {
            Class.forName("android.net.Network");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public void a(Socket socket, InetSocketAddress inetSocketAddress, int i10) throws IOException {
        try {
            socket.connect(inetSocketAddress, i10);
        } catch (AssertionError e10) {
            if (!com.mbridge.msdk.thrid.okhttp.internal.c.a(e10)) {
                throw e10;
            }
            throw new IOException(e10);
        } catch (ClassCastException e11) {
            throw e11;
        } catch (SecurityException e12) {
            IOException iOException = new IOException("Exception in connect");
            iOException.initCause(e12);
            throw iOException;
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public String b(SSLSocket sSLSocket) {
        byte[] bArr;
        f<Socket> fVar = this.f36572f;
        if (fVar == null || !fVar.a(sSLSocket) || (bArr = (byte[]) this.f36572f.d(sSLSocket, new Object[0])) == null) {
            return null;
        }
        return new String(bArr, com.mbridge.msdk.thrid.okhttp.internal.c.f36267j);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public SSLContext e() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e10) {
            throw new IllegalStateException("No TLS provider", e10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Method f36579a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Method f36580b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Method f36581c;

        public c(Method method, Method method2, Method method3) {
            this.f36579a = method;
            this.f36580b = method2;
            this.f36581c = method3;
        }

        public Object a(String str) {
            Method method = this.f36579a;
            if (method != null) {
                try {
                    Object objInvoke = method.invoke(null, null);
                    this.f36580b.invoke(objInvoke, str);
                    return objInvoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        public boolean a(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                this.f36581c.invoke(obj, null);
                return true;
            } catch (Exception unused) {
                return false;
            }
        }

        public static c a() throws NoSuchMethodException {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod("get", null);
                method2 = cls.getMethod("open", String.class);
                method = cls.getMethod("warnIfOpen", null);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new c(method3, method2, method);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public boolean b(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return b(str, cls, cls.getMethod(Constants.GET_INSTANCE, null).invoke(null, null));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.b(str);
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e10) {
            throw com.mbridge.msdk.thrid.okhttp.internal.c.a("unable to determine cleartext support", e10);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public void a(SSLSocket sSLSocket, String str, List<w> list) throws IOException {
        if (str != null) {
            this.f36570d.c(sSLSocket, Boolean.TRUE);
            this.f36571e.c(sSLSocket, str);
        }
        f<Socket> fVar = this.f36573g;
        if (fVar == null || !fVar.a(sSLSocket)) {
            return;
        }
        this.f36573g.d(sSLSocket, g.b(list));
    }

    private boolean b(String str, Class<?> cls, Object obj) throws IllegalAccessException, InvocationTargetException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return a(str, cls, obj);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public void a(int i10, String str, Throwable th2) {
        int iMin;
        int i11 = i10 != 5 ? 3 : 5;
        if (th2 != null) {
            str = str + '\n' + Log.getStackTraceString(th2);
        }
        int length = str.length();
        int i12 = 0;
        while (i12 < length) {
            int iIndexOf = str.indexOf(10, i12);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf, i12 + 4000);
                Log.println(i11, "OkHttp", str.substring(i12, iMin));
                if (iMin >= iIndexOf) {
                    break;
                } else {
                    i12 = iMin;
                }
            }
            i12 = iMin + 1;
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public com.mbridge.msdk.thrid.okhttp.internal.tls.e b(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new C0188b(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.b(x509TrustManager);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public Object a(String str) {
        return this.f36574h.a(str);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public void a(String str, Object obj) {
        if (this.f36574h.a(obj)) {
            return;
        }
        a(5, str, (Throwable) null);
    }

    private boolean a(String str, Class<?> cls, Object obj) throws IllegalAccessException, InvocationTargetException {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", null).invoke(obj, null)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.b(str);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.platform.g
    public com.mbridge.msdk.thrid.okhttp.internal.tls.c a(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new a(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.a(x509TrustManager);
        }
    }
}
