package com.google.firebase.remoteconfig.internal;

import A.C0880a0;
import A.W;
import android.text.format.DateUtils;
import androidx.media3.exoplayer.analytics.d;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.inject.Provider;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class ConfigFetchHandler {
    public static final long j = TimeUnit.HOURS.toSeconds(12);
    public static final int[] k = {2, 4, 8, 16, 32, 64, 128, 256};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FirebaseInstallationsApi f20948a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Provider f20949b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f20950c;
    public final Clock d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Random f20951e;
    public final ConfigCacheClient f;
    public final ConfigFetchHttpClient g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConfigSharedPrefsClient f20952h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f20953i;

    public static class FetchResponse {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ConfigContainer f20955b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f20956c;

        @Retention(RetentionPolicy.SOURCE)
        public @interface Status {
        }

        public FetchResponse(int i2, ConfigContainer configContainer, String str) {
            this.f20954a = i2;
            this.f20955b = configContainer;
            this.f20956c = str;
        }
    }

    public enum FetchType {
        /* JADX INFO: Fake field, exist only in values array */
        BASE("BASE"),
        /* JADX INFO: Fake field, exist only in values array */
        REALTIME("REALTIME");

        FetchType(String str) {
        }
    }

    public ConfigFetchHandler(FirebaseInstallationsApi firebaseInstallationsApi, Provider provider, Executor executor, Clock clock, Random random, ConfigCacheClient configCacheClient, ConfigFetchHttpClient configFetchHttpClient, ConfigSharedPrefsClient configSharedPrefsClient, HashMap map) {
        this.f20948a = firebaseInstallationsApi;
        this.f20949b = provider;
        this.f20950c = executor;
        this.d = clock;
        this.f20951e = random;
        this.f = configCacheClient;
        this.g = configFetchHttpClient;
        this.f20952h = configSharedPrefsClient;
        this.f20953i = map;
    }

    public final FetchResponse a(String str, String str2, Date date, HashMap map) throws FirebaseRemoteConfigException {
        String str3;
        try {
            HttpURLConnection httpURLConnectionB = this.g.b();
            ConfigFetchHttpClient configFetchHttpClient = this.g;
            HashMap mapD = d();
            String string = this.f20952h.f20981a.getString("last_fetch_etag", null);
            AnalyticsConnector analyticsConnector = (AnalyticsConnector) this.f20949b.get();
            FetchResponse fetchResponseFetch = configFetchHttpClient.fetch(httpURLConnectionB, str, str2, mapD, string, map, analyticsConnector != null ? (Long) analyticsConnector.e(true).get("_fot") : null, date, this.f20952h.b());
            ConfigContainer configContainer = fetchResponseFetch.f20955b;
            if (configContainer != null) {
                ConfigSharedPrefsClient configSharedPrefsClient = this.f20952h;
                long j2 = configContainer.f;
                synchronized (configSharedPrefsClient.f20982b) {
                    configSharedPrefsClient.f20981a.edit().putLong("last_template_version", j2).apply();
                }
            }
            String str4 = fetchResponseFetch.f20956c;
            if (str4 != null) {
                ConfigSharedPrefsClient configSharedPrefsClient2 = this.f20952h;
                synchronized (configSharedPrefsClient2.f20982b) {
                    configSharedPrefsClient2.f20981a.edit().putString("last_fetch_etag", str4).apply();
                }
            }
            this.f20952h.d(0, ConfigSharedPrefsClient.f);
            return fetchResponseFetch;
        } catch (FirebaseRemoteConfigServerException e2) {
            int i2 = e2.X;
            ConfigSharedPrefsClient configSharedPrefsClient3 = this.f20952h;
            if (i2 == 429 || i2 == 502 || i2 == 503 || i2 == 504) {
                int i3 = configSharedPrefsClient3.a().f20984a + 1;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                int[] iArr = k;
                long millis = timeUnit.toMillis(iArr[Math.min(i3, iArr.length) - 1]);
                configSharedPrefsClient3.d(i3, new Date(date.getTime() + (millis / 2) + ((long) this.f20951e.nextInt((int) millis))));
            }
            ConfigSharedPrefsClient.BackoffMetadata backoffMetadataA = configSharedPrefsClient3.a();
            int i4 = e2.X;
            if (backoffMetadataA.f20984a > 1 || i4 == 429) {
                backoffMetadataA.f20985b.getTime();
                throw new FirebaseRemoteConfigFetchThrottledException("Fetch was throttled.");
            }
            if (i4 == 401) {
                str3 = "The request did not have the required credentials. Please make sure your google-services.json is valid.";
            } else if (i4 == 403) {
                str3 = "The user is not authorized to access the project. Please make sure you are using the API key that corresponds to your Firebase project.";
            } else {
                if (i4 == 429) {
                    throw new FirebaseRemoteConfigClientException("The throttled response from the server was not handled correctly by the FRC SDK.");
                }
                if (i4 != 500) {
                    switch (i4) {
                        case 502:
                        case 503:
                        case 504:
                            str3 = "The server is unavailable. Please try again later.";
                            break;
                        default:
                            str3 = "The server returned an unexpected error.";
                            break;
                    }
                } else {
                    str3 = "There was an internal server error.";
                }
            }
            throw new FirebaseRemoteConfigServerException(e2.X, "Fetch failed: ".concat(str3), e2);
        }
    }

    public final Task b(Task task, long j2, final HashMap map) {
        Task taskContinueWithTask;
        boolean zBefore;
        final Date date = new Date(this.d.currentTimeMillis());
        boolean zIsSuccessful = task.isSuccessful();
        ConfigSharedPrefsClient configSharedPrefsClient = this.f20952h;
        if (zIsSuccessful) {
            Date date2 = new Date(configSharedPrefsClient.f20981a.getLong("last_fetch_time_in_millis", -1L));
            if (date2.equals(ConfigSharedPrefsClient.f20980e)) {
                zBefore = false;
            } else {
                zBefore = date.before(new Date(TimeUnit.SECONDS.toMillis(j2) + date2.getTime()));
            }
            if (zBefore) {
                return Tasks.forResult(new FetchResponse(2, null, null));
            }
        }
        Date date3 = configSharedPrefsClient.a().f20985b;
        Date date4 = date.before(date3) ? date3 : null;
        Executor executor = this.f20950c;
        if (date4 != null) {
            String str = "Fetch is throttled. Please wait before calling fetch again: " + DateUtils.formatElapsedTime(TimeUnit.MILLISECONDS.toSeconds(date4.getTime() - date.getTime()));
            date4.getTime();
            taskContinueWithTask = Tasks.forException(new FirebaseRemoteConfigFetchThrottledException(str));
        } else {
            FirebaseInstallationsApi firebaseInstallationsApi = this.f20948a;
            final Task id = firebaseInstallationsApi.getId();
            final Task token = firebaseInstallationsApi.getToken();
            taskContinueWithTask = Tasks.whenAllComplete((Task<?>[]) new Task[]{id, token}).continueWithTask(executor, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.b
                @Override // com.google.android.gms.tasks.Continuation
                public final Object then(Task task2) {
                    Date date5 = date;
                    HashMap map2 = map;
                    int[] iArr = ConfigFetchHandler.k;
                    ConfigFetchHandler configFetchHandler = this.X;
                    configFetchHandler.getClass();
                    Task task3 = id;
                    if (!task3.isSuccessful()) {
                        return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for fetch.", task3.getException()));
                    }
                    Task task4 = token;
                    if (!task4.isSuccessful()) {
                        return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for fetch.", task4.getException()));
                    }
                    try {
                        ConfigFetchHandler.FetchResponse fetchResponseA = configFetchHandler.a((String) task3.getResult(), ((InstallationTokenResult) task4.getResult()).a(), date5, map2);
                        if (fetchResponseA.f20954a != 0) {
                            return Tasks.forResult(fetchResponseA);
                        }
                        ConfigCacheClient configCacheClient = configFetchHandler.f;
                        ConfigContainer configContainer = fetchResponseA.f20955b;
                        configCacheClient.getClass();
                        W w2 = new W(3, configCacheClient, configContainer);
                        Executor executor2 = configCacheClient.f20936a;
                        return Tasks.call(executor2, w2).onSuccessTask(executor2, new d(26, configCacheClient, configContainer)).onSuccessTask(configFetchHandler.f20950c, new C0880a0(fetchResponseA, 23));
                    } catch (FirebaseRemoteConfigException e2) {
                        return Tasks.forException(e2);
                    }
                }
            });
        }
        return taskContinueWithTask.continueWithTask(executor, new d(28, this, date));
    }

    public final Task c(int i2) {
        HashMap map = new HashMap(this.f20953i);
        map.put("X-Firebase-RC-Fetch-Type", "REALTIME/" + i2);
        return this.f.b().continueWithTask(this.f20950c, new d(27, this, map));
    }

    public final HashMap d() {
        HashMap map = new HashMap();
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) this.f20949b.get();
        if (analyticsConnector != null) {
            for (Map.Entry entry : analyticsConnector.e(false).entrySet()) {
                map.put((String) entry.getKey(), entry.getValue().toString());
            }
        }
        return map;
    }
}
