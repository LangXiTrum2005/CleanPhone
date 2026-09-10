package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.eL, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3338eL extends WG implements InterfaceC2714Qw {
    final /* synthetic */ C4304pL this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3338eL(C4304pL c4304pL) {
        super(0);
        this.this$0 = c4304pL;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final C4680tf invoke() {
        Context context = this.this$0.adWidget.getContext();
        AbstractC2995aW.p(context, "adWidget.context");
        return new C4680tf(context, this.this$0.advertisement, this.this$0.executor);
    }
}
