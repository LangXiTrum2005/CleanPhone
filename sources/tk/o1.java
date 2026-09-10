package tk;

import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public final class o1 extends q1 implements jk.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jk.a f51035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile SoftReference f51036c;

    public o1(Object obj, jk.a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("Argument for @NotNull parameter 'initializer' of kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal.<init> must not be null");
        }
        this.f51036c = null;
        this.f51035b = aVar;
        if (obj != null) {
            this.f51036c = new SoftReference(obj);
        }
    }

    @Override // jk.a
    public final Object invoke() {
        Object obj;
        Object obj2 = q1.f51046a;
        SoftReference softReference = this.f51036c;
        if (softReference != null && (obj = softReference.get()) != null) {
            if (obj == obj2) {
                return null;
            }
            return obj;
        }
        Object objInvoke = this.f51035b.invoke();
        if (objInvoke != null) {
            obj2 = objInvoke;
        }
        this.f51036c = new SoftReference(obj2);
        return objInvoke;
    }
}
