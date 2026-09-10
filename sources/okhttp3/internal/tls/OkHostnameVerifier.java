package okhttp3.internal.tls;

import android.support.v4.media.a;
import com.applovin.impl.Z;
import com.thinkup.core.common.n.mo;
import com.unity3d.services.core.network.core.OkHttp3Client;
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
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u001e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0018\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u0012\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0002J\u0018\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\f\u0010\u0017\u001a\u00020\b*\u00020\bH\u0002J\f\u0010\u0018\u001a\u00020\u000e*\u00020\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lokhttp3/internal/tls/OkHostnameVerifier;", "Ljavax/net/ssl/HostnameVerifier;", "()V", "ALT_DNS_NAME", "", "ALT_IPA_NAME", "allSubjectAltNames", "", "", "certificate", "Ljava/security/cert/X509Certificate;", "getSubjectAltNames", "type", "verify", "", "host", "session", "Ljavax/net/ssl/SSLSession;", "verifyHostname", "hostname", "pattern", "verifyIpAddress", "ipAddress", "asciiToLowercase", "isAscii", OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OkHostnameVerifier implements HostnameVerifier {
    private static final int ALT_DNS_NAME = 2;
    private static final int ALT_IPA_NAME = 7;
    public static final OkHostnameVerifier INSTANCE = new OkHostnameVerifier();

    private OkHostnameVerifier() {
    }

    private final String asciiToLowercase(String str) {
        if (!isAscii(str)) {
            return str;
        }
        Locale locale = Locale.US;
        return Z.p(locale, "US", str, locale, "this as java.lang.String).toLowerCase(locale)");
    }

    private final List<String> getSubjectAltNames(X509Certificate certificate, int type) {
        Object obj;
        EmptyList emptyList = EmptyList.X;
        try {
            Collection<List<?>> subjectAlternativeNames = certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return emptyList;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.a(list.get(0), Integer.valueOf(type)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return emptyList;
        }
    }

    private final boolean isAscii(String str) {
        int i2;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(a.g(length2, 0, "endIndex < beginIndex: ", " < ").toString());
        }
        if (length2 > str.length()) {
            StringBuilder sbU = a.u(length2, "endIndex > string.length: ", " > ");
            sbU.append(str.length());
            throw new IllegalArgumentException(sbU.toString().toString());
        }
        long j = 0;
        int i3 = 0;
        while (i3 < length2) {
            char cCharAt = str.charAt(i3);
            if (cCharAt < 128) {
                j++;
            } else {
                if (cCharAt < 2048) {
                    i2 = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i2 = 3;
                } else {
                    int i4 = i3 + 1;
                    char cCharAt2 = i4 < length2 ? str.charAt(i4) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j++;
                        i3 = i4;
                    } else {
                        j += (long) 4;
                        i3 += 2;
                    }
                }
                j += (long) i2;
            }
            i3++;
        }
        return length == ((int) j);
    }

    private final boolean verifyHostname(String hostname, X509Certificate certificate) {
        String strAsciiToLowercase = asciiToLowercase(hostname);
        List<String> subjectAltNames = getSubjectAltNames(certificate, 2);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (INSTANCE.verifyHostname(strAsciiToLowercase, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    private final boolean verifyIpAddress(String ipAddress, X509Certificate certificate) {
        String canonicalHost = HostnamesKt.toCanonicalHost(ipAddress);
        List<String> subjectAltNames = getSubjectAltNames(certificate, 7);
        if ((subjectAltNames instanceof Collection) && subjectAltNames.isEmpty()) {
            return false;
        }
        Iterator<T> it = subjectAltNames.iterator();
        while (it.hasNext()) {
            if (Intrinsics.a(canonicalHost, HostnamesKt.toCanonicalHost((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final List<String> allSubjectAltNames(X509Certificate certificate) {
        Intrinsics.f(certificate, "certificate");
        List<String> subjectAltNames = getSubjectAltNames(certificate, 7);
        return CollectionsKt.O(getSubjectAltNames(certificate, 2), subjectAltNames);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        Intrinsics.f(host, "host");
        Intrinsics.f(session, "session");
        if (!isAscii(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            Intrinsics.d(certificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            return verify(host, (X509Certificate) certificate);
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean verify(String host, X509Certificate certificate) {
        Intrinsics.f(host, "host");
        Intrinsics.f(certificate, "certificate");
        return Util.canParseAsIpAddress(host) ? verifyIpAddress(host, certificate) : verifyHostname(host, certificate);
    }

    private final boolean verifyHostname(String hostname, String pattern) {
        int length;
        if (hostname != null && hostname.length() != 0 && !StringsKt.M(hostname, mo.ono, false) && !StringsKt.p(hostname, "..", false) && pattern != null && pattern.length() != 0 && !StringsKt.M(pattern, mo.ono, false) && !StringsKt.p(pattern, "..", false)) {
            if (!StringsKt.p(hostname, mo.ono, false)) {
                hostname = hostname.concat(mo.ono);
            }
            if (!StringsKt.p(pattern, mo.ono, false)) {
                pattern = pattern.concat(mo.ono);
            }
            String strAsciiToLowercase = asciiToLowercase(pattern);
            if (!StringsKt.l(strAsciiToLowercase, "*", false)) {
                return Intrinsics.a(hostname, strAsciiToLowercase);
            }
            if (StringsKt.M(strAsciiToLowercase, "*.", false) && StringsKt.u(strAsciiToLowercase, '*', 1, 4) == -1 && hostname.length() >= strAsciiToLowercase.length() && !"*.".equals(strAsciiToLowercase)) {
                String strSubstring = strAsciiToLowercase.substring(1);
                Intrinsics.e(strSubstring, "this as java.lang.String).substring(startIndex)");
                if (StringsKt.p(hostname, strSubstring, false) && ((length = hostname.length() - strSubstring.length()) <= 0 || StringsKt.z(hostname, '.', length - 1, 4) == -1)) {
                    return true;
                }
            }
        }
        return false;
    }
}
