package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.wZ, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4933wZ {
    private C4933wZ() {
    }

    public /* synthetic */ C4933wZ(AbstractC2471Hm abstractC2471Hm) {
        this();
    }

    public final <T> C5109yZ error(CZ cz, C5021xZ c5021xZ) {
        AbstractC2995aW.q(c5021xZ, "rawResponse");
        if (!(!c5021xZ.k())) {
            throw new IllegalArgumentException("rawResponse should not be successful response".toString());
        }
        AbstractC2471Hm abstractC2471Hm = null;
        return new C5109yZ(c5021xZ, abstractC2471Hm, cz, abstractC2471Hm);
    }

    public final <T> C5109yZ success(T t, C5021xZ c5021xZ) {
        AbstractC2995aW.q(c5021xZ, "rawResponse");
        if (c5021xZ.k()) {
            return new C5109yZ(c5021xZ, t, null, 0 == true ? 1 : 0);
        }
        throw new IllegalArgumentException("rawResponse must be successful response".toString());
    }
}
