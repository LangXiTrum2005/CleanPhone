package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.SpineController;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: loaded from: classes4.dex */
public final class W10 implements InterfaceC3581h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3905a;
    public final /* synthetic */ C4629t20 b;

    public /* synthetic */ W10(C4629t20 c4629t20, int i) {
        this.f3905a = i;
        this.b = c4629t20;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3581h5
    public final void b(C2683Pr c2683Pr) {
        C3843k5 animationState;
        C2735Rr c2735Rr;
        C2735Rr c2735Rr2;
        C2735Rr c2735Rr3;
        C4991x70 skeleton;
        C2735Rr c2735Rr4;
        C4991x70 skeleton2;
        C2735Rr c2735Rr5;
        int i = this.f3905a;
        C4629t20 c4629t20 = this.b;
        C3755j5 c3755j5L = null;
        str = null;
        String str = null;
        str = null;
        String str2 = null;
        str = null;
        String str3 = null;
        c3755j5L = null;
        switch (i) {
            case 0:
                if (AbstractC2995aW.i((c2683Pr == null || (c2735Rr = c2683Pr.f3576a) == null) ? null : c2735Rr.f3685a, TtmlNode.END)) {
                    if ((AbstractC2995aW.i(c4629t20.K, "banji") || AbstractC2995aW.i(c4629t20.K, "banji2") || AbstractC2995aW.i(c4629t20.K, "banji_hong")) && !c4629t20.v) {
                        c4629t20.j();
                        SpineController spineController = c4629t20.c;
                        if (spineController != null && (animationState = spineController.getAnimationState("banji")) != null) {
                            c3755j5L = animationState.l(0);
                        }
                        if (c3755j5L != null) {
                            c3755j5L.o = 0.0f;
                        }
                        c4629t20.v = true;
                    }
                }
                break;
            case 1:
                if (c4629t20.B) {
                    if (AbstractC2995aW.i((c2683Pr == null || (c2735Rr3 = c2683Pr.f3576a) == null) ? null : c2735Rr3.f3685a, "play_song")) {
                        c4629t20.k(Integer.valueOf(c4629t20.h));
                        c4629t20.i(60);
                    } else {
                        if (c2683Pr != null && (c2735Rr2 = c2683Pr.f3576a) != null) {
                            str3 = c2735Rr2.f3685a;
                        }
                        if (AbstractC2995aW.i(str3, "play_song2")) {
                            c4629t20.k(Integer.valueOf(c4629t20.h));
                            c4629t20.i(-60);
                        }
                    }
                }
                break;
            case 2:
                if (c2683Pr != null && (c2735Rr4 = c2683Pr.f3576a) != null) {
                    str2 = c2735Rr4.f3685a;
                }
                if (AbstractC2995aW.i(str2, TtmlNode.END)) {
                    c4629t20.b();
                    for (String str4 : AbstractC2340Cl.K("banji", "jichui", "dancao", "qiang")) {
                        SpineController spineController2 = c4629t20.c;
                        if (spineController2 != null && (skeleton = spineController2.getSkeleton(str4)) != null) {
                            skeleton.d();
                        }
                    }
                }
                break;
            default:
                if (c2683Pr != null && (c2735Rr5 = c2683Pr.f3576a) != null) {
                    str = c2735Rr5.f3685a;
                }
                if (AbstractC2995aW.i(str, TtmlNode.END)) {
                    if (((Boolean) c4629t20.s.get(c4629t20.q)).booleanValue()) {
                        c4629t20.j();
                    } else {
                        c4629t20.b();
                        c4629t20.n(0.0f);
                        c4629t20.o(0.0f);
                        c4629t20.a();
                    }
                    for (String str5 : AbstractC2340Cl.K("banji", "jichui", "dancao", "qiang")) {
                        SpineController spineController3 = c4629t20.c;
                        if (spineController3 != null && (skeleton2 = spineController3.getSkeleton(str5)) != null) {
                            skeleton2.d();
                        }
                    }
                }
                break;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3581h5
    public final void a(C3755j5 c3755j5) {
    }
}
