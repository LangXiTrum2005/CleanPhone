package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class XL extends ZL implements Iterator {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XL(C2985aM c2985aM, int i) {
        super(c2985aM);
        this.d = i;
        if (i == 1) {
            AbstractC2995aW.q(c2985aM, "map");
            super(c2985aM);
        } else if (i != 2) {
            AbstractC2995aW.q(c2985aM, "map");
        } else {
            AbstractC2995aW.q(c2985aM, "map");
            super(c2985aM);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        C2985aM c2985aM = this.f4066a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 >= c2985aM.f) {
                    throw new NoSuchElementException();
                }
                this.b = i2 + 1;
                this.c = i2;
                YL yl = new YL(c2985aM, i2);
                a();
                return yl;
            case 1:
                int i3 = this.b;
                if (i3 >= c2985aM.f) {
                    throw new NoSuchElementException();
                }
                this.b = i3 + 1;
                this.c = i3;
                Object obj = c2985aM.f4119a[i3];
                a();
                return obj;
            default:
                int i4 = this.b;
                if (i4 >= c2985aM.f) {
                    throw new NoSuchElementException();
                }
                this.b = i4 + 1;
                this.c = i4;
                Object[] objArr = c2985aM.b;
                AbstractC2995aW.n(objArr);
                Object obj2 = objArr[this.c];
                a();
                return obj2;
        }
    }
}
