package A;

import android.util.Log;
import android.view.Display;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityViewCommand;
import androidx.media3.extractor.BinarySearchSeeker;
import androidx.media3.extractor.FlacStreamMetadata;
import androidx.media3.extractor.mp4.FragmentedMp4Extractor;
import androidx.media3.extractor.mp4.Track;
import com.applovin.impl.h5;
import com.applovin.shadow.okhttp3.Call;
import com.applovin.shadow.okhttp3.EventListener;
import com.applovin.shadow.okhttp3.internal.Util;
import com.charging.screenshow.battery.animations.themes.activity.MainAct;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer;
import com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.exoplayer2.video.VideoFrameReleaseHelper;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDragHandleView;
import com.google.android.play.core.review.ReviewInfo;
import com.google.common.base.Function;
import com.google.common.graph.EndpointPair;
import com.google.common.graph.Network;
import com.google.common.graph.ValueGraph;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentFactory;
import com.google.firebase.components.Qualified;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponent;
import com.google.firebase.crashlytics.internal.CrashlyticsNativeComponentDeferredProxy;
import com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import com.google.firebase.remoteconfig.internal.ConfigFetchHandler;
import com.google.firebase.remoteconfig.interop.FirebaseRemoteConfigInterop;
import com.google.firebase.sessions.EventGDTLogger;
import com.google.firebase.sessions.EventType;
import com.google.firebase.sessions.SessionEvent;
import com.google.firebase.sessions.SessionEvents;
import com.inmobi.media.AbstractC3026g1;
import com.inmobi.media.C3010f1;
import com.startapp.sdk.ads.video.vast.VASTErrorCodes;
import com.startapp.sdk.internal.cj;
import com.startapp.sdk.internal.da;
import com.startapp.sdk.internal.i7;
import com.startapp.sdk.internal.k8;
import com.startapp.sdk.internal.p7;
import com.startapp.sdk.internal.t1;
import com.startapp.sdk.internal.u1;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: renamed from: A.a0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C0880a0 implements OnSuccessListener, BinarySearchSeeker.SeekTimestampConverter, Function, EventListener.Factory, androidx.arch.core.util.Function, com.applovin.impl.sdk.c.b, OnCompleteListener, SynchronizationGuard.CriticalSection, com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter, VideoFrameReleaseHelper.DisplayHelper.Listener, AccessibilityViewCommand, ComponentFactory, Deferred.DeferredHandler, Continuation, SuccessContinuation, Transformer, i7, cj, OnUserEarnedRewardListener {
    public final /* synthetic */ int X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final /* synthetic */ Object f3165Y;

    public /* synthetic */ C0880a0(Object obj, int i2) {
        this.X = i2;
        this.f3165Y = obj;
    }

    @Override // com.startapp.sdk.internal.i7
    public Object a(Object obj) {
        switch (this.X) {
            case 25:
                return da.a((da) this.f3165Y, (Throwable) obj);
            case 28:
                return ((t1) this.f3165Y).a((Throwable) obj);
            default:
                return ((u1) this.f3165Y).a((Throwable) obj);
        }
    }

    @Override // com.google.common.base.Function, androidx.arch.core.util.Function, com.google.android.datatransport.Transformer
    public Object apply(Object obj) {
        Object obj2 = this.f3165Y;
        switch (this.X) {
            case 2:
                Track track = (Track) obj;
                ((FragmentedMp4Extractor) obj2).getClass();
                return track;
            case 4:
                return com.applovin.impl.sdk.ad.b.a((androidx.arch.core.util.Function) ((com.applovin.impl.sdk.ad.e) obj2), (h5) obj);
            case 12:
                com.google.android.exoplayer2.extractor.mp4.Track track2 = (com.google.android.exoplayer2.extractor.mp4.Track) obj;
                ((com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor) obj2).getClass();
                return track2;
            case 15:
                return ((Network) obj2).j(obj);
            case 16:
                EndpointPair endpointPair = (EndpointPair) obj;
                Object objH = ((ValueGraph) obj2).h(endpointPair.X, endpointPair.f19997Y);
                Objects.requireNonNull(objH);
                return objH;
            default:
                SessionEvent sessionEvent = (SessionEvent) obj;
                ((EventGDTLogger) obj2).getClass();
                String strB = SessionEvents.f21102b.b(sessionEvent);
                Intrinsics.e(strB, "encode(...)");
                sessionEvent.getClass();
                EventType eventType = EventType.SESSION_START;
                Log.d("FirebaseSessions", "Session Event Type: SESSION_START");
                byte[] bytes = strB.getBytes(Charsets.f44691a);
                Intrinsics.e(bytes, "getBytes(...)");
                return bytes;
        }
    }

    @Override // com.google.firebase.components.ComponentFactory
    public Object b(ComponentContainer componentContainer) {
        switch (this.X) {
            case 17:
                return this.f3165Y;
            default:
                return RemoteConfigRegistrar.lambda$getComponents$0((Qualified) this.f3165Y, componentContainer);
        }
    }

    @Override // com.google.firebase.inject.Deferred.DeferredHandler
    public void c(Provider provider) {
        switch (this.X) {
            case 18:
                CrashlyticsNativeComponentDeferredProxy crashlyticsNativeComponentDeferredProxy = (CrashlyticsNativeComponentDeferredProxy) this.f3165Y;
                crashlyticsNativeComponentDeferredProxy.getClass();
                Logger.f20289a.b("Crashlytics native component now available.", null);
                crashlyticsNativeComponentDeferredProxy.f20283b.set((CrashlyticsNativeComponent) provider.get());
                break;
            default:
                ((FirebaseRemoteConfigInterop) provider.get()).a((CrashlyticsRemoteConfigListener) this.f3165Y);
                Logger.f20289a.b("Registering RemoteConfig Rollouts subscriber", null);
                break;
        }
    }

    @Override // com.applovin.shadow.okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        return Util.asFactory$lambda$8((EventListener) this.f3165Y, call);
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public boolean d(View view) {
        int i2 = BottomSheetDragHandleView.i0;
        BottomSheetDragHandleView bottomSheetDragHandleView = (BottomSheetDragHandleView) this.f3165Y;
        if (!bottomSheetDragHandleView.g0) {
            return false;
        }
        BottomSheetBehavior bottomSheetBehavior = bottomSheetDragHandleView.e0;
        boolean z2 = bottomSheetBehavior.f19126Y;
        int i3 = bottomSheetBehavior.M0;
        int i4 = 6;
        int i5 = 3;
        if (i3 == 4) {
            if (z2) {
                i4 = i5;
            }
        } else if (i3 != 3) {
            if (!bottomSheetDragHandleView.h0) {
                i5 = 4;
            }
            i4 = i5;
        } else if (z2) {
            i4 = 4;
        }
        bottomSheetBehavior.c(i4);
        return true;
    }

    public void e(Display display) {
        VideoFrameReleaseHelper videoFrameReleaseHelper = (VideoFrameReleaseHelper) this.f3165Y;
        videoFrameReleaseHelper.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / ((double) display.getRefreshRate()));
            videoFrameReleaseHelper.k = refreshRate;
            videoFrameReleaseHelper.f19019l = (refreshRate * 80) / 100;
        } else {
            com.google.android.exoplayer2.util.Log.g("VideoFrameReleaseHelper", "Unable to query display refresh rate");
            videoFrameReleaseHelper.k = -9223372036854775807L;
            videoFrameReleaseHelper.f19019l = -9223372036854775807L;
        }
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public Object execute() {
        switch (this.X) {
            case 7:
                return ((ClientHealthMetricsStore) this.f3165Y).h();
            case 8:
                return Integer.valueOf(((EventStore) this.f3165Y).y());
            case 9:
                ((Uploader) this.f3165Y).f16929i.d();
                return null;
            default:
                WorkInitializer workInitializer = (WorkInitializer) this.f3165Y;
                Iterator it = workInitializer.f16935b.F().iterator();
                while (it.hasNext()) {
                    workInitializer.f16936c.a((TransportContext) it.next(), 1);
                }
                return null;
        }
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public void onComplete(Task task) {
        boolean z2 = MainAct.q0;
        Intrinsics.f(task, "task");
        if (task.isSuccessful()) {
            ((MainAct) this.f3165Y).n0 = (ReviewInfo) task.getResult();
        }
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public void onSuccess(Object obj) {
        AbstractC3026g1.a((C3010f1) this.f3165Y, obj);
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public void onUserEarnedReward(RewardItem rewardItem) {
        p7.a((p7) this.f3165Y, rewardItem);
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(Task task) {
        switch (this.X) {
            case 20:
                return (Task) ((Callable) this.f3165Y).call();
            default:
                ((Runnable) this.f3165Y).run();
                return Tasks.forResult(null);
        }
    }

    @Override // com.applovin.impl.sdk.c.b
    public void a(com.applovin.impl.sdk.c.a aVar) {
        ((com.applovin.impl.sdk.d) this.f3165Y).c(aVar);
    }

    @Override // com.startapp.sdk.internal.cj
    public void a(List list, VASTErrorCodes vASTErrorCodes) {
        k8.a((k8) this.f3165Y, list, vASTErrorCodes);
    }

    @Override // androidx.media3.extractor.BinarySearchSeeker.SeekTimestampConverter, com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter
    public long a(long j) {
        switch (this.X) {
            case 1:
                FlacStreamMetadata flacStreamMetadata = (FlacStreamMetadata) this.f3165Y;
                return androidx.media3.common.util.Util.k((j * ((long) flacStreamMetadata.f6764e)) / 1000000, 0L, flacStreamMetadata.j - 1);
            default:
                com.google.android.exoplayer2.extractor.FlacStreamMetadata flacStreamMetadata2 = (com.google.android.exoplayer2.extractor.FlacStreamMetadata) this.f3165Y;
                return com.google.android.exoplayer2.util.Util.k((j * ((long) flacStreamMetadata2.f17540e)) / 1000000, 0L, flacStreamMetadata2.j - 1);
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        int[] iArr = ConfigFetchHandler.k;
        return Tasks.forResult((ConfigFetchHandler.FetchResponse) this.f3165Y);
    }
}
