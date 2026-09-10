package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.y3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5070y3 implements GS {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5258a = false;
    public final /* synthetic */ InterfaceC5085yB b;

    public C5070y3(U0 u0) {
        this.b = u0;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5085yB
    public final void a(A70 a70) {
        if (this.f5258a) {
            return;
        }
        this.f5258a = true;
        InterfaceC5085yB interfaceC5085yB = this.b;
        if (interfaceC5085yB != null) {
            interfaceC5085yB.a(a70);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC5085yB
    public final void b(InterfaceC3240dB interfaceC3240dB) {
        Sm0 sm0 = (Sm0) interfaceC3240dB;
        if (this.f5258a) {
            return;
        }
        this.f5258a = true;
        InterfaceC5085yB interfaceC5085yB = this.b;
        if (interfaceC5085yB != null) {
            interfaceC5085yB.b(sm0);
        }
    }
}
