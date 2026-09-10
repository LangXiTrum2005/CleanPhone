package com.facebook.appevents.eventdeactivation;

import com.facebook.appevents.AppEvent;
import com.ironsource.X3;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u001bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u001d\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u0010\u001a\u00020\u00042\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\r0\f2\u0006\u0010\u000f\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/facebook/appevents/eventdeactivation/EventDeactivationManager;", "", "<init>", "()V", "Lwj/r;", a.f29613j, MobileAdsBridgeBase.initializeMethodName, "", "Lcom/facebook/appevents/AppEvent;", "events", "processEvents", "(Ljava/util/List;)V", "", "", "parameters", X3.i.f27798j0, "processDeprecatedParameters", "(Ljava/util/Map;Ljava/lang/String;)V", "", "enabled", "Z", "Lcom/facebook/appevents/eventdeactivation/EventDeactivationManager$DeprecatedParamFilter;", "deprecatedParamFilters", "Ljava/util/List;", "", "deprecatedEvents", "Ljava/util/Set;", "DeprecatedParamFilter", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class EventDeactivationManager {
    private static boolean enabled;
    public static final EventDeactivationManager INSTANCE = new EventDeactivationManager();
    private static final List<DeprecatedParamFilter> deprecatedParamFilters = new ArrayList();
    private static final Set<String> deprecatedEvents = new HashSet();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/facebook/appevents/eventdeactivation/EventDeactivationManager$DeprecatedParamFilter;", "", X3.i.f27798j0, "", "deprecateParams", "", "(Ljava/lang/String;Ljava/util/List;)V", "getDeprecateParams", "()Ljava/util/List;", "setDeprecateParams", "(Ljava/util/List;)V", "getEventName", "()Ljava/lang/String;", "setEventName", "(Ljava/lang/String;)V", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class DeprecatedParamFilter {
        private List<String> deprecateParams;
        private String eventName;

        public DeprecatedParamFilter(String eventName, List<String> deprecateParams) {
            n.f(eventName, "eventName");
            n.f(deprecateParams, "deprecateParams");
            this.eventName = eventName;
            this.deprecateParams = deprecateParams;
        }

        public final List<String> getDeprecateParams() {
            return this.deprecateParams;
        }

        public final String getEventName() {
            return this.eventName;
        }

        public final void setDeprecateParams(List<String> list) {
            n.f(list, "<set-?>");
            this.deprecateParams = list;
        }

        public final void setEventName(String str) {
            n.f(str, "<set-?>");
            this.eventName = str;
        }
    }

    private EventDeactivationManager() {
    }

    public static final void enable() {
        if (v7.a.b(EventDeactivationManager.class)) {
            return;
        }
        try {
            enabled = true;
            INSTANCE.initialize();
        } catch (Throwable th2) {
            v7.a.a(EventDeactivationManager.class, th2);
        }
    }

    private final synchronized void initialize() {
        try {
            if (v7.a.b(this)) {
                return;
            }
            try {
                r rVarK = u.k(s.c(), false);
                if (rVarK == null) {
                    return;
                }
                String str = rVarK.l;
                if (str != null && str.length() > 0) {
                    JSONObject jSONObject = new JSONObject(str);
                    deprecatedParamFilters.clear();
                    Iterator<String> itKeys = jSONObject.keys();
                    while (itKeys.hasNext()) {
                        String key = itKeys.next();
                        JSONObject jSONObject2 = jSONObject.getJSONObject(key);
                        if (jSONObject2 != null) {
                            if (jSONObject2.optBoolean("is_deprecated_event")) {
                                Set<String> set = deprecatedEvents;
                                n.e(key, "key");
                                set.add(key);
                            } else {
                                JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("deprecated_param");
                                n.e(key, "key");
                                DeprecatedParamFilter deprecatedParamFilter = new DeprecatedParamFilter(key, new ArrayList());
                                if (jSONArrayOptJSONArray != null) {
                                    deprecatedParamFilter.setDeprecateParams(e0.f(jSONArrayOptJSONArray));
                                }
                                deprecatedParamFilters.add(deprecatedParamFilter);
                            }
                        }
                    }
                }
            } catch (Exception unused) {
            } catch (Throwable th2) {
                v7.a.a(this, th2);
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static final void processDeprecatedParameters(Map<String, String> parameters, String eventName) {
        if (v7.a.b(EventDeactivationManager.class)) {
            return;
        }
        try {
            n.f(parameters, "parameters");
            n.f(eventName, "eventName");
            if (enabled) {
                ArrayList<String> arrayList = new ArrayList(parameters.keySet());
                for (DeprecatedParamFilter deprecatedParamFilter : new ArrayList(deprecatedParamFilters)) {
                    if (n.a(deprecatedParamFilter.getEventName(), eventName)) {
                        for (String str : arrayList) {
                            if (deprecatedParamFilter.getDeprecateParams().contains(str)) {
                                parameters.remove(str);
                            }
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            v7.a.a(EventDeactivationManager.class, th2);
        }
    }

    public static final void processEvents(List<AppEvent> events) {
        if (v7.a.b(EventDeactivationManager.class)) {
            return;
        }
        try {
            n.f(events, "events");
            if (enabled) {
                Iterator<AppEvent> it = events.iterator();
                while (it.hasNext()) {
                    if (deprecatedEvents.contains(it.next().getName())) {
                        it.remove();
                    }
                }
            }
        } catch (Throwable th2) {
            v7.a.a(EventDeactivationManager.class, th2);
        }
    }
}
