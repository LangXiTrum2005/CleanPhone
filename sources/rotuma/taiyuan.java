package rotuma;

import com.ironsource.X3;
import java.util.Iterator;
import java.util.Map;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: PersistentHashMapBuilderContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00028\u0001¢\u0006\u0004\b\u0013\u0010\u0014R2\u0010\u0018\u001a \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lrotuma/taiyuan;", "K", "V", "", "", "Lrotuma/beachfront;", "builder", "<init>", "(Lrotuma/beachfront;)V", "", "hasNext", "()Z", "saneness", "()Ljava/util/Map$Entry;", "", "remove", "()V", X3.i.W, "newValue", "wireman", "(Ljava/lang/Object;Ljava/lang/Object;)V", "Lrotuma/competently;", "kowloon", "Lrotuma/competently;", "base", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class taiyuan<K, V> implements Iterator<Map.Entry<K, V>>, unready.attabal {

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final competently<K, V, Map.Entry<K, V>> base;

    public taiyuan(beachfront<K, V> beachfrontVar) {
        adultoid[] adultoidVarArr = new adultoid[8];
        for (int i = 0; i < 8; i++) {
            adultoidVarArr[i] = new preprohormone(this);
        }
        this.base = new competently<>(beachfrontVar, adultoidVarArr);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.base.hasNext();
    }

    @Override // java.util.Iterator
    public void remove() {
        this.base.remove();
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        return this.base.next();
    }

    public final void wireman(K key, V newValue) {
        this.base.triweekly(key, newValue);
    }
}
