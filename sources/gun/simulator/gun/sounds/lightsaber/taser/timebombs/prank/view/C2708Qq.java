package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Qq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2708Qq implements XC {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3629a;

    public C2708Qq(boolean z) {
        this.f3629a = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.XC
    public final KR b() {
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.XC
    public final boolean isActive() {
        return this.f3629a;
    }

    public final String toString() {
        return DM.l(new StringBuilder("Empty{"), this.f3629a ? "Active" : "New", '}');
    }
}
