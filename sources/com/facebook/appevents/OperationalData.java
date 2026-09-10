package com.facebook.appevents;

import android.os.Bundle;
import com.facebook.appevents.internal.Constants;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import org.json.JSONObject;
import wj.f;
import xj.b0;
import xj.k;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0004\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001a\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012R,\u0010\u0014\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/facebook/appevents/OperationalData;", "", "<init>", "()V", "copy", "()Lcom/facebook/appevents/OperationalData;", "Lcom/facebook/appevents/OperationalDataEnum;", "type", "", X3.i.W, X3.i.X, "Lwj/r;", "addParameter", "(Lcom/facebook/appevents/OperationalDataEnum;Ljava/lang/String;Ljava/lang/Object;)V", "getParameter", "(Lcom/facebook/appevents/OperationalDataEnum;Ljava/lang/String;)Ljava/lang/Object;", "Lorg/json/JSONObject;", "toJSON", "()Lorg/json/JSONObject;", "", "operationalData", "Ljava/util/Map;", "Companion", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class OperationalData {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Set<String> iapOperationalAndCustomParameters;
    private static final Set<String> iapOperationalParameters;
    private static final Map<OperationalDataEnum, f> parameterClassifications;
    private final Map<OperationalDataEnum, Map<String, Object>> operationalData = new LinkedHashMap();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013JI\u0010\u0015\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u00142\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u0018\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR8\u0010\u001f\u001a&\u0012\u0004\u0012\u00020\u0004\u0012\u001c\u0012\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a0\u00140\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcom/facebook/appevents/OperationalData$Companion;", "", "<init>", "()V", "Lcom/facebook/appevents/OperationalDataEnum;", "typeOfParameter", "", MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "Lcom/facebook/appevents/ParameterClassification;", "getParameterClassification", "(Lcom/facebook/appevents/OperationalDataEnum;Ljava/lang/String;)Lcom/facebook/appevents/ParameterClassification;", X3.i.W, X3.i.X, "Landroid/os/Bundle;", "customEventsParams", "Lcom/facebook/appevents/OperationalData;", "operationalData", "Lwj/r;", "addParameter", "(Lcom/facebook/appevents/OperationalDataEnum;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/appevents/OperationalData;)V", "Lwj/f;", "addParameterAndReturn", "(Lcom/facebook/appevents/OperationalDataEnum;Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/appevents/OperationalData;)Lwj/f;", "params", "getParameter", "(Lcom/facebook/appevents/OperationalDataEnum;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/appevents/OperationalData;)Ljava/lang/Object;", "", "iapOperationalAndCustomParameters", "Ljava/util/Set;", "iapOperationalParameters", "", "parameterClassifications", "Ljava/util/Map;", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {

        /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ParameterClassification.values().length];
                try {
                    iArr[ParameterClassification.CustomData.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ParameterClassification.OperationalData.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ParameterClassification.CustomAndOperationalData.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final void addParameter(OperationalDataEnum typeOfParameter, String key, String value, Bundle customEventsParams, OperationalData operationalData) {
            n.f(typeOfParameter, "typeOfParameter");
            n.f(key, "key");
            n.f(value, "value");
            n.f(customEventsParams, "customEventsParams");
            n.f(operationalData, "operationalData");
            int i10 = WhenMappings.$EnumSwitchMapping$0[getParameterClassification(typeOfParameter, key).ordinal()];
            if (i10 == 1) {
                customEventsParams.putCharSequence(key, value);
                return;
            }
            if (i10 == 2) {
                operationalData.addParameter(typeOfParameter, key, value);
            } else {
                if (i10 != 3) {
                    return;
                }
                operationalData.addParameter(typeOfParameter, key, value);
                customEventsParams.putCharSequence(key, value);
            }
        }

        public final f addParameterAndReturn(OperationalDataEnum typeOfParameter, String key, String value, Bundle customEventsParams, OperationalData operationalData) {
            n.f(typeOfParameter, "typeOfParameter");
            n.f(key, "key");
            n.f(value, "value");
            int i10 = WhenMappings.$EnumSwitchMapping$0[getParameterClassification(typeOfParameter, key).ordinal()];
            if (i10 == 1) {
                if (customEventsParams == null) {
                    customEventsParams = new Bundle();
                }
                customEventsParams.putCharSequence(key, value);
            } else if (i10 == 2) {
                if (operationalData == null) {
                    operationalData = new OperationalData();
                }
                operationalData.addParameter(typeOfParameter, key, value);
            } else if (i10 == 3) {
                if (operationalData == null) {
                    operationalData = new OperationalData();
                }
                if (customEventsParams == null) {
                    customEventsParams = new Bundle();
                }
                operationalData.addParameter(typeOfParameter, key, value);
                customEventsParams.putCharSequence(key, value);
            }
            return new f(customEventsParams, operationalData);
        }

        public final Object getParameter(OperationalDataEnum typeOfParameter, String key, Bundle params, OperationalData operationalData) {
            n.f(typeOfParameter, "typeOfParameter");
            n.f(key, "key");
            Object parameter = operationalData != null ? operationalData.getParameter(typeOfParameter, key) : null;
            return parameter == null ? params != null ? params.getCharSequence(key) : null : parameter;
        }

        public final ParameterClassification getParameterClassification(OperationalDataEnum typeOfParameter, String parameter) {
            n.f(typeOfParameter, "typeOfParameter");
            n.f(parameter, "parameter");
            f fVar = (f) OperationalData.parameterClassifications.get(typeOfParameter);
            Set set = fVar != null ? (Set) fVar.f53283a : null;
            f fVar2 = (f) OperationalData.parameterClassifications.get(typeOfParameter);
            Set set2 = fVar2 != null ? (Set) fVar2.f53284b : null;
            if (set == null || !set.contains(parameter)) {
                return (set2 == null || !set2.contains(parameter)) ? ParameterClassification.CustomData : ParameterClassification.CustomAndOperationalData;
            }
            return ParameterClassification.OperationalData;
        }

        private Companion() {
        }
    }

    static {
        Set<String> setE0 = k.E0(new String[]{Constants.IAP_PACKAGE_NAME, Constants.IAP_SUBSCRIPTION_AUTORENEWING, Constants.IAP_FREE_TRIAL_PERIOD, Constants.IAP_INTRO_PRICE_AMOUNT_MICROS, Constants.IAP_INTRO_PRICE_CYCLES, Constants.IAP_BASE_PLAN, Constants.EVENT_PARAM_IS_IMPLICIT_PURCHASE_LOGGING_ENABLED, Constants.IAP_AUTOLOG_IMPLEMENTATION, Constants.EVENT_PARAM_IS_AUTOLOG_APP_EVENTS_ENABLED, Constants.IAP_BILLING_LIBRARY_VERSION, Constants.IAP_SUBSCRIPTION_PERIOD, Constants.IAP_PURCHASE_TOKEN, Constants.IAP_NON_DEDUPED_EVENT_TIME, Constants.IAP_ACTUAL_DEDUP_RESULT, Constants.IAP_ACTUAL_DEDUP_KEY_USED, Constants.IAP_TEST_DEDUP_RESULT, Constants.IAP_TEST_DEDUP_KEY_USED});
        iapOperationalParameters = setE0;
        Set<String> setE1 = k.E0(new String[]{Constants.IAP_PRODUCT_ID, Constants.IAP_PRODUCT_TYPE, Constants.IAP_PURCHASE_TIME});
        iapOperationalAndCustomParameters = setE1;
        parameterClassifications = b0.P(new f(OperationalDataEnum.IAPParameters, new f(setE0, setE1)));
    }

    public final void addParameter(OperationalDataEnum type, String key, Object value) {
        n.f(type, "type");
        n.f(key, "key");
        n.f(value, "value");
        try {
            AppEvent.INSTANCE.validateIdentifier(key);
            if (!(value instanceof String) && !(value instanceof Number)) {
                throw new l7.n(String.format("Parameter value '%s' for key '%s' should be a string or a numeric type.", Arrays.copyOf(new Object[]{value, key}, 2)));
            }
            if (!this.operationalData.containsKey(type)) {
                this.operationalData.put(type, new LinkedHashMap());
            }
            Map<String, Object> map = this.operationalData.get(type);
            if (map != null) {
                map.put(key, value);
            }
        } catch (Exception unused) {
        }
    }

    public final OperationalData copy() {
        OperationalData operationalData = new OperationalData();
        for (OperationalDataEnum operationalDataEnum : this.operationalData.keySet()) {
            Map<String, Object> map = this.operationalData.get(operationalDataEnum);
            if (map != null) {
                for (String str : map.keySet()) {
                    Object obj = map.get(str);
                    if (obj != null) {
                        operationalData.addParameter(operationalDataEnum, str, obj);
                    }
                }
            }
        }
        return operationalData;
    }

    public final Object getParameter(OperationalDataEnum type, String key) {
        Map<String, Object> map;
        n.f(type, "type");
        n.f(key, "key");
        if (this.operationalData.containsKey(type) && (map = this.operationalData.get(type)) != null) {
            return map.get(key);
        }
        return null;
    }

    public final JSONObject toJSON() {
        JSONObject jSONObject;
        try {
            Map<OperationalDataEnum, Map<String, Object>> map = this.operationalData;
            LinkedHashMap linkedHashMap = new LinkedHashMap(b0.O(map.size()));
            for (Object obj : map.entrySet()) {
                linkedHashMap.put(((OperationalDataEnum) ((Map.Entry) obj).getKey()).getValue(), ((Map.Entry) obj).getValue());
            }
            jSONObject = new JSONObject(b0.X(linkedHashMap));
        } catch (Exception unused) {
            jSONObject = null;
        }
        return jSONObject == null ? new JSONObject() : jSONObject;
    }
}
