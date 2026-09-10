package com.startapp.sdk.internal;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.vungle.ads.internal.presenter.MRAIDPresenter;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ed extends sk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w1 f40936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BannerStandard.a f40937b;

    public ed(w1 w1Var, BannerStandard.a aVar) {
        this.f40936a = w1Var;
        this.f40937b = aVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        BannerStandard.a aVar;
        if (webView == null || str == null || (aVar = this.f40937b) == null) {
            return;
        }
        aVar.onPageFinished(str);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        if (!cd.a(str)) {
            return super.shouldInterceptRequest(webView, str);
        }
        BannerStandard.a aVar = this.f40937b;
        if (aVar != null) {
            aVar.onMraidDetected();
        }
        return ((cd) com.startapp.sdk.components.a.a(webView.getContext()).T.a()).b();
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009f  */
    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2;
        byte b2;
        if (webView == null || str == null || vi.c(webView.getContext(), str)) {
            return true;
        }
        if (!str.startsWith("mraid://")) {
            return this.f40936a.open(str);
        }
        String[] strArr = {"close", "resize"};
        String[] strArr2 = {"createCalendarEvent", "expand", MRAIDPresenter.OPEN, "playVideo", "storePicture", "useCustomClose"};
        String[] strArr3 = {MRAIDPresenter.SET_ORIENTATION_PROPERTIES, "setResizeProperties"};
        try {
            HashMap mapA = bd.a(str);
            if (mapA == null || (str2 = (String) mapA.get(com.ironsource.sdk.controller.f.b.COMMAND)) == null) {
                return false;
            }
            if (Arrays.asList(strArr).contains(str2)) {
                rc.class.getDeclaredMethod(str2, new Class[0]).invoke(this.f40936a, new Object[0]);
            } else if (Arrays.asList(strArr2).contains(str2)) {
                Method declaredMethod = rc.class.getDeclaredMethod(str2, String.class);
                int iHashCode = str2.hashCode();
                String str3 = "useCustomClose";
                if (iHashCode != -733616544) {
                    if (iHashCode == 1614272768 && str2.equals("useCustomClose")) {
                        b2 = 1;
                    } else {
                        b2 = -1;
                    }
                } else if (str2.equals("createCalendarEvent")) {
                    b2 = 0;
                } else {
                    b2 = -1;
                }
                if (b2 == 0) {
                    str3 = "eventJSON";
                } else if (b2 != 1) {
                    str3 = "url";
                }
                declaredMethod.invoke(this.f40936a, (String) mapA.get(str3));
            } else if (Arrays.asList(strArr3).contains(str2)) {
                rc.class.getDeclaredMethod(str2, Map.class).invoke(this.f40936a, mapA);
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
