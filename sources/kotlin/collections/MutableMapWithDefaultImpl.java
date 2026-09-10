package kotlin.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003¨\u0006\u0004"}, d2 = {"Lkotlin/collections/MutableMapWithDefaultImpl;", "K", "V", "Lkotlin/collections/MutableMapWithDefault;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class MutableMapWithDefaultImpl<K, V> implements MutableMapWithDefault<K, V> {
    public final Map X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final Lambda f43277Y;

    /* JADX WARN: Multi-variable type inference failed */
    public MutableMapWithDefaultImpl(Map map, Function1 function1) {
        Intrinsics.f(function1, "default");
        this.X = map;
        this.f43277Y = (Lambda) function1;
    }

    @Override // java.util.Map
    public final void clear() {
        this.X.clear();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.X.containsKey(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.X.containsValue(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return this.X.entrySet();
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return this.X.equals(obj);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.X.get(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.X.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.X.isEmpty();
    }

    @Override // java.util.Map
    public final Set keySet() {
        return this.X.keySet();
    }

    @Override // kotlin.collections.MutableMapWithDefault
    /* JADX INFO: renamed from: p, reason: from getter */
    public final Map getX() {
        return this.X;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        return this.X.put(obj, obj2);
    }

    @Override // java.util.Map
    public final void putAll(Map from) {
        Intrinsics.f(from, "from");
        this.X.putAll(from);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        return this.X.remove(obj);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // kotlin.collections.MapWithDefault
    public final Object s(Object obj) {
        Map map = this.X;
        Object obj2 = map.get(obj);
        return (obj2 != null || map.containsKey(obj)) ? obj2 : this.f43277Y.invoke(obj);
    }

    @Override // java.util.Map
    public final int size() {
        return this.X.size();
    }

    public final String toString() {
        return this.X.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        return this.X.values();
    }
}
