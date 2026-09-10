package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import androidx.collection.ArrayMap;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class II {
    public static final HI c = new HI(Object.class, Object.class, Object.class, Collections.singletonList(new C2522Jl(Object.class, Object.class, Object.class, Collections.emptyList(), new G7(), null)), null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayMap f3210a = new ArrayMap();
    public final AtomicReference b = new AtomicReference();

    public final void a(Class cls, Class cls2, Class cls3, HI hi) {
        synchronized (this.f3210a) {
            ArrayMap arrayMap = this.f3210a;
            XP xp = new XP(cls, cls2, cls3);
            if (hi == null) {
                hi = c;
            }
            arrayMap.put(xp, hi);
        }
    }
}
