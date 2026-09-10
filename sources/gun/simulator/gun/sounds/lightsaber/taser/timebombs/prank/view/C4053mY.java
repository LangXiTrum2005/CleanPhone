package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.mY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4053mY extends AC {
    public final /* synthetic */ C4141nY c;

    public C4053mY(C4141nY c4141nY) {
        this.c = c4141nY;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4822vC
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        C4141nY c4141nY = this.c;
        FW.j(i, c4141nY.f);
        int i2 = i * 2;
        int i3 = c4141nY.e;
        Object[] objArr = c4141nY.d;
        Object obj = objArr[i2 + i3];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + (i3 ^ 1)];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.f;
    }
}
