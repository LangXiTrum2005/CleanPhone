package wj;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class s implements d, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jk.a f53298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f53299b;

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new b(getValue());
    }

    @Override // wj.d
    public final Object getValue() {
        if (this.f53299b == o.f53296a) {
            jk.a aVar = this.f53298a;
            kotlin.jvm.internal.n.c(aVar);
            this.f53299b = aVar.invoke();
            this.f53298a = null;
        }
        return this.f53299b;
    }

    public final String toString() {
        return this.f53299b != o.f53296a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
