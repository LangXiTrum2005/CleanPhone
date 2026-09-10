package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class G40 implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3103a;
    public int b;
    public final /* synthetic */ D40 c;

    public G40(D40 d40, int i) {
        this.f3103a = i;
        if (i != 1) {
            this.c = d40;
            this.b = d40.d();
        } else {
            this.c = d40;
            this.b = d40.d();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f3103a) {
            case 0:
                return this.b > 0;
            default:
                return this.b > 0;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f3103a;
        D40 d40 = this.c;
        switch (i) {
            case 0:
                int iD = d40.d();
                int i2 = this.b;
                this.b = i2 - 1;
                return d40.g(iD - i2);
            default:
                int iD2 = d40.d();
                int i3 = this.b;
                this.b = i3 - 1;
                return d40.e(iD2 - i3);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f3103a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
