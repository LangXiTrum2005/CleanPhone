package nestlike;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import babyless.beachfront;
import com.ironsource.X3;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import java.util.LinkedHashMap;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.collections.seminary;
import p002kotlin.jvm.internal.Intrinsics;
import patroclinal.formularize;

/* JADX INFO: compiled from: PurchasePageReportUtil.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0010%\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001e\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\"\u0010!\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0015\u001a\u0004\b\u001f\u0010\u0017\"\u0004\b \u0010\u0019R#\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0014\u0010%R*\u0010,\u001a\u00020\u00062\u0006\u0010'\u001a\u00020\u00068B@BX\u0082\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010(\u001a\u0004\b\u001b\u0010)\"\u0004\b*\u0010+R\"\u00103\u001a\u00020-8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R#\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\"8\u0006¢\u0006\f\n\u0004\b\u0018\u0010$\u001a\u0004\b4\u0010%¨\u00066"}, d2 = {"Lnestlike/marial;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "pageAction", "", X3.i.m, InAppPurchaseMetaData.KEY_PRODUCT_ID, "purchaseError", "purchaseErrorMsg", "", "wireman", "(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "beachfront", "(Landroid/content/Context;Ljava/lang/String;)V", "competently", "(Landroid/content/Context;)V", "saneness", "Ljava/lang/String;", "attabal", "()Ljava/lang/String;", "impromptu", "(Ljava/lang/String;)V", "currentOpenPurchaseSource", "dern", "getPageKind", "setPageKind", "pageKind", "getPageEvent", "setPageEvent", "pageEvent", "", "marial", "Ljava/util/Map;", "()Ljava/util/Map;", "extraParams", "value", "I", "()I", "taiyuan", "(I)V", "openPurchasePageCount", "", "Z", "getHadReportedShowPage", "()Z", "setHadReportedShowPage", "(Z)V", "hadReportedShowPage", "getActionParams", "actionParams", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class marial {

    /* JADX INFO: renamed from: beachfront, reason: collision with root package name and from kotlin metadata */
    public static int openPurchasePageCount;

    /* JADX INFO: renamed from: competently, reason: collision with root package name and from kotlin metadata */
    public static boolean hadReportedShowPage;

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final marial f33872attabal = new marial();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public static String currentOpenPurchaseSource = "";

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public static String pageKind = "";

    /* JADX INFO: renamed from: wireman, reason: collision with root package name and from kotlin metadata */
    public static String pageEvent = "";

    /* JADX INFO: renamed from: marial, reason: collision with root package name and from kotlin metadata */
    public static final Map<String, String> extraParams = new LinkedHashMap();

    /* JADX INFO: renamed from: impromptu, reason: collision with root package name and from kotlin metadata */
    public static final Map<Integer, String> actionParams = seminary.kowloon(formularize.attabal(10, "10_page_show"), formularize.attabal(20, "20_change_product"), formularize.attabal(30, "30_click_purchase"), formularize.attabal(31, "40_purchase_success"), formularize.attabal(32, "41_purchase_fail"), formularize.attabal(34, "42_user_cancel"), formularize.attabal(40, "50_click_restore"), formularize.attabal(41, "51_restore_success"), formularize.attabal(42, "52_restore_fail"), formularize.attabal(51, "60_click_policy"), formularize.attabal(52, "61_click_user_terms"), formularize.attabal(50, "70_close_page"));

    public static /* synthetic */ void marial(marial marialVar, Context context, int i, String str, String str2, int i2, String str3, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            str = "";
        }
        if ((i3 & 8) != 0) {
            str2 = "";
        }
        if ((i3 & 16) != 0) {
            i2 = -1;
        }
        if ((i3 & 32) != 0) {
            str3 = "";
        }
        marialVar.wireman(context, i, str, str2, i2, str3);
    }

    public final String attabal() {
        return currentOpenPurchaseSource;
    }

    public final void beachfront(Context context, String productId) {
        Bundle bundle = new Bundle();
        bundle.putString("sku_id", productId);
        attabal attabalVar = attabal.f33869attabal;
        String str = dern.f33870attabal.attabal().get("uac_launch_purchase_flow");
        if (str == null) {
            str = "";
        }
        attabalVar.attabal(context, "uac_launch_purchase_flow", bundle, str);
    }

    public final void competently(Context context) {
        attabal attabalVar = attabal.f33869attabal;
        Bundle bundle = new Bundle();
        String str = dern.f33870attabal.attabal().get("uac_show_purchase_2");
        if (str == null) {
            str = "";
        }
        attabalVar.attabal(context, "uac_show_purchase_2", bundle, str);
    }

    public final int dern() {
        return beachfront.competently("sp_iap_show_purchase_page_count", 0);
    }

    public final void impromptu(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        currentOpenPurchaseSource = str;
    }

    public final Map<String, String> saneness() {
        return extraParams;
    }

    public final void taiyuan(int i) {
        beachfront.apical("sp_iap_show_purchase_page_count", Integer.valueOf(i));
        openPurchasePageCount = i;
    }

    public final void wireman(Context context, int pageAction, String productType, String productId, int purchaseError, String purchaseErrorMsg) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(productType, "productType");
        Bundle bundle = new Bundle();
        bundle.putInt("page_action", pageAction);
        if (pageAction == 10) {
            currentOpenPurchaseSource.length();
            taiyuan(dern() + 1);
            if (dern() == 2 && !hadReportedShowPage) {
                competently(context);
                hadReportedShowPage = true;
            }
        }
        if (pageAction == 30) {
            beachfront(context, productId);
        }
        bundle.putString("page_entrance", currentOpenPurchaseSource);
        bundle.putString("page_kind", pageKind);
        bundle.putString("page_event", pageEvent);
        String str = actionParams.get(Integer.valueOf(pageAction));
        if (str != null && str.length() != 0) {
            bundle.putString("action", str);
        }
        if (!TextUtils.isEmpty(productType) || !TextUtils.isEmpty(productId)) {
            bundle.putString("product_type", productType);
            bundle.putString("product_id", productId);
        }
        if (!TextUtils.isEmpty(purchaseErrorMsg) || purchaseError > 0) {
            bundle.putInt("page_error", purchaseError);
            bundle.putString("page_error_msg", purchaseErrorMsg);
        }
        Map<String, String> map = extraParams;
        if (!map.isEmpty()) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                bundle.putString(entry.getKey(), entry.getValue());
            }
        }
        attabal.saneness(attabal.f33869attabal, context, "ud_purchase_page", bundle, null, 8, null);
    }
}
