package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import com.google.firebase.FirebaseApp;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.remoteconfig.ConfigUpdateListenerRegistration;
import java.util.LinkedHashSet;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public class ConfigRealtimeHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedHashSet f20966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConfigRealtimeHttpClient f20967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final FirebaseInstallationsApi f20968c;
    public final Context d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f20969e;

    public class ConfigUpdateListenerRegistrationInternal implements ConfigUpdateListenerRegistration {
    }

    public ConfigRealtimeHandler(FirebaseApp firebaseApp, FirebaseInstallationsApi firebaseInstallationsApi, ConfigFetchHandler configFetchHandler, ConfigCacheClient configCacheClient, Context context, ConfigSharedPrefsClient configSharedPrefsClient, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f20966a = linkedHashSet;
        this.f20967b = new ConfigRealtimeHttpClient(firebaseApp, firebaseInstallationsApi, configFetchHandler, configCacheClient, context, linkedHashSet, configSharedPrefsClient, scheduledExecutorService);
        this.f20968c = firebaseInstallationsApi;
        this.d = context;
        this.f20969e = scheduledExecutorService;
    }
}
