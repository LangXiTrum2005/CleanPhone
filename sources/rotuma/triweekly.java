package rotuma;

import java.util.Iterator;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PersistentHashMapContentViews.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0005B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\f\u001a\u00020\u000b2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\"\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u000eH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lrotuma/triweekly;", "K", "V", "Ldovishness/wireman;", "", "Lkotlin/collections/apical;", "Lrotuma/wireman;", "map", "<init>", "(Lrotuma/wireman;)V", "element", "", "wireman", "(Ljava/util/Map$Entry;)Z", "", "iterator", "()Ljava/util/Iterator;", "arytenoidectomy", "Lrotuma/wireman;", "", "getSize", "()I", "size", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class triweekly<K, V> extends p002kotlin.collections.apical<Map.Entry<? extends K, ? extends V>> implements dovishness.wireman<Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final wireman<K, V> map;

    public triweekly(wireman<K, V> wiremanVar) {
        this.map = wiremanVar;
    }

    @Override // p002kotlin.collections.saneness, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return wireman((Map.Entry) obj);
        }
        return false;
    }

    @Override // p002kotlin.collections.saneness
    public int getSize() {
        return this.map.size();
    }

    @Override // p002kotlin.collections.apical, p002kotlin.collections.saneness, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<Map.Entry<K, V>> iterator() {
        return new kowloon(this.map.molybdenite());
    }

    public boolean wireman(Map.Entry<? extends K, ? extends V> element) {
        if (element == null) {
            return false;
        }
        V v = this.map.get(element.getKey());
        if (v != null) {
            return Intrinsics.wireman(v, element.getValue());
        }
        return element.getValue() == null && this.map.containsKey(element.getKey());
    }
}
