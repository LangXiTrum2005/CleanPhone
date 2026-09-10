package androidx.media3.exoplayer.analytics;

import A.W;
import android.app.Activity;
import android.util.Log;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.source.MediaLoadData;
import com.applovin.impl.AbstractActivityC0954p;
import com.applovin.impl.AbstractActivityC0956q;
import com.applovin.impl.C0950n;
import com.applovin.impl.j2;
import com.applovin.impl.l8;
import com.applovin.impl.r2;
import com.applovin.impl.s2;
import com.applovin.impl.s4;
import com.applovin.sdk.AppLovinPostbackListener;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import com.google.firebase.installations.InstallationTokenResult;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigClientException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigException;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import com.google.firebase.remoteconfig.internal.rollouts.RolloutsStateSubscriptionsHandler;
import com.google.firebase.remoteconfig.interop.rollouts.RolloutsStateSubscriber;
import com.startapp.sdk.ads.banner.BannerCreator;
import com.startapp.sdk.ads.banner.BannerRequest;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class o implements ListenerSet.Event, s4.b, s2.a, ConsentInformation.OnConsentInfoUpdateSuccessListener, UserMessagingPlatform.OnConsentFormLoadFailureListener, com.google.android.exoplayer2.util.ListenerSet.Event, Continuation, BannerRequest.Callback, SynchronizationGuard.CriticalSection, OnSuccessListener {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f6054Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ Object e0;

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, int i2) {
        this.X = i2;
        this.f6054Y = obj;
        this.Z = obj2;
        this.e0 = obj3;
    }

    @Override // com.applovin.impl.s2.a
    public void a(j2 j2Var, r2 r2Var) {
        switch (this.X) {
            case 2:
                ((AbstractActivityC0954p) this.f6054Y).a((com.applovin.impl.sdk.k) this.Z, (C0950n) this.e0, j2Var, r2Var);
                break;
            default:
                ((AbstractActivityC0956q) this.f6054Y).a((List) this.Z, (com.applovin.impl.sdk.k) this.e0, j2Var, r2Var);
                break;
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        DefaultScheduler defaultScheduler = (DefaultScheduler) this.f6054Y;
        EventStore eventStore = defaultScheduler.d;
        EventInternal eventInternal = (EventInternal) this.e0;
        TransportContext transportContext = (TransportContext) this.Z;
        eventStore.F0(transportContext, eventInternal);
        defaultScheduler.f16898a.a(transportContext, 1);
        return null;
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.X) {
            case 0:
                ((AnalyticsListener) obj).n((AnalyticsListener.EventTime) this.f6054Y, (MediaLoadData) this.Z, (IOException) this.e0);
                break;
            default:
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).g((com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) this.f6054Y, (com.google.android.exoplayer2.source.MediaLoadData) this.Z, (IOException) this.e0);
                break;
        }
    }

    @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
    public void onConsentFormLoadFailure(FormError formError) {
        ((com.applovin.impl.privacy.cmp.a) this.f6054Y).a((com.applovin.impl.privacy.cmp.a.InterfaceC0037a) this.Z, (FormError) this.e0, formError);
    }

    @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
    public void onConsentInfoUpdateSuccess() {
        ((com.applovin.impl.privacy.cmp.a) this.f6054Y).a((Activity) this.Z, (com.applovin.impl.privacy.cmp.a.InterfaceC0037a) this.e0);
    }

    @Override // com.startapp.sdk.ads.banner.BannerRequest.Callback
    public void onFinished(BannerCreator bannerCreator, String str) {
        ((BannerRequest) this.f6054Y).lambda$loadImpl$1((BannerRequest.Callback) this.Z, (String) this.e0, bannerCreator, str);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        Task task = (Task) this.Z;
        RolloutsStateSubscriber rolloutsStateSubscriber = (RolloutsStateSubscriber) this.e0;
        RolloutsStateSubscriptionsHandler rolloutsStateSubscriptionsHandler = (RolloutsStateSubscriptionsHandler) this.f6054Y;
        try {
            ConfigContainer configContainer = (ConfigContainer) task.getResult();
            if (configContainer != null) {
                rolloutsStateSubscriptionsHandler.f21001c.execute(new w.a(rolloutsStateSubscriber, rolloutsStateSubscriptionsHandler.f21000b.a(configContainer), 1));
            }
        } catch (FirebaseRemoteConfigException e2) {
            Log.w("FirebaseRemoteConfig", "Exception publishing RolloutsState to subscriber. Continuing to listen for changes.", e2);
        }
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        ConfigContainer configContainer;
        URL url = null;
        Object obj = this.e0;
        Object obj2 = this.Z;
        Object obj3 = this.f6054Y;
        switch (this.X) {
            case 7:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj3;
                if (task.isSuccessful()) {
                    taskCompletionSource.trySetResult(task.getResult());
                } else if (task.getException() != null) {
                    taskCompletionSource.trySetException(task.getException());
                } else if (((AtomicBoolean) obj2).getAndSet(true)) {
                    ((CancellationTokenSource) obj).cancel();
                }
                return Tasks.forResult(null);
            case 8:
                FirebaseRemoteConfig firebaseRemoteConfig = (FirebaseRemoteConfig) obj3;
                firebaseRemoteConfig.getClass();
                Task task2 = (Task) obj2;
                if (!task2.isSuccessful() || task2.getResult() == null) {
                    return Tasks.forResult(Boolean.FALSE);
                }
                ConfigContainer configContainer2 = (ConfigContainer) task2.getResult();
                Task task3 = (Task) obj;
                if (task3.isSuccessful() && (configContainer = (ConfigContainer) task3.getResult()) != null && configContainer2.f20942c.equals(configContainer.f20942c)) {
                    return Tasks.forResult(Boolean.FALSE);
                }
                ConfigCacheClient configCacheClient = firebaseRemoteConfig.f20914e;
                configCacheClient.getClass();
                W w2 = new W(3, configCacheClient, configContainer2);
                Executor executor = configCacheClient.f20936a;
                return Tasks.call(executor, w2).onSuccessTask(executor, new d(26, configCacheClient, configContainer2)).continueWith(firebaseRemoteConfig.f20913c, new com.google.firebase.remoteconfig.a(firebaseRemoteConfig));
            default:
                int[] iArr = ConfigRealtimeHttpClient.s;
                ConfigRealtimeHttpClient configRealtimeHttpClient = (ConfigRealtimeHttpClient) obj3;
                configRealtimeHttpClient.getClass();
                Task task4 = (Task) obj2;
                if (!task4.isSuccessful()) {
                    return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation auth token for config update listener connection.", task4.getException()));
                }
                Task task5 = (Task) obj;
                try {
                    if (!task5.isSuccessful()) {
                        return Tasks.forException(new FirebaseRemoteConfigClientException("Firebase Installations failed to get installation ID for config update listener connection.", task5.getException()));
                    }
                    try {
                        url = new URL(configRealtimeHttpClient.c(configRealtimeHttpClient.f20977n));
                    } catch (MalformedURLException unused) {
                        Log.e("FirebaseRemoteConfig", "URL is malformed");
                    }
                    HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                    configRealtimeHttpClient.i(httpURLConnection, (String) task5.getResult(), ((InstallationTokenResult) task4.getResult()).a());
                    return Tasks.forResult(httpURLConnection);
                } catch (IOException e2) {
                    return Tasks.forException(new FirebaseRemoteConfigClientException("Failed to open HTTP stream connection", e2));
                }
        }
    }

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, IOException iOException, boolean z2, int i2) {
        this.X = i2;
        this.f6054Y = obj;
        this.Z = obj3;
        this.e0 = iOException;
    }

    @Override // com.applovin.impl.s4.b
    public void a(boolean z2, Object obj, Object obj2) {
        ((l8) this.f6054Y).a((AppLovinPostbackListener) this.Z, (String) this.e0, z2, (String) obj, (String) obj2);
    }
}
