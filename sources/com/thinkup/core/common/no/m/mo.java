package com.thinkup.core.common.no.m;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class mo {
    final String onmo;
    static final Comparator<String> o = new Comparator<String>() { // from class: com.thinkup.core.common.no.m.mo.1
        private static int o(String str, String str2) {
            int iMin = Math.min(str.length(), str2.length());
            for (int i2 = 4; i2 < iMin; i2++) {
                char cCharAt = str.charAt(i2);
                char cCharAt2 = str2.charAt(i2);
                if (cCharAt != cCharAt2) {
                    return cCharAt < cCharAt2 ? -1 : 1;
                }
            }
            int length = str.length();
            int length2 = str2.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }

        @Override // java.util.Comparator
        public final /* synthetic */ int compare(String str, String str2) {
            String str3 = str;
            String str4 = str2;
            int iMin = Math.min(str3.length(), str4.length());
            for (int i2 = 4; i2 < iMin; i2++) {
                char cCharAt = str3.charAt(i2);
                char cCharAt2 = str4.charAt(i2);
                if (cCharAt != cCharAt2) {
                    return cCharAt < cCharAt2 ? -1 : 1;
                }
            }
            int length = str3.length();
            int length2 = str4.length();
            if (length != length2) {
                return length < length2 ? -1 : 1;
            }
            return 0;
        }
    };
    private static final Map<String, mo> onmm = new LinkedHashMap();
    public static final mo m = n("SSL_RSA_WITH_NULL_MD5");

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final mo f41994n = n("SSL_RSA_WITH_NULL_SHA");
    public static final mo o0 = n("SSL_RSA_EXPORT_WITH_RC4_40_MD5");
    public static final mo oo = n("SSL_RSA_WITH_RC4_128_MD5");
    public static final mo om = n("SSL_RSA_WITH_RC4_128_SHA");
    public static final mo on = n("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA");
    public static final mo m0 = n("SSL_RSA_WITH_DES_CBC_SHA");
    public static final mo mo = n("SSL_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final mo mm = n("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA");
    public static final mo mn = n("SSL_DHE_DSS_WITH_DES_CBC_SHA");
    public static final mo n0 = n("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA");
    public static final mo no = n("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA");
    public static final mo nm = n("SSL_DHE_RSA_WITH_DES_CBC_SHA");
    public static final mo nn = n("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final mo o00 = n("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5");
    public static final mo o0o = n("SSL_DH_anon_WITH_RC4_128_MD5");
    public static final mo o0m = n("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA");
    public static final mo o0n = n("SSL_DH_anon_WITH_DES_CBC_SHA");
    public static final mo oo0 = n("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA");
    public static final mo ooo = n("TLS_KRB5_WITH_DES_CBC_SHA");
    public static final mo oom = n("TLS_KRB5_WITH_3DES_EDE_CBC_SHA");
    public static final mo oon = n("TLS_KRB5_WITH_RC4_128_SHA");
    public static final mo om0 = n("TLS_KRB5_WITH_DES_CBC_MD5");
    public static final mo omo = n("TLS_KRB5_WITH_3DES_EDE_CBC_MD5");
    public static final mo omm = n("TLS_KRB5_WITH_RC4_128_MD5");
    public static final mo omn = n("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA");
    public static final mo on0 = n("TLS_KRB5_EXPORT_WITH_RC4_40_SHA");
    public static final mo ono = n("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5");
    public static final mo onm = n("TLS_KRB5_EXPORT_WITH_RC4_40_MD5");
    public static final mo onn = n("TLS_RSA_WITH_AES_128_CBC_SHA");
    public static final mo m00 = n("TLS_DHE_DSS_WITH_AES_128_CBC_SHA");
    public static final mo m0o = n("TLS_DHE_RSA_WITH_AES_128_CBC_SHA");
    public static final mo m0m = n("TLS_DH_anon_WITH_AES_128_CBC_SHA");
    public static final mo m0n = n("TLS_RSA_WITH_AES_256_CBC_SHA");
    public static final mo mo0 = n("TLS_DHE_DSS_WITH_AES_256_CBC_SHA");
    public static final mo moo = n("TLS_DHE_RSA_WITH_AES_256_CBC_SHA");
    public static final mo mom = n("TLS_DH_anon_WITH_AES_256_CBC_SHA");
    public static final mo mon = n("TLS_RSA_WITH_NULL_SHA256");
    public static final mo mm0 = n("TLS_RSA_WITH_AES_128_CBC_SHA256");
    public static final mo mmo = n("TLS_RSA_WITH_AES_256_CBC_SHA256");
    public static final mo mmm = n("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256");
    public static final mo mmn = n("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA");
    public static final mo mn0 = n("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA");
    public static final mo mno = n("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA");
    public static final mo mnm = n("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256");
    public static final mo mnn = n("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256");
    public static final mo n00 = n("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256");
    public static final mo n0o = n("TLS_DH_anon_WITH_AES_128_CBC_SHA256");
    public static final mo n0m = n("TLS_DH_anon_WITH_AES_256_CBC_SHA256");
    public static final mo n0n = n("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA");
    public static final mo no0 = n("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA");
    public static final mo noo = n("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA");
    public static final mo nom = n("TLS_PSK_WITH_RC4_128_SHA");
    public static final mo non = n("TLS_PSK_WITH_3DES_EDE_CBC_SHA");
    public static final mo nm0 = n("TLS_PSK_WITH_AES_128_CBC_SHA");
    public static final mo nmo = n("TLS_PSK_WITH_AES_256_CBC_SHA");
    public static final mo nmm = n("TLS_RSA_WITH_SEED_CBC_SHA");
    public static final mo nmn = n("TLS_RSA_WITH_AES_128_GCM_SHA256");
    public static final mo nn0 = n("TLS_RSA_WITH_AES_256_GCM_SHA384");
    public static final mo nno = n("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256");
    public static final mo nnm = n("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384");
    public static final mo nnn = n("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256");
    public static final mo o000 = n("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384");
    public static final mo o00o = n("TLS_DH_anon_WITH_AES_128_GCM_SHA256");
    public static final mo o00m = n("TLS_DH_anon_WITH_AES_256_GCM_SHA384");
    public static final mo o00n = n("TLS_EMPTY_RENEGOTIATION_INFO_SCSV");
    public static final mo o0o0 = n("TLS_FALLBACK_SCSV");
    public static final mo o0oo = n("TLS_ECDH_ECDSA_WITH_NULL_SHA");
    public static final mo o0om = n("TLS_ECDH_ECDSA_WITH_RC4_128_SHA");
    public static final mo o0on = n("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA");
    public static final mo o0m0 = n("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA");
    public static final mo o0mo = n("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA");
    public static final mo o0mm = n("TLS_ECDHE_ECDSA_WITH_NULL_SHA");
    public static final mo o0mn = n("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA");
    public static final mo o0n0 = n("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA");
    public static final mo o0no = n("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA");
    public static final mo o0nm = n("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA");
    public static final mo o0nn = n("TLS_ECDH_RSA_WITH_NULL_SHA");
    public static final mo oo00 = n("TLS_ECDH_RSA_WITH_RC4_128_SHA");
    public static final mo oo0o = n("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final mo oo0m = n("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA");
    public static final mo oo0n = n("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA");
    public static final mo ooo0 = n("TLS_ECDHE_RSA_WITH_NULL_SHA");
    public static final mo oooo = n("TLS_ECDHE_RSA_WITH_RC4_128_SHA");
    public static final mo ooom = n("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA");
    public static final mo ooon = n("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA");
    public static final mo oom0 = n("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA");
    public static final mo oomo = n("TLS_ECDH_anon_WITH_NULL_SHA");
    public static final mo oomm = n("TLS_ECDH_anon_WITH_RC4_128_SHA");
    public static final mo oomn = n("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA");
    public static final mo oon0 = n("TLS_ECDH_anon_WITH_AES_128_CBC_SHA");
    public static final mo oono = n("TLS_ECDH_anon_WITH_AES_256_CBC_SHA");
    public static final mo oonm = n("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256");
    public static final mo oonn = n("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384");
    public static final mo om00 = n("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256");
    public static final mo om0o = n("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384");
    public static final mo om0m = n("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256");
    public static final mo om0n = n("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384");
    public static final mo omo0 = n("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256");
    public static final mo omoo = n("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384");
    public static final mo omom = n("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256");
    public static final mo omon = n("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384");
    public static final mo omm0 = n("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256");
    public static final mo ommo = n("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384");
    public static final mo ommm = n("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256");
    public static final mo ommn = n("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384");
    public static final mo omn0 = n("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256");
    public static final mo omno = n("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384");
    public static final mo omnm = n("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA");
    public static final mo omnn = n("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA");
    public static final mo on00 = n("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
    public static final mo on0o = n("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256");
    public static final mo on0m = n("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256");
    public static final mo on0n = n("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256");
    public static final mo ono0 = n("TLS_AES_128_GCM_SHA256");
    public static final mo onoo = n("TLS_AES_256_GCM_SHA384");
    public static final mo onom = n("TLS_CHACHA20_POLY1305_SHA256");
    public static final mo onon = n("TLS_AES_128_CCM_SHA256");
    public static final mo onm0 = n("TLS_AES_128_CCM_8_SHA256");

    private mo(String str) {
        str.getClass();
        this.onmo = str;
    }

    private static String m(String str) {
        if (str.startsWith("TLS_")) {
            return "SSL_" + str.substring(4);
        }
        if (!str.startsWith("SSL_")) {
            return str;
        }
        return "TLS_" + str.substring(4);
    }

    private static mo n(String str) {
        mo moVar = new mo(str);
        onmm.put(str, moVar);
        return moVar;
    }

    public static synchronized mo o(String str) {
        mo moVar;
        String str2;
        try {
            Map<String, mo> map = onmm;
            moVar = map.get(str);
            if (moVar == null) {
                if (str.startsWith("TLS_")) {
                    str2 = "SSL_" + str.substring(4);
                } else if (str.startsWith("SSL_")) {
                    str2 = "TLS_" + str.substring(4);
                } else {
                    str2 = str;
                }
                moVar = map.get(str2);
                if (moVar == null) {
                    moVar = new mo(str);
                }
                map.put(str, moVar);
            }
        } catch (Throwable th) {
            throw th;
        }
        return moVar;
    }

    public final String toString() {
        return this.onmo;
    }

    public static List<mo> o(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(o(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private String o() {
        return this.onmo;
    }
}
