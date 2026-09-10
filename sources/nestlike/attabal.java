package nestlike;

import android.content.Context;
import android.os.Bundle;
import com.appsflyer.AFInAppEventParameterName;
import com.appsflyer.AppsFlyerLib;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.X3;
import java.util.LinkedHashMap;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;
import reuter.molybdenite;

/* JADX INFO: compiled from: BaseReportUtils.kt */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0010\u0010\f¨\u0006\u0011"}, d2 = {"Lnestlike/attabal;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", X3.i.j0, "Landroid/os/Bundle;", "params", "", "wireman", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;)V", "adjustToken", "attabal", "(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)V", "dern", "iap_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class attabal {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public static final attabal f33869attabal = new attabal();

    public static /* synthetic */ void saneness(attabal attabalVar, Context context, String str, Bundle bundle, String str2, int i, Object obj) {
        if ((i & 8) != 0) {
            str2 = "";
        }
        attabalVar.attabal(context, str, bundle, str2);
    }

    public static final void wireman(Context context, String eventName, Bundle params) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(params, "params");
        FirebaseAnalytics firebaseAnalytics = FirebaseAnalytics.getInstance(context);
        Intrinsics.checkNotNullExpressionValue(firebaseAnalytics, "getInstance(...)");
        firebaseAnalytics.attabal(eventName, params);
    }

    public final void attabal(Context context, String eventName, Bundle params, String adjustToken) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(params, "params");
        wireman(context, eventName, params);
        dern(context, eventName, params);
    }

    public final void dern(Context context, String eventName, Bundle params) {
        String string;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Set<String> setKeySet = params.keySet();
            Intrinsics.checkNotNullExpressionValue(setKeySet, "keySet(...)");
            for (String str : setKeySet) {
                Object obj = params.get(str);
                if (obj != null) {
                    if (Intrinsics.wireman(str, "value")) {
                        linkedHashMap.put(AFInAppEventParameterName.REVENUE, obj);
                    } else if (Intrinsics.wireman(str, "currency")) {
                        linkedHashMap.put(AFInAppEventParameterName.CURRENCY, obj);
                    } else {
                        Intrinsics.beachfront(str);
                        linkedHashMap.put(str, obj);
                    }
                }
            }
            AppsFlyerLib.getInstance().logEvent(context, eventName, linkedHashMap);
        } catch (Exception e) {
            if (Intrinsics.wireman(eventName, "uac_pay") || Intrinsics.wireman(eventName, "uac_purchase")) {
                Bundle bundle = new Bundle();
                if (e.toString().length() > 100) {
                    string = e.toString().substring(0, 98);
                    Intrinsics.checkNotNullExpressionValue(string, "substring(...)");
                } else {
                    string = e.toString();
                }
                bundle.putString("event_name", eventName);
                bundle.putString("error_msg", string);
                wireman(molybdenite.f36681attabal.merc(), "debug_report_af_error", bundle);
            }
            e.getMessage();
        }
    }
}
