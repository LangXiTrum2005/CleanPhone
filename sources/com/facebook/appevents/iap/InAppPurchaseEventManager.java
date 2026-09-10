package com.facebook.appevents.iap;

import an.h;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.NotificationCompat;
import com.facebook.appevents.internal.Constants;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJM\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013JM\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J3\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u00152\u0016\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u001a\u001a\u00020\u00192\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u001f\u0010 J1\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b!\u0010 J9\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\"\u0010#J1\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b$\u0010 J7\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u000bH\u0002¢\u0006\u0004\b%\u0010#J7\u0010'\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f2\u0016\u0010&\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\fH\u0002¢\u0006\u0004\b'\u0010(J%\u0010-\u001a\u0004\u0018\u00010,2\n\u0010*\u001a\u0006\u0012\u0002\b\u00030)2\u0006\u0010+\u001a\u00020\u000bH\u0002¢\u0006\u0004\b-\u0010.J%\u00100\u001a\b\u0012\u0002\b\u0003\u0018\u00010)2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u000bH\u0002¢\u0006\u0004\b0\u00101JC\u00105\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u000b2\u0006\u0010+\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u00010\u00012\u000e\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000103H\u0002¢\u0006\u0004\b5\u00106J\u000f\u00107\u001a\u00020\u0019H\u0007¢\u0006\u0004\b7\u0010\u0003J\u0015\u00109\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u000b¢\u0006\u0004\b9\u0010:R0\u0010=\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020,0;j\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020,`<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R8\u0010?\u001a&\u0012\u0004\u0012\u00020\u000b\u0012\b\u0012\u0006\u0012\u0002\b\u00030)0;j\u0012\u0012\u0004\u0012\u00020\u000b\u0012\b\u0012\u0006\u0012\u0002\b\u00030)`<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010>R\u0014\u0010A\u001a\u00020@8\u0002X\u0082T¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020@8\u0002X\u0082T¢\u0006\u0006\n\u0004\bC\u0010BR\u0014\u0010D\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bF\u0010ER\u0014\u0010G\u001a\u00020@8\u0002X\u0082T¢\u0006\u0006\n\u0004\bG\u0010BR\u0014\u0010H\u001a\u00020@8\u0002X\u0082T¢\u0006\u0006\n\u0004\bH\u0010BR\u0014\u0010I\u001a\u00020@8\u0002X\u0082T¢\u0006\u0006\n\u0004\bI\u0010BR\u0014\u0010J\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bJ\u0010ER\u0014\u0010K\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bK\u0010ER\u0014\u0010L\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bL\u0010ER\u0014\u0010M\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bM\u0010ER\u0014\u0010N\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bN\u0010ER\u0014\u0010O\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bO\u0010ER\u0014\u0010P\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bP\u0010ER\u0014\u0010Q\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bQ\u0010ER\u0014\u0010R\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bR\u0010ER\u0014\u0010S\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bS\u0010ER\u0014\u0010T\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bT\u0010ER\u0014\u0010U\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bU\u0010ER\u0014\u0010V\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bV\u0010ER\u001c\u0010X\u001a\n W*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010ER\u0014\u0010Y\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bY\u0010ER\u0014\u0010Z\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\bZ\u0010ER\u001c\u0010\\\u001a\n W*\u0004\u0018\u00010[0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R\u001c\u0010^\u001a\n W*\u0004\u0018\u00010[0[8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010]¨\u0006_"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseEventManager;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/os/IBinder;", NotificationCompat.CATEGORY_SERVICE, InAppPurchaseEventManager.AS_INTERFACE, "(Landroid/content/Context;Landroid/os/IBinder;)Ljava/lang/Object;", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "skuList", "inAppBillingObj", "", "isSubscription", "", InAppPurchaseEventManager.GET_SKU_DETAILS, "(Landroid/content/Context;Ljava/util/ArrayList;Ljava/lang/Object;Z)Ljava/util/Map;", "getSkuDetailsFromGoogle", "", "readSkuDetailsFromCache", "(Ljava/util/ArrayList;)Ljava/util/Map;", "skuDetailsMap", "Lwj/r;", "writeSkuDetailsToCache", "(Ljava/util/Map;)V", "type", InAppPurchaseEventManager.IS_BILLING_SUPPORTED, "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;)Z", "getPurchasesInapp", "(Landroid/content/Context;Ljava/lang/Object;)Ljava/util/ArrayList;", "getPurchasesSubs", InAppPurchaseEventManager.GET_PURCHASES, "(Landroid/content/Context;Ljava/lang/Object;Ljava/lang/String;)Ljava/util/ArrayList;", "getPurchaseHistoryInapp", InAppPurchaseEventManager.GET_PURCHASE_HISTORY, "purchases", "filterPurchases", "(Ljava/util/ArrayList;)Ljava/util/ArrayList;", "Ljava/lang/Class;", "classObj", "methodName", "Ljava/lang/reflect/Method;", "getMethod", "(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;", "className", "getClass", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/Class;", "obj", "", "args", "invokeMethod", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "clearSkuDetailsCache", "skuDetail", "hasFreeTrialPeirod", "(Ljava/lang/String;)Z", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "methodMap", "Ljava/util/HashMap;", "classMap", "", "CACHE_CLEAR_TIME_LIMIT_SEC", "I", "SKU_DETAIL_EXPIRE_TIME_SEC", "SUBSCRIPTION", "Ljava/lang/String;", "INAPP", "PURCHASE_EXPIRE_TIME_SEC", "PURCHASE_STOP_QUERY_TIME_SEC", "MAX_QUERY_PURCHASE_NUM", "IN_APP_BILLING_SERVICE_STUB", "IN_APP_BILLING_SERVICE", "AS_INTERFACE", "GET_SKU_DETAILS", "GET_PURCHASES", "GET_PURCHASE_HISTORY", "IS_BILLING_SUPPORTED", InAppPurchaseEventManager.ITEM_ID_LIST, InAppPurchaseEventManager.RESPONSE_CODE, InAppPurchaseEventManager.DETAILS_LIST, InAppPurchaseEventManager.INAPP_PURCHASE_DATA_LIST, InAppPurchaseEventManager.INAPP_CONTINUATION_TOKEN, InAppPurchaseEventManager.LAST_CLEARED_TIME, "kotlin.jvm.PlatformType", "PACKAGE_NAME", "SKU_DETAILS_STORE", "PURCHASE_INAPP_STORE", "Landroid/content/SharedPreferences;", "skuDetailSharedPrefs", "Landroid/content/SharedPreferences;", "purchaseInappSharedPrefs", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class InAppPurchaseEventManager {
    private static final String AS_INTERFACE = "asInterface";
    private static final int CACHE_CLEAR_TIME_LIMIT_SEC = 604800;
    private static final String DETAILS_LIST = "DETAILS_LIST";
    private static final String GET_PURCHASES = "getPurchases";
    private static final String GET_PURCHASE_HISTORY = "getPurchaseHistory";
    private static final String GET_SKU_DETAILS = "getSkuDetails";
    private static final String INAPP = "inapp";
    private static final String INAPP_CONTINUATION_TOKEN = "INAPP_CONTINUATION_TOKEN";
    private static final String INAPP_PURCHASE_DATA_LIST = "INAPP_PURCHASE_DATA_LIST";
    private static final String IN_APP_BILLING_SERVICE = "com.android.vending.billing.IInAppBillingService";
    private static final String IN_APP_BILLING_SERVICE_STUB = "com.android.vending.billing.IInAppBillingService$Stub";
    private static final String IS_BILLING_SUPPORTED = "isBillingSupported";
    private static final String ITEM_ID_LIST = "ITEM_ID_LIST";
    private static final String LAST_CLEARED_TIME = "LAST_CLEARED_TIME";
    private static final int MAX_QUERY_PURCHASE_NUM = 30;
    private static final int PURCHASE_EXPIRE_TIME_SEC = 86400;
    private static final int PURCHASE_STOP_QUERY_TIME_SEC = 1200;
    private static final String RESPONSE_CODE = "RESPONSE_CODE";
    private static final int SKU_DETAIL_EXPIRE_TIME_SEC = 43200;
    private static final String SUBSCRIPTION = "subs";
    public static final InAppPurchaseEventManager INSTANCE = new InAppPurchaseEventManager();
    private static final HashMap<String, Method> methodMap = new HashMap<>();
    private static final HashMap<String, Class<?>> classMap = new HashMap<>();
    private static final String PACKAGE_NAME = s.b().getPackageName();
    private static final String SKU_DETAILS_STORE = "com.facebook.internal.SKU_DETAILS";
    private static final SharedPreferences skuDetailSharedPrefs = s.b().getSharedPreferences(SKU_DETAILS_STORE, 0);
    private static final String PURCHASE_INAPP_STORE = "com.facebook.internal.PURCHASE";
    private static final SharedPreferences purchaseInappSharedPrefs = s.b().getSharedPreferences(PURCHASE_INAPP_STORE, 0);

    private InAppPurchaseEventManager() {
    }

    public static final Object asInterface(Context context, IBinder service) {
        if (v7.a.b(InAppPurchaseEventManager.class)) {
            return null;
        }
        try {
            n.f(context, "context");
            return INSTANCE.invokeMethod(context, IN_APP_BILLING_SERVICE_STUB, AS_INTERFACE, null, new Object[]{service});
        } catch (Throwable th2) {
            v7.a.a(InAppPurchaseEventManager.class, th2);
            return null;
        }
    }

    public static final void clearSkuDetailsCache() {
        if (v7.a.b(InAppPurchaseEventManager.class)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences sharedPreferences = skuDetailSharedPrefs;
            long j10 = sharedPreferences.getLong(LAST_CLEARED_TIME, 0L);
            if (j10 == 0) {
                sharedPreferences.edit().putLong(LAST_CLEARED_TIME, jCurrentTimeMillis).apply();
            } else if (jCurrentTimeMillis - j10 > 604800) {
                sharedPreferences.edit().clear().putLong(LAST_CLEARED_TIME, jCurrentTimeMillis).apply();
            }
        } catch (Throwable th2) {
            v7.a.a(InAppPurchaseEventManager.class, th2);
        }
    }

    private final ArrayList<String> filterPurchases(ArrayList<String> purchases) {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            SharedPreferences.Editor editorEdit = purchaseInappSharedPrefs.edit();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            for (String str : purchases) {
                try {
                    JSONObject jSONObject = new JSONObject(str);
                    String string = jSONObject.getString("productId");
                    long j10 = jSONObject.getLong(Constants.GP_IAP_PURCHASE_TIME);
                    String string2 = jSONObject.getString(Constants.GP_IAP_PURCHASE_TOKEN);
                    if (jCurrentTimeMillis - (j10 / 1000) <= 86400 && !n.a(purchaseInappSharedPrefs.getString(string, ""), string2)) {
                        editorEdit.putString(string, string2);
                        arrayList.add(str);
                    }
                } catch (JSONException unused) {
                }
            }
            editorEdit.apply();
            return arrayList;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    private final Class<?> getClass(Context context, String className) {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            HashMap<String, Class<?>> map = classMap;
            Class<?> cls = map.get(className);
            if (cls != null) {
                return cls;
            }
            Class<?> classFromContext$facebook_core_release = InAppPurchaseUtils.getClassFromContext$facebook_core_release(context, className);
            if (classFromContext$facebook_core_release == null) {
                return classFromContext$facebook_core_release;
            }
            map.put(className, classFromContext$facebook_core_release);
            return classFromContext$facebook_core_release;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:32:0x0070  */
    private final Method getMethod(Class<?> classObj, String methodName) {
        Class[] clsArr;
        if (v7.a.b(this)) {
            return null;
        }
        try {
            HashMap<String, Method> map = methodMap;
            Method method = map.get(methodName);
            if (method != null) {
                return method;
            }
            Class TYPE = Integer.TYPE;
            switch (methodName) {
                case "getPurchases":
                    n.e(TYPE, "TYPE");
                    clsArr = new Class[]{TYPE, String.class, String.class, String.class};
                    break;
                case "isBillingSupported":
                    n.e(TYPE, "TYPE");
                    clsArr = new Class[]{TYPE, String.class, String.class};
                    break;
                case "asInterface":
                    clsArr = new Class[]{IBinder.class};
                    break;
                case "getPurchaseHistory":
                    n.e(TYPE, "TYPE");
                    clsArr = new Class[]{TYPE, String.class, String.class, String.class, Bundle.class};
                    break;
                case "getSkuDetails":
                    n.e(TYPE, "TYPE");
                    clsArr = new Class[]{TYPE, String.class, String.class, Bundle.class};
                    break;
                default:
                    clsArr = null;
                    break;
            }
            Method declaredMethod$facebook_core_release = clsArr == null ? InAppPurchaseUtils.getDeclaredMethod$facebook_core_release(classObj, methodName, null) : InAppPurchaseUtils.getDeclaredMethod$facebook_core_release(classObj, methodName, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (declaredMethod$facebook_core_release != null) {
                map.put(methodName, declaredMethod$facebook_core_release);
            }
            return declaredMethod$facebook_core_release;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0089  */
    private final ArrayList<String> getPurchaseHistory(Context context, Object inAppBillingObj, String type) {
        ArrayList<String> stringArrayList;
        if (v7.a.b(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (isBillingSupported(context, inAppBillingObj, type)) {
                int i10 = 0;
                String string = null;
                boolean z10 = false;
                do {
                    Object objInvokeMethod = invokeMethod(context, IN_APP_BILLING_SERVICE, GET_PURCHASE_HISTORY, inAppBillingObj, new Object[]{6, PACKAGE_NAME, type, string, new Bundle()});
                    if (objInvokeMethod != null) {
                        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
                        Bundle bundle = (Bundle) objInvokeMethod;
                        if (bundle.getInt(RESPONSE_CODE) != 0 || (stringArrayList = bundle.getStringArrayList(INAPP_PURCHASE_DATA_LIST)) == null) {
                            string = null;
                        } else {
                            for (String str : stringArrayList) {
                                try {
                                    if (jCurrentTimeMillis - (new JSONObject(str).getLong(Constants.GP_IAP_PURCHASE_TIME) / 1000) > 1200) {
                                        z10 = true;
                                        break;
                                    }
                                    arrayList.add(str);
                                    i10++;
                                } catch (JSONException unused) {
                                }
                            }
                            string = bundle.getString(INAPP_CONTINUATION_TOKEN);
                        }
                    } else {
                        string = null;
                    }
                    if (i10 >= 30 || string == null) {
                        break;
                    }
                } while (!z10);
            }
            return arrayList;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    public static final ArrayList<String> getPurchaseHistoryInapp(Context context, Object inAppBillingObj) {
        InAppPurchaseEventManager inAppPurchaseEventManager;
        Class<?> cls;
        if (v7.a.b(InAppPurchaseEventManager.class)) {
            return null;
        }
        try {
            n.f(context, "context");
            ArrayList<String> arrayList = new ArrayList<>();
            if (inAppBillingObj != null && (cls = (inAppPurchaseEventManager = INSTANCE).getClass(context, IN_APP_BILLING_SERVICE)) != null && inAppPurchaseEventManager.getMethod(cls, GET_PURCHASE_HISTORY) != null) {
                return inAppPurchaseEventManager.filterPurchases(inAppPurchaseEventManager.getPurchaseHistory(context, inAppBillingObj, "inapp"));
            }
            return arrayList;
        } catch (Throwable th2) {
            v7.a.a(InAppPurchaseEventManager.class, th2);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0055  */
    private final ArrayList<String> getPurchases(Context context, Object inAppBillingObj, String type) {
        InAppPurchaseEventManager inAppPurchaseEventManager;
        if (v7.a.b(this)) {
            return null;
        }
        try {
            ArrayList<String> arrayList = new ArrayList<>();
            if (inAppBillingObj != null && isBillingSupported(context, inAppBillingObj, type)) {
                int size = 0;
                String string = null;
                while (true) {
                    inAppPurchaseEventManager = this;
                    Context context2 = context;
                    Object obj = inAppBillingObj;
                    try {
                        Object objInvokeMethod = inAppPurchaseEventManager.invokeMethod(context2, IN_APP_BILLING_SERVICE, GET_PURCHASES, obj, new Object[]{3, PACKAGE_NAME, type, string});
                        if (objInvokeMethod == null) {
                            string = null;
                            if (size >= 30) {
                                break;
                            }
                            break;
                            break;
                        }
                        Bundle bundle = (Bundle) objInvokeMethod;
                        if (bundle.getInt(RESPONSE_CODE) == 0) {
                            ArrayList<String> stringArrayList = bundle.getStringArrayList(INAPP_PURCHASE_DATA_LIST);
                            if (stringArrayList == null) {
                                break;
                            }
                            size += stringArrayList.size();
                            arrayList.addAll(stringArrayList);
                            string = bundle.getString(INAPP_CONTINUATION_TOKEN);
                        } else {
                            string = null;
                        }
                        if (size >= 30 || string == null) {
                            break;
                        }
                        this = inAppPurchaseEventManager;
                        context = context2;
                        inAppBillingObj = obj;
                    } catch (Throwable th2) {
                        th = th2;
                        v7.a.a(inAppPurchaseEventManager, th);
                        return null;
                    }
                }
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
            inAppPurchaseEventManager = this;
        }
    }

    public static final ArrayList<String> getPurchasesInapp(Context context, Object inAppBillingObj) {
        if (v7.a.b(InAppPurchaseEventManager.class)) {
            return null;
        }
        try {
            n.f(context, "context");
            InAppPurchaseEventManager inAppPurchaseEventManager = INSTANCE;
            return inAppPurchaseEventManager.filterPurchases(inAppPurchaseEventManager.getPurchases(context, inAppBillingObj, "inapp"));
        } catch (Throwable th2) {
            v7.a.a(InAppPurchaseEventManager.class, th2);
            return null;
        }
    }

    public static final ArrayList<String> getPurchasesSubs(Context context, Object inAppBillingObj) {
        if (v7.a.b(InAppPurchaseEventManager.class)) {
            return null;
        }
        try {
            n.f(context, "context");
            InAppPurchaseEventManager inAppPurchaseEventManager = INSTANCE;
            return inAppPurchaseEventManager.filterPurchases(inAppPurchaseEventManager.getPurchases(context, inAppBillingObj, "subs"));
        } catch (Throwable th2) {
            v7.a.a(InAppPurchaseEventManager.class, th2);
            return null;
        }
    }

    public static final Map<String, String> getSkuDetails(Context context, ArrayList<String> skuList, Object inAppBillingObj, boolean isSubscription) {
        if (v7.a.b(InAppPurchaseEventManager.class)) {
            return null;
        }
        try {
            n.f(context, "context");
            n.f(skuList, "skuList");
            Map<String, String> skuDetailsFromCache = INSTANCE.readSkuDetailsFromCache(skuList);
            ArrayList<String> arrayList = new ArrayList<>();
            for (String str : skuList) {
                if (!skuDetailsFromCache.containsKey(str)) {
                    arrayList.add(str);
                }
            }
            skuDetailsFromCache.putAll(INSTANCE.getSkuDetailsFromGoogle(context, arrayList, inAppBillingObj, isSubscription));
            return skuDetailsFromCache;
        } catch (Throwable th2) {
            v7.a.a(InAppPurchaseEventManager.class, th2);
            return null;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 2, instructions: 3 */
    private final Map<String, String> getSkuDetailsFromGoogle(Context context, ArrayList<String> skuList, Object inAppBillingObj, boolean isSubscription) {
        InAppPurchaseEventManager inAppPurchaseEventManager;
        if (v7.a.b(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            if (inAppBillingObj != null && !skuList.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putStringArrayList(ITEM_ID_LIST, skuList);
                inAppPurchaseEventManager = this;
                try {
                    Object objInvokeMethod = inAppPurchaseEventManager.invokeMethod(context, IN_APP_BILLING_SERVICE, GET_SKU_DETAILS, inAppBillingObj, new Object[]{3, PACKAGE_NAME, isSubscription ? "subs" : "inapp", bundle});
                    if (objInvokeMethod != null) {
                        Bundle bundle2 = (Bundle) objInvokeMethod;
                        if (bundle2.getInt(RESPONSE_CODE) == 0) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList(DETAILS_LIST);
                            if (stringArrayList != null && skuList.size() == stringArrayList.size()) {
                                int size = skuList.size();
                                for (int i10 = 0; i10 < size; i10++) {
                                    String str = skuList.get(i10);
                                    n.e(str, "skuList[i]");
                                    String str2 = stringArrayList.get(i10);
                                    n.e(str2, "skuDetailsList[i]");
                                    linkedHashMap.put(str, str2);
                                }
                            }
                            inAppPurchaseEventManager.writeSkuDetailsToCache(linkedHashMap);
                            return linkedHashMap;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    v7.a.a(inAppPurchaseEventManager, th);
                    return null;
                }
            }
            return linkedHashMap;
        } catch (Throwable th3) {
            th = th3;
            inAppPurchaseEventManager = this;
            v7.a.a(inAppPurchaseEventManager, th);
            return null;
        }
    }

    private final Object invokeMethod(Context context, String className, String methodName, Object obj, Object[] args) {
        Method method;
        if (v7.a.b(this)) {
            return null;
        }
        try {
            Class<?> cls = getClass(context, className);
            if (cls == null || (method = getMethod(cls, methodName)) == null) {
                return null;
            }
            return InAppPurchaseUtils.invokeMethod(cls, method, obj, Arrays.copyOf(args, args.length));
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    private final boolean isBillingSupported(Context context, Object inAppBillingObj, String type) {
        InAppPurchaseEventManager inAppPurchaseEventManager;
        if (v7.a.b(this) || inAppBillingObj == null) {
            return false;
        }
        try {
            inAppPurchaseEventManager = this;
            try {
                Object objInvokeMethod = inAppPurchaseEventManager.invokeMethod(context, IN_APP_BILLING_SERVICE, IS_BILLING_SUPPORTED, inAppBillingObj, new Object[]{3, PACKAGE_NAME, type});
                return objInvokeMethod != null && ((Integer) objInvokeMethod).intValue() == 0;
            } catch (Throwable th2) {
                th = th2;
                v7.a.a(inAppPurchaseEventManager, th);
                return false;
            }
        } catch (Throwable th3) {
            th = th3;
            inAppPurchaseEventManager = this;
        }
    }

    private final Map<String, String> readSkuDetailsFromCache(ArrayList<String> skuList) {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            for (String sku : skuList) {
                String string = skuDetailSharedPrefs.getString(sku, null);
                if (string != null) {
                    List listI0 = h.I0(string, new String[]{";"}, 2, 2);
                    if (jCurrentTimeMillis - Long.parseLong((String) listI0.get(0)) < 43200) {
                        n.e(sku, "sku");
                        linkedHashMap.put(sku, listI0.get(1));
                    } else {
                        continue;
                    }
                }
            }
            return linkedHashMap;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    private final void writeSkuDetailsToCache(Map<String, String> skuDetailsMap) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
            SharedPreferences.Editor editorEdit = skuDetailSharedPrefs.edit();
            for (Map.Entry<String, String> entry : skuDetailsMap.entrySet()) {
                editorEdit.putString(entry.getKey(), jCurrentTimeMillis + ';' + entry.getValue());
            }
            editorEdit.apply();
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final boolean hasFreeTrialPeirod(String skuDetail) {
        if (v7.a.b(this)) {
            return false;
        }
        try {
            n.f(skuDetail, "skuDetail");
            try {
                String strOptString = new JSONObject(skuDetail).optString(Constants.GP_IAP_FREE_TRIAL_PERIOD);
                return strOptString != null && strOptString.length() > 0;
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return false;
        }
    }
}
