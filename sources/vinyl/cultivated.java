package vinyl;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import p002kotlin.Metadata;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CollectionSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\u0010&\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022B\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004\u0012 \u0012\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00060\u0003B#\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00100\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0015\u001a\u00020\f*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014¢\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J;\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u0006*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ7\u0010\u001d\u001a\u00020\u001c*\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005j\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001`\u00062\u0006\u0010\u001b\u001a\u00020\fH\u0014¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010$\u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lvinyl/cultivated;", "K", "V", "Lvinyl/sayid;", "", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "Lasosan/wireman;", "kSerializer", "vSerializer", "<init>", "(Lasosan/wireman;Lasosan/wireman;)V", "", "adultoid", "(Ljava/util/Map;)I", "", "", "graveside", "(Ljava/util/Map;)Ljava/util/Iterator;", "monoploid", "()Ljava/util/LinkedHashMap;", "polloi", "(Ljava/util/LinkedHashMap;)I", "gintrap", "(Ljava/util/LinkedHashMap;)Ljava/util/Map;", "dovishness", "(Ljava/util/Map;)Ljava/util/LinkedHashMap;", "size", "", "molybdenite", "(Ljava/util/LinkedHashMap;I)V", "Lbristol/beachfront;", "dern", "Lbristol/beachfront;", "getDescriptor", "()Lbristol/beachfront;", "descriptor", "kotlinx-serialization-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class cultivated<K, V> extends sayid<K, V, Map<K, ? extends V>, LinkedHashMap<K, V>> {

    /* JADX INFO: renamed from: dern, reason: collision with root package name and from kotlin metadata */
    public final bristol.beachfront descriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cultivated(asosan.wireman<K> kSerializer, asosan.wireman<V> vSerializer) {
        super(kSerializer, vSerializer, null);
        Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
        Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
        this.descriptor = new permissivist(kSerializer.getDescriptor(), vSerializer.getDescriptor());
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: adultoid, reason: merged with bridge method [inline-methods] */
    public int marial(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.size();
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: dovishness, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap<K, V> apical(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        LinkedHashMap<K, V> linkedHashMap = map instanceof LinkedHashMap ? (LinkedHashMap) map : null;
        return linkedHashMap == null ? new LinkedHashMap<>(map) : linkedHashMap;
    }

    @Override // vinyl.sayid, asosan.wireman, asosan.impassible, asosan.dern
    public bristol.beachfront getDescriptor() {
        return this.descriptor;
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: gintrap, reason: merged with bridge method [inline-methods] */
    public Map<K, V> formularize(LinkedHashMap<K, V> linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap;
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: graveside, reason: merged with bridge method [inline-methods] */
    public Iterator<Map.Entry<K, V>> wireman(Map<K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        return map.entrySet().iterator();
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: molybdenite, reason: merged with bridge method [inline-methods] */
    public void dern(LinkedHashMap<K, V> linkedHashMap, int i) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: monoploid, reason: merged with bridge method [inline-methods] */
    public LinkedHashMap<K, V> attabal() {
        return new LinkedHashMap<>();
    }

    @Override // vinyl.attabal
    /* JADX INFO: renamed from: polloi, reason: merged with bridge method [inline-methods] */
    public int saneness(LinkedHashMap<K, V> linkedHashMap) {
        Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
        return linkedHashMap.size() * 2;
    }
}
