package p002kotlin.jvm.internal;

import kurbash.dern;
import kurbash.impromptu;

/* JADX INFO: loaded from: classes5.dex */
public class FunctionReference extends CallableReference implements formularize, impromptu {
    private final int arity;
    private final int flags;

    public FunctionReference(int i) {
        this(i, CallableReference.NO_RECEIVER, null, null, null, 0);
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public dern computeReflected() {
        return polloi.attabal(this);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FunctionReference) {
            FunctionReference functionReference = (FunctionReference) obj;
            return getName().equals(functionReference.getName()) && getSignature().equals(functionReference.getSignature()) && this.flags == functionReference.flags && this.arity == functionReference.arity && Intrinsics.wireman(getBoundReceiver(), functionReference.getBoundReceiver()) && Intrinsics.wireman(getOwner(), functionReference.getOwner());
        }
        if (obj instanceof impromptu) {
            return obj.equals(compute());
        }
        return false;
    }

    @Override // p002kotlin.jvm.internal.formularize
    public int getArity() {
        return this.arity;
    }

    public int hashCode() {
        return (((getOwner() == null ? 0 : getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kurbash.impromptu
    public boolean isExternal() {
        return getReflected().isExternal();
    }

    @Override // kurbash.impromptu
    public boolean isInfix() {
        return getReflected().isInfix();
    }

    @Override // kurbash.impromptu
    public boolean isInline() {
        return getReflected().isInline();
    }

    @Override // kurbash.impromptu
    public boolean isOperator() {
        return getReflected().isOperator();
    }

    @Override // p002kotlin.jvm.internal.CallableReference, kurbash.dern
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    public String toString() {
        dern dernVarCompute = compute();
        if (dernVarCompute != this) {
            return dernVarCompute.toString();
        }
        if ("<init>".equals(getName())) {
            return "constructor (Kotlin reflection is not available)";
        }
        return "function " + getName() + " (Kotlin reflection is not available)";
    }

    public FunctionReference(int i, Object obj) {
        this(i, obj, null, null, null, 0);
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public impromptu getReflected() {
        return (impromptu) super.getReflected();
    }

    public FunctionReference(int i, Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.arity = i;
        this.flags = i2 >> 1;
    }
}
