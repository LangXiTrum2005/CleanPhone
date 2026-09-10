package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public abstract class C implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Iterator f2901a;
    public Object b = null;
    public Collection c = null;
    public Iterator d = EnumC4121nE.f4735a;
    public final /* synthetic */ AbstractC4975x e;

    public C(AbstractC4975x abstractC4975x) {
        this.e = abstractC4975x;
        this.f2901a = abstractC4975x.d.entrySet().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f2901a.hasNext() || this.d.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.d.hasNext()) {
            Map.Entry entry = (Map.Entry) this.f2901a.next();
            this.b = entry.getKey();
            Collection collection = (Collection) entry.getValue();
            this.c = collection;
            this.d = collection.iterator();
        }
        Object obj = this.b;
        Object next = this.d.next();
        switch (((C5063y) this).f) {
            case 0:
                return next;
            default:
                return new C4910wC(obj, next);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.d.remove();
        Collection collection = this.c;
        Objects.requireNonNull(collection);
        if (collection.isEmpty()) {
            this.f2901a.remove();
        }
        this.e.e--;
    }
}
