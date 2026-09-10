package rotuma;

import java.util.Iterator;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: PersistentHashMapContentViews.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00010\u00032\b\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00028\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00028\u00010\rH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lrotuma/polloi;", "K", "V", "Ldovishness/saneness;", "Lkotlin/collections/saneness;", "Lrotuma/wireman;", "map", "<init>", "(Lrotuma/wireman;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "", "iterator", "()Ljava/util/Iterator;", "kowloon", "Lrotuma/wireman;", "", "getSize", "()I", "size", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class polloi<K, V> extends p002kotlin.collections.saneness<V> implements dovishness.saneness<V> {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final wireman<K, V> map;

    public polloi(wireman<K, V> wiremanVar) {
        this.map = wiremanVar;
    }

    @Override // p002kotlin.collections.saneness, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return this.map.containsValue(element);
    }

    @Override // p002kotlin.collections.saneness
    public int getSize() {
        return this.map.size();
    }

    @Override // p002kotlin.collections.saneness, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator<V> iterator() {
        return new molybdenite(this.map.molybdenite());
    }
}
