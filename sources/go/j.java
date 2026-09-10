package go;

import an.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.n;
import xj.p;
import xn.r;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j extends m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f42042c;

    static {
        String property = System.getProperty("java.specification.version");
        Integer numE0 = property != null ? o.e0(property) : null;
        boolean z10 = false;
        if (numE0 == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
                z10 = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numE0.intValue() >= 9) {
            z10 = true;
        }
        f42042c = z10;
    }

    @Override // go.m
    public final void d(SSLSocket sSLSocket, String str, List protocols) {
        n.f(protocols, "protocols");
        SSLParameters sSLParameters = sSLSocket.getSSLParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : protocols) {
            if (((r) obj) != r.HTTP_1_0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(p.W(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((r) it.next()).f54059a);
        }
        sSLParameters.setApplicationProtocols((String[]) arrayList2.toArray(new String[0]));
        sSLSocket.setSSLParameters(sSLParameters);
    }

    @Override // go.m
    public final String e(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
