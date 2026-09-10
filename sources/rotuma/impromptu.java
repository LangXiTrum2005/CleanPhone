package rotuma;

import java.util.Iterator;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PersistentHashMapBuilderContentViews.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000b\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\"\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0010H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0014\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\fJ#\u0010\u0015\u001a\u00020\n2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\fR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lrotuma/impromptu;", "K", "V", "Lrotuma/attabal;", "", "Lrotuma/beachfront;", "builder", "<init>", "(Lrotuma/beachfront;)V", "element", "", "competently", "(Ljava/util/Map$Entry;)Z", "", "clear", "()V", "", "iterator", "()Ljava/util/Iterator;", "", "beachfront", "wireman", "kowloon", "Lrotuma/beachfront;", "", "getSize", "()I", "size", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class impromptu<K, V> extends attabal<Map.Entry<K, V>, K, V> {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final beachfront<K, V> builder;

    public impromptu(beachfront<K, V> beachfrontVar) {
        this.builder = beachfrontVar;
    }

    @Override // rotuma.attabal
    public boolean beachfront(Map.Entry<? extends K, ? extends V> element) {
        return this.builder.remove(element.getKey(), element.getValue());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        this.builder.clear();
    }

    @Override // p002kotlin.collections.cutely, java.util.AbstractCollection, java.util.Collection, java.util.Set
    /* JADX INFO: renamed from: competently, reason: merged with bridge method [inline-methods] */
    public boolean add(Map.Entry<K, V> element) {
        throw new UnsupportedOperationException();
    }

    @Override // p002kotlin.collections.cutely
    public int getSize() {
        return this.builder.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<Map.Entry<K, V>> iterator() {
        return new taiyuan(this.builder);
    }

    @Override // rotuma.attabal
    public boolean wireman(Map.Entry<? extends K, ? extends V> element) {
        V v = this.builder.get(element.getKey());
        if (v != null) {
            return Intrinsics.wireman(v, element.getValue());
        }
        return element.getValue() == null && this.builder.containsKey(element.getKey());
    }
}
