package rotuma;

import java.util.Map;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: PersistentHashMapContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\b\u0005\b\u0001\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u00012 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lrotuma/dovishness;", "K", "V", "Lrotuma/adultoid;", "", "<init>", "()V", "arytenoidectomy", "()Ljava/util/Map$Entry;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class dovishness<K, V> extends adultoid<K, V, Map.Entry<? extends K, ? extends V>> {
    @Override // java.util.Iterator
    /* JADX INFO: renamed from: arytenoidectomy, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        cord.attabal.attabal(competently());
        kowloon(getIndex() + 2);
        return new saneness(getBuffer()[getIndex() - 2], getBuffer()[getIndex() - 1]);
    }
}
