package com.thinkup.core.common.no.m.o.mm;

import com.thinkup.core.common.n.mo;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes6.dex */
public final class oo implements HostnameVerifier {
    private static final int m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f42017n = 7;
    public static final oo o = new oo();

    private oo() {
    }

    private static boolean m(String str, X509Certificate x509Certificate) {
        List<String> listO = o(x509Certificate, 7);
        int size = listO.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (str.equalsIgnoreCase(listO.get(i2))) {
                return true;
            }
        }
        return false;
    }

    private static boolean n(String str, X509Certificate x509Certificate) {
        String lowerCase = str.toLowerCase(Locale.US);
        Iterator<String> it = o(x509Certificate, 2).iterator();
        while (it.hasNext()) {
            if (o(lowerCase, it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean o(String str, X509Certificate x509Certificate) {
        return com.thinkup.core.common.no.m.o.n.n(str) ? m(str, x509Certificate) : n(str, x509Certificate);
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        try {
            return o(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
        } catch (SSLException unused) {
            return false;
        }
    }

    public static List<String> o(X509Certificate x509Certificate) {
        List<String> listO = o(x509Certificate, 7);
        List<String> listO2 = o(x509Certificate, 2);
        ArrayList arrayList = new ArrayList(listO2.size() + listO.size());
        arrayList.addAll(listO);
        arrayList.addAll(listO2);
        return arrayList;
    }

    private static List<String> o(X509Certificate x509Certificate, int i2) {
        Integer num;
        String str;
        ArrayList arrayList = new ArrayList();
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames == null) {
                return Collections.EMPTY_LIST;
            }
            for (List<?> list : subjectAlternativeNames) {
                if (list != null && list.size() >= 2 && (num = (Integer) list.get(0)) != null && num.intValue() == i2 && (str = (String) list.get(1)) != null) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (CertificateParsingException unused) {
            return Collections.EMPTY_LIST;
        }
    }

    private static boolean o(String str, String str2) {
        if (str != null && str.length() != 0 && !str.startsWith(mo.ono) && !str.endsWith("..") && str2 != null && str2.length() != 0 && !str2.startsWith(mo.ono) && !str2.endsWith("..")) {
            if (!str.endsWith(mo.ono)) {
                str = str.concat(mo.ono);
            }
            if (!str2.endsWith(mo.ono)) {
                str2 = str2.concat(mo.ono);
            }
            String lowerCase = str2.toLowerCase(Locale.US);
            if (!lowerCase.contains("*")) {
                return str.equals(lowerCase);
            }
            if (!lowerCase.startsWith("*.") || lowerCase.indexOf(42, 1) != -1 || str.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                return false;
            }
            String strSubstring = lowerCase.substring(1);
            if (!str.endsWith(strSubstring)) {
                return false;
            }
            int length = str.length() - strSubstring.length();
            return length <= 0 || str.lastIndexOf(46, length - 1) == -1;
        }
        return false;
    }
}
