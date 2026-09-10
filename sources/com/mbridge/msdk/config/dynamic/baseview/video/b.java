package com.mbridge.msdk.config.dynamic.baseview.video;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayerFactory;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.Player;
import com.mbridge.msdk.playercommon.exoplayer2.SimpleExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultDataSourceFactory;
import com.mbridge.msdk.playercommon.exoplayer2.video.VideoListener;
import com.unity3d.services.UnityAdsConstants;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class b implements Player.EventListener, VideoListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f32670e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f32671f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Context f32672g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SimpleExoPlayer f32673h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaSource f32674i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.dynamic.baseview.video.a f32676k;
    private c l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    SurfaceHolder f32677m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private d f32678n;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f32666a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f32667b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f32668c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f32669d = 5;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Handler f32675j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Runnable f32679o = new a();

    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long duration;
            try {
                if (b.this.f32673h == null || !b.this.b()) {
                    return;
                }
                b bVar = b.this;
                bVar.f32670e = bVar.f32673h.getCurrentPosition();
                float f10 = b.this.f32670e / 1000.0f;
                float f11 = b.this.f32670e % 1000;
                int iRound = Math.round(f10);
                q0.c("ComponentVideoPlayer", "currentPosition:" + iRound + " mCurrentPosition:" + b.this.f32670e);
                if (b.this.f32673h == null || b.this.f32673h.getDuration() <= 0) {
                    duration = 0;
                } else {
                    duration = b.this.f32673h.getDuration() / 1000;
                    if (f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f11 < 500.0f) {
                        iRound++;
                    }
                }
                if (iRound >= 0 && duration > 0) {
                    long j10 = iRound;
                    if (j10 < 1 + duration && b.this.f32676k != null) {
                        b.this.f32676k.a(j10, duration);
                    }
                }
                b.this.f32666a = false;
                b.this.f32675j.postDelayed(this, 1000L);
            } catch (Exception e10) {
                q0.b("ComponentVideoPlayer", e10.getMessage());
            }
        }
    }

    private void r() {
        try {
            a();
            this.f32675j.post(this.f32679o);
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public float e() {
        SimpleExoPlayer simpleExoPlayer = this.f32673h;
        return simpleExoPlayer != null ? simpleExoPlayer.getVolume() : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    public boolean f() {
        return this.f32667b;
    }

    public boolean g() {
        return this.f32666a;
    }

    public boolean h() {
        return this.f32673h != null && b();
    }

    public boolean i() {
        return this.f32671f;
    }

    public void j() {
        SimpleExoPlayer simpleExoPlayer = this.f32673h;
        if (simpleExoPlayer == null) {
            return;
        }
        simpleExoPlayer.setVolume(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        this.f32671f = true;
    }

    public void k() {
        try {
            this.f32666a = true;
            this.f32670e = 0L;
            if (this.f32676k != null) {
                this.f32676k.onPlayCompleted();
            }
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public void l() {
        try {
            this.f32667b = true;
            if (this.f32673h != null && !this.f32668c) {
                this.f32668c = true;
                if (this.f32676k != null) {
                    this.f32676k.a(this.f32673h.getDuration() / 1000);
                }
            }
            r();
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
        }
    }

    public void m() {
        try {
            if (this.f32667b && this.f32673h != null && b()) {
                this.f32673h.setPlayWhenReady(false);
                a();
            }
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public void n() {
        try {
            if (this.f32667b) {
                r();
            } else {
                this.f32673h.prepare(this.f32674i);
            }
            this.f32673h.setPlayWhenReady(true);
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
            p();
            b("play error");
        }
    }

    public void o() {
        SimpleExoPlayer simpleExoPlayer;
        try {
            if (this.f32667b || (simpleExoPlayer = this.f32673h) == null) {
                return;
            }
            simpleExoPlayer.prepare(this.f32674i);
            this.f32667b = true;
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        q0.b("ComponentVideoPlayer", "onPlaybackParametersChanged : " + playbackParameters.speed);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        String message;
        d dVar = this.f32678n;
        if ((dVar == null || !dVar.a(exoPlaybackException)) && exoPlaybackException != null) {
            int i10 = exoPlaybackException.type;
            if (i10 == 0) {
                message = "Play error, because have a SourceException.";
            } else if (i10 != 1) {
                message = i10 != 2 ? "Play error and ExoPlayer have not message." : "Play error, because have a UnexpectedException.";
            } else {
                message = "Play error, because have a RendererException.";
            }
            if (exoPlaybackException.getCause() != null && !TextUtils.isEmpty(exoPlaybackException.getCause().getMessage())) {
                message = exoPlaybackException.getCause().getMessage();
            }
            q0.b("ComponentVideoPlayer", "onPlayerError : " + message);
            a(message);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerStateChanged(boolean z10, int i10) {
        q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : " + i10);
        if (i10 == 1) {
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : IDLE");
            return;
        }
        if (i10 == 2) {
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : Buffering");
            return;
        }
        if (i10 == 3) {
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : READY");
            l();
        } else {
            if (i10 != 4) {
                return;
            }
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : Ended : PLAY ENDED");
            a();
            k();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoListener
    public void onRenderedFirstFrame() {
        c cVar = this.l;
        if (cVar != null) {
            cVar.onRenderedFirstFrame();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.video.VideoListener
    public void onVideoSizeChanged(int i10, int i11, int i12, float f10) {
        c cVar = this.l;
        if (cVar != null) {
            cVar.a(i11 == 0 ? 1.0f : (i10 * f10) / i11);
        }
    }

    public void p() {
        try {
            a();
            if (this.f32673h != null) {
                s();
                this.f32673h.removeListener(this);
                this.f32673h.release();
                this.f32676k = null;
            }
            d dVar = this.f32678n;
            if (dVar != null) {
                dVar.c();
            }
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
        }
    }

    public void q() {
        SimpleExoPlayer simpleExoPlayer = this.f32673h;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.seekTo(simpleExoPlayer.getCurrentPosition() - 500);
        }
    }

    public void s() {
        try {
            if (this.f32667b && this.f32673h != null && b()) {
                this.f32673h.stop();
                a();
            }
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public void t() {
        SimpleExoPlayer simpleExoPlayer = this.f32673h;
        if (simpleExoPlayer == null) {
            return;
        }
        simpleExoPlayer.setVolume(1.0f);
        this.f32671f = false;
    }

    public void b(int i10) {
        this.f32669d = i10;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            b("play url is illegal");
            return;
        }
        try {
            this.f32673h = ExoPlayerFactory.newSimpleInstance(new DefaultRenderersFactory(this.f32672g), new DefaultTrackSelector(), new DefaultLoadControl());
            this.f32674i = new ExtractorMediaSource.Factory(new DefaultDataSourceFactory(this.f32672g, "MBridge_ExoPlayer")).createMediaSource(Uri.parse(str));
            this.f32673h.setRepeatMode(0);
            this.f32673h.prepare(this.f32674i);
            this.f32673h.addListener(this);
            this.f32673h.addVideoListener(this);
            SurfaceHolder surfaceHolder = this.f32677m;
            if (surfaceHolder != null) {
                a(surfaceHolder);
            }
            d dVar = new d(this.f32672g, this.f32673h);
            this.f32678n = dVar;
            dVar.a(str, this.f32676k, this.f32669d);
        } catch (Throwable unused) {
            b("Player init error");
        }
    }

    public int d() {
        SimpleExoPlayer simpleExoPlayer = this.f32673h;
        if (simpleExoPlayer != null) {
            return (int) (simpleExoPlayer.getDuration() / 1000);
        }
        return 0;
    }

    private void b(String str) {
        if (this.f32676k != null) {
            this.f32676k.onPlayError(str);
        }
    }

    public void a(Context context, SurfaceHolder surfaceHolder) {
        try {
            this.f32672g = context;
            this.f32677m = surfaceHolder;
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
        }
    }

    public boolean b() {
        return this.f32673h.getPlaybackState() == 3 && this.f32673h.getPlayWhenReady();
    }

    public void a(SurfaceHolder surfaceHolder) {
        Player.VideoComponent videoComponent;
        try {
            SimpleExoPlayer simpleExoPlayer = this.f32673h;
            if (simpleExoPlayer == null || (videoComponent = simpleExoPlayer.getVideoComponent()) == null) {
                return;
            }
            videoComponent.setVideoSurfaceHolder(surfaceHolder);
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
            b(th2.toString());
        }
    }

    public void a(c cVar) {
        if (cVar != null) {
            this.l = cVar;
        }
    }

    public void a(long j10) {
        try {
            if (!this.f32667b) {
                this.f32673h.prepare(this.f32674i);
            } else {
                r();
            }
            this.f32673h.seekTo(j10);
            this.f32673h.setPlayWhenReady(true);
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
            p();
            b("play error");
        }
    }

    public long c() {
        return this.f32670e;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onSeekProcessed() {
    }

    public void a(int i10) {
        long j10 = i10;
        try {
            this.f32670e = j10;
            if (!this.f32667b) {
                q0.a("ComponentVideoPlayer", "seekTo return mHasPrepare false");
                return;
            }
            SimpleExoPlayer simpleExoPlayer = this.f32673h;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.seekTo(j10);
            }
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    private void a() {
        try {
            this.f32675j.removeCallbacks(this.f32679o);
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.dynamic.baseview.video.a aVar) {
        this.f32676k = aVar;
    }

    public boolean a(String str) {
        try {
            this.f32667b = false;
            b(str);
            return true;
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
            return true;
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onLoadingChanged(boolean z10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPositionDiscontinuity(int i10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onRepeatModeChanged(int i10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onShuffleModeEnabledChanged(boolean z10) {
    }

    public void a(float f10, float f11) {
        try {
            SimpleExoPlayer simpleExoPlayer = this.f32673h;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.setVolume(f11);
            }
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
        }
    }

    public void a(float f10) {
        try {
            if (b()) {
                this.f32673h.setPlaybackParameters(new PlaybackParameters(f10));
            } else {
                this.f32673h.setPlaybackParameters(new PlaybackParameters(f10));
                this.f32673h.stop();
            }
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTimelineChanged(Timeline timeline, @Nullable Object obj, int i10) {
    }
}
