package com.facebook.appevents.suggestedevents;

import android.app.Activity;
import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.x;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.ml.ModelManager;
import com.ironsource.mediationsdk.metadata.a;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import java.io.File;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import l7.s;
import org.json.JSONArray;
import org.json.JSONObject;
import q7.r;
import q7.u;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0013\u0010\u0011J\u0019\u0010\u0018\u001a\u00020\u00042\b\u0010\u0015\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR\u0014\u0010 \u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010!¨\u0006#"}, d2 = {"Lcom/facebook/appevents/suggestedevents/SuggestedEventsManager;", "", "<init>", "()V", "Lwj/r;", a.f29613j, MobileAdsBridgeBase.initializeMethodName, "Landroid/app/Activity;", "activity", "trackActivity", "(Landroid/app/Activity;)V", "", "isEnabled", "()Z", "", NotificationCompat.CATEGORY_EVENT, "isProductionEvents$facebook_core_release", "(Ljava/lang/String;)Z", "isProductionEvents", "isEligibleEvents$facebook_core_release", "isEligibleEvents", "rawSuggestedEventSetting", "populateEventsFromRawJsonString$facebook_core_release", "(Ljava/lang/String;)V", "populateEventsFromRawJsonString", "Ljava/util/concurrent/atomic/AtomicBoolean;", "enabled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "productionEvents", "Ljava/util/Set;", "eligibleEvents", "PRODUCTION_EVENTS_KEY", "Ljava/lang/String;", "ELIGIBLE_EVENTS_KEY", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class SuggestedEventsManager {
    private static final String ELIGIBLE_EVENTS_KEY = "eligible_for_prediction_events";
    private static final String PRODUCTION_EVENTS_KEY = "production_events";
    public static final SuggestedEventsManager INSTANCE = new SuggestedEventsManager();
    private static final AtomicBoolean enabled = new AtomicBoolean(false);
    private static final Set<String> productionEvents = new LinkedHashSet();
    private static final Set<String> eligibleEvents = new LinkedHashSet();

    private SuggestedEventsManager() {
    }

    public static final synchronized void enable() {
        if (v7.a.b(SuggestedEventsManager.class)) {
            return;
        }
        try {
            s.d().execute(new x(17));
        } catch (Throwable th2) {
            v7.a.a(SuggestedEventsManager.class, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void enable$lambda$0() {
        if (v7.a.b(SuggestedEventsManager.class)) {
            return;
        }
        try {
            AtomicBoolean atomicBoolean = enabled;
            if (atomicBoolean.get()) {
                return;
            }
            atomicBoolean.set(true);
            INSTANCE.initialize();
        } catch (Throwable th2) {
            v7.a.a(SuggestedEventsManager.class, th2);
        }
    }

    private final void initialize() {
        String str;
        if (v7.a.b(this)) {
            return;
        }
        try {
            r rVarK = u.k(s.c(), false);
            if (rVarK != null && (str = rVarK.f48767k) != null) {
                populateEventsFromRawJsonString$facebook_core_release(str);
                if (productionEvents.isEmpty() && eligibleEvents.isEmpty()) {
                    return;
                }
                File ruleFile = ModelManager.getRuleFile(ModelManager.Task.MTML_APP_EVENT_PREDICTION);
                if (ruleFile == null) {
                    return;
                }
                FeatureExtractor.initialize(ruleFile);
                Activity currentActivity = ActivityLifecycleTracker.getCurrentActivity();
                if (currentActivity != null) {
                    trackActivity(currentActivity);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public static final boolean isEligibleEvents$facebook_core_release(String event) {
        if (v7.a.b(SuggestedEventsManager.class)) {
            return false;
        }
        try {
            n.f(event, "event");
            return eligibleEvents.contains(event);
        } catch (Throwable th2) {
            v7.a.a(SuggestedEventsManager.class, th2);
            return false;
        }
    }

    public static final boolean isEnabled() {
        if (v7.a.b(SuggestedEventsManager.class)) {
            return false;
        }
        try {
            return enabled.get();
        } catch (Throwable th2) {
            v7.a.a(SuggestedEventsManager.class, th2);
            return false;
        }
    }

    public static final boolean isProductionEvents$facebook_core_release(String event) {
        if (v7.a.b(SuggestedEventsManager.class)) {
            return false;
        }
        try {
            n.f(event, "event");
            return productionEvents.contains(event);
        } catch (Throwable th2) {
            v7.a.a(SuggestedEventsManager.class, th2);
            return false;
        }
    }

    public static final void trackActivity(Activity activity) {
        if (v7.a.b(SuggestedEventsManager.class)) {
            return;
        }
        try {
            n.f(activity, "activity");
            try {
                if (!enabled.get() || !FeatureExtractor.isInitialized() || (productionEvents.isEmpty() && eligibleEvents.isEmpty())) {
                    ViewObserver.INSTANCE.stopTrackingActivity(activity);
                    return;
                }
                ViewObserver.INSTANCE.startTrackingActivity(activity);
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            v7.a.a(SuggestedEventsManager.class, th2);
        }
    }

    public final void populateEventsFromRawJsonString$facebook_core_release(String rawSuggestedEventSetting) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(rawSuggestedEventSetting);
            if (jSONObject.has(PRODUCTION_EVENTS_KEY)) {
                JSONArray jSONArray = jSONObject.getJSONArray(PRODUCTION_EVENTS_KEY);
                int length = jSONArray.length();
                for (int i10 = 0; i10 < length; i10++) {
                    Set<String> set = productionEvents;
                    String string = jSONArray.getString(i10);
                    n.e(string, "jsonArray.getString(i)");
                    set.add(string);
                }
            }
            if (jSONObject.has(ELIGIBLE_EVENTS_KEY)) {
                JSONArray jSONArray2 = jSONObject.getJSONArray(ELIGIBLE_EVENTS_KEY);
                int length2 = jSONArray2.length();
                for (int i11 = 0; i11 < length2; i11++) {
                    Set<String> set2 = eligibleEvents;
                    String string2 = jSONArray2.getString(i11);
                    n.e(string2, "jsonArray.getString(i)");
                    set2.add(string2);
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }
}
