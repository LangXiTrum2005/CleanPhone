package rotuma;

import com.ironsource.X3;
import cord.DeltaCounter;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PersistentHashMapBuilder.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010#\n\u0002\u0010'\n\u0002\b\u0005\n\u0002\u0010\u001f\n\u0002\b\u0004\b\u0011\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u000f\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0012\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J%\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u0015\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u0019\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u001d\u0010\u0019\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00028\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR*\u0010%\u001a\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u001f8\u0006@DX\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b\u001d\u0010$R.\u0010-\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010&8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R$\u00104\u001a\u0004\u0018\u00018\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010<\u001a\u0002058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R*\u0010?\u001a\u0002052\u0006\u0010\u0011\u001a\u0002058\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b=\u00107\u001a\u0004\b>\u00109\"\u0004\b \u0010;R&\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010A0@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u001a\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000@8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010CR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00010G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I¨\u0006K"}, d2 = {"Lrotuma/beachfront;", "K", "V", "", "Lkotlin/collections/taiyuan;", "Lrotuma/wireman;", "map", "<init>", "(Lrotuma/wireman;)V", "competently", "()Lrotuma/wireman;", X3.i.W, "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "from", "", "putAll", "(Ljava/util/Map;)V", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "clear", "()V", "kowloon", "Lrotuma/wireman;", "Lcord/marial;", "arytenoidectomy", "Lcord/marial;", "cutely", "()Lcord/marial;", "(Lcord/marial;)V", "ownership", "Lrotuma/graveside;", "monoploid", "Lrotuma/graveside;", "taiyuan", "()Lrotuma/graveside;", "setNode$runtime", "(Lrotuma/graveside;)V", "node", "polloi", "Ljava/lang/Object;", "getOperationResult$runtime", "()Ljava/lang/Object;", "triweekly", "(Ljava/lang/Object;)V", "operationResult", "", "molybdenite", "I", "impromptu", "()I", "impassible", "(I)V", "modCount", "graveside", "marial", "size", "", "", "saneness", "()Ljava/util/Set;", "entries", "wireman", "keys", "", "beachfront", "()Ljava/util/Collection;", "values", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class beachfront<K, V> extends p002kotlin.collections.taiyuan<K, V> implements Map, unready.marial {

    /* JADX INFO: renamed from: arytenoidectomy, reason: collision with root package name and from kotlin metadata */
    public cord.marial ownership = new cord.marial();

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public int size;

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public wireman<K, V> map;

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public int modCount;

    /* JADX INFO: renamed from: monoploid, reason: collision with root package name and from kotlin metadata */
    public graveside<K, V> node;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public V operationResult;

    public beachfront(wireman<K, V> wiremanVar) {
        this.map = wiremanVar;
        this.node = this.map.molybdenite();
        this.size = this.map.size();
    }

    public void arytenoidectomy(int i) {
        this.size = i;
        this.modCount++;
    }

    @Override // p002kotlin.collections.taiyuan
    public Collection<V> beachfront() {
        return new formularize(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        graveside<K, V> gravesideVarAttabal = graveside.INSTANCE.attabal();
        Intrinsics.competently(gravesideVarAttabal, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.node = gravesideVarAttabal;
        arytenoidectomy(0);
    }

    public wireman<K, V> competently() {
        wireman<K, V> wiremanVar;
        if (this.node == this.map.molybdenite()) {
            wiremanVar = this.map;
        } else {
            this.ownership = new cord.marial();
            wiremanVar = new wireman<>(this.node, size());
        }
        this.map = wiremanVar;
        return wiremanVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object key) {
        return this.node.apical(key != null ? key.hashCode() : 0, key, 0);
    }

    /* JADX INFO: renamed from: cutely, reason: from getter */
    public final cord.marial getOwnership() {
        return this.ownership;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object key) {
        return this.node.kowloon(key != null ? key.hashCode() : 0, key, 0);
    }

    public final void impassible(int i) {
        this.modCount = i;
    }

    /* JADX INFO: renamed from: impromptu, reason: from getter */
    public final int getModCount() {
        return this.modCount;
    }

    public final void kowloon(cord.marial marialVar) {
        this.ownership = marialVar;
    }

    @Override // p002kotlin.collections.taiyuan
    /* JADX INFO: renamed from: marial, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K key, V value) {
        this.operationResult = null;
        this.node = this.node.oilcan(key != null ? key.hashCode() : 0, key, value, 0, this);
        return this.operationResult;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        wireman<K, V> wiremanVarCompetently = from instanceof wireman ? (wireman) from : null;
        if (wiremanVarCompetently == null) {
            beachfront beachfrontVar = from instanceof beachfront ? (beachfront) from : null;
            wiremanVarCompetently = beachfrontVar != null ? beachfrontVar.competently() : null;
        }
        if (wiremanVarCompetently == null) {
            super.putAll(from);
            return;
        }
        DeltaCounter deltaCounter = new DeltaCounter(0, 1, null);
        int size = size();
        graveside<K, V> gravesideVar = this.node;
        graveside<K, V> gravesideVarMolybdenite = wiremanVarCompetently.molybdenite();
        Intrinsics.competently(gravesideVarMolybdenite, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        this.node = gravesideVar.yemenite(gravesideVarMolybdenite, 0, deltaCounter, this);
        int size2 = (wiremanVarCompetently.size() + size) - deltaCounter.getCount();
        if (size != size2) {
            arytenoidectomy(size2);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object key) {
        this.operationResult = null;
        graveside gravesideVarKattegat = this.node.kattegat(key != null ? key.hashCode() : 0, key, 0, this);
        if (gravesideVarKattegat == null) {
            gravesideVarKattegat = graveside.INSTANCE.attabal();
            Intrinsics.competently(gravesideVarKattegat, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.node = gravesideVarKattegat;
        return this.operationResult;
    }

    @Override // p002kotlin.collections.taiyuan
    public Set<Map.Entry<K, V>> saneness() {
        return new impromptu(this);
    }

    public final graveside<K, V> taiyuan() {
        return this.node;
    }

    public final void triweekly(V v) {
        this.operationResult = v;
    }

    @Override // p002kotlin.collections.taiyuan
    public Set<K> wireman() {
        return new cutely(this);
    }

    @Override // java.util.Map
    public final boolean remove(Object key, Object value) {
        int size = size();
        graveside gravesideVarSupplicat = this.node.supplicat(key != null ? key.hashCode() : 0, key, value, 0, this);
        if (gravesideVarSupplicat == null) {
            gravesideVarSupplicat = graveside.INSTANCE.attabal();
            Intrinsics.competently(gravesideVarSupplicat, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMapBuilder>");
        }
        this.node = gravesideVarSupplicat;
        return size != size();
    }
}
