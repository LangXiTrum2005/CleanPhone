package wj;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements d, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public jk.a f53290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Object f53291b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f53292c;

    public j(jk.a initializer) {
        kotlin.jvm.internal.n.f(initializer, "initializer");
        this.f53290a = initializer;
        this.f53291b = o.f53296a;
        this.f53292c = this;
    }

    private final Object writeReplace() {
        return new b(getValue());
    }

    @Override // wj.d
    public final Object getValue() {
        Object objInvoke;
        Object obj = this.f53291b;
        o oVar = o.f53296a;
        if (obj != oVar) {
            return obj;
        }
        synchronized (this.f53292c) {
            objInvoke = this.f53291b;
            if (objInvoke == oVar) {
                jk.a aVar = this.f53290a;
                kotlin.jvm.internal.n.c(aVar);
                objInvoke = aVar.invoke();
                this.f53291b = objInvoke;
                this.f53290a = null;
            }
        }
        return objInvoke;
    }

    public final String toString() {
        return this.f53291b != o.f53296a ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
