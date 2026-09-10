package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class Ui0 extends WG implements InterfaceC2714Qw {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ui0(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.w20, java.lang.Object] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final C4893w20 invoke() {
        return C3756j50.Companion.getInstance(this.$context).getService(C4893w20.class);
    }
}
