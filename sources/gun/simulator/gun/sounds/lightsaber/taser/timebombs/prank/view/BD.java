package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class BD extends AbstractC5178zG {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5170z9
    public final Object f(C5090yG c5090yG, float f) {
        return Integer.valueOf(k(c5090yG, f));
    }

    public final int k(C5090yG c5090yG, float f) {
        int i;
        Object obj = c5090yG.b;
        if (obj == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        Object obj2 = c5090yG.c;
        if (obj2 == null) {
            if (c5090yG.k == 784923401) {
                c5090yG.k = ((Integer) obj).intValue();
            }
            i = c5090yG.k;
        } else {
            if (c5090yG.l == 784923401) {
                c5090yG.l = ((Integer) obj2).intValue();
            }
            i = c5090yG.l;
        }
        C4215oK c4215oK = this.e;
        Object obj3 = c5090yG.b;
        if (c4215oK != null) {
            Integer num = (Integer) c4215oK.b(c5090yG.g, c5090yG.h.floatValue(), (Integer) obj3, Integer.valueOf(i), f, d(), this.d);
            if (num != null) {
                return num.intValue();
            }
        }
        if (c5090yG.k == 784923401) {
            c5090yG.k = ((Integer) obj3).intValue();
        }
        int i2 = c5090yG.k;
        PointF pointF = AbstractC5187zP.f5324a;
        return (int) ((f * (i - i2)) + i2);
    }
}
