package com.mbridge.msdk.dycreator.baseview.videoview;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.measurement.f2;
import com.mbridge.msdk.dycreator.baseview.videoview.listener.VideoViewEventListener;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayerFactory;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.Player;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.ConcatenatingMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultDataSourceFactory;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes3.dex */
public class MBVideoView extends FrameLayout implements Player.EventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f33105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ExoPlayer f33106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f33107d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String[] f33108e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private VideoViewEventListener f33109f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SurfaceHolder.Callback f33110g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f33111h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f33112i;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
    class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MBVideoView f33113a;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f33113a.f33109f != null) {
                this.f33113a.f33109f.onBufferingFail("Buffering timeout");
            }
        }
    }

    public MBVideoView(@NonNull Context context) {
        super(context);
        this.f33104a = "MBVideoView";
        this.f33105b = 1000;
        this.f33107d = 5000L;
        this.f33110g = new SurfaceHolder.Callback() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                try {
                    Player.VideoComponent videoComponent = MBVideoView.this.f33106c.getVideoComponent();
                    if (videoComponent != null) {
                        videoComponent.setVideoSurfaceHolder(surfaceHolder);
                    }
                } catch (Throwable th2) {
                    q0.b("MBVideoView", th2.getMessage());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            }
        };
        this.f33111h = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.3
            @Override // java.lang.Runnable
            public void run() {
                if (MBVideoView.this.f33109f != null) {
                    MBVideoView.this.f33109f.onBufferingFail("Buffering fail.");
                }
            }
        };
        this.f33112i = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (MBVideoView.this.f33106c == null || !MBVideoView.this.isPlaying()) {
                        return;
                    }
                    long currentPosition = MBVideoView.this.f33106c.getCurrentPosition();
                    long duration = MBVideoView.this.f33106c.getDuration();
                    int iRound = Math.round(currentPosition / 1000.0f);
                    int iRound2 = Math.round(duration / 1000.0f);
                    q0.c("MBVideoView", "currentPosition:" + iRound + " duration:" + duration);
                    if (MBVideoView.this.f33109f != null) {
                        MBVideoView.this.f33109f.onPlayProgress(iRound, iRound2);
                    }
                    MBVideoView.this.getHandler().postDelayed(this, 1000L);
                } catch (Exception e10) {
                    q0.b("MBVideoView", e10.getMessage());
                }
            }
        };
    }

    public boolean isPlaying() {
        ExoPlayer exoPlayer = this.f33106c;
        return exoPlayer != null && exoPlayer.getPlaybackState() == 3 && this.f33106c.getPlayWhenReady();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        q0.b("MBVideoView", "onPlaybackParametersChanged : " + playbackParameters.speed);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0016  */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        String message;
        if (exoPlaybackException == null) {
            message = "Play error and ExoPlayer have not message.";
        } else {
            int i10 = exoPlaybackException.type;
            if (i10 == 0) {
                message = "Play error, because have a SourceException.";
            } else if (i10 == 1) {
                message = "Play error, because have a RendererException.";
            } else if (i10 != 2) {
                message = "Play error and ExoPlayer have not message.";
            } else {
                message = "Play error, because have a UnexpectedException.";
            }
        }
        if (exoPlaybackException.getCause() != null && !TextUtils.isEmpty(exoPlaybackException.getCause().getMessage())) {
            message = exoPlaybackException.getCause().getMessage();
        }
        f2.s("onPlayerError : ", message, "MBVideoView");
        VideoViewEventListener videoViewEventListener = this.f33109f;
        if (videoViewEventListener != null) {
            videoViewEventListener.onPlayerError(exoPlaybackException.type, message);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerStateChanged(boolean z10, int i10) {
        q0.b("MBVideoView", "onPlaybackStateChanged : " + i10);
        if (i10 == 1) {
            q0.b("MBVideoView", "onPlaybackStateChanged : IDLE");
            return;
        }
        if (i10 == 2) {
            q0.b("MBVideoView", "onPlaybackStateChanged : Buffering");
        } else if (i10 == 3) {
            q0.b("MBVideoView", "onPlaybackStateChanged : READY");
        } else {
            if (i10 != 4) {
                return;
            }
            q0.b("MBVideoView", "onPlaybackStateChanged : Ended : PLAY ENDED");
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPositionDiscontinuity(int i10) {
        this.f33106c.getCurrentWindowIndex();
    }

    public void setVideoUrl(String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        this.f33108e = strArr;
        a();
    }

    public void setVideoViewEventLister(VideoViewEventListener videoViewEventListener) {
        this.f33109f = videoViewEventListener;
    }

    private void a() {
        try {
            this.f33106c = ExoPlayerFactory.newSimpleInstance(new DefaultRenderersFactory(getContext()), new DefaultTrackSelector(), new DefaultLoadControl());
            ConcatenatingMediaSource concatenatingMediaSource = new ConcatenatingMediaSource();
            for (String str : this.f33108e) {
                concatenatingMediaSource.addMediaSource(new ExtractorMediaSource.Factory(new DefaultDataSourceFactory(getContext(), "MBridge_ExoPlayer")).createMediaSource(Uri.parse(str)));
            }
            this.f33106c.setRepeatMode(0);
            this.f33106c.prepare(concatenatingMediaSource);
            this.f33106c.addListener(this);
        } catch (Throwable th2) {
            q0.b("MBVideoView", th2.getMessage());
            th2.toString();
        }
    }

    public MBVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33104a = "MBVideoView";
        this.f33105b = 1000;
        this.f33107d = 5000L;
        this.f33110g = new SurfaceHolder.Callback() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                try {
                    Player.VideoComponent videoComponent = MBVideoView.this.f33106c.getVideoComponent();
                    if (videoComponent != null) {
                        videoComponent.setVideoSurfaceHolder(surfaceHolder);
                    }
                } catch (Throwable th2) {
                    q0.b("MBVideoView", th2.getMessage());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            }
        };
        this.f33111h = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.3
            @Override // java.lang.Runnable
            public void run() {
                if (MBVideoView.this.f33109f != null) {
                    MBVideoView.this.f33109f.onBufferingFail("Buffering fail.");
                }
            }
        };
        this.f33112i = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (MBVideoView.this.f33106c == null || !MBVideoView.this.isPlaying()) {
                        return;
                    }
                    long currentPosition = MBVideoView.this.f33106c.getCurrentPosition();
                    long duration = MBVideoView.this.f33106c.getDuration();
                    int iRound = Math.round(currentPosition / 1000.0f);
                    int iRound2 = Math.round(duration / 1000.0f);
                    q0.c("MBVideoView", "currentPosition:" + iRound + " duration:" + duration);
                    if (MBVideoView.this.f33109f != null) {
                        MBVideoView.this.f33109f.onPlayProgress(iRound, iRound2);
                    }
                    MBVideoView.this.getHandler().postDelayed(this, 1000L);
                } catch (Exception e10) {
                    q0.b("MBVideoView", e10.getMessage());
                }
            }
        };
    }

    public MBVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f33104a = "MBVideoView";
        this.f33105b = 1000;
        this.f33107d = 5000L;
        this.f33110g = new SurfaceHolder.Callback() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                try {
                    Player.VideoComponent videoComponent = MBVideoView.this.f33106c.getVideoComponent();
                    if (videoComponent != null) {
                        videoComponent.setVideoSurfaceHolder(surfaceHolder);
                    }
                } catch (Throwable th2) {
                    q0.b("MBVideoView", th2.getMessage());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i11, int i12, int i13) {
            }
        };
        this.f33111h = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.3
            @Override // java.lang.Runnable
            public void run() {
                if (MBVideoView.this.f33109f != null) {
                    MBVideoView.this.f33109f.onBufferingFail("Buffering fail.");
                }
            }
        };
        this.f33112i = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (MBVideoView.this.f33106c == null || !MBVideoView.this.isPlaying()) {
                        return;
                    }
                    long currentPosition = MBVideoView.this.f33106c.getCurrentPosition();
                    long duration = MBVideoView.this.f33106c.getDuration();
                    int iRound = Math.round(currentPosition / 1000.0f);
                    int iRound2 = Math.round(duration / 1000.0f);
                    q0.c("MBVideoView", "currentPosition:" + iRound + " duration:" + duration);
                    if (MBVideoView.this.f33109f != null) {
                        MBVideoView.this.f33109f.onPlayProgress(iRound, iRound2);
                    }
                    MBVideoView.this.getHandler().postDelayed(this, 1000L);
                } catch (Exception e10) {
                    q0.b("MBVideoView", e10.getMessage());
                }
            }
        };
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onSeekProcessed() {
    }

    public void pause() {
    }

    public void play() {
    }

    public void stop() {
    }

    public MBVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f33104a = "MBVideoView";
        this.f33105b = 1000;
        this.f33107d = 5000L;
        this.f33110g = new SurfaceHolder.Callback() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                try {
                    Player.VideoComponent videoComponent = MBVideoView.this.f33106c.getVideoComponent();
                    if (videoComponent != null) {
                        videoComponent.setVideoSurfaceHolder(surfaceHolder);
                    }
                } catch (Throwable th2) {
                    q0.b("MBVideoView", th2.getMessage());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i12, int i13, int i14) {
            }
        };
        this.f33111h = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.3
            @Override // java.lang.Runnable
            public void run() {
                if (MBVideoView.this.f33109f != null) {
                    MBVideoView.this.f33109f.onBufferingFail("Buffering fail.");
                }
            }
        };
        this.f33112i = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (MBVideoView.this.f33106c == null || !MBVideoView.this.isPlaying()) {
                        return;
                    }
                    long currentPosition = MBVideoView.this.f33106c.getCurrentPosition();
                    long duration = MBVideoView.this.f33106c.getDuration();
                    int iRound = Math.round(currentPosition / 1000.0f);
                    int iRound2 = Math.round(duration / 1000.0f);
                    q0.c("MBVideoView", "currentPosition:" + iRound + " duration:" + duration);
                    if (MBVideoView.this.f33109f != null) {
                        MBVideoView.this.f33109f.onPlayProgress(iRound, iRound2);
                    }
                    MBVideoView.this.getHandler().postDelayed(this, 1000L);
                } catch (Exception e10) {
                    q0.b("MBVideoView", e10.getMessage());
                }
            }
        };
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onLoadingChanged(boolean z10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onRepeatModeChanged(int i10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onShuffleModeEnabledChanged(boolean z10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTimelineChanged(Timeline timeline, @Nullable Object obj, int i10) {
    }
}
