package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.Yf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2905Yf extends AbstractC5178zG {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5170z9
    public final Object f(C5090yG c5090yG, float f) {
        return Integer.valueOf(k(c5090yG, f));
    }

    public final int k(C5090yG c5090yG, float f) {
        Float f2;
        if (c5090yG.b == null || c5090yG.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C4215oK c4215oK = this.e;
        Object obj = c5090yG.b;
        if (c4215oK != null && (f2 = c5090yG.h) != null) {
            Integer num = (Integer) c4215oK.b(c5090yG.g, f2.floatValue(), (Integer) obj, (Integer) c5090yG.c, f, d(), this.d);
            if (num != null) {
                return num.intValue();
            }
        }
        return AbstractC2340Cl.u(AbstractC5187zP.b(f, 0.0f, 1.0f), ((Integer) obj).intValue(), ((Integer) c5090yG.c).intValue());
    }
}
