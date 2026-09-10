package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class x extends d implements qk.w {
    private final boolean syntheticJavaProperty;

    public x(Object obj, Class cls, String str, String str2, int i10) {
        super(obj, cls, str, str2, (i10 & 1) == 1);
        this.syntheticJavaProperty = (i10 & 2) == 2;
    }

    @Override // kotlin.jvm.internal.d
    public qk.c compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            return getOwner().equals(xVar.getOwner()) && getName().equals(xVar.getName()) && getSignature().equals(xVar.getSignature()) && n.a(getBoundReceiver(), xVar.getBoundReceiver());
        }
        if (obj instanceof qk.w) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner().hashCode() * 31)) * 31);
    }

    @Override // qk.w
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // qk.w
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        qk.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // kotlin.jvm.internal.d
    public qk.w getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        qk.c cVarCompute = compute();
        if (cVarCompute != this) {
            return (qk.w) cVarCompute;
        }
        throw new cn.c0("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }
}
