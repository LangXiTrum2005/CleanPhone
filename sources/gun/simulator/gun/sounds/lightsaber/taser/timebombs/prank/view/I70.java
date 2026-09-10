package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.OrderedSet;

/* JADX INFO: loaded from: classes2.dex */
public final class I70 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3204a;
    public final OrderedSet b;
    public final Array c;
    public final Array d;
    public final H70 e;
    public final Color f;

    public I70(String str) {
        OrderedSet orderedSet = new OrderedSet();
        this.b = orderedSet;
        this.c = new Array(0);
        this.d = new Array(0);
        this.e = new H70(0, "", null);
        this.f = new Color(0.99607843f, 0.61960787f, 0.30980393f, 1.0f);
        if (str == null) {
            throw new IllegalArgumentException("name cannot be null.");
        }
        this.f3204a = str;
        orderedSet.orderedItems().ordered = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC3413f9 a(int i, String str) {
        H70 h70 = this.e;
        h70.a(i, str);
        H70 h71 = (H70) this.b.get(h70);
        if (h71 != null) {
            return h71.c;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(int i, String str, AbstractC3413f9 abstractC3413f9) {
        H70 h70 = new H70(i, str, abstractC3413f9);
        OrderedSet orderedSet = this.b;
        if (orderedSet.add(h70)) {
            return;
        }
        ((H70) orderedSet.get(h70)).c = abstractC3413f9;
    }

    public final String toString() {
        return this.f3204a;
    }
}
