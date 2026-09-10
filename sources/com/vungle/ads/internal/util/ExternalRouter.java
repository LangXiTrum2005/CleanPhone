package com.vungle.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v4.media.a;
import com.vungle.ads.LinkError;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.ui.PresenterAdOpenCallback;
import java.net.URISyntaxException;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\tH\u0002J@\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/vungle/ads/internal/util/ExternalRouter;", "", "()V", "TAG", "", "getIntentFromUrl", "Landroid/content/Intent;", "url", "contextIsNotActivity", "", "launch", "deeplinkUrl", "context", "Landroid/content/Context;", "logEntry", "Lcom/vungle/ads/internal/util/LogEntry;", "adOpenCallback", "Lcom/vungle/ads/internal/ui/PresenterAdOpenCallback;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ExternalRouter {
    public static final ExternalRouter INSTANCE = new ExternalRouter();
    private static final String TAG = "ExternalRouter";

    private ExternalRouter() {
    }

    private final Intent getIntentFromUrl(String url, boolean contextIsNotActivity) {
        Intent uri = null;
        if (url != null) {
            try {
                if (url.length() != 0) {
                    uri = Intent.parseUri(url, 0);
                }
                if (uri != null && contextIsNotActivity) {
                    uri.setFlags(268435456);
                    return uri;
                }
            } catch (URISyntaxException e2) {
                Logger.INSTANCE.e(TAG, "url format is not correct " + e2.getLocalizedMessage());
            }
        } else if (uri != null) {
            uri.setFlags(268435456);
            return uri;
        }
        return uri;
    }

    @JvmStatic
    public static final boolean launch(String deeplinkUrl, String url, Context context, LogEntry logEntry, PresenterAdOpenCallback adOpenCallback) {
        Intrinsics.f(context, "context");
        if ((deeplinkUrl != null && deeplinkUrl.length() != 0) || (url != null && url.length() != 0)) {
            boolean z2 = !(context instanceof Activity);
            try {
                ExternalRouter externalRouter = INSTANCE;
                return ActivityManager.INSTANCE.startWhenForeground(context, externalRouter.getIntentFromUrl(deeplinkUrl, z2), externalRouter.getIntentFromUrl(url, z2), adOpenCallback);
            } catch (Exception e2) {
                if (deeplinkUrl == null || deeplinkUrl.length() == 0) {
                    new LinkError(Sdk.SDKError.Reason.LINK_COMMAND_OPEN_FAILED, a.C("Fail to open ", url)).setLogEntry$vungle_ads_release(logEntry).logErrorNoReturnValue$vungle_ads_release();
                } else {
                    new LinkError(Sdk.SDKError.Reason.DEEPLINK_OPEN_FAILED, a.C("Fail to open ", deeplinkUrl)).setLogEntry$vungle_ads_release(logEntry).logErrorNoReturnValue$vungle_ads_release();
                }
                Logger.Companion companion = Logger.INSTANCE;
                companion.e(TAG, "Error while opening url" + e2.getLocalizedMessage());
                companion.d(TAG, "Cannot open url " + url);
            }
        }
        return false;
    }

    public static /* synthetic */ boolean launch$default(String str, String str2, Context context, LogEntry logEntry, PresenterAdOpenCallback presenterAdOpenCallback, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            logEntry = null;
        }
        if ((i2 & 16) != 0) {
            presenterAdOpenCallback = null;
        }
        return launch(str, str2, context, logEntry, presenterAdOpenCallback);
    }
}
