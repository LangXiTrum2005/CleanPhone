package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.ConfigUpdate;
import com.google.firebase.remoteconfig.ConfigUpdateListener;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class ConfigAutoFetch {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f20928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HttpURLConnection f20929b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ConfigFetchHandler f20930c;
    public final ConfigCacheClient d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConfigUpdateListener f20931e;
    public final ScheduledExecutorService f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ConfigSharedPrefsClient f20933i;
    public final Random g = new Random();
    public boolean j = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Clock f20932h = DefaultClock.getInstance();

    public ConfigAutoFetch(HttpURLConnection httpURLConnection, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, LinkedHashSet linkedHashSet, ConfigUpdateListener configUpdateListener, ScheduledExecutorService scheduledExecutorService, ConfigSharedPrefsClient configSharedPrefsClient) {
        this.f20929b = httpURLConnection;
        this.f20930c = configFetchHandler;
        this.d = configCacheClient;
        this.f20928a = linkedHashSet;
        this.f20931e = configUpdateListener;
        this.f = scheduledExecutorService;
        this.f20933i = configSharedPrefsClient;
    }

    public final void a(final int i2, final long j) {
        if (i2 == 0) {
            d(new FirebaseRemoteConfigServerException("Unable to fetch the latest version of the template."));
            return;
        }
        this.f.schedule(new Runnable() { // from class: com.google.firebase.remoteconfig.internal.ConfigAutoFetch.1
            @Override // java.lang.Runnable
            public final void run() {
                final ConfigAutoFetch configAutoFetch = ConfigAutoFetch.this;
                int i3 = i2;
                final long j2 = j;
                synchronized (configAutoFetch) {
                    final int i4 = i3 - 1;
                    final Task taskC = configAutoFetch.f20930c.c(3 - i4);
                    final Task taskB = configAutoFetch.d.b();
                    Tasks.whenAllComplete((Task<?>[]) new Task[]{taskC, taskB}).continueWithTask(configAutoFetch.f, new Continuation() { // from class: com.google.firebase.remoteconfig.internal.a
                        @Override // com.google.android.gms.tasks.Continuation
                        public final Object then(Task task) throws JSONException {
                            Boolean boolValueOf;
                            JSONObject jSONObject;
                            ConfigAutoFetch configAutoFetch2 = configAutoFetch;
                            Task task2 = taskC;
                            Task task3 = taskB;
                            long j3 = j2;
                            int i5 = i4;
                            configAutoFetch2.getClass();
                            if (!task2.isSuccessful()) {
                                return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to auto-fetch config update.", task2.getException()));
                            }
                            if (!task3.isSuccessful()) {
                                return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to get activated config for auto-fetch", task3.getException()));
                            }
                            ConfigFetchHandler.FetchResponse fetchResponse = (ConfigFetchHandler.FetchResponse) task2.getResult();
                            ConfigContainer configContainer = (ConfigContainer) task3.getResult();
                            ConfigContainer configContainer2 = fetchResponse.f20955b;
                            if (configContainer2 != null) {
                                boolValueOf = Boolean.valueOf(configContainer2.f >= j3);
                            } else {
                                boolValueOf = Boolean.valueOf(fetchResponse.f20954a == 1);
                            }
                            if (!boolValueOf.booleanValue()) {
                                Log.d("FirebaseRemoteConfig", "Fetched template version is the same as SDK's current version. Retrying fetch.");
                                configAutoFetch2.a(i5, j3);
                                return Tasks.forResult(null);
                            }
                            if (fetchResponse.f20955b == null) {
                                Log.d("FirebaseRemoteConfig", "The fetch succeeded, but the backend had no updates.");
                                return Tasks.forResult(null);
                            }
                            if (configContainer == null) {
                                ConfigContainer.Builder builderC = ConfigContainer.c();
                                configContainer = new ConfigContainer(builderC.f20944a, builderC.f20945b, builderC.f20946c, builderC.d, builderC.f20947e, builderC.f);
                            }
                            ConfigContainer configContainer3 = fetchResponse.f20955b;
                            ConfigContainer configContainerA = ConfigContainer.a(new JSONObject(configContainer3.f20940a.toString()));
                            HashMap mapB = configContainer.b();
                            HashMap mapB2 = configContainer3.b();
                            HashSet hashSet = new HashSet();
                            JSONObject jSONObject2 = configContainer.f20941b;
                            Iterator<String> itKeys = jSONObject2.keys();
                            while (true) {
                                boolean zHasNext = itKeys.hasNext();
                                jSONObject = configContainerA.f20941b;
                                if (!zHasNext) {
                                    break;
                                }
                                String next = itKeys.next();
                                JSONObject jSONObject3 = configContainer3.f20941b;
                                if (!jSONObject3.has(next)) {
                                    hashSet.add(next);
                                } else if (jSONObject2.get(next).equals(jSONObject3.get(next))) {
                                    JSONObject jSONObject4 = configContainer.f20943e;
                                    boolean zHas = jSONObject4.has(next);
                                    JSONObject jSONObject5 = configContainer3.f20943e;
                                    if ((zHas && !jSONObject5.has(next)) || (!jSONObject4.has(next) && jSONObject5.has(next))) {
                                        hashSet.add(next);
                                    } else if (jSONObject4.has(next) && jSONObject5.has(next) && !jSONObject4.getJSONObject(next).toString().equals(jSONObject5.getJSONObject(next).toString())) {
                                        hashSet.add(next);
                                    } else if (mapB.containsKey(next) != mapB2.containsKey(next)) {
                                        hashSet.add(next);
                                    } else if (mapB.containsKey(next) && mapB2.containsKey(next) && !((Map) mapB.get(next)).equals(mapB2.get(next))) {
                                        hashSet.add(next);
                                    } else {
                                        jSONObject.remove(next);
                                    }
                                } else {
                                    hashSet.add(next);
                                }
                            }
                            Iterator<String> itKeys2 = jSONObject.keys();
                            while (itKeys2.hasNext()) {
                                hashSet.add(itKeys2.next());
                            }
                            if (hashSet.isEmpty()) {
                                Log.d("FirebaseRemoteConfig", "Config was fetched, but no params changed.");
                                return Tasks.forResult(null);
                            }
                            ConfigUpdate configUpdateA = ConfigUpdate.a(hashSet);
                            synchronized (configAutoFetch2) {
                                Iterator it = configAutoFetch2.f20928a.iterator();
                                while (it.hasNext()) {
                                    ((ConfigUpdateListener) it.next()).a(configUpdateA);
                                }
                            }
                            return Tasks.forResult(null);
                        }
                    });
                }
            }
        }, this.g.nextInt(4), TimeUnit.SECONDS);
    }

    public final void b(InputStream inputStream) throws IOException {
        boolean zIsEmpty;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "utf-8"));
        String strM = "";
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            strM = android.support.v4.media.a.m(strM, line);
            if (line.contains("}")) {
                int iIndexOf = strM.indexOf(123);
                int iLastIndexOf = strM.lastIndexOf(125);
                strM = (iIndexOf < 0 || iLastIndexOf < 0 || iIndexOf >= iLastIndexOf) ? "" : strM.substring(iIndexOf, iLastIndexOf + 1);
                if (strM.isEmpty()) {
                    continue;
                } else {
                    try {
                        JSONObject jSONObject = new JSONObject(strM);
                        if (jSONObject.has("featureDisabled") && jSONObject.getBoolean("featureDisabled")) {
                            ((ConfigRealtimeHttpClient.AnonymousClass2) this.f20931e).b(new FirebaseRemoteConfigServerException("The server is temporarily unavailable. Try again in a few minutes."));
                            break;
                        }
                        synchronized (this) {
                            zIsEmpty = this.f20928a.isEmpty();
                        }
                        if (zIsEmpty) {
                            break;
                        }
                        if (jSONObject.has("latestTemplateVersionNumber")) {
                            long j = this.f20930c.f20952h.f20981a.getLong("last_template_version", 0L);
                            long j2 = jSONObject.getLong("latestTemplateVersionNumber");
                            if (j2 > j) {
                                a(3, j2);
                            }
                        }
                        if (jSONObject.has("retryIntervalSeconds")) {
                            e(jSONObject.getInt("retryIntervalSeconds"));
                        }
                        strM = "";
                    } catch (JSONException e2) {
                        d(new FirebaseRemoteConfigClientException("Unable to parse config update message.", e2.getCause()));
                        Log.e("FirebaseRemoteConfig", "Unable to parse latest config update message.", e2);
                    }
                }
            }
        }
        bufferedReader.close();
    }

    public final void c() {
        HttpURLConnection httpURLConnection = this.f20929b;
        if (httpURLConnection == null) {
            return;
        }
        InputStream inputStream = null;
        try {
            try {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    b(inputStream);
                    if (inputStream != null) {
                        inputStream.close();
                    }
                } catch (IOException e2) {
                    if (!this.j) {
                        Log.d("FirebaseRemoteConfig", "Real-time connection was closed due to an exception.", e2);
                    }
                    if (inputStream != null) {
                        inputStream.close();
                    }
                }
            } catch (IOException e3) {
                Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e3);
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException e4) {
                    Log.d("FirebaseRemoteConfig", "Exception thrown when closing connection stream. Retrying connection...", e4);
                }
            }
            throw th;
        }
    }

    public final synchronized void d(FirebaseRemoteConfigException firebaseRemoteConfigException) {
        Iterator it = this.f20928a.iterator();
        while (it.hasNext()) {
            ((ConfigUpdateListener) it.next()).b(firebaseRemoteConfigException);
        }
    }

    public final synchronized void e(int i2) {
        Date date = new Date(new Date(this.f20932h.currentTimeMillis()).getTime() + (((long) i2) * 1000));
        ConfigSharedPrefsClient configSharedPrefsClient = this.f20933i;
        synchronized (configSharedPrefsClient.d) {
            configSharedPrefsClient.f20981a.edit().putLong("realtime_backoff_end_time_in_millis", date.getTime()).apply();
        }
    }
}
