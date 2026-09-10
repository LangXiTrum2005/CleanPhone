package com.facebook.appevents.internal;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.facebook.appevents.AppEventsConstants;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.InternalAppEventsLogger;
import com.facebook.appevents.OperationalData;
import com.facebook.appevents.OperationalDataEnum;
import com.facebook.appevents.iap.InAppPurchase;
import com.facebook.appevents.iap.InAppPurchaseDedupeConfig;
import com.facebook.appevents.iap.InAppPurchaseEventManager;
import com.facebook.appevents.iap.InAppPurchaseManager;
import com.facebook.appevents.iap.InAppPurchaseUtils;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import j1.f;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Currency;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.m0;
import l7.s;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import q7.q;
import q7.r;
import q7.u;
import xj.o;
import xj.p;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u00017B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\n\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0013\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u0004\u0018\u00010\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ'\u0010\u001c\u001a\u0004\u0018\u00010\u00182\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u001b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ1\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b \u0010!J7\u0010)\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00182\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J7\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u00182\u0006\u0010%\u001a\u00020$2\u0006\u0010(\u001a\u00020&H\u0002¢\u0006\u0004\b+\u0010,JE\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00152\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060-2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b \u0010/R\u001c\u00101\u001a\n 0*\u0004\u0018\u00010\u00060\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00103\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b3\u00102R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, d2 = {"Lcom/facebook/appevents/internal/AutomaticAnalyticsLogger;", "", "<init>", "()V", "Lwj/r;", "logActivateAppEvent", "", "activityName", "", "timeSpentInSeconds", "logActivityTimeSpentEvent", "(Ljava/lang/String;J)V", "purchase", "skuDetails", "", "isSubscription", "Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "billingClientVersion", "isFirstAppLaunch", "logPurchase", "(Ljava/lang/String;Ljava/lang/String;ZLcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;Z)V", "", "Lcom/facebook/appevents/internal/AutomaticAnalyticsLogger$PurchaseLoggingParameters;", "purchaseLoggingParametersList", "Landroid/os/Bundle;", "getPurchaseDedupeParameters", "(Ljava/util/List;)Landroid/os/Bundle;", X3.i.f27798j0, "getSubscriptionDedupeParameters", "(Ljava/util/List;Ljava/lang/String;)Landroid/os/Bundle;", "isImplicitPurchaseLoggingEnabled", "()Z", "getPurchaseLoggingParameters", "(Ljava/lang/String;Ljava/lang/String;Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;)Ljava/util/List;", "type", "params", "Lcom/facebook/appevents/OperationalData;", "operationalData", "Lorg/json/JSONObject;", "purchaseJSON", "skuDetailsJSON", "getPurchaseParametersGPBLV2V4", "(Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/appevents/OperationalData;Lorg/json/JSONObject;Lorg/json/JSONObject;)Lcom/facebook/appevents/internal/AutomaticAnalyticsLogger$PurchaseLoggingParameters;", "getPurchaseParametersGPBLV5V7", "(Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/appevents/OperationalData;Lorg/json/JSONObject;)Ljava/util/List;", "", "extraParameter", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;)Ljava/util/List;", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "APP_EVENTS_IF_AUTO_LOG_SUBS", "Lcom/facebook/appevents/InternalAppEventsLogger;", "internalAppEventsLogger", "Lcom/facebook/appevents/InternalAppEventsLogger;", "PurchaseLoggingParameters", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AutomaticAnalyticsLogger {
    private static final String APP_EVENTS_IF_AUTO_LOG_SUBS = "app_events_if_auto_log_subs";
    public static final AutomaticAnalyticsLogger INSTANCE = new AutomaticAnalyticsLogger();
    private static final String TAG = AutomaticAnalyticsLogger.class.getCanonicalName();
    private static final InternalAppEventsLogger internalAppEventsLogger = new InternalAppEventsLogger(s.b());

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B'\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lcom/facebook/appevents/internal/AutomaticAnalyticsLogger$PurchaseLoggingParameters;", "", "purchaseAmount", "Ljava/math/BigDecimal;", "currency", "Ljava/util/Currency;", "param", "Landroid/os/Bundle;", "operationalData", "Lcom/facebook/appevents/OperationalData;", "(Ljava/math/BigDecimal;Ljava/util/Currency;Landroid/os/Bundle;Lcom/facebook/appevents/OperationalData;)V", "getCurrency", "()Ljava/util/Currency;", "setCurrency", "(Ljava/util/Currency;)V", "getOperationalData", "()Lcom/facebook/appevents/OperationalData;", "setOperationalData", "(Lcom/facebook/appevents/OperationalData;)V", "getParam", "()Landroid/os/Bundle;", "setParam", "(Landroid/os/Bundle;)V", "getPurchaseAmount", "()Ljava/math/BigDecimal;", "setPurchaseAmount", "(Ljava/math/BigDecimal;)V", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class PurchaseLoggingParameters {
        private Currency currency;
        private OperationalData operationalData;
        private Bundle param;
        private BigDecimal purchaseAmount;

        public PurchaseLoggingParameters(BigDecimal purchaseAmount, Currency currency, Bundle param, OperationalData operationalData) {
            n.f(purchaseAmount, "purchaseAmount");
            n.f(currency, "currency");
            n.f(param, "param");
            n.f(operationalData, "operationalData");
            this.purchaseAmount = purchaseAmount;
            this.currency = currency;
            this.param = param;
            this.operationalData = operationalData;
        }

        public final Currency getCurrency() {
            return this.currency;
        }

        public final OperationalData getOperationalData() {
            return this.operationalData;
        }

        public final Bundle getParam() {
            return this.param;
        }

        public final BigDecimal getPurchaseAmount() {
            return this.purchaseAmount;
        }

        public final void setCurrency(Currency currency) {
            n.f(currency, "<set-?>");
            this.currency = currency;
        }

        public final void setOperationalData(OperationalData operationalData) {
            n.f(operationalData, "<set-?>");
            this.operationalData = operationalData;
        }

        public final void setParam(Bundle bundle) {
            n.f(bundle, "<set-?>");
            this.param = bundle;
        }

        public final void setPurchaseAmount(BigDecimal bigDecimal) {
            n.f(bigDecimal, "<set-?>");
            this.purchaseAmount = bigDecimal;
        }
    }

    private AutomaticAnalyticsLogger() {
    }

    public static final synchronized Bundle getPurchaseDedupeParameters(List<PurchaseLoggingParameters> purchaseLoggingParametersList) {
        PurchaseLoggingParameters purchaseLoggingParameters;
        n.f(purchaseLoggingParametersList, "purchaseLoggingParametersList");
        purchaseLoggingParameters = purchaseLoggingParametersList.get(0);
        return InAppPurchaseManager.performDedupe(f.C(new InAppPurchase(AppEventsConstants.EVENT_NAME_PURCHASED, purchaseLoggingParameters.getPurchaseAmount().doubleValue(), purchaseLoggingParameters.getCurrency())), System.currentTimeMillis(), true, f.C(new wj.f(purchaseLoggingParameters.getParam(), purchaseLoggingParameters.getOperationalData())));
    }

    private final List<PurchaseLoggingParameters> getPurchaseLoggingParameters(String purchase, String skuDetails, InAppPurchaseUtils.BillingClientVersion billingClientVersion) {
        return getPurchaseLoggingParameters(purchase, skuDetails, new HashMap(), billingClientVersion);
    }

    private final PurchaseLoggingParameters getPurchaseParametersGPBLV2V4(String type, Bundle params, OperationalData operationalData, JSONObject purchaseJSON, JSONObject skuDetailsJSON) {
        Bundle bundle;
        OperationalData operationalData2;
        if (n.a(type, InAppPurchaseUtils.IAPProductType.SUBS.getType())) {
            OperationalData.Companion companion = OperationalData.INSTANCE;
            OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
            String string = Boolean.toString(purchaseJSON.optBoolean(Constants.GP_IAP_AUTORENEWING, false));
            n.e(string, "toString(\n              …      )\n                )");
            bundle = params;
            operationalData2 = operationalData;
            companion.addParameter(operationalDataEnum, Constants.IAP_SUBSCRIPTION_AUTORENEWING, string, bundle, operationalData2);
            String strOptString = skuDetailsJSON.optString(Constants.GP_IAP_SUBSCRIPTION_PERIOD);
            n.e(strOptString, "skuDetailsJSON.optString…_IAP_SUBSCRIPTION_PERIOD)");
            companion.addParameter(operationalDataEnum, Constants.IAP_SUBSCRIPTION_PERIOD, strOptString, bundle, operationalData2);
            String strOptString2 = skuDetailsJSON.optString(Constants.GP_IAP_FREE_TRIAL_PERIOD);
            n.e(strOptString2, "skuDetailsJSON.optString…GP_IAP_FREE_TRIAL_PERIOD)");
            companion.addParameter(operationalDataEnum, Constants.IAP_FREE_TRIAL_PERIOD, strOptString2, bundle, operationalData2);
            String introductoryPriceCycles = skuDetailsJSON.optString(Constants.GP_IAP_INTRODUCTORY_PRICE_CYCLES);
            n.e(introductoryPriceCycles, "introductoryPriceCycles");
            if (introductoryPriceCycles.length() > 0) {
                companion.addParameter(operationalDataEnum, Constants.IAP_INTRO_PRICE_CYCLES, introductoryPriceCycles, bundle, operationalData2);
            }
            String introductoryPricePeriod = skuDetailsJSON.optString(Constants.GP_IAP_INTRODUCTORY_PRICE_PERIOD);
            n.e(introductoryPricePeriod, "introductoryPricePeriod");
            if (introductoryPricePeriod.length() > 0) {
                companion.addParameter(operationalDataEnum, Constants.IAP_INTRO_PERIOD, introductoryPricePeriod, bundle, operationalData2);
            }
            String introductoryPriceAmountMicros = skuDetailsJSON.optString(Constants.GP_IAP_INTRODUCTORY_PRICE_AMOUNT_MICROS);
            n.e(introductoryPriceAmountMicros, "introductoryPriceAmountMicros");
            if (introductoryPriceAmountMicros.length() > 0) {
                companion.addParameter(operationalDataEnum, Constants.IAP_INTRO_PRICE_AMOUNT_MICROS, introductoryPriceAmountMicros, bundle, operationalData2);
            }
        } else {
            bundle = params;
            operationalData2 = operationalData;
        }
        BigDecimal bigDecimal = new BigDecimal(skuDetailsJSON.getLong(Constants.GP_IAP_PRICE_AMOUNT_MICROS_V2V4) / 1000000.0d);
        Currency currency = Currency.getInstance(skuDetailsJSON.getString(Constants.GP_IAP_PRICE_CURRENCY_CODE_V2V4));
        n.e(currency, "getInstance(skuDetailsJS…RICE_CURRENCY_CODE_V2V4))");
        return new PurchaseLoggingParameters(bigDecimal, currency, bundle, operationalData2);
    }

    private final List<PurchaseLoggingParameters> getPurchaseParametersGPBLV5V7(String type, Bundle params, OperationalData operationalData, JSONObject skuDetailsJSON) throws JSONException {
        if (!n.a(type, InAppPurchaseUtils.IAPProductType.SUBS.getType())) {
            JSONObject jSONObject = skuDetailsJSON.getJSONObject(Constants.GP_IAP_ONE_TIME_PURCHASE_OFFER_DETAILS);
            if (jSONObject == null) {
                return null;
            }
            BigDecimal bigDecimal = new BigDecimal(jSONObject.getLong(Constants.GP_IAP_PRICE_AMOUNT_MICROS_V5V7) / 1000000.0d);
            Currency currency = Currency.getInstance(jSONObject.getString(Constants.GP_IAP_PRICE_CURRENCY_CODE_V5V7));
            n.e(currency, "getInstance(oneTimePurch…RICE_CURRENCY_CODE_V5V7))");
            return o.S(new PurchaseLoggingParameters(bigDecimal, currency, params, operationalData));
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = skuDetailsJSON.getJSONArray(Constants.GP_IAP_SUBSCRIPTION_OFFER_DETAILS);
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObject2 = skuDetailsJSON.getJSONArray(Constants.GP_IAP_SUBSCRIPTION_OFFER_DETAILS).getJSONObject(i10);
            if (jSONObject2 == null) {
                return null;
            }
            Bundle bundle = new Bundle(params);
            OperationalData operationalDataCopy = operationalData.copy();
            String basePlanId = jSONObject2.getString(Constants.GP_IAP_BASE_PLAN_ID);
            OperationalData.Companion companion = OperationalData.INSTANCE;
            OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
            n.e(basePlanId, "basePlanId");
            companion.addParameter(operationalDataEnum, Constants.IAP_BASE_PLAN, basePlanId, bundle, operationalDataCopy);
            JSONArray jSONArray2 = jSONObject2.getJSONArray(Constants.GP_IAP_SUBSCRIPTION_PRICING_PHASES);
            JSONObject jSONObject3 = jSONArray2.getJSONObject(jSONArray2.length() - 1);
            if (jSONObject3 == null) {
                return null;
            }
            String strOptString = jSONObject3.optString(Constants.GP_IAP_BILLING_PERIOD);
            n.e(strOptString, "subscriptionJSON.optStri…IOD\n                    )");
            companion.addParameter(operationalDataEnum, Constants.IAP_SUBSCRIPTION_PERIOD, strOptString, bundle, operationalDataCopy);
            if (!jSONObject3.has(Constants.GP_IAP_RECURRENCE_MODE) || jSONObject3.getInt(Constants.GP_IAP_RECURRENCE_MODE) == 3) {
                companion.addParameter(operationalDataEnum, Constants.IAP_SUBSCRIPTION_AUTORENEWING, "false", bundle, operationalDataCopy);
            } else {
                companion.addParameter(operationalDataEnum, Constants.IAP_SUBSCRIPTION_AUTORENEWING, com.ironsource.mediationsdk.metadata.a.f29610g, bundle, operationalDataCopy);
            }
            BigDecimal bigDecimal2 = new BigDecimal(jSONObject3.getLong(Constants.GP_IAP_PRICE_AMOUNT_MICROS_V5V7) / 1000000.0d);
            Currency currency2 = Currency.getInstance(jSONObject3.getString(Constants.GP_IAP_PRICE_CURRENCY_CODE_V5V7));
            n.e(currency2, "getInstance(subscription…RICE_CURRENCY_CODE_V5V7))");
            arrayList.add(new PurchaseLoggingParameters(bigDecimal2, currency2, bundle, operationalDataCopy));
        }
        return arrayList;
    }

    public static final synchronized Bundle getSubscriptionDedupeParameters(List<PurchaseLoggingParameters> purchaseLoggingParametersList, String eventName) {
        ArrayList arrayList;
        long jCurrentTimeMillis;
        ArrayList arrayList2;
        try {
            n.f(purchaseLoggingParametersList, "purchaseLoggingParametersList");
            n.f(eventName, "eventName");
            arrayList = new ArrayList();
            for (PurchaseLoggingParameters purchaseLoggingParameters : purchaseLoggingParametersList) {
                arrayList.add(new InAppPurchase(eventName, purchaseLoggingParameters.getPurchaseAmount().doubleValue(), purchaseLoggingParameters.getCurrency()));
            }
            jCurrentTimeMillis = System.currentTimeMillis();
            List<PurchaseLoggingParameters> list = purchaseLoggingParametersList;
            arrayList2 = new ArrayList(p.W(list, 10));
            for (PurchaseLoggingParameters purchaseLoggingParameters2 : list) {
                arrayList2.add(new wj.f(purchaseLoggingParameters2.getParam(), purchaseLoggingParameters2.getOperationalData()));
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return InAppPurchaseManager.performDedupe(arrayList, jCurrentTimeMillis, true, arrayList2);
    }

    public static final boolean isImplicitPurchaseLoggingEnabled() {
        r rVarB = u.b(s.c());
        return rVarB != null && m0.c() && rVarB.f48762f;
    }

    public static final void logActivateAppEvent() {
        Context contextB = s.b();
        String strC = s.c();
        if (m0.c()) {
            if (contextB instanceof Application) {
                AppEventsLogger.INSTANCE.activateApp((Application) contextB, strC);
            } else {
                Log.w(TAG, "Automatic logging of basic events will not happen, because FacebookSdk.getApplicationContext() returns object that is not instance of android.app.Application. Make sure you call FacebookSdk.sdkInitialize() from Application class and pass application context.");
            }
        }
    }

    public static final void logActivityTimeSpentEvent(String activityName, long timeSpentInSeconds) {
        Context contextB = s.b();
        r rVarK = u.k(s.c(), false);
        if (rVarK == null || !rVarK.f48760d || timeSpentInSeconds <= 0) {
            return;
        }
        InternalAppEventsLogger internalAppEventsLogger2 = new InternalAppEventsLogger(contextB);
        Bundle bundle = new Bundle(1);
        bundle.putCharSequence(Constants.AA_TIME_SPENT_SCREEN_PARAMETER_NAME, activityName);
        internalAppEventsLogger2.logEvent(Constants.AA_TIME_SPENT_EVENT_NAME, timeSpentInSeconds, bundle);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x005b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x006a  */
    /* JADX WARN: Code duplicated, block: B:36:0x008a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b8  */
    public static final void logPurchase(String purchase, String skuDetails, boolean isSubscription, InAppPurchaseUtils.BillingClientVersion billingClientVersion, boolean isFirstAppLaunch) {
        List<PurchaseLoggingParameters> purchaseLoggingParameters;
        String str;
        String str2;
        Bundle purchaseDedupeParameters;
        n.f(purchase, "purchase");
        n.f(skuDetails, "skuDetails");
        if (!isImplicitPurchaseLoggingEnabled() || (purchaseLoggingParameters = INSTANCE.getPurchaseLoggingParameters(purchase, skuDetails, billingClientVersion)) == null || purchaseLoggingParameters.isEmpty()) {
            return;
        }
        if (!isSubscription || !q.b(APP_EVENTS_IF_AUTO_LOG_SUBS, s.c(), false)) {
            if (isFirstAppLaunch) {
                str2 = Constants.EVENT_NAME_PURCHASE_RESTORED;
            } else {
                str = AppEventsConstants.EVENT_NAME_PURCHASED;
            }
            if (!isSubscription && q7.p.b(q7.n.AndroidManualImplicitSubsDedupe)) {
                purchaseDedupeParameters = getSubscriptionDedupeParameters(purchaseLoggingParameters, str);
            } else if (isSubscription && q7.p.b(q7.n.AndroidManualImplicitPurchaseDedupe)) {
                purchaseDedupeParameters = getPurchaseDedupeParameters(purchaseLoggingParameters);
            } else {
                purchaseDedupeParameters = null;
            }
            InAppPurchaseDedupeConfig.INSTANCE.addDedupeParameters(purchaseDedupeParameters, purchaseLoggingParameters.get(0).getParam(), purchaseLoggingParameters.get(0).getOperationalData());
            if (str.equals(AppEventsConstants.EVENT_NAME_PURCHASED)) {
                internalAppEventsLogger.logPurchaseImplicitly(purchaseLoggingParameters.get(0).getPurchaseAmount(), purchaseLoggingParameters.get(0).getCurrency(), purchaseLoggingParameters.get(0).getParam(), purchaseLoggingParameters.get(0).getOperationalData());
            } else {
                internalAppEventsLogger.logEventImplicitly(str, purchaseLoggingParameters.get(0).getPurchaseAmount(), purchaseLoggingParameters.get(0).getCurrency(), purchaseLoggingParameters.get(0).getParam(), purchaseLoggingParameters.get(0).getOperationalData());
            }
        }
        if (isFirstAppLaunch) {
            str2 = Constants.EVENT_NAME_SUBSCRIPTION_RESTORED;
        } else {
            str2 = InAppPurchaseEventManager.INSTANCE.hasFreeTrialPeirod(skuDetails) ? AppEventsConstants.EVENT_NAME_START_TRIAL : AppEventsConstants.EVENT_NAME_SUBSCRIBE;
        }
        str = str2;
        if (!isSubscription) {
            if (isSubscription) {
                purchaseDedupeParameters = null;
            } else {
                purchaseDedupeParameters = null;
            }
        } else if (isSubscription) {
            purchaseDedupeParameters = null;
        } else {
            purchaseDedupeParameters = null;
        }
        InAppPurchaseDedupeConfig.INSTANCE.addDedupeParameters(purchaseDedupeParameters, purchaseLoggingParameters.get(0).getParam(), purchaseLoggingParameters.get(0).getOperationalData());
        if (str.equals(AppEventsConstants.EVENT_NAME_PURCHASED)) {
            internalAppEventsLogger.logEventImplicitly(str, purchaseLoggingParameters.get(0).getPurchaseAmount(), purchaseLoggingParameters.get(0).getCurrency(), purchaseLoggingParameters.get(0).getParam(), purchaseLoggingParameters.get(0).getOperationalData());
        } else {
            internalAppEventsLogger.logPurchaseImplicitly(purchaseLoggingParameters.get(0).getPurchaseAmount(), purchaseLoggingParameters.get(0).getCurrency(), purchaseLoggingParameters.get(0).getParam(), purchaseLoggingParameters.get(0).getOperationalData());
        }
    }

    public static /* synthetic */ void logPurchase$default(String str, String str2, boolean z10, InAppPurchaseUtils.BillingClientVersion billingClientVersion, boolean z11, int i10, Object obj) {
        if ((i10 & 16) != 0) {
            z11 = false;
        }
        logPurchase(str, str2, z10, billingClientVersion, z11);
    }

    private final List<PurchaseLoggingParameters> getPurchaseLoggingParameters(String purchase, String skuDetails, Map<String, String> extraParameter, InAppPurchaseUtils.BillingClientVersion billingClientVersion) {
        try {
            JSONObject jSONObject = new JSONObject(purchase);
            JSONObject jSONObject2 = new JSONObject(skuDetails);
            Bundle bundle = new Bundle(1);
            OperationalData operationalData = new OperationalData();
            if (billingClientVersion != null) {
                OperationalData.INSTANCE.addParameter(OperationalDataEnum.IAPParameters, Constants.IAP_AUTOLOG_IMPLEMENTATION, billingClientVersion.getType(), bundle, operationalData);
            }
            OperationalData.Companion companion = OperationalData.INSTANCE;
            OperationalDataEnum operationalDataEnum = OperationalDataEnum.IAPParameters;
            String string = jSONObject.getString("productId");
            n.e(string, "purchaseJSON.getString(C…stants.GP_IAP_PRODUCT_ID)");
            companion.addParameter(operationalDataEnum, Constants.IAP_PRODUCT_ID, string, bundle, operationalData);
            String string2 = jSONObject.getString("productId");
            n.e(string2, "purchaseJSON.getString(C…stants.GP_IAP_PRODUCT_ID)");
            companion.addParameter(operationalDataEnum, AppEventsConstants.EVENT_PARAM_CONTENT_ID, string2, bundle, operationalData);
            companion.addParameter(operationalDataEnum, Constants.ANDROID_DYNAMIC_ADS_CONTENT_ID, "client_implicit", bundle, operationalData);
            String string3 = jSONObject.getString(Constants.GP_IAP_PURCHASE_TIME);
            n.e(string3, "purchaseJSON.getString(C…nts.GP_IAP_PURCHASE_TIME)");
            companion.addParameter(operationalDataEnum, Constants.IAP_PURCHASE_TIME, string3, bundle, operationalData);
            String string4 = jSONObject.getString(Constants.GP_IAP_PURCHASE_TOKEN);
            n.e(string4, "purchaseJSON.getString(C…ts.GP_IAP_PURCHASE_TOKEN)");
            companion.addParameter(operationalDataEnum, Constants.IAP_PURCHASE_TOKEN, string4, bundle, operationalData);
            String strOptString = jSONObject.optString("packageName");
            n.e(strOptString, "purchaseJSON.optString(C…ants.GP_IAP_PACKAGE_NAME)");
            companion.addParameter(operationalDataEnum, Constants.IAP_PACKAGE_NAME, strOptString, bundle, operationalData);
            String strOptString2 = jSONObject2.optString("title");
            n.e(strOptString2, "skuDetailsJSON.optString(Constants.GP_IAP_TITLE)");
            companion.addParameter(operationalDataEnum, Constants.IAP_PRODUCT_TITLE, strOptString2, bundle, operationalData);
            String strOptString3 = jSONObject2.optString("description");
            n.e(strOptString3, "skuDetailsJSON.optString…tants.GP_IAP_DESCRIPTION)");
            companion.addParameter(operationalDataEnum, Constants.IAP_PRODUCT_DESCRIPTION, strOptString3, bundle, operationalData);
            String type = jSONObject2.optString("type");
            n.e(type, "type");
            companion.addParameter(operationalDataEnum, Constants.IAP_PRODUCT_TYPE, type, bundle, operationalData);
            String specificBillingLibraryVersion = InAppPurchaseManager.getSpecificBillingLibraryVersion();
            if (specificBillingLibraryVersion != null) {
                companion.addParameter(operationalDataEnum, Constants.IAP_BILLING_LIBRARY_VERSION, specificBillingLibraryVersion, bundle, operationalData);
            }
            for (Map.Entry<String, String> entry : extraParameter.entrySet()) {
                OperationalData.INSTANCE.addParameter(OperationalDataEnum.IAPParameters, entry.getKey(), entry.getValue(), bundle, operationalData);
            }
            if (jSONObject2.has(Constants.GP_IAP_PRICE_AMOUNT_MICROS_V2V4)) {
                return o.S(getPurchaseParametersGPBLV2V4(type, bundle, operationalData, jSONObject, jSONObject2));
            }
            if (jSONObject2.has(Constants.GP_IAP_SUBSCRIPTION_OFFER_DETAILS) || jSONObject2.has(Constants.GP_IAP_ONE_TIME_PURCHASE_OFFER_DETAILS)) {
                return getPurchaseParametersGPBLV5V7(type, bundle, operationalData, jSONObject2);
            }
            return null;
        } catch (JSONException e10) {
            Log.e(TAG, "Error parsing in-app purchase/subscription data.", e10);
            return null;
        } catch (Exception e11) {
            Log.e(TAG, "Failed to get purchase logging parameters,", e11);
            return null;
        }
    }
}
