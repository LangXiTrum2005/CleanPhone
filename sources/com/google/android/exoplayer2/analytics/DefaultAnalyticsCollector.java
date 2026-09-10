package com.google.android.exoplayer2.analytics;

import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.exoplayer.analytics.h;
import androidx.media3.exoplayer.analytics.i;
import androidx.media3.exoplayer.analytics.j;
import androidx.media3.exoplayer.analytics.k;
import androidx.media3.exoplayer.analytics.l;
import androidx.media3.exoplayer.analytics.m;
import androidx.media3.exoplayer.analytics.o;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.source.LoadEventInfo;
import com.google.android.exoplayer2.source.MediaLoadData;
import com.google.android.exoplayer2.source.MediaPeriodId;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Clock;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.p004ironsource.f9;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class DefaultAnalyticsCollector implements AnalyticsCollector {
    public final Clock X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Timeline.Period f17221Y;
    public final Timeline.Window Z;
    public final MediaPeriodQueueTracker e0;
    public final SparseArray f0;
    public ListenerSet g0;
    public Player h0;
    public HandlerWrapper i0;

    public static final class MediaPeriodQueueTracker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Timeline.Period f17222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImmutableList f17223b = ImmutableList.x();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ImmutableMap f17224c = ImmutableMap.o();
        public MediaSource.MediaPeriodId d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public MediaSource.MediaPeriodId f17225e;
        public MediaSource.MediaPeriodId f;

        public MediaPeriodQueueTracker(Timeline.Period period) {
            this.f17222a = period;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static MediaSource.MediaPeriodId b(Player player, ImmutableList immutableList, MediaSource.MediaPeriodId mediaPeriodId, Timeline.Period period) {
            Timeline currentTimeline = player.getCurrentTimeline();
            int currentPeriodIndex = player.getCurrentPeriodIndex();
            Object objL = currentTimeline.p() ? null : currentTimeline.l(currentPeriodIndex);
            int iB = (player.isPlayingAd() || currentTimeline.p()) ? -1 : currentTimeline.f(currentPeriodIndex, period, false).b(Util.B(player.getCurrentPosition()) - period.f0);
            for (int i2 = 0; i2 < immutableList.size(); i2++) {
                MediaSource.MediaPeriodId mediaPeriodId2 = (MediaSource.MediaPeriodId) immutableList.get(i2);
                if (c(mediaPeriodId2, objL, player.isPlayingAd(), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), iB)) {
                    return mediaPeriodId2;
                }
            }
            if (immutableList.isEmpty() && mediaPeriodId != null && c(mediaPeriodId, objL, player.isPlayingAd(), player.getCurrentAdGroupIndex(), player.getCurrentAdIndexInAdGroup(), iB)) {
                return mediaPeriodId;
            }
            return null;
        }

        public static boolean c(MediaSource.MediaPeriodId mediaPeriodId, Object obj, boolean z2, int i2, int i3, int i4) {
            if (!mediaPeriodId.f18347a.equals(obj)) {
                return false;
            }
            int i5 = mediaPeriodId.f18348b;
            if (z2 && i5 == i2 && mediaPeriodId.f18349c == i3) {
                return true;
            }
            return !z2 && i5 == -1 && mediaPeriodId.f18350e == i4;
        }

        public final void a(ImmutableMap.Builder builder, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            if (mediaPeriodId == null) {
                return;
            }
            if (timeline.b(mediaPeriodId.f18347a) != -1) {
                builder.c(mediaPeriodId, timeline);
                return;
            }
            Timeline timeline2 = (Timeline) this.f17224c.get(mediaPeriodId);
            if (timeline2 != null) {
                builder.c(mediaPeriodId, timeline2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void d(Timeline timeline) {
            ImmutableMap.Builder builderD = ImmutableMap.d();
            if (this.f17223b.isEmpty()) {
                a(builderD, this.f17225e, timeline);
                if (!Objects.a(this.f, this.f17225e)) {
                    a(builderD, this.f, timeline);
                }
                if (!Objects.a(this.d, this.f17225e) && !Objects.a(this.d, this.f)) {
                    a(builderD, this.d, timeline);
                }
            } else {
                for (int i2 = 0; i2 < this.f17223b.size(); i2++) {
                    a(builderD, (MediaSource.MediaPeriodId) this.f17223b.get(i2), timeline);
                }
                if (!this.f17223b.contains(this.d)) {
                    a(builderD, this.d, timeline);
                }
            }
            this.f17224c = builderD.a(true);
        }
    }

    public DefaultAnalyticsCollector(Clock clock) {
        clock.getClass();
        this.X = clock;
        int i2 = Util.f18979a;
        Looper looperMyLooper = Looper.myLooper();
        this.g0 = new ListenerSet(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, clock, new f(6));
        Timeline.Period period = new Timeline.Period();
        this.f17221Y = period;
        this.Z = new Timeline.Window();
        this.e0 = new MediaPeriodQueueTracker(period);
        this.f0 = new SparseArray();
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void D(MediaMetricsListener mediaMetricsListener) {
        this.g0.a(mediaMetricsListener);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void E(int i2, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
        AnalyticsListener.EventTime eventTimeU = u(i2, mediaPeriodId);
        x(eventTimeU, 1024, new androidx.media3.exoplayer.analytics.d(18, eventTimeU, exc));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void G(List list, MediaSource.MediaPeriodId mediaPeriodId) {
        Player player = this.h0;
        player.getClass();
        MediaPeriodQueueTracker mediaPeriodQueueTracker = this.e0;
        mediaPeriodQueueTracker.getClass();
        mediaPeriodQueueTracker.f17223b = ImmutableList.u(list);
        if (!list.isEmpty()) {
            mediaPeriodQueueTracker.f17225e = (MediaSource.MediaPeriodId) list.get(0);
            mediaPeriodId.getClass();
            mediaPeriodQueueTracker.f = mediaPeriodId;
        }
        if (mediaPeriodQueueTracker.d == null) {
            mediaPeriodQueueTracker.d = MediaPeriodQueueTracker.b(player, mediaPeriodQueueTracker.f17223b, mediaPeriodQueueTracker.f17225e, mediaPeriodQueueTracker.f17222a);
        }
        mediaPeriodQueueTracker.d(player.getCurrentTimeline());
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void K(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime eventTimeU = u(i2, mediaPeriodId);
        x(eventTimeU, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, new c(eventTimeU, 4));
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void L(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeU = u(i2, mediaPeriodId);
        x(eventTimeU, 1001, new f(eventTimeU, loadEventInfo, mediaLoadData, 13));
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void M(int i2, MediaSource.MediaPeriodId mediaPeriodId, int i3) {
        AnalyticsListener.EventTime eventTimeU = u(i2, mediaPeriodId);
        x(eventTimeU, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, new d(eventTimeU, i3, 1));
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void N(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime eventTimeU = u(i2, mediaPeriodId);
        x(eventTimeU, IronSourceError.ERROR_RV_LOAD_DURING_SHOW, new c(eventTimeU, 2));
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void O(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z2) {
        AnalyticsListener.EventTime eventTimeU = u(i2, mediaPeriodId);
        x(eventTimeU, 1003, new o(eventTimeU, loadEventInfo, mediaLoadData, iOException, z2, 6));
    }

    @Override // com.google.android.exoplayer2.drm.DrmSessionEventListener
    public final void P(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime eventTimeU = u(i2, mediaPeriodId);
        x(eventTimeU, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, new c(eventTimeU, 5));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void a(String str) {
        AnalyticsListener.EventTime eventTimeW = w();
        x(eventTimeW, 1019, new a(eventTimeW, str, 3));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void b(String str) {
        AnalyticsListener.EventTime eventTimeW = w();
        x(eventTimeW, TTAdConstant.IMAGE_MODE_1012, new a(eventTimeW, str, 2));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void c(Exception exc) {
        AnalyticsListener.EventTime eventTimeW = w();
        x(eventTimeW, f9.j, new androidx.media3.extractor.text.a(eventTimeW, exc));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void d(long j) {
        AnalyticsListener.EventTime eventTimeW = w();
        x(eventTimeW, 1010, new androidx.media3.extractor.text.a(eventTimeW, j));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void e(Exception exc) {
        AnalyticsListener.EventTime eventTimeW = w();
        x(eventTimeW, IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, new f(eventTimeW, exc, 11));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void f(long j, Object obj) {
        AnalyticsListener.EventTime eventTimeW = w();
        x(eventTimeW, 26, new androidx.media3.exoplayer.analytics.d(eventTimeW, obj, j, 21));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void g(int i2, long j) {
        AnalyticsListener.EventTime eventTimeS = s(this.e0.f17225e);
        x(eventTimeS, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, new androidx.media3.extractor.text.a(i2, j, eventTimeS));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void h(Exception exc) {
        AnalyticsListener.EventTime eventTimeW = w();
        x(eventTimeW, IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, new f(eventTimeW, exc, 12));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void i(int i2, long j, long j2) {
        AnalyticsListener.EventTime eventTimeW = w();
        x(eventTimeW, 1011, new i(eventTimeW, i2, j, j2, 1));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void j(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeW = w();
        x(eventTimeW, 1007, new c(eventTimeW, decoderCounters, 3));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void k(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        AnalyticsListener.EventTime eventTimeW = w();
        x(eventTimeW, 1017, new b(eventTimeW, format, decoderReuseEvaluation, 0));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void l(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeS = s(this.e0.f17225e);
        x(eventTimeS, 1020, new androidx.media3.exoplayer.analytics.d(20, eventTimeS, decoderCounters));
    }

    public final AnalyticsListener.EventTime m() {
        return s(this.e0.d);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void n(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeS = s(this.e0.f17225e);
        x(eventTimeS, f9.f24992i, new c(eventTimeS, decoderCounters, 1));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void o(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        AnalyticsListener.EventTime eventTimeW = w();
        x(eventTimeW, 1009, new b(eventTimeW, format, decoderReuseEvaluation, 1));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onAudioDecoderInitialized(String str, long j, long j2) {
        AnalyticsListener.EventTime eventTimeW = w();
        x(eventTimeW, 1008, new a(eventTimeW, str, j2, j, 0));
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onAvailableCommandsChanged(Player.Commands commands) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 13, new f(eventTimeM, commands, 5));
    }

    @Override // com.google.android.exoplayer2.upstream.BandwidthMeter.EventListener
    public final void onBandwidthSample(int i2, long j, long j2) {
        MediaPeriodQueueTracker mediaPeriodQueueTracker = this.e0;
        AnalyticsListener.EventTime eventTimeS = s(mediaPeriodQueueTracker.f17223b.isEmpty() ? null : (MediaSource.MediaPeriodId) Iterables.c(mediaPeriodQueueTracker.f17223b));
        x(eventTimeS, 1006, new androidx.media3.exoplayer.analytics.e(eventTimeS, i2, j, j2, 1));
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onCues(List list) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 27, new k(eventTimeM, list, 1));
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 29, new f(eventTimeM, deviceInfo, 9));
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onDeviceVolumeChanged(int i2, boolean z2) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 30, new f(eventTimeM, i2, z2));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onDroppedFrames(int i2, long j) {
        AnalyticsListener.EventTime eventTimeS = s(this.e0.f17225e);
        x(eventTimeS, 1018, new d(i2, j, eventTimeS));
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onEvents(Player player, Player.Events events) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onIsLoadingChanged(boolean z2) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 3, new e(eventTimeM, z2, 0));
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onIsPlayingChanged(boolean z2) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 7, new e(eventTimeM, z2, 1));
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onLoadingChanged(boolean z2) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onMediaItemTransition(MediaItem mediaItem, int i2) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 1, new d(eventTimeM, mediaItem, i2));
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 14, new f(eventTimeM, mediaMetadata, 0));
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onMetadata(Metadata metadata) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 28, new androidx.media3.exoplayer.analytics.d(25, eventTimeM, metadata));
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlayWhenReadyChanged(boolean z2, int i2) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 5, new j(eventTimeM, z2, i2, 1));
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 12, new androidx.media3.exoplayer.analytics.d(22, eventTimeM, playbackParameters));
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlaybackStateChanged(int i2) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 4, new d(eventTimeM, i2, 3));
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlaybackSuppressionReasonChanged(int i2) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 6, new d(eventTimeM, i2, 4));
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlayerError(PlaybackException playbackException) {
        MediaPeriodId mediaPeriodId;
        AnalyticsListener.EventTime eventTimeM = (!(playbackException instanceof ExoPlaybackException) || (mediaPeriodId = ((ExoPlaybackException) playbackException).i0) == null) ? m() : s(new MediaSource.MediaPeriodId(mediaPeriodId));
        x(eventTimeM, 10, new androidx.media3.exoplayer.analytics.d(23, eventTimeM, playbackException));
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlayerErrorChanged(PlaybackException playbackException) {
        MediaPeriodId mediaPeriodId;
        AnalyticsListener.EventTime eventTimeM = (!(playbackException instanceof ExoPlaybackException) || (mediaPeriodId = ((ExoPlaybackException) playbackException).i0) == null) ? m() : s(new MediaSource.MediaPeriodId(mediaPeriodId));
        x(eventTimeM, 10, new f(eventTimeM, playbackException, 7));
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPlayerStateChanged(boolean z2, int i2) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, -1, new f(eventTimeM, z2, i2));
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPositionDiscontinuity(int i2) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onRenderedFirstFrame() {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onSkipSilenceEnabledChanged(boolean z2) {
        AnalyticsListener.EventTime eventTimeW = w();
        x(eventTimeW, 23, new e(eventTimeW, z2, 2));
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onSurfaceSizeChanged(int i2, int i3) {
        AnalyticsListener.EventTime eventTimeW = w();
        x(eventTimeW, 24, new m(i2, i3, 1, eventTimeW));
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onTimelineChanged(Timeline timeline, int i2) {
        Player player = this.h0;
        player.getClass();
        MediaPeriodQueueTracker mediaPeriodQueueTracker = this.e0;
        mediaPeriodQueueTracker.d = MediaPeriodQueueTracker.b(player, mediaPeriodQueueTracker.f17223b, mediaPeriodQueueTracker.f17225e, mediaPeriodQueueTracker.f17222a);
        mediaPeriodQueueTracker.d(player.getCurrentTimeline());
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 0, new d(eventTimeM, i2, 5));
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onTracksChanged(Tracks tracks) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 2, new androidx.media3.exoplayer.analytics.d(24, eventTimeM, tracks));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void onVideoDecoderInitialized(String str, long j, long j2) {
        AnalyticsListener.EventTime eventTimeW = w();
        x(eventTimeW, f9.f24993l, new a(eventTimeW, str, j2, j, 1));
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onVideoSizeChanged(VideoSize videoSize) {
        AnalyticsListener.EventTime eventTimeW = w();
        x(eventTimeW, 25, new androidx.media3.exoplayer.analytics.d(19, eventTimeW, videoSize));
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onVolumeChanged(float f) {
        AnalyticsListener.EventTime eventTimeW = w();
        x(eventTimeW, 22, new h(eventTimeW, f, 1));
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void p(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeW = w();
        x(eventTimeW, 1015, new c(eventTimeW, decoderCounters, 0));
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void q(int i2, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeU = u(i2, mediaPeriodId);
        x(eventTimeU, 1004, new androidx.media3.exoplayer.analytics.d(17, eventTimeU, mediaLoadData));
    }

    public final AnalyticsListener.EventTime r(Timeline timeline, int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        MediaSource.MediaPeriodId mediaPeriodId2 = timeline.p() ? null : mediaPeriodId;
        long jElapsedRealtime = this.X.elapsedRealtime();
        boolean z2 = timeline.equals(this.h0.getCurrentTimeline()) && i2 == this.h0.f();
        long J2 = 0;
        if (mediaPeriodId2 == null || !mediaPeriodId2.a()) {
            if (z2) {
                J2 = this.h0.getContentPosition();
            } else if (!timeline.p()) {
                J2 = Util.J(timeline.m(i2, this.Z, 0L).m0);
            }
        } else if (z2 && this.h0.getCurrentAdGroupIndex() == mediaPeriodId2.f18348b && this.h0.getCurrentAdIndexInAdGroup() == mediaPeriodId2.f18349c) {
            J2 = this.h0.getCurrentPosition();
        }
        return new AnalyticsListener.EventTime(jElapsedRealtime, timeline, i2, mediaPeriodId2, J2, this.h0.getCurrentTimeline(), this.h0.f(), this.e0.d, this.h0.getCurrentPosition(), this.h0.b());
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void release() {
        HandlerWrapper handlerWrapper = this.i0;
        Assertions.e(handlerWrapper);
        handlerWrapper.post(new c0.a(this, 17));
    }

    public final AnalyticsListener.EventTime s(MediaSource.MediaPeriodId mediaPeriodId) {
        this.h0.getClass();
        Timeline timeline = mediaPeriodId == null ? null : (Timeline) this.e0.f17224c.get(mediaPeriodId);
        if (mediaPeriodId != null && timeline != null) {
            return r(timeline, timeline.g(mediaPeriodId.f18347a, this.f17221Y).Z, mediaPeriodId);
        }
        int iF = this.h0.f();
        Timeline currentTimeline = this.h0.getCurrentTimeline();
        if (iF >= currentTimeline.o()) {
            currentTimeline = Timeline.X;
        }
        return r(currentTimeline, iF, null);
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void t(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeU = u(i2, mediaPeriodId);
        x(eventTimeU, 1002, new f(eventTimeU, loadEventInfo, mediaLoadData, 8));
    }

    public final AnalyticsListener.EventTime u(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        this.h0.getClass();
        if (mediaPeriodId != null) {
            return ((Timeline) this.e0.f17224c.get(mediaPeriodId)) != null ? s(mediaPeriodId) : r(Timeline.X, i2, mediaPeriodId);
        }
        Timeline currentTimeline = this.h0.getCurrentTimeline();
        if (i2 >= currentTimeline.o()) {
            currentTimeline = Timeline.X;
        }
        return r(currentTimeline, i2, null);
    }

    @Override // com.google.android.exoplayer2.source.MediaSourceEventListener
    public final void v(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeU = u(i2, mediaPeriodId);
        x(eventTimeU, 1000, new f(eventTimeU, loadEventInfo, mediaLoadData, 3));
    }

    public final AnalyticsListener.EventTime w() {
        return s(this.e0.f);
    }

    public final void x(AnalyticsListener.EventTime eventTime, int i2, ListenerSet.Event event) {
        this.f0.put(i2, eventTime);
        this.g0.e(i2, event);
    }

    @Override // com.google.android.exoplayer2.analytics.AnalyticsCollector
    public final void z(Player player, Looper looper) {
        Assertions.d(this.h0 == null || this.e0.f17223b.isEmpty());
        player.getClass();
        this.h0 = player;
        this.i0 = this.X.createHandler(looper, null);
        ListenerSet listenerSet = this.g0;
        this.g0 = new ListenerSet(listenerSet.d, looper, listenerSet.f18910a, new androidx.media3.exoplayer.analytics.d(16, this, player));
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
        Player player = this.h0;
        player.getClass();
        MediaPeriodQueueTracker mediaPeriodQueueTracker = this.e0;
        mediaPeriodQueueTracker.d = MediaPeriodQueueTracker.b(player, mediaPeriodQueueTracker.f17223b, mediaPeriodQueueTracker.f17225e, mediaPeriodQueueTracker.f17222a);
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 11, new l(i2, 1, eventTimeM, positionInfo, positionInfo2));
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public final void onCues(CueGroup cueGroup) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 27, new f(eventTimeM, cueGroup, 4));
    }
}
