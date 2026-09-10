package xn;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0 f53983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f53984b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f53985c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wj.j f53986d;

    public k(a0 a0Var, h hVar, List list, jk.a aVar) {
        this.f53983a = a0Var;
        this.f53984b = hVar;
        this.f53985c = list;
        this.f53986d = r9.b.u(new nm.n(aVar, 1));
    }

    public final List a() {
        return (List) this.f53986d.getValue();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return kVar.f53983a == this.f53983a && kotlin.jvm.internal.n.a(kVar.f53984b, this.f53984b) && kotlin.jvm.internal.n.a(kVar.a(), a()) && kotlin.jvm.internal.n.a(kVar.f53985c, this.f53985c);
    }

    public final int hashCode() {
        return this.f53985c.hashCode() + ((a().hashCode() + ((this.f53984b.hashCode() + ((this.f53983a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31)) * 31)) * 31);
    }

    public final String toString() {
        String type;
        String type2;
        List<Certificate> listA = a();
        ArrayList arrayList = new ArrayList(xj.p.W(listA, 10));
        for (Certificate certificate : listA) {
            if (certificate instanceof X509Certificate) {
                type2 = ((X509Certificate) certificate).getSubjectDN().toString();
            } else {
                type2 = certificate.getType();
                kotlin.jvm.internal.n.e(type2, "type");
            }
            arrayList.add(type2);
        }
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder("Handshake{tlsVersion=");
        sb2.append(this.f53983a);
        sb2.append(" cipherSuite=");
        sb2.append(this.f53984b);
        sb2.append(" peerCertificates=");
        sb2.append(string);
        sb2.append(" localCertificates=");
        List<Certificate> list = this.f53985c;
        ArrayList arrayList2 = new ArrayList(xj.p.W(list, 10));
        for (Certificate certificate2 : list) {
            if (certificate2 instanceof X509Certificate) {
                type = ((X509Certificate) certificate2).getSubjectDN().toString();
            } else {
                type = certificate2.getType();
                kotlin.jvm.internal.n.e(type, "type");
            }
            arrayList2.add(type);
        }
        sb2.append(arrayList2);
        sb2.append('}');
        return sb2.toString();
    }
}
