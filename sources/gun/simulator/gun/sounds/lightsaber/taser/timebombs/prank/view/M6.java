package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class M6 extends AbstractC4936wb {
    public final long c;
    public final ArrayList d;
    public final ArrayList e;

    public M6(int i, long j) {
        super(i);
        this.c = j;
        this.d = new ArrayList();
        this.e = new ArrayList();
    }

    public final M6 e(int i) {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            M6 m6 = (M6) arrayList.get(i2);
            if (m6.b == i) {
                return m6;
            }
        }
        return null;
    }

    public final N6 f(int i) {
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            N6 n6 = (N6) arrayList.get(i2);
            if (n6.b == i) {
                return n6;
            }
        }
        return null;
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC4936wb
    public final String toString() {
        return AbstractC4936wb.b(this.b) + " leaves: " + Arrays.toString(this.d.toArray()) + " containers: " + Arrays.toString(this.e.toArray());
    }
}
