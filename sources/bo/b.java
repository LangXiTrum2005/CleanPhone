package bo;

import ea.s0;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.n;
import l7.z;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f5759a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f5760b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5761c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f5762d;

    public b(s0 s0Var, int i10, boolean z10, boolean z11) {
        this.f5762d = s0Var;
        this.f5759a = i10;
        this.f5760b = z10;
        this.f5761c = z11;
    }

    public xn.i a(SSLSocket sSLSocket) throws UnknownServiceException {
        xn.i iVar;
        int i10;
        boolean z10;
        String[] cipherSuitesIntersection;
        String[] tlsVersionsIntersection;
        int i11 = this.f5759a;
        List list = (List) this.f5762d;
        int size = list.size();
        while (true) {
            if (i11 >= size) {
                iVar = null;
                break;
            }
            iVar = (xn.i) list.get(i11);
            if (iVar.b(sSLSocket)) {
                this.f5759a = i11 + 1;
                break;
            }
            i11++;
        }
        if (iVar == null) {
            StringBuilder sb2 = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb2.append(this.f5761c);
            sb2.append(", modes=");
            sb2.append(list);
            sb2.append(", supported protocols=");
            String[] enabledProtocols = sSLSocket.getEnabledProtocols();
            n.c(enabledProtocols);
            String string = Arrays.toString(enabledProtocols);
            n.e(string, "toString(this)");
            sb2.append(string);
            throw new UnknownServiceException(sb2.toString());
        }
        int i12 = this.f5759a;
        int size2 = list.size();
        while (true) {
            i10 = 0;
            if (i12 >= size2) {
                z10 = false;
                break;
            }
            if (((xn.i) list.get(i12)).b(sSLSocket)) {
                z10 = true;
                break;
            }
            i12++;
        }
        this.f5760b = z10;
        boolean z11 = this.f5761c;
        String[] strArr = iVar.f53970d;
        String[] strArr2 = iVar.f53969c;
        if (strArr2 != null) {
            String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
            n.e(enabledCipherSuites, "sslSocket.enabledCipherSuites");
            cipherSuitesIntersection = yn.a.o(enabledCipherSuites, strArr2, xn.h.f53947c);
        } else {
            cipherSuitesIntersection = sSLSocket.getEnabledCipherSuites();
        }
        if (strArr != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            n.e(enabledProtocols2, "sslSocket.enabledProtocols");
            tlsVersionsIntersection = yn.a.o(enabledProtocols2, strArr, zj.a.f54957b);
        } else {
            tlsVersionsIntersection = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        n.e(supportedCipherSuites, "supportedCipherSuites");
        xn.g gVar = xn.h.f53947c;
        byte[] bArr = yn.a.f54560a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i10 >= length) {
                i10 = -1;
                break;
            }
            if (gVar.compare(supportedCipherSuites[i10], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i10++;
        }
        if (z11 && i10 != -1) {
            n.e(cipherSuitesIntersection, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i10];
            n.e(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] objArrCopyOf = Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length + 1);
            n.e(objArrCopyOf, "copyOf(this, newSize)");
            cipherSuitesIntersection = (String[]) objArrCopyOf;
            cipherSuitesIntersection[cipherSuitesIntersection.length - 1] = str;
        }
        z zVar = new z();
        zVar.f45236a = iVar.f53967a;
        zVar.f45238c = strArr2;
        zVar.f45239d = strArr;
        zVar.f45237b = iVar.f53968b;
        n.e(cipherSuitesIntersection, "cipherSuitesIntersection");
        zVar.c((String[]) Arrays.copyOf(cipherSuitesIntersection, cipherSuitesIntersection.length));
        n.e(tlsVersionsIntersection, "tlsVersionsIntersection");
        zVar.e((String[]) Arrays.copyOf(tlsVersionsIntersection, tlsVersionsIntersection.length));
        xn.i iVarB = zVar.b();
        if (iVarB.c() != null) {
            sSLSocket.setEnabledProtocols(iVarB.f53970d);
        }
        if (iVarB.a() != null) {
            sSLSocket.setEnabledCipherSuites(iVarB.f53969c);
        }
        return iVar;
    }

    public void b(String str) {
        ((s0) this.f5762d).P0(this.f5759a, this.f5760b, this.f5761c, str, null, null, null);
    }

    public void c(Object obj, String str) {
        ((s0) this.f5762d).P0(this.f5759a, this.f5760b, this.f5761c, str, obj, null, null);
    }

    public void d(String str, Object obj, Object obj2) {
        ((s0) this.f5762d).P0(this.f5759a, this.f5760b, this.f5761c, str, obj, obj2, null);
    }

    public void e(String str, Object obj, Object obj2, Object obj3) {
        ((s0) this.f5762d).P0(this.f5759a, this.f5760b, this.f5761c, str, obj, obj2, obj3);
    }

    public b(List connectionSpecs) {
        n.f(connectionSpecs, "connectionSpecs");
        this.f5762d = connectionSpecs;
    }
}
