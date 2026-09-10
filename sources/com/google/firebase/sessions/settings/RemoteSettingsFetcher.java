package com.google.firebase.sessions.settings;

import android.net.Uri;
import com.google.firebase.sessions.AndroidApplicationInfo;
import com.google.firebase.sessions.ApplicationInfo;
import com.unity3d.services.core.network.model.HttpRequest;
import java.net.URL;
import java.util.Map;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;

/* JADX INFO: loaded from: classes4.dex */
@Singleton
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettingsFetcher;", "Lcom/google/firebase/sessions/settings/CrashlyticsSettingsFetcher;", "Companion", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RemoteSettingsFetcher implements CrashlyticsSettingsFetcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ApplicationInfo f21158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineContext f21159b;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/google/firebase/sessions/settings/RemoteSettingsFetcher$Companion;", "", "", "FIREBASE_SESSIONS_BASE_URL_STRING", "Ljava/lang/String;", "FIREBASE_PLATFORM", "com.google.firebase-firebase-sessions"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
    }

    public RemoteSettingsFetcher(ApplicationInfo appInfo, CoroutineContext blockingDispatcher) {
        Intrinsics.f(appInfo, "appInfo");
        Intrinsics.f(blockingDispatcher, "blockingDispatcher");
        this.f21158a = appInfo;
        this.f21159b = blockingDispatcher;
    }

    public static final URL b(RemoteSettingsFetcher remoteSettingsFetcher) {
        remoteSettingsFetcher.getClass();
        Uri.Builder builderAppendPath = new Uri.Builder().scheme(HttpRequest.DEFAULT_SCHEME).authority("firebase-settings.crashlytics.com").appendPath("spi").appendPath("v2").appendPath("platforms").appendPath("android").appendPath("gmp");
        ApplicationInfo applicationInfo = remoteSettingsFetcher.f21158a;
        Uri.Builder builderAppendPath2 = builderAppendPath.appendPath(applicationInfo.f21019a).appendPath("settings");
        AndroidApplicationInfo androidApplicationInfo = applicationInfo.f21020b;
        return new URL(builderAppendPath2.appendQueryParameter("build_version", androidApplicationInfo.f21017c).appendQueryParameter("display_version", androidApplicationInfo.f21016b).build().toString());
    }

    @Override // com.google.firebase.sessions.settings.CrashlyticsSettingsFetcher
    public final Object a(Map map, Function2 function2, Function2 function3, Continuation continuation) throws Throwable {
        Object objF = BuildersKt.f(this.f21159b, new RemoteSettingsFetcher$doConfigFetch$2(this, map, function2, function3, null), continuation);
        return objF == CoroutineSingletons.X ? objF : Unit.f43263a;
    }
}
