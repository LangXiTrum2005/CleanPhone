package com.facebook.appevents.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.UserDataStore;
import com.ironsource.Y3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.g0;
import l7.m0;
import l7.s;
import org.json.JSONException;
import org.json.JSONObject;
import q7.b;
import q7.e0;
import q7.p;
import q7.x;
import wj.f;
import xj.b0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0014B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\b0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/facebook/appevents/internal/AppEventsLoggerUtility;", "", "<init>", "()V", "Lcom/facebook/appevents/internal/AppEventsLoggerUtility$GraphAPIActivityType;", "activityType", "Lq7/b;", "attributionIdentifiers", "", "anonymousAppDeviceGUID", "", "limitEventUsage", "Landroid/content/Context;", "context", "Lorg/json/JSONObject;", "getJSONObjectForGraphAPICall", "(Lcom/facebook/appevents/internal/AppEventsLoggerUtility$GraphAPIActivityType;Lq7/b;Ljava/lang/String;ZLandroid/content/Context;)Lorg/json/JSONObject;", "", "API_ACTIVITY_TYPE_TO_STRING", "Ljava/util/Map;", "GraphAPIActivityType", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AppEventsLoggerUtility {
    public static final AppEventsLoggerUtility INSTANCE = new AppEventsLoggerUtility();
    private static final Map<GraphAPIActivityType, String> API_ACTIVITY_TYPE_TO_STRING = b0.N(new f(GraphAPIActivityType.MOBILE_INSTALL_EVENT, "MOBILE_APP_INSTALL"), new f(GraphAPIActivityType.CUSTOM_APP_EVENTS, "CUSTOM_APP_EVENTS"));

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/appevents/internal/AppEventsLoggerUtility$GraphAPIActivityType;", "", "(Ljava/lang/String;I)V", "MOBILE_INSTALL_EVENT", "CUSTOM_APP_EVENTS", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public enum GraphAPIActivityType {
        MOBILE_INSTALL_EVENT,
        CUSTOM_APP_EVENTS
    }

    private AppEventsLoggerUtility() {
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    public static final JSONObject getJSONObjectForGraphAPICall(GraphAPIActivityType activityType, b attributionIdentifiers, String anonymousAppDeviceGUID, boolean limitEventUsage, Context context) throws JSONException {
        Boolean boolValueOf;
        n.f(activityType, "activityType");
        n.f(context, "context");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(NotificationCompat.CATEGORY_EVENT, API_ACTIVITY_TYPE_TO_STRING.get(activityType));
        String userID = AppEventsLogger.INSTANCE.getUserID();
        if (userID != null) {
            jSONObject.put("app_user_id", userID);
        }
        q7.n nVar = q7.n.ServiceUpdateCompliance;
        if (!p.b(nVar)) {
            jSONObject.put("anon_id", anonymousAppDeviceGUID);
        }
        jSONObject.put("application_tracking_enabled", !limitEventUsage);
        s sVar = s.f45212a;
        jSONObject.put("advertiser_id_collection_enabled", m0.b());
        if (v7.a.b(m0.class)) {
            boolValueOf = null;
        } else {
            try {
                m0.f45190a.e();
                SharedPreferences sharedPreferences = m0.f45198i;
                if (sharedPreferences == null) {
                    n.l("userSettingPref");
                    throw null;
                }
                if (sharedPreferences.contains("com.facebook.sdk.AddToMessagingCustomerBaseForWhatsApp")) {
                    SharedPreferences sharedPreferences2 = m0.f45198i;
                    if (sharedPreferences2 == null) {
                        n.l("userSettingPref");
                        throw null;
                    }
                    boolValueOf = Boolean.valueOf(sharedPreferences2.getBoolean("com.facebook.sdk.AddToMessagingCustomerBaseForWhatsApp", false));
                } else {
                    boolValueOf = null;
                }
            } catch (Throwable th2) {
                v7.a.a(m0.class, th2);
            }
        }
        if (boolValueOf != null) {
            jSONObject.put("add_to_messaging_customer_base_for_whatsapp", boolValueOf.booleanValue() ? "1" : "0");
        }
        if (attributionIdentifiers != null) {
            if (p.b(nVar) && (Build.VERSION.SDK_INT < 31 || !e0.v(context) || !attributionIdentifiers.f48664e)) {
                jSONObject.put("anon_id", anonymousAppDeviceGUID);
            }
            if (attributionIdentifiers.f48662c != null && (!p.b(nVar) || Build.VERSION.SDK_INT < 31 || !e0.v(context) || !attributionIdentifiers.f48664e)) {
                jSONObject.put(Y3.f27960c, attributionIdentifiers.f48662c);
            }
            if (attributionIdentifiers.a() != null) {
                jSONObject.put("advertiser_id", attributionIdentifiers.a());
                jSONObject.put("advertiser_tracking_enabled", !attributionIdentifiers.f48664e);
            }
            if (!attributionIdentifiers.f48664e) {
                String allHashedUserData = UserDataStore.getAllHashedUserData();
                if (allHashedUserData.length() != 0) {
                    jSONObject.put("ud", allHashedUserData);
                }
            }
            String str = attributionIdentifiers.f48663d;
            if (str != null) {
                jSONObject.put("installer_package", str);
            }
        }
        AppLinkManager.Companion companion = AppLinkManager.INSTANCE;
        AppLinkManager companion2 = companion.getInstance();
        String info = companion2 != null ? companion2.getInfo(AppLinkManager.CAMPAIGN_IDS_KEY) : null;
        if (info != null) {
            jSONObject.put(AppLinkManager.CAMPAIGN_IDS_KEY, info);
        }
        AppLinkManager companion3 = companion.getInstance();
        String info2 = companion3 != null ? companion3.getInfo(AppLinkManager.CLICK_ID_KEY) : null;
        if (info2 != null) {
            jSONObject.put(AppLinkManager.CLICK_ID_KEY, info2);
        }
        try {
            e0.I(jSONObject, context);
        } catch (Exception e10) {
            x.f48792c.t(g0.f45136d, "AppEvents", "Fetching extended device info parameters failed: '%s'", e10.toString());
        }
        JSONObject jSONObjectN = e0.n();
        if (jSONObjectN != null) {
            Iterator<String> itKeys = jSONObjectN.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, jSONObjectN.get(next));
            }
        }
        jSONObject.put("application_package_name", context.getPackageName());
        return jSONObject;
    }
}
