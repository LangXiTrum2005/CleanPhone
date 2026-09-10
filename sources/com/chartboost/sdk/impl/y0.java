package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.video.VideoSize;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 implements b1, SurfaceHolder.Callback, Player.Listener, zi.b, y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7 f15593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SurfaceView f15594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f15595c;
    public final Lazy d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f15596e;
    public boolean f;
    public boolean g;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k7 f15597b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y0 f15598c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k7 k7Var, y0 y0Var) {
            super(0);
            this.f15597b = k7Var;
            this.f15598c = y0Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ExoPlayer invoke() {
            ExoPlayer exoPlayerA = this.f15597b.a();
            exoPlayerA.h(this.f15598c);
            return exoPlayerA;
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Function3 f15599b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y0 f15600c;
        public final /* synthetic */ lh d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function3 function3, y0 y0Var, lh lhVar) {
            super(0);
            this.f15599b = function3;
            this.f15600c = y0Var;
            this.d = lhVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final zi invoke() {
            return (zi) this.f15599b.invoke(this.f15600c.f15595c, this.f15600c, this.d);
        }
    }

    public y0(Context context, k7 exoPlayerFactory, o7 exoPlayerMediaItemFactory, SurfaceView surfaceView, c1 c1Var, lh uiPoster, Function3 videoProgressFactory) {
        Intrinsics.f(context, "context");
        Intrinsics.f(exoPlayerFactory, "exoPlayerFactory");
        Intrinsics.f(exoPlayerMediaItemFactory, "exoPlayerMediaItemFactory");
        Intrinsics.f(surfaceView, "surfaceView");
        Intrinsics.f(uiPoster, "uiPoster");
        Intrinsics.f(videoProgressFactory, "videoProgressFactory");
        this.f15593a = exoPlayerMediaItemFactory;
        this.f15594b = surfaceView;
        this.f15595c = c1Var;
        this.d = LazyKt.b(new a(exoPlayerFactory, this));
        this.f15596e = LazyKt.b(new b(videoProgressFactory, this, uiPoster));
    }

    @Override // com.chartboost.sdk.impl.of
    public void a(int i2, int i3) {
    }

    public final void b(int i2, int i3) {
        hj.a(this.f15594b, q7.b(d()), q7.a(d()), i2, i3);
    }

    @Override // com.chartboost.sdk.impl.y1
    public void c() {
        this.g = true;
    }

    public final ExoPlayer d() {
        return (ExoPlayer) this.d.getX();
    }

    public final zi e() {
        return (zi) this.f15596e.getX();
    }

    @Override // com.chartboost.sdk.impl.b1
    public void f() {
        d().setVolume(0.0f);
    }

    @Override // com.chartboost.sdk.impl.b1
    public float g() {
        return d().getVolume();
    }

    @Override // com.chartboost.sdk.impl.b1
    public boolean h() {
        return this.f;
    }

    public final void i() {
        stop();
        l();
        c1 c1Var = this.f15595c;
        if (c1Var != null) {
            c1Var.b();
        }
    }

    public final void j() {
        a(this, 0, 0, 3, null);
        c1 c1Var = this.f15595c;
        if (c1Var != null) {
            c1Var.d();
        }
        c1 c1Var2 = this.f15595c;
        if (c1Var2 != null) {
            c1Var2.b(d().getDuration());
        }
    }

    public final void k() {
        zi.a.a(e(), 0L, 1, null);
    }

    public final void l() {
        e().a();
    }

    public /* bridge */ /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
    }

    public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i2) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onCues(CueGroup cueGroup) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i2, boolean z2) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onEvents(Player player, Player.Events events) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z2) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onIsPlayingChanged(boolean z2) {
        za.a("onIsPlayingChanged() - isPlaying: " + z2, (Throwable) null, 2, (Object) null);
        if (!z2) {
            l();
            return;
        }
        this.f = true;
        c1 c1Var = this.f15595c;
        if (c1Var != null) {
            c1Var.a();
        }
        k();
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    @Deprecated
    public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z2) {
    }

    public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i2) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onMetadata(Metadata metadata) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z2, int i2) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlaybackStateChanged(int i2) {
        za.a("onPlaybackStateChanged() - playbackState: " + z0.b(i2), (Throwable) null, 2, (Object) null);
        if (i2 == 2) {
            c1 c1Var = this.f15595c;
            if (c1Var != null) {
                c1Var.c();
                return;
            }
            return;
        }
        if (i2 == 3) {
            j();
        } else {
            if (i2 != 4) {
                return;
            }
            i();
        }
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i2) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlayerError(PlaybackException error) {
        Intrinsics.f(error, "error");
        za.b("ExoPlayer error", error);
        stop();
        c1 c1Var = this.f15595c;
        if (c1Var != null) {
            String message = error.getMessage();
            if (message == null) {
                message = "No error message from ExoPlayer";
            }
            c1Var.a(message);
        }
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    @Deprecated
    public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z2, int i2) {
    }

    public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    @Deprecated
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i2) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
    }

    public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i2) {
    }

    public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
    }

    public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
    }

    @Deprecated
    public /* bridge */ /* synthetic */ void onSeekProcessed() {
    }

    public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z2) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z2) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i2, int i3) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onTimelineChanged(Timeline timeline, int i2) {
    }

    public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onTracksChanged(Tracks tracks) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onVolumeChanged(float f) {
    }

    @Override // com.chartboost.sdk.impl.b1
    public void pause() {
        za.a("pause()", (Throwable) null, 2, (Object) null);
        d().pause();
    }

    @Override // com.chartboost.sdk.impl.b1
    public void play() {
        za.a("play()", (Throwable) null, 2, (Object) null);
        d().setVideoSurfaceView(this.f15594b);
        d().play();
        this.g = false;
    }

    @Override // com.chartboost.sdk.impl.b1
    public void stop() {
        za.a("stop()", (Throwable) null, 2, (Object) null);
        if (d().isPlaying()) {
            d().stop();
        }
        d().release();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder holder, int i2, int i3, int i4) {
        Intrinsics.f(holder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder holder) {
        Intrinsics.f(holder, "holder");
        za.a("surfaceCreated()", (Throwable) null, 2, (Object) null);
        if (this.g) {
            play();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder holder) {
        Intrinsics.f(holder, "holder");
        za.a("surfaceDestroyed()", (Throwable) null, 2, (Object) null);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    @Deprecated
    public /* bridge */ /* synthetic */ void onCues(List list) {
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* bridge */ /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0036  */
    @Override // com.chartboost.sdk.impl.b1
    public void a(oi asset) {
        Unit unit;
        Intrinsics.f(asset, "asset");
        za.a("asset() - asset: " + asset, (Throwable) null, 2, (Object) null);
        MediaItem mediaItemB = b(asset);
        if (mediaItemB != null) {
            ExoPlayer exoPlayerD = d();
            exoPlayerD.g(mediaItemB);
            exoPlayerD.prepare();
            SurfaceHolder holder = this.f15594b.getHolder();
            if (holder != null) {
                holder.addCallback(this);
                unit = Unit.f43263a;
            } else {
                unit = null;
            }
        } else {
            unit = null;
        }
        if (unit == null) {
            c1 c1Var = this.f15595c;
            if (c1Var != null) {
                c1Var.a("Error retrieving media item");
            }
            za.b("Error retrieving media item", (Throwable) null, 2, (Object) null);
        }
        this.f = false;
    }

    public final MediaItem b(oi oiVar) {
        MediaItem mediaItemA = this.f15593a.a(oiVar);
        za.a("VideoAsset.toMediaItem() - " + mediaItemA, (Throwable) null, 2, (Object) null);
        return mediaItemA;
    }

    @Override // com.chartboost.sdk.impl.b1
    public void b() {
        d().setVolume(1.0f);
    }

    public /* synthetic */ y0(Context context, k7 k7Var, o7 o7Var, SurfaceView surfaceView, c1 c1Var, lh lhVar, Function3 function3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? new k7(context, null, null, null, 14, null) : k7Var, o7Var, surfaceView, (i2 & 16) != 0 ? null : c1Var, lhVar, function3);
    }

    @Override // com.chartboost.sdk.impl.zi.b
    public long a() {
        return d().getCurrentPosition();
    }

    public static /* synthetic */ void a(y0 y0Var, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i2 = y0Var.f15594b.getWidth();
        }
        if ((i4 & 2) != 0) {
            i3 = y0Var.f15594b.getHeight();
        }
        y0Var.b(i2, i3);
    }
}
