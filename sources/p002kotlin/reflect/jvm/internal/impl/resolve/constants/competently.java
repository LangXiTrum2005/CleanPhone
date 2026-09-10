package p002kotlin.reflect.jvm.internal.impl.resolve.constants;

import p002kotlin.jvm.internal.Intrinsics;
import p002kotlin.reflect.jvm.internal.impl.descriptors.trm;
import p002kotlin.reflect.jvm.internal.impl.types.oilcan;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class competently<T> {
    private final T value;

    public competently(T t) {
        this.value = t;
    }

    public abstract oilcan attabal(trm trmVar);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        T tSaneness = saneness();
        competently competentlyVar = obj instanceof competently ? (competently) obj : null;
        return Intrinsics.wireman(tSaneness, competentlyVar != null ? competentlyVar.saneness() : null);
    }

    public int hashCode() {
        T tSaneness = saneness();
        if (tSaneness != null) {
            return tSaneness.hashCode();
        }
        return 0;
    }

    public T saneness() {
        return this.value;
    }

    public String toString() {
        return String.valueOf(saneness());
    }
}
