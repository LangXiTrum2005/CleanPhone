package p002kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import kurbash.wireman;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ArrayMapOwner.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class attabal<K, V> implements Iterable<V>, unready.attabal {

    /* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.util.attabal$attabal, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ArrayMapOwner.kt */
    public static abstract class AbstractC0709attabal<K, V, T extends V> {

        /* JADX INFO: renamed from: attabal, reason: collision with root package name */
        public final int f31847attabal;

        public AbstractC0709attabal(int i) {
            this.f31847attabal = i;
        }

        public final T attabal(attabal<K, V> thisRef) {
            Intrinsics.checkNotNullParameter(thisRef, "thisRef");
            return thisRef.saneness().get(this.f31847attabal);
        }
    }

    public final void beachfront(wireman<? extends K> tClass, V value) {
        Intrinsics.checkNotNullParameter(tClass, "tClass");
        Intrinsics.checkNotNullParameter(value, "value");
        String strImpromptu = tClass.impromptu();
        Intrinsics.beachfront(strImpromptu);
        marial(strImpromptu, value);
    }

    public final boolean isEmpty() {
        return saneness().saneness() == 0;
    }

    @Override // java.lang.Iterable
    public final Iterator<V> iterator() {
        return saneness().iterator();
    }

    public abstract void marial(String str, V v);

    public abstract dern<V> saneness();

    public abstract TypeRegistry<K, V> wireman();
}
