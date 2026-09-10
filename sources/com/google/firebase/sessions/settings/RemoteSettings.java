package com.google.firebase.sessions.settings;

import android.os.Build;
import android.util.Log;
import com.google.firebase.installations.FirebaseInstallationsApi;
import com.google.firebase.sessions.ApplicationInfo;
import com.google.firebase.sessions.InstallationId;
import com.google.firebase.sessions.TimeProvider;
import java.util.Map;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexImpl;
import kotlinx.coroutines.sync.MutexKt;

/* JADX INFO: loaded from: classes4.dex */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings;", "Lcom/google/firebase/sessions/settings/SettingsProvider;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RemoteSettings implements SettingsProvider {
    public static final int g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Regex f21151h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeProvider f21152a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FirebaseInstallationsApi f21153b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ApplicationInfo f21154c;
    public final CrashlyticsSettingsFetcher d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SettingsCache f21155e;
    public final MutexImpl f;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettings$Companion;", "", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    static {
        Duration.Companion companion = Duration.f44719Y;
        g = (int) Duration.k(DurationKt.g(24, DurationUnit.HOURS), DurationUnit.SECONDS);
        f21151h = new Regex("/");
    }

    public RemoteSettings(TimeProvider timeProvider, FirebaseInstallationsApi firebaseInstallationsApi, ApplicationInfo appInfo, CrashlyticsSettingsFetcher configsFetcher, SettingsCache settingsCache) {
        Intrinsics.f(timeProvider, "timeProvider");
        Intrinsics.f(firebaseInstallationsApi, "firebaseInstallationsApi");
        Intrinsics.f(appInfo, "appInfo");
        Intrinsics.f(configsFetcher, "configsFetcher");
        Intrinsics.f(settingsCache, "settingsCache");
        this.f21152a = timeProvider;
        this.f21153b = firebaseInstallationsApi;
        this.f21154c = appInfo;
        this.d = configsFetcher;
        this.f21155e = settingsCache;
        this.f = MutexKt.a();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public final Boolean a() {
        return this.f21155e.d();
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public final Duration b() {
        Integer numE = this.f21155e.e();
        if (numE == null) {
            return null;
        }
        Duration.Companion companion = Duration.f44719Y;
        return new Duration(DurationKt.g(numE.intValue(), DurationUnit.SECONDS));
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public final Double c() {
        return this.f21155e.a();
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b3 A[Catch: all -> 0x0054, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:43:0x00a9, B:45:0x00b3, B:48:0x00bc, B:35:0x0086, B:37:0x008e, B:40:0x0097), top: B:56:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00bc A[Catch: all -> 0x0054, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0054, blocks: (B:21:0x0050, B:43:0x00a9, B:45:0x00b3, B:48:0x00bc, B:35:0x0086, B:37:0x008e, B:40:0x0097), top: B:56:0x002e }] */
    /* JADX WARN: Code duplicated, block: B:51:0x0140  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Instruction removed from duplicated block: B:48:0x00bc, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [int] */
    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public final Object d(Continuation continuation) throws Throwable {
        RemoteSettings$updateSettings$1 remoteSettings$updateSettings$1;
        Mutex mutex;
        Mutex mutex2;
        RemoteSettings remoteSettings;
        String str;
        Map mapJ;
        CrashlyticsSettingsFetcher crashlyticsSettingsFetcher;
        RemoteSettings$updateSettings$2$1 remoteSettings$updateSettings$2$1;
        RemoteSettings$updateSettings$2$2 remoteSettings$updateSettings$2$2;
        Mutex mutex3;
        if (continuation instanceof RemoteSettings$updateSettings$1) {
            remoteSettings$updateSettings$1 = (RemoteSettings$updateSettings$1) continuation;
            int i2 = remoteSettings$updateSettings$1.f0;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                remoteSettings$updateSettings$1.f0 = i2 - Integer.MIN_VALUE;
            } else {
                remoteSettings$updateSettings$1 = new RemoteSettings$updateSettings$1(this, (ContinuationImpl) continuation);
            }
        } else {
            remoteSettings$updateSettings$1 = new RemoteSettings$updateSettings$1(this, (ContinuationImpl) continuation);
        }
        Object objA = remoteSettings$updateSettings$1.Z;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        ?? r5 = remoteSettings$updateSettings$1.f0;
        Unit unit = Unit.f43263a;
        try {
            if (r5 == 0) {
                ResultKt.b(objA);
                MutexImpl mutexImpl = this.f;
                if (!mutexImpl.f() && !this.f21155e.c()) {
                    return unit;
                }
                remoteSettings$updateSettings$1.X = this;
                remoteSettings$updateSettings$1.f21156Y = mutexImpl;
                remoteSettings$updateSettings$1.f0 = 1;
                if (mutexImpl.a(remoteSettings$updateSettings$1) != coroutineSingletons) {
                    mutex2 = mutexImpl;
                    remoteSettings = this;
                }
                return coroutineSingletons;
            }
            if (r5 == 1) {
                mutex2 = remoteSettings$updateSettings$1.f21156Y;
                remoteSettings = (RemoteSettings) remoteSettings$updateSettings$1.X;
                ResultKt.b(objA);
            } else {
                if (r5 == 2) {
                    mutex2 = remoteSettings$updateSettings$1.f21156Y;
                    remoteSettings = (RemoteSettings) remoteSettings$updateSettings$1.X;
                    ResultKt.b(objA);
                    str = ((InstallationId) objA).f21081a;
                    if (str.equals("")) {
                        Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                        mutex2.b(null);
                        return unit;
                    }
                    Pair pair = new Pair("X-Crashlytics-Installation-ID", str);
                    String str2 = Build.MANUFACTURER + Build.MODEL;
                    remoteSettings.getClass();
                    Regex regex = f21151h;
                    Pair pair2 = new Pair("X-Crashlytics-Device-Model", regex.c("", str2));
                    String INCREMENTAL = Build.VERSION.INCREMENTAL;
                    Intrinsics.e(INCREMENTAL, "INCREMENTAL");
                    Pair pair3 = new Pair("X-Crashlytics-OS-Build-Version", regex.c("", INCREMENTAL));
                    String RELEASE = Build.VERSION.RELEASE;
                    Intrinsics.e(RELEASE, "RELEASE");
                    Pair pair4 = new Pair("X-Crashlytics-OS-Display-Version", regex.c("", RELEASE));
                    remoteSettings.f21154c.getClass();
                    mapJ = MapsKt.j(pair, pair2, pair3, pair4, new Pair("X-Crashlytics-API-Client-Version", "3.0.3"));
                    Log.d("FirebaseSessions", "Fetching settings from server.");
                    crashlyticsSettingsFetcher = remoteSettings.d;
                    remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(remoteSettings, null);
                    remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(2, null);
                    remoteSettings$updateSettings$1.X = mutex2;
                    remoteSettings$updateSettings$1.f21156Y = null;
                    remoteSettings$updateSettings$1.f0 = 3;
                    if (crashlyticsSettingsFetcher.a(mapJ, remoteSettings$updateSettings$2$1, remoteSettings$updateSettings$2$2, remoteSettings$updateSettings$1) != coroutineSingletons) {
                        mutex3 = mutex2;
                    }
                    return coroutineSingletons;
                }
                if (r5 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex = (Mutex) remoteSettings$updateSettings$1.X;
                try {
                    ResultKt.b(objA);
                    mutex3 = mutex;
                } catch (Throwable th) {
                    th = th;
                    mutex.b(null);
                    throw th;
                }
            }
            mutex3.b(null);
            return unit;
            if (!remoteSettings.f21155e.c()) {
                Log.d("FirebaseSessions", "Remote settings cache not expired. Using cached values.");
                mutex2.b(null);
                return unit;
            }
            InstallationId.Companion companion = InstallationId.f21080c;
            FirebaseInstallationsApi firebaseInstallationsApi = remoteSettings.f21153b;
            remoteSettings$updateSettings$1.X = remoteSettings;
            remoteSettings$updateSettings$1.f21156Y = mutex2;
            remoteSettings$updateSettings$1.f0 = 2;
            objA = companion.a(firebaseInstallationsApi, remoteSettings$updateSettings$1);
            if (objA != coroutineSingletons) {
                str = ((InstallationId) objA).f21081a;
                if (str.equals("")) {
                    Log.w("FirebaseSessions", "Error getting Firebase Installation ID. Skipping this Session Event.");
                    mutex2.b(null);
                    return unit;
                }
                Pair pair5 = new Pair("X-Crashlytics-Installation-ID", str);
                String str3 = Build.MANUFACTURER + Build.MODEL;
                remoteSettings.getClass();
                Regex regex2 = f21151h;
                Pair pair6 = new Pair("X-Crashlytics-Device-Model", regex2.c("", str3));
                String INCREMENTAL2 = Build.VERSION.INCREMENTAL;
                Intrinsics.e(INCREMENTAL2, "INCREMENTAL");
                Pair pair7 = new Pair("X-Crashlytics-OS-Build-Version", regex2.c("", INCREMENTAL2));
                String RELEASE2 = Build.VERSION.RELEASE;
                Intrinsics.e(RELEASE2, "RELEASE");
                Pair pair8 = new Pair("X-Crashlytics-OS-Display-Version", regex2.c("", RELEASE2));
                remoteSettings.f21154c.getClass();
                mapJ = MapsKt.j(pair5, pair6, pair7, pair8, new Pair("X-Crashlytics-API-Client-Version", "3.0.3"));
                Log.d("FirebaseSessions", "Fetching settings from server.");
                crashlyticsSettingsFetcher = remoteSettings.d;
                remoteSettings$updateSettings$2$1 = new RemoteSettings$updateSettings$2$1(remoteSettings, null);
                remoteSettings$updateSettings$2$2 = new RemoteSettings$updateSettings$2$2(2, null);
                remoteSettings$updateSettings$1.X = mutex2;
                remoteSettings$updateSettings$1.f21156Y = null;
                remoteSettings$updateSettings$1.f0 = 3;
                if (crashlyticsSettingsFetcher.a(mapJ, remoteSettings$updateSettings$2$1, remoteSettings$updateSettings$2$2, remoteSettings$updateSettings$1) != coroutineSingletons) {
                    mutex3 = mutex2;
                    mutex3.b(null);
                    return unit;
                }
            }
            return coroutineSingletons;
        } catch (Throwable th2) {
            th = th2;
            mutex = r5;
        }
    }
}
