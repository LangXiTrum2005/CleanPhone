package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.RandomAccess;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C4799v extends AbstractC4887w implements RandomAccess {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC4887w f5112a;
    public final int b;
    public final int c;

    public C4799v(AbstractC4887w abstractC4887w, int i, int i2) {
        AbstractC2995aW.q(abstractC4887w, "list");
        this.f5112a = abstractC4887w;
        this.b = i;
        int iA = abstractC4887w.a();
        if (i < 0 || i2 > iA) {
            StringBuilder sbT = AbstractC3950lJ.t("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
            sbT.append(iA);
            throw new IndexOutOfBoundsException(sbT.toString());
        }
        if (i > i2) {
            throw new IllegalArgumentException(AbstractC3888ke0.h("fromIndex: ", i, " > toIndex: ", i2));
        }
        this.c = i2 - i;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC3658i
    public final int a() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        int i2 = this.c;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException(AbstractC3888ke0.h("index: ", i, ", size: ", i2));
        }
        return this.f5112a.get(this.b + i);
    }
}
