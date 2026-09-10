package p002kotlin.reflect.jvm.internal.impl.util;

import java.util.Iterator;
import p002kotlin.jvm.internal.DefaultConstructorMarker;
import unready.attabal;

/* JADX INFO: compiled from: ArrayMap.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class dern<T> implements Iterable<T>, attabal {
    public /* synthetic */ dern(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract T get(int i);

    @Override // java.lang.Iterable
    public abstract Iterator<T> iterator();

    public abstract int saneness();

    public abstract void wireman(int i, T t);

    public dern() {
    }
}
