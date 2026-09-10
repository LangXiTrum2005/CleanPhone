package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final String f36246a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Comparator<String> f36184b = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, g> f36187c = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final g f36190d = a("SSL_RSA_WITH_NULL_MD5", 1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final g f36193e = a("SSL_RSA_WITH_NULL_SHA", 2);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final g f36196f = a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final g f36199g = a("SSL_RSA_WITH_RC4_128_MD5", 4);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final g f36201h = a("SSL_RSA_WITH_RC4_128_SHA", 5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final g f36203i = a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final g f36206j = a("SSL_RSA_WITH_DES_CBC_SHA", 9);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final g f36209k = a("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
    public static final g l = a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final g f36214m = a("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final g f36217n = a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final g f36220o = a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final g f36223p = a("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final g f36226q = a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final g f36229r = a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final g f36231s = a("SSL_DH_anon_WITH_RC4_128_MD5", 24);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final g f36233t = a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final g f36234u = a("SSL_DH_anon_WITH_DES_CBC_SHA", 26);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final g f36236v = a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final g f36238w = a("TLS_KRB5_WITH_DES_CBC_SHA", 30);

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final g f36240x = a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final g f36242y = a("TLS_KRB5_WITH_RC4_128_SHA", 32);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final g f36244z = a("TLS_KRB5_WITH_DES_CBC_MD5", 34);
    public static final g A = a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
    public static final g B = a("TLS_KRB5_WITH_RC4_128_MD5", 36);
    public static final g C = a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
    public static final g D = a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
    public static final g E = a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
    public static final g F = a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
    public static final g G = a("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
    public static final g H = a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
    public static final g I = a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
    public static final g J = a("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
    public static final g K = a("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
    public static final g L = a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
    public static final g M = a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
    public static final g N = a("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
    public static final g O = a("TLS_RSA_WITH_NULL_SHA256", 59);
    public static final g P = a("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
    public static final g Q = a("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
    public static final g R = a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
    public static final g S = a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
    public static final g T = a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
    public static final g U = a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
    public static final g V = a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", InterfaceC0435l1.d.b.f29107d);
    public static final g W = a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
    public static final g X = a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
    public static final g Y = a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
    public static final g Z = a("TLS_DH_anon_WITH_AES_256_CBC_SHA256", InterfaceC0435l1.d.b.f29110g);

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public static final g f36182a0 = a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public static final g f36185b0 = a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", TsExtractor.TS_STREAM_TYPE_E_AC3);

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public static final g f36188c0 = a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final g f36191d0 = a("TLS_PSK_WITH_RC4_128_SHA", TsExtractor.TS_STREAM_TYPE_DTS);

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public static final g f36194e0 = a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public static final g f36197f0 = a("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
    public static final g g0 = a("TLS_PSK_WITH_AES_256_CBC_SHA", 141);

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public static final g f36202h0 = a("TLS_RSA_WITH_SEED_CBC_SHA", 150);

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public static final g f36204i0 = a("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public static final g f36207j0 = a("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public static final g f36210k0 = a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public static final g f36212l0 = a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public static final g f36215m0 = a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public static final g f36218n0 = a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final g f36221o0 = a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final g f36224p0 = a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final g f36227q0 = a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
    public static final g r0 = a("TLS_FALLBACK_SCSV", 22016);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final g f36232s0 = a("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
    public static final g t0 = a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public static final g f36235u0 = a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final g f36237v0 = a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final g f36239w0 = a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final g f36241x0 = a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final g f36243y0 = a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public static final g f36245z0 = a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
    public static final g A0 = a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
    public static final g B0 = a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
    public static final g C0 = a("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
    public static final g D0 = a("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
    public static final g E0 = a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
    public static final g F0 = a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
    public static final g G0 = a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
    public static final g H0 = a("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
    public static final g I0 = a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
    public static final g J0 = a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
    public static final g K0 = a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
    public static final g L0 = a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
    public static final g M0 = a("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
    public static final g N0 = a("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
    public static final g O0 = a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
    public static final g P0 = a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
    public static final g Q0 = a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
    public static final g R0 = a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
    public static final g S0 = a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
    public static final g T0 = a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
    public static final g U0 = a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
    public static final g V0 = a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
    public static final g W0 = a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
    public static final g X0 = a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
    public static final g Y0 = a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
    public static final g Z0 = a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public static final g f36183a1 = a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public static final g f36186b1 = a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public static final g f36189c1 = a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public static final g f36192d1 = a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public static final g f36195e1 = a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);

    /* JADX INFO: renamed from: f1, reason: collision with root package name */
    public static final g f36198f1 = a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);

    /* JADX INFO: renamed from: g1, reason: collision with root package name */
    public static final g f36200g1 = a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
    public static final g h1 = a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    public static final g f36205i1 = a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);

    /* JADX INFO: renamed from: j1, reason: collision with root package name */
    public static final g f36208j1 = a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);

    /* JADX INFO: renamed from: k1, reason: collision with root package name */
    public static final g f36211k1 = a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);

    /* JADX INFO: renamed from: l1, reason: collision with root package name */
    public static final g f36213l1 = a("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);

    /* JADX INFO: renamed from: m1, reason: collision with root package name */
    public static final g f36216m1 = a("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);

    /* JADX INFO: renamed from: n1, reason: collision with root package name */
    public static final g f36219n1 = a("TLS_AES_128_GCM_SHA256", 4865);

    /* JADX INFO: renamed from: o1, reason: collision with root package name */
    public static final g f36222o1 = a("TLS_AES_256_GCM_SHA384", 4866);

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final g f36225p1 = a("TLS_CHACHA20_POLY1305_SHA256", 4867);

    /* JADX INFO: renamed from: q1, reason: collision with root package name */
    public static final g f36228q1 = a("TLS_AES_128_CCM_SHA256", 4868);

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    public static final g f36230r1 = a("TLS_AES_256_CCM_8_SHA256", 4869);

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class a implements Comparator<String> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            int iMin = Math.min(str.length(), str2.length());
            for (int i10 = 4; i10 < iMin; i10++) {
                char cCharAt = str.charAt(i10);
                char cCharAt2 = str2.charAt(i10);
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
    }

    private g(String str) {
        str.getClass();
        this.f36246a = str;
    }

    public static synchronized g a(String str) {
        g gVar;
        try {
            Map<String, g> map = f36187c;
            gVar = map.get(str);
            if (gVar == null) {
                gVar = map.get(b(str));
                if (gVar == null) {
                    gVar = new g(str);
                }
                map.put(str, gVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return gVar;
    }

    private static String b(String str) {
        if (str.startsWith("TLS_")) {
            return "SSL_" + str.substring(4);
        }
        if (!str.startsWith("SSL_")) {
            return str;
        }
        return "TLS_" + str.substring(4);
    }

    public String toString() {
        return this.f36246a;
    }

    public static List<g> a(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(a(str));
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static g a(String str, int i10) {
        g gVar = new g(str);
        f36187c.put(str, gVar);
        return gVar;
    }
}
