package com.chartboost.sdk.impl;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
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
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.PlayerView;
import com.chartboost.sdk.events.ChartboostError;
import com.thinkup.core.common.n.mo;
import java.io.File;
import java.net.URL;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.RangesKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobSupport;
import kotlinx.coroutines.NonCancellable;
import kotlinx.coroutines.SupervisorKt;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import kotlinx.coroutines.scheduling.DefaultScheduler;

/* JADX INFO: loaded from: classes3.dex */
public final class f7 implements vi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l7 f13864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yd f13865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f13866c;
    public wi d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ExoPlayer f13867e;
    public PlayerView f;
    public URL g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CancellableContinuation f13868h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g7 f13869i;
    public final a j;

    public static final class a implements Player.Listener {
        public a() {
        }

        public /* bridge */ /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        }

        public /* bridge */ /* synthetic */ void onAudioSessionIdChanged(int i2) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onCues(CueGroup cueGroup) {
        }

        public /* bridge */ /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        }

        public /* bridge */ /* synthetic */ void onDeviceVolumeChanged(int i2, boolean z2) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onEvents(Player player, Player.Events events) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onIsLoadingChanged(boolean z2) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onIsPlayingChanged(boolean z2) {
        }

        @Override // androidx.media3.common.Player.Listener
        @Deprecated
        public /* bridge */ /* synthetic */ void onLoadingChanged(boolean z2) {
        }

        public /* bridge */ /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i2) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onMetadata(Metadata metadata) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onPlayWhenReadyChanged(boolean z2, int i2) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(int i2) {
            if (i2 == 1) {
                za.a("Player is idle.", (Throwable) null, 2, (Object) null);
                return;
            }
            if (i2 == 2) {
                za.a("Player is buffering.", (Throwable) null, 2, (Object) null);
                return;
            }
            if (i2 != 3) {
                if (i2 != 4) {
                    return;
                }
                f7.this.f13869i.a(ud.d.f15277a);
            } else {
                wd wdVarB = f7.this.f13869i.b();
                if (wdVarB instanceof wd.c) {
                    f7.this.f13869i.a(new ud.f(((wd.c) wdVarB).a()));
                }
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onPlaybackSuppressionReasonChanged(int i2) {
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayerError(PlaybackException error) {
            Intrinsics.f(error, "error");
            f7.this.f13869i.a(new ud.e(error));
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        }

        @Override // androidx.media3.common.Player.Listener
        @Deprecated
        public /* bridge */ /* synthetic */ void onPlayerStateChanged(boolean z2, int i2) {
        }

        public /* bridge */ /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        }

        @Override // androidx.media3.common.Player.Listener
        @Deprecated
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(int i2) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onRenderedFirstFrame() {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onRepeatModeChanged(int i2) {
        }

        public /* bridge */ /* synthetic */ void onSeekBackIncrementChanged(long j) {
        }

        public /* bridge */ /* synthetic */ void onSeekForwardIncrementChanged(long j) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onShuffleModeEnabledChanged(boolean z2) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onSkipSilenceEnabledChanged(boolean z2) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onSurfaceSizeChanged(int i2, int i3) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onTimelineChanged(Timeline timeline, int i2) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onTracksChanged(Tracks tracks) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onVolumeChanged(float f) {
        }

        @Override // androidx.media3.common.Player.Listener
        @Deprecated
        public /* bridge */ /* synthetic */ void onCues(List list) {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* bridge */ /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
        }
    }

    public static final class b extends ContinuationImpl {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f13871b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f13872c;
        public Object d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f13873e;
        public /* synthetic */ Object f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f13874h;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            this.f = obj;
            this.f13874h |= Integer.MIN_VALUE;
            Object objA = f7.this.a(null, null, null, this);
            return objA == CoroutineSingletons.X ? objA : new Result(objA);
        }
    }

    public static final class c extends Lambda implements Function1 {

        public static final class a extends SuspendLambda implements Function2 {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f13876b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ f7 f13877c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f7 f7Var, Continuation continuation) {
                super(2, continuation);
                this.f13877c = f7Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f43263a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f13877c, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
                if (this.f13876b != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.b(obj);
                this.f13877c.f13869i.a(ud.i.f15282a);
                return Unit.f43263a;
            }
        }

        public c() {
            super(1);
        }

        public final void a(Throwable th) {
            BuildersKt.c(f7.this.f13866c, NonCancellable.X, null, new a(f7.this, null), 2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.f43263a;
        }
    }

    public f7(l7 exoPlayerFactory, yd playerViewFactory, CoroutineScope coroutineScope) {
        Intrinsics.f(exoPlayerFactory, "exoPlayerFactory");
        Intrinsics.f(playerViewFactory, "playerViewFactory");
        Intrinsics.f(coroutineScope, "coroutineScope");
        this.f13864a = exoPlayerFactory;
        this.f13865b = playerViewFactory;
        this.f13866c = coroutineScope;
        this.f13869i = new g7(this, coroutineScope);
        this.j = new a();
    }

    public final void d() {
        wi wiVarC = c();
        if (wiVarC != null) {
            wiVarC.c();
        }
    }

    public final void e() {
        CancellableContinuation cancellableContinuation = this.f13868h;
        if (cancellableContinuation != null) {
            if (!cancellableContinuation.isActive()) {
                cancellableContinuation = null;
            }
            if (cancellableContinuation != null) {
                cancellableContinuation.resumeWith(new Result(Unit.f43263a));
            }
        }
        this.f13868h = null;
        wi wiVarC = c();
        if (wiVarC != null) {
            wiVarC.e();
        }
    }

    public final void f() {
        ExoPlayer exoPlayer = this.f13867e;
        if (exoPlayer != null) {
            exoPlayer.j(this.j);
        }
        ExoPlayer exoPlayer2 = this.f13867e;
        if (exoPlayer2 != null) {
            exoPlayer2.release();
        }
        this.f13867e = null;
        PlayerView playerView = this.f;
        if (playerView != null) {
            playerView.setPlayer(null);
        }
        za.a("ExoPlayer instance has been released.", (Throwable) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.vi
    public float getVolume() {
        ExoPlayer exoPlayer = this.f13867e;
        if (exoPlayer != null) {
            return exoPlayer.getVolume();
        }
        return 1.0f;
    }

    @Override // com.chartboost.sdk.impl.vi
    public void pause() {
        this.f13869i.a(ud.g.f15280a);
    }

    @Override // com.chartboost.sdk.impl.vi
    public void play() {
        this.f13869i.a(ud.h.f15281a);
    }

    @Override // com.chartboost.sdk.impl.vi
    public void release() {
        this.f13869i.a(ud.i.f15282a);
    }

    @Override // com.chartboost.sdk.impl.vi
    public void setVolume(float f) {
        this.f13869i.a(new ud.j(f));
    }

    public final ExoPlayer b(Context context) {
        Intrinsics.f(context, "context");
        f();
        ExoPlayer exoPlayerA = this.f13864a.a(context);
        this.f13867e = exoPlayerA;
        exoPlayerA.l(this.j);
        return exoPlayerA;
    }

    public wi c() {
        return this.d;
    }

    public final void d(ExoPlayer player) {
        Intrinsics.f(player, "player");
        player.stop();
        URL url = this.g;
        za.a(android.support.v4.media.a.n("Stop command sent to player for ", url != null ? url.toString() : null, mo.ono), (Throwable) null, 2, (Object) null);
    }

    public final void c(ExoPlayer player) {
        Intrinsics.f(player, "player");
        player.prepare();
    }

    @Override // com.chartboost.sdk.impl.vi
    public long a() {
        return this.f13869i.c();
    }

    @Override // com.chartboost.sdk.impl.vi
    public View a(Context context) {
        Intrinsics.f(context, "context");
        if (this.f13867e == null) {
            return null;
        }
        PlayerView playerView = this.f;
        if (playerView == null || !Intrinsics.a(playerView.getContext(), context)) {
            PlayerView playerView2 = this.f;
            if (playerView2 != null) {
                playerView2.setPlayer(null);
            }
            PlayerView playerViewA = this.f13865b.a(context);
            playerViewA.setPlayer(this.f13867e);
            this.f = playerViewA;
        }
        return this.f;
    }

    @Override // com.chartboost.sdk.impl.vi
    public long b() {
        return this.f13869i.a();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public f7(l7 l7Var, yd ydVar, CoroutineScope coroutineScope, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i2 & 4) != 0) {
            Job jobB = SupervisorKt.b();
            DefaultScheduler defaultScheduler = Dispatchers.f44752a;
            coroutineScope = CoroutineScopeKt.a(CoroutineContext.Element.DefaultImpls.d((JobSupport) jobB, MainDispatcherLoader.f45042a.j0()));
        }
        this(l7Var, ydVar, coroutineScope);
    }

    public final void b(ExoPlayer player) {
        Intrinsics.f(player, "player");
        player.setPlayWhenReady(true);
        URL url = this.g;
        za.a(android.support.v4.media.a.n("Play command sent to player for ", url != null ? url.toString() : null, mo.ono), (Throwable) null, 2, (Object) null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // com.chartboost.sdk.impl.vi
    public Object a(Context context, URL url, l6 l6Var, Continuation continuation) throws Throwable {
        b bVar;
        CancellableContinuation cancellableContinuation;
        if (continuation instanceof b) {
            bVar = (b) continuation;
            int i2 = bVar.f13874h;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bVar.f13874h = i2 - Integer.MIN_VALUE;
            } else {
                bVar = new b(continuation);
            }
        } else {
            bVar = new b(continuation);
        }
        Object objP = bVar.f;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.X;
        int i3 = bVar.f13874h;
        if (i3 == 0) {
            ResultKt.b(objP);
            bVar.f13871b = this;
            bVar.f13872c = context;
            bVar.d = url;
            bVar.f13873e = l6Var;
            bVar.f13874h = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(1, IntrinsicsKt.b(bVar));
            cancellableContinuationImpl.q();
            CancellableContinuation cancellableContinuation2 = this.f13868h;
            if (cancellableContinuation2 != null && cancellableContinuation2.isActive() && (cancellableContinuation = this.f13868h) != null) {
                cancellableContinuation.f(null);
            }
            this.f13868h = cancellableContinuationImpl;
            this.g = url;
            this.f13869i.a(new ud.a(context, url, l6Var));
            cancellableContinuationImpl.s(new c());
            objP = cancellableContinuationImpl.p();
            if (objP == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.b(objP);
        }
        return ((Result) objP).X;
    }

    public final void a(Throwable error) {
        ChartboostError videoPlaybackError;
        ChartboostError chartboostError;
        Intrinsics.f(error, "error");
        URL url = this.g;
        za.b("ExoPlayerAdapter error for " + (url != null ? url.toString() : null), error);
        if (error instanceof ChartboostError) {
            chartboostError = (ChartboostError) error;
        } else if ((error instanceof PlaybackException) && (error.getCause() instanceof ChartboostError)) {
            Throwable cause = error.getCause();
            Intrinsics.d(cause, "null cannot be cast to non-null type com.chartboost.sdk.events.ChartboostError");
            chartboostError = (ChartboostError) cause;
        } else {
            CancellableContinuation cancellableContinuation = this.f13868h;
            if (cancellableContinuation != null && cancellableContinuation.isActive()) {
                videoPlaybackError = new ChartboostError.Load.Unknown(error.getMessage(), error);
            } else {
                videoPlaybackError = new ChartboostError.Render.VideoPlaybackError(error.getMessage(), error);
            }
            chartboostError = videoPlaybackError;
        }
        CancellableContinuation cancellableContinuation2 = this.f13868h;
        if (cancellableContinuation2 != null) {
            if (!cancellableContinuation2.isActive()) {
                cancellableContinuation2 = null;
            }
            if (cancellableContinuation2 != null) {
                cancellableContinuation2.resumeWith(ResultKt.a(chartboostError));
            }
        }
        this.f13868h = null;
        if ((chartboostError instanceof ChartboostError.Load.AssetUnavailable) || (chartboostError instanceof ChartboostError.Show.AdInvalidated)) {
            wi wiVarC = c();
            if (wiVarC != null) {
                wiVarC.d();
            }
        } else {
            wi wiVarC2 = c();
            if (wiVarC2 != null) {
                wiVarC2.a(chartboostError);
            }
        }
        this.f13869i.a(ud.i.f15282a);
    }

    public final void a(ExoPlayer player) {
        Intrinsics.f(player, "player");
        player.setPlayWhenReady(false);
        URL url = this.g;
        za.a(android.support.v4.media.a.n("Pause command sent to player for ", url != null ? url.toString() : null, mo.ono), (Throwable) null, 2, (Object) null);
    }

    public final void a(ExoPlayer player, File cachedFile) {
        Intrinsics.f(player, "player");
        Intrinsics.f(cachedFile, "cachedFile");
        Uri uriFromFile = Uri.fromFile(cachedFile);
        int i2 = MediaItem.g;
        MediaItem.Builder builder = new MediaItem.Builder();
        builder.f5442b = uriFromFile;
        player.h(builder.a());
        player.prepare();
        URL url = this.g;
        za.a(android.support.v4.media.a.n("Player created and preparing for ", url != null ? url.toString() : null, mo.ono), (Throwable) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.vi
    public void a(wi wiVar) {
        this.d = wiVar;
    }

    public final void a(ExoPlayer player, float f) {
        Intrinsics.f(player, "player");
        player.setVolume(RangesKt.a(f));
    }

    @Override // com.chartboost.sdk.impl.vi
    public void a(fg reason) {
        Intrinsics.f(reason, "reason");
        this.f13869i.a(new ud.k(reason));
    }
}
