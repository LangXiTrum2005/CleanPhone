package androidx.media3.exoplayer;

import A.AbstractC0912t;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.BasePlayer;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.FlagSet;
import androidx.media3.common.Format;
import androidx.media3.common.IllegalSeekPositionException;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.ConditionVariable;
import androidx.media3.common.util.HandlerWrapper;
import androidx.media3.common.util.ListenerSet;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Size;
import androidx.media3.common.util.SystemClock;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.AnalyticsCollector;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.analytics.MediaMetricsListener;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.source.MaskingMediaSource;
import androidx.media3.exoplayer.source.MediaSource;
import androidx.media3.exoplayer.source.ShuffleOrder;
import androidx.media3.exoplayer.source.TrackGroupArray;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector;
import androidx.media3.exoplayer.trackselection.ExoTrackSelection;
import androidx.media3.exoplayer.trackselection.TrackSelector;
import androidx.media3.exoplayer.trackselection.TrackSelectorResult;
import androidx.media3.exoplayer.upstream.BandwidthMeter;
import androidx.media3.exoplayer.video.VideoDecoderOutputBufferRenderer;
import androidx.media3.exoplayer.video.VideoFrameMetadataListener;
import androidx.media3.exoplayer.video.VideoRendererEventListener;
import androidx.media3.exoplayer.video.spherical.CameraMotionListener;
import androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView;
import com.google.common.collect.ImmutableList;
import com.p004ironsource.d9;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
final class ExoPlayerImpl extends BasePlayer implements ExoPlayer, ExoPlayer.AudioComponent, ExoPlayer.VideoComponent, ExoPlayer.TextComponent, ExoPlayer.DeviceComponent {
    public static final /* synthetic */ int l0 = 0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final AudioBecomingNoisyManager f5864A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final AudioFocusManager f5865B;
    public final WakeLockManager C;
    public final WifiLockManager D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final long f5866E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public int f5867F;
    public boolean G;
    public int H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public int f5868I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f5869J;
    public final SeekParameters K;
    public ShuffleOrder L;
    public final ExoPlayer.PreloadConfiguration M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public Player.Commands f5870N;
    public MediaMetadata O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public AudioTrack f5871P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public Object f5872Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public Surface f5873R;
    public SurfaceHolder S;
    public SphericalGLSurfaceView T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public boolean f5874U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public TextureView f5875V;
    public final int W;
    public Size X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final int f5876Y;
    public final AudioAttributes Z;
    public float a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TrackSelectorResult f5877b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f5878b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Player.Commands f5879c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public CueGroup f5880c0;
    public final ConditionVariable d = new ConditionVariable(0);

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final boolean f5881d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f5882e;
    public boolean e0;
    public final Player f;
    public final int f0;
    public final Renderer[] g;
    public VideoSize g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TrackSelector f5883h;
    public MediaMetadata h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HandlerWrapper f5884i;
    public PlaybackInfo i0;
    public final m j;
    public int j0;
    public final ExoPlayerImplInternal k;
    public long k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ListenerSet f5885l;
    public final CopyOnWriteArraySet m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Timeline.Period f5886n;
    public final ArrayList o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f5887p;
    public final MediaSource.Factory q;
    public final AnalyticsCollector r;
    public final Looper s;
    public final BandwidthMeter t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final long f5888u;
    public final long v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long f5889w;
    public final SystemClock x;
    public final ComponentListener y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final FrameMetadataListener f5890z;

    public static final class Api23 {
        public static boolean a(Context context, AudioDeviceInfo[] audioDeviceInfoArr) {
            int i2;
            if (Util.f5683a >= 20 && context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
                for (AudioDeviceInfo audioDeviceInfo : audioDeviceInfoArr) {
                    if (audioDeviceInfo.getType() != 8 && audioDeviceInfo.getType() != 5 && audioDeviceInfo.getType() != 6 && audioDeviceInfo.getType() != 11 && audioDeviceInfo.getType() != 4 && audioDeviceInfo.getType() != 3 && (((i2 = Util.f5683a) < 26 || audioDeviceInfo.getType() != 22) && ((i2 < 28 || audioDeviceInfo.getType() != 23) && ((i2 < 31 || (audioDeviceInfo.getType() != 26 && audioDeviceInfo.getType() != 27)) && (i2 < 33 || audioDeviceInfo.getType() != 30))))) {
                    }
                }
                return false;
            }
            return true;
        }

        public static void b(AudioManager audioManager, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            audioManager.registerAudioDeviceCallback(audioDeviceCallback, handler);
        }
    }

    public static final class Api31 {
        public static PlayerId a(Context context, ExoPlayerImpl exoPlayerImpl, boolean z2, String str) {
            MediaMetricsManager mediaMetricsManagerH = AbstractC0912t.h(context.getSystemService("media_metrics"));
            MediaMetricsListener mediaMetricsListener = mediaMetricsManagerH == null ? null : new MediaMetricsListener(context, mediaMetricsManagerH.createPlaybackSession());
            if (mediaMetricsListener == null) {
                Log.g("ExoPlayerImpl", "MediaMetricsService unavailable.");
                return new PlayerId(LogSessionId.LOG_SESSION_ID_NONE, str);
            }
            if (z2) {
                exoPlayerImpl.getClass();
                exoPlayerImpl.r.K(mediaMetricsListener);
            }
            return new PlayerId(mediaMetricsListener.f6016c.getSessionId(), str);
        }
    }

    public static final class FrameMetadataListener implements VideoFrameMetadataListener, CameraMotionListener, PlayerMessage.Target {
        public VideoFrameMetadataListener X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public CameraMotionListener f5891Y;
        public VideoFrameMetadataListener Z;
        public CameraMotionListener e0;

        @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
        public final void a(float[] fArr, long j) {
            CameraMotionListener cameraMotionListener = this.e0;
            if (cameraMotionListener != null) {
                cameraMotionListener.a(fArr, j);
            }
            CameraMotionListener cameraMotionListener2 = this.f5891Y;
            if (cameraMotionListener2 != null) {
                cameraMotionListener2.a(fArr, j);
            }
        }

        @Override // androidx.media3.exoplayer.video.spherical.CameraMotionListener
        public final void c() {
            CameraMotionListener cameraMotionListener = this.e0;
            if (cameraMotionListener != null) {
                cameraMotionListener.c();
            }
            CameraMotionListener cameraMotionListener2 = this.f5891Y;
            if (cameraMotionListener2 != null) {
                cameraMotionListener2.c();
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoFrameMetadataListener
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

        @Override // androidx.media3.exoplayer.PlayerMessage.Target
        public final void handleMessage(int i2, Object obj) {
            if (i2 == 7) {
                this.X = (VideoFrameMetadataListener) obj;
                return;
            }
            if (i2 == 8) {
                this.f5891Y = (CameraMotionListener) obj;
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
        public final Object f5892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Timeline f5893b;

        public MediaSourceHolderSnapshot(Object obj, MaskingMediaSource maskingMediaSource) {
            this.f5892a = obj;
            this.f5893b = maskingMediaSource.p0;
        }

        @Override // androidx.media3.exoplayer.MediaSourceInfoHolder
        public final Object a() {
            return this.f5892a;
        }

        @Override // androidx.media3.exoplayer.MediaSourceInfoHolder
        public final Timeline b() {
            return this.f5893b;
        }
    }

    public final class NoSuitableOutputPlaybackSuppressionAudioDeviceCallback extends AudioDeviceCallback {
        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            int i2 = ExoPlayerImpl.l0;
            throw null;
        }

        @Override // android.media.AudioDeviceCallback
        public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            int i2 = ExoPlayerImpl.l0;
            throw null;
        }
    }

    static {
        MediaLibraryInfo.a("media3.exoplayer");
    }

    public ExoPlayerImpl(ExoPlayer.Builder builder) {
        try {
            Log.f("ExoPlayerImpl", "Init " + Integer.toHexString(System.identityHashCode(this)) + " [AndroidXMedia3/1.4.1] [" + Util.f5686e + d9.i.f24752e);
            Context context = builder.f5853a;
            Looper looper = builder.g;
            this.f5882e = context.getApplicationContext();
            SystemClock systemClock = builder.f5854b;
            this.r = new DefaultAnalyticsCollector(systemClock);
            this.f0 = builder.f5857h;
            this.Z = builder.f5858i;
            this.W = builder.j;
            this.f5878b0 = false;
            this.f5866E = builder.r;
            ComponentListener componentListener = new ComponentListener();
            this.y = componentListener;
            this.f5890z = new FrameMetadataListener();
            Handler handler = new Handler(looper);
            Renderer[] rendererArrA = ((RenderersFactory) builder.f5855c.get()).a(handler, componentListener, componentListener, componentListener, componentListener);
            this.g = rendererArrA;
            Assertions.e(rendererArrA.length > 0);
            this.f5883h = (TrackSelector) builder.f5856e.get();
            this.q = (MediaSource.Factory) builder.d.get();
            this.t = (BandwidthMeter) builder.f.get();
            this.f5887p = builder.k;
            this.K = builder.f5859l;
            this.f5888u = builder.m;
            this.v = builder.f5860n;
            this.f5889w = builder.o;
            this.s = looper;
            this.x = systemClock;
            this.f = this;
            this.f5885l = new ListenerSet(looper, systemClock, new m(this));
            this.m = new CopyOnWriteArraySet();
            this.o = new ArrayList();
            this.L = new ShuffleOrder.DefaultShuffleOrder();
            this.M = ExoPlayer.PreloadConfiguration.f5863a;
            this.f5877b = new TrackSelectorResult(new RendererConfiguration[rendererArrA.length], new ExoTrackSelection[rendererArrA.length], Tracks.f5546b, null);
            this.f5886n = new Timeline.Period();
            Player.Commands.Builder builder2 = new Player.Commands.Builder();
            FlagSet.Builder builder3 = builder2.f5498a;
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 31, 20, 30, 21, 35, 22, 24, 27, 28, 32};
            builder3.getClass();
            int i2 = 0;
            for (int i3 = 20; i2 < i3; i3 = 20) {
                builder3.a(iArr[i2]);
                i2++;
            }
            TrackSelector trackSelector = this.f5883h;
            trackSelector.getClass();
            builder2.a(29, trackSelector instanceof DefaultTrackSelector);
            builder2.a(23, false);
            builder2.a(25, false);
            builder2.a(33, false);
            builder2.a(26, false);
            builder2.a(34, false);
            FlagSet flagSetB = builder3.b();
            this.f5879c = new Player.Commands(flagSetB);
            FlagSet.Builder builder4 = new Player.Commands.Builder().f5498a;
            builder4.getClass();
            for (int i4 = 0; i4 < flagSetB.f5397a.size(); i4++) {
                builder4.a(flagSetB.a(i4));
            }
            builder4.a(4);
            builder4.a(10);
            this.f5870N = new Player.Commands(builder4.b());
            this.f5884i = this.x.createHandler(this.s, null);
            m mVar = new m(this);
            this.j = mVar;
            this.i0 = PlaybackInfo.i(this.f5877b);
            this.r.T(this.f, this.s);
            int i5 = Util.f5683a;
            String str = builder.f5862u;
            this.k = new ExoPlayerImplInternal(this.g, this.f5883h, this.f5877b, new DefaultLoadControl(), this.t, this.f5867F, this.G, this.r, this.K, builder.f5861p, builder.q, this.s, this.x, mVar, i5 < 31 ? new PlayerId(str) : Api31.a(this.f5882e, this, builder.s, str), this.M);
            this.a0 = 1.0f;
            this.f5867F = 0;
            MediaMetadata mediaMetadata = MediaMetadata.y;
            this.O = mediaMetadata;
            this.h0 = mediaMetadata;
            this.j0 = -1;
            if (i5 < 21) {
                AudioTrack audioTrack = this.f5871P;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.f5871P.release();
                    this.f5871P = null;
                }
                if (this.f5871P == null) {
                    this.f5871P = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.f5876Y = this.f5871P.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.f5882e.getSystemService("audio");
                this.f5876Y = audioManager == null ? -1 : audioManager.generateAudioSessionId();
            }
            this.f5880c0 = CueGroup.f5613b;
            this.f5881d0 = true;
            l(this.r);
            this.t.d(new Handler(this.s), this.r);
            this.m.add(this.y);
            AudioBecomingNoisyManager audioBecomingNoisyManager = new AudioBecomingNoisyManager(context, handler, this.y);
            this.f5864A = audioBecomingNoisyManager;
            audioBecomingNoisyManager.a();
            this.f5865B = new AudioFocusManager(context, handler, this.y);
            this.C = new WakeLockManager(context);
            this.D = new WifiLockManager(context);
            DeviceInfo.Builder builder5 = new DeviceInfo.Builder();
            builder5.f5393a = 0;
            builder5.f5394b = 0;
            new DeviceInfo(builder5);
            this.g0 = VideoSize.f5552e;
            this.X = Size.f5671c;
            this.f5883h.g(this.Z);
            U(1, 10, Integer.valueOf(this.f5876Y));
            U(2, 10, Integer.valueOf(this.f5876Y));
            U(1, 3, this.Z);
            U(2, 4, Integer.valueOf(this.W));
            U(2, 5, 0);
            U(1, 9, Boolean.valueOf(this.f5878b0));
            U(2, 7, this.f5890z);
            U(6, 8, this.f5890z);
            U(-1, 16, Integer.valueOf(this.f0));
        } finally {
            this.d.d();
        }
    }

    public static long O(PlaybackInfo playbackInfo) {
        Timeline.Window window = new Timeline.Window();
        Timeline.Period period = new Timeline.Period();
        playbackInfo.f5962a.g(playbackInfo.f5963b.f6384a, period);
        long j = playbackInfo.f5964c;
        if (j != -9223372036854775807L) {
            return period.f5511e + j;
        }
        return playbackInfo.f5962a.m(period.f5510c, window, 0L).k;
    }

    @Override // androidx.media3.common.Player
    public final long A() {
        c0();
        return this.f5888u;
    }

    @Override // androidx.media3.common.BasePlayer
    public final void H(long j, int i2, boolean z2) {
        c0();
        if (i2 == -1) {
            return;
        }
        Assertions.b(i2 >= 0);
        Timeline timeline = this.i0.f5962a;
        if (timeline.p() || i2 < timeline.o()) {
            this.r.y();
            this.H++;
            if (isPlayingAd()) {
                Log.g("ExoPlayerImpl", "seekTo ignored because an ad is playing");
                ExoPlayerImplInternal.PlaybackInfoUpdate playbackInfoUpdate = new ExoPlayerImplInternal.PlaybackInfoUpdate(this.i0);
                playbackInfoUpdate.a(1);
                this.j.a(playbackInfoUpdate);
                return;
            }
            PlaybackInfo playbackInfoG = this.i0;
            int i3 = playbackInfoG.f5965e;
            if (i3 == 3 || (i3 == 4 && !timeline.p())) {
                playbackInfoG = this.i0.g(2);
            }
            int iF = f();
            PlaybackInfo playbackInfoQ = Q(playbackInfoG, timeline, R(timeline, i2, j));
            long jI = Util.I(j);
            ExoPlayerImplInternal exoPlayerImplInternal = this.k;
            exoPlayerImplInternal.getClass();
            exoPlayerImplInternal.i0.obtainMessage(3, new ExoPlayerImplInternal.SeekPosition(timeline, i2, jI)).a();
            a0(playbackInfoQ, 0, true, 1, M(playbackInfoQ), iF, z2);
        }
    }

    public final MediaMetadata I() {
        Timeline currentTimeline = getCurrentTimeline();
        if (currentTimeline.p()) {
            return this.h0;
        }
        MediaItem mediaItem = currentTimeline.m(f(), this.f5377a, 0L).f5515c;
        MediaMetadata.Builder builderA = this.h0.a();
        MediaMetadata mediaMetadata = mediaItem.d;
        builderA.getClass();
        if (mediaMetadata != null) {
            CharSequence charSequence = mediaMetadata.f5465a;
            if (charSequence != null) {
                builderA.f5476a = charSequence;
            }
            CharSequence charSequence2 = mediaMetadata.f5466b;
            if (charSequence2 != null) {
                builderA.f5477b = charSequence2;
            }
            CharSequence charSequence3 = mediaMetadata.f5467c;
            if (charSequence3 != null) {
                builderA.f5478c = charSequence3;
            }
            CharSequence charSequence4 = mediaMetadata.d;
            if (charSequence4 != null) {
                builderA.d = charSequence4;
            }
            CharSequence charSequence5 = mediaMetadata.f5468e;
            if (charSequence5 != null) {
                builderA.f5479e = charSequence5;
            }
            byte[] bArr = mediaMetadata.f;
            if (bArr != null) {
                builderA.f = bArr == null ? null : (byte[]) bArr.clone();
                builderA.g = mediaMetadata.g;
            }
            Integer num = mediaMetadata.f5469h;
            if (num != null) {
                builderA.f5480h = num;
            }
            Integer num2 = mediaMetadata.f5470i;
            if (num2 != null) {
                builderA.f5481i = num2;
            }
            Integer num3 = mediaMetadata.j;
            if (num3 != null) {
                builderA.j = num3;
            }
            Boolean bool = mediaMetadata.k;
            if (bool != null) {
                builderA.k = bool;
            }
            Integer num4 = mediaMetadata.f5471l;
            if (num4 != null) {
                builderA.f5482l = num4;
            }
            Integer num5 = mediaMetadata.m;
            if (num5 != null) {
                builderA.f5482l = num5;
            }
            Integer num6 = mediaMetadata.f5472n;
            if (num6 != null) {
                builderA.m = num6;
            }
            Integer num7 = mediaMetadata.o;
            if (num7 != null) {
                builderA.f5483n = num7;
            }
            Integer num8 = mediaMetadata.f5473p;
            if (num8 != null) {
                builderA.o = num8;
            }
            Integer num9 = mediaMetadata.q;
            if (num9 != null) {
                builderA.f5484p = num9;
            }
            Integer num10 = mediaMetadata.r;
            if (num10 != null) {
                builderA.q = num10;
            }
            CharSequence charSequence6 = mediaMetadata.s;
            if (charSequence6 != null) {
                builderA.r = charSequence6;
            }
            CharSequence charSequence7 = mediaMetadata.t;
            if (charSequence7 != null) {
                builderA.s = charSequence7;
            }
            CharSequence charSequence8 = mediaMetadata.f5474u;
            if (charSequence8 != null) {
                builderA.t = charSequence8;
            }
            CharSequence charSequence9 = mediaMetadata.v;
            if (charSequence9 != null) {
                builderA.f5485u = charSequence9;
            }
            CharSequence charSequence10 = mediaMetadata.f5475w;
            if (charSequence10 != null) {
                builderA.v = charSequence10;
            }
            Integer num11 = mediaMetadata.x;
            if (num11 != null) {
                builderA.f5486w = num11;
            }
        }
        return new MediaMetadata(builderA);
    }

    public final void J() {
        c0();
        T();
        W(null);
        S(0, 0);
    }

    public final PlayerMessage K(PlayerMessage.Target target) {
        int iN = N(this.i0);
        Timeline timeline = this.i0.f5962a;
        if (iN == -1) {
            iN = 0;
        }
        ExoPlayerImplInternal exoPlayerImplInternal = this.k;
        return new PlayerMessage(exoPlayerImplInternal, target, timeline, iN, this.x, exoPlayerImplInternal.k0);
    }

    public final long L(PlaybackInfo playbackInfo) {
        if (!playbackInfo.f5963b.b()) {
            return Util.T(M(playbackInfo));
        }
        Object obj = playbackInfo.f5963b.f6384a;
        Timeline timeline = playbackInfo.f5962a;
        Timeline.Period period = this.f5886n;
        timeline.g(obj, period);
        long j = playbackInfo.f5964c;
        if (j == -9223372036854775807L) {
            return Util.T(timeline.m(N(playbackInfo), this.f5377a, 0L).k);
        }
        return Util.T(j) + Util.T(period.f5511e);
    }

    public final long M(PlaybackInfo playbackInfo) {
        if (playbackInfo.f5962a.p()) {
            return Util.I(this.k0);
        }
        long j = playbackInfo.f5970p ? playbackInfo.j() : playbackInfo.s;
        if (playbackInfo.f5963b.b()) {
            return j;
        }
        Timeline timeline = playbackInfo.f5962a;
        Object obj = playbackInfo.f5963b.f6384a;
        Timeline.Period period = this.f5886n;
        timeline.g(obj, period);
        return j + period.f5511e;
    }

    public final int N(PlaybackInfo playbackInfo) {
        if (playbackInfo.f5962a.p()) {
            return this.j0;
        }
        return playbackInfo.f5962a.g(playbackInfo.f5963b.f6384a, this.f5886n).f5510c;
    }

    public final boolean P() {
        return true;
    }

    public final PlaybackInfo Q(PlaybackInfo playbackInfo, Timeline timeline, Pair pair) {
        Assertions.b(timeline.p() || pair != null);
        Timeline timeline2 = playbackInfo.f5962a;
        long jL = L(playbackInfo);
        PlaybackInfo playbackInfoH = playbackInfo.h(timeline);
        if (timeline.p()) {
            MediaSource.MediaPeriodId mediaPeriodId = PlaybackInfo.f5961u;
            long jI = Util.I(this.k0);
            PlaybackInfo playbackInfoB = playbackInfoH.c(mediaPeriodId, jI, jI, jI, 0L, TrackGroupArray.d, this.f5877b, ImmutableList.x()).b(mediaPeriodId);
            playbackInfoB.q = playbackInfoB.s;
            return playbackInfoB;
        }
        Object obj = playbackInfoH.f5963b.f6384a;
        boolean zEquals = obj.equals(pair.first);
        MediaSource.MediaPeriodId mediaPeriodId2 = !zEquals ? new MediaSource.MediaPeriodId(pair.first) : playbackInfoH.f5963b;
        long jLongValue = ((Long) pair.second).longValue();
        long jI2 = Util.I(jL);
        if (!timeline2.p()) {
            jI2 -= timeline2.g(obj, this.f5886n).f5511e;
        }
        if (!zEquals || jLongValue < jI2) {
            MediaSource.MediaPeriodId mediaPeriodId3 = mediaPeriodId2;
            Assertions.e(!mediaPeriodId3.b());
            PlaybackInfo playbackInfoB2 = playbackInfoH.c(mediaPeriodId3, jLongValue, jLongValue, jLongValue, 0L, !zEquals ? TrackGroupArray.d : playbackInfoH.f5966h, !zEquals ? this.f5877b : playbackInfoH.f5967i, !zEquals ? ImmutableList.x() : playbackInfoH.j).b(mediaPeriodId3);
            playbackInfoB2.q = jLongValue;
            return playbackInfoB2;
        }
        if (jLongValue != jI2) {
            MediaSource.MediaPeriodId mediaPeriodId4 = mediaPeriodId2;
            Assertions.e(!mediaPeriodId4.b());
            long jMax = Math.max(0L, playbackInfoH.r - (jLongValue - jI2));
            long j = playbackInfoH.q;
            if (playbackInfoH.k.equals(playbackInfoH.f5963b)) {
                j = jLongValue + jMax;
            }
            PlaybackInfo playbackInfoC = playbackInfoH.c(mediaPeriodId4, jLongValue, jLongValue, jLongValue, jMax, playbackInfoH.f5966h, playbackInfoH.f5967i, playbackInfoH.j);
            playbackInfoC.q = j;
            return playbackInfoC;
        }
        int iB = timeline.b(playbackInfoH.k.f6384a);
        if (iB != -1 && timeline.f(iB, this.f5886n, false).f5510c == timeline.g(mediaPeriodId2.f6384a, this.f5886n).f5510c) {
            return playbackInfoH;
        }
        timeline.g(mediaPeriodId2.f6384a, this.f5886n);
        long jA = mediaPeriodId2.b() ? this.f5886n.a(mediaPeriodId2.f6385b, mediaPeriodId2.f6386c) : this.f5886n.d;
        MediaSource.MediaPeriodId mediaPeriodId5 = mediaPeriodId2;
        PlaybackInfo playbackInfoB3 = playbackInfoH.c(mediaPeriodId5, playbackInfoH.s, playbackInfoH.s, playbackInfoH.d, jA - playbackInfoH.s, playbackInfoH.f5966h, playbackInfoH.f5967i, playbackInfoH.j).b(mediaPeriodId5);
        playbackInfoB3.q = jA;
        return playbackInfoB3;
    }

    public final Pair R(Timeline timeline, int i2, long j) {
        if (timeline.p()) {
            this.j0 = i2;
            if (j == -9223372036854775807L) {
                j = 0;
            }
            this.k0 = j;
            return null;
        }
        if (i2 == -1 || i2 >= timeline.o()) {
            i2 = timeline.a(this.G);
            j = Util.T(timeline.m(i2, this.f5377a, 0L).k);
        }
        return timeline.i(this.f5377a, this.f5886n, i2, Util.I(j));
    }

    public final void S(final int i2, final int i3) {
        Size size = this.X;
        if (i2 == size.f5672a && i3 == size.f5673b) {
            return;
        }
        this.X = new Size(i2, i3);
        this.f5885l.f(24, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.h
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                int i4 = ExoPlayerImpl.l0;
                ((Player.Listener) obj).onSurfaceSizeChanged(i2, i3);
            }
        });
        U(2, 14, new Size(i2, i3));
    }

    public final void T() {
        SphericalGLSurfaceView sphericalGLSurfaceView = this.T;
        ComponentListener componentListener = this.y;
        if (sphericalGLSurfaceView != null) {
            PlayerMessage playerMessageK = K(this.f5890z);
            Assertions.e(!playerMessageK.g);
            playerMessageK.d = 10000;
            Assertions.e(!playerMessageK.g);
            playerMessageK.f5974e = null;
            playerMessageK.c();
            this.T.e0.remove(componentListener);
            this.T = null;
        }
        TextureView textureView = this.f5875V;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != componentListener) {
                Log.g("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f5875V.setSurfaceTextureListener(null);
            }
            this.f5875V = null;
        }
        SurfaceHolder surfaceHolder = this.S;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(componentListener);
            this.S = null;
        }
    }

    public final void U(int i2, int i3, Object obj) {
        for (Renderer renderer : this.g) {
            if (i2 == -1 || renderer.getTrackType() == i2) {
                PlayerMessage playerMessageK = K(renderer);
                Assertions.e(!playerMessageK.g);
                playerMessageK.d = i3;
                Assertions.e(!playerMessageK.g);
                playerMessageK.f5974e = obj;
                playerMessageK.c();
            }
        }
    }

    public final void V(SurfaceHolder surfaceHolder) {
        this.f5874U = false;
        this.S = surfaceHolder;
        surfaceHolder.addCallback(this.y);
        Surface surface = this.S.getSurface();
        if (surface == null || !surface.isValid()) {
            S(0, 0);
        } else {
            Rect surfaceFrame = this.S.getSurfaceFrame();
            S(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    public final void W(Object obj) {
        ArrayList arrayList = new ArrayList();
        boolean z2 = false;
        for (Renderer renderer : this.g) {
            if (renderer.getTrackType() == 2) {
                PlayerMessage playerMessageK = K(renderer);
                Assertions.e(!playerMessageK.g);
                playerMessageK.d = 1;
                Assertions.e(true ^ playerMessageK.g);
                playerMessageK.f5974e = obj;
                playerMessageK.c();
                arrayList.add(playerMessageK);
            }
        }
        Object obj2 = this.f5872Q;
        if (obj2 != null && obj2 != obj) {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((PlayerMessage) it.next()).a(this.f5866E);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z2 = true;
            }
            Object obj3 = this.f5872Q;
            Surface surface = this.f5873R;
            if (obj3 == surface) {
                surface.release();
                this.f5873R = null;
            }
        }
        this.f5872Q = obj;
        if (z2) {
            X(new ExoPlaybackException(2, new ExoTimeoutException("Detaching surface timed out."), 1003));
        }
    }

    public final void X(ExoPlaybackException exoPlaybackException) {
        PlaybackInfo playbackInfo = this.i0;
        PlaybackInfo playbackInfoB = playbackInfo.b(playbackInfo.f5963b);
        playbackInfoB.q = playbackInfoB.s;
        playbackInfoB.r = 0L;
        PlaybackInfo playbackInfoG = playbackInfoB.g(1);
        if (exoPlaybackException != null) {
            playbackInfoG = playbackInfoG.e(exoPlaybackException);
        }
        this.H++;
        this.k.i0.obtainMessage(6).a();
        a0(playbackInfoG, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void Y() {
        Player.Commands commands = this.f5870N;
        int i2 = Util.f5683a;
        ExoPlayerImpl exoPlayerImpl = (ExoPlayerImpl) this.f;
        boolean zIsPlayingAd = exoPlayerImpl.isPlayingAd();
        boolean zG = exoPlayerImpl.G();
        boolean zC = exoPlayerImpl.C();
        boolean zB = exoPlayerImpl.B();
        boolean zF = exoPlayerImpl.F();
        boolean zE = exoPlayerImpl.E();
        boolean zP = exoPlayerImpl.getCurrentTimeline().p();
        Player.Commands.Builder builder = new Player.Commands.Builder();
        FlagSet flagSet = this.f5879c.f5497a;
        FlagSet.Builder builder2 = builder.f5498a;
        builder2.getClass();
        for (int i3 = 0; i3 < flagSet.f5397a.size(); i3++) {
            builder2.a(flagSet.a(i3));
        }
        boolean z2 = !zIsPlayingAd;
        builder.a(4, z2);
        builder.a(5, zG && !zIsPlayingAd);
        builder.a(6, zC && !zIsPlayingAd);
        builder.a(7, !zP && (zC || !zF || zG) && !zIsPlayingAd);
        builder.a(8, zB && !zIsPlayingAd);
        builder.a(9, !zP && (zB || (zF && zE)) && !zIsPlayingAd);
        builder.a(10, z2);
        builder.a(11, zG && !zIsPlayingAd);
        builder.a(12, zG && !zIsPlayingAd);
        Player.Commands commands2 = new Player.Commands(builder2.b());
        this.f5870N = commands2;
        if (commands2.equals(commands)) {
            return;
        }
        this.f5885l.c(13, new m(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v4 */
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
    public final void Z(int i2, int i3, boolean z2) {
        ?? r14 = (!z2 || i2 == -1) ? 0 : 1;
        int i4 = i2 == 0 ? 1 : 0;
        PlaybackInfo playbackInfo = this.i0;
        if (playbackInfo.f5968l == r14 && playbackInfo.f5969n == i4 && playbackInfo.m == i3) {
            return;
        }
        this.H++;
        PlaybackInfo playbackInfo2 = this.i0;
        boolean z3 = playbackInfo2.f5970p;
        PlaybackInfo playbackInfoA = playbackInfo2;
        if (z3) {
            playbackInfoA = playbackInfo2.a();
        }
        PlaybackInfo playbackInfoD = playbackInfoA.d(i3, i4, r14);
        this.k.i0.obtainMessage(1, r14, (i4 << 4) | i3).a();
        a0(playbackInfoD, 0, false, 5, -9223372036854775807L, -1, false);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:104:0x02d9  */
    /* JADX WARN: Code duplicated, block: B:106:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:109:0x02fd  */
    /* JADX WARN: Code duplicated, block: B:111:0x0313  */
    /* JADX WARN: Code duplicated, block: B:113:0x0324  */
    /* JADX WARN: Code duplicated, block: B:116:0x0335  */
    /* JADX WARN: Code duplicated, block: B:118:0x0343  */
    /* JADX WARN: Code duplicated, block: B:122:0x0357  */
    /* JADX WARN: Code duplicated, block: B:125:0x0369  */
    /* JADX WARN: Code duplicated, block: B:128:0x037f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0395  */
    /* JADX WARN: Code duplicated, block: B:134:0x03b0  */
    /* JADX WARN: Code duplicated, block: B:137:0x03bc A[LOOP:0: B:135:0x03b6->B:137:0x03bc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:138:0x03c6 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:39:0x0107  */
    /* JADX WARN: Code duplicated, block: B:41:0x010d  */
    /* JADX WARN: Code duplicated, block: B:45:0x011a  */
    /* JADX WARN: Code duplicated, block: B:48:0x012a  */
    /* JADX WARN: Code duplicated, block: B:51:0x0137 A[LOOP:2: B:49:0x0132->B:51:0x0137, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x0160  */
    /* JADX WARN: Code duplicated, block: B:57:0x0162  */
    /* JADX WARN: Code duplicated, block: B:60:0x016a  */
    /* JADX WARN: Code duplicated, block: B:61:0x016c  */
    /* JADX WARN: Code duplicated, block: B:64:0x0172  */
    /* JADX WARN: Code duplicated, block: B:67:0x017b  */
    /* JADX WARN: Code duplicated, block: B:68:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0181  */
    /* JADX WARN: Code duplicated, block: B:72:0x0192  */
    /* JADX WARN: Code duplicated, block: B:74:0x019f  */
    /* JADX WARN: Code duplicated, block: B:75:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:77:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:79:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:82:0x0201  */
    /* JADX WARN: Code duplicated, block: B:84:0x0209  */
    /* JADX WARN: Code duplicated, block: B:86:0x020f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0217  */
    /* JADX WARN: Code duplicated, block: B:89:0x021e  */
    /* JADX WARN: Code duplicated, block: B:92:0x024a  */
    /* JADX WARN: Code duplicated, block: B:93:0x0278  */
    /* JADX WARN: Code duplicated, block: B:96:0x0290  */
    /* JADX WARN: Code duplicated, block: B:97:0x029d  */
    /* JADX WARN: Code duplicated, block: B:99:0x02bf  */
    public final void a0(final PlaybackInfo playbackInfo, final int i2, boolean z2, final int i3, long j, int i4, boolean z3) {
        int i5;
        int i6;
        int i7;
        Pair pair;
        int i8;
        boolean zBooleanValue;
        final int iIntValue;
        final MediaItem mediaItem;
        MediaMetadata.Builder builderA;
        List list;
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
        Iterator it;
        Timeline.Period period;
        int i14;
        Object obj;
        MediaItem mediaItem2;
        Object obj2;
        int i15;
        long j2;
        long j3;
        long jO;
        long jO2;
        int iF;
        Object obj3;
        MediaItem mediaItem3;
        Object obj4;
        int i16;
        long jT;
        long jT2;
        PlaybackInfo playbackInfo2 = this.i0;
        this.i0 = playbackInfo;
        boolean zEquals2 = playbackInfo2.f5962a.equals(playbackInfo.f5962a);
        Timeline timeline = playbackInfo2.f5962a;
        Timeline timeline2 = playbackInfo.f5962a;
        if (!timeline2.p() || !timeline.p()) {
            i5 = 3;
            if (timeline2.p() != timeline.p()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else {
                MediaSource.MediaPeriodId mediaPeriodId = playbackInfo2.f5963b;
                Object obj5 = mediaPeriodId.f6384a;
                i6 = 2;
                Timeline.Period period2 = this.f5886n;
                int i17 = timeline.g(obj5, period2).f5510c;
                Timeline.Window window = this.f5377a;
                Object obj6 = timeline.m(i17, window, 0L).f5513a;
                MediaSource.MediaPeriodId mediaPeriodId2 = playbackInfo.f5963b;
                i7 = 0;
                if (!obj6.equals(timeline2.m(timeline2.g(mediaPeriodId2.f6384a, period2).f5510c, window, 0L).f5513a)) {
                    if (z2 && i3 == 0) {
                        i8 = 1;
                    } else if (z2 && i3 == 1) {
                        i8 = 2;
                    } else {
                        if (zEquals2) {
                            throw new IllegalStateException();
                        }
                        i8 = 3;
                    }
                    pair = new Pair(Boolean.TRUE, Integer.valueOf(i8));
                } else if (z2 && i3 == 0 && mediaPeriodId.d < mediaPeriodId2.d) {
                    pair = new Pair(Boolean.TRUE, 0);
                } else {
                    pair = (z2 && i3 == 1 && z3) ? new Pair(Boolean.TRUE, 2) : new Pair(Boolean.FALSE, -1);
                }
            }
            zBooleanValue = ((Boolean) pair.first).booleanValue();
            iIntValue = ((Integer) pair.second).intValue();
            if (zBooleanValue) {
                if (playbackInfo.f5962a.p()) {
                    mediaItem = null;
                } else {
                    mediaItem = playbackInfo.f5962a.m(playbackInfo.f5962a.g(playbackInfo.f5963b.f6384a, this.f5886n).f5510c, this.f5377a, 0L).f5515c;
                }
                this.h0 = MediaMetadata.y;
            } else {
                mediaItem = null;
            }
            if (zBooleanValue || !playbackInfo2.j.equals(playbackInfo.j)) {
                builderA = this.h0.a();
                list = playbackInfo.j;
                for (i9 = i7; i9 < list.size(); i9++) {
                    metadata = (Metadata) list.get(i9);
                    i10 = i7;
                    while (true) {
                        entryArr = metadata.X;
                        if (i10 < entryArr.length) {
                            entryArr[i10].n0(builderA);
                            i10++;
                        }
                    }
                }
                this.h0 = new MediaMetadata(builderA);
            }
            MediaMetadata mediaMetadataI = I();
            zEquals = mediaMetadataI.equals(this.O);
            this.O = mediaMetadataI;
            if (playbackInfo2.f5968l != playbackInfo.f5968l) {
                i11 = 1;
            } else {
                i11 = i7;
            }
            if (playbackInfo2.f5965e != playbackInfo.f5965e) {
                i12 = 1;
            } else {
                i12 = i7;
            }
            if (i12 == 0 || i11 != 0) {
                b0();
            }
            if (playbackInfo2.g != playbackInfo.g) {
                i13 = 1;
            } else {
                i13 = i7;
            }
            if (!zEquals2) {
                final int i18 = 0;
                this.f5885l.c(i7, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.l
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj7) {
                        int i19 = i2;
                        Object obj8 = playbackInfo;
                        Player.Listener listener = (Player.Listener) obj7;
                        switch (i18) {
                            case 0:
                                int i20 = ExoPlayerImpl.l0;
                                listener.onTimelineChanged(((PlaybackInfo) obj8).f5962a, i19);
                                break;
                            default:
                                int i21 = ExoPlayerImpl.l0;
                                listener.onMediaItemTransition((MediaItem) obj8, i19);
                                break;
                        }
                    }
                });
            }
            if (z2) {
                period = new Timeline.Period();
                if (playbackInfo2.f5962a.p()) {
                    i14 = i4;
                    obj = null;
                    mediaItem2 = null;
                    obj2 = null;
                    i15 = -1;
                } else {
                    Object obj7 = playbackInfo2.f5963b.f6384a;
                    playbackInfo2.f5962a.g(obj7, period);
                    int i19 = period.f5510c;
                    int iB = playbackInfo2.f5962a.b(obj7);
                    obj = playbackInfo2.f5962a.m(i19, this.f5377a, 0L).f5513a;
                    mediaItem2 = this.f5377a.f5515c;
                    obj2 = obj7;
                    i14 = i19;
                    i15 = iB;
                }
                if (i3 == 0) {
                    if (playbackInfo2.f5963b.b()) {
                        MediaSource.MediaPeriodId mediaPeriodId3 = playbackInfo2.f5963b;
                        jO = period.a(mediaPeriodId3.f6385b, mediaPeriodId3.f6386c);
                        jO2 = O(playbackInfo2);
                    } else {
                        if (playbackInfo2.f5963b.f6387e != -1) {
                            jO = O(this.i0);
                        } else {
                            j2 = period.f5511e;
                            j3 = period.d;
                            jO = j2 + j3;
                        }
                        jO2 = jO;
                    }
                } else if (playbackInfo2.f5963b.b()) {
                    jO = playbackInfo2.s;
                    jO2 = O(playbackInfo2);
                } else {
                    j2 = period.f5511e;
                    j3 = playbackInfo2.s;
                    jO = j2 + j3;
                    jO2 = jO;
                }
                long jT3 = Util.T(jO);
                long jT4 = Util.T(jO2);
                MediaSource.MediaPeriodId mediaPeriodId4 = playbackInfo2.f5963b;
                final Player.PositionInfo positionInfo = new Player.PositionInfo(obj, i14, mediaItem2, obj2, i15, jT3, jT4, mediaPeriodId4.f6385b, mediaPeriodId4.f6386c);
                iF = f();
                if (this.i0.f5962a.p()) {
                    obj3 = null;
                    mediaItem3 = null;
                    obj4 = null;
                    i16 = -1;
                } else {
                    PlaybackInfo playbackInfo3 = this.i0;
                    Object obj8 = playbackInfo3.f5963b.f6384a;
                    playbackInfo3.f5962a.g(obj8, this.f5886n);
                    int iB2 = this.i0.f5962a.b(obj8);
                    Timeline timeline3 = this.i0.f5962a;
                    Timeline.Window window2 = this.f5377a;
                    i16 = iB2;
                    obj4 = obj8;
                    obj3 = timeline3.m(iF, window2, 0L).f5513a;
                    mediaItem3 = window2.f5515c;
                }
                jT = Util.T(j);
                if (this.i0.f5963b.b()) {
                    jT2 = Util.T(O(this.i0));
                } else {
                    jT2 = jT;
                }
                MediaSource.MediaPeriodId mediaPeriodId5 = this.i0.f5963b;
                final Player.PositionInfo positionInfo2 = new Player.PositionInfo(obj3, iF, mediaItem3, obj4, i16, jT, jT2, mediaPeriodId5.f6385b, mediaPeriodId5.f6386c);
                this.f5885l.c(11, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.o
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj9) {
                        Player.Listener listener = (Player.Listener) obj9;
                        int i20 = ExoPlayerImpl.l0;
                        int i21 = i3;
                        listener.onPositionDiscontinuity(i21);
                        listener.onPositionDiscontinuity(positionInfo, positionInfo2, i21);
                    }
                });
            } else {
                zBooleanValue = zBooleanValue;
                zEquals = zEquals;
                i12 = i12;
            }
            if (zBooleanValue) {
                final int i20 = 1;
                this.f5885l.c(1, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.l
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj9) {
                        int i110 = iIntValue;
                        Object obj10 = mediaItem;
                        Player.Listener listener = (Player.Listener) obj9;
                        switch (i20) {
                            case 0:
                                int i21 = ExoPlayerImpl.l0;
                                listener.onTimelineChanged(((PlaybackInfo) obj10).f5962a, i110);
                                break;
                            default:
                                int i22 = ExoPlayerImpl.l0;
                                listener.onMediaItemTransition((MediaItem) obj10, i110);
                                break;
                        }
                    }
                });
            }
            if (playbackInfo2.f != playbackInfo.f) {
                final int i21 = 8;
                this.f5885l.c(10, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.e
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj9) {
                        PlaybackInfo playbackInfo4 = playbackInfo;
                        Player.Listener listener = (Player.Listener) obj9;
                        switch (i21) {
                            case 0:
                                int i22 = ExoPlayerImpl.l0;
                                listener.onTracksChanged(playbackInfo4.f5967i.d);
                                break;
                            case 1:
                                int i23 = ExoPlayerImpl.l0;
                                listener.onLoadingChanged(playbackInfo4.g);
                                listener.onIsLoadingChanged(playbackInfo4.g);
                                break;
                            case 2:
                                int i24 = ExoPlayerImpl.l0;
                                listener.onPlayerStateChanged(playbackInfo4.f5968l, playbackInfo4.f5965e);
                                break;
                            case 3:
                                int i25 = ExoPlayerImpl.l0;
                                listener.onPlaybackStateChanged(playbackInfo4.f5965e);
                                break;
                            case 4:
                                int i26 = ExoPlayerImpl.l0;
                                listener.onPlayWhenReadyChanged(playbackInfo4.f5968l, playbackInfo4.m);
                                break;
                            case 5:
                                int i27 = ExoPlayerImpl.l0;
                                listener.onPlaybackSuppressionReasonChanged(playbackInfo4.f5969n);
                                break;
                            case 6:
                                int i28 = ExoPlayerImpl.l0;
                                listener.onIsPlayingChanged(playbackInfo4.k());
                                break;
                            case 7:
                                int i29 = ExoPlayerImpl.l0;
                                listener.onPlaybackParametersChanged(playbackInfo4.o);
                                break;
                            case 8:
                                int i30 = ExoPlayerImpl.l0;
                                listener.onPlayerErrorChanged(playbackInfo4.f);
                                break;
                            default:
                                int i31 = ExoPlayerImpl.l0;
                                listener.onPlayerError(playbackInfo4.f);
                                break;
                        }
                    }
                });
                if (playbackInfo.f != null) {
                    final int i22 = 9;
                    this.f5885l.c(10, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.e
                        @Override // androidx.media3.common.util.ListenerSet.Event
                        public final void invoke(Object obj9) {
                            PlaybackInfo playbackInfo4 = playbackInfo;
                            Player.Listener listener = (Player.Listener) obj9;
                            switch (i22) {
                                case 0:
                                    int i23 = ExoPlayerImpl.l0;
                                    listener.onTracksChanged(playbackInfo4.f5967i.d);
                                    break;
                                case 1:
                                    int i24 = ExoPlayerImpl.l0;
                                    listener.onLoadingChanged(playbackInfo4.g);
                                    listener.onIsLoadingChanged(playbackInfo4.g);
                                    break;
                                case 2:
                                    int i25 = ExoPlayerImpl.l0;
                                    listener.onPlayerStateChanged(playbackInfo4.f5968l, playbackInfo4.f5965e);
                                    break;
                                case 3:
                                    int i26 = ExoPlayerImpl.l0;
                                    listener.onPlaybackStateChanged(playbackInfo4.f5965e);
                                    break;
                                case 4:
                                    int i27 = ExoPlayerImpl.l0;
                                    listener.onPlayWhenReadyChanged(playbackInfo4.f5968l, playbackInfo4.m);
                                    break;
                                case 5:
                                    int i28 = ExoPlayerImpl.l0;
                                    listener.onPlaybackSuppressionReasonChanged(playbackInfo4.f5969n);
                                    break;
                                case 6:
                                    int i29 = ExoPlayerImpl.l0;
                                    listener.onIsPlayingChanged(playbackInfo4.k());
                                    break;
                                case 7:
                                    int i210 = ExoPlayerImpl.l0;
                                    listener.onPlaybackParametersChanged(playbackInfo4.o);
                                    break;
                                case 8:
                                    int i30 = ExoPlayerImpl.l0;
                                    listener.onPlayerErrorChanged(playbackInfo4.f);
                                    break;
                                default:
                                    int i31 = ExoPlayerImpl.l0;
                                    listener.onPlayerError(playbackInfo4.f);
                                    break;
                            }
                        }
                    });
                }
            }
            trackSelectorResult = playbackInfo2.f5967i;
            trackSelectorResult2 = playbackInfo.f5967i;
            if (trackSelectorResult != trackSelectorResult2) {
                this.f5883h.d(trackSelectorResult2.f6542e);
                final int i23 = 0;
                this.f5885l.c(i6, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.e
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj9) {
                        PlaybackInfo playbackInfo4 = playbackInfo;
                        Player.Listener listener = (Player.Listener) obj9;
                        switch (i23) {
                            case 0:
                                int i24 = ExoPlayerImpl.l0;
                                listener.onTracksChanged(playbackInfo4.f5967i.d);
                                break;
                            case 1:
                                int i25 = ExoPlayerImpl.l0;
                                listener.onLoadingChanged(playbackInfo4.g);
                                listener.onIsLoadingChanged(playbackInfo4.g);
                                break;
                            case 2:
                                int i26 = ExoPlayerImpl.l0;
                                listener.onPlayerStateChanged(playbackInfo4.f5968l, playbackInfo4.f5965e);
                                break;
                            case 3:
                                int i27 = ExoPlayerImpl.l0;
                                listener.onPlaybackStateChanged(playbackInfo4.f5965e);
                                break;
                            case 4:
                                int i28 = ExoPlayerImpl.l0;
                                listener.onPlayWhenReadyChanged(playbackInfo4.f5968l, playbackInfo4.m);
                                break;
                            case 5:
                                int i29 = ExoPlayerImpl.l0;
                                listener.onPlaybackSuppressionReasonChanged(playbackInfo4.f5969n);
                                break;
                            case 6:
                                int i210 = ExoPlayerImpl.l0;
                                listener.onIsPlayingChanged(playbackInfo4.k());
                                break;
                            case 7:
                                int i211 = ExoPlayerImpl.l0;
                                listener.onPlaybackParametersChanged(playbackInfo4.o);
                                break;
                            case 8:
                                int i30 = ExoPlayerImpl.l0;
                                listener.onPlayerErrorChanged(playbackInfo4.f);
                                break;
                            default:
                                int i31 = ExoPlayerImpl.l0;
                                listener.onPlayerError(playbackInfo4.f);
                                break;
                        }
                    }
                });
            }
            if (!zEquals) {
                this.f5885l.c(14, new f(this.O, 0));
            }
            if (i13 != 0) {
                final int i24 = 1;
                this.f5885l.c(i5, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.e
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj9) {
                        PlaybackInfo playbackInfo4 = playbackInfo;
                        Player.Listener listener = (Player.Listener) obj9;
                        switch (i24) {
                            case 0:
                                int i25 = ExoPlayerImpl.l0;
                                listener.onTracksChanged(playbackInfo4.f5967i.d);
                                break;
                            case 1:
                                int i26 = ExoPlayerImpl.l0;
                                listener.onLoadingChanged(playbackInfo4.g);
                                listener.onIsLoadingChanged(playbackInfo4.g);
                                break;
                            case 2:
                                int i27 = ExoPlayerImpl.l0;
                                listener.onPlayerStateChanged(playbackInfo4.f5968l, playbackInfo4.f5965e);
                                break;
                            case 3:
                                int i28 = ExoPlayerImpl.l0;
                                listener.onPlaybackStateChanged(playbackInfo4.f5965e);
                                break;
                            case 4:
                                int i29 = ExoPlayerImpl.l0;
                                listener.onPlayWhenReadyChanged(playbackInfo4.f5968l, playbackInfo4.m);
                                break;
                            case 5:
                                int i210 = ExoPlayerImpl.l0;
                                listener.onPlaybackSuppressionReasonChanged(playbackInfo4.f5969n);
                                break;
                            case 6:
                                int i211 = ExoPlayerImpl.l0;
                                listener.onIsPlayingChanged(playbackInfo4.k());
                                break;
                            case 7:
                                int i212 = ExoPlayerImpl.l0;
                                listener.onPlaybackParametersChanged(playbackInfo4.o);
                                break;
                            case 8:
                                int i30 = ExoPlayerImpl.l0;
                                listener.onPlayerErrorChanged(playbackInfo4.f);
                                break;
                            default:
                                int i31 = ExoPlayerImpl.l0;
                                listener.onPlayerError(playbackInfo4.f);
                                break;
                        }
                    }
                });
            }
            if (i12 == 0 || i11 != 0) {
                final int i25 = 2;
                this.f5885l.c(-1, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.e
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj9) {
                        PlaybackInfo playbackInfo4 = playbackInfo;
                        Player.Listener listener = (Player.Listener) obj9;
                        switch (i25) {
                            case 0:
                                int i26 = ExoPlayerImpl.l0;
                                listener.onTracksChanged(playbackInfo4.f5967i.d);
                                break;
                            case 1:
                                int i27 = ExoPlayerImpl.l0;
                                listener.onLoadingChanged(playbackInfo4.g);
                                listener.onIsLoadingChanged(playbackInfo4.g);
                                break;
                            case 2:
                                int i28 = ExoPlayerImpl.l0;
                                listener.onPlayerStateChanged(playbackInfo4.f5968l, playbackInfo4.f5965e);
                                break;
                            case 3:
                                int i29 = ExoPlayerImpl.l0;
                                listener.onPlaybackStateChanged(playbackInfo4.f5965e);
                                break;
                            case 4:
                                int i210 = ExoPlayerImpl.l0;
                                listener.onPlayWhenReadyChanged(playbackInfo4.f5968l, playbackInfo4.m);
                                break;
                            case 5:
                                int i211 = ExoPlayerImpl.l0;
                                listener.onPlaybackSuppressionReasonChanged(playbackInfo4.f5969n);
                                break;
                            case 6:
                                int i212 = ExoPlayerImpl.l0;
                                listener.onIsPlayingChanged(playbackInfo4.k());
                                break;
                            case 7:
                                int i213 = ExoPlayerImpl.l0;
                                listener.onPlaybackParametersChanged(playbackInfo4.o);
                                break;
                            case 8:
                                int i30 = ExoPlayerImpl.l0;
                                listener.onPlayerErrorChanged(playbackInfo4.f);
                                break;
                            default:
                                int i31 = ExoPlayerImpl.l0;
                                listener.onPlayerError(playbackInfo4.f);
                                break;
                        }
                    }
                });
            }
            if (i12 != 0) {
                final int i26 = 3;
                this.f5885l.c(4, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.e
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj9) {
                        PlaybackInfo playbackInfo4 = playbackInfo;
                        Player.Listener listener = (Player.Listener) obj9;
                        switch (i26) {
                            case 0:
                                int i27 = ExoPlayerImpl.l0;
                                listener.onTracksChanged(playbackInfo4.f5967i.d);
                                break;
                            case 1:
                                int i28 = ExoPlayerImpl.l0;
                                listener.onLoadingChanged(playbackInfo4.g);
                                listener.onIsLoadingChanged(playbackInfo4.g);
                                break;
                            case 2:
                                int i29 = ExoPlayerImpl.l0;
                                listener.onPlayerStateChanged(playbackInfo4.f5968l, playbackInfo4.f5965e);
                                break;
                            case 3:
                                int i210 = ExoPlayerImpl.l0;
                                listener.onPlaybackStateChanged(playbackInfo4.f5965e);
                                break;
                            case 4:
                                int i211 = ExoPlayerImpl.l0;
                                listener.onPlayWhenReadyChanged(playbackInfo4.f5968l, playbackInfo4.m);
                                break;
                            case 5:
                                int i212 = ExoPlayerImpl.l0;
                                listener.onPlaybackSuppressionReasonChanged(playbackInfo4.f5969n);
                                break;
                            case 6:
                                int i213 = ExoPlayerImpl.l0;
                                listener.onIsPlayingChanged(playbackInfo4.k());
                                break;
                            case 7:
                                int i214 = ExoPlayerImpl.l0;
                                listener.onPlaybackParametersChanged(playbackInfo4.o);
                                break;
                            case 8:
                                int i30 = ExoPlayerImpl.l0;
                                listener.onPlayerErrorChanged(playbackInfo4.f);
                                break;
                            default:
                                int i31 = ExoPlayerImpl.l0;
                                listener.onPlayerError(playbackInfo4.f);
                                break;
                        }
                    }
                });
            }
            if (i11 == 0 || playbackInfo2.m != playbackInfo.m) {
                final int i27 = 4;
                this.f5885l.c(5, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.e
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj9) {
                        PlaybackInfo playbackInfo4 = playbackInfo;
                        Player.Listener listener = (Player.Listener) obj9;
                        switch (i27) {
                            case 0:
                                int i28 = ExoPlayerImpl.l0;
                                listener.onTracksChanged(playbackInfo4.f5967i.d);
                                break;
                            case 1:
                                int i29 = ExoPlayerImpl.l0;
                                listener.onLoadingChanged(playbackInfo4.g);
                                listener.onIsLoadingChanged(playbackInfo4.g);
                                break;
                            case 2:
                                int i210 = ExoPlayerImpl.l0;
                                listener.onPlayerStateChanged(playbackInfo4.f5968l, playbackInfo4.f5965e);
                                break;
                            case 3:
                                int i211 = ExoPlayerImpl.l0;
                                listener.onPlaybackStateChanged(playbackInfo4.f5965e);
                                break;
                            case 4:
                                int i212 = ExoPlayerImpl.l0;
                                listener.onPlayWhenReadyChanged(playbackInfo4.f5968l, playbackInfo4.m);
                                break;
                            case 5:
                                int i213 = ExoPlayerImpl.l0;
                                listener.onPlaybackSuppressionReasonChanged(playbackInfo4.f5969n);
                                break;
                            case 6:
                                int i214 = ExoPlayerImpl.l0;
                                listener.onIsPlayingChanged(playbackInfo4.k());
                                break;
                            case 7:
                                int i215 = ExoPlayerImpl.l0;
                                listener.onPlaybackParametersChanged(playbackInfo4.o);
                                break;
                            case 8:
                                int i30 = ExoPlayerImpl.l0;
                                listener.onPlayerErrorChanged(playbackInfo4.f);
                                break;
                            default:
                                int i31 = ExoPlayerImpl.l0;
                                listener.onPlayerError(playbackInfo4.f);
                                break;
                        }
                    }
                });
            }
            if (playbackInfo2.f5969n != playbackInfo.f5969n) {
                final int i28 = 5;
                this.f5885l.c(6, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.e
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj9) {
                        PlaybackInfo playbackInfo4 = playbackInfo;
                        Player.Listener listener = (Player.Listener) obj9;
                        switch (i28) {
                            case 0:
                                int i29 = ExoPlayerImpl.l0;
                                listener.onTracksChanged(playbackInfo4.f5967i.d);
                                break;
                            case 1:
                                int i210 = ExoPlayerImpl.l0;
                                listener.onLoadingChanged(playbackInfo4.g);
                                listener.onIsLoadingChanged(playbackInfo4.g);
                                break;
                            case 2:
                                int i211 = ExoPlayerImpl.l0;
                                listener.onPlayerStateChanged(playbackInfo4.f5968l, playbackInfo4.f5965e);
                                break;
                            case 3:
                                int i212 = ExoPlayerImpl.l0;
                                listener.onPlaybackStateChanged(playbackInfo4.f5965e);
                                break;
                            case 4:
                                int i213 = ExoPlayerImpl.l0;
                                listener.onPlayWhenReadyChanged(playbackInfo4.f5968l, playbackInfo4.m);
                                break;
                            case 5:
                                int i214 = ExoPlayerImpl.l0;
                                listener.onPlaybackSuppressionReasonChanged(playbackInfo4.f5969n);
                                break;
                            case 6:
                                int i215 = ExoPlayerImpl.l0;
                                listener.onIsPlayingChanged(playbackInfo4.k());
                                break;
                            case 7:
                                int i216 = ExoPlayerImpl.l0;
                                listener.onPlaybackParametersChanged(playbackInfo4.o);
                                break;
                            case 8:
                                int i30 = ExoPlayerImpl.l0;
                                listener.onPlayerErrorChanged(playbackInfo4.f);
                                break;
                            default:
                                int i31 = ExoPlayerImpl.l0;
                                listener.onPlayerError(playbackInfo4.f);
                                break;
                        }
                    }
                });
            }
            if (playbackInfo2.k() != playbackInfo.k()) {
                final int i29 = 6;
                this.f5885l.c(7, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.e
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj9) {
                        PlaybackInfo playbackInfo4 = playbackInfo;
                        Player.Listener listener = (Player.Listener) obj9;
                        switch (i29) {
                            case 0:
                                int i210 = ExoPlayerImpl.l0;
                                listener.onTracksChanged(playbackInfo4.f5967i.d);
                                break;
                            case 1:
                                int i211 = ExoPlayerImpl.l0;
                                listener.onLoadingChanged(playbackInfo4.g);
                                listener.onIsLoadingChanged(playbackInfo4.g);
                                break;
                            case 2:
                                int i212 = ExoPlayerImpl.l0;
                                listener.onPlayerStateChanged(playbackInfo4.f5968l, playbackInfo4.f5965e);
                                break;
                            case 3:
                                int i213 = ExoPlayerImpl.l0;
                                listener.onPlaybackStateChanged(playbackInfo4.f5965e);
                                break;
                            case 4:
                                int i214 = ExoPlayerImpl.l0;
                                listener.onPlayWhenReadyChanged(playbackInfo4.f5968l, playbackInfo4.m);
                                break;
                            case 5:
                                int i215 = ExoPlayerImpl.l0;
                                listener.onPlaybackSuppressionReasonChanged(playbackInfo4.f5969n);
                                break;
                            case 6:
                                int i216 = ExoPlayerImpl.l0;
                                listener.onIsPlayingChanged(playbackInfo4.k());
                                break;
                            case 7:
                                int i217 = ExoPlayerImpl.l0;
                                listener.onPlaybackParametersChanged(playbackInfo4.o);
                                break;
                            case 8:
                                int i30 = ExoPlayerImpl.l0;
                                listener.onPlayerErrorChanged(playbackInfo4.f);
                                break;
                            default:
                                int i31 = ExoPlayerImpl.l0;
                                listener.onPlayerError(playbackInfo4.f);
                                break;
                        }
                    }
                });
            }
            if (!playbackInfo2.o.equals(playbackInfo.o)) {
                final int i30 = 7;
                this.f5885l.c(12, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.e
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj9) {
                        PlaybackInfo playbackInfo4 = playbackInfo;
                        Player.Listener listener = (Player.Listener) obj9;
                        switch (i30) {
                            case 0:
                                int i210 = ExoPlayerImpl.l0;
                                listener.onTracksChanged(playbackInfo4.f5967i.d);
                                break;
                            case 1:
                                int i211 = ExoPlayerImpl.l0;
                                listener.onLoadingChanged(playbackInfo4.g);
                                listener.onIsLoadingChanged(playbackInfo4.g);
                                break;
                            case 2:
                                int i212 = ExoPlayerImpl.l0;
                                listener.onPlayerStateChanged(playbackInfo4.f5968l, playbackInfo4.f5965e);
                                break;
                            case 3:
                                int i213 = ExoPlayerImpl.l0;
                                listener.onPlaybackStateChanged(playbackInfo4.f5965e);
                                break;
                            case 4:
                                int i214 = ExoPlayerImpl.l0;
                                listener.onPlayWhenReadyChanged(playbackInfo4.f5968l, playbackInfo4.m);
                                break;
                            case 5:
                                int i215 = ExoPlayerImpl.l0;
                                listener.onPlaybackSuppressionReasonChanged(playbackInfo4.f5969n);
                                break;
                            case 6:
                                int i216 = ExoPlayerImpl.l0;
                                listener.onIsPlayingChanged(playbackInfo4.k());
                                break;
                            case 7:
                                int i217 = ExoPlayerImpl.l0;
                                listener.onPlaybackParametersChanged(playbackInfo4.o);
                                break;
                            case 8:
                                int i31 = ExoPlayerImpl.l0;
                                listener.onPlayerErrorChanged(playbackInfo4.f);
                                break;
                            default:
                                int i32 = ExoPlayerImpl.l0;
                                listener.onPlayerError(playbackInfo4.f);
                                break;
                        }
                    }
                });
            }
            Y();
            this.f5885l.b();
            if (playbackInfo2.f5970p != playbackInfo.f5970p) {
                it = this.m.iterator();
                while (it.hasNext()) {
                    ((ExoPlayer.AudioOffloadListener) it.next()).s();
                }
            }
        }
        pair = new Pair(Boolean.FALSE, -1);
        i5 = 3;
        i6 = 2;
        i7 = 0;
        zBooleanValue = ((Boolean) pair.first).booleanValue();
        iIntValue = ((Integer) pair.second).intValue();
        if (zBooleanValue) {
            if (playbackInfo.f5962a.p()) {
                mediaItem = playbackInfo.f5962a.m(playbackInfo.f5962a.g(playbackInfo.f5963b.f6384a, this.f5886n).f5510c, this.f5377a, 0L).f5515c;
            } else {
                mediaItem = null;
            }
            this.h0 = MediaMetadata.y;
        } else {
            mediaItem = null;
        }
        if (zBooleanValue) {
            builderA = this.h0.a();
            list = playbackInfo.j;
            while (i9 < list.size()) {
                metadata = (Metadata) list.get(i9);
                i10 = i7;
                while (true) {
                    entryArr = metadata.X;
                    if (i10 < entryArr.length) {
                        entryArr[i10].n0(builderA);
                        i10++;
                    }
                }
            }
            this.h0 = new MediaMetadata(builderA);
        } else {
            builderA = this.h0.a();
            list = playbackInfo.j;
            while (i9 < list.size()) {
                metadata = (Metadata) list.get(i9);
                i10 = i7;
                while (true) {
                    entryArr = metadata.X;
                    if (i10 < entryArr.length) {
                        entryArr[i10].n0(builderA);
                        i10++;
                    }
                }
            }
            this.h0 = new MediaMetadata(builderA);
        }
        MediaMetadata mediaMetadataI2 = I();
        zEquals = mediaMetadataI2.equals(this.O);
        this.O = mediaMetadataI2;
        if (playbackInfo2.f5968l != playbackInfo.f5968l) {
            i11 = 1;
        } else {
            i11 = i7;
        }
        if (playbackInfo2.f5965e != playbackInfo.f5965e) {
            i12 = 1;
        } else {
            i12 = i7;
        }
        if (i12 == 0) {
            b0();
        } else {
            b0();
        }
        if (playbackInfo2.g != playbackInfo.g) {
            i13 = 1;
        } else {
            i13 = i7;
        }
        if (!zEquals2) {
            final int i110 = 0;
            this.f5885l.c(i7, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.l
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj9) {
                    int i111 = i2;
                    Object obj10 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj9;
                    switch (i110) {
                        case 0:
                            int i210 = ExoPlayerImpl.l0;
                            listener.onTimelineChanged(((PlaybackInfo) obj10).f5962a, i111);
                            break;
                        default:
                            int i211 = ExoPlayerImpl.l0;
                            listener.onMediaItemTransition((MediaItem) obj10, i111);
                            break;
                    }
                }
            });
        }
        if (z2) {
            period = new Timeline.Period();
            if (playbackInfo2.f5962a.p()) {
                Object obj9 = playbackInfo2.f5963b.f6384a;
                playbackInfo2.f5962a.g(obj9, period);
                int i111 = period.f5510c;
                int iB3 = playbackInfo2.f5962a.b(obj9);
                obj = playbackInfo2.f5962a.m(i111, this.f5377a, 0L).f5513a;
                mediaItem2 = this.f5377a.f5515c;
                obj2 = obj9;
                i14 = i111;
                i15 = iB3;
            } else {
                i14 = i4;
                obj = null;
                mediaItem2 = null;
                obj2 = null;
                i15 = -1;
            }
            if (i3 == 0) {
                if (playbackInfo2.f5963b.b()) {
                    MediaSource.MediaPeriodId mediaPeriodId6 = playbackInfo2.f5963b;
                    jO = period.a(mediaPeriodId6.f6385b, mediaPeriodId6.f6386c);
                    jO2 = O(playbackInfo2);
                } else {
                    if (playbackInfo2.f5963b.f6387e != -1) {
                        jO = O(this.i0);
                    } else {
                        j2 = period.f5511e;
                        j3 = period.d;
                        jO = j2 + j3;
                    }
                    jO2 = jO;
                }
            } else if (playbackInfo2.f5963b.b()) {
                jO = playbackInfo2.s;
                jO2 = O(playbackInfo2);
            } else {
                j2 = period.f5511e;
                j3 = playbackInfo2.s;
                jO = j2 + j3;
                jO2 = jO;
            }
            long jT5 = Util.T(jO);
            long jT6 = Util.T(jO2);
            MediaSource.MediaPeriodId mediaPeriodId7 = playbackInfo2.f5963b;
            final Player.PositionInfo positionInfo3 = new Player.PositionInfo(obj, i14, mediaItem2, obj2, i15, jT5, jT6, mediaPeriodId7.f6385b, mediaPeriodId7.f6386c);
            iF = f();
            if (this.i0.f5962a.p()) {
                PlaybackInfo playbackInfo4 = this.i0;
                Object obj10 = playbackInfo4.f5963b.f6384a;
                playbackInfo4.f5962a.g(obj10, this.f5886n);
                int iB4 = this.i0.f5962a.b(obj10);
                Timeline timeline4 = this.i0.f5962a;
                Timeline.Window window3 = this.f5377a;
                i16 = iB4;
                obj4 = obj10;
                obj3 = timeline4.m(iF, window3, 0L).f5513a;
                mediaItem3 = window3.f5515c;
            } else {
                obj3 = null;
                mediaItem3 = null;
                obj4 = null;
                i16 = -1;
            }
            jT = Util.T(j);
            if (this.i0.f5963b.b()) {
                jT2 = Util.T(O(this.i0));
            } else {
                jT2 = jT;
            }
            MediaSource.MediaPeriodId mediaPeriodId8 = this.i0.f5963b;
            final Player.PositionInfo positionInfo4 = new Player.PositionInfo(obj3, iF, mediaItem3, obj4, i16, jT, jT2, mediaPeriodId8.f6385b, mediaPeriodId8.f6386c);
            this.f5885l.c(11, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.o
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj11) {
                    Player.Listener listener = (Player.Listener) obj11;
                    int i210 = ExoPlayerImpl.l0;
                    int i211 = i3;
                    listener.onPositionDiscontinuity(i211);
                    listener.onPositionDiscontinuity(positionInfo3, positionInfo4, i211);
                }
            });
        } else {
            zBooleanValue = zBooleanValue;
            zEquals = zEquals;
            i12 = i12;
        }
        if (zBooleanValue) {
            final int i210 = 1;
            this.f5885l.c(1, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.l
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj11) {
                    int i112 = iIntValue;
                    Object obj12 = mediaItem;
                    Player.Listener listener = (Player.Listener) obj11;
                    switch (i210) {
                        case 0:
                            int i211 = ExoPlayerImpl.l0;
                            listener.onTimelineChanged(((PlaybackInfo) obj12).f5962a, i112);
                            break;
                        default:
                            int i212 = ExoPlayerImpl.l0;
                            listener.onMediaItemTransition((MediaItem) obj12, i112);
                            break;
                    }
                }
            });
        }
        if (playbackInfo2.f != playbackInfo.f) {
            final int i211 = 8;
            this.f5885l.c(10, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.e
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj11) {
                    PlaybackInfo playbackInfo5 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj11;
                    switch (i211) {
                        case 0:
                            int i212 = ExoPlayerImpl.l0;
                            listener.onTracksChanged(playbackInfo5.f5967i.d);
                            break;
                        case 1:
                            int i213 = ExoPlayerImpl.l0;
                            listener.onLoadingChanged(playbackInfo5.g);
                            listener.onIsLoadingChanged(playbackInfo5.g);
                            break;
                        case 2:
                            int i214 = ExoPlayerImpl.l0;
                            listener.onPlayerStateChanged(playbackInfo5.f5968l, playbackInfo5.f5965e);
                            break;
                        case 3:
                            int i215 = ExoPlayerImpl.l0;
                            listener.onPlaybackStateChanged(playbackInfo5.f5965e);
                            break;
                        case 4:
                            int i216 = ExoPlayerImpl.l0;
                            listener.onPlayWhenReadyChanged(playbackInfo5.f5968l, playbackInfo5.m);
                            break;
                        case 5:
                            int i217 = ExoPlayerImpl.l0;
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo5.f5969n);
                            break;
                        case 6:
                            int i218 = ExoPlayerImpl.l0;
                            listener.onIsPlayingChanged(playbackInfo5.k());
                            break;
                        case 7:
                            int i219 = ExoPlayerImpl.l0;
                            listener.onPlaybackParametersChanged(playbackInfo5.o);
                            break;
                        case 8:
                            int i31 = ExoPlayerImpl.l0;
                            listener.onPlayerErrorChanged(playbackInfo5.f);
                            break;
                        default:
                            int i32 = ExoPlayerImpl.l0;
                            listener.onPlayerError(playbackInfo5.f);
                            break;
                    }
                }
            });
            if (playbackInfo.f != null) {
                final int i212 = 9;
                this.f5885l.c(10, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.e
                    @Override // androidx.media3.common.util.ListenerSet.Event
                    public final void invoke(Object obj11) {
                        PlaybackInfo playbackInfo5 = playbackInfo;
                        Player.Listener listener = (Player.Listener) obj11;
                        switch (i212) {
                            case 0:
                                int i213 = ExoPlayerImpl.l0;
                                listener.onTracksChanged(playbackInfo5.f5967i.d);
                                break;
                            case 1:
                                int i214 = ExoPlayerImpl.l0;
                                listener.onLoadingChanged(playbackInfo5.g);
                                listener.onIsLoadingChanged(playbackInfo5.g);
                                break;
                            case 2:
                                int i215 = ExoPlayerImpl.l0;
                                listener.onPlayerStateChanged(playbackInfo5.f5968l, playbackInfo5.f5965e);
                                break;
                            case 3:
                                int i216 = ExoPlayerImpl.l0;
                                listener.onPlaybackStateChanged(playbackInfo5.f5965e);
                                break;
                            case 4:
                                int i217 = ExoPlayerImpl.l0;
                                listener.onPlayWhenReadyChanged(playbackInfo5.f5968l, playbackInfo5.m);
                                break;
                            case 5:
                                int i218 = ExoPlayerImpl.l0;
                                listener.onPlaybackSuppressionReasonChanged(playbackInfo5.f5969n);
                                break;
                            case 6:
                                int i219 = ExoPlayerImpl.l0;
                                listener.onIsPlayingChanged(playbackInfo5.k());
                                break;
                            case 7:
                                int i2110 = ExoPlayerImpl.l0;
                                listener.onPlaybackParametersChanged(playbackInfo5.o);
                                break;
                            case 8:
                                int i31 = ExoPlayerImpl.l0;
                                listener.onPlayerErrorChanged(playbackInfo5.f);
                                break;
                            default:
                                int i32 = ExoPlayerImpl.l0;
                                listener.onPlayerError(playbackInfo5.f);
                                break;
                        }
                    }
                });
            }
        }
        trackSelectorResult = playbackInfo2.f5967i;
        trackSelectorResult2 = playbackInfo.f5967i;
        if (trackSelectorResult != trackSelectorResult2) {
            this.f5883h.d(trackSelectorResult2.f6542e);
            final int i213 = 0;
            this.f5885l.c(i6, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.e
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj11) {
                    PlaybackInfo playbackInfo5 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj11;
                    switch (i213) {
                        case 0:
                            int i214 = ExoPlayerImpl.l0;
                            listener.onTracksChanged(playbackInfo5.f5967i.d);
                            break;
                        case 1:
                            int i215 = ExoPlayerImpl.l0;
                            listener.onLoadingChanged(playbackInfo5.g);
                            listener.onIsLoadingChanged(playbackInfo5.g);
                            break;
                        case 2:
                            int i216 = ExoPlayerImpl.l0;
                            listener.onPlayerStateChanged(playbackInfo5.f5968l, playbackInfo5.f5965e);
                            break;
                        case 3:
                            int i217 = ExoPlayerImpl.l0;
                            listener.onPlaybackStateChanged(playbackInfo5.f5965e);
                            break;
                        case 4:
                            int i218 = ExoPlayerImpl.l0;
                            listener.onPlayWhenReadyChanged(playbackInfo5.f5968l, playbackInfo5.m);
                            break;
                        case 5:
                            int i219 = ExoPlayerImpl.l0;
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo5.f5969n);
                            break;
                        case 6:
                            int i2110 = ExoPlayerImpl.l0;
                            listener.onIsPlayingChanged(playbackInfo5.k());
                            break;
                        case 7:
                            int i2111 = ExoPlayerImpl.l0;
                            listener.onPlaybackParametersChanged(playbackInfo5.o);
                            break;
                        case 8:
                            int i31 = ExoPlayerImpl.l0;
                            listener.onPlayerErrorChanged(playbackInfo5.f);
                            break;
                        default:
                            int i32 = ExoPlayerImpl.l0;
                            listener.onPlayerError(playbackInfo5.f);
                            break;
                    }
                }
            });
        }
        if (!zEquals) {
            this.f5885l.c(14, new f(this.O, 0));
        }
        if (i13 != 0) {
            final int i214 = 1;
            this.f5885l.c(i5, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.e
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj11) {
                    PlaybackInfo playbackInfo5 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj11;
                    switch (i214) {
                        case 0:
                            int i215 = ExoPlayerImpl.l0;
                            listener.onTracksChanged(playbackInfo5.f5967i.d);
                            break;
                        case 1:
                            int i216 = ExoPlayerImpl.l0;
                            listener.onLoadingChanged(playbackInfo5.g);
                            listener.onIsLoadingChanged(playbackInfo5.g);
                            break;
                        case 2:
                            int i217 = ExoPlayerImpl.l0;
                            listener.onPlayerStateChanged(playbackInfo5.f5968l, playbackInfo5.f5965e);
                            break;
                        case 3:
                            int i218 = ExoPlayerImpl.l0;
                            listener.onPlaybackStateChanged(playbackInfo5.f5965e);
                            break;
                        case 4:
                            int i219 = ExoPlayerImpl.l0;
                            listener.onPlayWhenReadyChanged(playbackInfo5.f5968l, playbackInfo5.m);
                            break;
                        case 5:
                            int i2110 = ExoPlayerImpl.l0;
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo5.f5969n);
                            break;
                        case 6:
                            int i2111 = ExoPlayerImpl.l0;
                            listener.onIsPlayingChanged(playbackInfo5.k());
                            break;
                        case 7:
                            int i2112 = ExoPlayerImpl.l0;
                            listener.onPlaybackParametersChanged(playbackInfo5.o);
                            break;
                        case 8:
                            int i31 = ExoPlayerImpl.l0;
                            listener.onPlayerErrorChanged(playbackInfo5.f);
                            break;
                        default:
                            int i32 = ExoPlayerImpl.l0;
                            listener.onPlayerError(playbackInfo5.f);
                            break;
                    }
                }
            });
        }
        if (i12 == 0) {
            final int i215 = 2;
            this.f5885l.c(-1, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.e
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj11) {
                    PlaybackInfo playbackInfo5 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj11;
                    switch (i215) {
                        case 0:
                            int i216 = ExoPlayerImpl.l0;
                            listener.onTracksChanged(playbackInfo5.f5967i.d);
                            break;
                        case 1:
                            int i217 = ExoPlayerImpl.l0;
                            listener.onLoadingChanged(playbackInfo5.g);
                            listener.onIsLoadingChanged(playbackInfo5.g);
                            break;
                        case 2:
                            int i218 = ExoPlayerImpl.l0;
                            listener.onPlayerStateChanged(playbackInfo5.f5968l, playbackInfo5.f5965e);
                            break;
                        case 3:
                            int i219 = ExoPlayerImpl.l0;
                            listener.onPlaybackStateChanged(playbackInfo5.f5965e);
                            break;
                        case 4:
                            int i2110 = ExoPlayerImpl.l0;
                            listener.onPlayWhenReadyChanged(playbackInfo5.f5968l, playbackInfo5.m);
                            break;
                        case 5:
                            int i2111 = ExoPlayerImpl.l0;
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo5.f5969n);
                            break;
                        case 6:
                            int i2112 = ExoPlayerImpl.l0;
                            listener.onIsPlayingChanged(playbackInfo5.k());
                            break;
                        case 7:
                            int i2113 = ExoPlayerImpl.l0;
                            listener.onPlaybackParametersChanged(playbackInfo5.o);
                            break;
                        case 8:
                            int i31 = ExoPlayerImpl.l0;
                            listener.onPlayerErrorChanged(playbackInfo5.f);
                            break;
                        default:
                            int i32 = ExoPlayerImpl.l0;
                            listener.onPlayerError(playbackInfo5.f);
                            break;
                    }
                }
            });
        } else {
            final int i216 = 2;
            this.f5885l.c(-1, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.e
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj11) {
                    PlaybackInfo playbackInfo5 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj11;
                    switch (i216) {
                        case 0:
                            int i217 = ExoPlayerImpl.l0;
                            listener.onTracksChanged(playbackInfo5.f5967i.d);
                            break;
                        case 1:
                            int i218 = ExoPlayerImpl.l0;
                            listener.onLoadingChanged(playbackInfo5.g);
                            listener.onIsLoadingChanged(playbackInfo5.g);
                            break;
                        case 2:
                            int i219 = ExoPlayerImpl.l0;
                            listener.onPlayerStateChanged(playbackInfo5.f5968l, playbackInfo5.f5965e);
                            break;
                        case 3:
                            int i2110 = ExoPlayerImpl.l0;
                            listener.onPlaybackStateChanged(playbackInfo5.f5965e);
                            break;
                        case 4:
                            int i2111 = ExoPlayerImpl.l0;
                            listener.onPlayWhenReadyChanged(playbackInfo5.f5968l, playbackInfo5.m);
                            break;
                        case 5:
                            int i2112 = ExoPlayerImpl.l0;
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo5.f5969n);
                            break;
                        case 6:
                            int i2113 = ExoPlayerImpl.l0;
                            listener.onIsPlayingChanged(playbackInfo5.k());
                            break;
                        case 7:
                            int i2114 = ExoPlayerImpl.l0;
                            listener.onPlaybackParametersChanged(playbackInfo5.o);
                            break;
                        case 8:
                            int i31 = ExoPlayerImpl.l0;
                            listener.onPlayerErrorChanged(playbackInfo5.f);
                            break;
                        default:
                            int i32 = ExoPlayerImpl.l0;
                            listener.onPlayerError(playbackInfo5.f);
                            break;
                    }
                }
            });
        }
        if (i12 != 0) {
            final int i217 = 3;
            this.f5885l.c(4, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.e
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj11) {
                    PlaybackInfo playbackInfo5 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj11;
                    switch (i217) {
                        case 0:
                            int i218 = ExoPlayerImpl.l0;
                            listener.onTracksChanged(playbackInfo5.f5967i.d);
                            break;
                        case 1:
                            int i219 = ExoPlayerImpl.l0;
                            listener.onLoadingChanged(playbackInfo5.g);
                            listener.onIsLoadingChanged(playbackInfo5.g);
                            break;
                        case 2:
                            int i2110 = ExoPlayerImpl.l0;
                            listener.onPlayerStateChanged(playbackInfo5.f5968l, playbackInfo5.f5965e);
                            break;
                        case 3:
                            int i2111 = ExoPlayerImpl.l0;
                            listener.onPlaybackStateChanged(playbackInfo5.f5965e);
                            break;
                        case 4:
                            int i2112 = ExoPlayerImpl.l0;
                            listener.onPlayWhenReadyChanged(playbackInfo5.f5968l, playbackInfo5.m);
                            break;
                        case 5:
                            int i2113 = ExoPlayerImpl.l0;
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo5.f5969n);
                            break;
                        case 6:
                            int i2114 = ExoPlayerImpl.l0;
                            listener.onIsPlayingChanged(playbackInfo5.k());
                            break;
                        case 7:
                            int i2115 = ExoPlayerImpl.l0;
                            listener.onPlaybackParametersChanged(playbackInfo5.o);
                            break;
                        case 8:
                            int i31 = ExoPlayerImpl.l0;
                            listener.onPlayerErrorChanged(playbackInfo5.f);
                            break;
                        default:
                            int i32 = ExoPlayerImpl.l0;
                            listener.onPlayerError(playbackInfo5.f);
                            break;
                    }
                }
            });
        }
        if (i11 == 0) {
            final int i218 = 4;
            this.f5885l.c(5, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.e
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj11) {
                    PlaybackInfo playbackInfo5 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj11;
                    switch (i218) {
                        case 0:
                            int i219 = ExoPlayerImpl.l0;
                            listener.onTracksChanged(playbackInfo5.f5967i.d);
                            break;
                        case 1:
                            int i2110 = ExoPlayerImpl.l0;
                            listener.onLoadingChanged(playbackInfo5.g);
                            listener.onIsLoadingChanged(playbackInfo5.g);
                            break;
                        case 2:
                            int i2111 = ExoPlayerImpl.l0;
                            listener.onPlayerStateChanged(playbackInfo5.f5968l, playbackInfo5.f5965e);
                            break;
                        case 3:
                            int i2112 = ExoPlayerImpl.l0;
                            listener.onPlaybackStateChanged(playbackInfo5.f5965e);
                            break;
                        case 4:
                            int i2113 = ExoPlayerImpl.l0;
                            listener.onPlayWhenReadyChanged(playbackInfo5.f5968l, playbackInfo5.m);
                            break;
                        case 5:
                            int i2114 = ExoPlayerImpl.l0;
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo5.f5969n);
                            break;
                        case 6:
                            int i2115 = ExoPlayerImpl.l0;
                            listener.onIsPlayingChanged(playbackInfo5.k());
                            break;
                        case 7:
                            int i2116 = ExoPlayerImpl.l0;
                            listener.onPlaybackParametersChanged(playbackInfo5.o);
                            break;
                        case 8:
                            int i31 = ExoPlayerImpl.l0;
                            listener.onPlayerErrorChanged(playbackInfo5.f);
                            break;
                        default:
                            int i32 = ExoPlayerImpl.l0;
                            listener.onPlayerError(playbackInfo5.f);
                            break;
                    }
                }
            });
        } else {
            final int i219 = 4;
            this.f5885l.c(5, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.e
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj11) {
                    PlaybackInfo playbackInfo5 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj11;
                    switch (i219) {
                        case 0:
                            int i2110 = ExoPlayerImpl.l0;
                            listener.onTracksChanged(playbackInfo5.f5967i.d);
                            break;
                        case 1:
                            int i2111 = ExoPlayerImpl.l0;
                            listener.onLoadingChanged(playbackInfo5.g);
                            listener.onIsLoadingChanged(playbackInfo5.g);
                            break;
                        case 2:
                            int i2112 = ExoPlayerImpl.l0;
                            listener.onPlayerStateChanged(playbackInfo5.f5968l, playbackInfo5.f5965e);
                            break;
                        case 3:
                            int i2113 = ExoPlayerImpl.l0;
                            listener.onPlaybackStateChanged(playbackInfo5.f5965e);
                            break;
                        case 4:
                            int i2114 = ExoPlayerImpl.l0;
                            listener.onPlayWhenReadyChanged(playbackInfo5.f5968l, playbackInfo5.m);
                            break;
                        case 5:
                            int i2115 = ExoPlayerImpl.l0;
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo5.f5969n);
                            break;
                        case 6:
                            int i2116 = ExoPlayerImpl.l0;
                            listener.onIsPlayingChanged(playbackInfo5.k());
                            break;
                        case 7:
                            int i2117 = ExoPlayerImpl.l0;
                            listener.onPlaybackParametersChanged(playbackInfo5.o);
                            break;
                        case 8:
                            int i31 = ExoPlayerImpl.l0;
                            listener.onPlayerErrorChanged(playbackInfo5.f);
                            break;
                        default:
                            int i32 = ExoPlayerImpl.l0;
                            listener.onPlayerError(playbackInfo5.f);
                            break;
                    }
                }
            });
        }
        if (playbackInfo2.f5969n != playbackInfo.f5969n) {
            final int i220 = 5;
            this.f5885l.c(6, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.e
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj11) {
                    PlaybackInfo playbackInfo5 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj11;
                    switch (i220) {
                        case 0:
                            int i2110 = ExoPlayerImpl.l0;
                            listener.onTracksChanged(playbackInfo5.f5967i.d);
                            break;
                        case 1:
                            int i2111 = ExoPlayerImpl.l0;
                            listener.onLoadingChanged(playbackInfo5.g);
                            listener.onIsLoadingChanged(playbackInfo5.g);
                            break;
                        case 2:
                            int i2112 = ExoPlayerImpl.l0;
                            listener.onPlayerStateChanged(playbackInfo5.f5968l, playbackInfo5.f5965e);
                            break;
                        case 3:
                            int i2113 = ExoPlayerImpl.l0;
                            listener.onPlaybackStateChanged(playbackInfo5.f5965e);
                            break;
                        case 4:
                            int i2114 = ExoPlayerImpl.l0;
                            listener.onPlayWhenReadyChanged(playbackInfo5.f5968l, playbackInfo5.m);
                            break;
                        case 5:
                            int i2115 = ExoPlayerImpl.l0;
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo5.f5969n);
                            break;
                        case 6:
                            int i2116 = ExoPlayerImpl.l0;
                            listener.onIsPlayingChanged(playbackInfo5.k());
                            break;
                        case 7:
                            int i2117 = ExoPlayerImpl.l0;
                            listener.onPlaybackParametersChanged(playbackInfo5.o);
                            break;
                        case 8:
                            int i31 = ExoPlayerImpl.l0;
                            listener.onPlayerErrorChanged(playbackInfo5.f);
                            break;
                        default:
                            int i32 = ExoPlayerImpl.l0;
                            listener.onPlayerError(playbackInfo5.f);
                            break;
                    }
                }
            });
        }
        if (playbackInfo2.k() != playbackInfo.k()) {
            final int i221 = 6;
            this.f5885l.c(7, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.e
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj11) {
                    PlaybackInfo playbackInfo5 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj11;
                    switch (i221) {
                        case 0:
                            int i2110 = ExoPlayerImpl.l0;
                            listener.onTracksChanged(playbackInfo5.f5967i.d);
                            break;
                        case 1:
                            int i2111 = ExoPlayerImpl.l0;
                            listener.onLoadingChanged(playbackInfo5.g);
                            listener.onIsLoadingChanged(playbackInfo5.g);
                            break;
                        case 2:
                            int i2112 = ExoPlayerImpl.l0;
                            listener.onPlayerStateChanged(playbackInfo5.f5968l, playbackInfo5.f5965e);
                            break;
                        case 3:
                            int i2113 = ExoPlayerImpl.l0;
                            listener.onPlaybackStateChanged(playbackInfo5.f5965e);
                            break;
                        case 4:
                            int i2114 = ExoPlayerImpl.l0;
                            listener.onPlayWhenReadyChanged(playbackInfo5.f5968l, playbackInfo5.m);
                            break;
                        case 5:
                            int i2115 = ExoPlayerImpl.l0;
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo5.f5969n);
                            break;
                        case 6:
                            int i2116 = ExoPlayerImpl.l0;
                            listener.onIsPlayingChanged(playbackInfo5.k());
                            break;
                        case 7:
                            int i2117 = ExoPlayerImpl.l0;
                            listener.onPlaybackParametersChanged(playbackInfo5.o);
                            break;
                        case 8:
                            int i31 = ExoPlayerImpl.l0;
                            listener.onPlayerErrorChanged(playbackInfo5.f);
                            break;
                        default:
                            int i32 = ExoPlayerImpl.l0;
                            listener.onPlayerError(playbackInfo5.f);
                            break;
                    }
                }
            });
        }
        if (!playbackInfo2.o.equals(playbackInfo.o)) {
            final int i31 = 7;
            this.f5885l.c(12, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.e
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj11) {
                    PlaybackInfo playbackInfo5 = playbackInfo;
                    Player.Listener listener = (Player.Listener) obj11;
                    switch (i31) {
                        case 0:
                            int i2110 = ExoPlayerImpl.l0;
                            listener.onTracksChanged(playbackInfo5.f5967i.d);
                            break;
                        case 1:
                            int i2111 = ExoPlayerImpl.l0;
                            listener.onLoadingChanged(playbackInfo5.g);
                            listener.onIsLoadingChanged(playbackInfo5.g);
                            break;
                        case 2:
                            int i2112 = ExoPlayerImpl.l0;
                            listener.onPlayerStateChanged(playbackInfo5.f5968l, playbackInfo5.f5965e);
                            break;
                        case 3:
                            int i2113 = ExoPlayerImpl.l0;
                            listener.onPlaybackStateChanged(playbackInfo5.f5965e);
                            break;
                        case 4:
                            int i2114 = ExoPlayerImpl.l0;
                            listener.onPlayWhenReadyChanged(playbackInfo5.f5968l, playbackInfo5.m);
                            break;
                        case 5:
                            int i2115 = ExoPlayerImpl.l0;
                            listener.onPlaybackSuppressionReasonChanged(playbackInfo5.f5969n);
                            break;
                        case 6:
                            int i2116 = ExoPlayerImpl.l0;
                            listener.onIsPlayingChanged(playbackInfo5.k());
                            break;
                        case 7:
                            int i2117 = ExoPlayerImpl.l0;
                            listener.onPlaybackParametersChanged(playbackInfo5.o);
                            break;
                        case 8:
                            int i32 = ExoPlayerImpl.l0;
                            listener.onPlayerErrorChanged(playbackInfo5.f);
                            break;
                        default:
                            int i33 = ExoPlayerImpl.l0;
                            listener.onPlayerError(playbackInfo5.f);
                            break;
                    }
                }
            });
        }
        Y();
        this.f5885l.b();
        if (playbackInfo2.f5970p != playbackInfo.f5970p) {
            it = this.m.iterator();
            while (it.hasNext()) {
                ((ExoPlayer.AudioOffloadListener) it.next()).s();
            }
        }
    }

    @Override // androidx.media3.common.Player
    public final long b() {
        c0();
        return Util.T(this.i0.r);
    }

    public final void b0() {
        int playbackState = getPlaybackState();
        WifiLockManager wifiLockManager = this.D;
        WakeLockManager wakeLockManager = this.C;
        if (playbackState != 1) {
            if (playbackState == 2 || playbackState == 3) {
                c0();
                boolean z2 = this.i0.f5970p;
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

    @Override // androidx.media3.common.Player
    public final void c(PlaybackParameters playbackParameters) {
        c0();
        if (this.i0.o.equals(playbackParameters)) {
            return;
        }
        PlaybackInfo playbackInfoF = this.i0.f(playbackParameters);
        this.H++;
        this.k.i0.obtainMessage(4, playbackParameters).a();
        a0(playbackInfoF, 0, false, 5, -9223372036854775807L, -1, false);
    }

    public final void c0() {
        ConditionVariable conditionVariable = this.d;
        synchronized (conditionVariable) {
            boolean z2 = false;
            while (!conditionVariable.f5633b) {
                try {
                    conditionVariable.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
        Thread threadCurrentThread = Thread.currentThread();
        Looper looper = this.s;
        if (threadCurrentThread != looper.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = looper.getThread().getName();
            int i2 = Util.f5683a;
            Locale locale = Locale.US;
            String strN = androidx.datastore.preferences.protobuf.a.n("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://developer.android.com/guide/topics/media/issues/player-accessed-on-wrong-thread");
            if (this.f5881d0) {
                throw new IllegalStateException(strN);
            }
            Log.h("ExoPlayerImpl", strN, this.e0 ? null : new IllegalStateException());
            this.e0 = true;
        }
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoSurfaceView(SurfaceView surfaceView) {
        c0();
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        c0();
        if (holder == null || holder != this.S) {
            return;
        }
        J();
    }

    @Override // androidx.media3.common.Player
    public final void clearVideoTextureView(TextureView textureView) {
        c0();
        if (textureView == null || textureView != this.f5875V) {
            return;
        }
        J();
    }

    @Override // androidx.media3.common.Player
    public final Tracks d() {
        c0();
        return this.i0.f5967i.d;
    }

    @Override // androidx.media3.common.Player
    public final int e() {
        c0();
        return this.i0.f5969n;
    }

    @Override // androidx.media3.common.Player
    public final int f() {
        c0();
        int iN = N(this.i0);
        if (iN == -1) {
            return 0;
        }
        return iN;
    }

    @Override // androidx.media3.common.Player
    public final long getContentPosition() {
        c0();
        return L(this.i0);
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentAdGroupIndex() {
        c0();
        if (isPlayingAd()) {
            return this.i0.f5963b.f6385b;
        }
        return -1;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentAdIndexInAdGroup() {
        c0();
        if (isPlayingAd()) {
            return this.i0.f5963b.f6386c;
        }
        return -1;
    }

    @Override // androidx.media3.common.Player
    public final int getCurrentPeriodIndex() {
        c0();
        if (this.i0.f5962a.p()) {
            return 0;
        }
        PlaybackInfo playbackInfo = this.i0;
        return playbackInfo.f5962a.b(playbackInfo.f5963b.f6384a);
    }

    @Override // androidx.media3.common.Player
    public final long getCurrentPosition() {
        c0();
        return Util.T(M(this.i0));
    }

    @Override // androidx.media3.common.Player
    public final Timeline getCurrentTimeline() {
        c0();
        return this.i0.f5962a;
    }

    @Override // androidx.media3.common.Player
    public final long getDuration() {
        c0();
        if (!isPlayingAd()) {
            return r();
        }
        PlaybackInfo playbackInfo = this.i0;
        MediaSource.MediaPeriodId mediaPeriodId = playbackInfo.f5963b;
        Object obj = mediaPeriodId.f6384a;
        Timeline timeline = playbackInfo.f5962a;
        Timeline.Period period = this.f5886n;
        timeline.g(obj, period);
        return Util.T(period.a(mediaPeriodId.f6385b, mediaPeriodId.f6386c));
    }

    @Override // androidx.media3.common.Player
    public final boolean getPlayWhenReady() {
        c0();
        return this.i0.f5968l;
    }

    @Override // androidx.media3.common.Player
    public final PlaybackParameters getPlaybackParameters() {
        c0();
        return this.i0.o;
    }

    @Override // androidx.media3.common.Player
    public final int getPlaybackState() {
        c0();
        return this.i0.f5965e;
    }

    @Override // androidx.media3.common.Player
    public final int getRepeatMode() {
        c0();
        return this.f5867F;
    }

    @Override // androidx.media3.common.Player
    public final boolean getShuffleModeEnabled() {
        c0();
        return this.G;
    }

    @Override // androidx.media3.common.Player
    public final float getVolume() {
        c0();
        return this.a0;
    }

    @Override // androidx.media3.common.Player
    public final CueGroup i() {
        c0();
        return this.f5880c0;
    }

    @Override // androidx.media3.common.Player
    public final boolean isPlayingAd() {
        c0();
        return this.i0.f5963b.b();
    }

    @Override // androidx.media3.common.Player
    public final void j(Player.Listener listener) {
        c0();
        listener.getClass();
        this.f5885l.e(listener);
    }

    @Override // androidx.media3.common.Player
    public final void l(Player.Listener listener) {
        listener.getClass();
        this.f5885l.a(listener);
    }

    @Override // androidx.media3.common.Player
    public final Looper m() {
        return this.s;
    }

    @Override // androidx.media3.common.Player
    public final TrackSelectionParameters n() {
        c0();
        return this.f5883h.b();
    }

    @Override // androidx.media3.common.Player
    public final Player.Commands p() {
        c0();
        return this.f5870N;
    }

    @Override // androidx.media3.common.Player
    public final void prepare() {
        c0();
        boolean playWhenReady = getPlayWhenReady();
        int iC = this.f5865B.c(2, playWhenReady);
        Z(iC, iC == -1 ? 2 : 1, playWhenReady);
        PlaybackInfo playbackInfo = this.i0;
        if (playbackInfo.f5965e != 1) {
            return;
        }
        PlaybackInfo playbackInfoE = playbackInfo.e(null);
        PlaybackInfo playbackInfoG = playbackInfoE.g(playbackInfoE.f5962a.p() ? 4 : 2);
        this.H++;
        this.k.i0.obtainMessage(29).a();
        a0(playbackInfoG, 1, false, 5, -9223372036854775807L, -1, false);
    }

    @Override // androidx.media3.common.Player
    public final long q() {
        c0();
        return this.f5889w;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void release() {
        String str;
        boolean z2;
        AudioTrack audioTrack;
        int i2 = 0;
        StringBuilder sb = new StringBuilder("Release ");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" [AndroidXMedia3/1.4.1] [");
        sb.append(Util.f5686e);
        sb.append("] [");
        HashSet hashSet = MediaLibraryInfo.f5463a;
        synchronized (MediaLibraryInfo.class) {
            str = MediaLibraryInfo.f5464b;
        }
        sb.append(str);
        sb.append(d9.i.f24752e);
        Log.f("ExoPlayerImpl", sb.toString());
        c0();
        if (Util.f5683a < 21 && (audioTrack = this.f5871P) != null) {
            audioTrack.release();
            this.f5871P = null;
        }
        this.f5864A.a();
        this.C.getClass();
        this.D.getClass();
        AudioFocusManager audioFocusManager = this.f5865B;
        audioFocusManager.f5819c = null;
        audioFocusManager.a();
        audioFocusManager.b(0);
        ExoPlayerImplInternal exoPlayerImplInternal = this.k;
        synchronized (exoPlayerImplInternal) {
            if (exoPlayerImplInternal.B0 || !exoPlayerImplInternal.k0.getThread().isAlive()) {
                z2 = true;
            } else {
                exoPlayerImplInternal.i0.sendEmptyMessage(7);
                exoPlayerImplInternal.j0(new c(exoPlayerImplInternal, 4), exoPlayerImplInternal.w0);
                z2 = exoPlayerImplInternal.B0;
            }
        }
        if (!z2) {
            this.f5885l.f(10, new i(i2));
        }
        this.f5885l.d();
        this.f5884i.b();
        this.t.b(this.r);
        PlaybackInfo playbackInfo = this.i0;
        if (playbackInfo.f5970p) {
            this.i0 = playbackInfo.a();
        }
        PlaybackInfo playbackInfoG = this.i0.g(1);
        this.i0 = playbackInfoG;
        PlaybackInfo playbackInfoB = playbackInfoG.b(playbackInfoG.f5963b);
        this.i0 = playbackInfoB;
        playbackInfoB.q = playbackInfoB.s;
        this.i0.r = 0L;
        this.r.release();
        this.f5883h.e();
        T();
        Surface surface = this.f5873R;
        if (surface != null) {
            surface.release();
            this.f5873R = null;
        }
        this.f5880c0 = CueGroup.f5613b;
    }

    @Override // androidx.media3.common.Player
    public final VideoSize s() {
        c0();
        return this.g0;
    }

    @Override // androidx.media3.exoplayer.ExoPlayer
    public final void setImageOutput(ImageOutput imageOutput) {
        c0();
        U(4, 15, imageOutput);
    }

    @Override // androidx.media3.common.Player
    public final void setPlayWhenReady(boolean z2) {
        c0();
        int iC = this.f5865B.c(getPlaybackState(), z2);
        Z(iC, iC == -1 ? 2 : 1, z2);
    }

    @Override // androidx.media3.common.Player
    public final void setRepeatMode(final int i2) {
        c0();
        if (this.f5867F != i2) {
            this.f5867F = i2;
            this.k.i0.obtainMessage(11, i2, 0).a();
            ListenerSet.Event event = new ListenerSet.Event() { // from class: androidx.media3.exoplayer.j
                @Override // androidx.media3.common.util.ListenerSet.Event
                public final void invoke(Object obj) {
                    int i3 = ExoPlayerImpl.l0;
                    ((Player.Listener) obj).onRepeatModeChanged(i2);
                }
            };
            ListenerSet listenerSet = this.f5885l;
            listenerSet.c(8, event);
            Y();
            listenerSet.b();
        }
    }

    @Override // androidx.media3.common.Player
    public final void setShuffleModeEnabled(boolean z2) {
        c0();
        if (this.G != z2) {
            this.G = z2;
            this.k.i0.obtainMessage(12, z2 ? 1 : 0, 0).a();
            k kVar = new k(z2, 0);
            ListenerSet listenerSet = this.f5885l;
            listenerSet.c(9, kVar);
            Y();
            listenerSet.b();
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoSurfaceView(SurfaceView surfaceView) {
        c0();
        if (surfaceView instanceof VideoDecoderOutputBufferRenderer) {
            T();
            W(surfaceView);
            V(surfaceView.getHolder());
            return;
        }
        boolean z2 = surfaceView instanceof SphericalGLSurfaceView;
        ComponentListener componentListener = this.y;
        if (z2) {
            T();
            this.T = (SphericalGLSurfaceView) surfaceView;
            PlayerMessage playerMessageK = K(this.f5890z);
            Assertions.e(!playerMessageK.g);
            playerMessageK.d = 10000;
            SphericalGLSurfaceView sphericalGLSurfaceView = this.T;
            Assertions.e(true ^ playerMessageK.g);
            playerMessageK.f5974e = sphericalGLSurfaceView;
            playerMessageK.c();
            this.T.e0.add(componentListener);
            W(this.T.getVideoSurface());
            V(surfaceView.getHolder());
            return;
        }
        SurfaceHolder holder = surfaceView == null ? null : surfaceView.getHolder();
        c0();
        if (holder == null) {
            J();
            return;
        }
        T();
        this.f5874U = true;
        this.S = holder;
        holder.addCallback(componentListener);
        Surface surface = holder.getSurface();
        if (surface == null || !surface.isValid()) {
            W(null);
            S(0, 0);
        } else {
            W(surface);
            Rect surfaceFrame = holder.getSurfaceFrame();
            S(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVideoTextureView(TextureView textureView) {
        c0();
        if (textureView == null) {
            J();
            return;
        }
        T();
        this.f5875V = textureView;
        if (textureView.getSurfaceTextureListener() != null) {
            Log.g("ExoPlayerImpl", "Replacing existing SurfaceTextureListener.");
        }
        textureView.setSurfaceTextureListener(this.y);
        SurfaceTexture surfaceTexture = textureView.isAvailable() ? textureView.getSurfaceTexture() : null;
        if (surfaceTexture == null) {
            W(null);
            S(0, 0);
        } else {
            Surface surface = new Surface(surfaceTexture);
            W(surface);
            this.f5873R = surface;
            S(textureView.getWidth(), textureView.getHeight());
        }
    }

    @Override // androidx.media3.common.Player
    public final void setVolume(float f) {
        c0();
        final float fI = Util.i(f, 0.0f, 1.0f);
        if (this.a0 == fI) {
            return;
        }
        this.a0 = fI;
        U(1, 2, Float.valueOf(this.f5865B.f5820e * fI));
        this.f5885l.f(22, new ListenerSet.Event() { // from class: androidx.media3.exoplayer.g
            @Override // androidx.media3.common.util.ListenerSet.Event
            public final void invoke(Object obj) {
                int i2 = ExoPlayerImpl.l0;
                ((Player.Listener) obj).onVolumeChanged(fI);
            }
        });
    }

    @Override // androidx.media3.common.Player
    public final void stop() {
        c0();
        this.f5865B.c(1, getPlayWhenReady());
        X(null);
        ImmutableList immutableListX = ImmutableList.x();
        long j = this.i0.s;
        this.f5880c0 = new CueGroup(immutableListX);
    }

    @Override // androidx.media3.common.Player
    public final long t() {
        c0();
        return this.v;
    }

    @Override // androidx.media3.common.Player
    public final void u(TrackSelectionParameters trackSelectionParameters) {
        c0();
        TrackSelector trackSelector = this.f5883h;
        trackSelector.getClass();
        if (!(trackSelector instanceof DefaultTrackSelector) || trackSelectionParameters.equals(trackSelector.b())) {
            return;
        }
        trackSelector.h(trackSelectionParameters);
        this.f5885l.f(19, new f(trackSelectionParameters, 1));
    }

    @Override // androidx.media3.common.Player
    public final long v() {
        c0();
        if (this.i0.f5962a.p()) {
            return this.k0;
        }
        PlaybackInfo playbackInfo = this.i0;
        long j = 0;
        if (playbackInfo.k.d != playbackInfo.f5963b.d) {
            return Util.T(playbackInfo.f5962a.m(f(), this.f5377a, 0L).f5519l);
        }
        long j2 = playbackInfo.q;
        if (this.i0.k.b()) {
            PlaybackInfo playbackInfo2 = this.i0;
            playbackInfo2.f5962a.g(playbackInfo2.k.f6384a, this.f5886n).d(this.i0.k.f6385b);
        } else {
            j = j2;
        }
        PlaybackInfo playbackInfo3 = this.i0;
        Timeline timeline = playbackInfo3.f5962a;
        Object obj = playbackInfo3.k.f6384a;
        Timeline.Period period = this.f5886n;
        timeline.g(obj, period);
        return Util.T(j + period.f5511e);
    }

    @Override // androidx.media3.common.Player
    public final MediaMetadata y() {
        c0();
        return this.O;
    }

    @Override // androidx.media3.common.Player
    public final void z(List list) {
        c0();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            arrayList.add(this.q.a((MediaItem) list.get(i2)));
        }
        c0();
        N(this.i0);
        getCurrentPosition();
        this.H++;
        ArrayList arrayList2 = this.o;
        if (!arrayList2.isEmpty()) {
            int size = arrayList2.size();
            for (int i3 = size - 1; i3 >= 0; i3--) {
                arrayList2.remove(i3);
            }
            this.L = this.L.cloneAndRemove(size);
        }
        ArrayList arrayList3 = new ArrayList();
        for (int i4 = 0; i4 < arrayList.size(); i4++) {
            MediaSourceList.MediaSourceHolder mediaSourceHolder = new MediaSourceList.MediaSourceHolder((MediaSource) arrayList.get(i4), this.f5887p);
            arrayList3.add(mediaSourceHolder);
            arrayList2.add(i4, new MediaSourceHolderSnapshot(mediaSourceHolder.f5957b, mediaSourceHolder.f5956a));
        }
        this.L = this.L.a(arrayList3.size());
        PlaylistTimeline playlistTimeline = new PlaylistTimeline(arrayList2, this.L);
        boolean zP = playlistTimeline.p();
        int i5 = playlistTimeline.f5977e;
        if (!zP && -1 >= i5) {
            throw new IllegalSeekPositionException();
        }
        int iA = playlistTimeline.a(this.G);
        PlaybackInfo playbackInfoQ = Q(this.i0, playlistTimeline, R(playlistTimeline, iA, -9223372036854775807L));
        int i6 = playbackInfoQ.f5965e;
        if (iA != -1 && i6 != 1) {
            i6 = (playlistTimeline.p() || iA >= i5) ? 4 : 2;
        }
        PlaybackInfo playbackInfoG = playbackInfoQ.g(i6);
        long jI = Util.I(-9223372036854775807L);
        ShuffleOrder shuffleOrder = this.L;
        ExoPlayerImplInternal exoPlayerImplInternal = this.k;
        exoPlayerImplInternal.getClass();
        exoPlayerImplInternal.i0.obtainMessage(17, new ExoPlayerImplInternal.MediaSourceListUpdateMessage(arrayList3, shuffleOrder, iA, jI)).a();
        a0(playbackInfoG, 0, (this.i0.f5963b.f6384a.equals(playbackInfoG.f5963b.f6384a) || this.i0.f5962a.p()) ? false : true, 4, M(playbackInfoG), -1, false);
    }

    public final class ComponentListener implements VideoRendererEventListener, AudioRendererEventListener, TextOutput, MetadataOutput, SurfaceHolder.Callback, TextureView.SurfaceTextureListener, SphericalGLSurfaceView.VideoSurfaceListener, AudioFocusManager.PlayerControl, AudioBecomingNoisyManager.EventListener, StreamVolumeManager.Listener, ExoPlayer.AudioOffloadListener {
        public ComponentListener() {
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public final void a(String str) {
            ExoPlayerImpl.this.r.a(str);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public final void b(String str) {
            ExoPlayerImpl.this.r.b(str);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public final void c(Exception exc) {
            ExoPlayerImpl.this.r.c(exc);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public final void d(long j) {
            ExoPlayerImpl.this.r.d(j);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public final void e(Exception exc) {
            ExoPlayerImpl.this.r.e(exc);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public final void f(long j, Object obj) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.r.f(j, obj);
            if (exoPlayerImpl.f5872Q == obj) {
                exoPlayerImpl.f5885l.f(26, new i(2));
            }
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public final void g(int i2, long j) {
            ExoPlayerImpl.this.r.g(i2, j);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public final void h(Exception exc) {
            ExoPlayerImpl.this.r.h(exc);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public final void i(int i2, long j, long j2) {
            ExoPlayerImpl.this.r.i(i2, j, j2);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public final void j(AudioSink.AudioTrackConfig audioTrackConfig) {
            ExoPlayerImpl.this.r.j(audioTrackConfig);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public final void k(AudioSink.AudioTrackConfig audioTrackConfig) {
            ExoPlayerImpl.this.r.k(audioTrackConfig);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public final void l(DecoderCounters decoderCounters) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.getClass();
            exoPlayerImpl.r.l(decoderCounters);
        }

        @Override // androidx.media3.exoplayer.AudioBecomingNoisyManager.EventListener
        public final void m() {
            int i2 = ExoPlayerImpl.l0;
            ExoPlayerImpl.this.Z(-1, 3, false);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public final void n(DecoderCounters decoderCounters) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.getClass();
            exoPlayerImpl.r.n(decoderCounters);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public final void o(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.getClass();
            exoPlayerImpl.r.o(format, decoderReuseEvaluation);
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public final void onAudioDecoderInitialized(String str, long j, long j2) {
            ExoPlayerImpl.this.r.onAudioDecoderInitialized(str, j, j2);
        }

        @Override // androidx.media3.exoplayer.text.TextOutput
        public final void onCues(CueGroup cueGroup) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.f5880c0 = cueGroup;
            exoPlayerImpl.f5885l.f(27, new f(cueGroup, 4));
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public final void onDroppedFrames(int i2, long j) {
            ExoPlayerImpl.this.r.onDroppedFrames(i2, j);
        }

        @Override // androidx.media3.exoplayer.metadata.MetadataOutput
        public final void onMetadata(Metadata metadata) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            MediaMetadata.Builder builderA = exoPlayerImpl.h0.a();
            int i2 = 0;
            while (true) {
                Metadata.Entry[] entryArr = metadata.X;
                if (i2 >= entryArr.length) {
                    break;
                }
                entryArr[i2].n0(builderA);
                i2++;
            }
            exoPlayerImpl.h0 = new MediaMetadata(builderA);
            MediaMetadata mediaMetadataI = exoPlayerImpl.I();
            boolean zEquals = mediaMetadataI.equals(exoPlayerImpl.O);
            ListenerSet listenerSet = exoPlayerImpl.f5885l;
            if (!zEquals) {
                exoPlayerImpl.O = mediaMetadataI;
                listenerSet.c(14, new f(this, 2));
            }
            listenerSet.c(28, new f(metadata, 5));
            listenerSet.b();
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public final void onSkipSilenceEnabledChanged(boolean z2) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            if (exoPlayerImpl.f5878b0 == z2) {
                return;
            }
            exoPlayerImpl.f5878b0 = z2;
            exoPlayerImpl.f5885l.f(23, new k(z2, 1));
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
            int i4 = ExoPlayerImpl.l0;
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.getClass();
            Surface surface = new Surface(surfaceTexture);
            exoPlayerImpl.W(surface);
            exoPlayerImpl.f5873R = surface;
            exoPlayerImpl.S(i2, i3);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            int i2 = ExoPlayerImpl.l0;
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.W(null);
            exoPlayerImpl.S(0, 0);
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i2, int i3) {
            int i4 = ExoPlayerImpl.l0;
            ExoPlayerImpl.this.S(i2, i3);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public final void onVideoDecoderInitialized(String str, long j, long j2) {
            ExoPlayerImpl.this.r.onVideoDecoderInitialized(str, j, j2);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public final void onVideoSizeChanged(VideoSize videoSize) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.g0 = videoSize;
            exoPlayerImpl.f5885l.f(25, new f(videoSize, 7));
        }

        @Override // androidx.media3.exoplayer.audio.AudioRendererEventListener
        public final void p(DecoderCounters decoderCounters) {
            ExoPlayerImpl.this.r.p(decoderCounters);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public final void q(Format format, DecoderReuseEvaluation decoderReuseEvaluation) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.getClass();
            exoPlayerImpl.r.q(format, decoderReuseEvaluation);
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public final void r(Surface surface) {
            int i2 = ExoPlayerImpl.l0;
            ExoPlayerImpl.this.W(surface);
        }

        @Override // androidx.media3.exoplayer.ExoPlayer.AudioOffloadListener
        public final void s() {
            int i2 = ExoPlayerImpl.l0;
            ExoPlayerImpl.this.b0();
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i2, int i3, int i4) {
            int i5 = ExoPlayerImpl.l0;
            ExoPlayerImpl.this.S(i3, i4);
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            if (exoPlayerImpl.f5874U) {
                exoPlayerImpl.W(surfaceHolder.getSurface());
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            if (exoPlayerImpl.f5874U) {
                exoPlayerImpl.W(null);
            }
            exoPlayerImpl.S(0, 0);
        }

        @Override // androidx.media3.exoplayer.video.VideoRendererEventListener
        public final void t(DecoderCounters decoderCounters) {
            ExoPlayerImpl.this.r.t(decoderCounters);
        }

        @Override // androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView.VideoSurfaceListener
        public final void u() {
            int i2 = ExoPlayerImpl.l0;
            ExoPlayerImpl.this.W(null);
        }

        @Override // androidx.media3.exoplayer.AudioFocusManager.PlayerControl
        public final void v(int i2) {
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.Z(i2, i2 == -1 ? 2 : 1, exoPlayerImpl.getPlayWhenReady());
        }

        @Override // androidx.media3.exoplayer.AudioFocusManager.PlayerControl
        public final void w() {
            int i2 = ExoPlayerImpl.l0;
            ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
            exoPlayerImpl.U(1, 2, Float.valueOf(exoPlayerImpl.a0 * exoPlayerImpl.f5865B.f5820e));
        }

        @Override // androidx.media3.exoplayer.text.TextOutput
        public final void onCues(List list) {
            ExoPlayerImpl.this.f5885l.f(27, new f(list, 6));
        }
    }

    @Override // androidx.media3.common.Player
    public final ExoPlaybackException a() {
        c0();
        return this.i0.f;
    }
}
