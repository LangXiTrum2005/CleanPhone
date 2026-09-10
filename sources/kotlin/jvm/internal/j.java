package kotlin.jvm.internal;

/* JADX INFO: compiled from: r8-map-id-973aa9d9b796effe3b508a3c84731d4635123126fcd911ab513d3350ce8d3052 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class j extends d implements i, qk.g {
    private final int arity;
    private final int flags;

    public j(int i10) {
        this(i10, d.NO_RECEIVER, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.d
    public qk.c computeReflected() {
        return d0.f44761a.a(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof j) {
            j jVar = (j) obj;
            return getName().equals(jVar.getName()) && getSignature().equals(jVar.getSignature()) && this.flags == jVar.flags && this.arity == jVar.arity && n.a(getBoundReceiver(), jVar.getBoundReceiver()) && n.a(getOwner(), jVar.getOwner());
        }
        if (obj instanceof qk.g) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.i
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (getOwner() == null ? 0 : getOwner().hashCode() * 31)) * 31);
    }

    @Override // qk.g
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // qk.g
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // qk.g
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // qk.g
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // kotlin.jvm.internal.d, qk.c
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        qk.c cVarCompute = compute();
        if (cVarCompute != this) {
            return cVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public j(int i10, Object obj) {
        this(i10, obj, null, null, null, 0);
    }

    @Override // kotlin.jvm.internal.d
    public qk.g getReflected() {
        qk.c cVarCompute = compute();
        if (cVarCompute != this) {
            return (qk.g) cVarCompute;
        }
        throw new cn.c0("Kotlin reflection implementation is not found at runtime. Make sure you have kotlin-reflect.jar in the classpath");
    }

    public j(int i10, Object obj, Class cls, String str, String str2, int i11) {
        super(obj, cls, str, str2, (i11 & 1) == 1);
        this.arity = i10;
        this.flags = 0;
    }
}
