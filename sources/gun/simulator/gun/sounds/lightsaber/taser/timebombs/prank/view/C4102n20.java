package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.IControl;
import com.badlogic.gdx.backends.android.SpineController;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.n20, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4102n20 implements InterfaceC3581h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4629t20 f4725a;

    public C4102n20(C4629t20 c4629t20) {
        this.f4725a = c4629t20;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3581h5
    public final void b(C2683Pr c2683Pr) {
        C3843k5 animationState;
        C2735Rr c2735Rr;
        if (AbstractC2995aW.i((c2683Pr == null || (c2735Rr = c2683Pr.f3576a) == null) ? null : c2735Rr.f3685a, TtmlNode.END)) {
            C4629t20 c4629t20 = this.f4725a;
            SpineController spineController = c4629t20.c;
            if (spineController != null && (animationState = spineController.getAnimationState("smoke")) != null) {
                animationState.s(0.0f);
            }
            SpineController spineController2 = c4629t20.c;
            if (spineController2 != null) {
                IControl.DefaultImpls.setAnimation$default(spineController2, "smoke", 303, AbstractC3197ck0.c.concat("_smoke"), false, 0.0f, null, 48, null);
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3581h5
    public final void a(C3755j5 c3755j5) {
    }
}
