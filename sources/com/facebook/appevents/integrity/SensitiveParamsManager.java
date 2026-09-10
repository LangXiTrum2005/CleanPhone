package com.facebook.appevents.integrity;

import android.os.Bundle;
import com.ironsource.X3;
import com.ironsource.mediationsdk.metadata.a;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.s;
import org.json.JSONArray;
import org.json.JSONObject;
import q7.e0;
import q7.r;
import q7.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0003J!\u0010\f\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ3\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\n2\u001a\u0010\u0011\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\u000fj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\n0\u000fj\b\u0012\u0004\u0012\u00020\n`\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R2\u0010\u001a\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\u000fj\b\u0012\u0004\u0012\u00020\n`\u00100\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\n8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d¨\u0006\u001f"}, d2 = {"Lcom/facebook/appevents/integrity/SensitiveParamsManager;", "", "<init>", "()V", "Lwj/r;", a.f29613j, "disable", "loadSensitiveParameters", "Landroid/os/Bundle;", "parameters", "", X3.i.f27798j0, "processFilterSensitiveParams", "(Landroid/os/Bundle;Ljava/lang/String;)V", "parameterKey", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "sensitiveParamsForEvent", "", "shouldFilterOut", "(Ljava/lang/String;Ljava/util/HashSet;)Z", "enabled", "Z", "defaultSensitiveParameters", "Ljava/util/HashSet;", "", "sensitiveParameters", "Ljava/util/Map;", "DEFAULT_SENSITIVE_PARAMS_KEY", "Ljava/lang/String;", "SENSITIVE_PARAMS_KEY", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class SensitiveParamsManager {
    private static final String DEFAULT_SENSITIVE_PARAMS_KEY = "_MTSDK_Default_";
    private static final String SENSITIVE_PARAMS_KEY = "_filteredKey";
    private static boolean enabled;
    public static final SensitiveParamsManager INSTANCE = new SensitiveParamsManager();
    private static HashSet<String> defaultSensitiveParameters = new HashSet<>();
    private static Map<String, HashSet<String>> sensitiveParameters = new HashMap();

    private SensitiveParamsManager() {
    }

    public static final void disable() {
        if (v7.a.b(SensitiveParamsManager.class)) {
            return;
        }
        try {
            enabled = false;
            sensitiveParameters = new HashMap();
            defaultSensitiveParameters = new HashSet<>();
        } catch (Throwable th2) {
            v7.a.a(SensitiveParamsManager.class, th2);
        }
    }

    public static final void enable() {
        if (v7.a.b(SensitiveParamsManager.class)) {
            return;
        }
        try {
            INSTANCE.loadSensitiveParameters();
            if (defaultSensitiveParameters.isEmpty() && sensitiveParameters.isEmpty()) {
                enabled = false;
            } else {
                enabled = true;
            }
        } catch (Throwable th2) {
            v7.a.a(SensitiveParamsManager.class, th2);
        }
    }

    private final void loadSensitiveParameters() {
        HashSet<String> hashSetE;
        if (v7.a.b(this)) {
            return;
        }
        try {
            r rVarK = u.k(s.c(), false);
            if (rVarK == null) {
                return;
            }
            try {
                defaultSensitiveParameters = new HashSet<>();
                sensitiveParameters = new HashMap();
                JSONArray jSONArray = rVarK.f48772q;
                if (jSONArray == null || jSONArray.length() == 0) {
                    return;
                }
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i10);
                    boolean zHas = jSONObject.has(X3.i.W);
                    boolean zHas2 = jSONObject.has(X3.i.X);
                    if (zHas && zHas2) {
                        String string = jSONObject.getString(X3.i.W);
                        JSONArray jSONArray2 = jSONObject.getJSONArray(X3.i.X);
                        if (jSONArray2 != null && (hashSetE = e0.e(jSONArray2)) != null) {
                            if (string.equals(DEFAULT_SENSITIVE_PARAMS_KEY)) {
                                defaultSensitiveParameters = hashSetE;
                            } else {
                                sensitiveParameters.put(string, hashSetE);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public static final void processFilterSensitiveParams(Bundle parameters, String eventName) {
        if (v7.a.b(SensitiveParamsManager.class)) {
            return;
        }
        try {
            n.f(eventName, "eventName");
            if (enabled && parameters != null) {
                if (!defaultSensitiveParameters.isEmpty() || sensitiveParameters.containsKey(eventName)) {
                    JSONArray jSONArray = new JSONArray();
                    try {
                        HashSet<String> hashSet = sensitiveParameters.get(eventName);
                        for (String key : new ArrayList(parameters.keySet())) {
                            SensitiveParamsManager sensitiveParamsManager = INSTANCE;
                            n.e(key, "key");
                            if (sensitiveParamsManager.shouldFilterOut(key, hashSet)) {
                                parameters.remove(key);
                                jSONArray.put(key);
                            }
                        }
                    } catch (Exception unused) {
                    }
                    if (jSONArray.length() > 0) {
                        parameters.putString(SENSITIVE_PARAMS_KEY, jSONArray.toString());
                    }
                }
            }
        } catch (Throwable th2) {
            v7.a.a(SensitiveParamsManager.class, th2);
        }
    }

    private final boolean shouldFilterOut(String parameterKey, HashSet<String> sensitiveParamsForEvent) {
        if (v7.a.b(this)) {
            return false;
        }
        try {
            if (defaultSensitiveParameters.contains(parameterKey)) {
                return true;
            }
            return (sensitiveParamsForEvent == null || sensitiveParamsForEvent.isEmpty() || !sensitiveParamsForEvent.contains(parameterKey)) ? false : true;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return false;
        }
    }
}
