package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.view.TextureView;
import android.view.View;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewOnLayoutChangeListenerC3083bV implements JU, View.OnLayoutChangeListener, View.OnClickListener, QU {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Ec0 f4170a = new Ec0();
    public Object b;
    public final /* synthetic */ PlayerView c;

    public ViewOnLayoutChangeListenerC3083bV(PlayerView playerView) {
        this.c = playerView;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void F(C5117yd0 c5117yd0) {
        PlayerView playerView = this.c;
        LU lu = playerView.m;
        lu.getClass();
        C2736Rs c2736Rs = (C2736Rs) lu;
        Gc0 gc0T = c2736Rs.t();
        if (gc0T.q()) {
            this.b = null;
        } else {
            c2736Rs.Q();
            boolean zIsEmpty = c2736Rs.h0.i.d.f5285a.isEmpty();
            Ec0 ec0 = this.f4170a;
            if (zIsEmpty) {
                Object obj = this.b;
                if (obj != null) {
                    int iB = gc0T.b(obj);
                    if (iB != -1) {
                        if (c2736Rs.p() == gc0T.g(iB, ec0, false).c) {
                            return;
                        }
                    }
                    this.b = null;
                }
            } else {
                this.b = gc0T.g(c2736Rs.q(), ec0, true).b;
            }
        }
        playerView.l(false);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void a(Ih0 ih0) {
        int i = PlayerView.z;
        this.c.h();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void g(int i) {
        int i2 = PlayerView.z;
        PlayerView playerView = this.c;
        playerView.i();
        playerView.k();
        if (!playerView.b() || !playerView.w) {
            playerView.c(false);
            return;
        }
        RU ru = playerView.j;
        if (ru != null) {
            ru.c();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void h(C2469Hk c2469Hk) {
        SubtitleView subtitleView = this.c.g;
        if (subtitleView != null) {
            subtitleView.setCues(c2469Hk.f3181a);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = PlayerView.z;
        this.c.g();
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        PlayerView.a((TextureView) view, this.c.y);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void onRenderedFirstFrame() {
        View view = this.c.c;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void v(int i, boolean z) {
        int i2 = PlayerView.z;
        PlayerView playerView = this.c;
        playerView.i();
        if (!playerView.b() || !playerView.w) {
            playerView.c(false);
            return;
        }
        RU ru = playerView.j;
        if (ru != null) {
            ru.c();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final void y(int i, KU ku, KU ku2) {
        RU ru;
        int i2 = PlayerView.z;
        PlayerView playerView = this.c;
        if (playerView.b() && playerView.w && (ru = playerView.j) != null) {
            ru.c();
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void onSeekProcessed() {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void A(C2321Bs c2321Bs) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void C(C2421Fo c2421Fo) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void H(boolean z) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void b(int i) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void d(IU iu) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void i(Metadata metadata) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void l(int i) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void m(C3955lO c3955lO) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void n(C2321Bs c2321Bs) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void o(boolean z) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void onCues(List list) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void onRepeatModeChanged(int i) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void onShuffleModeEnabledChanged(boolean z) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void p(HU hu) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void t(boolean z) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void w(EU eu) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void B(C3693iO c3693iO, int i) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void k(int i, boolean z) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void onPlayerStateChanged(boolean z, int i) {
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.JU
    public final /* synthetic */ void q(int i, int i2) {
    }
}
