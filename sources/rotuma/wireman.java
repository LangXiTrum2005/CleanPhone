package rotuma;

import com.ironsource.X3;
import java.util.Map;
import java.util.Set;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: PersistentHashMap.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u0000 )*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004:\u0001,B#\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0013\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000f\u001a\u00028\u00002\u0006\u0010\u0015\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u000f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u001fR\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00010(8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006-"}, d2 = {"Lrotuma/wireman;", "K", "V", "Lkotlin/collections/beachfront;", "", "Lrotuma/graveside;", "node", "", "size", "<init>", "(Lrotuma/graveside;I)V", "", "", "marial", "()Ljava/util/Set;", X3.i.W, "", "containsKey", "(Ljava/lang/Object;)Z", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "adultoid", "(Ljava/lang/Object;Ljava/lang/Object;)Lrotuma/wireman;", "dovishness", "(Ljava/lang/Object;)Lrotuma/wireman;", "Lrotuma/beachfront;", "arytenoidectomy", "()Lrotuma/beachfront;", "Ldovishness/wireman;", "monoploid", "()Ldovishness/wireman;", "polloi", "Lrotuma/graveside;", "molybdenite", "()Lrotuma/graveside;", "I", "competently", "()I", "keys", "Ldovishness/saneness;", "graveside", "()Ldovishness/saneness;", "values", "attabal", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class wireman<K, V> extends p002kotlin.collections.beachfront<K, V> implements Map, unready.attabal {

    /* JADX INFO: renamed from: molybdenite, reason: collision with root package name and from kotlin metadata */
    public final int size;

    /* JADX INFO: renamed from: polloi, reason: collision with root package name and from kotlin metadata */
    public final graveside<K, V> node;

    /* JADX INFO: renamed from: graveside, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: adultoid, reason: collision with root package name */
    public static final int f36930adultoid = 8;

    /* JADX INFO: renamed from: dovishness, reason: collision with root package name */
    public static final wireman f36931dovishness = new wireman(graveside.INSTANCE.attabal(), 0);

    /* JADX INFO: renamed from: rotuma.wireman$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: PersistentHashMap.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006\"\u0004\b\u0002\u0010\u0004\"\u0004\b\u0003\u0010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lrotuma/wireman$attabal;", "", "<init>", "()V", "K", "V", "Lrotuma/wireman;", "attabal", "()Lrotuma/wireman;", "", "EMPTY", "Lrotuma/wireman;", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final <K, V> wireman<K, V> attabal() {
            wireman<K, V> wiremanVar = wireman.f36931dovishness;
            Intrinsics.competently(wiremanVar, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.PersistentHashMap.Companion.emptyOf>");
            return wiremanVar;
        }

        public Companion() {
        }
    }

    public wireman(graveside<K, V> gravesideVar, int i) {
        this.node = gravesideVar;
        this.size = i;
    }

    public wireman<K, V> adultoid(K key, V value) {
        graveside.saneness<K, V> sanenessVarCreditor = this.node.creditor(key != null ? key.hashCode() : 0, key, value, 0);
        return sanenessVarCreditor == null ? this : new wireman<>(sanenessVarCreditor.attabal(), size() + sanenessVarCreditor.getSizeDelta());
    }

    /* JADX INFO: renamed from: arytenoidectomy */
    public beachfront<K, V> builder() {
        return new beachfront<>(this);
    }

    @Override // p002kotlin.collections.beachfront
    /* JADX INFO: renamed from: competently, reason: from getter */
    public int getSize() {
        return this.size;
    }

    @Override // p002kotlin.collections.beachfront, java.util.Map
    public boolean containsKey(Object key) {
        return this.node.apical(key != null ? key.hashCode() : 0, key, 0);
    }

    public wireman<K, V> dovishness(K key) {
        graveside<K, V> gravesideVarStarveling = this.node.starveling(key != null ? key.hashCode() : 0, key, 0);
        if (this.node == gravesideVarStarveling) {
            return this;
        }
        return gravesideVarStarveling == null ? INSTANCE.attabal() : new wireman<>(gravesideVarStarveling, size() - 1);
    }

    @Override // p002kotlin.collections.beachfront, java.util.Map
    public V get(Object key) {
        return this.node.kowloon(key != null ? key.hashCode() : 0, key, 0);
    }

    @Override // p002kotlin.collections.beachfront
    /* JADX INFO: renamed from: graveside, reason: merged with bridge method [inline-methods] */
    public dovishness.saneness<V> impromptu() {
        return new polloi(this);
    }

    @Override // p002kotlin.collections.beachfront
    public final Set<Map.Entry<K, V>> marial() {
        return monoploid();
    }

    public final graveside<K, V> molybdenite() {
        return this.node;
    }

    public final dovishness.wireman<Map.Entry<K, V>> monoploid() {
        return new triweekly(this);
    }

    @Override // p002kotlin.collections.beachfront
    /* JADX INFO: renamed from: polloi, reason: merged with bridge method [inline-methods] */
    public dovishness.wireman<K> beachfront() {
        return new arytenoidectomy(this);
    }
}
