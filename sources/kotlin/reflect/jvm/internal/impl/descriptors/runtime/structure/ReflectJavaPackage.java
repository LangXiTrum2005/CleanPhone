package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.Collection;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotation;
import kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage;
import kotlin.reflect.jvm.internal.impl.name.FqName;

/* JADX INFO: loaded from: classes7.dex */
public final class ReflectJavaPackage extends ReflectJavaElement implements JavaPackage {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final FqName f43712a;

    public ReflectJavaPackage(FqName fqName) {
        Intrinsics.f(fqName, "fqName");
        this.f43712a = fqName;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final JavaAnnotation b(FqName fqName) {
        Intrinsics.f(fqName, "fqName");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    public final FqName c() {
        return this.f43712a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ReflectJavaPackage) {
            return Intrinsics.a(this.f43712a, ((ReflectJavaPackage) obj).f43712a);
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaAnnotationOwner
    public final /* bridge */ /* synthetic */ Collection getAnnotations() {
        return EmptyList.X;
    }

    public final int hashCode() {
        return this.f43712a.hashCode();
    }

    public final String toString() {
        return ReflectJavaPackage.class.getName() + ": " + this.f43712a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.structure.JavaPackage
    public final void z(Function1 function1) {
    }
}
