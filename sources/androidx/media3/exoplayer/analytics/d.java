package androidx.media3.exoplayer.analytics;

import android.util.Log;
import android.view.MotionEvent;
import androidx.arch.core.util.Function;
import androidx.core.os.CancellationSignal;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.transition.Transition;
import com.applovin.impl.h5;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapters.GoogleMediationAdapter;
import com.applovin.mediation.adapters.UnityAdsMediationAdapter;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigFetchThrottledException;
import com.google.firebase.remoteconfig.FirebaseRemoteConfigServerException;
import com.google.firebase.remoteconfig.internal.ConfigAutoFetch;
import com.google.firebase.remoteconfig.internal.ConfigCacheClient;
import com.google.firebase.remoteconfig.internal.ConfigContainer;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient;
import com.google.firebase.remoteconfig.internal.ConfigSharedPrefsClient;
import com.unity3d.ads.IUnityAdsTokenListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements ListenerSet.Event, ListenerSet.IterationFinishedEvent, CancellationSignal.OnCancelListener, Function, OnUserEarnedRewardListener, IUnityAdsTokenListener, SynchronizationGuard.CriticalSection, com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent, com.google.android.exoplayer2.util.ListenerSet.Event, SuccessContinuation, Continuation {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f6043Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ d(int i2, Object obj, Object obj2) {
        this.X = i2;
        this.f6043Y = obj;
        this.Z = obj2;
    }

    @Override // androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        return ((com.applovin.impl.sdk.ad.b) this.f6043Y).a((MotionEvent) this.Z, (h5) obj);
    }

    @Override // androidx.media3.common.util.ListenerSet.IterationFinishedEvent
    public void c(Object obj, FlagSet flagSet) {
        ((AnalyticsListener) obj).N((Player) this.Z, new AnalyticsListener.Events(flagSet, ((DefaultAnalyticsCollector) this.f6043Y).f0));
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        switch (this.X) {
            case 14:
                ((Uploader) this.f6043Y).f16926c.z((Iterable) this.Z);
                break;
            default:
                Uploader uploader = (Uploader) this.f6043Y;
                uploader.getClass();
                for (Map.Entry entry : ((HashMap) this.Z).entrySet()) {
                    uploader.f16929i.i(((Integer) entry.getValue()).intValue(), LogEventDropped.Reason.INVALID_PAYLOD, (String) entry.getKey());
                }
                break;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.util.ListenerSet.IterationFinishedEvent
    public void f(Object obj, com.google.android.exoplayer2.util.FlagSet flagSet) {
        ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).j((com.google.android.exoplayer2.Player) this.Z, new com.google.android.exoplayer2.analytics.AnalyticsListener.Events(flagSet, ((com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector) this.f6043Y).f0));
    }

    @Override // androidx.media3.common.util.ListenerSet.Event
    public void invoke(Object obj) {
        switch (this.X) {
            case 0:
                ((AnalyticsListener) obj).p((AnalyticsListener.EventTime) this.f6043Y, (Exception) this.Z);
                break;
            case 1:
                ((AnalyticsListener) obj).z((AnalyticsListener.EventTime) this.f6043Y, (PlaybackParameters) this.Z);
                break;
            case 2:
                ((AnalyticsListener) obj).J((AnalyticsListener.EventTime) this.f6043Y, (Tracks) this.Z);
                break;
            case 3:
                ((AnalyticsListener) obj).M((AnalyticsListener.EventTime) this.f6043Y, (MediaLoadData) this.Z);
                break;
            case 4:
                ((AnalyticsListener) obj).j((AnalyticsListener.EventTime) this.f6043Y, (DecoderCounters) this.Z);
                break;
            case 5:
                ((AnalyticsListener) obj).e((AnalyticsListener.EventTime) this.f6043Y, (Metadata) this.Z);
                break;
            case 6:
                ((AnalyticsListener) obj).g((AnalyticsListener.EventTime) this.f6043Y, (PlaybackException) this.Z);
                break;
            case 7:
                AnalyticsListener.EventTime eventTime = (AnalyticsListener.EventTime) this.f6043Y;
                VideoSize videoSize = (VideoSize) this.Z;
                ((AnalyticsListener) obj).L(eventTime, videoSize);
                int i2 = videoSize.f5553a;
                break;
            case 8:
                ((AnalyticsListener) obj).b((AnalyticsListener.EventTime) this.f6043Y, this.Z);
                break;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            default:
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).h((com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) this.f6043Y, (com.google.android.exoplayer2.metadata.Metadata) this.Z);
                break;
            case 17:
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).H((com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) this.f6043Y, (com.google.android.exoplayer2.source.MediaLoadData) this.Z);
                break;
            case 18:
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).d((com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) this.f6043Y, (Exception) this.Z);
                break;
            case 19:
                com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime eventTime2 = (com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) this.f6043Y;
                com.google.android.exoplayer2.video.VideoSize videoSize2 = (com.google.android.exoplayer2.video.VideoSize) this.Z;
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).B(eventTime2, videoSize2);
                int i3 = videoSize2.X;
                break;
            case 20:
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).s((com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) this.f6043Y, (com.google.android.exoplayer2.decoder.DecoderCounters) this.Z);
                break;
            case 21:
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).E((com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) this.f6043Y, this.Z);
                break;
            case 22:
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).x((com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) this.f6043Y, (com.google.android.exoplayer2.PlaybackParameters) this.Z);
                break;
            case 23:
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).v((com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) this.f6043Y, (com.google.android.exoplayer2.PlaybackException) this.Z);
                break;
            case 24:
                ((com.google.android.exoplayer2.analytics.AnalyticsListener) obj).r((com.google.android.exoplayer2.analytics.AnalyticsListener.EventTime) this.f6043Y, (com.google.android.exoplayer2.Tracks) this.Z);
                break;
        }
    }

    @Override // androidx.core.os.CancellationSignal.OnCancelListener
    public void onCancel() {
        ((Transition) this.f6043Y).cancel();
        ((androidx.fragment.app.e) this.Z).run();
    }

    @Override // com.unity3d.ads.IUnityAdsTokenListener
    public void onUnityAdsTokenReady(String str) {
        ((UnityAdsMediationAdapter) this.f6043Y).lambda$collectSignal$0((MaxSignalCollectionListener) this.Z, str);
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public void onUserEarnedReward(RewardItem rewardItem) {
        ((GoogleMediationAdapter) this.f6043Y).lambda$showRewardedAd$1((String) this.Z, rewardItem);
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        ConfigCacheClient configCacheClient = (ConfigCacheClient) this.f6043Y;
        ConfigContainer configContainer = (ConfigContainer) this.Z;
        HashMap map = ConfigCacheClient.d;
        synchronized (configCacheClient) {
            configCacheClient.f20938c = Tasks.forResult(configContainer);
        }
        return Tasks.forResult(configContainer);
    }

    public /* synthetic */ d(Object obj, Object obj2, long j, int i2) {
        this.X = i2;
        this.f6043Y = obj;
        this.Z = obj2;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0149 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x0156  */
    /* JADX WARN: Code duplicated, block: B:110:0x0159  */
    /* JADX WARN: Code duplicated, block: B:112:0x0167  */
    /* JADX WARN: Code duplicated, block: B:118:0x0192  */
    /* JADX WARN: Code duplicated, block: B:165:0x00d1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0142 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:170:0x00e3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00d0 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #10 {all -> 0x0055, blocks: (B:11:0x003e, B:13:0x0041, B:14:0x0042, B:22:0x005e, B:62:0x00cc, B:64:0x00d0, B:66:0x00d3, B:70:0x00d7, B:71:0x00d8, B:65:0x00d1), top: B:167:0x001a, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d8 A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #10 {all -> 0x0055, blocks: (B:11:0x003e, B:13:0x0041, B:14:0x0042, B:22:0x005e, B:62:0x00cc, B:64:0x00d0, B:66:0x00d3, B:70:0x00d7, B:71:0x00d8, B:65:0x00d1), top: B:167:0x001a, inners: #9 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.lang.Integer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r15v40, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v6, types: [com.google.android.gms.tasks.Task] */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r15v9 */
    /* JADX WARN: Type inference failed for: r2v8, types: [com.google.firebase.remoteconfig.internal.ConfigRealtimeHttpClient] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v3 */
    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) throws Throwable {
        InputStream errorStream;
        ?? r11;
        ?? ValueOf;
        FirebaseRemoteConfigServerException firebaseRemoteConfigServerException;
        boolean z2 = true;
        switch (this.X) {
            case 27:
                int[] iArr = ConfigFetchHandler.k;
                return ((ConfigFetchHandler) this.f6043Y).b(task, 0L, (HashMap) this.Z);
            case 28:
                ConfigFetchHandler configFetchHandler = (ConfigFetchHandler) this.f6043Y;
                Date date = (Date) this.Z;
                int[] iArr2 = ConfigFetchHandler.k;
                configFetchHandler.getClass();
                if (task.isSuccessful()) {
                    ConfigSharedPrefsClient configSharedPrefsClient = configFetchHandler.f20952h;
                    synchronized (configSharedPrefsClient.f20982b) {
                        configSharedPrefsClient.f20981a.edit().putInt("last_fetch_status", -1).putLong("last_fetch_time_in_millis", date.getTime()).apply();
                        break;
                    }
                } else {
                    Exception exception = task.getException();
                    if (exception != null) {
                        if (exception instanceof FirebaseRemoteConfigFetchThrottledException) {
                            ConfigSharedPrefsClient configSharedPrefsClient2 = configFetchHandler.f20952h;
                            synchronized (configSharedPrefsClient2.f20982b) {
                                configSharedPrefsClient2.f20981a.edit().putInt("last_fetch_status", 2).apply();
                            }
                        } else {
                            ConfigSharedPrefsClient configSharedPrefsClient3 = configFetchHandler.f20952h;
                            synchronized (configSharedPrefsClient3.f20982b) {
                                configSharedPrefsClient3.f20981a.edit().putInt("last_fetch_status", 1).apply();
                            }
                        }
                    }
                    break;
                }
                return task;
            default:
                ?? inputStream = (Task) this.Z;
                ?? r2 = (ConfigRealtimeHttpClient) this.f6043Y;
                Clock clock = r2.f20978p;
                ?? r8 = 0;
                try {
                    try {
                        if (inputStream.isSuccessful()) {
                            HttpURLConnection httpURLConnection = (HttpURLConnection) inputStream.getResult();
                            r2.f = httpURLConnection;
                            inputStream = httpURLConnection.getInputStream();
                            try {
                                errorStream = r2.f.getErrorStream();
                                try {
                                    int responseCode = r2.f.getResponseCode();
                                    ValueOf = Integer.valueOf(responseCode);
                                    if (responseCode == 200) {
                                        try {
                                            synchronized (r2) {
                                                r2.f20972c = 8;
                                            }
                                            r2.q.e(0, ConfigSharedPrefsClient.f);
                                            ConfigAutoFetch configAutoFetchJ = r2.j(r2.f);
                                            r2.g = configAutoFetchJ;
                                            configAutoFetchJ.c();
                                        } catch (IOException e2) {
                                            e = e2;
                                            if (r2.f20973e) {
                                                synchronized (r2) {
                                                    r2.f20972c = 8;
                                                }
                                            } else {
                                                Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                                            }
                                            r2.b(inputStream, errorStream);
                                            synchronized (r2) {
                                                r2.f20971b = false;
                                            }
                                            if (r2.f20973e || (ValueOf != 0 && !ConfigRealtimeHttpClient.d(ValueOf.intValue()))) {
                                                z2 = false;
                                            }
                                            if (z2) {
                                                r2.k(new Date(clock.currentTimeMillis()));
                                            }
                                            if (!z2 || ValueOf.intValue() == 200) {
                                                r2.h();
                                            } else {
                                                String strF = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", ValueOf);
                                                if (ValueOf.intValue() == 403) {
                                                    strF = ConfigRealtimeHttpClient.f(r2.f.getErrorStream());
                                                }
                                                firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(ValueOf.intValue(), strF, 0);
                                            }
                                            r2.f = null;
                                            r2.g = null;
                                            return Tasks.forResult(null);
                                        }
                                    }
                                    r2.b(inputStream, errorStream);
                                    synchronized (r2) {
                                        r2.f20971b = false;
                                    }
                                    z2 = !r2.f20973e && ConfigRealtimeHttpClient.d(responseCode);
                                    if (z2) {
                                        r2.k(new Date(clock.currentTimeMillis()));
                                    }
                                    if (!z2 && responseCode != 200) {
                                        String strF2 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", ValueOf);
                                        if (responseCode == 403) {
                                            strF2 = ConfigRealtimeHttpClient.f(r2.f.getErrorStream());
                                        }
                                        firebaseRemoteConfigServerException = new FirebaseRemoteConfigServerException(responseCode, strF2, 0);
                                        r2.g(firebaseRemoteConfigServerException);
                                    } else {
                                        r2.h();
                                    }
                                } catch (IOException e3) {
                                    e = e3;
                                    ValueOf = 0;
                                } catch (Throwable th) {
                                    th = th;
                                    ValueOf = 0;
                                    r8 = inputStream;
                                    r11 = ValueOf;
                                    r2.b(r8, errorStream);
                                    synchronized (r2) {
                                        r2.f20971b = false;
                                        if (r2.f20973e) {
                                            z2 = false;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            r2.k(new Date(clock.currentTimeMillis()));
                                        }
                                        if (z2) {
                                            r2.h();
                                        } else {
                                            r2.h();
                                        }
                                        throw th;
                                    }
                                }
                            } catch (IOException e4) {
                                e = e4;
                                errorStream = null;
                                inputStream = inputStream;
                                ValueOf = errorStream;
                                if (r2.f20973e) {
                                    synchronized (r2) {
                                        r2.f20972c = 8;
                                    }
                                } else {
                                    Log.d("FirebaseRemoteConfig", "Exception connecting to real-time RC backend. Retrying the connection...", e);
                                }
                                r2.b(inputStream, errorStream);
                                synchronized (r2) {
                                    r2.f20971b = false;
                                    if (r2.f20973e) {
                                        z2 = false;
                                    } else {
                                        z2 = false;
                                    }
                                    if (z2) {
                                        r2.k(new Date(clock.currentTimeMillis()));
                                    }
                                    if (!z2) {
                                    }
                                    r2.h();
                                    r2.f = null;
                                    r2.g = null;
                                    return Tasks.forResult(null);
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                errorStream = null;
                                ValueOf = 0;
                            }
                            r2.f = null;
                            r2.g = null;
                            return Tasks.forResult(null);
                        }
                        throw new IOException(inputStream.getException());
                    } catch (IOException e5) {
                        e = e5;
                        inputStream = 0;
                        errorStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        errorStream = null;
                        r11 = 0;
                        r2.b(r8, errorStream);
                        synchronized (r2) {
                            r2.f20971b = false;
                            if (r2.f20973e) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                r2.k(new Date(clock.currentTimeMillis()));
                            }
                            if (z2) {
                                r2.h();
                            } else {
                                r2.h();
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    r8 = inputStream;
                    r11 = ValueOf;
                    r2.b(r8, errorStream);
                    synchronized (r2) {
                        r2.f20971b = false;
                        if (r2.f20973e || (r11 != 0 && !ConfigRealtimeHttpClient.d(r11.intValue()))) {
                            z2 = false;
                        }
                        if (z2) {
                            r2.k(new Date(clock.currentTimeMillis()));
                        }
                        if (z2 && r11.intValue() != 200) {
                            String strF3 = String.format("Unable to connect to the server. Try again in a few minutes. HTTP status code: %d", r11);
                            if (r11.intValue() == 403) {
                                strF3 = ConfigRealtimeHttpClient.f(r2.f.getErrorStream());
                            }
                            r2.g(new FirebaseRemoteConfigServerException(r11.intValue(), strF3, 0));
                        } else {
                            r2.h();
                        }
                        throw th;
                    }
                }
                break;
        }
    }
}
