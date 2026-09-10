package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.ja0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3792ja0 implements InterfaceC4545s40, InterfaceC3998lq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4545s40 f4558a;
    public final int b;
    public final int c;

    public C3792ja0(InterfaceC4545s40 interfaceC4545s40, int i, int i2) {
        AbstractC2995aW.q(interfaceC4545s40, "sequence");
        this.f4558a = interfaceC4545s40;
        this.b = i;
        this.c = i2;
        if (i < 0) {
            throw new IllegalArgumentException(AbstractC3950lJ.p("startIndex should be non-negative, but is ", i).toString());
        }
        if (i2 < 0) {
            throw new IllegalArgumentException(AbstractC3950lJ.p("endIndex should be non-negative, but is ", i2).toString());
        }
        if (i2 < i) {
            throw new IllegalArgumentException(AbstractC3888ke0.h("endIndex should be not less than startIndex, but was ", i2, " < ", i).toString());
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3998lq
    public final InterfaceC4545s40 a(int i) {
        int i2 = this.c;
        int i3 = this.b;
        if (i >= i2 - i3) {
            return C2916Yq.f4045a;
        }
        return new C3792ja0(this.f4558a, i3 + i, i2);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC3998lq
    public final InterfaceC4545s40 b(int i) {
        int i2 = this.c;
        int i3 = this.b;
        if (i >= i2 - i3) {
            return this;
        }
        return new C3792ja0(this.f4558a, i3, i + i3);
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.InterfaceC4545s40
    public final Iterator iterator() {
        return new C5148yx(this);
    }
}
