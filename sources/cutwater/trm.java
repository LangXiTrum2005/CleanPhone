package cutwater;

import com.ironsource.C3414a2;
import com.ironsource.X3;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlinx.serialization.json.internal.mathsort;
import p002kotlin.Metadata;
import p002kotlin.collections.CollectionsKt;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: JsonElement.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\"\n\u0002\u0010&\n\u0002\b\u0007\n\u0002\u0010\u001e\n\u0002\b\u0006\b\u0007\u0018\u0000 *2\u00020\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002:\u0001+B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0001H\u0096\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u0003H\u0096\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tH\u0096\u0001¢\u0006\u0004\b\u0019\u0010\u001aR \u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR&\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u001e0\u001d8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u001d8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\"\u0010 R\u0014\u0010%\u001a\u00020\f8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010\u000eR\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00010&8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcutwater/trm;", "Lcutwater/impromptu;", "", "", "content", "<init>", "(Ljava/util/Map;)V", "", C3414a2.d, "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", X3.i.W, "wireman", "(Ljava/lang/String;)Z", "value", "marial", "(Lcutwater/impromptu;)Z", "beachfront", "(Ljava/lang/String;)Lcutwater/impromptu;", "isEmpty", "()Z", "kowloon", "Ljava/util/Map;", "", "", "competently", "()Ljava/util/Set;", "entries", "impromptu", "keys", "taiyuan", "size", "", "cutely", "()Ljava/util/Collection;", "values", "Companion", "attabal", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
@asosan.formularize(with = yemenite.class)
public final class trm extends impromptu implements Map<String, impromptu>, unready.attabal {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: kowloon, reason: collision with root package name and from kotlin metadata */
    public final Map<String, impromptu> content;

    /* JADX INFO: renamed from: cutwater.trm$attabal, reason: from kotlin metadata */
    /* JADX INFO: compiled from: JsonElement.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcutwater/trm$attabal;", "", "<init>", "()V", "Lasosan/wireman;", "Lcutwater/trm;", "serializer", "()Lasosan/wireman;", "kotlinx-serialization-json"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public Companion() {
        }

        public final asosan.wireman<trm> serializer() {
            return yemenite.f24595attabal;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public trm(Map<String, ? extends impromptu> content) {
        super(null);
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
    }

    public static final CharSequence triweekly(Map.Entry entry) {
        Intrinsics.checkNotNullParameter(entry, "<destruct>");
        String str = (String) entry.getKey();
        impromptu impromptuVar = (impromptu) entry.getValue();
        StringBuilder sb = new StringBuilder();
        mathsort.dern(sb, str);
        sb.append(':');
        sb.append(impromptuVar);
        String string = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public impromptu beachfront(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.content.get(key);
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Set<Map.Entry<String, impromptu>> competently() {
        return this.content.entrySet();
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ impromptu compute(String str, BiFunction<? super String, ? super impromptu, ? extends impromptu> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ impromptu computeIfAbsent(String str, Function<? super String, ? extends impromptu> function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ impromptu computeIfPresent(String str, BiFunction<? super String, ? super impromptu, ? extends impromptu> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return wireman((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof impromptu) {
            return marial((impromptu) obj);
        }
        return false;
    }

    public Collection<impromptu> cutely() {
        return this.content.values();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<String, impromptu>> entrySet() {
        return competently();
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        return Intrinsics.wireman(this.content, other);
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ impromptu get(Object obj) {
        if (obj instanceof String) {
            return beachfront((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.content.hashCode();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: impassible, reason: merged with bridge method [inline-methods] */
    public impromptu remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public Set<String> impromptu() {
        return this.content.keySet();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.content.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set<String> keySet() {
        return impromptu();
    }

    public boolean marial(impromptu value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return this.content.containsValue(value);
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ impromptu merge(String str, impromptu impromptuVar, BiFunction<? super impromptu, ? super impromptu, ? extends impromptu> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ impromptu put(String str, impromptu impromptuVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends impromptu> map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ impromptu putIfAbsent(String str, impromptu impromptuVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ impromptu replace(String str, impromptu impromptuVar) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public void replaceAll(BiFunction<? super String, ? super impromptu, ? extends impromptu> biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return taiyuan();
    }

    public int taiyuan() {
        return this.content.size();
    }

    public String toString() {
        return CollectionsKt.preterite(this.content.entrySet(), ",", "{", "}", 0, null, new Function1() { // from class: cutwater.stratoscope
            @Override // p002kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return trm.triweekly((Map.Entry) obj);
            }
        }, 24, null);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<impromptu> values() {
        return cutely();
    }

    public boolean wireman(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.content.containsKey(key);
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ boolean replace(String str, impromptu impromptuVar, impromptu impromptuVar2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
