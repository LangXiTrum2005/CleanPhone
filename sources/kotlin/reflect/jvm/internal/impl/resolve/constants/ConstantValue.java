package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import kotlin.reflect.jvm.internal.impl.types.KotlinType;

/* JADX INFO: loaded from: classes7.dex */
public abstract class ConstantValue<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f44302a;

    public ConstantValue(Object obj) {
        this.f44302a = obj;
    }

    public abstract KotlinType a(ModuleDescriptor moduleDescriptor);

    public Object b() {
        return this.f44302a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        Object objB = b();
        ConstantValue constantValue = obj instanceof ConstantValue ? (ConstantValue) obj : null;
        return Intrinsics.a(objB, constantValue != null ? constantValue.b() : null);
    }

    public final int hashCode() {
        Object objB = b();
        if (objB != null) {
            return objB.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}
