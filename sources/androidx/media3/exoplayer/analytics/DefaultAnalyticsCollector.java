package androidx.media3.exoplayer.analytics;

import A.RunnableC0883c;
import android.os.Looper;
import android.util.SparseArray;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Clock;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.DecoderReuseEvaluation;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaSource;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.p004ironsource.f9;
import com.p004ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DefaultAnalyticsCollector implements AnalyticsCollector {
    public final Clock X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Timeline.Period f5998Y;
    public final Timeline.Window Z;
    public final MediaPeriodQueueTracker e0;
    public final SparseArray f0;
    public ListenerSet g0;
    public Player h0;
    public HandlerWrapper i0;
    public boolean j0;

    public static final class MediaPeriodQueueTracker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Timeline.Period f5999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImmutableList f6000b = ImmutableList.x();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ImmutableMap f6001c = ImmutableMap.o();
        public MediaSource.MediaPeriodId d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public MediaSource.MediaPeriodId f6002e;
        public MediaSource.MediaPeriodId f;

        public MediaPeriodQueueTracker(Timeline.Period period) {
            this.f5999a = period;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static MediaSource.MediaPeriodId b(Player player, ImmutableList immutableList, MediaSource.MediaPeriodId mediaPeriodId, Timeline.Period period) {
            Timeline currentTimeline = player.getCurrentTimeline();
            int currentPeriodIndex = player.getCurrentPeriodIndex();
            Object objL = currentTimeline.p() ? null : currentTimeline.l(currentPeriodIndex);
            int iB = (player.isPlayingAd() || currentTimeline.p()) ? -1 : currentTimeline.f(currentPeriodIndex, period, false).b(Util.I(player.getCurrentPosition()) - period.f5511e);
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
            if (!mediaPeriodId.f6384a.equals(obj)) {
                return false;
            }
            int i5 = mediaPeriodId.f6385b;
            if (z2 && i5 == i2 && mediaPeriodId.f6386c == i3) {
                return true;
            }
            return !z2 && i5 == -1 && mediaPeriodId.f6387e == i4;
        }

        public final void a(ImmutableMap.Builder builder, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline) {
            if (mediaPeriodId == null) {
                return;
            }
            if (timeline.b(mediaPeriodId.f6384a) != -1) {
                builder.c(mediaPeriodId, timeline);
                return;
            }
            Timeline timeline2 = (Timeline) this.f6001c.get(mediaPeriodId);
            if (timeline2 != null) {
                builder.c(mediaPeriodId, timeline2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void d(Timeline timeline) {
            ImmutableMap.Builder builderD = ImmutableMap.d();
            if (this.f6000b.isEmpty()) {
                a(builderD, this.f6002e, timeline);
                if (!Objects.a(this.f, this.f6002e)) {
                    a(builderD, this.f, timeline);
                }
                if (!Objects.a(this.d, this.f6002e) && !Objects.a(this.d, this.f)) {
                    a(builderD, this.d, timeline);
                }
            } else {
                for (int i2 = 0; i2 < this.f6000b.size(); i2++) {
                    a(builderD, (MediaSource.MediaPeriodId) this.f6000b.get(i2), timeline);
                }
                if (!this.f6000b.contains(this.d)) {
                    a(builderD, this.d, timeline);
                }
            }
            this.f6001c = builderD.a(true);
        }
    }

    public DefaultAnalyticsCollector(Clock clock) {
        clock.getClass();
        this.X = clock;
        int i2 = Util.f5683a;
        Looper looperMyLooper = Looper.myLooper();
        this.g0 = new ListenerSet(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, clock, new I.a(15));
        Timeline.Period period = new Timeline.Period();
        this.f5998Y = period;
        this.Z = new Timeline.Window();
        this.e0 = new MediaPeriodQueueTracker(period);
        this.f0 = new SparseArray();
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void B(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime eventTimeU = u(i2, mediaPeriodId);
        x(eventTimeU, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, new c(eventTimeU, 5));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void D(int i2, MediaSource.MediaPeriodId mediaPeriodId, int i3) {
        AnalyticsListener.EventTime eventTimeU = u(i2, mediaPeriodId);
        x(eventTimeU, IronSourceError.ERROR_RV_SHOW_CALLED_DURING_SHOW, new b(eventTimeU, i3, 1));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void E(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z2) {
        AnalyticsListener.EventTime eventTimeU = u(i2, mediaPeriodId);
        x(eventTimeU, 1003, new o(eventTimeU, loadEventInfo, mediaLoadData, iOException, z2, 0));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void H(int i2, MediaSource.MediaPeriodId mediaPeriodId, Exception exc) {
        AnalyticsListener.EventTime eventTimeU = u(i2, mediaPeriodId);
        x(eventTimeU, 1024, new d(0, eventTimeU, exc));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void J(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeU = u(i2, mediaPeriodId);
        x(eventTimeU, 1002, new I.a(eventTimeU, loadEventInfo, mediaLoadData, 4));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void K(MediaMetricsListener mediaMetricsListener) {
        this.g0.a(mediaMetricsListener);
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void N(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeU = u(i2, mediaPeriodId);
        x(eventTimeU, 1001, new I.a(eventTimeU, loadEventInfo, mediaLoadData, 5));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void O(int i2, MediaSource.MediaPeriodId mediaPeriodId, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeU = u(i2, mediaPeriodId);
        x(eventTimeU, 1004, new d(3, eventTimeU, mediaLoadData));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void P(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime eventTimeU = u(i2, mediaPeriodId);
        x(eventTimeU, IronSourceError.ERROR_LOAD_FAILED_TIMEOUT, new c(eventTimeU, 4));
    }

    @Override // androidx.media3.exoplayer.drm.DrmSessionEventListener
    public final void S(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        AnalyticsListener.EventTime eventTimeU = u(i2, mediaPeriodId);
        x(eventTimeU, IronSourceError.ERROR_RV_LOAD_DURING_SHOW, new c(eventTimeU, 2));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void T(Player player, Looper looper) {
        Assertions.e(this.h0 == null || this.e0.f6000b.isEmpty());
        player.getClass();
        this.h0 = player;
        this.i0 = this.X.createHandler(looper, null);
        ListenerSet listenerSet = this.g0;
        this.g0 = new ListenerSet(listenerSet.d, looper, listenerSet.f5640a, new d(9, this, player), listenerSet.f5645i);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void a(String str) {
        AnalyticsListener.EventTime eventTimeV = v();
        x(eventTimeV, 1019, new a(eventTimeV, str, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void b(String str) {
        AnalyticsListener.EventTime eventTimeV = v();
        x(eventTimeV, TTAdConstant.IMAGE_MODE_1012, new a(eventTimeV, str, 3));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void c(Exception exc) {
        AnalyticsListener.EventTime eventTimeV = v();
        x(eventTimeV, f9.j, new I.a(eventTimeV, exc, 7));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void d(long j) {
        AnalyticsListener.EventTime eventTimeV = v();
        x(eventTimeV, 1010, new I.a(eventTimeV, j));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void e(Exception exc) {
        AnalyticsListener.EventTime eventTimeV = v();
        x(eventTimeV, IronSourceError.ERROR_RV_LOAD_FAIL_UNEXPECTED, new I.a(eventTimeV, exc, 17));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void f(long j, Object obj) {
        AnalyticsListener.EventTime eventTimeV = v();
        x(eventTimeV, 26, new d(eventTimeV, obj, j, 8));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void g(int i2, long j) {
        AnalyticsListener.EventTime eventTimeS = s(this.e0.f6002e);
        x(eventTimeS, IronSourceError.ERROR_RV_EMPTY_DEFAULT_PLACEMENT, new I.a(i2, j, eventTimeS));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void h(Exception exc) {
        AnalyticsListener.EventTime eventTimeV = v();
        x(eventTimeV, IronSourceError.ERROR_RV_LOAD_SUCCESS_WRONG_AUCTION_ID, new I.a(eventTimeV, exc, 6));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void i(int i2, long j, long j2) {
        AnalyticsListener.EventTime eventTimeV = v();
        x(eventTimeV, 1011, new i(eventTimeV, i2, j, j2, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void j(AudioSink.AudioTrackConfig audioTrackConfig) {
        AnalyticsListener.EventTime eventTimeV = v();
        x(eventTimeV, IronSourceError.ERROR_RV_INIT_FAILED_TIMEOUT, new n(eventTimeV, audioTrackConfig, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void k(AudioSink.AudioTrackConfig audioTrackConfig) {
        AnalyticsListener.EventTime eventTimeV = v();
        x(eventTimeV, IronSourceError.ERROR_RV_LOAD_FAIL_WRONG_AUCTION_ID, new n(eventTimeV, audioTrackConfig, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void l(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeV = v();
        x(eventTimeV, 1007, new c(eventTimeV, decoderCounters, 3));
    }

    public final AnalyticsListener.EventTime m() {
        return s(this.e0.d);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void n(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeV = v();
        x(eventTimeV, 1015, new c(eventTimeV, decoderCounters, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void o(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        AnalyticsListener.EventTime eventTimeV = v();
        x(eventTimeV, 1009, new f(eventTimeV, format, decoderReuseEvaluation, 1));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onAudioDecoderInitialized(String str, long j, long j2) {
        AnalyticsListener.EventTime eventTimeV = v();
        x(eventTimeV, 1008, new a(eventTimeV, str, j2, j, 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onAvailableCommandsChanged(Player.Commands commands) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 13, new I.a(eventTimeM, commands, 12));
    }

    @Override // androidx.media3.exoplayer.upstream.BandwidthMeter.EventListener
    public final void onBandwidthSample(int i2, long j, long j2) {
        MediaPeriodQueueTracker mediaPeriodQueueTracker = this.e0;
        AnalyticsListener.EventTime eventTimeS = s(mediaPeriodQueueTracker.f6000b.isEmpty() ? null : (MediaSource.MediaPeriodId) Iterables.c(mediaPeriodQueueTracker.f6000b));
        x(eventTimeS, 1006, new e(eventTimeS, i2, j, j2, 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onCues(List list) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 27, new k(eventTimeM, list, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onDroppedFrames(int i2, long j) {
        AnalyticsListener.EventTime eventTimeS = s(this.e0.f6002e);
        x(eventTimeS, 1018, new b(i2, j, eventTimeS));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onEvents(Player player, Player.Events events) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onIsLoadingChanged(boolean z2) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 3, new g(eventTimeM, z2, 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onIsPlayingChanged(boolean z2) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 7, new g(eventTimeM, z2, 1));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onLoadingChanged(boolean z2) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onMediaItemTransition(MediaItem mediaItem, int i2) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 1, new b(eventTimeM, mediaItem, i2));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 14, new I.a(eventTimeM, mediaMetadata, 9));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onMetadata(Metadata metadata) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 28, new d(5, eventTimeM, metadata));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayWhenReadyChanged(boolean z2, int i2) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 5, new j(eventTimeM, z2, i2, 0));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 12, new d(1, eventTimeM, playbackParameters));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackStateChanged(int i2) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 4, new b(eventTimeM, i2, 5));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlaybackSuppressionReasonChanged(int i2) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 6, new b(eventTimeM, i2, 4));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException playbackException) {
        MediaSource.MediaPeriodId mediaPeriodId;
        AnalyticsListener.EventTime eventTimeM = (!(playbackException instanceof ExoPlaybackException) || (mediaPeriodId = ((ExoPlaybackException) playbackException).i0) == null) ? m() : s(mediaPeriodId);
        x(eventTimeM, 10, new d(6, eventTimeM, playbackException));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerErrorChanged(PlaybackException playbackException) {
        MediaSource.MediaPeriodId mediaPeriodId;
        AnalyticsListener.EventTime eventTimeM = (!(playbackException instanceof ExoPlaybackException) || (mediaPeriodId = ((ExoPlaybackException) playbackException).i0) == null) ? m() : s(mediaPeriodId);
        x(eventTimeM, 10, new I.a(eventTimeM, playbackException, 14));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerStateChanged(boolean z2, int i2) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, -1, new I.a(eventTimeM, z2, i2));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPositionDiscontinuity(int i2) {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onRenderedFirstFrame() {
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onRepeatModeChanged(int i2) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 8, new b(eventTimeM, i2, 6));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onShuffleModeEnabledChanged(boolean z2) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 9, new g(eventTimeM, z2, 2));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onSkipSilenceEnabledChanged(boolean z2) {
        AnalyticsListener.EventTime eventTimeV = v();
        x(eventTimeV, 23, new g(eventTimeV, z2, 3));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onSurfaceSizeChanged(int i2, int i3) {
        AnalyticsListener.EventTime eventTimeV = v();
        x(eventTimeV, 24, new m(i2, i3, 0, eventTimeV));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTimelineChanged(Timeline timeline, int i2) {
        Player player = this.h0;
        player.getClass();
        MediaPeriodQueueTracker mediaPeriodQueueTracker = this.e0;
        mediaPeriodQueueTracker.d = MediaPeriodQueueTracker.b(player, mediaPeriodQueueTracker.f6000b, mediaPeriodQueueTracker.f6002e, mediaPeriodQueueTracker.f5999a);
        mediaPeriodQueueTracker.d(player.getCurrentTimeline());
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 0, new b(eventTimeM, i2, 2));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 19, new I.a(eventTimeM, trackSelectionParameters, 10));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onTracksChanged(Tracks tracks) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 2, new d(2, eventTimeM, tracks));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void onVideoDecoderInitialized(String str, long j, long j2) {
        AnalyticsListener.EventTime eventTimeV = v();
        x(eventTimeV, f9.f24993l, new a(eventTimeV, str, j2, j, 2));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVideoSizeChanged(VideoSize videoSize) {
        AnalyticsListener.EventTime eventTimeV = v();
        x(eventTimeV, 25, new d(7, eventTimeV, videoSize));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVolumeChanged(float f) {
        AnalyticsListener.EventTime eventTimeV = v();
        x(eventTimeV, 22, new h(eventTimeV, f, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void p(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeS = s(this.e0.f6002e);
        x(eventTimeS, f9.f24992i, new c(eventTimeS, decoderCounters, 0));
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void q(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
        AnalyticsListener.EventTime eventTimeV = v();
        x(eventTimeV, 1017, new f(eventTimeV, format, decoderReuseEvaluation, 0));
    }

    public final AnalyticsListener.EventTime r(Timeline timeline, int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        MediaSource.MediaPeriodId mediaPeriodId2 = timeline.p() ? null : mediaPeriodId;
        long jElapsedRealtime = this.X.elapsedRealtime();
        boolean z2 = timeline.equals(this.h0.getCurrentTimeline()) && i2 == this.h0.f();
        long jT = 0;
        if (mediaPeriodId2 == null || !mediaPeriodId2.b()) {
            if (z2) {
                jT = this.h0.getContentPosition();
            } else if (!timeline.p()) {
                jT = Util.T(timeline.m(i2, this.Z, 0L).k);
            }
        } else if (z2 && this.h0.getCurrentAdGroupIndex() == mediaPeriodId2.f6385b && this.h0.getCurrentAdIndexInAdGroup() == mediaPeriodId2.f6386c) {
            jT = this.h0.getCurrentPosition();
        }
        return new AnalyticsListener.EventTime(jElapsedRealtime, timeline, i2, mediaPeriodId2, jT, this.h0.getCurrentTimeline(), this.h0.f(), this.e0.d, this.h0.getCurrentPosition(), this.h0.b());
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void release() {
        HandlerWrapper handlerWrapper = this.i0;
        Assertions.f(handlerWrapper);
        handlerWrapper.post(new RunnableC0883c(this, 29));
    }

    public final AnalyticsListener.EventTime s(MediaSource.MediaPeriodId mediaPeriodId) {
        this.h0.getClass();
        Timeline timeline = mediaPeriodId == null ? null : (Timeline) this.e0.f6001c.get(mediaPeriodId);
        if (mediaPeriodId != null && timeline != null) {
            return r(timeline, timeline.g(mediaPeriodId.f6384a, this.f5998Y).f5510c, mediaPeriodId);
        }
        int iF = this.h0.f();
        Timeline currentTimeline = this.h0.getCurrentTimeline();
        if (iF >= currentTimeline.o()) {
            currentTimeline = Timeline.f5507a;
        }
        return r(currentTimeline, iF, null);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void t(DecoderCounters decoderCounters) {
        AnalyticsListener.EventTime eventTimeS = s(this.e0.f6002e);
        x(eventTimeS, 1020, new d(4, eventTimeS, decoderCounters));
    }

    public final AnalyticsListener.EventTime u(int i2, MediaSource.MediaPeriodId mediaPeriodId) {
        this.h0.getClass();
        if (mediaPeriodId != null) {
            return ((Timeline) this.e0.f6001c.get(mediaPeriodId)) != null ? s(mediaPeriodId) : r(Timeline.f5507a, i2, mediaPeriodId);
        }
        Timeline currentTimeline = this.h0.getCurrentTimeline();
        if (i2 >= currentTimeline.o()) {
            currentTimeline = Timeline.f5507a;
        }
        return r(currentTimeline, i2, null);
    }

    public final AnalyticsListener.EventTime v() {
        return s(this.e0.f);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void w(List list, MediaSource.MediaPeriodId mediaPeriodId) {
        Player player = this.h0;
        player.getClass();
        MediaPeriodQueueTracker mediaPeriodQueueTracker = this.e0;
        mediaPeriodQueueTracker.getClass();
        mediaPeriodQueueTracker.f6000b = ImmutableList.u(list);
        if (!list.isEmpty()) {
            mediaPeriodQueueTracker.f6002e = (MediaSource.MediaPeriodId) list.get(0);
            mediaPeriodId.getClass();
            mediaPeriodQueueTracker.f = mediaPeriodId;
        }
        if (mediaPeriodQueueTracker.d == null) {
            mediaPeriodQueueTracker.d = MediaPeriodQueueTracker.b(player, mediaPeriodQueueTracker.f6000b, mediaPeriodQueueTracker.f6002e, mediaPeriodQueueTracker.f5999a);
        }
        mediaPeriodQueueTracker.d(player.getCurrentTimeline());
    }

    public final void x(AnalyticsListener.EventTime eventTime, int i2, ListenerSet.Event event) {
        this.f0.put(i2, eventTime);
        this.g0.f(i2, event);
    }

    @Override // androidx.media3.exoplayer.analytics.AnalyticsCollector
    public final void y() {
        if (this.j0) {
            return;
        }
        AnalyticsListener.EventTime eventTimeM = m();
        this.j0 = true;
        x(eventTimeM, -1, new I.a(eventTimeM, 1));
    }

    @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
    public final void z(int i2, MediaSource.MediaPeriodId mediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
        AnalyticsListener.EventTime eventTimeU = u(i2, mediaPeriodId);
        x(eventTimeU, 1000, new I.a(eventTimeU, loadEventInfo, mediaLoadData, 16));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
        if (i2 == 1) {
            this.j0 = false;
        }
        Player player = this.h0;
        player.getClass();
        MediaPeriodQueueTracker mediaPeriodQueueTracker = this.e0;
        mediaPeriodQueueTracker.d = MediaPeriodQueueTracker.b(player, mediaPeriodQueueTracker.f6000b, mediaPeriodQueueTracker.f6002e, mediaPeriodQueueTracker.f5999a);
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 11, new l(i2, 0, eventTimeM, positionInfo, positionInfo2));
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onCues(CueGroup cueGroup) {
        AnalyticsListener.EventTime eventTimeM = m();
        x(eventTimeM, 27, new I.a(eventTimeM, cueGroup, 8));
    }
}
