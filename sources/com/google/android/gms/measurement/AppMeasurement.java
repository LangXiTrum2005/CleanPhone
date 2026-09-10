package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import ca.a;
import ca.b;
import ca.c;
import com.google.android.gms.internal.measurement.i7;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.X3;
import com.mbridge.msdk.MBridgeConstans;
import ea.m1;
import ea.q2;
import ea.z1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k9.c0;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public class AppMeasurement {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile AppMeasurement f24509b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f24510a;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @NonNull
        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @NonNull
        @Keep
        public String mExpiredEventName;

        @NonNull
        @Keep
        public Bundle mExpiredEventParams;

        @NonNull
        @Keep
        public String mName;

        @NonNull
        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @NonNull
        @Keep
        public String mTimedOutEventName;

        @NonNull
        @Keep
        public Bundle mTimedOutEventParams;

        @NonNull
        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @NonNull
        @Keep
        public String mTriggeredEventName;

        @NonNull
        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @NonNull
        @Keep
        public Object mValue;
    }

    public AppMeasurement(m1 m1Var) {
        this.f24510a = new a(m1Var);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @NonNull
    @Keep
    @Deprecated
    public static AppMeasurement getInstance(@NonNull Context context) {
        if (f24509b == null) {
            synchronized (AppMeasurement.class) {
                if (f24509b == null) {
                    q2 q2Var = (q2) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                    if (q2Var != null) {
                        f24509b = new AppMeasurement(q2Var);
                    } else {
                        f24509b = new AppMeasurement(m1.n(context, new i7(0L, 0L, true, null, null), null, null));
                    }
                }
            }
        }
        return f24509b;
    }

    @Keep
    public void beginAdUnitExposure(@NonNull String str) {
        this.f24510a.b(str);
    }

    @Keep
    public void clearConditionalUserProperty(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f24510a.d(str, bundle, str2);
    }

    @Keep
    public void endAdUnitExposure(@NonNull String str) {
        this.f24510a.zzn(str);
    }

    @Keep
    public long generateEventId() {
        return this.f24510a.zzl();
    }

    @NonNull
    @Keep
    public String getAppInstanceId() {
        return this.f24510a.zzj();
    }

    @NonNull
    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(@NonNull String str, @NonNull String str2) {
        List<Bundle> listE = this.f24510a.e(str, str2);
        ArrayList arrayList = new ArrayList(listE == null ? 0 : listE.size());
        for (Bundle bundle : listE) {
            ConditionalUserProperty conditionalUserProperty = new ConditionalUserProperty();
            c0.h(bundle);
            conditionalUserProperty.mAppId = (String) z1.e(bundle, MBridgeConstans.APP_ID, String.class, null);
            conditionalUserProperty.mOrigin = (String) z1.e(bundle, "origin", String.class, null);
            conditionalUserProperty.mName = (String) z1.e(bundle, "name", String.class, null);
            conditionalUserProperty.mValue = z1.e(bundle, X3.i.X, Object.class, null);
            conditionalUserProperty.mTriggerEventName = (String) z1.e(bundle, "trigger_event_name", String.class, null);
            conditionalUserProperty.mTriggerTimeout = ((Long) z1.e(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            conditionalUserProperty.mTimedOutEventName = (String) z1.e(bundle, "timed_out_event_name", String.class, null);
            conditionalUserProperty.mTimedOutEventParams = (Bundle) z1.e(bundle, "timed_out_event_params", Bundle.class, null);
            conditionalUserProperty.mTriggeredEventName = (String) z1.e(bundle, "triggered_event_name", String.class, null);
            conditionalUserProperty.mTriggeredEventParams = (Bundle) z1.e(bundle, "triggered_event_params", Bundle.class, null);
            conditionalUserProperty.mTimeToLive = ((Long) z1.e(bundle, "time_to_live", Long.class, 0L)).longValue();
            conditionalUserProperty.mExpiredEventName = (String) z1.e(bundle, "expired_event_name", String.class, null);
            conditionalUserProperty.mExpiredEventParams = (Bundle) z1.e(bundle, "expired_event_params", Bundle.class, null);
            conditionalUserProperty.mActive = ((Boolean) z1.e(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            conditionalUserProperty.mCreationTimestamp = ((Long) z1.e(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            conditionalUserProperty.mTriggeredTimestamp = ((Long) z1.e(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(conditionalUserProperty);
        }
        return arrayList;
    }

    @NonNull
    @Keep
    public String getCurrentScreenClass() {
        return this.f24510a.zzi();
    }

    @NonNull
    @Keep
    public String getCurrentScreenName() {
        return this.f24510a.zzh();
    }

    @NonNull
    @Keep
    public String getGmpAppId() {
        return this.f24510a.zzk();
    }

    @Keep
    public int getMaxUserProperties(@NonNull String str) {
        return this.f24510a.g(str);
    }

    @NonNull
    @Keep
    public Map<String, Object> getUserProperties(@NonNull String str, @NonNull String str2, boolean z10) {
        return this.f24510a.c(str, str2, z10);
    }

    @Keep
    public void logEventInternal(@NonNull String str, @NonNull String str2, @NonNull Bundle bundle) {
        this.f24510a.a(str, bundle, str2);
    }

    @Keep
    public void setConditionalUserProperty(@NonNull ConditionalUserProperty conditionalUserProperty) {
        c0.h(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString(MBridgeConstans.APP_ID, str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            z1.c(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        this.f24510a.zzo(bundle);
    }

    public AppMeasurement(q2 q2Var) {
        this.f24510a = new b(q2Var);
    }
}
