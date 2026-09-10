package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.jH, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3772jH implements AW {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile Set f4546a;
    public volatile Set b;

    public final synchronized void a() {
        try {
            Iterator it = this.f4546a.iterator();
            while (it.hasNext()) {
                this.b.add(((AW) it.next()).get());
            }
            this.f4546a = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view.AW
    public final Object get() {
        if (this.b == null) {
            synchronized (this) {
                try {
                    if (this.b == null) {
                        this.b = Collections.newSetFromMap(new ConcurrentHashMap());
                        a();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return Collections.unmodifiableSet(this.b);
    }
}
