package nestlike;

import android.content.Context;
import android.os.Bundle;
import com.blankj.utilcode.util.graveside;
import com.google.android.gms.ads.AdSize;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PurchaseFlowReportUtil.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b(\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\fJ%\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0011J9\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0015\u0010\u0011J'\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0016\u0010\u0011J9\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0017\u0010\u0014JC\u0010\u001b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJM\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001d\u0010\u001eJC\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\u001cJC\u0010 \u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b \u0010\u001cJC\u0010!\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b!\u0010\u001cJU\u0010\"\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\"\u0010#JC\u0010$\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b$\u0010\u001cJC\u0010%\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b%\u0010\u001cJU\u0010&\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b&\u0010#J\u001d\u0010'\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b'\u0010(J\u001d\u0010)\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b)\u0010(J1\u0010*\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b*\u0010+JC\u0010,\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b,\u0010\u001cJE\u0010-\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b-\u0010\u001cJW\u0010.\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b.\u0010#JY\u00100\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b0\u00101¨\u00062"}, d2 = {"Lnestlike/wireman;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "purchaseError", "", "purchaseErrorMsg", "", "impromptu", "(Landroid/content/Context;ILjava/lang/String;)V", "competently", X3.i.m, InAppPurchaseMetaData.KEY_PRODUCT_ID, "arytenoidectomy", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "polloi", "monoploid", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "formularize", "triweekly", "impassible", "purchaseToken", "orderId", "purchaseType", "beachfront", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "wireman", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "marial", "attabal", "dern", "saneness", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "taiyuan", "apical", "cutely", "molybdenite", "(Landroid/content/Context;Ljava/lang/String;)V", "adultoid", "graveside", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;)V", "dovishness", "rotuma", "gintrap", "purchaseAction", "kowloon", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final wireman f33881attabal = new wireman();

    public final void adultoid(Context context, String productType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productType, "productType");
    }

    public final void apical(Context context, String productType, String productId, String purchaseToken, String orderId, String purchaseType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        if (purchaseType == "new") {
            kowloon(context, 251, productType, productId, purchaseToken, orderId, 0, "");
        } else {
            kowloon(context, 331, productType, productId, purchaseToken, orderId, 0, "");
        }
    }

    public final void arytenoidectomy(Context context, String productType, String productId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(productId, "productId");
    }

    public final void attabal(Context context, String productType, String productId, String purchaseToken, String orderId, String purchaseType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        if (purchaseType == "new") {
            kowloon(context, PsExtractor.VIDEO_STREAM_MASK, productType, productId, purchaseToken, orderId, 0, "");
        } else {
            kowloon(context, 320, productType, productId, purchaseToken, orderId, 0, "");
        }
    }

    public final void beachfront(Context context, String productType, String productId, String purchaseToken, String orderId, String purchaseType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        if (purchaseType == "new") {
            kowloon(context, Sdk$SDKError.Reason.AD_LOAD_FAIL_RETRY_AFTER_VALUE, productType, productId, purchaseToken, orderId, 0, "");
        } else {
            kowloon(context, 302, productType, productId, purchaseToken, orderId, 0, "");
        }
    }

    public final void competently(Context context, int purchaseError, String purchaseErrorMsg) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(purchaseErrorMsg, "purchaseErrorMsg");
    }

    public final void cutely(Context context, String productType, String productId, String purchaseToken, String orderId, int purchaseError, String purchaseErrorMsg, String purchaseType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        if (purchaseType == "new") {
            kowloon(context, 252, productType, productId, purchaseToken, orderId, purchaseError, purchaseErrorMsg);
        } else {
            kowloon(context, 332, productType, productId, purchaseToken, orderId, 0, "");
        }
    }

    public final void dern(Context context, String productType, String productId, String purchaseToken, String orderId, String purchaseType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        if (purchaseType == "new") {
            kowloon(context, 241, productType, productId, purchaseToken, orderId, 0, "");
        } else {
            kowloon(context, Sdk$SDKError.Reason.BLACK_SCREEN_DETECTION_ERROR_VALUE, productType, productId, purchaseToken, orderId, 0, "");
        }
    }

    public final void dovishness(Context context, String productType, String productId, String purchaseToken, String orderId, String purchaseType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        if (purchaseType == "new") {
            kowloon(context, 230, productType, productId, purchaseToken, orderId, 0, "");
        } else {
            kowloon(context, Sdk$SDKError.Reason.AD_HTML_FAILED_TO_LOAD_VALUE, productType, productId, purchaseToken, orderId, 0, "");
        }
    }

    public final void formularize(Context context, String productType, String productId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productType, "productType");
    }

    public final void gintrap(Context context, String productType, String productId, String purchaseToken, String orderId, int purchaseError, String purchaseErrorMsg, String purchaseType) {
        String strSubstring;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        int i = purchaseType == "new" ? 232 : Sdk$SDKError.Reason.DEEPLINK_OPEN_FAILED_VALUE;
        Bundle bundle = new Bundle();
        bundle.putInt("purchase_action", i);
        bundle.putString("product_type", productType);
        bundle.putString("product_id", productId);
        if (!graveside.saneness(purchaseToken)) {
            String strSubstring2 = null;
            if (purchaseToken != null) {
                strSubstring = purchaseToken.substring(0, purchaseToken.length() / 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            } else {
                strSubstring = null;
            }
            bundle.putString("purchase_token_1", strSubstring);
            if (purchaseToken != null) {
                strSubstring2 = purchaseToken.substring(purchaseToken.length() / 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            }
            bundle.putString("purchase_token_2", strSubstring2);
        }
        bundle.putString("order_id", orderId);
        bundle.putInt("purchase_error", purchaseError);
        bundle.putString("purchase_error_msg", purchaseErrorMsg);
        attabal.f33869attabal.attabal(context, "ud_pay_gp_error_info", bundle, "");
    }

    public final void graveside(Context context, int purchaseError, String purchaseErrorMsg, String productType) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void impassible(Context context, String productType, String productId, int purchaseError, String purchaseErrorMsg) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productType, "productType");
    }

    public final void impromptu(Context context, int purchaseError, String purchaseErrorMsg) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(purchaseErrorMsg, "purchaseErrorMsg");
    }

    public final void kowloon(Context context, int purchaseAction, String productType, String productId, String purchaseToken, String orderId, int purchaseError, String purchaseErrorMsg) {
        String strSubstring;
        Bundle bundle = new Bundle();
        bundle.putInt("purchase_action", purchaseAction);
        bundle.putString("product_type", productType);
        bundle.putString("product_id", productId);
        if (!graveside.saneness(purchaseToken)) {
            String strSubstring2 = null;
            if (purchaseToken != null) {
                strSubstring = purchaseToken.substring(0, purchaseToken.length() / 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            } else {
                strSubstring = null;
            }
            bundle.putString("purchase_token_1", strSubstring);
            if (purchaseToken != null) {
                strSubstring2 = purchaseToken.substring(purchaseToken.length() / 2);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
            }
            bundle.putString("purchase_token_2", strSubstring2);
        }
        bundle.putString("order_id", orderId);
        bundle.putInt("purchase_error", purchaseError);
        bundle.putString("purchase_error_msg", purchaseErrorMsg);
        attabal attabalVar = attabal.f33869attabal;
        String str = dern.f33870attabal.attabal().get("ud_purchase_flow");
        if (str == null) {
            str = "";
        }
        attabalVar.attabal(context, "ud_purchase_flow", bundle, str);
    }

    public final void marial(Context context, String productType, String productId, String purchaseToken, String orderId, String purchaseType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
    }

    public final void molybdenite(Context context, String productType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productType, "productType");
        kowloon(context, AdSize.MEDIUM_RECTANGLE_WIDTH, productType, "", "", "", 0, "");
    }

    public final void monoploid(Context context, String productType, String productId, int purchaseError, String purchaseErrorMsg) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productType, "productType");
    }

    public final void polloi(Context context, String productType, String productId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productType, "productType");
    }

    public final void rotuma(Context context, String productType, String productId, String purchaseToken, String orderId, String purchaseType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        if (purchaseType == "new") {
            kowloon(context, 231, productType, productId, purchaseToken, orderId, 0, "");
        } else {
            kowloon(context, Sdk$SDKError.Reason.MRAID_JS_CALL_EMPTY_VALUE, productType, productId, purchaseToken, orderId, 0, "");
        }
    }

    public final void saneness(Context context, String productType, String productId, String purchaseToken, String orderId, int purchaseError, String purchaseErrorMsg, String purchaseType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        if (purchaseType == "new") {
            kowloon(context, 242, productType, productId, purchaseToken, orderId, purchaseError, purchaseErrorMsg);
        } else {
            kowloon(context, 322, productType, productId, purchaseToken, orderId, 0, "");
        }
    }

    public final void taiyuan(Context context, String productType, String productId, String purchaseToken, String orderId, String purchaseType) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Intrinsics.checkNotNullParameter(purchaseType, "purchaseType");
        if (purchaseType == "new") {
            kowloon(context, AdSize.MEDIUM_RECTANGLE_HEIGHT, productType, productId, purchaseToken, orderId, 0, "");
        } else {
            kowloon(context, 330, productType, productId, purchaseToken, orderId, 0, "");
        }
    }

    public final void triweekly(Context context, String productType, String productId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productType, "productType");
    }

    public final void wireman(Context context, String productType, String productId, String purchaseToken, String orderId, int purchaseError, String purchaseErrorMsg) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productType, "productType");
        kowloon(context, Sdk$SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE, productType, productId, purchaseToken, orderId, purchaseError, purchaseErrorMsg);
    }
}
