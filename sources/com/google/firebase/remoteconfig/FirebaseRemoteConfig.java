package com.google.firebase.remoteconfig;

import android.content.Context;
import android.os.Build;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.d;
import com.google.android.gms.tasks.Task;
import com.google.firebase.abt.FirebaseABTesting;
import com.google.firebase.concurrent.FirebaseExecutors;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.internal.ConfigAutoFetch;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigGetParameterHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import java.net.HttpURLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class FirebaseRemoteConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f20911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseABTesting f20912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f20913c;
    public final ConfigCacheClient d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ConfigCacheClient f20914e;
    public final ConfigFetchHandler f;
    public final ConfigGetParameterHandler g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final ConfigSharedPrefsClient f20915h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final FirebaseInstallationsApi f20916i;
    public final ConfigRealtimeHandler j;
    public final RolloutsStateSubscriptionsHandler k;

    public FirebaseRemoteConfig(Context context, FirebaseInstallationsApi firebaseInstallationsApi, FirebaseABTesting firebaseABTesting, Executor executor, ConfigCacheClient configCacheClient, ConfigCacheClient configCacheClient2, ConfigCacheClient configCacheClient3, ConfigFetchHandler configFetchHandler, ConfigGetParameterHandler configGetParameterHandler, ConfigSharedPrefsClient configSharedPrefsClient, ConfigRealtimeHandler configRealtimeHandler, RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler) {
        this.f20911a = context;
        this.f20916i = firebaseInstallationsApi;
        this.f20912b = firebaseABTesting;
        this.f20913c = executor;
        this.d = configCacheClient;
        this.f20914e = configCacheClient2;
        this.f = configFetchHandler;
        this.g = configGetParameterHandler;
        this.f20915h = configSharedPrefsClient;
        this.j = configRealtimeHandler;
        this.k = rolloutsStateSubscriptionsHandler;
    }

    public static ArrayList c(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            HashMap map = new HashMap();
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.getString(next));
            }
            arrayList.add(map);
        }
        return arrayList;
    }

    public final Task a() {
        ConfigFetchHandler configFetchHandler = this.f;
        ConfigSharedPrefsClient configSharedPrefsClient = configFetchHandler.f20952h;
        long j = configSharedPrefsClient.f20981a.getLong("minimum_fetch_interval_in_seconds", ConfigFetchHandler.j);
        HashMap map = new HashMap(configFetchHandler.f20953i);
        map.put("X-Firebase-RC-Fetch-Type", "BASE/1");
        return configFetchHandler.f.b().continueWithTask(configFetchHandler.f20950c, new d(configFetchHandler, j, map)).onSuccessTask(FirebaseExecutors.a(), new com.google.common.net.a(10)).onSuccessTask(this.f20913c, new a(this));
    }

    public final void b(boolean z2) {
        HttpURLConnection httpURLConnection;
        ConfigRealtimeHandler configRealtimeHandler = this.j;
        synchronized (configRealtimeHandler) {
            ConfigRealtimeHttpClient configRealtimeHttpClient = configRealtimeHandler.f20967b;
            synchronized (configRealtimeHttpClient.r) {
                try {
                    configRealtimeHttpClient.f20973e = z2;
                    ConfigAutoFetch configAutoFetch = configRealtimeHttpClient.g;
                    if (configAutoFetch != null) {
                        configAutoFetch.j = z2;
                    }
                    if (Build.VERSION.SDK_INT >= 26 && z2 && (httpURLConnection = configRealtimeHttpClient.f) != null) {
                        httpURLConnection.disconnect();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (!z2) {
                synchronized (configRealtimeHandler) {
                    if (!configRealtimeHandler.f20966a.isEmpty()) {
                        configRealtimeHandler.f20967b.e(0L);
                    }
                }
            }
        }
    }
}
