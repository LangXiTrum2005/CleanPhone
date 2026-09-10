package com.facebook.appevents.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.ironsource.C0526q2;
import com.ironsource.X3;
import gatewayprotocol.v1.DiagnosticEventRequestOuterClass;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.n;
import l7.s;
import org.json.JSONObject;
import r9.b;
import wj.d;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 #2\u00020\u0001:\u0001#B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lcom/facebook/appevents/internal/AppLinkManager;", "", "<init>", "()V", "Landroid/app/Activity;", "activity", "Lwj/r;", "handleURL", "(Landroid/app/Activity;)V", "Landroid/net/Uri;", "uri", "Landroid/content/Intent;", "intent", "processCampaignIds", "(Landroid/net/Uri;Landroid/content/Intent;)V", "", "getCampaignIDFromUri", "(Landroid/net/Uri;)Ljava/lang/String;", "getCampaignIDFromIntentExtra", "(Landroid/content/Intent;)Ljava/lang/String;", "processClickId", "(Landroid/net/Uri;)V", X3.i.W, "getInfo", "(Ljava/lang/String;)Ljava/lang/String;", "Landroid/app/Application;", "application", "setupLifecycleListener", "(Landroid/app/Application;)V", "Landroid/content/SharedPreferences;", "preferences$delegate", "Lwj/d;", "getPreferences", "()Landroid/content/SharedPreferences;", "preferences", "Companion", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
public final class AppLinkManager {
    public static final String APPLINK_DATA_KEY = "al_applink_data";
    public static final String APPLINK_INFO = "com.facebook.sdk.APPLINK_INFO";
    public static final String CAMPAIGN_IDS_KEY = "campaign_ids";
    public static final String CLICK_ID_KEY = "click_id";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static volatile AppLinkManager instance;

    /* JADX INFO: renamed from: preferences$delegate, reason: from kotlin metadata */
    private final d preferences;

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u0004\u0018\u00010\tR\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/appevents/internal/AppLinkManager$Companion;", "", "()V", "APPLINK_DATA_KEY", "", "APPLINK_INFO", "CAMPAIGN_IDS_KEY", "CLICK_ID_KEY", C0526q2.f30050p, "Lcom/facebook/appevents/internal/AppLinkManager;", com.unity3d.services.core.fid.Constants.GET_INSTANCE, "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = DiagnosticEventRequestOuterClass.DiagnosticEventType.DIAGNOSTIC_EVENT_TYPE_NATIVE_AD_QUALITY_INIT_STARTED_VALUE)
    public static final class Companion {
        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final AppLinkManager getInstance() {
            AppLinkManager appLinkManagerAccess$getInstance$cp = AppLinkManager.access$getInstance$cp();
            if (appLinkManagerAccess$getInstance$cp != null) {
                return appLinkManagerAccess$getInstance$cp;
            }
            synchronized (this) {
                g gVar = null;
                if (!s.f45226p.get()) {
                    return null;
                }
                AppLinkManager appLinkManagerAccess$getInstance$cp2 = AppLinkManager.access$getInstance$cp();
                if (appLinkManagerAccess$getInstance$cp2 == null) {
                    appLinkManagerAccess$getInstance$cp2 = new AppLinkManager(gVar);
                    AppLinkManager.access$setInstance$cp(appLinkManagerAccess$getInstance$cp2);
                }
                return appLinkManagerAccess$getInstance$cp2;
            }
        }

        private Companion() {
        }
    }

    public /* synthetic */ AppLinkManager(g gVar) {
        this();
    }

    public static final /* synthetic */ AppLinkManager access$getInstance$cp() {
        if (v7.a.b(AppLinkManager.class)) {
            return null;
        }
        try {
            return instance;
        } catch (Throwable th2) {
            v7.a.a(AppLinkManager.class, th2);
            return null;
        }
    }

    public static final /* synthetic */ void access$setInstance$cp(AppLinkManager appLinkManager) {
        if (v7.a.b(AppLinkManager.class)) {
            return;
        }
        try {
            instance = appLinkManager;
        } catch (Throwable th2) {
            v7.a.a(AppLinkManager.class, th2);
        }
    }

    private final SharedPreferences getPreferences() {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            Object value = this.preferences.getValue();
            n.e(value, "<get-preferences>(...)");
            return (SharedPreferences) value;
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    public final String getCampaignIDFromIntentExtra(Intent intent) {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            n.f(intent, "intent");
            Bundle bundleExtra = intent.getBundleExtra(APPLINK_DATA_KEY);
            if (bundleExtra == null) {
                return null;
            }
            return bundleExtra.getString(CAMPAIGN_IDS_KEY);
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    public final String getCampaignIDFromUri(Uri uri) {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            n.f(uri, "uri");
            String queryParameter = uri.getQueryParameter(APPLINK_DATA_KEY);
            if (queryParameter == null) {
                return null;
            }
            try {
                return new JSONObject(queryParameter).getString(CAMPAIGN_IDS_KEY);
            } catch (Exception unused) {
                Log.d("AppLinkManager", "Fail to parse Applink data from Uri");
                return null;
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    public final String getInfo(String key) {
        if (v7.a.b(this)) {
            return null;
        }
        try {
            n.f(key, "key");
            return getPreferences().getString(key, null);
        } catch (Throwable th2) {
            v7.a.a(this, th2);
            return null;
        }
    }

    public final void handleURL(Activity activity) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            n.f(activity, "activity");
            Uri data = activity.getIntent().getData();
            if (data == null) {
                return;
            }
            Intent intent = activity.getIntent();
            n.e(intent, "activity.intent");
            processCampaignIds(data, intent);
            processClickId(data);
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final void processCampaignIds(Uri uri, Intent intent) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            n.f(uri, "uri");
            n.f(intent, "intent");
            String campaignIDFromUri = getCampaignIDFromUri(uri);
            if (campaignIDFromUri == null) {
                campaignIDFromUri = getCampaignIDFromIntentExtra(intent);
            }
            if (campaignIDFromUri != null) {
                getPreferences().edit().putString(CAMPAIGN_IDS_KEY, campaignIDFromUri).apply();
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final void processClickId(Uri uri) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            n.f(uri, "uri");
            String queryParameter = uri.getQueryParameter("fbclid");
            if (queryParameter != null && queryParameter.length() != 0) {
                getPreferences().edit().putString(CLICK_ID_KEY, queryParameter).apply();
            }
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    public final void setupLifecycleListener(Application application) {
        if (v7.a.b(this)) {
            return;
        }
        try {
            n.f(application, "application");
            application.registerActivityLifecycleCallbacks(new Application.ActivityLifecycleCallbacks() { // from class: com.facebook.appevents.internal.AppLinkManager.setupLifecycleListener.1
                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityCreated(Activity activity, Bundle bundle) {
                    n.f(activity, "activity");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityDestroyed(Activity activity) {
                    n.f(activity, "activity");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityPaused(Activity activity) {
                    n.f(activity, "activity");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityResumed(Activity activity) {
                    n.f(activity, "activity");
                    AppLinkManager companion = AppLinkManager.INSTANCE.getInstance();
                    if (companion != null) {
                        companion.handleURL(activity);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    n.f(activity, "activity");
                    n.f(bundle, "bundle");
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStarted(Activity activity) {
                    n.f(activity, "activity");
                    AppLinkManager companion = AppLinkManager.INSTANCE.getInstance();
                    if (companion != null) {
                        companion.handleURL(activity);
                    }
                }

                @Override // android.app.Application.ActivityLifecycleCallbacks
                public void onActivityStopped(Activity activity) {
                    n.f(activity, "activity");
                }
            });
        } catch (Throwable th2) {
            v7.a.a(this, th2);
        }
    }

    private AppLinkManager() {
        this.preferences = b.u(AppLinkManager$preferences$2.INSTANCE);
    }
}
