package rotuma;

import java.util.Map;
import p002kotlin.Metadata;

/* JADX INFO: compiled from: PersistentHashMapBuilderContentIterators.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lrotuma/preprohormone;", "K", "V", "Lrotuma/adultoid;", "", "Lrotuma/taiyuan;", "parentIterator", "<init>", "(Lrotuma/taiyuan;)V", "arytenoidectomy", "()Ljava/util/Map$Entry;", "polloi", "Lrotuma/taiyuan;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class preprohormone<K, V> extends adultoid<K, V, Map.Entry<K, V>> {

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final taiyuan<K, V> parentIterator;

    public preprohormone(taiyuan<K, V> taiyuanVar) {
        this.parentIterator = taiyuanVar;
    }

    @Override // java.util.Iterator
    /* JADX INFO: renamed from: arytenoidectomy, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> next() {
        cord.attabal.attabal(competently());
        kowloon(getIndex() + 2);
        return new dern(this.parentIterator, getBuffer()[getIndex() - 2], getBuffer()[getIndex() - 1]);
    }
}
