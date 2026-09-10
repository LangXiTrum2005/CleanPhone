package p002kotlin.jvm.internal;

import kurbash.dern;
import kurbash.formularize;

/* JADX INFO: loaded from: classes5.dex */
public abstract class PropertyReference extends CallableReference implements formularize {
    private final boolean syntheticJavaProperty;

    public PropertyReference() {
        this.syntheticJavaProperty = false;
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public dern compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PropertyReference) {
            PropertyReference propertyReference = (PropertyReference) obj;
            return getOwner().equals(propertyReference.getOwner()) && getName().equals(propertyReference.getName()) && getSignature().equals(propertyReference.getSignature()) && Intrinsics.wireman(getBoundReceiver(), propertyReference.getBoundReceiver());
        }
        if (obj instanceof formularize) {
            return obj.equals(compute());
        }
        return false;
    }

    public abstract /* synthetic */ formularize.saneness getGetter();

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kurbash.formularize
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // kurbash.formularize
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        dern dernVarCompute = compute();
        if (dernVarCompute != this) {
            return dernVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    @Override // p002kotlin.jvm.internal.CallableReference
    public formularize getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties. Please follow/upvote https://youtrack.jetbrains.com/issue/KT-55980");
        }
        return (formularize) super.getReflected();
    }

    public PropertyReference(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    public PropertyReference(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.syntheticJavaProperty = (i & 2) == 2;
    }
}
