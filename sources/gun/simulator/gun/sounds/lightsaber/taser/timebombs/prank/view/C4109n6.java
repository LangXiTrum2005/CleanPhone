package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.n6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4109n6 extends WG implements InterfaceC2714Qw {
    final /* synthetic */ C4197o6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4109n6(C4197o6 c4197o6) {
        super(0);
        this.this$0 = c4197o6;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2714Qw
    public final C4838vS invoke() {
        return C3933l6.INSTANCE.createOkHttpClient(this.this$0.pathProvider);
    }
}
