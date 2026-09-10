package com.vungle.ads.internal.util;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.webkit.WebView;
import com.vungle.ads.internal.presenter.WebViewManager;
import p002kotlin.Metadata;
import p002kotlin.Pair;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ViewUtility.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/vungle/ads/internal/util/preprohormone;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "dp", "dpToPixels", "(Landroid/content/Context;I)I", "", "eventId", "Landroid/webkit/WebView;", "getWebView", "(Landroid/content/Context;Ljava/lang/String;)Landroid/webkit/WebView;", "orientation", "Lkotlin/Pair;", "getDeviceWidthAndHeightWithOrientation", "(Landroid/content/Context;I)Lkotlin/Pair;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class preprohormone {
    public static final preprohormone INSTANCE = new preprohormone();

    private preprohormone() {
    }

    public final int dpToPixels(Context context, int dp) {
        Intrinsics.checkNotNullParameter(context, "context");
        return (int) ((dp * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    public final Pair<Integer, Integer> getDeviceWidthAndHeightWithOrientation(Context context, int orientation) {
        Intrinsics.checkNotNullParameter(context, "context");
        Resources resources = context.getApplicationContext().getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i = resources.getConfiguration().orientation;
        if (orientation == 0) {
            orientation = i;
        }
        return orientation == i ? new Pair<>(Integer.valueOf(Math.round(displayMetrics.widthPixels / displayMetrics.density)), Integer.valueOf(Math.round(displayMetrics.heightPixels / displayMetrics.density))) : new Pair<>(Integer.valueOf(Math.round(displayMetrics.heightPixels / displayMetrics.density)), Integer.valueOf(Math.round(displayMetrics.widthPixels / displayMetrics.density)));
    }

    public final WebView getWebView(Context context, String eventId) throws InstantiationException {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return WebViewManager.INSTANCE.getOrCreateWebView(context, eventId);
        } catch (Resources.NotFoundException e) {
            throw new InstantiationException("Cannot instantiate WebView due to Resources.NotFoundException: " + e + ".message");
        } catch (Exception e2) {
            throw new InstantiationException(e2.getMessage());
        }
    }
}
