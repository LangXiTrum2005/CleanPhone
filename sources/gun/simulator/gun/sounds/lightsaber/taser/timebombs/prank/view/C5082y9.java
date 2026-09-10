package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.y9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5082y9 implements InterfaceC4906w9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5090yG f5265a;
    public float b = -1.0f;

    public C5082y9(List list) {
        this.f5265a = (C5090yG) list.get(0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4906w9
    public final boolean d(float f) {
        if (this.b == f) {
            return true;
        }
        this.b = f;
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4906w9
    public final C5090yG f() {
        return this.f5265a;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4906w9
    public final boolean h(float f) {
        return !this.f5265a.c();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4906w9
    public final boolean isEmpty() {
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4906w9
    public final float j() {
        return this.f5265a.b();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4906w9
    public final float u() {
        return this.f5265a.a();
    }
}
