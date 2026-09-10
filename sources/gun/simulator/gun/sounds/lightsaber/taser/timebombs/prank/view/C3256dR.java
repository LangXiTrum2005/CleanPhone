package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.content.Context;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.dR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3256dR extends WG implements InterfaceC2714Qw {
    final /* synthetic */ Context $context;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3256dR(Context context) {
        super(0);
        this.$context = context;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ss, java.lang.Object] */
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final InterfaceC4615ss invoke() {
        return C3756j50.Companion.getInstance(this.$context).getService(InterfaceC4615ss.class);
    }
}
