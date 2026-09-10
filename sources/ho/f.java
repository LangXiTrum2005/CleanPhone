package ho;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public class f implements m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f42469f = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f42470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f42471b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f42472c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Method f42473d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Method f42474e;

    public f(Class cls) throws NoSuchMethodException {
        this.f42470a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        n.e(declaredMethod, "sslSocketClass.getDeclar…:class.javaPrimitiveType)");
        this.f42471b = declaredMethod;
        this.f42472c = cls.getMethod("setHostname", String.class);
        this.f42473d = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f42474e = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // ho.m
    public final void configureTlsExtensions(SSLSocket sSLSocket, String str, List protocols) {
        n.f(protocols, "protocols");
        if (this.f42470a.isInstance(sSLSocket)) {
            try {
                this.f42471b.invoke(sSLSocket, Boolean.TRUE);
                if (str != null) {
                    this.f42472c.invoke(sSLSocket, str);
                }
                Method method = this.f42474e;
                go.m mVar = go.m.f42045a;
                method.invoke(sSLSocket, com.bumptech.glide.d.q(protocols));
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                throw new AssertionError(e11);
            }
        }
    }

    @Override // ho.m
    public final String getSelectedProtocol(SSLSocket sSLSocket) {
        if (this.f42470a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f42473d.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, an.a.f3768a);
                }
            } catch (IllegalAccessException e10) {
                throw new AssertionError(e10);
            } catch (InvocationTargetException e11) {
                Throwable cause = e11.getCause();
                if (!(cause instanceof NullPointerException) || !n.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e11);
                }
            }
        }
        return null;
    }

    @Override // ho.m
    public final boolean isSupported() {
        int i10 = go.b.f42026c;
        return false;
    }

    @Override // ho.m
    public final boolean matchesSocket(SSLSocket sSLSocket) {
        return this.f42470a.isInstance(sSLSocket);
    }
}
