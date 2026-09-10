package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.FloatArray;

/* JADX INFO: loaded from: classes2.dex */
public final class N70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O70 f3442a;
    public final C3443fb b;
    public final Color d;
    public AbstractC3413f9 e;
    public int f;
    public int h;
    public Color c = new Color();
    public final FloatArray g = new FloatArray();

    public N70(O70 o70, C3443fb c3443fb) {
        if (c3443fb == null) {
            throw new IllegalArgumentException("bone cannot be null.");
        }
        this.f3442a = o70;
        this.b = c3443fb;
        this.d = o70.e == null ? null : new Color();
        b();
    }

    public final void a(AbstractC3413f9 abstractC3413f9) {
        AbstractC3413f9 abstractC3413f10 = this.e;
        if (abstractC3413f10 == abstractC3413f9) {
            return;
        }
        if (!(abstractC3413f9 instanceof AbstractC3806jh0) || !(abstractC3413f10 instanceof AbstractC3806jh0) || ((AbstractC3806jh0) abstractC3413f9).d != ((AbstractC3806jh0) abstractC3413f10).d) {
            this.g.clear();
        }
        this.e = abstractC3413f9;
        this.f = -1;
    }

    public final void b() {
        Color color = this.c;
        O70 o70 = this.f3442a;
        color.set(o70.d);
        Color color2 = this.d;
        if (color2 != null) {
            color2.set(o70.e);
        }
        String str = o70.f;
        if (str == null) {
            a(null);
        } else {
            this.e = null;
            a(this.b.b.c(o70.f3494a, str));
        }
    }

    public final String toString() {
        return this.f3442a.b;
    }
}
