package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.backends.android.SpineController;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.r80, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4465r80 implements InterfaceC3581h5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5081y80 f4919a;
    public final /* synthetic */ SpineController b;

    public C4465r80(C5081y80 c5081y80, SpineController spineController) {
        this.f4919a = c5081y80;
        this.b = spineController;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3581h5
    public final void a(C3755j5 c3755j5) {
        C3493g5 c3493g5 = c3755j5.f4535a;
        if (AbstractC2995aW.i(c3493g5 != null ? c3493g5.f4402a : null, "M84")) {
            this.f4919a.u = false;
            C3843k5 animationState = this.b.getAnimationState("M84");
            if (animationState != null) {
                animationState.d.removeValue(this, true);
            }
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3581h5
    public final void b(C2683Pr c2683Pr) {
    }
}
