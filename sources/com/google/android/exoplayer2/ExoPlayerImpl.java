package com.google.android.exoplayer2;

import A.AbstractC0912t;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import com.google.android.exoplayer2.analytics.AnalyticsCollector;
import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.analytics.MediaMetricsListener;
import com.google.android.exoplayer2.analytics.PlayerId;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.audio.AudioRendererEventListener;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.decoder.DecoderReuseEvaluation;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.MetadataOutput;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.text.TextOutput;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelectorResult;
import com.google.android.exoplayer2.upstream.BandwidthMeter;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.google.android.exoplayer2.util.FlagSet;
import com.google.android.exoplayer2.util.HandlerWrapper;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Size;
import com.google.android.exoplayer2.util.SystemClock;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoDecoderOutputBufferRenderer;
import com.google.android.exoplayer2.video.VideoFrameMetadataListener;
import com.google.android.exoplayer2.video.VideoRendererEventListener;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.exoplayer2.video.spherical.CameraMotionListener;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.google.common.collect.ImmutableList;
import com.p004ironsource.d9;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes3.dex */
final class ExoPlayerImpl extends BasePlayer implements ExoPlayer, ExoPlayer.AudioComponent, ExoPlayer.VideoComponent, ExoPlayer.TextComponent, ExoPlayer.DeviceComponent {

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final /* synthetic */ int f17032d0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final WifiLockManager f17033A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final long f17034B;
    public int C;
    public int D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f17035E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f17036F;
    public ShuffleOrder G;
    public Player.Commands H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public MediaMetadata f17037I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public Format f17038J;
    public AudioTrack K;
    public Object L;
    public Surface M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public SurfaceHolder f17039N;
    public SphericalGLSurfaceView O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f17040P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public final int f17041Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Size f17042R;
    public final int S;
    public final AudioAttributes T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public float f17043U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f17044V;
    public final boolean W;
    public boolean X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final DeviceInfo f17045Y;
    public MediaMetadata Z;
    public PlaybackInfo a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TrackSelectorResult f17046b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public int f17047b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Player.Commands f17048c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public long f17049c0;
    public final ConditionVariable d = new ConditionVariable(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f17050e;
    public final Player f;
    public final Renderer[] g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TrackSelector f17051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HandlerWrapper f17052i;
    public final ExoPlayerImplInternal j;
    public final ListenerSet k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CopyOnWriteArraySet f17053l;
    public final Timeline.Period m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f17054n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MediaSource.Factory f17055p;
    public final AnalyticsCollector q;
    public final Looper r;
    public final BandwidthMeter s;
    public final SystemClock t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final ComponentListener f17056u;
    public final FrameMetadataListener v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AudioBecomingNoisyManager f17057w;
    public final AudioFocusManager x;
    public final StreamVolumeManager y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final WakeLockManager f17058z;

    public static final class Api31 {
        public static PlayerId a(Context context, ExoPlayerImpl exoPlayerImpl, boolean z2) {
            MediaMetricsManager mediaMetricsManagerH = AbstractC0912t.h(context.getSystemService("media_metrics"));
            MediaMetricsListener mediaMetricsListener = mediaMetricsManagerH == null ? null : new MediaMetricsListener(context, mediaMetricsManagerH.createPlaybackSession());
            if (mediaMetricsListener == null) {
                Log.g("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new PlayerId(LogSessionId.LOG_SESSION_ID_NONE);
            }
            if (z2) {
                exoPlayerImpl.getClass();
                exoPlayerImpl.q.D(mediaMetricsListener);
            }
            return new PlayerId(mediaMetricsListener.f17238c.getSessionId());
        }
    }

    public static final class FrameMetadataListener implements VideoFrameMetadataListener, CameraMotionListener, PlayerMessage.Target {
        public VideoFrameMetadataListener X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public CameraMotionListener f17059Y;
        public VideoFrameMetadataListener Z;
        public CameraMotionListener e0;

        @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
        public final void a(float[] fArr, long j) {
            CameraMotionListener cameraMotionListener = this.e0;
            if (cameraMotionListener != null) {
                cameraMotionListener.a(fArr, j);
            }
            CameraMotionListener cameraMotionListener2 = this.f17059Y;
            if (cameraMotionListener2 != null) {
                cameraMotionListener2.a(fArr, j);
            }
        }

        @Override // com.google.android.exoplayer2.video.spherical.CameraMotionListener
        public final void c() {
            CameraMotionListener cameraMotionListener = this.e0;
            if (cameraMotionListener != null) {
                cameraMotionListener.c();
            }
            CameraMotionListener cameraMotionListener2 = this.f17059Y;
            if (cameraMotionListener2 != null) {
                cameraMotionListener2.c();
            }
        }

        @Override // com.google.android.exoplayer2.video.VideoFrameMetadataListener
        public final void f(long j, long j2, Format format, MediaFormat mediaFormat) {
            long j3;
            long j4;
            Format format2;
            MediaFormat mediaFormat2;
            VideoFrameMetadataListener videoFrameMetadataListener = this.Z;
            if (videoFrameMetadataListener != null) {
                videoFrameMetadataListener.f(j, j2, format, mediaFormat);
                mediaFormat2 = mediaFormat;
                format2 = format;
                j4 = j2;
                j3 = j;
            } else {
                j3 = j;
                j4 = j2;
                format2 = format;
                mediaFormat2 = mediaFormat;
            }
            VideoFrameMetadataListener videoFrameMetadataListener2 = this.X;
            if (videoFrameMetadataListener2 != null) {
                videoFrameMetadataListener2.f(j3, j4, format2, mediaFormat2);
            }
        }

        @Override // com.google.android.exoplayer2.PlayerMessage.Target
        public final void handleMessage(int i2, Object obj) {
            if (i2 == 7) {
                this.X = (VideoFrameMetadataListener) obj;
                return;
            }
            if (i2 == 8) {
                this.f17059Y = (CameraMotionListener) obj;
                return;
            }
            if (i2 != 10000) {
                return;
            }
            SphericalGLSurfaceView sphericalGLSurfaceView = (SphericalGLSurfaceView) obj;
            if (sphericalGLSurfaceView == null) {
                this.Z = null;
                this.e0 = null;
            } else {
                this.Z = sphericalGLSurfaceView.getVideoFrameMetadataListener();
                this.e0 = sphericalGLSurfaceView.getCameraMotionListener();
            }
        }
    }

    public static final class MediaSourceHolderSnapshot implements MediaSourceInfoHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f17060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Timeline f17061b;

        public MediaSourceHolderSnapshot(Object obj, Timeline timeline) {
            this.f17060a = obj;
            this.f17061b = timeline;
        }

        @Override // com.google.android.exoplayer2.MediaSourceInfoHolder
        public final Object a() {
            return this.f17060a;
        }

        @Override // com.google.android.exoplayer2.MediaSourceInfoHolder
        public final Timeline b() {
            return this.f17061b;
        }
    }

    static {
        ExoPlayerLibraryInfo.a("goog.exo.exoplayer");
    }

    public ExoPlayerImpl(ExoPlayer.Builder builder) {
        try {
            Log.f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [ExoPlayerLib/2.18.7] [" + Util.f18982e + d9.i.f24752e);
            Context context = builder.f17023a;
            Context applicationContext = context.getApplicationContext();
            this.f17050e = applicationContext;
            SystemClock systemClock = builder.f17024b;
            DefaultAnalyticsCollector defaultAnalyticsCollector = new DefaultAnalyticsCollector(systemClock);
            this.q = defaultAnalyticsCollector;
            this.T = builder.f17028i;
            this.f17041Q = builder.j;
            this.f17044V = false;
            this.f17034B = builder.o;
            ComponentListener componentListener = new ComponentListener();
            this.f17056u = componentListener;
            this.v = new FrameMetadataListener();
            Handler handler = new Handler(builder.f17027h);
            Renderer[] rendererArrA = ((RenderersFactory) builder.f17025c.get()).a(handler, componentListener, componentListener, componentListener, componentListener);
            this.g = rendererArrA;
            Assertions.d(rendererArrA.length > 0);
            TrackSelector trackSelector = (TrackSelector) builder.f17026e.get();
            this.f17051h = trackSelector;
            this.f17055p = (MediaSource.Factory) builder.d.get();
            BandwidthMeter bandwidthMeter = (BandwidthMeter) builder.g.get();
            this.s = bandwidthMeter;
            this.o = builder.k;
            SeekParameters seekParameters = builder.f17029l;
            Looper looper = builder.f17027h;
            this.r = looper;
            this.t = systemClock;
            this.f = this;
            this.k = new ListenerSet(looper, systemClock, new h(this));
            CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
            this.f17053l = copyOnWriteArraySet;
            this.f17054n = new ArrayList();
            this.G = new ShuffleOrder.DefaultShuffleOrder();
            TrackSelectorResult trackSelectorResult = new TrackSelectorResult(new RendererConfiguration[rendererArrA.length], new ExoTrackSelection[rendererArrA.length], Tracks.f17210Y, null);
            this.f17046b = trackSelectorResult;
            this.m = new Timeline.Period();
            Player.Commands.Builder builder2 = new Player.Commands.Builder();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28};
            FlagSet.Builder builder3 = builder2.f17186a;
            builder3.getClass();
            int i2 = 0;
            for (int i3 = 21; i2 < i3; i3 = 21) {
                builder3.a(iArr[i2]);
                i2++;
            }
            builder2.a(29, trackSelector instanceof DefaultTrackSelector);
            Player.Commands commandsB = builder2.b();
            this.f17048c = commandsB;
            Player.Commands.Builder builder4 = new Player.Commands.Builder();
            FlagSet.Builder builder5 = builder4.f17186a;
            FlagSet flagSet = commandsB.X;
            builder5.getClass();
            for (int i4 = 0; i4 < flagSet.f18903a.size(); i4++) {
                builder5.a(flagSet.a(i4));
            }
            builder5.a(4);
            builder5.a(10);
            this.H = builder4.b();
            this.f17052i = systemClock.createHandler(looper, null);
            h hVar = new h(this);
            this.a0 = PlaybackInfo.g(trackSelectorResult);
            defaultAnalyticsCollector.z(this, looper);
            int i5 = Util.f18979a;
            this.j = new ExoPlayerImplInternal(rendererArrA, trackSelector, trackSelectorResult, (LoadControl) builder.f.get(), bandwidthMeter, defaultAnalyticsCollector, seekParameters, builder.m, builder.f17030n, looper, systemClock, hVar, i5 < 31 ? new PlayerId() : Api31.a(applicationContext, this, builder.f17031p));
            this.f17043U = 1.0f;
            MediaMetadata mediaMetadata = MediaMetadata.J0;
            this.f17037I = mediaMetadata;
            this.Z = mediaMetadata;
            int iGenerateAudioSessionId = -1;
            this.f17047b0 = -1;
            if (i5 < 21) {
                AudioTrack audioTrack = this.K;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.K.release();
                    this.K = null;
                }
                if (this.K == null) {
                    this.K = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.S = this.K.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.f17050e.getSystemService("audio");
                if (audioManager != null) {
                    iGenerateAudioSessionId = audioManager.generateAudioSessionId();
                }
                this.S = iGenerateAudioSessionId;
            }
            int i6 = CueGroup.f18463Y;
            this.W = true;
            h(this.q);
            bandwidthMeter.d(new Handler(looper), this.q);
            copyOnWriteArraySet.add(componentListener);
            AudioBecomingNoisyManager audioBecomingNoisyManager = new AudioBecomingNoisyManager(context, handler, componentListener);
            this.f17057w = audioBecomingNoisyManager;
            audioBecomingNoisyManager.a();
            this.x = new AudioFocusManager(context, handler, componentListener);
            StreamVolumeManager streamVolumeManager = new StreamVolumeManager(context, handler, componentListener);
            this.y = streamVolumeManager;
            int iU = Util.u(this.T.Z);
            if (streamVolumeManager.f != iU) {
                streamVolumeManager.f = iU;
                streamVolumeManager.b();
                ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
                DeviceInfo deviceInfoK = k(exoPlayerImpl.y);
                if (!deviceInfoK.equals(exoPlayerImpl.f17045Y)) {
                    exoPlayerImpl.f17045Y = deviceInfoK;
                    exoPlayerImpl.k.e(29, new f(deviceInfoK, 5));
                }
            }
            WakeLockManager wakeLockManager = new WakeLockManager();
            this.f17058z = wakeLockManager;
            WifiLockManager wifiLockManager = new WifiLockManager();
            this.f17033A = wifiLockManager;
            this.f17045Y = k(streamVolumeManager);
            int i7 = VideoSize.f0;
            this.f17042R = Size.f18963c;
            this.f17051h.d(this.T);
            t(1, 10, Integer.valueOf(this.S));
            t(2, 10, Integer.valueOf(this.S));
            t(1, 3, this.T);
            t(2, 4, Integer.valueOf(this.f17041Q));
            t(2, 5, 0);
            t(1, 9, Boolean.valueOf(this.f17044V));
            t(2, 7, this.v);
            t(6, 8, this.v);
        } finally {
            this.d.d();
        }
    }

    public static DeviceInfo k(StreamVolumeManager streamVolumeManager) {
        streamVolumeManager.getClass();
        int i2 = Util.f18979a;
        AudioManager audioManager = streamVolumeManager.d;
        return new DeviceInfo(0, i2 >= 28 ? audioManager.getStreamMinVolume(streamVolumeManager.f) : 0, audioManager.getStreamMaxVolume(streamVolumeManager.f));
    }

    public static long o(PlaybackInfo playbackInfo) {
        Timeline.Window window = new Timeline.Window();
        Timeline.Period period = new Timeline.Period();
        playbackInfo.f17176a.g(playbackInfo.f17177b.f18347a, period);
        long j = playbackInfo.f17178c;
        if (j != -9223372036854775807L) {
            return period.f0 + j;
        }
        return playbackInfo.f17176a.m(period.Z, window, 0L).m0;
    }

    public static boolean p(PlaybackInfo playbackInfo) {
        return playbackInfo.f17179e == 3 && playbackInfo.f17182l && playbackInfo.m == 0;
    }

    @Override // com.google.android.exoplayer2.Player
    public final long b() {
        z();
        return Util.J(this.a0.q);
    }

    @Override // com.google.android.exoplayer2.ExoPlayer
    public final Format c() {
        z();
        return this.f17038J;
    }

    @Override // com.google.android.exoplayer2.Player
    public final Tracks d() {
        z();
        return this.a0.f17181i.d;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int e() {
        z();
        return this.a0.m;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int f() {
        z();
        int iN = n();
        if (iN == -1) {
            return 0;
        }
        return iN;
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getContentPosition() {
        z();
        if (!isPlayingAd()) {
            return getCurrentPosition();
        }
        PlaybackInfo playbackInfo = this.a0;
        Timeline timeline = playbackInfo.f17176a;
        Object obj = playbackInfo.f17177b.f18347a;
        Timeline.Period period = this.m;
        timeline.g(obj, period);
        PlaybackInfo playbackInfo2 = this.a0;
        if (playbackInfo2.f17178c != -9223372036854775807L) {
            return Util.J(this.a0.f17178c) + Util.J(period.f0);
        }
        return Util.J(playbackInfo2.f17176a.m(f(), this.f16995a, 0L).m0);
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentAdGroupIndex() {
        z();
        if (isPlayingAd()) {
            return this.a0.f17177b.f18348b;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentAdIndexInAdGroup() {
        z();
        if (isPlayingAd()) {
            return this.a0.f17177b.f18349c;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getCurrentPeriodIndex() {
        z();
        if (this.a0.f17176a.p()) {
            return 0;
        }
        PlaybackInfo playbackInfo = this.a0;
        return playbackInfo.f17176a.b(playbackInfo.f17177b.f18347a);
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getCurrentPosition() {
        z();
        return Util.J(m(this.a0));
    }

    @Override // com.google.android.exoplayer2.Player
    public final Timeline getCurrentTimeline() {
        z();
        return this.a0.f17176a;
    }

    @Override // com.google.android.exoplayer2.Player
    public final long getDuration() {
        z();
        if (!isPlayingAd()) {
            Timeline currentTimeline = getCurrentTimeline();
            if (currentTimeline.p()) {
                return -9223372036854775807L;
            }
            return Util.J(currentTimeline.m(f(), this.f16995a, 0L).n0);
        }
        PlaybackInfo playbackInfo = this.a0;
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.f17177b;
        Object obj = mediaPeriodId.f18347a;
        Timeline timeline = playbackInfo.f17176a;
        Timeline.Period period = this.m;
        timeline.g(obj, period);
        return Util.J(period.a(mediaPeriodId.f18348b, mediaPeriodId.f18349c));
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean getPlayWhenReady() {
        z();
        return this.a0.f17182l;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getPlaybackState() {
        z();
        return this.a0.f17179e;
    }

    @Override // com.google.android.exoplayer2.Player
    public final int getRepeatMode() {
        z();
        return 0;
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean getShuffleModeEnabled() {
        z();
        return false;
    }

    @Override // com.google.android.exoplayer2.Player
    public final float getVolume() {
        z();
        return this.f17043U;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void h(Player.Listener listener) {
        listener.getClass();
        this.k.a(listener);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void i(List list) {
        boolean z2;
        ArrayList arrayList;
        Pair pairQ;
        PlaybackInfo playbackInfoA;
        PlaybackInfo playbackInfoB;
        z();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList2.add(this.f17055p.a((MediaItem) list.get(i2)));
        }
        z();
        ArrayList arrayList3 = this.f17054n;
        int iMin = Math.min(Integer.MAX_VALUE, arrayList3.size());
        Timeline currentTimeline = getCurrentTimeline();
        this.C++;
        ArrayList arrayList4 = new ArrayList();
        for (int i3 = 0; i3 < arrayList2.size(); i3++) {
            MediaSourceList.MediaSourceHolder mediaSourceHolder = new MediaSourceList.MediaSourceHolder((MediaSource) arrayList2.get(i3), this.o);
            arrayList4.add(mediaSourceHolder);
            arrayList3.add(i3 + iMin, new MediaSourceHolderSnapshot(mediaSourceHolder.f17170b, mediaSourceHolder.f17169a.p0));
        }
        this.G = this.G.cloneAndInsert(iMin, arrayList4.size());
        PlaylistTimeline playlistTimeline = new PlaylistTimeline(arrayList3, this.G);
        PlaybackInfo playbackInfo = this.a0;
        long contentPosition = getContentPosition();
        if (currentTimeline.p() || playlistTimeline.p()) {
            z2 = true;
            arrayList = arrayList4;
            boolean z3 = !currentTimeline.p() && playlistTimeline.p();
            pairQ = q(playlistTimeline, z3 ? -1 : n(), z3 ? -9223372036854775807L : contentPosition);
        } else {
            z2 = true;
            pairQ = currentTimeline.i(this.f16995a, this.m, f(), Util.B(contentPosition));
            Object obj = pairQ.first;
            if (playlistTimeline.b(obj) != -1) {
                arrayList = arrayList4;
            } else {
                arrayList = arrayList4;
                Object objH = ExoPlayerImplInternal.H(this.f16995a, this.m, 0, false, obj, currentTimeline, playlistTimeline);
                if (objH != null) {
                    Timeline.Period period = this.m;
                    playlistTimeline.g(objH, period);
                    int i4 = period.Z;
                    Timeline.Window window = this.f16995a;
                    playlistTimeline.m(i4, window, 0L);
                    pairQ = q(playlistTimeline, i4, Util.J(window.m0));
                } else {
                    pairQ = q(playlistTimeline, -1, -9223372036854775807L);
                }
            }
        }
        Assertions.b((playlistTimeline.p() || pairQ != null) ? z2 : false);
        Timeline timeline = playbackInfo.f17176a;
        PlaybackInfo playbackInfoF = playbackInfo.f(playlistTimeline);
        if (playlistTimeline.p()) {
            MediaSource.MediaPeriodId mediaPeriodId = PlaybackInfo.s;
            long jB = Util.B(this.f17049c0);
            playbackInfoA = playbackInfoF.b(mediaPeriodId, jB, jB, jB, 0L, TrackGroupArray.e0, this.f17046b, ImmutableList.x()).a(mediaPeriodId);
            playbackInfoA.f17184p = playbackInfoA.r;
        } else {
            Object obj2 = playbackInfoF.f17177b.f18347a;
            int i5 = Util.f18979a;
            boolean zEquals = obj2.equals(pairQ.first);
            MediaSource.MediaPeriodId mediaPeriodId2 = !zEquals ? new MediaSource.MediaPeriodId(pairQ.first) : playbackInfoF.f17177b;
            long jLongValue = ((Long) pairQ.second).longValue();
            long jB2 = Util.B(getContentPosition());
            if (!timeline.p()) {
                jB2 -= timeline.g(obj2, this.m).f0;
            }
            if (!zEquals || jLongValue < jB2) {
                MediaSource.MediaPeriodId mediaPeriodId3 = mediaPeriodId2;
                Assertions.d(!mediaPeriodId3.a());
                playbackInfoA = playbackInfoF.b(mediaPeriodId3, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? TrackGroupArray.e0 : playbackInfoF.f17180h, !zEquals ? this.f17046b : playbackInfoF.f17181i, !zEquals ? ImmutableList.x() : playbackInfoF.j).a(mediaPeriodId3);
                playbackInfoA.f17184p = jLongValue;
            } else {
                if (jLongValue == jB2) {
                    int iB = playlistTimeline.b(playbackInfoF.k.f18347a);
                    if (iB != -1) {
                        Timeline.Period period2 = this.m;
                        playlistTimeline.f(iB, period2, false);
                        int i6 = period2.Z;
                        Object obj3 = mediaPeriodId2.f18347a;
                        Timeline.Period period3 = this.m;
                        playlistTimeline.g(obj3, period3);
                        if (i6 == period3.Z) {
                            playbackInfoA = playbackInfoF;
                        }
                    }
                    playlistTimeline.g(mediaPeriodId2.f18347a, this.m);
                    long jA = mediaPeriodId2.a() ? this.m.a(mediaPeriodId2.f18348b, mediaPeriodId2.f18349c) : this.m.e0;
                    playbackInfoB = playbackInfoF.b(mediaPeriodId2, playbackInfoF.r, playbackInfoF.r, playbackInfoF.d, jA - playbackInfoF.r, playbackInfoF.f17180h, playbackInfoF.f17181i, playbackInfoF.j).a(mediaPeriodId2);
                    playbackInfoB.f17184p = jA;
                } else {
                    Assertions.d(!mediaPeriodId2.a());
                    long jMax = Math.max(0L, playbackInfoF.q - (jLongValue - jB2));
                    long j = playbackInfoF.f17184p;
                    if (playbackInfoF.k.equals(playbackInfoF.f17177b)) {
                        j = jLongValue + jMax;
                    }
                    playbackInfoB = playbackInfoF.b(mediaPeriodId2, jLongValue, jLongValue, jLongValue, jMax, playbackInfoF.f17180h, playbackInfoF.f17181i, playbackInfoF.j);
                    playbackInfoB.f17184p = j;
                }
                playbackInfoA = playbackInfoB;
            }
        }
        ShuffleOrder shuffleOrder = this.G;
        ExoPlayerImplInternal exoPlayerImplInternal = this.j;
        exoPlayerImplInternal.getClass();
        exoPlayerImplInternal.i0.obtainMessage(18, iMin, 0, new ExoPlayerImplInternal.MediaSourceListUpdateMessage(arrayList, shuffleOrder)).a();
        x(playbackInfoA, 0, 1, false, 5, -9223372036854775807L);
    }

    @Override // com.google.android.exoplayer2.Player
    public final boolean isPlayingAd() {
        z();
        return this.a0.f17177b.a();
    }

    public final MediaMetadata j() {
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            return this.Z;
        }
        MediaItem mediaItem = currentTimeline.m(f(), this.f16995a, 0L).Z;
        MediaMetadata.Builder builderA = this.Z.a();
        MediaMetadata mediaMetadata = mediaItem.e0;
        builderA.getClass();
        if (mediaMetadata != null) {
            CharSequence charSequence = mediaMetadata.X;
            if (charSequence != null) {
                builderA.f17125a = charSequence;
            }
            CharSequence charSequence2 = mediaMetadata.f17120Y;
            if (charSequence2 != null) {
                builderA.f17126b = charSequence2;
            }
            CharSequence charSequence3 = mediaMetadata.Z;
            if (charSequence3 != null) {
                builderA.f17127c = charSequence3;
            }
            CharSequence charSequence4 = mediaMetadata.e0;
            if (charSequence4 != null) {
                builderA.d = charSequence4;
            }
            CharSequence charSequence5 = mediaMetadata.f0;
            if (charSequence5 != null) {
                builderA.f17128e = charSequence5;
            }
            CharSequence charSequence6 = mediaMetadata.g0;
            if (charSequence6 != null) {
                builderA.f = charSequence6;
            }
            CharSequence charSequence7 = mediaMetadata.h0;
            if (charSequence7 != null) {
                builderA.g = charSequence7;
            }
            Rating rating = mediaMetadata.i0;
            if (rating != null) {
                builderA.f17129h = rating;
            }
            Rating rating2 = mediaMetadata.j0;
            if (rating2 != null) {
                builderA.f17130i = rating2;
            }
            byte[] bArr = mediaMetadata.k0;
            if (bArr != null) {
                builderA.j = (byte[]) bArr.clone();
                builderA.k = mediaMetadata.l0;
            }
            Uri uri = mediaMetadata.m0;
            if (uri != null) {
                builderA.f17131l = uri;
            }
            Integer num = mediaMetadata.n0;
            if (num != null) {
                builderA.m = num;
            }
            Integer num2 = mediaMetadata.o0;
            if (num2 != null) {
                builderA.f17132n = num2;
            }
            Integer num3 = mediaMetadata.p0;
            if (num3 != null) {
                builderA.o = num3;
            }
            Boolean bool = mediaMetadata.q0;
            if (bool != null) {
                builderA.f17133p = bool;
            }
            Boolean bool2 = mediaMetadata.r0;
            if (bool2 != null) {
                builderA.q = bool2;
            }
            Integer num4 = mediaMetadata.s0;
            if (num4 != null) {
                builderA.r = num4;
            }
            Integer num5 = mediaMetadata.t0;
            if (num5 != null) {
                builderA.r = num5;
            }
            Integer num6 = mediaMetadata.u0;
            if (num6 != null) {
                builderA.s = num6;
            }
            Integer num7 = mediaMetadata.v0;
            if (num7 != null) {
                builderA.t = num7;
            }
            Integer num8 = mediaMetadata.w0;
            if (num8 != null) {
                builderA.f17134u = num8;
            }
            Integer num9 = mediaMetadata.x0;
            if (num9 != null) {
                builderA.v = num9;
            }
            Integer num10 = mediaMetadata.y0;
            if (num10 != null) {
                builderA.f17135w = num10;
            }
            CharSequence charSequence8 = mediaMetadata.z0;
            if (charSequence8 != null) {
                builderA.x = charSequence8;
            }
            CharSequence charSequence9 = mediaMetadata.A0;
            if (charSequence9 != null) {
                builderA.y = charSequence9;
            }
            CharSequence charSequence10 = mediaMetadata.B0;
            if (charSequence10 != null) {
                builderA.f17136z = charSequence10;
            }
            Integer num11 = mediaMetadata.C0;
            if (num11 != null) {
                builderA.f17121A = num11;
            }
            Integer num12 = mediaMetadata.D0;
            if (num12 != null) {
                builderA.f17122B = num12;
            }
            CharSequence charSequence11 = mediaMetadata.E0;
            if (charSequence11 != null) {
                builderA.C = charSequence11;
            }
            CharSequence charSequence12 = mediaMetadata.F0;
            if (charSequence12 != null) {
                builderA.D = charSequence12;
            }
            CharSequence charSequence13 = mediaMetadata.G0;
            if (charSequence13 != null) {
                builderA.f17123E = charSequence13;
            }
            Integer num13 = mediaMetadata.H0;
            if (num13 != null) {
                builderA.f17124F = num13;
            }
            Bundle bundle = mediaMetadata.I0;
            if (bundle != null) {
                builderA.G = bundle;
            }
        }
        return new MediaMetadata(builderA);
    }

    public final PlayerMessage l(PlayerMessage.Target target) {
        int iN = n();
        Timeline timeline = this.a0.f17176a;
        if (iN == -1) {
            iN = 0;
        }
        ExoPlayerImplInternal exoPlayerImplInternal = this.j;
        return new PlayerMessage(exoPlayerImplInternal, target, timeline, iN, this.t, exoPlayerImplInternal.k0);
    }

    public final long m(PlaybackInfo playbackInfo) {
        if (playbackInfo.f17176a.p()) {
            return Util.B(this.f17049c0);
        }
        if (playbackInfo.f17177b.a()) {
            return playbackInfo.r;
        }
        Timeline timeline = playbackInfo.f17176a;
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.f17177b;
        long j = playbackInfo.r;
        Object obj = mediaPeriodId.f18347a;
        Timeline.Period period = this.m;
        timeline.g(obj, period);
        return j + period.f0;
    }

    public final int n() {
        if (this.a0.f17176a.p()) {
            return this.f17047b0;
        }
        PlaybackInfo playbackInfo = this.a0;
        return playbackInfo.f17176a.g(playbackInfo.f17177b.f18347a, this.m).Z;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void prepare() {
        z();
        boolean playWhenReady = getPlayWhenReady();
        int iC = this.x.c(2, playWhenReady);
        w(iC, (!playWhenReady || iC == 1) ? 1 : 2, playWhenReady);
        PlaybackInfo playbackInfo = this.a0;
        if (playbackInfo.f17179e != 1) {
            return;
        }
        PlaybackInfo playbackInfoD = playbackInfo.d(null);
        PlaybackInfo playbackInfoE = playbackInfoD.e(playbackInfoD.f17176a.p() ? 4 : 2);
        this.C++;
        this.j.i0.obtainMessage(0).a();
        x(playbackInfoE, 1, 1, false, 5, -9223372036854775807L);
    }

    public final Pair q(Timeline timeline, int i2, long j) {
        if (timeline.p()) {
            this.f17047b0 = i2;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.f17049c0 = j;
            return null;
        }
        if (i2 == -1 || i2 >= ((PlaylistTimeline) timeline).f0) {
            i2 = timeline.a(false);
            Timeline.Window window = this.f16995a;
            timeline.m(i2, window, 0L);
            j = Util.J(window.m0);
        }
        return timeline.i(this.f16995a, this.m, i2, Util.B(j));
    }

    public final void r(final int i2, final int i3) {
        Size size = this.f17042R;
        if (i2 == size.f18964a && i3 == size.f18965b) {
            return;
        }
        this.f17042R = new Size(i2, i3);
        this.k.e(24, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.i
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                int i4 = ExoPlayerImpl.f17032d0;
                ((Player.Listener) obj).onSurfaceSizeChanged(i2, i3);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player
    public final void release() {
        String str;
        boolean z2;
        AudioTrack audioTrack;
        int i2 = 0;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [ExoPlayerLib/2.18.7] [");
        sb.append(Util.f18982e);
        sb.append("] [");
        HashSet hashSet = ExoPlayerLibraryInfo.f17074a;
        synchronized (ExoPlayerLibraryInfo.class) {
            str = ExoPlayerLibraryInfo.f17075b;
        }
        sb.append(str);
        sb.append(d9.i.f24752e);
        Log.f("ExoPlayerImpl", sb.toString());
        z();
        if (Util.f18979a < 21 && (audioTrack = this.K) != null) {
            audioTrack.release();
            this.K = null;
        }
        this.f17057w.a();
        StreamVolumeManager streamVolumeManager = this.y;
        StreamVolumeManager.VolumeChangeReceiver volumeChangeReceiver = streamVolumeManager.f17204e;
        if (volumeChangeReceiver != null) {
            try {
                streamVolumeManager.f17201a.unregisterReceiver(volumeChangeReceiver);
            } catch (RuntimeException e2) {
                Log.h("StreamVolumeManager", "Error unregistering stream volume receiver", e2);
            }
            streamVolumeManager.f17204e = null;
        }
        this.f17058z.getClass();
        this.f17033A.getClass();
        AudioFocusManager audioFocusManager = this.x;
        audioFocusManager.f16992c = null;
        audioFocusManager.a();
        ExoPlayerImplInternal exoPlayerImplInternal = this.j;
        synchronized (exoPlayerImplInternal) {
            if (exoPlayerImplInternal.A0 || !exoPlayerImplInternal.k0.getThread().isAlive()) {
                z2 = true;
            } else {
                exoPlayerImplInternal.i0.sendEmptyMessage(7);
                exoPlayerImplInternal.g0(new o(exoPlayerImplInternal, i2), exoPlayerImplInternal.w0);
                z2 = exoPlayerImplInternal.A0;
            }
        }
        if (!z2) {
            this.k.e(10, new d(i2));
        }
        this.k.d();
        this.f17052i.b();
        this.s.b(this.q);
        PlaybackInfo playbackInfoE = this.a0.e(1);
        this.a0 = playbackInfoE;
        PlaybackInfo playbackInfoA = playbackInfoE.a(playbackInfoE.f17177b);
        this.a0 = playbackInfoA;
        playbackInfoA.f17184p = playbackInfoA.r;
        this.a0.q = 0L;
        this.q.release();
        this.f17051h.b();
        s();
        Surface surface = this.M;
        if (surface != null) {
            surface.release();
            this.M = null;
        }
        int i3 = CueGroup.f18463Y;
    }

    public final void s() {
        if (this.O == null) {
            SurfaceHolder surfaceHolder = this.f17039N;
            if (surfaceHolder != null) {
                surfaceHolder.removeCallback(this.f17056u);
                this.f17039N = null;
                return;
            }
            return;
        }
        PlayerMessage playerMessageL = l(this.v);
        Assertions.d(!playerMessageL.g);
        playerMessageL.d = 10000;
        Assertions.d(!playerMessageL.g);
        playerMessageL.f17192e = null;
        playerMessageL.c();
        this.O.getClass();
        throw null;
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setPlayWhenReady(boolean z2) {
        z();
        int iC = this.x.c(getPlaybackState(), z2);
        int i2 = 1;
        if (z2 && iC != 1) {
            i2 = 2;
        }
        w(iC, i2, z2);
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setVideoSurfaceView(SurfaceView surfaceView) {
        z();
        boolean z2 = surfaceView instanceof VideoDecoderOutputBufferRenderer;
        ComponentListener componentListener = this.f17056u;
        if (z2) {
            s();
            u(surfaceView);
            SurfaceHolder holder = surfaceView.getHolder();
            this.f17040P = false;
            this.f17039N = holder;
            holder.addCallback(componentListener);
            Surface surface = this.f17039N.getSurface();
            if (surface == null || !surface.isValid()) {
                r(0, 0);
                return;
            } else {
                Rect surfaceFrame = this.f17039N.getSurfaceFrame();
                r(surfaceFrame.width(), surfaceFrame.height());
                return;
            }
        }
        if (surfaceView instanceof SphericalGLSurfaceView) {
            s();
            this.O = (SphericalGLSurfaceView) surfaceView;
            PlayerMessage playerMessageL = l(this.v);
            Assertions.d(!playerMessageL.g);
            playerMessageL.d = 10000;
            SphericalGLSurfaceView sphericalGLSurfaceView = this.O;
            Assertions.d(!playerMessageL.g);
            playerMessageL.f17192e = sphericalGLSurfaceView;
            playerMessageL.c();
            this.O.getClass();
            throw null;
        }
        SurfaceHolder holder2 = surfaceView == null ? null : surfaceView.getHolder();
        z();
        if (holder2 == null) {
            z();
            s();
            u(null);
            r(0, 0);
            return;
        }
        s();
        this.f17040P = true;
        this.f17039N = holder2;
        holder2.addCallback(componentListener);
        Surface surface2 = holder2.getSurface();
        if (surface2 == null || !surface2.isValid()) {
            u(null);
            r(0, 0);
        } else {
            u(surface2);
            Rect surfaceFrame2 = holder2.getSurfaceFrame();
            r(surfaceFrame2.width(), surfaceFrame2.height());
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final void setVolume(float f) {
        z();
        final float fI = Util.i(f, 0.0f, 1.0f);
        if (this.f17043U == fI) {
            return;
        }
        this.f17043U = fI;
        t(1, 2, Float.valueOf(this.x.f16993e * fI));
        this.k.e(22, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.g
            @Override // com.google.android.exoplayer2.util.ListenerSet.Event
            public final void invoke(Object obj) {
                int i2 = ExoPlayerImpl.f17032d0;
                ((Player.Listener) obj).onVolumeChanged(fI);
            }
        });
    }

    @Override // com.google.android.exoplayer2.Player
    public final void stop() {
        z();
        z();
        this.x.c(1, getPlayWhenReady());
        v(null);
        new CueGroup(ImmutableList.x(), this.a0.r);
    }

    public final void t(int i2, int i3, Object obj) {
        for (Renderer renderer : this.g) {
            if (renderer.getTrackType() == i2) {
                PlayerMessage playerMessageL = l(renderer);
                Assertions.d(!playerMessageL.g);
                playerMessageL.d = i3;
                Assertions.d(!playerMessageL.g);
                playerMessageL.f17192e = obj;
                playerMessageL.c();
            }
        }
    }

    public final void u(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (Renderer renderer : this.g) {
            if (renderer.getTrackType() == 2) {
                PlayerMessage playerMessageL = l(renderer);
                Assertions.d(!playerMessageL.g);
                playerMessageL.d = 1;
                Assertions.d(true ^ playerMessageL.g);
                playerMessageL.f17192e = obj;
                playerMessageL.c();
                arrayList.add(playerMessageL);
            }
        }
        Object obj2 = this.L;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((PlayerMessage) it.next()).a(this.f17034B);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z2 = true;
            }
            Object obj3 = this.L;
            Surface surface = this.M;
            if (obj3 == surface) {
                surface.release();
                this.M = null;
            }
        }
        this.L = obj;
        if (z2) {
            v(new ExoPlaybackException(2, new ExoTimeoutException("Detaching surface timed out."), 1003));
        }
    }

    public final void v(ExoPlaybackException exoPlaybackException) {
        PlaybackInfo playbackInfo = this.a0;
        PlaybackInfo playbackInfoA = playbackInfo.a(playbackInfo.f17177b);
        playbackInfoA.f17184p = playbackInfoA.r;
        playbackInfoA.q = 0L;
        PlaybackInfo playbackInfoE = playbackInfoA.e(1);
        if (exoPlaybackException != null) {
            playbackInfoE = playbackInfoE.d(exoPlaybackException);
        }
        PlaybackInfo playbackInfo2 = playbackInfoE;
        this.C++;
        this.j.i0.obtainMessage(6).a();
        x(playbackInfo2, 0, 1, playbackInfo2.f17176a.p() && !this.a0.f17176a.p(), 4, m(playbackInfo2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void w(int i2, int i3, boolean z2) {
        int i4 = 0;
        ?? r14 = (!z2 || i2 == -1) ? 0 : 1;
        if (r14 != 0 && i2 != 1) {
            i4 = 1;
        }
        PlaybackInfo playbackInfo = this.a0;
        if (playbackInfo.f17182l == r14 && playbackInfo.m == i4) {
            return;
        }
        this.C++;
        PlaybackInfo playbackInfoC = playbackInfo.c(i4, r14);
        this.j.i0.e(r14, i4).a();
        x(playbackInfoC, 0, i3, false, 5, -9223372036854775807L);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:104:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:107:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:108:0x0306  */
    /* JADX WARN: Code duplicated, block: B:110:0x0309  */
    /* JADX WARN: Code duplicated, block: B:112:0x0319  */
    /* JADX WARN: Code duplicated, block: B:115:0x032a  */
    /* JADX WARN: Code duplicated, block: B:117:0x0338  */
    /* JADX WARN: Code duplicated, block: B:119:0x0346  */
    /* JADX WARN: Code duplicated, block: B:122:0x035a  */
    /* JADX WARN: Code duplicated, block: B:125:0x0370  */
    /* JADX WARN: Code duplicated, block: B:128:0x0388  */
    /* JADX WARN: Code duplicated, block: B:134:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:137:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:139:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:141:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:142:0x03de  */
    /* JADX WARN: Code duplicated, block: B:145:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:147:0x03ed  */
    /* JADX WARN: Code duplicated, block: B:149:0x0400  */
    /* JADX WARN: Code duplicated, block: B:150:0x0402  */
    /* JADX WARN: Code duplicated, block: B:153:0x040d  */
    /* JADX WARN: Code duplicated, block: B:155:0x0420  */
    /* JADX WARN: Code duplicated, block: B:156:0x0422  */
    /* JADX WARN: Code duplicated, block: B:160:0x042e  */
    /* JADX WARN: Code duplicated, block: B:163:0x0440  */
    /* JADX WARN: Code duplicated, block: B:167:0x0460 A[LOOP:0: B:165:0x0458->B:167:0x0460, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:170:0x0476 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:173:0x047c  */
    /* JADX WARN: Code duplicated, block: B:176:0x0483 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:179:0x0489  */
    /* JADX WARN: Code duplicated, block: B:182:0x0490 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x049c  */
    /* JADX WARN: Code duplicated, block: B:191:0x04a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:194:0x04aa  */
    /* JADX WARN: Code duplicated, block: B:197:0x04b1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:202:0x04bc  */
    /* JADX WARN: Code duplicated, block: B:205:0x04c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:208:0x04d0  */
    /* JADX WARN: Code duplicated, block: B:211:0x04d7 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:214:0x04de  */
    /* JADX WARN: Code duplicated, block: B:217:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:220:0x0506  */
    /* JADX WARN: Code duplicated, block: B:223:0x0512 A[LOOP:1: B:221:0x050c->B:223:0x0512, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:224:0x051c A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:37:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:43:0x0108  */
    /* JADX WARN: Code duplicated, block: B:46:0x0118  */
    /* JADX WARN: Code duplicated, block: B:49:0x0127 A[LOOP:3: B:47:0x0122->B:49:0x0127, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0153  */
    /* JADX WARN: Code duplicated, block: B:55:0x0156  */
    /* JADX WARN: Code duplicated, block: B:58:0x015e  */
    /* JADX WARN: Code duplicated, block: B:59:0x0161  */
    /* JADX WARN: Code duplicated, block: B:62:0x0167  */
    /* JADX WARN: Code duplicated, block: B:65:0x0170  */
    /* JADX WARN: Code duplicated, block: B:66:0x0173  */
    /* JADX WARN: Code duplicated, block: B:68:0x0177  */
    /* JADX WARN: Code duplicated, block: B:70:0x0187  */
    /* JADX WARN: Code duplicated, block: B:72:0x0194  */
    /* JADX WARN: Code duplicated, block: B:73:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:80:0x01f6  */
    /* JADX WARN: Code duplicated, block: B:82:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:84:0x0204  */
    /* JADX WARN: Code duplicated, block: B:86:0x020c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0213  */
    /* JADX WARN: Code duplicated, block: B:90:0x023f  */
    /* JADX WARN: Code duplicated, block: B:91:0x026d  */
    /* JADX WARN: Code duplicated, block: B:94:0x0285  */
    /* JADX WARN: Code duplicated, block: B:95:0x0292  */
    /* JADX WARN: Code duplicated, block: B:97:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:99:0x02bc  */
    public final void x(final PlaybackInfo playbackInfo, final int i2, final int i3, boolean z2, final int i4, long j) {
        int i5;
        int i6;
        Pair pair;
        int i7;
        boolean zBooleanValue;
        final int iIntValue;
        MediaMetadata mediaMetadataJ;
        final MediaItem mediaItem;
        MediaMetadata.Builder builderA;
        List list;
        int i8;
        int i9;
        Metadata metadata;
        int i10;
        Metadata.Entry[] entryArr;
        boolean zEquals;
        int i11;
        int i12;
        int i13;
        TrackSelectorResult trackSelectorResult;
        TrackSelectorResult trackSelectorResult2;
        final int i14;
        Player.Commands commands;
        ExoPlayerImpl exoPlayerImpl;
        Timeline currentTimeline;
        boolean z3;
        Timeline currentTimeline2;
        int iK;
        boolean z4;
        Timeline currentTimeline3;
        boolean z5;
        int iE;
        boolean z6;
        Timeline currentTimeline4;
        PlaybackInfo playbackInfo2;
        Timeline currentTimeline5;
        boolean z7;
        boolean zP;
        FlagSet flagSet;
        FlagSet.Builder builder;
        int i15;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Player.Commands commandsB;
        Iterator it;
        Timeline.Period period;
        Object obj;
        int i16;
        MediaItem mediaItem2;
        Object obj2;
        int i17;
        long j2;
        long j3;
        long jO;
        long jO2;
        int iF;
        Object obj3;
        MediaItem mediaItem3;
        Object obj4;
        int i18;
        long J2;
        long J3;
        int i19 = 1;
        PlaybackInfo playbackInfo3 = this.a0;
        this.a0 = playbackInfo;
        boolean zEquals2 = playbackInfo3.f17176a.equals(playbackInfo.f17176a);
        Timeline timeline = playbackInfo3.f17176a;
        Timeline timeline2 = playbackInfo.f17176a;
        if (!timeline2.p() || !timeline.p()) {
            i5 = 3;
            if (timeline2.p() != timeline.p()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else {
                MediaSource.MediaPeriodId mediaPeriodId = playbackInfo3.f17177b;
                Object obj5 = mediaPeriodId.f18347a;
                Timeline.Period period2 = this.m;
                int i20 = timeline.g(obj5, period2).Z;
                Timeline.Window window = this.f16995a;
                Object obj6 = timeline.m(i20, window, 0L).X;
                MediaSource.MediaPeriodId mediaPeriodId2 = playbackInfo.f17177b;
                i6 = 0;
                if (obj6.equals(timeline2.m(timeline2.g(mediaPeriodId2.f18347a, period2).Z, window, 0L).X)) {
                    pair = (z2 && i4 == 0 && mediaPeriodId.d < mediaPeriodId2.d) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
                } else {
                    if (z2 && i4 == 0) {
                        i7 = 1;
                    } else if (z2 && i4 == 1) {
                        i7 = 2;
                    } else {
                        if (zEquals2) {
                            throw new IllegalStateException();
                        }
                        i7 = 3;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i7));
                }
            }
            zBooleanValue = ((Boolean) pair.first).booleanValue();
            iIntValue = ((Integer) pair.second).intValue();
            mediaMetadataJ = this.f17037I;
            if (zBooleanValue) {
                if (playbackInfo.f17176a.p()) {
                    mediaItem = null;
                } else {
                    mediaItem = playbackInfo.f17176a.m(playbackInfo.f17176a.g(playbackInfo.f17177b.f18347a, this.m).Z, this.f16995a, 0L).Z;
                }
                this.Z = MediaMetadata.J0;
            } else {
                mediaItem = null;
            }
            if (zBooleanValue && playbackInfo3.j.equals(playbackInfo.j)) {
                i9 = 1;
            } else {
                builderA = this.Z.a();
                list = playbackInfo.j;
                i8 = i6;
                while (i8 < list.size()) {
                    metadata = (Metadata) list.get(i8);
                    int i21 = i19;
                    i10 = i6;
                    while (true) {
                        entryArr = metadata.X;
                        if (i10 < entryArr.length) {
                            entryArr[i10].l(builderA);
                            i10++;
                        }
                    }
                    i8++;
                    i19 = i21;
                }
                i9 = i19;
                this.Z = new MediaMetadata(builderA);
                mediaMetadataJ = j();
            }
            zEquals = mediaMetadataJ.equals(this.f17037I);
            this.f17037I = mediaMetadataJ;
            if (playbackInfo3.f17182l != playbackInfo.f17182l) {
                i11 = i9;
            } else {
                i11 = i6;
            }
            if (playbackInfo3.f17179e != playbackInfo.f17179e) {
                i12 = i9;
            } else {
                i12 = i6;
            }
            if (i12 == 0 || i11 != 0) {
                y();
            }
            if (playbackInfo3.g != playbackInfo.g) {
                i13 = i9;
            } else {
                i13 = i6;
            }
            if (!zEquals2) {
                final int i22 = i6;
                this.k.c(i22, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.k
                    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                    public final void invoke(Object obj7) {
                        int i23 = i2;
                        Object obj8 = playbackInfo;
                        Player.Listener listener = (Player.Listener) obj7;
                        switch (i22) {
                            case 0:
                                int i24 = ExoPlayerImpl.f17032d0;
                                listener.onTimelineChanged(((PlaybackInfo) obj8).f17176a, i23);
                                break;
                            case 1:
                                int i25 = ExoPlayerImpl.f17032d0;
                                listener.onPlayWhenReadyChanged(((PlaybackInfo) obj8).f17182l, i23);
                                break;
                            default:
                                int i26 = ExoPlayerImpl.f17032d0;
                                listener.onMediaItemTransition((MediaItem) obj8, i23);
                                break;
                        }
                    }
                });
            }
            if (z2) {
                period = new Timeline.Period();
                if (playbackInfo3.f17176a.p()) {
                    obj = null;
                    i16 = -1;
                    mediaItem2 = null;
                    obj2 = null;
                    i17 = -1;
                } else {
                    Object obj7 = playbackInfo3.f17177b.f18347a;
                    playbackInfo3.f17176a.g(obj7, period);
                    int i23 = period.Z;
                    int iB = playbackInfo3.f17176a.b(obj7);
                    obj = playbackInfo3.f17176a.m(i23, this.f16995a, 0L).X;
                    mediaItem2 = this.f16995a.Z;
                    obj2 = obj7;
                    i16 = i23;
                    i17 = iB;
                }
                if (i4 == 0) {
                    if (playbackInfo3.f17177b.a()) {
                        MediaSource.MediaPeriodId mediaPeriodId3 = playbackInfo3.f17177b;
                        jO = period.a(mediaPeriodId3.f18348b, mediaPeriodId3.f18349c);
                        jO2 = o(playbackInfo3);
                    } else {
                        if (playbackInfo3.f17177b.f18350e != -1) {
                            jO = o(this.a0);
                        } else {
                            j2 = period.f0;
                            j3 = period.e0;
                            jO = j2 + j3;
                        }
                        jO2 = jO;
                    }
                } else if (playbackInfo3.f17177b.a()) {
                    jO = playbackInfo3.r;
                    jO2 = o(playbackInfo3);
                } else {
                    j2 = period.f0;
                    j3 = playbackInfo3.r;
                    jO = j2 + j3;
                    jO2 = jO;
                }
                long J4 = Util.J(jO);
                long J5 = Util.J(jO2);
                MediaSource.MediaPeriodId mediaPeriodId4 = playbackInfo3.f17177b;
                final Player.PositionInfo positionInfo = new Player.PositionInfo(obj, i16, mediaItem2, obj2, i17, J4, J5, mediaPeriodId4.f18348b, mediaPeriodId4.f18349c);
                iF = f();
                if (this.a0.f17176a.p()) {
                    obj3 = null;
                    mediaItem3 = null;
                    obj4 = null;
                    i18 = -1;
                } else {
                    PlaybackInfo playbackInfo4 = this.a0;
                    Object obj8 = playbackInfo4.f17177b.f18347a;
                    playbackInfo4.f17176a.g(obj8, this.m);
                    int iB2 = this.a0.f17176a.b(obj8);
                    Timeline timeline3 = this.a0.f17176a;
                    Timeline.Window window2 = this.f16995a;
                    i18 = iB2;
                    obj4 = obj8;
                    obj3 = timeline3.m(iF, window2, 0L).X;
                    mediaItem3 = window2.Z;
                }
                J2 = Util.J(j);
                if (this.a0.f17177b.a()) {
                    J3 = Util.J(o(this.a0));
                } else {
                    J3 = J2;
                }
                MediaSource.MediaPeriodId mediaPeriodId5 = this.a0.f17177b;
                final Player.PositionInfo positionInfo2 = new Player.PositionInfo(obj3, iF, mediaItem3, obj4, i18, J2, J3, mediaPeriodId5.f18348b, mediaPeriodId5.f18349c);
                this.k.c(11, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.l
                    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                    public final void invoke(Object obj9) {
                        Player.Listener listener = (Player.Listener) obj9;
                        int i24 = ExoPlayerImpl.f17032d0;
                        int i25 = i4;
                        listener.onPositionDiscontinuity(i25);
                        listener.onPositionDiscontinuity(positionInfo, positionInfo2, i25);
                    }
                });
            } else {
                zBooleanValue = zBooleanValue;
                zEquals = zEquals;
                i11 = i11;
            }
            if (zBooleanValue) {
                final int i24 = 2;
                this.k.c(i9, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.k
                    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                    public final void invoke(Object obj9) {
                        int i25 = iIntValue;
                        Object obj10 = mediaItem;
                        Player.Listener listener = (Player.Listener) obj9;
                        switch (i24) {
                            case 0:
                                int i26 = ExoPlayerImpl.f17032d0;
                                listener.onTimelineChanged(((PlaybackInfo) obj10).f17176a, i25);
                                break;
                            case 1:
                                int i27 = ExoPlayerImpl.f17032d0;
                                listener.onPlayWhenReadyChanged(((PlaybackInfo) obj10).f17182l, i25);
                                break;
                            default:
                                int i28 = ExoPlayerImpl.f17032d0;
                                listener.onMediaItemTransition((MediaItem) obj10, i25);
                                break;
                        }
                    }
                });
            }
            if (playbackInfo3.f != playbackInfo.f) {
                final int i25 = 7;
                this.k.c(10, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.e
                    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                    public final void invoke(Object obj9) {
                        PlaybackInfo playbackInfo5 = playbackInfo;
                        Player.Listener listener = (Player.Listener) obj9;
                        switch (i25) {
                            case 0:
                                int i26 = ExoPlayerImpl.f17032d0;
                                listener.onTracksChanged(playbackInfo5.f17181i.d);
                                break;
                            case 1:
                                int i27 = ExoPlayerImpl.f17032d0;
                                listener.onLoadingChanged(playbackInfo5.g);
                                listener.onIsLoadingChanged(playbackInfo5.g);
                                break;
                            case 2:
                                int i28 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerStateChanged(playbackInfo5.f17182l, playbackInfo5.f17179e);
                                break;
                            case 3:
                                int i29 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackStateChanged(playbackInfo5.f17179e);
                                break;
                            case 4:
                                int i30 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackSuppressionReasonChanged(playbackInfo5.m);
                                break;
                            case 5:
                                listener.onIsPlayingChanged(ExoPlayerImpl.p(playbackInfo5));
                                break;
                            case 6:
                                int i31 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackParametersChanged(playbackInfo5.f17183n);
                                break;
                            case 7:
                                int i32 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerErrorChanged(playbackInfo5.f);
                                break;
                            default:
                                int i33 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerError(playbackInfo5.f);
                                break;
                        }
                    }
                });
                if (playbackInfo.f != null) {
                    final int i26 = 8;
                    this.k.c(10, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.e
                        @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                        public final void invoke(Object obj9) {
                            PlaybackInfo playbackInfo5 = playbackInfo;
                            Player.Listener listener = (Player.Listener) obj9;
                            switch (i26) {
                                case 0:
                                    int i27 = ExoPlayerImpl.f17032d0;
                                    listener.onTracksChanged(playbackInfo5.f17181i.d);
                                    break;
                                case 1:
                                    int i28 = ExoPlayerImpl.f17032d0;
                                    listener.onLoadingChanged(playbackInfo5.g);
                                    listener.onIsLoadingChanged(playbackInfo5.g);
                                    break;
                                case 2:
                                    int i29 = ExoPlayerImpl.f17032d0;
                                    listener.onPlayerStateChanged(playbackInfo5.f17182l, playbackInfo5.f17179e);
                                    break;
                                case 3:
                                    int i210 = ExoPlayerImpl.f17032d0;
                                    listener.onPlaybackStateChanged(playbackInfo5.f17179e);
                                    break;
                                case 4:
                                    int i30 = ExoPlayerImpl.f17032d0;
                                    listener.onPlaybackSuppressionReasonChanged(playbackInfo5.m);
                                    break;
                                case 5:
                                    listener.onIsPlayingChanged(ExoPlayerImpl.p(playbackInfo5));
                                    break;
                                case 6:
                                    int i31 = ExoPlayerImpl.f17032d0;
                                    listener.onPlaybackParametersChanged(playbackInfo5.f17183n);
                                    break;
                                case 7:
                                    int i32 = ExoPlayerImpl.f17032d0;
                                    listener.onPlayerErrorChanged(playbackInfo5.f);
                                    break;
                                default:
                                    int i33 = ExoPlayerImpl.f17032d0;
                                    listener.onPlayerError(playbackInfo5.f);
                                    break;
                            }
                        }
                    });
                }
            }
            trackSelectorResult = playbackInfo3.f17181i;
            trackSelectorResult2 = playbackInfo.f17181i;
            if (trackSelectorResult != trackSelectorResult2) {
                this.f17051h.a(trackSelectorResult2.f18712e);
                i14 = 0;
                this.k.c(2, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.e
                    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                    public final void invoke(Object obj9) {
                        PlaybackInfo playbackInfo5 = playbackInfo;
                        Player.Listener listener = (Player.Listener) obj9;
                        switch (i14) {
                            case 0:
                                int i27 = ExoPlayerImpl.f17032d0;
                                listener.onTracksChanged(playbackInfo5.f17181i.d);
                                break;
                            case 1:
                                int i28 = ExoPlayerImpl.f17032d0;
                                listener.onLoadingChanged(playbackInfo5.g);
                                listener.onIsLoadingChanged(playbackInfo5.g);
                                break;
                            case 2:
                                int i29 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerStateChanged(playbackInfo5.f17182l, playbackInfo5.f17179e);
                                break;
                            case 3:
                                int i210 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackStateChanged(playbackInfo5.f17179e);
                                break;
                            case 4:
                                int i30 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackSuppressionReasonChanged(playbackInfo5.m);
                                break;
                            case 5:
                                listener.onIsPlayingChanged(ExoPlayerImpl.p(playbackInfo5));
                                break;
                            case 6:
                                int i31 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackParametersChanged(playbackInfo5.f17183n);
                                break;
                            case 7:
                                int i32 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerErrorChanged(playbackInfo5.f);
                                break;
                            default:
                                int i33 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerError(playbackInfo5.f);
                                break;
                        }
                    }
                });
            } else {
                i14 = 0;
            }
            if (!zEquals) {
                this.k.c(14, new f(this.f17037I, i14));
            }
            if (i13 != 0) {
                final int i27 = 1;
                this.k.c(i5, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.e
                    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                    public final void invoke(Object obj9) {
                        PlaybackInfo playbackInfo5 = playbackInfo;
                        Player.Listener listener = (Player.Listener) obj9;
                        switch (i27) {
                            case 0:
                                int i28 = ExoPlayerImpl.f17032d0;
                                listener.onTracksChanged(playbackInfo5.f17181i.d);
                                break;
                            case 1:
                                int i29 = ExoPlayerImpl.f17032d0;
                                listener.onLoadingChanged(playbackInfo5.g);
                                listener.onIsLoadingChanged(playbackInfo5.g);
                                break;
                            case 2:
                                int i210 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerStateChanged(playbackInfo5.f17182l, playbackInfo5.f17179e);
                                break;
                            case 3:
                                int i211 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackStateChanged(playbackInfo5.f17179e);
                                break;
                            case 4:
                                int i30 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackSuppressionReasonChanged(playbackInfo5.m);
                                break;
                            case 5:
                                listener.onIsPlayingChanged(ExoPlayerImpl.p(playbackInfo5));
                                break;
                            case 6:
                                int i31 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackParametersChanged(playbackInfo5.f17183n);
                                break;
                            case 7:
                                int i32 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerErrorChanged(playbackInfo5.f);
                                break;
                            default:
                                int i33 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerError(playbackInfo5.f);
                                break;
                        }
                    }
                });
            }
            if (i12 == 0 || i11 != 0) {
                final int i28 = 2;
                this.k.c(-1, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.e
                    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                    public final void invoke(Object obj9) {
                        PlaybackInfo playbackInfo5 = playbackInfo;
                        Player.Listener listener = (Player.Listener) obj9;
                        switch (i28) {
                            case 0:
                                int i29 = ExoPlayerImpl.f17032d0;
                                listener.onTracksChanged(playbackInfo5.f17181i.d);
                                break;
                            case 1:
                                int i210 = ExoPlayerImpl.f17032d0;
                                listener.onLoadingChanged(playbackInfo5.g);
                                listener.onIsLoadingChanged(playbackInfo5.g);
                                break;
                            case 2:
                                int i211 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerStateChanged(playbackInfo5.f17182l, playbackInfo5.f17179e);
                                break;
                            case 3:
                                int i212 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackStateChanged(playbackInfo5.f17179e);
                                break;
                            case 4:
                                int i30 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackSuppressionReasonChanged(playbackInfo5.m);
                                break;
                            case 5:
                                listener.onIsPlayingChanged(ExoPlayerImpl.p(playbackInfo5));
                                break;
                            case 6:
                                int i31 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackParametersChanged(playbackInfo5.f17183n);
                                break;
                            case 7:
                                int i32 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerErrorChanged(playbackInfo5.f);
                                break;
                            default:
                                int i33 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerError(playbackInfo5.f);
                                break;
                        }
                    }
                });
            }
            if (i12 != 0) {
                final int i29 = 3;
                this.k.c(4, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.e
                    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                    public final void invoke(Object obj9) {
                        PlaybackInfo playbackInfo5 = playbackInfo;
                        Player.Listener listener = (Player.Listener) obj9;
                        switch (i29) {
                            case 0:
                                int i210 = ExoPlayerImpl.f17032d0;
                                listener.onTracksChanged(playbackInfo5.f17181i.d);
                                break;
                            case 1:
                                int i211 = ExoPlayerImpl.f17032d0;
                                listener.onLoadingChanged(playbackInfo5.g);
                                listener.onIsLoadingChanged(playbackInfo5.g);
                                break;
                            case 2:
                                int i212 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerStateChanged(playbackInfo5.f17182l, playbackInfo5.f17179e);
                                break;
                            case 3:
                                int i213 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackStateChanged(playbackInfo5.f17179e);
                                break;
                            case 4:
                                int i30 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackSuppressionReasonChanged(playbackInfo5.m);
                                break;
                            case 5:
                                listener.onIsPlayingChanged(ExoPlayerImpl.p(playbackInfo5));
                                break;
                            case 6:
                                int i31 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackParametersChanged(playbackInfo5.f17183n);
                                break;
                            case 7:
                                int i32 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerErrorChanged(playbackInfo5.f);
                                break;
                            default:
                                int i33 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerError(playbackInfo5.f);
                                break;
                        }
                    }
                });
            }
            if (i11 != 0) {
                final int i30 = 1;
                this.k.c(5, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.k
                    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                    public final void invoke(Object obj9) {
                        int i210 = i3;
                        Object obj10 = playbackInfo;
                        Player.Listener listener = (Player.Listener) obj9;
                        switch (i30) {
                            case 0:
                                int i211 = ExoPlayerImpl.f17032d0;
                                listener.onTimelineChanged(((PlaybackInfo) obj10).f17176a, i210);
                                break;
                            case 1:
                                int i212 = ExoPlayerImpl.f17032d0;
                                listener.onPlayWhenReadyChanged(((PlaybackInfo) obj10).f17182l, i210);
                                break;
                            default:
                                int i213 = ExoPlayerImpl.f17032d0;
                                listener.onMediaItemTransition((MediaItem) obj10, i210);
                                break;
                        }
                    }
                });
            }
            if (playbackInfo3.m != playbackInfo.m) {
                final int i31 = 4;
                this.k.c(6, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.e
                    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                    public final void invoke(Object obj9) {
                        PlaybackInfo playbackInfo5 = playbackInfo;
                        Player.Listener listener = (Player.Listener) obj9;
                        switch (i31) {
                            case 0:
                                int i210 = ExoPlayerImpl.f17032d0;
                                listener.onTracksChanged(playbackInfo5.f17181i.d);
                                break;
                            case 1:
                                int i211 = ExoPlayerImpl.f17032d0;
                                listener.onLoadingChanged(playbackInfo5.g);
                                listener.onIsLoadingChanged(playbackInfo5.g);
                                break;
                            case 2:
                                int i212 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerStateChanged(playbackInfo5.f17182l, playbackInfo5.f17179e);
                                break;
                            case 3:
                                int i213 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackStateChanged(playbackInfo5.f17179e);
                                break;
                            case 4:
                                int i32 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackSuppressionReasonChanged(playbackInfo5.m);
                                break;
                            case 5:
                                listener.onIsPlayingChanged(ExoPlayerImpl.p(playbackInfo5));
                                break;
                            case 6:
                                int i33 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackParametersChanged(playbackInfo5.f17183n);
                                break;
                            case 7:
                                int i34 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerErrorChanged(playbackInfo5.f);
                                break;
                            default:
                                int i35 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerError(playbackInfo5.f);
                                break;
                        }
                    }
                });
            }
            if (p(playbackInfo3) != p(playbackInfo)) {
                final int i32 = 5;
                this.k.c(7, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.e
                    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                    public final void invoke(Object obj9) {
                        PlaybackInfo playbackInfo5 = playbackInfo;
                        Player.Listener listener = (Player.Listener) obj9;
                        switch (i32) {
                            case 0:
                                int i210 = ExoPlayerImpl.f17032d0;
                                listener.onTracksChanged(playbackInfo5.f17181i.d);
                                break;
                            case 1:
                                int i211 = ExoPlayerImpl.f17032d0;
                                listener.onLoadingChanged(playbackInfo5.g);
                                listener.onIsLoadingChanged(playbackInfo5.g);
                                break;
                            case 2:
                                int i212 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerStateChanged(playbackInfo5.f17182l, playbackInfo5.f17179e);
                                break;
                            case 3:
                                int i213 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackStateChanged(playbackInfo5.f17179e);
                                break;
                            case 4:
                                int i33 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackSuppressionReasonChanged(playbackInfo5.m);
                                break;
                            case 5:
                                listener.onIsPlayingChanged(ExoPlayerImpl.p(playbackInfo5));
                                break;
                            case 6:
                                int i34 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackParametersChanged(playbackInfo5.f17183n);
                                break;
                            case 7:
                                int i35 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerErrorChanged(playbackInfo5.f);
                                break;
                            default:
                                int i36 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerError(playbackInfo5.f);
                                break;
                        }
                    }
                });
            }
            if (!playbackInfo3.f17183n.equals(playbackInfo.f17183n)) {
                final int i33 = 6;
                this.k.c(12, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.e
                    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                    public final void invoke(Object obj9) {
                        PlaybackInfo playbackInfo5 = playbackInfo;
                        Player.Listener listener = (Player.Listener) obj9;
                        switch (i33) {
                            case 0:
                                int i210 = ExoPlayerImpl.f17032d0;
                                listener.onTracksChanged(playbackInfo5.f17181i.d);
                                break;
                            case 1:
                                int i211 = ExoPlayerImpl.f17032d0;
                                listener.onLoadingChanged(playbackInfo5.g);
                                listener.onIsLoadingChanged(playbackInfo5.g);
                                break;
                            case 2:
                                int i212 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerStateChanged(playbackInfo5.f17182l, playbackInfo5.f17179e);
                                break;
                            case 3:
                                int i213 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackStateChanged(playbackInfo5.f17179e);
                                break;
                            case 4:
                                int i34 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackSuppressionReasonChanged(playbackInfo5.m);
                                break;
                            case 5:
                                listener.onIsPlayingChanged(ExoPlayerImpl.p(playbackInfo5));
                                break;
                            case 6:
                                int i35 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackParametersChanged(playbackInfo5.f17183n);
                                break;
                            case 7:
                                int i36 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerErrorChanged(playbackInfo5.f);
                                break;
                            default:
                                int i37 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerError(playbackInfo5.f);
                                break;
                        }
                    }
                });
            }
            commands = this.H;
            int i34 = Util.f18979a;
            exoPlayerImpl = (ExoPlayerImpl) this.f;
            boolean zIsPlayingAd = exoPlayerImpl.isPlayingAd();
            currentTimeline = exoPlayerImpl.getCurrentTimeline();
            if (currentTimeline.p() && currentTimeline.m(exoPlayerImpl.f(), exoPlayerImpl.f16995a, 0L).h0) {
                z3 = true;
            } else {
                z3 = false;
            }
            currentTimeline2 = exoPlayerImpl.getCurrentTimeline();
            if (currentTimeline2.p()) {
                iK = -1;
            } else {
                int iF2 = exoPlayerImpl.f();
                exoPlayerImpl.getRepeatMode();
                iK = currentTimeline2.k(iF2, 0, exoPlayerImpl.getShuffleModeEnabled());
            }
            if (iK != -1) {
                z4 = true;
            } else {
                z4 = false;
            }
            currentTimeline3 = exoPlayerImpl.getCurrentTimeline();
            if (currentTimeline3.p()) {
                iE = -1;
                z5 = false;
            } else {
                int iF3 = exoPlayerImpl.f();
                exoPlayerImpl.getRepeatMode();
                z5 = false;
                iE = currentTimeline3.e(iF3, 0, exoPlayerImpl.getShuffleModeEnabled());
            }
            if (iE != -1) {
                z6 = true;
            } else {
                z6 = z5;
            }
            currentTimeline4 = exoPlayerImpl.getCurrentTimeline();
            if (!currentTimeline4.p()) {
                playbackInfo2 = playbackInfo3;
                boolean z15 = currentTimeline4.m(exoPlayerImpl.f(), exoPlayerImpl.f16995a, 0L).a();
                currentTimeline5 = exoPlayerImpl.getCurrentTimeline();
                if (currentTimeline5.p() && currentTimeline5.m(exoPlayerImpl.f(), exoPlayerImpl.f16995a, 0L).i0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                zP = exoPlayerImpl.getCurrentTimeline().p();
                Player.Commands.Builder builder2 = new Player.Commands.Builder();
                flagSet = this.f17048c.X;
                builder = builder2.f17186a;
                builder.getClass();
                for (i15 = 0; i15 < flagSet.f18903a.size(); i15++) {
                    builder.a(flagSet.a(i15));
                }
                boolean z16 = !zIsPlayingAd;
                builder2.a(4, z16);
                if (z3 || zIsPlayingAd) {
                    z8 = false;
                } else {
                    z8 = true;
                }
                builder2.a(5, z8);
                if (z4 || zIsPlayingAd) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                builder2.a(6, z9);
                if (!zP || (!(z4 || !z15 || z3) || zIsPlayingAd)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                builder2.a(7, z10);
                if (z6 || zIsPlayingAd) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                builder2.a(8, z11);
                if (!zP || (!(z6 || (z15 && z7)) || zIsPlayingAd)) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                builder2.a(9, z12);
                builder2.a(10, z16);
                if (z3 || zIsPlayingAd) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                builder2.a(11, z13);
                if (z3 || zIsPlayingAd) {
                    z14 = false;
                } else {
                    z14 = true;
                }
                builder2.a(12, z14);
                commandsB = builder2.b();
                this.H = commandsB;
                if (!commandsB.equals(commands)) {
                    this.k.c(13, new h(this));
                }
                this.k.b();
                if (playbackInfo2.o != playbackInfo.o) {
                    it = this.f17053l.iterator();
                    while (it.hasNext()) {
                        ((ExoPlayer.AudioOffloadListener) it.next()).m();
                    }
                }
            }
            playbackInfo2 = playbackInfo3;
            currentTimeline5 = exoPlayerImpl.getCurrentTimeline();
            if (currentTimeline5.p()) {
                z7 = false;
            } else {
                z7 = false;
            }
            zP = exoPlayerImpl.getCurrentTimeline().p();
            Player.Commands.Builder builder3 = new Player.Commands.Builder();
            flagSet = this.f17048c.X;
            builder = builder3.f17186a;
            builder.getClass();
            while (i15 < flagSet.f18903a.size()) {
                builder.a(flagSet.a(i15));
            }
            boolean z17 = !zIsPlayingAd;
            builder3.a(4, z17);
            if (z3) {
                z8 = false;
            } else {
                z8 = false;
            }
            builder3.a(5, z8);
            if (z4) {
                z9 = false;
            } else {
                z9 = false;
            }
            builder3.a(6, z9);
            if (zP) {
                z10 = false;
            } else {
                z10 = false;
            }
            builder3.a(7, z10);
            if (z6) {
                z11 = false;
            } else {
                z11 = false;
            }
            builder3.a(8, z11);
            if (zP) {
                z12 = false;
            } else {
                z12 = false;
            }
            builder3.a(9, z12);
            builder3.a(10, z17);
            if (z3) {
                z13 = false;
            } else {
                z13 = false;
            }
            builder3.a(11, z13);
            if (z3) {
                z14 = false;
            } else {
                z14 = false;
            }
            builder3.a(12, z14);
            commandsB = builder3.b();
            this.H = commandsB;
            if (!commandsB.equals(commands)) {
                this.k.c(13, new h(this));
            }
            this.k.b();
            if (playbackInfo2.o != playbackInfo.o) {
                it = this.f17053l.iterator();
                while (it.hasNext()) {
                    ((ExoPlayer.AudioOffloadListener) it.next()).m();
                }
            }
        }
        pair = new Pair(Boolean.FALSE, -1);
        i5 = 3;
        i6 = 0;
        zBooleanValue = ((Boolean) pair.first).booleanValue();
        iIntValue = ((Integer) pair.second).intValue();
        mediaMetadataJ = this.f17037I;
        if (zBooleanValue) {
            if (playbackInfo.f17176a.p()) {
                mediaItem = playbackInfo.f17176a.m(playbackInfo.f17176a.g(playbackInfo.f17177b.f18347a, this.m).Z, this.f16995a, 0L).Z;
            } else {
                mediaItem = null;
            }
            this.Z = MediaMetadata.J0;
        } else {
            mediaItem = null;
        }
        if (zBooleanValue) {
            builderA = this.Z.a();
            list = playbackInfo.j;
            i8 = i6;
            while (i8 < list.size()) {
                metadata = (Metadata) list.get(i8);
                int i210 = i19;
                i10 = i6;
                while (true) {
                    entryArr = metadata.X;
                    if (i10 < entryArr.length) {
                        entryArr[i10].l(builderA);
                        i10++;
                    }
                }
                i8++;
                i19 = i210;
            }
            i9 = i19;
            this.Z = new MediaMetadata(builderA);
            mediaMetadataJ = j();
        } else {
            builderA = this.Z.a();
            list = playbackInfo.j;
            i8 = i6;
            while (i8 < list.size()) {
                metadata = (Metadata) list.get(i8);
                int i211 = i19;
                i10 = i6;
                while (true) {
                    entryArr = metadata.X;
                    if (i10 < entryArr.length) {
                        entryArr[i10].l(builderA);
                        i10++;
                    }
                }
                i8++;
                i19 = i211;
            }
            i9 = i19;
            this.Z = new MediaMetadata(builderA);
            mediaMetadataJ = j();
        }
        zEquals = mediaMetadataJ.equals(this.f17037I);
        this.f17037I = mediaMetadataJ;
        if (playbackInfo3.f17182l != playbackInfo.f17182l) {
            i11 = i9;
        } else {
            i11 = i6;
        }
        if (playbackInfo3.f17179e != playbackInfo.f17179e) {
            i12 = i9;
        } else {
            i12 = i6;
        }
        if (i12 == 0) {
            y();
        } else {
            y();
        }
        if (playbackInfo3.g != playbackInfo.g) {
            i13 = i9;
        } else {
            i13 = i6;
        }
        if (!zEquals2) {
            final int i212 = i6;
            this.k.c(i212, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.k
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj9) {
                    int i213 = i2;
                    Object obj10 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj9;
                    switch (i212) {
                        case 0:
                            int i214 = ExoPlayerImpl.f17032d0;
                            listener.onTimelineChanged(((PlaybackInfo) obj10).f17176a, i213);
                            break;
                        case 1:
                            int i215 = ExoPlayerImpl.f17032d0;
                            listener.onPlayWhenReadyChanged(((PlaybackInfo) obj10).f17182l, i213);
                            break;
                        default:
                            int i216 = ExoPlayerImpl.f17032d0;
                            listener.onMediaItemTransition((MediaItem) obj10, i213);
                            break;
                    }
                }
            });
        }
        if (z2) {
            period = new Timeline.Period();
            if (playbackInfo3.f17176a.p()) {
                Object obj9 = playbackInfo3.f17177b.f18347a;
                playbackInfo3.f17176a.g(obj9, period);
                int i213 = period.Z;
                int iB3 = playbackInfo3.f17176a.b(obj9);
                obj = playbackInfo3.f17176a.m(i213, this.f16995a, 0L).X;
                mediaItem2 = this.f16995a.Z;
                obj2 = obj9;
                i16 = i213;
                i17 = iB3;
            } else {
                obj = null;
                i16 = -1;
                mediaItem2 = null;
                obj2 = null;
                i17 = -1;
            }
            if (i4 == 0) {
                if (playbackInfo3.f17177b.a()) {
                    MediaSource.MediaPeriodId mediaPeriodId6 = playbackInfo3.f17177b;
                    jO = period.a(mediaPeriodId6.f18348b, mediaPeriodId6.f18349c);
                    jO2 = o(playbackInfo3);
                } else {
                    if (playbackInfo3.f17177b.f18350e != -1) {
                        jO = o(this.a0);
                    } else {
                        j2 = period.f0;
                        j3 = period.e0;
                        jO = j2 + j3;
                    }
                    jO2 = jO;
                }
            } else if (playbackInfo3.f17177b.a()) {
                jO = playbackInfo3.r;
                jO2 = o(playbackInfo3);
            } else {
                j2 = period.f0;
                j3 = playbackInfo3.r;
                jO = j2 + j3;
                jO2 = jO;
            }
            long J6 = Util.J(jO);
            long J7 = Util.J(jO2);
            MediaSource.MediaPeriodId mediaPeriodId7 = playbackInfo3.f17177b;
            final Player.PositionInfo positionInfo3 = new Player.PositionInfo(obj, i16, mediaItem2, obj2, i17, J6, J7, mediaPeriodId7.f18348b, mediaPeriodId7.f18349c);
            iF = f();
            if (this.a0.f17176a.p()) {
                PlaybackInfo playbackInfo5 = this.a0;
                Object obj10 = playbackInfo5.f17177b.f18347a;
                playbackInfo5.f17176a.g(obj10, this.m);
                int iB4 = this.a0.f17176a.b(obj10);
                Timeline timeline4 = this.a0.f17176a;
                Timeline.Window window3 = this.f16995a;
                i18 = iB4;
                obj4 = obj10;
                obj3 = timeline4.m(iF, window3, 0L).X;
                mediaItem3 = window3.Z;
            } else {
                obj3 = null;
                mediaItem3 = null;
                obj4 = null;
                i18 = -1;
            }
            J2 = Util.J(j);
            if (this.a0.f17177b.a()) {
                J3 = Util.J(o(this.a0));
            } else {
                J3 = J2;
            }
            MediaSource.MediaPeriodId mediaPeriodId8 = this.a0.f17177b;
            final Player.PositionInfo positionInfo4 = new Player.PositionInfo(obj3, iF, mediaItem3, obj4, i18, J2, J3, mediaPeriodId8.f18348b, mediaPeriodId8.f18349c);
            this.k.c(11, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.l
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj11) {
                    Player.Listener listener = (Player.Listener) obj11;
                    int i214 = ExoPlayerImpl.f17032d0;
                    int i215 = i4;
                    listener.onPositionDiscontinuity(i215);
                    listener.onPositionDiscontinuity(positionInfo3, positionInfo4, i215);
                }
            });
        } else {
            zBooleanValue = zBooleanValue;
            zEquals = zEquals;
            i11 = i11;
        }
        if (zBooleanValue) {
            final int i214 = 2;
            this.k.c(i9, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.k
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj11) {
                    int i215 = iIntValue;
                    Object obj12 = mediaItem;
                    Player.Listener listener = (Player.Listener) obj11;
                    switch (i214) {
                        case 0:
                            int i216 = ExoPlayerImpl.f17032d0;
                            listener.onTimelineChanged(((PlaybackInfo) obj12).f17176a, i215);
                            break;
                        case 1:
                            int i217 = ExoPlayerImpl.f17032d0;
                            listener.onPlayWhenReadyChanged(((PlaybackInfo) obj12).f17182l, i215);
                            break;
                        default:
                            int i218 = ExoPlayerImpl.f17032d0;
                            listener.onMediaItemTransition((MediaItem) obj12, i215);
                            break;
                    }
                }
            });
        }
        if (playbackInfo3.f != playbackInfo.f) {
            final int i215 = 7;
            this.k.c(10, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.e
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj11) {
                    PlaybackInfo playbackInfo6 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj11;
                    switch (i215) {
                        case 0:
                            int i216 = ExoPlayerImpl.f17032d0;
                            listener.onTracksChanged(playbackInfo6.f17181i.d);
                            break;
                        case 1:
                            int i217 = ExoPlayerImpl.f17032d0;
                            listener.onLoadingChanged(playbackInfo6.g);
                            listener.onIsLoadingChanged(playbackInfo6.g);
                            break;
                        case 2:
                            int i218 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerStateChanged(playbackInfo6.f17182l, playbackInfo6.f17179e);
                            break;
                        case 3:
                            int i219 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackStateChanged(playbackInfo6.f17179e);
                            break;
                        case 4:
                            int i35 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo6.m);
                            break;
                        case 5:
                            listener.onIsPlayingChanged(ExoPlayerImpl.p(playbackInfo6));
                            break;
                        case 6:
                            int i36 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackParametersChanged(playbackInfo6.f17183n);
                            break;
                        case 7:
                            int i37 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerErrorChanged(playbackInfo6.f);
                            break;
                        default:
                            int i38 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerError(playbackInfo6.f);
                            break;
                    }
                }
            });
            if (playbackInfo.f != null) {
                final int i216 = 8;
                this.k.c(10, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.e
                    @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                    public final void invoke(Object obj11) {
                        PlaybackInfo playbackInfo6 = playbackInfo;
                        Player.Listener listener = (Player.Listener) obj11;
                        switch (i216) {
                            case 0:
                                int i217 = ExoPlayerImpl.f17032d0;
                                listener.onTracksChanged(playbackInfo6.f17181i.d);
                                break;
                            case 1:
                                int i218 = ExoPlayerImpl.f17032d0;
                                listener.onLoadingChanged(playbackInfo6.g);
                                listener.onIsLoadingChanged(playbackInfo6.g);
                                break;
                            case 2:
                                int i219 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerStateChanged(playbackInfo6.f17182l, playbackInfo6.f17179e);
                                break;
                            case 3:
                                int i2110 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackStateChanged(playbackInfo6.f17179e);
                                break;
                            case 4:
                                int i35 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackSuppressionReasonChanged(playbackInfo6.m);
                                break;
                            case 5:
                                listener.onIsPlayingChanged(ExoPlayerImpl.p(playbackInfo6));
                                break;
                            case 6:
                                int i36 = ExoPlayerImpl.f17032d0;
                                listener.onPlaybackParametersChanged(playbackInfo6.f17183n);
                                break;
                            case 7:
                                int i37 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerErrorChanged(playbackInfo6.f);
                                break;
                            default:
                                int i38 = ExoPlayerImpl.f17032d0;
                                listener.onPlayerError(playbackInfo6.f);
                                break;
                        }
                    }
                });
            }
        }
        trackSelectorResult = playbackInfo3.f17181i;
        trackSelectorResult2 = playbackInfo.f17181i;
        if (trackSelectorResult != trackSelectorResult2) {
            this.f17051h.a(trackSelectorResult2.f18712e);
            i14 = 0;
            this.k.c(2, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.e
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj11) {
                    PlaybackInfo playbackInfo6 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj11;
                    switch (i14) {
                        case 0:
                            int i217 = ExoPlayerImpl.f17032d0;
                            listener.onTracksChanged(playbackInfo6.f17181i.d);
                            break;
                        case 1:
                            int i218 = ExoPlayerImpl.f17032d0;
                            listener.onLoadingChanged(playbackInfo6.g);
                            listener.onIsLoadingChanged(playbackInfo6.g);
                            break;
                        case 2:
                            int i219 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerStateChanged(playbackInfo6.f17182l, playbackInfo6.f17179e);
                            break;
                        case 3:
                            int i2110 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackStateChanged(playbackInfo6.f17179e);
                            break;
                        case 4:
                            int i35 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo6.m);
                            break;
                        case 5:
                            listener.onIsPlayingChanged(ExoPlayerImpl.p(playbackInfo6));
                            break;
                        case 6:
                            int i36 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackParametersChanged(playbackInfo6.f17183n);
                            break;
                        case 7:
                            int i37 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerErrorChanged(playbackInfo6.f);
                            break;
                        default:
                            int i38 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerError(playbackInfo6.f);
                            break;
                    }
                }
            });
        } else {
            i14 = 0;
        }
        if (!zEquals) {
            this.k.c(14, new f(this.f17037I, i14));
        }
        if (i13 != 0) {
            final int i217 = 1;
            this.k.c(i5, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.e
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj11) {
                    PlaybackInfo playbackInfo6 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj11;
                    switch (i217) {
                        case 0:
                            int i218 = ExoPlayerImpl.f17032d0;
                            listener.onTracksChanged(playbackInfo6.f17181i.d);
                            break;
                        case 1:
                            int i219 = ExoPlayerImpl.f17032d0;
                            listener.onLoadingChanged(playbackInfo6.g);
                            listener.onIsLoadingChanged(playbackInfo6.g);
                            break;
                        case 2:
                            int i2110 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerStateChanged(playbackInfo6.f17182l, playbackInfo6.f17179e);
                            break;
                        case 3:
                            int i2111 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackStateChanged(playbackInfo6.f17179e);
                            break;
                        case 4:
                            int i35 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo6.m);
                            break;
                        case 5:
                            listener.onIsPlayingChanged(ExoPlayerImpl.p(playbackInfo6));
                            break;
                        case 6:
                            int i36 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackParametersChanged(playbackInfo6.f17183n);
                            break;
                        case 7:
                            int i37 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerErrorChanged(playbackInfo6.f);
                            break;
                        default:
                            int i38 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerError(playbackInfo6.f);
                            break;
                    }
                }
            });
        }
        if (i12 == 0) {
            final int i218 = 2;
            this.k.c(-1, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.e
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj11) {
                    PlaybackInfo playbackInfo6 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj11;
                    switch (i218) {
                        case 0:
                            int i219 = ExoPlayerImpl.f17032d0;
                            listener.onTracksChanged(playbackInfo6.f17181i.d);
                            break;
                        case 1:
                            int i2110 = ExoPlayerImpl.f17032d0;
                            listener.onLoadingChanged(playbackInfo6.g);
                            listener.onIsLoadingChanged(playbackInfo6.g);
                            break;
                        case 2:
                            int i2111 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerStateChanged(playbackInfo6.f17182l, playbackInfo6.f17179e);
                            break;
                        case 3:
                            int i2112 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackStateChanged(playbackInfo6.f17179e);
                            break;
                        case 4:
                            int i35 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo6.m);
                            break;
                        case 5:
                            listener.onIsPlayingChanged(ExoPlayerImpl.p(playbackInfo6));
                            break;
                        case 6:
                            int i36 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackParametersChanged(playbackInfo6.f17183n);
                            break;
                        case 7:
                            int i37 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerErrorChanged(playbackInfo6.f);
                            break;
                        default:
                            int i38 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerError(playbackInfo6.f);
                            break;
                    }
                }
            });
        } else {
            final int i219 = 2;
            this.k.c(-1, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.e
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj11) {
                    PlaybackInfo playbackInfo6 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj11;
                    switch (i219) {
                        case 0:
                            int i2110 = ExoPlayerImpl.f17032d0;
                            listener.onTracksChanged(playbackInfo6.f17181i.d);
                            break;
                        case 1:
                            int i2111 = ExoPlayerImpl.f17032d0;
                            listener.onLoadingChanged(playbackInfo6.g);
                            listener.onIsLoadingChanged(playbackInfo6.g);
                            break;
                        case 2:
                            int i2112 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerStateChanged(playbackInfo6.f17182l, playbackInfo6.f17179e);
                            break;
                        case 3:
                            int i2113 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackStateChanged(playbackInfo6.f17179e);
                            break;
                        case 4:
                            int i35 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo6.m);
                            break;
                        case 5:
                            listener.onIsPlayingChanged(ExoPlayerImpl.p(playbackInfo6));
                            break;
                        case 6:
                            int i36 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackParametersChanged(playbackInfo6.f17183n);
                            break;
                        case 7:
                            int i37 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerErrorChanged(playbackInfo6.f);
                            break;
                        default:
                            int i38 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerError(playbackInfo6.f);
                            break;
                    }
                }
            });
        }
        if (i12 != 0) {
            final int i220 = 3;
            this.k.c(4, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.e
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj11) {
                    PlaybackInfo playbackInfo6 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj11;
                    switch (i220) {
                        case 0:
                            int i2110 = ExoPlayerImpl.f17032d0;
                            listener.onTracksChanged(playbackInfo6.f17181i.d);
                            break;
                        case 1:
                            int i2111 = ExoPlayerImpl.f17032d0;
                            listener.onLoadingChanged(playbackInfo6.g);
                            listener.onIsLoadingChanged(playbackInfo6.g);
                            break;
                        case 2:
                            int i2112 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerStateChanged(playbackInfo6.f17182l, playbackInfo6.f17179e);
                            break;
                        case 3:
                            int i2113 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackStateChanged(playbackInfo6.f17179e);
                            break;
                        case 4:
                            int i35 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo6.m);
                            break;
                        case 5:
                            listener.onIsPlayingChanged(ExoPlayerImpl.p(playbackInfo6));
                            break;
                        case 6:
                            int i36 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackParametersChanged(playbackInfo6.f17183n);
                            break;
                        case 7:
                            int i37 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerErrorChanged(playbackInfo6.f);
                            break;
                        default:
                            int i38 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerError(playbackInfo6.f);
                            break;
                    }
                }
            });
        }
        if (i11 != 0) {
            final int i35 = 1;
            this.k.c(5, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.k
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj11) {
                    int i2110 = i3;
                    Object obj12 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj11;
                    switch (i35) {
                        case 0:
                            int i2111 = ExoPlayerImpl.f17032d0;
                            listener.onTimelineChanged(((PlaybackInfo) obj12).f17176a, i2110);
                            break;
                        case 1:
                            int i2112 = ExoPlayerImpl.f17032d0;
                            listener.onPlayWhenReadyChanged(((PlaybackInfo) obj12).f17182l, i2110);
                            break;
                        default:
                            int i2113 = ExoPlayerImpl.f17032d0;
                            listener.onMediaItemTransition((MediaItem) obj12, i2110);
                            break;
                    }
                }
            });
        }
        if (playbackInfo3.m != playbackInfo.m) {
            final int i36 = 4;
            this.k.c(6, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.e
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj11) {
                    PlaybackInfo playbackInfo6 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj11;
                    switch (i36) {
                        case 0:
                            int i2110 = ExoPlayerImpl.f17032d0;
                            listener.onTracksChanged(playbackInfo6.f17181i.d);
                            break;
                        case 1:
                            int i2111 = ExoPlayerImpl.f17032d0;
                            listener.onLoadingChanged(playbackInfo6.g);
                            listener.onIsLoadingChanged(playbackInfo6.g);
                            break;
                        case 2:
                            int i2112 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerStateChanged(playbackInfo6.f17182l, playbackInfo6.f17179e);
                            break;
                        case 3:
                            int i2113 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackStateChanged(playbackInfo6.f17179e);
                            break;
                        case 4:
                            int i37 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo6.m);
                            break;
                        case 5:
                            listener.onIsPlayingChanged(ExoPlayerImpl.p(playbackInfo6));
                            break;
                        case 6:
                            int i38 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackParametersChanged(playbackInfo6.f17183n);
                            break;
                        case 7:
                            int i39 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerErrorChanged(playbackInfo6.f);
                            break;
                        default:
                            int i310 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerError(playbackInfo6.f);
                            break;
                    }
                }
            });
        }
        if (p(playbackInfo3) != p(playbackInfo)) {
            final int i37 = 5;
            this.k.c(7, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.e
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj11) {
                    PlaybackInfo playbackInfo6 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj11;
                    switch (i37) {
                        case 0:
                            int i2110 = ExoPlayerImpl.f17032d0;
                            listener.onTracksChanged(playbackInfo6.f17181i.d);
                            break;
                        case 1:
                            int i2111 = ExoPlayerImpl.f17032d0;
                            listener.onLoadingChanged(playbackInfo6.g);
                            listener.onIsLoadingChanged(playbackInfo6.g);
                            break;
                        case 2:
                            int i2112 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerStateChanged(playbackInfo6.f17182l, playbackInfo6.f17179e);
                            break;
                        case 3:
                            int i2113 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackStateChanged(playbackInfo6.f17179e);
                            break;
                        case 4:
                            int i38 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo6.m);
                            break;
                        case 5:
                            listener.onIsPlayingChanged(ExoPlayerImpl.p(playbackInfo6));
                            break;
                        case 6:
                            int i39 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackParametersChanged(playbackInfo6.f17183n);
                            break;
                        case 7:
                            int i310 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerErrorChanged(playbackInfo6.f);
                            break;
                        default:
                            int i311 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerError(playbackInfo6.f);
                            break;
                    }
                }
            });
        }
        if (!playbackInfo3.f17183n.equals(playbackInfo.f17183n)) {
            final int i38 = 6;
            this.k.c(12, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.e
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj11) {
                    PlaybackInfo playbackInfo6 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj11;
                    switch (i38) {
                        case 0:
                            int i2110 = ExoPlayerImpl.f17032d0;
                            listener.onTracksChanged(playbackInfo6.f17181i.d);
                            break;
                        case 1:
                            int i2111 = ExoPlayerImpl.f17032d0;
                            listener.onLoadingChanged(playbackInfo6.g);
                            listener.onIsLoadingChanged(playbackInfo6.g);
                            break;
                        case 2:
                            int i2112 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerStateChanged(playbackInfo6.f17182l, playbackInfo6.f17179e);
                            break;
                        case 3:
                            int i2113 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackStateChanged(playbackInfo6.f17179e);
                            break;
                        case 4:
                            int i39 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo6.m);
                            break;
                        case 5:
                            listener.onIsPlayingChanged(ExoPlayerImpl.p(playbackInfo6));
                            break;
                        case 6:
                            int i310 = ExoPlayerImpl.f17032d0;
                            listener.onPlaybackParametersChanged(playbackInfo6.f17183n);
                            break;
                        case 7:
                            int i311 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerErrorChanged(playbackInfo6.f);
                            break;
                        default:
                            int i312 = ExoPlayerImpl.f17032d0;
                            listener.onPlayerError(playbackInfo6.f);
                            break;
                    }
                }
            });
        }
        commands = this.H;
        int i39 = Util.f18979a;
        exoPlayerImpl = (ExoPlayerImpl) this.f;
        boolean zIsPlayingAd2 = exoPlayerImpl.isPlayingAd();
        currentTimeline = exoPlayerImpl.getCurrentTimeline();
        if (currentTimeline.p()) {
            z3 = false;
        } else {
            z3 = false;
        }
        currentTimeline2 = exoPlayerImpl.getCurrentTimeline();
        if (currentTimeline2.p()) {
            iK = -1;
        } else {
            int iF4 = exoPlayerImpl.f();
            exoPlayerImpl.getRepeatMode();
            iK = currentTimeline2.k(iF4, 0, exoPlayerImpl.getShuffleModeEnabled());
        }
        if (iK != -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        currentTimeline3 = exoPlayerImpl.getCurrentTimeline();
        if (currentTimeline3.p()) {
            iE = -1;
            z5 = false;
        } else {
            int iF5 = exoPlayerImpl.f();
            exoPlayerImpl.getRepeatMode();
            z5 = false;
            iE = currentTimeline3.e(iF5, 0, exoPlayerImpl.getShuffleModeEnabled());
        }
        if (iE != -1) {
            z6 = true;
        } else {
            z6 = z5;
        }
        currentTimeline4 = exoPlayerImpl.getCurrentTimeline();
        if (!currentTimeline4.p()) {
            playbackInfo2 = playbackInfo3;
            if (currentTimeline4.m(exoPlayerImpl.f(), exoPlayerImpl.f16995a, 0L).a()) {
            }
            currentTimeline5 = exoPlayerImpl.getCurrentTimeline();
            if (currentTimeline5.p()) {
                z7 = false;
            } else {
                z7 = false;
            }
            zP = exoPlayerImpl.getCurrentTimeline().p();
            Player.Commands.Builder builder4 = new Player.Commands.Builder();
            flagSet = this.f17048c.X;
            builder = builder4.f17186a;
            builder.getClass();
            while (i15 < flagSet.f18903a.size()) {
                builder.a(flagSet.a(i15));
            }
            boolean z18 = !zIsPlayingAd2;
            builder4.a(4, z18);
            if (z3) {
                z8 = false;
            } else {
                z8 = false;
            }
            builder4.a(5, z8);
            if (z4) {
                z9 = false;
            } else {
                z9 = false;
            }
            builder4.a(6, z9);
            if (zP) {
                z10 = false;
            } else {
                z10 = false;
            }
            builder4.a(7, z10);
            if (z6) {
                z11 = false;
            } else {
                z11 = false;
            }
            builder4.a(8, z11);
            if (zP) {
                z12 = false;
            } else {
                z12 = false;
            }
            builder4.a(9, z12);
            builder4.a(10, z18);
            if (z3) {
                z13 = false;
            } else {
                z13 = false;
            }
            builder4.a(11, z13);
            if (z3) {
                z14 = false;
            } else {
                z14 = false;
            }
            builder4.a(12, z14);
            commandsB = builder4.b();
            this.H = commandsB;
            if (!commandsB.equals(commands)) {
                this.k.c(13, new h(this));
            }
            this.k.b();
            if (playbackInfo2.o != playbackInfo.o) {
                it = this.f17053l.iterator();
                while (it.hasNext()) {
                    ((ExoPlayer.AudioOffloadListener) it.next()).m();
                }
            }
        }
        playbackInfo2 = playbackInfo3;
        currentTimeline5 = exoPlayerImpl.getCurrentTimeline();
        if (currentTimeline5.p()) {
            z7 = false;
        } else {
            z7 = false;
        }
        zP = exoPlayerImpl.getCurrentTimeline().p();
        Player.Commands.Builder builder5 = new Player.Commands.Builder();
        flagSet = this.f17048c.X;
        builder = builder5.f17186a;
        builder.getClass();
        while (i15 < flagSet.f18903a.size()) {
            builder.a(flagSet.a(i15));
        }
        boolean z19 = !zIsPlayingAd2;
        builder5.a(4, z19);
        if (z3) {
            z8 = false;
        } else {
            z8 = false;
        }
        builder5.a(5, z8);
        if (z4) {
            z9 = false;
        } else {
            z9 = false;
        }
        builder5.a(6, z9);
        if (zP) {
            z10 = false;
        } else {
            z10 = false;
        }
        builder5.a(7, z10);
        if (z6) {
            z11 = false;
        } else {
            z11 = false;
        }
        builder5.a(8, z11);
        if (zP) {
            z12 = false;
        } else {
            z12 = false;
        }
        builder5.a(9, z12);
        builder5.a(10, z19);
        if (z3) {
            z13 = false;
        } else {
            z13 = false;
        }
        builder5.a(11, z13);
        if (z3) {
            z14 = false;
        } else {
            z14 = false;
        }
        builder5.a(12, z14);
        commandsB = builder5.b();
        this.H = commandsB;
        if (!commandsB.equals(commands)) {
            this.k.c(13, new h(this));
        }
        this.k.b();
        if (playbackInfo2.o != playbackInfo.o) {
            it = this.f17053l.iterator();
            while (it.hasNext()) {
                ((ExoPlayer.AudioOffloadListener) it.next()).m();
            }
        }
    }

    public final void y() {
        int playbackState = getPlaybackState();
        WifiLockManager wifiLockManager = this.f17033A;
        WakeLockManager wakeLockManager = this.f17058z;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                z();
                boolean z2 = this.a0.o;
                getPlayWhenReady();
                wakeLockManager.getClass();
                getPlayWhenReady();
                wifiLockManager.getClass();
                return;
            }
            if (playbackState != 4) {
                throw new IllegalStateException();
            }
        }
        wakeLockManager.getClass();
        wifiLockManager.getClass();
    }

    public final void z() {
        this.d.b();
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.r;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i2 = Util.f18979a;
            Locale locale = Locale.US;
            String strN = androidx.datastore.preferences.protobuf.a.n("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.W) {
                throw new IllegalStateException(strN);
            }
            Log.h("ExoPlayerImpl", strN, this.X ? null : new IllegalStateException());
            this.X = true;
        }
    }

    public final class ComponentListener implements VideoRendererEventListener, AudioRendererEventListener, TextOutput, MetadataOutput, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.VideoSurfaceListener, AudioFocusManager.PlayerControl, AudioBecomingNoisyManager.EventListener, StreamVolumeManager.Listener, ExoPlayer.AudioOffloadListener {
        public ComponentListener() {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public final void a(String str) {
            ExoPlayerImpl.this.q.a(str);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public final void b(String str) {
            ExoPlayerImpl.this.q.b(str);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public final void c(Exception exc) {
            ExoPlayerImpl.this.q.c(exc);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public final void d(long j) {
            ExoPlayerImpl.this.q.d(j);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public final void e(Exception exc) {
            ExoPlayerImpl.this.q.e(exc);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public final void f(long j, Object obj) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.q.f(j, obj);
            if (exoPlayerImpl.L == obj) {
                exoPlayerImpl.k.e(26, new d(2));
            }
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public final void g(int i2, long j) {
            ExoPlayerImpl.this.q.g(i2, j);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public final void h(Exception exc) {
            ExoPlayerImpl.this.q.h(exc);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public final void i(int i2, long j, long j2) {
            ExoPlayerImpl.this.q.i(i2, j, j2);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public final void j(DecoderCounters decoderCounters) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.getClass();
            exoPlayerImpl.q.j(decoderCounters);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public final void k(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.f17038J = format;
            exoPlayerImpl.q.k(format, decoderReuseEvaluation);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public final void l(DecoderCounters decoderCounters) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.q.l(decoderCounters);
            exoPlayerImpl.f17038J = null;
        }

        @Override // com.google.android.exoplayer2.ExoPlayer.AudioOffloadListener
        public final void m() {
            int i2 = ExoPlayerImpl.f17032d0;
            ExoPlayerImpl.this.y();
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public final void n(DecoderCounters decoderCounters) {
            ExoPlayerImpl.this.q.n(decoderCounters);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public final void o(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.getClass();
            exoPlayerImpl.q.o(format, decoderReuseEvaluation);
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public final void onAudioDecoderInitialized(String str, long j, long j2) {
            ExoPlayerImpl.this.q.onAudioDecoderInitialized(str, j, j2);
        }

        @Override // com.google.android.exoplayer2.text.TextOutput
        public final void onCues(List list) {
            ExoPlayerImpl.this.k.e(27, new f(list, 2));
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public final void onDroppedFrames(int i2, long j) {
            ExoPlayerImpl.this.q.onDroppedFrames(i2, j);
        }

        @Override // com.google.android.exoplayer2.metadata.MetadataOutput
        public final void onMetadata(Metadata metadata) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            MediaMetadata.Builder builderA = exoPlayerImpl.Z.a();
            int i2 = 0;
            while (true) {
                Metadata.Entry[] entryArr = metadata.X;
                if (i2 >= entryArr.length) {
                    break;
                }
                entryArr[i2].l(builderA);
                i2++;
            }
            exoPlayerImpl.Z = new MediaMetadata(builderA);
            MediaMetadata mediaMetadataJ = exoPlayerImpl.j();
            boolean zEquals = mediaMetadataJ.equals(exoPlayerImpl.f17037I);
            ListenerSet listenerSet = exoPlayerImpl.k;
            if (!zEquals) {
                exoPlayerImpl.f17037I = mediaMetadataJ;
                listenerSet.c(14, new f(this, 1));
            }
            listenerSet.c(28, new f(metadata, 4));
            listenerSet.b();
        }

        @Override // com.google.android.exoplayer2.audio.AudioRendererEventListener
        public final void onSkipSilenceEnabledChanged(final boolean z2) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            if (exoPlayerImpl.f17044V == z2) {
                return;
            }
            exoPlayerImpl.f17044V = z2;
            exoPlayerImpl.k.e(23, new ListenerSet.Event() { // from class: com.google.android.exoplayer2.n
                @Override // com.google.android.exoplayer2.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    ((Player.Listener) obj).onSkipSilenceEnabledChanged(z2);
                }
            });
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i2, int i3) {
            int i4 = ExoPlayerImpl.f17032d0;
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.getClass();
            Surface surface = new Surface(surfaceTexture);
            exoPlayerImpl.u(surface);
            exoPlayerImpl.M = surface;
            exoPlayerImpl.r(i2, i3);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            int i2 = ExoPlayerImpl.f17032d0;
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.u(null);
            exoPlayerImpl.r(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
            int i4 = ExoPlayerImpl.f17032d0;
            ExoPlayerImpl.this.r(i2, i3);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public final void onVideoDecoderInitialized(String str, long j, long j2) {
            ExoPlayerImpl.this.q.onVideoDecoderInitialized(str, j, j2);
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public final void onVideoSizeChanged(VideoSize videoSize) {
            int i2 = ExoPlayerImpl.f17032d0;
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.getClass();
            exoPlayerImpl.k.e(25, new f(videoSize, 6));
        }

        @Override // com.google.android.exoplayer2.video.VideoRendererEventListener
        public final void p(DecoderCounters decoderCounters) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.getClass();
            exoPlayerImpl.q.p(decoderCounters);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            int i5 = ExoPlayerImpl.f17032d0;
            ExoPlayerImpl.this.r(i3, i4);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            if (exoPlayerImpl.f17040P) {
                exoPlayerImpl.u(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            if (exoPlayerImpl.f17040P) {
                exoPlayerImpl.u(null);
            }
            exoPlayerImpl.r(0, 0);
        }

        @Override // com.google.android.exoplayer2.text.TextOutput
        public final void onCues(CueGroup cueGroup) {
            int i2 = ExoPlayerImpl.f17032d0;
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.getClass();
            exoPlayerImpl.k.e(27, new f(cueGroup, 3));
        }
    }

    @Override // com.google.android.exoplayer2.Player
    public final ExoPlaybackException a() {
        z();
        return this.a0.f;
    }
}
