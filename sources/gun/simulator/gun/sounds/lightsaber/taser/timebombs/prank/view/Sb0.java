package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: loaded from: classes.dex */
public final class Sb0 extends AbstractC5178zG {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5170z9
    public final Object f(C5090yG c5090yG, float f) {
        Object obj;
        C4215oK c4215oK = this.e;
        Object obj2 = c5090yG.b;
        if (c4215oK == null) {
            return (f != 1.0f || (obj = c5090yG.c) == null) ? (C5228zp) obj2 : (C5228zp) obj;
        }
        Float f2 = c5090yG.h;
        float fFloatValue = f2 == null ? Float.MAX_VALUE : f2.floatValue();
        C5228zp c5228zp = (C5228zp) obj2;
        Object obj3 = c5090yG.c;
        return (C5228zp) c4215oK.b(c5090yG.g, fFloatValue, c5228zp, obj3 == null ? c5228zp : (C5228zp) obj3, f, c(), this.d);
    }
}
