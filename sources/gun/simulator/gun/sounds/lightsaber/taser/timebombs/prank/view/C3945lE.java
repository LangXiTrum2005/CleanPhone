package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.NoSuchElementException;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.lE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3945lE extends Yf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f4641a;
    public final /* synthetic */ Object b;

    public C3945lE(Object obj) {
        this.b = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.f4641a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f4641a) {
            throw new NoSuchElementException();
        }
        this.f4641a = true;
        return this.b;
    }
}
