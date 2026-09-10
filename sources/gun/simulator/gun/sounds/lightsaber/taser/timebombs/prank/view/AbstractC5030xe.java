package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.xe, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC5030xe implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final char f5235a;
    public final char b;
    public final int c = 1;

    public AbstractC5030xe(char c, char c2) {
        this.f5235a = c;
        this.b = (char) AbstractC2995aW.M(c, c2, 1);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C5118ye(this.f5235a, this.b, this.c);
    }
}
