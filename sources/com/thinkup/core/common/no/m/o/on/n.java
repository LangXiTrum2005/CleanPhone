package com.thinkup.core.common.no.m.o.on;

import android.support.v4.media.a;
import com.thinkup.core.common.no.m.o.mm.om;
import com.thinkup.core.common.no.m.omm;
import com.thinkup.core.common.no.m.omn;
import com.thinkup.core.common.no.m.on0;
import java.io.IOException;
import java.lang.reflect.Field;
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

/* JADX INFO: loaded from: classes6.dex */
public class n {
    public static final int m = 5;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final n f42044n;
    public static final int o = 4;
    private static final Logger o0;

    static {
        n nVarO = o.o();
        if (nVarO == null && (nVarO = m.m()) == null) {
            throw new NullPointerException("No platform found on Android");
        }
        f42044n = nVarO;
        o0 = Logger.getLogger(omm.class.getName());
    }

    private static n m0() {
        n nVarO = o.o();
        if (nVarO != null) {
            return nVarO;
        }
        n nVarM = m.m();
        if (nVarM != null) {
            return nVarM;
        }
        throw new NullPointerException("No platform found on Android");
    }

    private static void mo() {
    }

    private static n o0() {
        n nVarO = o.o();
        if (nVarO != null) {
            return nVarO;
        }
        n nVarM = m.m();
        if (nVarM != null) {
            return nVarM;
        }
        throw new NullPointerException("No platform found on Android");
    }

    public static String om() {
        return omn.o;
    }

    public static boolean on() {
        return "Dalvik".equals(System.getProperty("java.vm.name"));
    }

    public static n oo() {
        return f42044n;
    }

    public boolean m(String str) {
        return true;
    }

    public SSLContext n() {
        try {
            return SSLContext.getInstance("TLS");
        } catch (NoSuchAlgorithmException e2) {
            throw new IllegalStateException("No TLS provider", e2);
        }
    }

    public String o(SSLSocket sSLSocket) {
        return null;
    }

    public String toString() {
        return getClass().getSimpleName();
    }

    private static void o() {
    }

    public final com.thinkup.core.common.no.m.o.mm.n m(SSLSocketFactory sSLSocketFactory) {
        X509TrustManager x509TrustManagerO = o(sSLSocketFactory);
        if (x509TrustManagerO != null) {
            return o(x509TrustManagerO);
        }
        throw new IllegalStateException("Unable to extract the trust manager on " + f42044n + ", sslSocketFactory is " + sSLSocketFactory.getClass());
    }

    public void o(SSLSocket sSLSocket, String str, List<on0> list) {
    }

    public X509TrustManager o(SSLSocketFactory sSLSocketFactory) {
        try {
            Object objO = o(sSLSocketFactory, Class.forName("sun.security.ssl.SSLContextImpl"), "context");
            if (objO == null) {
                return null;
            }
            return (X509TrustManager) o(objO, X509TrustManager.class, "trustManager");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public void o(Socket socket, InetSocketAddress inetSocketAddress, int i2) throws IOException {
        socket.connect(inetSocketAddress, i2);
    }

    private static boolean m() {
        if ("conscrypt".equals(com.thinkup.core.common.no.m.o.n.o("okhttp.platform", (String) null))) {
            return true;
        }
        return "Conscrypt".equals(Security.getProviders()[0].getName());
    }

    public void o(int i2, String str, Throwable th) {
        o0.log(i2 == 5 ? Level.WARNING : Level.INFO, str, th);
    }

    public Object o(String str) {
        if (o0.isLoggable(Level.FINE)) {
            return new Throwable(str);
        }
        return null;
    }

    private static byte[] m(List<on0> list) {
        com.thinkup.core.common.no.n.n nVar = new com.thinkup.core.common.no.n.n();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            on0 on0Var = list.get(i2);
            if (on0Var != on0.HTTP_1_0) {
                nVar.n0(on0Var.toString().length());
                nVar.m(on0Var.toString());
            }
        }
        return nVar.omo();
    }

    public void o(String str, Object obj) {
        if (obj == null) {
            str = a.m(str, " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);");
        }
        o(5, str, (Throwable) obj);
    }

    public om m(X509TrustManager x509TrustManager) {
        return new com.thinkup.core.common.no.m.o.mm.m(x509TrustManager.getAcceptedIssuers());
    }

    private static List<String> o(List<on0> list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            on0 on0Var = list.get(i2);
            if (on0Var != on0.HTTP_1_0) {
                arrayList.add(on0Var.toString());
            }
        }
        return arrayList;
    }

    public com.thinkup.core.common.no.m.o.mm.n o(X509TrustManager x509TrustManager) {
        return new com.thinkup.core.common.no.m.o.mm.o(m(x509TrustManager));
    }

    public static <T> T o(Object obj, Class<T> cls, String str) {
        do {
            for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
                try {
                    Field declaredField = superclass.getDeclaredField(str);
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (cls.isInstance(obj2)) {
                        return cls.cast(obj2);
                    }
                    return null;
                } catch (IllegalAccessException unused) {
                    throw new AssertionError();
                } catch (NoSuchFieldException unused2) {
                }
            }
            if (str.equals("delegate")) {
                break;
            }
            obj = o(obj, (Class<Object>) Object.class, "delegate");
        } while (obj != null);
        return null;
    }
}
