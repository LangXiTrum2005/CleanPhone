package gun.simulator.gun.sounds.lightsaber.taser.timebombs.prank.view;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class N extends AbstractCollection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3432a;
    public final /* synthetic */ O b;

    public N(O o, int i) {
        this.f3432a = i;
        if (i != 1) {
            this.b = o;
        } else {
            this.b = o;
        }
    }

    public final void a() {
        this.b.clear();
    }

    public final boolean b(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Object value = entry.getValue();
        Collection collection = (Collection) this.b.a().get(key);
        return collection != null && collection.contains(value);
    }

    public final boolean c(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.b.remove(entry.getKey(), entry.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.f3432a) {
            case 0:
                this.b.clear();
                break;
            default:
                a();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.f3432a) {
            case 0:
                return this.b.b(obj);
            default:
                return b(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        int i = this.f3432a;
        O o = this.b;
        switch (i) {
            case 0:
                return o.f();
            default:
                return o.e();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        switch (this.f3432a) {
            case 1:
                return c(obj);
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        int i = this.f3432a;
        O o = this.b;
        switch (i) {
            case 0:
                break;
        }
        return o.size();
    }
}
