package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.webkit.ProxyConfig;
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

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nS, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4135nS implements HostnameVerifier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C4135nS f4744a = new C4135nS();

    public static List a(X509Certificate x509Certificate, int i) {
        Object obj;
        C2812Uq c2812Uq = C2812Uq.f3846a;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return c2812Uq;
            }
            ArrayList arrayList = new ArrayList();
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && AbstractC2995aW.i(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                    arrayList.add((String) obj);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return c2812Uq;
        }
    }

    public static boolean b(String str) {
        int i;
        int length = str.length();
        int length2 = str.length();
        if (length2 < 0) {
            throw new IllegalArgumentException(AbstractC5044xl.g("endIndex < beginIndex: ", length2, " < 0").toString());
        }
        if (length2 > str.length()) {
            StringBuilder sbQ = AbstractC5044xl.q("endIndex > string.length: ", length2, " > ");
            sbQ.append(str.length());
            throw new IllegalArgumentException(sbQ.toString().toString());
        }
        long j = 0;
        int i2 = 0;
        while (i2 < length2) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                j++;
            } else {
                if (cCharAt < 2048) {
                    i = 2;
                } else if (cCharAt < 55296 || cCharAt > 57343) {
                    i = 3;
                } else {
                    int i3 = i2 + 1;
                    char cCharAt2 = i3 < length2 ? str.charAt(i3) : (char) 0;
                    if (cCharAt > 56319 || cCharAt2 < 56320 || cCharAt2 > 57343) {
                        j++;
                        i2 = i3;
                    } else {
                        j += (long) 4;
                        i2 += 2;
                    }
                }
                j += (long) i;
            }
            i2++;
        }
        return length == ((int) j);
    }

    public static boolean c(String str, X509Certificate x509Certificate) {
        int length;
        AbstractC2995aW.q(str, "host");
        AbstractC2995aW.q(x509Certificate, "certificate");
        byte[] bArr = Vg0.f3884a;
        C3439fY c3439fY = Vg0.f;
        c3439fY.getClass();
        if (c3439fY.f4369a.matcher(str).matches()) {
            String strC = AbstractC4496rb.C(str);
            List listA = a(x509Certificate, 7);
            if (!(listA instanceof Collection) || !listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    if (AbstractC2995aW.i(strC, AbstractC4496rb.C((String) it.next()))) {
                        return true;
                    }
                }
            }
        } else {
            if (b(str)) {
                Locale locale = Locale.US;
                AbstractC2995aW.p(locale, "US");
                str = str.toLowerCase(locale);
                AbstractC2995aW.p(str, "this as java.lang.String).toLowerCase(locale)");
            }
            List<String> listA2 = a(x509Certificate, 2);
            if (!(listA2 instanceof Collection) || !listA2.isEmpty()) {
                for (String lowerCase : listA2) {
                    if (str.length() != 0 && !AbstractC3089ba0.N0(str, ".", false) && !str.endsWith("..") && lowerCase != null && lowerCase.length() != 0 && !AbstractC3089ba0.N0(lowerCase, ".", false) && !lowerCase.endsWith("..")) {
                        String strV0 = !str.endsWith(".") ? AbstractC2995aW.v0(".", str) : str;
                        if (!lowerCase.endsWith(".")) {
                            lowerCase = AbstractC2995aW.v0(".", lowerCase);
                        }
                        if (b(lowerCase)) {
                            Locale locale2 = Locale.US;
                            AbstractC2995aW.p(locale2, "US");
                            lowerCase = lowerCase.toLowerCase(locale2);
                            AbstractC2995aW.p(lowerCase, "this as java.lang.String).toLowerCase(locale)");
                        }
                        if (!AbstractC3089ba0.l0(lowerCase, ProxyConfig.MATCH_ALL_SCHEMES)) {
                            if (AbstractC2995aW.i(strV0, lowerCase)) {
                                return true;
                            }
                        } else if (AbstractC3089ba0.N0(lowerCase, "*.", false) && AbstractC3089ba0.s0(lowerCase, '*', 1, false, 4) == -1 && strV0.length() >= lowerCase.length() && !AbstractC2995aW.i("*.", lowerCase)) {
                            String strSubstring = lowerCase.substring(1);
                            AbstractC2995aW.p(strSubstring, "this as java.lang.String).substring(startIndex)");
                            if (strV0.endsWith(strSubstring) && ((length = strV0.length() - strSubstring.length()) <= 0 || AbstractC3089ba0.w0(strV0, '.', length - 1, 4) == -1)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        AbstractC2995aW.q(str, "host");
        AbstractC2995aW.q(sSLSession, com.umeng.analytics.pro.f.aC);
        if (!b(str)) {
            return false;
        }
        try {
            Certificate certificate = sSLSession.getPeerCertificates()[0];
            if (certificate != null) {
                return c(str, (X509Certificate) certificate);
            }
            throw new NullPointerException("null cannot be cast to non-null type java.security.cert.X509Certificate");
        } catch (SSLException unused) {
            return false;
        }
    }
}
