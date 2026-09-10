package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4073mj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4709a;
    public int b;
    public boolean c;
    public boolean d;

    public C4073mj(List list) {
        AbstractC2995aW.q(list, "connectionSpecs");
        this.f4709a = list;
    }

    public final C3985lj a(SSLSocket sSLSocket) throws UnknownServiceException {
        C3985lj c3985lj;
        int i;
        boolean z;
        String[] enabledCipherSuites;
        String[] enabledProtocols;
        int i2 = this.b;
        List list = this.f4709a;
        int size = list.size();
        while (true) {
            if (i2 >= size) {
                c3985lj = null;
                break;
            }
            int i3 = i2 + 1;
            c3985lj = (C3985lj) list.get(i2);
            if (c3985lj.b(sSLSocket)) {
                this.b = i3;
                break;
            }
            i2 = i3;
        }
        if (c3985lj == null) {
            StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
            sb.append(this.d);
            sb.append(", modes=");
            sb.append(list);
            sb.append(", supported protocols=");
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            AbstractC2995aW.n(enabledProtocols2);
            String string = Arrays.toString(enabledProtocols2);
            AbstractC2995aW.p(string, "toString(this)");
            sb.append(string);
            throw new UnknownServiceException(sb.toString());
        }
        int i4 = this.b;
        int size2 = list.size();
        while (true) {
            i = 0;
            if (i4 >= size2) {
                z = false;
                break;
            }
            int i5 = i4 + 1;
            if (((C3985lj) list.get(i4)).b(sSLSocket)) {
                z = true;
                break;
            }
            i4 = i5;
        }
        this.c = z;
        boolean z2 = this.d;
        String[] strArr = c3985lj.c;
        if (strArr != null) {
            String[] enabledCipherSuites2 = sSLSocket.getEnabledCipherSuites();
            AbstractC2995aW.p(enabledCipherSuites2, "sslSocket.enabledCipherSuites");
            enabledCipherSuites = Vg0.o(C2800Ue.c, enabledCipherSuites2, strArr);
        } else {
            enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        }
        String[] strArr2 = c3985lj.d;
        if (strArr2 != null) {
            String[] enabledProtocols3 = sSLSocket.getEnabledProtocols();
            AbstractC2995aW.p(enabledProtocols3, "sslSocket.enabledProtocols");
            enabledProtocols = Vg0.o(C4134nR.f4743a, enabledProtocols3, strArr2);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        AbstractC2995aW.p(supportedCipherSuites, "supportedCipherSuites");
        C2607Mt c2607Mt = C2800Ue.c;
        byte[] bArr = Vg0.f3884a;
        int length = supportedCipherSuites.length;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            if (c2607Mt.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            }
            i++;
        }
        if (z2 && i != -1) {
            AbstractC2995aW.p(enabledCipherSuites, "cipherSuitesIntersection");
            String str = supportedCipherSuites[i];
            AbstractC2995aW.p(str, "supportedCipherSuites[indexOfFallbackScsv]");
            Object[] objArrCopyOf = Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            AbstractC2995aW.p(objArrCopyOf, "copyOf(this, newSize)");
            enabledCipherSuites = (String[]) objArrCopyOf;
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        C3897kj c3897kj = new C3897kj();
        c3897kj.f4609a = c3985lj.f4659a;
        c3897kj.b = strArr;
        c3897kj.c = strArr2;
        c3897kj.d = c3985lj.b;
        AbstractC2995aW.p(enabledCipherSuites, "cipherSuitesIntersection");
        c3897kj.c((String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length));
        AbstractC2995aW.p(enabledProtocols, "tlsVersionsIntersection");
        c3897kj.f((String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length));
        C3985lj c3985ljA = c3897kj.a();
        if (c3985ljA.c() != null) {
            sSLSocket.setEnabledProtocols(c3985ljA.d);
        }
        if (c3985ljA.a() != null) {
            sSLSocket.setEnabledCipherSuites(c3985ljA.c);
        }
        return c3985lj;
    }
}
