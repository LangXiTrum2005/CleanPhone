package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import dd.w;
import dd.x;
import fd.a;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import pd.b;
import pd.g;
import qd.d;
import qd.o;
import ub.j;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
@Keep
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, g> allRcConfigMap;
    private final w cache;
    private final Executor executor;

    @Nullable
    private b firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;

    @Nullable
    private tc.b firebaseRemoteConfigProvider;
    private final long rcmInitTimestamp;
    private final long remoteConfigFetchDelayInMs;
    private static final a logger = a.d();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(w.b(), new ThreadPoolExecutor(0, 1, FETCH_NEVER_HAPPENED_TIMESTAMP_MS, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, ((long) new Random().nextInt(25000)) + 5000);
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private g getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        g gVar = this.allRcConfigMap.get(str);
        o oVar = (o) gVar;
        if (oVar.f49015b != 2) {
            return null;
        }
        logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", oVar.d(), str);
        return gVar;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasLastFetchBecomeStale(long j10) {
        return j10 - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    private boolean hasRemoteConfigFetchDelayElapsed(long j10) {
        return j10 - this.rcmInitTimestamp >= this.remoteConfigFetchDelayInMs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        logger.g("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasRemoteConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        b bVar = this.firebaseRemoteConfig;
        qd.g gVar = bVar.f48330e;
        long j10 = gVar.f48971g.f49007a.getLong("minimum_fetch_interval_in_seconds", qd.g.f48963i);
        HashMap map = new HashMap(gVar.f48972h);
        map.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        gVar.f48969e.b().continueWithTask(gVar.f48967c, new d(gVar, j10, map)).onSuccessTask(j.f51968a, new ni.g(8)).onSuccessTask(bVar.f48327b, new pd.a(bVar)).addOnSuccessListener(this.executor, new x(this)).addOnFailureListener(this.executor, new x(this));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.a());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public md.d getBoolean(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config boolean value is null.");
            return new md.d();
        }
        g remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new md.d(Boolean.valueOf(((o) remoteConfigValue).a()));
            } catch (IllegalArgumentException unused) {
                o oVar = (o) remoteConfigValue;
                if (!oVar.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", oVar.d(), str);
                }
            }
        }
        return new md.d();
    }

    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public md.d getDouble(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config double value is null.");
            return new md.d();
        }
        g remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new md.d(Double.valueOf(((o) remoteConfigValue).b()));
            } catch (IllegalArgumentException unused) {
                o oVar = (o) remoteConfigValue;
                if (!oVar.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", oVar.d(), str);
                }
            }
        }
        return new md.d();
    }

    public md.d getLong(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config long value is null.");
            return new md.d();
        }
        g remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new md.d(Long.valueOf(((o) remoteConfigValue).c()));
            } catch (IllegalArgumentException unused) {
                o oVar = (o) remoteConfigValue;
                if (!oVar.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", oVar.d(), str);
                }
            }
        }
        return new md.d();
    }

    public <T> T getRemoteConfigValueOrDefault(String str, T t10) {
        g remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t10 instanceof Boolean) {
                    return (T) Boolean.valueOf(((o) remoteConfigValue).a());
                }
                if (t10 instanceof Double) {
                    return (T) Double.valueOf(((o) remoteConfigValue).b());
                }
                if (!(t10 instanceof Long) && !(t10 instanceof Integer)) {
                    if (t10 instanceof String) {
                        return (T) ((o) remoteConfigValue).d();
                    }
                    T t11 = (T) ((o) remoteConfigValue).d();
                    try {
                        logger.b("No matching type found for the defaultValue: '%s', using String.", t10);
                        return t11;
                    } catch (IllegalArgumentException unused) {
                        t10 = t11;
                        o oVar = (o) remoteConfigValue;
                        if (!oVar.d().isEmpty()) {
                            logger.b("Could not parse value: '%s' for key: '%s'.", oVar.d(), str);
                        }
                        return t10;
                    }
                }
                return (T) Long.valueOf(((o) remoteConfigValue).c());
            } catch (IllegalArgumentException unused2) {
            }
        }
        return t10;
    }

    public md.d getString(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config String value is null.");
            return new md.d();
        }
        g remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? new md.d(((o) remoteConfigValue).d()) : new md.d();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        tc.b bVar;
        pd.j jVar;
        if (this.firebaseRemoteConfig == null && (bVar = this.firebaseRemoteConfigProvider) != null && (jVar = (pd.j) bVar.get()) != null) {
            this.firebaseRemoteConfig = jVar.a(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        b bVar = this.firebaseRemoteConfig;
        return bVar == null || bVar.b().f38703b == 1 || this.firebaseRemoteConfig.b().f38703b == 2;
    }

    public void setFirebaseRemoteConfigProvider(@Nullable tc.b bVar) {
        this.firebaseRemoteConfigProvider = bVar;
    }

    public void syncConfigValues(Map<String, g> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        dd.d dVarV = dd.d.V();
        ConcurrentHashMap<String, g> concurrentHashMap = this.allRcConfigMap;
        dVarV.getClass();
        g gVar = concurrentHashMap.get("fpr_experiment_app_start_ttid");
        if (gVar == null) {
            logger.a("ExperimentTTID remote config flag does not exist.");
            return;
        }
        try {
            this.cache.g("com.google.firebase.perf.ExperimentTTID", ((o) gVar).a());
        } catch (Exception unused) {
            logger.a("ExperimentTTID remote config flag has invalid value, expected boolean.");
        }
    }

    public RemoteConfigManager(w wVar, Executor executor, b bVar, long j10) {
        ConcurrentHashMap<String, g> concurrentHashMap;
        this.rcmInitTimestamp = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
        this.cache = wVar;
        this.executor = executor;
        this.firebaseRemoteConfig = bVar;
        if (bVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(bVar.a());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.remoteConfigFetchDelayInMs = j10;
    }
}
