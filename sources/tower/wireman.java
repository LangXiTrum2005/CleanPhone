package tower;

import android.content.Context;
import android.os.Bundle;
import com.appsflyer.AFAdRevenueData;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.MediationNetwork;
import com.ironsource.X3;
import com.yoadx.ad.lib.core.YoadAdSdk;
import complexometry.taiyuan;
import java.util.Currency;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Function0;
import p002kotlin.Metadata;
import p002kotlin.Result;
import p002kotlin.Unit;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AppsFlyerReporter.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ%\u0010\r\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00142\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\u000e¨\u0006\u001c"}, d2 = {"Ltower/wireman;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/os/Bundle;", "params", "", "dern", "(Landroid/content/Context;Landroid/os/Bundle;)V", "Lcomplexometry/taiyuan;", "adValue", "wireman", "(Landroid/content/Context;Lcomplexometry/taiyuan;Landroid/os/Bundle;)V", "", X3.i.j0, "bundle", "competently", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V", "", "saneness", "(Landroid/content/Context;Ljava/lang/String;Ljava/util/Map;)V", "attabal", "(Landroid/os/Bundle;)Ljava/util/Map;", "marial", "(Landroid/content/Context;Lcomplexometry/taiyuan;)V", "beachfront", "yoadxlib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class wireman {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final wireman f38905attabal = new wireman();

    public final Map<String, Object> attabal(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : bundle.keySet()) {
            linkedHashMap.put(str, bundle.get(str));
        }
        return linkedHashMap;
    }

    public final void beachfront(Context context, taiyuan adValue, Bundle params) {
        try {
            Result.Companion companion = Result.INSTANCE;
            String string = params.getString("ad_unit_id");
            if (string == null) {
                string = "";
            }
            String string2 = params.getString("ad_format", "");
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            String strTaiyuan = com.yolo.networklibrary.common.util.dern.taiyuan(context);
            Intrinsics.checkNotNullExpressionValue(strTaiyuan, "getMcc(...)");
            linkedHashMap.put("country", strTaiyuan);
            linkedHashMap.put("ad_unit", string);
            Intrinsics.beachfront(string2);
            linkedHashMap.put("ad_type", string2);
            MediationNetwork mediationNetwork = MediationNetwork.GOOGLE_ADMOB;
            String currencyCode = Currency.getInstance(Locale.US).getCurrencyCode();
            Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
            AppsFlyerLib.getInstance().logAdRevenue(new AFAdRevenueData("GOOGLE_ADMOB", mediationNetwork, currencyCode, Function0.taiyuan(adValue)), linkedHashMap);
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
    }

    public final void competently(Context context, String eventName, Bundle bundle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        saneness(context, eventName, attabal(bundle));
    }

    public final void dern(Context context, Bundle params) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
        if (YoadAdSdk.f23874attabal.competently()) {
            saneness(context, "adaction", attabal(params));
        }
    }

    public final void marial(Context context, taiyuan adValue) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String currencyCode = Currency.getInstance(Locale.US).getCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
        linkedHashMap.put(AFInAppEventParameterName.CURRENCY, currencyCode);
        linkedHashMap.put(AFInAppEventParameterName.REVENUE, Double.valueOf(Function0.taiyuan(adValue)));
        saneness(context, "ad_view", linkedHashMap);
    }

    public final void saneness(Context context, String eventName, Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(params, "params");
        try {
            Result.Companion companion = Result.INSTANCE;
            AppsFlyerLib.getInstance().logEvent(context, eventName, params);
            Result.m3351constructorimpl(Unit.f29295attabal);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m3351constructorimpl(p002kotlin.dern.attabal(th));
        }
    }

    public final void wireman(Context context, taiyuan adValue, Bundle params) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adValue, "adValue");
        Intrinsics.checkNotNullParameter(params, "params");
        if (YoadAdSdk.f23874attabal.competently()) {
            marial(context, adValue);
            saneness(context, "adrevenue", attabal(params));
            beachfront(context, adValue, params);
        }
    }
}
