package p002kotlin.reflect.jvm.internal.impl.util;

import bren.dern;
import kurbash.formularize;
import p002kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: ArrayMapOwner.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class impassible<K, V, T extends V> extends attabal.AbstractC0709attabal<K, V, T> implements dern<attabal<K, V>, V> {
    public impassible(int i) {
        super(i);
    }

    @Override // bren.dern
    /* JADX INFO: renamed from: saneness, reason: merged with bridge method [inline-methods] */
    public T getValue(attabal<K, V> thisRef, formularize<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        return attabal(thisRef);
    }
}
