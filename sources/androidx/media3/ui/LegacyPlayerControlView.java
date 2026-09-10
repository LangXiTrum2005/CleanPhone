package androidx.media3.ui;

import android.os.Looper;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.media3.common.FlagSet;
import androidx.media3.common.MediaLibraryInfo;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;

/* JADX INFO: loaded from: classes.dex */
public class LegacyPlayerControlView extends FrameLayout {
    public static final /* synthetic */ int s0 = 0;
    public Player e0;
    public ProgressUpdateListener f0;
    public boolean g0;
    public boolean h0;
    public boolean i0;
    public boolean j0;
    public int k0;
    public int l0;
    public int m0;
    public boolean n0;
    public long o0;
    public long p0;
    public long q0;
    public long r0;

    public static final class Api21 {
        public static boolean a(View view) {
            return view.isAccessibilityFocused();
        }
    }

    public final class ComponentListener implements Player.Listener, TimeBar.OnScrubListener, View.OnClickListener {
        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public final void m(long j) {
            throw null;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            throw null;
        }

        @Override // androidx.media3.common.Player.Listener
        public final void onEvents(Player player, Player.Events events) {
            if (events.a(4, 5)) {
                int i2 = LegacyPlayerControlView.s0;
                throw null;
            }
            if (events.a(4, 5, 7)) {
                int i3 = LegacyPlayerControlView.s0;
                throw null;
            }
            FlagSet flagSet = events.f5499a;
            if (flagSet.f5397a.get(8)) {
                int i4 = LegacyPlayerControlView.s0;
                throw null;
            }
            if (flagSet.f5397a.get(9)) {
                int i5 = LegacyPlayerControlView.s0;
                throw null;
            }
            if (events.a(8, 9, 11, 0, 13)) {
                int i6 = LegacyPlayerControlView.s0;
                throw null;
            }
            if (events.a(11, 0)) {
                int i7 = LegacyPlayerControlView.s0;
                throw null;
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public final void r(long j) {
            int i2 = LegacyPlayerControlView.s0;
            throw null;
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public final void s(long j, boolean z2) {
            throw null;
        }
    }

    public interface ProgressUpdateListener {
        void a();
    }

    public interface VisibilityListener {
    }

    static {
        MediaLibraryInfo.a("media3.ui");
    }

    public final void a() {
        removeCallbacks(null);
        if (this.k0 <= 0) {
            this.o0 = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        long j = this.k0;
        this.o0 = jUptimeMillis + j;
        if (this.g0) {
            postDelayed(null, j);
        }
    }

    public final boolean b() {
        return getVisibility() == 0;
    }

    public final void c() {
        Player player;
        if (b() && this.g0 && (player = this.e0) != null) {
            player.k(5);
            player.k(7);
            player.k(11);
            player.k(12);
            player.k(9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0037 A[EDGE_INSN: B:17:0x0037->B:18:0x0038 BREAK  A[LOOP:0: B:11:0x0021->B:15:0x0033]] */
    public final void d() {
        boolean z2;
        long jV;
        Player player = this.e0;
        if (player == null) {
            return;
        }
        long contentPosition = 0;
        if (!this.h0) {
            z2 = false;
            break;
        }
        Timeline currentTimeline = player.getCurrentTimeline();
        if (currentTimeline.o() <= 100) {
            int iO = currentTimeline.o();
            int i2 = 0;
            while (true) {
                if (i2 >= iO) {
                    z2 = true;
                    break;
                } else {
                    if (currentTimeline.m(i2, null, 0L).f5519l == -9223372036854775807L) {
                        z2 = false;
                        break;
                    }
                    i2++;
                }
            }
        } else {
            z2 = false;
            break;
        }
        this.j0 = z2;
        this.p0 = 0L;
        Timeline currentTimeline2 = player.getCurrentTimeline();
        if (!currentTimeline2.p()) {
            int iF = player.f();
            boolean z3 = this.j0;
            int i3 = z3 ? 0 : iF;
            if (i3 <= (z3 ? currentTimeline2.o() - 1 : iF)) {
                if (i3 == iF) {
                    this.p0 = Util.T(0L);
                }
                currentTimeline2.n(i3, null);
                throw null;
            }
        }
        int i4 = Util.f5683a;
        if (b() && this.g0) {
            Player player2 = this.e0;
            if (player2 != null) {
                contentPosition = this.p0 + player2.getContentPosition();
                jV = this.p0 + player2.v();
            } else {
                jV = 0;
            }
            boolean z4 = contentPosition != this.q0;
            boolean z5 = jV != this.r0;
            this.q0 = contentPosition;
            this.r0 = jV;
            ProgressUpdateListener progressUpdateListener = this.f0;
            if (progressUpdateListener != null && (z4 || z5)) {
                progressUpdateListener.a();
            }
            removeCallbacks(null);
            int playbackState = player2 == null ? 1 : player2.getPlaybackState();
            if (player2 != null && player2.isPlaying()) {
                long jMin = Math.min(1000L, 1000 - (contentPosition % 1000));
                float f = player2.getPlaybackParameters().f5494a;
                postDelayed(null, Util.k(f > 0.0f ? (long) (jMin / f) : 1000L, this.l0, 1000L));
            } else {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(null, 1000L);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player = this.e0;
        if (player == null || !(keyCode == 90 || keyCode == 89 || keyCode == 85 || keyCode == 79 || keyCode == 126 || keyCode == 127 || keyCode == 87 || keyCode == 88)) {
            if (!super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
        } else if (keyEvent.getAction() == 0) {
            if (keyCode == 90) {
                if (player.getPlaybackState() != 4) {
                    player.w();
                }
            } else if (keyCode == 89) {
                player.x();
            } else if (keyEvent.getRepeatCount() == 0) {
                if (keyCode == 79 || keyCode == 85) {
                    if (Util.Q(player, this.i0)) {
                        Util.B(player);
                    } else if (player.k(1)) {
                        player.pause();
                    }
                } else if (keyCode == 87) {
                    player.o();
                } else if (keyCode == 88) {
                    player.g();
                } else if (keyCode == 126) {
                    Util.B(player);
                } else if (keyCode == 127) {
                    int i2 = Util.f5683a;
                    if (player.k(1)) {
                        player.pause();
                    }
                }
            }
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(null);
        } else if (motionEvent.getAction() == 1) {
            a();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public Player getPlayer() {
        return this.e0;
    }

    public int getRepeatToggleModes() {
        return this.m0;
    }

    public boolean getShowShuffleButton() {
        return this.n0;
    }

    public int getShowTimeoutMs() {
        return this.k0;
    }

    public boolean getShowVrButton() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.g0 = true;
        long j = this.o0;
        if (j != -9223372036854775807L) {
            long jUptimeMillis = j - SystemClock.uptimeMillis();
            if (jUptimeMillis > 0) {
                postDelayed(null, jUptimeMillis);
            } else if (b()) {
                setVisibility(8);
                throw null;
            }
        } else if (b()) {
            a();
        }
        if (b() && this.g0) {
            Util.Q(this.e0, this.i0);
        }
        c();
        b();
        b();
        d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.g0 = false;
        removeCallbacks(null);
        removeCallbacks(null);
    }

    public void setPlayer(Player player) {
        Assertions.e(Looper.myLooper() == Looper.getMainLooper());
        Assertions.b(player == null || player.m() == Looper.getMainLooper());
        Player player2 = this.e0;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.j(null);
        }
        this.e0 = player;
        if (player != null) {
            player.l(null);
        }
        if (b() && this.g0) {
            Util.Q(this.e0, this.i0);
        }
        c();
        b();
        b();
        d();
    }

    public void setProgressUpdateListener(ProgressUpdateListener progressUpdateListener) {
        this.f0 = progressUpdateListener;
    }

    public void setRepeatToggleModes(int i2) {
        this.m0 = i2;
        Player player = this.e0;
        if (player != null) {
            int repeatMode = player.getRepeatMode();
            if (i2 == 0 && repeatMode != 0) {
                this.e0.setRepeatMode(0);
            } else if (i2 == 1 && repeatMode == 2) {
                this.e0.setRepeatMode(1);
            } else if (i2 == 2 && repeatMode == 1) {
                this.e0.setRepeatMode(2);
            }
        }
        b();
    }

    public void setShowFastForwardButton(boolean z2) {
        c();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z2) {
        this.h0 = z2;
        d();
    }

    public void setShowNextButton(boolean z2) {
        c();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z2) {
        this.i0 = z2;
        if (b() && this.g0) {
            Util.Q(this.e0, this.i0);
        }
    }

    public void setShowPreviousButton(boolean z2) {
        c();
    }

    public void setShowRewindButton(boolean z2) {
        c();
    }

    public void setShowShuffleButton(boolean z2) {
        this.n0 = z2;
        b();
    }

    public void setShowTimeoutMs(int i2) {
        this.k0 = i2;
        if (b()) {
            a();
        }
    }

    public void setShowVrButton(boolean z2) {
    }

    public void setTimeBarMinUpdateInterval(int i2) {
        this.l0 = Util.j(i2, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
    }
}
