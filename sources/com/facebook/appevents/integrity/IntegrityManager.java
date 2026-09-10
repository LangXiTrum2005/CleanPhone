package com.facebook.appevents.integrity;

import com.facebook.appevents.ml.ModelManager;
import com.ironsource.mediationsdk.metadata.a;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.s;
import org.json.JSONObject;
import q7.q;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J#\u0010\t\u001a\u00020\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R\u0016\u0010\u0017\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018¨\u0006\u001a"}, d2 = {"Lcom/facebook/appevents/integrity/IntegrityManager;", "", "<init>", "()V", "Lwj/r;", a.f29613j, "", "", "parameters", "processParameters", "(Ljava/util/Map;)V", "input", "", "shouldFilter", "(Ljava/lang/String;)Z", "textFeature", "getIntegrityPredictionResult", "(Ljava/lang/String;)Ljava/lang/String;", "INTEGRITY_TYPE_NONE", "Ljava/lang/String;", "INTEGRITY_TYPE_ADDRESS", "INTEGRITY_TYPE_HEALTH", "RESTRICTIVE_ON_DEVICE_PARAMS_KEY", "enabled", "Z", "isSampleEnabled", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class IntegrityManager {
    public static final IntegrityManager INSTANCE = new IntegrityManager();
    public static final String INTEGRITY_TYPE_ADDRESS = "address";
    public static final String INTEGRITY_TYPE_HEALTH = "health";
    public static final String INTEGRITY_TYPE_NONE = "none";
    private static final String RESTRICTIVE_ON_DEVICE_PARAMS_KEY = "_onDeviceParams";
    private static boolean enabled;
    private static boolean isSampleEnabled;

    private IntegrityManager() {
    }

    public static final void enable() {
        if (v7.a.b(IntegrityManager.class)) {
            return;
        }
        try {
            enabled = true;
            isSampleEnabled = q.b("FBSDKFeatureIntegritySample", s.c(), false);
        } catch (Throwable th2) {
            v7.a.a(IntegrityManager.class, th2);
        }
    }

    private final String getIntegrityPredictionResult(String textFeature) {
        String str;
        if (v7.a.b(this)) {
            return null;
        }
        try {
            float[] fArr = new float[30];
            for (int i10 = 0; i10 < 30; i10++) {
                fArr[i10] = 0.0f;
            }
            String[] strArrPredict = ModelManager.predict(ModelManager.Task.MTML_INTEGRITY_DETECT, new float[][]{fArr}, new String[]{textFeature});
            return (strArrPredict == null || (str = strArrPredict[0]) == null) ? "none" : str;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    public static final void processParameters(Map<String, String> parameters) {
        if (v7.a.b(IntegrityManager.class)) {
            return;
        }
        try {
            n.f(parameters, "parameters");
            if (!enabled || parameters.isEmpty()) {
                return;
            }
            try {
                List<String> listN0 = xj.n.N0(parameters.keySet());
                JSONObject jSONObject = new JSONObject();
                for (String str : listN0) {
                    String str2 = parameters.get(str);
                    if (str2 == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    String str3 = str2;
                    IntegrityManager integrityManager = INSTANCE;
                    if (integrityManager.shouldFilter(str) || integrityManager.shouldFilter(str3)) {
                        parameters.remove(str);
                        if (!isSampleEnabled) {
                            str3 = "";
                        }
                        jSONObject.put(str, str3);
                    }
                }
                if (jSONObject.length() != 0) {
                    String string = jSONObject.toString();
                    n.e(string, "restrictiveParamJson.toString()");
                    parameters.put(RESTRICTIVE_ON_DEVICE_PARAMS_KEY, string);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            v7.a.a(IntegrityManager.class, th2);
        }
    }

    private final boolean shouldFilter(String input) {
        if (v7.a.b(this)) {
            return false;
        }
        try {
            return !"none".equals(getIntegrityPredictionResult(input));
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return false;
        }
    }
}
