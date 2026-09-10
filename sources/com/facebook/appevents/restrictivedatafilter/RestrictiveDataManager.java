package com.facebook.appevents.restrictivedatafilter;

import android.util.Log;
import com.ironsource.X3;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.s;
import org.json.JSONException;
import org.json.JSONObject;
import q7.e0;
import q7.r;
import q7.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001%B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\r\u001a\u00020\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0010\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00070\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010!\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u0014\u0010\"\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u0014\u0010#\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u0014\u0010$\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b$\u0010\u0019¨\u0006&"}, d2 = {"Lcom/facebook/appevents/restrictivedatafilter/RestrictiveDataManager;", "", "<init>", "()V", "Lwj/r;", a.f29613j, MobileAdsBridgeBase.initializeMethodName, "", X3.i.f27798j0, "processEvent", "(Ljava/lang/String;)Ljava/lang/String;", "", "parameters", "processParameters", "(Ljava/util/Map;Ljava/lang/String;)V", "paramKey", "getMatchedRuleType", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "", "isRestrictedEvent", "(Ljava/lang/String;)Z", "enabled", "Z", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", "", "Lcom/facebook/appevents/restrictivedatafilter/RestrictiveDataManager$RestrictiveParamFilter;", "restrictiveParamFilters", "Ljava/util/List;", "", "restrictedEvents", "Ljava/util/Set;", "REPLACEMENT_STRING", "PROCESS_EVENT_NAME", "RESTRICTIVE_PARAM", "RESTRICTIVE_PARAM_KEY", "RestrictiveParamFilter", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class RestrictiveDataManager {
    private static final String PROCESS_EVENT_NAME = "process_event_name";
    private static final String REPLACEMENT_STRING = "_removed_";
    private static final String RESTRICTIVE_PARAM = "restrictive_param";
    private static final String RESTRICTIVE_PARAM_KEY = "_restrictedParams";
    private static boolean enabled;
    public static final RestrictiveDataManager INSTANCE = new RestrictiveDataManager();
    private static final String TAG = RestrictiveDataManager.class.getCanonicalName();
    private static final List<RestrictiveParamFilter> restrictiveParamFilters = new ArrayList();
    private static final Set<String> restrictedEvents = new CopyOnWriteArraySet();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005¢\u0006\u0002\u0010\u0006R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/appevents/restrictivedatafilter/RestrictiveDataManager$RestrictiveParamFilter;", "", X3.i.f27798j0, "", "restrictiveParams", "", "(Ljava/lang/String;Ljava/util/Map;)V", "getEventName", "()Ljava/lang/String;", "setEventName", "(Ljava/lang/String;)V", "getRestrictiveParams", "()Ljava/util/Map;", "setRestrictiveParams", "(Ljava/util/Map;)V", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class RestrictiveParamFilter {
        private String eventName;
        private Map<String, String> restrictiveParams;

        public RestrictiveParamFilter(String eventName, Map<String, String> restrictiveParams) {
            n.f(eventName, "eventName");
            n.f(restrictiveParams, "restrictiveParams");
            this.eventName = eventName;
            this.restrictiveParams = restrictiveParams;
        }

        public final String getEventName() {
            return this.eventName;
        }

        public final Map<String, String> getRestrictiveParams() {
            return this.restrictiveParams;
        }

        public final void setEventName(String str) {
            n.f(str, "<set-?>");
            this.eventName = str;
        }

        public final void setRestrictiveParams(Map<String, String> map) {
            n.f(map, "<set-?>");
            this.restrictiveParams = map;
        }
    }

    private RestrictiveDataManager() {
    }

    public static final void enable() {
        if (v7.a.b(RestrictiveDataManager.class)) {
            return;
        }
        try {
            enabled = true;
            INSTANCE.initialize();
        } catch (Throwable th2) {
            v7.a.a(RestrictiveDataManager.class, th2);
        }
    }

    private final String getMatchedRuleType(String eventName, String paramKey) {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            try {
                for (RestrictiveParamFilter restrictiveParamFilter : new ArrayList(restrictiveParamFilters)) {
                    if (restrictiveParamFilter != null && n.a(eventName, restrictiveParamFilter.getEventName())) {
                        for (String str : restrictiveParamFilter.getRestrictiveParams().keySet()) {
                            if (n.a(paramKey, str)) {
                                return restrictiveParamFilter.getRestrictiveParams().get(str);
                            }
                        }
                    }
                }
            } catch (Exception e10) {
                Log.w(TAG, "getMatchedRuleType failed", e10);
            }
            return null;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    private final void initialize() {
        String str;
        if (v7.a.b(this)) {
            return;
        }
        try {
            r rVarK = u.k(s.c(), false);
            if (rVarK != null && (str = rVarK.l) != null && str.length() != 0) {
                JSONObject jSONObject = new JSONObject(str);
                restrictiveParamFilters.clear();
                restrictedEvents.clear();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String key = itKeys.next();
                    JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                    if (jSONObject2 != null) {
                        JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject(RESTRICTIVE_PARAM);
                        n.e(key, "key");
                        RestrictiveParamFilter restrictiveParamFilter = new RestrictiveParamFilter(key, new HashMap());
                        if (jSONObjectOptJSONObject != null) {
                            restrictiveParamFilter.setRestrictiveParams(e0.h(jSONObjectOptJSONObject));
                            restrictiveParamFilters.add(restrictiveParamFilter);
                        }
                        if (jSONObject2.has(PROCESS_EVENT_NAME)) {
                            restrictedEvents.add(restrictiveParamFilter.getEventName());
                        }
                    }
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    private final boolean isRestrictedEvent(String eventName) {
        if (v7.a.b(this)) {
            return false;
        }
        try {
            return restrictedEvents.contains(eventName);
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return false;
        }
    }

    public static final String processEvent(String eventName) {
        if (v7.a.b(RestrictiveDataManager.class)) {
            return null;
        }
        try {
            n.f(eventName, "eventName");
            return (enabled && INSTANCE.isRestrictedEvent(eventName)) ? REPLACEMENT_STRING : eventName;
        } catch (Throwable th2) {
            v7.a.a(RestrictiveDataManager.class, th2);
            return null;
        }
    }

    public static final void processParameters(Map<String, String> parameters, String eventName) {
        if (v7.a.b(RestrictiveDataManager.class)) {
            return;
        }
        try {
            n.f(parameters, "parameters");
            n.f(eventName, "eventName");
            if (enabled) {
                HashMap map = new HashMap();
                for (String str : new ArrayList(parameters.keySet())) {
                    String matchedRuleType = INSTANCE.getMatchedRuleType(eventName, str);
                    if (matchedRuleType != null) {
                        map.put(str, matchedRuleType);
                        parameters.remove(str);
                    }
                }
                if (map.isEmpty()) {
                    return;
                }
                try {
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), (String) entry.getValue());
                    }
                    parameters.put(RESTRICTIVE_PARAM_KEY, jSONObject.toString());
                } catch (JSONException unused) {
                }
            }
        } catch (Throwable th2) {
            v7.a.a(RestrictiveDataManager.class, th2);
        }
    }
}
