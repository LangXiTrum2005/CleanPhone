package vinyl;

import com.ironsource.C3414a2;
import com.ironsource.X3;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.Unit;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022 \u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00040\u0003:\u0001\u0017B#\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0013\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R$\u0010\n\u001a\u00028\u0000*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u000b\u001a\u00028\u0001*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00048TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0018"}, d2 = {"Lvinyl/nosophobia;", "K", "V", "Lvinyl/dent;", "", "Lasosan/wireman;", "keySerializer", "valueSerializer", "<init>", "(Lasosan/wireman;Lasosan/wireman;)V", X3.i.W, "value", "cutely", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/Map$Entry;", "Lbristol/beachfront;", "dern", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "impromptu", "(Ljava/util/Map$Entry;)Ljava/lang/Object;", "taiyuan", "attabal", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class nosophobia<K, V> extends dent<K, V, Map.Entry<? extends K, ? extends V>> {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final bristol.beachfront descriptor;

    /* JADX INFO: renamed from: vinyl.nosophobia$attabal, reason: from toString */
    /* JADX INFO: compiled from: Tuples.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010&\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\b\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B\u0017\u0012\u0006\u0010\u0004\u001a\u00028\u0002\u0012\u0006\u0010\u0005\u001a\u00028\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00028\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00028\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u0018"}, d2 = {"Lvinyl/nosophobia$attabal;", "K", "V", "", X3.i.W, "value", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "kowloon", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "getValue", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MapEntry<K, V> implements Map.Entry<K, V>, unready.attabal {

        /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata and from toString */
        public final K key;
        private final V value;

        public MapEntry(K k, V v) {
            this.key = k;
            this.value = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MapEntry)) {
                return false;
            }
            MapEntry mapEntry = (MapEntry) other;
            return Intrinsics.wireman(this.key, mapEntry.key) && Intrinsics.wireman(this.value, mapEntry.value);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k = this.key;
            int iHashCode = (k == null ? 0 : k.hashCode()) * 31;
            V v = this.value;
            return iHashCode + (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public String toString() {
            return "MapEntry(key=" + this.key + ", value=" + this.value + ')';
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nosophobia(final asosan.wireman<K> keySerializer, final asosan.wireman<V> valueSerializer) {
        super(keySerializer, valueSerializer, null);
        Intrinsics.checkNotNullParameter(keySerializer, "keySerializer");
        Intrinsics.checkNotNullParameter(valueSerializer, "valueSerializer");
        this.descriptor = bristol.formularize.wireman("kotlin.collections.Map.Entry", bristol.triweekly.dern.f15180attabal, new bristol.beachfront[0], new Function1() { // from class: vinyl.lerp
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return nosophobia.competently(keySerializer, valueSerializer, (bristol.attabal) obj);
            }
        });
    }

    public static final Unit competently(asosan.wireman wiremanVar, asosan.wireman wiremanVar2, bristol.attabal buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter(buildSerialDescriptor, "$this$buildSerialDescriptor");
        bristol.attabal.saneness(buildSerialDescriptor, X3.i.W, wiremanVar.getDescriptor(), null, false, 12, null);
        bristol.attabal.saneness(buildSerialDescriptor, "value", wiremanVar2.getDescriptor(), null, false, 12, null);
        return Unit.f29295attabal;
    }

    @Override // vinyl.dent
    /* JADX INFO: renamed from: cutely, reason: merged with bridge method [inline-methods] */
    public Map.Entry<K, V> marial(K key, V value) {
        return new MapEntry(key, value);
    }

    @Override // asosan.wireman, asosan.impassible, asosan.dern
    public bristol.beachfront getDescriptor() {
        return this.descriptor;
    }

    @Override // vinyl.dent
    /* JADX INFO: renamed from: impromptu, reason: merged with bridge method [inline-methods] */
    public K attabal(Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getKey();
    }

    @Override // vinyl.dent
    /* JADX INFO: renamed from: taiyuan, reason: merged with bridge method [inline-methods] */
    public V dern(Map.Entry<? extends K, ? extends V> entry) {
        Intrinsics.checkNotNullParameter(entry, "<this>");
        return entry.getValue();
    }
}
