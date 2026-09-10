package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.yD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C5087yD extends AbstractC4823vD {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f5267a;
    public final int b;
    public boolean c;
    public int d;

    public C5087yD(int i, int i2, int i3) {
        this.f5267a = i3;
        this.b = i2;
        boolean z = true;
        if (i3 <= 0 ? i < i2 : i > i2) {
            z = false;
        }
        this.c = z;
        this.d = z ? i : i2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4823vD
    public final int nextInt() {
        int i = this.d;
        if (i != this.b) {
            this.d = this.f5267a + i;
        } else {
            if (!this.c) {
                throw new NoSuchElementException();
            }
            this.c = false;
        }
        return i;
    }
}
