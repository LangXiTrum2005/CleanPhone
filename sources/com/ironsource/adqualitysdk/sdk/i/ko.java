package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ironsource.InterfaceC0435l1;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class ko {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f3049 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f3050;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char[] f3051;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static d f3052;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static d f3053;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f3054;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean f3055;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean f3056;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean f3057;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean f3058;

    static {
        m2942();
        f3054 = true;
        f3055 = true;
        f3057 = true;
        byte b10 = 0;
        f3058 = false;
        f3056 = false;
        f3052 = new d(b10);
        f3053 = new d(b10);
        int i10 = f3049 + InterfaceC0435l1.d.b.f29112i;
        f3050 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Cif<WebViewClient> m2925(WebView webView) {
        int i10 = f3050 + 123;
        f3049 = i10 % 128;
        if (i10 % 2 == 0) {
            m2931(webView.getContext());
            m2930(webView, m2927(), f3052);
            throw null;
        }
        m2931(webView.getContext());
        Cif<WebViewClient> cifM2930 = m2930(webView, m2927(), f3052);
        f3049 = (f3050 + 87) % 128;
        return cifM2930;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static synchronized at m2929() {
        at atVarMo486;
        try {
            int i10 = f3050 + 49;
            f3049 = i10 % 128;
            try {
                if (i10 % 2 == 0) {
                    ar.m468().mo486();
                    throw null;
                }
                atVarMo486 = ar.m468().mo486();
                int i11 = f3049 + InterfaceC0435l1.d.b.f29109f;
                f3050 = i11 % 128;
                if (i11 % 2 != 0) {
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return atVarMo486;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static void m2936(WebView webView, String str) {
        f3050 = (f3049 + InterfaceC0435l1.d.b.f29109f) % 128;
        if (webView != null) {
            if (webView.getHandler() == null) {
                f3049 = (f3050 + 93) % 128;
                if (webView.getRootView() == null) {
                    return;
                }
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2928("\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0000", new int[]{0, 22, 139, 14}, true).intern());
            sb2.append(str);
            sb2.append(m2928("\u0000\u0001\u0000\u0000", new int[]{22, 4, 0, 0}, false).intern());
            webView.loadUrl(sb2.toString());
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Cif<WebChromeClient> m2937(WebView webView) {
        int i10 = f3050 + 11;
        f3049 = i10 % 128;
        if (i10 % 2 == 0) {
            m2931(webView.getContext());
            m2930(webView, m2934(), f3053);
            throw null;
        }
        m2931(webView.getContext());
        Cif<WebChromeClient> cifM2930 = m2930(webView, m2934(), f3053);
        int i11 = f3050 + 75;
        f3049 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 28 / 0;
        }
        return cifM2930;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static void m2942() {
        f3051 = new char[]{'v', 246, 248, 218, 226, 253, 247, 248, 245, 246, 245, 246, 246, 240, 209, 176, 208, 243, 252, 245, 207, 213, 17, '%', ')', '2', 'r', 233, 233, 232, 232, 196, 203, 242, 234, 232, 235, 216, 222, 239, 232, 224, 221, 228, 223, 188, 195, 234, 236, 232, 196, 203, 206, 203, 234, 233, 241, 243, 218, 'k', 236, 261, 259, 251, 252, 221, 224, 221, 214, 250, 254, 252, 213, 206, 241, 246, 229, 232, 256, 259, 257, 252, 231, 234, 253, 250, 252, 260, 221, 214, 250, 250, 251, 251, '9', 'o', 'j', 'n', 'd', 'f', 'n', 'g', '_', '\\', 'c', '^', '9', 's', 'q', 'i', 'g', 'j', 'g', 'A', 'I', 'k', 'i', 'n', 'k', 'D', 'I', 'p', 'j', 'C', 'C', 'j', 'k', 'j', 'g', 'd', 'f', 'e', 'A', 'I', 'p', 'p', 'r', '[', 145, 286, 247, 240, 275, 280, 273, 276, 284, 291, 274, 268, 287, 284, 286, 294, 273, 272, 295, 293, 293, 254, 246, 282, 283, 281, 284, 287, 288, 287, 248, 249, 284, 248, 254, 287, 237, 166, 248, 245, 248, 248, 203, 234, 242, 235, 239, 236, 166, 250, 244, 235, 239, 242, 233, 166, 237, 244, 239, 250, 250, 235};
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m2932(WebView webView) {
        f3049 = (f3050 + 25) % 128;
        boolean z10 = m2933(webView) instanceof hr;
        int i10 = f3050 + 1;
        f3049 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 4 / 0;
        }
        return z10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static WebChromeClient m2939(WebView webView) {
        WebChromeClient webChromeClientMo2410;
        if (m2929().m564() && m2943(webView.getContext())) {
            webChromeClientMo2410 = webView.getWebChromeClient();
            f3049 = (f3050 + InterfaceC0435l1.d.b.f29114k) % 128;
        } else {
            Cif<WebChromeClient> cifM2937 = m2937(webView);
            if (cifM2937 == null) {
                throw new RuntimeException(m2928("\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000", new int[]{59, 35, 147, 0}, false).intern());
            }
            webChromeClientMo2410 = cifM2937.mo2410();
        }
        f3050 = (f3049 + 71) % 128;
        return webChromeClientMo2410;
    }

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class d {

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private boolean f3060;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private boolean f3061;

        private d() {
            this.f3060 = false;
            this.f3061 = false;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private boolean m2944() {
            return this.f3060;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final void m2945() {
            this.f3061 = true;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final void m2946() {
            this.f3060 = true;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final boolean m2947() {
            return m2944() || m2948();
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final boolean m2948() {
            return this.f3061;
        }

        public /* synthetic */ d(byte b10) {
            this();
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m2931(Context context) {
        f3049 = (f3050 + 37) % 128;
        if (f3054) {
            f3054 = false;
            try {
                WebView webView = new WebView(context);
                hr hrVar = new hr(null, new WebViewClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ko.5
                });
                webView.setWebViewClient(hrVar);
                hu huVar = new hu(null, new WebChromeClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ko.2
                });
                webView.setWebChromeClient(huVar);
                f3052 = m2935(webView, hrVar, m2927());
                f3053 = m2935(webView, huVar, m2934());
                return;
            } catch (Throwable th2) {
                kl.m2899(m2928("\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000", new int[]{94, 12, 0, 0}, true).intern(), m2928("\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001", new int[]{106, 32, 0, 0}, true).intern(), th2, false);
            }
        }
        int i10 = f3049 + 65;
        f3050 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static <T> Cif<T> m2926(Object obj, ii iiVar, final List<String> list, int i10) {
        Cif<T> cifM2492 = id.m2382().m2383().m2492(obj, iiVar, new hx() { // from class: com.ironsource.adqualitysdk.sdk.i.ko.4
            @Override // com.ironsource.adqualitysdk.sdk.i.hx
            /* JADX INFO: renamed from: ｋ */
            public final Field[] mo2319(Object obj2) {
                id.m2382().m2384();
                return hw.m2310(obj2.getClass(), true, -1, list);
            }
        }, list, i10);
        int i11 = f3050 + 21;
        f3049 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 8 / 0;
        }
        return cifM2492;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static WebViewClient m2933(WebView webView) {
        f3049 = (f3050 + 123) % 128;
        if (m2929().m565()) {
            f3050 = (f3049 + 69) % 128;
            if (m2938(webView.getContext())) {
                return webView.getWebViewClient();
            }
        }
        Cif<WebViewClient> cifM2925 = m2925(webView);
        if (cifM2925 != null) {
            return cifM2925.mo2410();
        }
        throw new RuntimeException(m2928("\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000", new int[]{26, 33, TsExtractor.TS_STREAM_TYPE_AC3, 0}, true).intern());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:13:0x0037  */
    /* JADX WARN: Code duplicated, block: B:9:0x001a  */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m2938(Context context) {
        WebView webView;
        hr hrVar;
        boolean z10;
        int i10 = f3049 + 37;
        f3050 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 36 / 0;
            if (f3055) {
                try {
                    f3055 = false;
                    webView = new WebView(context);
                    hrVar = new hr(null, new WebViewClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ko.1
                    });
                    webView.setWebViewClient(hrVar);
                    if (hrVar == webView.getWebViewClient()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    f3058 = z10;
                } catch (Throwable th2) {
                    kl.m2899(m2928("\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000", new int[]{94, 12, 0, 0}, true).intern(), m2928("\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000", new int[]{TsExtractor.TS_STREAM_TYPE_DTS, 36, 181, 16}, false).intern(), th2, false);
                }
            }
        } else if (f3055) {
            f3055 = false;
            webView = new WebView(context);
            hrVar = new hr(null, new WebViewClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ko.1
            });
            webView.setWebViewClient(hrVar);
            if (hrVar == webView.getWebViewClient()) {
                z10 = true;
            } else {
                z10 = false;
            }
            f3058 = z10;
        }
        boolean z11 = f3058;
        int i12 = f3050 + 19;
        f3049 = i12 % 128;
        if (i12 % 2 != 0) {
            return z11;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static ii m2927() {
        ii iiVar = new ii() { // from class: com.ironsource.adqualitysdk.sdk.i.ko.9
            @Override // com.ironsource.adqualitysdk.sdk.i.ii
            /* JADX INFO: renamed from: ﻛ */
            public final boolean mo1868(Cif cif) {
                return WebViewClient.class.equals(cif.mo2411().getType());
            }
        };
        int i10 = f3049 + 77;
        f3050 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 5 / 0;
        }
        return iiVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2928(String str, int[] iArr, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (h.f2261) {
            try {
                int i10 = iArr[0];
                int i11 = iArr[1];
                int i12 = iArr[2];
                int i13 = iArr[3];
                char[] cArr = new char[i11];
                System.arraycopy(f3051, i10, cArr, 0, i11);
                if (bArr != null) {
                    char[] cArr2 = new char[i11];
                    h.f2262 = 0;
                    char c4 = 0;
                    while (true) {
                        int i14 = h.f2262;
                        if (i14 >= i11) {
                            break;
                        }
                        if (bArr[i14] == 1) {
                            cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c4);
                        } else {
                            cArr2[i14] = (char) ((cArr[i14] << 1) - c4);
                        }
                        c4 = cArr2[i14];
                        h.f2262 = i14 + 1;
                    }
                    cArr = cArr2;
                }
                if (i13 > 0) {
                    char[] cArr3 = new char[i11];
                    System.arraycopy(cArr, 0, cArr3, 0, i11);
                    int i15 = i11 - i13;
                    System.arraycopy(cArr3, 0, cArr, i15, i13);
                    System.arraycopy(cArr3, i13, cArr, 0, i15);
                }
                if (z10) {
                    char[] cArr4 = new char[i11];
                    h.f2262 = 0;
                    while (true) {
                        int i16 = h.f2262;
                        if (i16 >= i11) {
                            break;
                        }
                        cArr4[i16] = cArr[(i11 - i16) - 1];
                        h.f2262 = i16 + 1;
                    }
                    cArr = cArr4;
                }
                if (i12 > 0) {
                    h.f2262 = 0;
                    while (true) {
                        int i17 = h.f2262;
                        if (i17 >= i11) {
                            break;
                        }
                        cArr[i17] = (char) (cArr[i17] - iArr[2]);
                        h.f2262 = i17 + 1;
                    }
                }
                str2 = new String(cArr);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static boolean m2943(Context context) {
        boolean z10;
        if (f3057) {
            f3057 = false;
            WebView webView = new WebView(context);
            hu huVar = new hu(null, new WebChromeClient() { // from class: com.ironsource.adqualitysdk.sdk.i.ko.3
            });
            webView.setWebChromeClient(huVar);
            if (huVar == webView.getWebChromeClient()) {
                f3050 = (f3049 + 69) % 128;
                z10 = true;
            } else {
                z10 = false;
            }
            f3056 = z10;
        }
        boolean z11 = f3056;
        int i10 = f3050 + 83;
        f3049 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 25 / 0;
        }
        return z11;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static <T> Cif<T> m2930(WebView webView, ii iiVar, d dVar) {
        try {
            if (dVar.m2947()) {
                Cif<T> cifM2940 = m2940(webView, iiVar, m2929().m569(), m2929().m566());
                if (dVar.m2948() && cifM2940 != null) {
                    f3049 = (f3050 + 73) % 128;
                    T tMo2410 = cifM2940.mo2410();
                    return (tMo2410 == null || tMo2410.getClass().equals(cifM2940.mo2411().getType())) ? cifM2940 : m2941(tMo2410, iiVar, m2929().m568(), m2929().m567());
                }
                return cifM2940;
            }
            f3050 = (f3049 + 55) % 128;
        } catch (Throwable th2) {
            kl.m2899(m2928("\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0000", new int[]{94, 12, 0, 0}, true).intern(), m2928(null, new int[]{174, 26, TsExtractor.TS_STREAM_TYPE_SPLICE_INFO, 7}, true).intern(), th2, false);
        }
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static <T> d m2935(WebView webView, T t10, ii iiVar) {
        d dVar = new d((byte) 0);
        Cif cifM2940 = m2940(webView, iiVar, m2929().m569(), m2929().m566());
        if (cifM2940 != null) {
            f3050 = (f3049 + 49) % 128;
            Object objMo2410 = cifM2940.mo2410();
            if (objMo2410 == t10) {
                f3050 = (f3049 + 85) % 128;
                dVar.m2946();
                f3050 = (f3049 + 45) % 128;
                return dVar;
            }
            Cif cifM2941 = m2941(objMo2410, iiVar, m2929().m568(), m2929().m567());
            if (cifM2941 != null) {
                int i10 = f3049 + 85;
                f3050 = i10 % 128;
                if (i10 % 2 == 0) {
                    if (cifM2941.mo2410() == t10) {
                        dVar.m2945();
                    }
                    return dVar;
                }
                cifM2941.mo2410();
                throw null;
            }
        }
        return dVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static <T> Cif<T> m2940(WebView webView, ii iiVar, List<String> list, int i10) {
        f3050 = (f3049 + 45) % 128;
        Cif<T> cifM2926 = m2926(webView, iiVar, list, i10);
        f3050 = (f3049 + InterfaceC0435l1.d.b.f29112i) % 128;
        return cifM2926;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static <T> Cif<T> m2941(T t10, ii iiVar, List<String> list, int i10) {
        int i11 = f3050 + 17;
        f3049 = i11 % 128;
        if (i11 % 2 != 0) {
            return m2926(t10, iiVar, list, i10);
        }
        m2926(t10, iiVar, list, i10);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static ii m2934() {
        ii iiVar = new ii() { // from class: com.ironsource.adqualitysdk.sdk.i.ko.7
            @Override // com.ironsource.adqualitysdk.sdk.i.ii
            /* JADX INFO: renamed from: ﻛ */
            public final boolean mo1868(Cif cif) {
                return WebChromeClient.class.equals(cif.mo2411().getType());
            }
        };
        int i10 = f3050 + 123;
        f3049 = i10 % 128;
        if (i10 % 2 != 0) {
            return iiVar;
        }
        throw null;
    }
}
