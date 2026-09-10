package com.thinkup.core.common.no.m.o.on;

import android.os.Build;
import android.util.Log;
import com.thinkup.core.common.no.m.o.mm.om;
import com.thinkup.core.common.no.m.omn;
import com.thinkup.core.common.no.m.on0;
import com.unity3d.services.core.fid.Constants;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.cert.Certificate;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: classes6.dex */
class m extends com.thinkup.core.common.no.m.o.on.n {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f42042n = 4000;
    private final Method m0;
    private final C0675m mm = C0675m.o();
    private final Method mo;
    private final Class<?> o0;
    private final Method om;
    private final Method on;
    private final Class<?> oo;

    public static final class n implements om {
        private final Method m;
        private final X509TrustManager o;

        public n(X509TrustManager x509TrustManager, Method method) {
            this.m = method;
            this.o = x509TrustManager;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof n)) {
                return false;
            }
            n nVar = (n) obj;
            return this.o.equals(nVar.o) && this.m.equals(nVar.m);
        }

        public final int hashCode() {
            return (this.m.hashCode() * 31) + this.o.hashCode();
        }

        @Override // com.thinkup.core.common.no.m.o.mm.om
        public final X509Certificate o(X509Certificate x509Certificate) {
            try {
                TrustAnchor trustAnchor = (TrustAnchor) this.m.invoke(this.o, x509Certificate);
                if (trustAnchor != null) {
                    return trustAnchor.getTrustedCert();
                }
            } catch (IllegalAccessException e2) {
                throw new AssertionError("unable to get issues and signature", e2);
            } catch (InvocationTargetException unused) {
            }
            return null;
        }
    }

    public static final class o extends com.thinkup.core.common.no.m.o.mm.n {
        private final Method m;
        private final Object o;

        public o(Object obj, Method method) {
            this.o = obj;
            this.m = method;
        }

        public final boolean equals(Object obj) {
            return obj instanceof o;
        }

        public final int hashCode() {
            return 0;
        }

        @Override // com.thinkup.core.common.no.m.o.mm.n
        public final List<Certificate> o(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
            try {
                return (List) this.m.invoke(this.o, (X509Certificate[]) list.toArray(new X509Certificate[list.size()]), "RSA", str);
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                SSLPeerUnverifiedException sSLPeerUnverifiedException = new SSLPeerUnverifiedException(e3.getMessage());
                sSLPeerUnverifiedException.initCause(e3);
                throw sSLPeerUnverifiedException;
            }
        }
    }

    public m(Class<?> cls, Class<?> cls2, Method method, Method method2, Method method3, Method method4) {
        this.o0 = cls;
        this.oo = cls2;
        this.om = method;
        this.on = method2;
        this.m0 = method3;
        this.mo = method4;
    }

    public static int o0() {
        try {
            return Build.VERSION.SDK_INT;
        } catch (NoClassDefFoundError unused) {
            return 0;
        }
    }

    @Override // com.thinkup.core.common.no.m.o.on.n
    public final boolean m(String str) {
        try {
            Class<?> cls = Class.forName("android.security.NetworkSecurityPolicy");
            return o(str, cls, cls.getMethod(Constants.GET_INSTANCE, new Class[0]).invoke(null, new Object[0]));
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return super.m(str);
        } catch (IllegalAccessException e2) {
            e = e2;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (IllegalArgumentException e3) {
            e = e3;
            throw new AssertionError("unable to determine cleartext support", e);
        } catch (InvocationTargetException e4) {
            e = e4;
            throw new AssertionError("unable to determine cleartext support", e);
        }
    }

    @Override // com.thinkup.core.common.no.m.o.on.n
    public final SSLContext n() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    @Override // com.thinkup.core.common.no.m.o.on.n
    public final void o(Socket socket, InetSocketAddress inetSocketAddress, int i2) throws IOException {
        try {
            socket.connect(inetSocketAddress, i2);
        } catch (AssertionError e2) {
            if (!com.thinkup.core.common.no.m.o.n.o(e2)) {
                throw e2;
            }
            throw new IOException(e2);
        } catch (ClassCastException e3) {
            if (Build.VERSION.SDK_INT != 26) {
                throw e3;
            }
            throw new IOException("Exception in connect", e3);
        }
    }

    /* JADX INFO: renamed from: com.thinkup.core.common.no.m.o.on.m$m, reason: collision with other inner class name */
    public static final class C0675m {
        private final Method m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final Method f42043n;
        private final Method o;

        private C0675m(Method method, Method method2, Method method3) {
            this.o = method;
            this.m = method2;
            this.f42043n = method3;
        }

        public final Object o(String str) {
            Method method = this.o;
            if (method != null) {
                try {
                    Object objInvoke = method.invoke(null, new Object[0]);
                    this.m.invoke(objInvoke, str);
                    return objInvoke;
                } catch (Exception unused) {
                }
            }
            return null;
        }

        public final boolean o(Object obj) {
            if (obj != null) {
                try {
                    this.f42043n.invoke(obj, new Object[0]);
                    return true;
                } catch (Exception unused) {
                }
            }
            return false;
        }

        public static C0675m o() {
            Method method;
            Method method2;
            Method method3;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                method = cls.getMethod("get", new Class[0]);
                method3 = cls.getMethod(MRAIDPresenter.OPEN, String.class);
                method2 = cls.getMethod("warnIfOpen", new Class[0]);
            } catch (Exception unused) {
                method = null;
                method2 = null;
                method3 = null;
            }
            return new C0675m(method, method3, method2);
        }
    }

    private boolean m(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", new Class[0]).invoke(obj, new Object[0])).booleanValue();
        } catch (NoSuchMethodException unused) {
            return super.m(str);
        }
    }

    @Override // com.thinkup.core.common.no.m.o.on.n
    public final X509TrustManager o(SSLSocketFactory sSLSocketFactory) {
        Object objO = com.thinkup.core.common.no.m.o.on.n.o(sSLSocketFactory, this.o0, "sslParameters");
        if (objO == null) {
            try {
                objO = com.thinkup.core.common.no.m.o.on.n.o(sSLSocketFactory, Class.forName("com.google.android.gms.org.conscrypt.SSLParametersImpl", false, sSLSocketFactory.getClass().getClassLoader()), "sslParameters");
            } catch (ClassNotFoundException unused) {
                return super.o(sSLSocketFactory);
            }
        }
        X509TrustManager x509TrustManager = (X509TrustManager) com.thinkup.core.common.no.m.o.on.n.o(objO, X509TrustManager.class, "x509TrustManager");
        return x509TrustManager != null ? x509TrustManager : (X509TrustManager) com.thinkup.core.common.no.m.o.on.n.o(objO, X509TrustManager.class, "trustManager");
    }

    public static com.thinkup.core.common.no.m.o.on.n m() {
        if (!com.thinkup.core.common.no.m.o.on.n.on()) {
            return null;
        }
        try {
            Class<?> cls = Class.forName("com.android.org.conscrypt.SSLParametersImpl");
            Class<?> cls2 = Class.forName("com.android.org.conscrypt.OpenSSLSocketImpl");
            try {
                return new m(cls, cls2, cls2.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE), cls2.getMethod("setHostname", String.class), cls2.getMethod("getAlpnSelectedProtocol", new Class[0]), cls2.getMethod("setAlpnProtocols", byte[].class));
            } catch (NoSuchMethodException unused) {
                throw new IllegalStateException("Expected Android API level 21+ but was " + Build.VERSION.SDK_INT);
            }
        } catch (ClassNotFoundException unused2) {
            return null;
        }
    }

    @Override // com.thinkup.core.common.no.m.o.on.n
    public void o(SSLSocket sSLSocket, String str, List<on0> list) {
        if (this.oo.isInstance(sSLSocket)) {
            if (str != null) {
                try {
                    this.om.invoke(sSLSocket, Boolean.TRUE);
                    this.on.invoke(sSLSocket, str);
                } catch (IllegalAccessException e2) {
                    e = e2;
                    throw new AssertionError(e);
                } catch (InvocationTargetException e3) {
                    e = e3;
                    throw new AssertionError(e);
                }
            }
            Method method = this.mo;
            com.thinkup.core.common.no.n.n nVar = new com.thinkup.core.common.no.n.n();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                on0 on0Var = list.get(i2);
                if (on0Var != on0.HTTP_1_0) {
                    nVar.n0(on0Var.toString().length());
                    nVar.m(on0Var.toString());
                }
            }
            method.invoke(sSLSocket, nVar.omo());
        }
    }

    @Override // com.thinkup.core.common.no.m.o.on.n
    public final om m(X509TrustManager x509TrustManager) {
        try {
            Method declaredMethod = x509TrustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            declaredMethod.setAccessible(true);
            return new n(x509TrustManager, declaredMethod);
        } catch (NoSuchMethodException unused) {
            return super.m(x509TrustManager);
        }
    }

    @Override // com.thinkup.core.common.no.m.o.on.n
    public String o(SSLSocket sSLSocket) {
        if (!this.oo.isInstance(sSLSocket)) {
            return null;
        }
        try {
            byte[] bArr = (byte[]) this.m0.invoke(sSLSocket, new Object[0]);
            if (bArr != null) {
                return new String(bArr, StandardCharsets.UTF_8);
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new AssertionError(e2);
        }
    }

    @Override // com.thinkup.core.common.no.m.o.on.n
    public final void o(int i2, String str, Throwable th) {
        int iMin;
        int i3 = i2 != 5 ? 3 : 5;
        if (th != null) {
            str = str + '\n' + Log.getStackTraceString(th);
        }
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            int iIndexOf = str.indexOf(10, i4);
            if (iIndexOf == -1) {
                iIndexOf = length;
            }
            while (true) {
                iMin = Math.min(iIndexOf, i4 + 4000);
                Log.println(i3, omn.o, str.substring(i4, iMin));
                if (iMin >= iIndexOf) {
                    break;
                } else {
                    i4 = iMin;
                }
            }
            i4 = iMin + 1;
        }
    }

    @Override // com.thinkup.core.common.no.m.o.on.n
    public final Object o(String str) {
        return this.mm.o(str);
    }

    @Override // com.thinkup.core.common.no.m.o.on.n
    public final void o(String str, Object obj) {
        if (this.mm.o(obj)) {
            return;
        }
        o(5, str, (Throwable) null);
    }

    private boolean o(String str, Class<?> cls, Object obj) {
        try {
            return ((Boolean) cls.getMethod("isCleartextTrafficPermitted", String.class).invoke(obj, str)).booleanValue();
        } catch (NoSuchMethodException unused) {
            return m(str, cls, obj);
        }
    }

    @Override // com.thinkup.core.common.no.m.o.on.n
    public final com.thinkup.core.common.no.m.o.mm.n o(X509TrustManager x509TrustManager) {
        try {
            Class<?> cls = Class.forName("android.net.http.X509TrustManagerExtensions");
            return new o(cls.getConstructor(X509TrustManager.class).newInstance(x509TrustManager), cls.getMethod("checkServerTrusted", X509Certificate[].class, String.class, String.class));
        } catch (Exception unused) {
            return super.o(x509TrustManager);
        }
    }
}
