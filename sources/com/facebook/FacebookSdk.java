package com.facebook;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.support.v4.media.session.PlaybackStateCompat;
import com.applovin.impl.Z;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.internal.ActivityLifecycleTracker;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.appevents.ondeviceprocessing.OnDeviceProcessingManager;
import com.facebook.internal.AttributionIdentifiers;
import com.facebook.internal.BoltsMeasurementEventListener;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.FetchedAppSettingsManager;
import com.facebook.internal.LockOnGetVariable;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.ServerProtocol;
import com.facebook.internal.Utility;
import com.facebook.internal.Validate;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.smartdigimkt.x.n;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/facebook/FacebookSdk;", "", "GraphRequestCreator", "InitializeCallback", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
public final class FacebookSdk {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Executor f15916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile String f15917c;
    public static volatile String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static volatile String f15918e;
    public static volatile Boolean f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static LockOnGetVariable f15919h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Context f15920i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f15921l;
    public static boolean m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static boolean f15922n;
    public static boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final AtomicBoolean f15923p;
    public static volatile String q;
    public static volatile String r;
    public static final GraphRequestCreator s;
    public static boolean t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final FacebookSdk f15924u = new FacebookSdk();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f15915a = SetsKt.b(LoggingBehavior.g0);
    public static final AtomicLong g = new AtomicLong(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
    public static int j = 64206;
    public static final ReentrantLock k = new ReentrantLock();

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bá\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/FacebookSdk$GraphRequestCreator;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface GraphRequestCreator {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/facebook/FacebookSdk$InitializeCallback;", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    public interface InitializeCallback {
    }

    static {
        Collection collection = ServerProtocol.f16370a;
        f15921l = "v12.0";
        f15923p = new AtomicBoolean(false);
        q = "instagram.com";
        r = "facebook.com";
        s = FacebookSdk$graphRequestCreator$1.f15925a;
    }

    public static final void a(Context context, String str) {
        FacebookSdk facebookSdk = f15924u;
        if (CrashShieldHandler.b(facebookSdk)) {
            return;
        }
        try {
            AttributionIdentifiers attributionIdentifiersA = AttributionIdentifiers.Companion.a(context);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
            String strConcat = str.concat("ping");
            long j2 = sharedPreferences.getLong(strConcat, 0L);
            try {
                JSONObject jSONObjectA = AppEventsLoggerUtility.a(AppEventsLoggerUtility.GraphAPIActivityType.X, attributionIdentifiersA, AppEventsLogger.Companion.b(context), h(context), context);
                String str2 = String.format("%s/activities", Arrays.copyOf(new Object[]{str}, 1));
                ((FacebookSdk$graphRequestCreator$1) s).getClass();
                String str3 = GraphRequest.j;
                GraphRequest graphRequestG = GraphRequest.Companion.g(null, str2, jSONObjectA, null);
                if (j2 == 0 && graphRequestG.c().d == null) {
                    SharedPreferences.Editor editorEdit = sharedPreferences.edit();
                    editorEdit.putLong(strConcat, System.currentTimeMillis());
                    editorEdit.apply();
                }
            } catch (JSONException e2) {
                throw new FacebookException("An error occurred while publishing install.", e2);
            }
        } catch (Exception unused) {
        } catch (Throwable th) {
            CrashShieldHandler.a(facebookSdk, th);
        }
    }

    public static final Context b() {
        Validate.h();
        Context context = f15920i;
        if (context != null) {
            return context;
        }
        Intrinsics.m("applicationContext");
        throw null;
    }

    public static final String c() {
        Validate.h();
        String str = f15917c;
        if (str != null) {
            return str;
        }
        throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
    }

    public static final boolean d() {
        AtomicBoolean atomicBoolean = UserSettingsManager.f15968a;
        if (CrashShieldHandler.b(UserSettingsManager.class)) {
            return false;
        }
        try {
            UserSettingsManager.f15973i.e();
            return UserSettingsManager.f.a();
        } catch (Throwable th) {
            CrashShieldHandler.a(UserSettingsManager.class, th);
            return false;
        }
    }

    public static final Executor e() {
        ReentrantLock reentrantLock = k;
        reentrantLock.lock();
        try {
            if (f15916b == null) {
                f15916b = AsyncTask.THREAD_POOL_EXECUTOR;
            }
            reentrantLock.unlock();
            Executor executor = f15916b;
            if (executor != null) {
                return executor;
            }
            throw new IllegalStateException("Required value was null.");
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String f() {
        String str = f15921l;
        String.format("getGraphApiVersion: %s", Arrays.copyOf(new Object[]{str}, 1));
        return str;
    }

    public static final String g() {
        Date date = AccessToken.m0;
        AccessToken accessTokenB = AccessToken.Companion.b();
        String str = accessTokenB != null ? accessTokenB.l0 : null;
        String str2 = r;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1253231569) {
                if (iHashCode == 28903346 && str.equals("instagram")) {
                    return StringsKt.I(str2, "facebook.com", "instagram.com");
                }
            } else if (str.equals("gaming")) {
                return StringsKt.I(str2, "facebook.com", "fb.gg");
            }
        }
        return str2;
    }

    public static final boolean h(Context context) {
        Intrinsics.f(context, "context");
        Validate.h();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static final synchronized boolean i() {
        return t;
    }

    public static final void j(LoggingBehavior behavior) {
        Intrinsics.f(behavior, "behavior");
        synchronized (f15915a) {
        }
    }

    public static final void k(Context context) {
        if (context == null) {
            return;
        }
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo.metaData == null) {
                return;
            }
            if (f15917c == null) {
                Object obj = applicationInfo.metaData.get("com.facebook.sdk.ApplicationId");
                if (obj instanceof String) {
                    String str = (String) obj;
                    Locale locale = Locale.ROOT;
                    if (StringsKt.M(Z.p(locale, "Locale.ROOT", str, locale, "(this as java.lang.String).toLowerCase(locale)"), n.f39791p, false)) {
                        String strSubstring = str.substring(2);
                        Intrinsics.e(strSubstring, "(this as java.lang.String).substring(startIndex)");
                        f15917c = strSubstring;
                    } else {
                        f15917c = str;
                    }
                } else if (obj instanceof Number) {
                    throw new FacebookException("App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file.");
                }
            }
            if (d == null) {
                d = applicationInfo.metaData.getString("com.facebook.sdk.ApplicationName");
            }
            if (f15918e == null) {
                f15918e = applicationInfo.metaData.getString("com.facebook.sdk.ClientToken");
            }
            if (j == 64206) {
                j = applicationInfo.metaData.getInt("com.facebook.sdk.CallbackOffset", 64206);
            }
            if (f == null) {
                f = Boolean.valueOf(applicationInfo.metaData.getBoolean("com.facebook.sdk.CodelessDebugLogEnabled", false));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public static final void l(Application application, final String str) {
        if (CrashShieldHandler.b(FacebookSdk.class)) {
            return;
        }
        try {
            final Context applicationContext = application.getApplicationContext();
            e().execute(new Runnable() { // from class: com.facebook.FacebookSdk$publishInstallAsync$1
                @Override // java.lang.Runnable
                public final void run() {
                    if (CrashShieldHandler.b(this)) {
                        return;
                    }
                    try {
                        HashSet hashSet = FacebookSdk.f15915a;
                        Context applicationContext2 = applicationContext;
                        Intrinsics.e(applicationContext2, "applicationContext");
                        FacebookSdk.a(applicationContext2, str);
                    } catch (Throwable th) {
                        CrashShieldHandler.a(this, th);
                    }
                }
            });
            if (FeatureManager.b(FeatureManager.Feature.OnDeviceEventProcessing) && OnDeviceProcessingManager.a()) {
                OnDeviceProcessingManager.c(str);
            }
        } catch (Throwable th) {
            CrashShieldHandler.a(FacebookSdk.class, th);
        }
    }

    public static final synchronized void m(Context context) {
        try {
            AtomicBoolean atomicBoolean = f15923p;
            if (atomicBoolean.get()) {
                return;
            }
            boolean zA = false;
            Validate.b(context, false);
            Validate.c(context, false);
            Context applicationContext = context.getApplicationContext();
            Intrinsics.e(applicationContext, "applicationContext.applicationContext");
            f15920i = applicationContext;
            AppEventsLogger.Companion.b(context);
            Context context2 = f15920i;
            if (context2 == null) {
                Intrinsics.m("applicationContext");
                throw null;
            }
            k(context2);
            if (Utility.C(f15917c)) {
                throw new FacebookException("A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk.");
            }
            atomicBoolean.set(true);
            AtomicBoolean atomicBoolean2 = UserSettingsManager.f15968a;
            if (!CrashShieldHandler.b(UserSettingsManager.class)) {
                try {
                    UserSettingsManager.f15973i.e();
                    zA = UserSettingsManager.f15970c.a();
                } catch (Throwable th) {
                    CrashShieldHandler.a(UserSettingsManager.class, th);
                }
            }
            if (zA) {
                t = true;
            }
            Context context3 = f15920i;
            if (context3 == null) {
                Intrinsics.m("applicationContext");
                throw null;
            }
            if ((context3 instanceof Application) && UserSettingsManager.c()) {
                Context context4 = f15920i;
                if (context4 == null) {
                    Intrinsics.m("applicationContext");
                    throw null;
                }
                ActivityLifecycleTracker.c((Application) context4, f15917c);
            }
            FetchedAppSettingsManager.c();
            NativeProtocol.s();
            BoltsMeasurementEventListener boltsMeasurementEventListener = BoltsMeasurementEventListener.f16260b;
            Context context5 = f15920i;
            if (context5 == null) {
                Intrinsics.m("applicationContext");
                throw null;
            }
            BoltsMeasurementEventListener.Companion.a(context5);
            f15919h = new LockOnGetVariable(FacebookSdk$sdkInitialize$1.X);
            FeatureManager.a(FacebookSdk$sdkInitialize$2.f15927a, FeatureManager.Feature.Instrument);
            FeatureManager.a(FacebookSdk$sdkInitialize$3.f15928a, FeatureManager.Feature.AppEvents);
            FeatureManager.a(FacebookSdk$sdkInitialize$4.f15929a, FeatureManager.Feature.ChromeCustomTabsPrefetching);
            FeatureManager.a(FacebookSdk$sdkInitialize$5.f15930a, FeatureManager.Feature.IgnoreAppSwitchToLoggedOut);
            FeatureManager.a(FacebookSdk$sdkInitialize$6.f15931a, FeatureManager.Feature.BypassAppSwitch);
            e().execute(new FutureTask(new FacebookSdk$sdkInitialize$futureTask$1()));
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
