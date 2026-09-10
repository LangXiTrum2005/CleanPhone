package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.HashMap;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.nl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4165nl {
    public static final C4077ml b = new C4077ml(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f4758a;

    public C4165nl(int i) {
        if (i == 1) {
            this.f4758a = new HashMap();
            return;
        }
        if (i == 2) {
            this.f4758a = new HashMap();
        } else if (i != 3) {
            this.f4758a = new HashMap();
        } else {
            this.f4758a = new LinkedHashMap();
        }
    }

    public FF a() {
        return new FF(this.f4758a);
    }

    public AbstractC4122nF b(String str, AbstractC4122nF abstractC4122nF) {
        AbstractC2995aW.q(str, "key");
        return (AbstractC4122nF) this.f4758a.put(str, abstractC4122nF);
    }

    public C4165nl() {
        this.f4758a = new HashMap();
    }
}
