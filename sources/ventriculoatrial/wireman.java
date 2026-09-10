package ventriculoatrial;

import duvetyn.merc;
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
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.collections.adultoid;
import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.text.StringsKt;
import p002kotlin.text.dovishness;

/* JADX INFO: compiled from: OkHostnameVerifier.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u000eJ\u001f\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0015\u0010\u000eJ\u0013\u0010\u0016\u001a\u00020\u0004*\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\b*\u00020\u0004H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00042\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lventriculoatrial/wireman;", "Ljavax/net/ssl/HostnameVerifier;", "<init>", "()V", "", "host", "Ljavax/net/ssl/SSLSession;", "session", "", "verify", "(Ljava/lang/String;Ljavax/net/ssl/SSLSession;)Z", "Ljava/security/cert/X509Certificate;", "certificate", "marial", "(Ljava/lang/String;Ljava/security/cert/X509Certificate;)Z", "", "attabal", "(Ljava/security/cert/X509Certificate;)Ljava/util/List;", "ipAddress", "impromptu", "hostname", "competently", "saneness", "(Ljava/lang/String;)Ljava/lang/String;", "wireman", "(Ljava/lang/String;)Z", "pattern", "beachfront", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "type", "dern", "(Ljava/security/cert/X509Certificate;I)Ljava/util/List;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class wireman implements HostnameVerifier {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name */
    public static final wireman f39332kowloon = new wireman();

    public final List<String> attabal(X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        return CollectionsKt.unconsolidated(dern(certificate, 7), dern(certificate, 2));
    }

    public final boolean beachfront(String hostname, String pattern) {
        if (hostname != null && hostname.length() != 0 && !dovishness.starveling(hostname, ".", false, 2, null) && !dovishness.cuirassed(hostname, "..", false, 2, null) && pattern != null && pattern.length() != 0 && !dovishness.starveling(pattern, ".", false, 2, null) && !dovishness.cuirassed(pattern, "..", false, 2, null)) {
            if (!dovishness.cuirassed(hostname, ".", false, 2, null)) {
                hostname = Intrinsics.arytenoidectomy(hostname, ".");
            }
            String str = hostname;
            if (!dovishness.cuirassed(pattern, ".", false, 2, null)) {
                pattern = Intrinsics.arytenoidectomy(pattern, ".");
            }
            String strSaneness = saneness(pattern);
            if (!StringsKt.overspeculate(strSaneness, "*", false, 2, null)) {
                return Intrinsics.wireman(str, strSaneness);
            }
            if (!dovishness.starveling(strSaneness, "*.", false, 2, null) || StringsKt.nosophobia(strSaneness, '*', 1, false, 4, null) != -1 || str.length() < strSaneness.length() || Intrinsics.wireman("*.", strSaneness)) {
                return false;
            }
            String strSubstring = strSaneness.substring(1);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
            if (!dovishness.cuirassed(str, strSubstring, false, 2, null)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || StringsKt.sensatory(str, '.', length + (-1), false, 4, null) == -1;
        }
        return false;
    }

    public final boolean competently(String hostname, X509Certificate certificate) {
        String strSaneness = saneness(hostname);
        List<String> listDern = dern(certificate, 2);
        if ((listDern instanceof Collection) && listDern.isEmpty()) {
            return false;
        }
        Iterator<T> it = listDern.iterator();
        while (it.hasNext()) {
            if (f39332kowloon.beachfront(strSaneness, (String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final List<String> dern(X509Certificate certificate, int type) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return adultoid.formularize();
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && Intrinsics.wireman(list.get(0), Integer.valueOf(type)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return adultoid.formularize();
        }
    }

    public final boolean impromptu(String ipAddress, X509Certificate certificate) {
        String strMarial = hereditist.attabal.marial(ipAddress);
        List<String> listDern = dern(certificate, 7);
        if ((listDern instanceof Collection) && listDern.isEmpty()) {
            return false;
        }
        Iterator<T> it = listDern.iterator();
        while (it.hasNext()) {
            if (Intrinsics.wireman(strMarial, hereditist.attabal.marial((String) it.next()))) {
                return true;
            }
        }
        return false;
    }

    public final boolean marial(String host, X509Certificate certificate) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(certificate, "certificate");
        return hereditist.wireman.taiyuan(host) ? impromptu(host, certificate) : competently(host, certificate);
    }

    public final String saneness(String str) {
        if (!wireman(str)) {
            return str;
        }
        Locale US = Locale.US;
        Intrinsics.checkNotNullExpressionValue(US, "US");
        String lowerCase = str.toLowerCase(US);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        return lowerCase;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public boolean verify(String host, SSLSession session) {
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(session, "session");
        if (!wireman(host)) {
            return false;
        }
        try {
            Certificate certificate = session.getPeerCertificates()[0];
            if (certificate != null) {
                return marial(host, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }

    public final boolean wireman(String str) {
        return str.length() == ((int) merc.saneness(str, 0, 0, 3, null));
    }
}
