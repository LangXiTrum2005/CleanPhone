package kotlin.reflect.jvm.internal.impl.types;

import kotlin.reflect.jvm.internal.impl.descriptors.ClassifierDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.DescriptorUtils;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorUtils;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ClassifierBasedTypeConstructor implements TypeConstructor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f44499a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof TypeConstructor) && obj.hashCode() == hashCode()) {
            TypeConstructor typeConstructor = (TypeConstructor) obj;
            if (typeConstructor.getParameters().size() == getParameters().size()) {
                ClassifierDescriptor classifierDescriptorC = c();
                ClassifierDescriptor classifierDescriptorC2 = typeConstructor.c();
                if (classifierDescriptorC2 == null || ErrorUtils.f(classifierDescriptorC) || DescriptorUtils.o(classifierDescriptorC) || ErrorUtils.f(classifierDescriptorC2) || DescriptorUtils.o(classifierDescriptorC2)) {
                    return false;
                }
                return f(classifierDescriptorC2);
            }
        }
        return false;
    }

    public abstract boolean f(ClassifierDescriptor classifierDescriptor);

    public final int hashCode() {
        int i2 = this.f44499a;
        if (i2 != 0) {
            return i2;
        }
        ClassifierDescriptor classifierDescriptorC = c();
        int iIdentityHashCode = (ErrorUtils.f(classifierDescriptorC) || DescriptorUtils.o(classifierDescriptorC)) ? System.identityHashCode(this) : DescriptorUtils.g(classifierDescriptorC).f44168a.hashCode();
        this.f44499a = iIdentityHashCode;
        return iIdentityHashCode;
    }
}
