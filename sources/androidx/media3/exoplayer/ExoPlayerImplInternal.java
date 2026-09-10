package androidx.media3.exoplayer;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Trace;
import android.util.Pair;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Format;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.Util;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.TransferListener;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.metadata.MetadataRenderer;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.source.ForwardingTimeline;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.SampleStream;
import androidx.media3.exoplayer.source.SequenceableLoader;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.text.TextRenderer;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Sets;
import com.google.common.primitives.Longs;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
final class ExoPlayerImplInternal implements Handler.Callback, MediaPeriod.Callback, TrackSelector.InvalidationListener, MediaSourceList.MediaSourceListInfoRefreshListener, DefaultMediaClock.PlaybackParametersListener, PlayerMessage.Sender {
    public static final long V0 = Util.T(10000);
    public static final /* synthetic */ int W0 = 0;
    public PlaybackInfoUpdate A0;
    public boolean B0;
    public boolean D0;
    public boolean E0;
    public boolean G0;
    public int H0;
    public boolean I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public int M0;
    public SeekPosition N0;
    public long O0;
    public long P0;
    public int Q0;
    public boolean R0;
    public ExoPlaybackException S0;
    public ExoPlayer.PreloadConfiguration U0;
    public final Renderer[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Set f5894Y;
    public final RendererCapabilities[] Z;
    public final TrackSelector e0;
    public final TrackSelectorResult f0;
    public final LoadControl g0;
    public final BandwidthMeter h0;
    public final HandlerWrapper i0;
    public final HandlerThread j0;
    public final Looper k0;
    public final Timeline.Window l0;
    public final Timeline.Period m0;
    public final long n0;
    public final boolean o0;
    public final DefaultMediaClock p0;
    public final ArrayList q0;
    public final SystemClock r0;
    public final m s0;
    public final MediaPeriodQueue t0;
    public final MediaSourceList u0;
    public final DefaultLivePlaybackSpeedControl v0;
    public final long w0;
    public final PlayerId x0;
    public SeekParameters y0;
    public PlaybackInfo z0;
    public boolean C0 = false;
    public long T0 = -9223372036854775807L;
    public long F0 = -9223372036854775807L;

    public static final class MediaSourceListUpdateMessage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f5896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ShuffleOrder f5897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f5898c;
        public final long d;

        public MediaSourceListUpdateMessage(ArrayList arrayList, ShuffleOrder shuffleOrder, int i2, long j) {
            this.f5896a = arrayList;
            this.f5897b = shuffleOrder;
            this.f5898c = i2;
            this.d = j;
        }
    }

    public static class MoveMediaItemsMessage {
    }

    public static final class PendingMessageInfo implements Comparable<PendingMessageInfo> {
        @Override // java.lang.Comparable
        public final int compareTo(PendingMessageInfo pendingMessageInfo) {
            pendingMessageInfo.getClass();
            return 0;
        }
    }

    public static final class PlaybackInfoUpdate {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f5899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public PlaybackInfo f5900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5901c;
        public boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f5902e;

        public PlaybackInfoUpdate(PlaybackInfo playbackInfo) {
            this.f5900b = playbackInfo;
        }

        public final void a(int i2) {
            this.f5899a |= i2 > 0;
            this.f5901c += i2;
        }
    }

    public interface PlaybackInfoUpdateListener {
    }

    public static final class PositionUpdateForPlaylistChange {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaSource.MediaPeriodId f5903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f5904b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f5905c;
        public final boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f5906e;
        public final boolean f;

        public PositionUpdateForPlaylistChange(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, boolean z2, boolean z3, boolean z4) {
            this.f5903a = mediaPeriodId;
            this.f5904b = j;
            this.f5905c = j2;
            this.d = z2;
            this.f5906e = z3;
            this.f = z4;
        }
    }

    public static final class SeekPosition {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Timeline f5907a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f5908b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f5909c;

        public SeekPosition(Timeline timeline, int i2, long j) {
            this.f5907a = timeline;
            this.f5908b = i2;
            this.f5909c = j;
        }
    }

    public ExoPlayerImplInternal(Renderer[] rendererArr, TrackSelector trackSelector, TrackSelectorResult trackSelectorResult, LoadControl loadControl, BandwidthMeter bandwidthMeter, int i2, boolean z2, AnalyticsCollector analyticsCollector, SeekParameters seekParameters, DefaultLivePlaybackSpeedControl defaultLivePlaybackSpeedControl, long j, Looper looper, SystemClock systemClock, m mVar, PlayerId playerId, ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.s0 = mVar;
        this.X = rendererArr;
        this.e0 = trackSelector;
        this.f0 = trackSelectorResult;
        this.g0 = loadControl;
        this.h0 = bandwidthMeter;
        this.H0 = i2;
        this.I0 = z2;
        this.y0 = seekParameters;
        this.v0 = defaultLivePlaybackSpeedControl;
        this.w0 = j;
        this.r0 = systemClock;
        this.x0 = playerId;
        this.U0 = preloadConfiguration;
        this.n0 = loadControl.getBackBufferDurationUs();
        this.o0 = loadControl.retainBackBufferFromKeyframe();
        Timeline timeline = Timeline.f5507a;
        PlaybackInfo playbackInfoI = PlaybackInfo.i(trackSelectorResult);
        this.z0 = playbackInfoI;
        this.A0 = new PlaybackInfoUpdate(playbackInfoI);
        this.Z = new RendererCapabilities[rendererArr.length];
        RendererCapabilities.Listener listenerC = trackSelector.c();
        for (int i3 = 0; i3 < rendererArr.length; i3++) {
            rendererArr[i3].i(i3, playerId, systemClock);
            this.Z[i3] = rendererArr[i3].getCapabilities();
            if (listenerC != null) {
                this.Z[i3].n(listenerC);
            }
        }
        this.p0 = new DefaultMediaClock(this, systemClock);
        this.q0 = new ArrayList();
        this.f5894Y = Sets.g();
        this.l0 = new Timeline.Window();
        this.m0 = new Timeline.Period();
        trackSelector.f6537a = this;
        trackSelector.f6538b = bandwidthMeter;
        this.R0 = true;
        HandlerWrapper handlerWrapperCreateHandler = systemClock.createHandler(looper, null);
        this.t0 = new MediaPeriodQueue(analyticsCollector, handlerWrapperCreateHandler, new f(this, 3), preloadConfiguration);
        this.u0 = new MediaSourceList(this, analyticsCollector, handlerWrapperCreateHandler, playerId);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.j0 = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.k0 = looper2;
        this.i0 = systemClock.createHandler(looper2, this);
    }

    public static Pair G(Timeline timeline, SeekPosition seekPosition, boolean z2, int i2, boolean z3, Timeline.Window window, Timeline.Period period) {
        int iH;
        Timeline timeline2 = seekPosition.f5907a;
        if (timeline.p()) {
            return null;
        }
        Timeline timeline3 = timeline2.p() ? timeline : timeline2;
        try {
            Pair pairI = timeline3.i(window, period, seekPosition.f5908b, seekPosition.f5909c);
            if (!timeline.equals(timeline3)) {
                if (timeline.b(pairI.first) == -1) {
                    if (!z2 || (iH = H(window, period, i2, z3, pairI.first, timeline3, timeline)) == -1) {
                        return null;
                    }
                    return timeline.i(window, period, iH, -9223372036854775807L);
                }
                if (timeline3.g(pairI.first, period).f && timeline3.m(period.f5510c, window, 0L).m == timeline3.b(pairI.first)) {
                    return timeline.i(window, period, timeline.g(pairI.first, period).f5510c, seekPosition.f5909c);
                }
            }
            return pairI;
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    public static int H(Timeline.Window window, Timeline.Period period, int i2, boolean z2, Object obj, Timeline timeline, Timeline timeline2) {
        Timeline timeline3 = timeline;
        Object obj2 = timeline3.m(timeline3.g(obj, period).f5510c, window, 0L).f5513a;
        for (int i3 = 0; i3 < timeline2.o(); i3++) {
            if (timeline2.m(i3, window, 0L).f5513a.equals(obj2)) {
                return i3;
            }
        }
        int iB = timeline3.b(obj);
        int iH = timeline3.h();
        int iB2 = -1;
        int i4 = 0;
        while (i4 < iH && iB2 == -1) {
            Timeline timeline4 = timeline3;
            int iD = timeline4.d(iB, period, window, i2, z2);
            if (iD == -1) {
                break;
            }
            iB2 = timeline2.b(timeline4.l(iD));
            i4++;
            timeline3 = timeline4;
            iB = iD;
        }
        if (iB2 == -1) {
            return -1;
        }
        return timeline2.f(iB2, period, false).f5510c;
    }

    public static void O(Renderer renderer, long j) {
        renderer.setCurrentStreamFinal();
        if (renderer instanceof TextRenderer) {
            TextRenderer textRenderer = (TextRenderer) renderer;
            Assertions.e(textRenderer.o0);
            textRenderer.L0 = j;
        }
    }

    public static boolean s(Renderer renderer) {
        return renderer.getState() != 0;
    }

    public final void A(int i2, int i3, ShuffleOrder shuffleOrder) throws Throwable {
        this.A0.a(1);
        MediaSourceList mediaSourceList = this.u0;
        mediaSourceList.getClass();
        Assertions.b(i2 >= 0 && i2 <= i3 && i3 <= mediaSourceList.f5946b.size());
        mediaSourceList.j = shuffleOrder;
        mediaSourceList.g(i2, i3);
        n(mediaSourceList.b(), false);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    public final void B() throws ExoPlaybackException {
        int i2;
        int i3;
        float f = this.p0.getPlaybackParameters().f5494a;
        MediaPeriodQueue mediaPeriodQueue = this.t0;
        MediaPeriodHolder mediaPeriodHolder = mediaPeriodQueue.f5941i;
        MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodQueue.j;
        TrackSelectorResult trackSelectorResult = null;
        MediaPeriodHolder mediaPeriodHolder3 = mediaPeriodHolder;
        boolean z2 = true;
        while (mediaPeriodHolder3 != null && mediaPeriodHolder3.d) {
            TrackSelectorResult trackSelectorResultH = mediaPeriodHolder3.h(f, this.z0.f5962a);
            TrackSelectorResult trackSelectorResult2 = mediaPeriodHolder3 == this.t0.f5941i ? trackSelectorResultH : trackSelectorResult;
            TrackSelectorResult trackSelectorResult3 = mediaPeriodHolder3.f5929n;
            if (trackSelectorResult3 != null) {
                int length = trackSelectorResult3.f6541c.length;
                ExoTrackSelection[] exoTrackSelectionArr = trackSelectorResultH.f6541c;
                if (length == exoTrackSelectionArr.length) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= exoTrackSelectionArr.length) {
                            if (mediaPeriodHolder3 == mediaPeriodHolder2) {
                                z2 = false;
                            }
                            mediaPeriodHolder3 = mediaPeriodHolder3.f5928l;
                            trackSelectorResult = trackSelectorResult2;
                        } else if (trackSelectorResultH.a(trackSelectorResult3, i4)) {
                            i4++;
                        }
                    }
                }
            }
            if (!z2) {
                i2 = 4;
                this.t0.k(mediaPeriodHolder3);
                if (mediaPeriodHolder3.d) {
                    i3 = 4;
                    mediaPeriodHolder3.a(trackSelectorResultH, Math.max(mediaPeriodHolder3.f.f5931b, this.O0 - mediaPeriodHolder3.o), false, new boolean[mediaPeriodHolder3.f5927i.length]);
                }
                m(true);
                if (this.z0.f5965e != i3) {
                    u();
                    g0();
                    this.i0.sendEmptyMessage(2);
                    return;
                }
                return;
            }
            MediaPeriodQueue mediaPeriodQueue2 = this.t0;
            MediaPeriodHolder mediaPeriodHolder4 = mediaPeriodQueue2.f5941i;
            boolean zK = mediaPeriodQueue2.k(mediaPeriodHolder4);
            boolean[] zArr = new boolean[this.X.length];
            trackSelectorResult2.getClass();
            long jA = mediaPeriodHolder4.a(trackSelectorResult2, this.z0.s, zK, zArr);
            PlaybackInfo playbackInfo = this.z0;
            boolean z3 = (playbackInfo.f5965e == 4 || jA == playbackInfo.s) ? false : true;
            PlaybackInfo playbackInfo2 = this.z0;
            i2 = 4;
            this.z0 = q(playbackInfo2.f5963b, jA, playbackInfo2.f5964c, playbackInfo2.d, z3, 5);
            if (z3) {
                E(jA);
            }
            boolean[] zArr2 = new boolean[this.X.length];
            int i5 = 0;
            while (true) {
                Renderer[] rendererArr = this.X;
                if (i5 >= rendererArr.length) {
                    break;
                }
                Renderer renderer = rendererArr[i5];
                boolean zS = s(renderer);
                zArr2[i5] = zS;
                SampleStream sampleStream = mediaPeriodHolder4.f5924c[i5];
                if (zS) {
                    if (sampleStream != renderer.getStream()) {
                        d(renderer);
                    } else if (zArr[i5]) {
                        renderer.resetPosition(this.O0);
                    }
                }
                i5++;
            }
            g(zArr2, this.O0);
            i3 = i2;
            m(true);
            if (this.z0.f5965e != i3) {
                u();
                g0();
                this.i0.sendEmptyMessage(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:34:0x0092  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c0 A[PHI: r5 r6 r8
  0x00c0: PHI (r5v4 androidx.media3.exoplayer.source.MediaSource$MediaPeriodId) = 
  (r5v3 androidx.media3.exoplayer.source.MediaSource$MediaPeriodId)
  (r5v14 androidx.media3.exoplayer.source.MediaSource$MediaPeriodId)
 binds: [B:35:0x0096, B:37:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x00c0: PHI (r6v2 long) = (r6v1 long), (r6v14 long) binds: [B:35:0x0096, B:37:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x00c0: PHI (r8v3 long) = (r8v2 long), (r8v11 long) binds: [B:35:0x0096, B:37:0x00bb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x012b  */
    /* JADX WARN: Code duplicated, block: B:60:0x0130  */
    /* JADX WARN: Code duplicated, block: B:62:0x0135  */
    /* JADX WARN: Code duplicated, block: B:64:0x013a  */
    /* JADX WARN: Code duplicated, block: B:66:0x013f  */
    /* JADX WARN: Code duplicated, block: B:68:0x0144  */
    /* JADX WARN: Code duplicated, block: B:70:0x014b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0174  */
    /* JADX WARN: Code duplicated, block: B:75:0x017e  */
    /* JADX WARN: Code duplicated, block: B:78:0x018c A[LOOP:3: B:76:0x0184->B:78:0x018c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x01ae  */
    public final void C(boolean z2, boolean z3, boolean z4, boolean z5) {
        long j;
        boolean z6;
        Timeline playlistTimeline;
        MediaSource.MediaPeriodId mediaPeriodId;
        PlaybackInfo playbackInfo;
        TrackGroupArray trackGroupArray;
        TrackSelectorResult trackSelectorResult;
        List listX;
        MediaPeriodQueue mediaPeriodQueue;
        int i2;
        this.i0.removeMessages(2);
        this.S0 = null;
        i0(false, true);
        DefaultMediaClock defaultMediaClock = this.p0;
        defaultMediaClock.g0 = false;
        StandaloneMediaClock standaloneMediaClock = defaultMediaClock.X;
        if (standaloneMediaClock.f5987Y) {
            standaloneMediaClock.a(standaloneMediaClock.getPositionUs());
            standaloneMediaClock.f5987Y = false;
        }
        this.O0 = 1000000000000L;
        for (Renderer renderer : this.X) {
            try {
                d(renderer);
            } catch (ExoPlaybackException | RuntimeException e2) {
                Log.d("ExoPlayerImplInternal", "Disable failed.", e2);
            }
        }
        if (z2) {
            for (Renderer renderer2 : this.X) {
                if (this.f5894Y.remove(renderer2)) {
                    try {
                        renderer2.reset();
                    } catch (RuntimeException e3) {
                        Log.d("ExoPlayerImplInternal", "Reset failed.", e3);
                    }
                }
            }
        }
        this.M0 = 0;
        PlaybackInfo playbackInfo2 = this.z0;
        MediaSource.MediaPeriodId mediaPeriodId2 = playbackInfo2.f5963b;
        long jLongValue = playbackInfo2.s;
        if (this.z0.f5963b.b()) {
            j = this.z0.f5964c;
        } else {
            PlaybackInfo playbackInfo3 = this.z0;
            Timeline.Period period = this.m0;
            MediaSource.MediaPeriodId mediaPeriodId3 = playbackInfo3.f5963b;
            Timeline timeline = playbackInfo3.f5962a;
            if (timeline.p() || timeline.g(mediaPeriodId3.f6384a, period).f) {
                j = this.z0.f5964c;
            } else {
                j = this.z0.s;
            }
        }
        if (z3) {
            this.N0 = null;
            Pair pairJ = j(this.z0.f5962a);
            mediaPeriodId2 = (MediaSource.MediaPeriodId) pairJ.first;
            jLongValue = ((Long) pairJ.second).longValue();
            j = -9223372036854775807L;
            z6 = mediaPeriodId2.equals(this.z0.f5963b) ? false : true;
        }
        long j2 = jLongValue;
        long j3 = j;
        this.t0.b();
        this.G0 = false;
        Timeline timeline2 = this.z0.f5962a;
        if (z4 && (timeline2 instanceof PlaylistTimeline)) {
            PlaylistTimeline playlistTimeline2 = (PlaylistTimeline) timeline2;
            ShuffleOrder shuffleOrder = this.u0.j;
            Timeline[] timelineArr = playlistTimeline2.f5979i;
            Timeline[] timelineArr2 = new Timeline[timelineArr.length];
            for (int i3 = 0; i3 < timelineArr.length; i3++) {
                timelineArr2[i3] = new ForwardingTimeline(timelineArr[i3]) { // from class: androidx.media3.exoplayer.PlaylistTimeline.1

                    /* JADX INFO: renamed from: c */
                    public final Timeline.Window f5980c = new Timeline.Window();

                    public AnonymousClass1(Timeline timeline3) {
                        super(timeline3);
                        this.f5980c = new Timeline.Window();
                    }

                    @Override // androidx.media3.exoplayer.source.ForwardingTimeline, androidx.media3.common.Timeline
                    public final Timeline.Period f(int i4, Timeline.Period period2, boolean z7) {
                        Timeline timeline3 = this.f6366b;
                        Timeline.Period periodF = timeline3.f(i4, period2, z7);
                        if (timeline3.m(periodF.f5510c, this.f5980c, 0L).a()) {
                            periodF.h(period2.f5508a, period2.f5509b, period2.f5510c, period2.d, period2.f5511e, AdPlaybackState.f5367c, true);
                            return periodF;
                        }
                        periodF.f = true;
                        return periodF;
                    }
                };
            }
            playlistTimeline = new PlaylistTimeline(timelineArr2, playlistTimeline2.j, shuffleOrder);
            if (mediaPeriodId2.f6385b != -1) {
                playlistTimeline.g(mediaPeriodId2.f6384a, this.m0);
                int i4 = this.m0.f5510c;
                Timeline.Window window = this.l0;
                playlistTimeline.m(i4, window, 0L);
                if (window.a()) {
                    mediaPeriodId = new MediaSource.MediaPeriodId(mediaPeriodId2.f6384a, mediaPeriodId2.d);
                }
            }
            playbackInfo = this.z0;
            int i5 = playbackInfo.f5965e;
            ExoPlaybackException exoPlaybackException = z5 ? null : playbackInfo.f;
            if (z6) {
                trackGroupArray = TrackGroupArray.d;
            } else {
                trackGroupArray = playbackInfo.f5966h;
            }
            TrackGroupArray trackGroupArray2 = trackGroupArray;
            if (z6) {
                trackSelectorResult = this.f0;
            } else {
                trackSelectorResult = playbackInfo.f5967i;
            }
            TrackSelectorResult trackSelectorResult2 = trackSelectorResult;
            if (z6) {
                listX = ImmutableList.x();
            } else {
                listX = playbackInfo.j;
            }
            List list = listX;
            PlaybackInfo playbackInfo4 = this.z0;
            this.z0 = new PlaybackInfo(playlistTimeline, mediaPeriodId, j3, j2, i5, exoPlaybackException, false, trackGroupArray2, trackSelectorResult2, list, mediaPeriodId, playbackInfo4.f5968l, playbackInfo4.m, playbackInfo4.f5969n, playbackInfo4.o, j2, 0L, j2, 0L, false);
            if (z4) {
                mediaPeriodQueue = this.t0;
                if (!mediaPeriodQueue.f5944p.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (i2 = 0; i2 < mediaPeriodQueue.f5944p.size(); i2++) {
                        ((MediaPeriodHolder) mediaPeriodQueue.f5944p.get(i2)).g();
                    }
                    mediaPeriodQueue.f5944p = arrayList;
                }
                MediaSourceList mediaSourceList = this.u0;
                HashMap map = mediaSourceList.f;
                for (MediaSourceList.MediaSourceAndListener mediaSourceAndListener : map.values()) {
                    try {
                        mediaSourceAndListener.f5953a.Q(mediaSourceAndListener.f5954b);
                    } catch (RuntimeException e4) {
                        Log.d("MediaSourceList", "Failed to release child source.", e4);
                    }
                    MediaSource mediaSource = mediaSourceAndListener.f5953a;
                    MediaSourceList.ForwardingEventListener forwardingEventListener = mediaSourceAndListener.f5955c;
                    mediaSource.x(forwardingEventListener);
                    mediaSourceAndListener.f5953a.F(forwardingEventListener);
                }
                map.clear();
                mediaSourceList.g.clear();
                mediaSourceList.k = false;
            }
        }
        playlistTimeline = timeline2;
        mediaPeriodId = mediaPeriodId2;
        playbackInfo = this.z0;
        int i6 = playbackInfo.f5965e;
        ExoPlaybackException exoPlaybackException2 = z5 ? null : playbackInfo.f;
        if (z6) {
            trackGroupArray = TrackGroupArray.d;
        } else {
            trackGroupArray = playbackInfo.f5966h;
        }
        TrackGroupArray trackGroupArray3 = trackGroupArray;
        if (z6) {
            trackSelectorResult = this.f0;
        } else {
            trackSelectorResult = playbackInfo.f5967i;
        }
        TrackSelectorResult trackSelectorResult3 = trackSelectorResult;
        if (z6) {
            listX = ImmutableList.x();
        } else {
            listX = playbackInfo.j;
        }
        List list2 = listX;
        PlaybackInfo playbackInfo5 = this.z0;
        this.z0 = new PlaybackInfo(playlistTimeline, mediaPeriodId, j3, j2, i6, exoPlaybackException2, false, trackGroupArray3, trackSelectorResult3, list2, mediaPeriodId, playbackInfo5.f5968l, playbackInfo5.m, playbackInfo5.f5969n, playbackInfo5.o, j2, 0L, j2, 0L, false);
        if (z4) {
            mediaPeriodQueue = this.t0;
            if (!mediaPeriodQueue.f5944p.isEmpty()) {
                ArrayList arrayList2 = new ArrayList();
                while (i2 < mediaPeriodQueue.f5944p.size()) {
                    ((MediaPeriodHolder) mediaPeriodQueue.f5944p.get(i2)).g();
                }
                mediaPeriodQueue.f5944p = arrayList2;
            }
            MediaSourceList mediaSourceList2 = this.u0;
            HashMap map2 = mediaSourceList2.f;
            while (r5.hasNext()) {
                mediaSourceAndListener.f5953a.Q(mediaSourceAndListener.f5954b);
                MediaSource mediaSource2 = mediaSourceAndListener.f5953a;
                MediaSourceList.ForwardingEventListener forwardingEventListener2 = mediaSourceAndListener.f5955c;
                mediaSource2.x(forwardingEventListener2);
                mediaSourceAndListener.f5953a.F(forwardingEventListener2);
            }
            map2.clear();
            mediaSourceList2.g.clear();
            mediaSourceList2.k = false;
        }
    }

    public final void D() {
        MediaPeriodHolder mediaPeriodHolder = this.t0.f5941i;
        this.D0 = mediaPeriodHolder != null && mediaPeriodHolder.f.f5934h && this.C0;
    }

    public final void E(long j) {
        MediaPeriodHolder mediaPeriodHolder = this.t0.f5941i;
        long j2 = j + (mediaPeriodHolder == null ? 1000000000000L : mediaPeriodHolder.o);
        this.O0 = j2;
        this.p0.X.a(j2);
        for (Renderer renderer : this.X) {
            if (s(renderer)) {
                renderer.resetPosition(this.O0);
            }
        }
        for (MediaPeriodHolder mediaPeriodHolder2 = r0.f5941i; mediaPeriodHolder2 != null; mediaPeriodHolder2 = mediaPeriodHolder2.f5928l) {
            for (ExoTrackSelection exoTrackSelection : mediaPeriodHolder2.f5929n.f6541c) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.a();
                }
            }
        }
    }

    public final void F(Timeline timeline, Timeline timeline2) {
        if (timeline.p() && timeline2.p()) {
            return;
        }
        ArrayList arrayList = this.q0;
        int size = arrayList.size() - 1;
        if (size < 0) {
            Collections.sort(arrayList);
        } else {
            ((PendingMessageInfo) arrayList.get(size)).getClass();
            throw null;
        }
    }

    public final void I(long j) {
        this.i0.c(j + ((this.z0.f5965e != 3 || Z()) ? V0 : 1000L));
    }

    public final void J(boolean z2) throws ExoPlaybackException {
        MediaSource.MediaPeriodId mediaPeriodId = this.t0.f5941i.f.f5930a;
        long jL = L(mediaPeriodId, this.z0.s, true, false);
        if (jL != this.z0.s) {
            PlaybackInfo playbackInfo = this.z0;
            this.z0 = q(mediaPeriodId, jL, playbackInfo.f5964c, playbackInfo.d, z2, 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:105:0x00c7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x00a0 A[Catch: all -> 0x00a3, TryCatch #1 {all -> 0x00a3, blocks: (B:21:0x0096, B:23:0x00a0, B:30:0x00ac, B:32:0x00b2, B:33:0x00b5, B:35:0x00bd, B:40:0x00cd, B:44:0x00d5), top: B:100:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ac A[Catch: all -> 0x00a3, TryCatch #1 {all -> 0x00a3, blocks: (B:21:0x0096, B:23:0x00a0, B:30:0x00ac, B:32:0x00b2, B:33:0x00b5, B:35:0x00bd, B:40:0x00cd, B:44:0x00d5), top: B:100:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00b2 A[Catch: all -> 0x00a3, TryCatch #1 {all -> 0x00a3, blocks: (B:21:0x0096, B:23:0x00a0, B:30:0x00ac, B:32:0x00b2, B:33:0x00b5, B:35:0x00bd, B:40:0x00cd, B:44:0x00d5), top: B:100:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00bd A[Catch: all -> 0x00a3, TRY_LEAVE, TryCatch #1 {all -> 0x00a3, blocks: (B:21:0x0096, B:23:0x00a0, B:30:0x00ac, B:32:0x00b2, B:33:0x00b5, B:35:0x00bd, B:40:0x00cd, B:44:0x00d5), top: B:100:0x0096 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x00de  */
    /* JADX WARN: Code duplicated, block: B:63:0x0117  */
    /* JADX WARN: Code duplicated, block: B:66:0x0121  */
    /* JADX WARN: Code duplicated, block: B:67:0x0123  */
    /* JADX WARN: Code duplicated, block: B:70:0x012c  */
    /* JADX WARN: Code duplicated, block: B:72:0x012f  */
    /* JADX WARN: Code duplicated, block: B:76:0x0139  */
    /* JADX WARN: Code duplicated, block: B:77:0x013c  */
    /* JADX WARN: Type inference failed for: r0v17, types: [androidx.media3.exoplayer.source.MediaPeriod, java.lang.Object] */
    public final void K(SeekPosition seekPosition) throws Throwable {
        long jLongValue;
        MediaSource.MediaPeriodId mediaPeriodIdM;
        long j;
        boolean z2;
        long j2;
        long j3;
        MediaPeriodHolder mediaPeriodHolder;
        long jC;
        PlaybackInfo playbackInfo;
        int i2;
        long j4;
        MediaSource.MediaPeriodId mediaPeriodId;
        int i3;
        long j5;
        boolean z3;
        MediaPeriodQueue mediaPeriodQueue;
        boolean z4;
        long jL;
        boolean z5;
        MediaSource.MediaPeriodId mediaPeriodId2;
        long j6;
        ExoPlayerImplInternal exoPlayerImplInternal = this;
        exoPlayerImplInternal.A0.a(1);
        Pair pairG = G(exoPlayerImplInternal.z0.f5962a, seekPosition, true, exoPlayerImplInternal.H0, exoPlayerImplInternal.I0, exoPlayerImplInternal.l0, exoPlayerImplInternal.m0);
        try {
            if (pairG != null) {
                Object obj = pairG.first;
                jLongValue = ((Long) pairG.second).longValue();
                long j7 = seekPosition.f5909c == -9223372036854775807L ? -9223372036854775807L : jLongValue;
                mediaPeriodIdM = exoPlayerImplInternal.t0.m(exoPlayerImplInternal.z0.f5962a, obj, jLongValue);
                if (mediaPeriodIdM.b()) {
                    exoPlayerImplInternal.z0.f5962a.g(mediaPeriodIdM.f6384a, exoPlayerImplInternal.m0);
                    if (exoPlayerImplInternal.m0.e(mediaPeriodIdM.f6385b) == mediaPeriodIdM.f6386c) {
                        exoPlayerImplInternal.m0.g.getClass();
                    }
                    z2 = true;
                    j2 = j7;
                    jLongValue = 0;
                } else {
                    j = 0;
                    z2 = seekPosition.f5909c == -9223372036854775807L;
                    j2 = j7;
                }
                if (exoPlayerImplInternal.z0.f5962a.p()) {
                    if (pairG == null) {
                        if (exoPlayerImplInternal.z0.f5965e != 1) {
                            exoPlayerImplInternal.Y(4);
                        }
                        exoPlayerImplInternal.C(false, true, false, true);
                    } else {
                        if (mediaPeriodIdM.equals(exoPlayerImplInternal.z0.f5963b)) {
                            try {
                                try {
                                    mediaPeriodHolder = exoPlayerImplInternal.t0.f5941i;
                                    if (mediaPeriodHolder == null && mediaPeriodHolder.d && jLongValue != j) {
                                        jC = mediaPeriodHolder.f5922a.c(jLongValue, exoPlayerImplInternal.y0);
                                    } else {
                                        jC = jLongValue;
                                    }
                                    if (Util.T(jC) != Util.T(exoPlayerImplInternal.z0.s) && ((i2 = (playbackInfo = exoPlayerImplInternal.z0).f5965e) == 2 || i2 == 3)) {
                                        j4 = playbackInfo.s;
                                        z2 = z2;
                                        mediaPeriodId = mediaPeriodIdM;
                                        i3 = 2;
                                        j5 = j4;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    z2 = z2;
                                    mediaPeriodIdM = mediaPeriodIdM;
                                    j3 = jLongValue;
                                    j2 = j2;
                                    exoPlayerImplInternal.z0 = exoPlayerImplInternal.q(mediaPeriodIdM, j3, j2, j3, z2, 2);
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                mediaPeriodIdM = mediaPeriodIdM;
                                j3 = jLongValue;
                                exoPlayerImplInternal.z0 = exoPlayerImplInternal.q(mediaPeriodIdM, j3, j2, j3, z2, 2);
                                throw th;
                            }
                        } else {
                            jC = jLongValue;
                        }
                        try {
                            if (exoPlayerImplInternal.z0.f5965e == 4) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            mediaPeriodQueue = exoPlayerImplInternal.t0;
                            if (mediaPeriodQueue.f5941i != mediaPeriodQueue.j) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            jL = exoPlayerImplInternal.L(mediaPeriodIdM, jC, z4, z3);
                            if (jLongValue != jL) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            z2 |= z5;
                            try {
                                PlaybackInfo playbackInfo2 = exoPlayerImplInternal.z0;
                                mediaPeriodId2 = mediaPeriodIdM;
                                try {
                                    Timeline timeline = playbackInfo2.f5962a;
                                    j6 = j2;
                                    try {
                                        exoPlayerImplInternal.h0(timeline, mediaPeriodId2, timeline, playbackInfo2.f5963b, j6, true);
                                        mediaPeriodId = mediaPeriodId2;
                                        j2 = j6;
                                        j4 = jL;
                                        i3 = 2;
                                        j5 = j4;
                                        exoPlayerImplInternal = this;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        mediaPeriodIdM = mediaPeriodId2;
                                        j2 = j6;
                                        j3 = jL;
                                        exoPlayerImplInternal.z0 = exoPlayerImplInternal.q(mediaPeriodIdM, j3, j2, j3, z2, 2);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    mediaPeriodIdM = mediaPeriodId2;
                                    j2 = j2;
                                    j3 = jL;
                                    exoPlayerImplInternal.z0 = exoPlayerImplInternal.q(mediaPeriodIdM, j3, j2, j3, z2, 2);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            j2 = j2;
                            j3 = jLongValue;
                            exoPlayerImplInternal.z0 = exoPlayerImplInternal.q(mediaPeriodIdM, j3, j2, j3, z2, 2);
                            throw th;
                        }
                    }
                    exoPlayerImplInternal.z0 = exoPlayerImplInternal.q(mediaPeriodId, j4, j2, j5, z2, i3);
                    return;
                }
                exoPlayerImplInternal.N0 = seekPosition;
                z2 = z2;
                mediaPeriodId = mediaPeriodIdM;
                j4 = jLongValue;
                i3 = 2;
                j5 = j4;
                exoPlayerImplInternal = this;
                exoPlayerImplInternal.z0 = exoPlayerImplInternal.q(mediaPeriodId, j4, j2, j5, z2, i3);
                return;
            }
            Pair pairJ = exoPlayerImplInternal.j(exoPlayerImplInternal.z0.f5962a);
            mediaPeriodIdM = (MediaSource.MediaPeriodId) pairJ.first;
            jLongValue = ((Long) pairJ.second).longValue();
            z2 = !exoPlayerImplInternal.z0.f5962a.p();
            j2 = -9223372036854775807L;
            if (exoPlayerImplInternal.z0.f5962a.p()) {
                if (pairG == null) {
                    if (exoPlayerImplInternal.z0.f5965e != 1) {
                        exoPlayerImplInternal.Y(4);
                    }
                    exoPlayerImplInternal.C(false, true, false, true);
                } else {
                    if (mediaPeriodIdM.equals(exoPlayerImplInternal.z0.f5963b)) {
                        mediaPeriodHolder = exoPlayerImplInternal.t0.f5941i;
                        if (mediaPeriodHolder == null) {
                            jC = jLongValue;
                        } else {
                            jC = jLongValue;
                        }
                        if (Util.T(jC) != Util.T(exoPlayerImplInternal.z0.s)) {
                        }
                    } else {
                        jC = jLongValue;
                    }
                    if (exoPlayerImplInternal.z0.f5965e == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    mediaPeriodQueue = exoPlayerImplInternal.t0;
                    if (mediaPeriodQueue.f5941i != mediaPeriodQueue.j) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    jL = exoPlayerImplInternal.L(mediaPeriodIdM, jC, z4, z3);
                    if (jLongValue != jL) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z2 |= z5;
                    PlaybackInfo playbackInfo3 = exoPlayerImplInternal.z0;
                    mediaPeriodId2 = mediaPeriodIdM;
                    Timeline timeline2 = playbackInfo3.f5962a;
                    j6 = j2;
                    exoPlayerImplInternal.h0(timeline2, mediaPeriodId2, timeline2, playbackInfo3.f5963b, j6, true);
                    mediaPeriodId = mediaPeriodId2;
                    j2 = j6;
                    j4 = jL;
                    i3 = 2;
                    j5 = j4;
                    exoPlayerImplInternal = this;
                }
                exoPlayerImplInternal.z0 = exoPlayerImplInternal.q(mediaPeriodId, j4, j2, j5, z2, i3);
                return;
            }
            exoPlayerImplInternal.N0 = seekPosition;
            z2 = z2;
            mediaPeriodId = mediaPeriodIdM;
            j4 = jLongValue;
            i3 = 2;
            j5 = j4;
            exoPlayerImplInternal = this;
            exoPlayerImplInternal.z0 = exoPlayerImplInternal.q(mediaPeriodId, j4, j2, j5, z2, i3);
            return;
        } catch (Throwable th7) {
            th = th7;
        }
        j = 0;
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [androidx.media3.exoplayer.source.MediaPeriod, java.lang.Object] */
    public final long L(MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z2, boolean z3) throws ExoPlaybackException {
        d0();
        i0(false, true);
        if (z3 || this.z0.f5965e == 3) {
            Y(2);
        }
        MediaPeriodQueue mediaPeriodQueue = this.t0;
        MediaPeriodHolder mediaPeriodHolder = mediaPeriodQueue.f5941i;
        MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodHolder;
        while (mediaPeriodHolder2 != null && !mediaPeriodId.equals(mediaPeriodHolder2.f.f5930a)) {
            mediaPeriodHolder2 = mediaPeriodHolder2.f5928l;
        }
        if (z2 || mediaPeriodHolder != mediaPeriodHolder2 || (mediaPeriodHolder2 != null && mediaPeriodHolder2.o + j < 0)) {
            Renderer[] rendererArr = this.X;
            for (Renderer renderer : rendererArr) {
                d(renderer);
            }
            if (mediaPeriodHolder2 != null) {
                while (mediaPeriodQueue.f5941i != mediaPeriodHolder2) {
                    mediaPeriodQueue.a();
                }
                mediaPeriodQueue.k(mediaPeriodHolder2);
                mediaPeriodHolder2.o = 1000000000000L;
                g(new boolean[rendererArr.length], mediaPeriodQueue.j.e());
            }
        }
        if (mediaPeriodHolder2 != null) {
            mediaPeriodQueue.k(mediaPeriodHolder2);
            if (!mediaPeriodHolder2.d) {
                mediaPeriodHolder2.f = mediaPeriodHolder2.f.b(j);
            } else if (mediaPeriodHolder2.f5925e) {
                ?? r9 = mediaPeriodHolder2.f5922a;
                j = r9.seekToUs(j);
                r9.discardBuffer(j - this.n0, this.o0);
            }
            E(j);
            u();
        } else {
            mediaPeriodQueue.b();
            E(j);
        }
        m(false);
        this.i0.sendEmptyMessage(2);
        return j;
    }

    public final void M(PlayerMessage playerMessage) {
        Looper looper = playerMessage.f;
        Looper looper2 = this.k0;
        HandlerWrapper handlerWrapper = this.i0;
        if (looper != looper2) {
            handlerWrapper.obtainMessage(15, playerMessage).a();
            return;
        }
        synchronized (playerMessage) {
        }
        try {
            playerMessage.f5971a.handleMessage(playerMessage.d, playerMessage.f5974e);
            playerMessage.b(true);
            int i2 = this.z0.f5965e;
            if (i2 == 3 || i2 == 2) {
                handlerWrapper.sendEmptyMessage(2);
            }
        } catch (Throwable th) {
            playerMessage.b(true);
            throw th;
        }
    }

    public final void N(PlayerMessage playerMessage) {
        Looper looper = playerMessage.f;
        if (looper.getThread().isAlive()) {
            this.r0.createHandler(looper, null).post(new n(1, this, playerMessage));
        } else {
            Log.g("TAG", "Trying to send message on a dead thread.");
            playerMessage.b(false);
        }
    }

    public final void P(boolean z2, AtomicBoolean atomicBoolean) {
        if (this.J0 != z2) {
            this.J0 = z2;
            if (!z2) {
                for (Renderer renderer : this.X) {
                    if (!s(renderer) && this.f5894Y.remove(renderer)) {
                        renderer.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    public final void Q(MediaSourceListUpdateMessage mediaSourceListUpdateMessage) throws Throwable {
        this.A0.a(1);
        int i2 = mediaSourceListUpdateMessage.f5898c;
        ArrayList arrayList = mediaSourceListUpdateMessage.f5896a;
        ShuffleOrder shuffleOrder = mediaSourceListUpdateMessage.f5897b;
        if (i2 != -1) {
            this.N0 = new SeekPosition(new PlaylistTimeline(arrayList, shuffleOrder), mediaSourceListUpdateMessage.f5898c, mediaSourceListUpdateMessage.d);
        }
        MediaSourceList mediaSourceList = this.u0;
        ArrayList arrayList2 = mediaSourceList.f5946b;
        mediaSourceList.g(0, arrayList2.size());
        n(mediaSourceList.a(arrayList2.size(), arrayList, shuffleOrder), false);
    }

    public final void R(boolean z2) throws ExoPlaybackException {
        this.C0 = z2;
        D();
        if (this.D0) {
            MediaPeriodQueue mediaPeriodQueue = this.t0;
            if (mediaPeriodQueue.j != mediaPeriodQueue.f5941i) {
                J(true);
                m(false);
            }
        }
    }

    public final void S(int i2, int i3, boolean z2, boolean z3) {
        this.A0.a(z3 ? 1 : 0);
        this.z0 = this.z0.d(i3, i2, z2);
        i0(false, false);
        for (MediaPeriodHolder mediaPeriodHolder = this.t0.f5941i; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.f5928l) {
            for (ExoTrackSelection exoTrackSelection : mediaPeriodHolder.f5929n.f6541c) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.b(z2);
                }
            }
        }
        if (!Z()) {
            d0();
            g0();
            return;
        }
        int i4 = this.z0.f5965e;
        HandlerWrapper handlerWrapper = this.i0;
        if (i4 != 3) {
            if (i4 == 2) {
                handlerWrapper.sendEmptyMessage(2);
                return;
            }
            return;
        }
        DefaultMediaClock defaultMediaClock = this.p0;
        defaultMediaClock.g0 = true;
        StandaloneMediaClock standaloneMediaClock = defaultMediaClock.X;
        if (!standaloneMediaClock.f5987Y) {
            standaloneMediaClock.X.getClass();
            standaloneMediaClock.e0 = android.os.SystemClock.elapsedRealtime();
            standaloneMediaClock.f5987Y = true;
        }
        b0();
        handlerWrapper.sendEmptyMessage(2);
    }

    public final void T(PlaybackParameters playbackParameters) {
        this.i0.removeMessages(16);
        DefaultMediaClock defaultMediaClock = this.p0;
        defaultMediaClock.c(playbackParameters);
        PlaybackParameters playbackParameters2 = defaultMediaClock.getPlaybackParameters();
        p(playbackParameters2, playbackParameters2.f5494a, true, true);
    }

    public final void U(ExoPlayer.PreloadConfiguration preloadConfiguration) {
        this.U0 = preloadConfiguration;
        Timeline timeline = this.z0.f5962a;
        MediaPeriodQueue mediaPeriodQueue = this.t0;
        mediaPeriodQueue.o = preloadConfiguration;
        mediaPeriodQueue.o.getClass();
        if (mediaPeriodQueue.f5944p.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < mediaPeriodQueue.f5944p.size(); i2++) {
            ((MediaPeriodHolder) mediaPeriodQueue.f5944p.get(i2)).g();
        }
        mediaPeriodQueue.f5944p = arrayList;
    }

    public final void V(int i2) throws ExoPlaybackException {
        this.H0 = i2;
        Timeline timeline = this.z0.f5962a;
        MediaPeriodQueue mediaPeriodQueue = this.t0;
        mediaPeriodQueue.g = i2;
        if (!mediaPeriodQueue.o(timeline)) {
            J(true);
        }
        m(false);
    }

    public final void W(boolean z2) throws ExoPlaybackException {
        this.I0 = z2;
        Timeline timeline = this.z0.f5962a;
        MediaPeriodQueue mediaPeriodQueue = this.t0;
        mediaPeriodQueue.f5940h = z2;
        if (!mediaPeriodQueue.o(timeline)) {
            J(true);
        }
        m(false);
    }

    public final void X(ShuffleOrder shuffleOrder) throws Throwable {
        this.A0.a(1);
        MediaSourceList mediaSourceList = this.u0;
        int size = mediaSourceList.f5946b.size();
        if (shuffleOrder.getLength() != size) {
            shuffleOrder = shuffleOrder.cloneAndClear().a(size);
        }
        mediaSourceList.j = shuffleOrder;
        n(mediaSourceList.b(), false);
    }

    public final void Y(int i2) {
        PlaybackInfo playbackInfo = this.z0;
        if (playbackInfo.f5965e != i2) {
            if (i2 != 2) {
                this.T0 = -9223372036854775807L;
            }
            this.z0 = playbackInfo.g(i2);
        }
    }

    public final boolean Z() {
        PlaybackInfo playbackInfo = this.z0;
        return playbackInfo.f5968l && playbackInfo.f5969n == 0;
    }

    @Override // androidx.media3.exoplayer.PlayerMessage.Sender
    public final synchronized void a(PlayerMessage playerMessage) {
        if (!this.B0 && this.k0.getThread().isAlive()) {
            this.i0.obtainMessage(14, playerMessage).a();
            return;
        }
        Log.g("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        playerMessage.b(false);
    }

    public final boolean a0(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        if (mediaPeriodId.b() || timeline.p()) {
            return false;
        }
        int i2 = timeline.g(mediaPeriodId.f6384a, this.m0).f5510c;
        Timeline.Window window = this.l0;
        timeline.n(i2, window);
        return window.a() && window.f5517h && window.f5516e != -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.MediaPeriod.Callback
    public final void b(MediaPeriod mediaPeriod) {
        this.i0.obtainMessage(8, mediaPeriod).a();
    }

    public final void b0() {
        MediaPeriodHolder mediaPeriodHolder = this.t0.f5941i;
        if (mediaPeriodHolder == null) {
            return;
        }
        TrackSelectorResult trackSelectorResult = mediaPeriodHolder.f5929n;
        int i2 = 0;
        while (true) {
            Renderer[] rendererArr = this.X;
            if (i2 >= rendererArr.length) {
                return;
            }
            if (trackSelectorResult.b(i2) && rendererArr[i2].getState() == 1) {
                rendererArr[i2].start();
            }
            i2++;
        }
    }

    public final void c(MediaSourceListUpdateMessage mediaSourceListUpdateMessage, int i2) throws Throwable {
        this.A0.a(1);
        MediaSourceList mediaSourceList = this.u0;
        if (i2 == -1) {
            i2 = mediaSourceList.f5946b.size();
        }
        n(mediaSourceList.a(i2, mediaSourceListUpdateMessage.f5896a, mediaSourceListUpdateMessage.f5897b), false);
    }

    public final void c0(boolean z2, boolean z3) {
        C(z2 || !this.J0, false, true, false);
        this.A0.a(z3 ? 1 : 0);
        this.g0.e(this.x0);
        Y(1);
    }

    public final void d(Renderer renderer) {
        if (s(renderer)) {
            DefaultMediaClock defaultMediaClock = this.p0;
            if (renderer == defaultMediaClock.Z) {
                defaultMediaClock.e0 = null;
                defaultMediaClock.Z = null;
                defaultMediaClock.f0 = true;
            }
            if (renderer.getState() == 2) {
                renderer.stop();
            }
            renderer.disable();
            this.M0--;
        }
    }

    public final void d0() {
        DefaultMediaClock defaultMediaClock = this.p0;
        defaultMediaClock.g0 = false;
        StandaloneMediaClock standaloneMediaClock = defaultMediaClock.X;
        if (standaloneMediaClock.f5987Y) {
            standaloneMediaClock.a(standaloneMediaClock.getPositionUs());
            standaloneMediaClock.f5987Y = false;
        }
        for (Renderer renderer : this.X) {
            if (s(renderer) && renderer.getState() == 2) {
                renderer.stop();
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.SequenceableLoader.Callback
    public final void e(SequenceableLoader sequenceableLoader) {
        this.i0.obtainMessage(9, (MediaPeriod) sequenceableLoader).a();
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [androidx.media3.exoplayer.source.SequenceableLoader, java.lang.Object] */
    public final void e0() {
        MediaPeriodHolder mediaPeriodHolder = this.t0.k;
        boolean z2 = this.G0 || (mediaPeriodHolder != null && mediaPeriodHolder.f5922a.isLoading());
        PlaybackInfo playbackInfo = this.z0;
        if (z2 != playbackInfo.g) {
            this.z0 = new PlaybackInfo(playbackInfo.f5962a, playbackInfo.f5963b, playbackInfo.f5964c, playbackInfo.d, playbackInfo.f5965e, playbackInfo.f, z2, playbackInfo.f5966h, playbackInfo.f5967i, playbackInfo.j, playbackInfo.k, playbackInfo.f5968l, playbackInfo.m, playbackInfo.f5969n, playbackInfo.o, playbackInfo.q, playbackInfo.r, playbackInfo.s, playbackInfo.t, playbackInfo.f5970p);
        }
    }

    /* JADX WARN: Code duplicated, block: B:228:0x03db  */
    /* JADX WARN: Code duplicated, block: B:27:0x0071  */
    /* JADX WARN: Code duplicated, block: B:316:0x051d  */
    /* JADX WARN: Code duplicated, block: B:354:0x05ed  */
    /* JADX WARN: Code duplicated, block: B:364:0x0611  */
    /* JADX WARN: Code duplicated, block: B:366:0x0617  */
    /* JADX WARN: Code duplicated, block: B:368:0x061f  */
    /* JADX WARN: Code duplicated, block: B:370:0x0623  */
    /* JADX WARN: Code duplicated, block: B:376:0x0635  */
    /* JADX WARN: Code duplicated, block: B:385:0x0654  */
    /* JADX WARN: Code duplicated, block: B:388:0x065a  */
    /* JADX WARN: Code duplicated, block: B:401:0x0691  */
    /* JADX WARN: Code duplicated, block: B:403:0x0694  */
    /* JADX WARN: Code duplicated, block: B:404:0x069c  */
    /* JADX WARN: Code duplicated, block: B:406:0x06a7  */
    /* JADX WARN: Code duplicated, block: B:407:0x06b3  */
    /* JADX WARN: Code duplicated, block: B:414:0x06d4  */
    /* JADX WARN: Code duplicated, block: B:421:0x06e0  */
    /* JADX WARN: Code duplicated, block: B:424:0x06e7  */
    /* JADX WARN: Code duplicated, block: B:425:0x0740  */
    /* JADX WARN: Code duplicated, block: B:441:0x0762  */
    /* JADX WARN: Code duplicated, block: B:466:0x067a A[EDGE_INSN: B:466:0x067a->B:394:0x067a BREAK  A[LOOP:5: B:386:0x0655->B:393:0x0677], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:473:0x0626 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x017d  */
    /* JADX WARN: Instruction removed from duplicated block: B:366:0x0617, please report this as an issue */
    /* JADX WARN: Type inference failed for: r1v55, types: [androidx.media3.exoplayer.source.MediaPeriod, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1, types: [androidx.media3.exoplayer.source.MediaPeriod, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v78, types: [androidx.media3.exoplayer.source.MediaPeriod, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v12, types: [androidx.media3.exoplayer.source.MediaPeriod, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v69, types: [androidx.media3.exoplayer.source.SequenceableLoader, java.lang.Object] */
    public final void f() throws ExoPlaybackException {
        long j;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        MediaPeriodHolder mediaPeriodHolder;
        DefaultLivePlaybackSpeedControl defaultLivePlaybackSpeedControl;
        long j2;
        long j3;
        int i2;
        boolean zT;
        boolean z6;
        boolean z7;
        PlaybackInfo playbackInfo;
        boolean z8;
        boolean z9;
        int i3;
        int i4;
        Renderer[] rendererArr;
        PlaybackInfo playbackInfo2;
        MediaPeriodHolder mediaPeriodHolder2;
        boolean z10;
        MediaPeriodQueue mediaPeriodQueue;
        MediaPeriodHolder mediaPeriodHolder3;
        MediaPeriodHolder mediaPeriodHolder4;
        boolean z11;
        Renderer[] rendererArr2;
        this.r0.getClass();
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        this.i0.removeMessages(2);
        long j4 = -9223372036854775807L;
        if (this.z0.f5962a.p() || !this.u0.k) {
            j = -9223372036854775807L;
            z2 = true;
        } else {
            MediaPeriodQueue mediaPeriodQueue2 = this.t0;
            long j5 = this.O0;
            MediaPeriodHolder mediaPeriodHolder5 = mediaPeriodQueue2.k;
            if (mediaPeriodHolder5 != null) {
                Assertions.e(mediaPeriodHolder5.f5928l == null);
                if (mediaPeriodHolder5.d) {
                    mediaPeriodHolder5.f5922a.reevaluateBuffer(j5 - mediaPeriodHolder5.o);
                }
            }
            MediaPeriodQueue mediaPeriodQueue3 = this.t0;
            MediaPeriodHolder mediaPeriodHolder6 = mediaPeriodQueue3.k;
            if (mediaPeriodHolder6 == null || (!mediaPeriodHolder6.f.f5935i && mediaPeriodHolder6.f() && mediaPeriodQueue3.k.f.f5933e != -9223372036854775807L && mediaPeriodQueue3.f5942l < 100)) {
                MediaPeriodQueue mediaPeriodQueue4 = this.t0;
                long j6 = this.O0;
                PlaybackInfo playbackInfo3 = this.z0;
                MediaPeriodHolder mediaPeriodHolder7 = mediaPeriodQueue4.k;
                MediaPeriodInfo mediaPeriodInfoD = mediaPeriodHolder7 == null ? mediaPeriodQueue4.d(playbackInfo3.f5962a, playbackInfo3.f5963b, playbackInfo3.f5964c, playbackInfo3.s) : mediaPeriodQueue4.c(playbackInfo3.f5962a, mediaPeriodHolder7, j6);
                if (mediaPeriodInfoD != null) {
                    MediaPeriodQueue mediaPeriodQueue5 = this.t0;
                    MediaPeriodHolder mediaPeriodHolder8 = mediaPeriodQueue5.k;
                    long j7 = mediaPeriodHolder8 == null ? 1000000000000L : (mediaPeriodHolder8.o + mediaPeriodHolder8.f.f5933e) - mediaPeriodInfoD.f5931b;
                    int i5 = 0;
                    while (true) {
                        if (i5 >= mediaPeriodQueue5.f5944p.size()) {
                            j = j4;
                            mediaPeriodHolder2 = null;
                            break;
                        }
                        MediaPeriodInfo mediaPeriodInfo = ((MediaPeriodHolder) mediaPeriodQueue5.f5944p.get(i5)).f;
                        long j8 = mediaPeriodInfo.f5933e;
                        j = j4;
                        if ((j8 == -9223372036854775807L || j8 == mediaPeriodInfoD.f5933e) && mediaPeriodInfo.f5931b == mediaPeriodInfoD.f5931b && mediaPeriodInfo.f5930a.equals(mediaPeriodInfoD.f5930a)) {
                            mediaPeriodHolder2 = (MediaPeriodHolder) mediaPeriodQueue5.f5944p.remove(i5);
                            break;
                        } else {
                            i5++;
                            j4 = j;
                        }
                    }
                    if (mediaPeriodHolder2 == null) {
                        ExoPlayerImplInternal exoPlayerImplInternal = (ExoPlayerImplInternal) mediaPeriodQueue5.f5939e.f6250Y;
                        mediaPeriodHolder2 = new MediaPeriodHolder(exoPlayerImplInternal.Z, j7, exoPlayerImplInternal.e0, exoPlayerImplInternal.g0.getAllocator(), exoPlayerImplInternal.u0, mediaPeriodInfoD, exoPlayerImplInternal.f0);
                    } else {
                        mediaPeriodHolder2.f = mediaPeriodInfoD;
                        mediaPeriodHolder2.o = j7;
                    }
                    MediaPeriodHolder mediaPeriodHolder9 = mediaPeriodQueue5.k;
                    if (mediaPeriodHolder9 == null) {
                        mediaPeriodQueue5.f5941i = mediaPeriodHolder2;
                        mediaPeriodQueue5.j = mediaPeriodHolder2;
                    } else if (mediaPeriodHolder2 != mediaPeriodHolder9.f5928l) {
                        mediaPeriodHolder9.b();
                        mediaPeriodHolder9.f5928l = mediaPeriodHolder2;
                        mediaPeriodHolder9.c();
                    }
                    mediaPeriodQueue5.m = null;
                    mediaPeriodQueue5.k = mediaPeriodHolder2;
                    mediaPeriodQueue5.f5942l++;
                    mediaPeriodQueue5.j();
                    mediaPeriodHolder2.f5922a.f(this, mediaPeriodInfoD.f5931b);
                    if (this.t0.f5941i == mediaPeriodHolder2) {
                        E(mediaPeriodInfoD.f5931b);
                    }
                    m(false);
                } else {
                    j = -9223372036854775807L;
                }
            } else {
                j = -9223372036854775807L;
            }
            if (this.G0) {
                this.G0 = r();
                e0();
            } else {
                u();
            }
            MediaPeriodQueue mediaPeriodQueue6 = this.t0;
            MediaPeriodHolder mediaPeriodHolder10 = mediaPeriodQueue6.j;
            if (mediaPeriodHolder10 == null) {
                z10 = true;
                break;
            }
            MediaPeriodHolder mediaPeriodHolder11 = mediaPeriodHolder10.f5928l;
            Renderer[] rendererArr3 = this.X;
            if (mediaPeriodHolder11 != null && !this.D0) {
                if (!mediaPeriodHolder10.d) {
                    z10 = true;
                    break;
                }
                int i6 = 0;
                while (true) {
                    if (i6 >= rendererArr3.length) {
                        MediaPeriodHolder mediaPeriodHolder12 = mediaPeriodHolder10.f5928l;
                        if (mediaPeriodHolder12.d || this.O0 >= mediaPeriodHolder12.e()) {
                            TrackSelectorResult trackSelectorResult = mediaPeriodHolder10.f5929n;
                            MediaPeriodHolder mediaPeriodHolder13 = mediaPeriodQueue6.j;
                            Assertions.f(mediaPeriodHolder13);
                            mediaPeriodQueue6.j = mediaPeriodHolder13.f5928l;
                            mediaPeriodQueue6.j();
                            MediaPeriodHolder mediaPeriodHolder14 = mediaPeriodQueue6.j;
                            Assertions.f(mediaPeriodHolder14);
                            TrackSelectorResult trackSelectorResult2 = mediaPeriodHolder14.f5929n;
                            Timeline timeline = this.z0.f5962a;
                            z10 = true;
                            h0(timeline, mediaPeriodHolder14.f.f5930a, timeline, mediaPeriodHolder10.f.f5930a, -9223372036854775807L, false);
                            if (mediaPeriodHolder14.d && mediaPeriodHolder14.f5922a.readDiscontinuity() != j) {
                                long jE = mediaPeriodHolder14.e();
                                for (Renderer renderer : rendererArr3) {
                                    if (renderer.getStream() != null) {
                                        O(renderer, jE);
                                    }
                                }
                                if (!mediaPeriodHolder14.f()) {
                                    mediaPeriodQueue6.k(mediaPeriodHolder14);
                                    m(false);
                                    u();
                                    break;
                                }
                                break;
                            }
                            for (int i7 = 0; i7 < rendererArr3.length; i7++) {
                                boolean zB = trackSelectorResult.b(i7);
                                boolean zB2 = trackSelectorResult2.b(i7);
                                if (zB && !rendererArr3[i7].isCurrentStreamFinal()) {
                                    boolean z12 = this.Z[i7].getTrackType() == -2;
                                    RendererConfiguration rendererConfiguration = trackSelectorResult.f6540b[i7];
                                    RendererConfiguration rendererConfiguration2 = trackSelectorResult2.f6540b[i7];
                                    if (!zB2 || !rendererConfiguration2.equals(rendererConfiguration) || z12) {
                                        O(rendererArr3[i7], mediaPeriodHolder14.e());
                                    }
                                }
                            }
                            break;
                        }
                    } else {
                        Renderer renderer2 = rendererArr3[i6];
                        SampleStream sampleStream = mediaPeriodHolder10.f5924c[i6];
                        if (renderer2.getStream() == sampleStream) {
                            if (sampleStream != null && !renderer2.hasReadStreamToEnd()) {
                                MediaPeriodHolder mediaPeriodHolder15 = mediaPeriodHolder10.f5928l;
                                if (!mediaPeriodHolder10.f.f || !mediaPeriodHolder15.d || (!(renderer2 instanceof TextRenderer) && !(renderer2 instanceof MetadataRenderer) && renderer2.e() < mediaPeriodHolder15.e())) {
                                }
                            }
                            i6++;
                        }
                    }
                    z10 = true;
                    break;
                }
            }
            z10 = true;
            if (mediaPeriodHolder10.f.f5935i || this.D0) {
                for (int i8 = 0; i8 < rendererArr3.length; i8++) {
                    Renderer renderer3 = rendererArr3[i8];
                    SampleStream sampleStream2 = mediaPeriodHolder10.f5924c[i8];
                    if (sampleStream2 != null && renderer3.getStream() == sampleStream2 && renderer3.hasReadStreamToEnd()) {
                        long j9 = mediaPeriodHolder10.f.f5933e;
                        O(renderer3, (j9 == j || j9 == Long.MIN_VALUE) ? j : j9 + mediaPeriodHolder10.o);
                    }
                }
            }
            MediaPeriodQueue mediaPeriodQueue7 = this.t0;
            MediaPeriodHolder mediaPeriodHolder16 = mediaPeriodQueue7.j;
            if (mediaPeriodHolder16 != null && mediaPeriodQueue7.f5941i != mediaPeriodHolder16 && !mediaPeriodHolder16.g) {
                TrackSelectorResult trackSelectorResult3 = mediaPeriodHolder16.f5929n;
                int i9 = 0;
                boolean z13 = false;
                while (true) {
                    rendererArr2 = this.X;
                    if (i9 >= rendererArr2.length) {
                        break;
                    }
                    Renderer renderer4 = rendererArr2[i9];
                    if (s(renderer4)) {
                        SampleStream stream = renderer4.getStream();
                        SampleStream[] sampleStreamArr = mediaPeriodHolder16.f5924c;
                        boolean z14 = stream != sampleStreamArr[i9] ? z10 : false;
                        if (!trackSelectorResult3.b(i9) || z14) {
                            if (!renderer4.isCurrentStreamFinal()) {
                                ExoTrackSelection exoTrackSelection = trackSelectorResult3.f6541c[i9];
                                int length = exoTrackSelection != null ? exoTrackSelection.length() : 0;
                                Format[] formatArr = new Format[length];
                                for (int i10 = 0; i10 < length; i10++) {
                                    formatArr[i10] = exoTrackSelection.getFormat(i10);
                                }
                                renderer4.k(formatArr, sampleStreamArr[i9], mediaPeriodHolder16.e(), mediaPeriodHolder16.o, mediaPeriodHolder16.f.f5930a);
                                boolean z15 = this.L0;
                                if (z15 && z15) {
                                    this.L0 = false;
                                    if (this.z0.f5970p) {
                                        this.i0.sendEmptyMessage(2);
                                    }
                                }
                            } else if (renderer4.isEnded()) {
                                d(renderer4);
                            } else {
                                z13 = z10;
                            }
                        }
                    }
                    i9++;
                }
                if (!z13) {
                    g(new boolean[rendererArr2.length], this.t0.j.e());
                }
            }
            boolean z16 = false;
            while (Z() && !this.D0 && (mediaPeriodHolder3 = (mediaPeriodQueue = this.t0).f5941i) != null && (mediaPeriodHolder4 = mediaPeriodHolder3.f5928l) != null && this.O0 >= mediaPeriodHolder4.e() && mediaPeriodHolder4.g) {
                if (z16) {
                    v();
                }
                MediaPeriodHolder mediaPeriodHolderA = mediaPeriodQueue.a();
                mediaPeriodHolderA.getClass();
                if (this.z0.f5963b.f6384a.equals(mediaPeriodHolderA.f.f5930a.f6384a)) {
                    MediaSource.MediaPeriodId mediaPeriodId = this.z0.f5963b;
                    if (mediaPeriodId.f6385b == -1) {
                        MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodHolderA.f.f5930a;
                        if (mediaPeriodId2.f6385b != -1 || mediaPeriodId.f6387e == mediaPeriodId2.f6387e) {
                            z11 = false;
                        } else {
                            z11 = z10;
                        }
                    } else {
                        z11 = false;
                    }
                } else {
                    z11 = false;
                }
                MediaPeriodInfo mediaPeriodInfo2 = mediaPeriodHolderA.f;
                MediaSource.MediaPeriodId mediaPeriodId3 = mediaPeriodInfo2.f5930a;
                boolean z17 = z11;
                long j10 = mediaPeriodInfo2.f5931b;
                boolean z18 = z10;
                this.z0 = q(mediaPeriodId3, j10, mediaPeriodInfo2.f5932c, j10, !z17, 0);
                D();
                g0();
                if (this.z0.f5965e == 3) {
                    b0();
                }
                TrackSelectorResult trackSelectorResult4 = mediaPeriodQueue.f5941i.f5929n;
                int i11 = 0;
                while (true) {
                    Renderer[] rendererArr4 = this.X;
                    if (i11 < rendererArr4.length) {
                        if (trackSelectorResult4.b(i11)) {
                            rendererArr4[i11].b();
                        }
                        i11++;
                    }
                }
                z16 = z18;
                z10 = z16;
            }
            z2 = z10;
            this.U0.getClass();
        }
        int i12 = this.z0.f5965e;
        if (i12 == z2 || i12 == 4) {
            return;
        }
        MediaPeriodHolder mediaPeriodHolder17 = this.t0.f5941i;
        if (mediaPeriodHolder17 == null) {
            I(jUptimeMillis);
            return;
        }
        Trace.beginSection("doSomeWork");
        g0();
        if (mediaPeriodHolder17.d) {
            this.r0.getClass();
            this.P0 = Util.I(android.os.SystemClock.elapsedRealtime());
            mediaPeriodHolder17.f5922a.discardBuffer(this.z0.s - this.n0, this.o0);
            z3 = z2;
            z4 = z3;
            int i13 = 0;
            while (true) {
                Renderer[] rendererArr5 = this.X;
                if (i13 >= rendererArr5.length) {
                    break;
                }
                Renderer renderer5 = rendererArr5[i13];
                if (s(renderer5)) {
                    renderer5.render(this.O0, this.P0);
                    z4 = z4 && renderer5.isEnded();
                    boolean z19 = mediaPeriodHolder17.f5924c[i13] != renderer5.getStream();
                    boolean z20 = z19 || (!z19 && renderer5.hasReadStreamToEnd()) || renderer5.isReady() || renderer5.isEnded();
                    boolean z21 = z3 && z20;
                    if (!z20) {
                        renderer5.maybeThrowStreamError();
                    }
                    z3 = z21;
                }
                i13++;
            }
        } else {
            mediaPeriodHolder17.f5922a.maybeThrowPrepareError();
            z3 = true;
            z4 = true;
        }
        long j11 = mediaPeriodHolder17.f.f5933e;
        boolean z22 = z4 && mediaPeriodHolder17.d && (j11 == j || j11 <= this.z0.s);
        if (z22 && this.D0) {
            this.D0 = false;
            S(this.z0.f5969n, 5, false, false);
        }
        if (!z22 || !mediaPeriodHolder17.f.f5935i) {
            PlaybackInfo playbackInfo4 = this.z0;
            if (playbackInfo4.f5965e != 2) {
                z5 = true;
                if (this.z0.f5965e == 3 && (this.M0 != 0 ? !z3 : !t())) {
                    i0(Z(), false);
                    Y(2);
                    if (this.E0) {
                        for (mediaPeriodHolder = this.t0.f5941i; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.f5928l) {
                            for (ExoTrackSelection exoTrackSelection2 : mediaPeriodHolder.f5929n.f6541c) {
                                if (exoTrackSelection2 != null) {
                                    exoTrackSelection2.c();
                                }
                            }
                        }
                        defaultLivePlaybackSpeedControl = this.v0;
                        j2 = defaultLivePlaybackSpeedControl.f5839i;
                        if (j2 != j) {
                            long j12 = j2 + defaultLivePlaybackSpeedControl.f5835b;
                            defaultLivePlaybackSpeedControl.f5839i = j12;
                            j3 = defaultLivePlaybackSpeedControl.f5838h;
                            if (j3 != j && j12 > j3) {
                                defaultLivePlaybackSpeedControl.f5839i = j3;
                            }
                            defaultLivePlaybackSpeedControl.m = j;
                        }
                    }
                    d0();
                }
            } else {
                if (this.M0 == 0) {
                    zT = t();
                } else if (z3) {
                    if (playbackInfo4.g) {
                        MediaPeriodQueue mediaPeriodQueue8 = this.t0;
                        MediaPeriodHolder mediaPeriodHolder18 = mediaPeriodQueue8.f5941i;
                        long j13 = a0(playbackInfo4.f5962a, mediaPeriodHolder18.f.f5930a) ? this.v0.f5839i : j;
                        MediaPeriodHolder mediaPeriodHolder19 = mediaPeriodQueue8.k;
                        boolean z23 = mediaPeriodHolder19.f() && mediaPeriodHolder19.f.f5935i;
                        boolean z24 = mediaPeriodHolder19.f.f5930a.b() && !mediaPeriodHolder19.d;
                        if (!z23 && !z24) {
                            PlaybackInfo playbackInfo5 = this.z0;
                            Timeline timeline2 = playbackInfo5.f5962a;
                            MediaSource.MediaPeriodId mediaPeriodId4 = mediaPeriodHolder18.f.f5930a;
                            long j14 = this.O0 - mediaPeriodHolder18.o;
                            long j15 = playbackInfo5.q;
                            MediaPeriodHolder mediaPeriodHolder20 = this.t0.k;
                            long jMax = 0;
                            if (mediaPeriodHolder20 != null) {
                                jMax = Math.max(0L, j15 - (this.O0 - mediaPeriodHolder20.o));
                            }
                            long j16 = jMax;
                            float f = this.p0.getPlaybackParameters().f5494a;
                            boolean z25 = this.z0.f5968l;
                            if (!this.g0.a(new LoadControl.Parameters(this.x0, timeline2, mediaPeriodId4, j14, j16, f, this.E0, j13))) {
                                zT = false;
                            }
                        }
                    }
                    zT = true;
                } else {
                    zT = false;
                }
                if (zT) {
                    Y(3);
                    this.S0 = null;
                    if (Z()) {
                        i0(false, false);
                        DefaultMediaClock defaultMediaClock = this.p0;
                        defaultMediaClock.g0 = true;
                        StandaloneMediaClock standaloneMediaClock = defaultMediaClock.X;
                        if (standaloneMediaClock.f5987Y) {
                            z5 = true;
                        } else {
                            standaloneMediaClock.X.getClass();
                            standaloneMediaClock.e0 = android.os.SystemClock.elapsedRealtime();
                            z5 = true;
                            standaloneMediaClock.f5987Y = true;
                        }
                        b0();
                    }
                } else {
                    z5 = true;
                    if (this.z0.f5965e == 3) {
                        i0(Z(), false);
                        Y(2);
                        if (this.E0) {
                            while (mediaPeriodHolder != null) {
                                while (i2 < r4) {
                                    if (exoTrackSelection2 != null) {
                                        exoTrackSelection2.c();
                                    }
                                }
                            }
                            defaultLivePlaybackSpeedControl = this.v0;
                            j2 = defaultLivePlaybackSpeedControl.f5839i;
                            if (j2 != j) {
                                long j17 = j2 + defaultLivePlaybackSpeedControl.f5835b;
                                defaultLivePlaybackSpeedControl.f5839i = j17;
                                j3 = defaultLivePlaybackSpeedControl.f5838h;
                                if (j3 != j) {
                                    defaultLivePlaybackSpeedControl.f5839i = j3;
                                }
                                defaultLivePlaybackSpeedControl.m = j;
                            }
                        }
                        d0();
                    }
                }
            }
            if (this.z0.f5965e == 2) {
                i4 = 0;
                while (true) {
                    rendererArr = this.X;
                    if (i4 < rendererArr.length) {
                        break;
                    }
                    if (!s(rendererArr[i4]) && this.X[i4].getStream() == mediaPeriodHolder17.f5924c[i4]) {
                        this.X[i4].maybeThrowStreamError();
                    }
                    i4++;
                }
                playbackInfo2 = this.z0;
                if (playbackInfo2.g && playbackInfo2.r < 500000 && r()) {
                    z6 = z5;
                } else {
                    z6 = false;
                }
            } else {
                z6 = false;
            }
            if (!z6) {
                this.T0 = -9223372036854775807L;
            } else if (this.T0 == -9223372036854775807L) {
                this.r0.getClass();
                this.T0 = android.os.SystemClock.elapsedRealtime();
            } else {
                this.r0.getClass();
                if (android.os.SystemClock.elapsedRealtime() - this.T0 >= 4000) {
                    throw new IllegalStateException("Playback stuck buffering and not loading");
                }
            }
            if (Z() || this.z0.f5965e != 3) {
                z7 = false;
            } else {
                z7 = z5;
            }
            if (this.L0 || !this.K0 || !z7) {
                z5 = false;
            }
            playbackInfo = this.z0;
            if (playbackInfo.f5970p != z5) {
                z8 = z5;
                this.z0 = new PlaybackInfo(playbackInfo.f5962a, playbackInfo.f5963b, playbackInfo.f5964c, playbackInfo.d, playbackInfo.f5965e, playbackInfo.f, playbackInfo.g, playbackInfo.f5966h, playbackInfo.f5967i, playbackInfo.j, playbackInfo.k, playbackInfo.f5968l, playbackInfo.m, playbackInfo.f5969n, playbackInfo.o, playbackInfo.q, playbackInfo.r, playbackInfo.s, playbackInfo.t, z8);
                z9 = false;
            } else {
                z8 = z5;
                z9 = false;
            }
            this.K0 = z9;
            if (!z8 && (i3 = this.z0.f5965e) != 4 && (z7 || i3 == 2 || (i3 == 3 && this.M0 != 0))) {
                I(jUptimeMillis);
            }
            Trace.endSection();
        }
        Y(4);
        d0();
        z5 = true;
        if (this.z0.f5965e == 2) {
            i4 = 0;
            while (true) {
                rendererArr = this.X;
                if (i4 < rendererArr.length) {
                    break;
                    break;
                } else {
                    if (!s(rendererArr[i4])) {
                    }
                    i4++;
                }
            }
            playbackInfo2 = this.z0;
            if (playbackInfo2.g) {
                z6 = false;
            } else {
                z6 = false;
            }
        } else {
            z6 = false;
        }
        if (!z6) {
            this.T0 = -9223372036854775807L;
        } else if (this.T0 == -9223372036854775807L) {
            this.r0.getClass();
            this.T0 = android.os.SystemClock.elapsedRealtime();
        } else {
            this.r0.getClass();
            if (android.os.SystemClock.elapsedRealtime() - this.T0 >= 4000) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
        }
        if (Z()) {
            z7 = false;
        } else {
            z7 = false;
        }
        if (this.L0) {
            z5 = false;
        } else {
            z5 = false;
        }
        playbackInfo = this.z0;
        if (playbackInfo.f5970p != z5) {
            z8 = z5;
            this.z0 = new PlaybackInfo(playbackInfo.f5962a, playbackInfo.f5963b, playbackInfo.f5964c, playbackInfo.d, playbackInfo.f5965e, playbackInfo.f, playbackInfo.g, playbackInfo.f5966h, playbackInfo.f5967i, playbackInfo.j, playbackInfo.k, playbackInfo.f5968l, playbackInfo.m, playbackInfo.f5969n, playbackInfo.o, playbackInfo.q, playbackInfo.r, playbackInfo.s, playbackInfo.t, z8);
            z9 = false;
        } else {
            z8 = z5;
            z9 = false;
        }
        this.K0 = z9;
        if (!z8) {
            I(jUptimeMillis);
        }
        Trace.endSection();
    }

    public final void f0(int i2, int i3, List list) throws Throwable {
        this.A0.a(1);
        MediaSourceList mediaSourceList = this.u0;
        mediaSourceList.getClass();
        ArrayList arrayList = mediaSourceList.f5946b;
        Assertions.b(i2 >= 0 && i2 <= i3 && i3 <= arrayList.size());
        Assertions.b(list.size() == i3 - i2);
        for (int i4 = i2; i4 < i3; i4++) {
            ((MediaSourceList.MediaSourceHolder) arrayList.get(i4)).f5956a.M((MediaItem) list.get(i4 - i2));
        }
        n(mediaSourceList.b(), false);
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00e0  */
    public final void g(boolean[] zArr, long j) throws ExoPlaybackException {
        Renderer[] rendererArr;
        Set set;
        TrackSelectorResult trackSelectorResult;
        MediaClock mediaClock;
        MediaPeriodQueue mediaPeriodQueue = this.t0;
        MediaPeriodHolder mediaPeriodHolder = mediaPeriodQueue.j;
        TrackSelectorResult trackSelectorResult2 = mediaPeriodHolder.f5929n;
        int i2 = 0;
        while (true) {
            rendererArr = this.X;
            int length = rendererArr.length;
            set = this.f5894Y;
            if (i2 >= length) {
                break;
            }
            if (!trackSelectorResult2.b(i2) && set.remove(rendererArr[i2])) {
                rendererArr[i2].reset();
            }
            i2++;
        }
        int i3 = 0;
        while (i3 < rendererArr.length) {
            if (trackSelectorResult2.b(i3)) {
                boolean z2 = zArr[i3];
                Renderer renderer = rendererArr[i3];
                if (s(renderer)) {
                    trackSelectorResult = trackSelectorResult2;
                } else {
                    MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodQueue.j;
                    boolean z3 = mediaPeriodHolder2 == mediaPeriodQueue.f5941i;
                    TrackSelectorResult trackSelectorResult3 = mediaPeriodHolder2.f5929n;
                    RendererConfiguration rendererConfiguration = trackSelectorResult3.f6540b[i3];
                    ExoTrackSelection exoTrackSelection = trackSelectorResult3.f6541c[i3];
                    int length2 = exoTrackSelection != null ? exoTrackSelection.length() : 0;
                    Format[] formatArr = new Format[length2];
                    for (int i4 = 0; i4 < length2; i4++) {
                        formatArr[i4] = exoTrackSelection.getFormat(i4);
                    }
                    boolean z4 = Z() && this.z0.f5965e == 3;
                    boolean z5 = !z2 && z4;
                    this.M0++;
                    set.add(renderer);
                    trackSelectorResult = trackSelectorResult2;
                    renderer.m(rendererConfiguration, formatArr, mediaPeriodHolder2.f5924c[i3], z5, z3, j, mediaPeriodHolder2.o, mediaPeriodHolder2.f.f5930a);
                    renderer.handleMessage(11, new Renderer.WakeupListener() { // from class: androidx.media3.exoplayer.ExoPlayerImplInternal.1
                        @Override // androidx.media3.exoplayer.Renderer.WakeupListener
                        public final void a() {
                            ExoPlayerImplInternal.this.K0 = true;
                        }

                        @Override // androidx.media3.exoplayer.Renderer.WakeupListener
                        public final void b() {
                            ExoPlayerImplInternal exoPlayerImplInternal = ExoPlayerImplInternal.this;
                            exoPlayerImplInternal.getClass();
                            if (exoPlayerImplInternal.L0) {
                                exoPlayerImplInternal.i0.sendEmptyMessage(2);
                            }
                        }
                    });
                    DefaultMediaClock defaultMediaClock = this.p0;
                    defaultMediaClock.getClass();
                    MediaClock mediaClock2 = renderer.getMediaClock();
                    if (mediaClock2 != null && mediaClock2 != (mediaClock = defaultMediaClock.e0)) {
                        if (mediaClock != null) {
                            throw new ExoPlaybackException(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
                        }
                        defaultMediaClock.e0 = mediaClock2;
                        defaultMediaClock.Z = renderer;
                        mediaClock2.c(defaultMediaClock.X.f0);
                    }
                    if (z4 && z3) {
                        renderer.start();
                    }
                }
            } else {
                trackSelectorResult = trackSelectorResult2;
            }
            i3++;
            trackSelectorResult2 = trackSelectorResult;
        }
        mediaPeriodHolder.g = true;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00dc  */
    /* JADX WARN: Type inference failed for: r2v24, types: [androidx.media3.exoplayer.source.MediaPeriod, java.lang.Object] */
    public final void g0() {
        int i2;
        PlaybackParameters playbackParameters;
        MediaPeriodHolder mediaPeriodHolder = this.t0.f5941i;
        if (mediaPeriodHolder == null) {
            return;
        }
        long discontinuity = mediaPeriodHolder.d ? mediaPeriodHolder.f5922a.readDiscontinuity() : -9223372036854775807L;
        if (discontinuity != -9223372036854775807L) {
            if (!mediaPeriodHolder.f()) {
                this.t0.k(mediaPeriodHolder);
                m(false);
                u();
            }
            E(discontinuity);
            if (discontinuity != this.z0.s) {
                PlaybackInfo playbackInfo = this.z0;
                i2 = 16;
                this.z0 = q(playbackInfo.f5963b, discontinuity, playbackInfo.f5964c, discontinuity, true, 5);
            } else {
                i2 = 16;
            }
        } else {
            i2 = 16;
            DefaultMediaClock defaultMediaClock = this.p0;
            boolean z2 = mediaPeriodHolder != this.t0.j;
            Renderer renderer = defaultMediaClock.Z;
            StandaloneMediaClock standaloneMediaClock = defaultMediaClock.X;
            if (renderer == null || renderer.isEnded() || ((z2 && defaultMediaClock.Z.getState() != 2) || (!defaultMediaClock.Z.isReady() && (z2 || defaultMediaClock.Z.hasReadStreamToEnd())))) {
                defaultMediaClock.f0 = true;
                if (defaultMediaClock.g0 && !standaloneMediaClock.f5987Y) {
                    standaloneMediaClock.X.getClass();
                    standaloneMediaClock.e0 = android.os.SystemClock.elapsedRealtime();
                    standaloneMediaClock.f5987Y = true;
                }
            } else {
                MediaClock mediaClock = defaultMediaClock.e0;
                mediaClock.getClass();
                long positionUs = mediaClock.getPositionUs();
                if (!defaultMediaClock.f0) {
                    standaloneMediaClock.a(positionUs);
                    playbackParameters = mediaClock.getPlaybackParameters();
                    if (!playbackParameters.equals(standaloneMediaClock.f0)) {
                        standaloneMediaClock.c(playbackParameters);
                        ((ExoPlayerImplInternal) defaultMediaClock.f5850Y).i0.obtainMessage(16, playbackParameters).a();
                    }
                } else if (positionUs >= standaloneMediaClock.getPositionUs()) {
                    defaultMediaClock.f0 = false;
                    if (defaultMediaClock.g0 && !standaloneMediaClock.f5987Y) {
                        standaloneMediaClock.X.getClass();
                        standaloneMediaClock.e0 = android.os.SystemClock.elapsedRealtime();
                        standaloneMediaClock.f5987Y = true;
                    }
                    standaloneMediaClock.a(positionUs);
                    playbackParameters = mediaClock.getPlaybackParameters();
                    if (!playbackParameters.equals(standaloneMediaClock.f0)) {
                        standaloneMediaClock.c(playbackParameters);
                        ((ExoPlayerImplInternal) defaultMediaClock.f5850Y).i0.obtainMessage(16, playbackParameters).a();
                    }
                } else if (standaloneMediaClock.f5987Y) {
                    standaloneMediaClock.a(standaloneMediaClock.getPositionUs());
                    standaloneMediaClock.f5987Y = false;
                }
            }
            long positionUs2 = defaultMediaClock.getPositionUs();
            this.O0 = positionUs2;
            long j = positionUs2 - mediaPeriodHolder.o;
            long j2 = this.z0.s;
            if (!this.q0.isEmpty() && !this.z0.f5963b.b()) {
                if (this.R0) {
                    j2--;
                    this.R0 = false;
                }
                PlaybackInfo playbackInfo2 = this.z0;
                int iB = playbackInfo2.f5962a.b(playbackInfo2.f5963b.f6384a);
                int iMin = Math.min(this.Q0, this.q0.size());
                PendingMessageInfo pendingMessageInfo = iMin > 0 ? (PendingMessageInfo) this.q0.get(iMin - 1) : null;
                while (pendingMessageInfo != null && (iB < 0 || (iB == 0 && 0 > j2))) {
                    int i3 = iMin - 1;
                    pendingMessageInfo = i3 > 0 ? (PendingMessageInfo) this.q0.get(iMin - 2) : null;
                    iMin = i3;
                }
                if (iMin < this.q0.size()) {
                }
                this.Q0 = iMin;
            }
            if (this.p0.j()) {
                boolean z3 = !this.A0.d;
                PlaybackInfo playbackInfo3 = this.z0;
                this.z0 = q(playbackInfo3.f5963b, j, playbackInfo3.f5964c, j, z3, 6);
            } else {
                PlaybackInfo playbackInfo4 = this.z0;
                playbackInfo4.s = j;
                playbackInfo4.t = android.os.SystemClock.elapsedRealtime();
            }
        }
        this.z0.q = this.t0.k.d();
        PlaybackInfo playbackInfo5 = this.z0;
        long j3 = playbackInfo5.q;
        MediaPeriodHolder mediaPeriodHolder2 = this.t0.k;
        playbackInfo5.r = mediaPeriodHolder2 == null ? 0L : Math.max(0L, j3 - (this.O0 - mediaPeriodHolder2.o));
        PlaybackInfo playbackInfo6 = this.z0;
        if (playbackInfo6.f5968l && playbackInfo6.f5965e == 3 && a0(playbackInfo6.f5962a, playbackInfo6.f5963b)) {
            PlaybackInfo playbackInfo7 = this.z0;
            float f = 1.0f;
            if (playbackInfo7.o.f5494a == 1.0f) {
                DefaultLivePlaybackSpeedControl defaultLivePlaybackSpeedControl = this.v0;
                long jH = h(playbackInfo7.f5962a, playbackInfo7.f5963b.f6384a, playbackInfo7.s);
                long j4 = this.z0.q;
                MediaPeriodHolder mediaPeriodHolder3 = this.t0.k;
                long jMax = mediaPeriodHolder3 == null ? 0L : Math.max(0L, j4 - (this.O0 - mediaPeriodHolder3.o));
                if (defaultLivePlaybackSpeedControl.d != -9223372036854775807L) {
                    long j5 = jH - jMax;
                    long j6 = defaultLivePlaybackSpeedControl.f5841n;
                    if (j6 == -9223372036854775807L) {
                        defaultLivePlaybackSpeedControl.f5841n = j5;
                        defaultLivePlaybackSpeedControl.o = 0L;
                    } else {
                        float f2 = j6;
                        float f3 = defaultLivePlaybackSpeedControl.f5836c;
                        float f4 = 1.0f - f3;
                        long jMax2 = Math.max(j5, (long) ((j5 * f4) + (f2 * f3)));
                        defaultLivePlaybackSpeedControl.f5841n = jMax2;
                        defaultLivePlaybackSpeedControl.o = (long) ((f4 * Math.abs(j5 - jMax2)) + (f3 * defaultLivePlaybackSpeedControl.o));
                    }
                    if (defaultLivePlaybackSpeedControl.m == -9223372036854775807L || android.os.SystemClock.elapsedRealtime() - defaultLivePlaybackSpeedControl.m >= 1000) {
                        defaultLivePlaybackSpeedControl.m = android.os.SystemClock.elapsedRealtime();
                        long j7 = (defaultLivePlaybackSpeedControl.o * 3) + defaultLivePlaybackSpeedControl.f5841n;
                        if (defaultLivePlaybackSpeedControl.f5839i > j7) {
                            float fI = Util.I(1000L);
                            defaultLivePlaybackSpeedControl.f5839i = Longs.b(j7, defaultLivePlaybackSpeedControl.f, defaultLivePlaybackSpeedControl.f5839i - (((long) ((defaultLivePlaybackSpeedControl.f5840l - 1.0f) * fI)) + ((long) ((defaultLivePlaybackSpeedControl.j - 1.0f) * fI))));
                        } else {
                            long jK = Util.k(jH - ((long) (Math.max(0.0f, defaultLivePlaybackSpeedControl.f5840l - 1.0f) / 1.0E-7f)), defaultLivePlaybackSpeedControl.f5839i, j7);
                            defaultLivePlaybackSpeedControl.f5839i = jK;
                            long j8 = defaultLivePlaybackSpeedControl.f5838h;
                            if (j8 != -9223372036854775807L && jK > j8) {
                                defaultLivePlaybackSpeedControl.f5839i = j8;
                            }
                        }
                        long j9 = jH - defaultLivePlaybackSpeedControl.f5839i;
                        if (Math.abs(j9) < defaultLivePlaybackSpeedControl.f5834a) {
                            defaultLivePlaybackSpeedControl.f5840l = 1.0f;
                        } else {
                            defaultLivePlaybackSpeedControl.f5840l = Util.i((1.0E-7f * j9) + 1.0f, defaultLivePlaybackSpeedControl.k, defaultLivePlaybackSpeedControl.j);
                        }
                        f = defaultLivePlaybackSpeedControl.f5840l;
                    } else {
                        f = defaultLivePlaybackSpeedControl.f5840l;
                    }
                }
                if (this.p0.getPlaybackParameters().f5494a != f) {
                    PlaybackParameters playbackParameters2 = new PlaybackParameters(f, this.z0.o.f5495b);
                    this.i0.removeMessages(i2);
                    this.p0.c(playbackParameters2);
                    p(this.z0.o, this.p0.getPlaybackParameters().f5494a, false, false);
                }
            }
        }
    }

    public final long h(Timeline timeline, Object obj, long j) {
        Timeline.Period period = this.m0;
        int i2 = timeline.g(obj, period).f5510c;
        Timeline.Window window = this.l0;
        timeline.n(i2, window);
        if (window.f5516e == -9223372036854775807L || !window.a() || !window.f5517h) {
            return -9223372036854775807L;
        }
        long j2 = window.f;
        return Util.I((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + android.os.SystemClock.elapsedRealtime()) - window.f5516e) - (j + period.f5511e);
    }

    public final void h0(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline2, MediaSource.MediaPeriodId mediaPeriodId2, long j, boolean z2) {
        if (!a0(timeline, mediaPeriodId)) {
            PlaybackParameters playbackParameters = mediaPeriodId.b() ? PlaybackParameters.d : this.z0.o;
            DefaultMediaClock defaultMediaClock = this.p0;
            if (defaultMediaClock.getPlaybackParameters().equals(playbackParameters)) {
                return;
            }
            this.i0.removeMessages(16);
            defaultMediaClock.c(playbackParameters);
            p(this.z0.o, playbackParameters.f5494a, false, false);
            return;
        }
        Object obj = mediaPeriodId.f6384a;
        Timeline.Period period = this.m0;
        int i2 = timeline.g(obj, period).f5510c;
        Timeline.Window window = this.l0;
        timeline.n(i2, window);
        MediaItem.LiveConfiguration liveConfiguration = window.f5518i;
        DefaultLivePlaybackSpeedControl defaultLivePlaybackSpeedControl = this.v0;
        defaultLivePlaybackSpeedControl.getClass();
        defaultLivePlaybackSpeedControl.d = Util.I(liveConfiguration.f5450a);
        defaultLivePlaybackSpeedControl.g = Util.I(liveConfiguration.f5451b);
        defaultLivePlaybackSpeedControl.f5838h = Util.I(liveConfiguration.f5452c);
        float f = liveConfiguration.d;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        defaultLivePlaybackSpeedControl.k = f;
        float f2 = liveConfiguration.f5453e;
        if (f2 == -3.4028235E38f) {
            f2 = 1.03f;
        }
        defaultLivePlaybackSpeedControl.j = f2;
        if (f == 1.0f && f2 == 1.0f) {
            defaultLivePlaybackSpeedControl.d = -9223372036854775807L;
        }
        defaultLivePlaybackSpeedControl.a();
        if (j != -9223372036854775807L) {
            defaultLivePlaybackSpeedControl.b(h(timeline, obj, j));
            return;
        }
        if (!Util.a(!timeline2.p() ? timeline2.m(timeline2.g(mediaPeriodId2.f6384a, period).f5510c, window, 0L).f5513a : null, window.f5513a) || z2) {
            defaultLivePlaybackSpeedControl.b(-9223372036854775807L);
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        boolean z2;
        boolean z3;
        MediaPeriodHolder mediaPeriodHolder;
        int i2;
        MediaPeriodHolder mediaPeriodHolder2;
        int i3;
        int i4 = 1000;
        try {
            switch (message.what) {
                case 1:
                    boolean z4 = message.arg1 != 0;
                    int i5 = message.arg2;
                    S(i5 >> 4, i5 & 15, z4, true);
                    break;
                case 2:
                    f();
                    break;
                case 3:
                    K((SeekPosition) message.obj);
                    break;
                case 4:
                    T((PlaybackParameters) message.obj);
                    break;
                case 5:
                    this.y0 = (SeekParameters) message.obj;
                    break;
                case 6:
                    c0(false, true);
                    break;
                case 7:
                    z();
                    return true;
                case 8:
                    o((MediaPeriod) message.obj);
                    break;
                case 9:
                    k((MediaPeriod) message.obj);
                    break;
                case 10:
                    B();
                    break;
                case 11:
                    V(message.arg1);
                    break;
                case 12:
                    W(message.arg1 != 0);
                    break;
                case 13:
                    P(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    PlayerMessage playerMessage = (PlayerMessage) message.obj;
                    playerMessage.getClass();
                    M(playerMessage);
                    break;
                case 15:
                    N((PlayerMessage) message.obj);
                    break;
                case 16:
                    PlaybackParameters playbackParameters = (PlaybackParameters) message.obj;
                    p(playbackParameters, playbackParameters.f5494a, true, false);
                    break;
                case 17:
                    Q((MediaSourceListUpdateMessage) message.obj);
                    break;
                case 18:
                    c((MediaSourceListUpdateMessage) message.obj, message.arg1);
                    break;
                case 19:
                    x((MoveMediaItemsMessage) message.obj);
                    break;
                case 20:
                    A(message.arg1, message.arg2, (ShuffleOrder) message.obj);
                    break;
                case 21:
                    X((ShuffleOrder) message.obj);
                    break;
                case 22:
                    w();
                    break;
                case 23:
                    R(message.arg1 != 0);
                    break;
                case 24:
                default:
                    return false;
                case 25:
                    B();
                    J(true);
                    break;
                case 26:
                    B();
                    J(true);
                    break;
                case 27:
                    f0(message.arg1, message.arg2, (List) message.obj);
                    break;
                case 28:
                    U((ExoPlayer.PreloadConfiguration) message.obj);
                    break;
                case 29:
                    y();
                    break;
            }
        } catch (ParserException e2) {
            boolean z5 = e2.X;
            int i6 = e2.f5492Y;
            if (i6 == 1) {
                i3 = z5 ? 3001 : 3003;
            } else {
                if (i6 == 4) {
                    i3 = z5 ? 3002 : 3004;
                }
                l(e2, i4);
            }
            i4 = i3;
            l(e2, i4);
        } catch (DataSourceException e3) {
            l(e3, e3.X);
        } catch (ExoPlaybackException e4) {
            e = e4;
            int i7 = e.Z;
            MediaPeriodQueue mediaPeriodQueue = this.t0;
            if (i7 == 1 && (mediaPeriodHolder2 = mediaPeriodQueue.j) != null) {
                e = new ExoPlaybackException(e.getMessage(), e.getCause(), e.X, e.Z, e.e0, e.f0, e.g0, e.h0, mediaPeriodHolder2.f.f5930a, e.f5493Y, e.j0);
            }
            if (e.j0 && (this.S0 == null || (i2 = e.X) == 5004 || i2 == 5003)) {
                Log.h("ExoPlayerImplInternal", "Recoverable renderer error", e);
                ExoPlaybackException exoPlaybackException = this.S0;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.S0;
                } else {
                    this.S0 = e;
                }
                HandlerWrapper handlerWrapper = this.i0;
                handlerWrapper.d(handlerWrapper.obtainMessage(25, e));
                z2 = true;
            } else {
                ExoPlaybackException exoPlaybackException2 = this.S0;
                if (exoPlaybackException2 != null) {
                    exoPlaybackException2.addSuppressed(e);
                    e = this.S0;
                }
                Log.d("ExoPlayerImplInternal", "Playback error", e);
                z2 = true;
                if (e.Z == 1) {
                    if (mediaPeriodQueue.f5941i != mediaPeriodQueue.j) {
                        while (true) {
                            mediaPeriodHolder = mediaPeriodQueue.f5941i;
                            if (mediaPeriodHolder == mediaPeriodQueue.j) {
                                break;
                            }
                            mediaPeriodQueue.a();
                        }
                        mediaPeriodHolder.getClass();
                        v();
                        MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.f;
                        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodInfo.f5930a;
                        long j = mediaPeriodInfo.f5931b;
                        this.z0 = q(mediaPeriodId, j, mediaPeriodInfo.f5932c, j, true, 0);
                    }
                    z3 = false;
                    z2 = true;
                } else {
                    z3 = false;
                }
                c0(z2, z3);
                this.z0 = this.z0.e(e);
            }
        } catch (DrmSession.DrmSessionException e5) {
            l(e5, e5.X);
        } catch (BehindLiveWindowException e6) {
            l(e6, 1002);
        } catch (IOException e7) {
            l(e7, 2000);
        } catch (RuntimeException e8) {
            ExoPlaybackException exoPlaybackException3 = new ExoPlaybackException(2, e8, ((e8 instanceof IllegalStateException) || (e8 instanceof IllegalArgumentException)) ? 1004 : 1000);
            Log.d("ExoPlayerImplInternal", "Playback error", exoPlaybackException3);
            c0(true, false);
            this.z0 = this.z0.e(exoPlaybackException3);
        }
        z2 = true;
        v();
        return z2;
    }

    public final long i() {
        MediaPeriodHolder mediaPeriodHolder = this.t0.j;
        if (mediaPeriodHolder == null) {
            return 0L;
        }
        long jMax = mediaPeriodHolder.o;
        if (!mediaPeriodHolder.d) {
            return jMax;
        }
        int i2 = 0;
        while (true) {
            Renderer[] rendererArr = this.X;
            if (i2 >= rendererArr.length) {
                return jMax;
            }
            if (s(rendererArr[i2]) && rendererArr[i2].getStream() == mediaPeriodHolder.f5924c[i2]) {
                long jE = rendererArr[i2].e();
                if (jE == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(jE, jMax);
            }
            i2++;
        }
    }

    public final void i0(boolean z2, boolean z3) {
        long jElapsedRealtime;
        this.E0 = z2;
        if (!z2 || z3) {
            jElapsedRealtime = -9223372036854775807L;
        } else {
            this.r0.getClass();
            jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
        }
        this.F0 = jElapsedRealtime;
    }

    public final Pair j(Timeline timeline) {
        long j = 0;
        if (timeline.p()) {
            return Pair.create(PlaybackInfo.f5961u, 0L);
        }
        Pair pairI = timeline.i(this.l0, this.m0, timeline.a(this.I0), -9223372036854775807L);
        MediaSource.MediaPeriodId mediaPeriodIdM = this.t0.m(timeline, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (mediaPeriodIdM.b()) {
            Object obj = mediaPeriodIdM.f6384a;
            Timeline.Period period = this.m0;
            timeline.g(obj, period);
            if (mediaPeriodIdM.f6386c == period.e(mediaPeriodIdM.f6385b)) {
                period.g.getClass();
            }
        } else {
            j = jLongValue;
        }
        return Pair.create(mediaPeriodIdM, Long.valueOf(j));
    }

    public final synchronized void j0(c cVar, long j) {
        this.r0.getClass();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() + j;
        boolean z2 = false;
        while (!((Boolean) cVar.get()).booleanValue() && j > 0) {
            try {
                this.r0.getClass();
                wait(j);
            } catch (InterruptedException unused) {
                z2 = true;
            }
            this.r0.getClass();
            j = jElapsedRealtime - android.os.SystemClock.elapsedRealtime();
        }
        if (z2) {
            Thread.currentThread().interrupt();
        }
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [androidx.media3.exoplayer.source.SequenceableLoader, java.lang.Object] */
    public final void k(MediaPeriod mediaPeriod) {
        MediaPeriodHolder mediaPeriodHolder = this.t0.k;
        if (mediaPeriodHolder == null || mediaPeriodHolder.f5922a != mediaPeriod) {
            return;
        }
        long j = this.O0;
        if (mediaPeriodHolder != null) {
            Assertions.e(mediaPeriodHolder.f5928l == null);
            if (mediaPeriodHolder.d) {
                mediaPeriodHolder.f5922a.reevaluateBuffer(j - mediaPeriodHolder.o);
            }
        }
        u();
    }

    public final void l(IOException iOException, int i2) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i2);
        MediaPeriodHolder mediaPeriodHolder = this.t0.f5941i;
        if (mediaPeriodHolder != null) {
            MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.f;
            exoPlaybackException = new ExoPlaybackException(exoPlaybackException.getMessage(), exoPlaybackException.getCause(), exoPlaybackException.X, exoPlaybackException.Z, exoPlaybackException.e0, exoPlaybackException.f0, exoPlaybackException.g0, exoPlaybackException.h0, mediaPeriodInfo.f5930a, exoPlaybackException.f5493Y, exoPlaybackException.j0);
        }
        Log.d("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
        c0(false, false);
        this.z0 = this.z0.e(exoPlaybackException);
    }

    public final void m(boolean z2) {
        MediaPeriodHolder mediaPeriodHolder = this.t0.k;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodHolder == null ? this.z0.f5963b : mediaPeriodHolder.f.f5930a;
        boolean zEquals = this.z0.k.equals(mediaPeriodId);
        if (!zEquals) {
            this.z0 = this.z0.b(mediaPeriodId);
        }
        PlaybackInfo playbackInfo = this.z0;
        playbackInfo.q = mediaPeriodHolder == null ? playbackInfo.s : mediaPeriodHolder.d();
        PlaybackInfo playbackInfo2 = this.z0;
        long j = playbackInfo2.q;
        MediaPeriodHolder mediaPeriodHolder2 = this.t0.k;
        playbackInfo2.r = mediaPeriodHolder2 != null ? Math.max(0L, j - (this.O0 - mediaPeriodHolder2.o)) : 0L;
        if ((!zEquals || z2) && mediaPeriodHolder != null && mediaPeriodHolder.d) {
            this.g0.f(this.x0, this.z0.f5962a, mediaPeriodHolder.f.f5930a, this.X, mediaPeriodHolder.m, mediaPeriodHolder.f5929n.f6541c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:172:0x0301  */
    /* JADX WARN: Code duplicated, block: B:173:0x0303  */
    /* JADX WARN: Code duplicated, block: B:180:0x0319  */
    /* JADX WARN: Code duplicated, block: B:182:0x0323 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x0338  */
    /* JADX WARN: Code duplicated, block: B:191:0x0344  */
    /* JADX WARN: Code duplicated, block: B:193:0x034a  */
    /* JADX WARN: Code duplicated, block: B:197:0x036c  */
    /* JADX WARN: Code duplicated, block: B:204:0x038b  */
    /* JADX WARN: Code duplicated, block: B:205:0x038d  */
    /* JADX WARN: Code duplicated, block: B:208:0x0398  */
    /* JADX WARN: Code duplicated, block: B:210:0x03a0  */
    /* JADX WARN: Code duplicated, block: B:212:0x03aa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:218:0x03c0  */
    /* JADX WARN: Code duplicated, block: B:221:0x03cd  */
    /* JADX WARN: Code duplicated, block: B:223:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:227:0x03f1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.media3.exoplayer.Renderer[]] */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.media3.common.Timeline] */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r14v10, types: [int] */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v24 */
    /* JADX WARN: Type inference failed for: r14v25 */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v16 */
    /* JADX WARN: Type inference failed for: r15v2, types: [androidx.media3.exoplayer.ExoPlayerImplInternal$SeekPosition] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v10 */
    /* JADX WARN: Type inference failed for: r18v11 */
    /* JADX WARN: Type inference failed for: r18v12 */
    /* JADX WARN: Type inference failed for: r18v13 */
    /* JADX WARN: Type inference failed for: r18v14 */
    /* JADX WARN: Type inference failed for: r18v15 */
    /* JADX WARN: Type inference failed for: r18v16 */
    /* JADX WARN: Type inference failed for: r18v17 */
    /* JADX WARN: Type inference failed for: r18v18 */
    /* JADX WARN: Type inference failed for: r18v19 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r18v20 */
    /* JADX WARN: Type inference failed for: r18v21 */
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17, types: [androidx.media3.common.Timeline] */
    /* JADX WARN: Type inference failed for: r2v18, types: [androidx.media3.common.Timeline] */
    /* JADX WARN: Type inference failed for: r2v22, types: [androidx.media3.common.Timeline] */
    /* JADX WARN: Type inference failed for: r2v25, types: [androidx.media3.common.Timeline] */
    /* JADX WARN: Type inference failed for: r2v30, types: [androidx.media3.exoplayer.PlaybackInfo] */
    /* JADX WARN: Type inference failed for: r2v34, types: [androidx.media3.common.util.HandlerWrapper] */
    /* JADX WARN: Type inference failed for: r2v50, types: [androidx.media3.exoplayer.MediaPeriodQueue] */
    /* JADX WARN: Type inference failed for: r2v52 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r34v0, types: [androidx.media3.exoplayer.ExoPlayerImplInternal] */
    /* JADX WARN: Type inference failed for: r35v0, types: [androidx.media3.common.Timeline] */
    /* JADX WARN: Type inference failed for: r4v54, types: [androidx.media3.exoplayer.Renderer] */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v33, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v34 */
    /* JADX WARN: Type inference failed for: r7v22, types: [int] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v31, types: [androidx.media3.common.Timeline] */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33 */
    /* JADX WARN: Type inference failed for: r9v0, types: [androidx.media3.exoplayer.MediaPeriodQueue] */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void n(Timeline timeline, boolean z2) throws Throwable {
        long j;
        Timeline.Window window;
        Object obj;
        int iA;
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        int iA2;
        boolean z6;
        MediaSource.MediaPeriodId mediaPeriodId;
        int i3;
        Timeline.Period period;
        ?? r2;
        long j2;
        long j3;
        PositionUpdateForPlaylistChange positionUpdateForPlaylistChange;
        int i4;
        Object obj2;
        boolean z7;
        int i5;
        boolean z8;
        int iA3;
        boolean z9;
        boolean z10;
        ?? r3;
        ?? r11;
        MediaSource.MediaPeriodId mediaPeriodId2;
        long j4;
        ?? r14;
        ?? r15;
        ?? r18;
        long j5;
        MediaSource.MediaPeriodId mediaPeriodId3;
        Object obj3;
        ?? r9;
        int i6;
        boolean z11;
        ?? r16;
        ?? r19;
        ?? r110;
        char c2;
        ?? r17;
        ?? r7;
        ?? r111;
        SeekPosition seekPosition;
        int i7;
        long j6;
        MediaSource.MediaPeriodId mediaPeriodId4;
        Object obj4;
        ?? r10;
        int i8;
        ?? r112;
        PlaybackInfo playbackInfo = this.z0;
        SeekPosition seekPosition2 = this.N0;
        ?? r12 = this.t0;
        int i9 = this.H0;
        boolean z12 = this.I0;
        Timeline.Window window2 = this.l0;
        Timeline.Period period2 = this.m0;
        char c3 = 4;
        if (timeline.p()) {
            r19 = 0;
            r3 = timeline;
            positionUpdateForPlaylistChange = new PositionUpdateForPlaylistChange(PlaybackInfo.f5961u, 0L, -9223372036854775807L, false, true, false);
            j = -9223372036854775807L;
        } else {
            MediaSource.MediaPeriodId mediaPeriodId5 = playbackInfo.f5963b;
            Object obj5 = mediaPeriodId5.f6384a;
            j = -9223372036854775807L;
            Timeline timeline2 = playbackInfo.f5962a;
            boolean z13 = timeline2.p() || timeline2.g(mediaPeriodId5.f6384a, period2).f;
            long jLongValue = (playbackInfo.f5963b.b() || z13) ? playbackInfo.f5964c : playbackInfo.s;
            boolean z14 = z13;
            if (seekPosition2 != null) {
                mediaPeriodId = mediaPeriodId5;
                Pair pairG = G(timeline, seekPosition2, true, i9, z12, window2, period2);
                if (pairG == null) {
                    iA3 = timeline.a(z12);
                    jLongValue = jLongValue;
                    obj2 = obj5;
                    z10 = true;
                    z9 = false;
                    z8 = false;
                } else {
                    if (seekPosition2.f5909c == -9223372036854775807L) {
                        i5 = timeline.g(pairG.first, period2).f5510c;
                        obj2 = obj5;
                        jLongValue = jLongValue;
                        z7 = false;
                    } else {
                        obj2 = pairG.first;
                        jLongValue = ((Long) pairG.second).longValue();
                        z7 = true;
                        i5 = -1;
                    }
                    z8 = playbackInfo.f5965e == 4;
                    iA3 = i5;
                    z9 = z7;
                    z10 = false;
                }
                obj = obj2;
                window = window2;
                z4 = z10;
                z5 = z9;
                z3 = z8;
                iA = iA3;
                i2 = -1;
            } else {
                MediaSource.MediaPeriodId mediaPeriodId6 = mediaPeriodId5;
                if (playbackInfo.f5962a.p()) {
                    iA = timeline.a(z12);
                    window = window2;
                    obj = obj5;
                } else if (timeline.b(obj5) == -1) {
                    int iH = H(window2, period2, i9, z12, obj5, playbackInfo.f5962a, timeline);
                    window = window2;
                    if (iH == -1) {
                        period2 = period2;
                        iA2 = timeline.a(z12);
                        z6 = true;
                    } else {
                        period2 = period2;
                        iA2 = iH;
                        z6 = false;
                    }
                    z4 = z6;
                    iA = iA2;
                    obj = obj5;
                    jLongValue = jLongValue;
                    i2 = -1;
                    z3 = false;
                    z5 = false;
                    mediaPeriodId = mediaPeriodId6;
                } else {
                    window = window2;
                    if (jLongValue == -9223372036854775807L) {
                        iA = timeline.g(obj5, period2).f5510c;
                        obj = obj5;
                    } else if (z14) {
                        playbackInfo.f5962a.g(mediaPeriodId6.f6384a, period2);
                        if (playbackInfo.f5962a.m(period2.f5510c, window, 0L).m == playbackInfo.f5962a.b(mediaPeriodId6.f6384a)) {
                            Pair pairI = timeline.i(window, period2, timeline.g(obj5, period2).f5510c, period2.f5511e + jLongValue);
                            obj = pairI.first;
                            jLongValue = ((Long) pairI.second).longValue();
                        } else {
                            obj = obj5;
                            jLongValue = jLongValue;
                        }
                        iA = -1;
                        i2 = -1;
                        z3 = false;
                        z4 = false;
                        z5 = true;
                        mediaPeriodId = mediaPeriodId6;
                    } else {
                        obj = obj5;
                        jLongValue = jLongValue;
                        iA = -1;
                        i2 = -1;
                        z3 = false;
                        z4 = false;
                        z5 = false;
                        mediaPeriodId = mediaPeriodId6;
                    }
                }
                i2 = -1;
                z3 = false;
                z4 = false;
                z5 = false;
                mediaPeriodId = mediaPeriodId6;
            }
            if (iA != i2) {
                int i10 = iA;
                Timeline.Period period3 = period2;
                i3 = i2;
                ?? r4 = timeline;
                Pair pairI2 = r4.i(window, period3, i10, -9223372036854775807L);
                period = period3;
                obj = pairI2.first;
                jLongValue = ((Long) pairI2.second).longValue();
                j2 = -9223372036854775807L;
                r2 = r4;
            } else {
                Timeline.Period period4 = period2;
                i3 = i2;
                period = period4;
                r2 = timeline;
                j2 = jLongValue;
            }
            MediaSource.MediaPeriodId mediaPeriodIdM = r12.m(r2, obj, jLongValue);
            int i11 = mediaPeriodIdM.f6387e;
            boolean z15 = mediaPeriodId.f6384a.equals(obj) && !mediaPeriodId.b() && !mediaPeriodIdM.b() && (i11 == i3 || ((i4 = mediaPeriodId.f6387e) != i3 && i11 >= i4));
            Timeline.Period periodG = r2.g(obj, period);
            if (!z14 && jLongValue == j2 && mediaPeriodId.f6384a.equals(mediaPeriodIdM.f6384a)) {
                if (mediaPeriodId.b()) {
                    periodG.g(mediaPeriodId.f6385b);
                }
                if (mediaPeriodIdM.b()) {
                    periodG.g(mediaPeriodIdM.f6385b);
                }
            }
            if (z15) {
                mediaPeriodIdM = mediaPeriodId;
            }
            if (!mediaPeriodIdM.b()) {
                j3 = jLongValue;
            } else if (mediaPeriodIdM.equals(mediaPeriodId)) {
                j3 = playbackInfo.s;
            } else {
                r2.g(mediaPeriodIdM.f6384a, period);
                if (mediaPeriodIdM.f6386c == period.e(mediaPeriodIdM.f6385b)) {
                    period.g.getClass();
                }
                j3 = 0;
            }
            positionUpdateForPlaylistChange = new PositionUpdateForPlaylistChange(mediaPeriodIdM, j3, j2, z3, z4, z5);
            r3 = r2;
        }
        MediaSource.MediaPeriodId mediaPeriodId7 = positionUpdateForPlaylistChange.f5903a;
        long j7 = positionUpdateForPlaylistChange.f5905c;
        boolean z16 = positionUpdateForPlaylistChange.d;
        long jL = positionUpdateForPlaylistChange.f5904b;
        boolean z17 = (this.z0.f5963b.equals(mediaPeriodId7) && jL == this.z0.s) ? false : true;
        try {
            if (positionUpdateForPlaylistChange.f5906e) {
                try {
                    z11 = true;
                    if (this.z0.f5965e != 1) {
                        try {
                            Y(4);
                        } catch (Throwable th) {
                            th = th;
                            r11 = r3;
                            mediaPeriodId2 = mediaPeriodId7;
                            j4 = j7;
                            r18 = z11;
                            r14 = 2;
                            r15 = 0;
                        }
                    }
                    r16 = 0;
                    C(false, false, false, true);
                } catch (Throwable th2) {
                    th = th2;
                    z11 = true;
                    r11 = r3;
                    mediaPeriodId2 = mediaPeriodId7;
                    j4 = j7;
                    r18 = z11;
                    r14 = 2;
                    r15 = 0;
                }
            } else {
                z11 = true;
                r16 = mediaPeriodId;
            }
            for (?? r0 : this.X) {
                r0.l(r3);
            }
            try {
                if (z17) {
                    timeline = r3;
                    r19 = z11;
                    i7 = 2;
                    i7 = 2;
                    r17 = 2;
                    r16 = 2;
                    seekPosition = null;
                    seekPosition = null;
                    c2 = 0;
                    c3 = 0;
                    if (timeline.p()) {
                        r112 = r19;
                        mediaPeriodId2 = mediaPeriodId7;
                        r111 = r112;
                    } else {
                        r112 = r19;
                        try {
                            for (MediaPeriodHolder mediaPeriodHolder = this.t0.f5941i; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.f5928l) {
                                if (mediaPeriodHolder.f.f5930a.equals(mediaPeriodId7)) {
                                    mediaPeriodHolder.f = this.t0.g(timeline, mediaPeriodHolder.f);
                                    mediaPeriodHolder.i();
                                }
                            }
                            MediaPeriodQueue mediaPeriodQueue = this.t0;
                            mediaPeriodId2 = mediaPeriodId7;
                            try {
                                jL = L(mediaPeriodId2, jL, mediaPeriodQueue.f5941i != mediaPeriodQueue.j ? r19 : 0, z16);
                                r111 = r19;
                            } catch (Throwable th3) {
                                th = th3;
                                jL = jL;
                                r7 = timeline;
                                r110 = r19;
                                j4 = j7;
                                r11 = r7;
                                r14 = r17;
                                r15 = c2;
                                r18 = r110;
                                PlaybackInfo playbackInfo2 = this.z0;
                                Timeline timeline3 = playbackInfo2.f5962a;
                                MediaSource.MediaPeriodId mediaPeriodId8 = playbackInfo2.f5963b;
                                if (positionUpdateForPlaylistChange.f) {
                                    j5 = jL;
                                } else {
                                    j5 = j;
                                }
                                mediaPeriodId3 = mediaPeriodId2;
                                h0(r11, mediaPeriodId3, timeline3, mediaPeriodId8, j5, false);
                                if (z17) {
                                    PlaybackInfo playbackInfo3 = this.z0;
                                    obj3 = playbackInfo3.f5963b.f6384a;
                                    Timeline timeline4 = playbackInfo3.f5962a;
                                    if (z17) {
                                        r9 = 0;
                                    } else {
                                        r9 = 0;
                                    }
                                    long j8 = this.z0.d;
                                    if (r11.b(obj3) == -1) {
                                        i6 = 4;
                                    } else {
                                        i6 = 3;
                                    }
                                    this.z0 = q(mediaPeriodId3, jL, j4, j8, r9, i6);
                                } else {
                                    PlaybackInfo playbackInfo4 = this.z0;
                                    obj3 = playbackInfo4.f5963b.f6384a;
                                    Timeline timeline5 = playbackInfo4.f5962a;
                                    if (z17) {
                                        r9 = 0;
                                    } else {
                                        r9 = 0;
                                    }
                                    long j9 = this.z0.d;
                                    if (r11.b(obj3) == -1) {
                                        i6 = 4;
                                    } else {
                                        i6 = 3;
                                    }
                                    this.z0 = q(mediaPeriodId3, jL, j4, j9, r9, i6);
                                }
                                D();
                                F(r11, this.z0.f5962a);
                                this.z0 = this.z0.h(r11);
                                if (!r11.p()) {
                                    this.N0 = r15;
                                }
                                m(false);
                                this.i0.sendEmptyMessage(r14);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            mediaPeriodId2 = mediaPeriodId7;
                            r7 = timeline;
                            r17 = r16;
                            c2 = c3;
                            r110 = r19;
                            j4 = j7;
                            r11 = r7;
                            r14 = r17;
                            r15 = c2;
                            r18 = r110;
                            PlaybackInfo playbackInfo5 = this.z0;
                            Timeline timeline6 = playbackInfo5.f5962a;
                            MediaSource.MediaPeriodId mediaPeriodId9 = playbackInfo5.f5963b;
                            if (positionUpdateForPlaylistChange.f) {
                                j5 = jL;
                            } else {
                                j5 = j;
                            }
                            mediaPeriodId3 = mediaPeriodId2;
                            h0(r11, mediaPeriodId3, timeline6, mediaPeriodId9, j5, false);
                            if (z17) {
                                PlaybackInfo playbackInfo6 = this.z0;
                                obj3 = playbackInfo6.f5963b.f6384a;
                                Timeline timeline7 = playbackInfo6.f5962a;
                                if (z17) {
                                    r9 = 0;
                                } else {
                                    r9 = 0;
                                }
                                long j10 = this.z0.d;
                                if (r11.b(obj3) == -1) {
                                    i6 = 4;
                                } else {
                                    i6 = 3;
                                }
                                this.z0 = q(mediaPeriodId3, jL, j4, j10, r9, i6);
                            } else {
                                PlaybackInfo playbackInfo7 = this.z0;
                                obj3 = playbackInfo7.f5963b.f6384a;
                                Timeline timeline8 = playbackInfo7.f5962a;
                                if (z17) {
                                    r9 = 0;
                                } else {
                                    r9 = 0;
                                }
                                long j11 = this.z0.d;
                                if (r11.b(obj3) == -1) {
                                    i6 = 4;
                                } else {
                                    i6 = 3;
                                }
                                this.z0 = q(mediaPeriodId3, jL, j4, j11, r9, i6);
                            }
                            D();
                            F(r11, this.z0.f5962a);
                            this.z0 = this.z0.h(r11);
                            if (!r11.p()) {
                                this.N0 = r15;
                            }
                            m(false);
                            this.i0.sendEmptyMessage(r14);
                            throw th;
                        }
                    }
                    PlaybackInfo playbackInfo8 = this.z0;
                    Timeline timeline9 = playbackInfo8.f5962a;
                    MediaSource.MediaPeriodId mediaPeriodId10 = playbackInfo8.f5963b;
                    if (positionUpdateForPlaylistChange.f) {
                        j6 = jL;
                    } else {
                        j6 = j;
                    }
                    mediaPeriodId4 = mediaPeriodId2;
                    h0(timeline, mediaPeriodId4, timeline9, mediaPeriodId10, j6, false);
                    if (z17) {
                        PlaybackInfo playbackInfo9 = this.z0;
                        obj4 = playbackInfo9.f5963b.f6384a;
                        Timeline timeline10 = playbackInfo9.f5962a;
                        if (z17) {
                            r10 = 0;
                        } else {
                            r10 = 0;
                        }
                        long j12 = this.z0.d;
                        if (timeline.b(obj4) == -1) {
                            i8 = 4;
                        } else {
                            i8 = 3;
                        }
                        this.z0 = q(mediaPeriodId4, jL, j7, j12, r10, i8);
                    } else {
                        PlaybackInfo playbackInfo10 = this.z0;
                        obj4 = playbackInfo10.f5963b.f6384a;
                        Timeline timeline11 = playbackInfo10.f5962a;
                        if (z17) {
                            r10 = 0;
                        } else {
                            r10 = 0;
                        }
                        long j13 = this.z0.d;
                        if (timeline.b(obj4) == -1) {
                            i8 = 4;
                        } else {
                            i8 = 3;
                        }
                        this.z0 = q(mediaPeriodId4, jL, j7, j13, r10, i8);
                    }
                    D();
                    F(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x035b: INVOKE 
                          (r34v0 'this' ?? I:androidx.media3.exoplayer.ExoPlayerImplInternal A[IMMUTABLE_TYPE, THIS])
                          (r2v41 androidx.media3.common.Timeline)
                          (wrap androidx.media3.common.Timeline:0x0359: IGET 
                          (wrap androidx.media3.exoplayer.PlaybackInfo:0x0357: IGET (r34v0 'this' ?? I:androidx.media3.exoplayer.ExoPlayerImplInternal A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] (LINE:856) androidx.media3.exoplayer.ExoPlayerImplInternal.z0 androidx.media3.exoplayer.PlaybackInfo)
                         A[WRAPPED] (LINE:858) androidx.media3.exoplayer.PlaybackInfo.a androidx.media3.common.Timeline)
                         VIRTUAL call: androidx.media3.exoplayer.ExoPlayerImplInternal.F(androidx.media3.common.Timeline, androidx.media3.common.Timeline):void A[MD:(androidx.media3.common.Timeline, androidx.media3.common.Timeline):void (m)] (LINE:860) in method: androidx.media3.exoplayer.ExoPlayerImplInternal.n(androidx.media3.common.Timeline, boolean):void, file: classes.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:320)
                        	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                        	at java.base/java.util.ArrayList.forEach(Unknown Source)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                        	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                        	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                        	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:414)
                        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:402)
                        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:352)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v41 androidx.media3.common.Timeline
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 1021
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.ExoPlayerImplInternal.n(androidx.media3.common.Timeline, boolean):void");
                }

                /* JADX WARN: Type inference failed for: r3v1, types: [androidx.media3.exoplayer.source.MediaPeriod, java.lang.Object] */
                public final void o(MediaPeriod mediaPeriod) throws ExoPlaybackException {
                    MediaPeriodQueue mediaPeriodQueue = this.t0;
                    MediaPeriodHolder mediaPeriodHolder = mediaPeriodQueue.k;
                    if (mediaPeriodHolder == null || mediaPeriodHolder.f5922a != mediaPeriod) {
                        return;
                    }
                    float f = this.p0.getPlaybackParameters().f5494a;
                    Timeline timeline = this.z0.f5962a;
                    mediaPeriodHolder.d = true;
                    mediaPeriodHolder.m = mediaPeriodHolder.f5922a.getTrackGroups();
                    TrackSelectorResult trackSelectorResultH = mediaPeriodHolder.h(f, timeline);
                    MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.f;
                    long j = mediaPeriodInfo.f5933e;
                    long jMax = mediaPeriodInfo.f5931b;
                    if (j != -9223372036854775807L && jMax >= j) {
                        jMax = Math.max(0L, j - 1);
                    }
                    long jA = mediaPeriodHolder.a(trackSelectorResultH, jMax, false, new boolean[mediaPeriodHolder.f5927i.length]);
                    long j2 = mediaPeriodHolder.o;
                    MediaPeriodInfo mediaPeriodInfo2 = mediaPeriodHolder.f;
                    mediaPeriodHolder.o = (mediaPeriodInfo2.f5931b - jA) + j2;
                    MediaPeriodInfo mediaPeriodInfoB = mediaPeriodInfo2.b(jA);
                    mediaPeriodHolder.f = mediaPeriodInfoB;
                    TrackGroupArray trackGroupArray = mediaPeriodHolder.m;
                    TrackSelectorResult trackSelectorResult = mediaPeriodHolder.f5929n;
                    Timeline timeline2 = this.z0.f5962a;
                    ExoTrackSelection[] exoTrackSelectionArr = trackSelectorResult.f6541c;
                    this.g0.f(this.x0, timeline2, mediaPeriodInfoB.f5930a, this.X, trackGroupArray, exoTrackSelectionArr);
                    if (mediaPeriodHolder == mediaPeriodQueue.f5941i) {
                        E(mediaPeriodHolder.f.f5931b);
                        g(new boolean[this.X.length], mediaPeriodQueue.j.e());
                        PlaybackInfo playbackInfo = this.z0;
                        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.f5963b;
                        long j3 = mediaPeriodHolder.f.f5931b;
                        this.z0 = q(mediaPeriodId, j3, playbackInfo.f5964c, j3, false, 5);
                    }
                    u();
                }

                @Override // androidx.media3.exoplayer.trackselection.TrackSelector.InvalidationListener
                public final void onTrackSelectionsInvalidated() {
                    this.i0.sendEmptyMessage(10);
                }

                public final void p(PlaybackParameters playbackParameters, float f, boolean z2, boolean z3) {
                    int i2;
                    if (z2) {
                        if (z3) {
                            this.A0.a(1);
                        }
                        this.z0 = this.z0.f(playbackParameters);
                    }
                    float f2 = playbackParameters.f5494a;
                    MediaPeriodHolder mediaPeriodHolder = this.t0.f5941i;
                    while (true) {
                        i2 = 0;
                        if (mediaPeriodHolder == null) {
                            break;
                        }
                        ExoTrackSelection[] exoTrackSelectionArr = mediaPeriodHolder.f5929n.f6541c;
                        int length = exoTrackSelectionArr.length;
                        while (i2 < length) {
                            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i2];
                            if (exoTrackSelection != null) {
                                exoTrackSelection.onPlaybackSpeed(f2);
                            }
                            i2++;
                        }
                        mediaPeriodHolder = mediaPeriodHolder.f5928l;
                    }
                    Renderer[] rendererArr = this.X;
                    int length2 = rendererArr.length;
                    while (i2 < length2) {
                        Renderer renderer = rendererArr[i2];
                        if (renderer != null) {
                            renderer.d(f, playbackParameters.f5494a);
                        }
                        i2++;
                    }
                }

                public final PlaybackInfo q(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, long j3, boolean z2, int i2) {
                    boolean z3;
                    this.R0 = (!this.R0 && j == this.z0.s && mediaPeriodId.equals(this.z0.f5963b)) ? false : true;
                    D();
                    PlaybackInfo playbackInfo = this.z0;
                    TrackGroupArray trackGroupArray = playbackInfo.f5966h;
                    TrackSelectorResult trackSelectorResult = playbackInfo.f5967i;
                    List listX = playbackInfo.j;
                    if (this.u0.k) {
                        MediaPeriodHolder mediaPeriodHolder = this.t0.f5941i;
                        trackGroupArray = mediaPeriodHolder == null ? TrackGroupArray.d : mediaPeriodHolder.m;
                        trackSelectorResult = mediaPeriodHolder == null ? this.f0 : mediaPeriodHolder.f5929n;
                        ExoTrackSelection[] exoTrackSelectionArr = trackSelectorResult.f6541c;
                        ImmutableList.Builder builder = new ImmutableList.Builder();
                        boolean z4 = false;
                        for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
                            if (exoTrackSelection != null) {
                                Metadata metadata = exoTrackSelection.getFormat(0).k;
                                if (metadata == null) {
                                    builder.h(new Metadata(new Metadata.Entry[0]));
                                } else {
                                    builder.h(metadata);
                                    z4 = true;
                                }
                            }
                        }
                        listX = z4 ? builder.j() : ImmutableList.x();
                        if (mediaPeriodHolder != null) {
                            MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.f;
                            if (mediaPeriodInfo.f5932c != j2) {
                                mediaPeriodHolder.f = mediaPeriodInfo.a(j2);
                            }
                        }
                        MediaPeriodHolder mediaPeriodHolder2 = this.t0.f5941i;
                        if (mediaPeriodHolder2 != null) {
                            TrackSelectorResult trackSelectorResult2 = mediaPeriodHolder2.f5929n;
                            int i3 = 0;
                            boolean z5 = false;
                            while (true) {
                                Renderer[] rendererArr = this.X;
                                if (i3 >= rendererArr.length) {
                                    z3 = true;
                                    break;
                                }
                                if (trackSelectorResult2.b(i3)) {
                                    if (rendererArr[i3].getTrackType() != 1) {
                                        z3 = false;
                                        break;
                                    }
                                    if (trackSelectorResult2.f6540b[i3].f5982a != 0) {
                                        z5 = true;
                                    }
                                }
                                i3++;
                            }
                            boolean z6 = z5 && z3;
                            if (z6 != this.L0) {
                                this.L0 = z6;
                                if (!z6 && this.z0.f5970p) {
                                    this.i0.sendEmptyMessage(2);
                                }
                            }
                        }
                    } else if (!mediaPeriodId.equals(playbackInfo.f5963b)) {
                        trackGroupArray = TrackGroupArray.d;
                        trackSelectorResult = this.f0;
                        listX = ImmutableList.x();
                    }
                    TrackGroupArray trackGroupArray2 = trackGroupArray;
                    TrackSelectorResult trackSelectorResult3 = trackSelectorResult;
                    List list = listX;
                    if (z2) {
                        PlaybackInfoUpdate playbackInfoUpdate = this.A0;
                        if (!playbackInfoUpdate.d || playbackInfoUpdate.f5902e == 5) {
                            playbackInfoUpdate.f5899a = true;
                            playbackInfoUpdate.d = true;
                            playbackInfoUpdate.f5902e = i2;
                        } else {
                            Assertions.b(i2 == 5);
                        }
                    }
                    PlaybackInfo playbackInfo2 = this.z0;
                    long j4 = playbackInfo2.q;
                    MediaPeriodHolder mediaPeriodHolder3 = this.t0.k;
                    return playbackInfo2.c(mediaPeriodId, j, j2, j3, mediaPeriodHolder3 == null ? 0L : Math.max(0L, j4 - (this.O0 - mediaPeriodHolder3.o)), trackGroupArray2, trackSelectorResult3, list);
                }

                /* JADX WARN: Type inference failed for: r2v0, types: [androidx.media3.exoplayer.source.MediaPeriod, androidx.media3.exoplayer.source.SequenceableLoader, java.lang.Object] */
                public final boolean r() {
                    MediaPeriodHolder mediaPeriodHolder = this.t0.k;
                    if (mediaPeriodHolder != null) {
                        try {
                            ?? r2 = mediaPeriodHolder.f5922a;
                            if (mediaPeriodHolder.d) {
                                for (SampleStream sampleStream : mediaPeriodHolder.f5924c) {
                                    if (sampleStream != null) {
                                        sampleStream.maybeThrowError();
                                    }
                                }
                            } else {
                                r2.maybeThrowPrepareError();
                            }
                            if ((!mediaPeriodHolder.d ? 0L : r2.getNextLoadPositionUs()) != Long.MIN_VALUE) {
                                return true;
                            }
                        } catch (IOException unused) {
                        }
                    }
                    return false;
                }

                public final boolean t() {
                    MediaPeriodHolder mediaPeriodHolder = this.t0.f5941i;
                    long j = mediaPeriodHolder.f.f5933e;
                    if (mediaPeriodHolder.d) {
                        return j == -9223372036854775807L || this.z0.s < j || !Z();
                    }
                    return false;
                }

                /* JADX WARN: Type inference failed for: r1v15, types: [androidx.media3.exoplayer.source.SequenceableLoader, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r1v9, types: [androidx.media3.exoplayer.source.MediaPeriod, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r7v1, types: [androidx.media3.exoplayer.source.SequenceableLoader, java.lang.Object] */
                public final void u() {
                    long j;
                    long j2;
                    boolean zD;
                    if (r()) {
                        MediaPeriodHolder mediaPeriodHolder = this.t0.k;
                        long nextLoadPositionUs = !mediaPeriodHolder.d ? 0L : mediaPeriodHolder.f5922a.getNextLoadPositionUs();
                        MediaPeriodHolder mediaPeriodHolder2 = this.t0.k;
                        long jMax = mediaPeriodHolder2 == null ? 0L : Math.max(0L, nextLoadPositionUs - (this.O0 - mediaPeriodHolder2.o));
                        if (mediaPeriodHolder == this.t0.f5941i) {
                            j = this.O0;
                            j2 = mediaPeriodHolder.o;
                        } else {
                            j = this.O0 - mediaPeriodHolder.o;
                            j2 = mediaPeriodHolder.f.f5931b;
                        }
                        long j3 = j - j2;
                        long j4 = a0(this.z0.f5962a, mediaPeriodHolder.f.f5930a) ? this.v0.f5839i : -9223372036854775807L;
                        PlayerId playerId = this.x0;
                        Timeline timeline = this.z0.f5962a;
                        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodHolder.f.f5930a;
                        float f = this.p0.getPlaybackParameters().f5494a;
                        boolean z2 = this.z0.f5968l;
                        LoadControl.Parameters parameters = new LoadControl.Parameters(playerId, timeline, mediaPeriodId, j3, jMax, f, this.E0, j4);
                        zD = this.g0.d(parameters);
                        MediaPeriodHolder mediaPeriodHolder3 = this.t0.f5941i;
                        if (!zD && mediaPeriodHolder3.d && jMax < 500000 && (this.n0 > 0 || this.o0)) {
                            mediaPeriodHolder3.f5922a.discardBuffer(this.z0.s, false);
                            zD = this.g0.d(parameters);
                        }
                    } else {
                        zD = false;
                    }
                    this.G0 = zD;
                    if (zD) {
                        MediaPeriodHolder mediaPeriodHolder4 = this.t0.k;
                        long j5 = this.O0;
                        float f2 = this.p0.getPlaybackParameters().f5494a;
                        long j6 = this.F0;
                        Assertions.e(mediaPeriodHolder4.f5928l == null);
                        long j7 = j5 - mediaPeriodHolder4.o;
                        ?? r1 = mediaPeriodHolder4.f5922a;
                        LoadingInfo.Builder builder = new LoadingInfo.Builder();
                        builder.f5919a = -9223372036854775807L;
                        builder.f5920b = -3.4028235E38f;
                        builder.f5921c = -9223372036854775807L;
                        builder.f5919a = j7;
                        Assertions.b(f2 > 0.0f || f2 == -3.4028235E38f);
                        builder.f5920b = f2;
                        Assertions.b(j6 >= 0 || j6 == -9223372036854775807L);
                        builder.f5921c = j6;
                        r1.a(new LoadingInfo(builder));
                    }
                    e0();
                }

                public final void v() {
                    PlaybackInfoUpdate playbackInfoUpdate = this.A0;
                    PlaybackInfo playbackInfo = this.z0;
                    boolean z2 = playbackInfoUpdate.f5899a | (playbackInfoUpdate.f5900b != playbackInfo);
                    playbackInfoUpdate.f5899a = z2;
                    playbackInfoUpdate.f5900b = playbackInfo;
                    if (z2) {
                        this.s0.a(playbackInfoUpdate);
                        this.A0 = new PlaybackInfoUpdate(this.z0);
                    }
                }

                public final void w() throws Throwable {
                    n(this.u0.b(), true);
                }

                public final void x(MoveMediaItemsMessage moveMediaItemsMessage) throws Throwable {
                    this.A0.a(1);
                    moveMediaItemsMessage.getClass();
                    MediaSourceList mediaSourceList = this.u0;
                    mediaSourceList.getClass();
                    Assertions.b(mediaSourceList.f5946b.size() >= 0);
                    mediaSourceList.j = null;
                    n(mediaSourceList.b(), false);
                }

                public final void y() {
                    this.A0.a(1);
                    int i2 = 0;
                    C(false, false, false, true);
                    this.g0.b(this.x0);
                    Y(this.z0.f5962a.p() ? 4 : 2);
                    TransferListener transferListenerA = this.h0.a();
                    MediaSourceList mediaSourceList = this.u0;
                    Assertions.e(!mediaSourceList.k);
                    mediaSourceList.f5951l = transferListenerA;
                    while (true) {
                        ArrayList arrayList = mediaSourceList.f5946b;
                        if (i2 >= arrayList.size()) {
                            mediaSourceList.k = true;
                            this.i0.sendEmptyMessage(2);
                            return;
                        } else {
                            MediaSourceList.MediaSourceHolder mediaSourceHolder = (MediaSourceList.MediaSourceHolder) arrayList.get(i2);
                            mediaSourceList.e(mediaSourceHolder);
                            mediaSourceList.g.add(mediaSourceHolder);
                            i2++;
                        }
                    }
                }

                public final void z() {
                    int i2 = 0;
                    try {
                        C(true, false, true, false);
                        while (true) {
                            Renderer[] rendererArr = this.X;
                            if (i2 >= rendererArr.length) {
                                break;
                            }
                            this.Z[i2].f();
                            rendererArr[i2].release();
                            i2++;
                        }
                        this.g0.c(this.x0);
                        Y(1);
                        HandlerThread handlerThread = this.j0;
                        if (handlerThread != null) {
                            handlerThread.quit();
                        }
                        synchronized (this) {
                            this.B0 = true;
                            notifyAll();
                        }
                    } catch (Throwable th) {
                        HandlerThread handlerThread2 = this.j0;
                        if (handlerThread2 != null) {
                            handlerThread2.quit();
                        }
                        synchronized (this) {
                            this.B0 = true;
                            notifyAll();
                            throw th;
                        }
                    }
                }
            }
