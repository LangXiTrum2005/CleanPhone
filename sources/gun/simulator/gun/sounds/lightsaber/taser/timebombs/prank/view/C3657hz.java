package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3657hz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Oc0 f4481a;
    public final C2800Ue b;
    public final List c;
    public final Ma0 d;

    public C3657hz(Oc0 oc0, C2800Ue c2800Ue, List list, InterfaceC2714Qw interfaceC2714Qw) {
        AbstractC2995aW.q(oc0, "tlsVersion");
        AbstractC2995aW.q(c2800Ue, "cipherSuite");
        AbstractC2995aW.q(list, "localCertificates");
        this.f4481a = oc0;
        this.b = c2800Ue;
        this.c = list;
        this.d = AbstractC2340Cl.I(new X9(interfaceC2714Qw, 14));
    }

    public final List a() {
        return (List) this.d.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C3657hz) {
            C3657hz c3657hz = (C3657hz) obj;
            if (c3657hz.f4481a == this.f4481a && AbstractC2995aW.i(c3657hz.b, this.b) && AbstractC2995aW.i(c3657hz.a(), a()) && AbstractC2995aW.i(c3657hz.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((a().hashCode() + ((this.b.hashCode() + ((this.f4481a.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(AbstractC2749Sf.Y(10, listA));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                AbstractC2995aW.p(type2, "type");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb = new StringBuilder("Handshake{tlsVersion=");
        sb.append(this.f4481a);
        sb.append(" cipherSuite=");
        sb.append(this.b);
        sb.append(" peerCertificates=");
        sb.append(string);
        sb.append(" localCertificates=");
        List<Certificate> list = this.c;
        ArrayList arrayList2 = new ArrayList(AbstractC2749Sf.Y(10, list));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                AbstractC2995aW.p(type, "type");
            }
            arrayList2.add(type);
        }
        sb.append(arrayList2);
        sb.append('}');
        return sb.toString();
    }
}
