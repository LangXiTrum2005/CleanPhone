package tk;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class p1 extends q1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kotlin.jvm.internal.o f51040b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile Object f51041c = null;

    /* JADX WARN: Multi-variable type inference failed */
    public p1(jk.a aVar) {
        this.f51040b = (kotlin.jvm.internal.o) aVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [jk.a, kotlin.jvm.internal.o] */
    public final Object invoke() {
        Object obj = q1.f51046a;
        Object obj2 = this.f51041c;
        if (obj2 != null) {
            if (obj2 == obj) {
                return null;
            }
            return obj2;
        }
        Object objInvoke = this.f51040b.invoke();
        if (objInvoke != null) {
            obj = objInvoke;
        }
        this.f51041c = obj;
        return objInvoke;
    }
}
