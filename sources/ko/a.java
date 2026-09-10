package ko;

import com.google.android.gms.internal.auth.i;
import java.security.GeneralSecurityException;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.jvm.internal.n;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class a extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f44751c;

    public a(b trustRootIndex) {
        n.f(trustRootIndex, "trustRootIndex");
        this.f44751c = trustRootIndex;
    }

    @Override // com.google.android.gms.internal.auth.i
    public final List d(List chain, String hostname) throws SSLPeerUnverifiedException {
        n.f(chain, "chain");
        n.f(hostname, "hostname");
        ArrayDeque arrayDeque = new ArrayDeque(chain);
        ArrayList arrayList = new ArrayList();
        Object objRemoveFirst = arrayDeque.removeFirst();
        n.e(objRemoveFirst, "queue.removeFirst()");
        arrayList.add(objRemoveFirst);
        int i10 = 0;
        boolean z10 = false;
        while (i10 < 9) {
            Object obj = arrayList.get(arrayList.size() - 1);
            n.d(obj, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            X509Certificate x509Certificate = (X509Certificate) obj;
            b bVar = this.f44751c;
            bVar.getClass();
            Set set = (Set) bVar.f44752a.get(x509Certificate.getIssuerX500Principal());
            X509Certificate x509Certificate2 = null;
            Object obj2 = null;
            if (set != null) {
                for (Object obj3 : set) {
                    try {
                        x509Certificate.verify(((X509Certificate) obj3).getPublicKey());
                        obj2 = obj3;
                        break;
                    } catch (Exception unused) {
                    }
                }
                x509Certificate2 = (X509Certificate) obj2;
            }
            if (x509Certificate2 != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(x509Certificate2)) {
                    arrayList.add(x509Certificate2);
                }
                if (n.a(x509Certificate2.getIssuerDN(), x509Certificate2.getSubjectDN())) {
                    try {
                        x509Certificate2.verify(x509Certificate2.getPublicKey());
                        return arrayList;
                    } catch (GeneralSecurityException unused2) {
                    }
                }
                z10 = true;
                i10++;
                z10 = z10;
            } else {
                Iterator it = arrayDeque.iterator();
                n.e(it, "queue.iterator()");
                while (true) {
                    if (!it.hasNext()) {
                        if (!z10) {
                            throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate);
                        }
                        return arrayList;
                    }
                    Object next = it.next();
                    n.d(next, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    X509Certificate x509Certificate3 = (X509Certificate) next;
                    if (n.a(x509Certificate.getIssuerDN(), x509Certificate3.getSubjectDN())) {
                        try {
                            x509Certificate.verify(x509Certificate3.getPublicKey());
                            it.remove();
                            arrayList.add(x509Certificate3);
                            break;
                        } catch (GeneralSecurityException unused3) {
                            continue;
                        }
                    }
                }
                i10++;
                z10 = z10;
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a) && n.a(((a) obj).f44751c, this.f44751c);
    }

    public final int hashCode() {
        return this.f44751c.hashCode();
    }
}
