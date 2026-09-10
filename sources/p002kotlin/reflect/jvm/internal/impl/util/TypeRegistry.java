package p002kotlin.reflect.jvm.internal.impl.util;

import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kurbash.wireman;
import p002kotlin.jvm.functions.Function1;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ArrayMapOwner.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class TypeRegistry<K, V> {

    /* JADX INFO: renamed from: attabal, reason: collision with root package name */
    public final ConcurrentHashMap<String, Integer> f31839attabal = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: saneness, reason: collision with root package name */
    public final AtomicInteger f31840saneness = new AtomicInteger(0);

    public final Collection<Integer> beachfront() {
        Collection<Integer> collectionValues = this.f31839attabal.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        return collectionValues;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T extends V, KK extends K> impassible<K, V, T> dern(wireman<KK> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        return new impassible<>(marial(kClass));
    }

    public final <T extends K> int marial(wireman<T> kClass) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        String strImpromptu = kClass.impromptu();
        Intrinsics.beachfront(strImpromptu);
        return wireman(strImpromptu);
    }

    public abstract int saneness(ConcurrentHashMap<String, Integer> concurrentHashMap, String str, Function1<? super String, Integer> function1);

    public final int wireman(String keyQualifiedName) {
        Intrinsics.checkNotNullParameter(keyQualifiedName, "keyQualifiedName");
        return saneness(this.f31839attabal, keyQualifiedName, new Function1<String, Integer>(this) { // from class: kotlin.reflect.jvm.internal.impl.util.TypeRegistry$getId$1
            final /* synthetic */ TypeRegistry<K, V> this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
                this.this$0 = this;
            }

            @Override // p002kotlin.jvm.functions.Function1
            public final Integer invoke(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Integer.valueOf(this.this$0.f31840saneness.getAndIncrement());
            }
        });
    }
}
