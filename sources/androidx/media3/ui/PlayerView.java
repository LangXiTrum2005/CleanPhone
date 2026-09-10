package androidx.media3.ui;

import A.I0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.view.AttachedSurfaceControl;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.media3.common.AdOverlayInfo;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.ErrorMessageProvider;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class PlayerView extends FrameLayout implements AdViewProvider {
    public static final /* synthetic */ int N0 = 0;
    public FullscreenButtonClickListener A0;
    public int B0;
    public int C0;
    public Drawable D0;
    public int E0;
    public boolean F0;
    public ErrorMessageProvider G0;
    public CharSequence H0;
    public int I0;
    public boolean J0;
    public boolean K0;
    public boolean L0;
    public int M0;
    public final ComponentListener e0;
    public final AspectRatioFrameLayout f0;
    public final View g0;
    public final View h0;
    public final boolean i0;
    public final SurfaceSyncGroupCompatV34 j0;
    public final ImageView k0;
    public final ImageView l0;
    public final SubtitleView m0;
    public final View n0;
    public final TextView o0;
    public final PlayerControlView p0;
    public final FrameLayout q0;
    public final FrameLayout r0;
    public final Handler s0;
    public final Class t0;
    public final Method u0;
    public final Object v0;
    public Player w0;
    public boolean x0;
    public ControllerVisibilityListener y0;
    public PlayerControlView.VisibilityListener z0;

    public static class Api34 {
        public static void a(SurfaceView surfaceView) {
            surfaceView.setSurfaceLifecycle(2);
        }
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ArtworkDisplayMode {
    }

    public final class ComponentListener implements Player.Listener, View.OnLayoutChangeListener, View.OnClickListener, PlayerControlView.VisibilityListener, PlayerControlView.OnFullScreenModeChangedListener {
        public final Timeline.Period X = new Timeline.Period();

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public Object f7719Y;

        public ComponentListener() {
        }

        @Override // androidx.media3.ui.PlayerControlView.VisibilityListener
        public final void m(int i2) {
            int i3 = PlayerView.N0;
            PlayerView playerView = PlayerView.this;
            playerView.m();
            ControllerVisibilityListener controllerVisibilityListener = playerView.y0;
            if (controllerVisibilityListener != null) {
                controllerVisibilityListener.a();
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int i2 = PlayerView.N0;
            PlayerView.this.j();
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onCues(CueGroup cueGroup) {
            SubtitleView subtitleView = PlayerView.this.m0;
            if (subtitleView != null) {
                subtitleView.setCues(cueGroup.f5614a);
            }
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            PlayerView.b((TextureView) view, PlayerView.this.M0);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlayWhenReadyChanged(boolean z2, int i2) {
            int i3 = PlayerView.N0;
            PlayerView playerView = PlayerView.this;
            playerView.l();
            if (!playerView.e() || !playerView.K0) {
                playerView.f(false);
                return;
            }
            PlayerControlView playerControlView = playerView.p0;
            if (playerControlView != null) {
                playerControlView.g();
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPlaybackStateChanged(int i2) {
            int i3 = PlayerView.N0;
            PlayerView playerView = PlayerView.this;
            playerView.l();
            playerView.n();
            if (!playerView.e() || !playerView.K0) {
                playerView.f(false);
                return;
            }
            PlayerControlView playerControlView = playerView.p0;
            if (playerControlView != null) {
                playerControlView.g();
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i2) {
            PlayerControlView playerControlView;
            int i3 = PlayerView.N0;
            PlayerView playerView = PlayerView.this;
            if (playerView.e() && playerView.K0 && (playerControlView = playerView.p0) != null) {
                playerControlView.g();
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onRenderedFirstFrame() {
            PlayerView playerView = PlayerView.this;
            View view = playerView.g0;
            if (view != null) {
                view.setVisibility(4);
                if (!playerView.c()) {
                    playerView.d();
                    return;
                }
                ImageView imageView = playerView.k0;
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onSurfaceSizeChanged(int i2, int i3) {
            if (Util.f5683a == 34) {
                PlayerView playerView = PlayerView.this;
                if (playerView.h0 instanceof SurfaceView) {
                    SurfaceSyncGroupCompatV34 surfaceSyncGroupCompatV34 = playerView.j0;
                    surfaceSyncGroupCompatV34.getClass();
                    surfaceSyncGroupCompatV34.b(playerView.s0, (SurfaceView) playerView.h0, new a(playerView, 2));
                }
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onTracksChanged(Tracks tracks) {
            PlayerView playerView = PlayerView.this;
            Player player = playerView.w0;
            player.getClass();
            Timeline currentTimeline = player.k(17) ? player.getCurrentTimeline() : Timeline.f5507a;
            if (currentTimeline.p()) {
                this.f7719Y = null;
            } else {
                boolean zK = player.k(30);
                Timeline.Period period = this.X;
                if (!zK || player.d().f5547a.isEmpty()) {
                    Object obj = this.f7719Y;
                    if (obj != null) {
                        int iB = currentTimeline.b(obj);
                        if (iB != -1) {
                            if (player.f() == currentTimeline.f(iB, period, false).f5510c) {
                                return;
                            }
                        }
                        this.f7719Y = null;
                    }
                } else {
                    this.f7719Y = currentTimeline.f(player.getCurrentPeriodIndex(), period, true).f5509b;
                }
            }
            playerView.o(false);
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onVideoSizeChanged(VideoSize videoSize) {
            PlayerView playerView;
            Player player;
            if (videoSize.equals(VideoSize.f5552e) || (player = (playerView = PlayerView.this).w0) == null || player.getPlaybackState() == 1) {
                return;
            }
            playerView.k();
        }

        @Override // androidx.media3.ui.PlayerControlView.OnFullScreenModeChangedListener
        public final void r(boolean z2) {
            FullscreenButtonClickListener fullscreenButtonClickListener = PlayerView.this.A0;
            if (fullscreenButtonClickListener != null) {
                fullscreenButtonClickListener.a();
            }
        }
    }

    public interface ControllerVisibilityListener {
        void a();
    }

    public interface FullscreenButtonClickListener {
        void a();
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ImageDisplayMode {
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ShowBuffering {
    }

    public static final class SurfaceSyncGroupCompatV34 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public SurfaceSyncGroup f7720a;

        public void a() {
            SurfaceSyncGroup surfaceSyncGroup = this.f7720a;
            if (surfaceSyncGroup != null) {
                surfaceSyncGroup.markSyncReady();
                this.f7720a = null;
            }
        }

        public void b(Handler handler, final SurfaceView surfaceView, final Runnable runnable) {
            handler.post(new Runnable() { // from class: androidx.media3.ui.j
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerView.SurfaceSyncGroupCompatV34 surfaceSyncGroupCompatV34 = this.X;
                    AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
                    if (rootSurfaceControl == null) {
                        return;
                    }
                    SurfaceSyncGroup surfaceSyncGroupI = Y.a.i();
                    surfaceSyncGroupCompatV34.f7720a = surfaceSyncGroupI;
                    Assertions.e(surfaceSyncGroupI.add(rootSurfaceControl, new k()));
                    runnable.run();
                    rootSurfaceControl.applyTransactionOnDraw(androidx.media3.exoplayer.source.mediaparser.a.h());
                }
            });
        }
    }

    public PlayerView(Context context) {
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        super(context, null, 0);
        ComponentListener componentListener = new ComponentListener();
        this.e0 = componentListener;
        this.s0 = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f0 = null;
            this.g0 = null;
            this.h0 = null;
            this.i0 = false;
            this.j0 = null;
            this.k0 = null;
            this.l0 = null;
            this.m0 = null;
            this.n0 = null;
            this.o0 = null;
            this.p0 = null;
            this.q0 = null;
            this.r0 = null;
            this.t0 = null;
            this.u0 = null;
            this.v0 = null;
            ImageView imageView = new ImageView(context);
            if (Util.f5683a >= 23) {
                Resources resources = getResources();
                imageView.setImageDrawable(Util.r(context, resources, 2131231131));
                imageView.setBackgroundColor(resources.getColor(com.charging.screenshow.battery.animations.themes.R.color.exo_edit_mode_background_color, null));
            } else {
                Resources resources2 = getResources();
                imageView.setImageDrawable(Util.r(context, resources2, 2131231131));
                imageView.setBackgroundColor(resources2.getColor(com.charging.screenshow.battery.animations.themes.R.color.exo_edit_mode_background_color));
            }
            addView(imageView);
            return;
        }
        LayoutInflater.from(context).inflate(com.charging.screenshow.battery.animations.themes.R.layout.exo_player_view, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_content_frame);
        this.f0 = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setResizeMode(0);
        }
        this.g0 = findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_shutter);
        if (aspectRatioFrameLayout != null) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            SurfaceView surfaceView = new SurfaceView(context);
            if (Util.f5683a >= 34) {
                Api34.a(surfaceView);
            }
            this.h0 = surfaceView;
            surfaceView.setLayoutParams(layoutParams);
            surfaceView.setOnClickListener(componentListener);
            surfaceView.setClickable(false);
            aspectRatioFrameLayout.addView(surfaceView, 0);
        } else {
            this.h0 = null;
        }
        this.i0 = false;
        this.j0 = Util.f5683a == 34 ? new SurfaceSyncGroupCompatV34() : null;
        this.q0 = (FrameLayout) findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_ad_overlay);
        this.r0 = (FrameLayout) findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_overlay);
        this.k0 = (ImageView) findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_image);
        this.C0 = 0;
        try {
            cls = ExoPlayer.class;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: androidx.media3.ui.h
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    int i2 = PlayerView.N0;
                    PlayerView playerView = this.f7759a;
                    playerView.getClass();
                    if (!method2.getName().equals("onImageAvailable")) {
                        return null;
                    }
                    playerView.s0.post(new I0(15, playerView, (Bitmap) objArr[1]));
                    return null;
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.t0 = cls;
        this.u0 = method;
        this.v0 = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_artwork);
        this.l0 = imageView2;
        this.B0 = imageView2 != null ? 1 : 0;
        SubtitleView subtitleView = (SubtitleView) findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_subtitles);
        this.m0 = subtitleView;
        if (subtitleView != null) {
            subtitleView.a();
            subtitleView.b();
        }
        View viewFindViewById = findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_buffering);
        this.n0 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(8);
        }
        this.E0 = 0;
        TextView textView = (TextView) findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_error_message);
        this.o0 = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        PlayerControlView playerControlView = (PlayerControlView) findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_controller);
        View viewFindViewById2 = findViewById(com.charging.screenshow.battery.animations.themes.R.id.exo_controller_placeholder);
        if (playerControlView != null) {
            this.p0 = playerControlView;
        } else if (viewFindViewById2 != null) {
            PlayerControlView playerControlView2 = new PlayerControlView(context);
            this.p0 = playerControlView2;
            playerControlView2.setId(com.charging.screenshow.battery.animations.themes.R.id.exo_controller);
            playerControlView2.setLayoutParams(viewFindViewById2.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById2.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById2);
            viewGroup.removeView(viewFindViewById2);
            viewGroup.addView(playerControlView2, iIndexOfChild);
        } else {
            this.p0 = null;
        }
        PlayerControlView playerControlView3 = this.p0;
        this.I0 = playerControlView3 != null ? 5000 : 0;
        this.L0 = true;
        this.J0 = true;
        this.K0 = true;
        this.x0 = playerControlView3 != null;
        if (playerControlView3 != null) {
            PlayerControlViewLayoutManager playerControlViewLayoutManager = playerControlView3.e0;
            int i2 = playerControlViewLayoutManager.f7715z;
            if (i2 != 3 && i2 != 2) {
                playerControlViewLayoutManager.f();
                playerControlViewLayoutManager.i(2);
            }
            PlayerControlView playerControlView4 = this.p0;
            ComponentListener componentListener2 = this.e0;
            playerControlView4.getClass();
            componentListener2.getClass();
            playerControlView4.h0.add(componentListener2);
        }
        setClickable(true);
        m();
    }

    public static void a(PlayerView playerView, Bitmap bitmap) {
        playerView.getClass();
        playerView.setImage(new BitmapDrawable(playerView.getResources(), bitmap));
        Player player = playerView.w0;
        if (player != null && player.k(30) && player.d().a(2)) {
            return;
        }
        ImageView imageView = playerView.k0;
        if (imageView != null) {
            imageView.setVisibility(0);
            playerView.p();
        }
        View view = playerView.g0;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    public static void b(TextureView textureView, int i2) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i2 != 0) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate(i2, f, f2);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.k0;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        p();
    }

    private void setImageOutput(Player player) {
        Class cls = this.t0;
        if (cls == null || !cls.isAssignableFrom(player.getClass())) {
            return;
        }
        try {
            Method method = this.u0;
            method.getClass();
            Object obj = this.v0;
            obj.getClass();
            method.invoke(player, obj);
        } catch (IllegalAccessException | InvocationTargetException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final boolean c() {
        Player player = this.w0;
        return player != null && this.v0 != null && player.k(30) && player.d().a(4);
    }

    public final void d() {
        ImageView imageView = this.k0;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        SurfaceSyncGroupCompatV34 surfaceSyncGroupCompatV34;
        super.dispatchDraw(canvas);
        if (Util.f5683a != 34 || (surfaceSyncGroupCompatV34 = this.j0) == null) {
            return;
        }
        surfaceSyncGroupCompatV34.a();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Player player = this.w0;
        if (player != null && player.k(16) && this.w0.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        int keyCode = keyEvent.getKeyCode();
        boolean z2 = keyCode == 19 || keyCode == 270 || keyCode == 22 || keyCode == 271 || keyCode == 20 || keyCode == 269 || keyCode == 21 || keyCode == 268 || keyCode == 23;
        PlayerControlView playerControlView = this.p0;
        if (z2 && q() && !playerControlView.h()) {
            f(true);
            return true;
        }
        if ((q() && playerControlView.d(keyEvent)) || super.dispatchKeyEvent(keyEvent)) {
            f(true);
            return true;
        }
        if (z2 && q()) {
            f(true);
        }
        return false;
    }

    public final boolean e() {
        Player player = this.w0;
        return player != null && player.k(16) && this.w0.isPlayingAd() && this.w0.getPlayWhenReady();
    }

    public final void f(boolean z2) {
        if (!(e() && this.K0) && q()) {
            PlayerControlView playerControlView = this.p0;
            boolean z3 = playerControlView.h() && playerControlView.getShowTimeoutMs() <= 0;
            boolean zH = h();
            if (z2 || z3 || zH) {
                i(zH);
            }
        }
    }

    public final boolean g(Drawable drawable) {
        ImageView imageView = this.l0;
        if (imageView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.B0 == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                AspectRatioFrameLayout aspectRatioFrameLayout = this.f0;
                if (aspectRatioFrameLayout != null) {
                    aspectRatioFrameLayout.setAspectRatio(width);
                }
                imageView.setScaleType(scaleType);
                imageView.setImageDrawable(drawable);
                imageView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    public List<AdOverlayInfo> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.r0;
        if (frameLayout != null) {
            arrayList.add(new AdOverlayInfo(frameLayout));
        }
        PlayerControlView playerControlView = this.p0;
        if (playerControlView != null) {
            arrayList.add(new AdOverlayInfo(playerControlView));
        }
        return ImmutableList.u(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        FrameLayout frameLayout = this.q0;
        if (frameLayout != null) {
            return frameLayout;
        }
        throw new IllegalStateException("exo_ad_overlay must be present for ad playback");
    }

    public int getArtworkDisplayMode() {
        return this.B0;
    }

    public boolean getControllerAutoShow() {
        return this.J0;
    }

    public boolean getControllerHideOnTouch() {
        return this.L0;
    }

    public int getControllerShowTimeoutMs() {
        return this.I0;
    }

    public Drawable getDefaultArtwork() {
        return this.D0;
    }

    public int getImageDisplayMode() {
        return this.C0;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.r0;
    }

    public Player getPlayer() {
        return this.w0;
    }

    public int getResizeMode() {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f0;
        Assertions.f(aspectRatioFrameLayout);
        return aspectRatioFrameLayout.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.m0;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.B0 != 0;
    }

    public boolean getUseController() {
        return this.x0;
    }

    public View getVideoSurfaceView() {
        return this.h0;
    }

    public final boolean h() {
        Player player = this.w0;
        if (player != null) {
            int playbackState = player.getPlaybackState();
            if (!this.J0) {
                return false;
            }
            if (this.w0.k(17) && this.w0.getCurrentTimeline().p()) {
                return false;
            }
            if (playbackState != 1 && playbackState != 4) {
                Player player2 = this.w0;
                player2.getClass();
                if (player2.getPlayWhenReady()) {
                    return false;
                }
            }
        }
        return true;
    }

    public final void i(boolean z2) {
        if (q()) {
            int i2 = z2 ? 0 : this.I0;
            PlayerControlView playerControlView = this.p0;
            playerControlView.setShowTimeoutMs(i2);
            PlayerControlViewLayoutManager playerControlViewLayoutManager = playerControlView.e0;
            PlayerControlView playerControlView2 = playerControlViewLayoutManager.f7704a;
            if (!playerControlView2.i()) {
                playerControlView2.setVisibility(0);
                playerControlView2.j();
                ImageView imageView = playerControlView2.s0;
                if (imageView != null) {
                    imageView.requestFocus();
                }
            }
            playerControlViewLayoutManager.k();
        }
    }

    public final void j() {
        if (!q() || this.w0 == null) {
            return;
        }
        PlayerControlView playerControlView = this.p0;
        if (!playerControlView.h()) {
            f(true);
        } else if (this.L0) {
            playerControlView.g();
        }
    }

    public final void k() {
        Player player = this.w0;
        VideoSize videoSizeS = player != null ? player.s() : VideoSize.f5552e;
        int i2 = videoSizeS.f5553a;
        int i3 = videoSizeS.f5554b;
        float f = (i3 == 0 || i2 == 0) ? 0.0f : (i2 * videoSizeS.d) / i3;
        View view = this.h0;
        if (view instanceof TextureView) {
            int i4 = videoSizeS.f5555c;
            if (f > 0.0f && (i4 == 90 || i4 == 270)) {
                f = 1.0f / f;
            }
            int i5 = this.M0;
            ComponentListener componentListener = this.e0;
            if (i5 != 0) {
                view.removeOnLayoutChangeListener(componentListener);
            }
            this.M0 = i4;
            if (i4 != 0) {
                view.addOnLayoutChangeListener(componentListener);
            }
            b((TextureView) view, this.M0);
        }
        float f2 = this.i0 ? 0.0f : f;
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f0;
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    public final void l() {
        boolean z2;
        View view = this.n0;
        if (view != null) {
            Player player = this.w0;
            if (player == null || player.getPlaybackState() != 2) {
                z2 = false;
            } else {
                int i2 = this.E0;
                z2 = true;
                if (i2 != 2 && (i2 != 1 || !this.w0.getPlayWhenReady())) {
                    z2 = false;
                }
            }
            view.setVisibility(z2 ? 0 : 8);
        }
    }

    public final void m() {
        PlayerControlView playerControlView = this.p0;
        if (playerControlView == null || !this.x0) {
            setContentDescription(null);
        } else if (playerControlView.h()) {
            setContentDescription(this.L0 ? getResources().getString(com.charging.screenshow.battery.animations.themes.R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(com.charging.screenshow.battery.animations.themes.R.string.exo_controls_show));
        }
    }

    public final void n() {
        ErrorMessageProvider errorMessageProvider;
        TextView textView = this.o0;
        if (textView != null) {
            CharSequence charSequence = this.H0;
            if (charSequence != null) {
                textView.setText(charSequence);
                textView.setVisibility(0);
                return;
            }
            Player player = this.w0;
            if ((player != null ? player.a() : null) == null || (errorMessageProvider = this.G0) == null) {
                textView.setVisibility(8);
            } else {
                textView.setText((CharSequence) errorMessageProvider.a().second);
                textView.setVisibility(0);
            }
        }
    }

    public final void o(boolean z2) {
        byte[] bArr;
        Drawable drawable;
        Player player = this.w0;
        boolean zG = false;
        boolean z3 = (player == null || !player.k(30) || player.d().f5547a.isEmpty()) ? false : true;
        boolean z4 = this.F0;
        ImageView imageView = this.l0;
        View view = this.g0;
        if (!z4 && (!z3 || z2)) {
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
            if (view != null) {
                view.setVisibility(0);
            }
            d();
        }
        if (z3) {
            Player player2 = this.w0;
            boolean z5 = player2 != null && player2.k(30) && player2.d().a(2);
            boolean zC = c();
            if (!z5 && !zC) {
                if (view != null) {
                    view.setVisibility(0);
                }
                d();
            }
            ImageView imageView2 = this.k0;
            boolean z6 = (view == null || view.getVisibility() != 4 || imageView2 == null || (drawable = imageView2.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
            if (zC && !z5 && z6) {
                if (view != null) {
                    view.setVisibility(0);
                }
                if (imageView2 != null) {
                    imageView2.setVisibility(0);
                    p();
                }
            } else if (z5 && !zC && z6) {
                d();
            }
            if (!z5 && !zC && this.B0 != 0) {
                Assertions.f(imageView);
                if (player != null && player.k(18) && (bArr = player.y().f) != null) {
                    zG = g(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
                }
                if (zG || g(this.D0)) {
                    return;
                }
            }
            if (imageView != null) {
                imageView.setImageResource(android.R.color.transparent);
                imageView.setVisibility(4);
            }
        }
    }

    @Override // android.view.View
    public final boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!q() || this.w0 == null) {
            return false;
        }
        f(true);
        return true;
    }

    public final void p() {
        Drawable drawable;
        AspectRatioFrameLayout aspectRatioFrameLayout;
        ImageView imageView = this.k0;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.C0 == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (imageView.getVisibility() == 0 && (aspectRatioFrameLayout = this.f0) != null) {
            aspectRatioFrameLayout.setAspectRatio(width);
        }
        imageView.setScaleType(scaleType);
    }

    @Override // android.view.View
    public final boolean performClick() {
        j();
        return super.performClick();
    }

    public final boolean q() {
        if (!this.x0) {
            return false;
        }
        Assertions.f(this.p0);
        return true;
    }

    public void setArtworkDisplayMode(int i2) {
        Assertions.e(i2 == 0 || this.l0 != null);
        if (this.B0 != i2) {
            this.B0 = i2;
            o(false);
        }
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.AspectRatioListener aspectRatioListener) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f0;
        Assertions.f(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setAspectRatioListener(aspectRatioListener);
    }

    public void setControllerAnimationEnabled(boolean z2) {
        PlayerControlView playerControlView = this.p0;
        Assertions.f(playerControlView);
        playerControlView.setAnimationEnabled(z2);
    }

    public void setControllerAutoShow(boolean z2) {
        this.J0 = z2;
    }

    public void setControllerHideDuringAds(boolean z2) {
        this.K0 = z2;
    }

    public void setControllerHideOnTouch(boolean z2) {
        Assertions.f(this.p0);
        this.L0 = z2;
        m();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(PlayerControlView.OnFullScreenModeChangedListener onFullScreenModeChangedListener) {
        PlayerControlView playerControlView = this.p0;
        Assertions.f(playerControlView);
        this.A0 = null;
        playerControlView.setOnFullScreenModeChangedListener(onFullScreenModeChangedListener);
    }

    public void setControllerShowTimeoutMs(int i2) {
        PlayerControlView playerControlView = this.p0;
        Assertions.f(playerControlView);
        this.I0 = i2;
        if (playerControlView.h()) {
            i(h());
        }
    }

    public void setControllerVisibilityListener(ControllerVisibilityListener controllerVisibilityListener) {
        this.y0 = controllerVisibilityListener;
        if (controllerVisibilityListener != null) {
            setControllerVisibilityListener((PlayerControlView.VisibilityListener) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        Assertions.e(this.o0 != null);
        this.H0 = charSequence;
        n();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.D0 != drawable) {
            this.D0 = drawable;
            o(false);
        }
    }

    public void setErrorMessageProvider(ErrorMessageProvider<? super PlaybackException> errorMessageProvider) {
        if (this.G0 != errorMessageProvider) {
            this.G0 = errorMessageProvider;
            n();
        }
    }

    public void setFullscreenButtonClickListener(FullscreenButtonClickListener fullscreenButtonClickListener) {
        PlayerControlView playerControlView = this.p0;
        Assertions.f(playerControlView);
        this.A0 = fullscreenButtonClickListener;
        playerControlView.setOnFullScreenModeChangedListener(this.e0);
    }

    public void setImageDisplayMode(int i2) {
        Assertions.e(this.k0 != null);
        if (this.C0 != i2) {
            this.C0 = i2;
            p();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z2) {
        if (this.F0 != z2) {
            this.F0 = z2;
            o(false);
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x00ed  */
    /* JADX WARN: Multi-variable type inference failed */
    public void setPlayer(Player player) {
        Assertions.e(Looper.myLooper() == Looper.getMainLooper());
        Assertions.b(player == null || player.m() == Looper.getMainLooper());
        Player player2 = this.w0;
        if (player2 == player) {
            return;
        }
        View view = this.h0;
        ComponentListener componentListener = this.e0;
        if (player2 != null) {
            player2.j(componentListener);
            if (player2.k(27)) {
                if (view instanceof TextureView) {
                    player2.clearVideoTextureView((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    player2.clearVideoSurfaceView((SurfaceView) view);
                }
            }
            Class cls = this.t0;
            if (cls != null && cls.isAssignableFrom(player2.getClass())) {
                try {
                    Method method = this.u0;
                    method.getClass();
                    method.invoke(player2, null);
                } catch (IllegalAccessException | InvocationTargetException e2) {
                    throw new RuntimeException(e2);
                }
            }
        }
        SubtitleView subtitleView = this.m0;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.w0 = player;
        boolean zQ = q();
        PlayerControlView playerControlView = this.p0;
        if (zQ) {
            playerControlView.setPlayer(player);
        }
        l();
        n();
        o(true);
        if (player == null) {
            if (playerControlView != null) {
                playerControlView.g();
                return;
            }
            return;
        }
        if (player.k(27)) {
            if (view instanceof TextureView) {
                player.setVideoTextureView((TextureView) view);
            } else if (view instanceof SurfaceView) {
                player.setVideoSurfaceView((SurfaceView) view);
            }
            if (player.k(30)) {
                Tracks tracksD = player.d();
                boolean z2 = false;
                int i2 = 0;
                loop0: while (true) {
                    ImmutableList immutableList = tracksD.f5547a;
                    if (i2 >= immutableList.size()) {
                        break;
                    }
                    if (((Tracks.Group) immutableList.get(i2)).f5549b.f5523c == 2) {
                        Tracks.Group group = (Tracks.Group) immutableList.get(i2);
                        for (int i3 = 0; i3 < group.d.length; i3++) {
                            if (group.b(i3)) {
                                z2 = true;
                                break loop0;
                            }
                        }
                    }
                    i2++;
                }
                if (z2) {
                    k();
                }
            } else {
                k();
            }
        }
        if (subtitleView != null && player.k(28)) {
            subtitleView.setCues(player.i().f5614a);
        }
        player.l(componentListener);
        setImageOutput(player);
        f(false);
    }

    public void setRepeatToggleModes(int i2) {
        PlayerControlView playerControlView = this.p0;
        Assertions.f(playerControlView);
        playerControlView.setRepeatToggleModes(i2);
    }

    public void setResizeMode(int i2) {
        AspectRatioFrameLayout aspectRatioFrameLayout = this.f0;
        Assertions.f(aspectRatioFrameLayout);
        aspectRatioFrameLayout.setResizeMode(i2);
    }

    public void setShowBuffering(int i2) {
        if (this.E0 != i2) {
            this.E0 = i2;
            l();
        }
    }

    public void setShowFastForwardButton(boolean z2) {
        PlayerControlView playerControlView = this.p0;
        Assertions.f(playerControlView);
        playerControlView.setShowFastForwardButton(z2);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z2) {
        PlayerControlView playerControlView = this.p0;
        Assertions.f(playerControlView);
        playerControlView.setShowMultiWindowTimeBar(z2);
    }

    public void setShowNextButton(boolean z2) {
        PlayerControlView playerControlView = this.p0;
        Assertions.f(playerControlView);
        playerControlView.setShowNextButton(z2);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z2) {
        PlayerControlView playerControlView = this.p0;
        Assertions.f(playerControlView);
        playerControlView.setShowPlayButtonIfPlaybackIsSuppressed(z2);
    }

    public void setShowPreviousButton(boolean z2) {
        PlayerControlView playerControlView = this.p0;
        Assertions.f(playerControlView);
        playerControlView.setShowPreviousButton(z2);
    }

    public void setShowRewindButton(boolean z2) {
        PlayerControlView playerControlView = this.p0;
        Assertions.f(playerControlView);
        playerControlView.setShowRewindButton(z2);
    }

    public void setShowShuffleButton(boolean z2) {
        PlayerControlView playerControlView = this.p0;
        Assertions.f(playerControlView);
        playerControlView.setShowShuffleButton(z2);
    }

    public void setShowSubtitleButton(boolean z2) {
        PlayerControlView playerControlView = this.p0;
        Assertions.f(playerControlView);
        playerControlView.setShowSubtitleButton(z2);
    }

    public void setShowVrButton(boolean z2) {
        PlayerControlView playerControlView = this.p0;
        Assertions.f(playerControlView);
        playerControlView.setShowVrButton(z2);
    }

    public void setShutterBackgroundColor(int i2) {
        View view = this.g0;
        if (view != null) {
            view.setBackgroundColor(i2);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z2) {
        setArtworkDisplayMode(!z2 ? 1 : 0);
    }

    public void setUseController(boolean z2) {
        boolean z3 = true;
        PlayerControlView playerControlView = this.p0;
        Assertions.e((z2 && playerControlView == null) ? false : true);
        if (!z2 && !hasOnClickListeners()) {
            z3 = false;
        }
        setClickable(z3);
        if (this.x0 == z2) {
            return;
        }
        this.x0 = z2;
        if (q()) {
            playerControlView.setPlayer(this.w0);
        } else if (playerControlView != null) {
            playerControlView.g();
            playerControlView.setPlayer(null);
        }
        m();
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        View view = this.h0;
        if (view instanceof SurfaceView) {
            view.setVisibility(i2);
        }
    }

    @Deprecated
    public void setControllerVisibilityListener(PlayerControlView.VisibilityListener visibilityListener) {
        PlayerControlView playerControlView = this.p0;
        Assertions.f(playerControlView);
        PlayerControlView.VisibilityListener visibilityListener2 = this.z0;
        if (visibilityListener2 == visibilityListener) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = playerControlView.h0;
        if (visibilityListener2 != null) {
            copyOnWriteArrayList.remove(visibilityListener2);
        }
        this.z0 = visibilityListener;
        if (visibilityListener != null) {
            copyOnWriteArrayList.add(visibilityListener);
            setControllerVisibilityListener((ControllerVisibilityListener) null);
        }
    }
}
