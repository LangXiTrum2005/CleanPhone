package com.vungle.ads.internal.platform;

import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.vungle.ads.internal.util.arytenoidectomy;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: WebViewUtil.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/vungle/ads/internal/platform/marial;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Ltechnofreak/saneness;", "", "consumer", "", "getUserAgent", "(Landroid/content/Context;Ltechnofreak/saneness;)V", "Landroid/webkit/WebView;", "webView", "Lmonacal/attabal$formularize;", "webViewSettings", "applyWebSettings", "(Landroid/webkit/WebView;Lmonacal/attabal$formularize;)V", "TAG", "Ljava/lang/String;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class marial {
    public static final marial INSTANCE = new marial();
    private static final String TAG = "WebViewUtil";

    private marial() {
    }

    public final void applyWebSettings(WebView webView, monacal.attabal.WebViewSettings webViewSettings) {
        Boolean allowUniversalAccessFromFileUrls;
        Boolean allowFileAccessFromFileUrls;
        Intrinsics.checkNotNullParameter(webView, "webView");
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "webView.settings");
        settings.setBuiltInZoomControls(false);
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setSaveFormData(true);
        settings.setUseWideViewPort(false);
        settings.setAllowFileAccess(true);
        settings.setAllowFileAccessFromFileURLs((webViewSettings == null || (allowFileAccessFromFileUrls = webViewSettings.getAllowFileAccessFromFileUrls()) == null) ? false : allowFileAccessFromFileUrls.booleanValue());
        settings.setAllowUniversalAccessFromFileURLs((webViewSettings == null || (allowUniversalAccessFromFileUrls = webViewSettings.getAllowUniversalAccessFromFileUrls()) == null) ? false : allowUniversalAccessFromFileUrls.booleanValue());
        webView.setVisibility(4);
        settings.setMediaPlaybackRequiresUserGesture(false);
    }

    public final void getUserAgent(Context context, technofreak.saneness<String> consumer) {
        Object objM3351constructorimpl;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(consumer, "consumer");
        try {
            Result.Companion companion = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(WebSettings.getDefaultUserAgent(context));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM3351constructorimpl = Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
        if (Result.m3357isSuccessimpl(objM3351constructorimpl)) {
            consumer.accept((String) objM3351constructorimpl);
        }
        Throwable thM3354exceptionOrNullimpl = Result.m3354exceptionOrNullimpl(objM3351constructorimpl);
        if (thM3354exceptionOrNullimpl != null) {
            arytenoidectomy.INSTANCE.e(TAG, "Failed to get user agent", thM3354exceptionOrNullimpl);
            consumer.accept(null);
        }
    }
}
