package p002kotlin.reflect.jvm.internal;

import com.ironsource.X3;
import java.util.concurrent.ConcurrentHashMap;
import p002kotlin.Metadata;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: CacheByClass.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001f\u0012\u0016\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u00028\u00002\n\u0010\b\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0016¢\u0006\u0004\b\t\u0010\nR$\u0010\u0005\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR$\u0010\u000f\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0004\u0012\u00028\u00000\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"Lkotlin/reflect/jvm/internal/dern;", "V", "Lkotlin/reflect/jvm/internal/attabal;", "Lkotlin/Function1;", "Ljava/lang/Class;", "compute", "<init>", "(Lkotlin/jvm/functions/Function1;)V", X3.i.W, "attabal", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function1;", "Ljava/util/concurrent/ConcurrentHashMap;", "saneness", "Ljava/util/concurrent/ConcurrentHashMap;", "cache", "kotlin-reflection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class dern<V> extends attabal<V> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name and from kotlin metadata */
    public final Function1<Class<?>, V> compute;

    /* JADX INFO: renamed from: saneness, reason: collision with root package name and from kotlin metadata */
    public final ConcurrentHashMap<Class<?>, V> cache;

    /* JADX WARN: Multi-variable type inference failed */
    public dern(Function1<? super Class<?>, ? extends V> compute) {
        Intrinsics.checkNotNullParameter(compute, "compute");
        this.compute = compute;
        this.cache = new ConcurrentHashMap<>();
    }

    @Override // p002kotlin.reflect.jvm.internal.attabal
    public V attabal(Class<?> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ConcurrentHashMap<Class<?>, V> concurrentHashMap = this.cache;
        V v = (V) concurrentHashMap.get(key);
        if (v != null) {
            return v;
        }
        V vInvoke = this.compute.invoke(key);
        V v2 = (V) concurrentHashMap.putIfAbsent(key, vInvoke);
        return v2 == null ? vInvoke : v2;
    }
}
