package ko;

import an.h;
import an.p;
import defpackage.e;
import java.security.cert.Certificate;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;
import kotlin.jvm.internal.n;
import xj.v;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class c implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f44753a = new c();

    public static List a(X509Certificate x509Certificate, int i10) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && n.a(list.get(0), Integer.valueOf(i10)) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return v.f53866a;
    }

    public static boolean b(String str) {
        int i10;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(e.h(length2, "endIndex < beginIndex: ", " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder sbU = e.u(length2, "endIndex > string.length: ", " > ");
            sbU.append(str.length());
            throw new IllegalArgumentException(sbU.toString().toString());
        }
        long j10 = 0;
        int i11 = 0;
        while (i11 < length2) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                j10++;
            } else {
                if (cCharAt < 2048) {
                    i10 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i10 = 3;
                } else {
                    int i12 = i11 + 1;
                    char cCharAt2 = i12 < length2 ? str.charAt(i12) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j10++;
                        i11 = i12;
                    } else {
                        j10 += (long) 4;
                        i11 += 2;
                    }
                }
                j10 += (long) i10;
            }
            i11++;
        }
        return length == ((int) j10);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0105  */
    public static boolean c(String host, X509Certificate x509Certificate) {
        boolean zA;
        int length;
        n.f(host, "host");
        byte[] bArr = yn.a.f54560a;
        if (yn.a.f54564e.a(host)) {
            String strO = x7.a.O(host);
            List listA = a(x509Certificate, 7);
            if (!(listA instanceof Collection) || !listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    if (n.a(strO, x7.a.O((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (b(host)) {
            Locale US = Locale.US;
            n.e(US, "US");
            host = host.toLowerCase(US);
            n.e(host, "this as java.lang.String).toLowerCase(locale)");
        }
        List<String> listA2 = a(x509Certificate, 2);
        if (!(listA2 instanceof Collection) || !listA2.isEmpty()) {
            for (String lowerCase : listA2) {
                if (host.length() == 0 || p.p0(host, ".", false) || p.h0(host, "..", false) || lowerCase == null || lowerCase.length() == 0 || p.p0(lowerCase, ".", false) || p.h0(lowerCase, "..", false)) {
                    zA = false;
                } else {
                    String strConcat = !p.h0(host, ".", false) ? host.concat(".") : host;
                    if (!p.h0(lowerCase, ".", false)) {
                        lowerCase = lowerCase.concat(".");
                    }
                    if (b(lowerCase)) {
                        Locale US2 = Locale.US;
                        n.e(US2, "US");
                        lowerCase = lowerCase.toLowerCase(US2);
                        n.e(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                    }
                    if (!h.q0(lowerCase, "*", false)) {
                        zA = n.a(strConcat, lowerCase);
                    } else if (!p.p0(lowerCase, "*.", false) || h.v0(lowerCase, '*', 1, 4) != -1 || strConcat.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                        zA = false;
                    } else {
                        String strSubstring = lowerCase.substring(1);
                        n.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                        if (p.h0(strConcat, strSubstring, false) && ((length = strConcat.length() - strSubstring.length()) <= 0 || h.B0(strConcat, '.', length - 1, 4) == -1)) {
                            zA = true;
                        } else {
                            zA = false;
                        }
                    }
                }
                if (zA) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String host, SSLSession session) {
        n.f(host, "host");
        n.f(session, "session");
        if (b(host)) {
            try {
                Certificate certificate = session.getPeerCertificates()[0];
                n.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                return c(host, (X509Certificate) certificate);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
