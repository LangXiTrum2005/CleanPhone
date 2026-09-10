package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.vungle.ads.internal.network.VungleApiClient;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.c50, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3141c50 extends U40 {
    final /* synthetic */ C3756j50 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3141c50(C3756j50 c3756j50) {
        super(c3756j50, false, 1, null);
        this.this$0 = c3756j50;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.U40
    public VungleApiClient create() {
        return new VungleApiClient(this.this$0.ctx, (InterfaceC5016xU) this.this$0.getOrBuild(InterfaceC5016xU.class), (C2919Yt) this.this$0.getOrBuild(C2919Yt.class));
    }
}
