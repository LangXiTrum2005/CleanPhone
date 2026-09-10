package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class Ti0 extends WG implements InterfaceC2714Qw {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ti0(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Hh, java.lang.Object] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final C2466Hh invoke() {
        return C3756j50.Companion.getInstance(this.$context).getService(C2466Hh.class);
    }
}
