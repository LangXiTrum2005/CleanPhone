package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.List;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.x9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4994x9 implements InterfaceC4906w9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5210a;
    public C5090yG c = null;
    public float d = -1.0f;
    public C5090yG b = a(0.0f);

    public C4994x9(List list) {
        this.f5210a = list;
    }

    public final C5090yG a(float f) {
        List list = this.f5210a;
        C5090yG c5090yG = (C5090yG) DM.f(list, 1);
        if (f >= c5090yG.b()) {
            return c5090yG;
        }
        for (int size = list.size() - 2; size >= 1; size--) {
            C5090yG c5090yG2 = (C5090yG) list.get(size);
            if (this.b != c5090yG2 && f >= c5090yG2.b() && f < c5090yG2.a()) {
                return c5090yG2;
            }
        }
        return (C5090yG) list.get(0);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4906w9
    public final boolean d(float f) {
        C5090yG c5090yG = this.c;
        C5090yG c5090yG2 = this.b;
        if (c5090yG == c5090yG2 && this.d == f) {
            return true;
        }
        this.c = c5090yG2;
        this.d = f;
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4906w9
    public final C5090yG f() {
        return this.b;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4906w9
    public final boolean h(float f) {
        C5090yG c5090yG = this.b;
        if (f >= c5090yG.b() && f < c5090yG.a()) {
            return !this.b.c();
        }
        this.b = a(f);
        return true;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4906w9
    public final boolean isEmpty() {
        return false;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4906w9
    public final float j() {
        return ((C5090yG) this.f5210a.get(0)).b();
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4906w9
    public final float u() {
        return ((C5090yG) DM.f(this.f5210a, 1)).a();
    }
}
