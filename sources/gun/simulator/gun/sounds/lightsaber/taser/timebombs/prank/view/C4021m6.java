package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.m6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4021m6 extends KV {
    final /* synthetic */ InterfaceC3757j6 $downloadListener;
    final /* synthetic */ C2474Hp $downloadRequest;
    final /* synthetic */ C4197o6 this$0;

    public C4021m6(C4197o6 c4197o6, C2474Hp c2474Hp, InterfaceC3757j6 interfaceC3757j6) {
        this.this$0 = c4197o6;
        this.$downloadRequest = c2474Hp;
        this.$downloadListener = interfaceC3757j6;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.KV
    public int getPriority() {
        return this.$downloadRequest.getPriority();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.this$0.launchRequest(this.$downloadRequest, this.$downloadListener);
    }
}
