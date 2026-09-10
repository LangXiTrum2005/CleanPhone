package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.HashSet;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.bP, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3077bP implements InterfaceC2727Rj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4169a;
    public final boolean b;

    public C3077bP(String str, int i, boolean z) {
        this.f4169a = i;
        this.b = z;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC2727Rj
    public final InterfaceC2546Kj a(C3160cK c3160cK, MJ mj, B9 b9) {
        if (((HashSet) c3160cK.l.b).contains(EnumC3249dK.MergePathsApi19)) {
            return new C3165cP(this);
        }
        AbstractC5005xJ.b("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        return "MergePaths{mode=" + AbstractC3950lJ.E(this.f4169a) + '}';
    }
}
