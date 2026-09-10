package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class GC extends Yf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Yf0 f3111a;
    public Object b = null;
    public Yf0 c = C4033mE.e;

    public GC(JC jc) {
        this.f3111a = jc.d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.c.hasNext() || this.f3111a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.c.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f3111a.next();
            this.b = entry.getKey();
            this.c = ((AbstractC4822vC) entry.getValue()).iterator();
        }
        Object obj = this.b;
        Objects.requireNonNull(obj);
        return new C4910wC(obj, this.c.next());
    }
}
