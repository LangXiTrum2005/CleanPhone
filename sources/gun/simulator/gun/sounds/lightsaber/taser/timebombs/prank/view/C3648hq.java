package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.hq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3648hq implements InterfaceC4545s40, InterfaceC3998lq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4475a;
    public final InterfaceC4545s40 b;
    public final int c;

    public C3648hq(InterfaceC4545s40 interfaceC4545s40, int i, int i2) {
        this.f4475a = i2;
        if (i2 != 1) {
            AbstractC2995aW.q(interfaceC4545s40, "sequence");
            this.b = interfaceC4545s40;
            this.c = i;
            if (i >= 0) {
                return;
            }
            throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
        }
        AbstractC2995aW.q(interfaceC4545s40, "sequence");
        this.b = interfaceC4545s40;
        this.c = i;
        if (i >= 0) {
            return;
        }
        throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3998lq
    public final InterfaceC4545s40 a(int i) {
        int i2 = this.f4475a;
        InterfaceC4545s40 interfaceC4545s40 = this.b;
        int i3 = this.c;
        switch (i2) {
            case 0:
                int i4 = i3 + i;
                return i4 < 0 ? new C3648hq(this, i, 0) : new C3648hq(interfaceC4545s40, i4, 0);
            default:
                return i >= i3 ? C2916Yq.f4045a : new C3792ja0(interfaceC4545s40, i, i3);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3998lq
    public final InterfaceC4545s40 b(int i) {
        int i2 = this.f4475a;
        InterfaceC4545s40 interfaceC4545s40 = this.b;
        int i3 = this.c;
        switch (i2) {
            case 0:
                int i4 = i3 + i;
                return i4 < 0 ? new C3648hq(this, i, 1) : new C3792ja0(interfaceC4545s40, i3, i4);
            default:
                return i >= i3 ? this : new C3648hq(interfaceC4545s40, i, 1);
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4545s40
    public final Iterator iterator() {
        switch (this.f4475a) {
            case 0:
                return new C3330eD(this);
            default:
                return new C3330eD(this, 0);
        }
    }
}
