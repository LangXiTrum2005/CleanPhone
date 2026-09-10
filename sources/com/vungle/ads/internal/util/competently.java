package com.vungle.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.vungle.ads.LinkError;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.net.URISyntaxException;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ExternalRouter.kt */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJG\u0010\u0014\u001a\u00020\u00062\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/vungle/ads/internal/util/competently;", "", "<init>", "()V", "", "url", "", "contextIsNotActivity", "Landroid/content/Intent;", "getIntentFromUrl", "(Ljava/lang/String;Z)Landroid/content/Intent;", "deeplinkUrl", "Landroid/content/Context;", "context", "Lcom/vungle/ads/internal/util/kowloon;", "logEntry", "Lcom/vungle/ads/internal/ui/saneness;", "adOpenCallback", "launch$vungle_ads_release", "(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;Lcom/vungle/ads/internal/util/kowloon;Lcom/vungle/ads/internal/ui/saneness;)Z", "launch", "getIntentFromUrl$vungle_ads_release", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "TAG", "Ljava/lang/String;", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class competently {
    public static final competently INSTANCE = new competently();
    private static final String TAG = "ExternalRouter";

    private competently() {
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
            } catch (URISyntaxException e) {
                arytenoidectomy.INSTANCE.e(TAG, "url format is not correct " + e.getLocalizedMessage());
            }
        } else if (uri != null) {
            uri.setFlags(268435456);
            return uri;
        }
        return uri;
    }

    public static /* synthetic */ Intent getIntentFromUrl$default(competently competentlyVar, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return competentlyVar.getIntentFromUrl(str, z);
    }

    public static /* synthetic */ Intent getIntentFromUrl$vungle_ads_release$default(competently competentlyVar, Context context, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        return competentlyVar.getIntentFromUrl$vungle_ads_release(context, str);
    }

    public static /* synthetic */ boolean launch$vungle_ads_release$default(competently competentlyVar, String str, String str2, Context context, LogEntry logEntry, com.vungle.ads.internal.ui.saneness sanenessVar, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            logEntry = null;
        }
        if ((i & 16) != 0) {
            sanenessVar = null;
        }
        return competentlyVar.launch$vungle_ads_release(str, str2, context, logEntry, sanenessVar);
    }

    public final Intent getIntentFromUrl$vungle_ads_release(Context context, String url) {
        Intrinsics.checkNotNullParameter(context, "context");
        return getIntentFromUrl(url, !(context instanceof Activity));
    }

    public final boolean launch$vungle_ads_release(String deeplinkUrl, String url, Context context, LogEntry logEntry, com.vungle.ads.internal.ui.saneness adOpenCallback) throws InterruptedException {
        Intrinsics.checkNotNullParameter(context, "context");
        if ((deeplinkUrl != null && deeplinkUrl.length() != 0) || (url != null && url.length() != 0)) {
            boolean z = !(context instanceof Activity);
            try {
                return attabal.INSTANCE.startWhenForeground(context, getIntentFromUrl(deeplinkUrl, z), getIntentFromUrl(url, z), adOpenCallback);
            } catch (Exception e) {
                if (deeplinkUrl == null || deeplinkUrl.length() == 0) {
                    new LinkError(Sdk$SDKError.Reason.LINK_COMMAND_OPEN_FAILED, "Fail to open " + url).setLogEntry$vungle_ads_release(logEntry).logErrorNoReturnValue$vungle_ads_release();
                } else {
                    new LinkError(Sdk$SDKError.Reason.DEEPLINK_OPEN_FAILED, "Fail to open " + deeplinkUrl).setLogEntry$vungle_ads_release(logEntry).logErrorNoReturnValue$vungle_ads_release();
                }
                arytenoidectomy.Companion companion = arytenoidectomy.INSTANCE;
                companion.e(TAG, "Error while opening url" + e.getLocalizedMessage());
                companion.d(TAG, "Cannot open url " + url);
            }
        }
        return false;
    }
}
