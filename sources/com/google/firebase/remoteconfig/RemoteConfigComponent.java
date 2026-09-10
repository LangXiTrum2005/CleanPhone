package com.google.firebase.remoteconfig;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.media3.exoplayer.analytics.o;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.util.BiConsumer;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.FirebaseApp;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigFetchHttpClient;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler;
import com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient;
import com.google.firebase.remoteconfig.internal.ConfigStorageClient;
import com.google.firebase.remoteconfig.internal.Personalization;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateFactory;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class RemoteConfigComponent implements FirebaseRemoteConfigInterop {
    public static final Clock j = DefaultClock.getInstance();
    public static final Random k = new Random();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final HashMap f20919l = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f20921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f20922c;
    public final FirebaseApp d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final FirebaseInstallationsApi f20923e;
    public final FirebaseABTesting f;
    public final Provider g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f20924h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f20920a = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f20925i = new HashMap();

    public static class GlobalBackgroundListener implements BackgroundDetector.BackgroundStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final AtomicReference f20926a = new AtomicReference();

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public final void onBackgroundStateChanged(boolean z2) {
            Clock clock = RemoteConfigComponent.j;
            synchronized (RemoteConfigComponent.class) {
                Iterator it = RemoteConfigComponent.f20919l.values().iterator();
                while (it.hasNext()) {
                    ((FirebaseRemoteConfig) it.next()).b(z2);
                }
            }
        }
    }

    public RemoteConfigComponent(Context context, ScheduledExecutorService scheduledExecutorService, FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Provider provider) {
        this.f20921b = context;
        this.f20922c = scheduledExecutorService;
        this.d = firebaseApp;
        this.f20923e = firebaseInstallationsApi;
        this.f = firebaseABTesting;
        this.g = provider;
        firebaseApp.a();
        this.f20924h = firebaseApp.f20147c.f20155b;
        AtomicReference atomicReference = GlobalBackgroundListener.f20926a;
        Application application = (Application) context.getApplicationContext();
        AtomicReference atomicReference2 = GlobalBackgroundListener.f20926a;
        if (atomicReference2.get() == null) {
            GlobalBackgroundListener globalBackgroundListener = new GlobalBackgroundListener();
            while (!atomicReference2.compareAndSet(null, globalBackgroundListener)) {
                if (atomicReference2.get() != null) {
                }
            }
            BackgroundDetector.initialize(application);
            BackgroundDetector.getInstance().addListener(globalBackgroundListener);
        }
        Tasks.call(scheduledExecutorService, new androidx.webkit.internal.b(this, 2));
    }

    @Override // com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop
    public final void a(RolloutsStateSubscriber rolloutsStateSubscriber) {
        RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler = b().k;
        rolloutsStateSubscriptionsHandler.d.add(rolloutsStateSubscriber);
        Task taskB = rolloutsStateSubscriptionsHandler.f20999a.b();
        taskB.addOnSuccessListener(rolloutsStateSubscriptionsHandler.f21001c, new o(rolloutsStateSubscriptionsHandler, taskB, rolloutsStateSubscriber, 12));
    }

    public final synchronized FirebaseRemoteConfig b() throws Throwable {
        try {
            try {
                ConfigCacheClient configCacheClientD = d("fetch");
                ConfigCacheClient configCacheClientD2 = d("activate");
                ConfigCacheClient configCacheClientD3 = d("defaults");
                ConfigSharedPrefsClient configSharedPrefsClient = new ConfigSharedPrefsClient(this.f20921b.getSharedPreferences("frc_" + this.f20924h + "_firebase_settings", 0));
                ConfigGetParameterHandler configGetParameterHandler = new ConfigGetParameterHandler(this.f20922c, configCacheClientD2, configCacheClientD3);
                FirebaseApp firebaseApp = this.d;
                Provider provider = this.g;
                firebaseApp.a();
                final Personalization personalization = firebaseApp.f20146b.equals("[DEFAULT]") ? new Personalization(provider) : null;
                if (personalization != null) {
                    BiConsumer biConsumer = new BiConsumer() { // from class: com.google.firebase.remoteconfig.b
                        @Override // com.google.android.gms.common.util.BiConsumer
                        public final void accept(Object obj, Object obj2) {
                            JSONObject jSONObjectOptJSONObject;
                            Personalization personalization2 = personalization;
                            String str = (String) obj;
                            ConfigContainer configContainer = (ConfigContainer) obj2;
                            AnalyticsConnector analyticsConnector = (AnalyticsConnector) personalization2.f20993a.get();
                            if (analyticsConnector == null) {
                                return;
                            }
                            JSONObject jSONObject = configContainer.f20943e;
                            if (jSONObject.length() < 1) {
                                return;
                            }
                            JSONObject jSONObject2 = configContainer.f20941b;
                            if (jSONObject2.length() >= 1 && (jSONObjectOptJSONObject = jSONObject.optJSONObject(str)) != null) {
                                String strOptString = jSONObjectOptJSONObject.optString("choiceId");
                                if (strOptString.isEmpty()) {
                                    return;
                                }
                                synchronized (personalization2.f20994b) {
                                    try {
                                        if (strOptString.equals(personalization2.f20994b.get(str))) {
                                            return;
                                        }
                                        personalization2.f20994b.put(str, strOptString);
                                        Bundle bundleD = androidx.media3.extractor.text.ttml.a.d("arm_key", str);
                                        bundleD.putString("arm_value", jSONObject2.optString(str));
                                        bundleD.putString("personalization_id", jSONObjectOptJSONObject.optString("personalizationId"));
                                        bundleD.putInt("arm_index", jSONObjectOptJSONObject.optInt("armIndex", -1));
                                        bundleD.putString("group", jSONObjectOptJSONObject.optString("group"));
                                        analyticsConnector.c("fp", "personalization_assignment", bundleD);
                                        Bundle bundle = new Bundle();
                                        bundle.putString("_fpid", strOptString);
                                        analyticsConnector.c("fp", "_fpc", bundle);
                                    } catch (Throwable th) {
                                        throw th;
                                    }
                                }
                            }
                        }
                    };
                    synchronized (configGetParameterHandler.f20963a) {
                        configGetParameterHandler.f20963a.add(biConsumer);
                    }
                }
                RolloutsStateFactory rolloutsStateFactory = new RolloutsStateFactory();
                rolloutsStateFactory.f20997a = configCacheClientD2;
                rolloutsStateFactory.f20998b = configCacheClientD3;
                RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler = new RolloutsStateSubscriptionsHandler();
                rolloutsStateSubscriptionsHandler.d = Collections.newSetFromMap(new ConcurrentHashMap());
                rolloutsStateSubscriptionsHandler.f20999a = configCacheClientD2;
                rolloutsStateSubscriptionsHandler.f21000b = rolloutsStateFactory;
                ScheduledExecutorService scheduledExecutorService = this.f20922c;
                rolloutsStateSubscriptionsHandler.f21001c = scheduledExecutorService;
                return c(this.d, this.f20923e, this.f, scheduledExecutorService, configCacheClientD, configCacheClientD2, configCacheClientD3, e(configCacheClientD, configSharedPrefsClient), configGetParameterHandler, configSharedPrefsClient, rolloutsStateSubscriptionsHandler);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final synchronized FirebaseRemoteConfig c(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigSharedPrefsClient configSharedPrefsClient, RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler) {
        if (!this.f20920a.containsKey("firebase")) {
            Context context = this.f20921b;
            firebaseApp.a();
            FirebaseABTesting firebaseABTesting2 = firebaseApp.f20146b.equals("[DEFAULT]") ? firebaseABTesting : null;
            Context context2 = this.f20921b;
            synchronized (this) {
                FirebaseRemoteConfig firebaseRemoteConfig = new FirebaseRemoteConfig(context, firebaseInstallationsApi, firebaseABTesting2, executor, configCacheClient, configCacheClient2, configCacheClient3, configFetchHandler, configGetParameterHandler, configSharedPrefsClient, new ConfigRealtimeHandler(firebaseApp, firebaseInstallationsApi, configFetchHandler, configCacheClient2, context2, configSharedPrefsClient, this.f20922c), rolloutsStateSubscriptionsHandler);
                configCacheClient2.b();
                configCacheClient3.b();
                configCacheClient.b();
                this.f20920a.put("firebase", firebaseRemoteConfig);
                f20919l.put("firebase", firebaseRemoteConfig);
            }
        }
        return (FirebaseRemoteConfig) this.f20920a.get("firebase");
    }

    public final ConfigCacheClient d(String str) {
        ConfigStorageClient configStorageClient;
        ConfigCacheClient configCacheClient;
        String strN = androidx.datastore.preferences.protobuf.a.n("frc_", this.f20924h, "_firebase_", str, ".json");
        ScheduledExecutorService scheduledExecutorService = this.f20922c;
        Context context = this.f20921b;
        HashMap map = ConfigStorageClient.f20988c;
        synchronized (ConfigStorageClient.class) {
            try {
                HashMap map2 = ConfigStorageClient.f20988c;
                if (!map2.containsKey(strN)) {
                    map2.put(strN, new ConfigStorageClient(context, strN));
                }
                configStorageClient = (ConfigStorageClient) map2.get(strN);
            } catch (Throwable th) {
                throw th;
            }
        }
        HashMap map3 = ConfigCacheClient.d;
        synchronized (ConfigCacheClient.class) {
            try {
                String str2 = configStorageClient.f20990b;
                HashMap map4 = ConfigCacheClient.d;
                if (!map4.containsKey(str2)) {
                    map4.put(str2, new ConfigCacheClient(scheduledExecutorService, configStorageClient));
                }
                configCacheClient = (ConfigCacheClient) map4.get(str2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return configCacheClient;
    }

    public final synchronized ConfigFetchHandler e(ConfigCacheClient configCacheClient, ConfigSharedPrefsClient configSharedPrefsClient) {
        FirebaseInstallationsApi firebaseInstallationsApi;
        Provider bVar;
        ScheduledExecutorService scheduledExecutorService;
        Clock clock;
        Random random;
        String str;
        FirebaseApp firebaseApp;
        try {
            firebaseInstallationsApi = this.f20923e;
            FirebaseApp firebaseApp2 = this.d;
            firebaseApp2.a();
            bVar = firebaseApp2.f20146b.equals("[DEFAULT]") ? this.g : new com.google.firebase.components.b(2);
            scheduledExecutorService = this.f20922c;
            clock = j;
            random = k;
            FirebaseApp firebaseApp3 = this.d;
            firebaseApp3.a();
            str = firebaseApp3.f20147c.f20154a;
            firebaseApp = this.d;
            firebaseApp.a();
        } catch (Throwable th) {
            throw th;
        }
        return new ConfigFetchHandler(firebaseInstallationsApi, bVar, scheduledExecutorService, clock, random, configCacheClient, new ConfigFetchHttpClient(this.f20921b, firebaseApp.f20147c.f20155b, str, configSharedPrefsClient.f20981a.getLong("fetch_timeout_in_seconds", 60L), configSharedPrefsClient.f20981a.getLong("fetch_timeout_in_seconds", 60L)), configSharedPrefsClient, this.f20925i);
    }
}
