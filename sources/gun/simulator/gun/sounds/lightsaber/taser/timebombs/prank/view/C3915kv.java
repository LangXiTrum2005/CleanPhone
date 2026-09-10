package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.kv, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3915kv extends AbstractC5178zG {
    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AbstractC5170z9
    public final Object f(C5090yG c5090yG, float f) {
        return Float.valueOf(l(c5090yG, f));
    }

    public final float k() {
        return l(this.c.f(), c());
    }

    public final float l(C5090yG c5090yG, float f) {
        if (c5090yG.b == null || c5090yG.c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        C4215oK c4215oK = this.e;
        Object obj = c5090yG.b;
        if (c4215oK != null) {
            Float f2 = (Float) c5090yG.c;
            float fD = d();
            float f3 = this.d;
            Float f4 = (Float) c4215oK.b(c5090yG.g, c5090yG.h.floatValue(), (Float) obj, f2, f, fD, f3);
            if (f4 != null) {
                return f4.floatValue();
            }
        }
        if (c5090yG.i == -3987645.8f) {
            c5090yG.i = ((Float) obj).floatValue();
        }
        float f5 = c5090yG.i;
        if (c5090yG.j == -3987645.8f) {
            c5090yG.j = ((Float) c5090yG.c).floatValue();
        }
        return AbstractC5187zP.e(f5, c5090yG.j, f);
    }
}
