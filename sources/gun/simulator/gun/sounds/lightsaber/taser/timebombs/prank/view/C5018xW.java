package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5018xW implements InterfaceC3280dh0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f5225a = false;
    public boolean b = false;
    public C2530Jt c;
    public final C4930wW d;

    public C5018xW(C4930wW c4930wW) {
        this.d = c4930wW;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3280dh0
    public final InterfaceC3280dh0 d(String str) {
        if (this.f5225a) {
            throw new C3823jr("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f5225a = true;
        this.d.f(this.c, str, this.b);
        return this;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3280dh0
    public final InterfaceC3280dh0 e(boolean z) {
        if (this.f5225a) {
            throw new C3823jr("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f5225a = true;
        this.d.d(this.c, z ? 1 : 0, this.b);
        return this;
    }
}
