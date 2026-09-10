package ki;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import androidx.core.app.NotificationCompat;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.HashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import l7.g0;
import l7.l0;
import l7.m0;
import l7.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import wi.j;
import xi.m;
import xi.n;
import xi.o;
import xi.p;
import xj.k;
import xj.w;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lki/b;", "Lti/b;", "Lxi/n;", "<init>", "()V", "facebook_app_events_release"}, k = 1, mv = {2, 2, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class b implements ti.b, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public p f44652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AppEventsLogger f44653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f44654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Application f44655d;

    public static Bundle a(Map map) {
        if (map == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            Object value = entry.getValue();
            String str = (String) entry.getKey();
            if (value != null) {
                if (value instanceof String) {
                    bundle.putString(str, (String) value);
                } else if (value instanceof Integer) {
                    bundle.putInt(str, ((Number) value).intValue());
                } else if (value instanceof Long) {
                    bundle.putLong(str, ((Number) value).longValue());
                } else if (value instanceof Double) {
                    bundle.putDouble(str, ((Number) value).doubleValue());
                } else if (value instanceof Boolean) {
                    bundle.putBoolean(str, ((Boolean) value).booleanValue());
                } else {
                    boolean z10 = value instanceof Map;
                    if (!z10) {
                        throw new IllegalArgumentException("Unsupported value type: " + d0.f44761a.b(value.getClass()));
                    }
                    Bundle bundleA = a(z10 ? (Map) value : null);
                    if (bundleA != null) {
                        bundle.putBundle(str, bundleA);
                    }
                }
            }
        }
        return bundle;
    }

    @Override // ti.b
    public final void onAttachedToEngine(ti.a flutterPluginBinding) {
        kotlin.jvm.internal.n.f(flutterPluginBinding, "flutterPluginBinding");
        p pVar = new p(flutterPluginBinding.f50789c, "flutter.oddbit.id/facebook_app_events");
        this.f44652a = pVar;
        pVar.b(this);
        Context context = flutterPluginBinding.f50787a;
        Context applicationContext = context.getApplicationContext();
        this.f44655d = applicationContext instanceof Application ? (Application) applicationContext : null;
        AppEventsLogger.Companion companion = AppEventsLogger.INSTANCE;
        kotlin.jvm.internal.n.e(context, "getApplicationContext(...)");
        this.f44653b = companion.newLogger(context);
        kotlin.jvm.internal.n.e(context, "getApplicationContext(...)");
        this.f44654c = companion.getAnonymousAppDeviceGUID(context);
        s.l("v24.0");
    }

    @Override // ti.b
    public final void onDetachedFromEngine(ti.a binding) {
        kotlin.jvm.internal.n.f(binding, "binding");
        this.f44655d = null;
        p pVar = this.f44652a;
        if (pVar != null) {
            pVar.b(null);
        } else {
            kotlin.jvm.internal.n.l("channel");
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:360:0x0596  */
    /* JADX WARN: Code duplicated, block: B:92:0x017d A[Catch: all -> 0x015a, JSONException -> 0x019c, TryCatch #2 {all -> 0x015a, blocks: (B:86:0x0157, B:90:0x015c, B:92:0x017d, B:93:0x0193, B:94:0x0198), top: B:444:0x0157 }] */
    /* JADX WARN: Code duplicated, block: B:93:0x0193 A[Catch: all -> 0x015a, JSONException -> 0x019c, TryCatch #2 {all -> 0x015a, blocks: (B:86:0x0157, B:90:0x015c, B:92:0x017d, B:93:0x0193, B:94:0x0198), top: B:444:0x0157 }] */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // xi.n
    public final void onMethodCall(m call, o oVar) {
        AppEventsLogger.ProductAvailability productAvailability;
        AppEventsLogger.ProductAvailability productAvailability2;
        AppEventsLogger.ProductCondition productCondition;
        AppEventsLogger.ProductCondition productCondition2;
        boolean zBooleanValue;
        JSONObject jSONObject;
        Context context;
        kotlin.jvm.internal.n.f(call, "call");
        String str = call.f53822a;
        if (str != null) {
            switch (str.hashCode()) {
                case -2129152299:
                    if (str.equals("getApplicationId")) {
                        AppEventsLogger appEventsLogger = this.f44653b;
                        if (appEventsLogger != null) {
                            ((j) oVar).a(appEventsLogger.getApplicationId());
                            return;
                        } else {
                            kotlin.jvm.internal.n.l("appEventsLogger");
                            throw null;
                        }
                    }
                    break;
                case -1638623807:
                    if (str.equals("clearUserDataForType")) {
                        Log.w("FacebookAppEvents", "clearUserDataForType is not supported on Android; use clearUserData() to clear all fields.");
                        ((j) oVar).a(null);
                        return;
                    }
                    break;
                case -1529535789:
                    if (str.equals("clearUserID")) {
                        AppEventsLogger.INSTANCE.clearUserID();
                        ((j) oVar).a(null);
                        return;
                    }
                    break;
                case -1146936274:
                    if (str.equals("activateApp")) {
                        Application application = this.f44655d;
                        if (application == null) {
                            ((j) oVar).b("missing_application", "could not activate app: Android application is missing", null);
                            return;
                        }
                        Object objA = call.a("applicationId");
                        AppEventsLogger.INSTANCE.activateApp(application, objA instanceof String ? (String) objA : null);
                        ((j) oVar).a(null);
                        return;
                    }
                    break;
                case -1005195390:
                    if (str.equals("clearUserData")) {
                        AppEventsLogger.INSTANCE.clearUserData();
                        ((j) oVar).a(null);
                        return;
                    }
                    break;
                case -811628443:
                    if (str.equals("logPurchase")) {
                        Double d10 = (Double) call.a("amount");
                        BigDecimal bigDecimal = d10 != null ? new BigDecimal(String.valueOf(d10.doubleValue())) : null;
                        String str2 = (String) call.a("currency");
                        if (bigDecimal == null || str2 == null) {
                            ((j) oVar).b("INVALID_ARGUMENT", "Amount and currency are required", null);
                            return;
                        }
                        Currency currency = Currency.getInstance(str2);
                        Bundle bundleA = a((Map) call.a("parameters"));
                        if (bundleA == null) {
                            bundleA = new Bundle();
                        }
                        AppEventsLogger appEventsLogger2 = this.f44653b;
                        if (appEventsLogger2 == null) {
                            kotlin.jvm.internal.n.l("appEventsLogger");
                            throw null;
                        }
                        appEventsLogger2.logPurchase(bigDecimal, currency, bundleA);
                        ((j) oVar).a(null);
                        return;
                    }
                    break;
                case -682180930:
                    if (str.equals("logProductItem")) {
                        String str3 = (String) call.a("itemId");
                        String str4 = (String) call.a("availability");
                        String str5 = (String) call.a("condition");
                        String str6 = (String) call.a("description");
                        String str7 = (String) call.a("imageLink");
                        String str8 = (String) call.a("link");
                        String str9 = (String) call.a("title");
                        Double d11 = (Double) call.a("priceAmount");
                        String str10 = (String) call.a("currency");
                        String str11 = (String) call.a("gtin");
                        String str12 = (String) call.a("mpn");
                        String str13 = (String) call.a("brand");
                        if (str3 == null || str4 == null || str5 == null || str6 == null || str7 == null || str8 == null || str9 == null || d11 == null || str10 == null) {
                            ((j) oVar).b("INVALID_ARGUMENT", "Missing required logProductItem fields", null);
                            return;
                        }
                        if (str11 == null && str12 == null && str13 == null) {
                            ((j) oVar).b("INVALID_ARGUMENT", "At least one of gtin, mpn or brand is required", null);
                            return;
                        }
                        switch (str4) {
                            case "preorder":
                                productAvailability2 = AppEventsLogger.ProductAvailability.PREORDER;
                                productAvailability = productAvailability2;
                                break;
                            case "discontinued":
                                productAvailability2 = AppEventsLogger.ProductAvailability.DISCONTINUED;
                                productAvailability = productAvailability2;
                                break;
                            case "outOfStock":
                                productAvailability2 = AppEventsLogger.ProductAvailability.OUT_OF_STOCK;
                                productAvailability = productAvailability2;
                                break;
                            case "availableForOrder":
                                productAvailability2 = AppEventsLogger.ProductAvailability.AVALIABLE_FOR_ORDER;
                                productAvailability = productAvailability2;
                                break;
                            case "inStock":
                                productAvailability2 = AppEventsLogger.ProductAvailability.IN_STOCK;
                                productAvailability = productAvailability2;
                                break;
                            default:
                                productAvailability = null;
                                break;
                        }
                        int iHashCode = str5.hashCode();
                        if (iHashCode != 3599293) {
                            if (iHashCode != 1844889811) {
                                if (iHashCode == 2008925419 && str5.equals("refurbished")) {
                                    productCondition = AppEventsLogger.ProductCondition.REFURBISHED;
                                    productCondition2 = productCondition;
                                } else {
                                    productCondition2 = null;
                                }
                            } else if (str5.equals("newItem")) {
                                productCondition = AppEventsLogger.ProductCondition.NEW;
                                productCondition2 = productCondition;
                            } else {
                                productCondition2 = null;
                            }
                        } else if (str5.equals("used")) {
                            productCondition = AppEventsLogger.ProductCondition.USED;
                            productCondition2 = productCondition;
                        } else {
                            productCondition2 = null;
                        }
                        if (productAvailability == null || productCondition2 == null) {
                            ((j) oVar).b("INVALID_ARGUMENT", "Invalid availability or condition value", null);
                            return;
                        }
                        Bundle bundleA2 = a((Map) call.a("parameters"));
                        if (bundleA2 == null) {
                            bundleA2 = new Bundle();
                        }
                        Bundle bundle = bundleA2;
                        AppEventsLogger appEventsLogger3 = this.f44653b;
                        if (appEventsLogger3 == null) {
                            kotlin.jvm.internal.n.l("appEventsLogger");
                            throw null;
                        }
                        appEventsLogger3.logProductItem(str3, productAvailability, productCondition2, str6, str7, str8, str9, BigDecimal.valueOf(d11.doubleValue()), Currency.getInstance(str10), str11, str12, str13, bundle);
                        ((j) oVar).a(null);
                        return;
                    }
                    break;
                case -635989933:
                    if (str.equals("setDebugLoggingEnabled")) {
                        g0 g0Var = g0.f45133a;
                        g0 g0Var2 = g0.f45136d;
                        Object obj = call.f53823b;
                        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
                        zBooleanValue = bool != null ? bool.booleanValue() : false;
                        s.f45219h = zBooleanValue;
                        if (zBooleanValue) {
                            s.a(g0Var2);
                            s.a(g0Var);
                        } else {
                            HashSet hashSet = s.f45213b;
                            synchronized (hashSet) {
                                hashSet.remove(g0Var2);
                            }
                            synchronized (hashSet) {
                                hashSet.remove(g0Var);
                            }
                        }
                        ((j) oVar).a(null);
                        return;
                    }
                    break;
                case -375431886:
                    if (str.equals("getAnonymousId")) {
                        String str14 = this.f44654c;
                        if (str14 != null) {
                            ((j) oVar).a(str14);
                            return;
                        } else {
                            kotlin.jvm.internal.n.l("anonymousId");
                            throw null;
                        }
                    }
                    break;
                case -90820556:
                    if (str.equals("setFlushBehavior")) {
                        Object obj2 = call.f53823b;
                        AppEventsLogger.INSTANCE.setFlushBehavior(kotlin.jvm.internal.n.a(obj2 instanceof String ? (String) obj2 : null, "explicitOnly") ? AppEventsLogger.FlushBehavior.EXPLICIT_ONLY : AppEventsLogger.FlushBehavior.AUTO);
                        ((j) oVar).a(null);
                        return;
                    }
                    break;
                case 97532676:
                    if (str.equals("flush")) {
                        AppEventsLogger appEventsLogger4 = this.f44653b;
                        if (appEventsLogger4 == null) {
                            kotlin.jvm.internal.n.l("appEventsLogger");
                            throw null;
                        }
                        appEventsLogger4.flush();
                        ((j) oVar).a(null);
                        return;
                    }
                    break;
                case 115607698:
                    if (str.equals("setPushNotificationToken")) {
                        Object obj3 = call.f53823b;
                        String str15 = obj3 instanceof String ? (String) obj3 : null;
                        if (str15 == null) {
                            ((j) oVar).b("INVALID_ARGUMENT", "Push notification token is required", null);
                            return;
                        } else {
                            AppEventsLogger.INSTANCE.setPushNotificationsRegistrationId(str15);
                            ((j) oVar).a(null);
                            return;
                        }
                    }
                    break;
                case 162121866:
                    if (str.equals("setGraphApiVersion")) {
                        Object obj4 = call.f53823b;
                        String str16 = obj4 instanceof String ? (String) obj4 : null;
                        if (str16 == null) {
                            ((j) oVar).b("INVALID_ARGUMENT", "Graph API version string is required", null);
                            return;
                        } else {
                            s.l(str16);
                            ((j) oVar).a(null);
                            return;
                        }
                    }
                    break;
                case 645367080:
                    if (str.equals("setUserID")) {
                        Object obj5 = call.f53823b;
                        String str17 = obj5 instanceof String ? (String) obj5 : null;
                        if (str17 == null) {
                            ((j) oVar).b("INVALID_ARGUMENT", "User ID is required", null);
                            return;
                        } else {
                            AppEventsLogger.INSTANCE.setUserID(str17);
                            ((j) oVar).a(null);
                            return;
                        }
                    }
                    break;
                case 792787386:
                    if (str.equals("setAutoLogAppEventsEnabled")) {
                        Object obj6 = call.f53823b;
                        Boolean bool2 = obj6 instanceof Boolean ? (Boolean) obj6 : null;
                        zBooleanValue = bool2 != null ? bool2.booleanValue() : false;
                        s sVar = s.f45212a;
                        m0 m0Var = m0.f45190a;
                        if (!v7.a.b(m0.class)) {
                            try {
                                l0 l0Var = m0.f45194e;
                                l0Var.f45187d = Boolean.valueOf(zBooleanValue);
                                l0Var.f45185b = System.currentTimeMillis();
                                if (m0.f45191b.get()) {
                                    m0Var.m(l0Var);
                                } else {
                                    m0Var.e();
                                }
                            } catch (Throwable th2) {
                                v7.a.a(m0.class, th2);
                            }
                            break;
                        }
                        if (zBooleanValue) {
                            ActivityLifecycleTracker.startTracking((Application) s.b(), s.c());
                        }
                        ((j) oVar).a(null);
                        return;
                    }
                    break;
                case 859984156:
                    if (str.equals("getUserID")) {
                        ((j) oVar).a(AppEventsLogger.INSTANCE.getUserID());
                        return;
                    }
                    break;
                case 1413464691:
                    if (str.equals("logPushNotificationOpen")) {
                        String str18 = (String) call.a("action");
                        Bundle bundleA3 = a((Map) call.a("payload"));
                        if (bundleA3 == null) {
                            ((j) oVar).b("INVALID_ARGUMENT", "Payload is required", null);
                            return;
                        }
                        if (str18 != null) {
                            AppEventsLogger appEventsLogger5 = this.f44653b;
                            if (appEventsLogger5 == null) {
                                kotlin.jvm.internal.n.l("appEventsLogger");
                                throw null;
                            }
                            appEventsLogger5.logPushNotificationOpen(bundleA3, str18);
                        } else {
                            AppEventsLogger appEventsLogger6 = this.f44653b;
                            if (appEventsLogger6 == null) {
                                kotlin.jvm.internal.n.l("appEventsLogger");
                                throw null;
                            }
                            appEventsLogger6.logPushNotificationOpen(bundleA3);
                        }
                        ((j) oVar).a(null);
                        return;
                    }
                    break;
                case 1722355863:
                    if (str.equals("setUserData")) {
                        Object obj7 = call.f53823b;
                        Map map = obj7 instanceof Map ? (Map) obj7 : null;
                        if (map == null) {
                            map = w.f53867a;
                        }
                        Bundle bundleA4 = a(map);
                        AppEventsLogger.INSTANCE.setUserData(bundleA4 != null ? bundleA4.getString(NotificationCompat.CATEGORY_EMAIL) : null, bundleA4 != null ? bundleA4.getString("firstName") : null, bundleA4 != null ? bundleA4.getString("lastName") : null, bundleA4 != null ? bundleA4.getString("phone") : null, bundleA4 != null ? bundleA4.getString("dateOfBirth") : null, bundleA4 != null ? bundleA4.getString("gender") : null, bundleA4 != null ? bundleA4.getString("city") : null, bundleA4 != null ? bundleA4.getString("state") : null, bundleA4 != null ? bundleA4.getString("zip") : null, bundleA4 != null ? bundleA4.getString("country") : null);
                        ((j) oVar).a(null);
                        return;
                    }
                    break;
                case 1740622272:
                    if (str.equals("getFlushBehavior")) {
                        AppEventsLogger.FlushBehavior flushBehavior = AppEventsLogger.INSTANCE.getFlushBehavior();
                        ((j) oVar).a((flushBehavior == null ? -1 : a.f44651a[flushBehavior.ordinal()]) != 1 ? "auto" : "explicitOnly");
                        return;
                    }
                    break;
                case 1810935691:
                    if (str.equals("getUserData")) {
                        ((j) oVar).a(AppEventsLogger.INSTANCE.getUserData());
                        return;
                    }
                    break;
                case 1817723455:
                    if (str.equals("setDataProcessingOptions")) {
                        ArrayList arrayList = (ArrayList) call.a("options");
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        Integer num = (Integer) call.a("country");
                        int iIntValue = num != null ? num.intValue() : 0;
                        Integer num2 = (Integer) call.a("state");
                        int iIntValue2 = num2 != null ? num2.intValue() : 0;
                        String[] strArr = (String[]) arrayList.toArray(new String[0]);
                        s sVar2 = s.f45212a;
                        if (!v7.a.b(s.class)) {
                            if (strArr == null) {
                                try {
                                    strArr = new String[0];
                                    try {
                                        jSONObject = new JSONObject();
                                        jSONObject.put("data_processing_options", new JSONArray((Collection) k.C0(strArr)));
                                        jSONObject.put("data_processing_options_country", iIntValue);
                                        jSONObject.put("data_processing_options_state", iIntValue2);
                                        context = s.f45220i;
                                        if (context != null) {
                                            kotlin.jvm.internal.n.l("applicationContext");
                                            throw null;
                                        }
                                        context.getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).edit().putString("data_processing_options", jSONObject.toString()).apply();
                                    } catch (JSONException unused) {
                                    }
                                } catch (Throwable th3) {
                                    v7.a.a(s.class, th3);
                                }
                            } else {
                                jSONObject = new JSONObject();
                                jSONObject.put("data_processing_options", new JSONArray((Collection) k.C0(strArr)));
                                jSONObject.put("data_processing_options_country", iIntValue);
                                jSONObject.put("data_processing_options_state", iIntValue2);
                                context = s.f45220i;
                                if (context != null) {
                                    kotlin.jvm.internal.n.l("applicationContext");
                                    throw null;
                                }
                                context.getSharedPreferences("com.facebook.sdk.DataProcessingOptions", 0).edit().putString("data_processing_options", jSONObject.toString()).apply();
                            }
                        }
                        ((j) oVar).a(null);
                        return;
                    }
                    break;
                case 1989757366:
                    if (str.equals("logEvent")) {
                        String str19 = (String) call.a("name");
                        if (str19 == null) {
                            ((j) oVar).b("INVALID_ARGUMENT", "Event name is required and cannot be null.", null);
                            return;
                        }
                        Map map2 = (Map) call.a("parameters");
                        Double d12 = (Double) call.a(AppEventsConstants.EVENT_PARAM_VALUE_TO_SUM);
                        if (d12 != null && map2 != null) {
                            Bundle bundleA5 = a(map2);
                            AppEventsLogger appEventsLogger7 = this.f44653b;
                            if (appEventsLogger7 == null) {
                                kotlin.jvm.internal.n.l("appEventsLogger");
                                throw null;
                            }
                            appEventsLogger7.logEvent(str19, d12.doubleValue(), bundleA5);
                        } else if (d12 != null) {
                            AppEventsLogger appEventsLogger8 = this.f44653b;
                            if (appEventsLogger8 == null) {
                                kotlin.jvm.internal.n.l("appEventsLogger");
                                throw null;
                            }
                            appEventsLogger8.logEvent(str19, d12.doubleValue());
                        } else if (map2 != null) {
                            Bundle bundleA6 = a(map2);
                            AppEventsLogger appEventsLogger9 = this.f44653b;
                            if (appEventsLogger9 == null) {
                                kotlin.jvm.internal.n.l("appEventsLogger");
                                throw null;
                            }
                            appEventsLogger9.logEvent(str19, bundleA6);
                        } else {
                            AppEventsLogger appEventsLogger10 = this.f44653b;
                            if (appEventsLogger10 == null) {
                                kotlin.jvm.internal.n.l("appEventsLogger");
                                throw null;
                            }
                            appEventsLogger10.logEvent(str19);
                        }
                        ((j) oVar).a(null);
                        return;
                    }
                    break;
                case 2126113028:
                    if (str.equals("setAdvertiserTracking")) {
                        Boolean bool3 = (Boolean) call.a("enabled");
                        boolean zBooleanValue2 = bool3 != null ? bool3.booleanValue() : false;
                        Boolean bool4 = (Boolean) call.a("collectId");
                        boolean z10 = zBooleanValue2 && (bool4 != null ? bool4.booleanValue() : true);
                        s sVar3 = s.f45212a;
                        m0 m0Var2 = m0.f45190a;
                        if (!v7.a.b(m0.class)) {
                            try {
                                l0 l0Var2 = m0.f45195f;
                                l0Var2.f45187d = Boolean.valueOf(z10);
                                l0Var2.f45185b = System.currentTimeMillis();
                                if (m0.f45191b.get()) {
                                    m0Var2.m(l0Var2);
                                } else {
                                    m0Var2.e();
                                }
                            } catch (Throwable th4) {
                                v7.a.a(m0.class, th4);
                            }
                            break;
                        }
                        ((j) oVar).a(null);
                        return;
                    }
                    break;
            }
        }
        ((j) oVar).c();
    }
}
