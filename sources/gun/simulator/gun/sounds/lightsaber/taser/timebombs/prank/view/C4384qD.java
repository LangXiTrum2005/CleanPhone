package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.io.InputStream;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.qD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4384qD implements InterfaceC3901kl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C4391qK f4874a;

    public C4384qD(C4391qK c4391qK) {
        this.f4874a = c4391qK;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3901kl
    public final Class a() {
        return InputStream.class;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3901kl
    public final InterfaceC3989ll b(Object obj) {
        return new com.bumptech.glide.load.data.a((InputStream) obj, this.f4874a);
    }
}
