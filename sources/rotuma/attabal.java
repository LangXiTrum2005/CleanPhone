package rotuma;

import java.util.Map;
import java.util.Map.Entry;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: PersistentHashMapBuilderContentViews.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b!\u0018\u0000*\u0014\b\u0000\u0010\u0002*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001*\u0004\b\u0001\u0010\u0003*\u0004\b\u0002\u0010\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H&¢\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\r\u0010\u000bJ#\u0010\u000e\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0001H&¢\u0006\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lrotuma/attabal;", "", "E", "K", "V", "Lkotlin/collections/cutely;", "<init>", "()V", "element", "", "saneness", "(Ljava/util/Map$Entry;)Z", "wireman", "marial", "beachfront", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class attabal<E extends Map.Entry<? extends K, ? extends V>, K, V> extends p002kotlin.collections.cutely<E> {
    public abstract boolean beachfront(Map.Entry<? extends K, ? extends V> element);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            return saneness((Map.Entry) obj);
        }
        return false;
    }

    public final boolean marial(E element) {
        if ((element != null ? element : null) == null) {
            return false;
        }
        return beachfront(element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        if (obj instanceof Map.Entry) {
            return marial((Map.Entry) obj);
        }
        return false;
    }

    public final boolean saneness(E element) {
        if ((element != null ? element : null) == null) {
            return false;
        }
        return wireman(element);
    }

    public abstract boolean wireman(Map.Entry<? extends K, ? extends V> element);
}
