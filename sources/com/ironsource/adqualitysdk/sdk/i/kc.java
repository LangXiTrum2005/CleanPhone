package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import com.ironsource.InterfaceC0435l1;
import com.unity3d.services.UnityAdsConstants;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public final class kc {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2951 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f2952 = 45569;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char f2953 = 5669;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2954 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f2955 = 60514;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f2956 = 24364;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private WeakReference<ba.d> f2957;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean f2958;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private WeakReference<WebView> f2959;

    public kc(WebView webView) {
        this.f2959 = new WeakReference<>(webView);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m2779(ba.d dVar) {
        this.f2957 = new WeakReference<>(dVar);
        f2954 = (f2951 + 119) % 128;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final ba.d m2782() {
        int i10 = f2954;
        f2951 = (i10 + 63) % 128;
        WeakReference<ba.d> weakReference = this.f2957;
        if (weakReference == null) {
            return null;
        }
        int i11 = i10 + 49;
        f2951 = i11 % 128;
        if (i11 % 2 != 0) {
            return weakReference.get();
        }
        weakReference.get();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2783(WebViewClient webViewClient) {
        f2951 = (f2954 + InterfaceC0435l1.d.b.f29107d) % 128;
        WebView webViewM2785 = m2785();
        if (webViewM2785 != null) {
            try {
                hr hrVar = new hr(ko.m2933(webViewM2785), webViewClient);
                m2779(hrVar);
                webViewM2785.setWebViewClient(hrVar);
                this.f2958 = true;
                return;
            } catch (Exception e10) {
                kl.m2899(m2781("ᛳ땖풋\uf258ष砾ꊹ䒗農舼䵋ꛉ\ueaf1\uf487洟禴", Color.alpha(0) + 16).intern(), m2781("⒔\ue70a륛䀭㗗\ue153挢ऺ銳ჸ롯\uf810䤦敢ᛳ땖풋\uf258ष砾鯺퓊슄搼䵋ꛉ\ueddd⦸", 27 - TextUtils.indexOf("", "", 0)).intern(), e10, false);
            }
        }
        this.f2958 = false;
        int i10 = f2951 + 75;
        f2954 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m2784() {
        int i10 = f2954;
        int i11 = i10 + 115;
        f2951 = i11 % 128;
        int i12 = i11 % 2;
        boolean z10 = this.f2958;
        if (i12 == 0) {
            int i13 = 47 / 0;
        }
        f2951 = (i10 + 79) % 128;
        return z10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final WebView m2785() {
        f2954 = (f2951 + 93) % 128;
        WebView webView = this.f2959.get();
        int i10 = f2951 + 37;
        f2954 = i10 % 128;
        if (i10 % 2 == 0) {
            return webView;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2781(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (o.f3076) {
            try {
                char[] cArr2 = new char[cArr.length];
                o.f3077 = 0;
                char[] cArr3 = new char[2];
                while (true) {
                    int i11 = o.f3077;
                    if (i11 < cArr.length) {
                        cArr3[0] = cArr[i11];
                        cArr3[1] = cArr[i11 + 1];
                        int i12 = 58224;
                        for (int i13 = 0; i13 < 16; i13++) {
                            char c4 = cArr3[1];
                            char c5 = cArr3[0];
                            char c10 = (char) (c4 - (((c5 + i12) ^ ((c5 << 4) + f2952)) ^ ((c5 >>> 5) + f2953)));
                            cArr3[1] = c10;
                            cArr3[0] = (char) (c5 - (((c10 >>> 5) + f2956) ^ ((c10 + i12) ^ ((c10 << 4) + f2955))));
                            i12 -= 40503;
                        }
                        int i14 = o.f3077;
                        cArr2[i14] = cArr3[0];
                        cArr2[i14 + 1] = cArr3[1];
                        o.f3077 = i14 + 2;
                    } else {
                        str2 = new String(cArr2, 0, i10);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2786(WebChromeClient webChromeClient) {
        WebView webViewM2785 = m2785();
        if (webViewM2785 != null) {
            f2951 = (f2954 + InterfaceC0435l1.d.b.f29105b) % 128;
            try {
                WebChromeClient webChromeClientM2939 = ko.m2939(webViewM2785);
                if (webChromeClientM2939 != null) {
                    f2954 = (f2951 + 107) % 128;
                    if (webChromeClientM2939 == null) {
                        hu huVar = new hu(webChromeClientM2939, webChromeClient);
                        m2780(huVar);
                        webViewM2785.setWebChromeClient(huVar);
                    }
                }
            } catch (Exception e10) {
                kl.m2899(m2781("ᛳ땖풋\uf258ष砾ꊹ䒗農舼䵋ꛉ\ueaf1\uf487洟禴", ExpandableListView.getPackedPositionChild(0L) + 17).intern(), m2781("⒔\ue70a륛䀭㗗\ue153挢ऺ銳ჸ롯\uf810䤦敢ᛳ땖䷣\uf1dc쩹陣㿛భ❘儲슄搼䵋ꛉ\ueddd⦸", (TypedValue.complexToFloat(0) > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 1 : (TypedValue.complexToFloat(0) == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT ? 0 : -1)) + 29).intern(), e10, false);
            }
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static void m2780(ba.d dVar) {
        new WeakReference(dVar);
        f2951 = (f2954 + 115) % 128;
    }
}
