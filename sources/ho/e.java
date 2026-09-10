package ho;

import an.p;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements k {
    @Override // ho.k
    public final m create(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> superclass = cls;
        while (!superclass.getSimpleName().equals("OpenSSLSocketImpl")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                throw new AssertionError(defpackage.e.l(cls, "No OpenSSLSocketImpl superclass of socket of type "));
            }
        }
        return new f(superclass);
    }

    @Override // ho.k
    public final boolean matchesSocket(SSLSocket sSLSocket) {
        return p.p0(sSLSocket.getClass().getName(), "com.google.android.gms.org.conscrypt.", false);
    }
}
