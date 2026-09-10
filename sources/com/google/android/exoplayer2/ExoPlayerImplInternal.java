package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataRenderer;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.MediaPeriod;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.SampleStream;
import com.google.android.exoplayer2.source.SequenceableLoader;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.TextRenderer;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.upstream.DataSourceException;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.exoplayer2.upstream.TransferListener;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MediaClock;
import com.google.android.exoplayer2.util.StandaloneMediaClock;
import com.google.android.exoplayer2.util.SystemClock;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.android.exoplayer2.util.Util;
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

/* JADX INFO: loaded from: classes3.dex */
final class ExoPlayerImplInternal implements Handler.Callback, MediaPeriod.Callback, TrackSelector.InvalidationListener, MediaSourceList.MediaSourceListInfoRefreshListener, DefaultMediaClock.PlaybackParametersListener, PlayerMessage.Sender {
    public boolean A0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public boolean H0;
    public boolean I0;
    public boolean J0;
    public int K0;
    public SeekPosition L0;
    public long M0;
    public int N0;
    public boolean O0;
    public ExoPlaybackException P0;
    public final Renderer[] X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Set f17062Y;
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
    public final h s0;
    public final MediaPeriodQueue t0;
    public final MediaSourceList u0;
    public final DefaultLivePlaybackSpeedControl v0;
    public final long w0;
    public SeekParameters x0;
    public PlaybackInfo y0;
    public PlaybackInfoUpdate z0;
    public int F0 = 0;
    public boolean G0 = false;
    public boolean B0 = false;
    public long Q0 = -9223372036854775807L;

    public static final class MediaSourceListUpdateMessage {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ArrayList f17064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ShuffleOrder f17065b;

        public MediaSourceListUpdateMessage(ArrayList arrayList, ShuffleOrder shuffleOrder) {
            this.f17064a = arrayList;
            this.f17065b = shuffleOrder;
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
        public boolean f17066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public PlaybackInfo f17067b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f17068c;
        public boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17069e;
        public boolean f;
        public int g;

        public PlaybackInfoUpdate(PlaybackInfo playbackInfo) {
            this.f17067b = playbackInfo;
        }

        public final void a(int i2) {
            this.f17066a |= i2 > 0;
            this.f17068c += i2;
        }
    }

    public interface PlaybackInfoUpdateListener {
    }

    public static final class PositionUpdateForPlaylistChange {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MediaSource.MediaPeriodId f17070a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f17071b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f17072c;
        public final boolean d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f17073e;
        public final boolean f;

        public PositionUpdateForPlaylistChange(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, boolean z2, boolean z3, boolean z4) {
            this.f17070a = mediaPeriodId;
            this.f17071b = j;
            this.f17072c = j2;
            this.d = z2;
            this.f17073e = z3;
            this.f = z4;
        }
    }

    public static final class SeekPosition {
    }

    public ExoPlayerImplInternal(Renderer[] rendererArr, TrackSelector trackSelector, TrackSelectorResult trackSelectorResult, LoadControl loadControl, BandwidthMeter bandwidthMeter, AnalyticsCollector analyticsCollector, SeekParameters seekParameters, DefaultLivePlaybackSpeedControl defaultLivePlaybackSpeedControl, long j, Looper looper, SystemClock systemClock, h hVar, PlayerId playerId) {
        this.s0 = hVar;
        this.X = rendererArr;
        this.e0 = trackSelector;
        this.f0 = trackSelectorResult;
        this.g0 = loadControl;
        this.h0 = bandwidthMeter;
        this.x0 = seekParameters;
        this.v0 = defaultLivePlaybackSpeedControl;
        this.w0 = j;
        this.r0 = systemClock;
        this.n0 = loadControl.getBackBufferDurationUs();
        this.o0 = loadControl.retainBackBufferFromKeyframe();
        PlaybackInfo playbackInfoG = PlaybackInfo.g(trackSelectorResult);
        this.y0 = playbackInfoG;
        this.z0 = new PlaybackInfoUpdate(playbackInfoG);
        this.Z = new RendererCapabilities[rendererArr.length];
        for (int i2 = 0; i2 < rendererArr.length; i2++) {
            rendererArr[i2].b(i2, playerId);
            this.Z[i2] = rendererArr[i2].getCapabilities();
        }
        this.p0 = new DefaultMediaClock(this, systemClock);
        this.q0 = new ArrayList();
        this.f17062Y = Sets.g();
        this.l0 = new Timeline.Window();
        this.m0 = new Timeline.Period();
        trackSelector.f18707a = this;
        trackSelector.f18708b = bandwidthMeter;
        this.O0 = true;
        HandlerWrapper handlerWrapperCreateHandler = systemClock.createHandler(looper, null);
        this.t0 = new MediaPeriodQueue(analyticsCollector, handlerWrapperCreateHandler);
        this.u0 = new MediaSourceList(this, analyticsCollector, handlerWrapperCreateHandler, playerId);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.j0 = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.k0 = looper2;
        this.i0 = systemClock.createHandler(looper2, this);
    }

    public static Pair G(Timeline timeline, SeekPosition seekPosition, boolean z2, int i2, boolean z3, Timeline.Window window, Timeline.Period period) {
        seekPosition.getClass();
        if (timeline.p()) {
            return null;
        }
        throw null;
    }

    public static Object H(Timeline.Window window, Timeline.Period period, int i2, boolean z2, Object obj, Timeline timeline, Timeline timeline2) {
        int iB = timeline.b(obj);
        int iH = timeline.h();
        int i3 = 0;
        int iD = iB;
        int iB2 = -1;
        while (i3 < iH && iB2 == -1) {
            Timeline.Window window2 = window;
            Timeline.Period period2 = period;
            int i4 = i2;
            boolean z3 = z2;
            Timeline timeline3 = timeline;
            iD = timeline3.d(iD, period2, window2, i4, z3);
            if (iD == -1) {
                break;
            }
            iB2 = timeline2.b(timeline3.l(iD));
            i3++;
            timeline = timeline3;
            period = period2;
            window = window2;
            i2 = i4;
            z2 = z3;
        }
        if (iB2 == -1) {
            return null;
        }
        return timeline2.l(iB2);
    }

    public static void N(Renderer renderer, long j) {
        renderer.setCurrentStreamFinal();
        if (renderer instanceof TextRenderer) {
            TextRenderer textRenderer = (TextRenderer) renderer;
            Assertions.d(textRenderer.l0);
            textRenderer.B0 = j;
        }
    }

    public static boolean s(Renderer renderer) {
        return renderer.getState() != 0;
    }

    public final void A(int i2, int i3, ShuffleOrder shuffleOrder) throws Throwable {
        this.z0.a(1);
        MediaSourceList mediaSourceList = this.u0;
        mediaSourceList.getClass();
        Assertions.b(i2 >= 0 && i2 <= i3 && i3 <= mediaSourceList.f17159b.size());
        mediaSourceList.j = shuffleOrder;
        mediaSourceList.g(i2, i3);
        n(mediaSourceList.b(), false);
    }

    public final void B() throws ExoPlaybackException {
        int i2;
        float f = this.p0.getPlaybackParameters().X;
        MediaPeriodQueue mediaPeriodQueue = this.t0;
        MediaPeriodHolder mediaPeriodHolder = mediaPeriodQueue.f17155h;
        MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodQueue.f17156i;
        boolean z2 = true;
        for (MediaPeriodHolder mediaPeriodHolder3 = mediaPeriodHolder; mediaPeriodHolder3 != null && mediaPeriodHolder3.d; mediaPeriodHolder3 = mediaPeriodHolder3.f17143l) {
            TrackSelectorResult trackSelectorResultG = mediaPeriodHolder3.g(f, this.y0.f17176a);
            TrackSelectorResult trackSelectorResult = mediaPeriodHolder3.f17144n;
            if (trackSelectorResult != null) {
                int length = trackSelectorResult.f18711c.length;
                ExoTrackSelection[] exoTrackSelectionArr = trackSelectorResultG.f18711c;
                if (length == exoTrackSelectionArr.length) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= exoTrackSelectionArr.length) {
                            if (mediaPeriodHolder3 == mediaPeriodHolder2) {
                                z2 = false;
                            }
                        } else if (trackSelectorResultG.a(trackSelectorResult, i3)) {
                            i3++;
                        }
                    }
                }
            }
            if (z2) {
                MediaPeriodQueue mediaPeriodQueue2 = this.t0;
                MediaPeriodHolder mediaPeriodHolder4 = mediaPeriodQueue2.f17155h;
                boolean zK = mediaPeriodQueue2.k(mediaPeriodHolder4);
                boolean[] zArr = new boolean[this.X.length];
                long jA = mediaPeriodHolder4.a(trackSelectorResultG, this.y0.r, zK, zArr);
                PlaybackInfo playbackInfo = this.y0;
                boolean z3 = (playbackInfo.f17179e == 4 || jA == playbackInfo.r) ? false : true;
                PlaybackInfo playbackInfo2 = this.y0;
                i2 = 4;
                this.y0 = q(playbackInfo2.f17177b, jA, playbackInfo2.f17178c, playbackInfo2.d, z3, 5);
                if (z3) {
                    E(jA);
                }
                boolean[] zArr2 = new boolean[this.X.length];
                int i4 = 0;
                while (true) {
                    Renderer[] rendererArr = this.X;
                    if (i4 >= rendererArr.length) {
                        break;
                    }
                    Renderer renderer = rendererArr[i4];
                    boolean zS = s(renderer);
                    zArr2[i4] = zS;
                    SampleStream sampleStream = mediaPeriodHolder4.f17139c[i4];
                    if (zS) {
                        if (sampleStream != renderer.getStream()) {
                            d(renderer);
                        } else if (zArr[i4]) {
                            renderer.resetPosition(this.M0);
                        }
                    }
                    i4++;
                }
                g(zArr2);
            } else {
                i2 = 4;
                this.t0.k(mediaPeriodHolder3);
                if (mediaPeriodHolder3.d) {
                    mediaPeriodHolder3.a(trackSelectorResultG, Math.max(mediaPeriodHolder3.f.f17146b, this.M0 - mediaPeriodHolder3.o), false, new boolean[mediaPeriodHolder3.f17142i.length]);
                }
            }
            m(true);
            if (this.y0.f17179e != i2) {
                u();
                e0();
                this.i0.sendEmptyMessage(2);
                return;
            }
            return;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0090  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bf A[PHI: r4 r5 r7
  0x00bf: PHI (r4v4 com.google.android.exoplayer2.source.MediaSource$MediaPeriodId) = 
  (r4v3 com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)
  (r4v10 com.google.android.exoplayer2.source.MediaSource$MediaPeriodId)
 binds: [B:35:0x0094, B:37:0x00b9] A[DONT_GENERATE, DONT_INLINE]
  0x00bf: PHI (r5v2 long) = (r5v1 long), (r5v8 long) binds: [B:35:0x0094, B:37:0x00b9] A[DONT_GENERATE, DONT_INLINE]
  0x00bf: PHI (r7v3 long) = (r7v2 long), (r7v8 long) binds: [B:35:0x0094, B:37:0x00b9] A[DONT_GENERATE, DONT_INLINE]] */
    public final void C(boolean z2, boolean z3, boolean z4, boolean z5) {
        long j;
        boolean z6;
        this.i0.removeMessages(2);
        this.P0 = null;
        this.D0 = false;
        DefaultMediaClock defaultMediaClock = this.p0;
        defaultMediaClock.g0 = false;
        StandaloneMediaClock standaloneMediaClock = defaultMediaClock.X;
        if (standaloneMediaClock.f18969Y) {
            standaloneMediaClock.a(standaloneMediaClock.getPositionUs());
            standaloneMediaClock.f18969Y = false;
        }
        this.M0 = 1000000000000L;
        for (Renderer renderer : this.X) {
            try {
                d(renderer);
            } catch (ExoPlaybackException | RuntimeException e2) {
                Log.d("ExoPlayerImplInternal", "Disable failed.", e2);
            }
        }
        if (z2) {
            for (Renderer renderer2 : this.X) {
                if (this.f17062Y.remove(renderer2)) {
                    try {
                        renderer2.reset();
                    } catch (RuntimeException e3) {
                        Log.d("ExoPlayerImplInternal", "Reset failed.", e3);
                    }
                }
            }
        }
        this.K0 = 0;
        PlaybackInfo playbackInfo = this.y0;
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.f17177b;
        long jLongValue = playbackInfo.r;
        if (this.y0.f17177b.a()) {
            j = this.y0.f17178c;
        } else {
            PlaybackInfo playbackInfo2 = this.y0;
            Timeline.Period period = this.m0;
            MediaSource.MediaPeriodId mediaPeriodId2 = playbackInfo2.f17177b;
            Timeline timeline = playbackInfo2.f17176a;
            if (timeline.p() || timeline.g(mediaPeriodId2.f18347a, period).g0) {
                j = this.y0.f17178c;
            } else {
                j = this.y0.r;
            }
        }
        if (z3) {
            this.L0 = null;
            Pair pairJ = j(this.y0.f17176a);
            mediaPeriodId = (MediaSource.MediaPeriodId) pairJ.first;
            jLongValue = ((Long) pairJ.second).longValue();
            j = -9223372036854775807L;
            if (mediaPeriodId.equals(this.y0.f17177b)) {
                z6 = false;
            } else {
                z6 = true;
            }
        } else {
            z6 = false;
        }
        long j2 = jLongValue;
        MediaSource.MediaPeriodId mediaPeriodId3 = mediaPeriodId;
        this.t0.b();
        this.E0 = false;
        PlaybackInfo playbackInfo3 = this.y0;
        Timeline timeline2 = playbackInfo3.f17176a;
        int i2 = playbackInfo3.f17179e;
        ExoPlaybackException exoPlaybackException = z5 ? null : playbackInfo3.f;
        TrackGroupArray trackGroupArray = z6 ? TrackGroupArray.e0 : playbackInfo3.f17180h;
        TrackSelectorResult trackSelectorResult = z6 ? this.f0 : playbackInfo3.f17181i;
        List listX = z6 ? ImmutableList.x() : playbackInfo3.j;
        PlaybackInfo playbackInfo4 = this.y0;
        this.y0 = new PlaybackInfo(timeline2, mediaPeriodId3, j, j2, i2, exoPlaybackException, false, trackGroupArray, trackSelectorResult, listX, mediaPeriodId3, playbackInfo4.f17182l, playbackInfo4.m, playbackInfo4.f17183n, j2, 0L, j2, false);
        if (z4) {
            MediaSourceList mediaSourceList = this.u0;
            HashMap map = mediaSourceList.f;
            for (MediaSourceList.MediaSourceAndListener mediaSourceAndListener : map.values()) {
                try {
                    mediaSourceAndListener.f17166a.w(mediaSourceAndListener.f17167b);
                } catch (RuntimeException e4) {
                    Log.d("MediaSourceList", "Failed to release child source.", e4);
                }
                MediaSource mediaSource = mediaSourceAndListener.f17166a;
                MediaSourceList.ForwardingEventListener forwardingEventListener = mediaSourceAndListener.f17168c;
                mediaSource.y(forwardingEventListener);
                mediaSourceAndListener.f17166a.J(forwardingEventListener);
            }
            map.clear();
            mediaSourceList.g.clear();
            mediaSourceList.k = false;
        }
    }

    public final void D() {
        MediaPeriodHolder mediaPeriodHolder = this.t0.f17155h;
        this.C0 = mediaPeriodHolder != null && mediaPeriodHolder.f.f17149h && this.B0;
    }

    public final void E(long j) {
        MediaPeriodHolder mediaPeriodHolder = this.t0.f17155h;
        long j2 = j + (mediaPeriodHolder == null ? 1000000000000L : mediaPeriodHolder.o);
        this.M0 = j2;
        this.p0.X.a(j2);
        for (Renderer renderer : this.X) {
            if (s(renderer)) {
                renderer.resetPosition(this.M0);
            }
        }
        for (MediaPeriodHolder mediaPeriodHolder2 = r0.f17155h; mediaPeriodHolder2 != null; mediaPeriodHolder2 = mediaPeriodHolder2.f17143l) {
            for (ExoTrackSelection exoTrackSelection : mediaPeriodHolder2.f17144n.f18711c) {
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

    public final void I(boolean z2) throws ExoPlaybackException {
        MediaSource.MediaPeriodId mediaPeriodId = this.t0.f17155h.f.f17145a;
        long jK = K(mediaPeriodId, this.y0.r, true, false);
        if (jK != this.y0.r) {
            PlaybackInfo playbackInfo = this.y0;
            this.y0 = q(mediaPeriodId, jK, playbackInfo.f17178c, playbackInfo.d, z2, 5);
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [com.google.android.exoplayer2.source.MediaPeriod, java.lang.Object] */
    public final void J(SeekPosition seekPosition) throws Throwable {
        long jLongValue;
        MediaSource.MediaPeriodId mediaPeriodId;
        boolean z2;
        long j;
        long j2;
        long jC;
        PlaybackInfo playbackInfo;
        int i2;
        long j3;
        int i3;
        long j4;
        ExoPlayerImplInternal exoPlayerImplInternal = this;
        exoPlayerImplInternal.z0.a(1);
        Pair pairG = G(exoPlayerImplInternal.y0.f17176a, seekPosition, true, exoPlayerImplInternal.F0, exoPlayerImplInternal.G0, exoPlayerImplInternal.l0, exoPlayerImplInternal.m0);
        if (pairG == null) {
            Pair pairJ = exoPlayerImplInternal.j(exoPlayerImplInternal.y0.f17176a);
            MediaSource.MediaPeriodId mediaPeriodId2 = (MediaSource.MediaPeriodId) pairJ.first;
            jLongValue = ((Long) pairJ.second).longValue();
            z2 = !exoPlayerImplInternal.y0.f17176a.p();
            j = -9223372036854775807L;
            mediaPeriodId = mediaPeriodId2;
        } else {
            Object obj = pairG.first;
            jLongValue = ((Long) pairG.second).longValue();
            long j5 = 0 == -9223372036854775807L ? -9223372036854775807L : jLongValue;
            MediaSource.MediaPeriodId mediaPeriodIdM = exoPlayerImplInternal.t0.m(exoPlayerImplInternal.y0.f17176a, obj, jLongValue);
            if (mediaPeriodIdM.a()) {
                exoPlayerImplInternal.y0.f17176a.g(mediaPeriodIdM.f18347a, exoPlayerImplInternal.m0);
                jLongValue = exoPlayerImplInternal.m0.e(mediaPeriodIdM.f18348b) == mediaPeriodIdM.f18349c ? exoPlayerImplInternal.m0.h0.f18426Y : 0L;
                mediaPeriodId = mediaPeriodIdM;
                j = j5;
                z2 = true;
            } else {
                mediaPeriodId = mediaPeriodIdM;
                z2 = 0 == -9223372036854775807L;
                j = j5;
            }
        }
        try {
            if (!exoPlayerImplInternal.y0.f17176a.p()) {
                if (pairG == null) {
                    if (exoPlayerImplInternal.y0.f17179e != 1) {
                        exoPlayerImplInternal.X(4);
                    }
                    exoPlayerImplInternal.C(false, true, false, true);
                } else {
                    if (mediaPeriodId.equals(exoPlayerImplInternal.y0.f17177b)) {
                        try {
                            try {
                                MediaPeriodHolder mediaPeriodHolder = exoPlayerImplInternal.t0.f17155h;
                                jC = (mediaPeriodHolder == null || !mediaPeriodHolder.d || jLongValue == 0) ? jLongValue : mediaPeriodHolder.f17137a.c(jLongValue, exoPlayerImplInternal.x0);
                                if (Util.J(jC) == Util.J(exoPlayerImplInternal.y0.r) && ((i2 = (playbackInfo = exoPlayerImplInternal.y0).f17179e) == 2 || i2 == 3)) {
                                    j3 = playbackInfo.r;
                                    i3 = 2;
                                    j4 = j3;
                                }
                            } catch (Throwable th) {
                                th = th;
                                j = j;
                                j = j;
                                j2 = jLongValue;
                                exoPlayerImplInternal.y0 = exoPlayerImplInternal.q(mediaPeriodId, j2, j, j2, z2, 2);
                                throw th;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            j2 = jLongValue;
                            exoPlayerImplInternal.y0 = exoPlayerImplInternal.q(mediaPeriodId, j2, j, j2, z2, 2);
                            throw th;
                        }
                    } else {
                        jC = jLongValue;
                    }
                    try {
                        boolean z3 = exoPlayerImplInternal.y0.f17179e == 4;
                        try {
                            MediaPeriodQueue mediaPeriodQueue = exoPlayerImplInternal.t0;
                            long jK = exoPlayerImplInternal.K(mediaPeriodId, jC, mediaPeriodQueue.f17155h != mediaPeriodQueue.f17156i, z3);
                            z2 |= jLongValue != jK;
                            try {
                                PlaybackInfo playbackInfo2 = exoPlayerImplInternal.y0;
                                MediaSource.MediaPeriodId mediaPeriodId3 = mediaPeriodId;
                                try {
                                    Timeline timeline = playbackInfo2.f17176a;
                                    long j6 = j;
                                    try {
                                        exoPlayerImplInternal.f0(timeline, mediaPeriodId3, timeline, playbackInfo2.f17177b, j6, true);
                                        mediaPeriodId = mediaPeriodId3;
                                        j = j6;
                                        j3 = jK;
                                        i3 = 2;
                                        j4 = j3;
                                        exoPlayerImplInternal = this;
                                    } catch (Throwable th3) {
                                        th = th3;
                                        mediaPeriodId = mediaPeriodId3;
                                        j = j6;
                                        j2 = jK;
                                        exoPlayerImplInternal.y0 = exoPlayerImplInternal.q(mediaPeriodId, j2, j, j2, z2, 2);
                                        throw th;
                                    }
                                } catch (Throwable th4) {
                                    th = th4;
                                    mediaPeriodId = mediaPeriodId3;
                                    j = j;
                                    j2 = jK;
                                    exoPlayerImplInternal.y0 = exoPlayerImplInternal.q(mediaPeriodId, j2, j, j2, z2, 2);
                                    throw th;
                                }
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            j = j;
                            j2 = jLongValue;
                            exoPlayerImplInternal.y0 = exoPlayerImplInternal.q(mediaPeriodId, j2, j, j2, z2, 2);
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                }
                exoPlayerImplInternal.y0 = exoPlayerImplInternal.q(mediaPeriodId, j3, j, j4, z2, i3);
            }
            exoPlayerImplInternal.L0 = seekPosition;
            j3 = jLongValue;
            i3 = 2;
            j4 = j3;
            exoPlayerImplInternal = this;
            exoPlayerImplInternal.y0 = exoPlayerImplInternal.q(mediaPeriodId, j3, j, j4, z2, i3);
        } catch (Throwable th8) {
            th = th8;
        }
    }

    /* JADX WARN: Type inference failed for: r9v7, types: [com.google.android.exoplayer2.source.MediaPeriod, java.lang.Object] */
    public final long K(MediaSource.MediaPeriodId mediaPeriodId, long j, boolean z2, boolean z3) throws ExoPlaybackException {
        c0();
        this.D0 = false;
        if (z3 || this.y0.f17179e == 3) {
            X(2);
        }
        MediaPeriodQueue mediaPeriodQueue = this.t0;
        MediaPeriodHolder mediaPeriodHolder = mediaPeriodQueue.f17155h;
        MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodHolder;
        while (mediaPeriodHolder2 != null && !mediaPeriodId.equals(mediaPeriodHolder2.f.f17145a)) {
            mediaPeriodHolder2 = mediaPeriodHolder2.f17143l;
        }
        if (z2 || mediaPeriodHolder != mediaPeriodHolder2 || (mediaPeriodHolder2 != null && mediaPeriodHolder2.o + j < 0)) {
            Renderer[] rendererArr = this.X;
            for (Renderer renderer : rendererArr) {
                d(renderer);
            }
            if (mediaPeriodHolder2 != null) {
                while (mediaPeriodQueue.f17155h != mediaPeriodHolder2) {
                    mediaPeriodQueue.a();
                }
                mediaPeriodQueue.k(mediaPeriodHolder2);
                mediaPeriodHolder2.o = 1000000000000L;
                g(new boolean[rendererArr.length]);
            }
        }
        if (mediaPeriodHolder2 != null) {
            mediaPeriodQueue.k(mediaPeriodHolder2);
            if (!mediaPeriodHolder2.d) {
                mediaPeriodHolder2.f = mediaPeriodHolder2.f.b(j);
            } else if (mediaPeriodHolder2.f17140e) {
                ?? r9 = mediaPeriodHolder2.f17137a;
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

    public final void L(PlayerMessage playerMessage) {
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
            playerMessage.f17189a.handleMessage(playerMessage.d, playerMessage.f17192e);
            playerMessage.b(true);
            int i2 = this.y0.f17179e;
            if (i2 == 3 || i2 == 2) {
                handlerWrapper.sendEmptyMessage(2);
            }
        } catch (Throwable th) {
            playerMessage.b(true);
            throw th;
        }
    }

    public final void M(PlayerMessage playerMessage) {
        Looper looper = playerMessage.f;
        if (looper.getThread().isAlive()) {
            this.r0.createHandler(looper, null).post(new j(1, this, playerMessage));
        } else {
            Log.g("TAG", "Trying to send message on a dead thread.");
            playerMessage.b(false);
        }
    }

    public final void O(boolean z2, AtomicBoolean atomicBoolean) {
        if (this.H0 != z2) {
            this.H0 = z2;
            if (!z2) {
                for (Renderer renderer : this.X) {
                    if (!s(renderer) && this.f17062Y.remove(renderer)) {
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

    public final void P(MediaSourceListUpdateMessage mediaSourceListUpdateMessage) throws Throwable {
        this.z0.a(1);
        mediaSourceListUpdateMessage.getClass();
        ArrayList arrayList = mediaSourceListUpdateMessage.f17064a;
        MediaSourceList mediaSourceList = this.u0;
        ArrayList arrayList2 = mediaSourceList.f17159b;
        mediaSourceList.g(0, arrayList2.size());
        n(mediaSourceList.a(arrayList2.size(), arrayList, mediaSourceListUpdateMessage.f17065b), false);
    }

    public final void Q(boolean z2) {
        if (z2 == this.J0) {
            return;
        }
        this.J0 = z2;
        if (z2 || !this.y0.o) {
            return;
        }
        this.i0.sendEmptyMessage(2);
    }

    public final void R(boolean z2) throws ExoPlaybackException {
        this.B0 = z2;
        D();
        if (this.C0) {
            MediaPeriodQueue mediaPeriodQueue = this.t0;
            if (mediaPeriodQueue.f17156i != mediaPeriodQueue.f17155h) {
                I(true);
                m(false);
            }
        }
    }

    public final void S(int i2, int i3, boolean z2, boolean z3) {
        this.z0.a(z3 ? 1 : 0);
        PlaybackInfoUpdate playbackInfoUpdate = this.z0;
        playbackInfoUpdate.f17066a = true;
        playbackInfoUpdate.f = true;
        playbackInfoUpdate.g = i3;
        this.y0 = this.y0.c(i2, z2);
        this.D0 = false;
        for (MediaPeriodHolder mediaPeriodHolder = this.t0.f17155h; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.f17143l) {
            for (ExoTrackSelection exoTrackSelection : mediaPeriodHolder.f17144n.f18711c) {
                if (exoTrackSelection != null) {
                    exoTrackSelection.b(z2);
                }
            }
        }
        if (!Y()) {
            c0();
            e0();
            return;
        }
        int i4 = this.y0.f17179e;
        HandlerWrapper handlerWrapper = this.i0;
        if (i4 == 3) {
            a0();
            handlerWrapper.sendEmptyMessage(2);
        } else if (i4 == 2) {
            handlerWrapper.sendEmptyMessage(2);
        }
    }

    public final void T(PlaybackParameters playbackParameters) {
        this.i0.removeMessages(16);
        DefaultMediaClock defaultMediaClock = this.p0;
        defaultMediaClock.f(playbackParameters);
        PlaybackParameters playbackParameters2 = defaultMediaClock.getPlaybackParameters();
        p(playbackParameters2, playbackParameters2.X, true, true);
    }

    public final void U(int i2) throws ExoPlaybackException {
        this.F0 = i2;
        Timeline timeline = this.y0.f17176a;
        MediaPeriodQueue mediaPeriodQueue = this.t0;
        mediaPeriodQueue.f = i2;
        if (!mediaPeriodQueue.n(timeline)) {
            I(true);
        }
        m(false);
    }

    public final void V(boolean z2) throws ExoPlaybackException {
        this.G0 = z2;
        Timeline timeline = this.y0.f17176a;
        MediaPeriodQueue mediaPeriodQueue = this.t0;
        mediaPeriodQueue.g = z2;
        if (!mediaPeriodQueue.n(timeline)) {
            I(true);
        }
        m(false);
    }

    public final void W(ShuffleOrder shuffleOrder) throws Throwable {
        this.z0.a(1);
        MediaSourceList mediaSourceList = this.u0;
        int size = mediaSourceList.f17159b.size();
        if (shuffleOrder.getLength() != size) {
            shuffleOrder = shuffleOrder.cloneAndClear().cloneAndInsert(0, size);
        }
        mediaSourceList.j = shuffleOrder;
        n(mediaSourceList.b(), false);
    }

    public final void X(int i2) {
        PlaybackInfo playbackInfo = this.y0;
        if (playbackInfo.f17179e != i2) {
            if (i2 != 2) {
                this.Q0 = -9223372036854775807L;
            }
            this.y0 = playbackInfo.e(i2);
        }
    }

    public final boolean Y() {
        PlaybackInfo playbackInfo = this.y0;
        return playbackInfo.f17182l && playbackInfo.m == 0;
    }

    public final boolean Z(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId) {
        if (mediaPeriodId.a() || timeline.p()) {
            return false;
        }
        int i2 = timeline.g(mediaPeriodId.f18347a, this.m0).Z;
        Timeline.Window window = this.l0;
        timeline.n(i2, window);
        return window.a() && window.i0 && window.f0 != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.SequenceableLoader.Callback
    public final void a(SequenceableLoader sequenceableLoader) {
        this.i0.obtainMessage(9, (MediaPeriod) sequenceableLoader).a();
    }

    public final void a0() {
        this.D0 = false;
        DefaultMediaClock defaultMediaClock = this.p0;
        defaultMediaClock.g0 = true;
        StandaloneMediaClock standaloneMediaClock = defaultMediaClock.X;
        if (!standaloneMediaClock.f18969Y) {
            standaloneMediaClock.X.getClass();
            standaloneMediaClock.e0 = android.os.SystemClock.elapsedRealtime();
            standaloneMediaClock.f18969Y = true;
        }
        for (Renderer renderer : this.X) {
            if (s(renderer)) {
                renderer.start();
            }
        }
    }

    @Override // com.google.android.exoplayer2.PlayerMessage.Sender
    public final synchronized void b(PlayerMessage playerMessage) {
        if (!this.A0 && this.k0.getThread().isAlive()) {
            this.i0.obtainMessage(14, playerMessage).a();
            return;
        }
        Log.g("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        playerMessage.b(false);
    }

    public final void b0(boolean z2, boolean z3) {
        C(z2 || !this.H0, false, true, false);
        this.z0.a(z3 ? 1 : 0);
        this.g0.onStopped();
        X(1);
    }

    public final void c(MediaSourceListUpdateMessage mediaSourceListUpdateMessage, int i2) throws Throwable {
        this.z0.a(1);
        MediaSourceList mediaSourceList = this.u0;
        if (i2 == -1) {
            i2 = mediaSourceList.f17159b.size();
        }
        n(mediaSourceList.a(i2, mediaSourceListUpdateMessage.f17064a, mediaSourceListUpdateMessage.f17065b), false);
    }

    public final void c0() {
        DefaultMediaClock defaultMediaClock = this.p0;
        defaultMediaClock.g0 = false;
        StandaloneMediaClock standaloneMediaClock = defaultMediaClock.X;
        if (standaloneMediaClock.f18969Y) {
            standaloneMediaClock.a(standaloneMediaClock.getPositionUs());
            standaloneMediaClock.f18969Y = false;
        }
        for (Renderer renderer : this.X) {
            if (s(renderer) && renderer.getState() == 2) {
                renderer.stop();
            }
        }
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
            this.K0--;
        }
    }

    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.android.exoplayer2.source.SequenceableLoader, java.lang.Object] */
    public final void d0() {
        MediaPeriodHolder mediaPeriodHolder = this.t0.j;
        boolean z2 = this.E0 || (mediaPeriodHolder != null && mediaPeriodHolder.f17137a.isLoading());
        PlaybackInfo playbackInfo = this.y0;
        if (z2 != playbackInfo.g) {
            this.y0 = new PlaybackInfo(playbackInfo.f17176a, playbackInfo.f17177b, playbackInfo.f17178c, playbackInfo.d, playbackInfo.f17179e, playbackInfo.f, z2, playbackInfo.f17180h, playbackInfo.f17181i, playbackInfo.j, playbackInfo.k, playbackInfo.f17182l, playbackInfo.m, playbackInfo.f17183n, playbackInfo.f17184p, playbackInfo.q, playbackInfo.r, playbackInfo.o);
        }
    }

    /* JADX WARN: Code duplicated, block: B:213:0x0369  */
    /* JADX WARN: Code duplicated, block: B:290:0x0488  */
    /* JADX WARN: Code duplicated, block: B:327:0x0528  */
    /* JADX WARN: Code duplicated, block: B:337:0x0548  */
    /* JADX WARN: Code duplicated, block: B:339:0x054e  */
    /* JADX WARN: Code duplicated, block: B:341:0x0556  */
    /* JADX WARN: Code duplicated, block: B:343:0x055a  */
    /* JADX WARN: Code duplicated, block: B:349:0x056c  */
    /* JADX WARN: Code duplicated, block: B:374:0x05c7  */
    /* JADX WARN: Code duplicated, block: B:445:0x055d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0144  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v54, types: [com.google.android.exoplayer2.source.MediaPeriod, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.exoplayer2.source.MediaPeriod, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    /* JADX WARN: Type inference failed for: r3v19, types: [com.google.android.exoplayer2.source.MediaPeriod, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v51, types: [com.google.android.exoplayer2.source.SequenceableLoader, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r4v104 */
    /* JADX WARN: Type inference failed for: r4v105 */
    /* JADX WARN: Type inference failed for: r4v49 */
    /* JADX WARN: Type inference failed for: r4v50 */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r4v52 */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v73 */
    /* JADX WARN: Type inference failed for: r4v74, types: [boolean] */
    /* JADX WARN: Type inference failed for: r4v87 */
    /* JADX WARN: Type inference failed for: r4v92 */
    /* JADX WARN: Type inference failed for: r5v16, types: [com.google.android.exoplayer2.source.MediaPeriod, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v58, types: [com.google.android.exoplayer2.source.SequenceableLoader, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v16, types: [com.google.android.exoplayer2.source.SequenceableLoader, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25, types: [int] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v36 */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final void e() throws ExoPlaybackException {
        int i2;
        boolean z2;
        boolean z3;
        ?? r9;
        MediaPeriodHolder mediaPeriodHolder;
        DefaultLivePlaybackSpeedControl defaultLivePlaybackSpeedControl;
        long j;
        long j2;
        ExoTrackSelection[] exoTrackSelectionArr;
        int length;
        ?? r8;
        ExoTrackSelection exoTrackSelection;
        boolean zT;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3;
        int i4;
        MediaPeriodInfo mediaPeriodInfoC;
        int i5;
        MediaPeriodQueue mediaPeriodQueue;
        MediaPeriodHolder mediaPeriodHolder2;
        MediaPeriodHolder mediaPeriodHolder3;
        ?? r2;
        Renderer[] rendererArr;
        this.r0.getClass();
        long jUptimeMillis = android.os.SystemClock.uptimeMillis();
        this.i0.removeMessages(2);
        long j3 = -9223372036854775807L;
        boolean z7 = false;
        if (this.y0.f17176a.p() || !this.u0.k) {
            jUptimeMillis = jUptimeMillis;
            j3 = -9223372036854775807L;
            i2 = 1;
            z2 = false;
        } else {
            MediaPeriodQueue mediaPeriodQueue2 = this.t0;
            long j4 = this.M0;
            MediaPeriodHolder mediaPeriodHolder4 = mediaPeriodQueue2.j;
            if (mediaPeriodHolder4 != null) {
                Assertions.d(mediaPeriodHolder4.f17143l == null);
                if (mediaPeriodHolder4.d) {
                    mediaPeriodHolder4.f17137a.reevaluateBuffer(j4 - mediaPeriodHolder4.o);
                }
            }
            MediaPeriodQueue mediaPeriodQueue3 = this.t0;
            MediaPeriodHolder mediaPeriodHolder5 = mediaPeriodQueue3.j;
            if (mediaPeriodHolder5 == null || (!mediaPeriodHolder5.f.f17150i && mediaPeriodHolder5.d && ((!mediaPeriodHolder5.f17140e || mediaPeriodHolder5.f17137a.getBufferedPositionUs() == Long.MIN_VALUE) && mediaPeriodQueue3.j.f.f17148e != -9223372036854775807L && mediaPeriodQueue3.k < 100))) {
                MediaPeriodQueue mediaPeriodQueue4 = this.t0;
                long j5 = this.M0;
                PlaybackInfo playbackInfo = this.y0;
                MediaPeriodHolder mediaPeriodHolder6 = mediaPeriodQueue4.j;
                if (mediaPeriodHolder6 == null) {
                    i4 = 1;
                    mediaPeriodInfoC = mediaPeriodQueue4.d(playbackInfo.f17176a, playbackInfo.f17177b, playbackInfo.f17178c, playbackInfo.r);
                } else {
                    i4 = 1;
                    mediaPeriodInfoC = mediaPeriodQueue4.c(playbackInfo.f17176a, mediaPeriodHolder6, j5);
                }
                if (mediaPeriodInfoC != null) {
                    MediaPeriodQueue mediaPeriodQueue5 = this.t0;
                    RendererCapabilities[] rendererCapabilitiesArr = this.Z;
                    TrackSelector trackSelector = this.e0;
                    DefaultAllocator allocator = this.g0.getAllocator();
                    MediaSourceList mediaSourceList = this.u0;
                    TrackSelectorResult trackSelectorResult = this.f0;
                    MediaPeriodHolder mediaPeriodHolder7 = mediaPeriodQueue5.j;
                    MediaPeriodHolder mediaPeriodHolder8 = new MediaPeriodHolder(rendererCapabilitiesArr, mediaPeriodHolder7 == null ? 1000000000000L : (mediaPeriodHolder7.o + mediaPeriodHolder7.f.f17148e) - mediaPeriodInfoC.f17146b, trackSelector, allocator, mediaSourceList, mediaPeriodInfoC, trackSelectorResult);
                    MediaPeriodHolder mediaPeriodHolder9 = mediaPeriodQueue5.j;
                    if (mediaPeriodHolder9 == null) {
                        mediaPeriodQueue5.f17155h = mediaPeriodHolder8;
                        mediaPeriodQueue5.f17156i = mediaPeriodHolder8;
                    } else if (mediaPeriodHolder8 != mediaPeriodHolder9.f17143l) {
                        mediaPeriodHolder9.b();
                        mediaPeriodHolder9.f17143l = mediaPeriodHolder8;
                        mediaPeriodHolder9.c();
                    }
                    mediaPeriodQueue5.f17157l = null;
                    mediaPeriodQueue5.j = mediaPeriodHolder8;
                    mediaPeriodQueue5.k += i4;
                    mediaPeriodQueue5.j();
                    mediaPeriodHolder8.f17137a.d(this, mediaPeriodInfoC.f17146b);
                    if (this.t0.f17155h == mediaPeriodHolder8) {
                        E(mediaPeriodInfoC.f17146b);
                    }
                    m(false);
                } else {
                    j3 = -9223372036854775807L;
                }
            } else {
                jUptimeMillis = jUptimeMillis;
                j3 = -9223372036854775807L;
                i4 = 1;
            }
            if (this.E0) {
                this.E0 = r();
                d0();
            } else {
                u();
            }
            MediaPeriodQueue mediaPeriodQueue6 = this.t0;
            MediaPeriodHolder mediaPeriodHolder10 = mediaPeriodQueue6.f17156i;
            if (mediaPeriodHolder10 == null) {
                i5 = i4;
                break;
            }
            MediaPeriodHolder mediaPeriodHolder11 = mediaPeriodHolder10.f17143l;
            Renderer[] rendererArr2 = this.X;
            if (mediaPeriodHolder11 != null && !this.C0) {
                if (!mediaPeriodHolder10.d) {
                    i5 = i4;
                    break;
                }
                int i6 = 0;
                while (true) {
                    if (i6 >= rendererArr2.length) {
                        MediaPeriodHolder mediaPeriodHolder12 = mediaPeriodHolder10.f17143l;
                        if (mediaPeriodHolder12.d || this.M0 >= mediaPeriodHolder12.e()) {
                            TrackSelectorResult trackSelectorResult2 = mediaPeriodHolder10.f17144n;
                            MediaPeriodHolder mediaPeriodHolder13 = mediaPeriodQueue6.f17156i;
                            Assertions.d((mediaPeriodHolder13 == null || mediaPeriodHolder13.f17143l == null) ? 0 : i4);
                            mediaPeriodQueue6.f17156i = mediaPeriodQueue6.f17156i.f17143l;
                            mediaPeriodQueue6.j();
                            MediaPeriodHolder mediaPeriodHolder14 = mediaPeriodQueue6.f17156i;
                            TrackSelectorResult trackSelectorResult3 = mediaPeriodHolder14.f17144n;
                            Timeline timeline = this.y0.f17176a;
                            i5 = i4;
                            f0(timeline, mediaPeriodHolder14.f.f17145a, timeline, mediaPeriodHolder10.f.f17145a, -9223372036854775807L, false);
                            if (mediaPeriodHolder14.d && mediaPeriodHolder14.f17137a.readDiscontinuity() != j3) {
                                long jE = mediaPeriodHolder14.e();
                                for (Renderer renderer : rendererArr2) {
                                    if (renderer.getStream() != null) {
                                        N(renderer, jE);
                                    }
                                }
                                break;
                            }
                            for (int i7 = 0; i7 < rendererArr2.length; i7++) {
                                boolean zB = trackSelectorResult2.b(i7);
                                boolean zB2 = trackSelectorResult3.b(i7);
                                if (zB && !rendererArr2[i7].isCurrentStreamFinal()) {
                                    int i8 = this.Z[i7].getTrackType() == -2 ? i5 : 0;
                                    RendererConfiguration rendererConfiguration = trackSelectorResult2.f18710b[i7];
                                    RendererConfiguration rendererConfiguration2 = trackSelectorResult3.f18710b[i7];
                                    if (!zB2 || !rendererConfiguration2.equals(rendererConfiguration) || i8 != 0) {
                                        N(rendererArr2[i7], mediaPeriodHolder14.e());
                                    }
                                }
                            }
                            break;
                        }
                    } else {
                        Renderer renderer2 = rendererArr2[i6];
                        SampleStream sampleStream = mediaPeriodHolder10.f17139c[i6];
                        if (renderer2.getStream() == sampleStream) {
                            if (sampleStream != null && !renderer2.hasReadStreamToEnd()) {
                                MediaPeriodHolder mediaPeriodHolder15 = mediaPeriodHolder10.f17143l;
                                if (!mediaPeriodHolder10.f.f || !mediaPeriodHolder15.d || (!(renderer2 instanceof TextRenderer) && !(renderer2 instanceof MetadataRenderer) && renderer2.e() < mediaPeriodHolder15.e())) {
                                }
                            }
                            i6++;
                        }
                    }
                    i5 = i4;
                    break;
                }
            }
            i5 = i4;
            if (mediaPeriodHolder10.f.f17150i || this.C0) {
                for (int i9 = 0; i9 < rendererArr2.length; i9++) {
                    Renderer renderer3 = rendererArr2[i9];
                    SampleStream sampleStream2 = mediaPeriodHolder10.f17139c[i9];
                    if (sampleStream2 != null && renderer3.getStream() == sampleStream2 && renderer3.hasReadStreamToEnd()) {
                        long j6 = mediaPeriodHolder10.f.f17148e;
                        N(renderer3, (j6 == j3 || j6 == Long.MIN_VALUE) ? j3 : j6 + mediaPeriodHolder10.o);
                    }
                }
            }
            MediaPeriodQueue mediaPeriodQueue7 = this.t0;
            MediaPeriodHolder mediaPeriodHolder16 = mediaPeriodQueue7.f17156i;
            if (mediaPeriodHolder16 != null && mediaPeriodQueue7.f17155h != mediaPeriodHolder16 && !mediaPeriodHolder16.g) {
                TrackSelectorResult trackSelectorResult4 = mediaPeriodHolder16.f17144n;
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    rendererArr = this.X;
                    if (i10 >= rendererArr.length) {
                        break;
                    }
                    Renderer renderer4 = rendererArr[i10];
                    if (s(renderer4)) {
                        SampleStream stream = renderer4.getStream();
                        SampleStream[] sampleStreamArr = mediaPeriodHolder16.f17139c;
                        int i12 = stream != sampleStreamArr[i10] ? i5 : 0;
                        if (!trackSelectorResult4.b(i10) || i12 != 0) {
                            if (!renderer4.isCurrentStreamFinal()) {
                                ExoTrackSelection exoTrackSelection2 = trackSelectorResult4.f18711c[i10];
                                int length2 = exoTrackSelection2 != null ? exoTrackSelection2.length() : 0;
                                Format[] formatArr = new Format[length2];
                                for (int i13 = 0; i13 < length2; i13++) {
                                    formatArr[i13] = exoTrackSelection2.getFormat(i13);
                                }
                                renderer4.g(formatArr, sampleStreamArr[i10], mediaPeriodHolder16.e(), mediaPeriodHolder16.o);
                            } else if (renderer4.isEnded()) {
                                d(renderer4);
                            } else {
                                i11 = i5;
                            }
                        }
                    }
                    i10++;
                }
                if (i11 == 0) {
                    g(new boolean[rendererArr.length]);
                }
            }
            int i14 = 0;
            while (Y() && !this.C0 && (mediaPeriodHolder2 = (mediaPeriodQueue = this.t0).f17155h) != null && (mediaPeriodHolder3 = mediaPeriodHolder2.f17143l) != null && this.M0 >= mediaPeriodHolder3.e() && mediaPeriodHolder3.g) {
                if (i14 != 0) {
                    v();
                }
                MediaPeriodHolder mediaPeriodHolderA = mediaPeriodQueue.a();
                mediaPeriodHolderA.getClass();
                if (this.y0.f17177b.f18347a.equals(mediaPeriodHolderA.f.f17145a.f18347a)) {
                    MediaSource.MediaPeriodId mediaPeriodId = this.y0.f17177b;
                    if (mediaPeriodId.f18348b == -1) {
                        MediaSource.MediaPeriodId mediaPeriodId2 = mediaPeriodHolderA.f.f17145a;
                        if (mediaPeriodId2.f18348b != -1 || mediaPeriodId.f18350e == mediaPeriodId2.f18350e) {
                            r2 = z7;
                        } else {
                            r2 = i5;
                        }
                    } else {
                        r2 = z7;
                    }
                } else {
                    r2 = z7;
                }
                MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolderA.f;
                MediaSource.MediaPeriodId mediaPeriodId3 = mediaPeriodInfo.f17145a;
                ?? r4 = r2;
                long j7 = mediaPeriodInfo.f17146b;
                this.y0 = q(mediaPeriodId3, j7, mediaPeriodInfo.f17147c, j7, ~r4, 0);
                D();
                e0();
                i14 = i5;
                i5 = i14;
                z7 = z7;
            }
            z2 = z7;
            i2 = i5;
        }
        int i15 = this.y0.f17179e;
        if (i15 == i2 || i15 == 4) {
            return;
        }
        MediaPeriodHolder mediaPeriodHolder17 = this.t0.f17155h;
        if (mediaPeriodHolder17 == null) {
            this.i0.c(jUptimeMillis + 10);
            return;
        }
        TraceUtil.a("doSomeWork");
        e0();
        if (mediaPeriodHolder17.d) {
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() * 1000;
            mediaPeriodHolder17.f17137a.discardBuffer(this.y0.r - this.n0, this.o0);
            int i16 = i2;
            z3 = i16 == true ? 1 : 0;
            ?? r3 = z2;
            ?? r5 = i16;
            while (true) {
                Renderer[] rendererArr3 = this.X;
                if (r3 >= rendererArr3.length) {
                    break;
                }
                Renderer renderer5 = rendererArr3[r3];
                if (s(renderer5)) {
                    renderer5.render(this.M0, jElapsedRealtime);
                    r5 = (r5 == 0 || !renderer5.isEnded()) ? z2 : 1;
                    boolean z8 = mediaPeriodHolder17.f17139c[r3] != renderer5.getStream() ? true : z2;
                    boolean z9 = (z8 || ((z8 || !renderer5.hasReadStreamToEnd()) ? z2 : true) || renderer5.isReady() || renderer5.isEnded()) ? true : z2;
                    z3 = (z3 && z9) ? true : z2;
                    if (!z9) {
                        renderer5.maybeThrowStreamError();
                    }
                }
                r3++;
                r5 = r5;
            }
            r9 = r5;
        } else {
            mediaPeriodHolder17.f17137a.maybeThrowPrepareError();
            z3 = true;
            r9 = 1;
        }
        long j8 = mediaPeriodHolder17.f.f17148e;
        boolean z10 = (r9 == 0 || !mediaPeriodHolder17.d || (j8 != j3 && j8 > this.y0.r)) ? z2 : true;
        if (z10 && this.C0) {
            this.C0 = z2;
            S(this.y0.m, 5, z2, z2);
        }
        if (z10 && mediaPeriodHolder17.f.f17150i) {
            X(4);
            c0();
        } else {
            PlaybackInfo playbackInfo2 = this.y0;
            if (playbackInfo2.f17179e == 2) {
                if (this.K0 == 0) {
                    zT = t();
                } else if (z3) {
                    if (playbackInfo2.g) {
                        Timeline timeline2 = playbackInfo2.f17176a;
                        MediaPeriodQueue mediaPeriodQueue8 = this.t0;
                        long j9 = Z(timeline2, mediaPeriodQueue8.f17155h.f.f17145a) ? this.v0.f17006i : j3;
                        MediaPeriodHolder mediaPeriodHolder18 = mediaPeriodQueue8.j;
                        boolean z11 = (!mediaPeriodHolder18.d || (mediaPeriodHolder18.f17140e && mediaPeriodHolder18.f17137a.getBufferedPositionUs() != Long.MIN_VALUE) || !mediaPeriodHolder18.f.f17150i) ? z2 : true;
                        boolean z12 = (!mediaPeriodHolder18.f.f17145a.a() || mediaPeriodHolder18.d) ? z2 : true;
                        if (!z11 && !z12) {
                            long j10 = this.y0.f17184p;
                            MediaPeriodHolder mediaPeriodHolder19 = this.t0.j;
                            if (!this.g0.a(mediaPeriodHolder19 != null ? Math.max(0L, j10 - (this.M0 - mediaPeriodHolder19.o)) : 0L, this.p0.getPlaybackParameters().X, this.D0, j9)) {
                                zT = z2;
                            }
                        }
                    }
                    zT = true;
                } else {
                    zT = z2;
                }
                if (zT) {
                    X(3);
                    this.P0 = null;
                    if (Y()) {
                        a0();
                    }
                } else if (this.y0.f17179e == 3) {
                    this.D0 = Y();
                    X(2);
                    if (this.D0) {
                        for (mediaPeriodHolder = this.t0.f17155h; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.f17143l) {
                            exoTrackSelectionArr = mediaPeriodHolder.f17144n.f18711c;
                            length = exoTrackSelectionArr.length;
                            for (r8 = z2; r8 < length; r8++) {
                                exoTrackSelection = exoTrackSelectionArr[r8];
                                if (exoTrackSelection != null) {
                                    exoTrackSelection.c();
                                }
                            }
                        }
                        defaultLivePlaybackSpeedControl = this.v0;
                        j = defaultLivePlaybackSpeedControl.f17006i;
                        if (j != j3) {
                            long j11 = j + defaultLivePlaybackSpeedControl.f17002b;
                            defaultLivePlaybackSpeedControl.f17006i = j11;
                            j2 = defaultLivePlaybackSpeedControl.f17005h;
                            if (j2 != j3) {
                                defaultLivePlaybackSpeedControl.f17006i = j2;
                            }
                            defaultLivePlaybackSpeedControl.m = j3;
                        }
                    }
                    c0();
                }
            } else if (this.y0.f17179e == 3 && (this.K0 != 0 ? !z3 : !t())) {
                this.D0 = Y();
                X(2);
                if (this.D0) {
                    while (mediaPeriodHolder != null) {
                        exoTrackSelectionArr = mediaPeriodHolder.f17144n.f18711c;
                        length = exoTrackSelectionArr.length;
                        while (r8 < length) {
                            exoTrackSelection = exoTrackSelectionArr[r8];
                            if (exoTrackSelection != null) {
                                exoTrackSelection.c();
                            }
                        }
                    }
                    defaultLivePlaybackSpeedControl = this.v0;
                    j = defaultLivePlaybackSpeedControl.f17006i;
                    if (j != j3) {
                        long j12 = j + defaultLivePlaybackSpeedControl.f17002b;
                        defaultLivePlaybackSpeedControl.f17006i = j12;
                        j2 = defaultLivePlaybackSpeedControl.f17005h;
                        if (j2 != j3 && j12 > j2) {
                            defaultLivePlaybackSpeedControl.f17006i = j2;
                        }
                        defaultLivePlaybackSpeedControl.m = j3;
                    }
                }
                c0();
            }
        }
        if (this.y0.f17179e == 2) {
            ?? r10 = z2;
            while (true) {
                Renderer[] rendererArr4 = this.X;
                if (r10 >= rendererArr4.length) {
                    break;
                }
                if (s(rendererArr4[r10]) && this.X[r10].getStream() == mediaPeriodHolder17.f17139c[r10]) {
                    this.X[r10].maybeThrowStreamError();
                }
                r10++;
            }
            PlaybackInfo playbackInfo3 = this.y0;
            if (playbackInfo3.g || playbackInfo3.q >= 500000 || !r()) {
                z4 = z2;
            } else {
                z4 = true;
            }
        } else {
            z4 = z2;
        }
        if (!z4) {
            this.Q0 = -9223372036854775807L;
        } else if (this.Q0 == -9223372036854775807L) {
            this.r0.getClass();
            this.Q0 = android.os.SystemClock.elapsedRealtime();
        } else {
            this.r0.getClass();
            if (android.os.SystemClock.elapsedRealtime() - this.Q0 >= 4000) {
                throw new IllegalStateException("Playback stuck buffering and not loading");
            }
        }
        boolean z13 = (Y() && this.y0.f17179e == 3) ? true : z2;
        boolean z14 = (this.J0 && this.I0 && z13) ? true : z2;
        PlaybackInfo playbackInfo4 = this.y0;
        if (playbackInfo4.o != z14) {
            z5 = z14;
            this.y0 = new PlaybackInfo(playbackInfo4.f17176a, playbackInfo4.f17177b, playbackInfo4.f17178c, playbackInfo4.d, playbackInfo4.f17179e, playbackInfo4.f, playbackInfo4.g, playbackInfo4.f17180h, playbackInfo4.f17181i, playbackInfo4.j, playbackInfo4.k, playbackInfo4.f17182l, playbackInfo4.m, playbackInfo4.f17183n, playbackInfo4.f17184p, playbackInfo4.q, playbackInfo4.r, z5);
            z6 = false;
        } else {
            z5 = z14;
            z6 = z2;
        }
        this.I0 = z6;
        if (!z5 && (i3 = this.y0.f17179e) != 4) {
            if (z13 || i3 == 2) {
                this.i0.c(jUptimeMillis + 10);
            } else if (i3 == 3 && this.K0 != 0) {
                this.i0.c(jUptimeMillis + 1000);
            }
        }
        TraceUtil.b();
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00c6  */
    /* JADX WARN: Type inference failed for: r2v23, types: [com.google.android.exoplayer2.source.MediaPeriod, java.lang.Object] */
    public final void e0() {
        int i2;
        PlaybackParameters playbackParameters;
        MediaPeriodHolder mediaPeriodHolder = this.t0.f17155h;
        if (mediaPeriodHolder == null) {
            return;
        }
        long discontinuity = mediaPeriodHolder.d ? mediaPeriodHolder.f17137a.readDiscontinuity() : -9223372036854775807L;
        if (discontinuity != -9223372036854775807L) {
            E(discontinuity);
            if (discontinuity != this.y0.r) {
                PlaybackInfo playbackInfo = this.y0;
                i2 = 16;
                this.y0 = q(playbackInfo.f17177b, discontinuity, playbackInfo.f17178c, discontinuity, true, 5);
            } else {
                i2 = 16;
            }
        } else {
            i2 = 16;
            DefaultMediaClock defaultMediaClock = this.p0;
            boolean z2 = mediaPeriodHolder != this.t0.f17156i;
            Renderer renderer = defaultMediaClock.Z;
            StandaloneMediaClock standaloneMediaClock = defaultMediaClock.X;
            if (renderer == null || renderer.isEnded() || (!defaultMediaClock.Z.isReady() && (z2 || defaultMediaClock.Z.hasReadStreamToEnd()))) {
                defaultMediaClock.f0 = true;
                if (defaultMediaClock.g0 && !standaloneMediaClock.f18969Y) {
                    standaloneMediaClock.X.getClass();
                    standaloneMediaClock.e0 = android.os.SystemClock.elapsedRealtime();
                    standaloneMediaClock.f18969Y = true;
                }
            } else {
                MediaClock mediaClock = defaultMediaClock.e0;
                mediaClock.getClass();
                long positionUs = mediaClock.getPositionUs();
                if (!defaultMediaClock.f0) {
                    standaloneMediaClock.a(positionUs);
                    playbackParameters = mediaClock.getPlaybackParameters();
                    if (!playbackParameters.equals(standaloneMediaClock.f0)) {
                        standaloneMediaClock.f(playbackParameters);
                        ((ExoPlayerImplInternal) defaultMediaClock.f17019Y).i0.obtainMessage(16, playbackParameters).a();
                    }
                } else if (positionUs >= standaloneMediaClock.getPositionUs()) {
                    defaultMediaClock.f0 = false;
                    if (defaultMediaClock.g0 && !standaloneMediaClock.f18969Y) {
                        standaloneMediaClock.X.getClass();
                        standaloneMediaClock.e0 = android.os.SystemClock.elapsedRealtime();
                        standaloneMediaClock.f18969Y = true;
                    }
                    standaloneMediaClock.a(positionUs);
                    playbackParameters = mediaClock.getPlaybackParameters();
                    if (!playbackParameters.equals(standaloneMediaClock.f0)) {
                        standaloneMediaClock.f(playbackParameters);
                        ((ExoPlayerImplInternal) defaultMediaClock.f17019Y).i0.obtainMessage(16, playbackParameters).a();
                    }
                } else if (standaloneMediaClock.f18969Y) {
                    standaloneMediaClock.a(standaloneMediaClock.getPositionUs());
                    standaloneMediaClock.f18969Y = false;
                }
            }
            long positionUs2 = defaultMediaClock.getPositionUs();
            this.M0 = positionUs2;
            long j = positionUs2 - mediaPeriodHolder.o;
            long j2 = this.y0.r;
            if (!this.q0.isEmpty() && !this.y0.f17177b.a()) {
                if (this.O0) {
                    j2--;
                    this.O0 = false;
                }
                PlaybackInfo playbackInfo2 = this.y0;
                int iB = playbackInfo2.f17176a.b(playbackInfo2.f17177b.f18347a);
                int iMin = Math.min(this.N0, this.q0.size());
                PendingMessageInfo pendingMessageInfo = iMin > 0 ? (PendingMessageInfo) this.q0.get(iMin - 1) : null;
                while (pendingMessageInfo != null && (iB < 0 || (iB == 0 && 0 > j2))) {
                    int i3 = iMin - 1;
                    pendingMessageInfo = i3 > 0 ? (PendingMessageInfo) this.q0.get(iMin - 2) : null;
                    iMin = i3;
                }
                if (iMin < this.q0.size()) {
                }
                this.N0 = iMin;
            }
            this.y0.r = j;
        }
        this.y0.f17184p = this.t0.j.d();
        PlaybackInfo playbackInfo3 = this.y0;
        long j3 = playbackInfo3.f17184p;
        MediaPeriodHolder mediaPeriodHolder2 = this.t0.j;
        playbackInfo3.q = mediaPeriodHolder2 == null ? 0L : Math.max(0L, j3 - (this.M0 - mediaPeriodHolder2.o));
        PlaybackInfo playbackInfo4 = this.y0;
        if (playbackInfo4.f17182l && playbackInfo4.f17179e == 3 && Z(playbackInfo4.f17176a, playbackInfo4.f17177b)) {
            PlaybackInfo playbackInfo5 = this.y0;
            float f = 1.0f;
            if (playbackInfo5.f17183n.X == 1.0f) {
                DefaultLivePlaybackSpeedControl defaultLivePlaybackSpeedControl = this.v0;
                long jH = h(playbackInfo5.f17176a, playbackInfo5.f17177b.f18347a, playbackInfo5.r);
                long j4 = this.y0.f17184p;
                MediaPeriodHolder mediaPeriodHolder3 = this.t0.j;
                long jMax = mediaPeriodHolder3 == null ? 0L : Math.max(0L, j4 - (this.M0 - mediaPeriodHolder3.o));
                if (defaultLivePlaybackSpeedControl.d != r15) {
                    long j5 = jH - jMax;
                    long j6 = defaultLivePlaybackSpeedControl.f17008n;
                    if (j6 == r15) {
                        defaultLivePlaybackSpeedControl.f17008n = j5;
                        defaultLivePlaybackSpeedControl.o = 0L;
                    } else {
                        float f2 = j6;
                        float f3 = defaultLivePlaybackSpeedControl.f17003c;
                        float f4 = 1.0f - f3;
                        long jMax2 = Math.max(j5, (long) ((j5 * f4) + (f2 * f3)));
                        defaultLivePlaybackSpeedControl.f17008n = jMax2;
                        defaultLivePlaybackSpeedControl.o = (long) ((f4 * Math.abs(j5 - jMax2)) + (f3 * defaultLivePlaybackSpeedControl.o));
                    }
                    if (defaultLivePlaybackSpeedControl.m == r15 || android.os.SystemClock.elapsedRealtime() - defaultLivePlaybackSpeedControl.m >= 1000) {
                        defaultLivePlaybackSpeedControl.m = android.os.SystemClock.elapsedRealtime();
                        long j7 = (defaultLivePlaybackSpeedControl.o * 3) + defaultLivePlaybackSpeedControl.f17008n;
                        if (defaultLivePlaybackSpeedControl.f17006i > j7) {
                            float fB = Util.B(1000L);
                            defaultLivePlaybackSpeedControl.f17006i = Longs.b(j7, defaultLivePlaybackSpeedControl.f, defaultLivePlaybackSpeedControl.f17006i - (((long) ((defaultLivePlaybackSpeedControl.f17007l - 1.0f) * fB)) + ((long) ((defaultLivePlaybackSpeedControl.j - 1.0f) * fB))));
                        } else {
                            long jK = Util.k(jH - ((long) (Math.max(0.0f, defaultLivePlaybackSpeedControl.f17007l - 1.0f) / 1.0E-7f)), defaultLivePlaybackSpeedControl.f17006i, j7);
                            defaultLivePlaybackSpeedControl.f17006i = jK;
                            long j8 = defaultLivePlaybackSpeedControl.f17005h;
                            if (j8 != -9223372036854775807 && jK > j8) {
                                defaultLivePlaybackSpeedControl.f17006i = j8;
                            }
                        }
                        long j9 = jH - defaultLivePlaybackSpeedControl.f17006i;
                        if (Math.abs(j9) < defaultLivePlaybackSpeedControl.f17001a) {
                            defaultLivePlaybackSpeedControl.f17007l = 1.0f;
                        } else {
                            defaultLivePlaybackSpeedControl.f17007l = Util.i((1.0E-7f * j9) + 1.0f, defaultLivePlaybackSpeedControl.k, defaultLivePlaybackSpeedControl.j);
                        }
                        f = defaultLivePlaybackSpeedControl.f17007l;
                    } else {
                        f = defaultLivePlaybackSpeedControl.f17007l;
                    }
                }
                if (this.p0.getPlaybackParameters().X != f) {
                    PlaybackParameters playbackParameters2 = new PlaybackParameters(f, this.y0.f17183n.f17185Y);
                    this.i0.removeMessages(i2);
                    this.p0.f(playbackParameters2);
                    p(this.y0.f17183n, this.p0.getPlaybackParameters().X, false, false);
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.MediaPeriod.Callback
    public final void f(MediaPeriod mediaPeriod) {
        this.i0.obtainMessage(8, mediaPeriod).a();
    }

    public final void f0(Timeline timeline, MediaSource.MediaPeriodId mediaPeriodId, Timeline timeline2, MediaSource.MediaPeriodId mediaPeriodId2, long j, boolean z2) {
        if (!Z(timeline, mediaPeriodId)) {
            PlaybackParameters playbackParameters = mediaPeriodId.a() ? PlaybackParameters.e0 : this.y0.f17183n;
            DefaultMediaClock defaultMediaClock = this.p0;
            if (defaultMediaClock.getPlaybackParameters().equals(playbackParameters)) {
                return;
            }
            this.i0.removeMessages(16);
            defaultMediaClock.f(playbackParameters);
            p(this.y0.f17183n, playbackParameters.X, false, false);
            return;
        }
        Object obj = mediaPeriodId.f18347a;
        Timeline.Period period = this.m0;
        int i2 = timeline.g(obj, period).Z;
        Timeline.Window window = this.l0;
        timeline.n(i2, window);
        MediaItem.LiveConfiguration liveConfiguration = window.k0;
        int i3 = Util.f18979a;
        DefaultLivePlaybackSpeedControl defaultLivePlaybackSpeedControl = this.v0;
        defaultLivePlaybackSpeedControl.getClass();
        defaultLivePlaybackSpeedControl.d = Util.B(liveConfiguration.X);
        defaultLivePlaybackSpeedControl.g = Util.B(liveConfiguration.f17107Y);
        defaultLivePlaybackSpeedControl.f17005h = Util.B(liveConfiguration.Z);
        float f = liveConfiguration.e0;
        if (f == -3.4028235E38f) {
            f = 0.97f;
        }
        defaultLivePlaybackSpeedControl.k = f;
        float f2 = liveConfiguration.f0;
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
        if (!Util.a(!timeline2.p() ? timeline2.m(timeline2.g(mediaPeriodId2.f18347a, period).Z, window, 0L).X : null, window.X) || z2) {
            defaultLivePlaybackSpeedControl.b(-9223372036854775807L);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00de  */
    public final void g(boolean[] zArr) throws ExoPlaybackException {
        Renderer[] rendererArr;
        Set set;
        TrackSelectorResult trackSelectorResult;
        MediaClock mediaClock;
        MediaPeriodQueue mediaPeriodQueue = this.t0;
        MediaPeriodHolder mediaPeriodHolder = mediaPeriodQueue.f17156i;
        TrackSelectorResult trackSelectorResult2 = mediaPeriodHolder.f17144n;
        int i2 = 0;
        while (true) {
            rendererArr = this.X;
            int length = rendererArr.length;
            set = this.f17062Y;
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
                    MediaPeriodHolder mediaPeriodHolder2 = mediaPeriodQueue.f17156i;
                    boolean z3 = mediaPeriodHolder2 == mediaPeriodQueue.f17155h;
                    TrackSelectorResult trackSelectorResult3 = mediaPeriodHolder2.f17144n;
                    RendererConfiguration rendererConfiguration = trackSelectorResult3.f18710b[i3];
                    ExoTrackSelection exoTrackSelection = trackSelectorResult3.f18711c[i3];
                    int length2 = exoTrackSelection != null ? exoTrackSelection.length() : 0;
                    Format[] formatArr = new Format[length2];
                    for (int i4 = 0; i4 < length2; i4++) {
                        formatArr[i4] = exoTrackSelection.getFormat(i4);
                    }
                    boolean z4 = Y() && this.y0.f17179e == 3;
                    boolean z5 = !z2 && z4;
                    this.K0++;
                    set.add(renderer);
                    trackSelectorResult = trackSelectorResult2;
                    boolean z6 = z4;
                    renderer.h(rendererConfiguration, formatArr, mediaPeriodHolder2.f17139c[i3], this.M0, z5, z3, mediaPeriodHolder2.e(), mediaPeriodHolder2.o);
                    renderer.handleMessage(11, new Renderer.WakeupListener() { // from class: com.google.android.exoplayer2.ExoPlayerImplInternal.1
                        @Override // com.google.android.exoplayer2.Renderer.WakeupListener
                        public final void a() {
                            ExoPlayerImplInternal.this.I0 = true;
                        }

                        @Override // com.google.android.exoplayer2.Renderer.WakeupListener
                        public final void b() {
                            ExoPlayerImplInternal.this.i0.sendEmptyMessage(2);
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
                        mediaClock2.f(defaultMediaClock.X.f0);
                    }
                    if (z6) {
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

    public final synchronized void g0(o oVar, long j) {
        this.r0.getClass();
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() + j;
        boolean z2 = false;
        while (!((Boolean) oVar.get()).booleanValue() && j > 0) {
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

    public final long h(Timeline timeline, Object obj, long j) {
        Timeline.Period period = this.m0;
        int i2 = timeline.g(obj, period).Z;
        Timeline.Window window = this.l0;
        timeline.n(i2, window);
        if (window.f0 == -9223372036854775807L || !window.a() || !window.i0) {
            return -9223372036854775807L;
        }
        long j2 = window.g0;
        int i3 = Util.f18979a;
        return Util.B((j2 == -9223372036854775807L ? System.currentTimeMillis() : j2 + android.os.SystemClock.elapsedRealtime()) - window.f0) - (j + period.f0);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) throws Throwable {
        int i2;
        MediaPeriodHolder mediaPeriodHolder;
        int i3 = 1000;
        try {
            switch (message.what) {
                case 0:
                    y();
                    break;
                case 1:
                    S(message.arg2, 1, message.arg1 != 0, true);
                    break;
                case 2:
                    e();
                    break;
                case 3:
                    J((SeekPosition) message.obj);
                    break;
                case 4:
                    T((PlaybackParameters) message.obj);
                    break;
                case 5:
                    this.x0 = (SeekParameters) message.obj;
                    break;
                case 6:
                    b0(false, true);
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
                    U(message.arg1);
                    break;
                case 12:
                    V(message.arg1 != 0);
                    break;
                case 13:
                    O(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    PlayerMessage playerMessage = (PlayerMessage) message.obj;
                    playerMessage.getClass();
                    L(playerMessage);
                    break;
                case 15:
                    M((PlayerMessage) message.obj);
                    break;
                case 16:
                    PlaybackParameters playbackParameters = (PlaybackParameters) message.obj;
                    p(playbackParameters, playbackParameters.X, true, false);
                    break;
                case 17:
                    P((MediaSourceListUpdateMessage) message.obj);
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
                    W((ShuffleOrder) message.obj);
                    break;
                case 22:
                    w();
                    break;
                case 23:
                    R(message.arg1 != 0);
                    break;
                case 24:
                    Q(message.arg1 == 1);
                    break;
                case 25:
                    I(true);
                    break;
                default:
                    return false;
            }
        } catch (ExoPlaybackException e2) {
            e = e2;
            if (e.Z == 1 && (mediaPeriodHolder = this.t0.f17156i) != null) {
                e = e.a(mediaPeriodHolder.f.f17145a);
            }
            if (e.j0 && this.P0 == null) {
                Log.h("ExoPlayerImplInternal", "Recoverable renderer error", e);
                this.P0 = e;
                HandlerWrapper handlerWrapper = this.i0;
                handlerWrapper.d(handlerWrapper.obtainMessage(25, e));
            } else {
                ExoPlaybackException exoPlaybackException = this.P0;
                if (exoPlaybackException != null) {
                    exoPlaybackException.addSuppressed(e);
                    e = this.P0;
                }
                Log.d("ExoPlayerImplInternal", "Playback error", e);
                b0(true, false);
                this.y0 = this.y0.d(e);
            }
        } catch (ParserException e3) {
            boolean z2 = e3.X;
            int i4 = e3.f17174Y;
            if (i4 == 1) {
                i2 = z2 ? 3001 : 3003;
            } else {
                if (i4 == 4) {
                    i2 = z2 ? 3002 : 3004;
                }
                l(e3, i3);
            }
            i3 = i2;
            l(e3, i3);
        } catch (DrmSession.DrmSessionException e4) {
            l(e4, e4.X);
        } catch (BehindLiveWindowException e5) {
            l(e5, 1002);
        } catch (DataSourceException e6) {
            l(e6, e6.X);
        } catch (IOException e7) {
            l(e7, 2000);
        } catch (RuntimeException e8) {
            ExoPlaybackException exoPlaybackException2 = new ExoPlaybackException(2, e8, ((e8 instanceof IllegalStateException) || (e8 instanceof IllegalArgumentException)) ? 1004 : 1000);
            Log.d("ExoPlayerImplInternal", "Playback error", exoPlaybackException2);
            b0(true, false);
            this.y0 = this.y0.d(exoPlaybackException2);
        }
        v();
        return true;
    }

    public final long i() {
        MediaPeriodHolder mediaPeriodHolder = this.t0.f17156i;
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
            if (s(rendererArr[i2]) && rendererArr[i2].getStream() == mediaPeriodHolder.f17139c[i2]) {
                long jE = rendererArr[i2].e();
                if (jE == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jMax = Math.max(jE, jMax);
            }
            i2++;
        }
    }

    public final Pair j(Timeline timeline) {
        if (timeline.p()) {
            return Pair.create(PlaybackInfo.s, 0L);
        }
        Pair pairI = timeline.i(this.l0, this.m0, timeline.a(this.G0), -9223372036854775807L);
        MediaSource.MediaPeriodId mediaPeriodIdM = this.t0.m(timeline, pairI.first, 0L);
        long jLongValue = ((Long) pairI.second).longValue();
        if (mediaPeriodIdM.a()) {
            Object obj = mediaPeriodIdM.f18347a;
            Timeline.Period period = this.m0;
            timeline.g(obj, period);
            jLongValue = mediaPeriodIdM.f18349c == period.e(mediaPeriodIdM.f18348b) ? period.h0.f18426Y : 0L;
        }
        return Pair.create(mediaPeriodIdM, Long.valueOf(jLongValue));
    }

    /* JADX WARN: Type inference failed for: r6v5, types: [com.google.android.exoplayer2.source.SequenceableLoader, java.lang.Object] */
    public final void k(MediaPeriod mediaPeriod) {
        MediaPeriodHolder mediaPeriodHolder = this.t0.j;
        if (mediaPeriodHolder == null || mediaPeriodHolder.f17137a != mediaPeriod) {
            return;
        }
        long j = this.M0;
        if (mediaPeriodHolder != null) {
            Assertions.d(mediaPeriodHolder.f17143l == null);
            if (mediaPeriodHolder.d) {
                mediaPeriodHolder.f17137a.reevaluateBuffer(j - mediaPeriodHolder.o);
            }
        }
        u();
    }

    public final void l(IOException iOException, int i2) {
        ExoPlaybackException exoPlaybackException = new ExoPlaybackException(0, iOException, i2);
        MediaPeriodHolder mediaPeriodHolder = this.t0.f17155h;
        if (mediaPeriodHolder != null) {
            exoPlaybackException = exoPlaybackException.a(mediaPeriodHolder.f.f17145a);
        }
        Log.d("ExoPlayerImplInternal", "Playback error", exoPlaybackException);
        b0(false, false);
        this.y0 = this.y0.d(exoPlaybackException);
    }

    public final void m(boolean z2) {
        MediaPeriodHolder mediaPeriodHolder = this.t0.j;
        MediaSource.MediaPeriodId mediaPeriodId = mediaPeriodHolder == null ? this.y0.f17177b : mediaPeriodHolder.f.f17145a;
        boolean zEquals = this.y0.k.equals(mediaPeriodId);
        if (!zEquals) {
            this.y0 = this.y0.a(mediaPeriodId);
        }
        PlaybackInfo playbackInfo = this.y0;
        playbackInfo.f17184p = mediaPeriodHolder == null ? playbackInfo.r : mediaPeriodHolder.d();
        PlaybackInfo playbackInfo2 = this.y0;
        long j = playbackInfo2.f17184p;
        MediaPeriodHolder mediaPeriodHolder2 = this.t0.j;
        playbackInfo2.q = mediaPeriodHolder2 != null ? Math.max(0L, j - (this.M0 - mediaPeriodHolder2.o)) : 0L;
        if ((!zEquals || z2) && mediaPeriodHolder != null && mediaPeriodHolder.d) {
            this.g0.b(this.X, mediaPeriodHolder.f17144n.f18711c);
        }
    }

    /* JADX WARN: Code duplicated, block: B:178:0x030c  */
    /* JADX WARN: Code duplicated, block: B:179:0x030e  */
    /* JADX WARN: Code duplicated, block: B:186:0x0324  */
    /* JADX WARN: Code duplicated, block: B:188:0x032e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:194:0x0343  */
    /* JADX WARN: Code duplicated, block: B:197:0x034f  */
    /* JADX WARN: Code duplicated, block: B:199:0x0355  */
    /* JADX WARN: Code duplicated, block: B:203:0x0377  */
    /* JADX WARN: Code duplicated, block: B:210:0x0392  */
    /* JADX WARN: Code duplicated, block: B:211:0x0394  */
    /* JADX WARN: Code duplicated, block: B:214:0x039f  */
    /* JADX WARN: Code duplicated, block: B:216:0x03a7  */
    /* JADX WARN: Code duplicated, block: B:218:0x03b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:224:0x03c7  */
    /* JADX WARN: Code duplicated, block: B:227:0x03d4  */
    /* JADX WARN: Code duplicated, block: B:229:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:233:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:92:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:93:0x0200  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [com.google.android.exoplayer2.Timeline] */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v19, types: [com.google.android.exoplayer2.ExoPlayerImplInternal$SeekPosition] */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9, types: [com.google.android.exoplayer2.ExoPlayerImplInternal$SeekPosition] */
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
    /* JADX WARN: Type inference failed for: r18v3 */
    /* JADX WARN: Type inference failed for: r18v4 */
    /* JADX WARN: Type inference failed for: r18v5 */
    /* JADX WARN: Type inference failed for: r18v6 */
    /* JADX WARN: Type inference failed for: r18v7 */
    /* JADX WARN: Type inference failed for: r18v8 */
    /* JADX WARN: Type inference failed for: r18v9 */
    /* JADX WARN: Type inference failed for: r2v23, types: [com.google.android.exoplayer2.Timeline] */
    /* JADX WARN: Type inference failed for: r2v28, types: [com.google.android.exoplayer2.PlaybackInfo] */
    /* JADX WARN: Type inference failed for: r2v45, types: [com.google.android.exoplayer2.MediaPeriodQueue] */
    /* JADX WARN: Type inference failed for: r34v0, types: [com.google.android.exoplayer2.ExoPlayerImplInternal] */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r7v19, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v35, types: [com.google.android.exoplayer2.Timeline] */
    /* JADX WARN: Type inference failed for: r7v36 */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v24 */
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
        Timeline.Period period;
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
        Timeline timeline2;
        long j2;
        boolean z7;
        ?? A2;
        long j3;
        PositionUpdateForPlaylistChange positionUpdateForPlaylistChange;
        int i3;
        Object obj2;
        long jLongValue;
        boolean z8;
        int i4;
        boolean z9;
        int iA3;
        boolean z10;
        boolean z11;
        ?? r11;
        MediaSource.MediaPeriodId mediaPeriodId2;
        long j4;
        ?? r14;
        ?? r18;
        long j5;
        MediaSource.MediaPeriodId mediaPeriodId3;
        Object obj3;
        ?? r9;
        int i5;
        boolean z12;
        MediaSource.MediaPeriodId mediaPeriodId4;
        ?? r19;
        ?? r110;
        MediaSource.MediaPeriodId mediaPeriodId5;
        ?? r7;
        ?? r111;
        ?? r15;
        long j6;
        MediaSource.MediaPeriodId mediaPeriodId6;
        Object obj4;
        ?? r10;
        int i6;
        ?? r112;
        MediaSource.MediaPeriodId mediaPeriodId7;
        PlaybackInfo playbackInfo = this.y0;
        SeekPosition seekPosition = this.L0;
        MediaPeriodQueue mediaPeriodQueue = this.t0;
        int i7 = this.F0;
        boolean z13 = this.G0;
        Timeline.Window window2 = this.l0;
        Timeline.Period period2 = this.m0;
        if (timeline.p()) {
            r19 = 0;
            timeline2 = timeline;
            positionUpdateForPlaylistChange = new PositionUpdateForPlaylistChange(PlaybackInfo.s, 0L, -9223372036854775807L, false, true, false);
            j = -9223372036854775807L;
        } else {
            MediaSource.MediaPeriodId mediaPeriodId8 = playbackInfo.f17177b;
            Object obj5 = mediaPeriodId8.f18347a;
            j = -9223372036854775807L;
            Timeline timeline3 = playbackInfo.f17176a;
            boolean z14 = timeline3.p() || timeline3.g(mediaPeriodId8.f18347a, period2).g0;
            long jLongValue2 = (playbackInfo.f17177b.a() || z14) ? playbackInfo.f17178c : playbackInfo.r;
            boolean z15 = z14;
            if (seekPosition != null) {
                mediaPeriodId = mediaPeriodId8;
                Pair pairG = G(timeline, seekPosition, true, i7, z13, window2, period2);
                period = period2;
                if (pairG == null) {
                    iA3 = timeline.a(z13);
                    obj2 = obj5;
                    z11 = true;
                    z10 = false;
                    z9 = false;
                    jLongValue = jLongValue2;
                } else {
                    if (0 == -9223372036854775807L) {
                        i4 = timeline.g(pairG.first, period).Z;
                        obj2 = obj5;
                        z8 = false;
                        jLongValue = jLongValue2;
                    } else {
                        obj2 = pairG.first;
                        jLongValue = ((Long) pairG.second).longValue();
                        z8 = true;
                        i4 = -1;
                    }
                    z9 = playbackInfo.f17179e == 4;
                    iA3 = i4;
                    z10 = z8;
                    z11 = false;
                }
                z4 = z11;
                z5 = z10;
                window = window2;
                z3 = z9;
                iA = iA3;
                i2 = -1;
                obj = obj2;
                jLongValue2 = jLongValue;
            } else {
                MediaSource.MediaPeriodId mediaPeriodId9 = mediaPeriodId8;
                period = period2;
                if (playbackInfo.f17176a.p()) {
                    iA = timeline.a(z13);
                    window = window2;
                    obj = obj5;
                } else if (timeline.b(obj5) == -1) {
                    Object objH = H(window2, period, i7, z13, obj5, playbackInfo.f17176a, timeline);
                    window = window2;
                    if (objH == null) {
                        iA2 = timeline.a(z13);
                        z6 = true;
                    } else {
                        iA2 = timeline.g(objH, period).Z;
                        z6 = false;
                    }
                    z4 = z6;
                    iA = iA2;
                    obj = obj5;
                    period = period;
                    jLongValue2 = jLongValue2;
                    i2 = -1;
                    z3 = false;
                    z5 = false;
                    mediaPeriodId = mediaPeriodId9;
                } else {
                    window = window2;
                    if (jLongValue2 == -9223372036854775807L) {
                        iA = timeline.g(obj5, period).Z;
                        obj = obj5;
                        period = period;
                    } else if (z15) {
                        playbackInfo.f17176a.g(mediaPeriodId9.f18347a, period);
                        if (playbackInfo.f17176a.m(period.Z, window, 0L).o0 == playbackInfo.f17176a.b(mediaPeriodId9.f18347a)) {
                            long j7 = period.f0 + jLongValue2;
                            int i8 = timeline.g(obj5, period).Z;
                            period = period;
                            Pair pairI = timeline.i(window, period, i8, j7);
                            obj = pairI.first;
                            jLongValue2 = ((Long) pairI.second).longValue();
                        } else {
                            period = period;
                            obj = obj5;
                            jLongValue2 = jLongValue2;
                        }
                        iA = -1;
                        i2 = -1;
                        z3 = false;
                        z4 = false;
                        z5 = true;
                        mediaPeriodId = mediaPeriodId9;
                    } else {
                        period = period;
                        obj = obj5;
                        jLongValue2 = jLongValue2;
                        iA = -1;
                        i2 = -1;
                        z3 = false;
                        z4 = false;
                        z5 = false;
                        mediaPeriodId = mediaPeriodId9;
                    }
                }
                i2 = -1;
                z3 = false;
                z4 = false;
                z5 = false;
                mediaPeriodId = mediaPeriodId9;
            }
            if (iA != i2) {
                int i9 = iA;
                timeline2 = timeline;
                Pair pairI2 = timeline2.i(window, period, i9, -9223372036854775807L);
                obj = pairI2.first;
                jLongValue2 = ((Long) pairI2.second).longValue();
                j2 = -9223372036854775807L;
            } else {
                timeline2 = timeline;
                j2 = jLongValue2;
            }
            MediaSource.MediaPeriodId mediaPeriodIdM = mediaPeriodQueue.m(timeline2, obj, jLongValue2);
            int i10 = mediaPeriodIdM.f18350e;
            boolean z16 = mediaPeriodId.f18347a.equals(obj) && !mediaPeriodId.a() && !mediaPeriodIdM.a() && (i10 == i2 || ((i3 = mediaPeriodId.f18350e) != i2 && i10 >= i3));
            Timeline.Period periodG = timeline2.g(obj, period);
            if (z15 || jLongValue2 != j2 || !mediaPeriodId.f18347a.equals(mediaPeriodIdM.f18347a)) {
                z7 = false;
            } else if (mediaPeriodId.a()) {
                int i11 = mediaPeriodId.f18348b;
                if (periodG.f(i11)) {
                    int i12 = mediaPeriodId.f18349c;
                    if (periodG.d(i11, i12) == 4 || periodG.d(i11, i12) == 2) {
                        z7 = false;
                    } else {
                        z7 = true;
                    }
                } else if (mediaPeriodIdM.a() || !periodG.f(mediaPeriodIdM.f18348b)) {
                    z7 = false;
                } else {
                    z7 = true;
                }
            } else {
                if (mediaPeriodIdM.a()) {
                }
                z7 = false;
            }
            if (z16 || z7) {
                mediaPeriodIdM = mediaPeriodId;
            }
            A2 = mediaPeriodIdM.a();
            if (A2 == 0) {
                j3 = jLongValue2;
            } else if (mediaPeriodIdM.equals(mediaPeriodId)) {
                jLongValue2 = playbackInfo.r;
                j3 = jLongValue2;
            } else {
                timeline2.g(mediaPeriodIdM.f18347a, period);
                j3 = mediaPeriodIdM.f18349c == period.e(mediaPeriodIdM.f18348b) ? period.h0.f18426Y : 0L;
            }
            positionUpdateForPlaylistChange = new PositionUpdateForPlaylistChange(mediaPeriodIdM, j3, j2, z3, z4, z5);
        }
        MediaSource.MediaPeriodId mediaPeriodId10 = positionUpdateForPlaylistChange.f17070a;
        long j8 = positionUpdateForPlaylistChange.f17072c;
        boolean z17 = positionUpdateForPlaylistChange.d;
        long jK = positionUpdateForPlaylistChange.f17071b;
        boolean z18 = (this.y0.f17177b.equals(mediaPeriodId10) && jK == this.y0.r) ? false : true;
        try {
            if (positionUpdateForPlaylistChange.f17073e) {
                try {
                    z12 = true;
                    if (this.y0.f17179e != 1) {
                        try {
                            X(4);
                        } catch (Throwable th) {
                            th = th;
                            r11 = timeline2;
                            mediaPeriodId2 = mediaPeriodId10;
                            j4 = j8;
                            r14 = 0;
                            r18 = z12;
                        }
                    }
                    mediaPeriodId4 = null;
                    C(false, false, false, true);
                } catch (Throwable th2) {
                    th = th2;
                    z12 = true;
                }
            } else {
                z12 = true;
                mediaPeriodId4 = mediaPeriodId;
            }
            try {
                if (z18) {
                    A2 = timeline2;
                    mediaPeriodId4 = null;
                    r19 = z12;
                    if (A2.p()) {
                        mediaPeriodId7 = mediaPeriodId4;
                        r112 = r19;
                        mediaPeriodId2 = mediaPeriodId10;
                        r15 = mediaPeriodId7;
                        r111 = r112;
                    } else {
                        mediaPeriodId7 = mediaPeriodId4;
                        r112 = r19;
                        try {
                            for (MediaPeriodHolder mediaPeriodHolder = this.t0.f17155h; mediaPeriodHolder != null; mediaPeriodHolder = mediaPeriodHolder.f17143l) {
                                if (mediaPeriodHolder.f.f17145a.equals(mediaPeriodId10)) {
                                    mediaPeriodHolder.f = this.t0.g(A2, mediaPeriodHolder.f);
                                    mediaPeriodHolder.h();
                                }
                            }
                            MediaPeriodQueue mediaPeriodQueue2 = this.t0;
                            mediaPeriodId2 = mediaPeriodId10;
                            try {
                                jK = K(mediaPeriodId2, jK, mediaPeriodQueue2.f17155h != mediaPeriodQueue2.f17156i ? r19 : 0, z17);
                                r15 = mediaPeriodId4;
                                r111 = r19;
                            } catch (Throwable th3) {
                                th = th3;
                                jK = jK;
                                r7 = A2;
                                mediaPeriodId5 = mediaPeriodId4;
                                r110 = r19;
                                j4 = j8;
                                r11 = r7;
                                r14 = mediaPeriodId5;
                                r18 = r110;
                                PlaybackInfo playbackInfo2 = this.y0;
                                Timeline timeline4 = playbackInfo2.f17176a;
                                MediaSource.MediaPeriodId mediaPeriodId11 = playbackInfo2.f17177b;
                                if (positionUpdateForPlaylistChange.f) {
                                    j5 = jK;
                                } else {
                                    j5 = j;
                                }
                                mediaPeriodId3 = mediaPeriodId2;
                                f0(r11, mediaPeriodId3, timeline4, mediaPeriodId11, j5, false);
                                if (z18) {
                                    PlaybackInfo playbackInfo3 = this.y0;
                                    obj3 = playbackInfo3.f17177b.f18347a;
                                    Timeline timeline5 = playbackInfo3.f17176a;
                                    if (z18) {
                                        r9 = 0;
                                    } else {
                                        r9 = 0;
                                    }
                                    long j9 = this.y0.d;
                                    if (r11.b(obj3) == -1) {
                                        i5 = 4;
                                    } else {
                                        i5 = 3;
                                    }
                                    this.y0 = q(mediaPeriodId3, jK, j4, j9, r9, i5);
                                } else {
                                    PlaybackInfo playbackInfo4 = this.y0;
                                    obj3 = playbackInfo4.f17177b.f18347a;
                                    Timeline timeline6 = playbackInfo4.f17176a;
                                    if (z18) {
                                        r9 = 0;
                                    } else {
                                        r9 = 0;
                                    }
                                    long j10 = this.y0.d;
                                    if (r11.b(obj3) == -1) {
                                        i5 = 4;
                                    } else {
                                        i5 = 3;
                                    }
                                    this.y0 = q(mediaPeriodId3, jK, j4, j10, r9, i5);
                                }
                                D();
                                F(r11, this.y0.f17176a);
                                this.y0 = this.y0.f(r11);
                                if (!r11.p()) {
                                    this.L0 = r14;
                                }
                                m(false);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            mediaPeriodId2 = mediaPeriodId10;
                            r7 = A2;
                            mediaPeriodId5 = mediaPeriodId4;
                            r110 = r19;
                            j4 = j8;
                            r11 = r7;
                            r14 = mediaPeriodId5;
                            r18 = r110;
                            PlaybackInfo playbackInfo5 = this.y0;
                            Timeline timeline7 = playbackInfo5.f17176a;
                            MediaSource.MediaPeriodId mediaPeriodId12 = playbackInfo5.f17177b;
                            if (positionUpdateForPlaylistChange.f) {
                                j5 = jK;
                            } else {
                                j5 = j;
                            }
                            mediaPeriodId3 = mediaPeriodId2;
                            f0(r11, mediaPeriodId3, timeline7, mediaPeriodId12, j5, false);
                            if (z18) {
                                PlaybackInfo playbackInfo6 = this.y0;
                                obj3 = playbackInfo6.f17177b.f18347a;
                                Timeline timeline8 = playbackInfo6.f17176a;
                                if (z18) {
                                    r9 = 0;
                                } else {
                                    r9 = 0;
                                }
                                long j11 = this.y0.d;
                                if (r11.b(obj3) == -1) {
                                    i5 = 4;
                                } else {
                                    i5 = 3;
                                }
                                this.y0 = q(mediaPeriodId3, jK, j4, j11, r9, i5);
                            } else {
                                PlaybackInfo playbackInfo7 = this.y0;
                                obj3 = playbackInfo7.f17177b.f18347a;
                                Timeline timeline9 = playbackInfo7.f17176a;
                                if (z18) {
                                    r9 = 0;
                                } else {
                                    r9 = 0;
                                }
                                long j12 = this.y0.d;
                                if (r11.b(obj3) == -1) {
                                    i5 = 4;
                                } else {
                                    i5 = 3;
                                }
                                this.y0 = q(mediaPeriodId3, jK, j4, j12, r9, i5);
                            }
                            D();
                            F(r11, this.y0.f17176a);
                            this.y0 = this.y0.f(r11);
                            if (!r11.p()) {
                                this.L0 = r14;
                            }
                            m(false);
                            throw th;
                        }
                    }
                    PlaybackInfo playbackInfo8 = this.y0;
                    Timeline timeline10 = playbackInfo8.f17176a;
                    MediaSource.MediaPeriodId mediaPeriodId13 = playbackInfo8.f17177b;
                    if (positionUpdateForPlaylistChange.f) {
                        j6 = jK;
                    } else {
                        j6 = j;
                    }
                    mediaPeriodId6 = mediaPeriodId2;
                    f0(timeline, mediaPeriodId6, timeline10, mediaPeriodId13, j6, false);
                    if (z18) {
                        PlaybackInfo playbackInfo9 = this.y0;
                        obj4 = playbackInfo9.f17177b.f18347a;
                        Timeline timeline11 = playbackInfo9.f17176a;
                        if (z18) {
                            r10 = 0;
                        } else {
                            r10 = 0;
                        }
                        long j13 = this.y0.d;
                        if (timeline.b(obj4) == -1) {
                            i6 = 4;
                        } else {
                            i6 = 3;
                        }
                        this.y0 = q(mediaPeriodId6, jK, j8, j13, r10, i6);
                    } else {
                        PlaybackInfo playbackInfo10 = this.y0;
                        obj4 = playbackInfo10.f17177b.f18347a;
                        Timeline timeline12 = playbackInfo10.f17176a;
                        if (z18) {
                            r10 = 0;
                        } else {
                            r10 = 0;
                        }
                        long j14 = this.y0.d;
                        if (timeline.b(obj4) == -1) {
                            i6 = 4;
                        } else {
                            i6 = 3;
                        }
                        this.y0 = q(mediaPeriodId6, jK, j8, j14, r10, i6);
                    }
                    D();
                    F(
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0366: INVOKE 
                          (r34v0 'this' ?? I:com.google.android.exoplayer2.ExoPlayerImplInternal A[IMMUTABLE_TYPE, THIS])
                          (r2v37 com.google.android.exoplayer2.Timeline)
                          (wrap com.google.android.exoplayer2.Timeline:0x0364: IGET 
                          (wrap com.google.android.exoplayer2.PlaybackInfo:0x0362: IGET (r34v0 'this' ?? I:com.google.android.exoplayer2.ExoPlayerImplInternal A[IMMUTABLE_TYPE, THIS]) A[WRAPPED] (LINE:867) com.google.android.exoplayer2.ExoPlayerImplInternal.y0 com.google.android.exoplayer2.PlaybackInfo)
                         A[WRAPPED] (LINE:869) com.google.android.exoplayer2.PlaybackInfo.a com.google.android.exoplayer2.Timeline)
                         VIRTUAL call: com.google.android.exoplayer2.ExoPlayerImplInternal.F(com.google.android.exoplayer2.Timeline, com.google.android.exoplayer2.Timeline):void A[MD:(com.google.android.exoplayer2.Timeline, com.google.android.exoplayer2.Timeline):void (m)] (LINE:871) in method: com.google.android.exoplayer2.ExoPlayerImplInternal.n(com.google.android.exoplayer2.Timeline, boolean):void, file: classes3.dex
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
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v37 com.google.android.exoplayer2.Timeline
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 1023
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ExoPlayerImplInternal.n(com.google.android.exoplayer2.Timeline, boolean):void");
                }

                /* JADX WARN: Type inference failed for: r3v1, types: [com.google.android.exoplayer2.source.MediaPeriod, java.lang.Object] */
                public final void o(MediaPeriod mediaPeriod) throws ExoPlaybackException {
                    MediaPeriodQueue mediaPeriodQueue = this.t0;
                    MediaPeriodHolder mediaPeriodHolder = mediaPeriodQueue.j;
                    if (mediaPeriodHolder == null || mediaPeriodHolder.f17137a != mediaPeriod) {
                        return;
                    }
                    float f = this.p0.getPlaybackParameters().X;
                    Timeline timeline = this.y0.f17176a;
                    mediaPeriodHolder.d = true;
                    mediaPeriodHolder.m = mediaPeriodHolder.f17137a.getTrackGroups();
                    TrackSelectorResult trackSelectorResultG = mediaPeriodHolder.g(f, timeline);
                    MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.f;
                    long j = mediaPeriodInfo.f17148e;
                    long jMax = mediaPeriodInfo.f17146b;
                    if (j != -9223372036854775807L && jMax >= j) {
                        jMax = Math.max(0L, j - 1);
                    }
                    long jA = mediaPeriodHolder.a(trackSelectorResultG, jMax, false, new boolean[mediaPeriodHolder.f17142i.length]);
                    long j2 = mediaPeriodHolder.o;
                    MediaPeriodInfo mediaPeriodInfo2 = mediaPeriodHolder.f;
                    mediaPeriodHolder.o = (mediaPeriodInfo2.f17146b - jA) + j2;
                    mediaPeriodHolder.f = mediaPeriodInfo2.b(jA);
                    ExoTrackSelection[] exoTrackSelectionArr = mediaPeriodHolder.f17144n.f18711c;
                    LoadControl loadControl = this.g0;
                    Renderer[] rendererArr = this.X;
                    loadControl.b(rendererArr, exoTrackSelectionArr);
                    if (mediaPeriodHolder == mediaPeriodQueue.f17155h) {
                        E(mediaPeriodHolder.f.f17146b);
                        g(new boolean[rendererArr.length]);
                        PlaybackInfo playbackInfo = this.y0;
                        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.f17177b;
                        long j3 = mediaPeriodHolder.f.f17146b;
                        this.y0 = q(mediaPeriodId, j3, playbackInfo.f17178c, j3, false, 5);
                    }
                    u();
                }

                @Override // com.google.android.exoplayer2.trackselection.TrackSelector.InvalidationListener
                public final void onTrackSelectionsInvalidated() {
                    this.i0.sendEmptyMessage(10);
                }

                public final void p(PlaybackParameters playbackParameters, float f, boolean z2, boolean z3) {
                    PlaybackParameters playbackParameters2;
                    int i2;
                    if (z2) {
                        if (z3) {
                            this.z0.a(1);
                        }
                        PlaybackInfo playbackInfo = this.y0;
                        PlaybackInfo playbackInfo2 = new PlaybackInfo(playbackInfo.f17176a, playbackInfo.f17177b, playbackInfo.f17178c, playbackInfo.d, playbackInfo.f17179e, playbackInfo.f, playbackInfo.g, playbackInfo.f17180h, playbackInfo.f17181i, playbackInfo.j, playbackInfo.k, playbackInfo.f17182l, playbackInfo.m, playbackParameters, playbackInfo.f17184p, playbackInfo.q, playbackInfo.r, playbackInfo.o);
                        playbackParameters2 = playbackParameters;
                        this.y0 = playbackInfo2;
                    } else {
                        playbackParameters2 = playbackParameters;
                    }
                    float f2 = playbackParameters2.X;
                    MediaPeriodHolder mediaPeriodHolder = this.t0.f17155h;
                    while (true) {
                        i2 = 0;
                        if (mediaPeriodHolder == null) {
                            break;
                        }
                        ExoTrackSelection[] exoTrackSelectionArr = mediaPeriodHolder.f17144n.f18711c;
                        int length = exoTrackSelectionArr.length;
                        while (i2 < length) {
                            ExoTrackSelection exoTrackSelection = exoTrackSelectionArr[i2];
                            if (exoTrackSelection != null) {
                                exoTrackSelection.onPlaybackSpeed(f2);
                            }
                            i2++;
                        }
                        mediaPeriodHolder = mediaPeriodHolder.f17143l;
                    }
                    Renderer[] rendererArr = this.X;
                    int length2 = rendererArr.length;
                    while (i2 < length2) {
                        Renderer renderer = rendererArr[i2];
                        if (renderer != null) {
                            renderer.d(f, playbackParameters2.X);
                        }
                        i2++;
                    }
                }

                public final PlaybackInfo q(MediaSource.MediaPeriodId mediaPeriodId, long j, long j2, long j3, boolean z2, int i2) {
                    this.O0 = (!this.O0 && j == this.y0.r && mediaPeriodId.equals(this.y0.f17177b)) ? false : true;
                    D();
                    PlaybackInfo playbackInfo = this.y0;
                    TrackGroupArray trackGroupArray = playbackInfo.f17180h;
                    TrackSelectorResult trackSelectorResult = playbackInfo.f17181i;
                    List listX = playbackInfo.j;
                    if (this.u0.k) {
                        MediaPeriodHolder mediaPeriodHolder = this.t0.f17155h;
                        trackGroupArray = mediaPeriodHolder == null ? TrackGroupArray.e0 : mediaPeriodHolder.m;
                        trackSelectorResult = mediaPeriodHolder == null ? this.f0 : mediaPeriodHolder.f17144n;
                        ExoTrackSelection[] exoTrackSelectionArr = trackSelectorResult.f18711c;
                        ImmutableList.Builder builder = new ImmutableList.Builder();
                        boolean z3 = false;
                        for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
                            if (exoTrackSelection != null) {
                                Metadata metadata = exoTrackSelection.getFormat(0).k0;
                                if (metadata == null) {
                                    builder.h(new Metadata(new Metadata.Entry[0]));
                                } else {
                                    builder.h(metadata);
                                    z3 = true;
                                }
                            }
                        }
                        listX = z3 ? builder.j() : ImmutableList.x();
                        if (mediaPeriodHolder != null) {
                            MediaPeriodInfo mediaPeriodInfo = mediaPeriodHolder.f;
                            if (mediaPeriodInfo.f17147c != j2) {
                                mediaPeriodHolder.f = mediaPeriodInfo.a(j2);
                            }
                        }
                    } else if (!mediaPeriodId.equals(playbackInfo.f17177b)) {
                        trackGroupArray = TrackGroupArray.e0;
                        trackSelectorResult = this.f0;
                        listX = ImmutableList.x();
                    }
                    TrackGroupArray trackGroupArray2 = trackGroupArray;
                    TrackSelectorResult trackSelectorResult2 = trackSelectorResult;
                    List list = listX;
                    if (z2) {
                        PlaybackInfoUpdate playbackInfoUpdate = this.z0;
                        if (!playbackInfoUpdate.d || playbackInfoUpdate.f17069e == 5) {
                            playbackInfoUpdate.f17066a = true;
                            playbackInfoUpdate.d = true;
                            playbackInfoUpdate.f17069e = i2;
                        } else {
                            Assertions.b(i2 == 5);
                        }
                    }
                    PlaybackInfo playbackInfo2 = this.y0;
                    long j4 = playbackInfo2.f17184p;
                    MediaPeriodHolder mediaPeriodHolder2 = this.t0.j;
                    return playbackInfo2.b(mediaPeriodId, j, j2, j3, mediaPeriodHolder2 == null ? 0L : Math.max(0L, j4 - (this.M0 - mediaPeriodHolder2.o)), trackGroupArray2, trackSelectorResult2, list);
                }

                /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.exoplayer2.source.SequenceableLoader, java.lang.Object] */
                public final boolean r() {
                    MediaPeriodHolder mediaPeriodHolder = this.t0.j;
                    if (mediaPeriodHolder == null) {
                        return false;
                    }
                    return (!mediaPeriodHolder.d ? 0L : mediaPeriodHolder.f17137a.getNextLoadPositionUs()) != Long.MIN_VALUE;
                }

                public final boolean t() {
                    MediaPeriodHolder mediaPeriodHolder = this.t0.f17155h;
                    long j = mediaPeriodHolder.f.f17148e;
                    if (mediaPeriodHolder.d) {
                        return j == -9223372036854775807L || this.y0.r < j || !Y();
                    }
                    return false;
                }

                /* JADX WARN: Type inference failed for: r0v12, types: [com.google.android.exoplayer2.source.MediaPeriod, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v18, types: [com.google.android.exoplayer2.source.SequenceableLoader, java.lang.Object] */
                /* JADX WARN: Type inference failed for: r0v3, types: [com.google.android.exoplayer2.source.SequenceableLoader, java.lang.Object] */
                public final void u() {
                    boolean zShouldContinueLoading;
                    if (r()) {
                        MediaPeriodHolder mediaPeriodHolder = this.t0.j;
                        long nextLoadPositionUs = !mediaPeriodHolder.d ? 0L : mediaPeriodHolder.f17137a.getNextLoadPositionUs();
                        MediaPeriodHolder mediaPeriodHolder2 = this.t0.j;
                        long jMax = mediaPeriodHolder2 == null ? 0L : Math.max(0L, nextLoadPositionUs - (this.M0 - mediaPeriodHolder2.o));
                        MediaPeriodHolder mediaPeriodHolder3 = this.t0.f17155h;
                        zShouldContinueLoading = this.g0.shouldContinueLoading(jMax, this.p0.getPlaybackParameters().X);
                        if (!zShouldContinueLoading && jMax < 500000 && (this.n0 > 0 || this.o0)) {
                            this.t0.f17155h.f17137a.discardBuffer(this.y0.r, false);
                            zShouldContinueLoading = this.g0.shouldContinueLoading(jMax, this.p0.getPlaybackParameters().X);
                        }
                    } else {
                        zShouldContinueLoading = false;
                    }
                    this.E0 = zShouldContinueLoading;
                    if (zShouldContinueLoading) {
                        MediaPeriodHolder mediaPeriodHolder4 = this.t0.j;
                        long j = this.M0;
                        Assertions.d(mediaPeriodHolder4.f17143l == null);
                        mediaPeriodHolder4.f17137a.continueLoading(j - mediaPeriodHolder4.o);
                    }
                    d0();
                }

                public final void v() {
                    int i2 = 0;
                    PlaybackInfoUpdate playbackInfoUpdate = this.z0;
                    PlaybackInfo playbackInfo = this.y0;
                    boolean z2 = playbackInfoUpdate.f17066a | (playbackInfoUpdate.f17067b != playbackInfo);
                    playbackInfoUpdate.f17066a = z2;
                    playbackInfoUpdate.f17067b = playbackInfo;
                    if (z2) {
                        h hVar = this.s0;
                        int i3 = ExoPlayerImpl.f17032d0;
                        ExoPlayerImpl exoPlayerImpl = hVar.X;
                        exoPlayerImpl.getClass();
                        exoPlayerImpl.f17052i.post(new j(i2, exoPlayerImpl, playbackInfoUpdate));
                        this.z0 = new PlaybackInfoUpdate(this.y0);
                    }
                }

                public final void w() throws Throwable {
                    n(this.u0.b(), true);
                }

                public final void x(MoveMediaItemsMessage moveMediaItemsMessage) throws Throwable {
                    this.z0.a(1);
                    moveMediaItemsMessage.getClass();
                    MediaSourceList mediaSourceList = this.u0;
                    mediaSourceList.getClass();
                    Assertions.b(mediaSourceList.f17159b.size() >= 0);
                    mediaSourceList.j = null;
                    n(mediaSourceList.b(), false);
                }

                public final void y() {
                    this.z0.a(1);
                    int i2 = 0;
                    C(false, false, false, true);
                    this.g0.onPrepared();
                    X(this.y0.f17176a.p() ? 4 : 2);
                    TransferListener transferListenerA = this.h0.a();
                    MediaSourceList mediaSourceList = this.u0;
                    Assertions.d(!mediaSourceList.k);
                    mediaSourceList.f17164l = transferListenerA;
                    while (true) {
                        ArrayList arrayList = mediaSourceList.f17159b;
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
                    C(true, false, true, false);
                    this.g0.onReleased();
                    X(1);
                    HandlerThread handlerThread = this.j0;
                    if (handlerThread != null) {
                        handlerThread.quit();
                    }
                    synchronized (this) {
                        this.A0 = true;
                        notifyAll();
                    }
                }
            }
