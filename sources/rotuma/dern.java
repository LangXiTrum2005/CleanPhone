package rotuma;

import com.ironsource.X3;
import java.util.Map;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: PersistentHashMapBuilderContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B+\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0006\u0010\b\u001a\u00028\u0001¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\f\u0010\rR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\b\u001a\u00028\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lrotuma/dern;", "K", "V", "Lrotuma/saneness;", "", "Lrotuma/taiyuan;", "parentIterator", X3.i.W, "value", "<init>", "(Lrotuma/taiyuan;Ljava/lang/Object;Ljava/lang/Object;)V", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "arytenoidectomy", "Lrotuma/taiyuan;", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "saneness", "(Ljava/lang/Object;)V", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class dern<K, V> extends saneness<K, V> implements Map.Entry<K, V>, unready.attabal {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public final taiyuan<K, V> parentIterator;
    private V value;

    public dern(taiyuan<K, V> taiyuanVar, K k, V v) {
        super(k, v);
        this.parentIterator = taiyuanVar;
        this.value = v;
    }

    @Override // rotuma.saneness, java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    public void saneness(V v) {
        this.value = v;
    }

    @Override // rotuma.saneness, java.util.Map.Entry
    public V setValue(V newValue) {
        V value = getValue();
        saneness(newValue);
        this.parentIterator.wireman(getKey(), newValue);
        return value;
    }
}
